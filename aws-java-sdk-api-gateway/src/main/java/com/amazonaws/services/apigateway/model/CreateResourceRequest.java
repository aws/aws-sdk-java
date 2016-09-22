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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Requests Amazon API Gateway to create a <a>Resource</a> resource.
 * </p>
 */
public class CreateResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>RestApi</a> for the resource.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The parent resource's identifier.
     * </p>
     */
    private String parentId;
    /**
     * <p>
     * The last path segment for this resource.
     * </p>
     */
    private String pathPart;

    /**
     * <p>
     * The identifier of the <a>RestApi</a> for the resource.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> for the resource.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> for the resource.
     * </p>
     * 
     * @return The identifier of the <a>RestApi</a> for the resource.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> for the resource.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The parent resource's identifier.
     * </p>
     * 
     * @param parentId
     *        The parent resource's identifier.
     */

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * The parent resource's identifier.
     * </p>
     * 
     * @return The parent resource's identifier.
     */

    public String getParentId() {
        return this.parentId;
    }

    /**
     * <p>
     * The parent resource's identifier.
     * </p>
     * 
     * @param parentId
     *        The parent resource's identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceRequest withParentId(String parentId) {
        setParentId(parentId);
        return this;
    }

    /**
     * <p>
     * The last path segment for this resource.
     * </p>
     * 
     * @param pathPart
     *        The last path segment for this resource.
     */

    public void setPathPart(String pathPart) {
        this.pathPart = pathPart;
    }

    /**
     * <p>
     * The last path segment for this resource.
     * </p>
     * 
     * @return The last path segment for this resource.
     */

    public String getPathPart() {
        return this.pathPart;
    }

    /**
     * <p>
     * The last path segment for this resource.
     * </p>
     * 
     * @param pathPart
     *        The last path segment for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceRequest withPathPart(String pathPart) {
        setPathPart(pathPart);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getParentId() != null)
            sb.append("ParentId: " + getParentId() + ",");
        if (getPathPart() != null)
            sb.append("PathPart: " + getPathPart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceRequest == false)
            return false;
        CreateResourceRequest other = (CreateResourceRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getPathPart() == null ^ this.getPathPart() == null)
            return false;
        if (other.getPathPart() != null && other.getPathPart().equals(this.getPathPart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getPathPart() == null) ? 0 : getPathPart().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourceRequest clone() {
        return (CreateResourceRequest) super.clone();
    }
}
