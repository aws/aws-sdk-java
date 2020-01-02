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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration that allows a service such as CodePipeline to connect to a third-party code repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/Connection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Connection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the connection. Connection names must be unique in an AWS user account.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection
     * is shared between AWS services.
     * </p>
     * <note>
     * <p>
     * The ARN is never reused if the connection is deleted.
     * </p>
     * </note>
     */
    private String connectionArn;
    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. Currently, the valid
     * provider type is Bitbucket.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. For Bitbucket, this is
     * the account ID of the owner of the Bitbucket repository.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * The current status of the connection.
     * </p>
     */
    private String connectionStatus;

    /**
     * <p>
     * The name of the connection. Connection names must be unique in an AWS user account.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection. Connection names must be unique in an AWS user account.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection. Connection names must be unique in an AWS user account.
     * </p>
     * 
     * @return The name of the connection. Connection names must be unique in an AWS user account.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection. Connection names must be unique in an AWS user account.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection. Connection names must be unique in an AWS user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection
     * is shared between AWS services.
     * </p>
     * <note>
     * <p>
     * The ARN is never reused if the connection is deleted.
     * </p>
     * </note>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the
     *        connection is shared between AWS services.</p> <note>
     *        <p>
     *        The ARN is never reused if the connection is deleted.
     *        </p>
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection
     * is shared between AWS services.
     * </p>
     * <note>
     * <p>
     * The ARN is never reused if the connection is deleted.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the
     *         connection is shared between AWS services.</p> <note>
     *         <p>
     *         The ARN is never reused if the connection is deleted.
     *         </p>
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection
     * is shared between AWS services.
     * </p>
     * <note>
     * <p>
     * The ARN is never reused if the connection is deleted.
     * </p>
     * </note>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the
     *        connection is shared between AWS services.</p> <note>
     *        <p>
     *        The ARN is never reused if the connection is deleted.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. Currently, the valid
     * provider type is Bitbucket.
     * </p>
     * 
     * @param providerType
     *        The name of the external provider where your third-party code repository is configured. Currently, the
     *        valid provider type is Bitbucket.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. Currently, the valid
     * provider type is Bitbucket.
     * </p>
     * 
     * @return The name of the external provider where your third-party code repository is configured. Currently, the
     *         valid provider type is Bitbucket.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. Currently, the valid
     * provider type is Bitbucket.
     * </p>
     * 
     * @param providerType
     *        The name of the external provider where your third-party code repository is configured. Currently, the
     *        valid provider type is Bitbucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public Connection withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. Currently, the valid
     * provider type is Bitbucket.
     * </p>
     * 
     * @param providerType
     *        The name of the external provider where your third-party code repository is configured. Currently, the
     *        valid provider type is Bitbucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public Connection withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. For Bitbucket, this is
     * the account ID of the owner of the Bitbucket repository.
     * </p>
     * 
     * @param ownerAccountId
     *        The name of the external provider where your third-party code repository is configured. For Bitbucket,
     *        this is the account ID of the owner of the Bitbucket repository.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. For Bitbucket, this is
     * the account ID of the owner of the Bitbucket repository.
     * </p>
     * 
     * @return The name of the external provider where your third-party code repository is configured. For Bitbucket,
     *         this is the account ID of the owner of the Bitbucket repository.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. For Bitbucket, this is
     * the account ID of the owner of the Bitbucket repository.
     * </p>
     * 
     * @param ownerAccountId
     *        The name of the external provider where your third-party code repository is configured. For Bitbucket,
     *        this is the account ID of the owner of the Bitbucket repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * The current status of the connection.
     * </p>
     * 
     * @param connectionStatus
     *        The current status of the connection.
     * @see ConnectionStatus
     */

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * The current status of the connection.
     * </p>
     * 
     * @return The current status of the connection.
     * @see ConnectionStatus
     */

    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * The current status of the connection.
     * </p>
     * 
     * @param connectionStatus
     *        The current status of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public Connection withConnectionStatus(String connectionStatus) {
        setConnectionStatus(connectionStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the connection.
     * </p>
     * 
     * @param connectionStatus
     *        The current status of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public Connection withConnectionStatus(ConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus.toString();
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
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getConnectionStatus() != null)
            sb.append("ConnectionStatus: ").append(getConnectionStatus());
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
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null)
            return false;
        if (other.getConnectionStatus() != null && other.getConnectionStatus().equals(this.getConnectionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
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
        com.amazonaws.services.codestarconnections.model.transform.ConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
