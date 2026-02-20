

public class Usuario {

    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private char sexo;
    private int nivel;      //nivel de atividade fisica
    private double TMB;
    private double  NDC;


     // setters
    public void setNome(String nome)     {this.nome = nome;}
    public void setIdade(int idade)      {this.idade = idade;}
    public void setPeso(double peso)     {this.peso = peso;}
    public void setAltura(double altura) {this.altura = altura;}
    public void setSexo(char sexo)       {this.sexo = sexo;}
    public void setNivel(int nivel)      {this.nivel = nivel;}
    public void setTMB(double TMB)       {this.TMB = TMB;}
    public void setNDC(double NDC)       {this.NDC = NDC;}


    //getters
    public String getNome()     {return nome;}
    public int getIdade()       {return idade;}
    public double getPeso()     {return peso;}
    public double getAltura()   {return altura;}
    public char getSexo()       {return sexo;}
    public int getNivel()       {return nivel;}
    public double getTMB()      {return TMB;}
    public double getNDC()      {return NDC;}



    // calculo TMB - Taxa metabólica basal
    public void TMB() {
        double TMB;

        if (sexo == 'M')
            TMB = 66 + (13.7 * peso) + (5 * altura) - (6.8 * idade);
        else
            TMB = 655 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade);

        setTMB(TMB);

    }

    //calculo de NDC - Necessidade diária calórica
    public void NDC()
    {   
        //verifica TMB para cálculo
        if(TMB == 0) TMB();

        double NDC;

        if(nivel == 1)
            NDC = getTMB() * 1.2;
        else if(nivel == 2)
            NDC = getTMB() * 1.375;
        else if(nivel == 3)
            NDC = getTMB() * 1.55;
        else if(nivel == 4)
            NDC = getTMB() * 1.725;
        else
            NDC = getTMB() * 1.9;

        setNDC(NDC);

    }









}
