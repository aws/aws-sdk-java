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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the hyperparameters and their default ranges. Hyperparameters can be categorical, continuous, or
 * integer-valued.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DefaultHyperParameterRanges"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultHyperParameterRanges implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The integer-valued hyperparameters and their default ranges.
     * </p>
     */
    private java.util.List<DefaultIntegerHyperParameterRange> integerHyperParameterRanges;
    /**
     * <p>
     * The continuous hyperparameters and their default ranges.
     * </p>
     */
    private java.util.List<DefaultContinuousHyperParameterRange> continuousHyperParameterRanges;
    /**
     * <p>
     * The categorical hyperparameters and their default ranges.
     * </p>
     */
    private java.util.List<DefaultCategoricalHyperParameterRange> categoricalHyperParameterRanges;

    /**
     * <p>
     * The integer-valued hyperparameters and their default ranges.
     * </p>
     * 
     * @return The integer-valued hyperparameters and their default ranges.
     */

    public java.util.List<DefaultIntegerHyperParameterRange> getIntegerHyperParameterRanges() {
        return integerHyperParameterRanges;
    }

    /**
     * <p>
     * The integer-valued hyperparameters and their default ranges.
     * </p>
     * 
     * @param integerHyperParameterRanges
     *        The integer-valued hyperparameters and their default ranges.
     */

    public void setIntegerHyperParameterRanges(java.util.Collection<DefaultIntegerHyperParameterRange> integerHyperParameterRanges) {
        if (integerHyperParameterRanges == null) {
            this.integerHyperParameterRanges = null;
            return;
        }

        this.integerHyperParameterRanges = new java.util.ArrayList<DefaultIntegerHyperParameterRange>(integerHyperParameterRanges);
    }

    /**
     * <p>
     * The integer-valued hyperparameters and their default ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntegerHyperParameterRanges(java.util.Collection)} or
     * {@link #withIntegerHyperParameterRanges(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param integerHyperParameterRanges
     *        The integer-valued hyperparameters and their default ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultHyperParameterRanges withIntegerHyperParameterRanges(DefaultIntegerHyperParameterRange... integerHyperParameterRanges) {
        if (this.integerHyperParameterRanges == null) {
            setIntegerHyperParameterRanges(new java.util.ArrayList<DefaultIntegerHyperParameterRange>(integerHyperParameterRanges.length));
        }
        for (DefaultIntegerHyperParameterRange ele : integerHyperParameterRanges) {
            this.integerHyperParameterRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The integer-valued hyperparameters and their default ranges.
     * </p>
     * 
     * @param integerHyperParameterRanges
     *        The integer-valued hyperparameters and their default ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultHyperParameterRanges withIntegerHyperParameterRanges(java.util.Collection<DefaultIntegerHyperParameterRange> integerHyperParameterRanges) {
        setIntegerHyperParameterRanges(integerHyperParameterRanges);
        return this;
    }

    /**
     * <p>
     * The continuous hyperparameters and their default ranges.
     * </p>
     * 
     * @return The continuous hyperparameters and their default ranges.
     */

    public java.util.List<DefaultContinuousHyperParameterRange> getContinuousHyperParameterRanges() {
        return continuousHyperParameterRanges;
    }

    /**
     * <p>
     * The continuous hyperparameters and their default ranges.
     * </p>
     * 
     * @param continuousHyperParameterRanges
     *        The continuous hyperparameters and their default ranges.
     */

    public void setContinuousHyperParameterRanges(java.util.Collection<DefaultContinuousHyperParameterRange> continuousHyperParameterRanges) {
        if (continuousHyperParameterRanges == null) {
            this.continuousHyperParameterRanges = null;
            return;
        }

        this.continuousHyperParameterRanges = new java.util.ArrayList<DefaultContinuousHyperParameterRange>(continuousHyperParameterRanges);
    }

    /**
     * <p>
     * The continuous hyperparameters and their default ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContinuousHyperParameterRanges(java.util.Collection)} or
     * {@link #withContinuousHyperParameterRanges(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param continuousHyperParameterRanges
     *        The continuous hyperparameters and their default ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultHyperParameterRanges withContinuousHyperParameterRanges(DefaultContinuousHyperParameterRange... continuousHyperParameterRanges) {
        if (this.continuousHyperParameterRanges == null) {
            setContinuousHyperParameterRanges(new java.util.ArrayList<DefaultContinuousHyperParameterRange>(continuousHyperParameterRanges.length));
        }
        for (DefaultContinuousHyperParameterRange ele : continuousHyperParameterRanges) {
            this.continuousHyperParameterRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The continuous hyperparameters and their default ranges.
     * </p>
     * 
     * @param continuousHyperParameterRanges
     *        The continuous hyperparameters and their default ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultHyperParameterRanges withContinuousHyperParameterRanges(
            java.util.Collection<DefaultContinuousHyperParameterRange> continuousHyperParameterRanges) {
        setContinuousHyperParameterRanges(continuousHyperParameterRanges);
        return this;
    }

    /**
     * <p>
     * The categorical hyperparameters and their default ranges.
     * </p>
     * 
     * @return The categorical hyperparameters and their default ranges.
     */

    public java.util.List<DefaultCategoricalHyperParameterRange> getCategoricalHyperParameterRanges() {
        return categoricalHyperParameterRanges;
    }

    /**
     * <p>
     * The categorical hyperparameters and their default ranges.
     * </p>
     * 
     * @param categoricalHyperParameterRanges
     *        The categorical hyperparameters and their default ranges.
     */

    public void setCategoricalHyperParameterRanges(java.util.Collection<DefaultCategoricalHyperParameterRange> categoricalHyperParameterRanges) {
        if (categoricalHyperParameterRanges == null) {
            this.categoricalHyperParameterRanges = null;
            return;
        }

        this.categoricalHyperParameterRanges = new java.util.ArrayList<DefaultCategoricalHyperParameterRange>(categoricalHyperParameterRanges);
    }

    /**
     * <p>
     * The categorical hyperparameters and their default ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategoricalHyperParameterRanges(java.util.Collection)} or
     * {@link #withCategoricalHyperParameterRanges(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param categoricalHyperParameterRanges
     *        The categorical hyperparameters and their default ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultHyperParameterRanges withCategoricalHyperParameterRanges(DefaultCategoricalHyperParameterRange... categoricalHyperParameterRanges) {
        if (this.categoricalHyperParameterRanges == null) {
            setCategoricalHyperParameterRanges(new java.util.ArrayList<DefaultCategoricalHyperParameterRange>(categoricalHyperParameterRanges.length));
        }
        for (DefaultCategoricalHyperParameterRange ele : categoricalHyperParameterRanges) {
            this.categoricalHyperParameterRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The categorical hyperparameters and their default ranges.
     * </p>
     * 
     * @param categoricalHyperParameterRanges
     *        The categorical hyperparameters and their default ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultHyperParameterRanges withCategoricalHyperParameterRanges(
            java.util.Collection<DefaultCategoricalHyperParameterRange> categoricalHyperParameterRanges) {
        setCategoricalHyperParameterRanges(categoricalHyperParameterRanges);
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
        if (getIntegerHyperParameterRanges() != null)
            sb.append("IntegerHyperParameterRanges: ").append(getIntegerHyperParameterRanges()).append(",");
        if (getContinuousHyperParameterRanges() != null)
            sb.append("ContinuousHyperParameterRanges: ").append(getContinuousHyperParameterRanges()).append(",");
        if (getCategoricalHyperParameterRanges() != null)
            sb.append("CategoricalHyperParameterRanges: ").append(getCategoricalHyperParameterRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultHyperParameterRanges == false)
            return false;
        DefaultHyperParameterRanges other = (DefaultHyperParameterRanges) obj;
        if (other.getIntegerHyperParameterRanges() == null ^ this.getIntegerHyperParameterRanges() == null)
            return false;
        if (other.getIntegerHyperParameterRanges() != null && other.getIntegerHyperParameterRanges().equals(this.getIntegerHyperParameterRanges()) == false)
            return false;
        if (other.getContinuousHyperParameterRanges() == null ^ this.getContinuousHyperParameterRanges() == null)
            return false;
        if (other.getContinuousHyperParameterRanges() != null
                && other.getContinuousHyperParameterRanges().equals(this.getContinuousHyperParameterRanges()) == false)
            return false;
        if (other.getCategoricalHyperParameterRanges() == null ^ this.getCategoricalHyperParameterRanges() == null)
            return false;
        if (other.getCategoricalHyperParameterRanges() != null
                && other.getCategoricalHyperParameterRanges().equals(this.getCategoricalHyperParameterRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegerHyperParameterRanges() == null) ? 0 : getIntegerHyperParameterRanges().hashCode());
        hashCode = prime * hashCode + ((getContinuousHyperParameterRanges() == null) ? 0 : getContinuousHyperParameterRanges().hashCode());
        hashCode = prime * hashCode + ((getCategoricalHyperParameterRanges() == null) ? 0 : getCategoricalHyperParameterRanges().hashCode());
        return hashCode;
    }

    @Override
    public DefaultHyperParameterRanges clone() {
        try {
            return (DefaultHyperParameterRanges) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.DefaultHyperParameterRangesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
