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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A placement constraint object to use for tasks.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionPlacementConstraintsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionPlacementConstraintsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A cluster query language expression to apply to the constraint.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The type of constraint.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A cluster query language expression to apply to the constraint.
     * </p>
     * 
     * @param expression
     *        A cluster query language expression to apply to the constraint.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint.
     * </p>
     * 
     * @return A cluster query language expression to apply to the constraint.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint.
     * </p>
     * 
     * @param expression
     *        A cluster query language expression to apply to the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionPlacementConstraintsDetails withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * 
     * @param type
     *        The type of constraint.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * 
     * @return The type of constraint.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * 
     * @param type
     *        The type of constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionPlacementConstraintsDetails withType(String type) {
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

        if (obj instanceof AwsEcsTaskDefinitionPlacementConstraintsDetails == false)
            return false;
        AwsEcsTaskDefinitionPlacementConstraintsDetails other = (AwsEcsTaskDefinitionPlacementConstraintsDetails) obj;
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
    public AwsEcsTaskDefinitionPlacementConstraintsDetails clone() {
        try {
            return (AwsEcsTaskDefinitionPlacementConstraintsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionPlacementConstraintsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
