package ExercSuporteTecnico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class suporteTecnico {

    HashMap<String, String> bancoSolucao = new HashMap<String, String>();
    ArrayList<String> respostaPadrao = new ArrayList<String>();
    interpretadora ajda = new interpretadora();
    Random gerar = new Random();
    
    public suporteTecnico() {

    }

    public String buscarSolucao(HashSet<String> ajd) {
        iniciarBanco();
        String y ="x";
     
            for(String x : ajd) {
                if(bancoSolucao.containsKey(x)){
                    y = bancoSolucao.get(x);
                }
                
            }
            return y;
        }

    public String buscarSolucaoPadrao() {
        iniciarResposta();
        int i = gerar.nextInt(10);
        return respostaPadrao.get(i);
          
    }

    public void iniciarResposta(){
        respostaPadrao.add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?");
        respostaPadrao.add("Nenhum outro cliente detalhou um problema parecido com este. \n Qual é a sua configuração de sistema?");
        respostaPadrao.add("Isso parece interessante. Diga-me mais a respeito...");
        respostaPadrao.add("Preciso de maiores informações a respeito.");
        respostaPadrao.add("Você já verificou se existe algum conflito de DLL?");
        respostaPadrao.add("Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?");
        respostaPadrao.add("Sua descrição não foi satisfatória. Você já procurou um técnico\n que poderia detalhar melhor este problema?");
        respostaPadrao.add("Isso não é um problema, é apenas uma característica do software!");
        respostaPadrao.add("Você poderia explicar melhor?");
    }
    

    public void iniciarBanco(){
        bancoSolucao.put("lento", "Penso que o problema está relacionado com o hardware. Fazer um upgrade\n do seu processador deve resolver o problema de performance. Você tem algum\n problema com o software?");
        bancoSolucao.put("performance", "A performance está próxima do esperado nos testes que realizamos. Você está\n executando algum outro processo em paralelo?");
        bancoSolucao.put("bug", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
        bancoSolucao.put("buggy", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
        bancoSolucao.put("windows", "Este é um problema do sistema operacional Windows. Por favor, \n entre em contato com a Microsoft. Não há nada que possamos fazer neste caso.");
        bancoSolucao.put("macintosh", "Este é um problema do sistema operacional Mac. Por favor, \n entre em contato com a Apple. Não há nada que possamos fazer neste caso.");
        bancoSolucao.put("caro", "O preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado\n e comparou todas as características do nosso software com outras ofertas de mercado?");
        bancoSolucao.put("instalação","A instalação é simples e direta. Nós temos programas de instalação previamente configurados\n que farão todo o trabalho para você. Você já leu as instruções\n de instalação?");
        bancoSolucao.put("memória", "Se você observar detalhadamente os requisitos mínimos de sistema, você verá que\n a memória requerida é 1.5 giga byte. Você deverá adquirir\n mais memória. Mais alguma coisa que deseja saber?");
        bancoSolucao.put("linux", "Nós consideramos seriamente o suporte Linux. Mas existem muitos problemas.\n Muitos deles dizem respeito a versões incompatíveis. Você poderia ser\n mais preciso?");
        bancoSolucao.put("danificaram", "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.");
        bancoSolucao.put("danificou",  "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.");
    }


}