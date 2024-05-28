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
 * Array of up to 10 validators.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ValidationDataConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the validators.
     * </p>
     */
    private java.util.List<Validator> validators;

    /**
     * <p>
     * Information about the validators.
     * </p>
     * 
     * @return Information about the validators.
     */

    public java.util.List<Validator> getValidators() {
        return validators;
    }

    /**
     * <p>
     * Information about the validators.
     * </p>
     * 
     * @param validators
     *        Information about the validators.
     */

    public void setValidators(java.util.Collection<Validator> validators) {
        if (validators == null) {
            this.validators = null;
            return;
        }

        this.validators = new java.util.ArrayList<Validator>(validators);
    }

    /**
     * <p>
     * Information about the validators.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidators(java.util.Collection)} or {@link #withValidators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param validators
     *        Information about the validators.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationDataConfig withValidators(Validator... validators) {
        if (this.validators == null) {
            setValidators(new java.util.ArrayList<Validator>(validators.length));
        }
        for (Validator ele : validators) {
            this.validators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the validators.
     * </p>
     * 
     * @param validators
     *        Information about the validators.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationDataConfig withValidators(java.util.Collection<Validator> validators) {
        setValidators(validators);
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
        if (getValidators() != null)
            sb.append("Validators: ").append(getValidators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationDataConfig == false)
            return false;
        ValidationDataConfig other = (ValidationDataConfig) obj;
        if (other.getValidators() == null ^ this.getValidators() == null)
            return false;
        if (other.getValidators() != null && other.getValidators().equals(this.getValidators()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValidators() == null) ? 0 : getValidators().hashCode());
        return hashCode;
    }

    @Override
    public ValidationDataConfig clone() {
        try {
            return (ValidationDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.ValidationDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
