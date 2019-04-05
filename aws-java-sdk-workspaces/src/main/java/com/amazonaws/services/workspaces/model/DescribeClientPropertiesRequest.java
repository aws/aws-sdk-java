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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeClientProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClientPropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The resource identifier, in the form of directory IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceIds;

    /**
     * <p>
     * The resource identifier, in the form of directory IDs.
     * </p>
     * 
     * @return The resource identifier, in the form of directory IDs.
     */

    public java.util.List<String> getResourceIds() {
        if (resourceIds == null) {
            resourceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceIds;
    }

    /**
     * <p>
     * The resource identifier, in the form of directory IDs.
     * </p>
     * 
     * @param resourceIds
     *        The resource identifier, in the form of directory IDs.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new com.amazonaws.internal.SdkInternalList<String>(resourceIds);
    }

    /**
     * <p>
     * The resource identifier, in the form of directory IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The resource identifier, in the form of directory IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientPropertiesRequest withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new com.amazonaws.internal.SdkInternalList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource identifier, in the form of directory IDs.
     * </p>
     * 
     * @param resourceIds
     *        The resource identifier, in the form of directory IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientPropertiesRequest withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
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
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClientPropertiesRequest == false)
            return false;
        DescribeClientPropertiesRequest other = (DescribeClientPropertiesRequest) obj;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClientPropertiesRequest clone() {
        return (DescribeClientPropertiesRequest) super.clone();
    }

}
