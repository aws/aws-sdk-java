/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains the result of a successful invocation of the
 * GetAccountAuthorizationDetails action.
 * </p>
 */
public class GetAccountAuthorizationDetailsResult implements Serializable {

    /**
     * A list containing information about IAM users.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<UserDetail> userDetailList;

    /**
     * A list containing information about IAM groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<GroupDetail> groupDetailList;

    /**
     * A list containing information about IAM roles.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RoleDetail> roleDetailList;

    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items.
     */
    private Boolean isTruncated;

    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     */
    private String marker;

    /**
     * A list containing information about IAM users.
     *
     * @return A list containing information about IAM users.
     */
    public java.util.List<UserDetail> getUserDetailList() {
        if (userDetailList == null) {
              userDetailList = new com.amazonaws.internal.ListWithAutoConstructFlag<UserDetail>();
              userDetailList.setAutoConstruct(true);
        }
        return userDetailList;
    }
    
    /**
     * A list containing information about IAM users.
     *
     * @param userDetailList A list containing information about IAM users.
     */
    public void setUserDetailList(java.util.Collection<UserDetail> userDetailList) {
        if (userDetailList == null) {
            this.userDetailList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<UserDetail> userDetailListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UserDetail>(userDetailList.size());
        userDetailListCopy.addAll(userDetailList);
        this.userDetailList = userDetailListCopy;
    }
    
    /**
     * A list containing information about IAM users.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userDetailList A list containing information about IAM users.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsResult withUserDetailList(UserDetail... userDetailList) {
        if (getUserDetailList() == null) setUserDetailList(new java.util.ArrayList<UserDetail>(userDetailList.length));
        for (UserDetail value : userDetailList) {
            getUserDetailList().add(value);
        }
        return this;
    }
    
    /**
     * A list containing information about IAM users.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userDetailList A list containing information about IAM users.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsResult withUserDetailList(java.util.Collection<UserDetail> userDetailList) {
        if (userDetailList == null) {
            this.userDetailList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<UserDetail> userDetailListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UserDetail>(userDetailList.size());
            userDetailListCopy.addAll(userDetailList);
            this.userDetailList = userDetailListCopy;
        }

        return this;
    }

    /**
     * A list containing information about IAM groups.
     *
     * @return A list containing information about IAM groups.
     */
    public java.util.List<GroupDetail> getGroupDetailList() {
        if (groupDetailList == null) {
              groupDetailList = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupDetail>();
              groupDetailList.setAutoConstruct(true);
        }
        return groupDetailList;
    }
    
    /**
     * A list containing information about IAM groups.
     *
     * @param groupDetailList A list containing information about IAM groups.
     */
    public void setGroupDetailList(java.util.Collection<GroupDetail> groupDetailList) {
        if (groupDetailList == null) {
            this.groupDetailList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GroupDetail> groupDetailListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupDetail>(groupDetailList.size());
        groupDetailListCopy.addAll(groupDetailList);
        this.groupDetailList = groupDetailListCopy;
    }
    
    /**
     * A list containing information about IAM groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupDetailList A list containing information about IAM groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsResult withGroupDetailList(GroupDetail... groupDetailList) {
        if (getGroupDetailList() == null) setGroupDetailList(new java.util.ArrayList<GroupDetail>(groupDetailList.length));
        for (GroupDetail value : groupDetailList) {
            getGroupDetailList().add(value);
        }
        return this;
    }
    
    /**
     * A list containing information about IAM groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupDetailList A list containing information about IAM groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsResult withGroupDetailList(java.util.Collection<GroupDetail> groupDetailList) {
        if (groupDetailList == null) {
            this.groupDetailList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GroupDetail> groupDetailListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupDetail>(groupDetailList.size());
            groupDetailListCopy.addAll(groupDetailList);
            this.groupDetailList = groupDetailListCopy;
        }

        return this;
    }

    /**
     * A list containing information about IAM roles.
     *
     * @return A list containing information about IAM roles.
     */
    public java.util.List<RoleDetail> getRoleDetailList() {
        if (roleDetailList == null) {
              roleDetailList = new com.amazonaws.internal.ListWithAutoConstructFlag<RoleDetail>();
              roleDetailList.setAutoConstruct(true);
        }
        return roleDetailList;
    }
    
    /**
     * A list containing information about IAM roles.
     *
     * @param roleDetailList A list containing information about IAM roles.
     */
    public void setRoleDetailList(java.util.Collection<RoleDetail> roleDetailList) {
        if (roleDetailList == null) {
            this.roleDetailList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RoleDetail> roleDetailListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RoleDetail>(roleDetailList.size());
        roleDetailListCopy.addAll(roleDetailList);
        this.roleDetailList = roleDetailListCopy;
    }
    
    /**
     * A list containing information about IAM roles.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleDetailList A list containing information about IAM roles.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsResult withRoleDetailList(RoleDetail... roleDetailList) {
        if (getRoleDetailList() == null) setRoleDetailList(new java.util.ArrayList<RoleDetail>(roleDetailList.length));
        for (RoleDetail value : roleDetailList) {
            getRoleDetailList().add(value);
        }
        return this;
    }
    
    /**
     * A list containing information about IAM roles.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleDetailList A list containing information about IAM roles.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsResult withRoleDetailList(java.util.Collection<RoleDetail> roleDetailList) {
        if (roleDetailList == null) {
            this.roleDetailList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RoleDetail> roleDetailListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RoleDetail>(roleDetailList.size());
            roleDetailListCopy.addAll(roleDetailList);
            this.roleDetailList = roleDetailListCopy;
        }

        return this;
    }

    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items.
     *
     * @return A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items.
     *
     * @param isTruncated A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items.
     *
     * @return A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @return If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsResult withMarker(String marker) {
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
        if (getUserDetailList() != null) sb.append("UserDetailList: " + getUserDetailList() + ",");
        if (getGroupDetailList() != null) sb.append("GroupDetailList: " + getGroupDetailList() + ",");
        if (getRoleDetailList() != null) sb.append("RoleDetailList: " + getRoleDetailList() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserDetailList() == null) ? 0 : getUserDetailList().hashCode()); 
        hashCode = prime * hashCode + ((getGroupDetailList() == null) ? 0 : getGroupDetailList().hashCode()); 
        hashCode = prime * hashCode + ((getRoleDetailList() == null) ? 0 : getRoleDetailList().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAccountAuthorizationDetailsResult == false) return false;
        GetAccountAuthorizationDetailsResult other = (GetAccountAuthorizationDetailsResult)obj;
        
        if (other.getUserDetailList() == null ^ this.getUserDetailList() == null) return false;
        if (other.getUserDetailList() != null && other.getUserDetailList().equals(this.getUserDetailList()) == false) return false; 
        if (other.getGroupDetailList() == null ^ this.getGroupDetailList() == null) return false;
        if (other.getGroupDetailList() != null && other.getGroupDetailList().equals(this.getGroupDetailList()) == false) return false; 
        if (other.getRoleDetailList() == null ^ this.getRoleDetailList() == null) return false;
        if (other.getRoleDetailList() != null && other.getRoleDetailList().equals(this.getRoleDetailList()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    