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
 * Represents the output of a list deployment configurations operation.
 * </p>
 */
public class ListDeploymentConfigsResult implements Serializable {

    /**
     * A list of deployment configurations, including the built-in
     * configurations such as CodeDeployDefault.OneAtATime.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentConfigsList;

    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list deployment configurations call to return the next set of
     * deployment configurations in the list.
     */
    private String nextToken;

    /**
     * A list of deployment configurations, including the built-in
     * configurations such as CodeDeployDefault.OneAtATime.
     *
     * @return A list of deployment configurations, including the built-in
     *         configurations such as CodeDeployDefault.OneAtATime.
     */
    public java.util.List<String> getDeploymentConfigsList() {
        if (deploymentConfigsList == null) {
              deploymentConfigsList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              deploymentConfigsList.setAutoConstruct(true);
        }
        return deploymentConfigsList;
    }
    
    /**
     * A list of deployment configurations, including the built-in
     * configurations such as CodeDeployDefault.OneAtATime.
     *
     * @param deploymentConfigsList A list of deployment configurations, including the built-in
     *         configurations such as CodeDeployDefault.OneAtATime.
     */
    public void setDeploymentConfigsList(java.util.Collection<String> deploymentConfigsList) {
        if (deploymentConfigsList == null) {
            this.deploymentConfigsList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentConfigsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(deploymentConfigsList.size());
        deploymentConfigsListCopy.addAll(deploymentConfigsList);
        this.deploymentConfigsList = deploymentConfigsListCopy;
    }
    
    /**
     * A list of deployment configurations, including the built-in
     * configurations such as CodeDeployDefault.OneAtATime.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentConfigsList A list of deployment configurations, including the built-in
     *         configurations such as CodeDeployDefault.OneAtATime.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentConfigsResult withDeploymentConfigsList(String... deploymentConfigsList) {
        if (getDeploymentConfigsList() == null) setDeploymentConfigsList(new java.util.ArrayList<String>(deploymentConfigsList.length));
        for (String value : deploymentConfigsList) {
            getDeploymentConfigsList().add(value);
        }
        return this;
    }
    
    /**
     * A list of deployment configurations, including the built-in
     * configurations such as CodeDeployDefault.OneAtATime.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentConfigsList A list of deployment configurations, including the built-in
     *         configurations such as CodeDeployDefault.OneAtATime.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentConfigsResult withDeploymentConfigsList(java.util.Collection<String> deploymentConfigsList) {
        if (deploymentConfigsList == null) {
            this.deploymentConfigsList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentConfigsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(deploymentConfigsList.size());
            deploymentConfigsListCopy.addAll(deploymentConfigsList);
            this.deploymentConfigsList = deploymentConfigsListCopy;
        }

        return this;
    }

    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list deployment configurations call to return the next set of
     * deployment configurations in the list.
     *
     * @return If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list deployment configurations call to return the next set of
     *         deployment configurations in the list.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list deployment configurations call to return the next set of
     * deployment configurations in the list.
     *
     * @param nextToken If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list deployment configurations call to return the next set of
     *         deployment configurations in the list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list deployment configurations call to return the next set of
     * deployment configurations in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list deployment configurations call to return the next set of
     *         deployment configurations in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentConfigsResult withNextToken(String nextToken) {
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
        if (getDeploymentConfigsList() != null) sb.append("DeploymentConfigsList: " + getDeploymentConfigsList() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeploymentConfigsList() == null) ? 0 : getDeploymentConfigsList().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDeploymentConfigsResult == false) return false;
        ListDeploymentConfigsResult other = (ListDeploymentConfigsResult)obj;
        
        if (other.getDeploymentConfigsList() == null ^ this.getDeploymentConfigsList() == null) return false;
        if (other.getDeploymentConfigsList() != null && other.getDeploymentConfigsList().equals(this.getDeploymentConfigsList()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    