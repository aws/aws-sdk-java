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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>ListEntitiesForPolicy</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListEntitiesForPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEntitiesForPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of IAM groups that the policy is attached to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PolicyGroup> policyGroups;
    /**
     * <p>
     * A list of IAM users that the policy is attached to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PolicyUser> policyUsers;
    /**
     * <p>
     * A list of IAM roles that the policy is attached to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PolicyRole> policyRoles;
    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of IAM groups that the policy is attached to.
     * </p>
     * 
     * @return A list of IAM groups that the policy is attached to.
     */

    public java.util.List<PolicyGroup> getPolicyGroups() {
        if (policyGroups == null) {
            policyGroups = new com.amazonaws.internal.SdkInternalList<PolicyGroup>();
        }
        return policyGroups;
    }

    /**
     * <p>
     * A list of IAM groups that the policy is attached to.
     * </p>
     * 
     * @param policyGroups
     *        A list of IAM groups that the policy is attached to.
     */

    public void setPolicyGroups(java.util.Collection<PolicyGroup> policyGroups) {
        if (policyGroups == null) {
            this.policyGroups = null;
            return;
        }

        this.policyGroups = new com.amazonaws.internal.SdkInternalList<PolicyGroup>(policyGroups);
    }

    /**
     * <p>
     * A list of IAM groups that the policy is attached to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyGroups(java.util.Collection)} or {@link #withPolicyGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyGroups
     *        A list of IAM groups that the policy is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesForPolicyResult withPolicyGroups(PolicyGroup... policyGroups) {
        if (this.policyGroups == null) {
            setPolicyGroups(new com.amazonaws.internal.SdkInternalList<PolicyGroup>(policyGroups.length));
        }
        for (PolicyGroup ele : policyGroups) {
            this.policyGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IAM groups that the policy is attached to.
     * </p>
     * 
     * @param policyGroups
     *        A list of IAM groups that the policy is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesForPolicyResult withPolicyGroups(java.util.Collection<PolicyGroup> policyGroups) {
        setPolicyGroups(policyGroups);
        return this;
    }

    /**
     * <p>
     * A list of IAM users that the policy is attached to.
     * </p>
     * 
     * @return A list of IAM users that the policy is attached to.
     */

    public java.util.List<PolicyUser> getPolicyUsers() {
        if (policyUsers == null) {
            policyUsers = new com.amazonaws.internal.SdkInternalList<PolicyUser>();
        }
        return policyUsers;
    }

    /**
     * <p>
     * A list of IAM users that the policy is attached to.
     * </p>
     * 
     * @param policyUsers
     *        A list of IAM users that the policy is attached to.
     */

    public void setPolicyUsers(java.util.Collection<PolicyUser> policyUsers) {
        if (policyUsers == null) {
            this.policyUsers = null;
            return;
        }

        this.policyUsers = new com.amazonaws.internal.SdkInternalList<PolicyUser>(policyUsers);
    }

    /**
     * <p>
     * A list of IAM users that the policy is attached to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyUsers(java.util.Collection)} or {@link #withPolicyUsers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyUsers
     *        A list of IAM users that the policy is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesForPolicyResult withPolicyUsers(PolicyUser... policyUsers) {
        if (this.policyUsers == null) {
            setPolicyUsers(new com.amazonaws.internal.SdkInternalList<PolicyUser>(policyUsers.length));
        }
        for (PolicyUser ele : policyUsers) {
            this.policyUsers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IAM users that the policy is attached to.
     * </p>
     * 
     * @param policyUsers
     *        A list of IAM users that the policy is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesForPolicyResult withPolicyUsers(java.util.Collection<PolicyUser> policyUsers) {
        setPolicyUsers(policyUsers);
        return this;
    }

    /**
     * <p>
     * A list of IAM roles that the policy is attached to.
     * </p>
     * 
     * @return A list of IAM roles that the policy is attached to.
     */

    public java.util.List<PolicyRole> getPolicyRoles() {
        if (policyRoles == null) {
            policyRoles = new com.amazonaws.internal.SdkInternalList<PolicyRole>();
        }
        return policyRoles;
    }

    /**
     * <p>
     * A list of IAM roles that the policy is attached to.
     * </p>
     * 
     * @param policyRoles
     *        A list of IAM roles that the policy is attached to.
     */

    public void setPolicyRoles(java.util.Collection<PolicyRole> policyRoles) {
        if (policyRoles == null) {
            this.policyRoles = null;
            return;
        }

        this.policyRoles = new com.amazonaws.internal.SdkInternalList<PolicyRole>(policyRoles);
    }

    /**
     * <p>
     * A list of IAM roles that the policy is attached to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyRoles(java.util.Collection)} or {@link #withPolicyRoles(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyRoles
     *        A list of IAM roles that the policy is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesForPolicyResult withPolicyRoles(PolicyRole... policyRoles) {
        if (this.policyRoles == null) {
            setPolicyRoles(new com.amazonaws.internal.SdkInternalList<PolicyRole>(policyRoles.length));
        }
        for (PolicyRole ele : policyRoles) {
            this.policyRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IAM roles that the policy is attached to.
     * </p>
     * 
     * @param policyRoles
     *        A list of IAM roles that the policy is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesForPolicyResult withPolicyRoles(java.util.Collection<PolicyRole> policyRoles) {
        setPolicyRoles(policyRoles);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more items to return. If your results were truncated, you can make
     *        a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items.
     *        Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there are more
     *        results available. We recommend that you check <code>IsTruncated</code> after every call to ensure that
     *        you receive all your results.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @return A flag that indicates whether there are more items to return. If your results were truncated, you can
     *         make a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there
     *         are more results available. We recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all your results.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more items to return. If your results were truncated, you can make
     *        a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items.
     *        Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there are more
     *        results available. We recommend that you check <code>IsTruncated</code> after every call to ensure that
     *        you receive all your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesForPolicyResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can make a
     * subsequent pagination request using the <code>Marker</code> request parameter to retrieve more items. Note that
     * IAM might return fewer than the <code>MaxItems</code> number of results even when there are more results
     * available. We recommend that you check <code>IsTruncated</code> after every call to ensure that you receive all
     * your results.
     * </p>
     * 
     * @return A flag that indicates whether there are more items to return. If your results were truncated, you can
     *         make a subsequent pagination request using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code> number of results even when there
     *         are more results available. We recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all your results.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @param marker
     *        When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use
     *        for the <code>Marker</code> parameter in a subsequent pagination request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @return When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use
     *         for the <code>Marker</code> parameter in a subsequent pagination request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @param marker
     *        When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use
     *        for the <code>Marker</code> parameter in a subsequent pagination request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesForPolicyResult withMarker(String marker) {
        setMarker(marker);
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
        if (getPolicyGroups() != null)
            sb.append("PolicyGroups: ").append(getPolicyGroups()).append(",");
        if (getPolicyUsers() != null)
            sb.append("PolicyUsers: ").append(getPolicyUsers()).append(",");
        if (getPolicyRoles() != null)
            sb.append("PolicyRoles: ").append(getPolicyRoles()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEntitiesForPolicyResult == false)
            return false;
        ListEntitiesForPolicyResult other = (ListEntitiesForPolicyResult) obj;
        if (other.getPolicyGroups() == null ^ this.getPolicyGroups() == null)
            return false;
        if (other.getPolicyGroups() != null && other.getPolicyGroups().equals(this.getPolicyGroups()) == false)
            return false;
        if (other.getPolicyUsers() == null ^ this.getPolicyUsers() == null)
            return false;
        if (other.getPolicyUsers() != null && other.getPolicyUsers().equals(this.getPolicyUsers()) == false)
            return false;
        if (other.getPolicyRoles() == null ^ this.getPolicyRoles() == null)
            return false;
        if (other.getPolicyRoles() != null && other.getPolicyRoles().equals(this.getPolicyRoles()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyGroups() == null) ? 0 : getPolicyGroups().hashCode());
        hashCode = prime * hashCode + ((getPolicyUsers() == null) ? 0 : getPolicyUsers().hashCode());
        hashCode = prime * hashCode + ((getPolicyRoles() == null) ? 0 : getPolicyRoles().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListEntitiesForPolicyResult clone() {
        try {
            return (ListEntitiesForPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
