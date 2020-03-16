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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DisassociateGlobalReplicationGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateGlobalReplicationGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;
    /**
     * <p>
     * The name of the secondary cluster you wish to remove from the Global Datastore
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * The AWS region of secondary cluster you wish to remove from the Global Datastore
     * </p>
     */
    private String replicationGroupRegion;

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

    public DisassociateGlobalReplicationGroupRequest withGlobalReplicationGroupId(String globalReplicationGroupId) {
        setGlobalReplicationGroupId(globalReplicationGroupId);
        return this;
    }

    /**
     * <p>
     * The name of the secondary cluster you wish to remove from the Global Datastore
     * </p>
     * 
     * @param replicationGroupId
     *        The name of the secondary cluster you wish to remove from the Global Datastore
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The name of the secondary cluster you wish to remove from the Global Datastore
     * </p>
     * 
     * @return The name of the secondary cluster you wish to remove from the Global Datastore
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The name of the secondary cluster you wish to remove from the Global Datastore
     * </p>
     * 
     * @param replicationGroupId
     *        The name of the secondary cluster you wish to remove from the Global Datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateGlobalReplicationGroupRequest withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * The AWS region of secondary cluster you wish to remove from the Global Datastore
     * </p>
     * 
     * @param replicationGroupRegion
     *        The AWS region of secondary cluster you wish to remove from the Global Datastore
     */

    public void setReplicationGroupRegion(String replicationGroupRegion) {
        this.replicationGroupRegion = replicationGroupRegion;
    }

    /**
     * <p>
     * The AWS region of secondary cluster you wish to remove from the Global Datastore
     * </p>
     * 
     * @return The AWS region of secondary cluster you wish to remove from the Global Datastore
     */

    public String getReplicationGroupRegion() {
        return this.replicationGroupRegion;
    }

    /**
     * <p>
     * The AWS region of secondary cluster you wish to remove from the Global Datastore
     * </p>
     * 
     * @param replicationGroupRegion
     *        The AWS region of secondary cluster you wish to remove from the Global Datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateGlobalReplicationGroupRequest withReplicationGroupRegion(String replicationGroupRegion) {
        setReplicationGroupRegion(replicationGroupRegion);
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getReplicationGroupRegion() != null)
            sb.append("ReplicationGroupRegion: ").append(getReplicationGroupRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateGlobalReplicationGroupRequest == false)
            return false;
        DisassociateGlobalReplicationGroupRequest other = (DisassociateGlobalReplicationGroupRequest) obj;
        if (other.getGlobalReplicationGroupId() == null ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getReplicationGroupRegion() == null ^ this.getReplicationGroupRegion() == null)
            return false;
        if (other.getReplicationGroupRegion() != null && other.getReplicationGroupRegion().equals(this.getReplicationGroupRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getReplicationGroupRegion() == null) ? 0 : getReplicationGroupRegion().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateGlobalReplicationGroupRequest clone() {
        return (DisassociateGlobalReplicationGroupRequest) super.clone();
    }

}
