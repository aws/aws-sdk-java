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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides test case run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/TestCaseRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestCaseRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides test case run Id.
     * </p>
     */
    private String testCaseRunId;
    /**
     * <p>
     * Provides test case run definition Id.
     * </p>
     */
    private String testCaseDefinitionId;
    /**
     * <p>
     * Provides test case run definition Name.
     * </p>
     */
    private String testCaseDefinitionName;
    /**
     * <p>
     * Provides test case run status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Provides test case run start time.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Provides test case run end time.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Provides test case run log Url.
     * </p>
     */
    private String logUrl;
    /**
     * <p>
     * Provides test case run warnings.
     * </p>
     */
    private String warnings;
    /**
     * <p>
     * Provides test case run failure result.
     * </p>
     */
    private String failure;

    /**
     * <p>
     * Provides test case run Id.
     * </p>
     * 
     * @param testCaseRunId
     *        Provides test case run Id.
     */

    public void setTestCaseRunId(String testCaseRunId) {
        this.testCaseRunId = testCaseRunId;
    }

    /**
     * <p>
     * Provides test case run Id.
     * </p>
     * 
     * @return Provides test case run Id.
     */

    public String getTestCaseRunId() {
        return this.testCaseRunId;
    }

    /**
     * <p>
     * Provides test case run Id.
     * </p>
     * 
     * @param testCaseRunId
     *        Provides test case run Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRun withTestCaseRunId(String testCaseRunId) {
        setTestCaseRunId(testCaseRunId);
        return this;
    }

    /**
     * <p>
     * Provides test case run definition Id.
     * </p>
     * 
     * @param testCaseDefinitionId
     *        Provides test case run definition Id.
     */

    public void setTestCaseDefinitionId(String testCaseDefinitionId) {
        this.testCaseDefinitionId = testCaseDefinitionId;
    }

    /**
     * <p>
     * Provides test case run definition Id.
     * </p>
     * 
     * @return Provides test case run definition Id.
     */

    public String getTestCaseDefinitionId() {
        return this.testCaseDefinitionId;
    }

    /**
     * <p>
     * Provides test case run definition Id.
     * </p>
     * 
     * @param testCaseDefinitionId
     *        Provides test case run definition Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRun withTestCaseDefinitionId(String testCaseDefinitionId) {
        setTestCaseDefinitionId(testCaseDefinitionId);
        return this;
    }

    /**
     * <p>
     * Provides test case run definition Name.
     * </p>
     * 
     * @param testCaseDefinitionName
     *        Provides test case run definition Name.
     */

    public void setTestCaseDefinitionName(String testCaseDefinitionName) {
        this.testCaseDefinitionName = testCaseDefinitionName;
    }

    /**
     * <p>
     * Provides test case run definition Name.
     * </p>
     * 
     * @return Provides test case run definition Name.
     */

    public String getTestCaseDefinitionName() {
        return this.testCaseDefinitionName;
    }

    /**
     * <p>
     * Provides test case run definition Name.
     * </p>
     * 
     * @param testCaseDefinitionName
     *        Provides test case run definition Name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRun withTestCaseDefinitionName(String testCaseDefinitionName) {
        setTestCaseDefinitionName(testCaseDefinitionName);
        return this;
    }

    /**
     * <p>
     * Provides test case run status.
     * </p>
     * 
     * @param status
     *        Provides test case run status.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Provides test case run status.
     * </p>
     * 
     * @return Provides test case run status.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Provides test case run status.
     * </p>
     * 
     * @param status
     *        Provides test case run status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public TestCaseRun withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Provides test case run status.
     * </p>
     * 
     * @param status
     *        Provides test case run status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public TestCaseRun withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Provides test case run start time.
     * </p>
     * 
     * @param startTime
     *        Provides test case run start time.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Provides test case run start time.
     * </p>
     * 
     * @return Provides test case run start time.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Provides test case run start time.
     * </p>
     * 
     * @param startTime
     *        Provides test case run start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRun withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Provides test case run end time.
     * </p>
     * 
     * @param endTime
     *        Provides test case run end time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Provides test case run end time.
     * </p>
     * 
     * @return Provides test case run end time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Provides test case run end time.
     * </p>
     * 
     * @param endTime
     *        Provides test case run end time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRun withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Provides test case run log Url.
     * </p>
     * 
     * @param logUrl
     *        Provides test case run log Url.
     */

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    /**
     * <p>
     * Provides test case run log Url.
     * </p>
     * 
     * @return Provides test case run log Url.
     */

    public String getLogUrl() {
        return this.logUrl;
    }

    /**
     * <p>
     * Provides test case run log Url.
     * </p>
     * 
     * @param logUrl
     *        Provides test case run log Url.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRun withLogUrl(String logUrl) {
        setLogUrl(logUrl);
        return this;
    }

    /**
     * <p>
     * Provides test case run warnings.
     * </p>
     * 
     * @param warnings
     *        Provides test case run warnings.
     */

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    /**
     * <p>
     * Provides test case run warnings.
     * </p>
     * 
     * @return Provides test case run warnings.
     */

    public String getWarnings() {
        return this.warnings;
    }

    /**
     * <p>
     * Provides test case run warnings.
     * </p>
     * 
     * @param warnings
     *        Provides test case run warnings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRun withWarnings(String warnings) {
        setWarnings(warnings);
        return this;
    }

    /**
     * <p>
     * Provides test case run failure result.
     * </p>
     * 
     * @param failure
     *        Provides test case run failure result.
     */

    public void setFailure(String failure) {
        this.failure = failure;
    }

    /**
     * <p>
     * Provides test case run failure result.
     * </p>
     * 
     * @return Provides test case run failure result.
     */

    public String getFailure() {
        return this.failure;
    }

    /**
     * <p>
     * Provides test case run failure result.
     * </p>
     * 
     * @param failure
     *        Provides test case run failure result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRun withFailure(String failure) {
        setFailure(failure);
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
        if (getTestCaseRunId() != null)
            sb.append("TestCaseRunId: ").append(getTestCaseRunId()).append(",");
        if (getTestCaseDefinitionId() != null)
            sb.append("TestCaseDefinitionId: ").append(getTestCaseDefinitionId()).append(",");
        if (getTestCaseDefinitionName() != null)
            sb.append("TestCaseDefinitionName: ").append(getTestCaseDefinitionName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLogUrl() != null)
            sb.append("LogUrl: ").append(getLogUrl()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings()).append(",");
        if (getFailure() != null)
            sb.append("Failure: ").append(getFailure());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestCaseRun == false)
            return false;
        TestCaseRun other = (TestCaseRun) obj;
        if (other.getTestCaseRunId() == null ^ this.getTestCaseRunId() == null)
            return false;
        if (other.getTestCaseRunId() != null && other.getTestCaseRunId().equals(this.getTestCaseRunId()) == false)
            return false;
        if (other.getTestCaseDefinitionId() == null ^ this.getTestCaseDefinitionId() == null)
            return false;
        if (other.getTestCaseDefinitionId() != null && other.getTestCaseDefinitionId().equals(this.getTestCaseDefinitionId()) == false)
            return false;
        if (other.getTestCaseDefinitionName() == null ^ this.getTestCaseDefinitionName() == null)
            return false;
        if (other.getTestCaseDefinitionName() != null && other.getTestCaseDefinitionName().equals(this.getTestCaseDefinitionName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLogUrl() == null ^ this.getLogUrl() == null)
            return false;
        if (other.getLogUrl() != null && other.getLogUrl().equals(this.getLogUrl()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        if (other.getFailure() == null ^ this.getFailure() == null)
            return false;
        if (other.getFailure() != null && other.getFailure().equals(this.getFailure()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestCaseRunId() == null) ? 0 : getTestCaseRunId().hashCode());
        hashCode = prime * hashCode + ((getTestCaseDefinitionId() == null) ? 0 : getTestCaseDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getTestCaseDefinitionName() == null) ? 0 : getTestCaseDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLogUrl() == null) ? 0 : getLogUrl().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        hashCode = prime * hashCode + ((getFailure() == null) ? 0 : getFailure().hashCode());
        return hashCode;
    }

    @Override
    public TestCaseRun clone() {
        try {
            return (TestCaseRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdeviceadvisor.model.transform.TestCaseRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
