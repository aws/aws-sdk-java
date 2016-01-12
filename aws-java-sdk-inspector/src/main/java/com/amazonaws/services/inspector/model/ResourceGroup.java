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

/**
 * <p>
 * Contains information about a resource group. The resource group defines a set
 * of tags that, when queried, identify the AWS resources that comprise the
 * application.
 * </p>
 * <p>
 * This data type is used as the response element in the
 * <a>DescribeResourceGroup</a> action.
 * </p>
 */
public class ResourceGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the resource group.
     * </p>
     */
    private String resourceGroupArn;
    /**
     * <p>
     * The tags (key and value pairs) of the resource group.
     * </p>
     * <p>
     * This data type property is used in the <a>CreateResourceGroup</a> action.
     * </p>
     * <p>
     * A collection of keys and an array of possible values in JSON format.
     * </p>
     * <p>
     * For example, [{ "key1" : ["Value1","Value2"]},{"Key2": ["Value3"]}]
     * </p>
     */
    private String resourceGroupTags;

    /**
     * <p>
     * The ARN of the resource group.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN of the resource group.
     */
    public void setResourceGroupArn(String resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the resource group.
     * </p>
     * 
     * @return The ARN of the resource group.
     */
    public String getResourceGroupArn() {
        return this.resourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the resource group.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN of the resource group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceGroup withResourceGroupArn(String resourceGroupArn) {
        setResourceGroupArn(resourceGroupArn);
        return this;
    }

    /**
     * <p>
     * The tags (key and value pairs) of the resource group.
     * </p>
     * <p>
     * This data type property is used in the <a>CreateResourceGroup</a> action.
     * </p>
     * <p>
     * A collection of keys and an array of possible values in JSON format.
     * </p>
     * <p>
     * For example, [{ "key1" : ["Value1","Value2"]},{"Key2": ["Value3"]}]
     * </p>
     * 
     * @param resourceGroupTags
     *        The tags (key and value pairs) of the resource group.</p>
     *        <p>
     *        This data type property is used in the <a>CreateResourceGroup</a>
     *        action.
     *        </p>
     *        <p>
     *        A collection of keys and an array of possible values in JSON
     *        format.
     *        </p>
     *        <p>
     *        For example, [{ "key1" : ["Value1","Value2"]},{"Key2":
     *        ["Value3"]}]
     */
    public void setResourceGroupTags(String resourceGroupTags) {
        this.resourceGroupTags = resourceGroupTags;
    }

    /**
     * <p>
     * The tags (key and value pairs) of the resource group.
     * </p>
     * <p>
     * This data type property is used in the <a>CreateResourceGroup</a> action.
     * </p>
     * <p>
     * A collection of keys and an array of possible values in JSON format.
     * </p>
     * <p>
     * For example, [{ "key1" : ["Value1","Value2"]},{"Key2": ["Value3"]}]
     * </p>
     * 
     * @return The tags (key and value pairs) of the resource group.</p>
     *         <p>
     *         This data type property is used in the <a>CreateResourceGroup</a>
     *         action.
     *         </p>
     *         <p>
     *         A collection of keys and an array of possible values in JSON
     *         format.
     *         </p>
     *         <p>
     *         For example, [{ "key1" : ["Value1","Value2"]},{"Key2":
     *         ["Value3"]}]
     */
    public String getResourceGroupTags() {
        return this.resourceGroupTags;
    }

    /**
     * <p>
     * The tags (key and value pairs) of the resource group.
     * </p>
     * <p>
     * This data type property is used in the <a>CreateResourceGroup</a> action.
     * </p>
     * <p>
     * A collection of keys and an array of possible values in JSON format.
     * </p>
     * <p>
     * For example, [{ "key1" : ["Value1","Value2"]},{"Key2": ["Value3"]}]
     * </p>
     * 
     * @param resourceGroupTags
     *        The tags (key and value pairs) of the resource group.</p>
     *        <p>
     *        This data type property is used in the <a>CreateResourceGroup</a>
     *        action.
     *        </p>
     *        <p>
     *        A collection of keys and an array of possible values in JSON
     *        format.
     *        </p>
     *        <p>
     *        For example, [{ "key1" : ["Value1","Value2"]},{"Key2":
     *        ["Value3"]}]
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceGroup withResourceGroupTags(String resourceGroupTags) {
        setResourceGroupTags(resourceGroupTags);
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
            sb.append("ResourceGroupArn: " + getResourceGroupArn() + ",");
        if (getResourceGroupTags() != null)
            sb.append("ResourceGroupTags: " + getResourceGroupTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceGroup == false)
            return false;
        ResourceGroup other = (ResourceGroup) obj;
        if (other.getResourceGroupArn() == null
                ^ this.getResourceGroupArn() == null)
            return false;
        if (other.getResourceGroupArn() != null
                && other.getResourceGroupArn().equals(
                        this.getResourceGroupArn()) == false)
            return false;
        if (other.getResourceGroupTags() == null
                ^ this.getResourceGroupTags() == null)
            return false;
        if (other.getResourceGroupTags() != null
                && other.getResourceGroupTags().equals(
                        this.getResourceGroupTags()) == false)
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
        hashCode = prime
                * hashCode
                + ((getResourceGroupTags() == null) ? 0
                        : getResourceGroupTags().hashCode());
        return hashCode;
    }

    @Override
    public ResourceGroup clone() {
        try {
            return (ResourceGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}