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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the provisioned throughput for the table or for a global secondary index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDynamoDbTableProvisionedThroughput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableProvisionedThroughput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates when the provisioned throughput was last decreased.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String lastDecreaseDateTime;
    /**
     * <p>
     * Indicates when the provisioned throughput was last increased.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String lastIncreaseDateTime;
    /**
     * <p>
     * The number of times during the current UTC calendar day that the provisioned throughput was decreased.
     * </p>
     */
    private Integer numberOfDecreasesToday;
    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>.
     * </p>
     */
    private Integer readCapacityUnits;
    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     */
    private Integer writeCapacityUnits;

    /**
     * <p>
     * Indicates when the provisioned throughput was last decreased.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param lastDecreaseDateTime
     *        Indicates when the provisioned throughput was last decreased.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setLastDecreaseDateTime(String lastDecreaseDateTime) {
        this.lastDecreaseDateTime = lastDecreaseDateTime;
    }

    /**
     * <p>
     * Indicates when the provisioned throughput was last decreased.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the provisioned throughput was last decreased.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getLastDecreaseDateTime() {
        return this.lastDecreaseDateTime;
    }

    /**
     * <p>
     * Indicates when the provisioned throughput was last decreased.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param lastDecreaseDateTime
     *        Indicates when the provisioned throughput was last decreased.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableProvisionedThroughput withLastDecreaseDateTime(String lastDecreaseDateTime) {
        setLastDecreaseDateTime(lastDecreaseDateTime);
        return this;
    }

    /**
     * <p>
     * Indicates when the provisioned throughput was last increased.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param lastIncreaseDateTime
     *        Indicates when the provisioned throughput was last increased.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setLastIncreaseDateTime(String lastIncreaseDateTime) {
        this.lastIncreaseDateTime = lastIncreaseDateTime;
    }

    /**
     * <p>
     * Indicates when the provisioned throughput was last increased.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the provisioned throughput was last increased.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getLastIncreaseDateTime() {
        return this.lastIncreaseDateTime;
    }

    /**
     * <p>
     * Indicates when the provisioned throughput was last increased.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param lastIncreaseDateTime
     *        Indicates when the provisioned throughput was last increased.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableProvisionedThroughput withLastIncreaseDateTime(String lastIncreaseDateTime) {
        setLastIncreaseDateTime(lastIncreaseDateTime);
        return this;
    }

    /**
     * <p>
     * The number of times during the current UTC calendar day that the provisioned throughput was decreased.
     * </p>
     * 
     * @param numberOfDecreasesToday
     *        The number of times during the current UTC calendar day that the provisioned throughput was decreased.
     */

    public void setNumberOfDecreasesToday(Integer numberOfDecreasesToday) {
        this.numberOfDecreasesToday = numberOfDecreasesToday;
    }

    /**
     * <p>
     * The number of times during the current UTC calendar day that the provisioned throughput was decreased.
     * </p>
     * 
     * @return The number of times during the current UTC calendar day that the provisioned throughput was decreased.
     */

    public Integer getNumberOfDecreasesToday() {
        return this.numberOfDecreasesToday;
    }

    /**
     * <p>
     * The number of times during the current UTC calendar day that the provisioned throughput was decreased.
     * </p>
     * 
     * @param numberOfDecreasesToday
     *        The number of times during the current UTC calendar day that the provisioned throughput was decreased.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableProvisionedThroughput withNumberOfDecreasesToday(Integer numberOfDecreasesToday) {
        setNumberOfDecreasesToday(numberOfDecreasesToday);
        return this;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>.
     * </p>
     * 
     * @param readCapacityUnits
     *        The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>.
     */

    public void setReadCapacityUnits(Integer readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>.
     * </p>
     * 
     * @return The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *         <code>ThrottlingException</code>.
     */

    public Integer getReadCapacityUnits() {
        return this.readCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>.
     * </p>
     * 
     * @param readCapacityUnits
     *        The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableProvisionedThroughput withReadCapacityUnits(Integer readCapacityUnits) {
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

    public void setWriteCapacityUnits(Integer writeCapacityUnits) {
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

    public Integer getWriteCapacityUnits() {
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

    public AwsDynamoDbTableProvisionedThroughput withWriteCapacityUnits(Integer writeCapacityUnits) {
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
        if (getLastDecreaseDateTime() != null)
            sb.append("LastDecreaseDateTime: ").append(getLastDecreaseDateTime()).append(",");
        if (getLastIncreaseDateTime() != null)
            sb.append("LastIncreaseDateTime: ").append(getLastIncreaseDateTime()).append(",");
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

        if (obj instanceof AwsDynamoDbTableProvisionedThroughput == false)
            return false;
        AwsDynamoDbTableProvisionedThroughput other = (AwsDynamoDbTableProvisionedThroughput) obj;
        if (other.getLastDecreaseDateTime() == null ^ this.getLastDecreaseDateTime() == null)
            return false;
        if (other.getLastDecreaseDateTime() != null && other.getLastDecreaseDateTime().equals(this.getLastDecreaseDateTime()) == false)
            return false;
        if (other.getLastIncreaseDateTime() == null ^ this.getLastIncreaseDateTime() == null)
            return false;
        if (other.getLastIncreaseDateTime() != null && other.getLastIncreaseDateTime().equals(this.getLastIncreaseDateTime()) == false)
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

        hashCode = prime * hashCode + ((getLastDecreaseDateTime() == null) ? 0 : getLastDecreaseDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastIncreaseDateTime() == null) ? 0 : getLastIncreaseDateTime().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDecreasesToday() == null) ? 0 : getNumberOfDecreasesToday().hashCode());
        hashCode = prime * hashCode + ((getReadCapacityUnits() == null) ? 0 : getReadCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getWriteCapacityUnits() == null) ? 0 : getWriteCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public AwsDynamoDbTableProvisionedThroughput clone() {
        try {
            return (AwsDynamoDbTableProvisionedThroughput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDynamoDbTableProvisionedThroughputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
