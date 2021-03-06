package be.bagofwords.db.combinator;

import be.bagofwords.exec.RemoteClass;

@RemoteClass
public class LongCombinator implements Combinator<Long> {

    @Override
    public Long combine(Long first, Long second) {
        return first + second;
    }
}
