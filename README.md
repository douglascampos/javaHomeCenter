# A idéia

 A idéia é um server que recebe informações sobre sensores espalhados nos comodos da sua casa, omo atualmente tudo esta sendo automatizado, o controle da sua residencia também será automatizado. Minha idéia é que cada comodo da casa tenha sensores, como temperatura e luminosidade ligados em Arduinos e cada Arduino entre em contato com o servidor passando as informações desses sensores e o servidor por sua vez repasse para o aplicativo de celular.


# O que esta feito
 Esta feito a parte de controle entre sensores, leituras e comodos da casa.

# Como executar o servidor
 O projeto esta feito utilizando Maven, portanto basta executar:
   $ mvn spring-boot:run

# TODO
 Existe varias coisas para fazer, mas os próximos passos são
  - Mover o metodo PostConstruct que esta dentro da classe HomeCenter para uma outra classe.
  - Criar os testes
  - Refatorar o nome para usar mensuring ao invés de usar scanner
  - Criar as rotas de post para o server