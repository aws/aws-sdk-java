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
 * The configuration settings related to a given connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ConnectorConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the connector can be used as a source.
     * </p>
     */
    private Boolean canUseAsSource;
    /**
     * <p>
     * Specifies whether the connector can be used as a destination.
     * </p>
     */
    private Boolean canUseAsDestination;
    /**
     * <p>
     * Lists the connectors that are available for use as destinations.
     * </p>
     */
    private java.util.List<String> supportedDestinationConnectors;
    /**
     * <p>
     * Specifies the supported flow frequency for that connector.
     * </p>
     */
    private java.util.List<String> supportedSchedulingFrequencies;
    /**
     * <p>
     * Specifies if PrivateLink is enabled for that connector.
     * </p>
     */
    private Boolean isPrivateLinkEnabled;
    /**
     * <p>
     * Specifies if a PrivateLink endpoint URL is required.
     * </p>
     */
    private Boolean isPrivateLinkEndpointUrlRequired;
    /**
     * <p>
     * Specifies the supported trigger types for the flow.
     * </p>
     */
    private java.util.List<String> supportedTriggerTypes;
    /**
     * <p>
     * Specifies connector-specific metadata such as <code>oAuthScopes</code>, <code>supportedRegions</code>,
     * <code>privateLinkServiceUrl</code>, and so on.
     * </p>
     */
    private ConnectorMetadata connectorMetadata;

    /**
     * <p>
     * Specifies whether the connector can be used as a source.
     * </p>
     * 
     * @param canUseAsSource
     *        Specifies whether the connector can be used as a source.
     */

    public void setCanUseAsSource(Boolean canUseAsSource) {
        this.canUseAsSource = canUseAsSource;
    }

    /**
     * <p>
     * Specifies whether the connector can be used as a source.
     * </p>
     * 
     * @return Specifies whether the connector can be used as a source.
     */

    public Boolean getCanUseAsSource() {
        return this.canUseAsSource;
    }

    /**
     * <p>
     * Specifies whether the connector can be used as a source.
     * </p>
     * 
     * @param canUseAsSource
     *        Specifies whether the connector can be used as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withCanUseAsSource(Boolean canUseAsSource) {
        setCanUseAsSource(canUseAsSource);
        return this;
    }

    /**
     * <p>
     * Specifies whether the connector can be used as a source.
     * </p>
     * 
     * @return Specifies whether the connector can be used as a source.
     */

    public Boolean isCanUseAsSource() {
        return this.canUseAsSource;
    }

    /**
     * <p>
     * Specifies whether the connector can be used as a destination.
     * </p>
     * 
     * @param canUseAsDestination
     *        Specifies whether the connector can be used as a destination.
     */

    public void setCanUseAsDestination(Boolean canUseAsDestination) {
        this.canUseAsDestination = canUseAsDestination;
    }

    /**
     * <p>
     * Specifies whether the connector can be used as a destination.
     * </p>
     * 
     * @return Specifies whether the connector can be used as a destination.
     */

    public Boolean getCanUseAsDestination() {
        return this.canUseAsDestination;
    }

    /**
     * <p>
     * Specifies whether the connector can be used as a destination.
     * </p>
     * 
     * @param canUseAsDestination
     *        Specifies whether the connector can be used as a destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withCanUseAsDestination(Boolean canUseAsDestination) {
        setCanUseAsDestination(canUseAsDestination);
        return this;
    }

    /**
     * <p>
     * Specifies whether the connector can be used as a destination.
     * </p>
     * 
     * @return Specifies whether the connector can be used as a destination.
     */

    public Boolean isCanUseAsDestination() {
        return this.canUseAsDestination;
    }

    /**
     * <p>
     * Lists the connectors that are available for use as destinations.
     * </p>
     * 
     * @return Lists the connectors that are available for use as destinations.
     * @see ConnectorType
     */

    public java.util.List<String> getSupportedDestinationConnectors() {
        return supportedDestinationConnectors;
    }

    /**
     * <p>
     * Lists the connectors that are available for use as destinations.
     * </p>
     * 
     * @param supportedDestinationConnectors
     *        Lists the connectors that are available for use as destinations.
     * @see ConnectorType
     */

    public void setSupportedDestinationConnectors(java.util.Collection<String> supportedDestinationConnectors) {
        if (supportedDestinationConnectors == null) {
            this.supportedDestinationConnectors = null;
            return;
        }

        this.supportedDestinationConnectors = new java.util.ArrayList<String>(supportedDestinationConnectors);
    }

    /**
     * <p>
     * Lists the connectors that are available for use as destinations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedDestinationConnectors(java.util.Collection)} or
     * {@link #withSupportedDestinationConnectors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedDestinationConnectors
     *        Lists the connectors that are available for use as destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public ConnectorConfiguration withSupportedDestinationConnectors(String... supportedDestinationConnectors) {
        if (this.supportedDestinationConnectors == null) {
            setSupportedDestinationConnectors(new java.util.ArrayList<String>(supportedDestinationConnectors.length));
        }
        for (String ele : supportedDestinationConnectors) {
            this.supportedDestinationConnectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the connectors that are available for use as destinations.
     * </p>
     * 
     * @param supportedDestinationConnectors
     *        Lists the connectors that are available for use as destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public ConnectorConfiguration withSupportedDestinationConnectors(java.util.Collection<String> supportedDestinationConnectors) {
        setSupportedDestinationConnectors(supportedDestinationConnectors);
        return this;
    }

    /**
     * <p>
     * Lists the connectors that are available for use as destinations.
     * </p>
     * 
     * @param supportedDestinationConnectors
     *        Lists the connectors that are available for use as destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public ConnectorConfiguration withSupportedDestinationConnectors(ConnectorType... supportedDestinationConnectors) {
        java.util.ArrayList<String> supportedDestinationConnectorsCopy = new java.util.ArrayList<String>(supportedDestinationConnectors.length);
        for (ConnectorType value : supportedDestinationConnectors) {
            supportedDestinationConnectorsCopy.add(value.toString());
        }
        if (getSupportedDestinationConnectors() == null) {
            setSupportedDestinationConnectors(supportedDestinationConnectorsCopy);
        } else {
            getSupportedDestinationConnectors().addAll(supportedDestinationConnectorsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the supported flow frequency for that connector.
     * </p>
     * 
     * @return Specifies the supported flow frequency for that connector.
     * @see ScheduleFrequencyType
     */

    public java.util.List<String> getSupportedSchedulingFrequencies() {
        return supportedSchedulingFrequencies;
    }

    /**
     * <p>
     * Specifies the supported flow frequency for that connector.
     * </p>
     * 
     * @param supportedSchedulingFrequencies
     *        Specifies the supported flow frequency for that connector.
     * @see ScheduleFrequencyType
     */

    public void setSupportedSchedulingFrequencies(java.util.Collection<String> supportedSchedulingFrequencies) {
        if (supportedSchedulingFrequencies == null) {
            this.supportedSchedulingFrequencies = null;
            return;
        }

        this.supportedSchedulingFrequencies = new java.util.ArrayList<String>(supportedSchedulingFrequencies);
    }

    /**
     * <p>
     * Specifies the supported flow frequency for that connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedSchedulingFrequencies(java.util.Collection)} or
     * {@link #withSupportedSchedulingFrequencies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedSchedulingFrequencies
     *        Specifies the supported flow frequency for that connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleFrequencyType
     */

    public ConnectorConfiguration withSupportedSchedulingFrequencies(String... supportedSchedulingFrequencies) {
        if (this.supportedSchedulingFrequencies == null) {
            setSupportedSchedulingFrequencies(new java.util.ArrayList<String>(supportedSchedulingFrequencies.length));
        }
        for (String ele : supportedSchedulingFrequencies) {
            this.supportedSchedulingFrequencies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the supported flow frequency for that connector.
     * </p>
     * 
     * @param supportedSchedulingFrequencies
     *        Specifies the supported flow frequency for that connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleFrequencyType
     */

    public ConnectorConfiguration withSupportedSchedulingFrequencies(java.util.Collection<String> supportedSchedulingFrequencies) {
        setSupportedSchedulingFrequencies(supportedSchedulingFrequencies);
        return this;
    }

    /**
     * <p>
     * Specifies the supported flow frequency for that connector.
     * </p>
     * 
     * @param supportedSchedulingFrequencies
     *        Specifies the supported flow frequency for that connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleFrequencyType
     */

    public ConnectorConfiguration withSupportedSchedulingFrequencies(ScheduleFrequencyType... supportedSchedulingFrequencies) {
        java.util.ArrayList<String> supportedSchedulingFrequenciesCopy = new java.util.ArrayList<String>(supportedSchedulingFrequencies.length);
        for (ScheduleFrequencyType value : supportedSchedulingFrequencies) {
            supportedSchedulingFrequenciesCopy.add(value.toString());
        }
        if (getSupportedSchedulingFrequencies() == null) {
            setSupportedSchedulingFrequencies(supportedSchedulingFrequenciesCopy);
        } else {
            getSupportedSchedulingFrequencies().addAll(supportedSchedulingFrequenciesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specifies if PrivateLink is enabled for that connector.
     * </p>
     * 
     * @param isPrivateLinkEnabled
     *        Specifies if PrivateLink is enabled for that connector.
     */

    public void setIsPrivateLinkEnabled(Boolean isPrivateLinkEnabled) {
        this.isPrivateLinkEnabled = isPrivateLinkEnabled;
    }

    /**
     * <p>
     * Specifies if PrivateLink is enabled for that connector.
     * </p>
     * 
     * @return Specifies if PrivateLink is enabled for that connector.
     */

    public Boolean getIsPrivateLinkEnabled() {
        return this.isPrivateLinkEnabled;
    }

    /**
     * <p>
     * Specifies if PrivateLink is enabled for that connector.
     * </p>
     * 
     * @param isPrivateLinkEnabled
     *        Specifies if PrivateLink is enabled for that connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withIsPrivateLinkEnabled(Boolean isPrivateLinkEnabled) {
        setIsPrivateLinkEnabled(isPrivateLinkEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies if PrivateLink is enabled for that connector.
     * </p>
     * 
     * @return Specifies if PrivateLink is enabled for that connector.
     */

    public Boolean isPrivateLinkEnabled() {
        return this.isPrivateLinkEnabled;
    }

    /**
     * <p>
     * Specifies if a PrivateLink endpoint URL is required.
     * </p>
     * 
     * @param isPrivateLinkEndpointUrlRequired
     *        Specifies if a PrivateLink endpoint URL is required.
     */

    public void setIsPrivateLinkEndpointUrlRequired(Boolean isPrivateLinkEndpointUrlRequired) {
        this.isPrivateLinkEndpointUrlRequired = isPrivateLinkEndpointUrlRequired;
    }

    /**
     * <p>
     * Specifies if a PrivateLink endpoint URL is required.
     * </p>
     * 
     * @return Specifies if a PrivateLink endpoint URL is required.
     */

    public Boolean getIsPrivateLinkEndpointUrlRequired() {
        return this.isPrivateLinkEndpointUrlRequired;
    }

    /**
     * <p>
     * Specifies if a PrivateLink endpoint URL is required.
     * </p>
     * 
     * @param isPrivateLinkEndpointUrlRequired
     *        Specifies if a PrivateLink endpoint URL is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withIsPrivateLinkEndpointUrlRequired(Boolean isPrivateLinkEndpointUrlRequired) {
        setIsPrivateLinkEndpointUrlRequired(isPrivateLinkEndpointUrlRequired);
        return this;
    }

    /**
     * <p>
     * Specifies if a PrivateLink endpoint URL is required.
     * </p>
     * 
     * @return Specifies if a PrivateLink endpoint URL is required.
     */

    public Boolean isPrivateLinkEndpointUrlRequired() {
        return this.isPrivateLinkEndpointUrlRequired;
    }

    /**
     * <p>
     * Specifies the supported trigger types for the flow.
     * </p>
     * 
     * @return Specifies the supported trigger types for the flow.
     * @see TriggerType
     */

    public java.util.List<String> getSupportedTriggerTypes() {
        return supportedTriggerTypes;
    }

    /**
     * <p>
     * Specifies the supported trigger types for the flow.
     * </p>
     * 
     * @param supportedTriggerTypes
     *        Specifies the supported trigger types for the flow.
     * @see TriggerType
     */

    public void setSupportedTriggerTypes(java.util.Collection<String> supportedTriggerTypes) {
        if (supportedTriggerTypes == null) {
            this.supportedTriggerTypes = null;
            return;
        }

        this.supportedTriggerTypes = new java.util.ArrayList<String>(supportedTriggerTypes);
    }

    /**
     * <p>
     * Specifies the supported trigger types for the flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedTriggerTypes(java.util.Collection)} or
     * {@link #withSupportedTriggerTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedTriggerTypes
     *        Specifies the supported trigger types for the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public ConnectorConfiguration withSupportedTriggerTypes(String... supportedTriggerTypes) {
        if (this.supportedTriggerTypes == null) {
            setSupportedTriggerTypes(new java.util.ArrayList<String>(supportedTriggerTypes.length));
        }
        for (String ele : supportedTriggerTypes) {
            this.supportedTriggerTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the supported trigger types for the flow.
     * </p>
     * 
     * @param supportedTriggerTypes
     *        Specifies the supported trigger types for the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public ConnectorConfiguration withSupportedTriggerTypes(java.util.Collection<String> supportedTriggerTypes) {
        setSupportedTriggerTypes(supportedTriggerTypes);
        return this;
    }

    /**
     * <p>
     * Specifies the supported trigger types for the flow.
     * </p>
     * 
     * @param supportedTriggerTypes
     *        Specifies the supported trigger types for the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public ConnectorConfiguration withSupportedTriggerTypes(TriggerType... supportedTriggerTypes) {
        java.util.ArrayList<String> supportedTriggerTypesCopy = new java.util.ArrayList<String>(supportedTriggerTypes.length);
        for (TriggerType value : supportedTriggerTypes) {
            supportedTriggerTypesCopy.add(value.toString());
        }
        if (getSupportedTriggerTypes() == null) {
            setSupportedTriggerTypes(supportedTriggerTypesCopy);
        } else {
            getSupportedTriggerTypes().addAll(supportedTriggerTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specifies connector-specific metadata such as <code>oAuthScopes</code>, <code>supportedRegions</code>,
     * <code>privateLinkServiceUrl</code>, and so on.
     * </p>
     * 
     * @param connectorMetadata
     *        Specifies connector-specific metadata such as <code>oAuthScopes</code>, <code>supportedRegions</code>,
     *        <code>privateLinkServiceUrl</code>, and so on.
     */

    public void setConnectorMetadata(ConnectorMetadata connectorMetadata) {
        this.connectorMetadata = connectorMetadata;
    }

    /**
     * <p>
     * Specifies connector-specific metadata such as <code>oAuthScopes</code>, <code>supportedRegions</code>,
     * <code>privateLinkServiceUrl</code>, and so on.
     * </p>
     * 
     * @return Specifies connector-specific metadata such as <code>oAuthScopes</code>, <code>supportedRegions</code>,
     *         <code>privateLinkServiceUrl</code>, and so on.
     */

    public ConnectorMetadata getConnectorMetadata() {
        return this.connectorMetadata;
    }

    /**
     * <p>
     * Specifies connector-specific metadata such as <code>oAuthScopes</code>, <code>supportedRegions</code>,
     * <code>privateLinkServiceUrl</code>, and so on.
     * </p>
     * 
     * @param connectorMetadata
     *        Specifies connector-specific metadata such as <code>oAuthScopes</code>, <code>supportedRegions</code>,
     *        <code>privateLinkServiceUrl</code>, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withConnectorMetadata(ConnectorMetadata connectorMetadata) {
        setConnectorMetadata(connectorMetadata);
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
        if (getCanUseAsSource() != null)
            sb.append("CanUseAsSource: ").append(getCanUseAsSource()).append(",");
        if (getCanUseAsDestination() != null)
            sb.append("CanUseAsDestination: ").append(getCanUseAsDestination()).append(",");
        if (getSupportedDestinationConnectors() != null)
            sb.append("SupportedDestinationConnectors: ").append(getSupportedDestinationConnectors()).append(",");
        if (getSupportedSchedulingFrequencies() != null)
            sb.append("SupportedSchedulingFrequencies: ").append(getSupportedSchedulingFrequencies()).append(",");
        if (getIsPrivateLinkEnabled() != null)
            sb.append("IsPrivateLinkEnabled: ").append(getIsPrivateLinkEnabled()).append(",");
        if (getIsPrivateLinkEndpointUrlRequired() != null)
            sb.append("IsPrivateLinkEndpointUrlRequired: ").append(getIsPrivateLinkEndpointUrlRequired()).append(",");
        if (getSupportedTriggerTypes() != null)
            sb.append("SupportedTriggerTypes: ").append(getSupportedTriggerTypes()).append(",");
        if (getConnectorMetadata() != null)
            sb.append("ConnectorMetadata: ").append(getConnectorMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorConfiguration == false)
            return false;
        ConnectorConfiguration other = (ConnectorConfiguration) obj;
        if (other.getCanUseAsSource() == null ^ this.getCanUseAsSource() == null)
            return false;
        if (other.getCanUseAsSource() != null && other.getCanUseAsSource().equals(this.getCanUseAsSource()) == false)
            return false;
        if (other.getCanUseAsDestination() == null ^ this.getCanUseAsDestination() == null)
            return false;
        if (other.getCanUseAsDestination() != null && other.getCanUseAsDestination().equals(this.getCanUseAsDestination()) == false)
            return false;
        if (other.getSupportedDestinationConnectors() == null ^ this.getSupportedDestinationConnectors() == null)
            return false;
        if (other.getSupportedDestinationConnectors() != null
                && other.getSupportedDestinationConnectors().equals(this.getSupportedDestinationConnectors()) == false)
            return false;
        if (other.getSupportedSchedulingFrequencies() == null ^ this.getSupportedSchedulingFrequencies() == null)
            return false;
        if (other.getSupportedSchedulingFrequencies() != null
                && other.getSupportedSchedulingFrequencies().equals(this.getSupportedSchedulingFrequencies()) == false)
            return false;
        if (other.getIsPrivateLinkEnabled() == null ^ this.getIsPrivateLinkEnabled() == null)
            return false;
        if (other.getIsPrivateLinkEnabled() != null && other.getIsPrivateLinkEnabled().equals(this.getIsPrivateLinkEnabled()) == false)
            return false;
        if (other.getIsPrivateLinkEndpointUrlRequired() == null ^ this.getIsPrivateLinkEndpointUrlRequired() == null)
            return false;
        if (other.getIsPrivateLinkEndpointUrlRequired() != null
                && other.getIsPrivateLinkEndpointUrlRequired().equals(this.getIsPrivateLinkEndpointUrlRequired()) == false)
            return false;
        if (other.getSupportedTriggerTypes() == null ^ this.getSupportedTriggerTypes() == null)
            return false;
        if (other.getSupportedTriggerTypes() != null && other.getSupportedTriggerTypes().equals(this.getSupportedTriggerTypes()) == false)
            return false;
        if (other.getConnectorMetadata() == null ^ this.getConnectorMetadata() == null)
            return false;
        if (other.getConnectorMetadata() != null && other.getConnectorMetadata().equals(this.getConnectorMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCanUseAsSource() == null) ? 0 : getCanUseAsSource().hashCode());
        hashCode = prime * hashCode + ((getCanUseAsDestination() == null) ? 0 : getCanUseAsDestination().hashCode());
        hashCode = prime * hashCode + ((getSupportedDestinationConnectors() == null) ? 0 : getSupportedDestinationConnectors().hashCode());
        hashCode = prime * hashCode + ((getSupportedSchedulingFrequencies() == null) ? 0 : getSupportedSchedulingFrequencies().hashCode());
        hashCode = prime * hashCode + ((getIsPrivateLinkEnabled() == null) ? 0 : getIsPrivateLinkEnabled().hashCode());
        hashCode = prime * hashCode + ((getIsPrivateLinkEndpointUrlRequired() == null) ? 0 : getIsPrivateLinkEndpointUrlRequired().hashCode());
        hashCode = prime * hashCode + ((getSupportedTriggerTypes() == null) ? 0 : getSupportedTriggerTypes().hashCode());
        hashCode = prime * hashCode + ((getConnectorMetadata() == null) ? 0 : getConnectorMetadata().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorConfiguration clone() {
        try {
            return (ConnectorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ConnectorConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
