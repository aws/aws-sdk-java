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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The location of the pipeline definition stored in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/PipelineDefinitionS3Location"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineDefinitionS3Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The object key (or key name) uniquely identifies the object in an S3 bucket.
     * </p>
     */
    private String objectKey;
    /**
     * <p>
     * Version Id of the pipeline definition file. If not specified, Amazon SageMaker will retrieve the latest version.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @param bucket
     *        Name of the S3 bucket.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @return Name of the S3 bucket.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @param bucket
     *        Name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDefinitionS3Location withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The object key (or key name) uniquely identifies the object in an S3 bucket.
     * </p>
     * 
     * @param objectKey
     *        The object key (or key name) uniquely identifies the object in an S3 bucket.
     */

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    /**
     * <p>
     * The object key (or key name) uniquely identifies the object in an S3 bucket.
     * </p>
     * 
     * @return The object key (or key name) uniquely identifies the object in an S3 bucket.
     */

    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * <p>
     * The object key (or key name) uniquely identifies the object in an S3 bucket.
     * </p>
     * 
     * @param objectKey
     *        The object key (or key name) uniquely identifies the object in an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDefinitionS3Location withObjectKey(String objectKey) {
        setObjectKey(objectKey);
        return this;
    }

    /**
     * <p>
     * Version Id of the pipeline definition file. If not specified, Amazon SageMaker will retrieve the latest version.
     * </p>
     * 
     * @param versionId
     *        Version Id of the pipeline definition file. If not specified, Amazon SageMaker will retrieve the latest
     *        version.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Version Id of the pipeline definition file. If not specified, Amazon SageMaker will retrieve the latest version.
     * </p>
     * 
     * @return Version Id of the pipeline definition file. If not specified, Amazon SageMaker will retrieve the latest
     *         version.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * Version Id of the pipeline definition file. If not specified, Amazon SageMaker will retrieve the latest version.
     * </p>
     * 
     * @param versionId
     *        Version Id of the pipeline definition file. If not specified, Amazon SageMaker will retrieve the latest
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDefinitionS3Location withVersionId(String versionId) {
        setVersionId(versionId);
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
        if (getObjectKey() != null)
            sb.append("ObjectKey: ").append(getObjectKey()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineDefinitionS3Location == false)
            return false;
        PipelineDefinitionS3Location other = (PipelineDefinitionS3Location) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getObjectKey() == null ^ this.getObjectKey() == null)
            return false;
        if (other.getObjectKey() != null && other.getObjectKey().equals(this.getObjectKey()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getObjectKey() == null) ? 0 : getObjectKey().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public PipelineDefinitionS3Location clone() {
        try {
            return (PipelineDefinitionS3Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.PipelineDefinitionS3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
