package pl.stepwise.versioning

import spock.lang.Specification

class DummyTest extends Specification {

    def "Dummy always passing test"(){
        expect:
            assert 1 == 1
    }
}
