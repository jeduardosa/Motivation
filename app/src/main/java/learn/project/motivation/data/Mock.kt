package learn.project.motivation.data

import learn.project.motivation.infra.MotivationConstants

data class Phrase(val description: String, val categoryId: Int)

class Mock {

    private val all = MotivationConstants.FILTER.ALL
    private val happy = MotivationConstants.FILTER.HAPPY
    private val sunny = MotivationConstants.FILTER.SUNNY

    val mListPhrase = listOf<Phrase>(
        Phrase("Não sabendo que era impossível, foi lá e fez", happy),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", happy),
        Phrase("Quando está mais escuro, vemos mais estrelas", happy),
        Phrase("Insalidade é fazer sempre a mesma coisa e esperar um resultado diferente", happy),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado", happy),
        Phrase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", happy),
        Phrase("A melhor maneira de prever o futuro é inventá-lo", sunny),
        Phrase("Você perde todas as chances que vocè não aproveita", sunny),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso", sunny),
        Phrase("Enquanto não estivermos  comprometidos, haverá hesitação", sunny),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve", sunny),
        Phrase("Se você acredita, faz toda a diferença", sunny),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", sunny)
    )

    fun getPhrase(randomPhrase: String){
        val list = mListPhrase
        val numberPhrase = 1
        val randomPhrase = list.asSequence().shuffled().take(numberPhrase).toList()
    }

}