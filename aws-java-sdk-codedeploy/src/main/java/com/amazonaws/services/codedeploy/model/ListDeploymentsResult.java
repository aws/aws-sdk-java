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

/**
 * <p>
 * Represents the output of a list deployments operation.
 * </p>
 */
public class ListDeploymentsResult implements Serializable {

    /**
     * A list of deployment IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> deployments;

    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list deployments call to return the next set of deployments in the
     * list.
     */
    private String nextToken;

    /**
     * A list of deployment IDs.
     *
     * @return A list of deployment IDs.
     */
    public java.util.List<String> getDeployments() {
        if (deployments == null) {
              deployments = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              deployments.setAutoConstruct(true);
        }
        return deployments;
    }
    
    /**
     * A list of deployment IDs.
     *
     * @param deployments A list of deployment IDs.
     */
    public void setDeployments(java.util.Collection<String> deployments) {
        if (deployments == null) {
            this.deployments = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(deployments.size());
        deploymentsCopy.addAll(deployments);
        this.deployments = deploymentsCopy;
    }
    
    /**
     * A list of deployment IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deployments A list of deployment IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentsResult withDeployments(String... deployments) {
        if (getDeployments() == null) setDeployments(new java.util.ArrayList<String>(deployments.length));
        for (String value : deployments) {
            getDeployments().add(value);
        }
        return this;
    }
    
    /**
     * A list of deployment IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deployments A list of deployment IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentsResult withDeployments(java.util.Collection<String> deployments) {
        if (deployments == null) {
            this.deployments = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(deployments.size());
            deploymentsCopy.addAll(deployments);
            this.deployments = deploymentsCopy;
        }

        return this;
    }

    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list deployments call to return the next set of deployments in the
     * list.
     *
     * @return If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list deployments call to return the next set of deployments in the
     *         list.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list deployments call to return the next set of deployments in the
     * list.
     *
     * @param nextToken If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list deployments call to return the next set of deployments in the
     *         list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list deployments call to return the next set of deployments in the
     * list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list deployments call to return the next set of deployments in the
     *         list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDeployments() != null) sb.append("Deployments: " + getDeployments() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeployments() == null) ? 0 : getDeployments().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDeploymentsResult == false) return false;
        ListDeploymentsResult other = (ListDeploymentsResult)obj;
        
        if (other.getDeployments() == null ^ this.getDeployments() == null) return false;
        if (other.getDeployments() != null && other.getDeployments().equals(this.getDeployments()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    