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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the validation configuration for a field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FieldValidationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldValidationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The validation to perform on a number value.
     * </p>
     */
    private java.util.List<Integer> numValues;
    /**
     * <p>
     * The validation to perform on a string value.
     * </p>
     */
    private java.util.List<String> strValues;
    /**
     * <p>
     * The validation to perform on an object type.<code/>
     * </p>
     */
    private String type;
    /**
     * <p>
     * The validation message to display.
     * </p>
     */
    private String validationMessage;

    /**
     * <p>
     * The validation to perform on a number value.
     * </p>
     * 
     * @return The validation to perform on a number value.
     */

    public java.util.List<Integer> getNumValues() {
        return numValues;
    }

    /**
     * <p>
     * The validation to perform on a number value.
     * </p>
     * 
     * @param numValues
     *        The validation to perform on a number value.
     */

    public void setNumValues(java.util.Collection<Integer> numValues) {
        if (numValues == null) {
            this.numValues = null;
            return;
        }

        this.numValues = new java.util.ArrayList<Integer>(numValues);
    }

    /**
     * <p>
     * The validation to perform on a number value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNumValues(java.util.Collection)} or {@link #withNumValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param numValues
     *        The validation to perform on a number value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValidationConfiguration withNumValues(Integer... numValues) {
        if (this.numValues == null) {
            setNumValues(new java.util.ArrayList<Integer>(numValues.length));
        }
        for (Integer ele : numValues) {
            this.numValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The validation to perform on a number value.
     * </p>
     * 
     * @param numValues
     *        The validation to perform on a number value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValidationConfiguration withNumValues(java.util.Collection<Integer> numValues) {
        setNumValues(numValues);
        return this;
    }

    /**
     * <p>
     * The validation to perform on a string value.
     * </p>
     * 
     * @return The validation to perform on a string value.
     */

    public java.util.List<String> getStrValues() {
        return strValues;
    }

    /**
     * <p>
     * The validation to perform on a string value.
     * </p>
     * 
     * @param strValues
     *        The validation to perform on a string value.
     */

    public void setStrValues(java.util.Collection<String> strValues) {
        if (strValues == null) {
            this.strValues = null;
            return;
        }

        this.strValues = new java.util.ArrayList<String>(strValues);
    }

    /**
     * <p>
     * The validation to perform on a string value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStrValues(java.util.Collection)} or {@link #withStrValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param strValues
     *        The validation to perform on a string value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValidationConfiguration withStrValues(String... strValues) {
        if (this.strValues == null) {
            setStrValues(new java.util.ArrayList<String>(strValues.length));
        }
        for (String ele : strValues) {
            this.strValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The validation to perform on a string value.
     * </p>
     * 
     * @param strValues
     *        The validation to perform on a string value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValidationConfiguration withStrValues(java.util.Collection<String> strValues) {
        setStrValues(strValues);
        return this;
    }

    /**
     * <p>
     * The validation to perform on an object type.<code/>
     * </p>
     * 
     * @param type
     *        The validation to perform on an object type.<code/>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The validation to perform on an object type.<code/>
     * </p>
     * 
     * @return The validation to perform on an object type.<code/>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The validation to perform on an object type.<code/>
     * </p>
     * 
     * @param type
     *        The validation to perform on an object type.<code/>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValidationConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The validation message to display.
     * </p>
     * 
     * @param validationMessage
     *        The validation message to display.
     */

    public void setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
    }

    /**
     * <p>
     * The validation message to display.
     * </p>
     * 
     * @return The validation message to display.
     */

    public String getValidationMessage() {
        return this.validationMessage;
    }

    /**
     * <p>
     * The validation message to display.
     * </p>
     * 
     * @param validationMessage
     *        The validation message to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValidationConfiguration withValidationMessage(String validationMessage) {
        setValidationMessage(validationMessage);
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
        if (getNumValues() != null)
            sb.append("NumValues: ").append(getNumValues()).append(",");
        if (getStrValues() != null)
            sb.append("StrValues: ").append(getStrValues()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValidationMessage() != null)
            sb.append("ValidationMessage: ").append(getValidationMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldValidationConfiguration == false)
            return false;
        FieldValidationConfiguration other = (FieldValidationConfiguration) obj;
        if (other.getNumValues() == null ^ this.getNumValues() == null)
            return false;
        if (other.getNumValues() != null && other.getNumValues().equals(this.getNumValues()) == false)
            return false;
        if (other.getStrValues() == null ^ this.getStrValues() == null)
            return false;
        if (other.getStrValues() != null && other.getStrValues().equals(this.getStrValues()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValidationMessage() == null ^ this.getValidationMessage() == null)
            return false;
        if (other.getValidationMessage() != null && other.getValidationMessage().equals(this.getValidationMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumValues() == null) ? 0 : getNumValues().hashCode());
        hashCode = prime * hashCode + ((getStrValues() == null) ? 0 : getStrValues().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValidationMessage() == null) ? 0 : getValidationMessage().hashCode());
        return hashCode;
    }

    @Override
    public FieldValidationConfiguration clone() {
        try {
            return (FieldValidationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FieldValidationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
