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
package com.amazonaws.services.macie.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The S3 resources whose classification types you want to update. This data type is used as a request parameter in the
 * UpdateS3Resources action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/S3ResourceClassificationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ResourceClassificationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket whose classification types you want to update.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The prefix of the S3 bucket whose classification types you want to update.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The classification type that you want to update for the resource associated with Amazon Macie.
     * </p>
     */
    private ClassificationTypeUpdate classificationTypeUpdate;

    /**
     * <p>
     * The name of the S3 bucket whose classification types you want to update.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket whose classification types you want to update.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket whose classification types you want to update.
     * </p>
     * 
     * @return The name of the S3 bucket whose classification types you want to update.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket whose classification types you want to update.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket whose classification types you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ResourceClassificationUpdate withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The prefix of the S3 bucket whose classification types you want to update.
     * </p>
     * 
     * @param prefix
     *        The prefix of the S3 bucket whose classification types you want to update.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix of the S3 bucket whose classification types you want to update.
     * </p>
     * 
     * @return The prefix of the S3 bucket whose classification types you want to update.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The prefix of the S3 bucket whose classification types you want to update.
     * </p>
     * 
     * @param prefix
     *        The prefix of the S3 bucket whose classification types you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ResourceClassificationUpdate withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The classification type that you want to update for the resource associated with Amazon Macie.
     * </p>
     * 
     * @param classificationTypeUpdate
     *        The classification type that you want to update for the resource associated with Amazon Macie.
     */

    public void setClassificationTypeUpdate(ClassificationTypeUpdate classificationTypeUpdate) {
        this.classificationTypeUpdate = classificationTypeUpdate;
    }

    /**
     * <p>
     * The classification type that you want to update for the resource associated with Amazon Macie.
     * </p>
     * 
     * @return The classification type that you want to update for the resource associated with Amazon Macie.
     */

    public ClassificationTypeUpdate getClassificationTypeUpdate() {
        return this.classificationTypeUpdate;
    }

    /**
     * <p>
     * The classification type that you want to update for the resource associated with Amazon Macie.
     * </p>
     * 
     * @param classificationTypeUpdate
     *        The classification type that you want to update for the resource associated with Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ResourceClassificationUpdate withClassificationTypeUpdate(ClassificationTypeUpdate classificationTypeUpdate) {
        setClassificationTypeUpdate(classificationTypeUpdate);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getClassificationTypeUpdate() != null)
            sb.append("ClassificationTypeUpdate: ").append(getClassificationTypeUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ResourceClassificationUpdate == false)
            return false;
        S3ResourceClassificationUpdate other = (S3ResourceClassificationUpdate) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getClassificationTypeUpdate() == null ^ this.getClassificationTypeUpdate() == null)
            return false;
        if (other.getClassificationTypeUpdate() != null && other.getClassificationTypeUpdate().equals(this.getClassificationTypeUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getClassificationTypeUpdate() == null) ? 0 : getClassificationTypeUpdate().hashCode());
        return hashCode;
    }

    @Override
    public S3ResourceClassificationUpdate clone() {
        try {
            return (S3ResourceClassificationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie.model.transform.S3ResourceClassificationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
