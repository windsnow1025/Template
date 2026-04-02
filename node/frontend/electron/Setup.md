# Electron

```bash
pnpm dlx create-electron-app@latest <app_name> --template=vite-typescript
```

```bash
pnpm install -D @electron-forge/publisher-github
```

## Vite

### React

```bash
pnpm add react react-dom
pnpm add -D @types/react @types/react-dom
```

### Tailwind CSS

```bash
pnpm add tailwindcss @tailwindcss/postcss postcss
```

#### postcss.config.mjs

```js
export default {
  plugins: {
    "@tailwindcss/postcss": {},
  }
}
```