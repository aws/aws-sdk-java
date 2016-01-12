/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeResourceGroupRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN specifying the resource group that you want to describe.
     * </p>
     */
    private String resourceGroupArn;

    /**
     * <p>
     * The ARN specifying the resource group that you want to describe.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN specifying the resource group that you want to describe.
     */
    public void setResourceGroupArn(String resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
    }

    /**
     * <p>
     * The ARN specifying the resource group that you want to describe.
     * </p>
     * 
     * @return The ARN specifying the resource group that you want to describe.
     */
    public String getResourceGroupArn() {
        return this.resourceGroupArn;
    }

    /**
     * <p>
     * The ARN specifying the resource group that you want to describe.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN specifying the resource group that you want to describe.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeResourceGroupRequest withResourceGroupArn(
            String resourceGroupArn) {
        setResourceGroupArn(resourceGroupArn);
        return this;
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
        if (getResourceGroupArn() != null)
            sb.append("ResourceGroupArn: " + getResourceGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResourceGroupRequest == false)
            return false;
        DescribeResourceGroupRequest other = (DescribeResourceGroupRequest) obj;
        if (other.getResourceGroupArn() == null
                ^ this.getResourceGroupArn() == null)
            return false;
        if (other.getResourceGroupArn() != null
                && other.getResourceGroupArn().equals(
                        this.getResourceGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceGroupArn() == null) ? 0 : getResourceGroupArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourceGroupRequest clone() {
        return (DescribeResourceGroupRequest) super.clone();
    }
}