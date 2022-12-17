package empresa;

public class Terceirizado extends Empregado {
    private Double despesaAdicional;

    
    public Terceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
        this.setNome(nome);
        this.setHoras(horas);
        this.setValorPorHora(valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public Double pagamento() {
        double salario = ((despesaAdicional * 110) / 100) + getHoras() * getValorPorHora();

        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Despesa adicional: %.2f", despesaAdicional);
    }
}