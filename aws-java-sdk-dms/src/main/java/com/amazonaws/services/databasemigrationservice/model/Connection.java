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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status of the connection between an endpoint and a replication instance, including Amazon Resource Names (ARNs) and
 * the last error message issued.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/Connection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Connection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;
    /**
     * <p>
     * The ARN string that uniquely identifies the endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * The connection status. This parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"successful"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"testing"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The error message when the connection last failed.
     * </p>
     */
    private String lastFailureMessage;
    /**
     * <p>
     * The identifier of the endpoint. Identifiers must begin with a letter and must contain only ASCII letters, digits,
     * and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String endpointIdentifier;
    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * </p>
     */
    private String replicationInstanceIdentifier;

    /**
     * <p>
     * The ARN of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The ARN of the replication instance.
     */

    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The ARN of the replication instance.
     * </p>
     * 
     * @return The ARN of the replication instance.
     */

    public String getReplicationInstanceArn() {
        return this.replicationInstanceArn;
    }

    /**
     * <p>
     * The ARN of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The ARN of the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withReplicationInstanceArn(String replicationInstanceArn) {
        setReplicationInstanceArn(replicationInstanceArn);
        return this;
    }

    /**
     * <p>
     * The ARN string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The ARN string that uniquely identifies the endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The ARN string that uniquely identifies the endpoint.
     * </p>
     * 
     * @return The ARN string that uniquely identifies the endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The ARN string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The ARN string that uniquely identifies the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The connection status. This parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"successful"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"testing"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The connection status. This parameter can return one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"successful"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"testing"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"failed"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"deleting"</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The connection status. This parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"successful"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"testing"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The connection status. This parameter can return one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"successful"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"testing"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"failed"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"deleting"</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The connection status. This parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"successful"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"testing"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The connection status. This parameter can return one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"successful"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"testing"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"failed"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"deleting"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The error message when the connection last failed.
     * </p>
     * 
     * @param lastFailureMessage
     *        The error message when the connection last failed.
     */

    public void setLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
    }

    /**
     * <p>
     * The error message when the connection last failed.
     * </p>
     * 
     * @return The error message when the connection last failed.
     */

    public String getLastFailureMessage() {
        return this.lastFailureMessage;
    }

    /**
     * <p>
     * The error message when the connection last failed.
     * </p>
     * 
     * @param lastFailureMessage
     *        The error message when the connection last failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withLastFailureMessage(String lastFailureMessage) {
        setLastFailureMessage(lastFailureMessage);
        return this;
    }

    /**
     * <p>
     * The identifier of the endpoint. Identifiers must begin with a letter and must contain only ASCII letters, digits,
     * and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param endpointIdentifier
     *        The identifier of the endpoint. Identifiers must begin with a letter and must contain only ASCII letters,
     *        digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     */

    public void setEndpointIdentifier(String endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
    }

    /**
     * <p>
     * The identifier of the endpoint. Identifiers must begin with a letter and must contain only ASCII letters, digits,
     * and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @return The identifier of the endpoint. Identifiers must begin with a letter and must contain only ASCII letters,
     *         digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     */

    public String getEndpointIdentifier() {
        return this.endpointIdentifier;
    }

    /**
     * <p>
     * The identifier of the endpoint. Identifiers must begin with a letter and must contain only ASCII letters, digits,
     * and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param endpointIdentifier
     *        The identifier of the endpoint. Identifiers must begin with a letter and must contain only ASCII letters,
     *        digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withEndpointIdentifier(String endpointIdentifier) {
        setEndpointIdentifier(endpointIdentifier);
        return this;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param replicationInstanceIdentifier
     *        The replication instance identifier. This parameter is stored as a lowercase string.
     */

    public void setReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @return The replication instance identifier. This parameter is stored as a lowercase string.
     */

    public String getReplicationInstanceIdentifier() {
        return this.replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param replicationInstanceIdentifier
     *        The replication instance identifier. This parameter is stored as a lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        setReplicationInstanceIdentifier(replicationInstanceIdentifier);
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
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: ").append(getReplicationInstanceArn()).append(",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastFailureMessage() != null)
            sb.append("LastFailureMessage: ").append(getLastFailureMessage()).append(",");
        if (getEndpointIdentifier() != null)
            sb.append("EndpointIdentifier: ").append(getEndpointIdentifier()).append(",");
        if (getReplicationInstanceIdentifier() != null)
            sb.append("ReplicationInstanceIdentifier: ").append(getReplicationInstanceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Connection == false)
            return false;
        Connection other = (Connection) obj;
        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastFailureMessage() == null ^ this.getLastFailureMessage() == null)
            return false;
        if (other.getLastFailureMessage() != null && other.getLastFailureMessage().equals(this.getLastFailureMessage()) == false)
            return false;
        if (other.getEndpointIdentifier() == null ^ this.getEndpointIdentifier() == null)
            return false;
        if (other.getEndpointIdentifier() != null && other.getEndpointIdentifier().equals(this.getEndpointIdentifier()) == false)
            return false;
        if (other.getReplicationInstanceIdentifier() == null ^ this.getReplicationInstanceIdentifier() == null)
            return false;
        if (other.getReplicationInstanceIdentifier() != null
                && other.getReplicationInstanceIdentifier().equals(this.getReplicationInstanceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastFailureMessage() == null) ? 0 : getLastFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getEndpointIdentifier() == null) ? 0 : getEndpointIdentifier().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceIdentifier() == null) ? 0 : getReplicationInstanceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public Connection clone() {
        try {
            return (Connection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
