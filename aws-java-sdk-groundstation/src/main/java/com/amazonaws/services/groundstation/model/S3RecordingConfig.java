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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an S3 recording <code>Config</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/S3RecordingConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3RecordingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the bucket to record to.
     * </p>
     */
    private String bucketArn;
    /**
     * <p>
     * S3 Key prefix to prefice data files.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * ARN of the role Ground Station assumes to write data to the bucket.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * ARN of the bucket to record to.
     * </p>
     * 
     * @param bucketArn
     *        ARN of the bucket to record to.
     */

    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * <p>
     * ARN of the bucket to record to.
     * </p>
     * 
     * @return ARN of the bucket to record to.
     */

    public String getBucketArn() {
        return this.bucketArn;
    }

    /**
     * <p>
     * ARN of the bucket to record to.
     * </p>
     * 
     * @param bucketArn
     *        ARN of the bucket to record to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3RecordingConfig withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
        return this;
    }

    /**
     * <p>
     * S3 Key prefix to prefice data files.
     * </p>
     * 
     * @param prefix
     *        S3 Key prefix to prefice data files.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * S3 Key prefix to prefice data files.
     * </p>
     * 
     * @return S3 Key prefix to prefice data files.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * S3 Key prefix to prefice data files.
     * </p>
     * 
     * @param prefix
     *        S3 Key prefix to prefice data files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3RecordingConfig withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * ARN of the role Ground Station assumes to write data to the bucket.
     * </p>
     * 
     * @param roleArn
     *        ARN of the role Ground Station assumes to write data to the bucket.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * ARN of the role Ground Station assumes to write data to the bucket.
     * </p>
     * 
     * @return ARN of the role Ground Station assumes to write data to the bucket.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * ARN of the role Ground Station assumes to write data to the bucket.
     * </p>
     * 
     * @param roleArn
     *        ARN of the role Ground Station assumes to write data to the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3RecordingConfig withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getBucketArn() != null)
            sb.append("BucketArn: ").append(getBucketArn()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3RecordingConfig == false)
            return false;
        S3RecordingConfig other = (S3RecordingConfig) obj;
        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public S3RecordingConfig clone() {
        try {
            return (S3RecordingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.S3RecordingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
