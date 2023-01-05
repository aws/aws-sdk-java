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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing information about one error encountered while performing an <a
 * href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdatePermissions.html">UpdatePermissions</a>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies which permission update caused the error.
     * </p>
     */
    private UpdateInstruction causedBy;
    /**
     * <p>
     * The error code.
     * </p>
     */
    private Integer code;
    /**
     * <p>
     * The message for this error.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Specifies which permission update caused the error.
     * </p>
     * 
     * @param causedBy
     *        Specifies which permission update caused the error.
     */

    public void setCausedBy(UpdateInstruction causedBy) {
        this.causedBy = causedBy;
    }

    /**
     * <p>
     * Specifies which permission update caused the error.
     * </p>
     * 
     * @return Specifies which permission update caused the error.
     */

    public UpdateInstruction getCausedBy() {
        return this.causedBy;
    }

    /**
     * <p>
     * Specifies which permission update caused the error.
     * </p>
     * 
     * @param causedBy
     *        Specifies which permission update caused the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateError withCausedBy(UpdateInstruction causedBy) {
        setCausedBy(causedBy);
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param code
     *        The error code.
     */

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     */

    public Integer getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param code
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateError withCode(Integer code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The message for this error.
     * </p>
     * 
     * @param message
     *        The message for this error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message for this error.
     * </p>
     * 
     * @return The message for this error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message for this error.
     * </p>
     * 
     * @param message
     *        The message for this error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateError withMessage(String message) {
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
        if (getCausedBy() != null)
            sb.append("CausedBy: ").append(getCausedBy()).append(",");
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

        if (obj instanceof UpdateError == false)
            return false;
        UpdateError other = (UpdateError) obj;
        if (other.getCausedBy() == null ^ this.getCausedBy() == null)
            return false;
        if (other.getCausedBy() != null && other.getCausedBy().equals(this.getCausedBy()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getCausedBy() == null) ? 0 : getCausedBy().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public UpdateError clone() {
        try {
            return (UpdateError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.UpdateErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
