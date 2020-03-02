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
 * Information about a test report.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/TestReportSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestReportSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of test cases in this <code>TestReportSummary</code>. The total includes truncated test cases.
     * </p>
     */
    private Integer total;
    /**
     * <p>
     * A map that contains the number of each type of status returned by the test results in this
     * <code>TestReportSummary</code>.
     * </p>
     */
    private java.util.Map<String, Integer> statusCounts;
    /**
     * <p>
     * The number of nanoseconds it took to run all of the test cases in this report.
     * </p>
     */
    private Long durationInNanoSeconds;

    /**
     * <p>
     * The number of test cases in this <code>TestReportSummary</code>. The total includes truncated test cases.
     * </p>
     * 
     * @param total
     *        The number of test cases in this <code>TestReportSummary</code>. The total includes truncated test cases.
     */

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * <p>
     * The number of test cases in this <code>TestReportSummary</code>. The total includes truncated test cases.
     * </p>
     * 
     * @return The number of test cases in this <code>TestReportSummary</code>. The total includes truncated test cases.
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The number of test cases in this <code>TestReportSummary</code>. The total includes truncated test cases.
     * </p>
     * 
     * @param total
     *        The number of test cases in this <code>TestReportSummary</code>. The total includes truncated test cases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestReportSummary withTotal(Integer total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * A map that contains the number of each type of status returned by the test results in this
     * <code>TestReportSummary</code>.
     * </p>
     * 
     * @return A map that contains the number of each type of status returned by the test results in this
     *         <code>TestReportSummary</code>.
     */

    public java.util.Map<String, Integer> getStatusCounts() {
        return statusCounts;
    }

    /**
     * <p>
     * A map that contains the number of each type of status returned by the test results in this
     * <code>TestReportSummary</code>.
     * </p>
     * 
     * @param statusCounts
     *        A map that contains the number of each type of status returned by the test results in this
     *        <code>TestReportSummary</code>.
     */

    public void setStatusCounts(java.util.Map<String, Integer> statusCounts) {
        this.statusCounts = statusCounts;
    }

    /**
     * <p>
     * A map that contains the number of each type of status returned by the test results in this
     * <code>TestReportSummary</code>.
     * </p>
     * 
     * @param statusCounts
     *        A map that contains the number of each type of status returned by the test results in this
     *        <code>TestReportSummary</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestReportSummary withStatusCounts(java.util.Map<String, Integer> statusCounts) {
        setStatusCounts(statusCounts);
        return this;
    }

    /**
     * Add a single StatusCounts entry
     *
     * @see TestReportSummary#withStatusCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TestReportSummary addStatusCountsEntry(String key, Integer value) {
        if (null == this.statusCounts) {
            this.statusCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.statusCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.statusCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StatusCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestReportSummary clearStatusCountsEntries() {
        this.statusCounts = null;
        return this;
    }

    /**
     * <p>
     * The number of nanoseconds it took to run all of the test cases in this report.
     * </p>
     * 
     * @param durationInNanoSeconds
     *        The number of nanoseconds it took to run all of the test cases in this report.
     */

    public void setDurationInNanoSeconds(Long durationInNanoSeconds) {
        this.durationInNanoSeconds = durationInNanoSeconds;
    }

    /**
     * <p>
     * The number of nanoseconds it took to run all of the test cases in this report.
     * </p>
     * 
     * @return The number of nanoseconds it took to run all of the test cases in this report.
     */

    public Long getDurationInNanoSeconds() {
        return this.durationInNanoSeconds;
    }

    /**
     * <p>
     * The number of nanoseconds it took to run all of the test cases in this report.
     * </p>
     * 
     * @param durationInNanoSeconds
     *        The number of nanoseconds it took to run all of the test cases in this report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestReportSummary withDurationInNanoSeconds(Long durationInNanoSeconds) {
        setDurationInNanoSeconds(durationInNanoSeconds);
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
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getStatusCounts() != null)
            sb.append("StatusCounts: ").append(getStatusCounts()).append(",");
        if (getDurationInNanoSeconds() != null)
            sb.append("DurationInNanoSeconds: ").append(getDurationInNanoSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestReportSummary == false)
            return false;
        TestReportSummary other = (TestReportSummary) obj;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getStatusCounts() == null ^ this.getStatusCounts() == null)
            return false;
        if (other.getStatusCounts() != null && other.getStatusCounts().equals(this.getStatusCounts()) == false)
            return false;
        if (other.getDurationInNanoSeconds() == null ^ this.getDurationInNanoSeconds() == null)
            return false;
        if (other.getDurationInNanoSeconds() != null && other.getDurationInNanoSeconds().equals(this.getDurationInNanoSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getStatusCounts() == null) ? 0 : getStatusCounts().hashCode());
        hashCode = prime * hashCode + ((getDurationInNanoSeconds() == null) ? 0 : getDurationInNanoSeconds().hashCode());
        return hashCode;
    }

    @Override
    public TestReportSummary clone() {
        try {
            return (TestReportSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.TestReportSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
