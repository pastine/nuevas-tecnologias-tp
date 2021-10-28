package backend

class Jugador {

  String nombreDeUsuario
  List<Ranking> rankings

  Jugador(String nombreDeUsuario) {
    this.nombreDeUsuario = nombreDeUsuario
    this.rankings = []
  }

  void addRanking(Ranking ranking) {
    this.ranking.add(ranking)
  }
}
