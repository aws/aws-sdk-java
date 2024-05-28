/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about an evaluation form.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormVersionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     */
    private String evaluationFormArn;
    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     */
    private String evaluationFormId;
    /**
     * <p>
     * A version of the evaluation form.
     * </p>
     */
    private Integer evaluationFormVersion;
    /**
     * <p>
     * The flag indicating whether the evaluation form is locked for changes.
     * </p>
     */
    private Boolean locked;
    /**
     * <p>
     * The status of the evaluation form.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp for when the evaluation form was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the evaluation form.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The timestamp for when the evaluation form was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     * </p>
     */
    private String lastModifiedBy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * 
     * @param evaluationFormArn
     *        The Amazon Resource Name (ARN) for the evaluation form resource.
     */

    public void setEvaluationFormArn(String evaluationFormArn) {
        this.evaluationFormArn = evaluationFormArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the evaluation form resource.
     */

    public String getEvaluationFormArn() {
        return this.evaluationFormArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * 
     * @param evaluationFormArn
     *        The Amazon Resource Name (ARN) for the evaluation form resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormVersionSummary withEvaluationFormArn(String evaluationFormArn) {
        setEvaluationFormArn(evaluationFormArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * 
     * @param evaluationFormId
     *        The unique identifier for the evaluation form.
     */

    public void setEvaluationFormId(String evaluationFormId) {
        this.evaluationFormId = evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * 
     * @return The unique identifier for the evaluation form.
     */

    public String getEvaluationFormId() {
        return this.evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * 
     * @param evaluationFormId
     *        The unique identifier for the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormVersionSummary withEvaluationFormId(String evaluationFormId) {
        setEvaluationFormId(evaluationFormId);
        return this;
    }

    /**
     * <p>
     * A version of the evaluation form.
     * </p>
     * 
     * @param evaluationFormVersion
     *        A version of the evaluation form.
     */

    public void setEvaluationFormVersion(Integer evaluationFormVersion) {
        this.evaluationFormVersion = evaluationFormVersion;
    }

    /**
     * <p>
     * A version of the evaluation form.
     * </p>
     * 
     * @return A version of the evaluation form.
     */

    public Integer getEvaluationFormVersion() {
        return this.evaluationFormVersion;
    }

    /**
     * <p>
     * A version of the evaluation form.
     * </p>
     * 
     * @param evaluationFormVersion
     *        A version of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormVersionSummary withEvaluationFormVersion(Integer evaluationFormVersion) {
        setEvaluationFormVersion(evaluationFormVersion);
        return this;
    }

    /**
     * <p>
     * The flag indicating whether the evaluation form is locked for changes.
     * </p>
     * 
     * @param locked
     *        The flag indicating whether the evaluation form is locked for changes.
     */

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * <p>
     * The flag indicating whether the evaluation form is locked for changes.
     * </p>
     * 
     * @return The flag indicating whether the evaluation form is locked for changes.
     */

    public Boolean getLocked() {
        return this.locked;
    }

    /**
     * <p>
     * The flag indicating whether the evaluation form is locked for changes.
     * </p>
     * 
     * @param locked
     *        The flag indicating whether the evaluation form is locked for changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormVersionSummary withLocked(Boolean locked) {
        setLocked(locked);
        return this;
    }

    /**
     * <p>
     * The flag indicating whether the evaluation form is locked for changes.
     * </p>
     * 
     * @return The flag indicating whether the evaluation form is locked for changes.
     */

    public Boolean isLocked() {
        return this.locked;
    }

    /**
     * <p>
     * The status of the evaluation form.
     * </p>
     * 
     * @param status
     *        The status of the evaluation form.
     * @see EvaluationFormVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the evaluation form.
     * </p>
     * 
     * @return The status of the evaluation form.
     * @see EvaluationFormVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the evaluation form.
     * </p>
     * 
     * @param status
     *        The status of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFormVersionStatus
     */

    public EvaluationFormVersionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the evaluation form.
     * </p>
     * 
     * @param status
     *        The status of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFormVersionStatus
     */

    public EvaluationFormVersionSummary withStatus(EvaluationFormVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp for when the evaluation form was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was created.
     * </p>
     * 
     * @return The timestamp for when the evaluation form was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp for when the evaluation form was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormVersionSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the evaluation form.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Resource Name (ARN) of the user who created the evaluation form.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the evaluation form.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who created the evaluation form.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the evaluation form.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Resource Name (ARN) of the user who created the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormVersionSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp for when the evaluation form was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last updated.
     * </p>
     * 
     * @return The timestamp for when the evaluation form was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp for when the evaluation form was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormVersionSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormVersionSummary withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
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
        if (getEvaluationFormArn() != null)
            sb.append("EvaluationFormArn: ").append(getEvaluationFormArn()).append(",");
        if (getEvaluationFormId() != null)
            sb.append("EvaluationFormId: ").append(getEvaluationFormId()).append(",");
        if (getEvaluationFormVersion() != null)
            sb.append("EvaluationFormVersion: ").append(getEvaluationFormVersion()).append(",");
        if (getLocked() != null)
            sb.append("Locked: ").append(getLocked()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormVersionSummary == false)
            return false;
        EvaluationFormVersionSummary other = (EvaluationFormVersionSummary) obj;
        if (other.getEvaluationFormArn() == null ^ this.getEvaluationFormArn() == null)
            return false;
        if (other.getEvaluationFormArn() != null && other.getEvaluationFormArn().equals(this.getEvaluationFormArn()) == false)
            return false;
        if (other.getEvaluationFormId() == null ^ this.getEvaluationFormId() == null)
            return false;
        if (other.getEvaluationFormId() != null && other.getEvaluationFormId().equals(this.getEvaluationFormId()) == false)
            return false;
        if (other.getEvaluationFormVersion() == null ^ this.getEvaluationFormVersion() == null)
            return false;
        if (other.getEvaluationFormVersion() != null && other.getEvaluationFormVersion().equals(this.getEvaluationFormVersion()) == false)
            return false;
        if (other.getLocked() == null ^ this.getLocked() == null)
            return false;
        if (other.getLocked() != null && other.getLocked().equals(this.getLocked()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationFormArn() == null) ? 0 : getEvaluationFormArn().hashCode());
        hashCode = prime * hashCode + ((getEvaluationFormId() == null) ? 0 : getEvaluationFormId().hashCode());
        hashCode = prime * hashCode + ((getEvaluationFormVersion() == null) ? 0 : getEvaluationFormVersion().hashCode());
        hashCode = prime * hashCode + ((getLocked() == null) ? 0 : getLocked().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormVersionSummary clone() {
        try {
            return (EvaluationFormVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
