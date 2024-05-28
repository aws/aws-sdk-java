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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an option value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Option" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Option implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the value of the option.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Specifies the label of the option.
     * </p>
     */
    private String label;
    /**
     * <p>
     * Specifies the description of the option.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Specifies the value of the option.
     * </p>
     * 
     * @param value
     *        Specifies the value of the option.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Specifies the value of the option.
     * </p>
     * 
     * @return Specifies the value of the option.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Specifies the value of the option.
     * </p>
     * 
     * @param value
     *        Specifies the value of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Specifies the label of the option.
     * </p>
     * 
     * @param label
     *        Specifies the label of the option.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * Specifies the label of the option.
     * </p>
     * 
     * @return Specifies the label of the option.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * Specifies the label of the option.
     * </p>
     * 
     * @param label
     *        Specifies the label of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * Specifies the description of the option.
     * </p>
     * 
     * @param description
     *        Specifies the description of the option.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Specifies the description of the option.
     * </p>
     * 
     * @return Specifies the description of the option.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Specifies the description of the option.
     * </p>
     * 
     * @param description
     *        Specifies the description of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withDescription(String description) {
        setDescription(description);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Option == false)
            return false;
        Option other = (Option) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public Option clone() {
        try {
            return (Option) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.OptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
