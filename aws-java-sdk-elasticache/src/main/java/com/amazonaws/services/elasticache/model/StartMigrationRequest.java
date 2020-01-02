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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/StartMigration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMigrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the replication group to which data should be migrated.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have only
     * one element.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CustomerNodeEndpoint> customerNodeEndpointList;

    /**
     * <p>
     * The ID of the replication group to which data should be migrated.
     * </p>
     * 
     * @param replicationGroupId
     *        The ID of the replication group to which data should be migrated.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group to which data should be migrated.
     * </p>
     * 
     * @return The ID of the replication group to which data should be migrated.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group to which data should be migrated.
     * </p>
     * 
     * @param replicationGroupId
     *        The ID of the replication group to which data should be migrated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMigrationRequest withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have only
     * one element.
     * </p>
     * 
     * @return List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have
     *         only one element.
     */

    public java.util.List<CustomerNodeEndpoint> getCustomerNodeEndpointList() {
        if (customerNodeEndpointList == null) {
            customerNodeEndpointList = new com.amazonaws.internal.SdkInternalList<CustomerNodeEndpoint>();
        }
        return customerNodeEndpointList;
    }

    /**
     * <p>
     * List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have only
     * one element.
     * </p>
     * 
     * @param customerNodeEndpointList
     *        List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have
     *        only one element.
     */

    public void setCustomerNodeEndpointList(java.util.Collection<CustomerNodeEndpoint> customerNodeEndpointList) {
        if (customerNodeEndpointList == null) {
            this.customerNodeEndpointList = null;
            return;
        }

        this.customerNodeEndpointList = new com.amazonaws.internal.SdkInternalList<CustomerNodeEndpoint>(customerNodeEndpointList);
    }

    /**
     * <p>
     * List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have only
     * one element.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomerNodeEndpointList(java.util.Collection)} or
     * {@link #withCustomerNodeEndpointList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customerNodeEndpointList
     *        List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have
     *        only one element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMigrationRequest withCustomerNodeEndpointList(CustomerNodeEndpoint... customerNodeEndpointList) {
        if (this.customerNodeEndpointList == null) {
            setCustomerNodeEndpointList(new com.amazonaws.internal.SdkInternalList<CustomerNodeEndpoint>(customerNodeEndpointList.length));
        }
        for (CustomerNodeEndpoint ele : customerNodeEndpointList) {
            this.customerNodeEndpointList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have only
     * one element.
     * </p>
     * 
     * @param customerNodeEndpointList
     *        List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have
     *        only one element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMigrationRequest withCustomerNodeEndpointList(java.util.Collection<CustomerNodeEndpoint> customerNodeEndpointList) {
        setCustomerNodeEndpointList(customerNodeEndpointList);
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
        if (getCustomerNodeEndpointList() != null)
            sb.append("CustomerNodeEndpointList: ").append(getCustomerNodeEndpointList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMigrationRequest == false)
            return false;
        StartMigrationRequest other = (StartMigrationRequest) obj;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getCustomerNodeEndpointList() == null ^ this.getCustomerNodeEndpointList() == null)
            return false;
        if (other.getCustomerNodeEndpointList() != null && other.getCustomerNodeEndpointList().equals(this.getCustomerNodeEndpointList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getCustomerNodeEndpointList() == null) ? 0 : getCustomerNodeEndpointList().hashCode());
        return hashCode;
    }

    @Override
    public StartMigrationRequest clone() {
        return (StartMigrationRequest) super.clone();
    }

}
