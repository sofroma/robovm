package org.robovm.compiler.config;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;

public class OnDemandResources {

    @Element(required = true)
    private String specificationFile;

    @ElementList(required = true)
    private ArrayList<OnDemandResourcesEntry> entries;

    @Element(required = true)
    private String isDistribution;

    public String getSpecificationFile() {
        return specificationFile;
    }

    public ArrayList<OnDemandResourcesEntry> getEntries() {
        return entries;
    }

    public boolean isDistribution() {
        return isDistribution.equals("YES");
    }
}
