# Next.js Setup

```bash
pnpm create next-app
```

## tsconfig.json

```json
{
  "compilerOptions": {
    "paths": {
      "@/*": ["./src/*"]
    },
    "include": [
      "**/*.js",
      "**/*.jsx"
    ],
  }
}
```

## Jest

[https://nextjs.org/docs/app/guides/testing/jest](https://nextjs.org/docs/app/guides/testing/jest)

```bash
pnpm add -D jest jest-environment-jsdom @testing-library/react @testing-library/dom @testing-library/jest-dom ts-node @types/jest
```

```bash
pnpm create jest@latest
```

### jest.config.ts

```ts
import type { Config } from 'jest'
import nextJest from 'next/jest.js'
 
const createJestConfig = nextJest({
  // Provide the path to your Next.js app to load next.config.js and .env files in your test environment
  dir: './',
})
 
// Add any custom config to be passed to Jest
const config: Config = {
  coverageProvider: 'v8',
  testEnvironment: 'jsdom',
  // Add more setup options before each test is run
  // setupFilesAfterEnv: ['<rootDir>/jest.setup.ts'],
}
 
// createJestConfig is exported this way to ensure that next/jest can load the Next.js config which is async
export default createJestConfig(config)
```

## next.config.ts

```ts
const nextConfig = {
  output: 'standalone',
  transpilePackages: ['<package_name>'],
  productionBrowserSourceMaps: true,
};
```