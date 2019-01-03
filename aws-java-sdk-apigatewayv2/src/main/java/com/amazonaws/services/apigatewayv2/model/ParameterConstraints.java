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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Validation constraints imposed on parameters of a request (path, query string, headers).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterConstraints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether or not the parameter is required.
     * </p>
     */
    private Boolean required;

    /**
     * <p>
     * Whether or not the parameter is required.
     * </p>
     * 
     * @param required
     *        Whether or not the parameter is required.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Whether or not the parameter is required.
     * </p>
     * 
     * @return Whether or not the parameter is required.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Whether or not the parameter is required.
     * </p>
     * 
     * @param required
     *        Whether or not the parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterConstraints withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * Whether or not the parameter is required.
     * </p>
     * 
     * @return Whether or not the parameter is required.
     */

    public Boolean isRequired() {
        return this.required;
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
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterConstraints == false)
            return false;
        ParameterConstraints other = (ParameterConstraints) obj;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        return hashCode;
    }

    @Override
    public ParameterConstraints clone() {
        try {
            return (ParameterConstraints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigatewayv2.model.transform.ParameterConstraintsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
