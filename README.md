YouTrack Changelog Generator

A Kotlin script that automatically generates a Markdown ChangeLog for a given release version by querying YouTrack (KT project).

Features

- Accepts a release version as a command-line argument (e.g., 2.2.0, 2.3.0-Beta1, M1, 1.1-M01, 1.5.0-RC, 1.1.60)

- Fetches issues from YouTrack KT project with State = Fixed

- Filters by: Available In = specified release version

- Groups issues by the first “Subsystem” (or “Uncategorized” if missing)

- Outputs a Markdown file:
  changelog-'version'.md

[Output file example](changelog-2.3.0-Beta2.md)

## How to Run

Make sure that Java 17-24 is added to `PATH` or `JAVA_HOME` set.

```bash

git clone https://github.com/OleksandrIvanov2202/changelog.git

cd changelog-generator

./gradlew run --args="2.3.0-Beta1"

```
How to run the same commands on Windows
```bash

git clone https://github.com/OleksandrIvanov2202/changelog.git

cd changelog-generator

gradlew run --args="2.3.0-Beta1"

```
