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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about metrics summaries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/MetricsSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lines of code metered in the code review. For the initial code review pull request and all subsequent revisions,
     * this includes all lines of code in the files added to the pull request. In subsequent revisions, for files that
     * already existed in the pull request, this includes only the changed lines of code. In both cases, this does not
     * include non-code lines such as comments and import statements. For example, if you submit a pull request
     * containing 5 files, each with 500 lines of code, and in a subsequent revision you added a new file with 200 lines
     * of code, and also modified a total of 25 lines across the initial 5 files, <code>MeteredLinesOfCodeCount</code>
     * includes the first 5 files (5 * 500 = 2,500 lines), the new file (200 lines) and the 25 changed lines of code for
     * a total of 2,725 lines of code.
     * </p>
     */
    private Long meteredLinesOfCodeCount;
    /**
     * <p>
     * Lines of code suppressed in the code review based on the <code>excludeFiles</code> element in the
     * <code>aws-codeguru-reviewer.yml</code> file. For full repository analyses, this number includes all lines of code
     * in the files that are suppressed. For pull requests, this number only includes the <i>changed</i> lines of code
     * that are suppressed. In both cases, this number does not include non-code lines such as comments and import
     * statements. For example, if you initiate a full repository analysis on a repository containing 5 files, each file
     * with 100 lines of code, and 2 files are listed as excluded in the <code>aws-codeguru-reviewer.yml</code> file,
     * then <code>SuppressedLinesOfCodeCount</code> returns 200 (2 * 100) as the total number of lines of code
     * suppressed. However, if you submit a pull request for the same repository, then
     * <code>SuppressedLinesOfCodeCount</code> only includes the lines in the 2 files that changed. If only 1 of the 2
     * files changed in the pull request, then <code>SuppressedLinesOfCodeCount</code> returns 100 (1 * 100) as the
     * total number of lines of code suppressed.
     * </p>
     */
    private Long suppressedLinesOfCodeCount;
    /**
     * <p>
     * Total number of recommendations found in the code review.
     * </p>
     */
    private Long findingsCount;

    /**
     * <p>
     * Lines of code metered in the code review. For the initial code review pull request and all subsequent revisions,
     * this includes all lines of code in the files added to the pull request. In subsequent revisions, for files that
     * already existed in the pull request, this includes only the changed lines of code. In both cases, this does not
     * include non-code lines such as comments and import statements. For example, if you submit a pull request
     * containing 5 files, each with 500 lines of code, and in a subsequent revision you added a new file with 200 lines
     * of code, and also modified a total of 25 lines across the initial 5 files, <code>MeteredLinesOfCodeCount</code>
     * includes the first 5 files (5 * 500 = 2,500 lines), the new file (200 lines) and the 25 changed lines of code for
     * a total of 2,725 lines of code.
     * </p>
     * 
     * @param meteredLinesOfCodeCount
     *        Lines of code metered in the code review. For the initial code review pull request and all subsequent
     *        revisions, this includes all lines of code in the files added to the pull request. In subsequent
     *        revisions, for files that already existed in the pull request, this includes only the changed lines of
     *        code. In both cases, this does not include non-code lines such as comments and import statements. For
     *        example, if you submit a pull request containing 5 files, each with 500 lines of code, and in a subsequent
     *        revision you added a new file with 200 lines of code, and also modified a total of 25 lines across the
     *        initial 5 files, <code>MeteredLinesOfCodeCount</code> includes the first 5 files (5 * 500 = 2,500 lines),
     *        the new file (200 lines) and the 25 changed lines of code for a total of 2,725 lines of code.
     */

    public void setMeteredLinesOfCodeCount(Long meteredLinesOfCodeCount) {
        this.meteredLinesOfCodeCount = meteredLinesOfCodeCount;
    }

    /**
     * <p>
     * Lines of code metered in the code review. For the initial code review pull request and all subsequent revisions,
     * this includes all lines of code in the files added to the pull request. In subsequent revisions, for files that
     * already existed in the pull request, this includes only the changed lines of code. In both cases, this does not
     * include non-code lines such as comments and import statements. For example, if you submit a pull request
     * containing 5 files, each with 500 lines of code, and in a subsequent revision you added a new file with 200 lines
     * of code, and also modified a total of 25 lines across the initial 5 files, <code>MeteredLinesOfCodeCount</code>
     * includes the first 5 files (5 * 500 = 2,500 lines), the new file (200 lines) and the 25 changed lines of code for
     * a total of 2,725 lines of code.
     * </p>
     * 
     * @return Lines of code metered in the code review. For the initial code review pull request and all subsequent
     *         revisions, this includes all lines of code in the files added to the pull request. In subsequent
     *         revisions, for files that already existed in the pull request, this includes only the changed lines of
     *         code. In both cases, this does not include non-code lines such as comments and import statements. For
     *         example, if you submit a pull request containing 5 files, each with 500 lines of code, and in a
     *         subsequent revision you added a new file with 200 lines of code, and also modified a total of 25 lines
     *         across the initial 5 files, <code>MeteredLinesOfCodeCount</code> includes the first 5 files (5 * 500 =
     *         2,500 lines), the new file (200 lines) and the 25 changed lines of code for a total of 2,725 lines of
     *         code.
     */

    public Long getMeteredLinesOfCodeCount() {
        return this.meteredLinesOfCodeCount;
    }

    /**
     * <p>
     * Lines of code metered in the code review. For the initial code review pull request and all subsequent revisions,
     * this includes all lines of code in the files added to the pull request. In subsequent revisions, for files that
     * already existed in the pull request, this includes only the changed lines of code. In both cases, this does not
     * include non-code lines such as comments and import statements. For example, if you submit a pull request
     * containing 5 files, each with 500 lines of code, and in a subsequent revision you added a new file with 200 lines
     * of code, and also modified a total of 25 lines across the initial 5 files, <code>MeteredLinesOfCodeCount</code>
     * includes the first 5 files (5 * 500 = 2,500 lines), the new file (200 lines) and the 25 changed lines of code for
     * a total of 2,725 lines of code.
     * </p>
     * 
     * @param meteredLinesOfCodeCount
     *        Lines of code metered in the code review. For the initial code review pull request and all subsequent
     *        revisions, this includes all lines of code in the files added to the pull request. In subsequent
     *        revisions, for files that already existed in the pull request, this includes only the changed lines of
     *        code. In both cases, this does not include non-code lines such as comments and import statements. For
     *        example, if you submit a pull request containing 5 files, each with 500 lines of code, and in a subsequent
     *        revision you added a new file with 200 lines of code, and also modified a total of 25 lines across the
     *        initial 5 files, <code>MeteredLinesOfCodeCount</code> includes the first 5 files (5 * 500 = 2,500 lines),
     *        the new file (200 lines) and the 25 changed lines of code for a total of 2,725 lines of code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSummary withMeteredLinesOfCodeCount(Long meteredLinesOfCodeCount) {
        setMeteredLinesOfCodeCount(meteredLinesOfCodeCount);
        return this;
    }

    /**
     * <p>
     * Lines of code suppressed in the code review based on the <code>excludeFiles</code> element in the
     * <code>aws-codeguru-reviewer.yml</code> file. For full repository analyses, this number includes all lines of code
     * in the files that are suppressed. For pull requests, this number only includes the <i>changed</i> lines of code
     * that are suppressed. In both cases, this number does not include non-code lines such as comments and import
     * statements. For example, if you initiate a full repository analysis on a repository containing 5 files, each file
     * with 100 lines of code, and 2 files are listed as excluded in the <code>aws-codeguru-reviewer.yml</code> file,
     * then <code>SuppressedLinesOfCodeCount</code> returns 200 (2 * 100) as the total number of lines of code
     * suppressed. However, if you submit a pull request for the same repository, then
     * <code>SuppressedLinesOfCodeCount</code> only includes the lines in the 2 files that changed. If only 1 of the 2
     * files changed in the pull request, then <code>SuppressedLinesOfCodeCount</code> returns 100 (1 * 100) as the
     * total number of lines of code suppressed.
     * </p>
     * 
     * @param suppressedLinesOfCodeCount
     *        Lines of code suppressed in the code review based on the <code>excludeFiles</code> element in the
     *        <code>aws-codeguru-reviewer.yml</code> file. For full repository analyses, this number includes all lines
     *        of code in the files that are suppressed. For pull requests, this number only includes the <i>changed</i>
     *        lines of code that are suppressed. In both cases, this number does not include non-code lines such as
     *        comments and import statements. For example, if you initiate a full repository analysis on a repository
     *        containing 5 files, each file with 100 lines of code, and 2 files are listed as excluded in the
     *        <code>aws-codeguru-reviewer.yml</code> file, then <code>SuppressedLinesOfCodeCount</code> returns 200 (2 *
     *        100) as the total number of lines of code suppressed. However, if you submit a pull request for the same
     *        repository, then <code>SuppressedLinesOfCodeCount</code> only includes the lines in the 2 files that
     *        changed. If only 1 of the 2 files changed in the pull request, then
     *        <code>SuppressedLinesOfCodeCount</code> returns 100 (1 * 100) as the total number of lines of code
     *        suppressed.
     */

    public void setSuppressedLinesOfCodeCount(Long suppressedLinesOfCodeCount) {
        this.suppressedLinesOfCodeCount = suppressedLinesOfCodeCount;
    }

    /**
     * <p>
     * Lines of code suppressed in the code review based on the <code>excludeFiles</code> element in the
     * <code>aws-codeguru-reviewer.yml</code> file. For full repository analyses, this number includes all lines of code
     * in the files that are suppressed. For pull requests, this number only includes the <i>changed</i> lines of code
     * that are suppressed. In both cases, this number does not include non-code lines such as comments and import
     * statements. For example, if you initiate a full repository analysis on a repository containing 5 files, each file
     * with 100 lines of code, and 2 files are listed as excluded in the <code>aws-codeguru-reviewer.yml</code> file,
     * then <code>SuppressedLinesOfCodeCount</code> returns 200 (2 * 100) as the total number of lines of code
     * suppressed. However, if you submit a pull request for the same repository, then
     * <code>SuppressedLinesOfCodeCount</code> only includes the lines in the 2 files that changed. If only 1 of the 2
     * files changed in the pull request, then <code>SuppressedLinesOfCodeCount</code> returns 100 (1 * 100) as the
     * total number of lines of code suppressed.
     * </p>
     * 
     * @return Lines of code suppressed in the code review based on the <code>excludeFiles</code> element in the
     *         <code>aws-codeguru-reviewer.yml</code> file. For full repository analyses, this number includes all lines
     *         of code in the files that are suppressed. For pull requests, this number only includes the <i>changed</i>
     *         lines of code that are suppressed. In both cases, this number does not include non-code lines such as
     *         comments and import statements. For example, if you initiate a full repository analysis on a repository
     *         containing 5 files, each file with 100 lines of code, and 2 files are listed as excluded in the
     *         <code>aws-codeguru-reviewer.yml</code> file, then <code>SuppressedLinesOfCodeCount</code> returns 200 (2
     *         * 100) as the total number of lines of code suppressed. However, if you submit a pull request for the
     *         same repository, then <code>SuppressedLinesOfCodeCount</code> only includes the lines in the 2 files that
     *         changed. If only 1 of the 2 files changed in the pull request, then
     *         <code>SuppressedLinesOfCodeCount</code> returns 100 (1 * 100) as the total number of lines of code
     *         suppressed.
     */

    public Long getSuppressedLinesOfCodeCount() {
        return this.suppressedLinesOfCodeCount;
    }

    /**
     * <p>
     * Lines of code suppressed in the code review based on the <code>excludeFiles</code> element in the
     * <code>aws-codeguru-reviewer.yml</code> file. For full repository analyses, this number includes all lines of code
     * in the files that are suppressed. For pull requests, this number only includes the <i>changed</i> lines of code
     * that are suppressed. In both cases, this number does not include non-code lines such as comments and import
     * statements. For example, if you initiate a full repository analysis on a repository containing 5 files, each file
     * with 100 lines of code, and 2 files are listed as excluded in the <code>aws-codeguru-reviewer.yml</code> file,
     * then <code>SuppressedLinesOfCodeCount</code> returns 200 (2 * 100) as the total number of lines of code
     * suppressed. However, if you submit a pull request for the same repository, then
     * <code>SuppressedLinesOfCodeCount</code> only includes the lines in the 2 files that changed. If only 1 of the 2
     * files changed in the pull request, then <code>SuppressedLinesOfCodeCount</code> returns 100 (1 * 100) as the
     * total number of lines of code suppressed.
     * </p>
     * 
     * @param suppressedLinesOfCodeCount
     *        Lines of code suppressed in the code review based on the <code>excludeFiles</code> element in the
     *        <code>aws-codeguru-reviewer.yml</code> file. For full repository analyses, this number includes all lines
     *        of code in the files that are suppressed. For pull requests, this number only includes the <i>changed</i>
     *        lines of code that are suppressed. In both cases, this number does not include non-code lines such as
     *        comments and import statements. For example, if you initiate a full repository analysis on a repository
     *        containing 5 files, each file with 100 lines of code, and 2 files are listed as excluded in the
     *        <code>aws-codeguru-reviewer.yml</code> file, then <code>SuppressedLinesOfCodeCount</code> returns 200 (2 *
     *        100) as the total number of lines of code suppressed. However, if you submit a pull request for the same
     *        repository, then <code>SuppressedLinesOfCodeCount</code> only includes the lines in the 2 files that
     *        changed. If only 1 of the 2 files changed in the pull request, then
     *        <code>SuppressedLinesOfCodeCount</code> returns 100 (1 * 100) as the total number of lines of code
     *        suppressed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSummary withSuppressedLinesOfCodeCount(Long suppressedLinesOfCodeCount) {
        setSuppressedLinesOfCodeCount(suppressedLinesOfCodeCount);
        return this;
    }

    /**
     * <p>
     * Total number of recommendations found in the code review.
     * </p>
     * 
     * @param findingsCount
     *        Total number of recommendations found in the code review.
     */

    public void setFindingsCount(Long findingsCount) {
        this.findingsCount = findingsCount;
    }

    /**
     * <p>
     * Total number of recommendations found in the code review.
     * </p>
     * 
     * @return Total number of recommendations found in the code review.
     */

    public Long getFindingsCount() {
        return this.findingsCount;
    }

    /**
     * <p>
     * Total number of recommendations found in the code review.
     * </p>
     * 
     * @param findingsCount
     *        Total number of recommendations found in the code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSummary withFindingsCount(Long findingsCount) {
        setFindingsCount(findingsCount);
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
        if (getMeteredLinesOfCodeCount() != null)
            sb.append("MeteredLinesOfCodeCount: ").append(getMeteredLinesOfCodeCount()).append(",");
        if (getSuppressedLinesOfCodeCount() != null)
            sb.append("SuppressedLinesOfCodeCount: ").append(getSuppressedLinesOfCodeCount()).append(",");
        if (getFindingsCount() != null)
            sb.append("FindingsCount: ").append(getFindingsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricsSummary == false)
            return false;
        MetricsSummary other = (MetricsSummary) obj;
        if (other.getMeteredLinesOfCodeCount() == null ^ this.getMeteredLinesOfCodeCount() == null)
            return false;
        if (other.getMeteredLinesOfCodeCount() != null && other.getMeteredLinesOfCodeCount().equals(this.getMeteredLinesOfCodeCount()) == false)
            return false;
        if (other.getSuppressedLinesOfCodeCount() == null ^ this.getSuppressedLinesOfCodeCount() == null)
            return false;
        if (other.getSuppressedLinesOfCodeCount() != null && other.getSuppressedLinesOfCodeCount().equals(this.getSuppressedLinesOfCodeCount()) == false)
            return false;
        if (other.getFindingsCount() == null ^ this.getFindingsCount() == null)
            return false;
        if (other.getFindingsCount() != null && other.getFindingsCount().equals(this.getFindingsCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeteredLinesOfCodeCount() == null) ? 0 : getMeteredLinesOfCodeCount().hashCode());
        hashCode = prime * hashCode + ((getSuppressedLinesOfCodeCount() == null) ? 0 : getSuppressedLinesOfCodeCount().hashCode());
        hashCode = prime * hashCode + ((getFindingsCount() == null) ? 0 : getFindingsCount().hashCode());
        return hashCode;
    }

    @Override
    public MetricsSummary clone() {
        try {
            return (MetricsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.MetricsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
