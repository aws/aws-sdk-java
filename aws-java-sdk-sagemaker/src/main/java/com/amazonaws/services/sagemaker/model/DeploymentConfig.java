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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback
 * configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeploymentConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Update policy for a blue/green deployment. If this update policy is specified, SageMaker creates a new fleet
     * during the deployment while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the
     * specified traffic routing configuration. Only one update policy should be used in the deployment configuration.
     * If no update policy is specified, SageMaker uses a blue/green deployment strategy with all at once traffic
     * shifting by default.
     * </p>
     */
    private BlueGreenUpdatePolicy blueGreenUpdatePolicy;
    /**
     * <p>
     * Automatic rollback configuration for handling endpoint deployment failures and recovery.
     * </p>
     */
    private AutoRollbackConfig autoRollbackConfiguration;

    /**
     * <p>
     * Update policy for a blue/green deployment. If this update policy is specified, SageMaker creates a new fleet
     * during the deployment while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the
     * specified traffic routing configuration. Only one update policy should be used in the deployment configuration.
     * If no update policy is specified, SageMaker uses a blue/green deployment strategy with all at once traffic
     * shifting by default.
     * </p>
     * 
     * @param blueGreenUpdatePolicy
     *        Update policy for a blue/green deployment. If this update policy is specified, SageMaker creates a new
     *        fleet during the deployment while maintaining the old fleet. SageMaker flips traffic to the new fleet
     *        according to the specified traffic routing configuration. Only one update policy should be used in the
     *        deployment configuration. If no update policy is specified, SageMaker uses a blue/green deployment
     *        strategy with all at once traffic shifting by default.
     */

    public void setBlueGreenUpdatePolicy(BlueGreenUpdatePolicy blueGreenUpdatePolicy) {
        this.blueGreenUpdatePolicy = blueGreenUpdatePolicy;
    }

    /**
     * <p>
     * Update policy for a blue/green deployment. If this update policy is specified, SageMaker creates a new fleet
     * during the deployment while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the
     * specified traffic routing configuration. Only one update policy should be used in the deployment configuration.
     * If no update policy is specified, SageMaker uses a blue/green deployment strategy with all at once traffic
     * shifting by default.
     * </p>
     * 
     * @return Update policy for a blue/green deployment. If this update policy is specified, SageMaker creates a new
     *         fleet during the deployment while maintaining the old fleet. SageMaker flips traffic to the new fleet
     *         according to the specified traffic routing configuration. Only one update policy should be used in the
     *         deployment configuration. If no update policy is specified, SageMaker uses a blue/green deployment
     *         strategy with all at once traffic shifting by default.
     */

    public BlueGreenUpdatePolicy getBlueGreenUpdatePolicy() {
        return this.blueGreenUpdatePolicy;
    }

    /**
     * <p>
     * Update policy for a blue/green deployment. If this update policy is specified, SageMaker creates a new fleet
     * during the deployment while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the
     * specified traffic routing configuration. Only one update policy should be used in the deployment configuration.
     * If no update policy is specified, SageMaker uses a blue/green deployment strategy with all at once traffic
     * shifting by default.
     * </p>
     * 
     * @param blueGreenUpdatePolicy
     *        Update policy for a blue/green deployment. If this update policy is specified, SageMaker creates a new
     *        fleet during the deployment while maintaining the old fleet. SageMaker flips traffic to the new fleet
     *        according to the specified traffic routing configuration. Only one update policy should be used in the
     *        deployment configuration. If no update policy is specified, SageMaker uses a blue/green deployment
     *        strategy with all at once traffic shifting by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfig withBlueGreenUpdatePolicy(BlueGreenUpdatePolicy blueGreenUpdatePolicy) {
        setBlueGreenUpdatePolicy(blueGreenUpdatePolicy);
        return this;
    }

    /**
     * <p>
     * Automatic rollback configuration for handling endpoint deployment failures and recovery.
     * </p>
     * 
     * @param autoRollbackConfiguration
     *        Automatic rollback configuration for handling endpoint deployment failures and recovery.
     */

    public void setAutoRollbackConfiguration(AutoRollbackConfig autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    /**
     * <p>
     * Automatic rollback configuration for handling endpoint deployment failures and recovery.
     * </p>
     * 
     * @return Automatic rollback configuration for handling endpoint deployment failures and recovery.
     */

    public AutoRollbackConfig getAutoRollbackConfiguration() {
        return this.autoRollbackConfiguration;
    }

    /**
     * <p>
     * Automatic rollback configuration for handling endpoint deployment failures and recovery.
     * </p>
     * 
     * @param autoRollbackConfiguration
     *        Automatic rollback configuration for handling endpoint deployment failures and recovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfig withAutoRollbackConfiguration(AutoRollbackConfig autoRollbackConfiguration) {
        setAutoRollbackConfiguration(autoRollbackConfiguration);
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
        if (getBlueGreenUpdatePolicy() != null)
            sb.append("BlueGreenUpdatePolicy: ").append(getBlueGreenUpdatePolicy()).append(",");
        if (getAutoRollbackConfiguration() != null)
            sb.append("AutoRollbackConfiguration: ").append(getAutoRollbackConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentConfig == false)
            return false;
        DeploymentConfig other = (DeploymentConfig) obj;
        if (other.getBlueGreenUpdatePolicy() == null ^ this.getBlueGreenUpdatePolicy() == null)
            return false;
        if (other.getBlueGreenUpdatePolicy() != null && other.getBlueGreenUpdatePolicy().equals(this.getBlueGreenUpdatePolicy()) == false)
            return false;
        if (other.getAutoRollbackConfiguration() == null ^ this.getAutoRollbackConfiguration() == null)
            return false;
        if (other.getAutoRollbackConfiguration() != null && other.getAutoRollbackConfiguration().equals(this.getAutoRollbackConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueGreenUpdatePolicy() == null) ? 0 : getBlueGreenUpdatePolicy().hashCode());
        hashCode = prime * hashCode + ((getAutoRollbackConfiguration() == null) ? 0 : getAutoRollbackConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentConfig clone() {
        try {
            return (DeploymentConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DeploymentConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
