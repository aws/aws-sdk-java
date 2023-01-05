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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/StartTransaction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTransactionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether this transaction should be read only or read and write. Writes made using a read-only
     * transaction ID will be rejected. Read-only transactions do not need to be committed.
     * </p>
     */
    private String transactionType;

    /**
     * <p>
     * Indicates whether this transaction should be read only or read and write. Writes made using a read-only
     * transaction ID will be rejected. Read-only transactions do not need to be committed.
     * </p>
     * 
     * @param transactionType
     *        Indicates whether this transaction should be read only or read and write. Writes made using a read-only
     *        transaction ID will be rejected. Read-only transactions do not need to be committed.
     * @see TransactionType
     */

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * <p>
     * Indicates whether this transaction should be read only or read and write. Writes made using a read-only
     * transaction ID will be rejected. Read-only transactions do not need to be committed.
     * </p>
     * 
     * @return Indicates whether this transaction should be read only or read and write. Writes made using a read-only
     *         transaction ID will be rejected. Read-only transactions do not need to be committed.
     * @see TransactionType
     */

    public String getTransactionType() {
        return this.transactionType;
    }

    /**
     * <p>
     * Indicates whether this transaction should be read only or read and write. Writes made using a read-only
     * transaction ID will be rejected. Read-only transactions do not need to be committed.
     * </p>
     * 
     * @param transactionType
     *        Indicates whether this transaction should be read only or read and write. Writes made using a read-only
     *        transaction ID will be rejected. Read-only transactions do not need to be committed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransactionType
     */

    public StartTransactionRequest withTransactionType(String transactionType) {
        setTransactionType(transactionType);
        return this;
    }

    /**
     * <p>
     * Indicates whether this transaction should be read only or read and write. Writes made using a read-only
     * transaction ID will be rejected. Read-only transactions do not need to be committed.
     * </p>
     * 
     * @param transactionType
     *        Indicates whether this transaction should be read only or read and write. Writes made using a read-only
     *        transaction ID will be rejected. Read-only transactions do not need to be committed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransactionType
     */

    public StartTransactionRequest withTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType.toString();
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
        if (getTransactionType() != null)
            sb.append("TransactionType: ").append(getTransactionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTransactionRequest == false)
            return false;
        StartTransactionRequest other = (StartTransactionRequest) obj;
        if (other.getTransactionType() == null ^ this.getTransactionType() == null)
            return false;
        if (other.getTransactionType() != null && other.getTransactionType().equals(this.getTransactionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactionType() == null) ? 0 : getTransactionType().hashCode());
        return hashCode;
    }

    @Override
    public StartTransactionRequest clone() {
        return (StartTransactionRequest) super.clone();
    }

}
