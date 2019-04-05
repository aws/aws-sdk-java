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
 * For a hyperparameter of the integer type, specifies the range that a hyperparameter tuning job searches.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/IntegerParameterRange" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntegerParameterRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the hyperparameter to search.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The minimum value of the hyperparameter to search.
     * </p>
     */
    private String minValue;
    /**
     * <p>
     * The maximum value of the hyperparameter to search.
     * </p>
     */
    private String maxValue;
    /**
     * <p>
     * The scale that hyperparameter tuning uses to search the hyperparameter range. For information about choosing a
     * hyperparameter scale, see <a
     * href="http://docs.aws.amazon.com//sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     * >Hyperparameter Range Scaling</a>. One of the following values:
     * </p>
     * <dl>
     * <dt>Auto</dt>
     * <dd>
     * <p>
     * Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.
     * </p>
     * </dd>
     * <dt>Linear</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.
     * </p>
     * </dd>
     * <dt>Logarithmic</dt>
     * <dd>
     * <p>
     * Hyperparemeter tuning searches the values in the hyperparameter range by using a logarithmic scale.
     * </p>
     * <p>
     * Logarithmic scaling works only for ranges that have only values greater than 0.
     * </p>
     * </dd>
     * </dl>
     */
    private String scalingType;

    /**
     * <p>
     * The name of the hyperparameter to search.
     * </p>
     * 
     * @param name
     *        The name of the hyperparameter to search.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the hyperparameter to search.
     * </p>
     * 
     * @return The name of the hyperparameter to search.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the hyperparameter to search.
     * </p>
     * 
     * @param name
     *        The name of the hyperparameter to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerParameterRange withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The minimum value of the hyperparameter to search.
     * </p>
     * 
     * @param minValue
     *        The minimum value of the hyperparameter to search.
     */

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * The minimum value of the hyperparameter to search.
     * </p>
     * 
     * @return The minimum value of the hyperparameter to search.
     */

    public String getMinValue() {
        return this.minValue;
    }

    /**
     * <p>
     * The minimum value of the hyperparameter to search.
     * </p>
     * 
     * @param minValue
     *        The minimum value of the hyperparameter to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerParameterRange withMinValue(String minValue) {
        setMinValue(minValue);
        return this;
    }

    /**
     * <p>
     * The maximum value of the hyperparameter to search.
     * </p>
     * 
     * @param maxValue
     *        The maximum value of the hyperparameter to search.
     */

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * The maximum value of the hyperparameter to search.
     * </p>
     * 
     * @return The maximum value of the hyperparameter to search.
     */

    public String getMaxValue() {
        return this.maxValue;
    }

    /**
     * <p>
     * The maximum value of the hyperparameter to search.
     * </p>
     * 
     * @param maxValue
     *        The maximum value of the hyperparameter to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerParameterRange withMaxValue(String maxValue) {
        setMaxValue(maxValue);
        return this;
    }

    /**
     * <p>
     * The scale that hyperparameter tuning uses to search the hyperparameter range. For information about choosing a
     * hyperparameter scale, see <a
     * href="http://docs.aws.amazon.com//sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     * >Hyperparameter Range Scaling</a>. One of the following values:
     * </p>
     * <dl>
     * <dt>Auto</dt>
     * <dd>
     * <p>
     * Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.
     * </p>
     * </dd>
     * <dt>Linear</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.
     * </p>
     * </dd>
     * <dt>Logarithmic</dt>
     * <dd>
     * <p>
     * Hyperparemeter tuning searches the values in the hyperparameter range by using a logarithmic scale.
     * </p>
     * <p>
     * Logarithmic scaling works only for ranges that have only values greater than 0.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param scalingType
     *        The scale that hyperparameter tuning uses to search the hyperparameter range. For information about
     *        choosing a hyperparameter scale, see <a href=
     *        "http://docs.aws.amazon.com//sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     *        >Hyperparameter Range Scaling</a>. One of the following values:</p>
     *        <dl>
     *        <dt>Auto</dt>
     *        <dd>
     *        <p>
     *        Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.
     *        </p>
     *        </dd>
     *        <dt>Linear</dt>
     *        <dd>
     *        <p>
     *        Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.
     *        </p>
     *        </dd>
     *        <dt>Logarithmic</dt>
     *        <dd>
     *        <p>
     *        Hyperparemeter tuning searches the values in the hyperparameter range by using a logarithmic scale.
     *        </p>
     *        <p>
     *        Logarithmic scaling works only for ranges that have only values greater than 0.
     *        </p>
     *        </dd>
     * @see HyperParameterScalingType
     */

    public void setScalingType(String scalingType) {
        this.scalingType = scalingType;
    }

    /**
     * <p>
     * The scale that hyperparameter tuning uses to search the hyperparameter range. For information about choosing a
     * hyperparameter scale, see <a
     * href="http://docs.aws.amazon.com//sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     * >Hyperparameter Range Scaling</a>. One of the following values:
     * </p>
     * <dl>
     * <dt>Auto</dt>
     * <dd>
     * <p>
     * Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.
     * </p>
     * </dd>
     * <dt>Linear</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.
     * </p>
     * </dd>
     * <dt>Logarithmic</dt>
     * <dd>
     * <p>
     * Hyperparemeter tuning searches the values in the hyperparameter range by using a logarithmic scale.
     * </p>
     * <p>
     * Logarithmic scaling works only for ranges that have only values greater than 0.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The scale that hyperparameter tuning uses to search the hyperparameter range. For information about
     *         choosing a hyperparameter scale, see <a href=
     *         "http://docs.aws.amazon.com//sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     *         >Hyperparameter Range Scaling</a>. One of the following values:</p>
     *         <dl>
     *         <dt>Auto</dt>
     *         <dd>
     *         <p>
     *         Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.
     *         </p>
     *         </dd>
     *         <dt>Linear</dt>
     *         <dd>
     *         <p>
     *         Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.
     *         </p>
     *         </dd>
     *         <dt>Logarithmic</dt>
     *         <dd>
     *         <p>
     *         Hyperparemeter tuning searches the values in the hyperparameter range by using a logarithmic scale.
     *         </p>
     *         <p>
     *         Logarithmic scaling works only for ranges that have only values greater than 0.
     *         </p>
     *         </dd>
     * @see HyperParameterScalingType
     */

    public String getScalingType() {
        return this.scalingType;
    }

    /**
     * <p>
     * The scale that hyperparameter tuning uses to search the hyperparameter range. For information about choosing a
     * hyperparameter scale, see <a
     * href="http://docs.aws.amazon.com//sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     * >Hyperparameter Range Scaling</a>. One of the following values:
     * </p>
     * <dl>
     * <dt>Auto</dt>
     * <dd>
     * <p>
     * Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.
     * </p>
     * </dd>
     * <dt>Linear</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.
     * </p>
     * </dd>
     * <dt>Logarithmic</dt>
     * <dd>
     * <p>
     * Hyperparemeter tuning searches the values in the hyperparameter range by using a logarithmic scale.
     * </p>
     * <p>
     * Logarithmic scaling works only for ranges that have only values greater than 0.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param scalingType
     *        The scale that hyperparameter tuning uses to search the hyperparameter range. For information about
     *        choosing a hyperparameter scale, see <a href=
     *        "http://docs.aws.amazon.com//sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     *        >Hyperparameter Range Scaling</a>. One of the following values:</p>
     *        <dl>
     *        <dt>Auto</dt>
     *        <dd>
     *        <p>
     *        Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.
     *        </p>
     *        </dd>
     *        <dt>Linear</dt>
     *        <dd>
     *        <p>
     *        Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.
     *        </p>
     *        </dd>
     *        <dt>Logarithmic</dt>
     *        <dd>
     *        <p>
     *        Hyperparemeter tuning searches the values in the hyperparameter range by using a logarithmic scale.
     *        </p>
     *        <p>
     *        Logarithmic scaling works only for ranges that have only values greater than 0.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterScalingType
     */

    public IntegerParameterRange withScalingType(String scalingType) {
        setScalingType(scalingType);
        return this;
    }

    /**
     * <p>
     * The scale that hyperparameter tuning uses to search the hyperparameter range. For information about choosing a
     * hyperparameter scale, see <a
     * href="http://docs.aws.amazon.com//sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     * >Hyperparameter Range Scaling</a>. One of the following values:
     * </p>
     * <dl>
     * <dt>Auto</dt>
     * <dd>
     * <p>
     * Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.
     * </p>
     * </dd>
     * <dt>Linear</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.
     * </p>
     * </dd>
     * <dt>Logarithmic</dt>
     * <dd>
     * <p>
     * Hyperparemeter tuning searches the values in the hyperparameter range by using a logarithmic scale.
     * </p>
     * <p>
     * Logarithmic scaling works only for ranges that have only values greater than 0.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param scalingType
     *        The scale that hyperparameter tuning uses to search the hyperparameter range. For information about
     *        choosing a hyperparameter scale, see <a href=
     *        "http://docs.aws.amazon.com//sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     *        >Hyperparameter Range Scaling</a>. One of the following values:</p>
     *        <dl>
     *        <dt>Auto</dt>
     *        <dd>
     *        <p>
     *        Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.
     *        </p>
     *        </dd>
     *        <dt>Linear</dt>
     *        <dd>
     *        <p>
     *        Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.
     *        </p>
     *        </dd>
     *        <dt>Logarithmic</dt>
     *        <dd>
     *        <p>
     *        Hyperparemeter tuning searches the values in the hyperparameter range by using a logarithmic scale.
     *        </p>
     *        <p>
     *        Logarithmic scaling works only for ranges that have only values greater than 0.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterScalingType
     */

    public IntegerParameterRange withScalingType(HyperParameterScalingType scalingType) {
        this.scalingType = scalingType.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMinValue() != null)
            sb.append("MinValue: ").append(getMinValue()).append(",");
        if (getMaxValue() != null)
            sb.append("MaxValue: ").append(getMaxValue()).append(",");
        if (getScalingType() != null)
            sb.append("ScalingType: ").append(getScalingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntegerParameterRange == false)
            return false;
        IntegerParameterRange other = (IntegerParameterRange) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        if (other.getScalingType() == null ^ this.getScalingType() == null)
            return false;
        if (other.getScalingType() != null && other.getScalingType().equals(this.getScalingType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        hashCode = prime * hashCode + ((getScalingType() == null) ? 0 : getScalingType().hashCode());
        return hashCode;
    }

    @Override
    public IntegerParameterRange clone() {
        try {
            return (IntegerParameterRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.IntegerParameterRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
