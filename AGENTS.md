# Repository Guidelines

## Project Structure & Module Organization
- Maven standard layout: sources in `src/main/java`, tests in `src/test/java`, package root `io.github.shigaichi`. Place assets/resources under the corresponding `resources` directories if needed.
- Build outputs live in `target/`; artifacts include `mvn-release-study-1.0-SNAPSHOT.jar`. Do not commit anything from `target/`.
- Central config is `pom.xml` (dependencies, plugins, versioning). Keep it tidy and minimal.

## Build, Test, and Development Commands
- `mvn clean compile` — fresh compile of the main sources.
- `mvn test` — run the JUnit 3 test suite.
- `mvn package` — build the jar in `target/`.
- `java -cp target/mvn-release-study-1.0-SNAPSHOT.jar io.github.shigaichi.App` — run the current entry point (adjust if the main class changes).
- For iterative work, prefer `mvn -q` to reduce noise; add `-DskipTests` only when justified.

## Coding Style & Naming Conventions
- Java 21 toolchain; use UTF-8 source encoding and 4-space indentation.
- Follow standard Java naming: `CamelCase` for classes, `camelCase` for methods/fields, `SCREAMING_SNAKE_CASE` for constants, packages lowercased.
- Keep classes small and package-scoped logically under `io.github.shigaichi`.
- No auto-formatter is configured; align with idiomatic Java and keep imports minimal and sorted.
- Write comments or test names in Japanese.

## Testing Guidelines
- Testing uses JUnit 3. Name tests with `*Test` and mirror the package of the code under test.
- Add focused unit tests for new behavior; keep tests deterministic and isolated (no network or filesystem side effects without temp directories).
- Run `mvn test` before opening a PR; include any notable coverage or scenario gaps in the PR description.

## Commit & Pull Request Guidelines
- Repository is currently without commit history; adopt Conventional Commits (`feat:`, `fix:`, `chore:`, `test:`, `docs:`) for clarity.
- Each PR should: describe the change and intent, list test commands and results, reference related issues (if any), and include screenshots/log snippets for user-visible changes.
- Keep commits small and reviewable; avoid mixing refactors with feature work.

## Security & Configuration Tips
- Do not commit secrets or credentials. Keep environment-specific settings outside source control.
- After dependency changes in `pom.xml`, rerun `mvn clean package` to confirm reproducible builds and update any checked-in lock/config files if added later.
