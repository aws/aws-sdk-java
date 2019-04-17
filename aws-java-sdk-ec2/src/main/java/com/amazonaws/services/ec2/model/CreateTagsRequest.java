/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateTagsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTagsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateTagsRequest> {

    /**
     * <p>
     * The IDs of the resources, separated by spaces.
     * </p>
     * <p>
     * Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resources;
    /**
     * <p>
     * One or more tags. The <code>value</code> parameter is required, but if you don't want the tag to have a value,
     * specify the parameter with no value, and we set the value to an empty string.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * Default constructor for CreateTagsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateTagsRequest() {
    }

    /**
     * Constructs a new CreateTagsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param resources
     *        The IDs of the resources, separated by spaces.</p>
     *        <p>
     *        Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
     * @param tags
     *        One or more tags. The <code>value</code> parameter is required, but if you don't want the tag to have a
     *        value, specify the parameter with no value, and we set the value to an empty string.
     */
    public CreateTagsRequest(java.util.List<String> resources, java.util.List<Tag> tags) {
        setResources(resources);
        setTags(tags);
    }

    /**
     * <p>
     * The IDs of the resources, separated by spaces.
     * </p>
     * <p>
     * Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
     * </p>
     * 
     * @return The IDs of the resources, separated by spaces.</p>
     *         <p>
     *         Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
     */

    public java.util.List<String> getResources() {
        if (resources == null) {
            resources = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resources;
    }

    /**
     * <p>
     * The IDs of the resources, separated by spaces.
     * </p>
     * <p>
     * Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
     * </p>
     * 
     * @param resources
     *        The IDs of the resources, separated by spaces.</p>
     *        <p>
     *        Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new com.amazonaws.internal.SdkInternalList<String>(resources);
    }

    /**
     * <p>
     * The IDs of the resources, separated by spaces.
     * </p>
     * <p>
     * Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The IDs of the resources, separated by spaces.</p>
     *        <p>
     *        Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTagsRequest withResources(String... resources) {
        if (this.resources == null) {
            setResources(new com.amazonaws.internal.SdkInternalList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the resources, separated by spaces.
     * </p>
     * <p>
     * Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
     * </p>
     * 
     * @param resources
     *        The IDs of the resources, separated by spaces.</p>
     *        <p>
     *        Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTagsRequest withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * One or more tags. The <code>value</code> parameter is required, but if you don't want the tag to have a value,
     * specify the parameter with no value, and we set the value to an empty string.
     * </p>
     * 
     * @return One or more tags. The <code>value</code> parameter is required, but if you don't want the tag to have a
     *         value, specify the parameter with no value, and we set the value to an empty string.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * One or more tags. The <code>value</code> parameter is required, but if you don't want the tag to have a value,
     * specify the parameter with no value, and we set the value to an empty string.
     * </p>
     * 
     * @param tags
     *        One or more tags. The <code>value</code> parameter is required, but if you don't want the tag to have a
     *        value, specify the parameter with no value, and we set the value to an empty string.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tags. The <code>value</code> parameter is required, but if you don't want the tag to have a value,
     * specify the parameter with no value, and we set the value to an empty string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags. The <code>value</code> parameter is required, but if you don't want the tag to have a
     *        value, specify the parameter with no value, and we set the value to an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTagsRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags. The <code>value</code> parameter is required, but if you don't want the tag to have a value,
     * specify the parameter with no value, and we set the value to an empty string.
     * </p>
     * 
     * @param tags
     *        One or more tags. The <code>value</code> parameter is required, but if you don't want the tag to have a
     *        value, specify the parameter with no value, and we set the value to an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTagsRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateTagsRequest> getDryRunRequest() {
        Request<CreateTagsRequest> request = new CreateTagsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTagsRequest == false)
            return false;
        CreateTagsRequest other = (CreateTagsRequest) obj;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
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
    public CreateTagsRequest clone() {
        return (CreateTagsRequest) super.clone();
    }
}
