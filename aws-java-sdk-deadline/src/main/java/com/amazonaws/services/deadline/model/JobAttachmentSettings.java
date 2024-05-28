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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The job attachment settings. These are the Amazon S3 bucket name and the Amazon S3 prefix.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/JobAttachmentSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobAttachmentSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The root prefix.
     * </p>
     */
    private String rootPrefix;
    /**
     * <p>
     * The Amazon S3 bucket name.
     * </p>
     */
    private String s3BucketName;

    /**
     * <p>
     * The root prefix.
     * </p>
     * 
     * @param rootPrefix
     *        The root prefix.
     */

    public void setRootPrefix(String rootPrefix) {
        this.rootPrefix = rootPrefix;
    }

    /**
     * <p>
     * The root prefix.
     * </p>
     * 
     * @return The root prefix.
     */

    public String getRootPrefix() {
        return this.rootPrefix;
    }

    /**
     * <p>
     * The root prefix.
     * </p>
     * 
     * @param rootPrefix
     *        The root prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobAttachmentSettings withRootPrefix(String rootPrefix) {
        setRootPrefix(rootPrefix);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket name.
     * </p>
     * 
     * @param s3BucketName
     *        The Amazon S3 bucket name.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket name.
     * </p>
     * 
     * @return The Amazon S3 bucket name.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket name.
     * </p>
     * 
     * @param s3BucketName
     *        The Amazon S3 bucket name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobAttachmentSettings withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
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
        if (getRootPrefix() != null)
            sb.append("RootPrefix: ").append(getRootPrefix()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobAttachmentSettings == false)
            return false;
        JobAttachmentSettings other = (JobAttachmentSettings) obj;
        if (other.getRootPrefix() == null ^ this.getRootPrefix() == null)
            return false;
        if (other.getRootPrefix() != null && other.getRootPrefix().equals(this.getRootPrefix()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRootPrefix() == null) ? 0 : getRootPrefix().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        return hashCode;
    }

    @Override
    public JobAttachmentSettings clone() {
        try {
            return (JobAttachmentSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.JobAttachmentSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
