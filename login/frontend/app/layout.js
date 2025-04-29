import './globals.css';

export const metadata = {
  title: 'Login',
  description: 'Tela de login',
};

export default function RootLayout({ children }) {
  return (
    <html lang="pt-br">
      <body>{children}</body>
    </html>
  );
}
