/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure containing information about an AWS Lake Formation resource.
     * </p>
     */
    private ResourceInfo resourceInfo;

    /**
     * <p>
     * A structure containing information about an AWS Lake Formation resource.
     * </p>
     * 
     * @param resourceInfo
     *        A structure containing information about an AWS Lake Formation resource.
     */

    public void setResourceInfo(ResourceInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    /**
     * <p>
     * A structure containing information about an AWS Lake Formation resource.
     * </p>
     * 
     * @return A structure containing information about an AWS Lake Formation resource.
     */

    public ResourceInfo getResourceInfo() {
        return this.resourceInfo;
    }

    /**
     * <p>
     * A structure containing information about an AWS Lake Formation resource.
     * </p>
     * 
     * @param resourceInfo
     *        A structure containing information about an AWS Lake Formation resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceResult withResourceInfo(ResourceInfo resourceInfo) {
        setResourceInfo(resourceInfo);
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
        if (getResourceInfo() != null)
            sb.append("ResourceInfo: ").append(getResourceInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResourceResult == false)
            return false;
        DescribeResourceResult other = (DescribeResourceResult) obj;
        if (other.getResourceInfo() == null ^ this.getResourceInfo() == null)
            return false;
        if (other.getResourceInfo() != null && other.getResourceInfo().equals(this.getResourceInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceInfo() == null) ? 0 : getResourceInfo().hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourceResult clone() {
        try {
            return (DescribeResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
