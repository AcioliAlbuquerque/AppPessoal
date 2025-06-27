package appdelivery.demo;

import java.time.LocalDateTime;

public class Reserva {
    private Long id;
    private Long restauranteId;
    private String nomeCliente;
    private LocalDateTime data;
    private Integer quantidadePessoas;
    private String status;

    // Construtores
    public Reserva() {}

    public Reserva(Long id, Long restauranteId, String nomeCliente, LocalDateTime data, Integer quantidadePessoas, String status) {
        this.id = id;
        this.restauranteId = restauranteId;
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.quantidadePessoas = quantidadePessoas;
        this.status = status;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getRestauranteId() { return restauranteId; }
    public void setRestauranteId(Long restauranteId) { this.restauranteId = restauranteId; }
    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }
    public LocalDateTime getData() { return data; }
    public void setData(LocalDateTime data) { this.data = data; }
    public Integer getQuantidadePessoas() { return quantidadePessoas; }
    public void setQuantidadePessoas(Integer quantidadePessoas) { this.quantidadePessoas = quantidadePessoas; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}