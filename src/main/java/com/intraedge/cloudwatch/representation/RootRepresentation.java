package com.intraedge.cloudwatch.representation;

public class RootRepresentation {

    protected String version;
    protected String name;

    public RootRepresentation(String version, String name) {
        this.version = version;
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }
}
