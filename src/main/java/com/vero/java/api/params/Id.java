package com.vero.java.api.params;

/**
 * Represents {@code id} parameter of the Vero API request.
 *
 * @author szagriichuk.
 */
public class Id extends Param<String> {

    public Id(String param) {
        super(param);
    }
    public Id(Integer param) {
        super(param.toString());
    }

    @Override
    public String name() {
        return "id";
    }
}
