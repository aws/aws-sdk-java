/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a CreateDeploymentConfig operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeploymentConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the deployment configuration to create.
     * </p>
     */
    private String deploymentConfigName;
    /**
     * <p>
     * The minimum number of healthy instances that should be available at any time during the deployment. There are two
     * parameters expected in the input: type and value.
     * </p>
     * <p>
     * The type parameter takes either of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a percentage of the
     * total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the deployment, AWS
     * CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value parameter takes an integer.
     * </p>
     * <p>
     * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a value of 95.
     * </p>
     */
    private MinimumHealthyHosts minimumHealthyHosts;
    /**
     * <p>
     * The configuration that specifies how the deployment traffic is routed.
     * </p>
     */
    private TrafficRoutingConfig trafficRoutingConfig;
    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>&gt;).
     * </p>
     */
    private String computePlatform;

    /**
     * <p>
     * The name of the deployment configuration to create.
     * </p>
     * 
     * @param deploymentConfigName
     *        The name of the deployment configuration to create.
     */

    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * The name of the deployment configuration to create.
     * </p>
     * 
     * @return The name of the deployment configuration to create.
     */

    public String getDeploymentConfigName() {
        return this.deploymentConfigName;
    }

    /**
     * <p>
     * The name of the deployment configuration to create.
     * </p>
     * 
     * @param deploymentConfigName
     *        The name of the deployment configuration to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentConfigRequest withDeploymentConfigName(String deploymentConfigName) {
        setDeploymentConfigName(deploymentConfigName);
        return this;
    }

    /**
     * <p>
     * The minimum number of healthy instances that should be available at any time during the deployment. There are two
     * parameters expected in the input: type and value.
     * </p>
     * <p>
     * The type parameter takes either of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a percentage of the
     * total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the deployment, AWS
     * CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value parameter takes an integer.
     * </p>
     * <p>
     * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a value of 95.
     * </p>
     * 
     * @param minimumHealthyHosts
     *        The minimum number of healthy instances that should be available at any time during the deployment. There
     *        are two parameters expected in the input: type and value.</p>
     *        <p>
     *        The type parameter takes either of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        HOST_COUNT: The value parameter represents the minimum number of healthy instances as an absolute value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a percentage of
     *        the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the
     *        deployment, AWS CodeDeploy converts the percentage to the equivalent number of instance and rounds up
     *        fractional instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The value parameter takes an integer.
     *        </p>
     *        <p>
     *        For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a value of 95.
     */

    public void setMinimumHealthyHosts(MinimumHealthyHosts minimumHealthyHosts) {
        this.minimumHealthyHosts = minimumHealthyHosts;
    }

    /**
     * <p>
     * The minimum number of healthy instances that should be available at any time during the deployment. There are two
     * parameters expected in the input: type and value.
     * </p>
     * <p>
     * The type parameter takes either of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a percentage of the
     * total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the deployment, AWS
     * CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value parameter takes an integer.
     * </p>
     * <p>
     * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a value of 95.
     * </p>
     * 
     * @return The minimum number of healthy instances that should be available at any time during the deployment. There
     *         are two parameters expected in the input: type and value.</p>
     *         <p>
     *         The type parameter takes either of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         HOST_COUNT: The value parameter represents the minimum number of healthy instances as an absolute value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a percentage of
     *         the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the
     *         deployment, AWS CodeDeploy converts the percentage to the equivalent number of instance and rounds up
     *         fractional instances.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The value parameter takes an integer.
     *         </p>
     *         <p>
     *         For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a value of 95.
     */

    public MinimumHealthyHosts getMinimumHealthyHosts() {
        return this.minimumHealthyHosts;
    }

    /**
     * <p>
     * The minimum number of healthy instances that should be available at any time during the deployment. There are two
     * parameters expected in the input: type and value.
     * </p>
     * <p>
     * The type parameter takes either of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a percentage of the
     * total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the deployment, AWS
     * CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value parameter takes an integer.
     * </p>
     * <p>
     * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a value of 95.
     * </p>
     * 
     * @param minimumHealthyHosts
     *        The minimum number of healthy instances that should be available at any time during the deployment. There
     *        are two parameters expected in the input: type and value.</p>
     *        <p>
     *        The type parameter takes either of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        HOST_COUNT: The value parameter represents the minimum number of healthy instances as an absolute value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a percentage of
     *        the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the
     *        deployment, AWS CodeDeploy converts the percentage to the equivalent number of instance and rounds up
     *        fractional instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The value parameter takes an integer.
     *        </p>
     *        <p>
     *        For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a value of 95.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentConfigRequest withMinimumHealthyHosts(MinimumHealthyHosts minimumHealthyHosts) {
        setMinimumHealthyHosts(minimumHealthyHosts);
        return this;
    }

    /**
     * <p>
     * The configuration that specifies how the deployment traffic is routed.
     * </p>
     * 
     * @param trafficRoutingConfig
     *        The configuration that specifies how the deployment traffic is routed.
     */

    public void setTrafficRoutingConfig(TrafficRoutingConfig trafficRoutingConfig) {
        this.trafficRoutingConfig = trafficRoutingConfig;
    }

    /**
     * <p>
     * The configuration that specifies how the deployment traffic is routed.
     * </p>
     * 
     * @return The configuration that specifies how the deployment traffic is routed.
     */

    public TrafficRoutingConfig getTrafficRoutingConfig() {
        return this.trafficRoutingConfig;
    }

    /**
     * <p>
     * The configuration that specifies how the deployment traffic is routed.
     * </p>
     * 
     * @param trafficRoutingConfig
     *        The configuration that specifies how the deployment traffic is routed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentConfigRequest withTrafficRoutingConfig(TrafficRoutingConfig trafficRoutingConfig) {
        setTrafficRoutingConfig(trafficRoutingConfig);
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>&gt;).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>&gt;).
     * @see ComputePlatform
     */

    public void setComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>&gt;).
     * </p>
     * 
     * @return The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>&gt;).
     * @see ComputePlatform
     */

    public String getComputePlatform() {
        return this.computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>&gt;).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>&gt;).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public CreateDeploymentConfigRequest withComputePlatform(String computePlatform) {
        setComputePlatform(computePlatform);
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>&gt;).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>&gt;).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public CreateDeploymentConfigRequest withComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
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
        if (getDeploymentConfigName() != null)
            sb.append("DeploymentConfigName: ").append(getDeploymentConfigName()).append(",");
        if (getMinimumHealthyHosts() != null)
            sb.append("MinimumHealthyHosts: ").append(getMinimumHealthyHosts()).append(",");
        if (getTrafficRoutingConfig() != null)
            sb.append("TrafficRoutingConfig: ").append(getTrafficRoutingConfig()).append(",");
        if (getComputePlatform() != null)
            sb.append("ComputePlatform: ").append(getComputePlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentConfigRequest == false)
            return false;
        CreateDeploymentConfigRequest other = (CreateDeploymentConfigRequest) obj;
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false)
            return false;
        if (other.getMinimumHealthyHosts() == null ^ this.getMinimumHealthyHosts() == null)
            return false;
        if (other.getMinimumHealthyHosts() != null && other.getMinimumHealthyHosts().equals(this.getMinimumHealthyHosts()) == false)
            return false;
        if (other.getTrafficRoutingConfig() == null ^ this.getTrafficRoutingConfig() == null)
            return false;
        if (other.getTrafficRoutingConfig() != null && other.getTrafficRoutingConfig().equals(this.getTrafficRoutingConfig()) == false)
            return false;
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null && other.getComputePlatform().equals(this.getComputePlatform()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode());
        hashCode = prime * hashCode + ((getMinimumHealthyHosts() == null) ? 0 : getMinimumHealthyHosts().hashCode());
        hashCode = prime * hashCode + ((getTrafficRoutingConfig() == null) ? 0 : getTrafficRoutingConfig().hashCode());
        hashCode = prime * hashCode + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentConfigRequest clone() {
        return (CreateDeploymentConfigRequest) super.clone();
    }

}
