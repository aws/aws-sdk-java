/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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
 * Parses a region metadata file to pull out information about the
 * available regions, names, IDs, and what service endpoints are available
 * in each region.
 */
public class RegionMetadataParser {

    private static final String REGION_TAG = "Region";
    private static final String REGION_ID_TAG = "Name";
    private static final String DOMAIN_TAG = "Domain";
    private static final String ENDPOINT_TAG = "Endpoint";
    private static final String SERVICE_TAG = "ServiceName";
    private static final String HTTP_TAG = "Http";
    private static final String HTTPS_TAG = "Https";
    private static final String HOSTNAME_TAG = "Hostname";

    /**
     * Parses the specified input stream and returns a {@code RegionMetadata}
     * object.
     *
     * @param input the input stream to parse
     * @return the parsed region metadata
     * @throws IOException on error
     */
    public static RegionMetadata parse(final InputStream input)
            throws IOException {

        return new RegionMetadata(internalParse(input, false));
    }

    /**
     * @deprecated since this object is stateless
     */
    @Deprecated
    public RegionMetadataParser() {
    }
    
    /**
     * Parses the specified input stream and returns a list of the regions
     * declared in it. By default, verification on the region endpoints is
     * disabled.
     * 
     * @param input
     *            The stream containing the region metadata to parse.
     * 
     * @return The list of parsed regions.
     * @deprecated in favor of {@link #parse(InputStream)}
     */
    @Deprecated
    public List<Region> parseRegionMetadata(InputStream input)
            throws IOException {

        return internalParse(input, false);
    }

    /**
     * Parses the specified input stream and optionally verifies that all of
     * the endpoints end in ".amazonaws.com". This method is deprecated, since
     * not all valid AWS endpoints end in ".amazonaws.com" any more.
     * 
     * @param input
     *            The stream containing the region metadata to parse.
     * @param endpointVerification
     *            Whether to verify each region endpoint
     * 
     * @return The list of parsed regions.
     * @deprecated in favor of {@link #parse(InputStream)}
     */
    @Deprecated
    public List<Region> parseRegionMetadata(final InputStream input,
                                            final boolean endpointVerification)
            throws IOException {

        return internalParse(input, endpointVerification);
    }

    private static List<Region> internalParse(
            final InputStream input,
            final boolean endpointVerification) throws IOException {

        Document document;
        try {

            DocumentBuilderFactory factory =
                DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            document = documentBuilder.parse(input);

        } catch (IOException exception) {
            throw exception;
        } catch (Exception exception) {
            throw new IOException("Unable to parse region metadata file: "
                                  + exception.getMessage(),
                                  exception);
        } finally {
            try {
                input.close();
            } catch (IOException exception) {
            }
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

    private static Region parseRegionElement(
            final Element regionElement,
            final boolean endpointVerification) {

        String name = getChildElementValue(REGION_ID_TAG, regionElement);
        String domain = getChildElementValue(DOMAIN_TAG, regionElement);

        InMemoryRegionImpl regionImpl = new InMemoryRegionImpl(name, domain);

        NodeList endpointNodes =
            regionElement.getElementsByTagName(ENDPOINT_TAG);

        for (int i = 0; i < endpointNodes.getLength(); i++) {
            addRegionEndpoint(regionImpl,
                              (Element) endpointNodes.item(i),
                              endpointVerification);
        }

        return new Region(regionImpl);
    }
    
    private static void addRegionEndpoint(
            final InMemoryRegionImpl region,
            final Element endpointElement,
            final boolean endpointVerification) {

        String serviceName = getChildElementValue(SERVICE_TAG, endpointElement);
        String hostname = getChildElementValue(HOSTNAME_TAG, endpointElement);
        String http = getChildElementValue(HTTP_TAG, endpointElement);
        String https = getChildElementValue(HTTPS_TAG, endpointElement);

        if ( endpointVerification && !verifyLegacyEndpoint(hostname) ) {
            throw new IllegalStateException("Invalid service endpoint ("
                                            + hostname + ") is detected.");
        }

        region.addEndpoint(serviceName, hostname);
        if (Boolean.valueOf(http)) {
            region.addHttp(serviceName);
        }
        if (Boolean.valueOf(https)) {
            region.addHttps(serviceName);
        }
    }

    private static String getChildElementValue(
            final String tagName,
            final Element element) {

        Node tagNode = element.getElementsByTagName(tagName).item(0);
        if ( tagNode == null )
            return null;
        NodeList nodes= tagNode.getChildNodes();
        Node node = (Node)nodes.item(0); 
     
        return node.getNodeValue();    
    }

    /**
     * Returns whether the provided endpoint is a "valid" AWS service endpoint
     * ending in ".amazonaws.com".
     */
    private static boolean verifyLegacyEndpoint(String endpoint) {
        return endpoint.endsWith(".amazonaws.com");
    }
}
