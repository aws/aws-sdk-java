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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the parameters for a resource type. Use parameters to determine which tasks are identified during target
 * resolution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/TargetResourceTypeParameter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetResourceTypeParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the parameter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether the parameter is required.
     * </p>
     */
    private Boolean required;

    /**
     * <p>
     * A description of the parameter.
     * </p>
     * 
     * @param description
     *        A description of the parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     * 
     * @return A description of the parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     * 
     * @param description
     *        A description of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetResourceTypeParameter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether the parameter is required.
     * </p>
     * 
     * @param required
     *        Indicates whether the parameter is required.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Indicates whether the parameter is required.
     * </p>
     * 
     * @return Indicates whether the parameter is required.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Indicates whether the parameter is required.
     * </p>
     * 
     * @param required
     *        Indicates whether the parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetResourceTypeParameter withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * Indicates whether the parameter is required.
     * </p>
     * 
     * @return Indicates whether the parameter is required.
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof TargetResourceTypeParameter == false)
            return false;
        TargetResourceTypeParameter other = (TargetResourceTypeParameter) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        return hashCode;
    }

    @Override
    public TargetResourceTypeParameter clone() {
        try {
            return (TargetResourceTypeParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.TargetResourceTypeParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
