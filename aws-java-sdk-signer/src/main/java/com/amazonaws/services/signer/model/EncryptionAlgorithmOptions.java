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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The encryption algorithm options that are available to an AWS Signer job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/EncryptionAlgorithmOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionAlgorithmOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The set of accepted encryption algorithms that are allowed in an AWS Signer job.
     * </p>
     */
    private java.util.List<String> allowedValues;
    /**
     * <p>
     * The default encryption algorithm that is used by an AWS Signer job.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The set of accepted encryption algorithms that are allowed in an AWS Signer job.
     * </p>
     * 
     * @return The set of accepted encryption algorithms that are allowed in an AWS Signer job.
     * @see EncryptionAlgorithm
     */

    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * The set of accepted encryption algorithms that are allowed in an AWS Signer job.
     * </p>
     * 
     * @param allowedValues
     *        The set of accepted encryption algorithms that are allowed in an AWS Signer job.
     * @see EncryptionAlgorithm
     */

    public void setAllowedValues(java.util.Collection<String> allowedValues) {
        if (allowedValues == null) {
            this.allowedValues = null;
            return;
        }

        this.allowedValues = new java.util.ArrayList<String>(allowedValues);
    }

    /**
     * <p>
     * The set of accepted encryption algorithms that are allowed in an AWS Signer job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedValues(java.util.Collection)} or {@link #withAllowedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedValues
     *        The set of accepted encryption algorithms that are allowed in an AWS Signer job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlgorithm
     */

    public EncryptionAlgorithmOptions withAllowedValues(String... allowedValues) {
        if (this.allowedValues == null) {
            setAllowedValues(new java.util.ArrayList<String>(allowedValues.length));
        }
        for (String ele : allowedValues) {
            this.allowedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of accepted encryption algorithms that are allowed in an AWS Signer job.
     * </p>
     * 
     * @param allowedValues
     *        The set of accepted encryption algorithms that are allowed in an AWS Signer job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlgorithm
     */

    public EncryptionAlgorithmOptions withAllowedValues(java.util.Collection<String> allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * The set of accepted encryption algorithms that are allowed in an AWS Signer job.
     * </p>
     * 
     * @param allowedValues
     *        The set of accepted encryption algorithms that are allowed in an AWS Signer job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlgorithm
     */

    public EncryptionAlgorithmOptions withAllowedValues(EncryptionAlgorithm... allowedValues) {
        java.util.ArrayList<String> allowedValuesCopy = new java.util.ArrayList<String>(allowedValues.length);
        for (EncryptionAlgorithm value : allowedValues) {
            allowedValuesCopy.add(value.toString());
        }
        if (getAllowedValues() == null) {
            setAllowedValues(allowedValuesCopy);
        } else {
            getAllowedValues().addAll(allowedValuesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The default encryption algorithm that is used by an AWS Signer job.
     * </p>
     * 
     * @param defaultValue
     *        The default encryption algorithm that is used by an AWS Signer job.
     * @see EncryptionAlgorithm
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default encryption algorithm that is used by an AWS Signer job.
     * </p>
     * 
     * @return The default encryption algorithm that is used by an AWS Signer job.
     * @see EncryptionAlgorithm
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default encryption algorithm that is used by an AWS Signer job.
     * </p>
     * 
     * @param defaultValue
     *        The default encryption algorithm that is used by an AWS Signer job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlgorithm
     */

    public EncryptionAlgorithmOptions withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The default encryption algorithm that is used by an AWS Signer job.
     * </p>
     * 
     * @param defaultValue
     *        The default encryption algorithm that is used by an AWS Signer job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlgorithm
     */

    public EncryptionAlgorithmOptions withDefaultValue(EncryptionAlgorithm defaultValue) {
        this.defaultValue = defaultValue.toString();
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
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionAlgorithmOptions == false)
            return false;
        EncryptionAlgorithmOptions other = (EncryptionAlgorithmOptions) obj;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionAlgorithmOptions clone() {
        try {
            return (EncryptionAlgorithmOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.EncryptionAlgorithmOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
