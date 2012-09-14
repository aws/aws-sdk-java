/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static org.codehaus.jackson.JsonToken.END_ARRAY;
import static org.codehaus.jackson.JsonToken.END_OBJECT;
import static org.codehaus.jackson.JsonToken.FIELD_NAME;
import static org.codehaus.jackson.JsonToken.START_ARRAY;
import static org.codehaus.jackson.JsonToken.START_OBJECT;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;

import com.amazonaws.http.HttpResponse;

public class JsonUnmarshallerContext {

	private final JsonParser jsonParser;

	private final Stack<String> stack = new Stack<String>();
	private String stackString = "";

	private String currentField;

	private Map<String, String> metadata = new HashMap<String, String>();
	private List<MetadataExpression> metadataExpressions = new ArrayList<MetadataExpression>();

    public JsonToken currentToken;
    private JsonToken nextToken;
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
	 * Tests the specified expression against the current position in the JSON
	 * document being parsed.
	 *
	 * @param expression
	 *            The psuedo-xpath expression to test.
	 * @return True if the expression matches the current document position,
	 *         otherwise false.
	 */
	public boolean testExpression(String expression) {
		if (expression.equals("."))
			return true;
		return stackString.endsWith(expression);
	}

	/**
	 * Tests the specified expression against the current position in the JSON
	 * document being parsed, and restricts the expression to matching at the
	 * specified stack depth.
	 *
	 * @param expression
	 *            The psuedo-xpath expression to test.
	 * @param stackDepth
	 *            The depth in the stack representing where the expression must
	 *            start matching in order for this method to return true.
	 *
	 * @return True if the specified expression matches the current position in
	 *         the JSON document, starting from the specified depth.
	 */
	public boolean testExpression(String expression, int stackDepth) {
		if (expression.equals(".")) return true;

		int index = -1;
		while ((index = expression.indexOf("/", index + 1)) > -1) {
			// Don't consider attributes a new depth level
			if (expression.charAt(index + 1) != '@') {
				stackDepth++;
			}
		}

		return stackString.endsWith("/" + expression) &&
		       stackDepth == getCurrentDepth();
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
	private class MetadataExpression {
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
		if (currentToken == null) return;

		if (currentToken == START_OBJECT || currentToken == START_ARRAY) {
			if (currentField != null) {
				stack.push(currentField);
				currentField = null;
			}
        } else if (currentToken == END_OBJECT || currentToken == END_ARRAY) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
            currentField = null;
		} else if (currentToken == FIELD_NAME) {
			String t = jsonParser.getText();
			currentField = t;
		}

		rebuildStackString();
	}

	@Override
	public String toString() {
		return stackString;
	}

	private void rebuildStackString() {
	    stackString = "";

		for (String s : stack) {
			stackString += "/" + s;
		}

		if (currentField != null) {
			stackString += "/" + currentField;
		}

		if (stackString == "") stackString = "/";
	}
}
