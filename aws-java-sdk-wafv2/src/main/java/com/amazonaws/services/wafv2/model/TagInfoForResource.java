/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The collection of tagging definitions for an Amazon Web Services resource. Tags are key:value pairs that you can use
 * to categorize and manage your resources, for purposes like billing or other management. Typically, the tag key
 * represents a category, such as "environment", and the tag value represents a specific value within that category,
 * such as "test," "development," or "production". Or you might set the tag key to "customer" and the value to the
 * customer name or ID. You can specify one or more tags to add to each Amazon Web Services resource, up to 50 tags for
 * a resource.
 * </p>
 * <p>
 * You can tag the Amazon Web Services resources that you manage through WAF: web ACLs, rule groups, IP sets, and regex
 * pattern sets. You can't manage or view tags through the WAF console.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/TagInfoForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagInfoForResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * The array of <a>Tag</a> objects defined for the resource.
     * </p>
     */
    private java.util.List<Tag> tagList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) of the resource.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagInfoForResource withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The array of <a>Tag</a> objects defined for the resource.
     * </p>
     * 
     * @return The array of <a>Tag</a> objects defined for the resource.
     */

    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * The array of <a>Tag</a> objects defined for the resource.
     * </p>
     * 
     * @param tagList
     *        The array of <a>Tag</a> objects defined for the resource.
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<Tag>(tagList);
    }

    /**
     * <p>
     * The array of <a>Tag</a> objects defined for the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        The array of <a>Tag</a> objects defined for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagInfoForResource withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new java.util.ArrayList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>Tag</a> objects defined for the resource.
     * </p>
     * 
     * @param tagList
     *        The array of <a>Tag</a> objects defined for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagInfoForResource withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagInfoForResource == false)
            return false;
        TagInfoForResource other = (TagInfoForResource) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        return hashCode;
    }

    @Override
    public TagInfoForResource clone() {
        try {
            return (TagInfoForResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.TagInfoForResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
