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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ListTagsForResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resouce for which a tag list was requested.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A list of tag key-value pairs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> resourceTags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resouce for which a tag list was requested.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resouce for which a tag list was requested.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resouce for which a tag list was requested.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resouce for which a tag list was requested.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resouce for which a tag list was requested.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resouce for which a tag list was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A list of tag key-value pairs.
     * </p>
     * 
     * @return A list of tag key-value pairs.
     */

    public java.util.List<Tag> getResourceTags() {
        if (resourceTags == null) {
            resourceTags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return resourceTags;
    }

    /**
     * <p>
     * A list of tag key-value pairs.
     * </p>
     * 
     * @param resourceTags
     *        A list of tag key-value pairs.
     */

    public void setResourceTags(java.util.Collection<Tag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new com.amazonaws.internal.SdkInternalList<Tag>(resourceTags);
    }

    /**
     * <p>
     * A list of tag key-value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        A list of tag key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withResourceTags(Tag... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new com.amazonaws.internal.SdkInternalList<Tag>(resourceTags.length));
        }
        for (Tag ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag key-value pairs.
     * </p>
     * 
     * @param resourceTags
     *        A list of tag key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withResourceTags(java.util.Collection<Tag> resourceTags) {
        setResourceTags(resourceTags);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceResult == false)
            return false;
        ListTagsForResourceResult other = (ListTagsForResourceResult) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceResult clone() {
        try {
            return (ListTagsForResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
