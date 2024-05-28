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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the level of detail for a particular aspect of your DataSync <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">task report</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ReportOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether your task report includes errors only or successes and errors.
     * </p>
     * <p>
     * For example, your report might mostly include only what didn't go well in your transfer (<code>ERRORS_ONLY</code>
     * ). At the same time, you want to verify that your <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">task filter</a> is working correctly.
     * In this situation, you can get a list of what files DataSync successfully skipped and if something transferred
     * that you didn't to transfer (<code>SUCCESSES_AND_ERRORS</code>).
     * </p>
     */
    private String reportLevel;

    /**
     * <p>
     * Specifies whether your task report includes errors only or successes and errors.
     * </p>
     * <p>
     * For example, your report might mostly include only what didn't go well in your transfer (<code>ERRORS_ONLY</code>
     * ). At the same time, you want to verify that your <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">task filter</a> is working correctly.
     * In this situation, you can get a list of what files DataSync successfully skipped and if something transferred
     * that you didn't to transfer (<code>SUCCESSES_AND_ERRORS</code>).
     * </p>
     * 
     * @param reportLevel
     *        Specifies whether your task report includes errors only or successes and errors.</p>
     *        <p>
     *        For example, your report might mostly include only what didn't go well in your transfer (
     *        <code>ERRORS_ONLY</code>). At the same time, you want to verify that your <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">task filter</a> is working
     *        correctly. In this situation, you can get a list of what files DataSync successfully skipped and if
     *        something transferred that you didn't to transfer (<code>SUCCESSES_AND_ERRORS</code>).
     * @see ReportLevel
     */

    public void setReportLevel(String reportLevel) {
        this.reportLevel = reportLevel;
    }

    /**
     * <p>
     * Specifies whether your task report includes errors only or successes and errors.
     * </p>
     * <p>
     * For example, your report might mostly include only what didn't go well in your transfer (<code>ERRORS_ONLY</code>
     * ). At the same time, you want to verify that your <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">task filter</a> is working correctly.
     * In this situation, you can get a list of what files DataSync successfully skipped and if something transferred
     * that you didn't to transfer (<code>SUCCESSES_AND_ERRORS</code>).
     * </p>
     * 
     * @return Specifies whether your task report includes errors only or successes and errors.</p>
     *         <p>
     *         For example, your report might mostly include only what didn't go well in your transfer (
     *         <code>ERRORS_ONLY</code>). At the same time, you want to verify that your <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">task filter</a> is working
     *         correctly. In this situation, you can get a list of what files DataSync successfully skipped and if
     *         something transferred that you didn't to transfer (<code>SUCCESSES_AND_ERRORS</code>).
     * @see ReportLevel
     */

    public String getReportLevel() {
        return this.reportLevel;
    }

    /**
     * <p>
     * Specifies whether your task report includes errors only or successes and errors.
     * </p>
     * <p>
     * For example, your report might mostly include only what didn't go well in your transfer (<code>ERRORS_ONLY</code>
     * ). At the same time, you want to verify that your <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">task filter</a> is working correctly.
     * In this situation, you can get a list of what files DataSync successfully skipped and if something transferred
     * that you didn't to transfer (<code>SUCCESSES_AND_ERRORS</code>).
     * </p>
     * 
     * @param reportLevel
     *        Specifies whether your task report includes errors only or successes and errors.</p>
     *        <p>
     *        For example, your report might mostly include only what didn't go well in your transfer (
     *        <code>ERRORS_ONLY</code>). At the same time, you want to verify that your <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">task filter</a> is working
     *        correctly. In this situation, you can get a list of what files DataSync successfully skipped and if
     *        something transferred that you didn't to transfer (<code>SUCCESSES_AND_ERRORS</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportLevel
     */

    public ReportOverride withReportLevel(String reportLevel) {
        setReportLevel(reportLevel);
        return this;
    }

    /**
     * <p>
     * Specifies whether your task report includes errors only or successes and errors.
     * </p>
     * <p>
     * For example, your report might mostly include only what didn't go well in your transfer (<code>ERRORS_ONLY</code>
     * ). At the same time, you want to verify that your <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">task filter</a> is working correctly.
     * In this situation, you can get a list of what files DataSync successfully skipped and if something transferred
     * that you didn't to transfer (<code>SUCCESSES_AND_ERRORS</code>).
     * </p>
     * 
     * @param reportLevel
     *        Specifies whether your task report includes errors only or successes and errors.</p>
     *        <p>
     *        For example, your report might mostly include only what didn't go well in your transfer (
     *        <code>ERRORS_ONLY</code>). At the same time, you want to verify that your <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">task filter</a> is working
     *        correctly. In this situation, you can get a list of what files DataSync successfully skipped and if
     *        something transferred that you didn't to transfer (<code>SUCCESSES_AND_ERRORS</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportLevel
     */

    public ReportOverride withReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel.toString();
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
        if (getReportLevel() != null)
            sb.append("ReportLevel: ").append(getReportLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportOverride == false)
            return false;
        ReportOverride other = (ReportOverride) obj;
        if (other.getReportLevel() == null ^ this.getReportLevel() == null)
            return false;
        if (other.getReportLevel() != null && other.getReportLevel().equals(this.getReportLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportLevel() == null) ? 0 : getReportLevel().hashCode());
        return hashCode;
    }

    @Override
    public ReportOverride clone() {
        try {
            return (ReportOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.ReportOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
