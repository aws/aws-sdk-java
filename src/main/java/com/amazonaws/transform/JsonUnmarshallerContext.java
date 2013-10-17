/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import com.amazonaws.http.HttpResponse;

public class JsonUnmarshallerContext {

    /** The current JsonToken that the private JsonParser is currently pointing to. **/
    public JsonToken currentToken;
    
    /** A cache of the next token if it has been peeked ahead. **/
    private JsonToken nextToken;
    
    private final JsonParser jsonParser;

    /**
     * A stack of JsonFieldTokenPair objects that indicates the current state of the context.
     * For example, if we have a JSON object:
     * { 
     *   A :
     *     { 
     *       B : [
     *         {
     *           C : {
     *             D : E
     *           }
     *         },
     *       ]
     *     }
     * }
     * When the parser points to "D", the state of this stack should be (from top to bottom):
     *  [ (C, START_OBJECT), (B, START_ARRAY), (A, START_OBJECT) ]
     */
    private final Stack<JsonFieldTokenPair> stack = new Stack<JsonFieldTokenPair>();

    /**
     * The name of the field that is currently being parsed. This value is
     * nulled out when the parser reaches into the object/array structure of the
     * corresponding value, and then it will be pushed into the stack after
     * wrapped into a JsonFieldTokenPair object with the START_OBJECT or
     * START_ARRAY token following it. 
     * So in the same example as shown above:
     *   (1) when the parser moves from "C" to "{", (currentField, START_OBJECT)
     *       will be pushed into the stack and currentField will be set null;
     *   (2) but when it moves from "{" to "C", nothing will be pushed into the 
     *       stack and only currentField will be updated from null to "D".
     */
    private String currentField;
    
    /**
     * This string is used to cache the parent element that was just parsed,
     * after it is removed from the stack.
     */
    private String lastParsedParentElement;

    private Map<String, String> metadata = new HashMap<String, String>();
    private List<MetadataExpression> metadataExpressions = new ArrayList<MetadataExpression>();

    private final HttpResponse httpResponse;


    public JsonUnmarshallerContext(JsonParser jsonParser) {
        this(jsonParser, null);
    }

    public JsonUnmarshallerContext(JsonParser jsonParser, HttpResponse httpResponse) {
        this.jsonParser = jsonParser;
        this.httpResponse = httpResponse;
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
        if (httpResponse == null) return null;

        return httpResponse.getHeaders().get(header);
    }

    public HttpResponse getHttpResponse() {
        return httpResponse;
    }

    /**
     * Returns the element depth of the parser's current position in the JSON
     * document being parsed.
     *
     * @return The element depth of the parser's current position in the JSON
     *         document being parsed.
     */
    public int getCurrentDepth() {
        int depth = stack.size();
        if (currentField != null) depth++;
        return depth;
    }

    /**
     * Returns the text of the current token, or throws an exception if
     * the current token does not contain text (ex: '{', '}', etc.).
     *
     * @return The text of the current token.
     *
     * @throws IOException
     */
    public String readText() throws IOException {
        switch (currentToken) {
        case VALUE_STRING:
            String text = jsonParser.getText();
            return text;
        case VALUE_FALSE: return "false";
        case VALUE_TRUE: return "true";
        case VALUE_NULL: return null;
        case VALUE_NUMBER_FLOAT:
        case VALUE_NUMBER_INT:
            return jsonParser.getNumberValue().toString();
        case FIELD_NAME:
            return jsonParser.getText();
        default:
            throw new RuntimeException(
                    "We expected a VALUE token but got: " + currentToken);
        }
    }

    public boolean isStartOfDocument() {
        return jsonParser == null || jsonParser.getCurrentToken() == null;
    }

    /**
     * Tests the specified expression (a JSON field name) against the current
     * position in the JSON document being parsed.
     * 
     * @param expression
     *            The field name to test.
     * @return True if the expression matches the current document position,
     *         otherwise false.
     */
    public boolean testExpression(String expression) {
        if (expression.equals(".")) {
            return true;
        } else {
            if (currentField != null) {
                return currentField.equals(expression);
            } else {
                return (!stack.isEmpty())
                        && stack.peek().getField().equals(expression);
            }
        }
    }

