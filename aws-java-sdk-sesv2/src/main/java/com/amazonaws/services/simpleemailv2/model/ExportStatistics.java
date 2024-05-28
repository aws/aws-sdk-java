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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistics about the execution of an export job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ExportStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of records that were processed to generate the final export file.
     * </p>
     */
    private Integer processedRecordsCount;
    /**
     * <p>
     * The number of records that were exported to the final export file.
     * </p>
     * <p>
     * This value might not be available for all export source types
     * </p>
     */
    private Integer exportedRecordsCount;

    /**
     * <p>
     * The number of records that were processed to generate the final export file.
     * </p>
     * 
     * @param processedRecordsCount
     *        The number of records that were processed to generate the final export file.
     */

    public void setProcessedRecordsCount(Integer processedRecordsCount) {
        this.processedRecordsCount = processedRecordsCount;
    }

    /**
     * <p>
     * The number of records that were processed to generate the final export file.
     * </p>
     * 
     * @return The number of records that were processed to generate the final export file.
     */

    public Integer getProcessedRecordsCount() {
        return this.processedRecordsCount;
    }

    /**
     * <p>
     * The number of records that were processed to generate the final export file.
     * </p>
     * 
     * @param processedRecordsCount
     *        The number of records that were processed to generate the final export file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportStatistics withProcessedRecordsCount(Integer processedRecordsCount) {
        setProcessedRecordsCount(processedRecordsCount);
        return this;
    }

    /**
     * <p>
     * The number of records that were exported to the final export file.
     * </p>
     * <p>
     * This value might not be available for all export source types
     * </p>
     * 
     * @param exportedRecordsCount
     *        The number of records that were exported to the final export file.</p>
     *        <p>
     *        This value might not be available for all export source types
     */

    public void setExportedRecordsCount(Integer exportedRecordsCount) {
        this.exportedRecordsCount = exportedRecordsCount;
    }

    /**
     * <p>
     * The number of records that were exported to the final export file.
     * </p>
     * <p>
     * This value might not be available for all export source types
     * </p>
     * 
     * @return The number of records that were exported to the final export file.</p>
     *         <p>
     *         This value might not be available for all export source types
     */

    public Integer getExportedRecordsCount() {
        return this.exportedRecordsCount;
    }

    /**
     * <p>
     * The number of records that were exported to the final export file.
     * </p>
     * <p>
     * This value might not be available for all export source types
     * </p>
     * 
     * @param exportedRecordsCount
     *        The number of records that were exported to the final export file.</p>
     *        <p>
     *        This value might not be available for all export source types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportStatistics withExportedRecordsCount(Integer exportedRecordsCount) {
        setExportedRecordsCount(exportedRecordsCount);
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
        if (getProcessedRecordsCount() != null)
            sb.append("ProcessedRecordsCount: ").append(getProcessedRecordsCount()).append(",");
        if (getExportedRecordsCount() != null)
            sb.append("ExportedRecordsCount: ").append(getExportedRecordsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportStatistics == false)
            return false;
        ExportStatistics other = (ExportStatistics) obj;
        if (other.getProcessedRecordsCount() == null ^ this.getProcessedRecordsCount() == null)
            return false;
        if (other.getProcessedRecordsCount() != null && other.getProcessedRecordsCount().equals(this.getProcessedRecordsCount()) == false)
            return false;
        if (other.getExportedRecordsCount() == null ^ this.getExportedRecordsCount() == null)
            return false;
        if (other.getExportedRecordsCount() != null && other.getExportedRecordsCount().equals(this.getExportedRecordsCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessedRecordsCount() == null) ? 0 : getProcessedRecordsCount().hashCode());
        hashCode = prime * hashCode + ((getExportedRecordsCount() == null) ? 0 : getExportedRecordsCount().hashCode());
        return hashCode;
    }

    @Override
    public ExportStatistics clone() {
        try {
            return (ExportStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.ExportStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
