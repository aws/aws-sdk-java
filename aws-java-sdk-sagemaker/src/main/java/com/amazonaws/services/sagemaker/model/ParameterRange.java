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
 * Defines the possible values for categorical, continuous, and integer hyperparameters to be used by an algorithm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ParameterRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>IntegerParameterRangeSpecification</code> object that defines the possible values for an integer
     * hyperparameter.
     * </p>
     */
    private IntegerParameterRangeSpecification integerParameterRangeSpecification;
    /**
     * <p>
     * A <code>ContinuousParameterRangeSpecification</code> object that defines the possible values for a continuous
     * hyperparameter.
     * </p>
     */
    private ContinuousParameterRangeSpecification continuousParameterRangeSpecification;
    /**
     * <p>
     * A <code>CategoricalParameterRangeSpecification</code> object that defines the possible values for a categorical
     * hyperparameter.
     * </p>
     */
    private CategoricalParameterRangeSpecification categoricalParameterRangeSpecification;

    /**
     * <p>
     * A <code>IntegerParameterRangeSpecification</code> object that defines the possible values for an integer
     * hyperparameter.
     * </p>
     * 
     * @param integerParameterRangeSpecification
     *        A <code>IntegerParameterRangeSpecification</code> object that defines the possible values for an integer
     *        hyperparameter.
     */

    public void setIntegerParameterRangeSpecification(IntegerParameterRangeSpecification integerParameterRangeSpecification) {
        this.integerParameterRangeSpecification = integerParameterRangeSpecification;
    }

    /**
     * <p>
     * A <code>IntegerParameterRangeSpecification</code> object that defines the possible values for an integer
     * hyperparameter.
     * </p>
     * 
     * @return A <code>IntegerParameterRangeSpecification</code> object that defines the possible values for an integer
     *         hyperparameter.
     */

    public IntegerParameterRangeSpecification getIntegerParameterRangeSpecification() {
        return this.integerParameterRangeSpecification;
    }

    /**
     * <p>
     * A <code>IntegerParameterRangeSpecification</code> object that defines the possible values for an integer
     * hyperparameter.
     * </p>
     * 
     * @param integerParameterRangeSpecification
     *        A <code>IntegerParameterRangeSpecification</code> object that defines the possible values for an integer
     *        hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterRange withIntegerParameterRangeSpecification(IntegerParameterRangeSpecification integerParameterRangeSpecification) {
        setIntegerParameterRangeSpecification(integerParameterRangeSpecification);
        return this;
    }

    /**
     * <p>
     * A <code>ContinuousParameterRangeSpecification</code> object that defines the possible values for a continuous
     * hyperparameter.
     * </p>
     * 
     * @param continuousParameterRangeSpecification
     *        A <code>ContinuousParameterRangeSpecification</code> object that defines the possible values for a
     *        continuous hyperparameter.
     */

    public void setContinuousParameterRangeSpecification(ContinuousParameterRangeSpecification continuousParameterRangeSpecification) {
        this.continuousParameterRangeSpecification = continuousParameterRangeSpecification;
    }

    /**
     * <p>
     * A <code>ContinuousParameterRangeSpecification</code> object that defines the possible values for a continuous
     * hyperparameter.
     * </p>
     * 
     * @return A <code>ContinuousParameterRangeSpecification</code> object that defines the possible values for a
     *         continuous hyperparameter.
     */

    public ContinuousParameterRangeSpecification getContinuousParameterRangeSpecification() {
        return this.continuousParameterRangeSpecification;
    }

    /**
     * <p>
     * A <code>ContinuousParameterRangeSpecification</code> object that defines the possible values for a continuous
     * hyperparameter.
     * </p>
     * 
     * @param continuousParameterRangeSpecification
     *        A <code>ContinuousParameterRangeSpecification</code> object that defines the possible values for a
     *        continuous hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterRange withContinuousParameterRangeSpecification(ContinuousParameterRangeSpecification continuousParameterRangeSpecification) {
        setContinuousParameterRangeSpecification(continuousParameterRangeSpecification);
        return this;
    }

    /**
     * <p>
     * A <code>CategoricalParameterRangeSpecification</code> object that defines the possible values for a categorical
     * hyperparameter.
     * </p>
     * 
     * @param categoricalParameterRangeSpecification
     *        A <code>CategoricalParameterRangeSpecification</code> object that defines the possible values for a
     *        categorical hyperparameter.
     */

    public void setCategoricalParameterRangeSpecification(CategoricalParameterRangeSpecification categoricalParameterRangeSpecification) {
        this.categoricalParameterRangeSpecification = categoricalParameterRangeSpecification;
    }

    /**
     * <p>
     * A <code>CategoricalParameterRangeSpecification</code> object that defines the possible values for a categorical
     * hyperparameter.
     * </p>
     * 
     * @return A <code>CategoricalParameterRangeSpecification</code> object that defines the possible values for a
     *         categorical hyperparameter.
     */

    public CategoricalParameterRangeSpecification getCategoricalParameterRangeSpecification() {
        return this.categoricalParameterRangeSpecification;
    }

    /**
     * <p>
     * A <code>CategoricalParameterRangeSpecification</code> object that defines the possible values for a categorical
     * hyperparameter.
     * </p>
     * 
     * @param categoricalParameterRangeSpecification
     *        A <code>CategoricalParameterRangeSpecification</code> object that defines the possible values for a
     *        categorical hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterRange withCategoricalParameterRangeSpecification(CategoricalParameterRangeSpecification categoricalParameterRangeSpecification) {
        setCategoricalParameterRangeSpecification(categoricalParameterRangeSpecification);
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
        if (getIntegerParameterRangeSpecification() != null)
            sb.append("IntegerParameterRangeSpecification: ").append(getIntegerParameterRangeSpecification()).append(",");
        if (getContinuousParameterRangeSpecification() != null)
            sb.append("ContinuousParameterRangeSpecification: ").append(getContinuousParameterRangeSpecification()).append(",");
        if (getCategoricalParameterRangeSpecification() != null)
            sb.append("CategoricalParameterRangeSpecification: ").append(getCategoricalParameterRangeSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterRange == false)
            return false;
        ParameterRange other = (ParameterRange) obj;
        if (other.getIntegerParameterRangeSpecification() == null ^ this.getIntegerParameterRangeSpecification() == null)
            return false;
        if (other.getIntegerParameterRangeSpecification() != null
                && other.getIntegerParameterRangeSpecification().equals(this.getIntegerParameterRangeSpecification()) == false)
            return false;
        if (other.getContinuousParameterRangeSpecification() == null ^ this.getContinuousParameterRangeSpecification() == null)
            return false;
        if (other.getContinuousParameterRangeSpecification() != null
                && other.getContinuousParameterRangeSpecification().equals(this.getContinuousParameterRangeSpecification()) == false)
            return false;
        if (other.getCategoricalParameterRangeSpecification() == null ^ this.getCategoricalParameterRangeSpecification() == null)
            return false;
        if (other.getCategoricalParameterRangeSpecification() != null
                && other.getCategoricalParameterRangeSpecification().equals(this.getCategoricalParameterRangeSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegerParameterRangeSpecification() == null) ? 0 : getIntegerParameterRangeSpecification().hashCode());
        hashCode = prime * hashCode + ((getContinuousParameterRangeSpecification() == null) ? 0 : getContinuousParameterRangeSpecification().hashCode());
        hashCode = prime * hashCode + ((getCategoricalParameterRangeSpecification() == null) ? 0 : getCategoricalParameterRangeSpecification().hashCode());
        return hashCode;
    }

    @Override
    public ParameterRange clone() {
        try {
            return (ParameterRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ParameterRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
