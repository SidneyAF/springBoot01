package med.voll.api.domain.paciente;

public record DadosListagemPaciente(Long id, String nome, String email, String cpf) {

    public DadosListagemPaciente(Paciente pacientes){
        this(pacientes.getId(), pacientes.getNome(), pacientes.getEmail(), pacientes.getCpf());
    }
}
