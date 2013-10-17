/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DeleteTagsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteTags(DeleteTagsRequest) DeleteTags operation}.
 * <p>
 * Deletes tags from the specified Amazon EC2 resources.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteTags(DeleteTagsRequest)
 */
public class DeleteTagsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeleteTagsRequest> {

    /**
     * A list of one or more resource IDs. This could be the ID of an AMI, an
     * instance, an EBS volume, or snapshot, etc.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> resources;

    /**
     * The tags to delete from the specified resources. Each tag item
     * consists of a key-value pair. <p> If a tag is specified without a
     * value, the tag and all of its values are deleted.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Default constructor for a new DeleteTagsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteTagsRequest() {}
    
    /**
     * Constructs a new DeleteTagsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param resources A list of one or more resource IDs. This could be the
     * ID of an AMI, an instance, an EBS volume, or snapshot, etc.
     */
    public DeleteTagsRequest(java.util.List<String> resources) {
        setResources(resources);
    }

    /**
     * A list of one or more resource IDs. This could be the ID of an AMI, an
     * instance, an EBS volume, or snapshot, etc.
     *
     * @return A list of one or more resource IDs. This could be the ID of an AMI, an
     *         instance, an EBS volume, or snapshot, etc.
     */
    public java.util.List<String> getResources() {
        if (resources == null) {
              resources = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              resources.setAutoConstruct(true);
        }
        return resources;
    }
    
    /**
     * A list of one or more resource IDs. This could be the ID of an AMI, an
     * instance, an EBS volume, or snapshot, etc.
     *
     * @param resources A list of one or more resource IDs. This could be the ID of an AMI, an
     *         instance, an EBS volume, or snapshot, etc.
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
     * A list of one or more resource IDs. This could be the ID of an AMI, an
     * instance, an EBS volume, or snapshot, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resources A list of one or more resource IDs. This could be the ID of an AMI, an
     *         instance, an EBS volume, or snapshot, etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteTagsRequest withResources(String... resources) {
        if (getResources() == null) setResources(new java.util.ArrayList<String>(resources.length));
        for (String value : resources) {
            getResources().add(value);
        }
        return this;
    }
    
    /**
     * A list of one or more resource IDs. This could be the ID of an AMI, an
     * instance, an EBS volume, or snapshot, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resources A list of one or more resource IDs. This could be the ID of an AMI, an
     *         instance, an EBS volume, or snapshot, etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteTagsRequest withResources(java.util.Collection<String> resources) {
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
     * The tags to delete from the specified resources. Each tag item
     * consists of a key-value pair. <p> If a tag is specified without a
     * value, the tag and all of its values are deleted.
     *
     * @return The tags to delete from the specified resources. Each tag item
     *         consists of a key-value pair. <p> If a tag is specified without a
     *         value, the tag and all of its values are deleted.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The tags to delete from the specified resources. Each tag item
     * consists of a key-value pair. <p> If a tag is specified without a
     * value, the tag and all of its values are deleted.
     *
     * @param tags The tags to delete from the specified resources. Each tag item
     *         consists of a key-value pair. <p> If a tag is specified without a
     *         value, the tag and all of its values are deleted.
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
     * The tags to delete from the specified resources. Each tag item
     * consists of a key-value pair. <p> If a tag is specified without a
     * value, the tag and all of its values are deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags to delete from the specified resources. Each tag item
     *         consists of a key-value pair. <p> If a tag is specified without a
     *         value, the tag and all of its values are deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteTagsRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * The tags to delete from the specified resources. Each tag item
     * consists of a key-value pair. <p> If a tag is specified without a
     * value, the tag and all of its values are deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags to delete from the specified resources. Each tag item
     *         consists of a key-value pair. <p> If a tag is specified without a
     *         value, the tag and all of its values are deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteTagsRequest withTags(java.util.Collection<Tag> tags) {
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
    public Request<DeleteTagsRequest> getDryRunRequest() {
        Request<DeleteTagsRequest> request = new DeleteTagsRequestMarshaller().marshall(this);
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

        if (obj instanceof DeleteTagsRequest == false) return false;
        DeleteTagsRequest other = (DeleteTagsRequest)obj;
        
        if (other.getResources() == null ^ this.getResources() == null) return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    