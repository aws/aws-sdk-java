/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the provisioned throughput settings for the table, consisting of read and write capacity units, along with
 * data about increases and decreases.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ProvisionedThroughputDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedThroughputDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time of the last provisioned throughput increase for this table.
     * </p>
     */
    private java.util.Date lastIncreaseDateTime;
    /**
     * <p>
     * The date and time of the last provisioned throughput decrease for this table.
     * </p>
     */
    private java.util.Date lastDecreaseDateTime;
    /**
     * <p>
     * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums
     * on provisioned throughput decreases, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     */
    private Long numberOfDecreasesToday;
    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>. Eventually consistent reads require less effort than strongly consistent reads,
     * so a setting of 50 <code>ReadCapacityUnits</code> per second provides 100 eventually consistent
     * <code>ReadCapacityUnits</code> per second.
     * </p>
     */
    private Long readCapacityUnits;
    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     */
    private Long writeCapacityUnits;

    /**
     * <p>
     * The date and time of the last provisioned throughput increase for this table.
     * </p>
     * 
     * @param lastIncreaseDateTime
     *        The date and time of the last provisioned throughput increase for this table.
     */

    public void setLastIncreaseDateTime(java.util.Date lastIncreaseDateTime) {
        this.lastIncreaseDateTime = lastIncreaseDateTime;
    }

    /**
     * <p>
     * The date and time of the last provisioned throughput increase for this table.
     * </p>
     * 
     * @return The date and time of the last provisioned throughput increase for this table.
     */

    public java.util.Date getLastIncreaseDateTime() {
        return this.lastIncreaseDateTime;
    }

    /**
     * <p>
     * The date and time of the last provisioned throughput increase for this table.
     * </p>
     * 
     * @param lastIncreaseDateTime
     *        The date and time of the last provisioned throughput increase for this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedThroughputDescription withLastIncreaseDateTime(java.util.Date lastIncreaseDateTime) {
        setLastIncreaseDateTime(lastIncreaseDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time of the last provisioned throughput decrease for this table.
     * </p>
     * 
     * @param lastDecreaseDateTime
     *        The date and time of the last provisioned throughput decrease for this table.
     */

    public void setLastDecreaseDateTime(java.util.Date lastDecreaseDateTime) {
        this.lastDecreaseDateTime = lastDecreaseDateTime;
    }

    /**
     * <p>
     * The date and time of the last provisioned throughput decrease for this table.
     * </p>
     * 
     * @return The date and time of the last provisioned throughput decrease for this table.
     */

    public java.util.Date getLastDecreaseDateTime() {
        return this.lastDecreaseDateTime;
    }

    /**
     * <p>
     * The date and time of the last provisioned throughput decrease for this table.
     * </p>
     * 
     * @param lastDecreaseDateTime
     *        The date and time of the last provisioned throughput decrease for this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedThroughputDescription withLastDecreaseDateTime(java.util.Date lastDecreaseDateTime) {
        setLastDecreaseDateTime(lastDecreaseDateTime);
        return this;
    }

    /**
     * <p>
     * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums
     * on provisioned throughput decreases, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param numberOfDecreasesToday
     *        The number of provisioned throughput decreases for this table during this UTC calendar day. For current
     *        maximums on provisioned throughput decreases, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the
     *        <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setNumberOfDecreasesToday(Long numberOfDecreasesToday) {
        this.numberOfDecreasesToday = numberOfDecreasesToday;
    }

    /**
     * <p>
     * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums
     * on provisioned throughput decreases, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return The number of provisioned throughput decreases for this table during this UTC calendar day. For current
     *         maximums on provisioned throughput decreases, see <a
     *         href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the
     *         <i>Amazon DynamoDB Developer Guide</i>.
     */

    public Long getNumberOfDecreasesToday() {
        return this.numberOfDecreasesToday;
    }

    /**
     * <p>
     * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums
     * on provisioned throughput decreases, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param numberOfDecreasesToday
     *        The number of provisioned throughput decreases for this table during this UTC calendar day. For current
     *        maximums on provisioned throughput decreases, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the
     *        <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedThroughputDescription withNumberOfDecreasesToday(Long numberOfDecreasesToday) {
        setNumberOfDecreasesToday(numberOfDecreasesToday);
        return this;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>. Eventually consistent reads require less effort than strongly consistent reads,
     * so a setting of 50 <code>ReadCapacityUnits</code> per second provides 100 eventually consistent
     * <code>ReadCapacityUnits</code> per second.
     * </p>
     * 
     * @param readCapacityUnits
     *        The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>. Eventually consistent reads require less effort than strongly consistent
     *        reads, so a setting of 50 <code>ReadCapacityUnits</code> per second provides 100 eventually consistent
     *        <code>ReadCapacityUnits</code> per second.
     */

    public void setReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>. Eventually consistent reads require less effort than strongly consistent reads,
     * so a setting of 50 <code>ReadCapacityUnits</code> per second provides 100 eventually consistent
     * <code>ReadCapacityUnits</code> per second.
     * </p>
     * 
     * @return The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *         <code>ThrottlingException</code>. Eventually consistent reads require less effort than strongly
     *         consistent reads, so a setting of 50 <code>ReadCapacityUnits</code> per second provides 100 eventually
     *         consistent <code>ReadCapacityUnits</code> per second.
     */

    public Long getReadCapacityUnits() {
        return this.readCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>. Eventually consistent reads require less effort than strongly consistent reads,
     * so a setting of 50 <code>ReadCapacityUnits</code> per second provides 100 eventually consistent
     * <code>ReadCapacityUnits</code> per second.
     * </p>
     * 
     * @param readCapacityUnits
     *        The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>. Eventually consistent reads require less effort than strongly consistent
     *        reads, so a setting of 50 <code>ReadCapacityUnits</code> per second provides 100 eventually consistent
     *        <code>ReadCapacityUnits</code> per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedThroughputDescription withReadCapacityUnits(Long readCapacityUnits) {
        setReadCapacityUnits(readCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     * 
     * @param writeCapacityUnits
     *        The maximum number of writes consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>.
     */

    public void setWriteCapacityUnits(Long writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     * 
     * @return The maximum number of writes consumed per second before DynamoDB returns a
     *         <code>ThrottlingException</code>.
     */

    public Long getWriteCapacityUnits() {
        return this.writeCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     * 
     * @param writeCapacityUnits
     *        The maximum number of writes consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedThroughputDescription withWriteCapacityUnits(Long writeCapacityUnits) {
        setWriteCapacityUnits(writeCapacityUnits);
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
        if (getLastIncreaseDateTime() != null)
            sb.append("LastIncreaseDateTime: ").append(getLastIncreaseDateTime()).append(",");
        if (getLastDecreaseDateTime() != null)
            sb.append("LastDecreaseDateTime: ").append(getLastDecreaseDateTime()).append(",");
        if (getNumberOfDecreasesToday() != null)
            sb.append("NumberOfDecreasesToday: ").append(getNumberOfDecreasesToday()).append(",");
        if (getReadCapacityUnits() != null)
            sb.append("ReadCapacityUnits: ").append(getReadCapacityUnits()).append(",");
        if (getWriteCapacityUnits() != null)
            sb.append("WriteCapacityUnits: ").append(getWriteCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedThroughputDescription == false)
            return false;
        ProvisionedThroughputDescription other = (ProvisionedThroughputDescription) obj;
        if (other.getLastIncreaseDateTime() == null ^ this.getLastIncreaseDateTime() == null)
            return false;
        if (other.getLastIncreaseDateTime() != null && other.getLastIncreaseDateTime().equals(this.getLastIncreaseDateTime()) == false)
            return false;
        if (other.getLastDecreaseDateTime() == null ^ this.getLastDecreaseDateTime() == null)
            return false;
        if (other.getLastDecreaseDateTime() != null && other.getLastDecreaseDateTime().equals(this.getLastDecreaseDateTime()) == false)
            return false;
        if (other.getNumberOfDecreasesToday() == null ^ this.getNumberOfDecreasesToday() == null)
            return false;
        if (other.getNumberOfDecreasesToday() != null && other.getNumberOfDecreasesToday().equals(this.getNumberOfDecreasesToday()) == false)
            return false;
        if (other.getReadCapacityUnits() == null ^ this.getReadCapacityUnits() == null)
            return false;
        if (other.getReadCapacityUnits() != null && other.getReadCapacityUnits().equals(this.getReadCapacityUnits()) == false)
            return false;
        if (other.getWriteCapacityUnits() == null ^ this.getWriteCapacityUnits() == null)
            return false;
        if (other.getWriteCapacityUnits() != null && other.getWriteCapacityUnits().equals(this.getWriteCapacityUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastIncreaseDateTime() == null) ? 0 : getLastIncreaseDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastDecreaseDateTime() == null) ? 0 : getLastDecreaseDateTime().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDecreasesToday() == null) ? 0 : getNumberOfDecreasesToday().hashCode());
        hashCode = prime * hashCode + ((getReadCapacityUnits() == null) ? 0 : getReadCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getWriteCapacityUnits() == null) ? 0 : getWriteCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionedThroughputDescription clone() {
        try {
            return (ProvisionedThroughputDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ProvisionedThroughputDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
