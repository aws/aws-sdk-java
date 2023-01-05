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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A lens summary of a lens.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/LensSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LensSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the lens.
     * </p>
     */
    private String lensArn;

    private String lensAlias;

    private String lensName;
    /**
     * <p>
     * The type of the lens.
     * </p>
     */
    private String lensType;

    private String description;

    private java.util.Date createdAt;

    private java.util.Date updatedAt;
    /**
     * <p>
     * The version of the lens.
     * </p>
     */
    private String lensVersion;

    private String owner;
    /**
     * <p>
     * The status of the lens.
     * </p>
     */
    private String lensStatus;

    /**
     * <p>
     * The ARN of the lens.
     * </p>
     * 
     * @param lensArn
     *        The ARN of the lens.
     */

    public void setLensArn(String lensArn) {
        this.lensArn = lensArn;
    }

    /**
     * <p>
     * The ARN of the lens.
     * </p>
     * 
     * @return The ARN of the lens.
     */

    public String getLensArn() {
        return this.lensArn;
    }

    /**
     * <p>
     * The ARN of the lens.
     * </p>
     * 
     * @param lensArn
     *        The ARN of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensSummary withLensArn(String lensArn) {
        setLensArn(lensArn);
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

    public LensSummary withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * @param lensName
     */

    public void setLensName(String lensName) {
        this.lensName = lensName;
    }

    /**
     * @return
     */

    public String getLensName() {
        return this.lensName;
    }

    /**
     * @param lensName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensSummary withLensName(String lensName) {
        setLensName(lensName);
        return this;
    }

    /**
     * <p>
     * The type of the lens.
     * </p>
     * 
     * @param lensType
     *        The type of the lens.
     * @see LensType
     */

    public void setLensType(String lensType) {
        this.lensType = lensType;
    }

    /**
     * <p>
     * The type of the lens.
     * </p>
     * 
     * @return The type of the lens.
     * @see LensType
     */

    public String getLensType() {
        return this.lensType;
    }

    /**
     * <p>
     * The type of the lens.
     * </p>
     * 
     * @param lensType
     *        The type of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LensType
     */

    public LensSummary withLensType(String lensType) {
        setLensType(lensType);
        return this;
    }

    /**
     * <p>
     * The type of the lens.
     * </p>
     * 
     * @param lensType
     *        The type of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LensType
     */

    public LensSummary withLensType(LensType lensType) {
        this.lensType = lensType.toString();
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param createdAt
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @param createdAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @param lensVersion
     *        The version of the lens.
     */

    public void setLensVersion(String lensVersion) {
        this.lensVersion = lensVersion;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @return The version of the lens.
     */

    public String getLensVersion() {
        return this.lensVersion;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @param lensVersion
     *        The version of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensSummary withLensVersion(String lensVersion) {
        setLensVersion(lensVersion);
        return this;
    }

    /**
     * @param owner
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * @param owner
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensSummary withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens.
     * @see LensStatus
     */

    public void setLensStatus(String lensStatus) {
        this.lensStatus = lensStatus;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @return The status of the lens.
     * @see LensStatus
     */

    public String getLensStatus() {
        return this.lensStatus;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LensStatus
     */

    public LensSummary withLensStatus(String lensStatus) {
        setLensStatus(lensStatus);
        return this;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LensStatus
     */

    public LensSummary withLensStatus(LensStatus lensStatus) {
        this.lensStatus = lensStatus.toString();
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
        if (getLensArn() != null)
            sb.append("LensArn: ").append(getLensArn()).append(",");
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getLensName() != null)
            sb.append("LensName: ").append(getLensName()).append(",");
        if (getLensType() != null)
            sb.append("LensType: ").append(getLensType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getLensVersion() != null)
            sb.append("LensVersion: ").append(getLensVersion()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getLensStatus() != null)
            sb.append("LensStatus: ").append(getLensStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LensSummary == false)
            return false;
        LensSummary other = (LensSummary) obj;
        if (other.getLensArn() == null ^ this.getLensArn() == null)
            return false;
        if (other.getLensArn() != null && other.getLensArn().equals(this.getLensArn()) == false)
            return false;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getLensName() == null ^ this.getLensName() == null)
            return false;
        if (other.getLensName() != null && other.getLensName().equals(this.getLensName()) == false)
            return false;
        if (other.getLensType() == null ^ this.getLensType() == null)
            return false;
        if (other.getLensType() != null && other.getLensType().equals(this.getLensType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getLensVersion() == null ^ this.getLensVersion() == null)
            return false;
        if (other.getLensVersion() != null && other.getLensVersion().equals(this.getLensVersion()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getLensStatus() == null ^ this.getLensStatus() == null)
            return false;
        if (other.getLensStatus() != null && other.getLensStatus().equals(this.getLensStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensArn() == null) ? 0 : getLensArn().hashCode());
        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getLensName() == null) ? 0 : getLensName().hashCode());
        hashCode = prime * hashCode + ((getLensType() == null) ? 0 : getLensType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLensVersion() == null) ? 0 : getLensVersion().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getLensStatus() == null) ? 0 : getLensStatus().hashCode());
        return hashCode;
    }

    @Override
    public LensSummary clone() {
        try {
            return (LensSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.LensSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
