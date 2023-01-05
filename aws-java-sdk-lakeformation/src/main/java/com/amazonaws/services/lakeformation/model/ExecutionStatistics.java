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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistics related to the processing of a query statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ExecutionStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The average time the request took to be executed.
     * </p>
     */
    private Long averageExecutionTimeMillis;
    /**
     * <p>
     * The amount of data that was scanned in bytes.
     * </p>
     */
    private Long dataScannedBytes;
    /**
     * <p>
     * The number of work units executed.
     * </p>
     */
    private Long workUnitsExecutedCount;

    /**
     * <p>
     * The average time the request took to be executed.
     * </p>
     * 
     * @param averageExecutionTimeMillis
     *        The average time the request took to be executed.
     */

    public void setAverageExecutionTimeMillis(Long averageExecutionTimeMillis) {
        this.averageExecutionTimeMillis = averageExecutionTimeMillis;
    }

    /**
     * <p>
     * The average time the request took to be executed.
     * </p>
     * 
     * @return The average time the request took to be executed.
     */

    public Long getAverageExecutionTimeMillis() {
        return this.averageExecutionTimeMillis;
    }

    /**
     * <p>
     * The average time the request took to be executed.
     * </p>
     * 
     * @param averageExecutionTimeMillis
     *        The average time the request took to be executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStatistics withAverageExecutionTimeMillis(Long averageExecutionTimeMillis) {
        setAverageExecutionTimeMillis(averageExecutionTimeMillis);
        return this;
    }

    /**
     * <p>
     * The amount of data that was scanned in bytes.
     * </p>
     * 
     * @param dataScannedBytes
     *        The amount of data that was scanned in bytes.
     */

    public void setDataScannedBytes(Long dataScannedBytes) {
        this.dataScannedBytes = dataScannedBytes;
    }

    /**
     * <p>
     * The amount of data that was scanned in bytes.
     * </p>
     * 
     * @return The amount of data that was scanned in bytes.
     */

    public Long getDataScannedBytes() {
        return this.dataScannedBytes;
    }

    /**
     * <p>
     * The amount of data that was scanned in bytes.
     * </p>
     * 
     * @param dataScannedBytes
     *        The amount of data that was scanned in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStatistics withDataScannedBytes(Long dataScannedBytes) {
        setDataScannedBytes(dataScannedBytes);
        return this;
    }

    /**
     * <p>
     * The number of work units executed.
     * </p>
     * 
     * @param workUnitsExecutedCount
     *        The number of work units executed.
     */

    public void setWorkUnitsExecutedCount(Long workUnitsExecutedCount) {
        this.workUnitsExecutedCount = workUnitsExecutedCount;
    }

    /**
     * <p>
     * The number of work units executed.
     * </p>
     * 
     * @return The number of work units executed.
     */

    public Long getWorkUnitsExecutedCount() {
        return this.workUnitsExecutedCount;
    }

    /**
     * <p>
     * The number of work units executed.
     * </p>
     * 
     * @param workUnitsExecutedCount
     *        The number of work units executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStatistics withWorkUnitsExecutedCount(Long workUnitsExecutedCount) {
        setWorkUnitsExecutedCount(workUnitsExecutedCount);
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
        if (getAverageExecutionTimeMillis() != null)
            sb.append("AverageExecutionTimeMillis: ").append(getAverageExecutionTimeMillis()).append(",");
        if (getDataScannedBytes() != null)
            sb.append("DataScannedBytes: ").append(getDataScannedBytes()).append(",");
        if (getWorkUnitsExecutedCount() != null)
            sb.append("WorkUnitsExecutedCount: ").append(getWorkUnitsExecutedCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionStatistics == false)
            return false;
        ExecutionStatistics other = (ExecutionStatistics) obj;
        if (other.getAverageExecutionTimeMillis() == null ^ this.getAverageExecutionTimeMillis() == null)
            return false;
        if (other.getAverageExecutionTimeMillis() != null && other.getAverageExecutionTimeMillis().equals(this.getAverageExecutionTimeMillis()) == false)
            return false;
        if (other.getDataScannedBytes() == null ^ this.getDataScannedBytes() == null)
            return false;
        if (other.getDataScannedBytes() != null && other.getDataScannedBytes().equals(this.getDataScannedBytes()) == false)
            return false;
        if (other.getWorkUnitsExecutedCount() == null ^ this.getWorkUnitsExecutedCount() == null)
            return false;
        if (other.getWorkUnitsExecutedCount() != null && other.getWorkUnitsExecutedCount().equals(this.getWorkUnitsExecutedCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAverageExecutionTimeMillis() == null) ? 0 : getAverageExecutionTimeMillis().hashCode());
        hashCode = prime * hashCode + ((getDataScannedBytes() == null) ? 0 : getDataScannedBytes().hashCode());
        hashCode = prime * hashCode + ((getWorkUnitsExecutedCount() == null) ? 0 : getWorkUnitsExecutedCount().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionStatistics clone() {
        try {
            return (ExecutionStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.ExecutionStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
