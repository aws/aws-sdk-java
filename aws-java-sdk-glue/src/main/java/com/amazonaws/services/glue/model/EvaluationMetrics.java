/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Evaluation metrics provide an estimate of the quality of your machine learning transform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/EvaluationMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     */
    private String transformType;
    /**
     * <p>
     * The evaluation metrics for the find matches algorithm.
     * </p>
     */
    private FindMatchesMetrics findMatchesMetrics;

    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * 
     * @param transformType
     *        The type of machine learning transform.
     * @see TransformType
     */

    public void setTransformType(String transformType) {
        this.transformType = transformType;
    }

    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * 
     * @return The type of machine learning transform.
     * @see TransformType
     */

    public String getTransformType() {
        return this.transformType;
    }

    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * 
     * @param transformType
     *        The type of machine learning transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformType
     */

    public EvaluationMetrics withTransformType(String transformType) {
        setTransformType(transformType);
        return this;
    }

    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * 
     * @param transformType
     *        The type of machine learning transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformType
     */

    public EvaluationMetrics withTransformType(TransformType transformType) {
        this.transformType = transformType.toString();
        return this;
    }

    /**
     * <p>
     * The evaluation metrics for the find matches algorithm.
     * </p>
     * 
     * @param findMatchesMetrics
     *        The evaluation metrics for the find matches algorithm.
     */

    public void setFindMatchesMetrics(FindMatchesMetrics findMatchesMetrics) {
        this.findMatchesMetrics = findMatchesMetrics;
    }

    /**
     * <p>
     * The evaluation metrics for the find matches algorithm.
     * </p>
     * 
     * @return The evaluation metrics for the find matches algorithm.
     */

    public FindMatchesMetrics getFindMatchesMetrics() {
        return this.findMatchesMetrics;
    }

    /**
     * <p>
     * The evaluation metrics for the find matches algorithm.
     * </p>
     * 
     * @param findMatchesMetrics
     *        The evaluation metrics for the find matches algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationMetrics withFindMatchesMetrics(FindMatchesMetrics findMatchesMetrics) {
        setFindMatchesMetrics(findMatchesMetrics);
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
        if (getTransformType() != null)
            sb.append("TransformType: ").append(getTransformType()).append(",");
        if (getFindMatchesMetrics() != null)
            sb.append("FindMatchesMetrics: ").append(getFindMatchesMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationMetrics == false)
            return false;
        EvaluationMetrics other = (EvaluationMetrics) obj;
        if (other.getTransformType() == null ^ this.getTransformType() == null)
            return false;
        if (other.getTransformType() != null && other.getTransformType().equals(this.getTransformType()) == false)
            return false;
        if (other.getFindMatchesMetrics() == null ^ this.getFindMatchesMetrics() == null)
            return false;
        if (other.getFindMatchesMetrics() != null && other.getFindMatchesMetrics().equals(this.getFindMatchesMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformType() == null) ? 0 : getTransformType().hashCode());
        hashCode = prime * hashCode + ((getFindMatchesMetrics() == null) ? 0 : getFindMatchesMetrics().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationMetrics clone() {
        try {
            return (EvaluationMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.EvaluationMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
