Feature: Pesquisa Google
@run
Scenario: Pesquisa simples no Google
    Given O usuario esta na pagina inicial do Google
    When O usuario pesquisa por
    Then A página de resultados é exibida
