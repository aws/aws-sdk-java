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

package com.amazonaws.codegen;

import com.amazonaws.jmespath.Comparator;
import com.amazonaws.jmespath.InvalidTypeException;
import com.amazonaws.jmespath.JmesPathAndExpression;
import com.amazonaws.jmespath.JmesPathField;
import com.amazonaws.jmespath.JmesPathFilter;
import com.amazonaws.jmespath.JmesPathFlatten;
import com.amazonaws.jmespath.JmesPathFunction;
import com.amazonaws.jmespath.JmesPathIdentity;
import com.amazonaws.jmespath.JmesPathLiteral;
import com.amazonaws.jmespath.JmesPathMultiSelectList;
import com.amazonaws.jmespath.JmesPathNotExpression;
import com.amazonaws.jmespath.JmesPathProjection;
import com.amazonaws.jmespath.JmesPathSubExpression;
import com.amazonaws.jmespath.JmesPathValueProjection;
import com.amazonaws.jmespath.JmesPathVisitor;

import org.apache.commons.lang3.StringEscapeUtils;

import java.util.stream.Collectors;

public class JmesPathCodeGenVisitor implements JmesPathVisitor<Void, String> {

    /**
     * Generates the code for a new JmesPathSubExpression.
     *
     * @param subExpression JmesPath subexpression type
     * @param aVoid         void
     * @return String that represents a call to
     * the new subexpression
     * @throws InvalidTypeException
     */
    @Override
    public String visit(final JmesPathSubExpression subExpression, final Void aVoid)
            throws InvalidTypeException {
        final String prefix = "new JmesPathSubExpression( ";
        return subExpression.getExpressions().stream()
                .map(a -> a.accept(this, aVoid))
                .collect(Collectors.joining(",", prefix, ")"));
    }

    /**
     * Generates the code for a new JmesPathField.
     *
     * @param fieldNode JmesPath field type
     * @param aVoid     void
     * @return String that represents a call to
     * the new fieldNode
     */
    @Override
    public String visit(final JmesPathField fieldNode, final Void aVoid) {
        return "new JmesPathField( \"" + fieldNode.getValue() + "\")";
    }

    /**
     * Generates the code for a new JmesPathProjection.
     *
     * @param jmesPathProjection JmesPath projection type
     * @param aVoid              void
     * @return String that represents a call to
     * the new list projection
     * @throws InvalidTypeException
     */
    @Override
    public String visit(final JmesPathProjection jmesPathProjection,
                        final Void aVoid) throws InvalidTypeException {
        return "new JmesPathProjection( " + jmesPathProjection.getLhsExpr()
                .accept(this, aVoid) + ", " + jmesPathProjection.getProjectionExpr()
                .accept(this, aVoid) + ")";
    }

    /**
     * Generates the code for a new JmesPathFlatten.
     *
     * @param flatten JmesPath flatten type
     * @param aVoid   void
     * @return String that represents a call to
     * the new flatten projection
     * @throws InvalidTypeException
     */
    @Override
    public String visit(final JmesPathFlatten flatten, final Void aVoid)
            throws InvalidTypeException {
        return "new JmesPathFlatten( " + flatten.getFlattenExpr()
                .accept(this, aVoid) + ")";
    }

    /**
     * Generates the code for a new JmesPathIdentity.
     *
     * @param jmesPathIdentity JmesPath identity type
     * @param aVoid            void
     * @return String that represents a call to
     * the new identity expression
     */
    @Override
    public String visit(final JmesPathIdentity jmesPathIdentity,
                        final Void aVoid) {
        return "new JmesPathIdentity()";
    }

    /**
     * Generates the code for a new JmesPathValueProjection.
     *
     * @param valueProjection JmesPath value projection type
     * @param aVoid           void
     * @return String that represents a call to
     * the new value projection
     * @throws InvalidTypeException
     */
    @Override
    public String visit(final JmesPathValueProjection valueProjection,
                        final Void aVoid) throws InvalidTypeException {
        return "new JmesPathValueProjection( " + valueProjection.getLhsExpr()
                .accept(this, aVoid) + ", " + valueProjection.getRhsExpr()
                .accept(this, aVoid) + ")";
    }

