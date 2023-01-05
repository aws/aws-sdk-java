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
 * A list of environment parameters suggested by the Amazon SageMaker Inference Recommender.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EnvironmentParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The environment key suggested by the Amazon SageMaker Inference Recommender.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value type suggested by the Amazon SageMaker Inference Recommender.
     * </p>
     */
    private String valueType;
    /**
     * <p>
     * The value suggested by the Amazon SageMaker Inference Recommender.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The environment key suggested by the Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @param key
     *        The environment key suggested by the Amazon SageMaker Inference Recommender.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The environment key suggested by the Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @return The environment key suggested by the Amazon SageMaker Inference Recommender.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The environment key suggested by the Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @param key
     *        The environment key suggested by the Amazon SageMaker Inference Recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentParameter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value type suggested by the Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @param valueType
     *        The value type suggested by the Amazon SageMaker Inference Recommender.
     */

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * <p>
     * The value type suggested by the Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @return The value type suggested by the Amazon SageMaker Inference Recommender.
     */

    public String getValueType() {
        return this.valueType;
    }

    /**
     * <p>
     * The value type suggested by the Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @param valueType
     *        The value type suggested by the Amazon SageMaker Inference Recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentParameter withValueType(String valueType) {
        setValueType(valueType);
        return this;
    }

    /**
     * <p>
     * The value suggested by the Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @param value
     *        The value suggested by the Amazon SageMaker Inference Recommender.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value suggested by the Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @return The value suggested by the Amazon SageMaker Inference Recommender.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value suggested by the Amazon SageMaker Inference Recommender.
     * </p>
     * 
     * @param value
     *        The value suggested by the Amazon SageMaker Inference Recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentParameter withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValueType() != null)
            sb.append("ValueType: ").append(getValueType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentParameter == false)
            return false;
        EnvironmentParameter other = (EnvironmentParameter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValueType() == null ^ this.getValueType() == null)
            return false;
        if (other.getValueType() != null && other.getValueType().equals(this.getValueType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValueType() == null) ? 0 : getValueType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentParameter clone() {
        try {
            return (EnvironmentParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EnvironmentParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
