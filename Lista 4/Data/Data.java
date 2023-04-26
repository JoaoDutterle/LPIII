public class Data{
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void inicializarData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean verificarData() {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0) {
            return false;
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        }

        if (mes == 2) {
            if ((dia > 28 && ano % 4 != 0) || (dia > 29 && ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0))) {
                return false;
            }
        }

        return true;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimirData() {
        System.out.printf("%02d/%02d/%04d%n", dia, mes, ano);
    }

    public void imprimirDataExtenso() {
        String[] meses = { "", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" };
        System.out.printf("%d de %s de %d%n", dia, meses[mes], ano);
    }
    
}