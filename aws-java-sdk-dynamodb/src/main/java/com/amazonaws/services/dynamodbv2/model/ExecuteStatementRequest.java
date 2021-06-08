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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ExecuteStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteStatementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The PartiQL statement representing the operation to run.
     * </p>
     */
    private String statement;
    /**
     * <p>
     * The parameters for the PartiQL statement, if any.
     * </p>
     */
    private java.util.List<AttributeValue> parameters;
    /**
     * <p>
     * The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used;
     * otherwise, an eventually consistent read is used.
     * </p>
     */
    private Boolean consistentRead;
    /**
     * <p>
     * Set this value to get remaining results, if <code>NextToken</code> was returned in the statement response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The PartiQL statement representing the operation to run.
     * </p>
     * 
     * @param statement
     *        The PartiQL statement representing the operation to run.
     */

    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * The PartiQL statement representing the operation to run.
     * </p>
     * 
     * @return The PartiQL statement representing the operation to run.
     */

    public String getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * The PartiQL statement representing the operation to run.
     * </p>
     * 
     * @param statement
     *        The PartiQL statement representing the operation to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withStatement(String statement) {
        setStatement(statement);
        return this;
    }

    /**
     * <p>
     * The parameters for the PartiQL statement, if any.
     * </p>
     * 
     * @return The parameters for the PartiQL statement, if any.
     */

    public java.util.List<AttributeValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the PartiQL statement, if any.
     * </p>
     * 
     * @param parameters
     *        The parameters for the PartiQL statement, if any.
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
     * The parameters for the PartiQL statement, if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The parameters for the PartiQL statement, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withParameters(AttributeValue... parameters) {
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
     * The parameters for the PartiQL statement, if any.
     * </p>
     * 
     * @param parameters
     *        The parameters for the PartiQL statement, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withParameters(java.util.Collection<AttributeValue> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used;
     * otherwise, an eventually consistent read is used.
     * </p>
     * 
     * @param consistentRead
     *        The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used;
     *        otherwise, an eventually consistent read is used.
     */

    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    /**
     * <p>
     * The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used;
     * otherwise, an eventually consistent read is used.
     * </p>
     * 
     * @return The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is
     *         used; otherwise, an eventually consistent read is used.
     */

    public Boolean getConsistentRead() {
        return this.consistentRead;
    }

    /**
     * <p>
     * The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used;
     * otherwise, an eventually consistent read is used.
     * </p>
     * 
     * @param consistentRead
     *        The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used;
     *        otherwise, an eventually consistent read is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withConsistentRead(Boolean consistentRead) {
        setConsistentRead(consistentRead);
        return this;
    }

    /**
     * <p>
     * The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used;
     * otherwise, an eventually consistent read is used.
     * </p>
     * 
     * @return The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is
     *         used; otherwise, an eventually consistent read is used.
     */

    public Boolean isConsistentRead() {
        return this.consistentRead;
    }

    /**
     * <p>
     * Set this value to get remaining results, if <code>NextToken</code> was returned in the statement response.
     * </p>
     * 
     * @param nextToken
     *        Set this value to get remaining results, if <code>NextToken</code> was returned in the statement response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Set this value to get remaining results, if <code>NextToken</code> was returned in the statement response.
     * </p>
     * 
     * @return Set this value to get remaining results, if <code>NextToken</code> was returned in the statement
     *         response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Set this value to get remaining results, if <code>NextToken</code> was returned in the statement response.
     * </p>
     * 
     * @param nextToken
     *        Set this value to get remaining results, if <code>NextToken</code> was returned in the statement response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getConsistentRead() != null)
            sb.append("ConsistentRead: ").append(getConsistentRead()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteStatementRequest clone() {
        return (ExecuteStatementRequest) super.clone();
    }

}
