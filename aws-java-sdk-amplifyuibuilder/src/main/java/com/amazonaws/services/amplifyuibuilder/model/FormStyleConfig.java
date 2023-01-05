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
 * Describes the configuration settings for the form's style properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FormStyleConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormStyleConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A reference to a design token to use to bind the form's style properties to an existing theme.
     * </p>
     */
    private String tokenReference;
    /**
     * <p>
     * The value of the style setting.
     * </p>
     */
    private String value;

    /**
     * <p>
     * A reference to a design token to use to bind the form's style properties to an existing theme.
     * </p>
     * 
     * @param tokenReference
     *        A reference to a design token to use to bind the form's style properties to an existing theme.
     */

    public void setTokenReference(String tokenReference) {
        this.tokenReference = tokenReference;
    }

    /**
     * <p>
     * A reference to a design token to use to bind the form's style properties to an existing theme.
     * </p>
     * 
     * @return A reference to a design token to use to bind the form's style properties to an existing theme.
     */

    public String getTokenReference() {
        return this.tokenReference;
    }

    /**
     * <p>
     * A reference to a design token to use to bind the form's style properties to an existing theme.
     * </p>
     * 
     * @param tokenReference
     *        A reference to a design token to use to bind the form's style properties to an existing theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormStyleConfig withTokenReference(String tokenReference) {
        setTokenReference(tokenReference);
        return this;
    }

    /**
     * <p>
     * The value of the style setting.
     * </p>
     * 
     * @param value
     *        The value of the style setting.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the style setting.
     * </p>
     * 
     * @return The value of the style setting.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the style setting.
     * </p>
     * 
     * @param value
     *        The value of the style setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormStyleConfig withValue(String value) {
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
        if (getTokenReference() != null)
            sb.append("TokenReference: ").append(getTokenReference()).append(",");
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

        if (obj instanceof FormStyleConfig == false)
            return false;
        FormStyleConfig other = (FormStyleConfig) obj;
        if (other.getTokenReference() == null ^ this.getTokenReference() == null)
            return false;
        if (other.getTokenReference() != null && other.getTokenReference().equals(this.getTokenReference()) == false)
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

        hashCode = prime * hashCode + ((getTokenReference() == null) ? 0 : getTokenReference().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public FormStyleConfig clone() {
        try {
            return (FormStyleConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FormStyleConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
