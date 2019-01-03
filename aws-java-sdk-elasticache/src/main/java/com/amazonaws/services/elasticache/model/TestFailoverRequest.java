/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/TestFailover" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestFailoverRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the replication group (console: cluster) whose automatic failover is being tested by this operation.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * The name of the node group (called shard in the console) in this replication group on which automatic failover is
     * to be tested. You may test automatic failover on up to 5 node groups in any rolling 24-hour period.
     * </p>
     */
    private String nodeGroupId;

    /**
     * <p>
     * The name of the replication group (console: cluster) whose automatic failover is being tested by this operation.
     * </p>
     * 
     * @param replicationGroupId
     *        The name of the replication group (console: cluster) whose automatic failover is being tested by this
     *        operation.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The name of the replication group (console: cluster) whose automatic failover is being tested by this operation.
     * </p>
     * 
     * @return The name of the replication group (console: cluster) whose automatic failover is being tested by this
     *         operation.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The name of the replication group (console: cluster) whose automatic failover is being tested by this operation.
     * </p>
     * 
     * @param replicationGroupId
     *        The name of the replication group (console: cluster) whose automatic failover is being tested by this
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestFailoverRequest withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * The name of the node group (called shard in the console) in this replication group on which automatic failover is
     * to be tested. You may test automatic failover on up to 5 node groups in any rolling 24-hour period.
     * </p>
     * 
     * @param nodeGroupId
     *        The name of the node group (called shard in the console) in this replication group on which automatic
     *        failover is to be tested. You may test automatic failover on up to 5 node groups in any rolling 24-hour
     *        period.
     */

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * The name of the node group (called shard in the console) in this replication group on which automatic failover is
     * to be tested. You may test automatic failover on up to 5 node groups in any rolling 24-hour period.
     * </p>
     * 
     * @return The name of the node group (called shard in the console) in this replication group on which automatic
     *         failover is to be tested. You may test automatic failover on up to 5 node groups in any rolling 24-hour
     *         period.
     */

    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * <p>
     * The name of the node group (called shard in the console) in this replication group on which automatic failover is
     * to be tested. You may test automatic failover on up to 5 node groups in any rolling 24-hour period.
     * </p>
     * 
     * @param nodeGroupId
     *        The name of the node group (called shard in the console) in this replication group on which automatic
     *        failover is to be tested. You may test automatic failover on up to 5 node groups in any rolling 24-hour
     *        period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestFailoverRequest withNodeGroupId(String nodeGroupId) {
        setNodeGroupId(nodeGroupId);
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getNodeGroupId() != null)
            sb.append("NodeGroupId: ").append(getNodeGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestFailoverRequest == false)
            return false;
        TestFailoverRequest other = (TestFailoverRequest) obj;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        return hashCode;
    }

    @Override
    public TestFailoverRequest clone() {
        return (TestFailoverRequest) super.clone();
    }

}
