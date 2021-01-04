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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDestinationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The rule name or topic rule to send messages to.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The type of value in <code>Expression</code>.
     * </p>
     */
    private String expressionType;
    /**
     * <p>
     * The description of the resource.
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
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDestinationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDestinationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The rule name or topic rule to send messages to.
     * </p>
     * 
     * @param expression
     *        The rule name or topic rule to send messages to.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The rule name or topic rule to send messages to.
     * </p>
     * 
     * @return The rule name or topic rule to send messages to.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The rule name or topic rule to send messages to.
     * </p>
     * 
     * @param expression
     *        The rule name or topic rule to send messages to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDestinationResult withExpression(String expression) {
        setExpression(expression);
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

    public GetDestinationResult withExpressionType(String expressionType) {
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

    public GetDestinationResult withExpressionType(ExpressionType expressionType) {
        this.expressionType = expressionType.toString();
        return this;
    }

    /**
     * <p>
     * The description of the resource.
     * </p>
     * 
     * @param description
     *        The description of the resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the resource.
     * </p>
     * 
     * @return The description of the resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the resource.
     * </p>
     * 
     * @param description
     *        The description of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDestinationResult withDescription(String description) {
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

    public GetDestinationResult withRoleArn(String roleArn) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getExpressionType() != null)
            sb.append("ExpressionType: ").append(getExpressionType()).append(",");
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

        if (obj instanceof GetDestinationResult == false)
            return false;
        GetDestinationResult other = (GetDestinationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getExpressionType() == null ^ this.getExpressionType() == null)
            return false;
        if (other.getExpressionType() != null && other.getExpressionType().equals(this.getExpressionType()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getExpressionType() == null) ? 0 : getExpressionType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public GetDestinationResult clone() {
        try {
            return (GetDestinationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
