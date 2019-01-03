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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchCheckLayerAvailability" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCheckLayerAvailabilityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of image layer objects corresponding to the image layer references in the request.
     * </p>
     */
    private java.util.List<Layer> layers;
    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private java.util.List<LayerFailure> failures;

    /**
     * <p>
     * A list of image layer objects corresponding to the image layer references in the request.
     * </p>
     * 
     * @return A list of image layer objects corresponding to the image layer references in the request.
     */

    public java.util.List<Layer> getLayers() {
        return layers;
    }

    /**
     * <p>
     * A list of image layer objects corresponding to the image layer references in the request.
     * </p>
     * 
     * @param layers
     *        A list of image layer objects corresponding to the image layer references in the request.
     */

    public void setLayers(java.util.Collection<Layer> layers) {
        if (layers == null) {
            this.layers = null;
            return;
        }

        this.layers = new java.util.ArrayList<Layer>(layers);
    }

    /**
     * <p>
     * A list of image layer objects corresponding to the image layer references in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayers(java.util.Collection)} or {@link #withLayers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param layers
     *        A list of image layer objects corresponding to the image layer references in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCheckLayerAvailabilityResult withLayers(Layer... layers) {
        if (this.layers == null) {
            setLayers(new java.util.ArrayList<Layer>(layers.length));
        }
        for (Layer ele : layers) {
            this.layers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of image layer objects corresponding to the image layer references in the request.
     * </p>
     * 
     * @param layers
     *        A list of image layer objects corresponding to the image layer references in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCheckLayerAvailabilityResult withLayers(java.util.Collection<Layer> layers) {
        setLayers(layers);
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @return Any failures associated with the call.
     */

    public java.util.List<LayerFailure> getFailures() {
        return failures;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     */

    public void setFailures(java.util.Collection<LayerFailure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<LayerFailure>(failures);
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCheckLayerAvailabilityResult withFailures(LayerFailure... failures) {
        if (this.failures == null) {
            setFailures(new java.util.ArrayList<LayerFailure>(failures.length));
        }
        for (LayerFailure ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCheckLayerAvailabilityResult withFailures(java.util.Collection<LayerFailure> failures) {
        setFailures(failures);
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
            sb.append("Layers: ").append(getLayers()).append(",");
        if (getFailures() != null)
            sb.append("Failures: ").append(getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCheckLayerAvailabilityResult == false)
            return false;
        BatchCheckLayerAvailabilityResult other = (BatchCheckLayerAvailabilityResult) obj;
        if (other.getLayers() == null ^ this.getLayers() == null)
            return false;
        if (other.getLayers() != null && other.getLayers().equals(this.getLayers()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayers() == null) ? 0 : getLayers().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public BatchCheckLayerAvailabilityResult clone() {
        try {
            return (BatchCheckLayerAvailabilityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
