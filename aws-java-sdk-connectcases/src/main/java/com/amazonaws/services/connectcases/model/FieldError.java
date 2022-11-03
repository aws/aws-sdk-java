/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object for errors on fields.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/FieldError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code from getting a field.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The field identifier that caused the error.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The error message from getting a field.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The error code from getting a field.
     * </p>
     * 
     * @param errorCode
     *        The error code from getting a field.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code from getting a field.
     * </p>
     * 
     * @return The error code from getting a field.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code from getting a field.
     * </p>
     * 
     * @param errorCode
     *        The error code from getting a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The field identifier that caused the error.
     * </p>
     * 
     * @param id
     *        The field identifier that caused the error.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The field identifier that caused the error.
     * </p>
     * 
     * @return The field identifier that caused the error.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The field identifier that caused the error.
     * </p>
     * 
     * @param id
     *        The field identifier that caused the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldError withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The error message from getting a field.
     * </p>
     * 
     * @param message
     *        The error message from getting a field.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message from getting a field.
     * </p>
     * 
     * @return The error message from getting a field.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error message from getting a field.
     * </p>
     * 
     * @param message
     *        The error message from getting a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldError withMessage(String message) {
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof FieldError == false)
            return false;
        FieldError other = (FieldError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public FieldError clone() {
        try {
            return (FieldError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.FieldErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
