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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteDomainPermissionsPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDomainPermissionsPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain associated with the resource policy to be deleted.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     */
    private String domainOwner;
    /**
     * <p>
     * The current revision of the resource policy to be deleted. This revision is used for optimistic locking, which
     * prevents others from overwriting your changes to the domain's resource policy.
     * </p>
     */
    private String policyRevision;

    /**
     * <p>
     * The name of the domain associated with the resource policy to be deleted.
     * </p>
     * 
     * @param domain
     *        The name of the domain associated with the resource policy to be deleted.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain associated with the resource policy to be deleted.
     * </p>
     * 
     * @return The name of the domain associated with the resource policy to be deleted.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain associated with the resource policy to be deleted.
     * </p>
     * 
     * @param domain
     *        The name of the domain associated with the resource policy to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDomainPermissionsPolicyRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     */

    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @return The 12-digit account number of the AWS account that owns the domain. It does not include dashes or
     *         spaces.
     */

    public String getDomainOwner() {
        return this.domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDomainPermissionsPolicyRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The current revision of the resource policy to be deleted. This revision is used for optimistic locking, which
     * prevents others from overwriting your changes to the domain's resource policy.
     * </p>
     * 
     * @param policyRevision
     *        The current revision of the resource policy to be deleted. This revision is used for optimistic locking,
     *        which prevents others from overwriting your changes to the domain's resource policy.
     */

    public void setPolicyRevision(String policyRevision) {
        this.policyRevision = policyRevision;
    }

    /**
     * <p>
     * The current revision of the resource policy to be deleted. This revision is used for optimistic locking, which
     * prevents others from overwriting your changes to the domain's resource policy.
     * </p>
     * 
     * @return The current revision of the resource policy to be deleted. This revision is used for optimistic locking,
     *         which prevents others from overwriting your changes to the domain's resource policy.
     */

    public String getPolicyRevision() {
        return this.policyRevision;
    }

    /**
     * <p>
     * The current revision of the resource policy to be deleted. This revision is used for optimistic locking, which
     * prevents others from overwriting your changes to the domain's resource policy.
     * </p>
     * 
     * @param policyRevision
     *        The current revision of the resource policy to be deleted. This revision is used for optimistic locking,
     *        which prevents others from overwriting your changes to the domain's resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDomainPermissionsPolicyRequest withPolicyRevision(String policyRevision) {
        setPolicyRevision(policyRevision);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDomainOwner() != null)
            sb.append("DomainOwner: ").append(getDomainOwner()).append(",");
        if (getPolicyRevision() != null)
            sb.append("PolicyRevision: ").append(getPolicyRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDomainPermissionsPolicyRequest == false)
            return false;
        DeleteDomainPermissionsPolicyRequest other = (DeleteDomainPermissionsPolicyRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getPolicyRevision() == null ^ this.getPolicyRevision() == null)
            return false;
        if (other.getPolicyRevision() != null && other.getPolicyRevision().equals(this.getPolicyRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getPolicyRevision() == null) ? 0 : getPolicyRevision().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDomainPermissionsPolicyRequest clone() {
        return (DeleteDomainPermissionsPolicyRequest) super.clone();
    }

}
