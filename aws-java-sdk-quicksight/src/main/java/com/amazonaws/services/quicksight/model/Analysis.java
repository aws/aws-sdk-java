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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata structure for an analysis in Amazon QuickSight
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Analysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Analysis implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the analysis.
     * </p>
     */
    private String analysisId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The descriptive name of the analysis.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Status associated with the analysis.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Errors associated with the analysis.
     * </p>
     */
    private java.util.List<AnalysisError> errors;
    /**
     * <p>
     * The ARNs of the datasets of the analysis.
     * </p>
     */
    private java.util.List<String> dataSetArns;
    /**
     * <p>
     * The ARN of the theme of the analysis.
     * </p>
     */
    private String themeArn;
    /**
     * <p>
     * The time that the analysis was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The time that the analysis was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * A list of the associated sheets with the unique identifier and name of each sheet.
     * </p>
     */
    private java.util.List<Sheet> sheets;

    /**
     * <p>
     * The ID of the analysis.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis.
     */

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    /**
     * <p>
     * The ID of the analysis.
     * </p>
     * 
     * @return The ID of the analysis.
     */

    public String getAnalysisId() {
        return this.analysisId;
    }

    /**
     * <p>
     * The ID of the analysis.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withAnalysisId(String analysisId) {
        setAnalysisId(analysisId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the analysis.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the analysis.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The descriptive name of the analysis.
     * </p>
     * 
     * @param name
     *        The descriptive name of the analysis.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The descriptive name of the analysis.
     * </p>
     * 
     * @return The descriptive name of the analysis.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The descriptive name of the analysis.
     * </p>
     * 
     * @param name
     *        The descriptive name of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Status associated with the analysis.
     * </p>
     * 
     * @param status
     *        Status associated with the analysis.
     * @see ResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status associated with the analysis.
     * </p>
     * 
     * @return Status associated with the analysis.
     * @see ResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status associated with the analysis.
     * </p>
     * 
     * @param status
     *        Status associated with the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public Analysis withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status associated with the analysis.
     * </p>
     * 
     * @param status
     *        Status associated with the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public Analysis withStatus(ResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Errors associated with the analysis.
     * </p>
     * 
     * @return Errors associated with the analysis.
     */

    public java.util.List<AnalysisError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors associated with the analysis.
     * </p>
     * 
     * @param errors
     *        Errors associated with the analysis.
     */

    public void setErrors(java.util.Collection<AnalysisError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<AnalysisError>(errors);
    }

    /**
     * <p>
     * Errors associated with the analysis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Errors associated with the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withErrors(AnalysisError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<AnalysisError>(errors.length));
        }
        for (AnalysisError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Errors associated with the analysis.
     * </p>
     * 
     * @param errors
     *        Errors associated with the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withErrors(java.util.Collection<AnalysisError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The ARNs of the datasets of the analysis.
     * </p>
     * 
     * @return The ARNs of the datasets of the analysis.
     */

    public java.util.List<String> getDataSetArns() {
        return dataSetArns;
    }

    /**
     * <p>
     * The ARNs of the datasets of the analysis.
     * </p>
     * 
     * @param dataSetArns
     *        The ARNs of the datasets of the analysis.
     */

    public void setDataSetArns(java.util.Collection<String> dataSetArns) {
        if (dataSetArns == null) {
            this.dataSetArns = null;
            return;
        }

        this.dataSetArns = new java.util.ArrayList<String>(dataSetArns);
    }

    /**
     * <p>
     * The ARNs of the datasets of the analysis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSetArns(java.util.Collection)} or {@link #withDataSetArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataSetArns
     *        The ARNs of the datasets of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withDataSetArns(String... dataSetArns) {
        if (this.dataSetArns == null) {
            setDataSetArns(new java.util.ArrayList<String>(dataSetArns.length));
        }
        for (String ele : dataSetArns) {
            this.dataSetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the datasets of the analysis.
     * </p>
     * 
     * @param dataSetArns
     *        The ARNs of the datasets of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withDataSetArns(java.util.Collection<String> dataSetArns) {
        setDataSetArns(dataSetArns);
        return this;
    }

    /**
     * <p>
     * The ARN of the theme of the analysis.
     * </p>
     * 
     * @param themeArn
     *        The ARN of the theme of the analysis.
     */

    public void setThemeArn(String themeArn) {
        this.themeArn = themeArn;
    }

    /**
     * <p>
     * The ARN of the theme of the analysis.
     * </p>
     * 
     * @return The ARN of the theme of the analysis.
     */

    public String getThemeArn() {
        return this.themeArn;
    }

    /**
     * <p>
     * The ARN of the theme of the analysis.
     * </p>
     * 
     * @param themeArn
     *        The ARN of the theme of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withThemeArn(String themeArn) {
        setThemeArn(themeArn);
        return this;
    }

    /**
     * <p>
     * The time that the analysis was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the analysis was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that the analysis was created.
     * </p>
     * 
     * @return The time that the analysis was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that the analysis was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the analysis was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time that the analysis was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that the analysis was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time that the analysis was last updated.
     * </p>
     * 
     * @return The time that the analysis was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time that the analysis was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that the analysis was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * A list of the associated sheets with the unique identifier and name of each sheet.
     * </p>
     * 
     * @return A list of the associated sheets with the unique identifier and name of each sheet.
     */

    public java.util.List<Sheet> getSheets() {
        return sheets;
    }

    /**
     * <p>
     * A list of the associated sheets with the unique identifier and name of each sheet.
     * </p>
     * 
     * @param sheets
     *        A list of the associated sheets with the unique identifier and name of each sheet.
     */

    public void setSheets(java.util.Collection<Sheet> sheets) {
        if (sheets == null) {
            this.sheets = null;
            return;
        }

        this.sheets = new java.util.ArrayList<Sheet>(sheets);
    }

    /**
     * <p>
     * A list of the associated sheets with the unique identifier and name of each sheet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSheets(java.util.Collection)} or {@link #withSheets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sheets
     *        A list of the associated sheets with the unique identifier and name of each sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withSheets(Sheet... sheets) {
        if (this.sheets == null) {
            setSheets(new java.util.ArrayList<Sheet>(sheets.length));
        }
        for (Sheet ele : sheets) {
            this.sheets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the associated sheets with the unique identifier and name of each sheet.
     * </p>
     * 
     * @param sheets
     *        A list of the associated sheets with the unique identifier and name of each sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Analysis withSheets(java.util.Collection<Sheet> sheets) {
        setSheets(sheets);
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
        if (getAnalysisId() != null)
            sb.append("AnalysisId: ").append(getAnalysisId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getDataSetArns() != null)
            sb.append("DataSetArns: ").append(getDataSetArns()).append(",");
        if (getThemeArn() != null)
            sb.append("ThemeArn: ").append(getThemeArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getSheets() != null)
            sb.append("Sheets: ").append(getSheets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Analysis == false)
            return false;
        Analysis other = (Analysis) obj;
        if (other.getAnalysisId() == null ^ this.getAnalysisId() == null)
            return false;
        if (other.getAnalysisId() != null && other.getAnalysisId().equals(this.getAnalysisId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getDataSetArns() == null ^ this.getDataSetArns() == null)
            return false;
        if (other.getDataSetArns() != null && other.getDataSetArns().equals(this.getDataSetArns()) == false)
            return false;
        if (other.getThemeArn() == null ^ this.getThemeArn() == null)
            return false;
        if (other.getThemeArn() != null && other.getThemeArn().equals(this.getThemeArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getSheets() == null ^ this.getSheets() == null)
            return false;
        if (other.getSheets() != null && other.getSheets().equals(this.getSheets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisId() == null) ? 0 : getAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getDataSetArns() == null) ? 0 : getDataSetArns().hashCode());
        hashCode = prime * hashCode + ((getThemeArn() == null) ? 0 : getThemeArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getSheets() == null) ? 0 : getSheets().hashCode());
        return hashCode;
    }

    @Override
    public Analysis clone() {
        try {
            return (Analysis) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AnalysisMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
