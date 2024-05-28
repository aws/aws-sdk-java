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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessGrantsInstanceResourcePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccessGrantsInstanceResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The resource policy of the S3 Access Grants instance that you are updating.
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
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that is making this request.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that is making this request.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that is making this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccessGrantsInstanceResourcePolicyRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The resource policy of the S3 Access Grants instance that you are updating.
     * </p>
     * 
     * @param policy
     *        The resource policy of the S3 Access Grants instance that you are updating.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The resource policy of the S3 Access Grants instance that you are updating.
     * </p>
     * 
     * @return The resource policy of the S3 Access Grants instance that you are updating.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The resource policy of the S3 Access Grants instance that you are updating.
     * </p>
     * 
     * @param policy
     *        The resource policy of the S3 Access Grants instance that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccessGrantsInstanceResourcePolicyRequest withPolicy(String policy) {
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

    public PutAccessGrantsInstanceResourcePolicyRequest withOrganization(String organization) {
        setOrganization(organization);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getOrganization() != null)
            sb.append("Organization: ").append(getOrganization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccessGrantsInstanceResourcePolicyRequest == false)
            return false;
        PutAccessGrantsInstanceResourcePolicyRequest other = (PutAccessGrantsInstanceResourcePolicyRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getOrganization() == null ^ this.getOrganization() == null)
            return false;
        if (other.getOrganization() != null && other.getOrganization().equals(this.getOrganization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        return hashCode;
    }

    @Override
    public PutAccessGrantsInstanceResourcePolicyRequest clone() {
        return (PutAccessGrantsInstanceResourcePolicyRequest) super.clone();
    }

}
