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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the drift check baselines that can be used when the model monitor is set using the model package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DriftCheckBaselines" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DriftCheckBaselines implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the drift check bias baselines that can be used when the model monitor is set using the model package.
     * </p>
     */
    private DriftCheckBias bias;
    /**
     * <p>
     * Represents the drift check explainability baselines that can be used when the model monitor is set using the
     * model package.
     * </p>
     */
    private DriftCheckExplainability explainability;
    /**
     * <p>
     * Represents the drift check model quality baselines that can be used when the model monitor is set using the model
     * package.
     * </p>
     */
    private DriftCheckModelQuality modelQuality;
    /**
     * <p>
     * Represents the drift check model data quality baselines that can be used when the model monitor is set using the
     * model package.
     * </p>
     */
    private DriftCheckModelDataQuality modelDataQuality;

    /**
     * <p>
     * Represents the drift check bias baselines that can be used when the model monitor is set using the model package.
     * </p>
     * 
     * @param bias
     *        Represents the drift check bias baselines that can be used when the model monitor is set using the model
     *        package.
     */

    public void setBias(DriftCheckBias bias) {
        this.bias = bias;
    }

    /**
     * <p>
     * Represents the drift check bias baselines that can be used when the model monitor is set using the model package.
     * </p>
     * 
     * @return Represents the drift check bias baselines that can be used when the model monitor is set using the model
     *         package.
     */

    public DriftCheckBias getBias() {
        return this.bias;
    }

    /**
     * <p>
     * Represents the drift check bias baselines that can be used when the model monitor is set using the model package.
     * </p>
     * 
     * @param bias
     *        Represents the drift check bias baselines that can be used when the model monitor is set using the model
     *        package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DriftCheckBaselines withBias(DriftCheckBias bias) {
        setBias(bias);
        return this;
    }

    /**
     * <p>
     * Represents the drift check explainability baselines that can be used when the model monitor is set using the
     * model package.
     * </p>
     * 
     * @param explainability
     *        Represents the drift check explainability baselines that can be used when the model monitor is set using
     *        the model package.
     */

    public void setExplainability(DriftCheckExplainability explainability) {
        this.explainability = explainability;
    }

    /**
     * <p>
     * Represents the drift check explainability baselines that can be used when the model monitor is set using the
     * model package.
     * </p>
     * 
     * @return Represents the drift check explainability baselines that can be used when the model monitor is set using
     *         the model package.
     */

    public DriftCheckExplainability getExplainability() {
        return this.explainability;
    }

    /**
     * <p>
     * Represents the drift check explainability baselines that can be used when the model monitor is set using the
     * model package.
     * </p>
     * 
     * @param explainability
     *        Represents the drift check explainability baselines that can be used when the model monitor is set using
     *        the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DriftCheckBaselines withExplainability(DriftCheckExplainability explainability) {
        setExplainability(explainability);
        return this;
    }

    /**
     * <p>
     * Represents the drift check model quality baselines that can be used when the model monitor is set using the model
     * package.
     * </p>
     * 
     * @param modelQuality
     *        Represents the drift check model quality baselines that can be used when the model monitor is set using
     *        the model package.
     */

    public void setModelQuality(DriftCheckModelQuality modelQuality) {
        this.modelQuality = modelQuality;
    }

    /**
     * <p>
     * Represents the drift check model quality baselines that can be used when the model monitor is set using the model
     * package.
     * </p>
     * 
     * @return Represents the drift check model quality baselines that can be used when the model monitor is set using
     *         the model package.
     */

    public DriftCheckModelQuality getModelQuality() {
        return this.modelQuality;
    }

    /**
     * <p>
     * Represents the drift check model quality baselines that can be used when the model monitor is set using the model
     * package.
     * </p>
     * 
     * @param modelQuality
     *        Represents the drift check model quality baselines that can be used when the model monitor is set using
     *        the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DriftCheckBaselines withModelQuality(DriftCheckModelQuality modelQuality) {
        setModelQuality(modelQuality);
        return this;
    }

    /**
     * <p>
     * Represents the drift check model data quality baselines that can be used when the model monitor is set using the
     * model package.
     * </p>
     * 
     * @param modelDataQuality
     *        Represents the drift check model data quality baselines that can be used when the model monitor is set
     *        using the model package.
     */

    public void setModelDataQuality(DriftCheckModelDataQuality modelDataQuality) {
        this.modelDataQuality = modelDataQuality;
    }

    /**
     * <p>
     * Represents the drift check model data quality baselines that can be used when the model monitor is set using the
     * model package.
     * </p>
     * 
     * @return Represents the drift check model data quality baselines that can be used when the model monitor is set
     *         using the model package.
     */

    public DriftCheckModelDataQuality getModelDataQuality() {
        return this.modelDataQuality;
    }

    /**
     * <p>
     * Represents the drift check model data quality baselines that can be used when the model monitor is set using the
     * model package.
     * </p>
     * 
     * @param modelDataQuality
     *        Represents the drift check model data quality baselines that can be used when the model monitor is set
     *        using the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DriftCheckBaselines withModelDataQuality(DriftCheckModelDataQuality modelDataQuality) {
        setModelDataQuality(modelDataQuality);
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
        if (getBias() != null)
            sb.append("Bias: ").append(getBias()).append(",");
        if (getExplainability() != null)
            sb.append("Explainability: ").append(getExplainability()).append(",");
        if (getModelQuality() != null)
            sb.append("ModelQuality: ").append(getModelQuality()).append(",");
        if (getModelDataQuality() != null)
            sb.append("ModelDataQuality: ").append(getModelDataQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DriftCheckBaselines == false)
            return false;
        DriftCheckBaselines other = (DriftCheckBaselines) obj;
        if (other.getBias() == null ^ this.getBias() == null)
            return false;
        if (other.getBias() != null && other.getBias().equals(this.getBias()) == false)
            return false;
        if (other.getExplainability() == null ^ this.getExplainability() == null)
            return false;
        if (other.getExplainability() != null && other.getExplainability().equals(this.getExplainability()) == false)
            return false;
        if (other.getModelQuality() == null ^ this.getModelQuality() == null)
            return false;
        if (other.getModelQuality() != null && other.getModelQuality().equals(this.getModelQuality()) == false)
            return false;
        if (other.getModelDataQuality() == null ^ this.getModelDataQuality() == null)
            return false;
        if (other.getModelDataQuality() != null && other.getModelDataQuality().equals(this.getModelDataQuality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBias() == null) ? 0 : getBias().hashCode());
        hashCode = prime * hashCode + ((getExplainability() == null) ? 0 : getExplainability().hashCode());
        hashCode = prime * hashCode + ((getModelQuality() == null) ? 0 : getModelQuality().hashCode());
        hashCode = prime * hashCode + ((getModelDataQuality() == null) ? 0 : getModelDataQuality().hashCode());
        return hashCode;
    }

    @Override
    public DriftCheckBaselines clone() {
        try {
            return (DriftCheckBaselines) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DriftCheckBaselinesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
