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
 * The status of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request. This is set to
 * Completed after the configuration is updated, or removed if deletion of the data lake is successful.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DataLakeUpdateStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeUpdateStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API request which failed.
     * </p>
     */
    private DataLakeUpdateException exception;
    /**
     * <p>
     * The unique ID for the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The status of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request that was requested.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The details of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API request which failed.
     * </p>
     * 
     * @param exception
     *        The details of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API request which
     *        failed.
     */

    public void setException(DataLakeUpdateException exception) {
        this.exception = exception;
    }

    /**
     * <p>
     * The details of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API request which failed.
     * </p>
     * 
     * @return The details of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API request which
     *         failed.
     */

    public DataLakeUpdateException getException() {
        return this.exception;
    }

    /**
     * <p>
     * The details of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API request which failed.
     * </p>
     * 
     * @param exception
     *        The details of the last <code>UpdateDataLake</code>or <code>DeleteDataLake</code> API request which
     *        failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeUpdateStatus withException(DataLakeUpdateException exception) {
        setException(exception);
        return this;
    }

    /**
     * <p>
     * The unique ID for the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request.
     * </p>
     * 
     * @param requestId
     *        The unique ID for the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The unique ID for the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request.
     * </p>
     * 
     * @return The unique ID for the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The unique ID for the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request.
     * </p>
     * 
     * @param requestId
     *        The unique ID for the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeUpdateStatus withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The status of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request that was requested.
     * </p>
     * 
     * @param status
     *        The status of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request that was
     *        requested.
     * @see DataLakeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request that was requested.
     * </p>
     * 
     * @return The status of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request that was
     *         requested.
     * @see DataLakeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request that was requested.
     * </p>
     * 
     * @param status
     *        The status of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request that was
     *        requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLakeStatus
     */

    public DataLakeUpdateStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request that was requested.
     * </p>
     * 
     * @param status
     *        The status of the last <code>UpdateDataLake</code> or <code>DeleteDataLake</code> API request that was
     *        requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLakeStatus
     */

    public DataLakeUpdateStatus withStatus(DataLakeStatus status) {
        this.status = status.toString();
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
        if (getException() != null)
            sb.append("Exception: ").append(getException()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLakeUpdateStatus == false)
            return false;
        DataLakeUpdateStatus other = (DataLakeUpdateStatus) obj;
        if (other.getException() == null ^ this.getException() == null)
            return false;
        if (other.getException() != null && other.getException().equals(this.getException()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getException() == null) ? 0 : getException().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DataLakeUpdateStatus clone() {
        try {
            return (DataLakeUpdateStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.DataLakeUpdateStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
