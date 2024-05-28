/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/GetKeyspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKeyspaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the keyspace.
     * </p>
     */
    private String keyspaceName;
    /**
     * <p>
     * Returns the ARN of the keyspace.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Returns the replication strategy of the keyspace. The options are <code>SINGLE_REGION</code> or
     * <code>MULTI_REGION</code>.
     * </p>
     */
    private String replicationStrategy;
    /**
     * <p>
     * If the <code>replicationStrategy</code> of the keyspace is <code>MULTI_REGION</code>, a list of replication
     * Regions is returned.
     * </p>
     */
    private java.util.List<String> replicationRegions;

    /**
     * <p>
     * The name of the keyspace.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace.
     */

    public void setKeyspaceName(String keyspaceName) {
        this.keyspaceName = keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace.
     * </p>
     * 
     * @return The name of the keyspace.
     */

    public String getKeyspaceName() {
        return this.keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyspaceResult withKeyspaceName(String keyspaceName) {
        setKeyspaceName(keyspaceName);
        return this;
    }

    /**
     * <p>
     * Returns the ARN of the keyspace.
     * </p>
     * 
     * @param resourceArn
     *        Returns the ARN of the keyspace.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Returns the ARN of the keyspace.
     * </p>
     * 
     * @return Returns the ARN of the keyspace.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Returns the ARN of the keyspace.
     * </p>
     * 
     * @param resourceArn
     *        Returns the ARN of the keyspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyspaceResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Returns the replication strategy of the keyspace. The options are <code>SINGLE_REGION</code> or
     * <code>MULTI_REGION</code>.
     * </p>
     * 
     * @param replicationStrategy
     *        Returns the replication strategy of the keyspace. The options are <code>SINGLE_REGION</code> or
     *        <code>MULTI_REGION</code>.
     * @see Rs
     */

    public void setReplicationStrategy(String replicationStrategy) {
        this.replicationStrategy = replicationStrategy;
    }

    /**
     * <p>
     * Returns the replication strategy of the keyspace. The options are <code>SINGLE_REGION</code> or
     * <code>MULTI_REGION</code>.
     * </p>
     * 
     * @return Returns the replication strategy of the keyspace. The options are <code>SINGLE_REGION</code> or
     *         <code>MULTI_REGION</code>.
     * @see Rs
     */

    public String getReplicationStrategy() {
        return this.replicationStrategy;
    }

    /**
     * <p>
     * Returns the replication strategy of the keyspace. The options are <code>SINGLE_REGION</code> or
     * <code>MULTI_REGION</code>.
     * </p>
     * 
     * @param replicationStrategy
     *        Returns the replication strategy of the keyspace. The options are <code>SINGLE_REGION</code> or
     *        <code>MULTI_REGION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Rs
     */

    public GetKeyspaceResult withReplicationStrategy(String replicationStrategy) {
        setReplicationStrategy(replicationStrategy);
        return this;
    }

    /**
     * <p>
     * Returns the replication strategy of the keyspace. The options are <code>SINGLE_REGION</code> or
     * <code>MULTI_REGION</code>.
     * </p>
     * 
     * @param replicationStrategy
     *        Returns the replication strategy of the keyspace. The options are <code>SINGLE_REGION</code> or
     *        <code>MULTI_REGION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Rs
     */

    public GetKeyspaceResult withReplicationStrategy(Rs replicationStrategy) {
        this.replicationStrategy = replicationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>replicationStrategy</code> of the keyspace is <code>MULTI_REGION</code>, a list of replication
     * Regions is returned.
     * </p>
     * 
     * @return If the <code>replicationStrategy</code> of the keyspace is <code>MULTI_REGION</code>, a list of
     *         replication Regions is returned.
     */

    public java.util.List<String> getReplicationRegions() {
        return replicationRegions;
    }

    /**
     * <p>
     * If the <code>replicationStrategy</code> of the keyspace is <code>MULTI_REGION</code>, a list of replication
     * Regions is returned.
     * </p>
     * 
     * @param replicationRegions
     *        If the <code>replicationStrategy</code> of the keyspace is <code>MULTI_REGION</code>, a list of
     *        replication Regions is returned.
     */

    public void setReplicationRegions(java.util.Collection<String> replicationRegions) {
        if (replicationRegions == null) {
            this.replicationRegions = null;
            return;
        }

        this.replicationRegions = new java.util.ArrayList<String>(replicationRegions);
    }

    /**
     * <p>
     * If the <code>replicationStrategy</code> of the keyspace is <code>MULTI_REGION</code>, a list of replication
     * Regions is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationRegions(java.util.Collection)} or {@link #withReplicationRegions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationRegions
     *        If the <code>replicationStrategy</code> of the keyspace is <code>MULTI_REGION</code>, a list of
     *        replication Regions is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyspaceResult withReplicationRegions(String... replicationRegions) {
        if (this.replicationRegions == null) {
            setReplicationRegions(new java.util.ArrayList<String>(replicationRegions.length));
        }
        for (String ele : replicationRegions) {
            this.replicationRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the <code>replicationStrategy</code> of the keyspace is <code>MULTI_REGION</code>, a list of replication
     * Regions is returned.
     * </p>
     * 
     * @param replicationRegions
     *        If the <code>replicationStrategy</code> of the keyspace is <code>MULTI_REGION</code>, a list of
     *        replication Regions is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyspaceResult withReplicationRegions(java.util.Collection<String> replicationRegions) {
        setReplicationRegions(replicationRegions);
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
        if (getKeyspaceName() != null)
            sb.append("KeyspaceName: ").append(getKeyspaceName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getReplicationStrategy() != null)
            sb.append("ReplicationStrategy: ").append(getReplicationStrategy()).append(",");
        if (getReplicationRegions() != null)
            sb.append("ReplicationRegions: ").append(getReplicationRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyspaceResult == false)
            return false;
        GetKeyspaceResult other = (GetKeyspaceResult) obj;
        if (other.getKeyspaceName() == null ^ this.getKeyspaceName() == null)
            return false;
        if (other.getKeyspaceName() != null && other.getKeyspaceName().equals(this.getKeyspaceName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getReplicationStrategy() == null ^ this.getReplicationStrategy() == null)
            return false;
        if (other.getReplicationStrategy() != null && other.getReplicationStrategy().equals(this.getReplicationStrategy()) == false)
            return false;
        if (other.getReplicationRegions() == null ^ this.getReplicationRegions() == null)
            return false;
        if (other.getReplicationRegions() != null && other.getReplicationRegions().equals(this.getReplicationRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyspaceName() == null) ? 0 : getKeyspaceName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationStrategy() == null) ? 0 : getReplicationStrategy().hashCode());
        hashCode = prime * hashCode + ((getReplicationRegions() == null) ? 0 : getReplicationRegions().hashCode());
        return hashCode;
    }

    @Override
    public GetKeyspaceResult clone() {
        try {
            return (GetKeyspaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
