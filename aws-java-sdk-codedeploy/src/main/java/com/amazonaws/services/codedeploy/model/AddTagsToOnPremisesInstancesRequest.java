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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#addTagsToOnPremisesInstances(AddTagsToOnPremisesInstancesRequest) AddTagsToOnPremisesInstances operation}.
 * <p>
 * Adds a tag to an on-premises instance.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#addTagsToOnPremisesInstances(AddTagsToOnPremisesInstancesRequest)
 */
public class AddTagsToOnPremisesInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The tag key-value pairs to add to the on-premises instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The names of the on-premises instances to add tags to.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceNames;

    /**
     * The tag key-value pairs to add to the on-premises instances.
     *
     * @return The tag key-value pairs to add to the on-premises instances.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The tag key-value pairs to add to the on-premises instances.
     *
     * @param tags The tag key-value pairs to add to the on-premises instances.
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
     * The tag key-value pairs to add to the on-premises instances.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tag key-value pairs to add to the on-premises instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToOnPremisesInstancesRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * The tag key-value pairs to add to the on-premises instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tag key-value pairs to add to the on-premises instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToOnPremisesInstancesRequest withTags(java.util.Collection<Tag> tags) {
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
     * The names of the on-premises instances to add tags to.
     *
     * @return The names of the on-premises instances to add tags to.
     */
    public java.util.List<String> getInstanceNames() {
        if (instanceNames == null) {
              instanceNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceNames.setAutoConstruct(true);
        }
        return instanceNames;
    }
    
    /**
     * The names of the on-premises instances to add tags to.
     *
     * @param instanceNames The names of the on-premises instances to add tags to.
     */
    public void setInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceNames.size());
        instanceNamesCopy.addAll(instanceNames);
        this.instanceNames = instanceNamesCopy;
    }
    
    /**
     * The names of the on-premises instances to add tags to.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceNames(java.util.Collection)} or {@link
     * #withInstanceNames(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceNames The names of the on-premises instances to add tags to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToOnPremisesInstancesRequest withInstanceNames(String... instanceNames) {
        if (getInstanceNames() == null) setInstanceNames(new java.util.ArrayList<String>(instanceNames.length));
        for (String value : instanceNames) {
            getInstanceNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of the on-premises instances to add tags to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceNames The names of the on-premises instances to add tags to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToOnPremisesInstancesRequest withInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceNames.size());
            instanceNamesCopy.addAll(instanceNames);
            this.instanceNames = instanceNamesCopy;
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
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getInstanceNames() != null) sb.append("InstanceNames: " + getInstanceNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddTagsToOnPremisesInstancesRequest == false) return false;
        AddTagsToOnPremisesInstancesRequest other = (AddTagsToOnPremisesInstancesRequest)obj;
        
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null) return false;
        if (other.getInstanceNames() != null && other.getInstanceNames().equals(this.getInstanceNames()) == false) return false; 
        return true;
    }
    
    @Override
    public AddTagsToOnPremisesInstancesRequest clone() {
        
            return (AddTagsToOnPremisesInstancesRequest) super.clone();
    }

}
    