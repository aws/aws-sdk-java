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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/TagResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and
     * a maximum of 20 ARNs (resources) to tag. An ARN can be set to a maximum of 1600 characters. For more information,
     * see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private java.util.List<String> resourceARNList;
    /**
     * <p>
     * The tags that you want to add to the specified resources. A tag consists of a key and a value that you define.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and
     * a maximum of 20 ARNs (resources) to tag. An ARN can be set to a maximum of 1600 characters. For more information,
     * see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum
     *         of 1 and a maximum of 20 ARNs (resources) to tag. An ARN can be set to a maximum of 1600 characters. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public java.util.List<String> getResourceARNList() {
        return resourceARNList;
    }

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and
     * a maximum of 20 ARNs (resources) to tag. An ARN can be set to a maximum of 1600 characters. For more information,
     * see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param resourceARNList
     *        A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of
     *        1 and a maximum of 20 ARNs (resources) to tag. An ARN can be set to a maximum of 1600 characters. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setResourceARNList(java.util.Collection<String> resourceARNList) {
        if (resourceARNList == null) {
            this.resourceARNList = null;
            return;
        }

        this.resourceARNList = new java.util.ArrayList<String>(resourceARNList);
    }

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and
     * a maximum of 20 ARNs (resources) to tag. An ARN can be set to a maximum of 1600 characters. For more information,
     * see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceARNList(java.util.Collection)} or {@link #withResourceARNList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceARNList
     *        A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of
     *        1 and a maximum of 20 ARNs (resources) to tag. An ARN can be set to a maximum of 1600 characters. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourcesRequest withResourceARNList(String... resourceARNList) {
        if (this.resourceARNList == null) {
            setResourceARNList(new java.util.ArrayList<String>(resourceARNList.length));
        }
        for (String ele : resourceARNList) {
            this.resourceARNList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and
     * a maximum of 20 ARNs (resources) to tag. An ARN can be set to a maximum of 1600 characters. For more information,
     * see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param resourceARNList
     *        A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of
     *        1 and a maximum of 20 ARNs (resources) to tag. An ARN can be set to a maximum of 1600 characters. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourcesRequest withResourceARNList(java.util.Collection<String> resourceARNList) {
        setResourceARNList(resourceARNList);
        return this;
    }

    /**
     * <p>
     * The tags that you want to add to the specified resources. A tag consists of a key and a value that you define.
     * </p>
     * 
     * @return The tags that you want to add to the specified resources. A tag consists of a key and a value that you
     *         define.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that you want to add to the specified resources. A tag consists of a key and a value that you define.
     * </p>
     * 
     * @param tags
     *        The tags that you want to add to the specified resources. A tag consists of a key and a value that you
     *        define.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags that you want to add to the specified resources. A tag consists of a key and a value that you define.
     * </p>
     * 
     * @param tags
     *        The tags that you want to add to the specified resources. A tag consists of a key and a value that you
     *        define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourcesRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public TagResourcesRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourcesRequest clearTagsEntries() {
        this.tags = null;
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
        if (getResourceARNList() != null)
            sb.append("ResourceARNList: ").append(getResourceARNList()).append(",");
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

        if (obj instanceof TagResourcesRequest == false)
            return false;
        TagResourcesRequest other = (TagResourcesRequest) obj;
        if (other.getResourceARNList() == null ^ this.getResourceARNList() == null)
            return false;
        if (other.getResourceARNList() != null && other.getResourceARNList().equals(this.getResourceARNList()) == false)
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

        hashCode = prime * hashCode + ((getResourceARNList() == null) ? 0 : getResourceARNList().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourcesRequest clone() {
        return (TagResourcesRequest) super.clone();
    }

}
