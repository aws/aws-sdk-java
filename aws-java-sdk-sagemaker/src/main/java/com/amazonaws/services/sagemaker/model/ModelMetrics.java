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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metrics captured from a model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Metrics that measure the quality of a model.
     * </p>
     */
    private ModelQuality modelQuality;
    /**
     * <p>
     * Metrics that measure the quality of the input data for a model.
     * </p>
     */
    private ModelDataQuality modelDataQuality;
    /**
     * <p>
     * Metrics that measure bais in a model.
     * </p>
     */
    private Bias bias;
    /**
     * <p>
     * Metrics that help explain a model.
     * </p>
     */
    private Explainability explainability;

    /**
     * <p>
     * Metrics that measure the quality of a model.
     * </p>
     * 
     * @param modelQuality
     *        Metrics that measure the quality of a model.
     */

    public void setModelQuality(ModelQuality modelQuality) {
        this.modelQuality = modelQuality;
    }

    /**
     * <p>
     * Metrics that measure the quality of a model.
     * </p>
     * 
     * @return Metrics that measure the quality of a model.
     */

    public ModelQuality getModelQuality() {
        return this.modelQuality;
    }

    /**
     * <p>
     * Metrics that measure the quality of a model.
     * </p>
     * 
     * @param modelQuality
     *        Metrics that measure the quality of a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetrics withModelQuality(ModelQuality modelQuality) {
        setModelQuality(modelQuality);
        return this;
    }

    /**
     * <p>
     * Metrics that measure the quality of the input data for a model.
     * </p>
     * 
     * @param modelDataQuality
     *        Metrics that measure the quality of the input data for a model.
     */

    public void setModelDataQuality(ModelDataQuality modelDataQuality) {
        this.modelDataQuality = modelDataQuality;
    }

    /**
     * <p>
     * Metrics that measure the quality of the input data for a model.
     * </p>
     * 
     * @return Metrics that measure the quality of the input data for a model.
     */

    public ModelDataQuality getModelDataQuality() {
        return this.modelDataQuality;
    }

    /**
     * <p>
     * Metrics that measure the quality of the input data for a model.
     * </p>
     * 
     * @param modelDataQuality
     *        Metrics that measure the quality of the input data for a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetrics withModelDataQuality(ModelDataQuality modelDataQuality) {
        setModelDataQuality(modelDataQuality);
        return this;
    }

    /**
     * <p>
     * Metrics that measure bais in a model.
     * </p>
     * 
     * @param bias
     *        Metrics that measure bais in a model.
     */

    public void setBias(Bias bias) {
        this.bias = bias;
    }

    /**
     * <p>
     * Metrics that measure bais in a model.
     * </p>
     * 
     * @return Metrics that measure bais in a model.
     */

    public Bias getBias() {
        return this.bias;
    }

    /**
     * <p>
     * Metrics that measure bais in a model.
     * </p>
     * 
     * @param bias
     *        Metrics that measure bais in a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetrics withBias(Bias bias) {
        setBias(bias);
        return this;
    }

    /**
     * <p>
     * Metrics that help explain a model.
     * </p>
     * 
     * @param explainability
     *        Metrics that help explain a model.
     */

    public void setExplainability(Explainability explainability) {
        this.explainability = explainability;
    }

    /**
     * <p>
     * Metrics that help explain a model.
     * </p>
     * 
     * @return Metrics that help explain a model.
     */

    public Explainability getExplainability() {
        return this.explainability;
    }

    /**
     * <p>
     * Metrics that help explain a model.
     * </p>
     * 
     * @param explainability
     *        Metrics that help explain a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetrics withExplainability(Explainability explainability) {
        setExplainability(explainability);
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
        if (getModelQuality() != null)
            sb.append("ModelQuality: ").append(getModelQuality()).append(",");
        if (getModelDataQuality() != null)
            sb.append("ModelDataQuality: ").append(getModelDataQuality()).append(",");
        if (getBias() != null)
            sb.append("Bias: ").append(getBias()).append(",");
        if (getExplainability() != null)
            sb.append("Explainability: ").append(getExplainability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelMetrics == false)
            return false;
        ModelMetrics other = (ModelMetrics) obj;
        if (other.getModelQuality() == null ^ this.getModelQuality() == null)
            return false;
        if (other.getModelQuality() != null && other.getModelQuality().equals(this.getModelQuality()) == false)
            return false;
        if (other.getModelDataQuality() == null ^ this.getModelDataQuality() == null)
            return false;
        if (other.getModelDataQuality() != null && other.getModelDataQuality().equals(this.getModelDataQuality()) == false)
            return false;
        if (other.getBias() == null ^ this.getBias() == null)
            return false;
        if (other.getBias() != null && other.getBias().equals(this.getBias()) == false)
            return false;
        if (other.getExplainability() == null ^ this.getExplainability() == null)
            return false;
        if (other.getExplainability() != null && other.getExplainability().equals(this.getExplainability()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelQuality() == null) ? 0 : getModelQuality().hashCode());
        hashCode = prime * hashCode + ((getModelDataQuality() == null) ? 0 : getModelDataQuality().hashCode());
        hashCode = prime * hashCode + ((getBias() == null) ? 0 : getBias().hashCode());
        hashCode = prime * hashCode + ((getExplainability() == null) ? 0 : getExplainability().hashCode());
        return hashCode;
    }

    @Override
    public ModelMetrics clone() {
        try {
            return (ModelMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
