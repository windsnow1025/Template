# Nest.js Setup

```bash
pnpm add -g @nestjs/cli
nest new <project-name>
```

## package.json

```json
{
  "scripts": {
    "start:prod": "node dist/src/main"
  }
}
```

## .prettierrc


```ts
module.exports = {
  rules: {
    "prettier/prettier": [
      "error",
      {
        "endOfLine": "auto"
      }
    ]
  },
};
```

## tsconfig.json


```json
{
  "compilerOptions": {
    "strictNullChecks": true,
    "noImplicitAny": true,
    "strictBindCallApply": true,
    "forceConsistentCasingInFileNames": true,
    "noFallthroughCasesInSwitch": true
  }
}
```
