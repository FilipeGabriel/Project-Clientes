<h1 align="center"> Preject Client Service (Serviço de Clientes)</h1>
</br>
<p align="center">
  <img src="https://github.com/FilipeGabriel/Project-Clientes/assets/79121437/2fa017ed-73a0-45c4-b551-d941f08c9cba" alt="Imagem de capa" width="800" height="400">
</p>
</br>
  <p align="center">
    Este projeto consiste em um sistema desenvolvido para facilitar o cadastro de clientes e o registro de serviços prestados 
    a esses clientes, incluindo a atribuição de preços aos serviços. A aplicação visa oferecer uma solução simples e eficiente 
    para gerenciar informações básicas de clientes e os serviços que eles contratam.
  </p>
</br>

## Badges

<p align="center">
  <img loading="lazy" src="http://img.shields.io/static/v1?label=STATUS&message=FINALIZADO&color=GREEN&style=for-the-badge"/>
</p>

<h3>Front-end: </h3>
<p align="center">
  <img loading="lazy" src="https://img.shields.io/badge/Angular-13.4.0-green"/>
  <img loading="lazy" src="https://img.shields.io/badge/Angular_JWT-4.0.0-green"/>
  <img loading="lazy" src="https://img.shields.io/badge/Angular_CLI-13.3.11-green"/>
  <img loading="lazy" src="https://img.shields.io/badge/Jquery-3.7.1-green"/>
  <img loading="lazy" src="https://img.shields.io/badge/Bootstrap-5.3.3-green"/>
  <img loading="lazy" src="https://img.shields.io/badge/Node-12.11.1-green"/>
  <img loading="lazy" src="https://img.shields.io/badge/Font_Awesome-5.11.2-green"/>
  <img loading="lazy" src="https://img.shields.io/badge/CSS-3-green"/>
  <img loading="lazy" src="https://img.shields.io/badge/HTML-5-green"/>
</p>

<h3>Back-end: </h3>
<p align="center">
  <img loading="lazy" src="https://img.shields.io/badge/Java-11-blue"/>
  <img loading="lazy" src="https://img.shields.io/badge/Maven-4.0.0-blue"/>
  <img loading="lazy" src="https://img.shields.io/badge/Spring_Boot-2.3.4_RELEASE-blue"/>
  <img loading="lazy" src="https://img.shields.io/badge/H2-Not_Especified-909194"/>
  <img loading="lazy" src="https://img.shields.io/badge/Lombok-Not_Especified-909194"/>
  <img loading="lazy" src="https://img.shields.io/badge/JPA-Not_Especified-909194"/>
  <img loading="lazy" src="https://img.shields.io/badge/Oauth2-Not_Especified-909194"/>
  <img loading="lazy" src="https://img.shields.io/badge/Crypto-Not_Especified-909194"/>
  <img loading="lazy" src="https://img.shields.io/badge/Validation_api-Not_Especified-909194"/>
</p>



## Índice

