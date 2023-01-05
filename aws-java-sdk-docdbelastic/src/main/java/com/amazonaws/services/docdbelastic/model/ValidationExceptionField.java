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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A specific field in which a given validation exception occurred.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ValidationExceptionField"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationExceptionField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An error message describing the validation exception in this field.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The name of the field where the validation exception occurred.
     * </p>
     */
    private String name;

    /**
     * <p>
     * An error message describing the validation exception in this field.
     * </p>
     * 
     * @param message
     *        An error message describing the validation exception in this field.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An error message describing the validation exception in this field.
     * </p>
     * 
     * @return An error message describing the validation exception in this field.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * An error message describing the validation exception in this field.
     * </p>
     * 
     * @param message
     *        An error message describing the validation exception in this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationExceptionField withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The name of the field where the validation exception occurred.
     * </p>
     * 
     * @param name
     *        The name of the field where the validation exception occurred.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the field where the validation exception occurred.
     * </p>
     * 
     * @return The name of the field where the validation exception occurred.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the field where the validation exception occurred.
     * </p>
     * 
     * @param name
     *        The name of the field where the validation exception occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationExceptionField withName(String name) {
        setName(name);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationExceptionField == false)
            return false;
        ValidationExceptionField other = (ValidationExceptionField) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ValidationExceptionField clone() {
        try {
            return (ValidationExceptionField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.docdbelastic.model.transform.ValidationExceptionFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
