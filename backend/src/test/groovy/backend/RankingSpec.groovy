package backend

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class RankingSpec extends Specification implements DomainUnitTest<Ranking> {

    def setup() {
    }

    def cleanup() {
    }

    void "puedo crear un ranking para un tipo de partida"() {
        when:
          def ranking = new Ranking('Blitz', 1300)
        then:
          ranking.tipoDePartida == 'Blitz'
          ranking.numeroRanking == 1300
    }
}
