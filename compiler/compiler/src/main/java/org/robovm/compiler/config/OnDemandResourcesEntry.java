package org.robovm.compiler.config;

import org.simpleframework.xml.Element;

public class OnDemandResourcesEntry {

    @Element(required = true)
    private String hash;
    @Element(required = true)
    private String tags;

    public String getTags() {
        return tags;
    }

    public String getHash() {
        return hash;
    }
}
