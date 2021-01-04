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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/UserGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the user group.
     * </p>
     */
    private String userGroupId;
    /**
     * <p>
     * Indicates user group status. Can be "creating", "active", "modifying", "deleting".
     * </p>
     */
    private String status;
    /**
     * <p>
     * The current supported value is Redis.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The list of user IDs that belong to the user group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userIds;
    /**
     * <p>
     * A list of updates being applied to the user groups.
     * </p>
     */
    private UserGroupPendingChanges pendingChanges;
    /**
     * <p>
     * A list of replication groups that the user group can access.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> replicationGroups;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user group.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The ID of the user group.
     * </p>
     * 
     * @param userGroupId
     *        The ID of the user group.
     */

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * <p>
     * The ID of the user group.
     * </p>
     * 
     * @return The ID of the user group.
     */

    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * <p>
     * The ID of the user group.
     * </p>
     * 
     * @param userGroupId
     *        The ID of the user group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroup withUserGroupId(String userGroupId) {
        setUserGroupId(userGroupId);
        return this;
    }

    /**
     * <p>
     * Indicates user group status. Can be "creating", "active", "modifying", "deleting".
     * </p>
     * 
     * @param status
     *        Indicates user group status. Can be "creating", "active", "modifying", "deleting".
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates user group status. Can be "creating", "active", "modifying", "deleting".
     * </p>
     * 
     * @return Indicates user group status. Can be "creating", "active", "modifying", "deleting".
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates user group status. Can be "creating", "active", "modifying", "deleting".
     * </p>
     * 
     * @param status
     *        Indicates user group status. Can be "creating", "active", "modifying", "deleting".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current supported value is Redis.
     * </p>
     * 
     * @param engine
     *        The current supported value is Redis.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The current supported value is Redis.
     * </p>
     * 
     * @return The current supported value is Redis.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The current supported value is Redis.
     * </p>
     * 
     * @param engine
     *        The current supported value is Redis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroup withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The list of user IDs that belong to the user group.
     * </p>
     * 
     * @return The list of user IDs that belong to the user group.
     */

    public java.util.List<String> getUserIds() {
        if (userIds == null) {
            userIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return userIds;
    }

    /**
     * <p>
     * The list of user IDs that belong to the user group.
     * </p>
     * 
     * @param userIds
     *        The list of user IDs that belong to the user group.
     */

    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new com.amazonaws.internal.SdkInternalList<String>(userIds);
    }

    /**
     * <p>
     * The list of user IDs that belong to the user group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIds(java.util.Collection)} or {@link #withUserIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userIds
     *        The list of user IDs that belong to the user group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroup withUserIds(String... userIds) {
        if (this.userIds == null) {
            setUserIds(new com.amazonaws.internal.SdkInternalList<String>(userIds.length));
        }
        for (String ele : userIds) {
            this.userIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user IDs that belong to the user group.
     * </p>
     * 
     * @param userIds
     *        The list of user IDs that belong to the user group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroup withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * A list of updates being applied to the user groups.
     * </p>
     * 
     * @param pendingChanges
     *        A list of updates being applied to the user groups.
     */

    public void setPendingChanges(UserGroupPendingChanges pendingChanges) {
        this.pendingChanges = pendingChanges;
    }

    /**
     * <p>
     * A list of updates being applied to the user groups.
     * </p>
     * 
     * @return A list of updates being applied to the user groups.
     */

    public UserGroupPendingChanges getPendingChanges() {
        return this.pendingChanges;
    }

    /**
     * <p>
     * A list of updates being applied to the user groups.
     * </p>
     * 
     * @param pendingChanges
     *        A list of updates being applied to the user groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroup withPendingChanges(UserGroupPendingChanges pendingChanges) {
        setPendingChanges(pendingChanges);
        return this;
    }

    /**
     * <p>
     * A list of replication groups that the user group can access.
     * </p>
     * 
     * @return A list of replication groups that the user group can access.
     */

    public java.util.List<String> getReplicationGroups() {
        if (replicationGroups == null) {
            replicationGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return replicationGroups;
    }

    /**
     * <p>
     * A list of replication groups that the user group can access.
     * </p>
     * 
     * @param replicationGroups
     *        A list of replication groups that the user group can access.
     */

    public void setReplicationGroups(java.util.Collection<String> replicationGroups) {
        if (replicationGroups == null) {
            this.replicationGroups = null;
            return;
        }

        this.replicationGroups = new com.amazonaws.internal.SdkInternalList<String>(replicationGroups);
    }

    /**
     * <p>
     * A list of replication groups that the user group can access.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationGroups(java.util.Collection)} or {@link #withReplicationGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationGroups
     *        A list of replication groups that the user group can access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroup withReplicationGroups(String... replicationGroups) {
        if (this.replicationGroups == null) {
            setReplicationGroups(new com.amazonaws.internal.SdkInternalList<String>(replicationGroups.length));
        }
        for (String ele : replicationGroups) {
            this.replicationGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of replication groups that the user group can access.
     * </p>
     * 
     * @param replicationGroups
     *        A list of replication groups that the user group can access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroup withReplicationGroups(java.util.Collection<String> replicationGroups) {
        setReplicationGroups(replicationGroups);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user group.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the user group.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user group.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user group.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the user group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroup withARN(String aRN) {
        setARN(aRN);
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
        if (getUserGroupId() != null)
            sb.append("UserGroupId: ").append(getUserGroupId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getUserIds() != null)
            sb.append("UserIds: ").append(getUserIds()).append(",");
        if (getPendingChanges() != null)
            sb.append("PendingChanges: ").append(getPendingChanges()).append(",");
        if (getReplicationGroups() != null)
            sb.append("ReplicationGroups: ").append(getReplicationGroups()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserGroup == false)
            return false;
        UserGroup other = (UserGroup) obj;
        if (other.getUserGroupId() == null ^ this.getUserGroupId() == null)
            return false;
        if (other.getUserGroupId() != null && other.getUserGroupId().equals(this.getUserGroupId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getPendingChanges() == null ^ this.getPendingChanges() == null)
            return false;
        if (other.getPendingChanges() != null && other.getPendingChanges().equals(this.getPendingChanges()) == false)
            return false;
        if (other.getReplicationGroups() == null ^ this.getReplicationGroups() == null)
            return false;
        if (other.getReplicationGroups() != null && other.getReplicationGroups().equals(this.getReplicationGroups()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserGroupId() == null) ? 0 : getUserGroupId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getPendingChanges() == null) ? 0 : getPendingChanges().hashCode());
        hashCode = prime * hashCode + ((getReplicationGroups() == null) ? 0 : getReplicationGroups().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public UserGroup clone() {
        try {
            return (UserGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
