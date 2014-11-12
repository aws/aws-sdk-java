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
 * Information about a deployment group.
 * </p>
 */
public class DeploymentGroupInfo implements Serializable {

    /**
     * The application name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The deployment group ID.
     */
    private String deploymentGroupId;

    /**
     * The deployment group name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentGroupName;

    /**
     * The deployment configuration name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentConfigName;

    /**
     * The Amazon EC2 tags to filter on.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter> ec2TagFilters;

    /**
     * A list of associated Auto Scaling groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AutoScalingGroup> autoScalingGroups;

    /**
     * A service role ARN.
     */
    private String serviceRoleArn;

    /**
     * Information about the deployment group's target revision, including
     * the revision's type and its location.
     */
    private RevisionLocation targetRevision;

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
    public DeploymentGroupInfo withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The deployment group ID.
     *
     * @return The deployment group ID.
     */
    public String getDeploymentGroupId() {
        return deploymentGroupId;
    }
    
    /**
     * The deployment group ID.
     *
     * @param deploymentGroupId The deployment group ID.
     */
    public void setDeploymentGroupId(String deploymentGroupId) {
        this.deploymentGroupId = deploymentGroupId;
    }
    
    /**
     * The deployment group ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentGroupId The deployment group ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentGroupInfo withDeploymentGroupId(String deploymentGroupId) {
        this.deploymentGroupId = deploymentGroupId;
        return this;
    }

    /**
     * The deployment group name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The deployment group name.
     */
    public String getDeploymentGroupName() {
        return deploymentGroupName;
    }
    
