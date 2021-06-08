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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains code coverage report information.
 * </p>
 * <p>
 * Line coverage measures how many statements your tests cover. A statement is a single instruction, not including
 * comments, conditionals, etc.
 * </p>
 * <p>
 * Branch coverage determines if your tests cover every possible branch of a control structure, such as an
 * <code>if</code> or <code>case</code> statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CodeCoverage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeCoverage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the code coverage report.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the report.
     * </p>
     */
    private String reportARN;
    /**
     * <p>
     * The path of the test report file.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The percentage of lines that are covered by your tests.
     * </p>
     */
    private Double lineCoveragePercentage;
    /**
     * <p>
     * The number of lines that are covered by your tests.
     * </p>
     */
    private Integer linesCovered;
    /**
     * <p>
     * The number of lines that are not covered by your tests.
     * </p>
     */
    private Integer linesMissed;
    /**
     * <p>
     * The percentage of branches that are covered by your tests.
     * </p>
     */
    private Double branchCoveragePercentage;
    /**
     * <p>
     * The number of conditional branches that are covered by your tests.
     * </p>
     */
    private Integer branchesCovered;
    /**
     * <p>
     * The number of conditional branches that are not covered by your tests.
     * </p>
     */
    private Integer branchesMissed;
    /**
     * <p>
     * The date and time that the tests were run.
     * </p>
     */
    private java.util.Date expired;

    /**
     * <p>
     * The identifier of the code coverage report.
     * </p>
     * 
     * @param id
     *        The identifier of the code coverage report.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the code coverage report.
     * </p>
     * 
     * @return The identifier of the code coverage report.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the code coverage report.
     * </p>
     * 
     * @param id
     *        The identifier of the code coverage report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeCoverage withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the report.
     * </p>
     * 
     * @param reportARN
     *        The ARN of the report.
     */

    public void setReportARN(String reportARN) {
        this.reportARN = reportARN;
    }

    /**
     * <p>
     * The ARN of the report.
     * </p>
     * 
     * @return The ARN of the report.
     */

    public String getReportARN() {
        return this.reportARN;
    }

    /**
     * <p>
     * The ARN of the report.
     * </p>
     * 
     * @param reportARN
     *        The ARN of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeCoverage withReportARN(String reportARN) {
        setReportARN(reportARN);
        return this;
    }

    /**
     * <p>
     * The path of the test report file.
     * </p>
     * 
     * @param filePath
     *        The path of the test report file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The path of the test report file.
     * </p>
     * 
     * @return The path of the test report file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The path of the test report file.
     * </p>
     * 
     * @param filePath
     *        The path of the test report file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeCoverage withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The percentage of lines that are covered by your tests.
     * </p>
     * 
     * @param lineCoveragePercentage
     *        The percentage of lines that are covered by your tests.
     */

    public void setLineCoveragePercentage(Double lineCoveragePercentage) {
        this.lineCoveragePercentage = lineCoveragePercentage;
    }

    /**
     * <p>
     * The percentage of lines that are covered by your tests.
     * </p>
     * 
     * @return The percentage of lines that are covered by your tests.
     */

    public Double getLineCoveragePercentage() {
        return this.lineCoveragePercentage;
    }

    /**
     * <p>
     * The percentage of lines that are covered by your tests.
     * </p>
     * 
     * @param lineCoveragePercentage
     *        The percentage of lines that are covered by your tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeCoverage withLineCoveragePercentage(Double lineCoveragePercentage) {
        setLineCoveragePercentage(lineCoveragePercentage);
        return this;
    }

    /**
     * <p>
     * The number of lines that are covered by your tests.
     * </p>
     * 
     * @param linesCovered
     *        The number of lines that are covered by your tests.
     */

    public void setLinesCovered(Integer linesCovered) {
        this.linesCovered = linesCovered;
    }

    /**
     * <p>
     * The number of lines that are covered by your tests.
     * </p>
     * 
     * @return The number of lines that are covered by your tests.
     */

    public Integer getLinesCovered() {
        return this.linesCovered;
    }

    /**
     * <p>
     * The number of lines that are covered by your tests.
     * </p>
     * 
     * @param linesCovered
     *        The number of lines that are covered by your tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeCoverage withLinesCovered(Integer linesCovered) {
        setLinesCovered(linesCovered);
        return this;
    }

    /**
     * <p>
     * The number of lines that are not covered by your tests.
     * </p>
     * 
     * @param linesMissed
     *        The number of lines that are not covered by your tests.
     */

    public void setLinesMissed(Integer linesMissed) {
        this.linesMissed = linesMissed;
    }

    /**
     * <p>
     * The number of lines that are not covered by your tests.
     * </p>
     * 
     * @return The number of lines that are not covered by your tests.
     */

    public Integer getLinesMissed() {
        return this.linesMissed;
    }

    /**
     * <p>
     * The number of lines that are not covered by your tests.
     * </p>
     * 
     * @param linesMissed
     *        The number of lines that are not covered by your tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeCoverage withLinesMissed(Integer linesMissed) {
        setLinesMissed(linesMissed);
        return this;
    }

    /**
     * <p>
     * The percentage of branches that are covered by your tests.
     * </p>
     * 
     * @param branchCoveragePercentage
     *        The percentage of branches that are covered by your tests.
     */

    public void setBranchCoveragePercentage(Double branchCoveragePercentage) {
        this.branchCoveragePercentage = branchCoveragePercentage;
    }

    /**
     * <p>
     * The percentage of branches that are covered by your tests.
     * </p>
     * 
     * @return The percentage of branches that are covered by your tests.
     */

    public Double getBranchCoveragePercentage() {
        return this.branchCoveragePercentage;
    }

    /**
     * <p>
     * The percentage of branches that are covered by your tests.
     * </p>
     * 
     * @param branchCoveragePercentage
     *        The percentage of branches that are covered by your tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeCoverage withBranchCoveragePercentage(Double branchCoveragePercentage) {
        setBranchCoveragePercentage(branchCoveragePercentage);
        return this;
    }

    /**
     * <p>
     * The number of conditional branches that are covered by your tests.
     * </p>
     * 
     * @param branchesCovered
     *        The number of conditional branches that are covered by your tests.
     */

    public void setBranchesCovered(Integer branchesCovered) {
        this.branchesCovered = branchesCovered;
    }

    /**
     * <p>
     * The number of conditional branches that are covered by your tests.
     * </p>
     * 
     * @return The number of conditional branches that are covered by your tests.
     */

    public Integer getBranchesCovered() {
        return this.branchesCovered;
    }

    /**
     * <p>
     * The number of conditional branches that are covered by your tests.
     * </p>
     * 
     * @param branchesCovered
     *        The number of conditional branches that are covered by your tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeCoverage withBranchesCovered(Integer branchesCovered) {
        setBranchesCovered(branchesCovered);
        return this;
    }

    /**
     * <p>
     * The number of conditional branches that are not covered by your tests.
     * </p>
     * 
     * @param branchesMissed
     *        The number of conditional branches that are not covered by your tests.
     */

    public void setBranchesMissed(Integer branchesMissed) {
        this.branchesMissed = branchesMissed;
    }

    /**
     * <p>
     * The number of conditional branches that are not covered by your tests.
     * </p>
     * 
     * @return The number of conditional branches that are not covered by your tests.
     */

    public Integer getBranchesMissed() {
        return this.branchesMissed;
    }

    /**
     * <p>
     * The number of conditional branches that are not covered by your tests.
     * </p>
     * 
     * @param branchesMissed
     *        The number of conditional branches that are not covered by your tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeCoverage withBranchesMissed(Integer branchesMissed) {
        setBranchesMissed(branchesMissed);
        return this;
    }

    /**
     * <p>
     * The date and time that the tests were run.
     * </p>
     * 
     * @param expired
     *        The date and time that the tests were run.
     */

    public void setExpired(java.util.Date expired) {
        this.expired = expired;
    }

    /**
     * <p>
     * The date and time that the tests were run.
     * </p>
     * 
     * @return The date and time that the tests were run.
     */

    public java.util.Date getExpired() {
        return this.expired;
    }

    /**
     * <p>
     * The date and time that the tests were run.
     * </p>
     * 
     * @param expired
     *        The date and time that the tests were run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeCoverage withExpired(java.util.Date expired) {
        setExpired(expired);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getReportARN() != null)
            sb.append("ReportARN: ").append(getReportARN()).append(",");
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getLineCoveragePercentage() != null)
            sb.append("LineCoveragePercentage: ").append(getLineCoveragePercentage()).append(",");
        if (getLinesCovered() != null)
            sb.append("LinesCovered: ").append(getLinesCovered()).append(",");
        if (getLinesMissed() != null)
            sb.append("LinesMissed: ").append(getLinesMissed()).append(",");
        if (getBranchCoveragePercentage() != null)
            sb.append("BranchCoveragePercentage: ").append(getBranchCoveragePercentage()).append(",");
        if (getBranchesCovered() != null)
            sb.append("BranchesCovered: ").append(getBranchesCovered()).append(",");
        if (getBranchesMissed() != null)
            sb.append("BranchesMissed: ").append(getBranchesMissed()).append(",");
        if (getExpired() != null)
            sb.append("Expired: ").append(getExpired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeCoverage == false)
            return false;
        CodeCoverage other = (CodeCoverage) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getReportARN() == null ^ this.getReportARN() == null)
            return false;
        if (other.getReportARN() != null && other.getReportARN().equals(this.getReportARN()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getLineCoveragePercentage() == null ^ this.getLineCoveragePercentage() == null)
            return false;
        if (other.getLineCoveragePercentage() != null && other.getLineCoveragePercentage().equals(this.getLineCoveragePercentage()) == false)
            return false;
        if (other.getLinesCovered() == null ^ this.getLinesCovered() == null)
            return false;
        if (other.getLinesCovered() != null && other.getLinesCovered().equals(this.getLinesCovered()) == false)
            return false;
        if (other.getLinesMissed() == null ^ this.getLinesMissed() == null)
            return false;
        if (other.getLinesMissed() != null && other.getLinesMissed().equals(this.getLinesMissed()) == false)
            return false;
        if (other.getBranchCoveragePercentage() == null ^ this.getBranchCoveragePercentage() == null)
            return false;
        if (other.getBranchCoveragePercentage() != null && other.getBranchCoveragePercentage().equals(this.getBranchCoveragePercentage()) == false)
            return false;
        if (other.getBranchesCovered() == null ^ this.getBranchesCovered() == null)
            return false;
        if (other.getBranchesCovered() != null && other.getBranchesCovered().equals(this.getBranchesCovered()) == false)
            return false;
        if (other.getBranchesMissed() == null ^ this.getBranchesMissed() == null)
            return false;
        if (other.getBranchesMissed() != null && other.getBranchesMissed().equals(this.getBranchesMissed()) == false)
            return false;
        if (other.getExpired() == null ^ this.getExpired() == null)
            return false;
        if (other.getExpired() != null && other.getExpired().equals(this.getExpired()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getReportARN() == null) ? 0 : getReportARN().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getLineCoveragePercentage() == null) ? 0 : getLineCoveragePercentage().hashCode());
        hashCode = prime * hashCode + ((getLinesCovered() == null) ? 0 : getLinesCovered().hashCode());
        hashCode = prime * hashCode + ((getLinesMissed() == null) ? 0 : getLinesMissed().hashCode());
        hashCode = prime * hashCode + ((getBranchCoveragePercentage() == null) ? 0 : getBranchCoveragePercentage().hashCode());
        hashCode = prime * hashCode + ((getBranchesCovered() == null) ? 0 : getBranchesCovered().hashCode());
        hashCode = prime * hashCode + ((getBranchesMissed() == null) ? 0 : getBranchesMissed().hashCode());
        hashCode = prime * hashCode + ((getExpired() == null) ? 0 : getExpired().hashCode());
        return hashCode;
    }

    @Override
    public CodeCoverage clone() {
        try {
            return (CodeCoverage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.CodeCoverageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
