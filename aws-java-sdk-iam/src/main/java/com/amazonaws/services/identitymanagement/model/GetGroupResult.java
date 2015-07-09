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
 * Contains the response to a successful GetGroup request.
 * </p>
 */
public class GetGroupResult implements Serializable, Cloneable {

    /**
     * Information about the group.
     */
    private Group group;

    /**
     * A list of users in the group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<User> users;

    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items.
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
     * Information about the group.
     *
     * @return Information about the group.
     */
    public Group getGroup() {
        return group;
    }
    
    /**
     * Information about the group.
     *
     * @param group Information about the group.
     */
    public void setGroup(Group group) {
        this.group = group;
    }
    
    /**
     * Information about the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param group Information about the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetGroupResult withGroup(Group group) {
        this.group = group;
        return this;
    }

    /**
     * A list of users in the group.
     *
     * @return A list of users in the group.
     */
    public java.util.List<User> getUsers() {
        if (users == null) {
              users = new com.amazonaws.internal.ListWithAutoConstructFlag<User>();
              users.setAutoConstruct(true);
        }
        return users;
    }
    
    /**
     * A list of users in the group.
     *
     * @param users A list of users in the group.
     */
    public void setUsers(java.util.Collection<User> users) {
        if (users == null) {
            this.users = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<User> usersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<User>(users.size());
        usersCopy.addAll(users);
        this.users = usersCopy;
    }
    
    /**
     * A list of users in the group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUsers(java.util.Collection)} or {@link
     * #withUsers(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param users A list of users in the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetGroupResult withUsers(User... users) {
        if (getUsers() == null) setUsers(new java.util.ArrayList<User>(users.length));
        for (User value : users) {
            getUsers().add(value);
        }
        return this;
    }
    
    /**
     * A list of users in the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param users A list of users in the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetGroupResult withUsers(java.util.Collection<User> users) {
        if (users == null) {
            this.users = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<User> usersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<User>(users.size());
            usersCopy.addAll(users);
            this.users = usersCopy;
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
    public GetGroupResult withIsTruncated(Boolean isTruncated) {
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
    public GetGroupResult withMarker(String marker) {
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
        if (getGroup() != null) sb.append("Group: " + getGroup() + ",");
        if (getUsers() != null) sb.append("Users: " + getUsers() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode()); 
        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetGroupResult == false) return false;
        GetGroupResult other = (GetGroupResult)obj;
        
        if (other.getGroup() == null ^ this.getGroup() == null) return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false) return false; 
        if (other.getUsers() == null ^ this.getUsers() == null) return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public GetGroupResult clone() {
        try {
            return (GetGroupResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    