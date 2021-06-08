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
import com.amazonaws.services.ec2.model.transform.CreateRestoreImageTaskRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRestoreImageTaskRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateRestoreImageTaskRequest> {

    /**
     * <p>
     * The name of the S3 bucket that contains the stored AMI object.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The name of the stored AMI object in the bucket.
     * </p>
     */
    private String objectKey;
    /**
     * <p>
     * The name for the restored AMI. The name must be unique for AMIs in the Region for this account. If you do not
     * provide a name, the new AMI gets the same name as the original AMI.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The tags to apply to the AMI and snapshots on restoration. You can tag the AMI, the snapshots, or both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To tag the AMI, the value for <code>ResourceType</code> must be <code>image</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To tag the snapshots, the value for <code>ResourceType</code> must be <code>snapshot</code>. The same tag is
     * applied to all of the snapshots that are created.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The name of the S3 bucket that contains the stored AMI object.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket that contains the stored AMI object.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket that contains the stored AMI object.
     * </p>
     * 
     * @return The name of the S3 bucket that contains the stored AMI object.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket that contains the stored AMI object.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket that contains the stored AMI object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreImageTaskRequest withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The name of the stored AMI object in the bucket.
     * </p>
     * 
     * @param objectKey
     *        The name of the stored AMI object in the bucket.
     */

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    /**
     * <p>
     * The name of the stored AMI object in the bucket.
     * </p>
     * 
     * @return The name of the stored AMI object in the bucket.
     */

    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * <p>
     * The name of the stored AMI object in the bucket.
     * </p>
     * 
     * @param objectKey
     *        The name of the stored AMI object in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreImageTaskRequest withObjectKey(String objectKey) {
        setObjectKey(objectKey);
        return this;
    }

    /**
     * <p>
     * The name for the restored AMI. The name must be unique for AMIs in the Region for this account. If you do not
     * provide a name, the new AMI gets the same name as the original AMI.
     * </p>
     * 
     * @param name
     *        The name for the restored AMI. The name must be unique for AMIs in the Region for this account. If you do
     *        not provide a name, the new AMI gets the same name as the original AMI.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the restored AMI. The name must be unique for AMIs in the Region for this account. If you do not
     * provide a name, the new AMI gets the same name as the original AMI.
     * </p>
     * 
     * @return The name for the restored AMI. The name must be unique for AMIs in the Region for this account. If you do
     *         not provide a name, the new AMI gets the same name as the original AMI.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the restored AMI. The name must be unique for AMIs in the Region for this account. If you do not
     * provide a name, the new AMI gets the same name as the original AMI.
     * </p>
     * 
     * @param name
     *        The name for the restored AMI. The name must be unique for AMIs in the Region for this account. If you do
     *        not provide a name, the new AMI gets the same name as the original AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreImageTaskRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the AMI and snapshots on restoration. You can tag the AMI, the snapshots, or both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To tag the AMI, the value for <code>ResourceType</code> must be <code>image</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To tag the snapshots, the value for <code>ResourceType</code> must be <code>snapshot</code>. The same tag is
     * applied to all of the snapshots that are created.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The tags to apply to the AMI and snapshots on restoration. You can tag the AMI, the snapshots, or
     *         both.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To tag the AMI, the value for <code>ResourceType</code> must be <code>image</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To tag the snapshots, the value for <code>ResourceType</code> must be <code>snapshot</code>. The same tag
     *         is applied to all of the snapshots that are created.
     *         </p>
     *         </li>
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the AMI and snapshots on restoration. You can tag the AMI, the snapshots, or both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To tag the AMI, the value for <code>ResourceType</code> must be <code>image</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To tag the snapshots, the value for <code>ResourceType</code> must be <code>snapshot</code>. The same tag is
     * applied to all of the snapshots that are created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagSpecifications
     *        The tags to apply to the AMI and snapshots on restoration. You can tag the AMI, the snapshots, or
     *        both.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To tag the AMI, the value for <code>ResourceType</code> must be <code>image</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To tag the snapshots, the value for <code>ResourceType</code> must be <code>snapshot</code>. The same tag
     *        is applied to all of the snapshots that are created.
     *        </p>
     *        </li>
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the AMI and snapshots on restoration. You can tag the AMI, the snapshots, or both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To tag the AMI, the value for <code>ResourceType</code> must be <code>image</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To tag the snapshots, the value for <code>ResourceType</code> must be <code>snapshot</code>. The same tag is
     * applied to all of the snapshots that are created.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the AMI and snapshots on restoration. You can tag the AMI, the snapshots, or
     *        both.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To tag the AMI, the value for <code>ResourceType</code> must be <code>image</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To tag the snapshots, the value for <code>ResourceType</code> must be <code>snapshot</code>. The same tag
     *        is applied to all of the snapshots that are created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreImageTaskRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the AMI and snapshots on restoration. You can tag the AMI, the snapshots, or both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To tag the AMI, the value for <code>ResourceType</code> must be <code>image</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To tag the snapshots, the value for <code>ResourceType</code> must be <code>snapshot</code>. The same tag is
     * applied to all of the snapshots that are created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagSpecifications
     *        The tags to apply to the AMI and snapshots on restoration. You can tag the AMI, the snapshots, or
     *        both.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To tag the AMI, the value for <code>ResourceType</code> must be <code>image</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To tag the snapshots, the value for <code>ResourceType</code> must be <code>snapshot</code>. The same tag
     *        is applied to all of the snapshots that are created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreImageTaskRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateRestoreImageTaskRequest> getDryRunRequest() {
        Request<CreateRestoreImageTaskRequest> request = new CreateRestoreImageTaskRequestMarshaller().marshall(this);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getObjectKey() != null)
            sb.append("ObjectKey: ").append(getObjectKey()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRestoreImageTaskRequest == false)
            return false;
        CreateRestoreImageTaskRequest other = (CreateRestoreImageTaskRequest) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getObjectKey() == null ^ this.getObjectKey() == null)
            return false;
        if (other.getObjectKey() != null && other.getObjectKey().equals(this.getObjectKey()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getObjectKey() == null) ? 0 : getObjectKey().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateRestoreImageTaskRequest clone() {
        return (CreateRestoreImageTaskRequest) super.clone();
    }
}
