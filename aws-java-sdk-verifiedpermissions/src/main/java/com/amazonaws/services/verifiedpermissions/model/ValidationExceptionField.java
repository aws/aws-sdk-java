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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a field that failed policy validation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ValidationExceptionField"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationExceptionField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the specific element that Verified Permissions found to be not valid.
     * </p>
     */
    private String path;
    /**
     * <p>
     * Describes the policy validation error.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The path to the specific element that Verified Permissions found to be not valid.
     * </p>
     * 
     * @param path
     *        The path to the specific element that Verified Permissions found to be not valid.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the specific element that Verified Permissions found to be not valid.
     * </p>
     * 
     * @return The path to the specific element that Verified Permissions found to be not valid.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the specific element that Verified Permissions found to be not valid.
     * </p>
     * 
     * @param path
     *        The path to the specific element that Verified Permissions found to be not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationExceptionField withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Describes the policy validation error.
     * </p>
     * 
     * @param message
     *        Describes the policy validation error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Describes the policy validation error.
     * </p>
     * 
     * @return Describes the policy validation error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Describes the policy validation error.
     * </p>
     * 
     * @param message
     *        Describes the policy validation error.
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
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
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
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

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
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
        com.amazonaws.services.verifiedpermissions.model.transform.ValidationExceptionFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
