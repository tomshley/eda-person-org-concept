# EDA Person Org Concept "EDAPOC"

## Initial Project Config and Bootstrap

![readme-setup-sbt.png](readme-setup-sbt.png)

```sbt
sbt generateTemplateContent
```

```sbt
sbt enforceProjectStructure
```

## Running the apps

### Acceptance
```
junit -> tomshley.brands.global.tware.tech.products.examples.edapersonorg.RunCukesTest
```

### Profile Admin
```
sbt -> tomshley.brands.global.tware.tech.products.examples.edapersonorg.edge.profileadmin.ProfileAdminServer
```

### Membership
```
sbt -> tomshley.brands.global.tware.tech.products.examples.edapersonorg.value.membership.MembershipServer
```

### Profile
```
sbt -> tomshley.brands.global.tware.tech.products.examples.edapersonorg.value.membership.ProfileServer
```

## License
Copyright 2023 Tomshley LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


