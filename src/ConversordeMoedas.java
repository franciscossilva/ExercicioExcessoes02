import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ConversordeMoedas {
    private Map<String, BigDecimal> cotacoes = new HashMap<>();
    private LocalDate diaAtual;

    public ConversordeMoedas(){
        this.cotacoes.put("Dolar Amaericano", BigDecimal.valueOf(5.1));
        this.cotacoes.put("Dolar Canadense", BigDecimal.valueOf(3.9));
        this.cotacoes.put("Euro", BigDecimal.valueOf(6.1));
        this.cotacoes.put("Libra", BigDecimal.valueOf(7.2));
        this.diaAtual = LocalDate.now();

    }
    public double converterparareal( String moeda, double valor) throws IllegalAccessException {
        if (!this.cotacoes.containsKey(moeda)) {
            throw new IllegalAccessException("tipo de moeda invalido");
        }else if (valor<= 0.0) {
            throw new IllegalAccessException("Valor invalido,tente outra vez");
        }else {
            BigDecimal cotacao = (BigDecimal) this.cotacoes.get(moeda);
            BigDecimal valorBigdecimal = BigDecimal.valueOf(valor);
            BigDecimal valorConvertido = valorBigdecimal.multiply(cotacao);
            return valorConvertido.doubleValue();
        }

        }


        public String getDiaAtual(){
        return this.diaAtual.toString();
    }
    public BigDecimal getCotacaoAtual(String moeda){
        return (BigDecimal)this.cotacoes.get(moeda);
    }
}
