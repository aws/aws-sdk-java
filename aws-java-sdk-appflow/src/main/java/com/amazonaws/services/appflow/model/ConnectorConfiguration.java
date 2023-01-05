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
     * The connector type.
     * </p>
     */
    private String connectorType;
    /**
     * <p>
     * The label used for registering the connector.
     * </p>
     */
    private String connectorLabel;
    /**
     * <p>
     * A description about the connector.
     * </p>
     */
    private String connectorDescription;
    /**
     * <p>
     * The owner who developed the connector.
     * </p>
     */
    private String connectorOwner;
    /**
     * <p>
     * The connector name.
     * </p>
     */
    private String connectorName;
    /**
     * <p>
     * The connector version.
     * </p>
     */
    private String connectorVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registered connector.
     * </p>
     */
    private String connectorArn;
    /**
     * <p>
     * The connection modes that the connector supports.
     * </p>
     */
    private java.util.List<String> connectorModes;
    /**
     * <p>
     * The authentication config required for the connector.
     * </p>
     */
    private AuthenticationConfig authenticationConfig;
    /**
     * <p>
     * The required connector runtime settings.
     * </p>
     */
    private java.util.List<ConnectorRuntimeSetting> connectorRuntimeSettings;
    /**
     * <p>
     * A list of API versions that are supported by the connector.
     * </p>
     */
    private java.util.List<String> supportedApiVersions;
    /**
     * <p>
     * A list of operators supported by the connector.
     * </p>
     */
    private java.util.List<String> supportedOperators;
    /**
     * <p>
     * A list of write operations supported by the connector.
     * </p>
     */
    private java.util.List<String> supportedWriteOperations;
    /**
     * <p>
     * The provisioning type used to register the connector.
     * </p>
     */
    private String connectorProvisioningType;
    /**
     * <p>
     * The configuration required for registering the connector.
     * </p>
     */
    private ConnectorProvisioningConfig connectorProvisioningConfig;
    /**
     * <p>
     * Logo URL of the connector.
     * </p>
     */
    private String logoURL;
    /**
     * <p>
     * The date on which the connector was registered.
     * </p>
     */
    private java.util.Date registeredAt;
    /**
     * <p>
     * Information about who registered the connector.
     * </p>
     */
    private String registeredBy;

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
     * <p>
     * The connector type.
     * </p>
     * 
     * @param connectorType
     *        The connector type.
     * @see ConnectorType
     */

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    /**
     * <p>
     * The connector type.
     * </p>
     * 
     * @return The connector type.
     * @see ConnectorType
     */

    public String getConnectorType() {
        return this.connectorType;
    }

    /**
     * <p>
     * The connector type.
     * </p>
     * 
     * @param connectorType
     *        The connector type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public ConnectorConfiguration withConnectorType(String connectorType) {
        setConnectorType(connectorType);
        return this;
    }

    /**
     * <p>
     * The connector type.
     * </p>
     * 
     * @param connectorType
     *        The connector type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public ConnectorConfiguration withConnectorType(ConnectorType connectorType) {
        this.connectorType = connectorType.toString();
        return this;
    }

    /**
     * <p>
     * The label used for registering the connector.
     * </p>
     * 
     * @param connectorLabel
     *        The label used for registering the connector.
     */

    public void setConnectorLabel(String connectorLabel) {
        this.connectorLabel = connectorLabel;
    }

    /**
     * <p>
     * The label used for registering the connector.
     * </p>
     * 
     * @return The label used for registering the connector.
     */

    public String getConnectorLabel() {
        return this.connectorLabel;
    }

    /**
     * <p>
     * The label used for registering the connector.
     * </p>
     * 
     * @param connectorLabel
     *        The label used for registering the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withConnectorLabel(String connectorLabel) {
        setConnectorLabel(connectorLabel);
        return this;
    }

    /**
     * <p>
     * A description about the connector.
     * </p>
     * 
     * @param connectorDescription
     *        A description about the connector.
     */

    public void setConnectorDescription(String connectorDescription) {
        this.connectorDescription = connectorDescription;
    }

    /**
     * <p>
     * A description about the connector.
     * </p>
     * 
     * @return A description about the connector.
     */

    public String getConnectorDescription() {
        return this.connectorDescription;
    }

    /**
     * <p>
     * A description about the connector.
     * </p>
     * 
     * @param connectorDescription
     *        A description about the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withConnectorDescription(String connectorDescription) {
        setConnectorDescription(connectorDescription);
        return this;
    }

    /**
     * <p>
     * The owner who developed the connector.
     * </p>
     * 
     * @param connectorOwner
     *        The owner who developed the connector.
     */

    public void setConnectorOwner(String connectorOwner) {
        this.connectorOwner = connectorOwner;
    }

    /**
     * <p>
     * The owner who developed the connector.
     * </p>
     * 
     * @return The owner who developed the connector.
     */

    public String getConnectorOwner() {
        return this.connectorOwner;
    }

    /**
     * <p>
     * The owner who developed the connector.
     * </p>
     * 
     * @param connectorOwner
     *        The owner who developed the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withConnectorOwner(String connectorOwner) {
        setConnectorOwner(connectorOwner);
        return this;
    }

    /**
     * <p>
     * The connector name.
     * </p>
     * 
     * @param connectorName
     *        The connector name.
     */

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    /**
     * <p>
     * The connector name.
     * </p>
     * 
     * @return The connector name.
     */

    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * <p>
     * The connector name.
     * </p>
     * 
     * @param connectorName
     *        The connector name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withConnectorName(String connectorName) {
        setConnectorName(connectorName);
        return this;
    }

    /**
     * <p>
     * The connector version.
     * </p>
     * 
     * @param connectorVersion
     *        The connector version.
     */

    public void setConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
    }

    /**
     * <p>
     * The connector version.
     * </p>
     * 
     * @return The connector version.
     */

    public String getConnectorVersion() {
        return this.connectorVersion;
    }

    /**
     * <p>
     * The connector version.
     * </p>
     * 
     * @param connectorVersion
     *        The connector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withConnectorVersion(String connectorVersion) {
        setConnectorVersion(connectorVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registered connector.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) for the registered connector.
     */

    public void setConnectorArn(String connectorArn) {
        this.connectorArn = connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registered connector.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the registered connector.
     */

    public String getConnectorArn() {
        return this.connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registered connector.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) for the registered connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withConnectorArn(String connectorArn) {
        setConnectorArn(connectorArn);
        return this;
    }

    /**
     * <p>
     * The connection modes that the connector supports.
     * </p>
     * 
     * @return The connection modes that the connector supports.
     */

    public java.util.List<String> getConnectorModes() {
        return connectorModes;
    }

    /**
     * <p>
     * The connection modes that the connector supports.
     * </p>
     * 
     * @param connectorModes
     *        The connection modes that the connector supports.
     */

    public void setConnectorModes(java.util.Collection<String> connectorModes) {
        if (connectorModes == null) {
            this.connectorModes = null;
            return;
        }

        this.connectorModes = new java.util.ArrayList<String>(connectorModes);
    }

    /**
     * <p>
     * The connection modes that the connector supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectorModes(java.util.Collection)} or {@link #withConnectorModes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param connectorModes
     *        The connection modes that the connector supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withConnectorModes(String... connectorModes) {
        if (this.connectorModes == null) {
            setConnectorModes(new java.util.ArrayList<String>(connectorModes.length));
        }
        for (String ele : connectorModes) {
            this.connectorModes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The connection modes that the connector supports.
     * </p>
     * 
     * @param connectorModes
     *        The connection modes that the connector supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withConnectorModes(java.util.Collection<String> connectorModes) {
        setConnectorModes(connectorModes);
        return this;
    }

    /**
     * <p>
     * The authentication config required for the connector.
     * </p>
     * 
     * @param authenticationConfig
     *        The authentication config required for the connector.
     */

    public void setAuthenticationConfig(AuthenticationConfig authenticationConfig) {
        this.authenticationConfig = authenticationConfig;
    }

    /**
     * <p>
     * The authentication config required for the connector.
     * </p>
     * 
     * @return The authentication config required for the connector.
     */

    public AuthenticationConfig getAuthenticationConfig() {
        return this.authenticationConfig;
    }

    /**
     * <p>
     * The authentication config required for the connector.
     * </p>
     * 
     * @param authenticationConfig
     *        The authentication config required for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withAuthenticationConfig(AuthenticationConfig authenticationConfig) {
        setAuthenticationConfig(authenticationConfig);
        return this;
    }

    /**
     * <p>
     * The required connector runtime settings.
     * </p>
     * 
     * @return The required connector runtime settings.
     */

    public java.util.List<ConnectorRuntimeSetting> getConnectorRuntimeSettings() {
        return connectorRuntimeSettings;
    }

    /**
     * <p>
     * The required connector runtime settings.
     * </p>
     * 
     * @param connectorRuntimeSettings
     *        The required connector runtime settings.
     */

    public void setConnectorRuntimeSettings(java.util.Collection<ConnectorRuntimeSetting> connectorRuntimeSettings) {
        if (connectorRuntimeSettings == null) {
            this.connectorRuntimeSettings = null;
            return;
        }

        this.connectorRuntimeSettings = new java.util.ArrayList<ConnectorRuntimeSetting>(connectorRuntimeSettings);
    }

    /**
     * <p>
     * The required connector runtime settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectorRuntimeSettings(java.util.Collection)} or
     * {@link #withConnectorRuntimeSettings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param connectorRuntimeSettings
     *        The required connector runtime settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withConnectorRuntimeSettings(ConnectorRuntimeSetting... connectorRuntimeSettings) {
        if (this.connectorRuntimeSettings == null) {
            setConnectorRuntimeSettings(new java.util.ArrayList<ConnectorRuntimeSetting>(connectorRuntimeSettings.length));
        }
        for (ConnectorRuntimeSetting ele : connectorRuntimeSettings) {
            this.connectorRuntimeSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The required connector runtime settings.
     * </p>
     * 
     * @param connectorRuntimeSettings
     *        The required connector runtime settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withConnectorRuntimeSettings(java.util.Collection<ConnectorRuntimeSetting> connectorRuntimeSettings) {
        setConnectorRuntimeSettings(connectorRuntimeSettings);
        return this;
    }

    /**
     * <p>
     * A list of API versions that are supported by the connector.
     * </p>
     * 
     * @return A list of API versions that are supported by the connector.
     */

    public java.util.List<String> getSupportedApiVersions() {
        return supportedApiVersions;
    }

    /**
     * <p>
     * A list of API versions that are supported by the connector.
     * </p>
     * 
     * @param supportedApiVersions
     *        A list of API versions that are supported by the connector.
     */

    public void setSupportedApiVersions(java.util.Collection<String> supportedApiVersions) {
        if (supportedApiVersions == null) {
            this.supportedApiVersions = null;
            return;
        }

        this.supportedApiVersions = new java.util.ArrayList<String>(supportedApiVersions);
    }

    /**
     * <p>
     * A list of API versions that are supported by the connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedApiVersions(java.util.Collection)} or {@link #withSupportedApiVersions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param supportedApiVersions
     *        A list of API versions that are supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withSupportedApiVersions(String... supportedApiVersions) {
        if (this.supportedApiVersions == null) {
            setSupportedApiVersions(new java.util.ArrayList<String>(supportedApiVersions.length));
        }
        for (String ele : supportedApiVersions) {
            this.supportedApiVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of API versions that are supported by the connector.
     * </p>
     * 
     * @param supportedApiVersions
     *        A list of API versions that are supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withSupportedApiVersions(java.util.Collection<String> supportedApiVersions) {
        setSupportedApiVersions(supportedApiVersions);
        return this;
    }

    /**
     * <p>
     * A list of operators supported by the connector.
     * </p>
     * 
     * @return A list of operators supported by the connector.
     * @see Operators
     */

    public java.util.List<String> getSupportedOperators() {
        return supportedOperators;
    }

    /**
     * <p>
     * A list of operators supported by the connector.
     * </p>
     * 
     * @param supportedOperators
     *        A list of operators supported by the connector.
     * @see Operators
     */

    public void setSupportedOperators(java.util.Collection<String> supportedOperators) {
        if (supportedOperators == null) {
            this.supportedOperators = null;
            return;
        }

        this.supportedOperators = new java.util.ArrayList<String>(supportedOperators);
    }

    /**
     * <p>
     * A list of operators supported by the connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedOperators(java.util.Collection)} or {@link #withSupportedOperators(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedOperators
     *        A list of operators supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operators
     */

    public ConnectorConfiguration withSupportedOperators(String... supportedOperators) {
        if (this.supportedOperators == null) {
            setSupportedOperators(new java.util.ArrayList<String>(supportedOperators.length));
        }
        for (String ele : supportedOperators) {
            this.supportedOperators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of operators supported by the connector.
     * </p>
     * 
     * @param supportedOperators
     *        A list of operators supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operators
     */

    public ConnectorConfiguration withSupportedOperators(java.util.Collection<String> supportedOperators) {
        setSupportedOperators(supportedOperators);
        return this;
    }

    /**
     * <p>
     * A list of operators supported by the connector.
     * </p>
     * 
     * @param supportedOperators
     *        A list of operators supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operators
     */

    public ConnectorConfiguration withSupportedOperators(Operators... supportedOperators) {
        java.util.ArrayList<String> supportedOperatorsCopy = new java.util.ArrayList<String>(supportedOperators.length);
        for (Operators value : supportedOperators) {
            supportedOperatorsCopy.add(value.toString());
        }
        if (getSupportedOperators() == null) {
            setSupportedOperators(supportedOperatorsCopy);
        } else {
            getSupportedOperators().addAll(supportedOperatorsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of write operations supported by the connector.
     * </p>
     * 
     * @return A list of write operations supported by the connector.
     * @see WriteOperationType
     */

    public java.util.List<String> getSupportedWriteOperations() {
        return supportedWriteOperations;
    }

    /**
     * <p>
     * A list of write operations supported by the connector.
     * </p>
     * 
     * @param supportedWriteOperations
     *        A list of write operations supported by the connector.
     * @see WriteOperationType
     */

    public void setSupportedWriteOperations(java.util.Collection<String> supportedWriteOperations) {
        if (supportedWriteOperations == null) {
            this.supportedWriteOperations = null;
            return;
        }

        this.supportedWriteOperations = new java.util.ArrayList<String>(supportedWriteOperations);
    }

    /**
     * <p>
     * A list of write operations supported by the connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedWriteOperations(java.util.Collection)} or
     * {@link #withSupportedWriteOperations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedWriteOperations
     *        A list of write operations supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteOperationType
     */

    public ConnectorConfiguration withSupportedWriteOperations(String... supportedWriteOperations) {
        if (this.supportedWriteOperations == null) {
            setSupportedWriteOperations(new java.util.ArrayList<String>(supportedWriteOperations.length));
        }
        for (String ele : supportedWriteOperations) {
            this.supportedWriteOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of write operations supported by the connector.
     * </p>
     * 
     * @param supportedWriteOperations
     *        A list of write operations supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteOperationType
     */

    public ConnectorConfiguration withSupportedWriteOperations(java.util.Collection<String> supportedWriteOperations) {
        setSupportedWriteOperations(supportedWriteOperations);
        return this;
    }

    /**
     * <p>
     * A list of write operations supported by the connector.
     * </p>
     * 
     * @param supportedWriteOperations
     *        A list of write operations supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteOperationType
     */

    public ConnectorConfiguration withSupportedWriteOperations(WriteOperationType... supportedWriteOperations) {
        java.util.ArrayList<String> supportedWriteOperationsCopy = new java.util.ArrayList<String>(supportedWriteOperations.length);
        for (WriteOperationType value : supportedWriteOperations) {
            supportedWriteOperationsCopy.add(value.toString());
        }
        if (getSupportedWriteOperations() == null) {
            setSupportedWriteOperations(supportedWriteOperationsCopy);
        } else {
            getSupportedWriteOperations().addAll(supportedWriteOperationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The provisioning type used to register the connector.
     * </p>
     * 
     * @param connectorProvisioningType
     *        The provisioning type used to register the connector.
     * @see ConnectorProvisioningType
     */

    public void setConnectorProvisioningType(String connectorProvisioningType) {
        this.connectorProvisioningType = connectorProvisioningType;
    }

    /**
     * <p>
     * The provisioning type used to register the connector.
     * </p>
     * 
     * @return The provisioning type used to register the connector.
     * @see ConnectorProvisioningType
     */

    public String getConnectorProvisioningType() {
        return this.connectorProvisioningType;
    }

    /**
     * <p>
     * The provisioning type used to register the connector.
     * </p>
     * 
     * @param connectorProvisioningType
     *        The provisioning type used to register the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorProvisioningType
     */

    public ConnectorConfiguration withConnectorProvisioningType(String connectorProvisioningType) {
        setConnectorProvisioningType(connectorProvisioningType);
        return this;
    }

    /**
     * <p>
     * The provisioning type used to register the connector.
     * </p>
     * 
     * @param connectorProvisioningType
     *        The provisioning type used to register the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorProvisioningType
     */

    public ConnectorConfiguration withConnectorProvisioningType(ConnectorProvisioningType connectorProvisioningType) {
        this.connectorProvisioningType = connectorProvisioningType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration required for registering the connector.
     * </p>
     * 
     * @param connectorProvisioningConfig
     *        The configuration required for registering the connector.
     */

    public void setConnectorProvisioningConfig(ConnectorProvisioningConfig connectorProvisioningConfig) {
        this.connectorProvisioningConfig = connectorProvisioningConfig;
    }

    /**
     * <p>
     * The configuration required for registering the connector.
     * </p>
     * 
     * @return The configuration required for registering the connector.
     */

    public ConnectorProvisioningConfig getConnectorProvisioningConfig() {
        return this.connectorProvisioningConfig;
    }

    /**
     * <p>
     * The configuration required for registering the connector.
     * </p>
     * 
     * @param connectorProvisioningConfig
     *        The configuration required for registering the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withConnectorProvisioningConfig(ConnectorProvisioningConfig connectorProvisioningConfig) {
        setConnectorProvisioningConfig(connectorProvisioningConfig);
        return this;
    }

    /**
     * <p>
     * Logo URL of the connector.
     * </p>
     * 
     * @param logoURL
     *        Logo URL of the connector.
     */

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    /**
     * <p>
     * Logo URL of the connector.
     * </p>
     * 
     * @return Logo URL of the connector.
     */

    public String getLogoURL() {
        return this.logoURL;
    }

    /**
     * <p>
     * Logo URL of the connector.
     * </p>
     * 
     * @param logoURL
     *        Logo URL of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withLogoURL(String logoURL) {
        setLogoURL(logoURL);
        return this;
    }

    /**
     * <p>
     * The date on which the connector was registered.
     * </p>
     * 
     * @param registeredAt
     *        The date on which the connector was registered.
     */

    public void setRegisteredAt(java.util.Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    /**
     * <p>
     * The date on which the connector was registered.
     * </p>
     * 
     * @return The date on which the connector was registered.
     */

    public java.util.Date getRegisteredAt() {
        return this.registeredAt;
    }

    /**
     * <p>
     * The date on which the connector was registered.
     * </p>
     * 
     * @param registeredAt
     *        The date on which the connector was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withRegisteredAt(java.util.Date registeredAt) {
        setRegisteredAt(registeredAt);
        return this;
    }

    /**
     * <p>
     * Information about who registered the connector.
     * </p>
     * 
     * @param registeredBy
     *        Information about who registered the connector.
     */

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    /**
     * <p>
     * Information about who registered the connector.
     * </p>
     * 
     * @return Information about who registered the connector.
     */

    public String getRegisteredBy() {
        return this.registeredBy;
    }

    /**
     * <p>
     * Information about who registered the connector.
     * </p>
     * 
     * @param registeredBy
     *        Information about who registered the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfiguration withRegisteredBy(String registeredBy) {
        setRegisteredBy(registeredBy);
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
            sb.append("ConnectorMetadata: ").append(getConnectorMetadata()).append(",");
        if (getConnectorType() != null)
            sb.append("ConnectorType: ").append(getConnectorType()).append(",");
        if (getConnectorLabel() != null)
            sb.append("ConnectorLabel: ").append(getConnectorLabel()).append(",");
        if (getConnectorDescription() != null)
            sb.append("ConnectorDescription: ").append(getConnectorDescription()).append(",");
        if (getConnectorOwner() != null)
            sb.append("ConnectorOwner: ").append(getConnectorOwner()).append(",");
        if (getConnectorName() != null)
            sb.append("ConnectorName: ").append(getConnectorName()).append(",");
        if (getConnectorVersion() != null)
            sb.append("ConnectorVersion: ").append(getConnectorVersion()).append(",");
        if (getConnectorArn() != null)
            sb.append("ConnectorArn: ").append(getConnectorArn()).append(",");
        if (getConnectorModes() != null)
            sb.append("ConnectorModes: ").append(getConnectorModes()).append(",");
        if (getAuthenticationConfig() != null)
            sb.append("AuthenticationConfig: ").append(getAuthenticationConfig()).append(",");
        if (getConnectorRuntimeSettings() != null)
            sb.append("ConnectorRuntimeSettings: ").append(getConnectorRuntimeSettings()).append(",");
        if (getSupportedApiVersions() != null)
            sb.append("SupportedApiVersions: ").append(getSupportedApiVersions()).append(",");
        if (getSupportedOperators() != null)
            sb.append("SupportedOperators: ").append(getSupportedOperators()).append(",");
        if (getSupportedWriteOperations() != null)
            sb.append("SupportedWriteOperations: ").append(getSupportedWriteOperations()).append(",");
        if (getConnectorProvisioningType() != null)
            sb.append("ConnectorProvisioningType: ").append(getConnectorProvisioningType()).append(",");
        if (getConnectorProvisioningConfig() != null)
            sb.append("ConnectorProvisioningConfig: ").append(getConnectorProvisioningConfig()).append(",");
        if (getLogoURL() != null)
            sb.append("LogoURL: ").append(getLogoURL()).append(",");
        if (getRegisteredAt() != null)
            sb.append("RegisteredAt: ").append(getRegisteredAt()).append(",");
        if (getRegisteredBy() != null)
            sb.append("RegisteredBy: ").append(getRegisteredBy());
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
        if (other.getConnectorType() == null ^ this.getConnectorType() == null)
            return false;
        if (other.getConnectorType() != null && other.getConnectorType().equals(this.getConnectorType()) == false)
            return false;
        if (other.getConnectorLabel() == null ^ this.getConnectorLabel() == null)
            return false;
        if (other.getConnectorLabel() != null && other.getConnectorLabel().equals(this.getConnectorLabel()) == false)
            return false;
        if (other.getConnectorDescription() == null ^ this.getConnectorDescription() == null)
            return false;
        if (other.getConnectorDescription() != null && other.getConnectorDescription().equals(this.getConnectorDescription()) == false)
            return false;
        if (other.getConnectorOwner() == null ^ this.getConnectorOwner() == null)
            return false;
        if (other.getConnectorOwner() != null && other.getConnectorOwner().equals(this.getConnectorOwner()) == false)
            return false;
        if (other.getConnectorName() == null ^ this.getConnectorName() == null)
            return false;
        if (other.getConnectorName() != null && other.getConnectorName().equals(this.getConnectorName()) == false)
            return false;
        if (other.getConnectorVersion() == null ^ this.getConnectorVersion() == null)
            return false;
        if (other.getConnectorVersion() != null && other.getConnectorVersion().equals(this.getConnectorVersion()) == false)
            return false;
        if (other.getConnectorArn() == null ^ this.getConnectorArn() == null)
            return false;
        if (other.getConnectorArn() != null && other.getConnectorArn().equals(this.getConnectorArn()) == false)
            return false;
        if (other.getConnectorModes() == null ^ this.getConnectorModes() == null)
            return false;
        if (other.getConnectorModes() != null && other.getConnectorModes().equals(this.getConnectorModes()) == false)
            return false;
        if (other.getAuthenticationConfig() == null ^ this.getAuthenticationConfig() == null)
            return false;
        if (other.getAuthenticationConfig() != null && other.getAuthenticationConfig().equals(this.getAuthenticationConfig()) == false)
            return false;
        if (other.getConnectorRuntimeSettings() == null ^ this.getConnectorRuntimeSettings() == null)
            return false;
        if (other.getConnectorRuntimeSettings() != null && other.getConnectorRuntimeSettings().equals(this.getConnectorRuntimeSettings()) == false)
            return false;
        if (other.getSupportedApiVersions() == null ^ this.getSupportedApiVersions() == null)
            return false;
        if (other.getSupportedApiVersions() != null && other.getSupportedApiVersions().equals(this.getSupportedApiVersions()) == false)
            return false;
        if (other.getSupportedOperators() == null ^ this.getSupportedOperators() == null)
            return false;
        if (other.getSupportedOperators() != null && other.getSupportedOperators().equals(this.getSupportedOperators()) == false)
            return false;
        if (other.getSupportedWriteOperations() == null ^ this.getSupportedWriteOperations() == null)
            return false;
        if (other.getSupportedWriteOperations() != null && other.getSupportedWriteOperations().equals(this.getSupportedWriteOperations()) == false)
            return false;
        if (other.getConnectorProvisioningType() == null ^ this.getConnectorProvisioningType() == null)
            return false;
        if (other.getConnectorProvisioningType() != null && other.getConnectorProvisioningType().equals(this.getConnectorProvisioningType()) == false)
            return false;
        if (other.getConnectorProvisioningConfig() == null ^ this.getConnectorProvisioningConfig() == null)
            return false;
        if (other.getConnectorProvisioningConfig() != null && other.getConnectorProvisioningConfig().equals(this.getConnectorProvisioningConfig()) == false)
            return false;
        if (other.getLogoURL() == null ^ this.getLogoURL() == null)
            return false;
        if (other.getLogoURL() != null && other.getLogoURL().equals(this.getLogoURL()) == false)
            return false;
        if (other.getRegisteredAt() == null ^ this.getRegisteredAt() == null)
            return false;
        if (other.getRegisteredAt() != null && other.getRegisteredAt().equals(this.getRegisteredAt()) == false)
            return false;
        if (other.getRegisteredBy() == null ^ this.getRegisteredBy() == null)
            return false;
        if (other.getRegisteredBy() != null && other.getRegisteredBy().equals(this.getRegisteredBy()) == false)
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
        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getConnectorLabel() == null) ? 0 : getConnectorLabel().hashCode());
        hashCode = prime * hashCode + ((getConnectorDescription() == null) ? 0 : getConnectorDescription().hashCode());
        hashCode = prime * hashCode + ((getConnectorOwner() == null) ? 0 : getConnectorOwner().hashCode());
        hashCode = prime * hashCode + ((getConnectorName() == null) ? 0 : getConnectorName().hashCode());
        hashCode = prime * hashCode + ((getConnectorVersion() == null) ? 0 : getConnectorVersion().hashCode());
        hashCode = prime * hashCode + ((getConnectorArn() == null) ? 0 : getConnectorArn().hashCode());
        hashCode = prime * hashCode + ((getConnectorModes() == null) ? 0 : getConnectorModes().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationConfig() == null) ? 0 : getAuthenticationConfig().hashCode());
        hashCode = prime * hashCode + ((getConnectorRuntimeSettings() == null) ? 0 : getConnectorRuntimeSettings().hashCode());
        hashCode = prime * hashCode + ((getSupportedApiVersions() == null) ? 0 : getSupportedApiVersions().hashCode());
        hashCode = prime * hashCode + ((getSupportedOperators() == null) ? 0 : getSupportedOperators().hashCode());
        hashCode = prime * hashCode + ((getSupportedWriteOperations() == null) ? 0 : getSupportedWriteOperations().hashCode());
        hashCode = prime * hashCode + ((getConnectorProvisioningType() == null) ? 0 : getConnectorProvisioningType().hashCode());
        hashCode = prime * hashCode + ((getConnectorProvisioningConfig() == null) ? 0 : getConnectorProvisioningConfig().hashCode());
        hashCode = prime * hashCode + ((getLogoURL() == null) ? 0 : getLogoURL().hashCode());
        hashCode = prime * hashCode + ((getRegisteredAt() == null) ? 0 : getRegisteredAt().hashCode());
        hashCode = prime * hashCode + ((getRegisteredBy() == null) ? 0 : getRegisteredBy().hashCode());
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
