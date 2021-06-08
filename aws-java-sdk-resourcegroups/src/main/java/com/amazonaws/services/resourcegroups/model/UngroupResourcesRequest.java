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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UngroupResources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UngroupResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or the ARN of the resource group from which to remove the resources.
     * </p>
     */
    private String group;
    /**
     * <p>
     * The ARNs of the resources to be removed from the group.
     * </p>
     */
    private java.util.List<String> resourceArns;

    /**
     * <p>
     * The name or the ARN of the resource group from which to remove the resources.
     * </p>
     * 
     * @param group
     *        The name or the ARN of the resource group from which to remove the resources.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name or the ARN of the resource group from which to remove the resources.
     * </p>
     * 
     * @return The name or the ARN of the resource group from which to remove the resources.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name or the ARN of the resource group from which to remove the resources.
     * </p>
     * 
     * @param group
     *        The name or the ARN of the resource group from which to remove the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UngroupResourcesRequest withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The ARNs of the resources to be removed from the group.
     * </p>
     * 
     * @return The ARNs of the resources to be removed from the group.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The ARNs of the resources to be removed from the group.
     * </p>
     * 
     * @param resourceArns
     *        The ARNs of the resources to be removed from the group.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The ARNs of the resources to be removed from the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        The ARNs of the resources to be removed from the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UngroupResourcesRequest withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the resources to be removed from the group.
     * </p>
     * 
     * @param resourceArns
     *        The ARNs of the resources to be removed from the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UngroupResourcesRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
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
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UngroupResourcesRequest == false)
            return false;
        UngroupResourcesRequest other = (UngroupResourcesRequest) obj;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        return hashCode;
    }

    @Override
    public UngroupResourcesRequest clone() {
        return (UngroupResourcesRequest) super.clone();
    }

}
