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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/IncreaseNodeGroupsInGlobalReplicationGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncreaseNodeGroupsInGlobalReplicationGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;
    /**
     * <p>
     * The number of node groups you wish to add
     * </p>
     */
    private Integer nodeGroupCount;
    /**
     * <p>
     * Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for each
     * that comprise the Global Datastore
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RegionalConfiguration> regionalConfigurations;
    /**
     * <p>
     * Indicates that the process begins immediately. At present, the only permitted value for this parameter is true.
     * </p>
     */
    private Boolean applyImmediately;

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

    public IncreaseNodeGroupsInGlobalReplicationGroupRequest withGlobalReplicationGroupId(String globalReplicationGroupId) {
        setGlobalReplicationGroupId(globalReplicationGroupId);
        return this;
    }

    /**
     * <p>
     * The number of node groups you wish to add
     * </p>
     * 
     * @param nodeGroupCount
     *        The number of node groups you wish to add
     */

    public void setNodeGroupCount(Integer nodeGroupCount) {
        this.nodeGroupCount = nodeGroupCount;
    }

    /**
     * <p>
     * The number of node groups you wish to add
     * </p>
     * 
     * @return The number of node groups you wish to add
     */

    public Integer getNodeGroupCount() {
        return this.nodeGroupCount;
    }

    /**
     * <p>
     * The number of node groups you wish to add
     * </p>
     * 
     * @param nodeGroupCount
     *        The number of node groups you wish to add
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncreaseNodeGroupsInGlobalReplicationGroupRequest withNodeGroupCount(Integer nodeGroupCount) {
        setNodeGroupCount(nodeGroupCount);
        return this;
    }

    /**
     * <p>
     * Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for each
     * that comprise the Global Datastore
     * </p>
     * 
     * @return Describes the replication group IDs, the AWS regions where they are stored and the shard configuration
     *         for each that comprise the Global Datastore
     */

    public java.util.List<RegionalConfiguration> getRegionalConfigurations() {
        if (regionalConfigurations == null) {
            regionalConfigurations = new com.amazonaws.internal.SdkInternalList<RegionalConfiguration>();
        }
        return regionalConfigurations;
    }

    /**
     * <p>
     * Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for each
     * that comprise the Global Datastore
     * </p>
     * 
     * @param regionalConfigurations
     *        Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for
     *        each that comprise the Global Datastore
     */

    public void setRegionalConfigurations(java.util.Collection<RegionalConfiguration> regionalConfigurations) {
        if (regionalConfigurations == null) {
            this.regionalConfigurations = null;
            return;
        }

        this.regionalConfigurations = new com.amazonaws.internal.SdkInternalList<RegionalConfiguration>(regionalConfigurations);
    }

    /**
     * <p>
     * Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for each
     * that comprise the Global Datastore
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionalConfigurations(java.util.Collection)} or
     * {@link #withRegionalConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param regionalConfigurations
     *        Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for
     *        each that comprise the Global Datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncreaseNodeGroupsInGlobalReplicationGroupRequest withRegionalConfigurations(RegionalConfiguration... regionalConfigurations) {
        if (this.regionalConfigurations == null) {
            setRegionalConfigurations(new com.amazonaws.internal.SdkInternalList<RegionalConfiguration>(regionalConfigurations.length));
        }
        for (RegionalConfiguration ele : regionalConfigurations) {
            this.regionalConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for each
     * that comprise the Global Datastore
     * </p>
     * 
     * @param regionalConfigurations
     *        Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for
     *        each that comprise the Global Datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncreaseNodeGroupsInGlobalReplicationGroupRequest withRegionalConfigurations(java.util.Collection<RegionalConfiguration> regionalConfigurations) {
        setRegionalConfigurations(regionalConfigurations);
        return this;
    }

    /**
     * <p>
     * Indicates that the process begins immediately. At present, the only permitted value for this parameter is true.
     * </p>
     * 
     * @param applyImmediately
     *        Indicates that the process begins immediately. At present, the only permitted value for this parameter is
     *        true.
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Indicates that the process begins immediately. At present, the only permitted value for this parameter is true.
     * </p>
     * 
     * @return Indicates that the process begins immediately. At present, the only permitted value for this parameter is
     *         true.
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * Indicates that the process begins immediately. At present, the only permitted value for this parameter is true.
     * </p>
     * 
     * @param applyImmediately
     *        Indicates that the process begins immediately. At present, the only permitted value for this parameter is
     *        true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncreaseNodeGroupsInGlobalReplicationGroupRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * Indicates that the process begins immediately. At present, the only permitted value for this parameter is true.
     * </p>
     * 
     * @return Indicates that the process begins immediately. At present, the only permitted value for this parameter is
     *         true.
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
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
        if (getNodeGroupCount() != null)
            sb.append("NodeGroupCount: ").append(getNodeGroupCount()).append(",");
        if (getRegionalConfigurations() != null)
            sb.append("RegionalConfigurations: ").append(getRegionalConfigurations()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IncreaseNodeGroupsInGlobalReplicationGroupRequest == false)
            return false;
        IncreaseNodeGroupsInGlobalReplicationGroupRequest other = (IncreaseNodeGroupsInGlobalReplicationGroupRequest) obj;
        if (other.getGlobalReplicationGroupId() == null ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getNodeGroupCount() == null ^ this.getNodeGroupCount() == null)
            return false;
        if (other.getNodeGroupCount() != null && other.getNodeGroupCount().equals(this.getNodeGroupCount()) == false)
            return false;
        if (other.getRegionalConfigurations() == null ^ this.getRegionalConfigurations() == null)
            return false;
        if (other.getRegionalConfigurations() != null && other.getRegionalConfigurations().equals(this.getRegionalConfigurations()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getNodeGroupCount() == null) ? 0 : getNodeGroupCount().hashCode());
        hashCode = prime * hashCode + ((getRegionalConfigurations() == null) ? 0 : getRegionalConfigurations().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public IncreaseNodeGroupsInGlobalReplicationGroupRequest clone() {
        return (IncreaseNodeGroupsInGlobalReplicationGroupRequest) super.clone();
    }

}
