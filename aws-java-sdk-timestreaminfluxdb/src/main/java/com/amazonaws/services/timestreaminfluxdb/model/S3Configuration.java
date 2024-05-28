/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreaminfluxdb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for S3 bucket log delivery.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/S3Configuration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Configuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket to deliver logs to.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * Indicates whether log delivery to the S3 bucket is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The name of the S3 bucket to deliver logs to.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket to deliver logs to.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket to deliver logs to.
     * </p>
     * 
     * @return The name of the S3 bucket to deliver logs to.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket to deliver logs to.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket to deliver logs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Configuration withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * Indicates whether log delivery to the S3 bucket is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether log delivery to the S3 bucket is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether log delivery to the S3 bucket is enabled.
     * </p>
     * 
     * @return Indicates whether log delivery to the S3 bucket is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether log delivery to the S3 bucket is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether log delivery to the S3 bucket is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Configuration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether log delivery to the S3 bucket is enabled.
     * </p>
     * 
     * @return Indicates whether log delivery to the S3 bucket is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Configuration == false)
            return false;
        S3Configuration other = (S3Configuration) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public S3Configuration clone() {
        try {
            return (S3Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreaminfluxdb.model.transform.S3ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