    /**
     * Generates the code for a new JmesPathLiteral.
     *
     * @param literal JmesPath literal type
     * @param aVoid   void
     * @return String that represents a call to
     * the new literal expression
     */
    @Override
    public String visit(final JmesPathLiteral literal, final Void aVoid) {
        return "new JmesPathLiteral(\"" + StringEscapeUtils
                .escapeJava(literal.getValue().toString()) + "\")";

    }

    /**
     * Generates the code for a new JmesPathFilter.
     *
     * @param filter JmesPath filter type
     * @param aVoid  void
     * @return String that represents a call to
     * the new filter expression
     * @throws InvalidTypeException
     */
    @Override
    public String visit(final JmesPathFilter filter,
                        final Void aVoid) throws InvalidTypeException {
        return "new JmesPathFilter( " + filter.getLhsExpr().accept(this, aVoid)
                + ", " + filter.getRhsExpr().accept(this, aVoid) + ", "
                + filter.getComparator().accept(this, aVoid) + ")";
    }

    /**
     * Generates the code for a new JmesPathFunction.
     *
     * @param function JmesPath function type
     * @param aVoid    void
     * @return String that represents a call to
     * the new function expression
     * @throws InvalidTypeException
     */
    @Override
    public String visit(final JmesPathFunction function,
                        final Void aVoid) throws InvalidTypeException {
        final String prefix = "new " + function.getClass()
                .getSimpleName() + "( ";
        return function.getExpressions().stream()
                .map(a -> a.accept(this, aVoid))
                .collect(Collectors.joining(",", prefix, ")"));
    }

    /**
     * Generates the code for a new Comparator.
     *
     * @param op    JmesPath comparison operator type
     * @param aVoid void
     * @return String that represents a call to
     * the new comparator expression
     * @throws InvalidTypeException
     */
    @Override
    public String visit(final Comparator op, final Void aVoid)
            throws InvalidTypeException {
        String lhs = op.getLhsExpr().accept(this, aVoid);
        String rhs = op.getRhsExpr().accept(this, aVoid);

        return String.format("new %s(%s, %s)", op.getClass()
                .getSimpleName(), lhs, rhs);
    }

    /**
     * Generates the code for a new JmesPathNotExpression.
     *
     * @param notExpression JmesPath not-expression type
     * @param aVoid         void
     * @return String that represents a call to
     * the new not-expression
     * @throws InvalidTypeException
     */
    @Override
    public String visit(final JmesPathNotExpression notExpression,
                        final Void aVoid) throws InvalidTypeException {
        return "new JmesPathNotExpression( " + notExpression.getExpr()
                .accept(this, aVoid) + " )";
    }

    /**
     * Generates the code for a new JmesPathAndExpression.
     *
     * @param andExpression JmesPath and-expression type
     * @param aVoid         void
     * @return String that represents a call to
     * the new and-expression
     * @throws InvalidTypeException
     */
    @Override
    public String visit(final JmesPathAndExpression andExpression,
                        final Void aVoid) throws InvalidTypeException {
        return "new JmesPathAndExpression( " + andExpression.getLhsExpr()
                .accept(this, aVoid) + ", " + andExpression.getRhsExpr()
                .accept(this, aVoid) + " )";
    }

    /**
     * Generates the code for a new JmesPathMultiSelectList.
     *
     * @param multiSelectList JmesPath multiSelectList type
     * @param aVoid           void
     * @return String that represents a call to
     * the new multiSelectList
     * @throws InvalidTypeException
     */
    @Override
    public String visit(final JmesPathMultiSelectList multiSelectList,
                        final Void aVoid) throws InvalidTypeException {
        final String prefix = "new JmesPathMultiSelectList( ";
        return multiSelectList.getExpressions().stream()
                .map(a -> a.accept(this, aVoid))
                .collect(Collectors.joining(",", prefix, ")"));
    }
}
