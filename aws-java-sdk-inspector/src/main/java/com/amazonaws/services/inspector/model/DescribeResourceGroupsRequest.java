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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeResourceGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourceGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that specifies the resource group that you want to describe.
     * </p>
     */
    private java.util.List<String> resourceGroupArns;

    /**
     * <p>
     * The ARN that specifies the resource group that you want to describe.
     * </p>
     * 
     * @return The ARN that specifies the resource group that you want to describe.
     */

    public java.util.List<String> getResourceGroupArns() {
        return resourceGroupArns;
    }

    /**
     * <p>
     * The ARN that specifies the resource group that you want to describe.
     * </p>
     * 
     * @param resourceGroupArns
     *        The ARN that specifies the resource group that you want to describe.
     */

    public void setResourceGroupArns(java.util.Collection<String> resourceGroupArns) {
        if (resourceGroupArns == null) {
            this.resourceGroupArns = null;
            return;
        }

        this.resourceGroupArns = new java.util.ArrayList<String>(resourceGroupArns);
    }

    /**
     * <p>
     * The ARN that specifies the resource group that you want to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceGroupArns(java.util.Collection)} or {@link #withResourceGroupArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceGroupArns
     *        The ARN that specifies the resource group that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceGroupsRequest withResourceGroupArns(String... resourceGroupArns) {
        if (this.resourceGroupArns == null) {
            setResourceGroupArns(new java.util.ArrayList<String>(resourceGroupArns.length));
        }
        for (String ele : resourceGroupArns) {
            this.resourceGroupArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN that specifies the resource group that you want to describe.
     * </p>
     * 
     * @param resourceGroupArns
     *        The ARN that specifies the resource group that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceGroupsRequest withResourceGroupArns(java.util.Collection<String> resourceGroupArns) {
        setResourceGroupArns(resourceGroupArns);
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
        if (getResourceGroupArns() != null)
            sb.append("ResourceGroupArns: ").append(getResourceGroupArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResourceGroupsRequest == false)
            return false;
        DescribeResourceGroupsRequest other = (DescribeResourceGroupsRequest) obj;
        if (other.getResourceGroupArns() == null ^ this.getResourceGroupArns() == null)
            return false;
        if (other.getResourceGroupArns() != null && other.getResourceGroupArns().equals(this.getResourceGroupArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceGroupArns() == null) ? 0 : getResourceGroupArns().hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourceGroupsRequest clone() {
        return (DescribeResourceGroupsRequest) super.clone();
    }

}
