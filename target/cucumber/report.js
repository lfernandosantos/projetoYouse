$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Realizar login de usuário",
  "description": "",
  "id": "login;realizar-login-de-usuário",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "que entro no site da Youse",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "eu clico em Minha Conta",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "informo email \"teste@youse.com\" e clico em proximo passo",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "informo a senha \u002712345678\u0027 e clico em entrar",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "o login deve ser realizado com sucesso",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.que_entro_no_site_da_Youse()"
});
formatter.result({
  "duration": 15194928790,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.eu_clico_em_Minha_Conta()"
});
formatter.result({
  "duration": 1192585905,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "teste@youse.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.informo_email_e_clico_em_proximo_passo(String)"
});
formatter.result({
  "duration": 1251053805,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 17
    }
  ],
  "location": "LoginSteps.informo_a_senha_e_clico_em_entrar(int)"
});
formatter.result({
  "duration": 1740704847,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.o_login_deve_ser_realizado_com_sucesso()"
});
formatter.result({
  "duration": 947771634,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Realizar logout de usuário",
  "description": "",
  "id": "login;realizar-logout-de-usuário",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "que já estou logado",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "clico no nome de usuário e seleciono sair",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "deve ser apresentada pagina inicial",
  "keyword": "Then "
});
formatter.match({
  "location": "LogoutSteps.que_já_estou_logado()"
});
formatter.result({
  "duration": 49490552668,
  "status": "passed"
});
formatter.match({
  "location": "LogoutSteps.clico_em_meu_nome_de_usuário()"
});
formatter.result({
  "duration": 4363665038,
  "status": "passed"
});
formatter.match({
  "location": "LogoutSteps.deve_ser_apresentada_pagina_inicial()"
});
formatter.result({
  "duration": 2461804862,
  "status": "passed"
});
});