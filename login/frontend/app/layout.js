import './globals.css';

export const metadata = {
  title: "Gym Login",
  description: "Login Full Stack",
};

export default function RootLayout({ children }) {
  return (
    <html lang="pt-br">
      <head>
        <link rel="icon" href="/favicon.png" type="image/png" />
      </head>
      <body>{children}</body>
    </html>
  );
}
