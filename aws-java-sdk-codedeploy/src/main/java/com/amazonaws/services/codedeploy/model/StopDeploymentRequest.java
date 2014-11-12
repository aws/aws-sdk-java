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
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#stopDeployment(StopDeploymentRequest) StopDeployment operation}.
 * <p>
 * Attempts to stop an ongoing deployment.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#stopDeployment(StopDeploymentRequest)
 */
public class StopDeploymentRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique ID of a deployment.
     */
    private String deploymentId;

    /**
     * The unique ID of a deployment.
     *
     * @return The unique ID of a deployment.
     */
    public String getDeploymentId() {
        return deploymentId;
    }
    
    /**
     * The unique ID of a deployment.
     *
     * @param deploymentId The unique ID of a deployment.
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }
    
    /**
     * The unique ID of a deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentId The unique ID of a deployment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StopDeploymentRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
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
        if (getDeploymentId() != null) sb.append("DeploymentId: " + getDeploymentId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StopDeploymentRequest == false) return false;
        StopDeploymentRequest other = (StopDeploymentRequest)obj;
        
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null) return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false) return false; 
        return true;
    }
    
}
    