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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListDeviceResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeviceResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A structure defining the resource's type, Amazon Resource Name (ARN), and ID.
     * </p>
     */
    private java.util.List<ResourceSummary> resources;

    /**
     * <p>
     * A pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of results.
     * </p>
     * 
     * @return A pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceResourcesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A structure defining the resource's type, Amazon Resource Name (ARN), and ID.
     * </p>
     * 
     * @return A structure defining the resource's type, Amazon Resource Name (ARN), and ID.
     */

    public java.util.List<ResourceSummary> getResources() {
        return resources;
    }

    /**
     * <p>
     * A structure defining the resource's type, Amazon Resource Name (ARN), and ID.
     * </p>
     * 
     * @param resources
     *        A structure defining the resource's type, Amazon Resource Name (ARN), and ID.
     */

    public void setResources(java.util.Collection<ResourceSummary> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<ResourceSummary>(resources);
    }

    /**
     * <p>
     * A structure defining the resource's type, Amazon Resource Name (ARN), and ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        A structure defining the resource's type, Amazon Resource Name (ARN), and ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceResourcesResult withResources(ResourceSummary... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<ResourceSummary>(resources.length));
        }
        for (ResourceSummary ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure defining the resource's type, Amazon Resource Name (ARN), and ID.
     * </p>
     * 
     * @param resources
     *        A structure defining the resource's type, Amazon Resource Name (ARN), and ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceResourcesResult withResources(java.util.Collection<ResourceSummary> resources) {
        setResources(resources);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeviceResourcesResult == false)
            return false;
        ListDeviceResourcesResult other = (ListDeviceResourcesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public ListDeviceResourcesResult clone() {
        try {
            return (ListDeviceResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
