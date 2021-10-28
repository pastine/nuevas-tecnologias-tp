package backend

class Partida {

  TipoPartida tipoPartida
  boolean requirePiezas
  boolean requireTablero
  Ubicacion ubicacion
  Date momento
  Jugador creador
  Jugador aceptadaPor

  Partida(Jugador creador, TipoPartida tipoPartida) {
    this.tipoPartida = tipoPartida
    this.creador = creador
    this.requerirPiezas = false
    this.requerirTablero = false
  }

  void requerirPiezas() {
    this.requirePiezas = true
  }

  void requerirTablero() {
    this.requireTablero = true
  }

  void ponerFecha(Date fecha) {
    this.momento = fecha
  }

  void ponerUbicacion(Ubicacion ubicacion) {
    this.ubicacion = ubicacion
  }

  void aceptar(Jugador otroJugador) {
    this.aceptadaPor = otroJugador
  }
}
