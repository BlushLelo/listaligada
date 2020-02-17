package Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
  private String nome;
  private String sobreNome;

  @Override
  public String toString() {
    return "Domain.Aluno{" +
      "nome='" + nome + '\'' +
      ", sobreNome='" + sobreNome + '\'' +
      '}';
  }


}