    /**
     * Returns the name of the JSON field that is the nearest parent of the
     * current context.
     */
    public String getCurrentParentElement() {
        String parentElement;
        if (currentField != null) {
            parentElement = currentField;
        } else if ( !stack.isEmpty() ) {
            parentElement = stack.peek().getField();
        } else {
            parentElement = "";
        }
        return parentElement;
    }

    /**
     * Tests the specified expression (a JSON field name) against the current
     * position in the JSON document being parsed, and restricts the expression
     * to matching at the specified stack depth.
     * 
     * @param expression
     *            The field name to test.
     * @param stackDepth
     *            The depth in the stack representing where the expression must
     *            start matching in order for this method to return true.
     * 
     * @return True if the specified expression matches the current position in
     *         the JSON document, starting from the specified depth.
     */
    public boolean testExpression(String expression, int stackDepth) {
        if (expression.equals(".")) {
            return true;
        } else {
            return testExpression(expression)
                    && stackDepth == getCurrentDepth();
        }
    }

    public JsonToken nextToken() throws IOException {
        // Use the value from the nextToken field if
        // we've already populated it to peek ahead.
        JsonToken token = (nextToken != null) ?
                nextToken : jsonParser.nextToken();

        this.currentToken = token;
        nextToken = null;

        updateContext();
        return token;
    }

    public JsonToken peek() throws IOException {
        if (nextToken != null) return nextToken;

        nextToken = jsonParser.nextToken();
        return nextToken;
    }

    public JsonParser getJsonParser() {
        return jsonParser;
    }

    /**
     * Returns any metadata collected through metadata expressions while this
     * context was reading the JSON events from the JSON document.
     *
     * @return A map of any metadata collected through metadata expressions
     *         while this context was reading the JSON document.
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
     *            The depth in the JSON document where the expression match must
     *            start.
     * @param storageKey
     *            The key under which to store the matching element's data.
     */
    public void registerMetadataExpression(String expression, int targetDepth,
            String storageKey) {
        metadataExpressions.add(new MetadataExpression(expression, targetDepth,
                storageKey));
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

    private void updateContext() throws IOException {
        lastParsedParentElement = null;
        if (currentToken == null) return;

        if (currentToken == START_OBJECT || currentToken == START_ARRAY) {
            if (currentField != null) {
                stack.push(new JsonFieldTokenPair(currentField, currentToken));
                currentField = null;
            }
        } else if (currentToken == END_OBJECT || currentToken == END_ARRAY) {
            if (!stack.isEmpty()) {
                boolean squareBracketsMatch = currentToken == END_ARRAY && stack.peek().getToken() == START_ARRAY;
                boolean curlyBracketsMatch = currentToken == END_OBJECT && stack.peek().getToken() == START_OBJECT;
                if (squareBracketsMatch || curlyBracketsMatch) {
                    lastParsedParentElement = stack.pop().getField();
                }
            }
            currentField = null;
        } else if (currentToken == FIELD_NAME) {
            String t = jsonParser.getText();
            currentField = t;
        }
    }

    @Override
    public String toString() {
        StringBuilder stackString = new StringBuilder();

        for (JsonFieldTokenPair jsonFieldTokenPair : stack) {
            stackString.append("/")
                       .append(jsonFieldTokenPair.getField());
        }

        if (currentField != null) {
            stackString.append("/")
                       .append(currentField);
        }

        return stackString.length() == 0 ? "/" : stackString.toString();
    }

    /**
     * This will return the deleted string in stackString when doing update on
     * the stack
     */
    public String getLastParsedParentElement() {
        return lastParsedParentElement;
    }

    /**
     * An immutable class used to indicate a JSON field value followed by a
     * subsequent JSON token. This inner class should only be used by the
     * private stack to indicate the current state of the context.
     */
    private static class JsonFieldTokenPair {
        private final String field;
        private final JsonToken jsonToken;
        
        /**
         * @param fieldString
         *            Not null.
         * @param token
         *            Not null.
         */
        public JsonFieldTokenPair(String fieldString, JsonToken token) {
            field = fieldString;
            jsonToken = token;
        }
        
        public String getField() {
            return field;
        }
        
        public JsonToken getToken() {
            return jsonToken;
        }
        
        public String toString() {
            return field + ": " + jsonToken.asString();
        }
    }
}
