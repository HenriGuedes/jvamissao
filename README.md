#  LightYear — Sistema de Gestão de Missões Espaciais Sustentáveis

> Projeto acadêmico desenvolvido em Java que simula o gerenciamento de missões espaciais voltadas à prevenção de desastres naturais e ao desenvolvimento sustentável.

---

##  Problema Escolhido

**Prevenção de Desastres Naturais**

Desastres naturais como enchentes, secas, deslizamentos e tempestades causam perdas humanas e econômicas enormes ao redor do mundo — e sua frequência vem crescendo com as mudanças climáticas. O monitoramento espacial, por meio de satélites e sensores remotos, é uma das ferramentas mais eficazes para antecipar, acompanhar e mitigar esses eventos.

Este projeto simula um sistema de controle de missões espaciais que contribuem diretamente para esse monitoramento e para a resposta a desastres naturais.

---

##  ODS Relacionado

| ODS | Descrição |
|-----|-----------|
| **ODS 11** | Cidades e Comunidades Sustentáveis — redução de vulnerabilidade a desastres |
| **ODS 13** | Ação Contra a Mudança Global do Clima — monitoramento climático e resposta a eventos extremos |

---

##  Tecnologias Utilizadas

- **Java** — Linguagem principal
- **Eclipse IDE** — Ambiente de desenvolvimento
- **Java Collections** — `ArrayList` para gerenciamento das missões
- **Java Scanner** — Interface de entrada via terminal

---

##  Estrutura do Projeto

```
jvamissao/
└── src/
    └── br/
        └── com/
            └── lightyear/
                ├── model/
                │   └── Missoes.java       # Classe modelo da missão
                └── teste/
                    └── Teste.java         # Classe principal com o menu
```

---

##  Como Executar

### Pré-requisitos

- [Java JDK 11+](https://www.oracle.com/java/technologies/downloads/) instalado
- [Eclipse IDE](https://www.eclipse.org/downloads/) ou qualquer IDE Java

### Via Eclipse

1. Clone o repositório:
   ```bash
   git clone https://github.com/HenriGuedes/jvamissao.git
   ```
2. Abra o Eclipse → **File → Import → Existing Projects into Workspace**
3. Selecione a pasta do projeto
4. Localize `Teste.java` em `src/br/com/lightyear/teste/`
5. Clique com o botão direito → **Run As → Java Application**

### Via Terminal

```bash
git clone https://github.com/HenriGuedes/jvamissao.git
cd jvamissao
javac -d bin src/br/com/lightyear/model/Missoes.java src/br/com/lightyear/teste/Teste.java
java -cp bin br.com.lightyear.teste.Teste
```

### Menu do Sistema

```
PREVENÇÃO DE DESASTRES NATURAIS
1 - Cadastrar missão
2 - Listar missões
3 - Buscar missões
4 - Alterar Status da missão
5 - Sair
```

> **Prioridade:** `baixa` ou `alta`  
> **Status:** `Em andamento`, `Concluída` ou `Cancelada`

---

##  Integrantes do Grupo

| Nome | RM |
|------|----|
| Henrique Guedes | RM562474 |
| Laura Tigre | RM565281 |
| Eduardo Duran | RM562017 |
| Henrique Castro | RM564560 |
| Caio Nascimento Caminha | RM564789 |

---

> Projeto acadêmico desenvolvido para fins educacionais — **FIAP**

---

## 🎥 Vídeo Explicativo

[Clique aqui para assistir ao vídeo explicativo do projeto](https://drive.google.com/file/d/1XYN632ZwydQ8TR7ZJOEPJUBEz8b1vGgj/view?usp=sharing)
