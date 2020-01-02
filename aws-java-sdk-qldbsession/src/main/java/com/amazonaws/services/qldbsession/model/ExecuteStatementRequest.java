/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qldbsession.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a request to execute a statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/ExecuteStatementRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteStatementRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the transaction id of the request.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * Specifies the statement of the request.
     * </p>
     */
    private String statement;
    /**
     * <p>
     * Specifies the parameters for the parameterized statement in the request.
     * </p>
     */
    private java.util.List<ValueHolder> parameters;

    /**
     * <p>
     * Specifies the transaction id of the request.
     * </p>
     * 
     * @param transactionId
     *        Specifies the transaction id of the request.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * Specifies the transaction id of the request.
     * </p>
     * 
     * @return Specifies the transaction id of the request.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * Specifies the transaction id of the request.
     * </p>
     * 
     * @param transactionId
     *        Specifies the transaction id of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * Specifies the statement of the request.
     * </p>
     * 
     * @param statement
     *        Specifies the statement of the request.
     */

    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * Specifies the statement of the request.
     * </p>
     * 
     * @return Specifies the statement of the request.
     */

    public String getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * Specifies the statement of the request.
     * </p>
     * 
     * @param statement
     *        Specifies the statement of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withStatement(String statement) {
        setStatement(statement);
        return this;
    }

    /**
     * <p>
     * Specifies the parameters for the parameterized statement in the request.
     * </p>
     * 
     * @return Specifies the parameters for the parameterized statement in the request.
     */

    public java.util.List<ValueHolder> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Specifies the parameters for the parameterized statement in the request.
     * </p>
     * 
     * @param parameters
     *        Specifies the parameters for the parameterized statement in the request.
     */

    public void setParameters(java.util.Collection<ValueHolder> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<ValueHolder>(parameters);
    }

    /**
     * <p>
     * Specifies the parameters for the parameterized statement in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        Specifies the parameters for the parameterized statement in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withParameters(ValueHolder... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<ValueHolder>(parameters.length));
        }
        for (ValueHolder ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the parameters for the parameterized statement in the request.
     * </p>
     * 
     * @param parameters
     *        Specifies the parameters for the parameterized statement in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withParameters(java.util.Collection<ValueHolder> parameters) {
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
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId()).append(",");
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

        if (obj instanceof ExecuteStatementRequest == false)
            return false;
        ExecuteStatementRequest other = (ExecuteStatementRequest) obj;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteStatementRequest clone() {
        try {
            return (ExecuteStatementRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldbsession.model.transform.ExecuteStatementRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
