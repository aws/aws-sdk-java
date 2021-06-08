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
 * Details about an S3 recording <code>Config</code> used in a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/S3RecordingDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3RecordingDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the bucket used.
     * </p>
     */
    private String bucketArn;
    /**
     * <p>
     * Template of the S3 key used.
     * </p>
     */
    private String keyTemplate;

    /**
     * <p>
     * ARN of the bucket used.
     * </p>
     * 
     * @param bucketArn
     *        ARN of the bucket used.
     */

    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * <p>
     * ARN of the bucket used.
     * </p>
     * 
     * @return ARN of the bucket used.
     */

    public String getBucketArn() {
        return this.bucketArn;
    }

    /**
     * <p>
     * ARN of the bucket used.
     * </p>
     * 
     * @param bucketArn
     *        ARN of the bucket used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3RecordingDetails withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
        return this;
    }

    /**
     * <p>
     * Template of the S3 key used.
     * </p>
     * 
     * @param keyTemplate
     *        Template of the S3 key used.
     */

    public void setKeyTemplate(String keyTemplate) {
        this.keyTemplate = keyTemplate;
    }

    /**
     * <p>
     * Template of the S3 key used.
     * </p>
     * 
     * @return Template of the S3 key used.
     */

    public String getKeyTemplate() {
        return this.keyTemplate;
    }

    /**
     * <p>
     * Template of the S3 key used.
     * </p>
     * 
     * @param keyTemplate
     *        Template of the S3 key used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3RecordingDetails withKeyTemplate(String keyTemplate) {
        setKeyTemplate(keyTemplate);
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
        if (getKeyTemplate() != null)
            sb.append("KeyTemplate: ").append(getKeyTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3RecordingDetails == false)
            return false;
        S3RecordingDetails other = (S3RecordingDetails) obj;
        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        if (other.getKeyTemplate() == null ^ this.getKeyTemplate() == null)
            return false;
        if (other.getKeyTemplate() != null && other.getKeyTemplate().equals(this.getKeyTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        hashCode = prime * hashCode + ((getKeyTemplate() == null) ? 0 : getKeyTemplate().hashCode());
        return hashCode;
    }

    @Override
    public S3RecordingDetails clone() {
        try {
            return (S3RecordingDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.S3RecordingDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
