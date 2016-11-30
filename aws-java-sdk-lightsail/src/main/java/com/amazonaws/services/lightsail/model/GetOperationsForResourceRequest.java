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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetOperationsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource for which you are requesting information.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * A token used for advancing to the next page of results from your get operations for resource request.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The name of the resource for which you are requesting information.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource for which you are requesting information.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource for which you are requesting information.
     * </p>
     * 
     * @return The name of the resource for which you are requesting information.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource for which you are requesting information.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource for which you are requesting information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOperationsForResourceRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get operations for resource request.
     * </p>
     * 
     * @param pageToken
     *        A token used for advancing to the next page of results from your get operations for resource request.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get operations for resource request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get operations for resource request.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get operations for resource request.
     * </p>
     * 
     * @param pageToken
     *        A token used for advancing to the next page of results from your get operations for resource request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOperationsForResourceRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
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
        if (getResourceName() != null)
            sb.append("ResourceName: " + getResourceName() + ",");
        if (getPageToken() != null)
            sb.append("PageToken: " + getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOperationsForResourceRequest == false)
            return false;
        GetOperationsForResourceRequest other = (GetOperationsForResourceRequest) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetOperationsForResourceRequest clone() {
        return (GetOperationsForResourceRequest) super.clone();
    }
}
