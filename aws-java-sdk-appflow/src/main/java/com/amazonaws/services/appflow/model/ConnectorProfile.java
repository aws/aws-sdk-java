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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an instance of a connector. This includes the provided name, credentials ARN, connection-mode, and so on.
 * To keep the API intuitive and extensible, the fields that are common to all types of connector profiles are
 * explicitly specified at the top level. The rest of the connector-specific properties are available via the
 * <code>connectorProfileProperties</code> field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ConnectorProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector profile.
     * </p>
     */
    private String connectorProfileArn;
    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS account.
     * </p>
     */
    private String connectorProfileName;
    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     */
    private String connectorType;
    /**
     * <p>
     * Indicates the connection mode and if it is public or private.
     * </p>
     */
    private String connectionMode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector profile credentials.
     * </p>
     */
    private String credentialsArn;
    /**
     * <p>
     * The connector-specific properties of the profile configuration.
     * </p>
     */
    private ConnectorProfileProperties connectorProfileProperties;
    /**
     * <p>
     * Specifies when the connector profile was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Specifies when the connector profile was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector profile.
     * </p>
     * 
     * @param connectorProfileArn
     *        The Amazon Resource Name (ARN) of the connector profile.
     */

    public void setConnectorProfileArn(String connectorProfileArn) {
        this.connectorProfileArn = connectorProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the connector profile.
     */

    public String getConnectorProfileArn() {
        return this.connectorProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector profile.
     * </p>
     * 
     * @param connectorProfileArn
     *        The Amazon Resource Name (ARN) of the connector profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfile withConnectorProfileArn(String connectorProfileArn) {
        setConnectorProfileArn(connectorProfileArn);
        return this;
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS account.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS
     *        account.
     */

    public void setConnectorProfileName(String connectorProfileName) {
        this.connectorProfileName = connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS account.
     * </p>
     * 
     * @return The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS
     *         account.
     */

    public String getConnectorProfileName() {
        return this.connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS account.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfile withConnectorProfileName(String connectorProfileName) {
        setConnectorProfileName(connectorProfileName);
        return this;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @see ConnectorType
     */

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @return The type of connector, such as Salesforce, Amplitude, and so on.
     * @see ConnectorType
     */

    public String getConnectorType() {
        return this.connectorType;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public ConnectorProfile withConnectorType(String connectorType) {
        setConnectorType(connectorType);
        return this;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public ConnectorProfile withConnectorType(ConnectorType connectorType) {
        this.connectorType = connectorType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the connection mode and if it is public or private.
     * </p>
     * 
     * @param connectionMode
     *        Indicates the connection mode and if it is public or private.
     * @see ConnectionMode
     */

    public void setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
    }

    /**
     * <p>
     * Indicates the connection mode and if it is public or private.
     * </p>
     * 
     * @return Indicates the connection mode and if it is public or private.
     * @see ConnectionMode
     */

    public String getConnectionMode() {
        return this.connectionMode;
    }

    /**
     * <p>
     * Indicates the connection mode and if it is public or private.
     * </p>
     * 
     * @param connectionMode
     *        Indicates the connection mode and if it is public or private.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionMode
     */

    public ConnectorProfile withConnectionMode(String connectionMode) {
        setConnectionMode(connectionMode);
        return this;
    }

    /**
     * <p>
     * Indicates the connection mode and if it is public or private.
     * </p>
     * 
     * @param connectionMode
     *        Indicates the connection mode and if it is public or private.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionMode
     */

    public ConnectorProfile withConnectionMode(ConnectionMode connectionMode) {
        this.connectionMode = connectionMode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector profile credentials.
     * </p>
     * 
     * @param credentialsArn
     *        The Amazon Resource Name (ARN) of the connector profile credentials.
     */

    public void setCredentialsArn(String credentialsArn) {
        this.credentialsArn = credentialsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector profile credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the connector profile credentials.
     */

    public String getCredentialsArn() {
        return this.credentialsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector profile credentials.
     * </p>
     * 
     * @param credentialsArn
     *        The Amazon Resource Name (ARN) of the connector profile credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfile withCredentialsArn(String credentialsArn) {
        setCredentialsArn(credentialsArn);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties of the profile configuration.
     * </p>
     * 
     * @param connectorProfileProperties
     *        The connector-specific properties of the profile configuration.
     */

    public void setConnectorProfileProperties(ConnectorProfileProperties connectorProfileProperties) {
        this.connectorProfileProperties = connectorProfileProperties;
    }

    /**
     * <p>
     * The connector-specific properties of the profile configuration.
     * </p>
     * 
     * @return The connector-specific properties of the profile configuration.
     */

    public ConnectorProfileProperties getConnectorProfileProperties() {
        return this.connectorProfileProperties;
    }

    /**
     * <p>
     * The connector-specific properties of the profile configuration.
     * </p>
     * 
     * @param connectorProfileProperties
     *        The connector-specific properties of the profile configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfile withConnectorProfileProperties(ConnectorProfileProperties connectorProfileProperties) {
        setConnectorProfileProperties(connectorProfileProperties);
        return this;
    }

    /**
     * <p>
     * Specifies when the connector profile was created.
     * </p>
     * 
     * @param createdAt
     *        Specifies when the connector profile was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Specifies when the connector profile was created.
     * </p>
     * 
     * @return Specifies when the connector profile was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Specifies when the connector profile was created.
     * </p>
     * 
     * @param createdAt
     *        Specifies when the connector profile was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfile withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Specifies when the connector profile was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies when the connector profile was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies when the connector profile was last updated.
     * </p>
     * 
     * @return Specifies when the connector profile was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies when the connector profile was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies when the connector profile was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfile withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
        if (getConnectorProfileArn() != null)
            sb.append("ConnectorProfileArn: ").append(getConnectorProfileArn()).append(",");
        if (getConnectorProfileName() != null)
            sb.append("ConnectorProfileName: ").append(getConnectorProfileName()).append(",");
        if (getConnectorType() != null)
            sb.append("ConnectorType: ").append(getConnectorType()).append(",");
        if (getConnectionMode() != null)
            sb.append("ConnectionMode: ").append(getConnectionMode()).append(",");
        if (getCredentialsArn() != null)
            sb.append("CredentialsArn: ").append(getCredentialsArn()).append(",");
        if (getConnectorProfileProperties() != null)
            sb.append("ConnectorProfileProperties: ").append(getConnectorProfileProperties()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorProfile == false)
            return false;
        ConnectorProfile other = (ConnectorProfile) obj;
        if (other.getConnectorProfileArn() == null ^ this.getConnectorProfileArn() == null)
            return false;
        if (other.getConnectorProfileArn() != null && other.getConnectorProfileArn().equals(this.getConnectorProfileArn()) == false)
            return false;
        if (other.getConnectorProfileName() == null ^ this.getConnectorProfileName() == null)
            return false;
        if (other.getConnectorProfileName() != null && other.getConnectorProfileName().equals(this.getConnectorProfileName()) == false)
            return false;
        if (other.getConnectorType() == null ^ this.getConnectorType() == null)
            return false;
        if (other.getConnectorType() != null && other.getConnectorType().equals(this.getConnectorType()) == false)
            return false;
        if (other.getConnectionMode() == null ^ this.getConnectionMode() == null)
            return false;
        if (other.getConnectionMode() != null && other.getConnectionMode().equals(this.getConnectionMode()) == false)
            return false;
        if (other.getCredentialsArn() == null ^ this.getCredentialsArn() == null)
            return false;
        if (other.getCredentialsArn() != null && other.getCredentialsArn().equals(this.getCredentialsArn()) == false)
            return false;
        if (other.getConnectorProfileProperties() == null ^ this.getConnectorProfileProperties() == null)
            return false;
        if (other.getConnectorProfileProperties() != null && other.getConnectorProfileProperties().equals(this.getConnectorProfileProperties()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorProfileArn() == null) ? 0 : getConnectorProfileArn().hashCode());
        hashCode = prime * hashCode + ((getConnectorProfileName() == null) ? 0 : getConnectorProfileName().hashCode());
        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getConnectionMode() == null) ? 0 : getConnectionMode().hashCode());
        hashCode = prime * hashCode + ((getCredentialsArn() == null) ? 0 : getCredentialsArn().hashCode());
        hashCode = prime * hashCode + ((getConnectorProfileProperties() == null) ? 0 : getConnectorProfileProperties().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorProfile clone() {
        try {
            return (ConnectorProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ConnectorProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