- [Uso](#uso)
- [Tecnologias](#tecnologias)
- [Desenvolvedores](#desenvolvedores)
- [Resultados-e-Aprendizados](#resultados-e-aprendizados)

## Uso

<p>
  Esta aplicação foi desenvolvida para facilitar o gerenciamento de cadastros de clientes e serviços. 
  Abaixo estão as instruções detalhadas sobre como utilizar as principais funcionalidades da aplicação.
  </br>
  </br>
  Para ter acesso ao sistema, primeiramente é necessário fazer seu cadastro, caso não tenha feito previamente.
 </p> 
 <p align="center">
  <img loading="lazy" src="https://github.com/FilipeGabriel/Project-Clientes/assets/79121437/dc2d185b-6a5e-46ee-966d-fb3581f8b951" alt="login-cadastro" width="1000" height="400" />
 </p>
 </br>
 <p>
  Essa é a home page.</br> 
  Embora não tenha informações, ela está inserida para futuras atualizações.
  </br>
  </br>
 </p>

 <p align="center">
  <img loading="lazy" src="https://github.com/FilipeGabriel/Project-Clientes/assets/79121437/f770f79e-48e6-4fb5-b54f-8a94a4aec2dd" alt="home" width="750" height="400" />
 </p>
  


## Tecnologias

<p>
  <b>Front-end:</b></br>
  Para o desenvolvimento do front-end, escolhi utilizar o framework Angular. O Angular oferece uma estrutura robusta para construir aplicações web SPA (Single Page Application) escaláveis. Utilizando 
  TypeScript, pude aproveitar a tipagem estática para detectar e eliminar erros em tempo de desenvolvimento, o que é crucial para projetos de grande escala. Angular também proporciona módulos, componentes e 
  serviços que facilitam a organização do código e a reutilização de funcionalidades. Além do Angular, utilizei HTML5, CSS3 e Bootstrap para garantir um layout moderno e responsivo, proporcionando uma 
  experiência de usuário agradável em diferentes dispositivos.

  <b>Back-end:</b></br>
  No lado do back-end, optei por utilizar Java 11 com o framework Spring Boot. Java é conhecido por sua robustez, portabilidade e ampla adoção na indústria. Com o Spring Boot, foi possível desenvolver 
  rapidamente APIs RESTful e serviços de backend, aproveitando a injeção de dependências e o suporte a padrões de projeto que facilitam o desenvolvimento e manutenção do código.

  Para otimizar o desenvolvimento, utilizei as seguintes bibliotecas e frameworks:

  - <b>Lombok:</b> Simplifica a escrita de código Java eliminando a necessidade de escrever métodos getters, setters e construtores padrão.
  - <b>JPA (Java Persistence API):</b> Facilita o mapeamento objeto-relacional (ORM) entre classes Java e entidades de banco de dados, permitindo operações CRUD de forma simplificada.
  - <b>OAuth2:</b> Utilizado para autenticação segura e autorização de usuários através de tokens, garantindo acesso controlado aos recursos do sistema.
  - <b>Crypto:</b> Biblioteca para operações criptográficas, essencial para garantir a segurança dos dados sensíveis armazenados no sistema.
  - <b>Validation API:</b> Implementa validações de entrada de dados de forma declarativa, ajudando a garantir a integridade e consistência dos dados manipulados pela aplicação.</br>
  
  <b>Banco de Dados:</b></br>
  Para o armazenamento dos dados, escolhi o banco de dados H2, que é um banco de dados relacional leve e eficiente, ideal para desenvolvimento e testes. O H2 oferece suporte SQL completo e pode ser 
  acilmente integrado com aplicações Java, como a que desenvolvi com Spring Boot. Ele permitiu uma gestão eficaz dos dados das tarefas e das equipes, garantindo consistência e performance.

  <b>Segurança:</b></br>
  A segurança foi uma preocupação central durante todo o processo de desenvolvimento. Implementei medidas de segurança como autenticação baseada em tokens utilizando JSON Web Tokens (JWT), além de validações 
  e entrada de dados tanto no front-end quanto no back-end para prevenir vulnerabilidades como XSS e injeção de SQL.
</p>

## Resultados e Aprendizados
  Ao final do projeto, o Sistema de Clientes e Serviços estava pronto para ser utilizado, oferecendo uma interface intuitiva para cadastro, atribuição e acompanhamento de serviços. A 
  experiência me proporcionou um aprendizado significativo em relação à integração de diferentes tecnologias para construir uma aplicação completa e funcional, desde o design de interface até a implementação 
  e lógica de negócios e segurança.</br>
  Desenvolver este projeto foi uma experiência enriquecedora que demonstrou a importância de escolher as tecnologias certas para cada parte do sistema, além de garantir uma colaboração eficaz entre o 
  front-end e o back-end para alcançar os objetivos propostos. Estou ansioso para aplicar esses aprendizados em projetos futuros e continuar a aprimorar minhas habilidades como desenvolvedor.


## Desenvolvedores

Filipe Gabriel: [https://github.com/FilipeGabriel](https://github.com/FilipeGabriel)

##

</br>
<p>
  <img loading="lazy" src="https://github.com/FilipeGabriel/Project-Clientes/assets/79121437/3a47bf60-572c-4f2a-ab2d-29e2a137abd8" alt="agradecimento" />
</p>


