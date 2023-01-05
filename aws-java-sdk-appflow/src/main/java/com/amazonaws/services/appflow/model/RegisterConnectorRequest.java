/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/RegisterConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the connector. The name is unique for each <code>ConnectorRegistration</code> in your Amazon Web
     * Services account.
     * </p>
     */
    private String connectorLabel;
    /**
     * <p>
     * A description about the connector that's being registered.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * </p>
     */
    private String connectorProvisioningType;
    /**
     * <p>
     * The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * </p>
     */
    private ConnectorProvisioningConfig connectorProvisioningConfig;

    /**
     * <p>
     * The name of the connector. The name is unique for each <code>ConnectorRegistration</code> in your Amazon Web
     * Services account.
     * </p>
     * 
     * @param connectorLabel
     *        The name of the connector. The name is unique for each <code>ConnectorRegistration</code> in your Amazon
     *        Web Services account.
     */

    public void setConnectorLabel(String connectorLabel) {
        this.connectorLabel = connectorLabel;
    }

    /**
     * <p>
     * The name of the connector. The name is unique for each <code>ConnectorRegistration</code> in your Amazon Web
     * Services account.
     * </p>
     * 
     * @return The name of the connector. The name is unique for each <code>ConnectorRegistration</code> in your Amazon
     *         Web Services account.
     */

    public String getConnectorLabel() {
        return this.connectorLabel;
    }

    /**
     * <p>
     * The name of the connector. The name is unique for each <code>ConnectorRegistration</code> in your Amazon Web
     * Services account.
     * </p>
     * 
     * @param connectorLabel
     *        The name of the connector. The name is unique for each <code>ConnectorRegistration</code> in your Amazon
     *        Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterConnectorRequest withConnectorLabel(String connectorLabel) {
        setConnectorLabel(connectorLabel);
        return this;
    }

    /**
     * <p>
     * A description about the connector that's being registered.
     * </p>
     * 
     * @param description
     *        A description about the connector that's being registered.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description about the connector that's being registered.
     * </p>
     * 
     * @return A description about the connector that's being registered.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description about the connector that's being registered.
     * </p>
     * 
     * @param description
     *        A description about the connector that's being registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterConnectorRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * </p>
     * 
     * @param connectorProvisioningType
     *        The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * @see ConnectorProvisioningType
     */

    public void setConnectorProvisioningType(String connectorProvisioningType) {
        this.connectorProvisioningType = connectorProvisioningType;
    }

    /**
     * <p>
     * The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * </p>
     * 
     * @return The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * @see ConnectorProvisioningType
     */

    public String getConnectorProvisioningType() {
        return this.connectorProvisioningType;
    }

    /**
     * <p>
     * The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * </p>
     * 
     * @param connectorProvisioningType
     *        The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorProvisioningType
     */

    public RegisterConnectorRequest withConnectorProvisioningType(String connectorProvisioningType) {
        setConnectorProvisioningType(connectorProvisioningType);
        return this;
    }

    /**
     * <p>
     * The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * </p>
     * 
     * @param connectorProvisioningType
     *        The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorProvisioningType
     */

    public RegisterConnectorRequest withConnectorProvisioningType(ConnectorProvisioningType connectorProvisioningType) {
        this.connectorProvisioningType = connectorProvisioningType.toString();
        return this;
    }

    /**
     * <p>
     * The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * </p>
     * 
     * @param connectorProvisioningConfig
     *        The provisioning type of the connector. Currently the only supported value is LAMBDA.
     */

    public void setConnectorProvisioningConfig(ConnectorProvisioningConfig connectorProvisioningConfig) {
        this.connectorProvisioningConfig = connectorProvisioningConfig;
    }

    /**
     * <p>
     * The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * </p>
     * 
     * @return The provisioning type of the connector. Currently the only supported value is LAMBDA.
     */

    public ConnectorProvisioningConfig getConnectorProvisioningConfig() {
        return this.connectorProvisioningConfig;
    }

    /**
     * <p>
     * The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * </p>
     * 
     * @param connectorProvisioningConfig
     *        The provisioning type of the connector. Currently the only supported value is LAMBDA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterConnectorRequest withConnectorProvisioningConfig(ConnectorProvisioningConfig connectorProvisioningConfig) {
        setConnectorProvisioningConfig(connectorProvisioningConfig);
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
        if (getConnectorLabel() != null)
            sb.append("ConnectorLabel: ").append(getConnectorLabel()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getConnectorProvisioningType() != null)
            sb.append("ConnectorProvisioningType: ").append(getConnectorProvisioningType()).append(",");
        if (getConnectorProvisioningConfig() != null)
            sb.append("ConnectorProvisioningConfig: ").append(getConnectorProvisioningConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterConnectorRequest == false)
            return false;
        RegisterConnectorRequest other = (RegisterConnectorRequest) obj;
        if (other.getConnectorLabel() == null ^ this.getConnectorLabel() == null)
            return false;
        if (other.getConnectorLabel() != null && other.getConnectorLabel().equals(this.getConnectorLabel()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getConnectorProvisioningType() == null ^ this.getConnectorProvisioningType() == null)
            return false;
        if (other.getConnectorProvisioningType() != null && other.getConnectorProvisioningType().equals(this.getConnectorProvisioningType()) == false)
            return false;
        if (other.getConnectorProvisioningConfig() == null ^ this.getConnectorProvisioningConfig() == null)
            return false;
        if (other.getConnectorProvisioningConfig() != null && other.getConnectorProvisioningConfig().equals(this.getConnectorProvisioningConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorLabel() == null) ? 0 : getConnectorLabel().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getConnectorProvisioningType() == null) ? 0 : getConnectorProvisioningType().hashCode());
        hashCode = prime * hashCode + ((getConnectorProvisioningConfig() == null) ? 0 : getConnectorProvisioningConfig().hashCode());
        return hashCode;
    }

    @Override
    public RegisterConnectorRequest clone() {
        return (RegisterConnectorRequest) super.clone();
    }

}
