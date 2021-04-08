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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the configuration of the source connector used in the flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/SourceFlowConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceFlowConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AppFlow connector profile. This name must be unique for each connector profile in the AWS
     * account.
     * </p>
     */
    private String connectorProfileName;
    /**
     * <p>
     * The type of connector, such as Salesforce, Marketo, and so on.
     * </p>
     */
    private String connectorType;
    /**
     * <p>
     * Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided, the fields
     * specified in the configuration are used when querying for the incremental data pull.
     * </p>
     */
    private IncrementalPullConfig incrementalPullConfig;
    /**
     * <p>
     * Specifies the information that is required to query a particular source connector.
     * </p>
     */
    private SourceConnectorProperties sourceConnectorProperties;

    /**
     * <p>
     * The name of the AppFlow connector profile. This name must be unique for each connector profile in the AWS
     * account.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the AppFlow connector profile. This name must be unique for each connector profile in the AWS
     *        account.
     */

    public void setConnectorProfileName(String connectorProfileName) {
        this.connectorProfileName = connectorProfileName;
    }

    /**
     * <p>
     * The name of the AppFlow connector profile. This name must be unique for each connector profile in the AWS
     * account.
     * </p>
     * 
     * @return The name of the AppFlow connector profile. This name must be unique for each connector profile in the AWS
     *         account.
     */

    public String getConnectorProfileName() {
        return this.connectorProfileName;
    }

    /**
     * <p>
     * The name of the AppFlow connector profile. This name must be unique for each connector profile in the AWS
     * account.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the AppFlow connector profile. This name must be unique for each connector profile in the AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceFlowConfig withConnectorProfileName(String connectorProfileName) {
        setConnectorProfileName(connectorProfileName);
        return this;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Marketo, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector, such as Salesforce, Marketo, and so on.
     * @see SourceConnectorType
     */

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Marketo, and so on.
     * </p>
     * 
     * @return The type of connector, such as Salesforce, Marketo, and so on.
     * @see SourceConnectorType
     */

    public String getConnectorType() {
        return this.connectorType;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Marketo, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector, such as Salesforce, Marketo, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceConnectorType
     */

    public SourceFlowConfig withConnectorType(String connectorType) {
        setConnectorType(connectorType);
        return this;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Marketo, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector, such as Salesforce, Marketo, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceConnectorType
     */

    public SourceFlowConfig withConnectorType(SourceConnectorType connectorType) {
        this.connectorType = connectorType.toString();
        return this;
    }

    /**
     * <p>
     * Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided, the fields
     * specified in the configuration are used when querying for the incremental data pull.
     * </p>
     * 
     * @param incrementalPullConfig
     *        Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided, the
     *        fields specified in the configuration are used when querying for the incremental data pull.
     */

    public void setIncrementalPullConfig(IncrementalPullConfig incrementalPullConfig) {
        this.incrementalPullConfig = incrementalPullConfig;
    }

    /**
     * <p>
     * Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided, the fields
     * specified in the configuration are used when querying for the incremental data pull.
     * </p>
     * 
     * @return Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided,
     *         the fields specified in the configuration are used when querying for the incremental data pull.
     */

    public IncrementalPullConfig getIncrementalPullConfig() {
        return this.incrementalPullConfig;
    }

    /**
     * <p>
     * Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided, the fields
     * specified in the configuration are used when querying for the incremental data pull.
     * </p>
     * 
     * @param incrementalPullConfig
     *        Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided, the
     *        fields specified in the configuration are used when querying for the incremental data pull.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceFlowConfig withIncrementalPullConfig(IncrementalPullConfig incrementalPullConfig) {
        setIncrementalPullConfig(incrementalPullConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required to query a particular source connector.
     * </p>
     * 
     * @param sourceConnectorProperties
     *        Specifies the information that is required to query a particular source connector.
     */

    public void setSourceConnectorProperties(SourceConnectorProperties sourceConnectorProperties) {
        this.sourceConnectorProperties = sourceConnectorProperties;
    }

    /**
     * <p>
     * Specifies the information that is required to query a particular source connector.
     * </p>
     * 
     * @return Specifies the information that is required to query a particular source connector.
     */

    public SourceConnectorProperties getSourceConnectorProperties() {
        return this.sourceConnectorProperties;
    }

    /**
     * <p>
     * Specifies the information that is required to query a particular source connector.
     * </p>
     * 
     * @param sourceConnectorProperties
     *        Specifies the information that is required to query a particular source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceFlowConfig withSourceConnectorProperties(SourceConnectorProperties sourceConnectorProperties) {
        setSourceConnectorProperties(sourceConnectorProperties);
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
        if (getConnectorType() != null)
            sb.append("ConnectorType: ").append(getConnectorType()).append(",");
        if (getIncrementalPullConfig() != null)
            sb.append("IncrementalPullConfig: ").append(getIncrementalPullConfig()).append(",");
        if (getSourceConnectorProperties() != null)
            sb.append("SourceConnectorProperties: ").append(getSourceConnectorProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceFlowConfig == false)
            return false;
        SourceFlowConfig other = (SourceFlowConfig) obj;
        if (other.getConnectorProfileName() == null ^ this.getConnectorProfileName() == null)
            return false;
        if (other.getConnectorProfileName() != null && other.getConnectorProfileName().equals(this.getConnectorProfileName()) == false)
            return false;
        if (other.getConnectorType() == null ^ this.getConnectorType() == null)
            return false;
        if (other.getConnectorType() != null && other.getConnectorType().equals(this.getConnectorType()) == false)
            return false;
        if (other.getIncrementalPullConfig() == null ^ this.getIncrementalPullConfig() == null)
            return false;
        if (other.getIncrementalPullConfig() != null && other.getIncrementalPullConfig().equals(this.getIncrementalPullConfig()) == false)
            return false;
        if (other.getSourceConnectorProperties() == null ^ this.getSourceConnectorProperties() == null)
            return false;
        if (other.getSourceConnectorProperties() != null && other.getSourceConnectorProperties().equals(this.getSourceConnectorProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorProfileName() == null) ? 0 : getConnectorProfileName().hashCode());
        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getIncrementalPullConfig() == null) ? 0 : getIncrementalPullConfig().hashCode());
        hashCode = prime * hashCode + ((getSourceConnectorProperties() == null) ? 0 : getSourceConnectorProperties().hashCode());
        return hashCode;
    }

    @Override
    public SourceFlowConfig clone() {
        try {
            return (SourceFlowConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.SourceFlowConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
