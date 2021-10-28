package backend

import org.grails.testing.GrailsUnitTest
import spock.lang.Specification

class JugadorSpec extends Specification implements GrailsUnitTest {

    def setup() {
    }

    def cleanup() {
    }

    void "se puede crear un jugador"() {
        when:
        def jugador = new Jugador('pepito')

        then:
        jugador != null
    }

    void "se pueden agregar rankings a un jugador"() {
        def jugador = new Jugador('pepito')
        def rapidRanking = new Ranking('Rapid', 1200)
        def blitzRanking = new Ranking('Blitz', 1100)
        when:
        jugador.addRanking(rapidRanking)
        jugador.addRanking(blitzRanking)

        then:
        jugador.rankings[0] == rapidRanking
        jugador.rankings[1] == blitzRanking
    }
}