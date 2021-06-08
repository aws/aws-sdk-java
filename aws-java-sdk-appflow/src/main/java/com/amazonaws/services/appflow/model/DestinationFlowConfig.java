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
 * Contains information about the configuration of destination connectors present in the flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DestinationFlowConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationFlowConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     */
    private String connectorType;
    /**
     * <p>
     * The name of the connector profile. This name must be unique for each connector profile in the AWS account.
     * </p>
     */
    private String connectorProfileName;
    /**
     * <p>
     * This stores the information that is required to query a particular connector.
     * </p>
     */
    private DestinationConnectorProperties destinationConnectorProperties;

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

    public DestinationFlowConfig withConnectorType(String connectorType) {
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

    public DestinationFlowConfig withConnectorType(ConnectorType connectorType) {
        this.connectorType = connectorType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the connector profile. This name must be unique for each connector profile in the AWS account.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile. This name must be unique for each connector profile in the AWS account.
     */

    public void setConnectorProfileName(String connectorProfileName) {
        this.connectorProfileName = connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile. This name must be unique for each connector profile in the AWS account.
     * </p>
     * 
     * @return The name of the connector profile. This name must be unique for each connector profile in the AWS
     *         account.
     */

    public String getConnectorProfileName() {
        return this.connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile. This name must be unique for each connector profile in the AWS account.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile. This name must be unique for each connector profile in the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationFlowConfig withConnectorProfileName(String connectorProfileName) {
        setConnectorProfileName(connectorProfileName);
        return this;
    }

    /**
     * <p>
     * This stores the information that is required to query a particular connector.
     * </p>
     * 
     * @param destinationConnectorProperties
     *        This stores the information that is required to query a particular connector.
     */

    public void setDestinationConnectorProperties(DestinationConnectorProperties destinationConnectorProperties) {
        this.destinationConnectorProperties = destinationConnectorProperties;
    }

    /**
     * <p>
     * This stores the information that is required to query a particular connector.
     * </p>
     * 
     * @return This stores the information that is required to query a particular connector.
     */

    public DestinationConnectorProperties getDestinationConnectorProperties() {
        return this.destinationConnectorProperties;
    }

    /**
     * <p>
     * This stores the information that is required to query a particular connector.
     * </p>
     * 
     * @param destinationConnectorProperties
     *        This stores the information that is required to query a particular connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationFlowConfig withDestinationConnectorProperties(DestinationConnectorProperties destinationConnectorProperties) {
        setDestinationConnectorProperties(destinationConnectorProperties);
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
        if (getConnectorType() != null)
            sb.append("ConnectorType: ").append(getConnectorType()).append(",");
        if (getConnectorProfileName() != null)
            sb.append("ConnectorProfileName: ").append(getConnectorProfileName()).append(",");
        if (getDestinationConnectorProperties() != null)
            sb.append("DestinationConnectorProperties: ").append(getDestinationConnectorProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationFlowConfig == false)
            return false;
        DestinationFlowConfig other = (DestinationFlowConfig) obj;
        if (other.getConnectorType() == null ^ this.getConnectorType() == null)
            return false;
        if (other.getConnectorType() != null && other.getConnectorType().equals(this.getConnectorType()) == false)
            return false;
        if (other.getConnectorProfileName() == null ^ this.getConnectorProfileName() == null)
            return false;
        if (other.getConnectorProfileName() != null && other.getConnectorProfileName().equals(this.getConnectorProfileName()) == false)
            return false;
        if (other.getDestinationConnectorProperties() == null ^ this.getDestinationConnectorProperties() == null)
            return false;
        if (other.getDestinationConnectorProperties() != null
                && other.getDestinationConnectorProperties().equals(this.getDestinationConnectorProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getConnectorProfileName() == null) ? 0 : getConnectorProfileName().hashCode());
        hashCode = prime * hashCode + ((getDestinationConnectorProperties() == null) ? 0 : getDestinationConnectorProperties().hashCode());
        return hashCode;
    }

    @Override
    public DestinationFlowConfig clone() {
        try {
            return (DestinationFlowConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.DestinationFlowConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
