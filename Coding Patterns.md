# Coding Patterns

- Constants use `Pascal_Case`.
- Avoid try-catch unless necessary.
- Parameter ordering follows functional intent.

## Python

### Parameters & Arguments

- Avoid default parameter values unless `None`.
- Avoid keyword arguments unless default value.

### Non-ML Project Requirements

- Type annotations for all function signatures.
- Type annotations for variables when the type cannot be inferred.

### ML Project Requirements

- No type annotations.

#### Directory structure

```
project/
├── app/
│   ├── main.py
│   ├── config.py
│   ├── utils.py
│   ├── input.py
│   ├── output.py
│   └── core/
├── data/
├── output/
└── docs/
```
