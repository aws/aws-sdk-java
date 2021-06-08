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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ExecuteTransaction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteTransactionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of PartiQL statements representing the transaction to run.
     * </p>
     */
    private java.util.List<ParameterizedStatement> transactStatements;
    /**
     * <p>
     * Set this value to get remaining results, if <code>NextToken</code> was returned in the statement response.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The list of PartiQL statements representing the transaction to run.
     * </p>
     * 
     * @return The list of PartiQL statements representing the transaction to run.
     */

    public java.util.List<ParameterizedStatement> getTransactStatements() {
        return transactStatements;
    }

    /**
     * <p>
     * The list of PartiQL statements representing the transaction to run.
     * </p>
     * 
     * @param transactStatements
     *        The list of PartiQL statements representing the transaction to run.
     */

    public void setTransactStatements(java.util.Collection<ParameterizedStatement> transactStatements) {
        if (transactStatements == null) {
            this.transactStatements = null;
            return;
        }

        this.transactStatements = new java.util.ArrayList<ParameterizedStatement>(transactStatements);
    }

    /**
     * <p>
     * The list of PartiQL statements representing the transaction to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransactStatements(java.util.Collection)} or {@link #withTransactStatements(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param transactStatements
     *        The list of PartiQL statements representing the transaction to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteTransactionRequest withTransactStatements(ParameterizedStatement... transactStatements) {
        if (this.transactStatements == null) {
            setTransactStatements(new java.util.ArrayList<ParameterizedStatement>(transactStatements.length));
        }
        for (ParameterizedStatement ele : transactStatements) {
            this.transactStatements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of PartiQL statements representing the transaction to run.
     * </p>
     * 
     * @param transactStatements
     *        The list of PartiQL statements representing the transaction to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteTransactionRequest withTransactStatements(java.util.Collection<ParameterizedStatement> transactStatements) {
        setTransactStatements(transactStatements);
        return this;
    }

    /**
     * <p>
     * Set this value to get remaining results, if <code>NextToken</code> was returned in the statement response.
     * </p>
     * 
     * @param clientRequestToken
     *        Set this value to get remaining results, if <code>NextToken</code> was returned in the statement response.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Set this value to get remaining results, if <code>NextToken</code> was returned in the statement response.
     * </p>
     * 
     * @return Set this value to get remaining results, if <code>NextToken</code> was returned in the statement
     *         response.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Set this value to get remaining results, if <code>NextToken</code> was returned in the statement response.
     * </p>
     * 
     * @param clientRequestToken
     *        Set this value to get remaining results, if <code>NextToken</code> was returned in the statement response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteTransactionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getTransactStatements() != null)
            sb.append("TransactStatements: ").append(getTransactStatements()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteTransactionRequest == false)
            return false;
        ExecuteTransactionRequest other = (ExecuteTransactionRequest) obj;
        if (other.getTransactStatements() == null ^ this.getTransactStatements() == null)
            return false;
        if (other.getTransactStatements() != null && other.getTransactStatements().equals(this.getTransactStatements()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactStatements() == null) ? 0 : getTransactStatements().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteTransactionRequest clone() {
        return (ExecuteTransactionRequest) super.clone();
    }

}