    /**
     * The deployment group name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName The deployment group name.
     */
    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }
    
    /**
     * The deployment group name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName The deployment group name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentGroupInfo withDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
        return this;
    }

    /**
     * The deployment configuration name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The deployment configuration name.
     */
    public String getDeploymentConfigName() {
        return deploymentConfigName;
    }
    
    /**
     * The deployment configuration name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName The deployment configuration name.
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }
    
    /**
     * The deployment configuration name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName The deployment configuration name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentGroupInfo withDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * The Amazon EC2 tags to filter on.
     *
     * @return The Amazon EC2 tags to filter on.
     */
    public java.util.List<EC2TagFilter> getEc2TagFilters() {
        if (ec2TagFilters == null) {
              ec2TagFilters = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter>();
              ec2TagFilters.setAutoConstruct(true);
        }
        return ec2TagFilters;
    }
    
    /**
     * The Amazon EC2 tags to filter on.
     *
     * @param ec2TagFilters The Amazon EC2 tags to filter on.
     */
    public void setEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
        if (ec2TagFilters == null) {
            this.ec2TagFilters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter> ec2TagFiltersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter>(ec2TagFilters.size());
        ec2TagFiltersCopy.addAll(ec2TagFilters);
        this.ec2TagFilters = ec2TagFiltersCopy;
    }
    
    /**
     * The Amazon EC2 tags to filter on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2TagFilters The Amazon EC2 tags to filter on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentGroupInfo withEc2TagFilters(EC2TagFilter... ec2TagFilters) {
        if (getEc2TagFilters() == null) setEc2TagFilters(new java.util.ArrayList<EC2TagFilter>(ec2TagFilters.length));
        for (EC2TagFilter value : ec2TagFilters) {
            getEc2TagFilters().add(value);
        }
        return this;
    }
    
    /**
     * The Amazon EC2 tags to filter on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2TagFilters The Amazon EC2 tags to filter on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentGroupInfo withEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
        if (ec2TagFilters == null) {
            this.ec2TagFilters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter> ec2TagFiltersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter>(ec2TagFilters.size());
            ec2TagFiltersCopy.addAll(ec2TagFilters);
            this.ec2TagFilters = ec2TagFiltersCopy;
        }

        return this;
    }

    /**
     * A list of associated Auto Scaling groups.
     *
     * @return A list of associated Auto Scaling groups.
     */
    public java.util.List<AutoScalingGroup> getAutoScalingGroups() {
        if (autoScalingGroups == null) {
              autoScalingGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<AutoScalingGroup>();
              autoScalingGroups.setAutoConstruct(true);
        }
        return autoScalingGroups;
    }
    
    /**
     * A list of associated Auto Scaling groups.
     *
     * @param autoScalingGroups A list of associated Auto Scaling groups.
     */
    public void setAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AutoScalingGroup> autoScalingGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AutoScalingGroup>(autoScalingGroups.size());
        autoScalingGroupsCopy.addAll(autoScalingGroups);
        this.autoScalingGroups = autoScalingGroupsCopy;
    }
    
    /**
     * A list of associated Auto Scaling groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroups A list of associated Auto Scaling groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentGroupInfo withAutoScalingGroups(AutoScalingGroup... autoScalingGroups) {
        if (getAutoScalingGroups() == null) setAutoScalingGroups(new java.util.ArrayList<AutoScalingGroup>(autoScalingGroups.length));
        for (AutoScalingGroup value : autoScalingGroups) {
            getAutoScalingGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of associated Auto Scaling groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroups A list of associated Auto Scaling groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentGroupInfo withAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AutoScalingGroup> autoScalingGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AutoScalingGroup>(autoScalingGroups.size());
            autoScalingGroupsCopy.addAll(autoScalingGroups);
            this.autoScalingGroups = autoScalingGroupsCopy;
        }

        return this;
    }

    /**
     * A service role ARN.
     *
     * @return A service role ARN.
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }
    
    /**
     * A service role ARN.
     *
     * @param serviceRoleArn A service role ARN.
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }
    
    /**
     * A service role ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceRoleArn A service role ARN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentGroupInfo withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * Information about the deployment group's target revision, including
     * the revision's type and its location.
     *
     * @return Information about the deployment group's target revision, including
     *         the revision's type and its location.
     */
    public RevisionLocation getTargetRevision() {
        return targetRevision;
    }
    
    /**
     * Information about the deployment group's target revision, including
     * the revision's type and its location.
     *
     * @param targetRevision Information about the deployment group's target revision, including
     *         the revision's type and its location.
     */
    public void setTargetRevision(RevisionLocation targetRevision) {
        this.targetRevision = targetRevision;
    }
    
    /**
     * Information about the deployment group's target revision, including
     * the revision's type and its location.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetRevision Information about the deployment group's target revision, including
     *         the revision's type and its location.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentGroupInfo withTargetRevision(RevisionLocation targetRevision) {
        this.targetRevision = targetRevision;
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
        if (getDeploymentGroupId() != null) sb.append("DeploymentGroupId: " + getDeploymentGroupId() + ",");
        if (getDeploymentGroupName() != null) sb.append("DeploymentGroupName: " + getDeploymentGroupName() + ",");
        if (getDeploymentConfigName() != null) sb.append("DeploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getEc2TagFilters() != null) sb.append("Ec2TagFilters: " + getEc2TagFilters() + ",");
        if (getAutoScalingGroups() != null) sb.append("AutoScalingGroups: " + getAutoScalingGroups() + ",");
        if (getServiceRoleArn() != null) sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getTargetRevision() != null) sb.append("TargetRevision: " + getTargetRevision() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentGroupId() == null) ? 0 : getDeploymentGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentGroupName() == null) ? 0 : getDeploymentGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode()); 
        hashCode = prime * hashCode + ((getEc2TagFilters() == null) ? 0 : getEc2TagFilters().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode()); 
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getTargetRevision() == null) ? 0 : getTargetRevision().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeploymentGroupInfo == false) return false;
        DeploymentGroupInfo other = (DeploymentGroupInfo)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getDeploymentGroupId() == null ^ this.getDeploymentGroupId() == null) return false;
        if (other.getDeploymentGroupId() != null && other.getDeploymentGroupId().equals(this.getDeploymentGroupId()) == false) return false; 
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null) return false;
        if (other.getDeploymentGroupName() != null && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false) return false; 
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null) return false;
        if (other.getDeploymentConfigName() != null && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false) return false; 
        if (other.getEc2TagFilters() == null ^ this.getEc2TagFilters() == null) return false;
        if (other.getEc2TagFilters() != null && other.getEc2TagFilters().equals(this.getEc2TagFilters()) == false) return false; 
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null) return false;
        if (other.getAutoScalingGroups() != null && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false) return false; 
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null) return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false) return false; 
        if (other.getTargetRevision() == null ^ this.getTargetRevision() == null) return false;
        if (other.getTargetRevision() != null && other.getTargetRevision().equals(this.getTargetRevision()) == false) return false; 
        return true;
    }
    
}
    