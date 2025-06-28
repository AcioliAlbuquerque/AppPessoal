package appdelivery.demo.controller;

import appdelivery.demo.model.ErrorResponse;
import appdelivery.demo.model.Reserva;
import appdelivery.demo.model.Restaurante;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ReservaController {

    @Operation(summary = "Cria uma nova reserva", description = "Cria uma reserva para um restaurante")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Reserva criada com sucesso",
                    content = @Content(schema = @Schema(implementation = Reserva.class))),
            @ApiResponse(responseCode = "400", description = "Dados inválidos",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    @PostMapping("/reservas")
    public ResponseEntity<?> criarReserva(@RequestBody Reserva reserva) {
        // Validação simples (exemplo)
        if (reserva.getNomeCliente() == null || reserva.getRestauranteId() == null || reserva.getData() == null) {
            return ResponseEntity.badRequest()
                    .body(new ErrorResponse("Dados inválidos. Verifique os campos obrigatórios."));
        }
        // Simulação de criação de reserva
        reserva.setId(1L);
        reserva.setStatus("CONFIRMADA");
        return ResponseEntity.status(HttpStatus.CREATED).body(reserva);
    }

    @Operation(summary = "Lista todos os restaurantes", description = "Retorna a lista de restaurantes disponíveis")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista retornada com sucesso",
                    content = @Content(schema = @Schema(implementation = Restaurante.class)))
    })
    @GetMapping("/restaurantes")
    public ResponseEntity<List<Restaurante>> listarRestaurantes() {
        // Simulação de lista de restaurantes
        List<Restaurante> restaurantes = Arrays.asList(
                new Restaurante(1L, "Restaurante Saboroso", "Rua Exemplo, 123", 50),
                new Restaurante(2L, "Comida Boa", "Avenida Teste, 456", 30)
        );
        return ResponseEntity.ok(restaurantes);
    }
}