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
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#batchGetDeployments(BatchGetDeploymentsRequest) BatchGetDeployments operation}.
 * <p>
 * Gets information about one or more deployments.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#batchGetDeployments(BatchGetDeploymentsRequest)
 */
public class BatchGetDeploymentsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A list of deployment IDs, with multiple deployment IDs separated by
     * spaces.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentIds;

    /**
     * A list of deployment IDs, with multiple deployment IDs separated by
     * spaces.
     *
     * @return A list of deployment IDs, with multiple deployment IDs separated by
     *         spaces.
     */
    public java.util.List<String> getDeploymentIds() {
        if (deploymentIds == null) {
              deploymentIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              deploymentIds.setAutoConstruct(true);
        }
        return deploymentIds;
    }
    
    /**
     * A list of deployment IDs, with multiple deployment IDs separated by
     * spaces.
     *
     * @param deploymentIds A list of deployment IDs, with multiple deployment IDs separated by
     *         spaces.
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
     * A list of deployment IDs, with multiple deployment IDs separated by
     * spaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentIds A list of deployment IDs, with multiple deployment IDs separated by
     *         spaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BatchGetDeploymentsRequest withDeploymentIds(String... deploymentIds) {
        if (getDeploymentIds() == null) setDeploymentIds(new java.util.ArrayList<String>(deploymentIds.length));
        for (String value : deploymentIds) {
            getDeploymentIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of deployment IDs, with multiple deployment IDs separated by
     * spaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentIds A list of deployment IDs, with multiple deployment IDs separated by
     *         spaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BatchGetDeploymentsRequest withDeploymentIds(java.util.Collection<String> deploymentIds) {
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
        if (getDeploymentIds() != null) sb.append("DeploymentIds: " + getDeploymentIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeploymentIds() == null) ? 0 : getDeploymentIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BatchGetDeploymentsRequest == false) return false;
        BatchGetDeploymentsRequest other = (BatchGetDeploymentsRequest)obj;
        
        if (other.getDeploymentIds() == null ^ this.getDeploymentIds() == null) return false;
        if (other.getDeploymentIds() != null && other.getDeploymentIds().equals(this.getDeploymentIds()) == false) return false; 
        return true;
    }
    
}
    