/*
 * Copyright 2013-2013 Amazon Technologies, Inc. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
 * OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and 
 * limitations under the License. 
 */
package com.amazonaws.regions;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * Parses the Eclipse toolkit region metadata file to pull out information about
 * the available regions, names, IDs, and what service endpoints are available
 * in each region.
 */
public class RegionMetadataParser {
    private static final String REGION_TAG = "Region";
    private static final String REGION_ID_TAG = "Name";
    private static final String ENDPOINT_TAG = "Endpoint";
    private static final String SERVICE_TAG = "ServiceName";
    private static final String HTTP_TAG = "Http";
    private static final String HTTPS_TAG = "Https";
    private static final String HOSTNAME_TAG = "Hostname";
    
    /**
     * Parses the specified input stream and returns a list of the regions
     * declared in it. By default, verification on the region endpoints is disabled.
     * 
     * @param input
     *            The stream containing the region metadata to parse.
     * 
     * @return The list of parsed regions.
     */
    public List<Region> parseRegionMetadata(InputStream input) throws IOException {
        return parseRegionMetadata(input, false);
    }
    /**
     * Parses the specified input stream and optionally verifies all the region endpoints.
     * Returns a list of all the declared regions.
     * 
     * @param input
     *            The stream containing the region metadata to parse.
     * @param endpointVerification
     *            Whether to verify each region endpoint
     * 
     * @return The list of parsed regions.
     */
    public List<Region> parseRegionMetadata(InputStream input, boolean endpointVerification) throws IOException {
        Document document;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            document = documentBuilder.parse(input);
        } catch (Exception e) {
            throw new RuntimeException("Unable to parse region metadata file: " + e.getMessage(), e);
        } finally {
            input.close();
        }
        
        NodeList regionNodes = document.getElementsByTagName(REGION_TAG);
        List<Region> regions = new ArrayList<Region>();
        for (int i = 0; i < regionNodes.getLength(); i++) {
            Node node = regionNodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element)node;
                regions.add(parseRegionElement(element, endpointVerification));
            }
        }
        
        return regions;
    }

    private Region parseRegionElement(Element regionElement, boolean endpointVerification) {
        String name = getChildElementValue(REGION_ID_TAG, regionElement);
        Region region = new Region(name);

        NodeList endpointNodes = regionElement.getElementsByTagName(ENDPOINT_TAG);
        for (int i = 0; i < endpointNodes.getLength(); i++) {
            addRegionEndpoint(region, (Element) endpointNodes.item(i), endpointVerification);
        }
        
        return region;
    }
    
    private void addRegionEndpoint(Region region, Element endpointElement, boolean endpointVerification) {
        String serviceName = getChildElementValue(SERVICE_TAG, endpointElement);
        String hostname = getChildElementValue(HOSTNAME_TAG, endpointElement);
        String http = getChildElementValue(HTTP_TAG, endpointElement);
        String https = getChildElementValue(HTTPS_TAG, endpointElement);
        if ( endpointVerification && !verifyEndpoint(hostname) ) {
            throw new RuntimeException("Invalid service endpoint (" + hostname + ") is detected.");
        }
        region.getServiceEndpoints().put(serviceName, hostname);
        region.getHttpSupport().put(serviceName, "true".equals(http));
        region.getHttpsSupport().put(serviceName, "true".equals(https));
    }

    private static String getChildElementValue(String tagName, Element element){
        Node tagNode = element.getElementsByTagName(tagName).item(0);
        if ( tagNode == null )
            return null;
        NodeList nodes= tagNode.getChildNodes();
        Node node = (Node)nodes.item(0); 
     
        return node.getNodeValue();    
    }
    
    /** Returns whether the provided endpoint is a valid AWS service endpoint.
     * TODO We might want to do more complicated verification in the future.
     */
    private static boolean verifyEndpoint(String endpoint) {
        return endpoint.endsWith(".amazonaws.com");
    }
}
