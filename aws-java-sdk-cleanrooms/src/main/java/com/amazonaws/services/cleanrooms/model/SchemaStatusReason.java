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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A reason why the schema status is set to its current value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/SchemaStatusReason" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaStatusReason implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The schema status reason code.
     * </p>
     */
    private String code;
    /**
     * <p>
     * An explanation of the schema status reason code.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The schema status reason code.
     * </p>
     * 
     * @param code
     *        The schema status reason code.
     * @see SchemaStatusReasonCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The schema status reason code.
     * </p>
     * 
     * @return The schema status reason code.
     * @see SchemaStatusReasonCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The schema status reason code.
     * </p>
     * 
     * @param code
     *        The schema status reason code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatusReasonCode
     */

    public SchemaStatusReason withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The schema status reason code.
     * </p>
     * 
     * @param code
     *        The schema status reason code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatusReasonCode
     */

    public SchemaStatusReason withCode(SchemaStatusReasonCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * An explanation of the schema status reason code.
     * </p>
     * 
     * @param message
     *        An explanation of the schema status reason code.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An explanation of the schema status reason code.
     * </p>
     * 
     * @return An explanation of the schema status reason code.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * An explanation of the schema status reason code.
     * </p>
     * 
     * @param message
     *        An explanation of the schema status reason code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaStatusReason withMessage(String message) {
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
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

        if (obj instanceof SchemaStatusReason == false)
            return false;
        SchemaStatusReason other = (SchemaStatusReason) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
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

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public SchemaStatusReason clone() {
        try {
            return (SchemaStatusReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.SchemaStatusReasonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
