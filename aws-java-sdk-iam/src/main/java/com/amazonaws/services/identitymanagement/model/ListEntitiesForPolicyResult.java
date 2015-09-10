/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful ListEntitiesForPolicy request.
 * </p>
 */
public class ListEntitiesForPolicyResult implements Serializable, Cloneable {

    /**
     * A list of groups that the policy is attached to.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PolicyGroup> policyGroups;

    /**
     * A list of users that the policy is attached to.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PolicyUser> policyUsers;

    /**
     * A list of roles that the policy is attached to.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PolicyRole> policyRoles;

    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when there are more results available. We
     * recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all of your results.
     */
    private Boolean isTruncated;

    /**
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     */
    private String marker;

    /**
     * A list of groups that the policy is attached to.
     *
     * @return A list of groups that the policy is attached to.
     */
    public java.util.List<PolicyGroup> getPolicyGroups() {
        if (policyGroups == null) {
              policyGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyGroup>();
              policyGroups.setAutoConstruct(true);
        }
        return policyGroups;
    }
    
    /**
     * A list of groups that the policy is attached to.
     *
     * @param policyGroups A list of groups that the policy is attached to.
     */
    public void setPolicyGroups(java.util.Collection<PolicyGroup> policyGroups) {
        if (policyGroups == null) {
            this.policyGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PolicyGroup> policyGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyGroup>(policyGroups.size());
        policyGroupsCopy.addAll(policyGroups);
        this.policyGroups = policyGroupsCopy;
    }
    
    /**
     * A list of groups that the policy is attached to.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyGroups(java.util.Collection)} or {@link
     * #withPolicyGroups(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyGroups A list of groups that the policy is attached to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEntitiesForPolicyResult withPolicyGroups(PolicyGroup... policyGroups) {
        if (getPolicyGroups() == null) setPolicyGroups(new java.util.ArrayList<PolicyGroup>(policyGroups.length));
        for (PolicyGroup value : policyGroups) {
            getPolicyGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of groups that the policy is attached to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyGroups A list of groups that the policy is attached to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEntitiesForPolicyResult withPolicyGroups(java.util.Collection<PolicyGroup> policyGroups) {
        if (policyGroups == null) {
            this.policyGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PolicyGroup> policyGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyGroup>(policyGroups.size());
            policyGroupsCopy.addAll(policyGroups);
            this.policyGroups = policyGroupsCopy;
        }

        return this;
    }

    /**
     * A list of users that the policy is attached to.
     *
     * @return A list of users that the policy is attached to.
     */
    public java.util.List<PolicyUser> getPolicyUsers() {
        if (policyUsers == null) {
              policyUsers = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyUser>();
              policyUsers.setAutoConstruct(true);
        }
        return policyUsers;
    }
    
    /**
     * A list of users that the policy is attached to.
     *
     * @param policyUsers A list of users that the policy is attached to.
     */
    public void setPolicyUsers(java.util.Collection<PolicyUser> policyUsers) {
        if (policyUsers == null) {
            this.policyUsers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PolicyUser> policyUsersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyUser>(policyUsers.size());
        policyUsersCopy.addAll(policyUsers);
        this.policyUsers = policyUsersCopy;
    }
    
    /**
     * A list of users that the policy is attached to.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyUsers(java.util.Collection)} or {@link
     * #withPolicyUsers(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyUsers A list of users that the policy is attached to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEntitiesForPolicyResult withPolicyUsers(PolicyUser... policyUsers) {
        if (getPolicyUsers() == null) setPolicyUsers(new java.util.ArrayList<PolicyUser>(policyUsers.length));
        for (PolicyUser value : policyUsers) {
            getPolicyUsers().add(value);
        }
        return this;
    }
    
    /**
     * A list of users that the policy is attached to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyUsers A list of users that the policy is attached to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEntitiesForPolicyResult withPolicyUsers(java.util.Collection<PolicyUser> policyUsers) {
        if (policyUsers == null) {
            this.policyUsers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PolicyUser> policyUsersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyUser>(policyUsers.size());
            policyUsersCopy.addAll(policyUsers);
            this.policyUsers = policyUsersCopy;
        }

        return this;
    }

    /**
     * A list of roles that the policy is attached to.
     *
     * @return A list of roles that the policy is attached to.
     */
    public java.util.List<PolicyRole> getPolicyRoles() {
        if (policyRoles == null) {
              policyRoles = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyRole>();
              policyRoles.setAutoConstruct(true);
        }
        return policyRoles;
    }
    
    /**
     * A list of roles that the policy is attached to.
     *
     * @param policyRoles A list of roles that the policy is attached to.
     */
    public void setPolicyRoles(java.util.Collection<PolicyRole> policyRoles) {
        if (policyRoles == null) {
            this.policyRoles = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PolicyRole> policyRolesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyRole>(policyRoles.size());
        policyRolesCopy.addAll(policyRoles);
        this.policyRoles = policyRolesCopy;
    }
    
    /**
     * A list of roles that the policy is attached to.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyRoles(java.util.Collection)} or {@link
     * #withPolicyRoles(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyRoles A list of roles that the policy is attached to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEntitiesForPolicyResult withPolicyRoles(PolicyRole... policyRoles) {
        if (getPolicyRoles() == null) setPolicyRoles(new java.util.ArrayList<PolicyRole>(policyRoles.length));
        for (PolicyRole value : policyRoles) {
            getPolicyRoles().add(value);
        }
        return this;
    }
    
    /**
     * A list of roles that the policy is attached to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyRoles A list of roles that the policy is attached to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEntitiesForPolicyResult withPolicyRoles(java.util.Collection<PolicyRole> policyRoles) {
        if (policyRoles == null) {
            this.policyRoles = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PolicyRole> policyRolesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyRole>(policyRoles.size());
            policyRolesCopy.addAll(policyRoles);
            this.policyRoles = policyRolesCopy;
        }

        return this;
    }

    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when there are more results available. We
     * recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all of your results.
     *
     * @return A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code>
     *         number of results even when there are more results available. We
     *         recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all of your results.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when there are more results available. We
     * recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all of your results.
     *
     * @param isTruncated A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code>
     *         number of results even when there are more results available. We
     *         recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all of your results.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when there are more results available. We
     * recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all of your results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code>
     *         number of results even when there are more results available. We
     *         recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all of your results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEntitiesForPolicyResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when there are more results available. We
     * recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all of your results.
     *
     * @return A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code>
     *         number of results even when there are more results available. We
     *         recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all of your results.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return When <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker When <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker When <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEntitiesForPolicyResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicyGroups() != null) sb.append("PolicyGroups: " + getPolicyGroups() + ",");
        if (getPolicyUsers() != null) sb.append("PolicyUsers: " + getPolicyUsers() + ",");
        if (getPolicyRoles() != null) sb.append("PolicyRoles: " + getPolicyRoles() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyGroups() == null) ? 0 : getPolicyGroups().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyUsers() == null) ? 0 : getPolicyUsers().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyRoles() == null) ? 0 : getPolicyRoles().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListEntitiesForPolicyResult == false) return false;
        ListEntitiesForPolicyResult other = (ListEntitiesForPolicyResult)obj;
        
        if (other.getPolicyGroups() == null ^ this.getPolicyGroups() == null) return false;
        if (other.getPolicyGroups() != null && other.getPolicyGroups().equals(this.getPolicyGroups()) == false) return false; 
        if (other.getPolicyUsers() == null ^ this.getPolicyUsers() == null) return false;
        if (other.getPolicyUsers() != null && other.getPolicyUsers().equals(this.getPolicyUsers()) == false) return false; 
        if (other.getPolicyRoles() == null ^ this.getPolicyRoles() == null) return false;
        if (other.getPolicyRoles() != null && other.getPolicyRoles().equals(this.getPolicyRoles()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public ListEntitiesForPolicyResult clone() {
        try {
            return (ListEntitiesForPolicyResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    