/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A placement constraint for the tasks in the service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsServicePlacementConstraintsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsServicePlacementConstraintsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     * constraint type is <code>distinctInstance</code>.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The type of constraint. Use <code>distinctInstance</code> to run each task in a particular group on a different
     * container instance. Use <code>memberOf</code> to restrict the selection to a group of valid candidates.
     * </p>
     * <p>
     * Valid values: <code>distinctInstance</code> | <code>memberOf</code>
     * </p>
     */
    private String type;

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     * constraint type is <code>distinctInstance</code>.
     * </p>
     * 
     * @param expression
     *        A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     *        constraint type is <code>distinctInstance</code>.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     * constraint type is <code>distinctInstance</code>.
     * </p>
     * 
     * @return A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     *         constraint type is <code>distinctInstance</code>.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     * constraint type is <code>distinctInstance</code>.
     * </p>
     * 
     * @param expression
     *        A cluster query language expression to apply to the constraint. You cannot specify an expression if the
     *        constraint type is <code>distinctInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServicePlacementConstraintsDetails withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The type of constraint. Use <code>distinctInstance</code> to run each task in a particular group on a different
     * container instance. Use <code>memberOf</code> to restrict the selection to a group of valid candidates.
     * </p>
     * <p>
     * Valid values: <code>distinctInstance</code> | <code>memberOf</code>
     * </p>
     * 
     * @param type
     *        The type of constraint. Use <code>distinctInstance</code> to run each task in a particular group on a
     *        different container instance. Use <code>memberOf</code> to restrict the selection to a group of valid
     *        candidates.</p>
     *        <p>
     *        Valid values: <code>distinctInstance</code> | <code>memberOf</code>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of constraint. Use <code>distinctInstance</code> to run each task in a particular group on a different
     * container instance. Use <code>memberOf</code> to restrict the selection to a group of valid candidates.
     * </p>
     * <p>
     * Valid values: <code>distinctInstance</code> | <code>memberOf</code>
     * </p>
     * 
     * @return The type of constraint. Use <code>distinctInstance</code> to run each task in a particular group on a
     *         different container instance. Use <code>memberOf</code> to restrict the selection to a group of valid
     *         candidates.</p>
     *         <p>
     *         Valid values: <code>distinctInstance</code> | <code>memberOf</code>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of constraint. Use <code>distinctInstance</code> to run each task in a particular group on a different
     * container instance. Use <code>memberOf</code> to restrict the selection to a group of valid candidates.
     * </p>
     * <p>
     * Valid values: <code>distinctInstance</code> | <code>memberOf</code>
     * </p>
     * 
     * @param type
     *        The type of constraint. Use <code>distinctInstance</code> to run each task in a particular group on a
     *        different container instance. Use <code>memberOf</code> to restrict the selection to a group of valid
     *        candidates.</p>
     *        <p>
     *        Valid values: <code>distinctInstance</code> | <code>memberOf</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServicePlacementConstraintsDetails withType(String type) {
        setType(type);
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
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsServicePlacementConstraintsDetails == false)
            return false;
        AwsEcsServicePlacementConstraintsDetails other = (AwsEcsServicePlacementConstraintsDetails) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsServicePlacementConstraintsDetails clone() {
        try {
            return (AwsEcsServicePlacementConstraintsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsServicePlacementConstraintsDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
