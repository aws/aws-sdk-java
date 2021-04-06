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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateStoreImageTaskRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStoreImageTaskRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateStoreImageTaskRequest> {

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The name of the S3 bucket in which the AMI object will be stored. The bucket must be in the Region in which the
     * request is being made. The AMI object appears in the bucket only after the upload task has completed.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The tags to apply to the AMI object that will be stored in the S3 bucket.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<S3ObjectTag> s3ObjectTags;

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @return The ID of the AMI.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStoreImageTaskRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket in which the AMI object will be stored. The bucket must be in the Region in which the
     * request is being made. The AMI object appears in the bucket only after the upload task has completed.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket in which the AMI object will be stored. The bucket must be in the Region in
     *        which the request is being made. The AMI object appears in the bucket only after the upload task has
     *        completed.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket in which the AMI object will be stored. The bucket must be in the Region in which the
     * request is being made. The AMI object appears in the bucket only after the upload task has completed.
     * </p>
     * 
     * @return The name of the S3 bucket in which the AMI object will be stored. The bucket must be in the Region in
     *         which the request is being made. The AMI object appears in the bucket only after the upload task has
     *         completed.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket in which the AMI object will be stored. The bucket must be in the Region in which the
     * request is being made. The AMI object appears in the bucket only after the upload task has completed.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket in which the AMI object will be stored. The bucket must be in the Region in
     *        which the request is being made. The AMI object appears in the bucket only after the upload task has
     *        completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStoreImageTaskRequest withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the AMI object that will be stored in the S3 bucket.
     * </p>
     * 
     * @return The tags to apply to the AMI object that will be stored in the S3 bucket.
     */

    public java.util.List<S3ObjectTag> getS3ObjectTags() {
        if (s3ObjectTags == null) {
            s3ObjectTags = new com.amazonaws.internal.SdkInternalList<S3ObjectTag>();
        }
        return s3ObjectTags;
    }

    /**
     * <p>
     * The tags to apply to the AMI object that will be stored in the S3 bucket.
     * </p>
     * 
     * @param s3ObjectTags
     *        The tags to apply to the AMI object that will be stored in the S3 bucket.
     */

    public void setS3ObjectTags(java.util.Collection<S3ObjectTag> s3ObjectTags) {
        if (s3ObjectTags == null) {
            this.s3ObjectTags = null;
            return;
        }

        this.s3ObjectTags = new com.amazonaws.internal.SdkInternalList<S3ObjectTag>(s3ObjectTags);
    }

    /**
     * <p>
     * The tags to apply to the AMI object that will be stored in the S3 bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3ObjectTags(java.util.Collection)} or {@link #withS3ObjectTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param s3ObjectTags
     *        The tags to apply to the AMI object that will be stored in the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStoreImageTaskRequest withS3ObjectTags(S3ObjectTag... s3ObjectTags) {
        if (this.s3ObjectTags == null) {
            setS3ObjectTags(new com.amazonaws.internal.SdkInternalList<S3ObjectTag>(s3ObjectTags.length));
        }
        for (S3ObjectTag ele : s3ObjectTags) {
            this.s3ObjectTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the AMI object that will be stored in the S3 bucket.
     * </p>
     * 
     * @param s3ObjectTags
     *        The tags to apply to the AMI object that will be stored in the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStoreImageTaskRequest withS3ObjectTags(java.util.Collection<S3ObjectTag> s3ObjectTags) {
        setS3ObjectTags(s3ObjectTags);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateStoreImageTaskRequest> getDryRunRequest() {
        Request<CreateStoreImageTaskRequest> request = new CreateStoreImageTaskRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getS3ObjectTags() != null)
            sb.append("S3ObjectTags: ").append(getS3ObjectTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStoreImageTaskRequest == false)
            return false;
        CreateStoreImageTaskRequest other = (CreateStoreImageTaskRequest) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getS3ObjectTags() == null ^ this.getS3ObjectTags() == null)
            return false;
        if (other.getS3ObjectTags() != null && other.getS3ObjectTags().equals(this.getS3ObjectTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getS3ObjectTags() == null) ? 0 : getS3ObjectTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateStoreImageTaskRequest clone() {
        return (CreateStoreImageTaskRequest) super.clone();
    }
}
