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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the AWS resource associated with the activity that prompted GuardDuty to generate a
 * finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IAM access key details (IAM user information) of a user that engaged in the activity that prompted GuardDuty
     * to generate a finding.
     * </p>
     */
    private AccessKeyDetails accessKeyDetails;
    /**
     * <p>
     * Contains information on the S3 bucket.
     * </p>
     */
    private java.util.List<S3BucketDetail> s3BucketDetails;
    /**
     * <p>
     * The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a
     * finding.
     * </p>
     */
    private InstanceDetails instanceDetails;
    /**
     * <p>
     * The type of AWS resource.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The IAM access key details (IAM user information) of a user that engaged in the activity that prompted GuardDuty
     * to generate a finding.
     * </p>
     * 
     * @param accessKeyDetails
     *        The IAM access key details (IAM user information) of a user that engaged in the activity that prompted
     *        GuardDuty to generate a finding.
     */

    public void setAccessKeyDetails(AccessKeyDetails accessKeyDetails) {
        this.accessKeyDetails = accessKeyDetails;
    }

    /**
     * <p>
     * The IAM access key details (IAM user information) of a user that engaged in the activity that prompted GuardDuty
     * to generate a finding.
     * </p>
     * 
     * @return The IAM access key details (IAM user information) of a user that engaged in the activity that prompted
     *         GuardDuty to generate a finding.
     */

    public AccessKeyDetails getAccessKeyDetails() {
        return this.accessKeyDetails;
    }

    /**
     * <p>
     * The IAM access key details (IAM user information) of a user that engaged in the activity that prompted GuardDuty
     * to generate a finding.
     * </p>
     * 
     * @param accessKeyDetails
     *        The IAM access key details (IAM user information) of a user that engaged in the activity that prompted
     *        GuardDuty to generate a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withAccessKeyDetails(AccessKeyDetails accessKeyDetails) {
        setAccessKeyDetails(accessKeyDetails);
        return this;
    }

    /**
     * <p>
     * Contains information on the S3 bucket.
     * </p>
     * 
     * @return Contains information on the S3 bucket.
     */

    public java.util.List<S3BucketDetail> getS3BucketDetails() {
        return s3BucketDetails;
    }

    /**
     * <p>
     * Contains information on the S3 bucket.
     * </p>
     * 
     * @param s3BucketDetails
     *        Contains information on the S3 bucket.
     */

    public void setS3BucketDetails(java.util.Collection<S3BucketDetail> s3BucketDetails) {
        if (s3BucketDetails == null) {
            this.s3BucketDetails = null;
            return;
        }

        this.s3BucketDetails = new java.util.ArrayList<S3BucketDetail>(s3BucketDetails);
    }

    /**
     * <p>
     * Contains information on the S3 bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3BucketDetails(java.util.Collection)} or {@link #withS3BucketDetails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param s3BucketDetails
     *        Contains information on the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withS3BucketDetails(S3BucketDetail... s3BucketDetails) {
        if (this.s3BucketDetails == null) {
            setS3BucketDetails(new java.util.ArrayList<S3BucketDetail>(s3BucketDetails.length));
        }
        for (S3BucketDetail ele : s3BucketDetails) {
            this.s3BucketDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information on the S3 bucket.
     * </p>
     * 
     * @param s3BucketDetails
     *        Contains information on the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withS3BucketDetails(java.util.Collection<S3BucketDetail> s3BucketDetails) {
        setS3BucketDetails(s3BucketDetails);
        return this;
    }

    /**
     * <p>
     * The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a
     * finding.
     * </p>
     * 
     * @param instanceDetails
     *        The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a
     *        finding.
     */

    public void setInstanceDetails(InstanceDetails instanceDetails) {
        this.instanceDetails = instanceDetails;
    }

    /**
     * <p>
     * The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a
     * finding.
     * </p>
     * 
     * @return The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a
     *         finding.
     */

    public InstanceDetails getInstanceDetails() {
        return this.instanceDetails;
    }

    /**
     * <p>
     * The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a
     * finding.
     * </p>
     * 
     * @param instanceDetails
     *        The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a
     *        finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withInstanceDetails(InstanceDetails instanceDetails) {
        setInstanceDetails(instanceDetails);
        return this;
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     * 
     * @return The type of AWS resource.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getAccessKeyDetails() != null)
            sb.append("AccessKeyDetails: ").append(getAccessKeyDetails()).append(",");
        if (getS3BucketDetails() != null)
            sb.append("S3BucketDetails: ").append(getS3BucketDetails()).append(",");
        if (getInstanceDetails() != null)
            sb.append("InstanceDetails: ").append(getInstanceDetails()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getAccessKeyDetails() == null ^ this.getAccessKeyDetails() == null)
            return false;
        if (other.getAccessKeyDetails() != null && other.getAccessKeyDetails().equals(this.getAccessKeyDetails()) == false)
            return false;
        if (other.getS3BucketDetails() == null ^ this.getS3BucketDetails() == null)
            return false;
        if (other.getS3BucketDetails() != null && other.getS3BucketDetails().equals(this.getS3BucketDetails()) == false)
            return false;
        if (other.getInstanceDetails() == null ^ this.getInstanceDetails() == null)
            return false;
        if (other.getInstanceDetails() != null && other.getInstanceDetails().equals(this.getInstanceDetails()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyDetails() == null) ? 0 : getAccessKeyDetails().hashCode());
        hashCode = prime * hashCode + ((getS3BucketDetails() == null) ? 0 : getS3BucketDetails().hashCode());
        hashCode = prime * hashCode + ((getInstanceDetails() == null) ? 0 : getInstanceDetails().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
