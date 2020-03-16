/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/FailoverGlobalReplicationGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailoverGlobalReplicationGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;
    /**
     * <p>
     * The AWS region of the primary cluster of the Global Datastore
     * </p>
     */
    private String primaryRegion;
    /**
     * <p>
     * The name of the primary replication group
     * </p>
     */
    private String primaryReplicationGroupId;

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     * 
     * @param globalReplicationGroupId
     *        The name of the Global Datastore
     */

    public void setGlobalReplicationGroupId(String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     * 
     * @return The name of the Global Datastore
     */

    public String getGlobalReplicationGroupId() {
        return this.globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     * 
     * @param globalReplicationGroupId
     *        The name of the Global Datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverGlobalReplicationGroupRequest withGlobalReplicationGroupId(String globalReplicationGroupId) {
        setGlobalReplicationGroupId(globalReplicationGroupId);
        return this;
    }

    /**
     * <p>
     * The AWS region of the primary cluster of the Global Datastore
     * </p>
     * 
     * @param primaryRegion
     *        The AWS region of the primary cluster of the Global Datastore
     */

    public void setPrimaryRegion(String primaryRegion) {
        this.primaryRegion = primaryRegion;
    }

    /**
     * <p>
     * The AWS region of the primary cluster of the Global Datastore
     * </p>
     * 
     * @return The AWS region of the primary cluster of the Global Datastore
     */

    public String getPrimaryRegion() {
        return this.primaryRegion;
    }

    /**
     * <p>
     * The AWS region of the primary cluster of the Global Datastore
     * </p>
     * 
     * @param primaryRegion
     *        The AWS region of the primary cluster of the Global Datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverGlobalReplicationGroupRequest withPrimaryRegion(String primaryRegion) {
        setPrimaryRegion(primaryRegion);
        return this;
    }

    /**
     * <p>
     * The name of the primary replication group
     * </p>
     * 
     * @param primaryReplicationGroupId
     *        The name of the primary replication group
     */

    public void setPrimaryReplicationGroupId(String primaryReplicationGroupId) {
        this.primaryReplicationGroupId = primaryReplicationGroupId;
    }

    /**
     * <p>
     * The name of the primary replication group
     * </p>
     * 
     * @return The name of the primary replication group
     */

    public String getPrimaryReplicationGroupId() {
        return this.primaryReplicationGroupId;
    }

    /**
     * <p>
     * The name of the primary replication group
     * </p>
     * 
     * @param primaryReplicationGroupId
     *        The name of the primary replication group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverGlobalReplicationGroupRequest withPrimaryReplicationGroupId(String primaryReplicationGroupId) {
        setPrimaryReplicationGroupId(primaryReplicationGroupId);
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
        if (getPrimaryRegion() != null)
            sb.append("PrimaryRegion: ").append(getPrimaryRegion()).append(",");
        if (getPrimaryReplicationGroupId() != null)
            sb.append("PrimaryReplicationGroupId: ").append(getPrimaryReplicationGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailoverGlobalReplicationGroupRequest == false)
            return false;
        FailoverGlobalReplicationGroupRequest other = (FailoverGlobalReplicationGroupRequest) obj;
        if (other.getGlobalReplicationGroupId() == null ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getPrimaryRegion() == null ^ this.getPrimaryRegion() == null)
            return false;
        if (other.getPrimaryRegion() != null && other.getPrimaryRegion().equals(this.getPrimaryRegion()) == false)
            return false;
        if (other.getPrimaryReplicationGroupId() == null ^ this.getPrimaryReplicationGroupId() == null)
            return false;
        if (other.getPrimaryReplicationGroupId() != null && other.getPrimaryReplicationGroupId().equals(this.getPrimaryReplicationGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getPrimaryRegion() == null) ? 0 : getPrimaryRegion().hashCode());
        hashCode = prime * hashCode + ((getPrimaryReplicationGroupId() == null) ? 0 : getPrimaryReplicationGroupId().hashCode());
        return hashCode;
    }

    @Override
    public FailoverGlobalReplicationGroupRequest clone() {
        return (FailoverGlobalReplicationGroupRequest) super.clone();
    }

}
