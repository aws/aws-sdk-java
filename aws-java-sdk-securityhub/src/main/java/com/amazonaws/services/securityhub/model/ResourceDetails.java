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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides additional details about the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ResourceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details of an AWS EC2 instance.
     * </p>
     */
    private AwsEc2InstanceDetails awsEc2Instance;
    /**
     * <p>
     * The details of an AWS S3 Bucket.
     * </p>
     */
    private AwsS3BucketDetails awsS3Bucket;
    /**
     * <p>
     * AWS IAM access key details related to a finding.
     * </p>
     */
    private AwsIamAccessKeyDetails awsIamAccessKey;
    /**
     * <p>
     * Container details related to a finding.
     * </p>
     */
    private ContainerDetails container;
    /**
     * <p>
     * The details of a resource that does not have a specific sub-field for the resource type defined.
     * </p>
     */
    private java.util.Map<String, String> other;

    /**
     * <p>
     * The details of an AWS EC2 instance.
     * </p>
     * 
     * @param awsEc2Instance
     *        The details of an AWS EC2 instance.
     */

    public void setAwsEc2Instance(AwsEc2InstanceDetails awsEc2Instance) {
        this.awsEc2Instance = awsEc2Instance;
    }

    /**
     * <p>
     * The details of an AWS EC2 instance.
     * </p>
     * 
     * @return The details of an AWS EC2 instance.
     */

    public AwsEc2InstanceDetails getAwsEc2Instance() {
        return this.awsEc2Instance;
    }

    /**
     * <p>
     * The details of an AWS EC2 instance.
     * </p>
     * 
     * @param awsEc2Instance
     *        The details of an AWS EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2Instance(AwsEc2InstanceDetails awsEc2Instance) {
        setAwsEc2Instance(awsEc2Instance);
        return this;
    }

    /**
     * <p>
     * The details of an AWS S3 Bucket.
     * </p>
     * 
     * @param awsS3Bucket
     *        The details of an AWS S3 Bucket.
     */

    public void setAwsS3Bucket(AwsS3BucketDetails awsS3Bucket) {
        this.awsS3Bucket = awsS3Bucket;
    }

    /**
     * <p>
     * The details of an AWS S3 Bucket.
     * </p>
     * 
     * @return The details of an AWS S3 Bucket.
     */

    public AwsS3BucketDetails getAwsS3Bucket() {
        return this.awsS3Bucket;
    }

    /**
     * <p>
     * The details of an AWS S3 Bucket.
     * </p>
     * 
     * @param awsS3Bucket
     *        The details of an AWS S3 Bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsS3Bucket(AwsS3BucketDetails awsS3Bucket) {
        setAwsS3Bucket(awsS3Bucket);
        return this;
    }

    /**
     * <p>
     * AWS IAM access key details related to a finding.
     * </p>
     * 
     * @param awsIamAccessKey
     *        AWS IAM access key details related to a finding.
     */

    public void setAwsIamAccessKey(AwsIamAccessKeyDetails awsIamAccessKey) {
        this.awsIamAccessKey = awsIamAccessKey;
    }

    /**
     * <p>
     * AWS IAM access key details related to a finding.
     * </p>
     * 
     * @return AWS IAM access key details related to a finding.
     */

    public AwsIamAccessKeyDetails getAwsIamAccessKey() {
        return this.awsIamAccessKey;
    }

    /**
     * <p>
     * AWS IAM access key details related to a finding.
     * </p>
     * 
     * @param awsIamAccessKey
     *        AWS IAM access key details related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsIamAccessKey(AwsIamAccessKeyDetails awsIamAccessKey) {
        setAwsIamAccessKey(awsIamAccessKey);
        return this;
    }

    /**
     * <p>
     * Container details related to a finding.
     * </p>
     * 
     * @param container
     *        Container details related to a finding.
     */

    public void setContainer(ContainerDetails container) {
        this.container = container;
    }

    /**
     * <p>
     * Container details related to a finding.
     * </p>
     * 
     * @return Container details related to a finding.
     */

    public ContainerDetails getContainer() {
        return this.container;
    }

    /**
     * <p>
     * Container details related to a finding.
     * </p>
     * 
     * @param container
     *        Container details related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withContainer(ContainerDetails container) {
        setContainer(container);
        return this;
    }

    /**
     * <p>
     * The details of a resource that does not have a specific sub-field for the resource type defined.
     * </p>
     * 
     * @return The details of a resource that does not have a specific sub-field for the resource type defined.
     */

    public java.util.Map<String, String> getOther() {
        return other;
    }

    /**
     * <p>
     * The details of a resource that does not have a specific sub-field for the resource type defined.
     * </p>
     * 
     * @param other
     *        The details of a resource that does not have a specific sub-field for the resource type defined.
     */

    public void setOther(java.util.Map<String, String> other) {
        this.other = other;
    }

    /**
     * <p>
     * The details of a resource that does not have a specific sub-field for the resource type defined.
     * </p>
     * 
     * @param other
     *        The details of a resource that does not have a specific sub-field for the resource type defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withOther(java.util.Map<String, String> other) {
        setOther(other);
        return this;
    }

    public ResourceDetails addOtherEntry(String key, String value) {
        if (null == this.other) {
            this.other = new java.util.HashMap<String, String>();
        }
        if (this.other.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.other.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Other.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails clearOtherEntries() {
        this.other = null;
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
        if (getAwsEc2Instance() != null)
            sb.append("AwsEc2Instance: ").append(getAwsEc2Instance()).append(",");
        if (getAwsS3Bucket() != null)
            sb.append("AwsS3Bucket: ").append(getAwsS3Bucket()).append(",");
        if (getAwsIamAccessKey() != null)
            sb.append("AwsIamAccessKey: ").append(getAwsIamAccessKey()).append(",");
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getOther() != null)
            sb.append("Other: ").append(getOther());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDetails == false)
            return false;
        ResourceDetails other = (ResourceDetails) obj;
        if (other.getAwsEc2Instance() == null ^ this.getAwsEc2Instance() == null)
            return false;
        if (other.getAwsEc2Instance() != null && other.getAwsEc2Instance().equals(this.getAwsEc2Instance()) == false)
            return false;
        if (other.getAwsS3Bucket() == null ^ this.getAwsS3Bucket() == null)
            return false;
        if (other.getAwsS3Bucket() != null && other.getAwsS3Bucket().equals(this.getAwsS3Bucket()) == false)
            return false;
        if (other.getAwsIamAccessKey() == null ^ this.getAwsIamAccessKey() == null)
            return false;
        if (other.getAwsIamAccessKey() != null && other.getAwsIamAccessKey().equals(this.getAwsIamAccessKey()) == false)
            return false;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getOther() == null ^ this.getOther() == null)
            return false;
        if (other.getOther() != null && other.getOther().equals(this.getOther()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsEc2Instance() == null) ? 0 : getAwsEc2Instance().hashCode());
        hashCode = prime * hashCode + ((getAwsS3Bucket() == null) ? 0 : getAwsS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getAwsIamAccessKey() == null) ? 0 : getAwsIamAccessKey().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getOther() == null) ? 0 : getOther().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDetails clone() {
        try {
            return (ResourceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ResourceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
