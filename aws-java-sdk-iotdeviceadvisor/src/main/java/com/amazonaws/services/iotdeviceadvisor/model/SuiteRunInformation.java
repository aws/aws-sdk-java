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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Get suite run information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/SuiteRunInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuiteRunInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Get suite run information based on suite definition Id.
     * </p>
     */
    private String suiteDefinitionId;
    /**
     * <p>
     * Get suite run information based on suite definition version.
     * </p>
     */
    private String suiteDefinitionVersion;
    /**
     * <p>
     * Get suite run information based on suite definition name.
     * </p>
     */
    private String suiteDefinitionName;
    /**
     * <p>
     * Get suite run information based on suite run Id.
     * </p>
     */
    private String suiteRunId;
    /**
     * <p>
     * Get suite run information based on time suite was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Get suite run information based on start time of the run.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * Get suite run information based on end time of the run.
     * </p>
     */
    private java.util.Date endAt;
    /**
     * <p>
     * Get suite run information based on test run status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Get suite run information based on result of the test suite run.
     * </p>
     */
    private Integer passed;
    /**
     * <p>
     * Get suite run information based on result of the test suite run.
     * </p>
     */
    private Integer failed;

    /**
     * <p>
     * Get suite run information based on suite definition Id.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Get suite run information based on suite definition Id.
     */

    public void setSuiteDefinitionId(String suiteDefinitionId) {
        this.suiteDefinitionId = suiteDefinitionId;
    }

    /**
     * <p>
     * Get suite run information based on suite definition Id.
     * </p>
     * 
     * @return Get suite run information based on suite definition Id.
     */

    public String getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }

    /**
     * <p>
     * Get suite run information based on suite definition Id.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Get suite run information based on suite definition Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withSuiteDefinitionId(String suiteDefinitionId) {
        setSuiteDefinitionId(suiteDefinitionId);
        return this;
    }

    /**
     * <p>
     * Get suite run information based on suite definition version.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Get suite run information based on suite definition version.
     */

    public void setSuiteDefinitionVersion(String suiteDefinitionVersion) {
        this.suiteDefinitionVersion = suiteDefinitionVersion;
    }

    /**
     * <p>
     * Get suite run information based on suite definition version.
     * </p>
     * 
     * @return Get suite run information based on suite definition version.
     */

    public String getSuiteDefinitionVersion() {
        return this.suiteDefinitionVersion;
    }

    /**
     * <p>
     * Get suite run information based on suite definition version.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Get suite run information based on suite definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withSuiteDefinitionVersion(String suiteDefinitionVersion) {
        setSuiteDefinitionVersion(suiteDefinitionVersion);
        return this;
    }

    /**
     * <p>
     * Get suite run information based on suite definition name.
     * </p>
     * 
     * @param suiteDefinitionName
     *        Get suite run information based on suite definition name.
     */

    public void setSuiteDefinitionName(String suiteDefinitionName) {
        this.suiteDefinitionName = suiteDefinitionName;
    }

    /**
     * <p>
     * Get suite run information based on suite definition name.
     * </p>
     * 
     * @return Get suite run information based on suite definition name.
     */

    public String getSuiteDefinitionName() {
        return this.suiteDefinitionName;
    }

    /**
     * <p>
     * Get suite run information based on suite definition name.
     * </p>
     * 
     * @param suiteDefinitionName
     *        Get suite run information based on suite definition name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withSuiteDefinitionName(String suiteDefinitionName) {
        setSuiteDefinitionName(suiteDefinitionName);
        return this;
    }

    /**
     * <p>
     * Get suite run information based on suite run Id.
     * </p>
     * 
     * @param suiteRunId
     *        Get suite run information based on suite run Id.
     */

    public void setSuiteRunId(String suiteRunId) {
        this.suiteRunId = suiteRunId;
    }

    /**
     * <p>
     * Get suite run information based on suite run Id.
     * </p>
     * 
     * @return Get suite run information based on suite run Id.
     */

    public String getSuiteRunId() {
        return this.suiteRunId;
    }

    /**
     * <p>
     * Get suite run information based on suite run Id.
     * </p>
     * 
     * @param suiteRunId
     *        Get suite run information based on suite run Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withSuiteRunId(String suiteRunId) {
        setSuiteRunId(suiteRunId);
        return this;
    }

    /**
     * <p>
     * Get suite run information based on time suite was created.
     * </p>
     * 
     * @param createdAt
     *        Get suite run information based on time suite was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Get suite run information based on time suite was created.
     * </p>
     * 
     * @return Get suite run information based on time suite was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Get suite run information based on time suite was created.
     * </p>
     * 
     * @param createdAt
     *        Get suite run information based on time suite was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Get suite run information based on start time of the run.
     * </p>
     * 
     * @param startedAt
     *        Get suite run information based on start time of the run.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * Get suite run information based on start time of the run.
     * </p>
     * 
     * @return Get suite run information based on start time of the run.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * Get suite run information based on start time of the run.
     * </p>
     * 
     * @param startedAt
     *        Get suite run information based on start time of the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * Get suite run information based on end time of the run.
     * </p>
     * 
     * @param endAt
     *        Get suite run information based on end time of the run.
     */

    public void setEndAt(java.util.Date endAt) {
        this.endAt = endAt;
    }

    /**
     * <p>
     * Get suite run information based on end time of the run.
     * </p>
     * 
     * @return Get suite run information based on end time of the run.
     */

    public java.util.Date getEndAt() {
        return this.endAt;
    }

    /**
     * <p>
     * Get suite run information based on end time of the run.
     * </p>
     * 
     * @param endAt
     *        Get suite run information based on end time of the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withEndAt(java.util.Date endAt) {
        setEndAt(endAt);
        return this;
    }

    /**
     * <p>
     * Get suite run information based on test run status.
     * </p>
     * 
     * @param status
     *        Get suite run information based on test run status.
     * @see SuiteRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Get suite run information based on test run status.
     * </p>
     * 
     * @return Get suite run information based on test run status.
     * @see SuiteRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Get suite run information based on test run status.
     * </p>
     * 
     * @param status
     *        Get suite run information based on test run status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuiteRunStatus
     */

    public SuiteRunInformation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Get suite run information based on test run status.
     * </p>
     * 
     * @param status
     *        Get suite run information based on test run status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuiteRunStatus
     */

    public SuiteRunInformation withStatus(SuiteRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Get suite run information based on result of the test suite run.
     * </p>
     * 
     * @param passed
     *        Get suite run information based on result of the test suite run.
     */

    public void setPassed(Integer passed) {
        this.passed = passed;
    }

    /**
     * <p>
     * Get suite run information based on result of the test suite run.
     * </p>
     * 
     * @return Get suite run information based on result of the test suite run.
     */

    public Integer getPassed() {
        return this.passed;
    }

    /**
     * <p>
     * Get suite run information based on result of the test suite run.
     * </p>
     * 
     * @param passed
     *        Get suite run information based on result of the test suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withPassed(Integer passed) {
        setPassed(passed);
        return this;
    }

    /**
     * <p>
     * Get suite run information based on result of the test suite run.
     * </p>
     * 
     * @param failed
     *        Get suite run information based on result of the test suite run.
     */

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * Get suite run information based on result of the test suite run.
     * </p>
     * 
     * @return Get suite run information based on result of the test suite run.
     */

    public Integer getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * Get suite run information based on result of the test suite run.
     * </p>
     * 
     * @param failed
     *        Get suite run information based on result of the test suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withFailed(Integer failed) {
        setFailed(failed);
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
        if (getSuiteDefinitionName() != null)
            sb.append("SuiteDefinitionName: ").append(getSuiteDefinitionName()).append(",");
        if (getSuiteRunId() != null)
            sb.append("SuiteRunId: ").append(getSuiteRunId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getEndAt() != null)
            sb.append("EndAt: ").append(getEndAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPassed() != null)
            sb.append("Passed: ").append(getPassed()).append(",");
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuiteRunInformation == false)
            return false;
        SuiteRunInformation other = (SuiteRunInformation) obj;
        if (other.getSuiteDefinitionId() == null ^ this.getSuiteDefinitionId() == null)
            return false;
        if (other.getSuiteDefinitionId() != null && other.getSuiteDefinitionId().equals(this.getSuiteDefinitionId()) == false)
            return false;
        if (other.getSuiteDefinitionVersion() == null ^ this.getSuiteDefinitionVersion() == null)
            return false;
        if (other.getSuiteDefinitionVersion() != null && other.getSuiteDefinitionVersion().equals(this.getSuiteDefinitionVersion()) == false)
            return false;
        if (other.getSuiteDefinitionName() == null ^ this.getSuiteDefinitionName() == null)
            return false;
        if (other.getSuiteDefinitionName() != null && other.getSuiteDefinitionName().equals(this.getSuiteDefinitionName()) == false)
            return false;
        if (other.getSuiteRunId() == null ^ this.getSuiteRunId() == null)
            return false;
        if (other.getSuiteRunId() != null && other.getSuiteRunId().equals(this.getSuiteRunId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getEndAt() == null ^ this.getEndAt() == null)
            return false;
        if (other.getEndAt() != null && other.getEndAt().equals(this.getEndAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPassed() == null ^ this.getPassed() == null)
            return false;
        if (other.getPassed() != null && other.getPassed().equals(this.getPassed()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuiteDefinitionId() == null) ? 0 : getSuiteDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionVersion() == null) ? 0 : getSuiteDefinitionVersion().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionName() == null) ? 0 : getSuiteDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getSuiteRunId() == null) ? 0 : getSuiteRunId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getEndAt() == null) ? 0 : getEndAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPassed() == null) ? 0 : getPassed().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        return hashCode;
    }

    @Override
    public SuiteRunInformation clone() {
        try {
            return (SuiteRunInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdeviceadvisor.model.transform.SuiteRunInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
