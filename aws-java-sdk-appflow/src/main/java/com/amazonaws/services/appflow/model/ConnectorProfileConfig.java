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
 * Defines the connector-specific configuration and credentials for the connector profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ConnectorProfileConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorProfileConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The connector-specific properties of the profile configuration.
     * </p>
     */
    private ConnectorProfileProperties connectorProfileProperties;
    /**
     * <p>
     * The connector-specific credentials required by each connector.
     * </p>
     */
    private ConnectorProfileCredentials connectorProfileCredentials;

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

    public ConnectorProfileConfig withConnectorProfileProperties(ConnectorProfileProperties connectorProfileProperties) {
        setConnectorProfileProperties(connectorProfileProperties);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required by each connector.
     * </p>
     * 
     * @param connectorProfileCredentials
     *        The connector-specific credentials required by each connector.
     */

    public void setConnectorProfileCredentials(ConnectorProfileCredentials connectorProfileCredentials) {
        this.connectorProfileCredentials = connectorProfileCredentials;
    }

    /**
     * <p>
     * The connector-specific credentials required by each connector.
     * </p>
     * 
     * @return The connector-specific credentials required by each connector.
     */

    public ConnectorProfileCredentials getConnectorProfileCredentials() {
        return this.connectorProfileCredentials;
    }

    /**
     * <p>
     * The connector-specific credentials required by each connector.
     * </p>
     * 
     * @param connectorProfileCredentials
     *        The connector-specific credentials required by each connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileConfig withConnectorProfileCredentials(ConnectorProfileCredentials connectorProfileCredentials) {
        setConnectorProfileCredentials(connectorProfileCredentials);
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
        if (getConnectorProfileProperties() != null)
            sb.append("ConnectorProfileProperties: ").append(getConnectorProfileProperties()).append(",");
        if (getConnectorProfileCredentials() != null)
            sb.append("ConnectorProfileCredentials: ").append(getConnectorProfileCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorProfileConfig == false)
            return false;
        ConnectorProfileConfig other = (ConnectorProfileConfig) obj;
        if (other.getConnectorProfileProperties() == null ^ this.getConnectorProfileProperties() == null)
            return false;
        if (other.getConnectorProfileProperties() != null && other.getConnectorProfileProperties().equals(this.getConnectorProfileProperties()) == false)
            return false;
        if (other.getConnectorProfileCredentials() == null ^ this.getConnectorProfileCredentials() == null)
            return false;
        if (other.getConnectorProfileCredentials() != null && other.getConnectorProfileCredentials().equals(this.getConnectorProfileCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorProfileProperties() == null) ? 0 : getConnectorProfileProperties().hashCode());
        hashCode = prime * hashCode + ((getConnectorProfileCredentials() == null) ? 0 : getConnectorProfileCredentials().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorProfileConfig clone() {
        try {
            return (ConnectorProfileConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ConnectorProfileConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
