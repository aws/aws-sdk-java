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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information about a transaction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/TransactionDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the transaction.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * A status of ACTIVE, COMMITTED, or ABORTED.
     * </p>
     */
    private String transactionStatus;
    /**
     * <p>
     * The time when the transaction started.
     * </p>
     */
    private java.util.Date transactionStartTime;
    /**
     * <p>
     * The time when the transaction committed or aborted, if it is not currently active.
     * </p>
     */
    private java.util.Date transactionEndTime;

    /**
     * <p>
     * The ID of the transaction.
     * </p>
     * 
     * @param transactionId
     *        The ID of the transaction.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The ID of the transaction.
     * </p>
     * 
     * @return The ID of the transaction.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The ID of the transaction.
     * </p>
     * 
     * @param transactionId
     *        The ID of the transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionDescription withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * A status of ACTIVE, COMMITTED, or ABORTED.
     * </p>
     * 
     * @param transactionStatus
     *        A status of ACTIVE, COMMITTED, or ABORTED.
     * @see TransactionStatus
     */

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    /**
     * <p>
     * A status of ACTIVE, COMMITTED, or ABORTED.
     * </p>
     * 
     * @return A status of ACTIVE, COMMITTED, or ABORTED.
     * @see TransactionStatus
     */

    public String getTransactionStatus() {
        return this.transactionStatus;
    }

    /**
     * <p>
     * A status of ACTIVE, COMMITTED, or ABORTED.
     * </p>
     * 
     * @param transactionStatus
     *        A status of ACTIVE, COMMITTED, or ABORTED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransactionStatus
     */

    public TransactionDescription withTransactionStatus(String transactionStatus) {
        setTransactionStatus(transactionStatus);
        return this;
    }

    /**
     * <p>
     * A status of ACTIVE, COMMITTED, or ABORTED.
     * </p>
     * 
     * @param transactionStatus
     *        A status of ACTIVE, COMMITTED, or ABORTED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransactionStatus
     */

    public TransactionDescription withTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time when the transaction started.
     * </p>
     * 
     * @param transactionStartTime
     *        The time when the transaction started.
     */

    public void setTransactionStartTime(java.util.Date transactionStartTime) {
        this.transactionStartTime = transactionStartTime;
    }

    /**
     * <p>
     * The time when the transaction started.
     * </p>
     * 
     * @return The time when the transaction started.
     */

    public java.util.Date getTransactionStartTime() {
        return this.transactionStartTime;
    }

    /**
     * <p>
     * The time when the transaction started.
     * </p>
     * 
     * @param transactionStartTime
     *        The time when the transaction started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionDescription withTransactionStartTime(java.util.Date transactionStartTime) {
        setTransactionStartTime(transactionStartTime);
        return this;
    }

    /**
     * <p>
     * The time when the transaction committed or aborted, if it is not currently active.
     * </p>
     * 
     * @param transactionEndTime
     *        The time when the transaction committed or aborted, if it is not currently active.
     */

    public void setTransactionEndTime(java.util.Date transactionEndTime) {
        this.transactionEndTime = transactionEndTime;
    }

    /**
     * <p>
     * The time when the transaction committed or aborted, if it is not currently active.
     * </p>
     * 
     * @return The time when the transaction committed or aborted, if it is not currently active.
     */

    public java.util.Date getTransactionEndTime() {
        return this.transactionEndTime;
    }

    /**
     * <p>
     * The time when the transaction committed or aborted, if it is not currently active.
     * </p>
     * 
     * @param transactionEndTime
     *        The time when the transaction committed or aborted, if it is not currently active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionDescription withTransactionEndTime(java.util.Date transactionEndTime) {
        setTransactionEndTime(transactionEndTime);
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
        if (getTransactionStatus() != null)
            sb.append("TransactionStatus: ").append(getTransactionStatus()).append(",");
        if (getTransactionStartTime() != null)
            sb.append("TransactionStartTime: ").append(getTransactionStartTime()).append(",");
        if (getTransactionEndTime() != null)
            sb.append("TransactionEndTime: ").append(getTransactionEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactionDescription == false)
            return false;
        TransactionDescription other = (TransactionDescription) obj;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getTransactionStatus() == null ^ this.getTransactionStatus() == null)
            return false;
        if (other.getTransactionStatus() != null && other.getTransactionStatus().equals(this.getTransactionStatus()) == false)
            return false;
        if (other.getTransactionStartTime() == null ^ this.getTransactionStartTime() == null)
            return false;
        if (other.getTransactionStartTime() != null && other.getTransactionStartTime().equals(this.getTransactionStartTime()) == false)
            return false;
        if (other.getTransactionEndTime() == null ^ this.getTransactionEndTime() == null)
            return false;
        if (other.getTransactionEndTime() != null && other.getTransactionEndTime().equals(this.getTransactionEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getTransactionStatus() == null) ? 0 : getTransactionStatus().hashCode());
        hashCode = prime * hashCode + ((getTransactionStartTime() == null) ? 0 : getTransactionStartTime().hashCode());
        hashCode = prime * hashCode + ((getTransactionEndTime() == null) ? 0 : getTransactionEndTime().hashCode());
        return hashCode;
    }

    @Override
    public TransactionDescription clone() {
        try {
            return (TransactionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.TransactionDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
