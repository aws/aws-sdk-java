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
 * Contains a summary of a code coverage report.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CodeCoverageReportSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeCoverageReportSummary implements Serializable, Cloneable, StructuredPojo {

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

    public CodeCoverageReportSummary withLineCoveragePercentage(Double lineCoveragePercentage) {
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

    public CodeCoverageReportSummary withLinesCovered(Integer linesCovered) {
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

    public CodeCoverageReportSummary withLinesMissed(Integer linesMissed) {
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

    public CodeCoverageReportSummary withBranchCoveragePercentage(Double branchCoveragePercentage) {
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

    public CodeCoverageReportSummary withBranchesCovered(Integer branchesCovered) {
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

    public CodeCoverageReportSummary withBranchesMissed(Integer branchesMissed) {
        setBranchesMissed(branchesMissed);
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
            sb.append("BranchesMissed: ").append(getBranchesMissed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeCoverageReportSummary == false)
            return false;
        CodeCoverageReportSummary other = (CodeCoverageReportSummary) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLineCoveragePercentage() == null) ? 0 : getLineCoveragePercentage().hashCode());
        hashCode = prime * hashCode + ((getLinesCovered() == null) ? 0 : getLinesCovered().hashCode());
        hashCode = prime * hashCode + ((getLinesMissed() == null) ? 0 : getLinesMissed().hashCode());
        hashCode = prime * hashCode + ((getBranchCoveragePercentage() == null) ? 0 : getBranchCoveragePercentage().hashCode());
        hashCode = prime * hashCode + ((getBranchesCovered() == null) ? 0 : getBranchesCovered().hashCode());
        hashCode = prime * hashCode + ((getBranchesMissed() == null) ? 0 : getBranchesMissed().hashCode());
        return hashCode;
    }

    @Override
    public CodeCoverageReportSummary clone() {
        try {
            return (CodeCoverageReportSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.CodeCoverageReportSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
