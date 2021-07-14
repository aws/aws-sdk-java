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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an access key for an Amazon Lightsail bucket.
 * </p>
 * <p>
 * Access keys grant full programmatic access to the specified bucket and its objects. You can have a maximum of two
 * access keys per bucket. Use the <a>CreateBucketAccessKey</a> action to create an access key for a specific bucket.
 * For more information about access keys, see <a
 * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-creating-bucket-access-keys">Creating
 * access keys for a bucket in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
 * </p>
 * <important>
 * <p>
 * The <code>secretAccessKey</code> value is returned only in response to the <code>CreateBucketAccessKey</code> action.
 * You can get a secret access key only when you first create an access key; you cannot get the secret access key later.
 * If you lose the secret access key, you must create a new access key.
 * </p>
 * </important>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AccessKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the access key.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The secret access key used to sign requests.
     * </p>
     * <p>
     * You should store the secret access key in a safe location. We recommend that you delete the access key if the
     * secret access key is compromised.
     * </p>
     */
    private String secretAccessKey;
    /**
     * <p>
     * The status of the access key.
     * </p>
     * <p>
     * A status of <code>Active</code> means that the key is valid, while <code>Inactive</code> means it is not.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp when the access key was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The ID of the access key.
     * </p>
     * 
     * @param accessKeyId
     *        The ID of the access key.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The ID of the access key.
     * </p>
     * 
     * @return The ID of the access key.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The ID of the access key.
     * </p>
     * 
     * @param accessKeyId
     *        The ID of the access key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKey withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The secret access key used to sign requests.
     * </p>
     * <p>
     * You should store the secret access key in a safe location. We recommend that you delete the access key if the
     * secret access key is compromised.
     * </p>
     * 
     * @param secretAccessKey
     *        The secret access key used to sign requests.</p>
     *        <p>
     *        You should store the secret access key in a safe location. We recommend that you delete the access key if
     *        the secret access key is compromised.
     */

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * <p>
     * The secret access key used to sign requests.
     * </p>
     * <p>
     * You should store the secret access key in a safe location. We recommend that you delete the access key if the
     * secret access key is compromised.
     * </p>
     * 
     * @return The secret access key used to sign requests.</p>
     *         <p>
     *         You should store the secret access key in a safe location. We recommend that you delete the access key if
     *         the secret access key is compromised.
     */

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * <p>
     * The secret access key used to sign requests.
     * </p>
     * <p>
     * You should store the secret access key in a safe location. We recommend that you delete the access key if the
     * secret access key is compromised.
     * </p>
     * 
     * @param secretAccessKey
     *        The secret access key used to sign requests.</p>
     *        <p>
     *        You should store the secret access key in a safe location. We recommend that you delete the access key if
     *        the secret access key is compromised.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKey withSecretAccessKey(String secretAccessKey) {
        setSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * <p>
     * The status of the access key.
     * </p>
     * <p>
     * A status of <code>Active</code> means that the key is valid, while <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the access key.</p>
     *        <p>
     *        A status of <code>Active</code> means that the key is valid, while <code>Inactive</code> means it is not.
     * @see StatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the access key.
     * </p>
     * <p>
     * A status of <code>Active</code> means that the key is valid, while <code>Inactive</code> means it is not.
     * </p>
     * 
     * @return The status of the access key.</p>
     *         <p>
     *         A status of <code>Active</code> means that the key is valid, while <code>Inactive</code> means it is not.
     * @see StatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the access key.
     * </p>
     * <p>
     * A status of <code>Active</code> means that the key is valid, while <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the access key.</p>
     *        <p>
     *        A status of <code>Active</code> means that the key is valid, while <code>Inactive</code> means it is not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public AccessKey withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the access key.
     * </p>
     * <p>
     * A status of <code>Active</code> means that the key is valid, while <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the access key.</p>
     *        <p>
     *        A status of <code>Active</code> means that the key is valid, while <code>Inactive</code> means it is not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public AccessKey withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the access key was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the access key was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the access key was created.
     * </p>
     * 
     * @return The timestamp when the access key was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the access key was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the access key was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKey withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append("***Sensitive Data Redacted***").append(",");
        if (getSecretAccessKey() != null)
            sb.append("SecretAccessKey: ").append(getSecretAccessKey()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessKey == false)
            return false;
        AccessKey other = (AccessKey) obj;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getSecretAccessKey() == null ^ this.getSecretAccessKey() == null)
            return false;
        if (other.getSecretAccessKey() != null && other.getSecretAccessKey().equals(this.getSecretAccessKey()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecretAccessKey() == null) ? 0 : getSecretAccessKey().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AccessKey clone() {
        try {
            return (AccessKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.AccessKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
