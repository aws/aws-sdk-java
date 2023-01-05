/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/FailoverShard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailoverShardRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster being failed over
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The name of the shard
     * </p>
     */
    private String shardName;

    /**
     * <p>
     * The cluster being failed over
     * </p>
     * 
     * @param clusterName
     *        The cluster being failed over
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The cluster being failed over
     * </p>
     * 
     * @return The cluster being failed over
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The cluster being failed over
     * </p>
     * 
     * @param clusterName
     *        The cluster being failed over
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverShardRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The name of the shard
     * </p>
     * 
     * @param shardName
     *        The name of the shard
     */

    public void setShardName(String shardName) {
        this.shardName = shardName;
    }

    /**
     * <p>
     * The name of the shard
     * </p>
     * 
     * @return The name of the shard
     */

    public String getShardName() {
        return this.shardName;
    }

    /**
     * <p>
     * The name of the shard
     * </p>
     * 
     * @param shardName
     *        The name of the shard
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverShardRequest withShardName(String shardName) {
        setShardName(shardName);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getShardName() != null)
            sb.append("ShardName: ").append(getShardName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailoverShardRequest == false)
            return false;
        FailoverShardRequest other = (FailoverShardRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getShardName() == null ^ this.getShardName() == null)
            return false;
        if (other.getShardName() != null && other.getShardName().equals(this.getShardName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getShardName() == null) ? 0 : getShardName().hashCode());
        return hashCode;
    }

    @Override
    public FailoverShardRequest clone() {
        return (FailoverShardRequest) super.clone();
    }

}
