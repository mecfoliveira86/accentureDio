public class Account {
    private String name;
    private float value;
    private float specialLimit;  // Limite total (fixo)
    private float currentSpecial; // Limite disponível no momento

    public Account(String name, float initialValue) {
        this.name = name;
        this.value = initialValue;
        // Define o limite total com base na regra do exercício
        this.specialLimit = (initialValue > 500) ? (initialValue / 2) : 50;
        // No início, o limite disponível é o limite total
        this.currentSpecial = this.specialLimit;
    }

    public String saldo() {
        return String.format("Olá %s, seu saldo real é R$ %.2f e seu limite disponível é R$ %.2f", 
                             name, value, currentSpecial);
    }

    public void deposit(float depositValue) {
        float usedAmount = this.specialLimit - this.currentSpecial;

        if (usedAmount > 0) {
            float fee = usedAmount * 0.20f; // Taxa de 20% sobre o que foi usado
            System.out.printf("\n>>> Sistema: Cobrando taxa de 20%% pelo uso do cheque (R$ %.2f)\n", fee);
            depositValue -= fee;

            if (depositValue >= usedAmount) {
                depositValue -= usedAmount;
                this.currentSpecial = this.specialLimit; // Quita a dívida do cheque
                this.value += depositValue; // O que sobra vai para o saldo
            } else {
                this.currentSpecial += depositValue; // Abate parte da dívida do cheque
            }
        } else {
            this.value += depositValue;
        }
        System.out.println("Depósito processado!");
    }

    public String withdraw(float withdrawValue) {
        if (withdrawValue <= this.value) {
            this.value -= withdrawValue;
            return "Saque realizado com sucesso do saldo real!";
        } else if (withdrawValue <= (this.value + this.currentSpecial)) {
            float missing = withdrawValue - this.value;
            this.value = 0;
            this.currentSpecial -= missing;
            return "Saque realizado utilizando o cheque especial!";
        } else {
            return "Saldo e limite insuficientes.";
        }
    }

    public String payBill(float billValue) {
        return withdraw(billValue); // Reutiliza a lógica de saque
    }

    // ITEM B: Consultar valor do cheque
    public String consultSpecialValue() {
        return String.format("Limite total: R$ %.2f | Disponível: R$ %.2f", specialLimit, currentSpecial);
    }

    // ITEM F: Verificar se está usando
    public String checkOverdraftUsage() {
        if (this.currentSpecial < this.specialLimit) {
            return "ALERTA: A conta ESTÁ utilizando o cheque especial.";
        } else {
            return "A conta NÃO está utilizando o cheque especial.";
        }
    }
}