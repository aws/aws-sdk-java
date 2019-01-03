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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an action to publish data to an Amazon SQS queue.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqsAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The URL of the Amazon SQS queue.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * Specifies whether to use Base64 encoding.
     * </p>
     */
    private Boolean useBase64;

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @return The ARN of the IAM role that grants access.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqsAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue.
     * </p>
     * 
     * @return The URL of the Amazon SQS queue.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqsAction withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * Specifies whether to use Base64 encoding.
     * </p>
     * 
     * @param useBase64
     *        Specifies whether to use Base64 encoding.
     */

    public void setUseBase64(Boolean useBase64) {
        this.useBase64 = useBase64;
    }

    /**
     * <p>
     * Specifies whether to use Base64 encoding.
     * </p>
     * 
     * @return Specifies whether to use Base64 encoding.
     */

    public Boolean getUseBase64() {
        return this.useBase64;
    }

    /**
     * <p>
     * Specifies whether to use Base64 encoding.
     * </p>
     * 
     * @param useBase64
     *        Specifies whether to use Base64 encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqsAction withUseBase64(Boolean useBase64) {
        setUseBase64(useBase64);
        return this;
    }

    /**
     * <p>
     * Specifies whether to use Base64 encoding.
     * </p>
     * 
     * @return Specifies whether to use Base64 encoding.
     */

    public Boolean isUseBase64() {
        return this.useBase64;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getQueueUrl() != null)
            sb.append("QueueUrl: ").append(getQueueUrl()).append(",");
        if (getUseBase64() != null)
            sb.append("UseBase64: ").append(getUseBase64());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqsAction == false)
            return false;
        SqsAction other = (SqsAction) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getUseBase64() == null ^ this.getUseBase64() == null)
            return false;
        if (other.getUseBase64() != null && other.getUseBase64().equals(this.getUseBase64()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getUseBase64() == null) ? 0 : getUseBase64().hashCode());
        return hashCode;
    }

    @Override
    public SqsAction clone() {
        try {
            return (SqsAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.SqsActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
