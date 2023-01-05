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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UntagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. For a list of supported resources, see <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_ResourceTag.html">ResourceTag</a>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A list of tag keys associated with tags that need to be removed from the resource. If you specify a tag key that
     * doesn't exist, it's ignored. Although the maximum number of array members is 200, user-tag maximum is 50. The
     * remaining are reserved for Amazon Web Services use.
     * </p>
     */
    private java.util.List<String> resourceTagKeys;

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

    public UntagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A list of tag keys associated with tags that need to be removed from the resource. If you specify a tag key that
     * doesn't exist, it's ignored. Although the maximum number of array members is 200, user-tag maximum is 50. The
     * remaining are reserved for Amazon Web Services use.
     * </p>
     * 
     * @return A list of tag keys associated with tags that need to be removed from the resource. If you specify a tag
     *         key that doesn't exist, it's ignored. Although the maximum number of array members is 200, user-tag
     *         maximum is 50. The remaining are reserved for Amazon Web Services use.
     */

    public java.util.List<String> getResourceTagKeys() {
        return resourceTagKeys;
    }

    /**
     * <p>
     * A list of tag keys associated with tags that need to be removed from the resource. If you specify a tag key that
     * doesn't exist, it's ignored. Although the maximum number of array members is 200, user-tag maximum is 50. The
     * remaining are reserved for Amazon Web Services use.
     * </p>
     * 
     * @param resourceTagKeys
     *        A list of tag keys associated with tags that need to be removed from the resource. If you specify a tag
     *        key that doesn't exist, it's ignored. Although the maximum number of array members is 200, user-tag
     *        maximum is 50. The remaining are reserved for Amazon Web Services use.
     */

    public void setResourceTagKeys(java.util.Collection<String> resourceTagKeys) {
        if (resourceTagKeys == null) {
            this.resourceTagKeys = null;
            return;
        }

        this.resourceTagKeys = new java.util.ArrayList<String>(resourceTagKeys);
    }

    /**
     * <p>
     * A list of tag keys associated with tags that need to be removed from the resource. If you specify a tag key that
     * doesn't exist, it's ignored. Although the maximum number of array members is 200, user-tag maximum is 50. The
     * remaining are reserved for Amazon Web Services use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTagKeys(java.util.Collection)} or {@link #withResourceTagKeys(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceTagKeys
     *        A list of tag keys associated with tags that need to be removed from the resource. If you specify a tag
     *        key that doesn't exist, it's ignored. Although the maximum number of array members is 200, user-tag
     *        maximum is 50. The remaining are reserved for Amazon Web Services use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withResourceTagKeys(String... resourceTagKeys) {
        if (this.resourceTagKeys == null) {
            setResourceTagKeys(new java.util.ArrayList<String>(resourceTagKeys.length));
        }
        for (String ele : resourceTagKeys) {
            this.resourceTagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag keys associated with tags that need to be removed from the resource. If you specify a tag key that
     * doesn't exist, it's ignored. Although the maximum number of array members is 200, user-tag maximum is 50. The
     * remaining are reserved for Amazon Web Services use.
     * </p>
     * 
     * @param resourceTagKeys
     *        A list of tag keys associated with tags that need to be removed from the resource. If you specify a tag
     *        key that doesn't exist, it's ignored. Although the maximum number of array members is 200, user-tag
     *        maximum is 50. The remaining are reserved for Amazon Web Services use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withResourceTagKeys(java.util.Collection<String> resourceTagKeys) {
        setResourceTagKeys(resourceTagKeys);
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
        if (getResourceTagKeys() != null)
            sb.append("ResourceTagKeys: ").append(getResourceTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceTagKeys() == null ^ this.getResourceTagKeys() == null)
            return false;
        if (other.getResourceTagKeys() != null && other.getResourceTagKeys().equals(this.getResourceTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceTagKeys() == null) ? 0 : getResourceTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public UntagResourceRequest clone() {
        return (UntagResourceRequest) super.clone();
    }

}
