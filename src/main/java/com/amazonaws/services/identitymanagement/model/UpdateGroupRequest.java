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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateGroup(UpdateGroupRequest) UpdateGroup operation}.
 * <p>
 * Updates the name and/or the path of the specified group.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> You should understand the implications of changing a group's path or name. For more information, see Renaming Users and Groups in
 * Using AWS Identity and Access Management.
 * </p>
 * <p>
 * <b>NOTE:</b>To change a group name the requester must have appropriate permissions on both the source object and the target object. For example, to
 * change Managers to MGRs, the entity making the request must have permission on Managers and MGRs, or must have permission on all (*). For more
 * information about permissions, see Permissions and Policies.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateGroup(UpdateGroupRequest)
 */
public class UpdateGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the group to update. If you're changing the name of the group,
     * this is the original name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String groupName;

    /**
     * New path for the group. Only include this if changing the group's
     * path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String newPath;

    /**
     * New name for the group. Only include this if changing the group's
     * name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String newGroupName;

    /**
     * Default constructor for a new UpdateGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateGroupRequest() {}
    
    /**
     * Constructs a new UpdateGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName Name of the group to update. If you're changing the
     * name of the group, this is the original name.
     */
    public UpdateGroupRequest(String groupName) {
        setGroupName(groupName);
    }

    /**
     * Name of the group to update. If you're changing the name of the group,
     * this is the original name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the group to update. If you're changing the name of the group,
     *         this is the original name.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * Name of the group to update. If you're changing the name of the group,
     * this is the original name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param groupName Name of the group to update. If you're changing the name of the group,
     *         this is the original name.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * Name of the group to update. If you're changing the name of the group,
     * this is the original name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param groupName Name of the group to update. If you're changing the name of the group,
     *         this is the original name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * New path for the group. Only include this if changing the group's
     * path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return New path for the group. Only include this if changing the group's
     *         path.
     */
    public String getNewPath() {
        return newPath;
    }
    
    /**
     * New path for the group. Only include this if changing the group's
     * path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath New path for the group. Only include this if changing the group's
     *         path.
     */
    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }
    
    /**
     * New path for the group. Only include this if changing the group's
     * path.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath New path for the group. Only include this if changing the group's
     *         path.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateGroupRequest withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }

    /**
     * New name for the group. Only include this if changing the group's
     * name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return New name for the group. Only include this if changing the group's
     *         name.
     */
    public String getNewGroupName() {
        return newGroupName;
    }
    
    /**
     * New name for the group. Only include this if changing the group's
     * name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param newGroupName New name for the group. Only include this if changing the group's
     *         name.
     */
    public void setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
    }
    
    /**
     * New name for the group. Only include this if changing the group's
     * name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param newGroupName New name for the group. Only include this if changing the group's
     *         name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateGroupRequest withNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
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
        if (getNewPath() != null) sb.append("NewPath: " + getNewPath() + ",");
        if (getNewGroupName() != null) sb.append("NewGroupName: " + getNewGroupName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getNewPath() == null) ? 0 : getNewPath().hashCode()); 
        hashCode = prime * hashCode + ((getNewGroupName() == null) ? 0 : getNewGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateGroupRequest == false) return false;
        UpdateGroupRequest other = (UpdateGroupRequest)obj;
        
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        if (other.getNewPath() == null ^ this.getNewPath() == null) return false;
        if (other.getNewPath() != null && other.getNewPath().equals(this.getNewPath()) == false) return false; 
        if (other.getNewGroupName() == null ^ this.getNewGroupName() == null) return false;
        if (other.getNewGroupName() != null && other.getNewGroupName().equals(this.getNewGroupName()) == false) return false; 
        return true;
    }
    
}
    