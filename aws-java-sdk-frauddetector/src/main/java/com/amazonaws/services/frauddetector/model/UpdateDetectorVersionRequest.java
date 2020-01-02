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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDetectorVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The parent detector ID for the detector version you want to update.
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
     * The Amazon SageMaker model endpoints to include in the detector version.
     * </p>
     */
    private java.util.List<String> externalModelEndpoints;
    /**
     * <p>
     * The rules to include in the detector version.
     * </p>
     */
    private java.util.List<Rule> rules;
    /**
     * <p>
     * The detector version description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The model versions to include in the detector version.
     * </p>
     */
    private java.util.List<ModelVersion> modelVersions;

    /**
     * <p>
     * The parent detector ID for the detector version you want to update.
     * </p>
     * 
     * @param detectorId
     *        The parent detector ID for the detector version you want to update.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The parent detector ID for the detector version you want to update.
     * </p>
     * 
     * @return The parent detector ID for the detector version you want to update.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The parent detector ID for the detector version you want to update.
     * </p>
     * 
     * @param detectorId
     *        The parent detector ID for the detector version you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorVersionRequest withDetectorId(String detectorId) {
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

    public UpdateDetectorVersionRequest withDetectorVersionId(String detectorVersionId) {
        setDetectorVersionId(detectorVersionId);
        return this;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints to include in the detector version.
     * </p>
     * 
     * @return The Amazon SageMaker model endpoints to include in the detector version.
     */

    public java.util.List<String> getExternalModelEndpoints() {
        return externalModelEndpoints;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints to include in the detector version.
     * </p>
     * 
     * @param externalModelEndpoints
     *        The Amazon SageMaker model endpoints to include in the detector version.
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
     * The Amazon SageMaker model endpoints to include in the detector version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExternalModelEndpoints(java.util.Collection)} or
     * {@link #withExternalModelEndpoints(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param externalModelEndpoints
     *        The Amazon SageMaker model endpoints to include in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorVersionRequest withExternalModelEndpoints(String... externalModelEndpoints) {
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
     * The Amazon SageMaker model endpoints to include in the detector version.
     * </p>
     * 
     * @param externalModelEndpoints
     *        The Amazon SageMaker model endpoints to include in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorVersionRequest withExternalModelEndpoints(java.util.Collection<String> externalModelEndpoints) {
        setExternalModelEndpoints(externalModelEndpoints);
        return this;
    }

    /**
     * <p>
     * The rules to include in the detector version.
     * </p>
     * 
     * @return The rules to include in the detector version.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules to include in the detector version.
     * </p>
     * 
     * @param rules
     *        The rules to include in the detector version.
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
     * The rules to include in the detector version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules to include in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorVersionRequest withRules(Rule... rules) {
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
     * The rules to include in the detector version.
     * </p>
     * 
     * @param rules
     *        The rules to include in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorVersionRequest withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
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

    public UpdateDetectorVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The model versions to include in the detector version.
     * </p>
     * 
     * @return The model versions to include in the detector version.
     */

    public java.util.List<ModelVersion> getModelVersions() {
        return modelVersions;
    }

    /**
     * <p>
     * The model versions to include in the detector version.
     * </p>
     * 
     * @param modelVersions
     *        The model versions to include in the detector version.
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
     * The model versions to include in the detector version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelVersions(java.util.Collection)} or {@link #withModelVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param modelVersions
     *        The model versions to include in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorVersionRequest withModelVersions(ModelVersion... modelVersions) {
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
     * The model versions to include in the detector version.
     * </p>
     * 
     * @param modelVersions
     *        The model versions to include in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorVersionRequest withModelVersions(java.util.Collection<ModelVersion> modelVersions) {
        setModelVersions(modelVersions);
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
        if (getExternalModelEndpoints() != null)
            sb.append("ExternalModelEndpoints: ").append(getExternalModelEndpoints()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getModelVersions() != null)
            sb.append("ModelVersions: ").append(getModelVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDetectorVersionRequest == false)
            return false;
        UpdateDetectorVersionRequest other = (UpdateDetectorVersionRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionId() == null ^ this.getDetectorVersionId() == null)
            return false;
        if (other.getDetectorVersionId() != null && other.getDetectorVersionId().equals(this.getDetectorVersionId()) == false)
            return false;
        if (other.getExternalModelEndpoints() == null ^ this.getExternalModelEndpoints() == null)
            return false;
        if (other.getExternalModelEndpoints() != null && other.getExternalModelEndpoints().equals(this.getExternalModelEndpoints()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getModelVersions() == null ^ this.getModelVersions() == null)
            return false;
        if (other.getModelVersions() != null && other.getModelVersions().equals(this.getModelVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDetectorVersionId() == null) ? 0 : getDetectorVersionId().hashCode());
        hashCode = prime * hashCode + ((getExternalModelEndpoints() == null) ? 0 : getExternalModelEndpoints().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getModelVersions() == null) ? 0 : getModelVersions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDetectorVersionRequest clone() {
        return (UpdateDetectorVersionRequest) super.clone();
    }

}
