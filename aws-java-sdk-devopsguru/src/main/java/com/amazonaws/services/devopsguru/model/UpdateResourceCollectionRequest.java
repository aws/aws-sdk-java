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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateResourceCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResourceCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies if the resource collection in the request is added or deleted to the resource collection.
     * </p>
     */
    private String action;

    private UpdateResourceCollectionFilter resourceCollection;

    /**
     * <p>
     * Specifies if the resource collection in the request is added or deleted to the resource collection.
     * </p>
     * 
     * @param action
     *        Specifies if the resource collection in the request is added or deleted to the resource collection.
     * @see UpdateResourceCollectionAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies if the resource collection in the request is added or deleted to the resource collection.
     * </p>
     * 
     * @return Specifies if the resource collection in the request is added or deleted to the resource collection.
     * @see UpdateResourceCollectionAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies if the resource collection in the request is added or deleted to the resource collection.
     * </p>
     * 
     * @param action
     *        Specifies if the resource collection in the request is added or deleted to the resource collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateResourceCollectionAction
     */

    public UpdateResourceCollectionRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies if the resource collection in the request is added or deleted to the resource collection.
     * </p>
     * 
     * @param action
     *        Specifies if the resource collection in the request is added or deleted to the resource collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateResourceCollectionAction
     */

    public UpdateResourceCollectionRequest withAction(UpdateResourceCollectionAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * @param resourceCollection
     */

    public void setResourceCollection(UpdateResourceCollectionFilter resourceCollection) {
        this.resourceCollection = resourceCollection;
    }

    /**
     * @return
     */

    public UpdateResourceCollectionFilter getResourceCollection() {
        return this.resourceCollection;
    }

    /**
     * @param resourceCollection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceCollectionRequest withResourceCollection(UpdateResourceCollectionFilter resourceCollection) {
        setResourceCollection(resourceCollection);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getResourceCollection() != null)
            sb.append("ResourceCollection: ").append(getResourceCollection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResourceCollectionRequest == false)
            return false;
        UpdateResourceCollectionRequest other = (UpdateResourceCollectionRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getResourceCollection() == null ^ this.getResourceCollection() == null)
            return false;
        if (other.getResourceCollection() != null && other.getResourceCollection().equals(this.getResourceCollection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResourceCollectionRequest clone() {
        return (UpdateResourceCollectionRequest) super.clone();
    }

}
