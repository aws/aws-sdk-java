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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about delivering logs to Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/S3LogDelivery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3LogDelivery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket that is the destination for log delivery.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * Specifies whether connector logs get sent to the specified Amazon S3 destination.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The S3 prefix that is the destination for log delivery.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The name of the S3 bucket that is the destination for log delivery.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket that is the destination for log delivery.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket that is the destination for log delivery.
     * </p>
     * 
     * @return The name of the S3 bucket that is the destination for log delivery.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket that is the destination for log delivery.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket that is the destination for log delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3LogDelivery withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * Specifies whether connector logs get sent to the specified Amazon S3 destination.
     * </p>
     * 
     * @param enabled
     *        Specifies whether connector logs get sent to the specified Amazon S3 destination.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether connector logs get sent to the specified Amazon S3 destination.
     * </p>
     * 
     * @return Specifies whether connector logs get sent to the specified Amazon S3 destination.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether connector logs get sent to the specified Amazon S3 destination.
     * </p>
     * 
     * @param enabled
     *        Specifies whether connector logs get sent to the specified Amazon S3 destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3LogDelivery withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether connector logs get sent to the specified Amazon S3 destination.
     * </p>
     * 
     * @return Specifies whether connector logs get sent to the specified Amazon S3 destination.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The S3 prefix that is the destination for log delivery.
     * </p>
     * 
     * @param prefix
     *        The S3 prefix that is the destination for log delivery.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The S3 prefix that is the destination for log delivery.
     * </p>
     * 
     * @return The S3 prefix that is the destination for log delivery.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The S3 prefix that is the destination for log delivery.
     * </p>
     * 
     * @param prefix
     *        The S3 prefix that is the destination for log delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3LogDelivery withPrefix(String prefix) {
        setPrefix(prefix);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3LogDelivery == false)
            return false;
        S3LogDelivery other = (S3LogDelivery) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public S3LogDelivery clone() {
        try {
            return (S3LogDelivery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.S3LogDeliveryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
