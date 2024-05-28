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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Import task error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ImportTaskError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTaskError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Import task error data.
     * </p>
     */
    private ImportErrorData errorData;
    /**
     * <p>
     * Import task error datetime.
     * </p>
     */
    private String errorDateTime;
    /**
     * <p>
     * Import task error type.
     * </p>
     */
    private String errorType;

    /**
     * <p>
     * Import task error data.
     * </p>
     * 
     * @param errorData
     *        Import task error data.
     */

    public void setErrorData(ImportErrorData errorData) {
        this.errorData = errorData;
    }

    /**
     * <p>
     * Import task error data.
     * </p>
     * 
     * @return Import task error data.
     */

    public ImportErrorData getErrorData() {
        return this.errorData;
    }

    /**
     * <p>
     * Import task error data.
     * </p>
     * 
     * @param errorData
     *        Import task error data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTaskError withErrorData(ImportErrorData errorData) {
        setErrorData(errorData);
        return this;
    }

    /**
     * <p>
     * Import task error datetime.
     * </p>
     * 
     * @param errorDateTime
     *        Import task error datetime.
     */

    public void setErrorDateTime(String errorDateTime) {
        this.errorDateTime = errorDateTime;
    }

    /**
     * <p>
     * Import task error datetime.
     * </p>
     * 
     * @return Import task error datetime.
     */

    public String getErrorDateTime() {
        return this.errorDateTime;
    }

    /**
     * <p>
     * Import task error datetime.
     * </p>
     * 
     * @param errorDateTime
     *        Import task error datetime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTaskError withErrorDateTime(String errorDateTime) {
        setErrorDateTime(errorDateTime);
        return this;
    }

    /**
     * <p>
     * Import task error type.
     * </p>
     * 
     * @param errorType
     *        Import task error type.
     * @see ImportErrorType
     */

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * <p>
     * Import task error type.
     * </p>
     * 
     * @return Import task error type.
     * @see ImportErrorType
     */

    public String getErrorType() {
        return this.errorType;
    }

    /**
     * <p>
     * Import task error type.
     * </p>
     * 
     * @param errorType
     *        Import task error type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportErrorType
     */

    public ImportTaskError withErrorType(String errorType) {
        setErrorType(errorType);
        return this;
    }

    /**
     * <p>
     * Import task error type.
     * </p>
     * 
     * @param errorType
     *        Import task error type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportErrorType
     */

    public ImportTaskError withErrorType(ImportErrorType errorType) {
        this.errorType = errorType.toString();
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
        if (getErrorData() != null)
            sb.append("ErrorData: ").append(getErrorData()).append(",");
        if (getErrorDateTime() != null)
            sb.append("ErrorDateTime: ").append(getErrorDateTime()).append(",");
        if (getErrorType() != null)
            sb.append("ErrorType: ").append(getErrorType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTaskError == false)
            return false;
        ImportTaskError other = (ImportTaskError) obj;
        if (other.getErrorData() == null ^ this.getErrorData() == null)
            return false;
        if (other.getErrorData() != null && other.getErrorData().equals(this.getErrorData()) == false)
            return false;
        if (other.getErrorDateTime() == null ^ this.getErrorDateTime() == null)
            return false;
        if (other.getErrorDateTime() != null && other.getErrorDateTime().equals(this.getErrorDateTime()) == false)
            return false;
        if (other.getErrorType() == null ^ this.getErrorType() == null)
            return false;
        if (other.getErrorType() != null && other.getErrorType().equals(this.getErrorType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorData() == null) ? 0 : getErrorData().hashCode());
        hashCode = prime * hashCode + ((getErrorDateTime() == null) ? 0 : getErrorDateTime().hashCode());
        hashCode = prime * hashCode + ((getErrorType() == null) ? 0 : getErrorType().hashCode());
        return hashCode;
    }

    @Override
    public ImportTaskError clone() {
        try {
            return (ImportTaskError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ImportTaskErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
