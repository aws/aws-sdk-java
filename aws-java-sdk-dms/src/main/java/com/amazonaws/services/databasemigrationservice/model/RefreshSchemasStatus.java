/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class RefreshSchemasStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;
    /**
     * <p>
     * The status of the schema.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date the schema was last refreshed.
     * </p>
     */
    private java.util.Date lastRefreshDate;
    /**
     * <p>
     * The last failure message for the schema.
     * </p>
     */
    private String lastFailureMessage;

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshSchemasStatus withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the replication instance.
     */

    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication instance.
     */

    public String getReplicationInstanceArn() {
        return this.replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshSchemasStatus withReplicationInstanceArn(String replicationInstanceArn) {
        setReplicationInstanceArn(replicationInstanceArn);
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param status
     *        The status of the schema.
     * @see RefreshSchemasStatusTypeValue
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @return The status of the schema.
     * @see RefreshSchemasStatusTypeValue
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param status
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RefreshSchemasStatusTypeValue
     */

    public RefreshSchemasStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param status
     *        The status of the schema.
     * @see RefreshSchemasStatusTypeValue
     */

    public void setStatus(RefreshSchemasStatusTypeValue status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param status
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RefreshSchemasStatusTypeValue
     */

    public RefreshSchemasStatus withStatus(RefreshSchemasStatusTypeValue status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date the schema was last refreshed.
     * </p>
     * 
     * @param lastRefreshDate
     *        The date the schema was last refreshed.
     */

    public void setLastRefreshDate(java.util.Date lastRefreshDate) {
        this.lastRefreshDate = lastRefreshDate;
    }

    /**
     * <p>
     * The date the schema was last refreshed.
     * </p>
     * 
     * @return The date the schema was last refreshed.
     */

    public java.util.Date getLastRefreshDate() {
        return this.lastRefreshDate;
    }

    /**
     * <p>
     * The date the schema was last refreshed.
     * </p>
     * 
     * @param lastRefreshDate
     *        The date the schema was last refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshSchemasStatus withLastRefreshDate(java.util.Date lastRefreshDate) {
        setLastRefreshDate(lastRefreshDate);
        return this;
    }

    /**
     * <p>
     * The last failure message for the schema.
     * </p>
     * 
     * @param lastFailureMessage
     *        The last failure message for the schema.
     */

    public void setLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
    }

    /**
     * <p>
     * The last failure message for the schema.
     * </p>
     * 
     * @return The last failure message for the schema.
     */

    public String getLastFailureMessage() {
        return this.lastFailureMessage;
    }

    /**
     * <p>
     * The last failure message for the schema.
     * </p>
     * 
     * @param lastFailureMessage
     *        The last failure message for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshSchemasStatus withLastFailureMessage(String lastFailureMessage) {
        setLastFailureMessage(lastFailureMessage);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn() + ",");
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: " + getReplicationInstanceArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastRefreshDate() != null)
            sb.append("LastRefreshDate: " + getLastRefreshDate() + ",");
        if (getLastFailureMessage() != null)
            sb.append("LastFailureMessage: " + getLastFailureMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshSchemasStatus == false)
            return false;
        RefreshSchemasStatus other = (RefreshSchemasStatus) obj;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastRefreshDate() == null ^ this.getLastRefreshDate() == null)
            return false;
        if (other.getLastRefreshDate() != null && other.getLastRefreshDate().equals(this.getLastRefreshDate()) == false)
            return false;
        if (other.getLastFailureMessage() == null ^ this.getLastFailureMessage() == null)
            return false;
        if (other.getLastFailureMessage() != null && other.getLastFailureMessage().equals(this.getLastFailureMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshDate() == null) ? 0 : getLastRefreshDate().hashCode());
        hashCode = prime * hashCode + ((getLastFailureMessage() == null) ? 0 : getLastFailureMessage().hashCode());
        return hashCode;
    }

    @Override
    public RefreshSchemasStatus clone() {
        try {
            return (RefreshSchemasStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
