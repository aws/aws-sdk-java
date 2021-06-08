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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSuiteRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Suite definition Id for the test suite run.
     * </p>
     */
    private String suiteDefinitionId;
    /**
     * <p>
     * Suite definition version for the test suite run.
     * </p>
     */
    private String suiteDefinitionVersion;
    /**
     * <p>
     * Suite run Id for the test suite run.
     * </p>
     */
    private String suiteRunId;
    /**
     * <p>
     * The ARN of the suite run.
     * </p>
     */
    private String suiteRunArn;
    /**
     * <p>
     * Suite run configuration for the test suite run.
     * </p>
     */
    private SuiteRunConfiguration suiteRunConfiguration;
    /**
     * <p>
     * Test results for the test suite run.
     * </p>
     */
    private TestResult testResult;
    /**
     * <p>
     * Date (in Unix epoch time) when the test suite run was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Date (in Unix epoch time) when the test suite run ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Status for the test suite run.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Error reason for any test suite run failure.
     * </p>
     */
    private String errorReason;
    /**
     * <p>
     * The tags attached to the suite run.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Suite definition Id for the test suite run.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Suite definition Id for the test suite run.
     */

    public void setSuiteDefinitionId(String suiteDefinitionId) {
        this.suiteDefinitionId = suiteDefinitionId;
    }

    /**
     * <p>
     * Suite definition Id for the test suite run.
     * </p>
     * 
     * @return Suite definition Id for the test suite run.
     */

    public String getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }

    /**
     * <p>
     * Suite definition Id for the test suite run.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Suite definition Id for the test suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunResult withSuiteDefinitionId(String suiteDefinitionId) {
        setSuiteDefinitionId(suiteDefinitionId);
        return this;
    }

    /**
     * <p>
     * Suite definition version for the test suite run.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Suite definition version for the test suite run.
     */

    public void setSuiteDefinitionVersion(String suiteDefinitionVersion) {
        this.suiteDefinitionVersion = suiteDefinitionVersion;
    }

    /**
     * <p>
     * Suite definition version for the test suite run.
     * </p>
     * 
     * @return Suite definition version for the test suite run.
     */

    public String getSuiteDefinitionVersion() {
        return this.suiteDefinitionVersion;
    }

    /**
     * <p>
     * Suite definition version for the test suite run.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Suite definition version for the test suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunResult withSuiteDefinitionVersion(String suiteDefinitionVersion) {
        setSuiteDefinitionVersion(suiteDefinitionVersion);
        return this;
    }

    /**
     * <p>
     * Suite run Id for the test suite run.
     * </p>
     * 
     * @param suiteRunId
     *        Suite run Id for the test suite run.
     */

    public void setSuiteRunId(String suiteRunId) {
        this.suiteRunId = suiteRunId;
    }

    /**
     * <p>
     * Suite run Id for the test suite run.
     * </p>
     * 
     * @return Suite run Id for the test suite run.
     */

    public String getSuiteRunId() {
        return this.suiteRunId;
    }

    /**
     * <p>
     * Suite run Id for the test suite run.
     * </p>
     * 
     * @param suiteRunId
     *        Suite run Id for the test suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunResult withSuiteRunId(String suiteRunId) {
        setSuiteRunId(suiteRunId);
        return this;
    }

    /**
     * <p>
     * The ARN of the suite run.
     * </p>
     * 
     * @param suiteRunArn
     *        The ARN of the suite run.
     */

    public void setSuiteRunArn(String suiteRunArn) {
        this.suiteRunArn = suiteRunArn;
    }

    /**
     * <p>
     * The ARN of the suite run.
     * </p>
     * 
     * @return The ARN of the suite run.
     */

    public String getSuiteRunArn() {
        return this.suiteRunArn;
    }

    /**
     * <p>
     * The ARN of the suite run.
     * </p>
     * 
     * @param suiteRunArn
     *        The ARN of the suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunResult withSuiteRunArn(String suiteRunArn) {
        setSuiteRunArn(suiteRunArn);
        return this;
    }

    /**
     * <p>
     * Suite run configuration for the test suite run.
     * </p>
     * 
     * @param suiteRunConfiguration
     *        Suite run configuration for the test suite run.
     */

    public void setSuiteRunConfiguration(SuiteRunConfiguration suiteRunConfiguration) {
        this.suiteRunConfiguration = suiteRunConfiguration;
    }

    /**
     * <p>
     * Suite run configuration for the test suite run.
     * </p>
     * 
     * @return Suite run configuration for the test suite run.
     */

    public SuiteRunConfiguration getSuiteRunConfiguration() {
        return this.suiteRunConfiguration;
    }

    /**
     * <p>
     * Suite run configuration for the test suite run.
     * </p>
     * 
     * @param suiteRunConfiguration
     *        Suite run configuration for the test suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunResult withSuiteRunConfiguration(SuiteRunConfiguration suiteRunConfiguration) {
        setSuiteRunConfiguration(suiteRunConfiguration);
        return this;
    }

    /**
     * <p>
     * Test results for the test suite run.
     * </p>
     * 
     * @param testResult
     *        Test results for the test suite run.
     */

    public void setTestResult(TestResult testResult) {
        this.testResult = testResult;
    }

    /**
     * <p>
     * Test results for the test suite run.
     * </p>
     * 
     * @return Test results for the test suite run.
     */

    public TestResult getTestResult() {
        return this.testResult;
    }

    /**
     * <p>
     * Test results for the test suite run.
     * </p>
     * 
     * @param testResult
     *        Test results for the test suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunResult withTestResult(TestResult testResult) {
        setTestResult(testResult);
        return this;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the test suite run was started.
     * </p>
     * 
     * @param startTime
     *        Date (in Unix epoch time) when the test suite run was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the test suite run was started.
     * </p>
     * 
     * @return Date (in Unix epoch time) when the test suite run was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the test suite run was started.
     * </p>
     * 
     * @param startTime
     *        Date (in Unix epoch time) when the test suite run was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the test suite run ended.
     * </p>
     * 
     * @param endTime
     *        Date (in Unix epoch time) when the test suite run ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the test suite run ended.
     * </p>
     * 
     * @return Date (in Unix epoch time) when the test suite run ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the test suite run ended.
     * </p>
     * 
     * @param endTime
     *        Date (in Unix epoch time) when the test suite run ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Status for the test suite run.
     * </p>
     * 
     * @param status
     *        Status for the test suite run.
     * @see SuiteRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status for the test suite run.
     * </p>
     * 
     * @return Status for the test suite run.
     * @see SuiteRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status for the test suite run.
     * </p>
     * 
     * @param status
     *        Status for the test suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuiteRunStatus
     */

    public GetSuiteRunResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status for the test suite run.
     * </p>
     * 
     * @param status
     *        Status for the test suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuiteRunStatus
     */

    public GetSuiteRunResult withStatus(SuiteRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Error reason for any test suite run failure.
     * </p>
     * 
     * @param errorReason
     *        Error reason for any test suite run failure.
     */

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    /**
     * <p>
     * Error reason for any test suite run failure.
     * </p>
     * 
     * @return Error reason for any test suite run failure.
     */

    public String getErrorReason() {
        return this.errorReason;
    }

    /**
     * <p>
     * Error reason for any test suite run failure.
     * </p>
     * 
     * @param errorReason
     *        Error reason for any test suite run failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunResult withErrorReason(String errorReason) {
        setErrorReason(errorReason);
        return this;
    }

    /**
     * <p>
     * The tags attached to the suite run.
     * </p>
     * 
     * @return The tags attached to the suite run.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags attached to the suite run.
     * </p>
     * 
     * @param tags
     *        The tags attached to the suite run.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags attached to the suite run.
     * </p>
     * 
     * @param tags
     *        The tags attached to the suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetSuiteRunResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunResult clearTagsEntries() {
        this.tags = null;
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
        if (getSuiteDefinitionId() != null)
            sb.append("SuiteDefinitionId: ").append(getSuiteDefinitionId()).append(",");
        if (getSuiteDefinitionVersion() != null)
            sb.append("SuiteDefinitionVersion: ").append(getSuiteDefinitionVersion()).append(",");
        if (getSuiteRunId() != null)
            sb.append("SuiteRunId: ").append(getSuiteRunId()).append(",");
        if (getSuiteRunArn() != null)
            sb.append("SuiteRunArn: ").append(getSuiteRunArn()).append(",");
        if (getSuiteRunConfiguration() != null)
            sb.append("SuiteRunConfiguration: ").append(getSuiteRunConfiguration()).append(",");
        if (getTestResult() != null)
            sb.append("TestResult: ").append(getTestResult()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorReason() != null)
            sb.append("ErrorReason: ").append(getErrorReason()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSuiteRunResult == false)
            return false;
        GetSuiteRunResult other = (GetSuiteRunResult) obj;
        if (other.getSuiteDefinitionId() == null ^ this.getSuiteDefinitionId() == null)
            return false;
        if (other.getSuiteDefinitionId() != null && other.getSuiteDefinitionId().equals(this.getSuiteDefinitionId()) == false)
            return false;
        if (other.getSuiteDefinitionVersion() == null ^ this.getSuiteDefinitionVersion() == null)
            return false;
        if (other.getSuiteDefinitionVersion() != null && other.getSuiteDefinitionVersion().equals(this.getSuiteDefinitionVersion()) == false)
            return false;
        if (other.getSuiteRunId() == null ^ this.getSuiteRunId() == null)
            return false;
        if (other.getSuiteRunId() != null && other.getSuiteRunId().equals(this.getSuiteRunId()) == false)
            return false;
        if (other.getSuiteRunArn() == null ^ this.getSuiteRunArn() == null)
            return false;
        if (other.getSuiteRunArn() != null && other.getSuiteRunArn().equals(this.getSuiteRunArn()) == false)
            return false;
        if (other.getSuiteRunConfiguration() == null ^ this.getSuiteRunConfiguration() == null)
            return false;
        if (other.getSuiteRunConfiguration() != null && other.getSuiteRunConfiguration().equals(this.getSuiteRunConfiguration()) == false)
            return false;
        if (other.getTestResult() == null ^ this.getTestResult() == null)
            return false;
        if (other.getTestResult() != null && other.getTestResult().equals(this.getTestResult()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorReason() == null ^ this.getErrorReason() == null)
            return false;
        if (other.getErrorReason() != null && other.getErrorReason().equals(this.getErrorReason()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuiteDefinitionId() == null) ? 0 : getSuiteDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionVersion() == null) ? 0 : getSuiteDefinitionVersion().hashCode());
        hashCode = prime * hashCode + ((getSuiteRunId() == null) ? 0 : getSuiteRunId().hashCode());
        hashCode = prime * hashCode + ((getSuiteRunArn() == null) ? 0 : getSuiteRunArn().hashCode());
        hashCode = prime * hashCode + ((getSuiteRunConfiguration() == null) ? 0 : getSuiteRunConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTestResult() == null) ? 0 : getTestResult().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorReason() == null) ? 0 : getErrorReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetSuiteRunResult clone() {
        try {
            return (GetSuiteRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
