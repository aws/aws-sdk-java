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

import java.util.List;

/**
 * Abstract class definition for function expressions that are
 * used to transform and filter data in powerful ways.
 */
public abstract class JmesPathFunction implements JmesPathExpression {

    /**
     * Represents a list of expressions
     */
    private final List<JmesPathExpression> expressions;

    public JmesPathFunction(List<JmesPathExpression> expressions) {
        this.expressions = expressions;
    }

    public List<JmesPathExpression> getExpressions() {
        return expressions;
    }

    /**
     * Delegates to either the CodeGen visitor(JmesPathFunction) or
     * Evaluation visitor(JmesPathFunction) based on the type of JmesPath
     * visitor
     *
     * @param visitor  CodeGen visitor or Evaluation visitor
     * @param input    Input expression that needs to be evaluated
     * @param <Input>  Input type for the visitor
     *                 CodeGen visitor: Void
     *                 Evaluation visitor: JsonNode
     * @param <Output> Output type for the visitor
     *                 CodeGen visitor: String
     *                 Evaluation visitor: JsonNode
     * @return Corresponding output is returned. Evaluated String
     * in the case of CodeGen visitor or an evaluated JsonNode
     * in the case of Evaluation visitor
     * @throws InvalidTypeException
     */
    @Override
    public <Input, Output> Output accept(JmesPathVisitor<Input, Output> visitor, Input input) throws InvalidTypeException {
        return visitor.visit(this, input);
    }

    /**
     * Abstract method definition for evaluating the given list of
     * expressions as per the given type of function
     *
     * @param evaluatedArgs List of expressions to be evaluated
     * @return Result of the evaluation of the
     * corresponding function
     */
    public abstract JsonNode evaluate(List<JsonNode> evaluatedArgs);
}
