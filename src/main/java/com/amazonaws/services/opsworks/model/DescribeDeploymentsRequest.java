/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeDeployments(DescribeDeploymentsRequest) DescribeDeployments operation}.
 * <p>
 * Requests a description of a specified set of deployments.
 * </p>
 * <p>
 * <b>NOTE:</b>You must specify at least one of the parameters.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeDeployments(DescribeDeploymentsRequest)
 */
public class DescribeDeploymentsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The stack ID. If you include this parameter,
     * <code>DescribeDeployments</code> returns a description of the commands
     * associated with the specified stack.
     */
    private String stackId;

    /**
     * The app ID. If you include this parameter,
     * <code>DescribeDeployments</code> returns a description of the commands
     * associated with the specified app.
     */
    private String appId;

    /**
     * An array of deployment IDs to be described. If you include this
     * parameter, <code>DescribeDeployments</code> returns a description of
     * the specified deployments. Otherwise, it returns a description of
     * every deployment.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentIds;

    /**
     * The stack ID. If you include this parameter,
     * <code>DescribeDeployments</code> returns a description of the commands
     * associated with the specified stack.
     *
     * @return The stack ID. If you include this parameter,
     *         <code>DescribeDeployments</code> returns a description of the commands
     *         associated with the specified stack.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID. If you include this parameter,
     * <code>DescribeDeployments</code> returns a description of the commands
     * associated with the specified stack.
     *
     * @param stackId The stack ID. If you include this parameter,
     *         <code>DescribeDeployments</code> returns a description of the commands
     *         associated with the specified stack.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID. If you include this parameter,
     * <code>DescribeDeployments</code> returns a description of the commands
     * associated with the specified stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID. If you include this parameter,
     *         <code>DescribeDeployments</code> returns a description of the commands
     *         associated with the specified stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDeploymentsRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The app ID. If you include this parameter,
     * <code>DescribeDeployments</code> returns a description of the commands
     * associated with the specified app.
     *
     * @return The app ID. If you include this parameter,
     *         <code>DescribeDeployments</code> returns a description of the commands
     *         associated with the specified app.
     */
    public String getAppId() {
        return appId;
    }
    
    /**
     * The app ID. If you include this parameter,
     * <code>DescribeDeployments</code> returns a description of the commands
     * associated with the specified app.
     *
     * @param appId The app ID. If you include this parameter,
     *         <code>DescribeDeployments</code> returns a description of the commands
     *         associated with the specified app.
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }
    
    /**
     * The app ID. If you include this parameter,
     * <code>DescribeDeployments</code> returns a description of the commands
     * associated with the specified app.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appId The app ID. If you include this parameter,
     *         <code>DescribeDeployments</code> returns a description of the commands
     *         associated with the specified app.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDeploymentsRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * An array of deployment IDs to be described. If you include this
     * parameter, <code>DescribeDeployments</code> returns a description of
     * the specified deployments. Otherwise, it returns a description of
     * every deployment.
     *
     * @return An array of deployment IDs to be described. If you include this
     *         parameter, <code>DescribeDeployments</code> returns a description of
     *         the specified deployments. Otherwise, it returns a description of
     *         every deployment.
     */
    public java.util.List<String> getDeploymentIds() {
        if (deploymentIds == null) {
              deploymentIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              deploymentIds.setAutoConstruct(true);
        }
        return deploymentIds;
    }
    
    /**
     * An array of deployment IDs to be described. If you include this
     * parameter, <code>DescribeDeployments</code> returns a description of
     * the specified deployments. Otherwise, it returns a description of
     * every deployment.
     *
     * @param deploymentIds An array of deployment IDs to be described. If you include this
     *         parameter, <code>DescribeDeployments</code> returns a description of
     *         the specified deployments. Otherwise, it returns a description of
     *         every deployment.
     */
    public void setDeploymentIds(java.util.Collection<String> deploymentIds) {
        if (deploymentIds == null) {
            this.deploymentIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(deploymentIds.size());
        deploymentIdsCopy.addAll(deploymentIds);
        this.deploymentIds = deploymentIdsCopy;
    }
    
    /**
     * An array of deployment IDs to be described. If you include this
     * parameter, <code>DescribeDeployments</code> returns a description of
     * the specified deployments. Otherwise, it returns a description of
     * every deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentIds An array of deployment IDs to be described. If you include this
     *         parameter, <code>DescribeDeployments</code> returns a description of
     *         the specified deployments. Otherwise, it returns a description of
     *         every deployment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDeploymentsRequest withDeploymentIds(String... deploymentIds) {
        if (getDeploymentIds() == null) setDeploymentIds(new java.util.ArrayList<String>(deploymentIds.length));
        for (String value : deploymentIds) {
            getDeploymentIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of deployment IDs to be described. If you include this
     * parameter, <code>DescribeDeployments</code> returns a description of
     * the specified deployments. Otherwise, it returns a description of
     * every deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentIds An array of deployment IDs to be described. If you include this
     *         parameter, <code>DescribeDeployments</code> returns a description of
     *         the specified deployments. Otherwise, it returns a description of
     *         every deployment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDeploymentsRequest withDeploymentIds(java.util.Collection<String> deploymentIds) {
        if (deploymentIds == null) {
            this.deploymentIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(deploymentIds.size());
            deploymentIdsCopy.addAll(deploymentIds);
            this.deploymentIds = deploymentIdsCopy;
        }

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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getAppId() != null) sb.append("AppId: " + getAppId() + ",");
        if (getDeploymentIds() != null) sb.append("DeploymentIds: " + getDeploymentIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentIds() == null) ? 0 : getDeploymentIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDeploymentsRequest == false) return false;
        DescribeDeploymentsRequest other = (DescribeDeploymentsRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getAppId() == null ^ this.getAppId() == null) return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false) return false; 
        if (other.getDeploymentIds() == null ^ this.getDeploymentIds() == null) return false;
        if (other.getDeploymentIds() != null && other.getDeploymentIds().equals(this.getDeploymentIds()) == false) return false; 
        return true;
    }
    
}
    