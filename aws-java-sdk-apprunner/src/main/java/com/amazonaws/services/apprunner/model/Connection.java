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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an AWS App Runner connection resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/Connection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Connection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The customer-provided connection name.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of this connection.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The source repository provider.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The current state of the App Runner connection. When the state is <code>AVAILABLE</code>, you can use the
     * connection to create an App Runner service.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The App Runner connection creation time, expressed as a Unix time stamp.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The customer-provided connection name.
     * </p>
     * 
     * @param connectionName
     *        The customer-provided connection name.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The customer-provided connection name.
     * </p>
     * 
     * @return The customer-provided connection name.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The customer-provided connection name.
     * </p>
     * 
     * @param connectionName
     *        The customer-provided connection name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this connection.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of this connection.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of this connection.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this connection.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of this connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The source repository provider.
     * </p>
     * 
     * @param providerType
     *        The source repository provider.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The source repository provider.
     * </p>
     * 
     * @return The source repository provider.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The source repository provider.
     * </p>
     * 
     * @param providerType
     *        The source repository provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public Connection withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The source repository provider.
     * </p>
     * 
     * @param providerType
     *        The source repository provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public Connection withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the App Runner connection. When the state is <code>AVAILABLE</code>, you can use the
     * connection to create an App Runner service.
     * </p>
     * 
     * @param status
     *        The current state of the App Runner connection. When the state is <code>AVAILABLE</code>, you can use the
     *        connection to create an App Runner service.
     * @see ConnectionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the App Runner connection. When the state is <code>AVAILABLE</code>, you can use the
     * connection to create an App Runner service.
     * </p>
     * 
     * @return The current state of the App Runner connection. When the state is <code>AVAILABLE</code>, you can use the
     *         connection to create an App Runner service.
     * @see ConnectionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the App Runner connection. When the state is <code>AVAILABLE</code>, you can use the
     * connection to create an App Runner service.
     * </p>
     * 
     * @param status
     *        The current state of the App Runner connection. When the state is <code>AVAILABLE</code>, you can use the
     *        connection to create an App Runner service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public Connection withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the App Runner connection. When the state is <code>AVAILABLE</code>, you can use the
     * connection to create an App Runner service.
     * </p>
     * 
     * @param status
     *        The current state of the App Runner connection. When the state is <code>AVAILABLE</code>, you can use the
     *        connection to create an App Runner service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public Connection withStatus(ConnectionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The App Runner connection creation time, expressed as a Unix time stamp.
     * </p>
     * 
     * @param createdAt
     *        The App Runner connection creation time, expressed as a Unix time stamp.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The App Runner connection creation time, expressed as a Unix time stamp.
     * </p>
     * 
     * @return The App Runner connection creation time, expressed as a Unix time stamp.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The App Runner connection creation time, expressed as a Unix time stamp.
     * </p>
     * 
     * @param createdAt
     *        The App Runner connection creation time, expressed as a Unix time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
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
        com.amazonaws.services.apprunner.model.transform.ConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
