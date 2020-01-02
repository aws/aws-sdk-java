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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response elements represent the output of a request to perform a rollback of a transaction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/RollbackTransaction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RollbackTransactionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the rollback operation.
     * </p>
     */
    private String transactionStatus;

    /**
     * <p>
     * The status of the rollback operation.
     * </p>
     * 
     * @param transactionStatus
     *        The status of the rollback operation.
     */

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    /**
     * <p>
     * The status of the rollback operation.
     * </p>
     * 
     * @return The status of the rollback operation.
     */

    public String getTransactionStatus() {
        return this.transactionStatus;
    }

    /**
     * <p>
     * The status of the rollback operation.
     * </p>
     * 
     * @param transactionStatus
     *        The status of the rollback operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackTransactionResult withTransactionStatus(String transactionStatus) {
        setTransactionStatus(transactionStatus);
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
        if (getTransactionStatus() != null)
            sb.append("TransactionStatus: ").append(getTransactionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RollbackTransactionResult == false)
            return false;
        RollbackTransactionResult other = (RollbackTransactionResult) obj;
        if (other.getTransactionStatus() == null ^ this.getTransactionStatus() == null)
            return false;
        if (other.getTransactionStatus() != null && other.getTransactionStatus().equals(this.getTransactionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactionStatus() == null) ? 0 : getTransactionStatus().hashCode());
        return hashCode;
    }

    @Override
    public RollbackTransactionResult clone() {
        try {
            return (RollbackTransactionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
