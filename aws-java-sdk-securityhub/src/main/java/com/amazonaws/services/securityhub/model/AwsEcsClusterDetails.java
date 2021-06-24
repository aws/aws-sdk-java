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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * provides details about an ECS cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsClusterDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsClusterDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The short name of one or more capacity providers to associate with the cluster.
     * </p>
     */
    private java.util.List<String> capacityProviders;
    /**
     * <p>
     * The setting to use to create the cluster. Specifically used to configure whether to enable CloudWatch Container
     * Insights for the cluster.
     * </p>
     */
    private java.util.List<AwsEcsClusterClusterSettingsDetails> clusterSettings;
    /**
     * <p>
     * The run command configuration for the cluster.
     * </p>
     */
    private AwsEcsClusterConfigurationDetails configuration;
    /**
     * <p>
     * The default capacity provider strategy for the cluster. The default capacity provider strategy is used when
     * services or tasks are run without a specified launch type or capacity provider strategy.
     * </p>
     */
    private java.util.List<AwsEcsClusterDefaultCapacityProviderStrategyDetails> defaultCapacityProviderStrategy;

    /**
     * <p>
     * The short name of one or more capacity providers to associate with the cluster.
     * </p>
     * 
     * @return The short name of one or more capacity providers to associate with the cluster.
     */

    public java.util.List<String> getCapacityProviders() {
        return capacityProviders;
    }

    /**
     * <p>
     * The short name of one or more capacity providers to associate with the cluster.
     * </p>
     * 
     * @param capacityProviders
     *        The short name of one or more capacity providers to associate with the cluster.
     */

    public void setCapacityProviders(java.util.Collection<String> capacityProviders) {
        if (capacityProviders == null) {
            this.capacityProviders = null;
            return;
        }

        this.capacityProviders = new java.util.ArrayList<String>(capacityProviders);
    }

    /**
     * <p>
     * The short name of one or more capacity providers to associate with the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityProviders(java.util.Collection)} or {@link #withCapacityProviders(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param capacityProviders
     *        The short name of one or more capacity providers to associate with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterDetails withCapacityProviders(String... capacityProviders) {
        if (this.capacityProviders == null) {
            setCapacityProviders(new java.util.ArrayList<String>(capacityProviders.length));
        }
        for (String ele : capacityProviders) {
            this.capacityProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The short name of one or more capacity providers to associate with the cluster.
     * </p>
     * 
     * @param capacityProviders
     *        The short name of one or more capacity providers to associate with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterDetails withCapacityProviders(java.util.Collection<String> capacityProviders) {
        setCapacityProviders(capacityProviders);
        return this;
    }

    /**
     * <p>
     * The setting to use to create the cluster. Specifically used to configure whether to enable CloudWatch Container
     * Insights for the cluster.
     * </p>
     * 
     * @return The setting to use to create the cluster. Specifically used to configure whether to enable CloudWatch
     *         Container Insights for the cluster.
     */

    public java.util.List<AwsEcsClusterClusterSettingsDetails> getClusterSettings() {
        return clusterSettings;
    }

    /**
     * <p>
     * The setting to use to create the cluster. Specifically used to configure whether to enable CloudWatch Container
     * Insights for the cluster.
     * </p>
     * 
     * @param clusterSettings
     *        The setting to use to create the cluster. Specifically used to configure whether to enable CloudWatch
     *        Container Insights for the cluster.
     */

    public void setClusterSettings(java.util.Collection<AwsEcsClusterClusterSettingsDetails> clusterSettings) {
        if (clusterSettings == null) {
            this.clusterSettings = null;
            return;
        }

        this.clusterSettings = new java.util.ArrayList<AwsEcsClusterClusterSettingsDetails>(clusterSettings);
    }

    /**
     * <p>
     * The setting to use to create the cluster. Specifically used to configure whether to enable CloudWatch Container
     * Insights for the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterSettings(java.util.Collection)} or {@link #withClusterSettings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param clusterSettings
     *        The setting to use to create the cluster. Specifically used to configure whether to enable CloudWatch
     *        Container Insights for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterDetails withClusterSettings(AwsEcsClusterClusterSettingsDetails... clusterSettings) {
        if (this.clusterSettings == null) {
            setClusterSettings(new java.util.ArrayList<AwsEcsClusterClusterSettingsDetails>(clusterSettings.length));
        }
        for (AwsEcsClusterClusterSettingsDetails ele : clusterSettings) {
            this.clusterSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The setting to use to create the cluster. Specifically used to configure whether to enable CloudWatch Container
     * Insights for the cluster.
     * </p>
     * 
     * @param clusterSettings
     *        The setting to use to create the cluster. Specifically used to configure whether to enable CloudWatch
     *        Container Insights for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterDetails withClusterSettings(java.util.Collection<AwsEcsClusterClusterSettingsDetails> clusterSettings) {
        setClusterSettings(clusterSettings);
        return this;
    }

    /**
     * <p>
     * The run command configuration for the cluster.
     * </p>
     * 
     * @param configuration
     *        The run command configuration for the cluster.
     */

    public void setConfiguration(AwsEcsClusterConfigurationDetails configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The run command configuration for the cluster.
     * </p>
     * 
     * @return The run command configuration for the cluster.
     */

    public AwsEcsClusterConfigurationDetails getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The run command configuration for the cluster.
     * </p>
     * 
     * @param configuration
     *        The run command configuration for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterDetails withConfiguration(AwsEcsClusterConfigurationDetails configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The default capacity provider strategy for the cluster. The default capacity provider strategy is used when
     * services or tasks are run without a specified launch type or capacity provider strategy.
     * </p>
     * 
     * @return The default capacity provider strategy for the cluster. The default capacity provider strategy is used
     *         when services or tasks are run without a specified launch type or capacity provider strategy.
     */

    public java.util.List<AwsEcsClusterDefaultCapacityProviderStrategyDetails> getDefaultCapacityProviderStrategy() {
        return defaultCapacityProviderStrategy;
    }

    /**
     * <p>
     * The default capacity provider strategy for the cluster. The default capacity provider strategy is used when
     * services or tasks are run without a specified launch type or capacity provider strategy.
     * </p>
     * 
     * @param defaultCapacityProviderStrategy
     *        The default capacity provider strategy for the cluster. The default capacity provider strategy is used
     *        when services or tasks are run without a specified launch type or capacity provider strategy.
     */

    public void setDefaultCapacityProviderStrategy(java.util.Collection<AwsEcsClusterDefaultCapacityProviderStrategyDetails> defaultCapacityProviderStrategy) {
        if (defaultCapacityProviderStrategy == null) {
            this.defaultCapacityProviderStrategy = null;
            return;
        }

        this.defaultCapacityProviderStrategy = new java.util.ArrayList<AwsEcsClusterDefaultCapacityProviderStrategyDetails>(defaultCapacityProviderStrategy);
    }

    /**
     * <p>
     * The default capacity provider strategy for the cluster. The default capacity provider strategy is used when
     * services or tasks are run without a specified launch type or capacity provider strategy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultCapacityProviderStrategy(java.util.Collection)} or
     * {@link #withDefaultCapacityProviderStrategy(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param defaultCapacityProviderStrategy
     *        The default capacity provider strategy for the cluster. The default capacity provider strategy is used
     *        when services or tasks are run without a specified launch type or capacity provider strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterDetails withDefaultCapacityProviderStrategy(AwsEcsClusterDefaultCapacityProviderStrategyDetails... defaultCapacityProviderStrategy) {
        if (this.defaultCapacityProviderStrategy == null) {
            setDefaultCapacityProviderStrategy(new java.util.ArrayList<AwsEcsClusterDefaultCapacityProviderStrategyDetails>(
                    defaultCapacityProviderStrategy.length));
        }
        for (AwsEcsClusterDefaultCapacityProviderStrategyDetails ele : defaultCapacityProviderStrategy) {
            this.defaultCapacityProviderStrategy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The default capacity provider strategy for the cluster. The default capacity provider strategy is used when
     * services or tasks are run without a specified launch type or capacity provider strategy.
     * </p>
     * 
     * @param defaultCapacityProviderStrategy
     *        The default capacity provider strategy for the cluster. The default capacity provider strategy is used
     *        when services or tasks are run without a specified launch type or capacity provider strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsClusterDetails withDefaultCapacityProviderStrategy(
            java.util.Collection<AwsEcsClusterDefaultCapacityProviderStrategyDetails> defaultCapacityProviderStrategy) {
        setDefaultCapacityProviderStrategy(defaultCapacityProviderStrategy);
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
        if (getCapacityProviders() != null)
            sb.append("CapacityProviders: ").append(getCapacityProviders()).append(",");
        if (getClusterSettings() != null)
            sb.append("ClusterSettings: ").append(getClusterSettings()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDefaultCapacityProviderStrategy() != null)
            sb.append("DefaultCapacityProviderStrategy: ").append(getDefaultCapacityProviderStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsClusterDetails == false)
            return false;
        AwsEcsClusterDetails other = (AwsEcsClusterDetails) obj;
        if (other.getCapacityProviders() == null ^ this.getCapacityProviders() == null)
            return false;
        if (other.getCapacityProviders() != null && other.getCapacityProviders().equals(this.getCapacityProviders()) == false)
            return false;
        if (other.getClusterSettings() == null ^ this.getClusterSettings() == null)
            return false;
        if (other.getClusterSettings() != null && other.getClusterSettings().equals(this.getClusterSettings()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDefaultCapacityProviderStrategy() == null ^ this.getDefaultCapacityProviderStrategy() == null)
            return false;
        if (other.getDefaultCapacityProviderStrategy() != null
                && other.getDefaultCapacityProviderStrategy().equals(this.getDefaultCapacityProviderStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityProviders() == null) ? 0 : getCapacityProviders().hashCode());
        hashCode = prime * hashCode + ((getClusterSettings() == null) ? 0 : getClusterSettings().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDefaultCapacityProviderStrategy() == null) ? 0 : getDefaultCapacityProviderStrategy().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsClusterDetails clone() {
        try {
            return (AwsEcsClusterDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsClusterDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
