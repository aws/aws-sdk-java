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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Violations for a resource based on the specified Firewall Manager policy and Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ViolationDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViolationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Firewall Manager policy that the violation details were requested for.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The Amazon Web Services account that the violation details were requested for.
     * </p>
     */
    private String memberAccount;
    /**
     * <p>
     * The resource ID that the violation details were requested for.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource type that the violation details were requested for.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * List of violations for the requested resource.
     * </p>
     */
    private java.util.List<ResourceViolation> resourceViolations;
    /**
     * <p>
     * The <code>ResourceTag</code> objects associated with the resource.
     * </p>
     */
    private java.util.List<Tag> resourceTags;
    /**
     * <p>
     * Brief description for the requested resource.
     * </p>
     */
    private String resourceDescription;

    /**
     * <p>
     * The ID of the Firewall Manager policy that the violation details were requested for.
     * </p>
     * 
     * @param policyId
     *        The ID of the Firewall Manager policy that the violation details were requested for.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the Firewall Manager policy that the violation details were requested for.
     * </p>
     * 
     * @return The ID of the Firewall Manager policy that the violation details were requested for.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The ID of the Firewall Manager policy that the violation details were requested for.
     * </p>
     * 
     * @param policyId
     *        The ID of the Firewall Manager policy that the violation details were requested for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationDetail withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account that the violation details were requested for.
     * </p>
     * 
     * @param memberAccount
     *        The Amazon Web Services account that the violation details were requested for.
     */

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account that the violation details were requested for.
     * </p>
     * 
     * @return The Amazon Web Services account that the violation details were requested for.
     */

    public String getMemberAccount() {
        return this.memberAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account that the violation details were requested for.
     * </p>
     * 
     * @param memberAccount
     *        The Amazon Web Services account that the violation details were requested for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationDetail withMemberAccount(String memberAccount) {
        setMemberAccount(memberAccount);
        return this;
    }

    /**
     * <p>
     * The resource ID that the violation details were requested for.
     * </p>
     * 
     * @param resourceId
     *        The resource ID that the violation details were requested for.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID that the violation details were requested for.
     * </p>
     * 
     * @return The resource ID that the violation details were requested for.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID that the violation details were requested for.
     * </p>
     * 
     * @param resourceId
     *        The resource ID that the violation details were requested for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationDetail withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource type that the violation details were requested for.
     * </p>
     * 
     * @param resourceType
     *        The resource type that the violation details were requested for.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type that the violation details were requested for.
     * </p>
     * 
     * @return The resource type that the violation details were requested for.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type that the violation details were requested for.
     * </p>
     * 
     * @param resourceType
     *        The resource type that the violation details were requested for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationDetail withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * List of violations for the requested resource.
     * </p>
     * 
     * @return List of violations for the requested resource.
     */

    public java.util.List<ResourceViolation> getResourceViolations() {
        return resourceViolations;
    }

    /**
     * <p>
     * List of violations for the requested resource.
     * </p>
     * 
     * @param resourceViolations
     *        List of violations for the requested resource.
     */

    public void setResourceViolations(java.util.Collection<ResourceViolation> resourceViolations) {
        if (resourceViolations == null) {
            this.resourceViolations = null;
            return;
        }

        this.resourceViolations = new java.util.ArrayList<ResourceViolation>(resourceViolations);
    }

    /**
     * <p>
     * List of violations for the requested resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceViolations(java.util.Collection)} or {@link #withResourceViolations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceViolations
     *        List of violations for the requested resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationDetail withResourceViolations(ResourceViolation... resourceViolations) {
        if (this.resourceViolations == null) {
            setResourceViolations(new java.util.ArrayList<ResourceViolation>(resourceViolations.length));
        }
        for (ResourceViolation ele : resourceViolations) {
            this.resourceViolations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of violations for the requested resource.
     * </p>
     * 
     * @param resourceViolations
     *        List of violations for the requested resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationDetail withResourceViolations(java.util.Collection<ResourceViolation> resourceViolations) {
        setResourceViolations(resourceViolations);
        return this;
    }

    /**
     * <p>
     * The <code>ResourceTag</code> objects associated with the resource.
     * </p>
     * 
     * @return The <code>ResourceTag</code> objects associated with the resource.
     */

    public java.util.List<Tag> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * The <code>ResourceTag</code> objects associated with the resource.
     * </p>
     * 
     * @param resourceTags
     *        The <code>ResourceTag</code> objects associated with the resource.
     */

    public void setResourceTags(java.util.Collection<Tag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new java.util.ArrayList<Tag>(resourceTags);
    }

    /**
     * <p>
     * The <code>ResourceTag</code> objects associated with the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        The <code>ResourceTag</code> objects associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationDetail withResourceTags(Tag... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new java.util.ArrayList<Tag>(resourceTags.length));
        }
        for (Tag ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>ResourceTag</code> objects associated with the resource.
     * </p>
     * 
     * @param resourceTags
     *        The <code>ResourceTag</code> objects associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationDetail withResourceTags(java.util.Collection<Tag> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * <p>
     * Brief description for the requested resource.
     * </p>
     * 
     * @param resourceDescription
     *        Brief description for the requested resource.
     */

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
    }

    /**
     * <p>
     * Brief description for the requested resource.
     * </p>
     * 
     * @return Brief description for the requested resource.
     */

    public String getResourceDescription() {
        return this.resourceDescription;
    }

    /**
     * <p>
     * Brief description for the requested resource.
     * </p>
     * 
     * @param resourceDescription
     *        Brief description for the requested resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationDetail withResourceDescription(String resourceDescription) {
        setResourceDescription(resourceDescription);
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getMemberAccount() != null)
            sb.append("MemberAccount: ").append(getMemberAccount()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceViolations() != null)
            sb.append("ResourceViolations: ").append(getResourceViolations()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getResourceDescription() != null)
            sb.append("ResourceDescription: ").append(getResourceDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViolationDetail == false)
            return false;
        ViolationDetail other = (ViolationDetail) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getMemberAccount() == null ^ this.getMemberAccount() == null)
            return false;
        if (other.getMemberAccount() != null && other.getMemberAccount().equals(this.getMemberAccount()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceViolations() == null ^ this.getResourceViolations() == null)
            return false;
        if (other.getResourceViolations() != null && other.getResourceViolations().equals(this.getResourceViolations()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getResourceDescription() == null ^ this.getResourceDescription() == null)
            return false;
        if (other.getResourceDescription() != null && other.getResourceDescription().equals(this.getResourceDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getMemberAccount() == null) ? 0 : getMemberAccount().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceViolations() == null) ? 0 : getResourceViolations().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getResourceDescription() == null) ? 0 : getResourceDescription().hashCode());
        return hashCode;
    }

    @Override
    public ViolationDetail clone() {
        try {
            return (ViolationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.ViolationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
