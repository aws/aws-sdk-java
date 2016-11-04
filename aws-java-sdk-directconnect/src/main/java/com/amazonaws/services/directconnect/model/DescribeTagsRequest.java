/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the DescribeTags operation.
 * </p>
 */
public class DescribeTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Direct Connect resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceArns;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Direct Connect resources.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the Direct Connect resources.
     */

    public java.util.List<String> getResourceArns() {
        if (resourceArns == null) {
            resourceArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Direct Connect resources.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARNs) of the Direct Connect resources.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new com.amazonaws.internal.SdkInternalList<String>(resourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Direct Connect resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARNs) of the Direct Connect resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new com.amazonaws.internal.SdkInternalList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Direct Connect resources.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARNs) of the Direct Connect resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceArns() != null)
            sb.append("ResourceArns: " + getResourceArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTagsRequest == false)
            return false;
        DescribeTagsRequest other = (DescribeTagsRequest) obj;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTagsRequest clone() {
        return (DescribeTagsRequest) super.clone();
    }
}
