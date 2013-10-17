/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#removeUserFromGroup(RemoveUserFromGroupRequest) RemoveUserFromGroup operation}.
 * <p>
 * Removes the specified user from the specified group.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#removeUserFromGroup(RemoveUserFromGroupRequest)
 */
public class RemoveUserFromGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the group to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String groupName;

    /**
     * Name of the user to remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * Default constructor for a new RemoveUserFromGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RemoveUserFromGroupRequest() {}
    
    /**
     * Constructs a new RemoveUserFromGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName Name of the group to update.
     * @param userName Name of the user to remove.
     */
    public RemoveUserFromGroupRequest(String groupName, String userName) {
        setGroupName(groupName);
        setUserName(userName);
    }

    /**
     * Name of the group to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the group to update.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * Name of the group to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param groupName Name of the group to update.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * Name of the group to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param groupName Name of the group to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemoveUserFromGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Name of the user to remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user to remove.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user to remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user to remove.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user to remove.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user to remove.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemoveUserFromGroupRequest withUserName(String userName) {
        this.userName = userName;
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
        if (getGroupName() != null) sb.append("GroupName: " + getGroupName() + ",");
        if (getUserName() != null) sb.append("UserName: " + getUserName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RemoveUserFromGroupRequest == false) return false;
        RemoveUserFromGroupRequest other = (RemoveUserFromGroupRequest)obj;
        
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        return true;
    }
    
}
    