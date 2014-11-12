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
 * Represents the output of a list deployment groups operation.
 * </p>
 */
public class ListDeploymentGroupsResult implements Serializable {

    /**
     * The application name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * A list of corresponding deployment group names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentGroups;

    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list deployment groups call to return the next set of deployment
     * groups in the list.
     */
    private String nextToken;

    /**
     * The application name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The application name.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The application name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The application name.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The application name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The application name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentGroupsResult withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * A list of corresponding deployment group names.
     *
     * @return A list of corresponding deployment group names.
     */
    public java.util.List<String> getDeploymentGroups() {
        if (deploymentGroups == null) {
              deploymentGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              deploymentGroups.setAutoConstruct(true);
        }
        return deploymentGroups;
    }
    
    /**
     * A list of corresponding deployment group names.
     *
     * @param deploymentGroups A list of corresponding deployment group names.
     */
    public void setDeploymentGroups(java.util.Collection<String> deploymentGroups) {
        if (deploymentGroups == null) {
            this.deploymentGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(deploymentGroups.size());
        deploymentGroupsCopy.addAll(deploymentGroups);
        this.deploymentGroups = deploymentGroupsCopy;
    }
    
    /**
     * A list of corresponding deployment group names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentGroups A list of corresponding deployment group names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentGroupsResult withDeploymentGroups(String... deploymentGroups) {
        if (getDeploymentGroups() == null) setDeploymentGroups(new java.util.ArrayList<String>(deploymentGroups.length));
        for (String value : deploymentGroups) {
            getDeploymentGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of corresponding deployment group names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentGroups A list of corresponding deployment group names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentGroupsResult withDeploymentGroups(java.util.Collection<String> deploymentGroups) {
        if (deploymentGroups == null) {
            this.deploymentGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(deploymentGroups.size());
            deploymentGroupsCopy.addAll(deploymentGroups);
            this.deploymentGroups = deploymentGroupsCopy;
        }

        return this;
    }

    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list deployment groups call to return the next set of deployment
     * groups in the list.
     *
     * @return If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list deployment groups call to return the next set of deployment
     *         groups in the list.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list deployment groups call to return the next set of deployment
     * groups in the list.
     *
     * @param nextToken If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list deployment groups call to return the next set of deployment
     *         groups in the list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list deployment groups call to return the next set of deployment
     * groups in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list deployment groups call to return the next set of deployment
     *         groups in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentGroupsResult withNextToken(String nextToken) {
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
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDeploymentGroups() != null) sb.append("DeploymentGroups: " + getDeploymentGroups() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentGroups() == null) ? 0 : getDeploymentGroups().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDeploymentGroupsResult == false) return false;
        ListDeploymentGroupsResult other = (ListDeploymentGroupsResult)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getDeploymentGroups() == null ^ this.getDeploymentGroups() == null) return false;
        if (other.getDeploymentGroups() != null && other.getDeploymentGroups().equals(this.getDeploymentGroups()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    