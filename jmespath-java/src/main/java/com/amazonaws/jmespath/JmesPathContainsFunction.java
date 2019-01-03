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

package com.amazonaws.jmespath;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.BooleanNode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Implements the contains function that checks if the given
 * array or string contains the given element
 */
public class JmesPathContainsFunction extends JmesPathFunction{

    public JmesPathContainsFunction(JmesPathExpression... expressions) {
        this(Arrays.asList(expressions));
    }

    /**
     * Constructs a new JmesPathContainsFunction with the given
     * list of expressions to be evaluated
     *
     * @param expressions List of expressions
     */
    public JmesPathContainsFunction(List<JmesPathExpression> expressions) {
        super(expressions);
    }

    /**
     * Retrieves the subject(lhs expression) which could be an array
     * or string, the search(rhs expression) which could be any JmesPath
     * expression. If subject is an array, this function returns true if
     * one of the elements in the array is equal to the provided search
     * value. If the provided subject is a string, this function returns
     * true if the string contains the provided search argument.
     *
     * @param evaluatedArgs List of input expressions
     * @return True subject contains search;
     * False otherwise
     */
    @Override
    public JsonNode evaluate(List<JsonNode> evaluatedArgs) {
        JsonNode subject = evaluatedArgs.get(0);
        JsonNode search = evaluatedArgs.get(1);
        if (subject.isArray()) {
            return doesArrayContain(subject, search);
        } else if (subject.isTextual()) {
            return doesStringContain(subject, search);
        }

        throw new InvalidTypeException("Type mismatch. Expecting a string or an array.");
    }

    /**
     * If subject is an array, this function returns true if
     * one of the elements in the array is equal to the provided search
     * value.
     *
     * @param subject Array
     * @param search  JmesPath expression
     * @return True array contains search;
     * False otherwise
     */
    private static BooleanNode doesArrayContain(JsonNode subject, JsonNode search) {
        Iterator<JsonNode> elements = subject.elements();
        while (elements.hasNext()) {
            if (elements.next().equals(search)) {
                return BooleanNode.TRUE;
            }
        }
        return BooleanNode.FALSE;
    }

    /**
     * If the provided subject is a string, this function returns
     * true if the string contains the provided search argument.
     *
     * @param subject String
     * @param search  JmesPath expression
     * @return True string contains search;
     * False otherwise
     */
    private static BooleanNode doesStringContain(JsonNode subject, JsonNode search) {
        if (subject.asText().contains(search.asText())) {
            return BooleanNode.TRUE;
        }
        return BooleanNode.FALSE;
    }
}
