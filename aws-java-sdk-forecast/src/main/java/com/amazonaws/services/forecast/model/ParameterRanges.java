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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the categorical, continuous, and integer hyperparameters, and their ranges of tunable values. The range of
 * tunable values determines which values that a hyperparameter tuning job can choose for the specified hyperparameter.
 * This object is part of the <a>HyperParameterTuningJobConfig</a> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ParameterRanges" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterRanges implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the tunable range for each categorical hyperparameter.
     * </p>
     */
    private java.util.List<CategoricalParameterRange> categoricalParameterRanges;
    /**
     * <p>
     * Specifies the tunable range for each continuous hyperparameter.
     * </p>
     */
    private java.util.List<ContinuousParameterRange> continuousParameterRanges;
    /**
     * <p>
     * Specifies the tunable range for each integer hyperparameter.
     * </p>
     */
    private java.util.List<IntegerParameterRange> integerParameterRanges;

    /**
     * <p>
     * Specifies the tunable range for each categorical hyperparameter.
     * </p>
     * 
     * @return Specifies the tunable range for each categorical hyperparameter.
     */

    public java.util.List<CategoricalParameterRange> getCategoricalParameterRanges() {
        return categoricalParameterRanges;
    }

    /**
     * <p>
     * Specifies the tunable range for each categorical hyperparameter.
     * </p>
     * 
     * @param categoricalParameterRanges
     *        Specifies the tunable range for each categorical hyperparameter.
     */

    public void setCategoricalParameterRanges(java.util.Collection<CategoricalParameterRange> categoricalParameterRanges) {
        if (categoricalParameterRanges == null) {
            this.categoricalParameterRanges = null;
            return;
        }

        this.categoricalParameterRanges = new java.util.ArrayList<CategoricalParameterRange>(categoricalParameterRanges);
    }

    /**
     * <p>
     * Specifies the tunable range for each categorical hyperparameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategoricalParameterRanges(java.util.Collection)} or
     * {@link #withCategoricalParameterRanges(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param categoricalParameterRanges
     *        Specifies the tunable range for each categorical hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterRanges withCategoricalParameterRanges(CategoricalParameterRange... categoricalParameterRanges) {
        if (this.categoricalParameterRanges == null) {
            setCategoricalParameterRanges(new java.util.ArrayList<CategoricalParameterRange>(categoricalParameterRanges.length));
        }
        for (CategoricalParameterRange ele : categoricalParameterRanges) {
            this.categoricalParameterRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the tunable range for each categorical hyperparameter.
     * </p>
     * 
     * @param categoricalParameterRanges
     *        Specifies the tunable range for each categorical hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterRanges withCategoricalParameterRanges(java.util.Collection<CategoricalParameterRange> categoricalParameterRanges) {
        setCategoricalParameterRanges(categoricalParameterRanges);
        return this;
    }

    /**
     * <p>
     * Specifies the tunable range for each continuous hyperparameter.
     * </p>
     * 
     * @return Specifies the tunable range for each continuous hyperparameter.
     */

    public java.util.List<ContinuousParameterRange> getContinuousParameterRanges() {
        return continuousParameterRanges;
    }

    /**
     * <p>
     * Specifies the tunable range for each continuous hyperparameter.
     * </p>
     * 
     * @param continuousParameterRanges
     *        Specifies the tunable range for each continuous hyperparameter.
     */

    public void setContinuousParameterRanges(java.util.Collection<ContinuousParameterRange> continuousParameterRanges) {
        if (continuousParameterRanges == null) {
            this.continuousParameterRanges = null;
            return;
        }

        this.continuousParameterRanges = new java.util.ArrayList<ContinuousParameterRange>(continuousParameterRanges);
    }

    /**
     * <p>
     * Specifies the tunable range for each continuous hyperparameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContinuousParameterRanges(java.util.Collection)} or
     * {@link #withContinuousParameterRanges(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param continuousParameterRanges
     *        Specifies the tunable range for each continuous hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterRanges withContinuousParameterRanges(ContinuousParameterRange... continuousParameterRanges) {
        if (this.continuousParameterRanges == null) {
            setContinuousParameterRanges(new java.util.ArrayList<ContinuousParameterRange>(continuousParameterRanges.length));
        }
        for (ContinuousParameterRange ele : continuousParameterRanges) {
            this.continuousParameterRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the tunable range for each continuous hyperparameter.
     * </p>
     * 
     * @param continuousParameterRanges
     *        Specifies the tunable range for each continuous hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterRanges withContinuousParameterRanges(java.util.Collection<ContinuousParameterRange> continuousParameterRanges) {
        setContinuousParameterRanges(continuousParameterRanges);
        return this;
    }

    /**
     * <p>
     * Specifies the tunable range for each integer hyperparameter.
     * </p>
     * 
     * @return Specifies the tunable range for each integer hyperparameter.
     */

    public java.util.List<IntegerParameterRange> getIntegerParameterRanges() {
        return integerParameterRanges;
    }

    /**
     * <p>
     * Specifies the tunable range for each integer hyperparameter.
     * </p>
     * 
     * @param integerParameterRanges
     *        Specifies the tunable range for each integer hyperparameter.
     */

    public void setIntegerParameterRanges(java.util.Collection<IntegerParameterRange> integerParameterRanges) {
        if (integerParameterRanges == null) {
            this.integerParameterRanges = null;
            return;
        }

        this.integerParameterRanges = new java.util.ArrayList<IntegerParameterRange>(integerParameterRanges);
    }

    /**
     * <p>
     * Specifies the tunable range for each integer hyperparameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntegerParameterRanges(java.util.Collection)} or
     * {@link #withIntegerParameterRanges(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param integerParameterRanges
     *        Specifies the tunable range for each integer hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterRanges withIntegerParameterRanges(IntegerParameterRange... integerParameterRanges) {
        if (this.integerParameterRanges == null) {
            setIntegerParameterRanges(new java.util.ArrayList<IntegerParameterRange>(integerParameterRanges.length));
        }
        for (IntegerParameterRange ele : integerParameterRanges) {
            this.integerParameterRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the tunable range for each integer hyperparameter.
     * </p>
     * 
     * @param integerParameterRanges
     *        Specifies the tunable range for each integer hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterRanges withIntegerParameterRanges(java.util.Collection<IntegerParameterRange> integerParameterRanges) {
        setIntegerParameterRanges(integerParameterRanges);
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
        if (getCategoricalParameterRanges() != null)
            sb.append("CategoricalParameterRanges: ").append(getCategoricalParameterRanges()).append(",");
        if (getContinuousParameterRanges() != null)
            sb.append("ContinuousParameterRanges: ").append(getContinuousParameterRanges()).append(",");
        if (getIntegerParameterRanges() != null)
            sb.append("IntegerParameterRanges: ").append(getIntegerParameterRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterRanges == false)
            return false;
        ParameterRanges other = (ParameterRanges) obj;
        if (other.getCategoricalParameterRanges() == null ^ this.getCategoricalParameterRanges() == null)
            return false;
        if (other.getCategoricalParameterRanges() != null && other.getCategoricalParameterRanges().equals(this.getCategoricalParameterRanges()) == false)
            return false;
        if (other.getContinuousParameterRanges() == null ^ this.getContinuousParameterRanges() == null)
            return false;
        if (other.getContinuousParameterRanges() != null && other.getContinuousParameterRanges().equals(this.getContinuousParameterRanges()) == false)
            return false;
        if (other.getIntegerParameterRanges() == null ^ this.getIntegerParameterRanges() == null)
            return false;
        if (other.getIntegerParameterRanges() != null && other.getIntegerParameterRanges().equals(this.getIntegerParameterRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoricalParameterRanges() == null) ? 0 : getCategoricalParameterRanges().hashCode());
        hashCode = prime * hashCode + ((getContinuousParameterRanges() == null) ? 0 : getContinuousParameterRanges().hashCode());
        hashCode = prime * hashCode + ((getIntegerParameterRanges() == null) ? 0 : getIntegerParameterRanges().hashCode());
        return hashCode;
    }

    @Override
    public ParameterRanges clone() {
        try {
            return (ParameterRanges) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.ParameterRangesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
