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
 * Contains the response to a successful <a>GetAccountAuthorizationDetails</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetAccountAuthorizationDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountAuthorizationDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list containing information about IAM users.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UserDetail> userDetailList;
    /**
     * <p>
     * A list containing information about IAM groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GroupDetail> groupDetailList;
    /**
     * <p>
     * A list containing information about IAM roles.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RoleDetail> roleDetailList;
    /**
     * <p>
     * A list containing information about managed policies.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ManagedPolicyDetail> policies;
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
     * A list containing information about IAM users.
     * </p>
     * 
     * @return A list containing information about IAM users.
     */

    public java.util.List<UserDetail> getUserDetailList() {
        if (userDetailList == null) {
            userDetailList = new com.amazonaws.internal.SdkInternalList<UserDetail>();
        }
        return userDetailList;
    }

    /**
     * <p>
     * A list containing information about IAM users.
     * </p>
     * 
     * @param userDetailList
     *        A list containing information about IAM users.
     */

    public void setUserDetailList(java.util.Collection<UserDetail> userDetailList) {
        if (userDetailList == null) {
            this.userDetailList = null;
            return;
        }

        this.userDetailList = new com.amazonaws.internal.SdkInternalList<UserDetail>(userDetailList);
    }

    /**
     * <p>
     * A list containing information about IAM users.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserDetailList(java.util.Collection)} or {@link #withUserDetailList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userDetailList
     *        A list containing information about IAM users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountAuthorizationDetailsResult withUserDetailList(UserDetail... userDetailList) {
        if (this.userDetailList == null) {
            setUserDetailList(new com.amazonaws.internal.SdkInternalList<UserDetail>(userDetailList.length));
        }
        for (UserDetail ele : userDetailList) {
            this.userDetailList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information about IAM users.
     * </p>
     * 
     * @param userDetailList
     *        A list containing information about IAM users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountAuthorizationDetailsResult withUserDetailList(java.util.Collection<UserDetail> userDetailList) {
        setUserDetailList(userDetailList);
        return this;
    }

    /**
     * <p>
     * A list containing information about IAM groups.
     * </p>
     * 
     * @return A list containing information about IAM groups.
     */

    public java.util.List<GroupDetail> getGroupDetailList() {
        if (groupDetailList == null) {
            groupDetailList = new com.amazonaws.internal.SdkInternalList<GroupDetail>();
        }
        return groupDetailList;
    }

    /**
     * <p>
     * A list containing information about IAM groups.
     * </p>
     * 
     * @param groupDetailList
     *        A list containing information about IAM groups.
     */

    public void setGroupDetailList(java.util.Collection<GroupDetail> groupDetailList) {
        if (groupDetailList == null) {
            this.groupDetailList = null;
            return;
        }

        this.groupDetailList = new com.amazonaws.internal.SdkInternalList<GroupDetail>(groupDetailList);
    }

    /**
     * <p>
     * A list containing information about IAM groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupDetailList(java.util.Collection)} or {@link #withGroupDetailList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param groupDetailList
     *        A list containing information about IAM groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountAuthorizationDetailsResult withGroupDetailList(GroupDetail... groupDetailList) {
        if (this.groupDetailList == null) {
            setGroupDetailList(new com.amazonaws.internal.SdkInternalList<GroupDetail>(groupDetailList.length));
        }
        for (GroupDetail ele : groupDetailList) {
            this.groupDetailList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information about IAM groups.
     * </p>
     * 
     * @param groupDetailList
     *        A list containing information about IAM groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountAuthorizationDetailsResult withGroupDetailList(java.util.Collection<GroupDetail> groupDetailList) {
        setGroupDetailList(groupDetailList);
        return this;
    }

    /**
     * <p>
     * A list containing information about IAM roles.
     * </p>
     * 
     * @return A list containing information about IAM roles.
     */

    public java.util.List<RoleDetail> getRoleDetailList() {
        if (roleDetailList == null) {
            roleDetailList = new com.amazonaws.internal.SdkInternalList<RoleDetail>();
        }
        return roleDetailList;
    }

    /**
     * <p>
     * A list containing information about IAM roles.
     * </p>
     * 
     * @param roleDetailList
     *        A list containing information about IAM roles.
     */

    public void setRoleDetailList(java.util.Collection<RoleDetail> roleDetailList) {
        if (roleDetailList == null) {
            this.roleDetailList = null;
            return;
        }

        this.roleDetailList = new com.amazonaws.internal.SdkInternalList<RoleDetail>(roleDetailList);
    }

    /**
     * <p>
     * A list containing information about IAM roles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoleDetailList(java.util.Collection)} or {@link #withRoleDetailList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param roleDetailList
     *        A list containing information about IAM roles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountAuthorizationDetailsResult withRoleDetailList(RoleDetail... roleDetailList) {
        if (this.roleDetailList == null) {
            setRoleDetailList(new com.amazonaws.internal.SdkInternalList<RoleDetail>(roleDetailList.length));
        }
        for (RoleDetail ele : roleDetailList) {
            this.roleDetailList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information about IAM roles.
     * </p>
     * 
     * @param roleDetailList
     *        A list containing information about IAM roles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountAuthorizationDetailsResult withRoleDetailList(java.util.Collection<RoleDetail> roleDetailList) {
        setRoleDetailList(roleDetailList);
        return this;
    }

    /**
     * <p>
     * A list containing information about managed policies.
     * </p>
     * 
     * @return A list containing information about managed policies.
     */

    public java.util.List<ManagedPolicyDetail> getPolicies() {
        if (policies == null) {
            policies = new com.amazonaws.internal.SdkInternalList<ManagedPolicyDetail>();
        }
        return policies;
    }

    /**
     * <p>
     * A list containing information about managed policies.
     * </p>
     * 
     * @param policies
     *        A list containing information about managed policies.
     */

    public void setPolicies(java.util.Collection<ManagedPolicyDetail> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new com.amazonaws.internal.SdkInternalList<ManagedPolicyDetail>(policies);
    }

    /**
     * <p>
     * A list containing information about managed policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicies(java.util.Collection)} or {@link #withPolicies(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policies
     *        A list containing information about managed policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountAuthorizationDetailsResult withPolicies(ManagedPolicyDetail... policies) {
        if (this.policies == null) {
            setPolicies(new com.amazonaws.internal.SdkInternalList<ManagedPolicyDetail>(policies.length));
        }
        for (ManagedPolicyDetail ele : policies) {
            this.policies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information about managed policies.
     * </p>
     * 
     * @param policies
     *        A list containing information about managed policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountAuthorizationDetailsResult withPolicies(java.util.Collection<ManagedPolicyDetail> policies) {
        setPolicies(policies);
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

    public GetAccountAuthorizationDetailsResult withIsTruncated(Boolean isTruncated) {
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

    public GetAccountAuthorizationDetailsResult withMarker(String marker) {
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
        if (getUserDetailList() != null)
            sb.append("UserDetailList: ").append(getUserDetailList()).append(",");
        if (getGroupDetailList() != null)
            sb.append("GroupDetailList: ").append(getGroupDetailList()).append(",");
        if (getRoleDetailList() != null)
            sb.append("RoleDetailList: ").append(getRoleDetailList()).append(",");
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies()).append(",");
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

        if (obj instanceof GetAccountAuthorizationDetailsResult == false)
            return false;
        GetAccountAuthorizationDetailsResult other = (GetAccountAuthorizationDetailsResult) obj;
        if (other.getUserDetailList() == null ^ this.getUserDetailList() == null)
            return false;
        if (other.getUserDetailList() != null && other.getUserDetailList().equals(this.getUserDetailList()) == false)
            return false;
        if (other.getGroupDetailList() == null ^ this.getGroupDetailList() == null)
            return false;
        if (other.getGroupDetailList() != null && other.getGroupDetailList().equals(this.getGroupDetailList()) == false)
            return false;
        if (other.getRoleDetailList() == null ^ this.getRoleDetailList() == null)
            return false;
        if (other.getRoleDetailList() != null && other.getRoleDetailList().equals(this.getRoleDetailList()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
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

        hashCode = prime * hashCode + ((getUserDetailList() == null) ? 0 : getUserDetailList().hashCode());
        hashCode = prime * hashCode + ((getGroupDetailList() == null) ? 0 : getGroupDetailList().hashCode());
        hashCode = prime * hashCode + ((getRoleDetailList() == null) ? 0 : getRoleDetailList().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountAuthorizationDetailsResult clone() {
        try {
            return (GetAccountAuthorizationDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
