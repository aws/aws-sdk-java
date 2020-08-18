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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the server-side encryption for the table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDynamoDbTableSseDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableSseDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the key is inaccessible, the date and time when DynamoDB detected that the key was inaccessible.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String inaccessibleEncryptionDateTime;
    /**
     * <p>
     * The status of the server-side encryption.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of server-side encryption.
     * </p>
     */
    private String sseType;
    /**
     * <p>
     * The ARN of the AWS KMS customer master key (CMK) that is used for the AWS KMS encryption.
     * </p>
     */
    private String kmsMasterKeyArn;

    /**
     * <p>
     * If the key is inaccessible, the date and time when DynamoDB detected that the key was inaccessible.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param inaccessibleEncryptionDateTime
     *        If the key is inaccessible, the date and time when DynamoDB detected that the key was inaccessible.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setInaccessibleEncryptionDateTime(String inaccessibleEncryptionDateTime) {
        this.inaccessibleEncryptionDateTime = inaccessibleEncryptionDateTime;
    }

    /**
     * <p>
     * If the key is inaccessible, the date and time when DynamoDB detected that the key was inaccessible.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return If the key is inaccessible, the date and time when DynamoDB detected that the key was inaccessible.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getInaccessibleEncryptionDateTime() {
        return this.inaccessibleEncryptionDateTime;
    }

    /**
     * <p>
     * If the key is inaccessible, the date and time when DynamoDB detected that the key was inaccessible.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param inaccessibleEncryptionDateTime
     *        If the key is inaccessible, the date and time when DynamoDB detected that the key was inaccessible.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableSseDescription withInaccessibleEncryptionDateTime(String inaccessibleEncryptionDateTime) {
        setInaccessibleEncryptionDateTime(inaccessibleEncryptionDateTime);
        return this;
    }

    /**
     * <p>
     * The status of the server-side encryption.
     * </p>
     * 
     * @param status
     *        The status of the server-side encryption.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the server-side encryption.
     * </p>
     * 
     * @return The status of the server-side encryption.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the server-side encryption.
     * </p>
     * 
     * @param status
     *        The status of the server-side encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableSseDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The type of server-side encryption.
     * </p>
     * 
     * @param sseType
     *        The type of server-side encryption.
     */

    public void setSseType(String sseType) {
        this.sseType = sseType;
    }

    /**
     * <p>
     * The type of server-side encryption.
     * </p>
     * 
     * @return The type of server-side encryption.
     */

    public String getSseType() {
        return this.sseType;
    }

    /**
     * <p>
     * The type of server-side encryption.
     * </p>
     * 
     * @param sseType
     *        The type of server-side encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableSseDescription withSseType(String sseType) {
        setSseType(sseType);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS KMS customer master key (CMK) that is used for the AWS KMS encryption.
     * </p>
     * 
     * @param kmsMasterKeyArn
     *        The ARN of the AWS KMS customer master key (CMK) that is used for the AWS KMS encryption.
     */

    public void setKmsMasterKeyArn(String kmsMasterKeyArn) {
        this.kmsMasterKeyArn = kmsMasterKeyArn;
    }

    /**
     * <p>
     * The ARN of the AWS KMS customer master key (CMK) that is used for the AWS KMS encryption.
     * </p>
     * 
     * @return The ARN of the AWS KMS customer master key (CMK) that is used for the AWS KMS encryption.
     */

    public String getKmsMasterKeyArn() {
        return this.kmsMasterKeyArn;
    }

    /**
     * <p>
     * The ARN of the AWS KMS customer master key (CMK) that is used for the AWS KMS encryption.
     * </p>
     * 
     * @param kmsMasterKeyArn
     *        The ARN of the AWS KMS customer master key (CMK) that is used for the AWS KMS encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableSseDescription withKmsMasterKeyArn(String kmsMasterKeyArn) {
        setKmsMasterKeyArn(kmsMasterKeyArn);
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
        if (getInaccessibleEncryptionDateTime() != null)
            sb.append("InaccessibleEncryptionDateTime: ").append(getInaccessibleEncryptionDateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSseType() != null)
            sb.append("SseType: ").append(getSseType()).append(",");
        if (getKmsMasterKeyArn() != null)
            sb.append("KmsMasterKeyArn: ").append(getKmsMasterKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDynamoDbTableSseDescription == false)
            return false;
        AwsDynamoDbTableSseDescription other = (AwsDynamoDbTableSseDescription) obj;
        if (other.getInaccessibleEncryptionDateTime() == null ^ this.getInaccessibleEncryptionDateTime() == null)
            return false;
        if (other.getInaccessibleEncryptionDateTime() != null
                && other.getInaccessibleEncryptionDateTime().equals(this.getInaccessibleEncryptionDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSseType() == null ^ this.getSseType() == null)
            return false;
        if (other.getSseType() != null && other.getSseType().equals(this.getSseType()) == false)
            return false;
        if (other.getKmsMasterKeyArn() == null ^ this.getKmsMasterKeyArn() == null)
            return false;
        if (other.getKmsMasterKeyArn() != null && other.getKmsMasterKeyArn().equals(this.getKmsMasterKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInaccessibleEncryptionDateTime() == null) ? 0 : getInaccessibleEncryptionDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSseType() == null) ? 0 : getSseType().hashCode());
        hashCode = prime * hashCode + ((getKmsMasterKeyArn() == null) ? 0 : getKmsMasterKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public AwsDynamoDbTableSseDescription clone() {
        try {
            return (AwsDynamoDbTableSseDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDynamoDbTableSseDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
