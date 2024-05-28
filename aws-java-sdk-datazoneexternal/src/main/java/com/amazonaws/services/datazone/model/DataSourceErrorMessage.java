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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the error message that is returned if the operation cannot be successfully completed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DataSourceErrorMessage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceErrorMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details of the error message that is returned if the operation cannot be successfully completed.
     * </p>
     */
    private String errorDetail;
    /**
     * <p>
     * The type of the error message that is returned if the operation cannot be successfully completed.
     * </p>
     */
    private String errorType;

    /**
     * <p>
     * The details of the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param errorDetail
     *        The details of the error message that is returned if the operation cannot be successfully completed.
     */

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * <p>
     * The details of the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @return The details of the error message that is returned if the operation cannot be successfully completed.
     */

    public String getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * <p>
     * The details of the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param errorDetail
     *        The details of the error message that is returned if the operation cannot be successfully completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceErrorMessage withErrorDetail(String errorDetail) {
        setErrorDetail(errorDetail);
        return this;
    }

    /**
     * <p>
     * The type of the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param errorType
     *        The type of the error message that is returned if the operation cannot be successfully completed.
     * @see DataSourceErrorType
     */

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * <p>
     * The type of the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @return The type of the error message that is returned if the operation cannot be successfully completed.
     * @see DataSourceErrorType
     */

    public String getErrorType() {
        return this.errorType;
    }

    /**
     * <p>
     * The type of the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param errorType
     *        The type of the error message that is returned if the operation cannot be successfully completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceErrorType
     */

    public DataSourceErrorMessage withErrorType(String errorType) {
        setErrorType(errorType);
        return this;
    }

    /**
     * <p>
     * The type of the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param errorType
     *        The type of the error message that is returned if the operation cannot be successfully completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceErrorType
     */

    public DataSourceErrorMessage withErrorType(DataSourceErrorType errorType) {
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
        if (getErrorDetail() != null)
            sb.append("ErrorDetail: ").append(getErrorDetail()).append(",");
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

        if (obj instanceof DataSourceErrorMessage == false)
            return false;
        DataSourceErrorMessage other = (DataSourceErrorMessage) obj;
        if (other.getErrorDetail() == null ^ this.getErrorDetail() == null)
            return false;
        if (other.getErrorDetail() != null && other.getErrorDetail().equals(this.getErrorDetail()) == false)
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

        hashCode = prime * hashCode + ((getErrorDetail() == null) ? 0 : getErrorDetail().hashCode());
        hashCode = prime * hashCode + ((getErrorType() == null) ? 0 : getErrorType().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceErrorMessage clone() {
        try {
            return (DataSourceErrorMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.DataSourceErrorMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
