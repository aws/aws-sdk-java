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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateTagsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createTags(CreateTagsRequest) CreateTags operation}.
 * <p>
 * Adds or overwrites one or more tags for the specified EC2 resource or
 * resources. Each resource can have a maximum of 10 tags. Each tag
 * consists of a key and optional value. Tag keys must be unique per
 * resource.
 * </p>
 * <p>
 * For more information about tags, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createTags(CreateTagsRequest)
 */
public class CreateTagsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateTagsRequest> {

    /**
     * The IDs of one or more resources to tag. For example, ami-1a2b3c4d.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> resources;

    /**
     * One or more tags. The <code>value</code> parameter is required, but if
     * you don't want the tag to have a value, specify the parameter with no
     * value, and we set the value to an empty string.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Default constructor for a new CreateTagsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateTagsRequest() {}
    
    /**
     * Constructs a new CreateTagsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param resources The IDs of one or more resources to tag. For example,
     * ami-1a2b3c4d.
     * @param tags One or more tags. The <code>value</code> parameter is
     * required, but if you don't want the tag to have a value, specify the
     * parameter with no value, and we set the value to an empty string.
     */
    public CreateTagsRequest(java.util.List<String> resources, java.util.List<Tag> tags) {
        setResources(resources);
        setTags(tags);
    }

    /**
     * The IDs of one or more resources to tag. For example, ami-1a2b3c4d.
     *
     * @return The IDs of one or more resources to tag. For example, ami-1a2b3c4d.
     */
    public java.util.List<String> getResources() {
        if (resources == null) {
              resources = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              resources.setAutoConstruct(true);
        }
        return resources;
    }
    
    /**
     * The IDs of one or more resources to tag. For example, ami-1a2b3c4d.
     *
     * @param resources The IDs of one or more resources to tag. For example, ami-1a2b3c4d.
     */
    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> resourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resources.size());
        resourcesCopy.addAll(resources);
        this.resources = resourcesCopy;
    }
    
    /**
     * The IDs of one or more resources to tag. For example, ami-1a2b3c4d.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resources The IDs of one or more resources to tag. For example, ami-1a2b3c4d.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTagsRequest withResources(String... resources) {
        if (getResources() == null) setResources(new java.util.ArrayList<String>(resources.length));
        for (String value : resources) {
            getResources().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of one or more resources to tag. For example, ami-1a2b3c4d.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resources The IDs of one or more resources to tag. For example, ami-1a2b3c4d.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTagsRequest withResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> resourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resources.size());
            resourcesCopy.addAll(resources);
            this.resources = resourcesCopy;
        }

        return this;
    }

    /**
     * One or more tags. The <code>value</code> parameter is required, but if
     * you don't want the tag to have a value, specify the parameter with no
     * value, and we set the value to an empty string.
     *
     * @return One or more tags. The <code>value</code> parameter is required, but if
     *         you don't want the tag to have a value, specify the parameter with no
     *         value, and we set the value to an empty string.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * One or more tags. The <code>value</code> parameter is required, but if
     * you don't want the tag to have a value, specify the parameter with no
     * value, and we set the value to an empty string.
     *
     * @param tags One or more tags. The <code>value</code> parameter is required, but if
     *         you don't want the tag to have a value, specify the parameter with no
     *         value, and we set the value to an empty string.
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
     * One or more tags. The <code>value</code> parameter is required, but if
     * you don't want the tag to have a value, specify the parameter with no
     * value, and we set the value to an empty string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags One or more tags. The <code>value</code> parameter is required, but if
     *         you don't want the tag to have a value, specify the parameter with no
     *         value, and we set the value to an empty string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTagsRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * One or more tags. The <code>value</code> parameter is required, but if
     * you don't want the tag to have a value, specify the parameter with no
     * value, and we set the value to an empty string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags One or more tags. The <code>value</code> parameter is required, but if
     *         you don't want the tag to have a value, specify the parameter with no
     *         value, and we set the value to an empty string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTagsRequest withTags(java.util.Collection<Tag> tags) {
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
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateTagsRequest> getDryRunRequest() {
        Request<CreateTagsRequest> request = new CreateTagsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getResources() != null) sb.append("Resources: " + getResources() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTagsRequest == false) return false;
        CreateTagsRequest other = (CreateTagsRequest)obj;
        
        if (other.getResources() == null ^ this.getResources() == null) return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    