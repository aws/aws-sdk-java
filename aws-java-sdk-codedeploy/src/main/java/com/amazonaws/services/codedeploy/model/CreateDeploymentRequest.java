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
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#createDeployment(CreateDeploymentRequest) CreateDeployment operation}.
 * <p>
 * Deploys an application revision to the specified deployment group.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#createDeployment(CreateDeploymentRequest)
 */
public class CreateDeploymentRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The deployment group's name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentGroupName;

    /**
     * The type of revision to deploy, along with information about the
     * revision's location.
     */
    private RevisionLocation revision;

    /**
     * The name of an existing deployment configuration within the AWS user
     * account. <p>If not specified, the value configured in the deployment
     * group will be used as the default. If the deployment group does not
     * have a deployment configuration associated with it, then
     * CodeDeployDefault.OneAtATime will be used by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentConfigName;

    /**
     * A comment about the deployment.
     */
    private String description;

    /**
     * If set to true, then if the deployment causes the ApplicationStop
     * deployment lifecycle event to fail to a specific instance, the
     * deployment will not be considered to have failed to that instance at
     * that point and will continue on to the BeforeInstall deployment
     * lifecycle event. <p>If set to false or not specified, then if the
     * deployment causes the ApplicationStop deployment lifecycle event to
     * fail to a specific instance, the deployment will stop to that
     * instance, and the deployment to that instance will be considered to
     * have failed.
     */
    private Boolean ignoreApplicationStopFailures;

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
    public CreateDeploymentRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The deployment group's name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The deployment group's name.
     */
    public String getDeploymentGroupName() {
        return deploymentGroupName;
    }
    
    /**
     * The deployment group's name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName The deployment group's name.
     */
    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }
    
    /**
     * The deployment group's name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName The deployment group's name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentRequest withDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
        return this;
    }

    /**
     * The type of revision to deploy, along with information about the
     * revision's location.
     *
     * @return The type of revision to deploy, along with information about the
     *         revision's location.
     */
    public RevisionLocation getRevision() {
        return revision;
    }
    
    /**
     * The type of revision to deploy, along with information about the
     * revision's location.
     *
     * @param revision The type of revision to deploy, along with information about the
     *         revision's location.
     */
    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }
    
    /**
     * The type of revision to deploy, along with information about the
     * revision's location.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param revision The type of revision to deploy, along with information about the
     *         revision's location.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentRequest withRevision(RevisionLocation revision) {
        this.revision = revision;
        return this;
    }

    /**
     * The name of an existing deployment configuration within the AWS user
     * account. <p>If not specified, the value configured in the deployment
     * group will be used as the default. If the deployment group does not
     * have a deployment configuration associated with it, then
     * CodeDeployDefault.OneAtATime will be used by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of an existing deployment configuration within the AWS user
     *         account. <p>If not specified, the value configured in the deployment
     *         group will be used as the default. If the deployment group does not
     *         have a deployment configuration associated with it, then
     *         CodeDeployDefault.OneAtATime will be used by default.
     */
    public String getDeploymentConfigName() {
        return deploymentConfigName;
    }
    
    /**
     * The name of an existing deployment configuration within the AWS user
     * account. <p>If not specified, the value configured in the deployment
     * group will be used as the default. If the deployment group does not
     * have a deployment configuration associated with it, then
     * CodeDeployDefault.OneAtATime will be used by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName The name of an existing deployment configuration within the AWS user
     *         account. <p>If not specified, the value configured in the deployment
     *         group will be used as the default. If the deployment group does not
     *         have a deployment configuration associated with it, then
     *         CodeDeployDefault.OneAtATime will be used by default.
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }
    
    /**
     * The name of an existing deployment configuration within the AWS user
     * account. <p>If not specified, the value configured in the deployment
     * group will be used as the default. If the deployment group does not
     * have a deployment configuration associated with it, then
     * CodeDeployDefault.OneAtATime will be used by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName The name of an existing deployment configuration within the AWS user
     *         account. <p>If not specified, the value configured in the deployment
     *         group will be used as the default. If the deployment group does not
     *         have a deployment configuration associated with it, then
     *         CodeDeployDefault.OneAtATime will be used by default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentRequest withDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * A comment about the deployment.
     *
     * @return A comment about the deployment.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A comment about the deployment.
     *
     * @param description A comment about the deployment.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A comment about the deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A comment about the deployment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * If set to true, then if the deployment causes the ApplicationStop
     * deployment lifecycle event to fail to a specific instance, the
     * deployment will not be considered to have failed to that instance at
     * that point and will continue on to the BeforeInstall deployment
     * lifecycle event. <p>If set to false or not specified, then if the
     * deployment causes the ApplicationStop deployment lifecycle event to
     * fail to a specific instance, the deployment will stop to that
     * instance, and the deployment to that instance will be considered to
     * have failed.
     *
     * @return If set to true, then if the deployment causes the ApplicationStop
     *         deployment lifecycle event to fail to a specific instance, the
     *         deployment will not be considered to have failed to that instance at
     *         that point and will continue on to the BeforeInstall deployment
     *         lifecycle event. <p>If set to false or not specified, then if the
     *         deployment causes the ApplicationStop deployment lifecycle event to
     *         fail to a specific instance, the deployment will stop to that
     *         instance, and the deployment to that instance will be considered to
     *         have failed.
     */
    public Boolean isIgnoreApplicationStopFailures() {
        return ignoreApplicationStopFailures;
    }
    
    /**
     * If set to true, then if the deployment causes the ApplicationStop
     * deployment lifecycle event to fail to a specific instance, the
     * deployment will not be considered to have failed to that instance at
     * that point and will continue on to the BeforeInstall deployment
     * lifecycle event. <p>If set to false or not specified, then if the
     * deployment causes the ApplicationStop deployment lifecycle event to
     * fail to a specific instance, the deployment will stop to that
     * instance, and the deployment to that instance will be considered to
     * have failed.
     *
     * @param ignoreApplicationStopFailures If set to true, then if the deployment causes the ApplicationStop
     *         deployment lifecycle event to fail to a specific instance, the
     *         deployment will not be considered to have failed to that instance at
     *         that point and will continue on to the BeforeInstall deployment
     *         lifecycle event. <p>If set to false or not specified, then if the
     *         deployment causes the ApplicationStop deployment lifecycle event to
     *         fail to a specific instance, the deployment will stop to that
     *         instance, and the deployment to that instance will be considered to
     *         have failed.
     */
    public void setIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
        this.ignoreApplicationStopFailures = ignoreApplicationStopFailures;
    }
    
    /**
     * If set to true, then if the deployment causes the ApplicationStop
     * deployment lifecycle event to fail to a specific instance, the
     * deployment will not be considered to have failed to that instance at
     * that point and will continue on to the BeforeInstall deployment
     * lifecycle event. <p>If set to false or not specified, then if the
     * deployment causes the ApplicationStop deployment lifecycle event to
     * fail to a specific instance, the deployment will stop to that
     * instance, and the deployment to that instance will be considered to
     * have failed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ignoreApplicationStopFailures If set to true, then if the deployment causes the ApplicationStop
     *         deployment lifecycle event to fail to a specific instance, the
     *         deployment will not be considered to have failed to that instance at
     *         that point and will continue on to the BeforeInstall deployment
     *         lifecycle event. <p>If set to false or not specified, then if the
     *         deployment causes the ApplicationStop deployment lifecycle event to
     *         fail to a specific instance, the deployment will stop to that
     *         instance, and the deployment to that instance will be considered to
     *         have failed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentRequest withIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
        this.ignoreApplicationStopFailures = ignoreApplicationStopFailures;
        return this;
    }

    /**
     * If set to true, then if the deployment causes the ApplicationStop
     * deployment lifecycle event to fail to a specific instance, the
     * deployment will not be considered to have failed to that instance at
     * that point and will continue on to the BeforeInstall deployment
     * lifecycle event. <p>If set to false or not specified, then if the
     * deployment causes the ApplicationStop deployment lifecycle event to
     * fail to a specific instance, the deployment will stop to that
     * instance, and the deployment to that instance will be considered to
     * have failed.
     *
     * @return If set to true, then if the deployment causes the ApplicationStop
     *         deployment lifecycle event to fail to a specific instance, the
     *         deployment will not be considered to have failed to that instance at
     *         that point and will continue on to the BeforeInstall deployment
     *         lifecycle event. <p>If set to false or not specified, then if the
     *         deployment causes the ApplicationStop deployment lifecycle event to
     *         fail to a specific instance, the deployment will stop to that
     *         instance, and the deployment to that instance will be considered to
     *         have failed.
     */
    public Boolean getIgnoreApplicationStopFailures() {
        return ignoreApplicationStopFailures;
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
        if (getDeploymentGroupName() != null) sb.append("DeploymentGroupName: " + getDeploymentGroupName() + ",");
        if (getRevision() != null) sb.append("Revision: " + getRevision() + ",");
        if (getDeploymentConfigName() != null) sb.append("DeploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (isIgnoreApplicationStopFailures() != null) sb.append("IgnoreApplicationStopFailures: " + isIgnoreApplicationStopFailures() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentGroupName() == null) ? 0 : getDeploymentGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((isIgnoreApplicationStopFailures() == null) ? 0 : isIgnoreApplicationStopFailures().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDeploymentRequest == false) return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null) return false;
        if (other.getDeploymentGroupName() != null && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false) return false; 
        if (other.getRevision() == null ^ this.getRevision() == null) return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false) return false; 
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null) return false;
        if (other.getDeploymentConfigName() != null && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.isIgnoreApplicationStopFailures() == null ^ this.isIgnoreApplicationStopFailures() == null) return false;
        if (other.isIgnoreApplicationStopFailures() != null && other.isIgnoreApplicationStopFailures().equals(this.isIgnoreApplicationStopFailures()) == false) return false; 
        return true;
    }
    
}
    