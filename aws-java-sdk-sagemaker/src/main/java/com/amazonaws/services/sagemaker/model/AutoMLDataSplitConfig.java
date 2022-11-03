/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This structure specifies how to split the data into train and validation datasets. The validation and training
 * datasets must contain the same headers. The validation dataset must be less than 2 GB in size.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLDataSplitConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLDataSplitConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The validation fraction (optional) is a float that specifies the portion of the training dataset to be used for
     * validation. The default value is 0.2, and values must be greater than 0 and less than 1. We recommend setting
     * this value to be less than 0.5.
     * </p>
     */
    private Float validationFraction;

    /**
     * <p>
     * The validation fraction (optional) is a float that specifies the portion of the training dataset to be used for
     * validation. The default value is 0.2, and values must be greater than 0 and less than 1. We recommend setting
     * this value to be less than 0.5.
     * </p>
     * 
     * @param validationFraction
     *        The validation fraction (optional) is a float that specifies the portion of the training dataset to be
     *        used for validation. The default value is 0.2, and values must be greater than 0 and less than 1. We
     *        recommend setting this value to be less than 0.5.
     */

    public void setValidationFraction(Float validationFraction) {
        this.validationFraction = validationFraction;
    }

    /**
     * <p>
     * The validation fraction (optional) is a float that specifies the portion of the training dataset to be used for
     * validation. The default value is 0.2, and values must be greater than 0 and less than 1. We recommend setting
     * this value to be less than 0.5.
     * </p>
     * 
     * @return The validation fraction (optional) is a float that specifies the portion of the training dataset to be
     *         used for validation. The default value is 0.2, and values must be greater than 0 and less than 1. We
     *         recommend setting this value to be less than 0.5.
     */

    public Float getValidationFraction() {
        return this.validationFraction;
    }

    /**
     * <p>
     * The validation fraction (optional) is a float that specifies the portion of the training dataset to be used for
     * validation. The default value is 0.2, and values must be greater than 0 and less than 1. We recommend setting
     * this value to be less than 0.5.
     * </p>
     * 
     * @param validationFraction
     *        The validation fraction (optional) is a float that specifies the portion of the training dataset to be
     *        used for validation. The default value is 0.2, and values must be greater than 0 and less than 1. We
     *        recommend setting this value to be less than 0.5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLDataSplitConfig withValidationFraction(Float validationFraction) {
        setValidationFraction(validationFraction);
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
        if (getValidationFraction() != null)
            sb.append("ValidationFraction: ").append(getValidationFraction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLDataSplitConfig == false)
            return false;
        AutoMLDataSplitConfig other = (AutoMLDataSplitConfig) obj;
        if (other.getValidationFraction() == null ^ this.getValidationFraction() == null)
            return false;
        if (other.getValidationFraction() != null && other.getValidationFraction().equals(this.getValidationFraction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValidationFraction() == null) ? 0 : getValidationFraction().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLDataSplitConfig clone() {
        try {
            return (AutoMLDataSplitConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLDataSplitConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
