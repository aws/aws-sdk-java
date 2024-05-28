/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metric for the validator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ValidatorMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidatorMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The validation loss associated with this validator.
     * </p>
     */
    private Float validationLoss;

    /**
     * <p>
     * The validation loss associated with this validator.
     * </p>
     * 
     * @param validationLoss
     *        The validation loss associated with this validator.
     */

    public void setValidationLoss(Float validationLoss) {
        this.validationLoss = validationLoss;
    }

    /**
     * <p>
     * The validation loss associated with this validator.
     * </p>
     * 
     * @return The validation loss associated with this validator.
     */

    public Float getValidationLoss() {
        return this.validationLoss;
    }

    /**
     * <p>
     * The validation loss associated with this validator.
     * </p>
     * 
     * @param validationLoss
     *        The validation loss associated with this validator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatorMetric withValidationLoss(Float validationLoss) {
        setValidationLoss(validationLoss);
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
        if (getValidationLoss() != null)
            sb.append("ValidationLoss: ").append(getValidationLoss());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidatorMetric == false)
            return false;
        ValidatorMetric other = (ValidatorMetric) obj;
        if (other.getValidationLoss() == null ^ this.getValidationLoss() == null)
            return false;
        if (other.getValidationLoss() != null && other.getValidationLoss().equals(this.getValidationLoss()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValidationLoss() == null) ? 0 : getValidationLoss().hashCode());
        return hashCode;
    }

    @Override
    public ValidatorMetric clone() {
        try {
            return (ValidatorMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.ValidatorMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
