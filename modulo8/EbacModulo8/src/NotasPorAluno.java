import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class NotasPorAluno {

    private String nomeAluno;
    private List<BigDecimal> notas;
    private BigDecimal media;

    public NotasPorAluno() {
        this.notas = new ArrayList<>();
    }

    public String getNomeAluno(){
        return this.nomeAluno;
    }

    public void setNomeAluno(String nome){
        this.nomeAluno =   nome.trim().isEmpty() ? ""  :  nome.trim().toUpperCase();
    }

    public void adicionarNovaNota(BigDecimal nota){
        this.notas.add(nota);
    }

    public BigDecimal getMedia() {
        if (notas.isEmpty()) {
            return BigDecimal.ZERO;
        }

        BigDecimal soma = BigDecimal.ZERO;
        for (BigDecimal nota : notas) {
            soma = soma.add(nota);
        }

        this.media = soma.divide(new BigDecimal(notas.size()), RoundingMode.HALF_UP);
        return this.media;
    }
}