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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectorVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDetectorVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The detector ID.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The detector version ID.
     * </p>
     */
    private String detectorVersionId;
    /**
     * <p>
     * The detector version description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon SageMaker model endpoints included in the detector version.
     * </p>
     */
    private java.util.List<String> externalModelEndpoints;
    /**
     * <p>
     * The model versions included in the detector version.
     * </p>
     */
    private java.util.List<ModelVersion> modelVersions;
    /**
     * <p>
     * The rules included in the detector version.
     * </p>
     */
    private java.util.List<Rule> rules;
    /**
     * <p>
     * The status of the detector version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp when the detector version was last updated.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * The timestamp when the detector version was created.
     * </p>
     */
    private String createdTime;

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @param detectorId
     *        The detector ID.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @return The detector ID.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @param detectorId
     *        The detector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorVersionResult withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * 
     * @param detectorVersionId
     *        The detector version ID.
     */

    public void setDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * 
     * @return The detector version ID.
     */

    public String getDetectorVersionId() {
        return this.detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * 
     * @param detectorVersionId
     *        The detector version ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorVersionResult withDetectorVersionId(String detectorVersionId) {
        setDetectorVersionId(detectorVersionId);
        return this;
    }

    /**
     * <p>
     * The detector version description.
     * </p>
     * 
     * @param description
     *        The detector version description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The detector version description.
     * </p>
     * 
     * @return The detector version description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The detector version description.
     * </p>
     * 
     * @param description
     *        The detector version description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorVersionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints included in the detector version.
     * </p>
     * 
     * @return The Amazon SageMaker model endpoints included in the detector version.
     */

    public java.util.List<String> getExternalModelEndpoints() {
        return externalModelEndpoints;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints included in the detector version.
     * </p>
     * 
     * @param externalModelEndpoints
     *        The Amazon SageMaker model endpoints included in the detector version.
     */

    public void setExternalModelEndpoints(java.util.Collection<String> externalModelEndpoints) {
        if (externalModelEndpoints == null) {
            this.externalModelEndpoints = null;
            return;
        }

        this.externalModelEndpoints = new java.util.ArrayList<String>(externalModelEndpoints);
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints included in the detector version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExternalModelEndpoints(java.util.Collection)} or
     * {@link #withExternalModelEndpoints(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param externalModelEndpoints
     *        The Amazon SageMaker model endpoints included in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorVersionResult withExternalModelEndpoints(String... externalModelEndpoints) {
        if (this.externalModelEndpoints == null) {
            setExternalModelEndpoints(new java.util.ArrayList<String>(externalModelEndpoints.length));
        }
        for (String ele : externalModelEndpoints) {
            this.externalModelEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints included in the detector version.
     * </p>
     * 
     * @param externalModelEndpoints
     *        The Amazon SageMaker model endpoints included in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorVersionResult withExternalModelEndpoints(java.util.Collection<String> externalModelEndpoints) {
        setExternalModelEndpoints(externalModelEndpoints);
        return this;
    }

    /**
     * <p>
     * The model versions included in the detector version.
     * </p>
     * 
     * @return The model versions included in the detector version.
     */

    public java.util.List<ModelVersion> getModelVersions() {
        return modelVersions;
    }

    /**
     * <p>
     * The model versions included in the detector version.
     * </p>
     * 
     * @param modelVersions
     *        The model versions included in the detector version.
     */

    public void setModelVersions(java.util.Collection<ModelVersion> modelVersions) {
        if (modelVersions == null) {
            this.modelVersions = null;
            return;
        }

        this.modelVersions = new java.util.ArrayList<ModelVersion>(modelVersions);
    }

    /**
     * <p>
     * The model versions included in the detector version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelVersions(java.util.Collection)} or {@link #withModelVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param modelVersions
     *        The model versions included in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorVersionResult withModelVersions(ModelVersion... modelVersions) {
        if (this.modelVersions == null) {
            setModelVersions(new java.util.ArrayList<ModelVersion>(modelVersions.length));
        }
        for (ModelVersion ele : modelVersions) {
            this.modelVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The model versions included in the detector version.
     * </p>
     * 
     * @param modelVersions
     *        The model versions included in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorVersionResult withModelVersions(java.util.Collection<ModelVersion> modelVersions) {
        setModelVersions(modelVersions);
        return this;
    }

    /**
     * <p>
     * The rules included in the detector version.
     * </p>
     * 
     * @return The rules included in the detector version.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules included in the detector version.
     * </p>
     * 
     * @param rules
     *        The rules included in the detector version.
     */

    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * The rules included in the detector version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules included in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorVersionResult withRules(Rule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<Rule>(rules.length));
        }
        for (Rule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules included in the detector version.
     * </p>
     * 
     * @param rules
     *        The rules included in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorVersionResult withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * 
     * @param status
     *        The status of the detector version.
     * @see DetectorVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * 
     * @return The status of the detector version.
     * @see DetectorVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * 
     * @param status
     *        The status of the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectorVersionStatus
     */

    public GetDetectorVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * 
     * @param status
     *        The status of the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectorVersionStatus
     */

    public GetDetectorVersionResult withStatus(DetectorVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the detector version was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp when the detector version was last updated.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp when the detector version was last updated.
     * </p>
     * 
     * @return The timestamp when the detector version was last updated.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp when the detector version was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp when the detector version was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorVersionResult withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when the detector version was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the detector version was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp when the detector version was created.
     * </p>
     * 
     * @return The timestamp when the detector version was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp when the detector version was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the detector version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorVersionResult withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getDetectorVersionId() != null)
            sb.append("DetectorVersionId: ").append(getDetectorVersionId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExternalModelEndpoints() != null)
            sb.append("ExternalModelEndpoints: ").append(getExternalModelEndpoints()).append(",");
        if (getModelVersions() != null)
            sb.append("ModelVersions: ").append(getModelVersions()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDetectorVersionResult == false)
            return false;
        GetDetectorVersionResult other = (GetDetectorVersionResult) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionId() == null ^ this.getDetectorVersionId() == null)
            return false;
        if (other.getDetectorVersionId() != null && other.getDetectorVersionId().equals(this.getDetectorVersionId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExternalModelEndpoints() == null ^ this.getExternalModelEndpoints() == null)
            return false;
        if (other.getExternalModelEndpoints() != null && other.getExternalModelEndpoints().equals(this.getExternalModelEndpoints()) == false)
            return false;
        if (other.getModelVersions() == null ^ this.getModelVersions() == null)
            return false;
        if (other.getModelVersions() != null && other.getModelVersions().equals(this.getModelVersions()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDetectorVersionId() == null) ? 0 : getDetectorVersionId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExternalModelEndpoints() == null) ? 0 : getExternalModelEndpoints().hashCode());
        hashCode = prime * hashCode + ((getModelVersions() == null) ? 0 : getModelVersions().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public GetDetectorVersionResult clone() {
        try {
            return (GetDetectorVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
