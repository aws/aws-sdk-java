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
 * Specifies how you want to configure a task report, which provides detailed information about for your DataSync
 * transfer.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Task
 * reports</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/TaskReportConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskReportConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the Amazon S3 bucket where DataSync uploads your task report. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access">Task
     * reports</a>.
     * </p>
     */
    private ReportDestination destination;
    /**
     * <p>
     * Specifies the type of task report that you want:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUMMARY_ONLY</code>: Provides necessary details about your task, including the number of files, objects,
     * and directories transferred and transfer duration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code>: Provides complete details about your task, including a full list of files, objects, and
     * directories that were transferred, skipped, verified, and more.
     * </p>
     * </li>
     * </ul>
     */
    private String outputType;
    /**
     * <p>
     * Specifies whether you want your task report to include only what went wrong with your transfer or a list of what
     * succeeded and didn't.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ERRORS_ONLY</code>: A report shows what DataSync was unable to transfer, skip, verify, and delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESSES_AND_ERRORS</code>: A report shows what DataSync was able and unable to transfer, skip, verify,
     * and delete.
     * </p>
     * </li>
     * </ul>
     */
    private String reportLevel;
    /**
     * <p>
     * Specifies whether your task report includes the new version of each object transferred into an S3 bucket. This
     * only applies if you <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html">enable versioning on
     * your bucket</a>. Keep in mind that setting this to <code>INCLUDE</code> can increase the duration of your task
     * execution.
     * </p>
     */
    private String objectVersionIds;
    /**
     * <p>
     * Customizes the reporting level for aspects of your task report. For example, your report might generally only
     * include errors, but you could specify that you want a list of successes and errors just for the files that
     * DataSync attempted to delete in your destination location.
     * </p>
     */
    private ReportOverrides overrides;

    /**
     * <p>
     * Specifies the Amazon S3 bucket where DataSync uploads your task report. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access">Task
     * reports</a>.
     * </p>
     * 
     * @param destination
     *        Specifies the Amazon S3 bucket where DataSync uploads your task report. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access">Task
     *        reports</a>.
     */

    public void setDestination(ReportDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * Specifies the Amazon S3 bucket where DataSync uploads your task report. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access">Task
     * reports</a>.
     * </p>
     * 
     * @return Specifies the Amazon S3 bucket where DataSync uploads your task report. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access">Task
     *         reports</a>.
     */

    public ReportDestination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * Specifies the Amazon S3 bucket where DataSync uploads your task report. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access">Task
     * reports</a>.
     * </p>
     * 
     * @param destination
     *        Specifies the Amazon S3 bucket where DataSync uploads your task report. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html#task-report-access">Task
     *        reports</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskReportConfig withDestination(ReportDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Specifies the type of task report that you want:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUMMARY_ONLY</code>: Provides necessary details about your task, including the number of files, objects,
     * and directories transferred and transfer duration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code>: Provides complete details about your task, including a full list of files, objects, and
     * directories that were transferred, skipped, verified, and more.
     * </p>
     * </li>
     * </ul>
     * 
     * @param outputType
     *        Specifies the type of task report that you want:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUMMARY_ONLY</code>: Provides necessary details about your task, including the number of files,
     *        objects, and directories transferred and transfer duration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STANDARD</code>: Provides complete details about your task, including a full list of files, objects,
     *        and directories that were transferred, skipped, verified, and more.
     *        </p>
     *        </li>
     * @see ReportOutputType
     */

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    /**
     * <p>
     * Specifies the type of task report that you want:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUMMARY_ONLY</code>: Provides necessary details about your task, including the number of files, objects,
     * and directories transferred and transfer duration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code>: Provides complete details about your task, including a full list of files, objects, and
     * directories that were transferred, skipped, verified, and more.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the type of task report that you want:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUMMARY_ONLY</code>: Provides necessary details about your task, including the number of files,
     *         objects, and directories transferred and transfer duration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STANDARD</code>: Provides complete details about your task, including a full list of files,
     *         objects, and directories that were transferred, skipped, verified, and more.
     *         </p>
     *         </li>
     * @see ReportOutputType
     */

    public String getOutputType() {
        return this.outputType;
    }

    /**
     * <p>
     * Specifies the type of task report that you want:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUMMARY_ONLY</code>: Provides necessary details about your task, including the number of files, objects,
     * and directories transferred and transfer duration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code>: Provides complete details about your task, including a full list of files, objects, and
     * directories that were transferred, skipped, verified, and more.
     * </p>
     * </li>
     * </ul>
     * 
     * @param outputType
     *        Specifies the type of task report that you want:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUMMARY_ONLY</code>: Provides necessary details about your task, including the number of files,
     *        objects, and directories transferred and transfer duration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STANDARD</code>: Provides complete details about your task, including a full list of files, objects,
     *        and directories that were transferred, skipped, verified, and more.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportOutputType
     */

    public TaskReportConfig withOutputType(String outputType) {
        setOutputType(outputType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of task report that you want:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUMMARY_ONLY</code>: Provides necessary details about your task, including the number of files, objects,
     * and directories transferred and transfer duration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code>: Provides complete details about your task, including a full list of files, objects, and
     * directories that were transferred, skipped, verified, and more.
     * </p>
     * </li>
     * </ul>
     * 
     * @param outputType
     *        Specifies the type of task report that you want:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUMMARY_ONLY</code>: Provides necessary details about your task, including the number of files,
     *        objects, and directories transferred and transfer duration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STANDARD</code>: Provides complete details about your task, including a full list of files, objects,
     *        and directories that were transferred, skipped, verified, and more.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportOutputType
     */

    public TaskReportConfig withOutputType(ReportOutputType outputType) {
        this.outputType = outputType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether you want your task report to include only what went wrong with your transfer or a list of what
     * succeeded and didn't.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ERRORS_ONLY</code>: A report shows what DataSync was unable to transfer, skip, verify, and delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESSES_AND_ERRORS</code>: A report shows what DataSync was able and unable to transfer, skip, verify,
     * and delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reportLevel
     *        Specifies whether you want your task report to include only what went wrong with your transfer or a list
     *        of what succeeded and didn't.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ERRORS_ONLY</code>: A report shows what DataSync was unable to transfer, skip, verify, and delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESSES_AND_ERRORS</code>: A report shows what DataSync was able and unable to transfer, skip,
     *        verify, and delete.
     *        </p>
     *        </li>
     * @see ReportLevel
     */

    public void setReportLevel(String reportLevel) {
        this.reportLevel = reportLevel;
    }

    /**
     * <p>
     * Specifies whether you want your task report to include only what went wrong with your transfer or a list of what
     * succeeded and didn't.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ERRORS_ONLY</code>: A report shows what DataSync was unable to transfer, skip, verify, and delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESSES_AND_ERRORS</code>: A report shows what DataSync was able and unable to transfer, skip, verify,
     * and delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether you want your task report to include only what went wrong with your transfer or a list
     *         of what succeeded and didn't.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ERRORS_ONLY</code>: A report shows what DataSync was unable to transfer, skip, verify, and delete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCESSES_AND_ERRORS</code>: A report shows what DataSync was able and unable to transfer, skip,
     *         verify, and delete.
     *         </p>
     *         </li>
     * @see ReportLevel
     */

    public String getReportLevel() {
        return this.reportLevel;
    }

    /**
     * <p>
     * Specifies whether you want your task report to include only what went wrong with your transfer or a list of what
     * succeeded and didn't.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ERRORS_ONLY</code>: A report shows what DataSync was unable to transfer, skip, verify, and delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESSES_AND_ERRORS</code>: A report shows what DataSync was able and unable to transfer, skip, verify,
     * and delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reportLevel
     *        Specifies whether you want your task report to include only what went wrong with your transfer or a list
     *        of what succeeded and didn't.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ERRORS_ONLY</code>: A report shows what DataSync was unable to transfer, skip, verify, and delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESSES_AND_ERRORS</code>: A report shows what DataSync was able and unable to transfer, skip,
     *        verify, and delete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportLevel
     */

    public TaskReportConfig withReportLevel(String reportLevel) {
        setReportLevel(reportLevel);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want your task report to include only what went wrong with your transfer or a list of what
     * succeeded and didn't.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ERRORS_ONLY</code>: A report shows what DataSync was unable to transfer, skip, verify, and delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESSES_AND_ERRORS</code>: A report shows what DataSync was able and unable to transfer, skip, verify,
     * and delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reportLevel
     *        Specifies whether you want your task report to include only what went wrong with your transfer or a list
     *        of what succeeded and didn't.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ERRORS_ONLY</code>: A report shows what DataSync was unable to transfer, skip, verify, and delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESSES_AND_ERRORS</code>: A report shows what DataSync was able and unable to transfer, skip,
     *        verify, and delete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportLevel
     */

    public TaskReportConfig withReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether your task report includes the new version of each object transferred into an S3 bucket. This
     * only applies if you <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html">enable versioning on
     * your bucket</a>. Keep in mind that setting this to <code>INCLUDE</code> can increase the duration of your task
     * execution.
     * </p>
     * 
     * @param objectVersionIds
     *        Specifies whether your task report includes the new version of each object transferred into an S3 bucket.
     *        This only applies if you <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html">enable
     *        versioning on your bucket</a>. Keep in mind that setting this to <code>INCLUDE</code> can increase the
     *        duration of your task execution.
     * @see ObjectVersionIds
     */

    public void setObjectVersionIds(String objectVersionIds) {
        this.objectVersionIds = objectVersionIds;
    }

    /**
     * <p>
     * Specifies whether your task report includes the new version of each object transferred into an S3 bucket. This
     * only applies if you <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html">enable versioning on
     * your bucket</a>. Keep in mind that setting this to <code>INCLUDE</code> can increase the duration of your task
     * execution.
     * </p>
     * 
     * @return Specifies whether your task report includes the new version of each object transferred into an S3 bucket.
     *         This only applies if you <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html">enable
     *         versioning on your bucket</a>. Keep in mind that setting this to <code>INCLUDE</code> can increase the
     *         duration of your task execution.
     * @see ObjectVersionIds
     */

    public String getObjectVersionIds() {
        return this.objectVersionIds;
    }

    /**
     * <p>
     * Specifies whether your task report includes the new version of each object transferred into an S3 bucket. This
     * only applies if you <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html">enable versioning on
     * your bucket</a>. Keep in mind that setting this to <code>INCLUDE</code> can increase the duration of your task
     * execution.
     * </p>
     * 
     * @param objectVersionIds
     *        Specifies whether your task report includes the new version of each object transferred into an S3 bucket.
     *        This only applies if you <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html">enable
     *        versioning on your bucket</a>. Keep in mind that setting this to <code>INCLUDE</code> can increase the
     *        duration of your task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectVersionIds
     */

    public TaskReportConfig withObjectVersionIds(String objectVersionIds) {
        setObjectVersionIds(objectVersionIds);
        return this;
    }

    /**
     * <p>
     * Specifies whether your task report includes the new version of each object transferred into an S3 bucket. This
     * only applies if you <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html">enable versioning on
     * your bucket</a>. Keep in mind that setting this to <code>INCLUDE</code> can increase the duration of your task
     * execution.
     * </p>
     * 
     * @param objectVersionIds
     *        Specifies whether your task report includes the new version of each object transferred into an S3 bucket.
     *        This only applies if you <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html">enable
     *        versioning on your bucket</a>. Keep in mind that setting this to <code>INCLUDE</code> can increase the
     *        duration of your task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectVersionIds
     */

    public TaskReportConfig withObjectVersionIds(ObjectVersionIds objectVersionIds) {
        this.objectVersionIds = objectVersionIds.toString();
        return this;
    }

    /**
     * <p>
     * Customizes the reporting level for aspects of your task report. For example, your report might generally only
     * include errors, but you could specify that you want a list of successes and errors just for the files that
     * DataSync attempted to delete in your destination location.
     * </p>
     * 
     * @param overrides
     *        Customizes the reporting level for aspects of your task report. For example, your report might generally
     *        only include errors, but you could specify that you want a list of successes and errors just for the files
     *        that DataSync attempted to delete in your destination location.
     */

    public void setOverrides(ReportOverrides overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * Customizes the reporting level for aspects of your task report. For example, your report might generally only
     * include errors, but you could specify that you want a list of successes and errors just for the files that
     * DataSync attempted to delete in your destination location.
     * </p>
     * 
     * @return Customizes the reporting level for aspects of your task report. For example, your report might generally
     *         only include errors, but you could specify that you want a list of successes and errors just for the
     *         files that DataSync attempted to delete in your destination location.
     */

    public ReportOverrides getOverrides() {
        return this.overrides;
    }

    /**
     * <p>
     * Customizes the reporting level for aspects of your task report. For example, your report might generally only
     * include errors, but you could specify that you want a list of successes and errors just for the files that
     * DataSync attempted to delete in your destination location.
     * </p>
     * 
     * @param overrides
     *        Customizes the reporting level for aspects of your task report. For example, your report might generally
     *        only include errors, but you could specify that you want a list of successes and errors just for the files
     *        that DataSync attempted to delete in your destination location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskReportConfig withOverrides(ReportOverrides overrides) {
        setOverrides(overrides);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getOutputType() != null)
            sb.append("OutputType: ").append(getOutputType()).append(",");
        if (getReportLevel() != null)
            sb.append("ReportLevel: ").append(getReportLevel()).append(",");
        if (getObjectVersionIds() != null)
            sb.append("ObjectVersionIds: ").append(getObjectVersionIds()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskReportConfig == false)
            return false;
        TaskReportConfig other = (TaskReportConfig) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getOutputType() == null ^ this.getOutputType() == null)
            return false;
        if (other.getOutputType() != null && other.getOutputType().equals(this.getOutputType()) == false)
            return false;
        if (other.getReportLevel() == null ^ this.getReportLevel() == null)
            return false;
        if (other.getReportLevel() != null && other.getReportLevel().equals(this.getReportLevel()) == false)
            return false;
        if (other.getObjectVersionIds() == null ^ this.getObjectVersionIds() == null)
            return false;
        if (other.getObjectVersionIds() != null && other.getObjectVersionIds().equals(this.getObjectVersionIds()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getOutputType() == null) ? 0 : getOutputType().hashCode());
        hashCode = prime * hashCode + ((getReportLevel() == null) ? 0 : getReportLevel().hashCode());
        hashCode = prime * hashCode + ((getObjectVersionIds() == null) ? 0 : getObjectVersionIds().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        return hashCode;
    }

    @Override
    public TaskReportConfig clone() {
        try {
            return (TaskReportConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.TaskReportConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
