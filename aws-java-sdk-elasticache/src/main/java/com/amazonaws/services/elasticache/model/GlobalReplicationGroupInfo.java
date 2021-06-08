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
 * <p>
 * The name of the Global datastore and role of this replication group in the Global datastore.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/GlobalReplicationGroupInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalReplicationGroupInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     */
    private String globalReplicationGroupId;
    /**
     * <p>
     * The role of the replication group in a Global datastore. Can be primary or secondary.
     * </p>
     */
    private String globalReplicationGroupMemberRole;

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     * 
     * @param globalReplicationGroupId
     *        The name of the Global datastore
     */

    public void setGlobalReplicationGroupId(String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     * 
     * @return The name of the Global datastore
     */

    public String getGlobalReplicationGroupId() {
        return this.globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     * 
     * @param globalReplicationGroupId
     *        The name of the Global datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroupInfo withGlobalReplicationGroupId(String globalReplicationGroupId) {
        setGlobalReplicationGroupId(globalReplicationGroupId);
        return this;
    }

    /**
     * <p>
     * The role of the replication group in a Global datastore. Can be primary or secondary.
     * </p>
     * 
     * @param globalReplicationGroupMemberRole
     *        The role of the replication group in a Global datastore. Can be primary or secondary.
     */

    public void setGlobalReplicationGroupMemberRole(String globalReplicationGroupMemberRole) {
        this.globalReplicationGroupMemberRole = globalReplicationGroupMemberRole;
    }

    /**
     * <p>
     * The role of the replication group in a Global datastore. Can be primary or secondary.
     * </p>
     * 
     * @return The role of the replication group in a Global datastore. Can be primary or secondary.
     */

    public String getGlobalReplicationGroupMemberRole() {
        return this.globalReplicationGroupMemberRole;
    }

    /**
     * <p>
     * The role of the replication group in a Global datastore. Can be primary or secondary.
     * </p>
     * 
     * @param globalReplicationGroupMemberRole
     *        The role of the replication group in a Global datastore. Can be primary or secondary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroupInfo withGlobalReplicationGroupMemberRole(String globalReplicationGroupMemberRole) {
        setGlobalReplicationGroupMemberRole(globalReplicationGroupMemberRole);
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
        if (getGlobalReplicationGroupId() != null)
            sb.append("GlobalReplicationGroupId: ").append(getGlobalReplicationGroupId()).append(",");
        if (getGlobalReplicationGroupMemberRole() != null)
            sb.append("GlobalReplicationGroupMemberRole: ").append(getGlobalReplicationGroupMemberRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalReplicationGroupInfo == false)
            return false;
        GlobalReplicationGroupInfo other = (GlobalReplicationGroupInfo) obj;
        if (other.getGlobalReplicationGroupId() == null ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getGlobalReplicationGroupMemberRole() == null ^ this.getGlobalReplicationGroupMemberRole() == null)
            return false;
        if (other.getGlobalReplicationGroupMemberRole() != null
                && other.getGlobalReplicationGroupMemberRole().equals(this.getGlobalReplicationGroupMemberRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getGlobalReplicationGroupMemberRole() == null) ? 0 : getGlobalReplicationGroupMemberRole().hashCode());
        return hashCode;
    }

    @Override
    public GlobalReplicationGroupInfo clone() {
        try {
            return (GlobalReplicationGroupInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
