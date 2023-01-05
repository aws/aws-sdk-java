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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartAnnotationImportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAnnotationImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A destination annotation store for the job.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * Formatting options for the annotation file.
     * </p>
     */
    private FormatOptions formatOptions;
    /**
     * <p>
     * Items to import.
     * </p>
     */
    private java.util.List<AnnotationImportItemSource> items;
    /**
     * <p>
     * A service role for the job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The job's left normalization setting.
     * </p>
     */
    private Boolean runLeftNormalization;

    /**
     * <p>
     * A destination annotation store for the job.
     * </p>
     * 
     * @param destinationName
     *        A destination annotation store for the job.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * A destination annotation store for the job.
     * </p>
     * 
     * @return A destination annotation store for the job.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * A destination annotation store for the job.
     * </p>
     * 
     * @param destinationName
     *        A destination annotation store for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAnnotationImportJobRequest withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * Formatting options for the annotation file.
     * </p>
     * 
     * @param formatOptions
     *        Formatting options for the annotation file.
     */

    public void setFormatOptions(FormatOptions formatOptions) {
        this.formatOptions = formatOptions;
    }

    /**
     * <p>
     * Formatting options for the annotation file.
     * </p>
     * 
     * @return Formatting options for the annotation file.
     */

    public FormatOptions getFormatOptions() {
        return this.formatOptions;
    }

    /**
     * <p>
     * Formatting options for the annotation file.
     * </p>
     * 
     * @param formatOptions
     *        Formatting options for the annotation file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAnnotationImportJobRequest withFormatOptions(FormatOptions formatOptions) {
        setFormatOptions(formatOptions);
        return this;
    }

    /**
     * <p>
     * Items to import.
     * </p>
     * 
     * @return Items to import.
     */

    public java.util.List<AnnotationImportItemSource> getItems() {
        return items;
    }

    /**
     * <p>
     * Items to import.
     * </p>
     * 
     * @param items
     *        Items to import.
     */

    public void setItems(java.util.Collection<AnnotationImportItemSource> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<AnnotationImportItemSource>(items);
    }

    /**
     * <p>
     * Items to import.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Items to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAnnotationImportJobRequest withItems(AnnotationImportItemSource... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<AnnotationImportItemSource>(items.length));
        }
        for (AnnotationImportItemSource ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Items to import.
     * </p>
     * 
     * @param items
     *        Items to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAnnotationImportJobRequest withItems(java.util.Collection<AnnotationImportItemSource> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * A service role for the job.
     * </p>
     * 
     * @param roleArn
     *        A service role for the job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * A service role for the job.
     * </p>
     * 
     * @return A service role for the job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * A service role for the job.
     * </p>
     * 
     * @param roleArn
     *        A service role for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAnnotationImportJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The job's left normalization setting.
     * </p>
     * 
     * @param runLeftNormalization
     *        The job's left normalization setting.
     */

    public void setRunLeftNormalization(Boolean runLeftNormalization) {
        this.runLeftNormalization = runLeftNormalization;
    }

    /**
     * <p>
     * The job's left normalization setting.
     * </p>
     * 
     * @return The job's left normalization setting.
     */

    public Boolean getRunLeftNormalization() {
        return this.runLeftNormalization;
    }

    /**
     * <p>
     * The job's left normalization setting.
     * </p>
     * 
     * @param runLeftNormalization
     *        The job's left normalization setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAnnotationImportJobRequest withRunLeftNormalization(Boolean runLeftNormalization) {
        setRunLeftNormalization(runLeftNormalization);
        return this;
    }

    /**
     * <p>
     * The job's left normalization setting.
     * </p>
     * 
     * @return The job's left normalization setting.
     */

    public Boolean isRunLeftNormalization() {
        return this.runLeftNormalization;
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
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getFormatOptions() != null)
            sb.append("FormatOptions: ").append(getFormatOptions()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRunLeftNormalization() != null)
            sb.append("RunLeftNormalization: ").append(getRunLeftNormalization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAnnotationImportJobRequest == false)
            return false;
        StartAnnotationImportJobRequest other = (StartAnnotationImportJobRequest) obj;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getFormatOptions() == null ^ this.getFormatOptions() == null)
            return false;
        if (other.getFormatOptions() != null && other.getFormatOptions().equals(this.getFormatOptions()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRunLeftNormalization() == null ^ this.getRunLeftNormalization() == null)
            return false;
        if (other.getRunLeftNormalization() != null && other.getRunLeftNormalization().equals(this.getRunLeftNormalization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getFormatOptions() == null) ? 0 : getFormatOptions().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRunLeftNormalization() == null) ? 0 : getRunLeftNormalization().hashCode());
        return hashCode;
    }

    @Override
    public StartAnnotationImportJobRequest clone() {
        return (StartAnnotationImportJobRequest) super.clone();
    }

}
