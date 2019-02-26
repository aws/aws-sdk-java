/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides additional information about an error that was returned by the service as an or. See the
 * <code>errorCode</code> and <code>errorDetails</code> members for more information about the error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/StorageGatewayError" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageGatewayError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Additional information about the error.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * Human-readable text that provides detail about the error that occurred.
     * </p>
     */
    private java.util.Map<String, String> errorDetails;

    /**
     * <p>
     * Additional information about the error.
     * </p>
     * 
     * @param errorCode
     *        Additional information about the error.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Additional information about the error.
     * </p>
     * 
     * @return Additional information about the error.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Additional information about the error.
     * </p>
     * 
     * @param errorCode
     *        Additional information about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public StorageGatewayError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Additional information about the error.
     * </p>
     * 
     * @param errorCode
     *        Additional information about the error.
     * @see ErrorCode
     */

    public void setErrorCode(ErrorCode errorCode) {
        withErrorCode(errorCode);
    }

    /**
     * <p>
     * Additional information about the error.
     * </p>
     * 
     * @param errorCode
     *        Additional information about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public StorageGatewayError withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * Human-readable text that provides detail about the error that occurred.
     * </p>
     * 
     * @return Human-readable text that provides detail about the error that occurred.
     */

    public java.util.Map<String, String> getErrorDetails() {
        return errorDetails;
    }

    /**
     * <p>
     * Human-readable text that provides detail about the error that occurred.
     * </p>
     * 
     * @param errorDetails
     *        Human-readable text that provides detail about the error that occurred.
     */

    public void setErrorDetails(java.util.Map<String, String> errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * <p>
     * Human-readable text that provides detail about the error that occurred.
     * </p>
     * 
     * @param errorDetails
     *        Human-readable text that provides detail about the error that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageGatewayError withErrorDetails(java.util.Map<String, String> errorDetails) {
        setErrorDetails(errorDetails);
        return this;
    }

    public StorageGatewayError addErrorDetailsEntry(String key, String value) {
        if (null == this.errorDetails) {
            this.errorDetails = new java.util.HashMap<String, String>();
        }
        if (this.errorDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.errorDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ErrorDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageGatewayError clearErrorDetailsEntries() {
        this.errorDetails = null;
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
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: ").append(getErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageGatewayError == false)
            return false;
        StorageGatewayError other = (StorageGatewayError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public StorageGatewayError clone() {
        try {
            return (StorageGatewayError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.StorageGatewayErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
