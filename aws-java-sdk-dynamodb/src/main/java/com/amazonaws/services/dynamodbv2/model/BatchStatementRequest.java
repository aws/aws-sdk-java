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
 * A PartiQL batch statement request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchStatementRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStatementRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A valid PartiQL statement.
     * </p>
     */
    private String statement;
    /**
     * <p>
     * The parameters associated with a PartiQL statement in the batch request.
     * </p>
     */
    private java.util.List<AttributeValue> parameters;
    /**
     * <p>
     * The read consistency of the PartiQL batch request.
     * </p>
     */
    private Boolean consistentRead;

    /**
     * <p>
     * A valid PartiQL statement.
     * </p>
     * 
     * @param statement
     *        A valid PartiQL statement.
     */

    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * A valid PartiQL statement.
     * </p>
     * 
     * @return A valid PartiQL statement.
     */

    public String getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * A valid PartiQL statement.
     * </p>
     * 
     * @param statement
     *        A valid PartiQL statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStatementRequest withStatement(String statement) {
        setStatement(statement);
        return this;
    }

    /**
     * <p>
     * The parameters associated with a PartiQL statement in the batch request.
     * </p>
     * 
     * @return The parameters associated with a PartiQL statement in the batch request.
     */

    public java.util.List<AttributeValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters associated with a PartiQL statement in the batch request.
     * </p>
     * 
     * @param parameters
     *        The parameters associated with a PartiQL statement in the batch request.
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
     * The parameters associated with a PartiQL statement in the batch request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The parameters associated with a PartiQL statement in the batch request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStatementRequest withParameters(AttributeValue... parameters) {
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
     * The parameters associated with a PartiQL statement in the batch request.
     * </p>
     * 
     * @param parameters
     *        The parameters associated with a PartiQL statement in the batch request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStatementRequest withParameters(java.util.Collection<AttributeValue> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The read consistency of the PartiQL batch request.
     * </p>
     * 
     * @param consistentRead
     *        The read consistency of the PartiQL batch request.
     */

    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    /**
     * <p>
     * The read consistency of the PartiQL batch request.
     * </p>
     * 
     * @return The read consistency of the PartiQL batch request.
     */

    public Boolean getConsistentRead() {
        return this.consistentRead;
    }

    /**
     * <p>
     * The read consistency of the PartiQL batch request.
     * </p>
     * 
     * @param consistentRead
     *        The read consistency of the PartiQL batch request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStatementRequest withConsistentRead(Boolean consistentRead) {
        setConsistentRead(consistentRead);
        return this;
    }

    /**
     * <p>
     * The read consistency of the PartiQL batch request.
     * </p>
     * 
     * @return The read consistency of the PartiQL batch request.
     */

    public Boolean isConsistentRead() {
        return this.consistentRead;
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
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getConsistentRead() != null)
            sb.append("ConsistentRead: ").append(getConsistentRead());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStatementRequest == false)
            return false;
        BatchStatementRequest other = (BatchStatementRequest) obj;
        if (other.getStatement() == null ^ this.getStatement() == null)
            return false;
        if (other.getStatement() != null && other.getStatement().equals(this.getStatement()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getConsistentRead() == null ^ this.getConsistentRead() == null)
            return false;
        if (other.getConsistentRead() != null && other.getConsistentRead().equals(this.getConsistentRead()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getConsistentRead() == null) ? 0 : getConsistentRead().hashCode());
        return hashCode;
    }

    @Override
    public BatchStatementRequest clone() {
        try {
            return (BatchStatementRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.BatchStatementRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
