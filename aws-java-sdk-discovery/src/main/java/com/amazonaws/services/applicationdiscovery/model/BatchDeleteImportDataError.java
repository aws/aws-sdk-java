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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error messages returned for each import task that you deleted as a response for this command.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteImportDataError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique import ID associated with the error that occurred.
     * </p>
     */
    private String importTaskId;
    /**
     * <p>
     * The type of error that occurred for a specific import task.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The description of the error that occurred for a specific import task.
     * </p>
     */
    private String errorDescription;

    /**
     * <p>
     * The unique import ID associated with the error that occurred.
     * </p>
     * 
     * @param importTaskId
     *        The unique import ID associated with the error that occurred.
     */

    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }

    /**
     * <p>
     * The unique import ID associated with the error that occurred.
     * </p>
     * 
     * @return The unique import ID associated with the error that occurred.
     */

    public String getImportTaskId() {
        return this.importTaskId;
    }

    /**
     * <p>
     * The unique import ID associated with the error that occurred.
     * </p>
     * 
     * @param importTaskId
     *        The unique import ID associated with the error that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteImportDataError withImportTaskId(String importTaskId) {
        setImportTaskId(importTaskId);
        return this;
    }

    /**
     * <p>
     * The type of error that occurred for a specific import task.
     * </p>
     * 
     * @param errorCode
     *        The type of error that occurred for a specific import task.
     * @see BatchDeleteImportDataErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The type of error that occurred for a specific import task.
     * </p>
     * 
     * @return The type of error that occurred for a specific import task.
     * @see BatchDeleteImportDataErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The type of error that occurred for a specific import task.
     * </p>
     * 
     * @param errorCode
     *        The type of error that occurred for a specific import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchDeleteImportDataErrorCode
     */

    public BatchDeleteImportDataError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The type of error that occurred for a specific import task.
     * </p>
     * 
     * @param errorCode
     *        The type of error that occurred for a specific import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchDeleteImportDataErrorCode
     */

    public BatchDeleteImportDataError withErrorCode(BatchDeleteImportDataErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The description of the error that occurred for a specific import task.
     * </p>
     * 
     * @param errorDescription
     *        The description of the error that occurred for a specific import task.
     */

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * <p>
     * The description of the error that occurred for a specific import task.
     * </p>
     * 
     * @return The description of the error that occurred for a specific import task.
     */

    public String getErrorDescription() {
        return this.errorDescription;
    }

    /**
     * <p>
     * The description of the error that occurred for a specific import task.
     * </p>
     * 
     * @param errorDescription
     *        The description of the error that occurred for a specific import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteImportDataError withErrorDescription(String errorDescription) {
        setErrorDescription(errorDescription);
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
        if (getImportTaskId() != null)
            sb.append("ImportTaskId: ").append(getImportTaskId()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorDescription() != null)
            sb.append("ErrorDescription: ").append(getErrorDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteImportDataError == false)
            return false;
        BatchDeleteImportDataError other = (BatchDeleteImportDataError) obj;
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null)
            return false;
        if (other.getImportTaskId() != null && other.getImportTaskId().equals(this.getImportTaskId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorDescription() == null ^ this.getErrorDescription() == null)
            return false;
        if (other.getErrorDescription() != null && other.getErrorDescription().equals(this.getErrorDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportTaskId() == null) ? 0 : getImportTaskId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorDescription() == null) ? 0 : getErrorDescription().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteImportDataError clone() {
        try {
            return (BatchDeleteImportDataError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.BatchDeleteImportDataErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
