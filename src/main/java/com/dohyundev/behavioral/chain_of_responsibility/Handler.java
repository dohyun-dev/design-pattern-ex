package com.dohyundev.behavioral.chain_of_responsibility;

import java.util.Objects;

abstract class Handler {
    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    protected abstract void handleRequest(String request);

    public final void run(String request) {
        handleRequest(request);

        if (!Objects.isNull(next))
            next.run(request);
    }
}
