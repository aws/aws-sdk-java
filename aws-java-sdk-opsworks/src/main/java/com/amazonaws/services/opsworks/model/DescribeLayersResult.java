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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeLayers</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeLayers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLayersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>Layer</code> objects that describe the layers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Layer> layers;

    /**
     * <p>
     * An array of <code>Layer</code> objects that describe the layers.
     * </p>
     * 
     * @return An array of <code>Layer</code> objects that describe the layers.
     */

    public java.util.List<Layer> getLayers() {
        if (layers == null) {
            layers = new com.amazonaws.internal.SdkInternalList<Layer>();
        }
        return layers;
    }

    /**
     * <p>
     * An array of <code>Layer</code> objects that describe the layers.
     * </p>
     * 
     * @param layers
     *        An array of <code>Layer</code> objects that describe the layers.
     */

    public void setLayers(java.util.Collection<Layer> layers) {
        if (layers == null) {
            this.layers = null;
            return;
        }

        this.layers = new com.amazonaws.internal.SdkInternalList<Layer>(layers);
    }

    /**
     * <p>
     * An array of <code>Layer</code> objects that describe the layers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayers(java.util.Collection)} or {@link #withLayers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param layers
     *        An array of <code>Layer</code> objects that describe the layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLayersResult withLayers(Layer... layers) {
        if (this.layers == null) {
            setLayers(new com.amazonaws.internal.SdkInternalList<Layer>(layers.length));
        }
        for (Layer ele : layers) {
            this.layers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Layer</code> objects that describe the layers.
     * </p>
     * 
     * @param layers
     *        An array of <code>Layer</code> objects that describe the layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLayersResult withLayers(java.util.Collection<Layer> layers) {
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

        if (obj instanceof DescribeLayersResult == false)
            return false;
        DescribeLayersResult other = (DescribeLayersResult) obj;
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

        hashCode = prime * hashCode + ((getLayers() == null) ? 0 : getLayers().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLayersResult clone() {
        try {
            return (DescribeLayersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
