/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the results from running a series of test cases during the run of a build project. The test cases
 * are specified in the buildspec for the build project using one or more paths to the test case files. You can specify
 * any type of tests you want, such as unit tests, integration tests, and functional tests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/Report" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Report implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the report run.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of the report that was run.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the report that was run.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the report group associated with this report.
     * </p>
     */
    private String reportGroupArn;
    /**
     * <p>
     * The ARN of the build run that generated this report.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * The status of this report.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time this report run occurred.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The date and time a report expires. A report expires 30 days after it is created. An expired report is not
     * available to view in CodeBuild.
     * </p>
     */
    private java.util.Date expired;
    /**
     * <p>
     * Information about where the raw data used to generate this report was exported.
     * </p>
     */
    private ReportExportConfig exportConfig;
    /**
     * <p>
     * A boolean that specifies if this report run is truncated. The list of test cases is truncated after the maximum
     * number of test cases is reached.
     * </p>
     */
    private Boolean truncated;
    /**
     * <p>
     * A <code>TestReportSummary</code> object that contains information about this test report.
     * </p>
     */
    private TestReportSummary testSummary;

    /**
     * <p>
     * The ARN of the report run.
     * </p>
     * 
     * @param arn
     *        The ARN of the report run.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the report run.
     * </p>
     * 
     * @return The ARN of the report run.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the report run.
     * </p>
     * 
     * @param arn
     *        The ARN of the report run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Report withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of the report that was run.
     * </p>
     * 
     * @param type
     *        The type of the report that was run.
     * @see ReportType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the report that was run.
     * </p>
     * 
     * @return The type of the report that was run.
     * @see ReportType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the report that was run.
     * </p>
     * 
     * @param type
     *        The type of the report that was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public Report withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the report that was run.
     * </p>
     * 
     * @param type
     *        The type of the report that was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public Report withType(ReportType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the report that was run.
     * </p>
     * 
     * @param name
     *        The name of the report that was run.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the report that was run.
     * </p>
     * 
     * @return The name of the report that was run.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the report that was run.
     * </p>
     * 
     * @param name
     *        The name of the report that was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Report withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the report group associated with this report.
     * </p>
     * 
     * @param reportGroupArn
     *        The ARN of the report group associated with this report.
     */

    public void setReportGroupArn(String reportGroupArn) {
        this.reportGroupArn = reportGroupArn;
    }

    /**
     * <p>
     * The ARN of the report group associated with this report.
     * </p>
     * 
     * @return The ARN of the report group associated with this report.
     */

    public String getReportGroupArn() {
        return this.reportGroupArn;
    }

    /**
     * <p>
     * The ARN of the report group associated with this report.
     * </p>
     * 
     * @param reportGroupArn
     *        The ARN of the report group associated with this report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Report withReportGroupArn(String reportGroupArn) {
        setReportGroupArn(reportGroupArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the build run that generated this report.
     * </p>
     * 
     * @param executionId
     *        The ARN of the build run that generated this report.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The ARN of the build run that generated this report.
     * </p>
     * 
     * @return The ARN of the build run that generated this report.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * The ARN of the build run that generated this report.
     * </p>
     * 
     * @param executionId
     *        The ARN of the build run that generated this report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Report withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * The status of this report.
     * </p>
     * 
     * @param status
     *        The status of this report.
     * @see ReportStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this report.
     * </p>
     * 
     * @return The status of this report.
     * @see ReportStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this report.
     * </p>
     * 
     * @param status
     *        The status of this report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportStatusType
     */

    public Report withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of this report.
     * </p>
     * 
     * @param status
     *        The status of this report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportStatusType
     */

    public Report withStatus(ReportStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time this report run occurred.
     * </p>
     * 
     * @param created
     *        The date and time this report run occurred.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time this report run occurred.
     * </p>
     * 
     * @return The date and time this report run occurred.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time this report run occurred.
     * </p>
     * 
     * @param created
     *        The date and time this report run occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Report withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The date and time a report expires. A report expires 30 days after it is created. An expired report is not
     * available to view in CodeBuild.
     * </p>
     * 
     * @param expired
     *        The date and time a report expires. A report expires 30 days after it is created. An expired report is not
     *        available to view in CodeBuild.
     */

    public void setExpired(java.util.Date expired) {
        this.expired = expired;
    }

    /**
     * <p>
     * The date and time a report expires. A report expires 30 days after it is created. An expired report is not
     * available to view in CodeBuild.
     * </p>
     * 
     * @return The date and time a report expires. A report expires 30 days after it is created. An expired report is
     *         not available to view in CodeBuild.
     */

    public java.util.Date getExpired() {
        return this.expired;
    }

    /**
     * <p>
     * The date and time a report expires. A report expires 30 days after it is created. An expired report is not
     * available to view in CodeBuild.
     * </p>
     * 
     * @param expired
     *        The date and time a report expires. A report expires 30 days after it is created. An expired report is not
     *        available to view in CodeBuild.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Report withExpired(java.util.Date expired) {
        setExpired(expired);
        return this;
    }

    /**
     * <p>
     * Information about where the raw data used to generate this report was exported.
     * </p>
     * 
     * @param exportConfig
     *        Information about where the raw data used to generate this report was exported.
     */

    public void setExportConfig(ReportExportConfig exportConfig) {
        this.exportConfig = exportConfig;
    }

    /**
     * <p>
     * Information about where the raw data used to generate this report was exported.
     * </p>
     * 
     * @return Information about where the raw data used to generate this report was exported.
     */

    public ReportExportConfig getExportConfig() {
        return this.exportConfig;
    }

    /**
     * <p>
     * Information about where the raw data used to generate this report was exported.
     * </p>
     * 
     * @param exportConfig
     *        Information about where the raw data used to generate this report was exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Report withExportConfig(ReportExportConfig exportConfig) {
        setExportConfig(exportConfig);
        return this;
    }

    /**
     * <p>
     * A boolean that specifies if this report run is truncated. The list of test cases is truncated after the maximum
     * number of test cases is reached.
     * </p>
     * 
     * @param truncated
     *        A boolean that specifies if this report run is truncated. The list of test cases is truncated after the
     *        maximum number of test cases is reached.
     */

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * <p>
     * A boolean that specifies if this report run is truncated. The list of test cases is truncated after the maximum
     * number of test cases is reached.
     * </p>
     * 
     * @return A boolean that specifies if this report run is truncated. The list of test cases is truncated after the
     *         maximum number of test cases is reached.
     */

    public Boolean getTruncated() {
        return this.truncated;
    }

    /**
     * <p>
     * A boolean that specifies if this report run is truncated. The list of test cases is truncated after the maximum
     * number of test cases is reached.
     * </p>
     * 
     * @param truncated
     *        A boolean that specifies if this report run is truncated. The list of test cases is truncated after the
     *        maximum number of test cases is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Report withTruncated(Boolean truncated) {
        setTruncated(truncated);
        return this;
    }

    /**
     * <p>
     * A boolean that specifies if this report run is truncated. The list of test cases is truncated after the maximum
     * number of test cases is reached.
     * </p>
     * 
     * @return A boolean that specifies if this report run is truncated. The list of test cases is truncated after the
     *         maximum number of test cases is reached.
     */

    public Boolean isTruncated() {
        return this.truncated;
    }

    /**
     * <p>
     * A <code>TestReportSummary</code> object that contains information about this test report.
     * </p>
     * 
     * @param testSummary
     *        A <code>TestReportSummary</code> object that contains information about this test report.
     */

    public void setTestSummary(TestReportSummary testSummary) {
        this.testSummary = testSummary;
    }

    /**
     * <p>
     * A <code>TestReportSummary</code> object that contains information about this test report.
     * </p>
     * 
     * @return A <code>TestReportSummary</code> object that contains information about this test report.
     */

    public TestReportSummary getTestSummary() {
        return this.testSummary;
    }

    /**
     * <p>
     * A <code>TestReportSummary</code> object that contains information about this test report.
     * </p>
     * 
     * @param testSummary
     *        A <code>TestReportSummary</code> object that contains information about this test report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Report withTestSummary(TestReportSummary testSummary) {
        setTestSummary(testSummary);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReportGroupArn() != null)
            sb.append("ReportGroupArn: ").append(getReportGroupArn()).append(",");
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getExpired() != null)
            sb.append("Expired: ").append(getExpired()).append(",");
        if (getExportConfig() != null)
            sb.append("ExportConfig: ").append(getExportConfig()).append(",");
        if (getTruncated() != null)
            sb.append("Truncated: ").append(getTruncated()).append(",");
        if (getTestSummary() != null)
            sb.append("TestSummary: ").append(getTestSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Report == false)
            return false;
        Report other = (Report) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReportGroupArn() == null ^ this.getReportGroupArn() == null)
            return false;
        if (other.getReportGroupArn() != null && other.getReportGroupArn().equals(this.getReportGroupArn()) == false)
            return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getExpired() == null ^ this.getExpired() == null)
            return false;
        if (other.getExpired() != null && other.getExpired().equals(this.getExpired()) == false)
            return false;
        if (other.getExportConfig() == null ^ this.getExportConfig() == null)
            return false;
        if (other.getExportConfig() != null && other.getExportConfig().equals(this.getExportConfig()) == false)
            return false;
        if (other.getTruncated() == null ^ this.getTruncated() == null)
            return false;
        if (other.getTruncated() != null && other.getTruncated().equals(this.getTruncated()) == false)
            return false;
        if (other.getTestSummary() == null ^ this.getTestSummary() == null)
            return false;
        if (other.getTestSummary() != null && other.getTestSummary().equals(this.getTestSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReportGroupArn() == null) ? 0 : getReportGroupArn().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getExpired() == null) ? 0 : getExpired().hashCode());
        hashCode = prime * hashCode + ((getExportConfig() == null) ? 0 : getExportConfig().hashCode());
        hashCode = prime * hashCode + ((getTruncated() == null) ? 0 : getTruncated().hashCode());
        hashCode = prime * hashCode + ((getTestSummary() == null) ? 0 : getTestSummary().hashCode());
        return hashCode;
    }

    @Override
    public Report clone() {
        try {
            return (Report) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ReportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
