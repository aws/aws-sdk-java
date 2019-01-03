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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies ranges of integer, continuous, and categorical hyperparameters that a hyperparameter tuning job searches.
 * The hyperparameter tuning job launches training jobs with hyperparameter values within these ranges to find the
 * combination of values that result in the training job with the best performance as measured by the objective metric
 * of the hyperparameter tuning job.
 * </p>
 * <note>
 * <p>
 * You can specify a maximum of 20 hyperparameters that a hyperparameter tuning job can search over. Every possible
 * value of a categorical parameter range counts against this limit.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ParameterRanges" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterRanges implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The array of <a>IntegerParameterRange</a> objects that specify ranges of integer hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     */
    private java.util.List<IntegerParameterRange> integerParameterRanges;
    /**
     * <p>
     * The array of <a>ContinuousParameterRange</a> objects that specify ranges of continuous hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     */
    private java.util.List<ContinuousParameterRange> continuousParameterRanges;
    /**
     * <p>
     * The array of <a>CategoricalParameterRange</a> objects that specify ranges of categorical hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     */
    private java.util.List<CategoricalParameterRange> categoricalParameterRanges;

    /**
     * <p>
     * The array of <a>IntegerParameterRange</a> objects that specify ranges of integer hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     * 
     * @return The array of <a>IntegerParameterRange</a> objects that specify ranges of integer hyperparameters that a
     *         hyperparameter tuning job searches.
     */

    public java.util.List<IntegerParameterRange> getIntegerParameterRanges() {
        return integerParameterRanges;
    }

    /**
     * <p>
     * The array of <a>IntegerParameterRange</a> objects that specify ranges of integer hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     * 
     * @param integerParameterRanges
     *        The array of <a>IntegerParameterRange</a> objects that specify ranges of integer hyperparameters that a
     *        hyperparameter tuning job searches.
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
     * The array of <a>IntegerParameterRange</a> objects that specify ranges of integer hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntegerParameterRanges(java.util.Collection)} or
     * {@link #withIntegerParameterRanges(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param integerParameterRanges
     *        The array of <a>IntegerParameterRange</a> objects that specify ranges of integer hyperparameters that a
     *        hyperparameter tuning job searches.
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
     * The array of <a>IntegerParameterRange</a> objects that specify ranges of integer hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     * 
     * @param integerParameterRanges
     *        The array of <a>IntegerParameterRange</a> objects that specify ranges of integer hyperparameters that a
     *        hyperparameter tuning job searches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterRanges withIntegerParameterRanges(java.util.Collection<IntegerParameterRange> integerParameterRanges) {
        setIntegerParameterRanges(integerParameterRanges);
        return this;
    }

    /**
     * <p>
     * The array of <a>ContinuousParameterRange</a> objects that specify ranges of continuous hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     * 
     * @return The array of <a>ContinuousParameterRange</a> objects that specify ranges of continuous hyperparameters
     *         that a hyperparameter tuning job searches.
     */

    public java.util.List<ContinuousParameterRange> getContinuousParameterRanges() {
        return continuousParameterRanges;
    }

    /**
     * <p>
     * The array of <a>ContinuousParameterRange</a> objects that specify ranges of continuous hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     * 
     * @param continuousParameterRanges
     *        The array of <a>ContinuousParameterRange</a> objects that specify ranges of continuous hyperparameters
     *        that a hyperparameter tuning job searches.
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
     * The array of <a>ContinuousParameterRange</a> objects that specify ranges of continuous hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContinuousParameterRanges(java.util.Collection)} or
     * {@link #withContinuousParameterRanges(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param continuousParameterRanges
     *        The array of <a>ContinuousParameterRange</a> objects that specify ranges of continuous hyperparameters
     *        that a hyperparameter tuning job searches.
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
     * The array of <a>ContinuousParameterRange</a> objects that specify ranges of continuous hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     * 
     * @param continuousParameterRanges
     *        The array of <a>ContinuousParameterRange</a> objects that specify ranges of continuous hyperparameters
     *        that a hyperparameter tuning job searches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterRanges withContinuousParameterRanges(java.util.Collection<ContinuousParameterRange> continuousParameterRanges) {
        setContinuousParameterRanges(continuousParameterRanges);
        return this;
    }

    /**
     * <p>
     * The array of <a>CategoricalParameterRange</a> objects that specify ranges of categorical hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     * 
     * @return The array of <a>CategoricalParameterRange</a> objects that specify ranges of categorical hyperparameters
     *         that a hyperparameter tuning job searches.
     */

    public java.util.List<CategoricalParameterRange> getCategoricalParameterRanges() {
        return categoricalParameterRanges;
    }

    /**
     * <p>
     * The array of <a>CategoricalParameterRange</a> objects that specify ranges of categorical hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     * 
     * @param categoricalParameterRanges
     *        The array of <a>CategoricalParameterRange</a> objects that specify ranges of categorical hyperparameters
     *        that a hyperparameter tuning job searches.
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
     * The array of <a>CategoricalParameterRange</a> objects that specify ranges of categorical hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategoricalParameterRanges(java.util.Collection)} or
     * {@link #withCategoricalParameterRanges(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param categoricalParameterRanges
     *        The array of <a>CategoricalParameterRange</a> objects that specify ranges of categorical hyperparameters
     *        that a hyperparameter tuning job searches.
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
     * The array of <a>CategoricalParameterRange</a> objects that specify ranges of categorical hyperparameters that a
     * hyperparameter tuning job searches.
     * </p>
     * 
     * @param categoricalParameterRanges
     *        The array of <a>CategoricalParameterRange</a> objects that specify ranges of categorical hyperparameters
     *        that a hyperparameter tuning job searches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterRanges withCategoricalParameterRanges(java.util.Collection<CategoricalParameterRange> categoricalParameterRanges) {
        setCategoricalParameterRanges(categoricalParameterRanges);
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
        if (getIntegerParameterRanges() != null)
            sb.append("IntegerParameterRanges: ").append(getIntegerParameterRanges()).append(",");
        if (getContinuousParameterRanges() != null)
            sb.append("ContinuousParameterRanges: ").append(getContinuousParameterRanges()).append(",");
        if (getCategoricalParameterRanges() != null)
            sb.append("CategoricalParameterRanges: ").append(getCategoricalParameterRanges());
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
        if (other.getIntegerParameterRanges() == null ^ this.getIntegerParameterRanges() == null)
            return false;
        if (other.getIntegerParameterRanges() != null && other.getIntegerParameterRanges().equals(this.getIntegerParameterRanges()) == false)
            return false;
        if (other.getContinuousParameterRanges() == null ^ this.getContinuousParameterRanges() == null)
            return false;
        if (other.getContinuousParameterRanges() != null && other.getContinuousParameterRanges().equals(this.getContinuousParameterRanges()) == false)
            return false;
        if (other.getCategoricalParameterRanges() == null ^ this.getCategoricalParameterRanges() == null)
            return false;
        if (other.getCategoricalParameterRanges() != null && other.getCategoricalParameterRanges().equals(this.getCategoricalParameterRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegerParameterRanges() == null) ? 0 : getIntegerParameterRanges().hashCode());
        hashCode = prime * hashCode + ((getContinuousParameterRanges() == null) ? 0 : getContinuousParameterRanges().hashCode());
        hashCode = prime * hashCode + ((getCategoricalParameterRanges() == null) ? 0 : getCategoricalParameterRanges().hashCode());
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
        com.amazonaws.services.sagemaker.model.transform.ParameterRangesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
