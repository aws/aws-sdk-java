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

/**
 * <p>
 * Represents a collection of <a>Authorizer</a> resources.
 * </p>
 * <div class="seeAlso"> <a
 * href="http://docs.aws.amazon.com/apigateway/latest/developerguide/use-custom-authorizer.html">Enable custom
 * authorization</a> </div>
 */
public class GetAuthorizersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String position;
    /**
     * <p>
     * Gets the current list of <a>Authorizer</a> resources in the collection.
     * </p>
     */
    private java.util.List<Authorizer> items;

    /**
     * @param position
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * @param position
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizersResult withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * Gets the current list of <a>Authorizer</a> resources in the collection.
     * </p>
     * 
     * @return Gets the current list of <a>Authorizer</a> resources in the collection.
     */

    public java.util.List<Authorizer> getItems() {
        return items;
    }

    /**
     * <p>
     * Gets the current list of <a>Authorizer</a> resources in the collection.
     * </p>
     * 
     * @param items
     *        Gets the current list of <a>Authorizer</a> resources in the collection.
     */

    public void setItems(java.util.Collection<Authorizer> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<Authorizer>(items);
    }

    /**
     * <p>
     * Gets the current list of <a>Authorizer</a> resources in the collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Gets the current list of <a>Authorizer</a> resources in the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizersResult withItems(Authorizer... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<Authorizer>(items.length));
        }
        for (Authorizer ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Gets the current list of <a>Authorizer</a> resources in the collection.
     * </p>
     * 
     * @param items
     *        Gets the current list of <a>Authorizer</a> resources in the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizersResult withItems(java.util.Collection<Authorizer> items) {
        setItems(items);
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
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthorizersResult == false)
            return false;
        GetAuthorizersResult other = (GetAuthorizersResult) obj;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public GetAuthorizersResult clone() {
        try {
            return (GetAuthorizersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
