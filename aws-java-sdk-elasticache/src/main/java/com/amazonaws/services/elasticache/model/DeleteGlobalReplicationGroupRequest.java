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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteGlobalReplicationGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteGlobalReplicationGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     */
    private String globalReplicationGroupId;
    /**
     * <p>
     * The primary replication group is retained as a standalone replication group.
     * </p>
     */
    private Boolean retainPrimaryReplicationGroup;

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

    public DeleteGlobalReplicationGroupRequest withGlobalReplicationGroupId(String globalReplicationGroupId) {
        setGlobalReplicationGroupId(globalReplicationGroupId);
        return this;
    }

    /**
     * <p>
     * The primary replication group is retained as a standalone replication group.
     * </p>
     * 
     * @param retainPrimaryReplicationGroup
     *        The primary replication group is retained as a standalone replication group.
     */

    public void setRetainPrimaryReplicationGroup(Boolean retainPrimaryReplicationGroup) {
        this.retainPrimaryReplicationGroup = retainPrimaryReplicationGroup;
    }

    /**
     * <p>
     * The primary replication group is retained as a standalone replication group.
     * </p>
     * 
     * @return The primary replication group is retained as a standalone replication group.
     */

    public Boolean getRetainPrimaryReplicationGroup() {
        return this.retainPrimaryReplicationGroup;
    }

    /**
     * <p>
     * The primary replication group is retained as a standalone replication group.
     * </p>
     * 
     * @param retainPrimaryReplicationGroup
     *        The primary replication group is retained as a standalone replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGlobalReplicationGroupRequest withRetainPrimaryReplicationGroup(Boolean retainPrimaryReplicationGroup) {
        setRetainPrimaryReplicationGroup(retainPrimaryReplicationGroup);
        return this;
    }

    /**
     * <p>
     * The primary replication group is retained as a standalone replication group.
     * </p>
     * 
     * @return The primary replication group is retained as a standalone replication group.
     */

    public Boolean isRetainPrimaryReplicationGroup() {
        return this.retainPrimaryReplicationGroup;
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
        if (getRetainPrimaryReplicationGroup() != null)
            sb.append("RetainPrimaryReplicationGroup: ").append(getRetainPrimaryReplicationGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteGlobalReplicationGroupRequest == false)
            return false;
        DeleteGlobalReplicationGroupRequest other = (DeleteGlobalReplicationGroupRequest) obj;
        if (other.getGlobalReplicationGroupId() == null ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getRetainPrimaryReplicationGroup() == null ^ this.getRetainPrimaryReplicationGroup() == null)
            return false;
        if (other.getRetainPrimaryReplicationGroup() != null
                && other.getRetainPrimaryReplicationGroup().equals(this.getRetainPrimaryReplicationGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getRetainPrimaryReplicationGroup() == null) ? 0 : getRetainPrimaryReplicationGroup().hashCode());
        return hashCode;
    }

    @Override
    public DeleteGlobalReplicationGroupRequest clone() {
        return (DeleteGlobalReplicationGroupRequest) super.clone();
    }

}
