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
import com.fasterxml.jackson.databind.node.IntNode;

import java.util.Arrays;
import java.util.List;

/**
 * Class definition for length function that determines
 * the length of the given argument
 */
public class JmesPathLengthFunction extends JmesPathFunction {

    public JmesPathLengthFunction(JmesPathExpression... expressions) {
        this(Arrays.asList(expressions));
    }

    /**
     * Constructs a new JmesPathContainsFunction with the given
     * list of arguments to be evaluated
     *
     * @param arguments List of arguments
     */
    public JmesPathLengthFunction(List<JmesPathExpression> arguments) {
        super(arguments);
    }

    /**
     * Evaluates the length of the given argument.
     *
     * @param evaluatedArgs List of expressions to be evaluated.
     *                      Can be a string, array or object
     * @return Length of the argument
     */
    @Override
    public JsonNode evaluate(List<JsonNode> evaluatedArgs) throws InvalidTypeException {
        JsonNode arg = evaluatedArgs.get(0);
        if (arg.isTextual()) {
            return getStringLength(arg);
        } else if (arg.isArray() || arg.isObject()) {
            return new IntNode(arg.size());
        }
        throw new InvalidTypeException("Type mismatch. Expecting a string or an array or an object.");
    }

    /**
     * Evaluates the length of the string
     *
     * @param arg String argument
     * @return Length of the string
     */
    private static IntNode getStringLength(JsonNode arg) {
        return new IntNode(arg.asText().length());
    }
}
