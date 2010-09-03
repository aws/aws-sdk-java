/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the result of a successful invocation of the GetGroup action.
 * </p>
 */
public class GetGroupResult {

    /**
     * Information about the group.
     */
    private Group group;

    /**
     * A list of users in the group.
     */
    private java.util.List<User> users;

    /**
     * A flag that indicates whether there are more users to list. If your
     * results were truncated, you can make a follow-up pagination request
     * using the <code>Marker</code> request parameter to retrieve more users
     * in the list.
     */
    private Boolean isTruncated;

    /**
     * If IsTruncated is true, then this element is present and contains the
     * value to use for the <code>Marker</code> parameter in a follow-up
     * pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
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
            users = new java.util.ArrayList<User>();
        }
        return users;
    }
    
    /**
     * A list of users in the group.
     *
     * @param users A list of users in the group.
     */
    public void setUsers(java.util.Collection<User> users) {
        java.util.List<User> usersCopy = new java.util.ArrayList<User>();
        if (users != null) {
            usersCopy.addAll(users);
        }
        this.users = usersCopy;
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
    public GetGroupResult withUsers(User... users) {
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
        java.util.List<User> usersCopy = new java.util.ArrayList<User>();
        if (users != null) {
            usersCopy.addAll(users);
        }
        this.users = usersCopy;

        return this;
    }
    
    /**
     * A flag that indicates whether there are more users to list. If your
     * results were truncated, you can make a follow-up pagination request
     * using the <code>Marker</code> request parameter to retrieve more users
     * in the list.
     *
     * @return A flag that indicates whether there are more users to list. If your
     *         results were truncated, you can make a follow-up pagination request
     *         using the <code>Marker</code> request parameter to retrieve more users
     *         in the list.
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more users to list. If your
     * results were truncated, you can make a follow-up pagination request
     * using the <code>Marker</code> request parameter to retrieve more users
     * in the list.
     *
     * @param isTruncated A flag that indicates whether there are more users to list. If your
     *         results were truncated, you can make a follow-up pagination request
     *         using the <code>Marker</code> request parameter to retrieve more users
     *         in the list.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more users to list. If your
     * results were truncated, you can make a follow-up pagination request
     * using the <code>Marker</code> request parameter to retrieve more users
     * in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more users to list. If your
     *         results were truncated, you can make a follow-up pagination request
     *         using the <code>Marker</code> request parameter to retrieve more users
     *         in the list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetGroupResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    
    
    /**
     * A flag that indicates whether there are more users to list. If your
     * results were truncated, you can make a follow-up pagination request
     * using the <code>Marker</code> request parameter to retrieve more users
     * in the list.
     *
     * @return A flag that indicates whether there are more users to list. If your
     *         results were truncated, you can make a follow-up pagination request
     *         using the <code>Marker</code> request parameter to retrieve more users
     *         in the list.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }
    
    /**
     * If IsTruncated is true, then this element is present and contains the
     * value to use for the <code>Marker</code> parameter in a follow-up
     * pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @return If IsTruncated is true, then this element is present and contains the
     *         value to use for the <code>Marker</code> parameter in a follow-up
     *         pagination request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * If IsTruncated is true, then this element is present and contains the
     * value to use for the <code>Marker</code> parameter in a follow-up
     * pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker If IsTruncated is true, then this element is present and contains the
     *         value to use for the <code>Marker</code> parameter in a follow-up
     *         pagination request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * If IsTruncated is true, then this element is present and contains the
     * value to use for the <code>Marker</code> parameter in a follow-up
     * pagination request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker If IsTruncated is true, then this element is present and contains the
     *         value to use for the <code>Marker</code> parameter in a follow-up
     *         pagination request.
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
        sb.append("Group: " + group + ", ");
        sb.append("Users: " + users + ", ");
        sb.append("IsTruncated: " + isTruncated + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    