/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. For a list of supported resources, see <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_ResourceTag.html">ResourceTag</a>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A list of tag key-value pairs to be added to the resource.
     * </p>
     * <p>
     * Each tag consists of a key and a value, and each key must be unique for the resource. The following restrictions
     * apply to resource tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Although the maximum number of array members is 200, you can assign a maximum of 50 user-tags to one resource.
     * The remaining are reserved for Amazon Web Services use
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum length of a key is 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum length of a value is 256 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values can only contain alphanumeric characters, spaces, and any of the following: <code>_.:/=+@-</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values are case sensitive
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values are trimmed for any leading or trailing whitespaces
     * </p>
     * </li>
     * <li>
     * <p>
     * Don’t use <code>aws:</code> as a prefix for your keys. This prefix is reserved for Amazon Web Services use
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<ResourceTag> resourceTags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. For a list of supported resources, see <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_ResourceTag.html">ResourceTag</a>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource. For a list of supported resources, see <a
     *        href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_ResourceTag.html"
     *        >ResourceTag</a>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. For a list of supported resources, see <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_ResourceTag.html">ResourceTag</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource. For a list of supported resources, see <a
     *         href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_ResourceTag.html"
     *         >ResourceTag</a>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. For a list of supported resources, see <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_ResourceTag.html">ResourceTag</a>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource. For a list of supported resources, see <a
     *        href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_ResourceTag.html"
     *        >ResourceTag</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A list of tag key-value pairs to be added to the resource.
     * </p>
     * <p>
     * Each tag consists of a key and a value, and each key must be unique for the resource. The following restrictions
     * apply to resource tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Although the maximum number of array members is 200, you can assign a maximum of 50 user-tags to one resource.
     * The remaining are reserved for Amazon Web Services use
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum length of a key is 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum length of a value is 256 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values can only contain alphanumeric characters, spaces, and any of the following: <code>_.:/=+@-</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values are case sensitive
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values are trimmed for any leading or trailing whitespaces
     * </p>
     * </li>
     * <li>
     * <p>
     * Don’t use <code>aws:</code> as a prefix for your keys. This prefix is reserved for Amazon Web Services use
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of tag key-value pairs to be added to the resource.</p>
     *         <p>
     *         Each tag consists of a key and a value, and each key must be unique for the resource. The following
     *         restrictions apply to resource tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Although the maximum number of array members is 200, you can assign a maximum of 50 user-tags to one
     *         resource. The remaining are reserved for Amazon Web Services use
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The maximum length of a key is 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The maximum length of a value is 256 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Keys and values can only contain alphanumeric characters, spaces, and any of the following:
     *         <code>_.:/=+@-</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Keys and values are case sensitive
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Keys and values are trimmed for any leading or trailing whitespaces
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Don’t use <code>aws:</code> as a prefix for your keys. This prefix is reserved for Amazon Web Services
     *         use
     *         </p>
     *         </li>
     */

    public java.util.List<ResourceTag> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * A list of tag key-value pairs to be added to the resource.
     * </p>
     * <p>
     * Each tag consists of a key and a value, and each key must be unique for the resource. The following restrictions
     * apply to resource tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Although the maximum number of array members is 200, you can assign a maximum of 50 user-tags to one resource.
     * The remaining are reserved for Amazon Web Services use
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum length of a key is 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum length of a value is 256 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values can only contain alphanumeric characters, spaces, and any of the following: <code>_.:/=+@-</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values are case sensitive
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values are trimmed for any leading or trailing whitespaces
     * </p>
     * </li>
     * <li>
     * <p>
     * Don’t use <code>aws:</code> as a prefix for your keys. This prefix is reserved for Amazon Web Services use
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceTags
     *        A list of tag key-value pairs to be added to the resource.</p>
     *        <p>
     *        Each tag consists of a key and a value, and each key must be unique for the resource. The following
     *        restrictions apply to resource tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Although the maximum number of array members is 200, you can assign a maximum of 50 user-tags to one
     *        resource. The remaining are reserved for Amazon Web Services use
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The maximum length of a key is 128 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The maximum length of a value is 256 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys and values can only contain alphanumeric characters, spaces, and any of the following:
     *        <code>_.:/=+@-</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys and values are case sensitive
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys and values are trimmed for any leading or trailing whitespaces
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don’t use <code>aws:</code> as a prefix for your keys. This prefix is reserved for Amazon Web Services use
     *        </p>
     *        </li>
     */

    public void setResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new java.util.ArrayList<ResourceTag>(resourceTags);
    }

    /**
     * <p>
     * A list of tag key-value pairs to be added to the resource.
     * </p>
     * <p>
     * Each tag consists of a key and a value, and each key must be unique for the resource. The following restrictions
     * apply to resource tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Although the maximum number of array members is 200, you can assign a maximum of 50 user-tags to one resource.
     * The remaining are reserved for Amazon Web Services use
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum length of a key is 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum length of a value is 256 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values can only contain alphanumeric characters, spaces, and any of the following: <code>_.:/=+@-</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values are case sensitive
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values are trimmed for any leading or trailing whitespaces
     * </p>
     * </li>
     * <li>
     * <p>
     * Don’t use <code>aws:</code> as a prefix for your keys. This prefix is reserved for Amazon Web Services use
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        A list of tag key-value pairs to be added to the resource.</p>
     *        <p>
     *        Each tag consists of a key and a value, and each key must be unique for the resource. The following
     *        restrictions apply to resource tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Although the maximum number of array members is 200, you can assign a maximum of 50 user-tags to one
     *        resource. The remaining are reserved for Amazon Web Services use
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The maximum length of a key is 128 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The maximum length of a value is 256 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys and values can only contain alphanumeric characters, spaces, and any of the following:
     *        <code>_.:/=+@-</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys and values are case sensitive
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys and values are trimmed for any leading or trailing whitespaces
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don’t use <code>aws:</code> as a prefix for your keys. This prefix is reserved for Amazon Web Services use
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceTags(ResourceTag... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new java.util.ArrayList<ResourceTag>(resourceTags.length));
        }
        for (ResourceTag ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag key-value pairs to be added to the resource.
     * </p>
     * <p>
     * Each tag consists of a key and a value, and each key must be unique for the resource. The following restrictions
     * apply to resource tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Although the maximum number of array members is 200, you can assign a maximum of 50 user-tags to one resource.
     * The remaining are reserved for Amazon Web Services use
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum length of a key is 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum length of a value is 256 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values can only contain alphanumeric characters, spaces, and any of the following: <code>_.:/=+@-</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values are case sensitive
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys and values are trimmed for any leading or trailing whitespaces
     * </p>
     * </li>
     * <li>
     * <p>
     * Don’t use <code>aws:</code> as a prefix for your keys. This prefix is reserved for Amazon Web Services use
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceTags
     *        A list of tag key-value pairs to be added to the resource.</p>
     *        <p>
     *        Each tag consists of a key and a value, and each key must be unique for the resource. The following
     *        restrictions apply to resource tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Although the maximum number of array members is 200, you can assign a maximum of 50 user-tags to one
     *        resource. The remaining are reserved for Amazon Web Services use
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The maximum length of a key is 128 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The maximum length of a value is 256 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys and values can only contain alphanumeric characters, spaces, and any of the following:
     *        <code>_.:/=+@-</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys and values are case sensitive
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Keys and values are trimmed for any leading or trailing whitespaces
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don’t use <code>aws:</code> as a prefix for your keys. This prefix is reserved for Amazon Web Services use
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceTags(java.util.Collection<ResourceTag> resourceTags) {
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

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
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
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
