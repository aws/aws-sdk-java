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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsInstanceResourcePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessGrantsInstanceResourcePolicyResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resource policy of the S3 Access Grants instance.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * The Organization of the resource policy of the S3 Access Grants instance.
     * </p>
     */
    private String organization;
    /**
     * <p>
     * The date and time when you created the S3 Access Grants instance resource policy.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The resource policy of the S3 Access Grants instance.
     * </p>
     * 
     * @param policy
     *        The resource policy of the S3 Access Grants instance.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The resource policy of the S3 Access Grants instance.
     * </p>
     * 
     * @return The resource policy of the S3 Access Grants instance.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The resource policy of the S3 Access Grants instance.
     * </p>
     * 
     * @param policy
     *        The resource policy of the S3 Access Grants instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantsInstanceResourcePolicyResult withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The Organization of the resource policy of the S3 Access Grants instance.
     * </p>
     * 
     * @param organization
     *        The Organization of the resource policy of the S3 Access Grants instance.
     */

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * <p>
     * The Organization of the resource policy of the S3 Access Grants instance.
     * </p>
     * 
     * @return The Organization of the resource policy of the S3 Access Grants instance.
     */

    public String getOrganization() {
        return this.organization;
    }

    /**
     * <p>
     * The Organization of the resource policy of the S3 Access Grants instance.
     * </p>
     * 
     * @param organization
     *        The Organization of the resource policy of the S3 Access Grants instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantsInstanceResourcePolicyResult withOrganization(String organization) {
        setOrganization(organization);
        return this;
    }

    /**
     * <p>
     * The date and time when you created the S3 Access Grants instance resource policy.
     * </p>
     * 
     * @param createdAt
     *        The date and time when you created the S3 Access Grants instance resource policy.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when you created the S3 Access Grants instance resource policy.
     * </p>
     * 
     * @return The date and time when you created the S3 Access Grants instance resource policy.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when you created the S3 Access Grants instance resource policy.
     * </p>
     * 
     * @param createdAt
     *        The date and time when you created the S3 Access Grants instance resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantsInstanceResourcePolicyResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getOrganization() != null)
            sb.append("Organization: ").append(getOrganization()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessGrantsInstanceResourcePolicyResult == false)
            return false;
        GetAccessGrantsInstanceResourcePolicyResult other = (GetAccessGrantsInstanceResourcePolicyResult) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getOrganization() == null ^ this.getOrganization() == null)
            return false;
        if (other.getOrganization() != null && other.getOrganization().equals(this.getOrganization()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessGrantsInstanceResourcePolicyResult clone() {
        try {
            return (GetAccessGrantsInstanceResourcePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
