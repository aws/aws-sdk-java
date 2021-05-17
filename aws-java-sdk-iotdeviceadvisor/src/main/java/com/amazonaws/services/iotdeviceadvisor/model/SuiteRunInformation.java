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
 * Information about the suite run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/SuiteRunInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuiteRunInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Suite definition Id of the suite run.
     * </p>
     */
    private String suiteDefinitionId;
    /**
     * <p>
     * Suite definition version of the suite run.
     * </p>
     */
    private String suiteDefinitionVersion;
    /**
     * <p>
     * Suite definition name of the suite run.
     * </p>
     */
    private String suiteDefinitionName;
    /**
     * <p>
     * Suite run Id of the suite run.
     * </p>
     */
    private String suiteRunId;
    /**
     * <p>
     * Date (in Unix epoch time) when the suite run was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Date (in Unix epoch time) when the suite run was started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * Date (in Unix epoch time) when the suite run ended.
     * </p>
     */
    private java.util.Date endAt;
    /**
     * <p>
     * Status of the suite run.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Number of test cases that passed in the suite run.
     * </p>
     */
    private Integer passed;
    /**
     * <p>
     * Number of test cases that failed in the suite run.
     * </p>
     */
    private Integer failed;

    /**
     * <p>
     * Suite definition Id of the suite run.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Suite definition Id of the suite run.
     */

    public void setSuiteDefinitionId(String suiteDefinitionId) {
        this.suiteDefinitionId = suiteDefinitionId;
    }

    /**
     * <p>
     * Suite definition Id of the suite run.
     * </p>
     * 
     * @return Suite definition Id of the suite run.
     */

    public String getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }

    /**
     * <p>
     * Suite definition Id of the suite run.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Suite definition Id of the suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withSuiteDefinitionId(String suiteDefinitionId) {
        setSuiteDefinitionId(suiteDefinitionId);
        return this;
    }

    /**
     * <p>
     * Suite definition version of the suite run.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Suite definition version of the suite run.
     */

    public void setSuiteDefinitionVersion(String suiteDefinitionVersion) {
        this.suiteDefinitionVersion = suiteDefinitionVersion;
    }

    /**
     * <p>
     * Suite definition version of the suite run.
     * </p>
     * 
     * @return Suite definition version of the suite run.
     */

    public String getSuiteDefinitionVersion() {
        return this.suiteDefinitionVersion;
    }

    /**
     * <p>
     * Suite definition version of the suite run.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Suite definition version of the suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withSuiteDefinitionVersion(String suiteDefinitionVersion) {
        setSuiteDefinitionVersion(suiteDefinitionVersion);
        return this;
    }

    /**
     * <p>
     * Suite definition name of the suite run.
     * </p>
     * 
     * @param suiteDefinitionName
     *        Suite definition name of the suite run.
     */

    public void setSuiteDefinitionName(String suiteDefinitionName) {
        this.suiteDefinitionName = suiteDefinitionName;
    }

    /**
     * <p>
     * Suite definition name of the suite run.
     * </p>
     * 
     * @return Suite definition name of the suite run.
     */

    public String getSuiteDefinitionName() {
        return this.suiteDefinitionName;
    }

    /**
     * <p>
     * Suite definition name of the suite run.
     * </p>
     * 
     * @param suiteDefinitionName
     *        Suite definition name of the suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withSuiteDefinitionName(String suiteDefinitionName) {
        setSuiteDefinitionName(suiteDefinitionName);
        return this;
    }

    /**
     * <p>
     * Suite run Id of the suite run.
     * </p>
     * 
     * @param suiteRunId
     *        Suite run Id of the suite run.
     */

    public void setSuiteRunId(String suiteRunId) {
        this.suiteRunId = suiteRunId;
    }

    /**
     * <p>
     * Suite run Id of the suite run.
     * </p>
     * 
     * @return Suite run Id of the suite run.
     */

    public String getSuiteRunId() {
        return this.suiteRunId;
    }

    /**
     * <p>
     * Suite run Id of the suite run.
     * </p>
     * 
     * @param suiteRunId
     *        Suite run Id of the suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withSuiteRunId(String suiteRunId) {
        setSuiteRunId(suiteRunId);
        return this;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite run was created.
     * </p>
     * 
     * @param createdAt
     *        Date (in Unix epoch time) when the suite run was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite run was created.
     * </p>
     * 
     * @return Date (in Unix epoch time) when the suite run was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite run was created.
     * </p>
     * 
     * @param createdAt
     *        Date (in Unix epoch time) when the suite run was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite run was started.
     * </p>
     * 
     * @param startedAt
     *        Date (in Unix epoch time) when the suite run was started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite run was started.
     * </p>
     * 
     * @return Date (in Unix epoch time) when the suite run was started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite run was started.
     * </p>
     * 
     * @param startedAt
     *        Date (in Unix epoch time) when the suite run was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite run ended.
     * </p>
     * 
     * @param endAt
     *        Date (in Unix epoch time) when the suite run ended.
     */

    public void setEndAt(java.util.Date endAt) {
        this.endAt = endAt;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite run ended.
     * </p>
     * 
     * @return Date (in Unix epoch time) when the suite run ended.
     */

    public java.util.Date getEndAt() {
        return this.endAt;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite run ended.
     * </p>
     * 
     * @param endAt
     *        Date (in Unix epoch time) when the suite run ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withEndAt(java.util.Date endAt) {
        setEndAt(endAt);
        return this;
    }

    /**
     * <p>
     * Status of the suite run.
     * </p>
     * 
     * @param status
     *        Status of the suite run.
     * @see SuiteRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the suite run.
     * </p>
     * 
     * @return Status of the suite run.
     * @see SuiteRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the suite run.
     * </p>
     * 
     * @param status
     *        Status of the suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuiteRunStatus
     */

    public SuiteRunInformation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the suite run.
     * </p>
     * 
     * @param status
     *        Status of the suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuiteRunStatus
     */

    public SuiteRunInformation withStatus(SuiteRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Number of test cases that passed in the suite run.
     * </p>
     * 
     * @param passed
     *        Number of test cases that passed in the suite run.
     */

    public void setPassed(Integer passed) {
        this.passed = passed;
    }

    /**
     * <p>
     * Number of test cases that passed in the suite run.
     * </p>
     * 
     * @return Number of test cases that passed in the suite run.
     */

    public Integer getPassed() {
        return this.passed;
    }

    /**
     * <p>
     * Number of test cases that passed in the suite run.
     * </p>
     * 
     * @param passed
     *        Number of test cases that passed in the suite run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuiteRunInformation withPassed(Integer passed) {
        setPassed(passed);
        return this;
    }

    /**
     * <p>
     * Number of test cases that failed in the suite run.
     * </p>
     * 
     * @param failed
     *        Number of test cases that failed in the suite run.
     */

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * Number of test cases that failed in the suite run.
     * </p>
     * 
     * @return Number of test cases that failed in the suite run.
     */

    public Integer getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * Number of test cases that failed in the suite run.
     * </p>
     * 
     * @param failed
     *        Number of test cases that failed in the suite run.
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
