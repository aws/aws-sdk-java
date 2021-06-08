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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error response to GetFunctionConfiguration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ImageConfigError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageConfigError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Error code.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * Error message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Error code.
     * </p>
     * 
     * @param errorCode
     *        Error code.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Error code.
     * </p>
     * 
     * @return Error code.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Error code.
     * </p>
     * 
     * @param errorCode
     *        Error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfigError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Error message.
     * </p>
     * 
     * @param message
     *        Error message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Error message.
     * </p>
     * 
     * @return Error message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Error message.
     * </p>
     * 
     * @param message
     *        Error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfigError withMessage(String message) {
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
        if (getMessage() != null)
            sb.append("Message: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageConfigError == false)
            return false;
        ImageConfigError other = (ImageConfigError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
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
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public ImageConfigError clone() {
        try {
            return (ImageConfigError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.ImageConfigErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
