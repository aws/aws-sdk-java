/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteReportGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReportGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the report group to delete.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * If <code>true</code>, deletes any reports that belong to a report group before deleting the report group.
     * </p>
     * <p>
     * If <code>false</code>, you must delete any reports in the report group. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     * >ListReportsForReportGroup</a> to get the reports in a report group. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html">DeleteReport</a> to delete
     * the reports. If you call <code>DeleteReportGroup</code> for a report group that contains one or more reports, an
     * exception is thrown.
     * </p>
     */
    private Boolean deleteReports;

    /**
     * <p>
     * The ARN of the report group to delete.
     * </p>
     * 
     * @param arn
     *        The ARN of the report group to delete.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the report group to delete.
     * </p>
     * 
     * @return The ARN of the report group to delete.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the report group to delete.
     * </p>
     * 
     * @param arn
     *        The ARN of the report group to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReportGroupRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, deletes any reports that belong to a report group before deleting the report group.
     * </p>
     * <p>
     * If <code>false</code>, you must delete any reports in the report group. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     * >ListReportsForReportGroup</a> to get the reports in a report group. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html">DeleteReport</a> to delete
     * the reports. If you call <code>DeleteReportGroup</code> for a report group that contains one or more reports, an
     * exception is thrown.
     * </p>
     * 
     * @param deleteReports
     *        If <code>true</code>, deletes any reports that belong to a report group before deleting the report group.
     *        </p>
     *        <p>
     *        If <code>false</code>, you must delete any reports in the report group. Use <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     *        >ListReportsForReportGroup</a> to get the reports in a report group. Use <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html">DeleteReport</a> to
     *        delete the reports. If you call <code>DeleteReportGroup</code> for a report group that contains one or
     *        more reports, an exception is thrown.
     */

    public void setDeleteReports(Boolean deleteReports) {
        this.deleteReports = deleteReports;
    }

    /**
     * <p>
     * If <code>true</code>, deletes any reports that belong to a report group before deleting the report group.
     * </p>
     * <p>
     * If <code>false</code>, you must delete any reports in the report group. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     * >ListReportsForReportGroup</a> to get the reports in a report group. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html">DeleteReport</a> to delete
     * the reports. If you call <code>DeleteReportGroup</code> for a report group that contains one or more reports, an
     * exception is thrown.
     * </p>
     * 
     * @return If <code>true</code>, deletes any reports that belong to a report group before deleting the report group.
     *         </p>
     *         <p>
     *         If <code>false</code>, you must delete any reports in the report group. Use <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     *         >ListReportsForReportGroup</a> to get the reports in a report group. Use <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html">DeleteReport</a>
     *         to delete the reports. If you call <code>DeleteReportGroup</code> for a report group that contains one or
     *         more reports, an exception is thrown.
     */

    public Boolean getDeleteReports() {
        return this.deleteReports;
    }

    /**
     * <p>
     * If <code>true</code>, deletes any reports that belong to a report group before deleting the report group.
     * </p>
     * <p>
     * If <code>false</code>, you must delete any reports in the report group. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     * >ListReportsForReportGroup</a> to get the reports in a report group. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html">DeleteReport</a> to delete
     * the reports. If you call <code>DeleteReportGroup</code> for a report group that contains one or more reports, an
     * exception is thrown.
     * </p>
     * 
     * @param deleteReports
     *        If <code>true</code>, deletes any reports that belong to a report group before deleting the report group.
     *        </p>
     *        <p>
     *        If <code>false</code>, you must delete any reports in the report group. Use <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     *        >ListReportsForReportGroup</a> to get the reports in a report group. Use <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html">DeleteReport</a> to
     *        delete the reports. If you call <code>DeleteReportGroup</code> for a report group that contains one or
     *        more reports, an exception is thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReportGroupRequest withDeleteReports(Boolean deleteReports) {
        setDeleteReports(deleteReports);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, deletes any reports that belong to a report group before deleting the report group.
     * </p>
     * <p>
     * If <code>false</code>, you must delete any reports in the report group. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     * >ListReportsForReportGroup</a> to get the reports in a report group. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html">DeleteReport</a> to delete
     * the reports. If you call <code>DeleteReportGroup</code> for a report group that contains one or more reports, an
     * exception is thrown.
     * </p>
     * 
     * @return If <code>true</code>, deletes any reports that belong to a report group before deleting the report group.
     *         </p>
     *         <p>
     *         If <code>false</code>, you must delete any reports in the report group. Use <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     *         >ListReportsForReportGroup</a> to get the reports in a report group. Use <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html">DeleteReport</a>
     *         to delete the reports. If you call <code>DeleteReportGroup</code> for a report group that contains one or
     *         more reports, an exception is thrown.
     */

    public Boolean isDeleteReports() {
        return this.deleteReports;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDeleteReports() != null)
            sb.append("DeleteReports: ").append(getDeleteReports());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReportGroupRequest == false)
            return false;
        DeleteReportGroupRequest other = (DeleteReportGroupRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDeleteReports() == null ^ this.getDeleteReports() == null)
            return false;
        if (other.getDeleteReports() != null && other.getDeleteReports().equals(this.getDeleteReports()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDeleteReports() == null) ? 0 : getDeleteReports().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReportGroupRequest clone() {
        return (DeleteReportGroupRequest) super.clone();
    }

}
