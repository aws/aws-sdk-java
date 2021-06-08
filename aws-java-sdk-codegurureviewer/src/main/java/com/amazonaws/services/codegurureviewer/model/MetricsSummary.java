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
