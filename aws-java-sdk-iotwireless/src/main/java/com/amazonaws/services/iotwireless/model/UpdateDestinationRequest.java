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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The new name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of value in <code>Expression</code>.
     * </p>
     */
    private String expressionType;
    /**
     * <p>
     * The new rule name or topic rule to send messages to.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * A new description of the resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the IAM Role that authorizes the destination.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The new name of the resource.
     * </p>
     * 
     * @param name
     *        The new name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name of the resource.
     * </p>
     * 
     * @return The new name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name of the resource.
     * </p>
     * 
     * @param name
     *        The new name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDestinationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of value in <code>Expression</code>.
     * </p>
     * 
     * @param expressionType
     *        The type of value in <code>Expression</code>.
     * @see ExpressionType
     */

    public void setExpressionType(String expressionType) {
        this.expressionType = expressionType;
    }

    /**
     * <p>
     * The type of value in <code>Expression</code>.
     * </p>
     * 
     * @return The type of value in <code>Expression</code>.
     * @see ExpressionType
     */

    public String getExpressionType() {
        return this.expressionType;
    }

    /**
     * <p>
     * The type of value in <code>Expression</code>.
     * </p>
     * 
     * @param expressionType
     *        The type of value in <code>Expression</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpressionType
     */

    public UpdateDestinationRequest withExpressionType(String expressionType) {
        setExpressionType(expressionType);
        return this;
    }

    /**
     * <p>
     * The type of value in <code>Expression</code>.
     * </p>
     * 
     * @param expressionType
     *        The type of value in <code>Expression</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpressionType
     */

    public UpdateDestinationRequest withExpressionType(ExpressionType expressionType) {
        this.expressionType = expressionType.toString();
        return this;
    }

    /**
     * <p>
     * The new rule name or topic rule to send messages to.
     * </p>
     * 
     * @param expression
     *        The new rule name or topic rule to send messages to.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The new rule name or topic rule to send messages to.
     * </p>
     * 
     * @return The new rule name or topic rule to send messages to.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The new rule name or topic rule to send messages to.
     * </p>
     * 
     * @param expression
     *        The new rule name or topic rule to send messages to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDestinationRequest withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * A new description of the resource.
     * </p>
     * 
     * @param description
     *        A new description of the resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description of the resource.
     * </p>
     * 
     * @return A new description of the resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description of the resource.
     * </p>
     * 
     * @param description
     *        A new description of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDestinationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM Role that authorizes the destination.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM Role that authorizes the destination.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM Role that authorizes the destination.
     * </p>
     * 
     * @return The ARN of the IAM Role that authorizes the destination.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM Role that authorizes the destination.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM Role that authorizes the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDestinationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getExpressionType() != null)
            sb.append("ExpressionType: ").append(getExpressionType()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDestinationRequest == false)
            return false;
        UpdateDestinationRequest other = (UpdateDestinationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getExpressionType() == null ^ this.getExpressionType() == null)
            return false;
        if (other.getExpressionType() != null && other.getExpressionType().equals(this.getExpressionType()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getExpressionType() == null) ? 0 : getExpressionType().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDestinationRequest clone() {
        return (UpdateDestinationRequest) super.clone();
    }

}
