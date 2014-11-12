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
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#deleteDeploymentGroup(DeleteDeploymentGroupRequest) DeleteDeploymentGroup operation}.
 * <p>
 * Deletes a deployment group.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#deleteDeploymentGroup(DeleteDeploymentGroupRequest)
 */
public class DeleteDeploymentGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The name of an existing deployment group for the specified
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentGroupName;

    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteDeploymentGroupRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The name of an existing deployment group for the specified
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of an existing deployment group for the specified
     *         application.
     */
    public String getDeploymentGroupName() {
        return deploymentGroupName;
    }
    
    /**
     * The name of an existing deployment group for the specified
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName The name of an existing deployment group for the specified
     *         application.
     */
    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }
    
    /**
     * The name of an existing deployment group for the specified
     * application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName The name of an existing deployment group for the specified
     *         application.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteDeploymentGroupRequest withDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
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
        if (getDeploymentGroupName() != null) sb.append("DeploymentGroupName: " + getDeploymentGroupName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentGroupName() == null) ? 0 : getDeploymentGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteDeploymentGroupRequest == false) return false;
        DeleteDeploymentGroupRequest other = (DeleteDeploymentGroupRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null) return false;
        if (other.getDeploymentGroupName() != null && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false) return false; 
        return true;
    }
    
}
    