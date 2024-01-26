lazy val edapocBase = Seq("edapoc")

lazy val edapocAcceptance = (edapocBase ++ Seq("acceptance"))
lazy val edapocEdgeProfileAdmin = (edapocBase ++ Seq("edge", "profileadmin"))
lazy val edapocValueProfile = (edapocBase ++ Seq("value", "profile"))
lazy val edapocValueMembership = (edapocBase ++ Seq("value", "membership"))
lazy val edapocAcceptanceName = edapocAcceptance.mkString("-")

lazy val edapocBaseName = edapocBase.mkString("-")
lazy val edapocEdgeProfileAdminName = edapocEdgeProfileAdmin.mkString("-")
lazy val edapocValueProfileName = edapocValueProfile.mkString("-")
lazy val edapocValueMembershipName = edapocValueMembership.mkString("-")

lazy val baseOrg = Seq("tomshley.brands.global.tware.tech.products.examples")
lazy val edapocBaseOrg = (baseOrg ++ edapocBase).mkString(".")
lazy val edapocAcceptanceOrg = (baseOrg ++ edapocAcceptance).mkString(".")
lazy val edapocEdgeProfileAdminOrg =
  (baseOrg ++ edapocEdgeProfileAdmin).mkString(".")
lazy val edapocValueProfileOrg = (baseOrg ++ edapocValueProfile).mkString(".")
lazy val edapocValueMembershipOrg =
  (baseOrg ++ edapocValueMembership).mkString(".")

lazy val edapocAcceptanceProject = publishableProject(edapocAcceptanceName)
  .enablePlugins(
    ProjectTemplatePlugin,
    ProjectsHelperPlugin,
    ProjectStructurePlugin,
    EdgeProjectPlugin,
    SbtTwirl
  )
  .settings(
    name := edapocAcceptanceName,
    organization := edapocAcceptanceOrg,
    libraryDependencies ++= Seq(
      "io.cucumber" % "cucumber-core" % "7.11.1" % Test,
      "io.cucumber" %% "cucumber-scala" % "8.14.1" % Test,
      "io.cucumber" % "cucumber-jvm" % "7.11.1" % Test,
      "io.cucumber" % "cucumber-junit" % "7.11.1" % Test,
      "org.scalatest" %% "scalatest" % "3.2.15" % Test
    )
  )
  .dependsOn(
    edapocProfileAdminProject,
    edapocProfileProject,
    edapocMembershipProject
  )

lazy val edapocProfileAdminProject =
  publishableProject(edapocEdgeProfileAdminName)
    .enablePlugins(
      ProjectTemplatePlugin,
      ProjectsHelperPlugin,
      ProjectStructurePlugin,
      EdgeProjectPlugin,
      SbtTwirl
    )
    .settings(
      name := edapocEdgeProfileAdminName,
      organization := edapocEdgeProfileAdminOrg
    )

lazy val edapocProfileProject = publishableProject(edapocValueProfileName)
  .enablePlugins(
    ProjectTemplatePlugin,
    ProjectsHelperPlugin,
    ProjectStructurePlugin,
    EdgeProjectPlugin
  )
  .settings(
    name := edapocValueProfileName,
    organization := edapocValueProfileOrg
  )

lazy val edapocMembershipProject = publishableProject(edapocValueMembershipName)
  .enablePlugins(
    ProjectTemplatePlugin,
    ProjectsHelperPlugin,
    ProjectStructurePlugin,
    EdgeProjectPlugin
  )
  .settings(
    name := edapocValueMembershipName,
    organization := edapocValueMembershipOrg
  )

lazy val edaPOC = publishableProject(edapocBaseName, Some(file(".")))
  .enablePlugins(ProjectsHelperPlugin)
  .settings(
    scalaVersion := "3.3.1",
    name := edapocBaseName,
    organization := edapocBaseOrg
  )
  .aggregate(
    edapocAcceptanceProject,
    edapocProfileAdminProject,
    edapocProfileProject,
    edapocMembershipProject
  )
