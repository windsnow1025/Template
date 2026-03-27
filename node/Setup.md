# Node.js Setup

## Jest

```bash
pnpm add --save-dev jest
```

## jest.config.ts

```bash
pnpm add --save-dev ts-node
```

```ts
import type { Config } from "@jest";

const config: Config = {
    preset: "ts-jest",
    testEnvironment: "node",
};

export default config;
```

## Upgrade dependencies

```bash
npm install -g npm-check-updates
ncu -u
```

## Unpublish package

```bash
npm unpublish <package-name>@<version>
```

## Run a single TypeScript file

```bash
npx ts-node <filepath>
```
