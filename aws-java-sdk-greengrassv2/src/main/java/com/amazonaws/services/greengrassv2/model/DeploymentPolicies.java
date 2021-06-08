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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about policies that define how a deployment updates components and handles failure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DeploymentPolicies" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentPolicies implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The failure handling policy for the configuration deployment. This policy defines what to do if the deployment
     * fails.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     */
    private String failureHandlingPolicy;
    /**
     * <p>
     * The component update policy for the configuration deployment. This policy defines when it's safe to deploy the
     * configuration to devices.
     * </p>
     */
    private DeploymentComponentUpdatePolicy componentUpdatePolicy;
    /**
     * <p>
     * The configuration validation policy for the configuration deployment. This policy defines how long each component
     * has to validate its configure updates.
     * </p>
     */
    private DeploymentConfigurationValidationPolicy configurationValidationPolicy;

    /**
     * <p>
     * The failure handling policy for the configuration deployment. This policy defines what to do if the deployment
     * fails.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * 
     * @param failureHandlingPolicy
     *        The failure handling policy for the configuration deployment. This policy defines what to do if the
     *        deployment fails.</p>
     *        <p>
     *        Default: <code>ROLLBACK</code>
     * @see DeploymentFailureHandlingPolicy
     */

    public void setFailureHandlingPolicy(String failureHandlingPolicy) {
        this.failureHandlingPolicy = failureHandlingPolicy;
    }

    /**
     * <p>
     * The failure handling policy for the configuration deployment. This policy defines what to do if the deployment
     * fails.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * 
     * @return The failure handling policy for the configuration deployment. This policy defines what to do if the
     *         deployment fails.</p>
     *         <p>
     *         Default: <code>ROLLBACK</code>
     * @see DeploymentFailureHandlingPolicy
     */

    public String getFailureHandlingPolicy() {
        return this.failureHandlingPolicy;
    }

    /**
     * <p>
     * The failure handling policy for the configuration deployment. This policy defines what to do if the deployment
     * fails.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * 
     * @param failureHandlingPolicy
     *        The failure handling policy for the configuration deployment. This policy defines what to do if the
     *        deployment fails.</p>
     *        <p>
     *        Default: <code>ROLLBACK</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentFailureHandlingPolicy
     */

    public DeploymentPolicies withFailureHandlingPolicy(String failureHandlingPolicy) {
        setFailureHandlingPolicy(failureHandlingPolicy);
        return this;
    }

    /**
     * <p>
     * The failure handling policy for the configuration deployment. This policy defines what to do if the deployment
     * fails.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * 
     * @param failureHandlingPolicy
     *        The failure handling policy for the configuration deployment. This policy defines what to do if the
     *        deployment fails.</p>
     *        <p>
     *        Default: <code>ROLLBACK</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentFailureHandlingPolicy
     */

    public DeploymentPolicies withFailureHandlingPolicy(DeploymentFailureHandlingPolicy failureHandlingPolicy) {
        this.failureHandlingPolicy = failureHandlingPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The component update policy for the configuration deployment. This policy defines when it's safe to deploy the
     * configuration to devices.
     * </p>
     * 
     * @param componentUpdatePolicy
     *        The component update policy for the configuration deployment. This policy defines when it's safe to deploy
     *        the configuration to devices.
     */

    public void setComponentUpdatePolicy(DeploymentComponentUpdatePolicy componentUpdatePolicy) {
        this.componentUpdatePolicy = componentUpdatePolicy;
    }

    /**
     * <p>
     * The component update policy for the configuration deployment. This policy defines when it's safe to deploy the
     * configuration to devices.
     * </p>
     * 
     * @return The component update policy for the configuration deployment. This policy defines when it's safe to
     *         deploy the configuration to devices.
     */

    public DeploymentComponentUpdatePolicy getComponentUpdatePolicy() {
        return this.componentUpdatePolicy;
    }

    /**
     * <p>
     * The component update policy for the configuration deployment. This policy defines when it's safe to deploy the
     * configuration to devices.
     * </p>
     * 
     * @param componentUpdatePolicy
     *        The component update policy for the configuration deployment. This policy defines when it's safe to deploy
     *        the configuration to devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentPolicies withComponentUpdatePolicy(DeploymentComponentUpdatePolicy componentUpdatePolicy) {
        setComponentUpdatePolicy(componentUpdatePolicy);
        return this;
    }

    /**
     * <p>
     * The configuration validation policy for the configuration deployment. This policy defines how long each component
     * has to validate its configure updates.
     * </p>
     * 
     * @param configurationValidationPolicy
     *        The configuration validation policy for the configuration deployment. This policy defines how long each
     *        component has to validate its configure updates.
     */

    public void setConfigurationValidationPolicy(DeploymentConfigurationValidationPolicy configurationValidationPolicy) {
        this.configurationValidationPolicy = configurationValidationPolicy;
    }

    /**
     * <p>
     * The configuration validation policy for the configuration deployment. This policy defines how long each component
     * has to validate its configure updates.
     * </p>
     * 
     * @return The configuration validation policy for the configuration deployment. This policy defines how long each
     *         component has to validate its configure updates.
     */

    public DeploymentConfigurationValidationPolicy getConfigurationValidationPolicy() {
        return this.configurationValidationPolicy;
    }

    /**
     * <p>
     * The configuration validation policy for the configuration deployment. This policy defines how long each component
     * has to validate its configure updates.
     * </p>
     * 
     * @param configurationValidationPolicy
     *        The configuration validation policy for the configuration deployment. This policy defines how long each
     *        component has to validate its configure updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentPolicies withConfigurationValidationPolicy(DeploymentConfigurationValidationPolicy configurationValidationPolicy) {
        setConfigurationValidationPolicy(configurationValidationPolicy);
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
        if (getFailureHandlingPolicy() != null)
            sb.append("FailureHandlingPolicy: ").append(getFailureHandlingPolicy()).append(",");
        if (getComponentUpdatePolicy() != null)
            sb.append("ComponentUpdatePolicy: ").append(getComponentUpdatePolicy()).append(",");
        if (getConfigurationValidationPolicy() != null)
            sb.append("ConfigurationValidationPolicy: ").append(getConfigurationValidationPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentPolicies == false)
            return false;
        DeploymentPolicies other = (DeploymentPolicies) obj;
        if (other.getFailureHandlingPolicy() == null ^ this.getFailureHandlingPolicy() == null)
            return false;
        if (other.getFailureHandlingPolicy() != null && other.getFailureHandlingPolicy().equals(this.getFailureHandlingPolicy()) == false)
            return false;
        if (other.getComponentUpdatePolicy() == null ^ this.getComponentUpdatePolicy() == null)
            return false;
        if (other.getComponentUpdatePolicy() != null && other.getComponentUpdatePolicy().equals(this.getComponentUpdatePolicy()) == false)
            return false;
        if (other.getConfigurationValidationPolicy() == null ^ this.getConfigurationValidationPolicy() == null)
            return false;
        if (other.getConfigurationValidationPolicy() != null
                && other.getConfigurationValidationPolicy().equals(this.getConfigurationValidationPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureHandlingPolicy() == null) ? 0 : getFailureHandlingPolicy().hashCode());
        hashCode = prime * hashCode + ((getComponentUpdatePolicy() == null) ? 0 : getComponentUpdatePolicy().hashCode());
        hashCode = prime * hashCode + ((getConfigurationValidationPolicy() == null) ? 0 : getConfigurationValidationPolicy().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentPolicies clone() {
        try {
            return (DeploymentPolicies) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.DeploymentPoliciesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
