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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
 * </p>
 * <div class="seeAlso"><a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/stages.html">Deploying API
 * in Stages</a></div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     */
    private java.util.List<Stage> item;

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     * 
     * @return The current page of elements from this collection.
     */

    public java.util.List<Stage> getItem() {
        return item;
    }

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     * 
     * @param item
     *        The current page of elements from this collection.
     */

    public void setItem(java.util.Collection<Stage> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<Stage>(item);
    }

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItem(java.util.Collection)} or {@link #withItem(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param item
     *        The current page of elements from this collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStagesResult withItem(Stage... item) {
        if (this.item == null) {
            setItem(new java.util.ArrayList<Stage>(item.length));
        }
        for (Stage ele : item) {
            this.item.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current page of elements from this collection.
     * </p>
     * 
     * @param item
     *        The current page of elements from this collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStagesResult withItem(java.util.Collection<Stage> item) {
        setItem(item);
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
        if (getItem() != null)
            sb.append("Item: ").append(getItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStagesResult == false)
            return false;
        GetStagesResult other = (GetStagesResult) obj;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        return hashCode;
    }

    @Override
    public GetStagesResult clone() {
        try {
            return (GetStagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
