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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The description of the server-side encryption status on the specified table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/SSEDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SSEDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the current state of server-side encryption. The only supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Server-side encryption is being updated.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Server-side encryption type. The only supported value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption that uses AWS Key Management Service. The key is stored in your account
     * and is managed by AWS KMS (AWS KMS charges apply).
     * </p>
     * </li>
     * </ul>
     */
    private String sSEType;
    /**
     * <p>
     * The AWS KMS customer master key (CMK) ARN used for the AWS KMS encryption.
     * </p>
     */
    private String kMSMasterKeyArn;
    /**
     * <p>
     * Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's AWS KMS key was
     * inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's AWS KMS key is
     * accessible again. DynamoDB will initiate the table archival process when table's AWS KMS key remains inaccessible
     * for more than seven days from this date.
     * </p>
     */
    private java.util.Date inaccessibleEncryptionDateTime;

    /**
     * <p>
     * Represents the current state of server-side encryption. The only supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Server-side encryption is being updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Represents the current state of server-side encryption. The only supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Server-side encryption is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - Server-side encryption is being updated.
     *        </p>
     *        </li>
     * @see SSEStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Represents the current state of server-side encryption. The only supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Server-side encryption is being updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Represents the current state of server-side encryption. The only supported values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - Server-side encryption is enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - Server-side encryption is being updated.
     *         </p>
     *         </li>
     * @see SSEStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Represents the current state of server-side encryption. The only supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Server-side encryption is being updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Represents the current state of server-side encryption. The only supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Server-side encryption is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - Server-side encryption is being updated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSEStatus
     */

    public SSEDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Represents the current state of server-side encryption. The only supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Server-side encryption is being updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Represents the current state of server-side encryption. The only supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Server-side encryption is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - Server-side encryption is being updated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSEStatus
     */

    public SSEDescription withStatus(SSEStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Server-side encryption type. The only supported value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption that uses AWS Key Management Service. The key is stored in your account
     * and is managed by AWS KMS (AWS KMS charges apply).
     * </p>
     * </li>
     * </ul>
     * 
     * @param sSEType
     *        Server-side encryption type. The only supported value is:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KMS</code> - Server-side encryption that uses AWS Key Management Service. The key is stored in your
     *        account and is managed by AWS KMS (AWS KMS charges apply).
     *        </p>
     *        </li>
     * @see SSEType
     */

    public void setSSEType(String sSEType) {
        this.sSEType = sSEType;
    }

    /**
     * <p>
     * Server-side encryption type. The only supported value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption that uses AWS Key Management Service. The key is stored in your account
     * and is managed by AWS KMS (AWS KMS charges apply).
     * </p>
     * </li>
     * </ul>
     * 
     * @return Server-side encryption type. The only supported value is:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KMS</code> - Server-side encryption that uses AWS Key Management Service. The key is stored in your
     *         account and is managed by AWS KMS (AWS KMS charges apply).
     *         </p>
     *         </li>
     * @see SSEType
     */

    public String getSSEType() {
        return this.sSEType;
    }

    /**
     * <p>
     * Server-side encryption type. The only supported value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption that uses AWS Key Management Service. The key is stored in your account
     * and is managed by AWS KMS (AWS KMS charges apply).
     * </p>
     * </li>
     * </ul>
     * 
     * @param sSEType
     *        Server-side encryption type. The only supported value is:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KMS</code> - Server-side encryption that uses AWS Key Management Service. The key is stored in your
     *        account and is managed by AWS KMS (AWS KMS charges apply).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSEType
     */

    public SSEDescription withSSEType(String sSEType) {
        setSSEType(sSEType);
        return this;
    }

    /**
     * <p>
     * Server-side encryption type. The only supported value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code> - Server-side encryption that uses AWS Key Management Service. The key is stored in your account
     * and is managed by AWS KMS (AWS KMS charges apply).
     * </p>
     * </li>
     * </ul>
     * 
     * @param sSEType
     *        Server-side encryption type. The only supported value is:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KMS</code> - Server-side encryption that uses AWS Key Management Service. The key is stored in your
     *        account and is managed by AWS KMS (AWS KMS charges apply).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSEType
     */

    public SSEDescription withSSEType(SSEType sSEType) {
        this.sSEType = sSEType.toString();
        return this;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) ARN used for the AWS KMS encryption.
     * </p>
     * 
     * @param kMSMasterKeyArn
     *        The AWS KMS customer master key (CMK) ARN used for the AWS KMS encryption.
     */

    public void setKMSMasterKeyArn(String kMSMasterKeyArn) {
        this.kMSMasterKeyArn = kMSMasterKeyArn;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) ARN used for the AWS KMS encryption.
     * </p>
     * 
     * @return The AWS KMS customer master key (CMK) ARN used for the AWS KMS encryption.
     */

    public String getKMSMasterKeyArn() {
        return this.kMSMasterKeyArn;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) ARN used for the AWS KMS encryption.
     * </p>
     * 
     * @param kMSMasterKeyArn
     *        The AWS KMS customer master key (CMK) ARN used for the AWS KMS encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSEDescription withKMSMasterKeyArn(String kMSMasterKeyArn) {
        setKMSMasterKeyArn(kMSMasterKeyArn);
        return this;
    }

    /**
     * <p>
     * Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's AWS KMS key was
     * inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's AWS KMS key is
     * accessible again. DynamoDB will initiate the table archival process when table's AWS KMS key remains inaccessible
     * for more than seven days from this date.
     * </p>
     * 
     * @param inaccessibleEncryptionDateTime
     *        Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's AWS KMS key was
     *        inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's AWS KMS
     *        key is accessible again. DynamoDB will initiate the table archival process when table's AWS KMS key
     *        remains inaccessible for more than seven days from this date.
     */

    public void setInaccessibleEncryptionDateTime(java.util.Date inaccessibleEncryptionDateTime) {
        this.inaccessibleEncryptionDateTime = inaccessibleEncryptionDateTime;
    }

    /**
     * <p>
     * Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's AWS KMS key was
     * inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's AWS KMS key is
     * accessible again. DynamoDB will initiate the table archival process when table's AWS KMS key remains inaccessible
     * for more than seven days from this date.
     * </p>
     * 
     * @return Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's AWS KMS key was
     *         inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's AWS KMS
     *         key is accessible again. DynamoDB will initiate the table archival process when table's AWS KMS key
     *         remains inaccessible for more than seven days from this date.
     */

    public java.util.Date getInaccessibleEncryptionDateTime() {
        return this.inaccessibleEncryptionDateTime;
    }

    /**
     * <p>
     * Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's AWS KMS key was
     * inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's AWS KMS key is
     * accessible again. DynamoDB will initiate the table archival process when table's AWS KMS key remains inaccessible
     * for more than seven days from this date.
     * </p>
     * 
     * @param inaccessibleEncryptionDateTime
     *        Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's AWS KMS key was
     *        inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's AWS KMS
     *        key is accessible again. DynamoDB will initiate the table archival process when table's AWS KMS key
     *        remains inaccessible for more than seven days from this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSEDescription withInaccessibleEncryptionDateTime(java.util.Date inaccessibleEncryptionDateTime) {
        setInaccessibleEncryptionDateTime(inaccessibleEncryptionDateTime);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSSEType() != null)
            sb.append("SSEType: ").append(getSSEType()).append(",");
        if (getKMSMasterKeyArn() != null)
            sb.append("KMSMasterKeyArn: ").append(getKMSMasterKeyArn()).append(",");
        if (getInaccessibleEncryptionDateTime() != null)
            sb.append("InaccessibleEncryptionDateTime: ").append(getInaccessibleEncryptionDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SSEDescription == false)
            return false;
        SSEDescription other = (SSEDescription) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSSEType() == null ^ this.getSSEType() == null)
            return false;
        if (other.getSSEType() != null && other.getSSEType().equals(this.getSSEType()) == false)
            return false;
        if (other.getKMSMasterKeyArn() == null ^ this.getKMSMasterKeyArn() == null)
            return false;
        if (other.getKMSMasterKeyArn() != null && other.getKMSMasterKeyArn().equals(this.getKMSMasterKeyArn()) == false)
            return false;
        if (other.getInaccessibleEncryptionDateTime() == null ^ this.getInaccessibleEncryptionDateTime() == null)
            return false;
        if (other.getInaccessibleEncryptionDateTime() != null
                && other.getInaccessibleEncryptionDateTime().equals(this.getInaccessibleEncryptionDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSSEType() == null) ? 0 : getSSEType().hashCode());
        hashCode = prime * hashCode + ((getKMSMasterKeyArn() == null) ? 0 : getKMSMasterKeyArn().hashCode());
        hashCode = prime * hashCode + ((getInaccessibleEncryptionDateTime() == null) ? 0 : getInaccessibleEncryptionDateTime().hashCode());
        return hashCode;
    }

    @Override
    public SSEDescription clone() {
        try {
            return (SSEDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.SSEDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
