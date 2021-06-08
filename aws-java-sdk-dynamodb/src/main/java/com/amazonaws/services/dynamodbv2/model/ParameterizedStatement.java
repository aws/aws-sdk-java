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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a PartiQL statment that uses parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ParameterizedStatement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterizedStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A PartiQL statment that uses parameters.
     * </p>
     */
    private String statement;
    /**
     * <p>
     * The parameter values.
     * </p>
     */
    private java.util.List<AttributeValue> parameters;

    /**
     * <p>
     * A PartiQL statment that uses parameters.
     * </p>
     * 
     * @param statement
     *        A PartiQL statment that uses parameters.
     */

    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * A PartiQL statment that uses parameters.
     * </p>
     * 
     * @return A PartiQL statment that uses parameters.
     */

    public String getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * A PartiQL statment that uses parameters.
     * </p>
     * 
     * @param statement
     *        A PartiQL statment that uses parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterizedStatement withStatement(String statement) {
        setStatement(statement);
        return this;
    }

    /**
     * <p>
     * The parameter values.
     * </p>
     * 
     * @return The parameter values.
     */

    public java.util.List<AttributeValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameter values.
     * </p>
     * 
     * @param parameters
     *        The parameter values.
     */

    public void setParameters(java.util.Collection<AttributeValue> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<AttributeValue>(parameters);
    }

    /**
     * <p>
     * The parameter values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterizedStatement withParameters(AttributeValue... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<AttributeValue>(parameters.length));
        }
        for (AttributeValue ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameter values.
     * </p>
     * 
     * @param parameters
     *        The parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterizedStatement withParameters(java.util.Collection<AttributeValue> parameters) {
        setParameters(parameters);
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
        if (getStatement() != null)
            sb.append("Statement: ").append(getStatement()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterizedStatement == false)
            return false;
        ParameterizedStatement other = (ParameterizedStatement) obj;
        if (other.getStatement() == null ^ this.getStatement() == null)
            return false;
        if (other.getStatement() != null && other.getStatement().equals(this.getStatement()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public ParameterizedStatement clone() {
        try {
            return (ParameterizedStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ParameterizedStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
