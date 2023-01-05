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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CommitTransaction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommitTransactionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The transaction to commit.
     * </p>
     */
    private String transactionId;

    /**
     * <p>
     * The transaction to commit.
     * </p>
     * 
     * @param transactionId
     *        The transaction to commit.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The transaction to commit.
     * </p>
     * 
     * @return The transaction to commit.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The transaction to commit.
     * </p>
     * 
     * @param transactionId
     *        The transaction to commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitTransactionRequest withTransactionId(String transactionId) {
        setTransactionId(transactionId);
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
            sb.append("TransactionId: ").append(getTransactionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommitTransactionRequest == false)
            return false;
        CommitTransactionRequest other = (CommitTransactionRequest) obj;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        return hashCode;
    }

    @Override
    public CommitTransactionRequest clone() {
        return (CommitTransactionRequest) super.clone();
    }

}
