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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/UpdateConnectorProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectorProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the connector profile and is unique for each <code>ConnectorProfile</code> in the AWS Account.
     * </p>
     */
    private String connectorProfileName;
    /**
     * <p>
     * Indicates the connection mode and if it is public or private.
     * </p>
     */
    private String connectionMode;
    /**
     * <p>
     * Defines the connector-specific profile configuration and credentials.
     * </p>
     */
    private ConnectorProfileConfig connectorProfileConfig;

    /**
     * <p>
     * The name of the connector profile and is unique for each <code>ConnectorProfile</code> in the AWS Account.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile and is unique for each <code>ConnectorProfile</code> in the AWS Account.
     */

    public void setConnectorProfileName(String connectorProfileName) {
        this.connectorProfileName = connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile and is unique for each <code>ConnectorProfile</code> in the AWS Account.
     * </p>
     * 
     * @return The name of the connector profile and is unique for each <code>ConnectorProfile</code> in the AWS
     *         Account.
     */

    public String getConnectorProfileName() {
        return this.connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile and is unique for each <code>ConnectorProfile</code> in the AWS Account.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile and is unique for each <code>ConnectorProfile</code> in the AWS Account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorProfileRequest withConnectorProfileName(String connectorProfileName) {
        setConnectorProfileName(connectorProfileName);
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

    public UpdateConnectorProfileRequest withConnectionMode(String connectionMode) {
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

    public UpdateConnectorProfileRequest withConnectionMode(ConnectionMode connectionMode) {
        this.connectionMode = connectionMode.toString();
        return this;
    }

    /**
     * <p>
     * Defines the connector-specific profile configuration and credentials.
     * </p>
     * 
     * @param connectorProfileConfig
     *        Defines the connector-specific profile configuration and credentials.
     */

    public void setConnectorProfileConfig(ConnectorProfileConfig connectorProfileConfig) {
        this.connectorProfileConfig = connectorProfileConfig;
    }

    /**
     * <p>
     * Defines the connector-specific profile configuration and credentials.
     * </p>
     * 
     * @return Defines the connector-specific profile configuration and credentials.
     */

    public ConnectorProfileConfig getConnectorProfileConfig() {
        return this.connectorProfileConfig;
    }

    /**
     * <p>
     * Defines the connector-specific profile configuration and credentials.
     * </p>
     * 
     * @param connectorProfileConfig
     *        Defines the connector-specific profile configuration and credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorProfileRequest withConnectorProfileConfig(ConnectorProfileConfig connectorProfileConfig) {
        setConnectorProfileConfig(connectorProfileConfig);
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
        if (getConnectorProfileName() != null)
            sb.append("ConnectorProfileName: ").append(getConnectorProfileName()).append(",");
        if (getConnectionMode() != null)
            sb.append("ConnectionMode: ").append(getConnectionMode()).append(",");
        if (getConnectorProfileConfig() != null)
            sb.append("ConnectorProfileConfig: ").append(getConnectorProfileConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectorProfileRequest == false)
            return false;
        UpdateConnectorProfileRequest other = (UpdateConnectorProfileRequest) obj;
        if (other.getConnectorProfileName() == null ^ this.getConnectorProfileName() == null)
            return false;
        if (other.getConnectorProfileName() != null && other.getConnectorProfileName().equals(this.getConnectorProfileName()) == false)
            return false;
        if (other.getConnectionMode() == null ^ this.getConnectionMode() == null)
            return false;
        if (other.getConnectionMode() != null && other.getConnectionMode().equals(this.getConnectionMode()) == false)
            return false;
        if (other.getConnectorProfileConfig() == null ^ this.getConnectorProfileConfig() == null)
            return false;
        if (other.getConnectorProfileConfig() != null && other.getConnectorProfileConfig().equals(this.getConnectorProfileConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorProfileName() == null) ? 0 : getConnectorProfileName().hashCode());
        hashCode = prime * hashCode + ((getConnectionMode() == null) ? 0 : getConnectionMode().hashCode());
        hashCode = prime * hashCode + ((getConnectorProfileConfig() == null) ? 0 : getConnectorProfileConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectorProfileRequest clone() {
        return (UpdateConnectorProfileRequest) super.clone();
    }

}
