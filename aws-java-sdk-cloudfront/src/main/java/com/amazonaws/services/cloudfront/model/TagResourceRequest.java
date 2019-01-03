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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to add tags to a CloudFront resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An ARN of a CloudFront resource.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> elements.
     * </p>
     */
    private Tags tags;

    /**
     * <p>
     * An ARN of a CloudFront resource.
     * </p>
     * 
     * @param resource
     *        An ARN of a CloudFront resource.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * An ARN of a CloudFront resource.
     * </p>
     * 
     * @return An ARN of a CloudFront resource.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * An ARN of a CloudFront resource.
     * </p>
     * 
     * @param resource
     *        An ARN of a CloudFront resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> elements.
     * </p>
     * 
     * @param tags
     *        A complex type that contains zero or more <code>Tag</code> elements.
     */

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> elements.
     * </p>
     * 
     * @return A complex type that contains zero or more <code>Tag</code> elements.
     */

    public Tags getTags() {
        return this.tags;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> elements.
     * </p>
     * 
     * @param tags
     *        A complex type that contains zero or more <code>Tag</code> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(Tags tags) {
        setTags(tags);
        return this;
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
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

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
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

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
