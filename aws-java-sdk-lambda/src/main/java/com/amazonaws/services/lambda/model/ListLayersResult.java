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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLayersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token returned when the response doesn't contain all layers.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * A list of function layers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LayersListItem> layers;

    /**
     * <p>
     * A pagination token returned when the response doesn't contain all layers.
     * </p>
     * 
     * @param nextMarker
     *        A pagination token returned when the response doesn't contain all layers.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A pagination token returned when the response doesn't contain all layers.
     * </p>
     * 
     * @return A pagination token returned when the response doesn't contain all layers.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * A pagination token returned when the response doesn't contain all layers.
     * </p>
     * 
     * @param nextMarker
     *        A pagination token returned when the response doesn't contain all layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayersResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * A list of function layers.
     * </p>
     * 
     * @return A list of function layers.
     */

    public java.util.List<LayersListItem> getLayers() {
        if (layers == null) {
            layers = new com.amazonaws.internal.SdkInternalList<LayersListItem>();
        }
        return layers;
    }

    /**
     * <p>
     * A list of function layers.
     * </p>
     * 
     * @param layers
     *        A list of function layers.
     */

    public void setLayers(java.util.Collection<LayersListItem> layers) {
        if (layers == null) {
            this.layers = null;
            return;
        }

        this.layers = new com.amazonaws.internal.SdkInternalList<LayersListItem>(layers);
    }

    /**
     * <p>
     * A list of function layers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayers(java.util.Collection)} or {@link #withLayers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param layers
     *        A list of function layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayersResult withLayers(LayersListItem... layers) {
        if (this.layers == null) {
            setLayers(new com.amazonaws.internal.SdkInternalList<LayersListItem>(layers.length));
        }
        for (LayersListItem ele : layers) {
            this.layers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of function layers.
     * </p>
     * 
     * @param layers
     *        A list of function layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayersResult withLayers(java.util.Collection<LayersListItem> layers) {
        setLayers(layers);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getLayers() != null)
            sb.append("Layers: ").append(getLayers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLayersResult == false)
            return false;
        ListLayersResult other = (ListLayersResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getLayers() == null ^ this.getLayers() == null)
            return false;
        if (other.getLayers() != null && other.getLayers().equals(this.getLayers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getLayers() == null) ? 0 : getLayers().hashCode());
        return hashCode;
    }

    @Override
    public ListLayersResult clone() {
        try {
            return (ListLayersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
