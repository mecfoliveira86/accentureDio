public class Account {

    private String name;
    private float value;
    private float specialValue;

    // Construtor
    public Account(String name, float value) { // Alterado para float para ser consistente
        this.name = name;
        this.value = value;
        // Lógica do cheque especial
        this.specialValue = (value > 500) ? (value / 2) : 50;
    }

    public String saldo() {
        return String.format("Olá %s, seu saldo é de R$ %.2f", name, value);
    }

    public String chequeEspecial() {
        return "Seu limite de cheque especial é R$ " + specialValue;
    }

    public void deposit(float depositValue) {
        this.value += depositValue;
    }

    public String withdraw(float withdrawValue) {
        int eval;
        
        if (withdrawValue <= this.value) {
            // Caso 1: Tem saldo suficiente
            this.value -= withdrawValue;
            eval = 1;
        } else if (withdrawValue <= (this.value + this.specialValue)) {
            // Caso 2: Usa o saldo e parte do cheque especial
            this.value -= withdrawValue; // O saldo ficará negativo, o que é normal em bancos
            eval = 2;
        } else {
            // Caso 3: Não tem dinheiro nem com o limite
            eval = 3;
        }

        return switch (eval) {
            case 1 -> "Saque realizado! Saldo restante: " + this.value;
            case 2 -> "Saque realizado usando cheque especial! Saldo atual: " + this.value;
            case 3 -> "Saldo e limite insuficientes para este valor.";
            default -> "Erro inesperado.";
        };
    }
}