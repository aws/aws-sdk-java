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

/**
 * Visitor interface for delegating the Jmespath expression to its
 * corresponding type for evaluation
 *
 * @param <Input>  Input type for the visitor
 *                 CodeGen visitor: Void
 *                 Evaluation visitor: JsonNode
 * @param <Output> Output type for the visitor
 *                 CodeGen visitor: String
 *                 Evaluation visitor: JsonNode
 */
public interface JmesPathVisitor<Input, Output> {

    Output visit(JmesPathSubExpression subExpression, Input input) throws InvalidTypeException;

    Output visit(JmesPathField fieldNode, Input input);

    Output visit(JmesPathProjection jmesPathProjection, Input input) throws InvalidTypeException;

    Output visit(JmesPathFlatten flatten, Input input) throws InvalidTypeException;

    Output visit(JmesPathIdentity jmesPathIdentity, Input input);

    Output visit(JmesPathValueProjection valueProjection, Input input) throws InvalidTypeException;

    Output visit(JmesPathFunction function, Input input) throws InvalidTypeException;

    Output visit(JmesPathLiteral literal, Input input);

    Output visit(JmesPathFilter filter, Input input) throws InvalidTypeException;

    Output visit(Comparator op, Input input) throws InvalidTypeException;

    Output visit(JmesPathNotExpression expression, Input input) throws InvalidTypeException;

    Output visit(JmesPathAndExpression expression, Input input) throws InvalidTypeException;

    Output visit(JmesPathMultiSelectList multiSelectList, Input input) throws InvalidTypeException;
}
