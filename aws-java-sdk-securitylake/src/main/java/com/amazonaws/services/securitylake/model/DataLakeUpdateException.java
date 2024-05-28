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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request which failed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DataLakeUpdateException"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeUpdateException implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reason code for the exception of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API
     * request.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The reason for the exception of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API request.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The reason code for the exception of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API
     * request.
     * </p>
     * 
     * @param code
     *        The reason code for the exception of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code>
     *        API request.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The reason code for the exception of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API
     * request.
     * </p>
     * 
     * @return The reason code for the exception of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code>
     *         API request.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The reason code for the exception of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API
     * request.
     * </p>
     * 
     * @param code
     *        The reason code for the exception of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code>
     *        API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeUpdateException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The reason for the exception of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API request.
     * </p>
     * 
     * @param reason
     *        The reason for the exception of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API
     *        request.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the exception of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API request.
     * </p>
     * 
     * @return The reason for the exception of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API
     *         request.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the exception of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API request.
     * </p>
     * 
     * @param reason
     *        The reason for the exception of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeUpdateException withReason(String reason) {
        setReason(reason);
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
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLakeUpdateException == false)
            return false;
        DataLakeUpdateException other = (DataLakeUpdateException) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public DataLakeUpdateException clone() {
        try {
            return (DataLakeUpdateException) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.DataLakeUpdateExceptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
