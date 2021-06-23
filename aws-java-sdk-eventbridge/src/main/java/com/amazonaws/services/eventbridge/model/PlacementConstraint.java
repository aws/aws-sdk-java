/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a constraint on task placement. To learn more, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html">Task Placement
 * Constraints</a> in the Amazon Elastic Container Service Developer Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PlacementConstraint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlacementConstraint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of constraint. Use distinctInstance to ensure that each task in a particular group is running on a
     * different container instance. Use memberOf to restrict the selection to a group of valid candidates.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     * constraint type is <code>distinctInstance</code>. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     */
    private String expression;

    /**
     * <p>
     * The type of constraint. Use distinctInstance to ensure that each task in a particular group is running on a
     * different container instance. Use memberOf to restrict the selection to a group of valid candidates.
     * </p>
     * 
     * @param type
     *        The type of constraint. Use distinctInstance to ensure that each task in a particular group is running on
     *        a different container instance. Use memberOf to restrict the selection to a group of valid candidates.
     * @see PlacementConstraintType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of constraint. Use distinctInstance to ensure that each task in a particular group is running on a
     * different container instance. Use memberOf to restrict the selection to a group of valid candidates.
     * </p>
     * 
     * @return The type of constraint. Use distinctInstance to ensure that each task in a particular group is running on
     *         a different container instance. Use memberOf to restrict the selection to a group of valid candidates.
     * @see PlacementConstraintType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of constraint. Use distinctInstance to ensure that each task in a particular group is running on a
     * different container instance. Use memberOf to restrict the selection to a group of valid candidates.
     * </p>
     * 
     * @param type
     *        The type of constraint. Use distinctInstance to ensure that each task in a particular group is running on
     *        a different container instance. Use memberOf to restrict the selection to a group of valid candidates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementConstraintType
     */

    public PlacementConstraint withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of constraint. Use distinctInstance to ensure that each task in a particular group is running on a
     * different container instance. Use memberOf to restrict the selection to a group of valid candidates.
     * </p>
     * 
     * @param type
     *        The type of constraint. Use distinctInstance to ensure that each task in a particular group is running on
     *        a different container instance. Use memberOf to restrict the selection to a group of valid candidates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementConstraintType
     */

    public PlacementConstraint withType(PlacementConstraintType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     * constraint type is <code>distinctInstance</code>. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     * 
     * @param expression
     *        A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     *        constraint type is <code>distinctInstance</code>. To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster
     *        Query Language</a> in the Amazon Elastic Container Service Developer Guide.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     * constraint type is <code>distinctInstance</code>. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     * 
     * @return A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     *         constraint type is <code>distinctInstance</code>. To learn more, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster
     *         Query Language</a> in the Amazon Elastic Container Service Developer Guide.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     * constraint type is <code>distinctInstance</code>. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     * 
     * @param expression
     *        A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     *        constraint type is <code>distinctInstance</code>. To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster
     *        Query Language</a> in the Amazon Elastic Container Service Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementConstraint withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlacementConstraint == false)
            return false;
        PlacementConstraint other = (PlacementConstraint) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return hashCode;
    }

    @Override
    public PlacementConstraint clone() {
        try {
            return (PlacementConstraint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.PlacementConstraintMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
