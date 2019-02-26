/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a constraint on task placement in the task definition.
 * </p>
 * <p>
 * If you are using the Fargate launch type, task placement constraints are not supported.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html">Task Placement
 * Constraints</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/TaskDefinitionPlacementConstraint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskDefinitionPlacementConstraint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of constraint. The <code>DistinctInstance</code> constraint ensures that each task in a particular group
     * is running on a different container instance. The <code>MemberOf</code> constraint restricts selection to be from
     * a group of valid candidates.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A cluster query language expression to apply to the constraint. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String expression;

    /**
     * <p>
     * The type of constraint. The <code>DistinctInstance</code> constraint ensures that each task in a particular group
     * is running on a different container instance. The <code>MemberOf</code> constraint restricts selection to be from
     * a group of valid candidates.
     * </p>
     * 
     * @param type
     *        The type of constraint. The <code>DistinctInstance</code> constraint ensures that each task in a
     *        particular group is running on a different container instance. The <code>MemberOf</code> constraint
     *        restricts selection to be from a group of valid candidates.
     * @see TaskDefinitionPlacementConstraintType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of constraint. The <code>DistinctInstance</code> constraint ensures that each task in a particular group
     * is running on a different container instance. The <code>MemberOf</code> constraint restricts selection to be from
     * a group of valid candidates.
     * </p>
     * 
     * @return The type of constraint. The <code>DistinctInstance</code> constraint ensures that each task in a
     *         particular group is running on a different container instance. The <code>MemberOf</code> constraint
     *         restricts selection to be from a group of valid candidates.
     * @see TaskDefinitionPlacementConstraintType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of constraint. The <code>DistinctInstance</code> constraint ensures that each task in a particular group
     * is running on a different container instance. The <code>MemberOf</code> constraint restricts selection to be from
     * a group of valid candidates.
     * </p>
     * 
     * @param type
     *        The type of constraint. The <code>DistinctInstance</code> constraint ensures that each task in a
     *        particular group is running on a different container instance. The <code>MemberOf</code> constraint
     *        restricts selection to be from a group of valid candidates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskDefinitionPlacementConstraintType
     */

    public TaskDefinitionPlacementConstraint withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of constraint. The <code>DistinctInstance</code> constraint ensures that each task in a particular group
     * is running on a different container instance. The <code>MemberOf</code> constraint restricts selection to be from
     * a group of valid candidates.
     * </p>
     * 
     * @param type
     *        The type of constraint. The <code>DistinctInstance</code> constraint ensures that each task in a
     *        particular group is running on a different container instance. The <code>MemberOf</code> constraint
     *        restricts selection to be from a group of valid candidates.
     * @see TaskDefinitionPlacementConstraintType
     */

    public void setType(TaskDefinitionPlacementConstraintType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of constraint. The <code>DistinctInstance</code> constraint ensures that each task in a particular group
     * is running on a different container instance. The <code>MemberOf</code> constraint restricts selection to be from
     * a group of valid candidates.
     * </p>
     * 
     * @param type
     *        The type of constraint. The <code>DistinctInstance</code> constraint ensures that each task in a
     *        particular group is running on a different container instance. The <code>MemberOf</code> constraint
     *        restricts selection to be from a group of valid candidates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskDefinitionPlacementConstraintType
     */

    public TaskDefinitionPlacementConstraint withType(TaskDefinitionPlacementConstraintType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param expression
     *        A cluster query language expression to apply to the constraint. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster
     *        Query Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return A cluster query language expression to apply to the constraint. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster
     *         Query Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param expression
     *        A cluster query language expression to apply to the constraint. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster
     *        Query Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinitionPlacementConstraint withExpression(String expression) {
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

        if (obj instanceof TaskDefinitionPlacementConstraint == false)
            return false;
        TaskDefinitionPlacementConstraint other = (TaskDefinitionPlacementConstraint) obj;
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
    public TaskDefinitionPlacementConstraint clone() {
        try {
            return (TaskDefinitionPlacementConstraint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.TaskDefinitionPlacementConstraintMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
