package com.example.flaggame

object Constants {

    fun getQuestion() : ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "Qual o nome desse personagem?",
            R.drawable.questao1,
        "Sr. Calça cagada",
            "Sr. Bunda cagada",
            "Sr. Cueca melada", "Sr. Calça melada",
            2)



        val que2 = Question(2,
            "Porque Rick se transformou num pickles?", R.drawable.questao2,
            "Porque ele queria se disfarçar",
            "Porque ele queria saber como é ser uma comida",
            "Porque ele não queria ir na terapia com a familia",
            "Porque ele queria trolar Morty",
            3)


        val que3 = Question(3,
            "Qual a função do Mr. Meeseeks?", R.drawable.questao3,
            "Realizar um desejo",
            "Construir e reparar utensílios",
            "Servir as pessoas",
            "Ajudante de limpeza",
            1)


        val que4 = Question(4,
            "O que a Zureta do Chorume gosta de comer?", R.drawable.questao4,
            "Gosta de comer planta",
            "Gosta de comer lixo",
            "Gosta de comer sorvete",
            "Gosta de comer pizza",
            2)


        val que5 = Question(5,
            "Qual a profissão da Beff?", R.drawable.questao5,
            "Enfermeira",
            "Fisioterapeuta",
            "Médica veterinária",
            "Nutricionista",
            3)


        val que6 = Question(6,
            "Qual a utilidade desta arma?", R.drawable.questao6,
            "Invocar monstros",
            "Disparar fogo",
            "Disparar raios lazer",
            "Abrir portais",
            4)


        val que7 = Question(7,
            "Qual era o nome do cachorro do Morty?", R.drawable.questao7,
            "Rufflos",
            "Buffles",
            "Snuffles",
            "Scobby",
            3)


        val que8 = Question(8,
            "Qual o método que o Morty desenvolveu para descobrir quem é ou não um parasita?", R.drawable.questao8,
            "Parasitas não conseguem admitir que estão errado",
            "Parasitas não criam memórias ruins",
            "Parasitas não gostam de água",
            "Parasitas tem fraqueza por ketchup",
            2)


        val que9 = Question(9,
            "Qual o nome dela?", R.drawable.questao9,
            "Angelica",
            "Paula",
            "Jessica",
            "Keila",
            3)


        val que10 = Question(10,
            "O que Mr. Nimbus controla", R.drawable.questao10,
            "Policia",
            "Fogo",
            "Plantas",
            "Tempo",
            1)

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)

        return questionsList
    }
}