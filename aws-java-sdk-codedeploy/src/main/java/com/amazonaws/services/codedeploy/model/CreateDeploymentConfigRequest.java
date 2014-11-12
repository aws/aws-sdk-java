/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#createDeploymentConfig(CreateDeploymentConfigRequest) CreateDeploymentConfig operation}.
 * <p>
 * Creates a new deployment configuration.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#createDeploymentConfig(CreateDeploymentConfigRequest)
 */
public class CreateDeploymentConfigRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the deployment configuration to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentConfigName;

    /**
     * The minimum number of healthy instances that should be available at
     * any time during the deployment. There are two parameters expected in
     * the input: type and value. <p>The type parameter takes either of the
     * following values: <ul> <li>HOST_COUNT: The value parameter represents
     * the minimum number of healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The value parameter represents the minimum number
     * of healthy instances, as a percentage of the total number of instances
     * in the deployment. If you specify FLEET_PERCENT, then at the start of
     * the deployment AWS CodeDeploy converts the percentage to the
     * equivalent number of instances and rounds fractional instances
     * up.</li> </ul> <p>The value parameter takes an integer. <p>For
     * example, to set a minimum of 95% healthy instances, specify a type of
     * FLEET_PERCENT and a value of 95.
     */
    private MinimumHealthyHosts minimumHealthyHosts;

    /**
     * The name of the deployment configuration to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the deployment configuration to create.
     */
    public String getDeploymentConfigName() {
        return deploymentConfigName;
    }
    
    /**
     * The name of the deployment configuration to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName The name of the deployment configuration to create.
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }
    
    /**
     * The name of the deployment configuration to create.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName The name of the deployment configuration to create.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentConfigRequest withDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * The minimum number of healthy instances that should be available at
     * any time during the deployment. There are two parameters expected in
     * the input: type and value. <p>The type parameter takes either of the
     * following values: <ul> <li>HOST_COUNT: The value parameter represents
     * the minimum number of healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The value parameter represents the minimum number
     * of healthy instances, as a percentage of the total number of instances
     * in the deployment. If you specify FLEET_PERCENT, then at the start of
     * the deployment AWS CodeDeploy converts the percentage to the
     * equivalent number of instances and rounds fractional instances
     * up.</li> </ul> <p>The value parameter takes an integer. <p>For
     * example, to set a minimum of 95% healthy instances, specify a type of
     * FLEET_PERCENT and a value of 95.
     *
     * @return The minimum number of healthy instances that should be available at
     *         any time during the deployment. There are two parameters expected in
     *         the input: type and value. <p>The type parameter takes either of the
     *         following values: <ul> <li>HOST_COUNT: The value parameter represents
     *         the minimum number of healthy instances, as an absolute value.</li>
     *         <li>FLEET_PERCENT: The value parameter represents the minimum number
     *         of healthy instances, as a percentage of the total number of instances
     *         in the deployment. If you specify FLEET_PERCENT, then at the start of
     *         the deployment AWS CodeDeploy converts the percentage to the
     *         equivalent number of instances and rounds fractional instances
     *         up.</li> </ul> <p>The value parameter takes an integer. <p>For
     *         example, to set a minimum of 95% healthy instances, specify a type of
     *         FLEET_PERCENT and a value of 95.
     */
    public MinimumHealthyHosts getMinimumHealthyHosts() {
        return minimumHealthyHosts;
    }
    
    /**
     * The minimum number of healthy instances that should be available at
     * any time during the deployment. There are two parameters expected in
     * the input: type and value. <p>The type parameter takes either of the
     * following values: <ul> <li>HOST_COUNT: The value parameter represents
     * the minimum number of healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The value parameter represents the minimum number
     * of healthy instances, as a percentage of the total number of instances
     * in the deployment. If you specify FLEET_PERCENT, then at the start of
     * the deployment AWS CodeDeploy converts the percentage to the
     * equivalent number of instances and rounds fractional instances
     * up.</li> </ul> <p>The value parameter takes an integer. <p>For
     * example, to set a minimum of 95% healthy instances, specify a type of
     * FLEET_PERCENT and a value of 95.
     *
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available at
     *         any time during the deployment. There are two parameters expected in
     *         the input: type and value. <p>The type parameter takes either of the
     *         following values: <ul> <li>HOST_COUNT: The value parameter represents
     *         the minimum number of healthy instances, as an absolute value.</li>
     *         <li>FLEET_PERCENT: The value parameter represents the minimum number
     *         of healthy instances, as a percentage of the total number of instances
     *         in the deployment. If you specify FLEET_PERCENT, then at the start of
     *         the deployment AWS CodeDeploy converts the percentage to the
     *         equivalent number of instances and rounds fractional instances
     *         up.</li> </ul> <p>The value parameter takes an integer. <p>For
     *         example, to set a minimum of 95% healthy instances, specify a type of
     *         FLEET_PERCENT and a value of 95.
     */
    public void setMinimumHealthyHosts(MinimumHealthyHosts minimumHealthyHosts) {
        this.minimumHealthyHosts = minimumHealthyHosts;
    }
    
    /**
     * The minimum number of healthy instances that should be available at
     * any time during the deployment. There are two parameters expected in
     * the input: type and value. <p>The type parameter takes either of the
     * following values: <ul> <li>HOST_COUNT: The value parameter represents
     * the minimum number of healthy instances, as an absolute value.</li>
     * <li>FLEET_PERCENT: The value parameter represents the minimum number
     * of healthy instances, as a percentage of the total number of instances
     * in the deployment. If you specify FLEET_PERCENT, then at the start of
     * the deployment AWS CodeDeploy converts the percentage to the
     * equivalent number of instances and rounds fractional instances
     * up.</li> </ul> <p>The value parameter takes an integer. <p>For
     * example, to set a minimum of 95% healthy instances, specify a type of
     * FLEET_PERCENT and a value of 95.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available at
     *         any time during the deployment. There are two parameters expected in
     *         the input: type and value. <p>The type parameter takes either of the
     *         following values: <ul> <li>HOST_COUNT: The value parameter represents
     *         the minimum number of healthy instances, as an absolute value.</li>
     *         <li>FLEET_PERCENT: The value parameter represents the minimum number
     *         of healthy instances, as a percentage of the total number of instances
     *         in the deployment. If you specify FLEET_PERCENT, then at the start of
     *         the deployment AWS CodeDeploy converts the percentage to the
     *         equivalent number of instances and rounds fractional instances
     *         up.</li> </ul> <p>The value parameter takes an integer. <p>For
     *         example, to set a minimum of 95% healthy instances, specify a type of
     *         FLEET_PERCENT and a value of 95.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentConfigRequest withMinimumHealthyHosts(MinimumHealthyHosts minimumHealthyHosts) {
        this.minimumHealthyHosts = minimumHealthyHosts;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeploymentConfigName() != null) sb.append("DeploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getMinimumHealthyHosts() != null) sb.append("MinimumHealthyHosts: " + getMinimumHealthyHosts() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode()); 
        hashCode = prime * hashCode + ((getMinimumHealthyHosts() == null) ? 0 : getMinimumHealthyHosts().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDeploymentConfigRequest == false) return false;
        CreateDeploymentConfigRequest other = (CreateDeploymentConfigRequest)obj;
        
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null) return false;
        if (other.getDeploymentConfigName() != null && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false) return false; 
        if (other.getMinimumHealthyHosts() == null ^ this.getMinimumHealthyHosts() == null) return false;
        if (other.getMinimumHealthyHosts() != null && other.getMinimumHealthyHosts().equals(this.getMinimumHealthyHosts()) == false) return false; 
        return true;
    }
    
}
    