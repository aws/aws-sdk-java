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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lens upgrade summary return object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/LensUpgradeSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LensUpgradeSummary implements Serializable, Cloneable, StructuredPojo {

    private String workloadId;

    private String workloadName;

    private String lensAlias;
    /**
     * <p>
     * The current version of the lens.
     * </p>
     */
    private String currentLensVersion;
    /**
     * <p>
     * The latest version of the lens.
     * </p>
     */
    private String latestLensVersion;

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensUpgradeSummary withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @param workloadName
     */

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    /**
     * @return
     */

    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * @param workloadName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensUpgradeSummary withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
        return this;
    }

    /**
     * @param lensAlias
     */

    public void setLensAlias(String lensAlias) {
        this.lensAlias = lensAlias;
    }

    /**
     * @return
     */

    public String getLensAlias() {
        return this.lensAlias;
    }

    /**
     * @param lensAlias
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensUpgradeSummary withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * <p>
     * The current version of the lens.
     * </p>
     * 
     * @param currentLensVersion
     *        The current version of the lens.
     */

    public void setCurrentLensVersion(String currentLensVersion) {
        this.currentLensVersion = currentLensVersion;
    }

    /**
     * <p>
     * The current version of the lens.
     * </p>
     * 
     * @return The current version of the lens.
     */

    public String getCurrentLensVersion() {
        return this.currentLensVersion;
    }

    /**
     * <p>
     * The current version of the lens.
     * </p>
     * 
     * @param currentLensVersion
     *        The current version of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensUpgradeSummary withCurrentLensVersion(String currentLensVersion) {
        setCurrentLensVersion(currentLensVersion);
        return this;
    }

    /**
     * <p>
     * The latest version of the lens.
     * </p>
     * 
     * @param latestLensVersion
     *        The latest version of the lens.
     */

    public void setLatestLensVersion(String latestLensVersion) {
        this.latestLensVersion = latestLensVersion;
    }

    /**
     * <p>
     * The latest version of the lens.
     * </p>
     * 
     * @return The latest version of the lens.
     */

    public String getLatestLensVersion() {
        return this.latestLensVersion;
    }

    /**
     * <p>
     * The latest version of the lens.
     * </p>
     * 
     * @param latestLensVersion
     *        The latest version of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensUpgradeSummary withLatestLensVersion(String latestLensVersion) {
        setLatestLensVersion(latestLensVersion);
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName()).append(",");
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getCurrentLensVersion() != null)
            sb.append("CurrentLensVersion: ").append(getCurrentLensVersion()).append(",");
        if (getLatestLensVersion() != null)
            sb.append("LatestLensVersion: ").append(getLatestLensVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LensUpgradeSummary == false)
            return false;
        LensUpgradeSummary other = (LensUpgradeSummary) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getCurrentLensVersion() == null ^ this.getCurrentLensVersion() == null)
            return false;
        if (other.getCurrentLensVersion() != null && other.getCurrentLensVersion().equals(this.getCurrentLensVersion()) == false)
            return false;
        if (other.getLatestLensVersion() == null ^ this.getLatestLensVersion() == null)
            return false;
        if (other.getLatestLensVersion() != null && other.getLatestLensVersion().equals(this.getLatestLensVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getCurrentLensVersion() == null) ? 0 : getCurrentLensVersion().hashCode());
        hashCode = prime * hashCode + ((getLatestLensVersion() == null) ? 0 : getLatestLensVersion().hashCode());
        return hashCode;
    }

    @Override
    public LensUpgradeSummary clone() {
        try {
            return (LensUpgradeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.LensUpgradeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
