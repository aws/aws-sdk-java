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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the end result of the flow run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ExecutionResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides any error message information related to the flow run.
     * </p>
     */
    private ErrorInfo errorInfo;
    /**
     * <p>
     * The total number of bytes processed by the flow run.
     * </p>
     */
    private Long bytesProcessed;
    /**
     * <p>
     * The total number of bytes written as a result of the flow run.
     * </p>
     */
    private Long bytesWritten;
    /**
     * <p>
     * The number of records processed in the flow run.
     * </p>
     */
    private Long recordsProcessed;
    /**
     * <p>
     * The number of processes that Amazon AppFlow ran at the same time when it retrieved your data.
     * </p>
     */
    private Long numParallelProcesses;
    /**
     * <p>
     * The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     * application.
     * </p>
     */
    private Long maxPageSize;

    /**
     * <p>
     * Provides any error message information related to the flow run.
     * </p>
     * 
     * @param errorInfo
     *        Provides any error message information related to the flow run.
     */

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * Provides any error message information related to the flow run.
     * </p>
     * 
     * @return Provides any error message information related to the flow run.
     */

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * <p>
     * Provides any error message information related to the flow run.
     * </p>
     * 
     * @param errorInfo
     *        Provides any error message information related to the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionResult withErrorInfo(ErrorInfo errorInfo) {
        setErrorInfo(errorInfo);
        return this;
    }

    /**
     * <p>
     * The total number of bytes processed by the flow run.
     * </p>
     * 
     * @param bytesProcessed
     *        The total number of bytes processed by the flow run.
     */

    public void setBytesProcessed(Long bytesProcessed) {
        this.bytesProcessed = bytesProcessed;
    }

    /**
     * <p>
     * The total number of bytes processed by the flow run.
     * </p>
     * 
     * @return The total number of bytes processed by the flow run.
     */

    public Long getBytesProcessed() {
        return this.bytesProcessed;
    }

    /**
     * <p>
     * The total number of bytes processed by the flow run.
     * </p>
     * 
     * @param bytesProcessed
     *        The total number of bytes processed by the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionResult withBytesProcessed(Long bytesProcessed) {
        setBytesProcessed(bytesProcessed);
        return this;
    }

    /**
     * <p>
     * The total number of bytes written as a result of the flow run.
     * </p>
     * 
     * @param bytesWritten
     *        The total number of bytes written as a result of the flow run.
     */

    public void setBytesWritten(Long bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    /**
     * <p>
     * The total number of bytes written as a result of the flow run.
     * </p>
     * 
     * @return The total number of bytes written as a result of the flow run.
     */

    public Long getBytesWritten() {
        return this.bytesWritten;
    }

    /**
     * <p>
     * The total number of bytes written as a result of the flow run.
     * </p>
     * 
     * @param bytesWritten
     *        The total number of bytes written as a result of the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionResult withBytesWritten(Long bytesWritten) {
        setBytesWritten(bytesWritten);
        return this;
    }

    /**
     * <p>
     * The number of records processed in the flow run.
     * </p>
     * 
     * @param recordsProcessed
     *        The number of records processed in the flow run.
     */

    public void setRecordsProcessed(Long recordsProcessed) {
        this.recordsProcessed = recordsProcessed;
    }

    /**
     * <p>
     * The number of records processed in the flow run.
     * </p>
     * 
     * @return The number of records processed in the flow run.
     */

    public Long getRecordsProcessed() {
        return this.recordsProcessed;
    }

    /**
     * <p>
     * The number of records processed in the flow run.
     * </p>
     * 
     * @param recordsProcessed
     *        The number of records processed in the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionResult withRecordsProcessed(Long recordsProcessed) {
        setRecordsProcessed(recordsProcessed);
        return this;
    }

    /**
     * <p>
     * The number of processes that Amazon AppFlow ran at the same time when it retrieved your data.
     * </p>
     * 
     * @param numParallelProcesses
     *        The number of processes that Amazon AppFlow ran at the same time when it retrieved your data.
     */

    public void setNumParallelProcesses(Long numParallelProcesses) {
        this.numParallelProcesses = numParallelProcesses;
    }

    /**
     * <p>
     * The number of processes that Amazon AppFlow ran at the same time when it retrieved your data.
     * </p>
     * 
     * @return The number of processes that Amazon AppFlow ran at the same time when it retrieved your data.
     */

    public Long getNumParallelProcesses() {
        return this.numParallelProcesses;
    }

    /**
     * <p>
     * The number of processes that Amazon AppFlow ran at the same time when it retrieved your data.
     * </p>
     * 
     * @param numParallelProcesses
     *        The number of processes that Amazon AppFlow ran at the same time when it retrieved your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionResult withNumParallelProcesses(Long numParallelProcesses) {
        setNumParallelProcesses(numParallelProcesses);
        return this;
    }

    /**
     * <p>
     * The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     * application.
     * </p>
     * 
     * @param maxPageSize
     *        The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     *        application.
     */

    public void setMaxPageSize(Long maxPageSize) {
        this.maxPageSize = maxPageSize;
    }

    /**
     * <p>
     * The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     * application.
     * </p>
     * 
     * @return The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     *         application.
     */

    public Long getMaxPageSize() {
        return this.maxPageSize;
    }

    /**
     * <p>
     * The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     * application.
     * </p>
     * 
     * @param maxPageSize
     *        The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionResult withMaxPageSize(Long maxPageSize) {
        setMaxPageSize(maxPageSize);
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
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo()).append(",");
        if (getBytesProcessed() != null)
            sb.append("BytesProcessed: ").append(getBytesProcessed()).append(",");
        if (getBytesWritten() != null)
            sb.append("BytesWritten: ").append(getBytesWritten()).append(",");
        if (getRecordsProcessed() != null)
            sb.append("RecordsProcessed: ").append(getRecordsProcessed()).append(",");
        if (getNumParallelProcesses() != null)
            sb.append("NumParallelProcesses: ").append(getNumParallelProcesses()).append(",");
        if (getMaxPageSize() != null)
            sb.append("MaxPageSize: ").append(getMaxPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionResult == false)
            return false;
        ExecutionResult other = (ExecutionResult) obj;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        if (other.getBytesProcessed() == null ^ this.getBytesProcessed() == null)
            return false;
        if (other.getBytesProcessed() != null && other.getBytesProcessed().equals(this.getBytesProcessed()) == false)
            return false;
        if (other.getBytesWritten() == null ^ this.getBytesWritten() == null)
            return false;
        if (other.getBytesWritten() != null && other.getBytesWritten().equals(this.getBytesWritten()) == false)
            return false;
        if (other.getRecordsProcessed() == null ^ this.getRecordsProcessed() == null)
            return false;
        if (other.getRecordsProcessed() != null && other.getRecordsProcessed().equals(this.getRecordsProcessed()) == false)
            return false;
        if (other.getNumParallelProcesses() == null ^ this.getNumParallelProcesses() == null)
            return false;
        if (other.getNumParallelProcesses() != null && other.getNumParallelProcesses().equals(this.getNumParallelProcesses()) == false)
            return false;
        if (other.getMaxPageSize() == null ^ this.getMaxPageSize() == null)
            return false;
        if (other.getMaxPageSize() != null && other.getMaxPageSize().equals(this.getMaxPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode + ((getBytesProcessed() == null) ? 0 : getBytesProcessed().hashCode());
        hashCode = prime * hashCode + ((getBytesWritten() == null) ? 0 : getBytesWritten().hashCode());
        hashCode = prime * hashCode + ((getRecordsProcessed() == null) ? 0 : getRecordsProcessed().hashCode());
        hashCode = prime * hashCode + ((getNumParallelProcesses() == null) ? 0 : getNumParallelProcesses().hashCode());
        hashCode = prime * hashCode + ((getMaxPageSize() == null) ? 0 : getMaxPageSize().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionResult clone() {
        try {
            return (ExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ExecutionResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
