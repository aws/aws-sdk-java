/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Iterator;
import java.util.Stack;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.XMLEvent;

import com.amazonaws.ResponseMetadata;

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

    private final ResponseMetadata<?> responseMetadata;
    private Iterator<?> attributeIterator;

    public StaxUnmarshallerContext(XMLEventReader eventReader, ResponseMetadata<?> responseMetadata) {
        this.eventReader = eventReader;
        this.responseMetadata = responseMetadata;
    }

    /**
     * Returns the text contents of the current element being parsed.
     *
     * @return The text contents of the current element being parsed.
     * @throws XMLStreamException
     */
    public String readText() throws XMLStreamException {
        if (currentEvent.isAttribute()) {
            Attribute attribute = (Attribute)currentEvent;
            return attribute.getValue();
        }

        XMLEvent event = eventReader.peek();

        if (event.getEventType() == XMLStreamConstants.CHARACTERS) {
            eventReader.nextEvent();
            return event.asCharacters().getData();
        } else if (event.getEventType() == XMLStreamConstants.END_ELEMENT) {
            return "";
        } else {
            throw new RuntimeException("Encountered unexpected event: " + event.toString());
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
                && stackString.endsWith(expression));
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

        if (testExpression("ResponseMetadata/RequestId", 2)
            || testExpression("requestId", 2)) {
            XMLEvent nextEvent = eventReader.peek();
            if (nextEvent.isCharacters()) {
                responseMetadata.setRequestId(nextEvent.asCharacters().getData());
            }
        }

        return currentEvent;
    }

    /*
     * Private Interface
     */

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