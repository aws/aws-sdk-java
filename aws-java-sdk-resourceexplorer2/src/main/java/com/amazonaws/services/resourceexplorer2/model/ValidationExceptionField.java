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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes a request field with a validation error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ValidationExceptionField"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationExceptionField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the request field that had a validation error.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The validation error caused by the request field.
     * </p>
     */
    private String validationIssue;

    /**
     * <p>
     * The name of the request field that had a validation error.
     * </p>
     * 
     * @param name
     *        The name of the request field that had a validation error.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the request field that had a validation error.
     * </p>
     * 
     * @return The name of the request field that had a validation error.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the request field that had a validation error.
     * </p>
     * 
     * @param name
     *        The name of the request field that had a validation error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationExceptionField withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The validation error caused by the request field.
     * </p>
     * 
     * @param validationIssue
     *        The validation error caused by the request field.
     */

    public void setValidationIssue(String validationIssue) {
        this.validationIssue = validationIssue;
    }

    /**
     * <p>
     * The validation error caused by the request field.
     * </p>
     * 
     * @return The validation error caused by the request field.
     */

    public String getValidationIssue() {
        return this.validationIssue;
    }

    /**
     * <p>
     * The validation error caused by the request field.
     * </p>
     * 
     * @param validationIssue
     *        The validation error caused by the request field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationExceptionField withValidationIssue(String validationIssue) {
        setValidationIssue(validationIssue);
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
        if (getValidationIssue() != null)
            sb.append("ValidationIssue: ").append(getValidationIssue());
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
        if (other.getValidationIssue() == null ^ this.getValidationIssue() == null)
            return false;
        if (other.getValidationIssue() != null && other.getValidationIssue().equals(this.getValidationIssue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValidationIssue() == null) ? 0 : getValidationIssue().hashCode());
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
        com.amazonaws.services.resourceexplorer2.model.transform.ValidationExceptionFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
