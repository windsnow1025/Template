# Coding Conventions

- Constants use `PascalCase`.
- Shadowing an outer binding is allowed.
- Parameter and function ordering follows functional intent.
- Use official SDKs for external APIs and encapsulate request methods in client files.
- Avoid optional parameters unless there is a use case for calling without the argument.
- Avoid fallback logic that substitutes for fixing the root cause.
- Avoid silent failure, in which a success is reported but not reached.

## Error Handling

An operation ends with a verdict or with a failure. A verdict is a judgment within the operation's contract on its input and the state it examines. A failure is the operation ending without a verdict, caused by the environment or by a violated invariant. An invariant is a condition the program itself guarantees.

- A non-success verdict is signaled in its agreed form.
- A failure propagates to the error boundary, which translates it to what the consumer reads.
- An invariant is enforced by an assertion, not by a guard.

## Directory Structure

```
project/
├── .env
├── .env.example
├── .gitignore
```

## Template Files

- Template files (`.gitignore`, `Dockerfile`, `.dockerignore`, GitHub Actions `.yaml`, etc.) start with a comment linking to the source template.
- Ignore files (`.gitignore`, `.dockerignore`) append a `# Custom` section at the end for project-specific entries.

## Python

### Non-ML Project Requirements

- Type annotations for all function signatures.
- Type annotations for variables when the type cannot be inferred.

### ML Project Requirements

- No type annotations.

#### Directory Structure

```
project/
├── app/
│   ├── config.py
│   ├── utils/
│   │   ├── input.py
│   │   └── output.py
│   └── core/
├── data/
├── output/
└── docs/
```

- Single main script:
```
project/
├── app/
│   ├── main.py
```

- Multiple scripts:
```
project/
├── app/
│   ├── scripts/
```

## React

CSS priority: global CSS > Tailwind > inline style

### Directory Structure

```
project/
├── src/
│   ├── components/
│   ├── data/
│   └── lib/
```
