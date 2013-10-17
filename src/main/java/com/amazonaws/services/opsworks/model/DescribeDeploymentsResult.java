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


/**
 * <p>
 * Contains the response to a <code>DescribeDeployments</code> request.
 * </p>
 */
public class DescribeDeploymentsResult implements Serializable {

    /**
     * An array of <code>Deployment</code> objects that describe the
     * deployments.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Deployment> deployments;

    /**
     * An array of <code>Deployment</code> objects that describe the
     * deployments.
     *
     * @return An array of <code>Deployment</code> objects that describe the
     *         deployments.
     */
    public java.util.List<Deployment> getDeployments() {
        if (deployments == null) {
              deployments = new com.amazonaws.internal.ListWithAutoConstructFlag<Deployment>();
              deployments.setAutoConstruct(true);
        }
        return deployments;
    }
    
    /**
     * An array of <code>Deployment</code> objects that describe the
     * deployments.
     *
     * @param deployments An array of <code>Deployment</code> objects that describe the
     *         deployments.
     */
    public void setDeployments(java.util.Collection<Deployment> deployments) {
        if (deployments == null) {
            this.deployments = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Deployment> deploymentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Deployment>(deployments.size());
        deploymentsCopy.addAll(deployments);
        this.deployments = deploymentsCopy;
    }
    
    /**
     * An array of <code>Deployment</code> objects that describe the
     * deployments.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deployments An array of <code>Deployment</code> objects that describe the
     *         deployments.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDeploymentsResult withDeployments(Deployment... deployments) {
        if (getDeployments() == null) setDeployments(new java.util.ArrayList<Deployment>(deployments.length));
        for (Deployment value : deployments) {
            getDeployments().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>Deployment</code> objects that describe the
     * deployments.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deployments An array of <code>Deployment</code> objects that describe the
     *         deployments.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDeploymentsResult withDeployments(java.util.Collection<Deployment> deployments) {
        if (deployments == null) {
            this.deployments = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Deployment> deploymentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Deployment>(deployments.size());
            deploymentsCopy.addAll(deployments);
            this.deployments = deploymentsCopy;
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
        if (getDeployments() != null) sb.append("Deployments: " + getDeployments() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeployments() == null) ? 0 : getDeployments().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDeploymentsResult == false) return false;
        DescribeDeploymentsResult other = (DescribeDeploymentsResult)obj;
        
        if (other.getDeployments() == null ^ this.getDeployments() == null) return false;
        if (other.getDeployments() != null && other.getDeployments().equals(this.getDeployments()) == false) return false; 
        return true;
    }
    
}
    