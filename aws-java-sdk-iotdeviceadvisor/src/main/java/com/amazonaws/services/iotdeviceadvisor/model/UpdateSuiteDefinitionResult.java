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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/UpdateSuiteDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSuiteDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Updates a Device Advisor test suite with suite UUID.
     * </p>
     */
    private String suiteDefinitionId;
    /**
     * <p>
     * Updates a Device Advisor test suite with Amazon Resource name.
     * </p>
     */
    private String suiteDefinitionArn;
    /**
     * <p>
     * Updates a Device Advisor test suite with suite definition name.
     * </p>
     */
    private String suiteDefinitionName;
    /**
     * <p>
     * Updates a Device Advisor test suite with suite definition version.
     * </p>
     */
    private String suiteDefinitionVersion;
    /**
     * <p>
     * Updates a Device Advisor test suite with TimeStamp of when it was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Updates a Device Advisor test suite with TimeStamp of when it was updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * Updates a Device Advisor test suite with suite UUID.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Updates a Device Advisor test suite with suite UUID.
     */

    public void setSuiteDefinitionId(String suiteDefinitionId) {
        this.suiteDefinitionId = suiteDefinitionId;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with suite UUID.
     * </p>
     * 
     * @return Updates a Device Advisor test suite with suite UUID.
     */

    public String getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with suite UUID.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Updates a Device Advisor test suite with suite UUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSuiteDefinitionResult withSuiteDefinitionId(String suiteDefinitionId) {
        setSuiteDefinitionId(suiteDefinitionId);
        return this;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with Amazon Resource name.
     * </p>
     * 
     * @param suiteDefinitionArn
     *        Updates a Device Advisor test suite with Amazon Resource name.
     */

    public void setSuiteDefinitionArn(String suiteDefinitionArn) {
        this.suiteDefinitionArn = suiteDefinitionArn;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with Amazon Resource name.
     * </p>
     * 
     * @return Updates a Device Advisor test suite with Amazon Resource name.
     */

    public String getSuiteDefinitionArn() {
        return this.suiteDefinitionArn;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with Amazon Resource name.
     * </p>
     * 
     * @param suiteDefinitionArn
     *        Updates a Device Advisor test suite with Amazon Resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSuiteDefinitionResult withSuiteDefinitionArn(String suiteDefinitionArn) {
        setSuiteDefinitionArn(suiteDefinitionArn);
        return this;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with suite definition name.
     * </p>
     * 
     * @param suiteDefinitionName
     *        Updates a Device Advisor test suite with suite definition name.
     */

    public void setSuiteDefinitionName(String suiteDefinitionName) {
        this.suiteDefinitionName = suiteDefinitionName;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with suite definition name.
     * </p>
     * 
     * @return Updates a Device Advisor test suite with suite definition name.
     */

    public String getSuiteDefinitionName() {
        return this.suiteDefinitionName;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with suite definition name.
     * </p>
     * 
     * @param suiteDefinitionName
     *        Updates a Device Advisor test suite with suite definition name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSuiteDefinitionResult withSuiteDefinitionName(String suiteDefinitionName) {
        setSuiteDefinitionName(suiteDefinitionName);
        return this;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with suite definition version.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Updates a Device Advisor test suite with suite definition version.
     */

    public void setSuiteDefinitionVersion(String suiteDefinitionVersion) {
        this.suiteDefinitionVersion = suiteDefinitionVersion;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with suite definition version.
     * </p>
     * 
     * @return Updates a Device Advisor test suite with suite definition version.
     */

    public String getSuiteDefinitionVersion() {
        return this.suiteDefinitionVersion;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with suite definition version.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Updates a Device Advisor test suite with suite definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSuiteDefinitionResult withSuiteDefinitionVersion(String suiteDefinitionVersion) {
        setSuiteDefinitionVersion(suiteDefinitionVersion);
        return this;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with TimeStamp of when it was created.
     * </p>
     * 
     * @param createdAt
     *        Updates a Device Advisor test suite with TimeStamp of when it was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with TimeStamp of when it was created.
     * </p>
     * 
     * @return Updates a Device Advisor test suite with TimeStamp of when it was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with TimeStamp of when it was created.
     * </p>
     * 
     * @param createdAt
     *        Updates a Device Advisor test suite with TimeStamp of when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSuiteDefinitionResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with TimeStamp of when it was updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Updates a Device Advisor test suite with TimeStamp of when it was updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with TimeStamp of when it was updated.
     * </p>
     * 
     * @return Updates a Device Advisor test suite with TimeStamp of when it was updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * Updates a Device Advisor test suite with TimeStamp of when it was updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Updates a Device Advisor test suite with TimeStamp of when it was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSuiteDefinitionResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
        if (getSuiteDefinitionArn() != null)
            sb.append("SuiteDefinitionArn: ").append(getSuiteDefinitionArn()).append(",");
        if (getSuiteDefinitionName() != null)
            sb.append("SuiteDefinitionName: ").append(getSuiteDefinitionName()).append(",");
        if (getSuiteDefinitionVersion() != null)
            sb.append("SuiteDefinitionVersion: ").append(getSuiteDefinitionVersion()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSuiteDefinitionResult == false)
            return false;
        UpdateSuiteDefinitionResult other = (UpdateSuiteDefinitionResult) obj;
        if (other.getSuiteDefinitionId() == null ^ this.getSuiteDefinitionId() == null)
            return false;
        if (other.getSuiteDefinitionId() != null && other.getSuiteDefinitionId().equals(this.getSuiteDefinitionId()) == false)
            return false;
        if (other.getSuiteDefinitionArn() == null ^ this.getSuiteDefinitionArn() == null)
            return false;
        if (other.getSuiteDefinitionArn() != null && other.getSuiteDefinitionArn().equals(this.getSuiteDefinitionArn()) == false)
            return false;
        if (other.getSuiteDefinitionName() == null ^ this.getSuiteDefinitionName() == null)
            return false;
        if (other.getSuiteDefinitionName() != null && other.getSuiteDefinitionName().equals(this.getSuiteDefinitionName()) == false)
            return false;
        if (other.getSuiteDefinitionVersion() == null ^ this.getSuiteDefinitionVersion() == null)
            return false;
        if (other.getSuiteDefinitionVersion() != null && other.getSuiteDefinitionVersion().equals(this.getSuiteDefinitionVersion()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuiteDefinitionId() == null) ? 0 : getSuiteDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionArn() == null) ? 0 : getSuiteDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionName() == null) ? 0 : getSuiteDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionVersion() == null) ? 0 : getSuiteDefinitionVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSuiteDefinitionResult clone() {
        try {
            return (UpdateSuiteDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
