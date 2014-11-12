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
 * Information about an application revision.
 * </p>
 */
public class GenericRevisionInfo implements Serializable {

    /**
     * A comment about the revision.
     */
    private String description;

    /**
     * A list of deployment groups that use this revision.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentGroups;

    /**
     * When the revision was first used by AWS CodeDeploy.
     */
    private java.util.Date firstUsedTime;

    /**
     * When the revision was last used by AWS CodeDeploy.
     */
    private java.util.Date lastUsedTime;

    /**
     * When the revision was registered with AWS CodeDeploy.
     */
    private java.util.Date registerTime;

    /**
     * A comment about the revision.
     *
     * @return A comment about the revision.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A comment about the revision.
     *
     * @param description A comment about the revision.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A comment about the revision.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A comment about the revision.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenericRevisionInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * A list of deployment groups that use this revision.
     *
     * @return A list of deployment groups that use this revision.
     */
    public java.util.List<String> getDeploymentGroups() {
        if (deploymentGroups == null) {
              deploymentGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              deploymentGroups.setAutoConstruct(true);
        }
        return deploymentGroups;
    }
    
    /**
     * A list of deployment groups that use this revision.
     *
     * @param deploymentGroups A list of deployment groups that use this revision.
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
     * A list of deployment groups that use this revision.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentGroups A list of deployment groups that use this revision.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenericRevisionInfo withDeploymentGroups(String... deploymentGroups) {
        if (getDeploymentGroups() == null) setDeploymentGroups(new java.util.ArrayList<String>(deploymentGroups.length));
        for (String value : deploymentGroups) {
            getDeploymentGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of deployment groups that use this revision.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentGroups A list of deployment groups that use this revision.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenericRevisionInfo withDeploymentGroups(java.util.Collection<String> deploymentGroups) {
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
     * When the revision was first used by AWS CodeDeploy.
     *
     * @return When the revision was first used by AWS CodeDeploy.
     */
    public java.util.Date getFirstUsedTime() {
        return firstUsedTime;
    }
    
    /**
     * When the revision was first used by AWS CodeDeploy.
     *
     * @param firstUsedTime When the revision was first used by AWS CodeDeploy.
     */
    public void setFirstUsedTime(java.util.Date firstUsedTime) {
        this.firstUsedTime = firstUsedTime;
    }
    
    /**
     * When the revision was first used by AWS CodeDeploy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param firstUsedTime When the revision was first used by AWS CodeDeploy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenericRevisionInfo withFirstUsedTime(java.util.Date firstUsedTime) {
        this.firstUsedTime = firstUsedTime;
        return this;
    }

    /**
     * When the revision was last used by AWS CodeDeploy.
     *
     * @return When the revision was last used by AWS CodeDeploy.
     */
    public java.util.Date getLastUsedTime() {
        return lastUsedTime;
    }
    
    /**
     * When the revision was last used by AWS CodeDeploy.
     *
     * @param lastUsedTime When the revision was last used by AWS CodeDeploy.
     */
    public void setLastUsedTime(java.util.Date lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
    }
    
    /**
     * When the revision was last used by AWS CodeDeploy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUsedTime When the revision was last used by AWS CodeDeploy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenericRevisionInfo withLastUsedTime(java.util.Date lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
        return this;
    }

    /**
     * When the revision was registered with AWS CodeDeploy.
     *
     * @return When the revision was registered with AWS CodeDeploy.
     */
    public java.util.Date getRegisterTime() {
        return registerTime;
    }
    
    /**
     * When the revision was registered with AWS CodeDeploy.
     *
     * @param registerTime When the revision was registered with AWS CodeDeploy.
     */
    public void setRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
    }
    
    /**
     * When the revision was registered with AWS CodeDeploy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registerTime When the revision was registered with AWS CodeDeploy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenericRevisionInfo withRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
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
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDeploymentGroups() != null) sb.append("DeploymentGroups: " + getDeploymentGroups() + ",");
        if (getFirstUsedTime() != null) sb.append("FirstUsedTime: " + getFirstUsedTime() + ",");
        if (getLastUsedTime() != null) sb.append("LastUsedTime: " + getLastUsedTime() + ",");
        if (getRegisterTime() != null) sb.append("RegisterTime: " + getRegisterTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentGroups() == null) ? 0 : getDeploymentGroups().hashCode()); 
        hashCode = prime * hashCode + ((getFirstUsedTime() == null) ? 0 : getFirstUsedTime().hashCode()); 
        hashCode = prime * hashCode + ((getLastUsedTime() == null) ? 0 : getLastUsedTime().hashCode()); 
        hashCode = prime * hashCode + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GenericRevisionInfo == false) return false;
        GenericRevisionInfo other = (GenericRevisionInfo)obj;
        
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getDeploymentGroups() == null ^ this.getDeploymentGroups() == null) return false;
        if (other.getDeploymentGroups() != null && other.getDeploymentGroups().equals(this.getDeploymentGroups()) == false) return false; 
        if (other.getFirstUsedTime() == null ^ this.getFirstUsedTime() == null) return false;
        if (other.getFirstUsedTime() != null && other.getFirstUsedTime().equals(this.getFirstUsedTime()) == false) return false; 
        if (other.getLastUsedTime() == null ^ this.getLastUsedTime() == null) return false;
        if (other.getLastUsedTime() != null && other.getLastUsedTime().equals(this.getLastUsedTime()) == false) return false; 
        if (other.getRegisterTime() == null ^ this.getRegisterTime() == null) return false;
        if (other.getRegisterTime() != null && other.getRegisterTime().equals(this.getRegisterTime()) == false) return false; 
        return true;
    }
    
}
    