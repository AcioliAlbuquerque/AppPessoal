# Documentação da API

## Endpoint: Criar Reserva
- **Método**: POST
- **URL**: `/api/reservas`
- **Descrição**: Cria uma nova reserva para um restaurante.
- **Payload de Requisição**:
  ```json
  {
      "restauranteId": 1,
      "nomeCliente": "João Silva",
      "data": "2025-07-01T19:00:00",
      "quantidadePessoas": 4
  }