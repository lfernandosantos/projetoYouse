Feature: Cotação

	Scenario: Realizar uma Cotação
	Given que estou logado
	When escolho realizar uma cotação para seguro automóvel
	And informo meus dados
	And preencho as informações sobre meu carro e confirmo
	Then eu tenho o valor do meu carro e o valor do seguro