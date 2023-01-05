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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/UpdateConnectorRegistration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectorRegistrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the connector. The name is unique for each connector registration in your AWS account.
     * </p>
     */
    private String connectorLabel;
    /**
     * <p>
     * A description about the update that you're applying to the connector.
     * </p>
     */
    private String description;

    private ConnectorProvisioningConfig connectorProvisioningConfig;

    /**
     * <p>
     * The name of the connector. The name is unique for each connector registration in your AWS account.
     * </p>
     * 
     * @param connectorLabel
     *        The name of the connector. The name is unique for each connector registration in your AWS account.
     */

    public void setConnectorLabel(String connectorLabel) {
        this.connectorLabel = connectorLabel;
    }

    /**
     * <p>
     * The name of the connector. The name is unique for each connector registration in your AWS account.
     * </p>
     * 
     * @return The name of the connector. The name is unique for each connector registration in your AWS account.
     */

    public String getConnectorLabel() {
        return this.connectorLabel;
    }

    /**
     * <p>
     * The name of the connector. The name is unique for each connector registration in your AWS account.
     * </p>
     * 
     * @param connectorLabel
     *        The name of the connector. The name is unique for each connector registration in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRegistrationRequest withConnectorLabel(String connectorLabel) {
        setConnectorLabel(connectorLabel);
        return this;
    }

    /**
     * <p>
     * A description about the update that you're applying to the connector.
     * </p>
     * 
     * @param description
     *        A description about the update that you're applying to the connector.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description about the update that you're applying to the connector.
     * </p>
     * 
     * @return A description about the update that you're applying to the connector.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description about the update that you're applying to the connector.
     * </p>
     * 
     * @param description
     *        A description about the update that you're applying to the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRegistrationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param connectorProvisioningConfig
     */

    public void setConnectorProvisioningConfig(ConnectorProvisioningConfig connectorProvisioningConfig) {
        this.connectorProvisioningConfig = connectorProvisioningConfig;
    }

    /**
     * @return
     */

    public ConnectorProvisioningConfig getConnectorProvisioningConfig() {
        return this.connectorProvisioningConfig;
    }

    /**
     * @param connectorProvisioningConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRegistrationRequest withConnectorProvisioningConfig(ConnectorProvisioningConfig connectorProvisioningConfig) {
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

        if (obj instanceof UpdateConnectorRegistrationRequest == false)
            return false;
        UpdateConnectorRegistrationRequest other = (UpdateConnectorRegistrationRequest) obj;
        if (other.getConnectorLabel() == null ^ this.getConnectorLabel() == null)
            return false;
        if (other.getConnectorLabel() != null && other.getConnectorLabel().equals(this.getConnectorLabel()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        hashCode = prime * hashCode + ((getConnectorProvisioningConfig() == null) ? 0 : getConnectorProvisioningConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectorRegistrationRequest clone() {
        return (UpdateConnectorRegistrationRequest) super.clone();
    }

}
