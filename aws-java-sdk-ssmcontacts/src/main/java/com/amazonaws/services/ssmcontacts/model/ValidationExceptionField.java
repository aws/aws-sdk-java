/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about which field caused the exception.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ValidationExceptionField"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationExceptionField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the field that caused the exception.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Information about what caused the field to cause an exception.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The name of the field that caused the exception.
     * </p>
     * 
     * @param name
     *        The name of the field that caused the exception.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the field that caused the exception.
     * </p>
     * 
     * @return The name of the field that caused the exception.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the field that caused the exception.
     * </p>
     * 
     * @param name
     *        The name of the field that caused the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationExceptionField withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Information about what caused the field to cause an exception.
     * </p>
     * 
     * @param message
     *        Information about what caused the field to cause an exception.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Information about what caused the field to cause an exception.
     * </p>
     * 
     * @return Information about what caused the field to cause an exception.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Information about what caused the field to cause an exception.
     * </p>
     * 
     * @param message
     *        Information about what caused the field to cause an exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationExceptionField withMessage(String message) {
        setMessage(message);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
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
        com.amazonaws.services.ssmcontacts.model.transform.ValidationExceptionFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
