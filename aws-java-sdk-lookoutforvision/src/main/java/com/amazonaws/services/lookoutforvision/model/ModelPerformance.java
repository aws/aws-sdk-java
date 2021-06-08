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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the evaluation performance of a trained model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ModelPerformance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelPerformance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The overall F1 score metric for the trained model.
     * </p>
     */
    private Float f1Score;
    /**
     * <p>
     * The overall recall metric value for the trained model.
     * </p>
     */
    private Float recall;
    /**
     * <p>
     * The overall precision metric value for the trained model.
     * </p>
     */
    private Float precision;

    /**
     * <p>
     * The overall F1 score metric for the trained model.
     * </p>
     * 
     * @param f1Score
     *        The overall F1 score metric for the trained model.
     */

    public void setF1Score(Float f1Score) {
        this.f1Score = f1Score;
    }

    /**
     * <p>
     * The overall F1 score metric for the trained model.
     * </p>
     * 
     * @return The overall F1 score metric for the trained model.
     */

    public Float getF1Score() {
        return this.f1Score;
    }

    /**
     * <p>
     * The overall F1 score metric for the trained model.
     * </p>
     * 
     * @param f1Score
     *        The overall F1 score metric for the trained model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPerformance withF1Score(Float f1Score) {
        setF1Score(f1Score);
        return this;
    }

    /**
     * <p>
     * The overall recall metric value for the trained model.
     * </p>
     * 
     * @param recall
     *        The overall recall metric value for the trained model.
     */

    public void setRecall(Float recall) {
        this.recall = recall;
    }

    /**
     * <p>
     * The overall recall metric value for the trained model.
     * </p>
     * 
     * @return The overall recall metric value for the trained model.
     */

    public Float getRecall() {
        return this.recall;
    }

    /**
     * <p>
     * The overall recall metric value for the trained model.
     * </p>
     * 
     * @param recall
     *        The overall recall metric value for the trained model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPerformance withRecall(Float recall) {
        setRecall(recall);
        return this;
    }

    /**
     * <p>
     * The overall precision metric value for the trained model.
     * </p>
     * 
     * @param precision
     *        The overall precision metric value for the trained model.
     */

    public void setPrecision(Float precision) {
        this.precision = precision;
    }

    /**
     * <p>
     * The overall precision metric value for the trained model.
     * </p>
     * 
     * @return The overall precision metric value for the trained model.
     */

    public Float getPrecision() {
        return this.precision;
    }

    /**
     * <p>
     * The overall precision metric value for the trained model.
     * </p>
     * 
     * @param precision
     *        The overall precision metric value for the trained model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPerformance withPrecision(Float precision) {
        setPrecision(precision);
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
        if (getF1Score() != null)
            sb.append("F1Score: ").append(getF1Score()).append(",");
        if (getRecall() != null)
            sb.append("Recall: ").append(getRecall()).append(",");
        if (getPrecision() != null)
            sb.append("Precision: ").append(getPrecision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelPerformance == false)
            return false;
        ModelPerformance other = (ModelPerformance) obj;
        if (other.getF1Score() == null ^ this.getF1Score() == null)
            return false;
        if (other.getF1Score() != null && other.getF1Score().equals(this.getF1Score()) == false)
            return false;
        if (other.getRecall() == null ^ this.getRecall() == null)
            return false;
        if (other.getRecall() != null && other.getRecall().equals(this.getRecall()) == false)
            return false;
        if (other.getPrecision() == null ^ this.getPrecision() == null)
            return false;
        if (other.getPrecision() != null && other.getPrecision().equals(this.getPrecision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getF1Score() == null) ? 0 : getF1Score().hashCode());
        hashCode = prime * hashCode + ((getRecall() == null) ? 0 : getRecall().hashCode());
        hashCode = prime * hashCode + ((getPrecision() == null) ? 0 : getPrecision().hashCode());
        return hashCode;
    }

    @Override
    public ModelPerformance clone() {
        try {
            return (ModelPerformance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.ModelPerformanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
