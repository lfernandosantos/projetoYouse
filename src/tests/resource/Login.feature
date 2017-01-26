Feature: Login

	Scenario: Realizar login de usuário
	Given que entro no site da Youse
	When eu clico em Minha Conta
	And informo email "teste@youse.com" e clico em proximo passo
	And informo a senha '12345678' e clico em entrar
	Then o login deve ser realizado com sucesso 
	

	Scenario: Realizar logout de usuário
	Given que já estou logado
	When clico no nome de usuário e seleciono sair
	Then deve ser apresentada pagina inicial