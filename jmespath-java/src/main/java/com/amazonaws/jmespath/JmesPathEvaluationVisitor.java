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
import com.fasterxml.jackson.databind.node.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JmesPathEvaluationVisitor implements JmesPathVisitor<JsonNode, JsonNode> {

    /**
     * Evaluates a subexpression by evaluating the expression on
     * the left with the original JSON document and then evaluating
     * the expression on the right with the result of the left
     * expression evaluation.
     *
     * @param subExpression JmesPath subexpression type
     * @param input         Input json node against which evaluation is done
     * @return Result of the subexpression evaluation
     * @throws InvalidTypeException
     */
    @Override
    public JsonNode visit(JmesPathSubExpression subExpression, JsonNode input) throws InvalidTypeException {
        JsonNode prelimnaryResult = subExpression.getExpressions().get(0).accept(this, input);
        for (int i = 1; i < subExpression.getExpressions().size(); i++) {
            prelimnaryResult = subExpression.getExpressions().get(i).accept(this, prelimnaryResult);
        }
        return prelimnaryResult;
    }

    /**
     * Retrieves the value of the field node
     *
     * @param fieldNode JmesPath field type
     * @param input     Input json node whose value is
     *                  retrieved
     * @return Value of the input json node
     */
    @Override
    public JsonNode visit(JmesPathField fieldNode, JsonNode input) {
        if (input.isObject()) {
            //TODO : CamelCase will need to change at some point
            return input.get(CamelCaseUtils.toCamelCase(fieldNode.getValue()));
        }
        return NullNode.getInstance();
    }

    /**
     * Evaluates a list projection expression in two steps.
     * The left hand side (LHS) creates a JSON array of initial
     * values.
     * The right hand side (RHS) of a projection is the
     * expression to project for each element in the JSON array
     * created by the left hand side.
     *
     * @param jmesPathProjection JmesPath list projection type
     * @param input              Input json node against which evaluation is done
     * @return Result of the projection evaluation
     * @throws InvalidTypeException
     */
    @Override
    public JsonNode visit(JmesPathProjection jmesPathProjection, JsonNode input) throws InvalidTypeException {
        JsonNode lhsResult = jmesPathProjection.getLhsExpr().accept(this, input);
        if (lhsResult.isArray()) {
            Iterator<JsonNode> elements = lhsResult.elements();
            ArrayNode projectedArrayNode = ObjectMapperSingleton.getObjectMapper().createArrayNode();
            while (elements.hasNext()) {
                JsonNode projectedElement = jmesPathProjection.getProjectionExpr().accept(this, elements.next());
                if (projectedElement != null) {
                    projectedArrayNode.add(projectedElement);
                }
            }
            return projectedArrayNode;
        }
        return NullNode.getInstance();
    }

    /**
     * Flattens out the elements of the given expression into a
     * single list. It's evaluated as follows.
     * Create an empty result list.
     * Iterate over the elements of the current result.
     * If the current element is not a list, add to the end of
     * the result list.
     * If the current element is a list, add each element of the
     * current element to the end of the result list.
     * The result list is now the new current result.
     *
     * @param flatten JmesPath flatten type
     * @param input   Input json node against which evaluation is done
     * @return Result of the flatten evaluation
     * @throws InvalidTypeException
     */
    @Override
    public JsonNode visit(JmesPathFlatten flatten, JsonNode input) throws InvalidTypeException {
        JsonNode flattenResult = flatten.getFlattenExpr().accept(this, input);
        if (flattenResult.isArray()) {
            Iterator<JsonNode> elements = flattenResult.elements();
            ArrayNode flattenedArray = ObjectMapperSingleton.getObjectMapper().createArrayNode();
            while (elements.hasNext()) {
                JsonNode element = elements.next();
                if (element != null) {
                    if (element.isArray()) {
                        Iterator<JsonNode> inner = element.iterator();
                        while (inner.hasNext()) {
                            JsonNode innerElement = inner.next();
                            if (innerElement != null) {
                                flattenedArray.add(innerElement);
                            }
                        }
                    } else {
                        flattenedArray.add(element);
                    }
                }
            }
            return flattenedArray;
        }

        return NullNode.getInstance();
    }

    /**
     * Returns the input node itself
     *
     * @param jmesPathIdentity JmesPath identity type
     * @param input            Input json node
     * @return Input node
     */
    @Override
    public JsonNode visit(JmesPathIdentity jmesPathIdentity, JsonNode input) {
        return input;
    }

    /**
     * Evaluates the object projection expression.
     * This will create a list of the values of the JSON
     * object(lhs), and project the right hand side of the
     * projection onto the list of values.
     *
     * @param valueProjection JmesPath value projection type
     * @param input           Input json node against which evaluation is done
     * @return Result of the value projection evaluation
     * @throws InvalidTypeException
     */
    @Override
    public JsonNode visit(JmesPathValueProjection valueProjection, JsonNode input) throws InvalidTypeException {
        JsonNode projectedResult = valueProjection.getLhsExpr().accept(this, input);
        if (projectedResult.isObject()) {
            ArrayNode projectedArrayNode = ObjectMapperSingleton.getObjectMapper().createArrayNode();
            Iterator<JsonNode> elements = projectedResult.elements();
            while (elements.hasNext()) {
                JsonNode projectedElement = valueProjection.getRhsExpr().accept(this, elements.next());
                if (projectedElement != null) {
                    projectedArrayNode.add(projectedElement);
                }
            }
            return projectedArrayNode;
        }
        return NullNode.getInstance();
    }


    /**
     * Evaluates function expression in applicative order. Each
     * argument is an expression, each argument expression is
     * evaluated before evaluating the function. The function is
     * then called with the evaluated function arguments. The
     * result of the function-expression is the result returned
     * by the function call.
     *
     * @param function JmesPath function type
     * @param input    Input json node against which evaluation is done
     * @return Result of the function evaluation
     * @throws InvalidTypeException
     */
    @Override
    public JsonNode visit(JmesPathFunction function, JsonNode input) throws InvalidTypeException {
        List<JsonNode> evaluatedArguments = new ArrayList<JsonNode>();
        List<JmesPathExpression> arguments = function.getExpressions();
        for (JmesPathExpression arg : arguments) {
            evaluatedArguments.add(arg.accept(this, input));
        }
        return function.evaluate(evaluatedArguments);
    }

    /**
     * Retrieves the literal value
     *
     * @param literal JmesPath literal type
     * @param input   Input json node against which evaluation is done
     * @return Literal value
     */
    @Override
    public JsonNode visit(JmesPathLiteral literal, JsonNode input) {
        return literal.getValue();
    }

    /**
     * Evaluates a filter expression as follows.
     * For each element in an array evaluate the expression against
     * the element. If the expression evaluates to a truth-like value,
     * the item (in its entirety) is added to the result list. Otherwise
     * it is excluded from the result list. A filter expression is
     * only defined for a JSON array. Attempting to evaluate a filter
     * expression against any other type will return null.
     *
     * @param filter JmesPath filter type
     * @param input  Input json node against which evaluation is done
     * @return Result of the filter expression evaluation
     * @throws InvalidTypeException
     */
    @Override
    public JsonNode visit(JmesPathFilter filter, JsonNode input) throws InvalidTypeException {
        JsonNode filterExpression = filter.getLhsExpr().accept(this, input);
        if (filterExpression.isArray()) {
            Iterator<JsonNode> elements = filterExpression.elements();
            ArrayNode projectedArrayNode = ObjectMapperSingleton.getObjectMapper().createArrayNode();
            while (elements.hasNext()) {
                JsonNode element = elements.next();
                if (filter.getComparator().accept(this, element).equals(BooleanNode.TRUE)) {
                    JsonNode projectedElement = filter.getRhsExpr().accept(this, element);
                    if (projectedElement != null) {
                        projectedArrayNode.add(projectedElement);
                    }
                }
            }
            return projectedArrayNode;
        }
        return NullNode.getInstance();
    }

    /**
     * Evaluate the expressions as per the given comparison
     * operator.
     *
     * @param op    JmesPath comparison operator type
     * @param input Input json node against which evaluation is done
     * @return Result of the comparison
     */
    @Override
    public JsonNode visit(Comparator op, JsonNode input) {
        JsonNode lhsNode = op.getLhsExpr().accept(this, input);
        JsonNode rhsNode = op.getRhsExpr().accept(this, input);

        if (op.matches(lhsNode, rhsNode)) {
            return BooleanNode.TRUE;
        }
        return BooleanNode.FALSE;
    }

    /**
     * Not-expression negates the result of an expression. If the
     * expression results in a truth-like value, a not-expression will
     * change this value to false. If the expression results in a
     * false-like value, a not-expression will change this value to true.
     *
     * @param notExpression JmesPath not-expression type
     * @param input         Input json node against which evaluation is done
     * @return Negation of the evaluated expression
     * @throws InvalidTypeException
     */
    @Override
    public JsonNode visit(JmesPathNotExpression notExpression, JsonNode input) throws InvalidTypeException {
        JsonNode resultExpr = notExpression.getExpr().accept(this, input);
        if (resultExpr != BooleanNode.TRUE) {
            return BooleanNode.TRUE;
        }
        return BooleanNode.FALSE;
    }

    /**
     * And expression will evaluate to either the left expression or
     * the right expression. If the expression on the left hand side
     * is a truth-like value, then the value on the right hand side
     * is returned. Otherwise the result of the expression on the
     * left hand side is returned.
     *
     * @param andExpression JmesPath and-expression type
     * @param input         Input json node against which evaluation is done
     * @return Result of the and-expression evaluation
     * @throws InvalidTypeException
     */
    @Override
    public JsonNode visit(JmesPathAndExpression andExpression, JsonNode input) throws InvalidTypeException {
        JsonNode lhsNode = andExpression.getLhsExpr().accept(this, input);
        JsonNode rhsNode = andExpression.getRhsExpr().accept(this, input);
        if (lhsNode == BooleanNode.TRUE) {
            return rhsNode;
        } else {
            return lhsNode;
        }
    }

    /**
     * Each expression in the multiselect list will be evaluated
     * against the JSON document. Each returned element will be the
     * result of evaluating the expression. A multi-select-list with
     * N expressions will result in a list of length N. Given a
     * multiselect expression [expr-1,expr-2,...,expr-n], the evaluated
     * expression will return [evaluate(expr-1), evaluate(expr-2), ...,evaluate(expr-n)].
     *
     * @param multiSelectList JmesPath multiselect list type
     * @param input           Input json node against which evaluation is done
     * @return Result of the multiselect list evaluation
     * @throws InvalidTypeException
     */
    @Override
    public JsonNode visit(JmesPathMultiSelectList multiSelectList, JsonNode input) throws InvalidTypeException {
        List<JmesPathExpression> expressionsList = multiSelectList.getExpressions();
        ArrayNode evaluatedExprList = ObjectMapperSingleton.getObjectMapper().createArrayNode();
        for (JmesPathExpression expression : expressionsList) {
            evaluatedExprList.add(expression.accept(this, input));
        }
        return evaluatedExprList;
    }

}
