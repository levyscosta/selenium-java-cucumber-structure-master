$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pesquisaGoogle.feature");
formatter.feature({
  "line": 1,
  "name": "Pesquisa Google",
  "description": "",
  "id": "pesquisa-google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Pesquisa simples no Google",
  "description": "",
  "id": "pesquisa-google;pesquisa-simples-no-google",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "O usuario esta na pagina inicial do Google",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "O usuario pesquisa por",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "A página de resultados é exibida",
  "keyword": "Then "
});
formatter.match({
  "location": "PesquisaGoogleSteps.o_usuario_esta_na_pagina_inicial_do_Google()"
});
formatter.result({
  "duration": 3426246800,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaGoogleSteps.o_usuario_pesquisa_por()"
});
formatter.result({
  "duration": 326442800,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaGoogleSteps.a_pagina_de_resultados_e_exibida()"
});
formatter.result({
  "duration": 3208225700,
  "status": "passed"
});
});