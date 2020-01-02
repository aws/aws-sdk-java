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
 * Information about a test case created using a framework such as NUnit or Cucumber. A test case might be a unit test
 * or a configuration test.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/TestCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestCase implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the report to which the test case belongs.
     * </p>
     */
    private String reportArn;
    /**
     * <p>
     * The path to the raw data file that contains the test result.
     * </p>
     */
    private String testRawDataPath;
    /**
     * <p>
     * A string that is applied to a series of related test cases. CodeBuild generates the prefix. The prefix depends on
     * the framework used to generate the tests.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The name of the test case.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status returned by the test case after it was run. Valid statuses are <code>SUCCEEDED</code>,
     * <code>FAILED</code>, <code>ERROR</code>, <code>SKIPPED</code>, and <code>UNKNOWN</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The number of nanoseconds it took to run this test case.
     * </p>
     */
    private Long durationInNanoSeconds;
    /**
     * <p>
     * A message associated with a test case. For example, an error message or stack trace.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The date and time a test case expires. A test case expires 30 days after it is created. An expired test case is
     * not available to view in CodeBuild.
     * </p>
     */
    private java.util.Date expired;

    /**
     * <p>
     * The ARN of the report to which the test case belongs.
     * </p>
     * 
     * @param reportArn
     *        The ARN of the report to which the test case belongs.
     */

    public void setReportArn(String reportArn) {
        this.reportArn = reportArn;
    }

    /**
     * <p>
     * The ARN of the report to which the test case belongs.
     * </p>
     * 
     * @return The ARN of the report to which the test case belongs.
     */

    public String getReportArn() {
        return this.reportArn;
    }

    /**
     * <p>
     * The ARN of the report to which the test case belongs.
     * </p>
     * 
     * @param reportArn
     *        The ARN of the report to which the test case belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCase withReportArn(String reportArn) {
        setReportArn(reportArn);
        return this;
    }

    /**
     * <p>
     * The path to the raw data file that contains the test result.
     * </p>
     * 
     * @param testRawDataPath
     *        The path to the raw data file that contains the test result.
     */

    public void setTestRawDataPath(String testRawDataPath) {
        this.testRawDataPath = testRawDataPath;
    }

    /**
     * <p>
     * The path to the raw data file that contains the test result.
     * </p>
     * 
     * @return The path to the raw data file that contains the test result.
     */

    public String getTestRawDataPath() {
        return this.testRawDataPath;
    }

    /**
     * <p>
     * The path to the raw data file that contains the test result.
     * </p>
     * 
     * @param testRawDataPath
     *        The path to the raw data file that contains the test result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCase withTestRawDataPath(String testRawDataPath) {
        setTestRawDataPath(testRawDataPath);
        return this;
    }

    /**
     * <p>
     * A string that is applied to a series of related test cases. CodeBuild generates the prefix. The prefix depends on
     * the framework used to generate the tests.
     * </p>
     * 
     * @param prefix
     *        A string that is applied to a series of related test cases. CodeBuild generates the prefix. The prefix
     *        depends on the framework used to generate the tests.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * A string that is applied to a series of related test cases. CodeBuild generates the prefix. The prefix depends on
     * the framework used to generate the tests.
     * </p>
     * 
     * @return A string that is applied to a series of related test cases. CodeBuild generates the prefix. The prefix
     *         depends on the framework used to generate the tests.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * A string that is applied to a series of related test cases. CodeBuild generates the prefix. The prefix depends on
     * the framework used to generate the tests.
     * </p>
     * 
     * @param prefix
     *        A string that is applied to a series of related test cases. CodeBuild generates the prefix. The prefix
     *        depends on the framework used to generate the tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCase withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The name of the test case.
     * </p>
     * 
     * @param name
     *        The name of the test case.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the test case.
     * </p>
     * 
     * @return The name of the test case.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the test case.
     * </p>
     * 
     * @param name
     *        The name of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCase withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status returned by the test case after it was run. Valid statuses are <code>SUCCEEDED</code>,
     * <code>FAILED</code>, <code>ERROR</code>, <code>SKIPPED</code>, and <code>UNKNOWN</code>.
     * </p>
     * 
     * @param status
     *        The status returned by the test case after it was run. Valid statuses are <code>SUCCEEDED</code>,
     *        <code>FAILED</code>, <code>ERROR</code>, <code>SKIPPED</code>, and <code>UNKNOWN</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status returned by the test case after it was run. Valid statuses are <code>SUCCEEDED</code>,
     * <code>FAILED</code>, <code>ERROR</code>, <code>SKIPPED</code>, and <code>UNKNOWN</code>.
     * </p>
     * 
     * @return The status returned by the test case after it was run. Valid statuses are <code>SUCCEEDED</code>,
     *         <code>FAILED</code>, <code>ERROR</code>, <code>SKIPPED</code>, and <code>UNKNOWN</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status returned by the test case after it was run. Valid statuses are <code>SUCCEEDED</code>,
     * <code>FAILED</code>, <code>ERROR</code>, <code>SKIPPED</code>, and <code>UNKNOWN</code>.
     * </p>
     * 
     * @param status
     *        The status returned by the test case after it was run. Valid statuses are <code>SUCCEEDED</code>,
     *        <code>FAILED</code>, <code>ERROR</code>, <code>SKIPPED</code>, and <code>UNKNOWN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCase withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The number of nanoseconds it took to run this test case.
     * </p>
     * 
     * @param durationInNanoSeconds
     *        The number of nanoseconds it took to run this test case.
     */

    public void setDurationInNanoSeconds(Long durationInNanoSeconds) {
        this.durationInNanoSeconds = durationInNanoSeconds;
    }

    /**
     * <p>
     * The number of nanoseconds it took to run this test case.
     * </p>
     * 
     * @return The number of nanoseconds it took to run this test case.
     */

    public Long getDurationInNanoSeconds() {
        return this.durationInNanoSeconds;
    }

    /**
     * <p>
     * The number of nanoseconds it took to run this test case.
     * </p>
     * 
     * @param durationInNanoSeconds
     *        The number of nanoseconds it took to run this test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCase withDurationInNanoSeconds(Long durationInNanoSeconds) {
        setDurationInNanoSeconds(durationInNanoSeconds);
        return this;
    }

    /**
     * <p>
     * A message associated with a test case. For example, an error message or stack trace.
     * </p>
     * 
     * @param message
     *        A message associated with a test case. For example, an error message or stack trace.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message associated with a test case. For example, an error message or stack trace.
     * </p>
     * 
     * @return A message associated with a test case. For example, an error message or stack trace.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message associated with a test case. For example, an error message or stack trace.
     * </p>
     * 
     * @param message
     *        A message associated with a test case. For example, an error message or stack trace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCase withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The date and time a test case expires. A test case expires 30 days after it is created. An expired test case is
     * not available to view in CodeBuild.
     * </p>
     * 
     * @param expired
     *        The date and time a test case expires. A test case expires 30 days after it is created. An expired test
     *        case is not available to view in CodeBuild.
     */

    public void setExpired(java.util.Date expired) {
        this.expired = expired;
    }

    /**
     * <p>
     * The date and time a test case expires. A test case expires 30 days after it is created. An expired test case is
     * not available to view in CodeBuild.
     * </p>
     * 
     * @return The date and time a test case expires. A test case expires 30 days after it is created. An expired test
     *         case is not available to view in CodeBuild.
     */

    public java.util.Date getExpired() {
        return this.expired;
    }

    /**
     * <p>
     * The date and time a test case expires. A test case expires 30 days after it is created. An expired test case is
     * not available to view in CodeBuild.
     * </p>
     * 
     * @param expired
     *        The date and time a test case expires. A test case expires 30 days after it is created. An expired test
     *        case is not available to view in CodeBuild.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCase withExpired(java.util.Date expired) {
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
        if (getReportArn() != null)
            sb.append("ReportArn: ").append(getReportArn()).append(",");
        if (getTestRawDataPath() != null)
            sb.append("TestRawDataPath: ").append(getTestRawDataPath()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDurationInNanoSeconds() != null)
            sb.append("DurationInNanoSeconds: ").append(getDurationInNanoSeconds()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
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

        if (obj instanceof TestCase == false)
            return false;
        TestCase other = (TestCase) obj;
        if (other.getReportArn() == null ^ this.getReportArn() == null)
            return false;
        if (other.getReportArn() != null && other.getReportArn().equals(this.getReportArn()) == false)
            return false;
        if (other.getTestRawDataPath() == null ^ this.getTestRawDataPath() == null)
            return false;
        if (other.getTestRawDataPath() != null && other.getTestRawDataPath().equals(this.getTestRawDataPath()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDurationInNanoSeconds() == null ^ this.getDurationInNanoSeconds() == null)
            return false;
        if (other.getDurationInNanoSeconds() != null && other.getDurationInNanoSeconds().equals(this.getDurationInNanoSeconds()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
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

        hashCode = prime * hashCode + ((getReportArn() == null) ? 0 : getReportArn().hashCode());
        hashCode = prime * hashCode + ((getTestRawDataPath() == null) ? 0 : getTestRawDataPath().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDurationInNanoSeconds() == null) ? 0 : getDurationInNanoSeconds().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getExpired() == null) ? 0 : getExpired().hashCode());
        return hashCode;
    }

    @Override
    public TestCase clone() {
        try {
            return (TestCase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.TestCaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
