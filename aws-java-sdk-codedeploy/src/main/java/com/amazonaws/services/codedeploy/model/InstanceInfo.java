/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about an on-premises instance.
 * </p>
 */
public class InstanceInfo implements Serializable, Cloneable {

    /**
     * The name of the on-premises instance.
     */
    private String instanceName;

    /**
     * The IAM user ARN associated with the on-premises instance.
     */
    private String iamUserArn;

    /**
     * The ARN of the on-premises instance.
     */
    private String instanceArn;

    /**
     * The time that the on-premises instance was registered.
     */
    private java.util.Date registerTime;

    /**
     * If the on-premises instance was deregistered, the time that the
     * on-premises instance was deregistered.
     */
    private java.util.Date deregisterTime;

    /**
     * Information about the tags for the on-premises instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The name of the on-premises instance.
     *
     * @return The name of the on-premises instance.
     */
    public String getInstanceName() {
        return instanceName;
    }
    
    /**
     * The name of the on-premises instance.
     *
     * @param instanceName The name of the on-premises instance.
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }
    
    /**
     * The name of the on-premises instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceName The name of the on-premises instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * The IAM user ARN associated with the on-premises instance.
     *
     * @return The IAM user ARN associated with the on-premises instance.
     */
    public String getIamUserArn() {
        return iamUserArn;
    }
    
    /**
     * The IAM user ARN associated with the on-premises instance.
     *
     * @param iamUserArn The IAM user ARN associated with the on-premises instance.
     */
    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }
    
    /**
     * The IAM user ARN associated with the on-premises instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamUserArn The IAM user ARN associated with the on-premises instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceInfo withIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
        return this;
    }

    /**
     * The ARN of the on-premises instance.
     *
     * @return The ARN of the on-premises instance.
     */
    public String getInstanceArn() {
        return instanceArn;
    }
    
    /**
     * The ARN of the on-premises instance.
     *
     * @param instanceArn The ARN of the on-premises instance.
     */
    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }
    
    /**
     * The ARN of the on-premises instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceArn The ARN of the on-premises instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceInfo withInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
        return this;
    }

    /**
     * The time that the on-premises instance was registered.
     *
     * @return The time that the on-premises instance was registered.
     */
    public java.util.Date getRegisterTime() {
        return registerTime;
    }
    
    /**
     * The time that the on-premises instance was registered.
     *
     * @param registerTime The time that the on-premises instance was registered.
     */
    public void setRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
    }
    
    /**
     * The time that the on-premises instance was registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registerTime The time that the on-premises instance was registered.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceInfo withRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    /**
     * If the on-premises instance was deregistered, the time that the
     * on-premises instance was deregistered.
     *
     * @return If the on-premises instance was deregistered, the time that the
     *         on-premises instance was deregistered.
     */
    public java.util.Date getDeregisterTime() {
        return deregisterTime;
    }
    
    /**
     * If the on-premises instance was deregistered, the time that the
     * on-premises instance was deregistered.
     *
     * @param deregisterTime If the on-premises instance was deregistered, the time that the
     *         on-premises instance was deregistered.
     */
    public void setDeregisterTime(java.util.Date deregisterTime) {
        this.deregisterTime = deregisterTime;
    }
    
    /**
     * If the on-premises instance was deregistered, the time that the
     * on-premises instance was deregistered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deregisterTime If the on-premises instance was deregistered, the time that the
     *         on-premises instance was deregistered.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceInfo withDeregisterTime(java.util.Date deregisterTime) {
        this.deregisterTime = deregisterTime;
        return this;
    }

    /**
     * Information about the tags for the on-premises instance.
     *
     * @return Information about the tags for the on-premises instance.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Information about the tags for the on-premises instance.
     *
     * @param tags Information about the tags for the on-premises instance.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Information about the tags for the on-premises instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Information about the tags for the on-premises instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceInfo withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Information about the tags for the on-premises instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Information about the tags for the on-premises instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceInfo withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
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
        if (getInstanceName() != null) sb.append("InstanceName: " + getInstanceName() + ",");
        if (getIamUserArn() != null) sb.append("IamUserArn: " + getIamUserArn() + ",");
        if (getInstanceArn() != null) sb.append("InstanceArn: " + getInstanceArn() + ",");
        if (getRegisterTime() != null) sb.append("RegisterTime: " + getRegisterTime() + ",");
        if (getDeregisterTime() != null) sb.append("DeregisterTime: " + getDeregisterTime() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode()); 
        hashCode = prime * hashCode + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode()); 
        hashCode = prime * hashCode + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode()); 
        hashCode = prime * hashCode + ((getDeregisterTime() == null) ? 0 : getDeregisterTime().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceInfo == false) return false;
        InstanceInfo other = (InstanceInfo)obj;
        
        if (other.getInstanceName() == null ^ this.getInstanceName() == null) return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false) return false; 
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null) return false;
        if (other.getIamUserArn() != null && other.getIamUserArn().equals(this.getIamUserArn()) == false) return false; 
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null) return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false) return false; 
        if (other.getRegisterTime() == null ^ this.getRegisterTime() == null) return false;
        if (other.getRegisterTime() != null && other.getRegisterTime().equals(this.getRegisterTime()) == false) return false; 
        if (other.getDeregisterTime() == null ^ this.getDeregisterTime() == null) return false;
        if (other.getDeregisterTime() != null && other.getDeregisterTime().equals(this.getDeregisterTime()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public InstanceInfo clone() {
        try {
            return (InstanceInfo) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    