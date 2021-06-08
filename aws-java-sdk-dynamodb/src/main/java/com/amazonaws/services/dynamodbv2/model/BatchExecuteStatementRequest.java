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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchExecuteStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchExecuteStatementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of PartiQL statements representing the batch to run.
     * </p>
     */
    private java.util.List<BatchStatementRequest> statements;

    /**
     * <p>
     * The list of PartiQL statements representing the batch to run.
     * </p>
     * 
     * @return The list of PartiQL statements representing the batch to run.
     */

    public java.util.List<BatchStatementRequest> getStatements() {
        return statements;
    }

    /**
     * <p>
     * The list of PartiQL statements representing the batch to run.
     * </p>
     * 
     * @param statements
     *        The list of PartiQL statements representing the batch to run.
     */

    public void setStatements(java.util.Collection<BatchStatementRequest> statements) {
        if (statements == null) {
            this.statements = null;
            return;
        }

        this.statements = new java.util.ArrayList<BatchStatementRequest>(statements);
    }

    /**
     * <p>
     * The list of PartiQL statements representing the batch to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatements(java.util.Collection)} or {@link #withStatements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statements
     *        The list of PartiQL statements representing the batch to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withStatements(BatchStatementRequest... statements) {
        if (this.statements == null) {
            setStatements(new java.util.ArrayList<BatchStatementRequest>(statements.length));
        }
        for (BatchStatementRequest ele : statements) {
            this.statements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of PartiQL statements representing the batch to run.
     * </p>
     * 
     * @param statements
     *        The list of PartiQL statements representing the batch to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withStatements(java.util.Collection<BatchStatementRequest> statements) {
        setStatements(statements);
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
        if (getStatements() != null)
            sb.append("Statements: ").append(getStatements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchExecuteStatementRequest == false)
            return false;
        BatchExecuteStatementRequest other = (BatchExecuteStatementRequest) obj;
        if (other.getStatements() == null ^ this.getStatements() == null)
            return false;
        if (other.getStatements() != null && other.getStatements().equals(this.getStatements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatements() == null) ? 0 : getStatements().hashCode());
        return hashCode;
    }

    @Override
    public BatchExecuteStatementRequest clone() {
        return (BatchExecuteStatementRequest) super.clone();
    }

}
