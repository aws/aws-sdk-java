/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.transform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.XMLEvent;

/**
 * Contains the unmarshalling state for the parsing of an XML response. The
 * unmarshallers are stateless so that they can be reused, so this class holds
 * the state while different unmarshallers work together to parse an XML
 * response. It also tracks the current position and element depth of the
 * document being parsed and provides utilties for accessing the next XML event
 * from the parser, reading element text, handling attribute XML events, etc.
 */
public class StaxUnmarshallerContext {

    private XMLEvent currentEvent;
    private final XMLEventReader eventReader;

    public final Stack<String> stack = new Stack<String>();
    private String stackString = "";

    private Map<String, String> metadata = new HashMap<String, String>();
    private List<MetadataExpression> metadataExpressions = new ArrayList<MetadataExpression>();

    private Iterator<?> attributeIterator;
    private final Map<String, String> headers;

    private String currentHeader;

    public void setCurrentHeader(String currentHeader) {
        this.currentHeader = currentHeader;
    }

    public boolean isInsideResponseHeader() {
        return currentEvent == null;
    }

    /**
     * Constructs a new unmarshaller context using the specified source of XML events.
     *
     * @param eventReader
     *            The source of XML events for this unmarshalling context.
     */
    public StaxUnmarshallerContext(XMLEventReader eventReader) {
        this(eventReader, null);
    }

    /**
     * Constructs a new unmarshaller context using the specified source of XML
     * events, and a set of response headers.
     *
     * @param eventReader
     *            The source of XML events for this unmarshalling context.
     * @param headers
     *            The set of response headers associated with this unmarshaller
     *            context.
     */
    public StaxUnmarshallerContext(XMLEventReader eventReader, Map<String, String> headers) {
        this.eventReader = eventReader;
        this.headers = headers;
    }

    /**
     * Returns the value of the header with the specified name from the
     * response, or null if not present.
     *
     * @param header
     *            The name of the header to lookup.
     *
     * @return The value of the header with the specified name from the
     *         response, or null if not present.
     */
    public String getHeader(String header) {
        if (headers == null) return null;

        return headers.get(header);
    }

    /**
     * Returns the text contents of the current element being parsed.
     *
     * @return The text contents of the current element being parsed.
     * @throws XMLStreamException
     */
    public String readText() throws XMLStreamException {
        if (isInsideResponseHeader()) {
            return getHeader(currentHeader);
        }
        if (currentEvent.isAttribute()) {
            Attribute attribute = (Attribute)currentEvent;
            return attribute.getValue();
        }

        StringBuilder sb = new StringBuilder();
        while (true) {
            XMLEvent event = eventReader.peek();
            if (event.getEventType() == XMLStreamConstants.CHARACTERS) {
                eventReader.nextEvent();
                sb.append(event.asCharacters().getData());
            } else if (event.getEventType() == XMLStreamConstants.END_ELEMENT) {
                return sb.toString();
            } else {
                throw new RuntimeException("Encountered unexpected event: " + event.toString());
            }
        }
    }

    /**
     * Returns the element depth of the parser's current position in the XML
     * document being parsed.
     *
     * @return The element depth of the parser's current position in the XML
     *         document being parsed.
     */
    public int getCurrentDepth() {
        return stack.size();
    }

    /**
     * Tests the specified expression against the current position in the XML
     * document being parsed.
     *
     * @param expression
     *            The psuedo-xpath expression to test.
     * @return True if the expression matches the current document position,
     *         otherwise false.
     */
    public boolean testExpression(String expression) {
        if (expression.equals(".")) return true;
        return stackString.endsWith(expression);
    }

    /**
     * Tests the specified expression against the current position in the XML
     * document being parsed, and restricts the expression to matching at the
     * specified stack depth.
     *
     * @param expression
     *            The psuedo-xpath expression to test.
     * @param startingStackDepth
     *            The depth in the stack representing where the expression must
     *            start matching in order for this method to return true.
     *
     * @return True if the specified expression matches the current position in
     *         the XML document, starting from the specified depth.
     */
    public boolean testExpression(String expression, int startingStackDepth) {
        if (expression.equals(".")) return true;

        int index = -1;
        while ((index = expression.indexOf("/", index + 1)) > -1) {
            // Don't consider attributes a new depth level
            if (expression.charAt(index + 1) != '@') {
                startingStackDepth++;
            }
        }


        return (startingStackDepth == getCurrentDepth()
                && stackString.endsWith("/" + expression));
    }

    /**
     * Returns true if this unmarshaller context is at the very beginning of a
     * source document (i.e. no data has been parsed from the document yet).
     *
     * @return true if this unmarshaller context is at the very beginning of a
     *         source document (i.e. no data has been parsed from the document
     *         yet).
     */
    public boolean isStartOfDocument() throws XMLStreamException {
        return eventReader.peek().isStartDocument();
    }

    /**
     * Returns the next XML event for the document being parsed.
     *
     * @return The next XML event for the document being parsed.
     *
     * @throws XMLStreamException
     */
    public XMLEvent nextEvent() throws XMLStreamException {
        if (attributeIterator != null && attributeIterator.hasNext()) {
            currentEvent = (XMLEvent)attributeIterator.next();
        } else {
            currentEvent = eventReader.nextEvent();
        }

        if (currentEvent.isStartElement()) {
            attributeIterator = currentEvent.asStartElement().getAttributes();
        }

        updateContext(currentEvent);

        if (eventReader.hasNext()) {
            XMLEvent nextEvent = eventReader.peek();
            if (nextEvent != null && nextEvent.isCharacters()) {
                for (MetadataExpression metadataExpression : metadataExpressions) {
                    if (testExpression(metadataExpression.expression, metadataExpression.targetDepth)) {
                        metadata.put(metadataExpression.key, nextEvent.asCharacters().getData());
                    }
                }
            }
        }

        return currentEvent;
    }

    /**
     * Returns any metadata collected through metadata expressions while this
     * context was reading the XML events from the XML document.
     *
     * @return A map of any metadata collected through metadata expressions
     *         while this context was reading the XML document.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Registers an expression, which if matched, will cause the data for the
     * matching element to be stored in the metadata map under the specified
     * key.
     *
     * @param expression
     *            The expression an element must match in order for it's data to
     *            be pulled out and stored in the metadata map.
     * @param targetDepth
     *            The depth in the XML document where the expression match must
     *            start.
     * @param storageKey
     *            The key under which to store the matching element's data.
     */
    public void registerMetadataExpression(String expression, int targetDepth, String storageKey) {
        metadataExpressions.add(new MetadataExpression(expression, targetDepth, storageKey));
    }


    /*
     * Private Interface
     */

    /**
     * Simple container for the details of a metadata expression this
     * unmarshaller context is looking for.
     */
    private static class MetadataExpression {
        public String expression;
        public int targetDepth;
        public String key;

        public MetadataExpression(String expression, int targetDepth, String key) {
            this.expression = expression;
            this.targetDepth = targetDepth;
            this.key = key;
        }
    }

    private void updateContext(XMLEvent event) {
        if (event == null) return;

        if (event.isEndElement()) {
            stack.pop();
            stackString = "";
            for (String s : stack) {
                stackString += "/" + s;
            }
        } else if (event.isStartElement()) {
            stack.push(event.asStartElement().getName().getLocalPart());
            stackString += "/" + event.asStartElement().getName().getLocalPart();
        } else if (event.isAttribute()) {
            Attribute attribute = (Attribute)event;
            stackString = "";
            for (String s : stack) {
                stackString += "/" + s;
            }
            stackString += "/@" + attribute.getName().getLocalPart();
        }
    }

}
