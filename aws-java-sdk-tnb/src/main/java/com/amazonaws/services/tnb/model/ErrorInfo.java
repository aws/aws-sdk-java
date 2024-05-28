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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides error information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ErrorInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Error cause.
     * </p>
     */
    private String cause;
    /**
     * <p>
     * Error details.
     * </p>
     */
    private String details;

    /**
     * <p>
     * Error cause.
     * </p>
     * 
     * @param cause
     *        Error cause.
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * Error cause.
     * </p>
     * 
     * @return Error cause.
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * Error cause.
     * </p>
     * 
     * @param cause
     *        Error cause.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorInfo withCause(String cause) {
        setCause(cause);
        return this;
    }

    /**
     * <p>
     * Error details.
     * </p>
     * 
     * @param details
     *        Error details.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * Error details.
     * </p>
     * 
     * @return Error details.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Error details.
     * </p>
     * 
     * @param details
     *        Error details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorInfo withDetails(String details) {
        setDetails(details);
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
        if (getCause() != null)
            sb.append("Cause: ").append(getCause()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorInfo == false)
            return false;
        ErrorInfo other = (ErrorInfo) obj;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public ErrorInfo clone() {
        try {
            return (ErrorInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.ErrorInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
