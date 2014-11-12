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
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#updateDeploymentGroup(UpdateDeploymentGroupRequest) UpdateDeploymentGroup operation}.
 * <p>
 * Changes information about an existing deployment group.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#updateDeploymentGroup(UpdateDeploymentGroupRequest)
 */
public class UpdateDeploymentGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The application name corresponding to the deployment group to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The current name of the existing deployment group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String currentDeploymentGroupName;

    /**
     * The new name of the deployment group, if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String newDeploymentGroupName;

    /**
     * The replacement deployment configuration name to use, if you want to
     * change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentConfigName;

    /**
     * The replacement set of Amazon EC2 tags to filter on, if you want to
     * change them.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter> ec2TagFilters;

    /**
     * The replacement list of Auto Scaling groups to be included in the
     * deployment group, if you want to change them.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingGroups;

    /**
     * A replacement service role's ARN, if you want to change it.
     */
    private String serviceRoleArn;

    /**
     * The application name corresponding to the deployment group to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The application name corresponding to the deployment group to update.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The application name corresponding to the deployment group to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The application name corresponding to the deployment group to update.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The application name corresponding to the deployment group to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The application name corresponding to the deployment group to update.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDeploymentGroupRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The current name of the existing deployment group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The current name of the existing deployment group.
     */
    public String getCurrentDeploymentGroupName() {
        return currentDeploymentGroupName;
    }
    
    /**
     * The current name of the existing deployment group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param currentDeploymentGroupName The current name of the existing deployment group.
     */
    public void setCurrentDeploymentGroupName(String currentDeploymentGroupName) {
        this.currentDeploymentGroupName = currentDeploymentGroupName;
    }
    
    /**
     * The current name of the existing deployment group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param currentDeploymentGroupName The current name of the existing deployment group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDeploymentGroupRequest withCurrentDeploymentGroupName(String currentDeploymentGroupName) {
        this.currentDeploymentGroupName = currentDeploymentGroupName;
        return this;
    }

    /**
     * The new name of the deployment group, if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The new name of the deployment group, if you want to change it.
     */
    public String getNewDeploymentGroupName() {
        return newDeploymentGroupName;
    }
    
    /**
     * The new name of the deployment group, if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param newDeploymentGroupName The new name of the deployment group, if you want to change it.
     */
    public void setNewDeploymentGroupName(String newDeploymentGroupName) {
        this.newDeploymentGroupName = newDeploymentGroupName;
    }
    
    /**
     * The new name of the deployment group, if you want to change it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param newDeploymentGroupName The new name of the deployment group, if you want to change it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDeploymentGroupRequest withNewDeploymentGroupName(String newDeploymentGroupName) {
        this.newDeploymentGroupName = newDeploymentGroupName;
        return this;
    }

    /**
     * The replacement deployment configuration name to use, if you want to
     * change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The replacement deployment configuration name to use, if you want to
     *         change it.
     */
    public String getDeploymentConfigName() {
        return deploymentConfigName;
    }
    
    /**
     * The replacement deployment configuration name to use, if you want to
     * change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName The replacement deployment configuration name to use, if you want to
     *         change it.
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }
    
    /**
     * The replacement deployment configuration name to use, if you want to
     * change it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName The replacement deployment configuration name to use, if you want to
     *         change it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDeploymentGroupRequest withDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * The replacement set of Amazon EC2 tags to filter on, if you want to
     * change them.
     *
     * @return The replacement set of Amazon EC2 tags to filter on, if you want to
     *         change them.
     */
    public java.util.List<EC2TagFilter> getEc2TagFilters() {
        if (ec2TagFilters == null) {
              ec2TagFilters = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2TagFilter>();
              ec2TagFilters.setAutoConstruct(true);
        }
        return ec2TagFilters;
    }
    
    /**
     * The replacement set of Amazon EC2 tags to filter on, if you want to
     * change them.
     *
     * @param ec2TagFilters The replacement set of Amazon EC2 tags to filter on, if you want to
     *         change them.
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
     * The replacement set of Amazon EC2 tags to filter on, if you want to
     * change them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2TagFilters The replacement set of Amazon EC2 tags to filter on, if you want to
     *         change them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDeploymentGroupRequest withEc2TagFilters(EC2TagFilter... ec2TagFilters) {
        if (getEc2TagFilters() == null) setEc2TagFilters(new java.util.ArrayList<EC2TagFilter>(ec2TagFilters.length));
        for (EC2TagFilter value : ec2TagFilters) {
            getEc2TagFilters().add(value);
        }
        return this;
    }
    
    /**
     * The replacement set of Amazon EC2 tags to filter on, if you want to
     * change them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2TagFilters The replacement set of Amazon EC2 tags to filter on, if you want to
     *         change them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDeploymentGroupRequest withEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
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
     * The replacement list of Auto Scaling groups to be included in the
     * deployment group, if you want to change them.
     *
     * @return The replacement list of Auto Scaling groups to be included in the
     *         deployment group, if you want to change them.
     */
    public java.util.List<String> getAutoScalingGroups() {
        if (autoScalingGroups == null) {
              autoScalingGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              autoScalingGroups.setAutoConstruct(true);
        }
        return autoScalingGroups;
    }
    
    /**
     * The replacement list of Auto Scaling groups to be included in the
     * deployment group, if you want to change them.
     *
     * @param autoScalingGroups The replacement list of Auto Scaling groups to be included in the
     *         deployment group, if you want to change them.
     */
    public void setAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(autoScalingGroups.size());
        autoScalingGroupsCopy.addAll(autoScalingGroups);
        this.autoScalingGroups = autoScalingGroupsCopy;
    }
    
    /**
     * The replacement list of Auto Scaling groups to be included in the
     * deployment group, if you want to change them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroups The replacement list of Auto Scaling groups to be included in the
     *         deployment group, if you want to change them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDeploymentGroupRequest withAutoScalingGroups(String... autoScalingGroups) {
        if (getAutoScalingGroups() == null) setAutoScalingGroups(new java.util.ArrayList<String>(autoScalingGroups.length));
        for (String value : autoScalingGroups) {
            getAutoScalingGroups().add(value);
        }
        return this;
    }
    
    /**
     * The replacement list of Auto Scaling groups to be included in the
     * deployment group, if you want to change them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroups The replacement list of Auto Scaling groups to be included in the
     *         deployment group, if you want to change them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDeploymentGroupRequest withAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(autoScalingGroups.size());
            autoScalingGroupsCopy.addAll(autoScalingGroups);
            this.autoScalingGroups = autoScalingGroupsCopy;
        }

        return this;
    }

    /**
     * A replacement service role's ARN, if you want to change it.
     *
     * @return A replacement service role's ARN, if you want to change it.
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }
    
    /**
     * A replacement service role's ARN, if you want to change it.
     *
     * @param serviceRoleArn A replacement service role's ARN, if you want to change it.
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }
    
    /**
     * A replacement service role's ARN, if you want to change it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceRoleArn A replacement service role's ARN, if you want to change it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDeploymentGroupRequest withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
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
        if (getCurrentDeploymentGroupName() != null) sb.append("CurrentDeploymentGroupName: " + getCurrentDeploymentGroupName() + ",");
        if (getNewDeploymentGroupName() != null) sb.append("NewDeploymentGroupName: " + getNewDeploymentGroupName() + ",");
        if (getDeploymentConfigName() != null) sb.append("DeploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getEc2TagFilters() != null) sb.append("Ec2TagFilters: " + getEc2TagFilters() + ",");
        if (getAutoScalingGroups() != null) sb.append("AutoScalingGroups: " + getAutoScalingGroups() + ",");
        if (getServiceRoleArn() != null) sb.append("ServiceRoleArn: " + getServiceRoleArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getCurrentDeploymentGroupName() == null) ? 0 : getCurrentDeploymentGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getNewDeploymentGroupName() == null) ? 0 : getNewDeploymentGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode()); 
        hashCode = prime * hashCode + ((getEc2TagFilters() == null) ? 0 : getEc2TagFilters().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode()); 
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateDeploymentGroupRequest == false) return false;
        UpdateDeploymentGroupRequest other = (UpdateDeploymentGroupRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getCurrentDeploymentGroupName() == null ^ this.getCurrentDeploymentGroupName() == null) return false;
        if (other.getCurrentDeploymentGroupName() != null && other.getCurrentDeploymentGroupName().equals(this.getCurrentDeploymentGroupName()) == false) return false; 
        if (other.getNewDeploymentGroupName() == null ^ this.getNewDeploymentGroupName() == null) return false;
        if (other.getNewDeploymentGroupName() != null && other.getNewDeploymentGroupName().equals(this.getNewDeploymentGroupName()) == false) return false; 
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null) return false;
        if (other.getDeploymentConfigName() != null && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false) return false; 
        if (other.getEc2TagFilters() == null ^ this.getEc2TagFilters() == null) return false;
        if (other.getEc2TagFilters() != null && other.getEc2TagFilters().equals(this.getEc2TagFilters()) == false) return false; 
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null) return false;
        if (other.getAutoScalingGroups() != null && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false) return false; 
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null) return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false) return false; 
        return true;
    }
    
}
    