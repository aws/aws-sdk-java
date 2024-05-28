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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     */
    private String evaluationFormId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     */
    private String evaluationFormArn;
    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     */
    private String title;
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
     * The timestamp for when the evaluation form was last activated.
     * </p>
     */
    private java.util.Date lastActivatedTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last activated the evaluation form.
     * </p>
     */
    private String lastActivatedBy;
    /**
     * <p>
     * The version number of the latest evaluation form version.
     * </p>
     */
    private Integer latestVersion;
    /**
     * <p>
     * The version of the active evaluation form version.
     * </p>
     */
    private Integer activeVersion;

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

    public EvaluationFormSummary withEvaluationFormId(String evaluationFormId) {
        setEvaluationFormId(evaluationFormId);
        return this;
    }

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

    public EvaluationFormSummary withEvaluationFormArn(String evaluationFormArn) {
        setEvaluationFormArn(evaluationFormArn);
        return this;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * 
     * @param title
     *        A title of the evaluation form.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * 
     * @return A title of the evaluation form.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * 
     * @param title
     *        A title of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSummary withTitle(String title) {
        setTitle(title);
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

    public EvaluationFormSummary withCreatedTime(java.util.Date createdTime) {
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

    public EvaluationFormSummary withCreatedBy(String createdBy) {
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

    public EvaluationFormSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
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

    public EvaluationFormSummary withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last activated.
     * </p>
     * 
     * @param lastActivatedTime
     *        The timestamp for when the evaluation form was last activated.
     */

    public void setLastActivatedTime(java.util.Date lastActivatedTime) {
        this.lastActivatedTime = lastActivatedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last activated.
     * </p>
     * 
     * @return The timestamp for when the evaluation form was last activated.
     */

    public java.util.Date getLastActivatedTime() {
        return this.lastActivatedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last activated.
     * </p>
     * 
     * @param lastActivatedTime
     *        The timestamp for when the evaluation form was last activated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSummary withLastActivatedTime(java.util.Date lastActivatedTime) {
        setLastActivatedTime(lastActivatedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last activated the evaluation form.
     * </p>
     * 
     * @param lastActivatedBy
     *        The Amazon Resource Name (ARN) of the user who last activated the evaluation form.
     */

    public void setLastActivatedBy(String lastActivatedBy) {
        this.lastActivatedBy = lastActivatedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last activated the evaluation form.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who last activated the evaluation form.
     */

    public String getLastActivatedBy() {
        return this.lastActivatedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last activated the evaluation form.
     * </p>
     * 
     * @param lastActivatedBy
     *        The Amazon Resource Name (ARN) of the user who last activated the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSummary withLastActivatedBy(String lastActivatedBy) {
        setLastActivatedBy(lastActivatedBy);
        return this;
    }

    /**
     * <p>
     * The version number of the latest evaluation form version.
     * </p>
     * 
     * @param latestVersion
     *        The version number of the latest evaluation form version.
     */

    public void setLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The version number of the latest evaluation form version.
     * </p>
     * 
     * @return The version number of the latest evaluation form version.
     */

    public Integer getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * <p>
     * The version number of the latest evaluation form version.
     * </p>
     * 
     * @param latestVersion
     *        The version number of the latest evaluation form version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSummary withLatestVersion(Integer latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * <p>
     * The version of the active evaluation form version.
     * </p>
     * 
     * @param activeVersion
     *        The version of the active evaluation form version.
     */

    public void setActiveVersion(Integer activeVersion) {
        this.activeVersion = activeVersion;
    }

    /**
     * <p>
     * The version of the active evaluation form version.
     * </p>
     * 
     * @return The version of the active evaluation form version.
     */

    public Integer getActiveVersion() {
        return this.activeVersion;
    }

    /**
     * <p>
     * The version of the active evaluation form version.
     * </p>
     * 
     * @param activeVersion
     *        The version of the active evaluation form version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSummary withActiveVersion(Integer activeVersion) {
        setActiveVersion(activeVersion);
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
        if (getEvaluationFormId() != null)
            sb.append("EvaluationFormId: ").append(getEvaluationFormId()).append(",");
        if (getEvaluationFormArn() != null)
            sb.append("EvaluationFormArn: ").append(getEvaluationFormArn()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastActivatedTime() != null)
            sb.append("LastActivatedTime: ").append(getLastActivatedTime()).append(",");
        if (getLastActivatedBy() != null)
            sb.append("LastActivatedBy: ").append(getLastActivatedBy()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getActiveVersion() != null)
            sb.append("ActiveVersion: ").append(getActiveVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormSummary == false)
            return false;
        EvaluationFormSummary other = (EvaluationFormSummary) obj;
        if (other.getEvaluationFormId() == null ^ this.getEvaluationFormId() == null)
            return false;
        if (other.getEvaluationFormId() != null && other.getEvaluationFormId().equals(this.getEvaluationFormId()) == false)
            return false;
        if (other.getEvaluationFormArn() == null ^ this.getEvaluationFormArn() == null)
            return false;
        if (other.getEvaluationFormArn() != null && other.getEvaluationFormArn().equals(this.getEvaluationFormArn()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
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
        if (other.getLastActivatedTime() == null ^ this.getLastActivatedTime() == null)
            return false;
        if (other.getLastActivatedTime() != null && other.getLastActivatedTime().equals(this.getLastActivatedTime()) == false)
            return false;
        if (other.getLastActivatedBy() == null ^ this.getLastActivatedBy() == null)
            return false;
        if (other.getLastActivatedBy() != null && other.getLastActivatedBy().equals(this.getLastActivatedBy()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getActiveVersion() == null ^ this.getActiveVersion() == null)
            return false;
        if (other.getActiveVersion() != null && other.getActiveVersion().equals(this.getActiveVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationFormId() == null) ? 0 : getEvaluationFormId().hashCode());
        hashCode = prime * hashCode + ((getEvaluationFormArn() == null) ? 0 : getEvaluationFormArn().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastActivatedTime() == null) ? 0 : getLastActivatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastActivatedBy() == null) ? 0 : getLastActivatedBy().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getActiveVersion() == null) ? 0 : getActiveVersion().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormSummary clone() {
        try {
            return (EvaluationFormSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
