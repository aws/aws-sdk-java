/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Options for text field. Present if <code>IndexFieldType</code> specifies the field is of type <code>text</code>. A
 * <code>text</code> field is always searchable. All options are enabled by default.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextOptions implements Serializable, Cloneable {

    /** A value to use for the field if the field isn't specified for a document. */
    private String defaultValue;

    private String sourceField;
    /**
     * <p>
     * Whether the contents of the field can be returned in the search results.
     * </p>
     */
    private Boolean returnEnabled;
    /**
     * <p>
     * Whether the field can be used to sort the search results.
     * </p>
     */
    private Boolean sortEnabled;
    /**
     * <p>
     * Whether highlights can be returned for the field.
     * </p>
     */
    private Boolean highlightEnabled;
    /**
     * <p>
     * The name of an analysis scheme for a <code>text</code> field.
     * </p>
     */
    private String analysisScheme;

    /**
     * A value to use for the field if the field isn't specified for a document.
     * 
     * @param defaultValue
     *        A value to use for the field if the field isn't specified for a document.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * A value to use for the field if the field isn't specified for a document.
     * 
     * @return A value to use for the field if the field isn't specified for a document.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * A value to use for the field if the field isn't specified for a document.
     * 
     * @param defaultValue
     *        A value to use for the field if the field isn't specified for a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextOptions withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * @param sourceField
     */

    public void setSourceField(String sourceField) {
        this.sourceField = sourceField;
    }

    /**
     * @return
     */

    public String getSourceField() {
        return this.sourceField;
    }

    /**
     * @param sourceField
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextOptions withSourceField(String sourceField) {
        setSourceField(sourceField);
        return this;
    }

    /**
     * <p>
     * Whether the contents of the field can be returned in the search results.
     * </p>
     * 
     * @param returnEnabled
     *        Whether the contents of the field can be returned in the search results.
     */

    public void setReturnEnabled(Boolean returnEnabled) {
        this.returnEnabled = returnEnabled;
    }

    /**
     * <p>
     * Whether the contents of the field can be returned in the search results.
     * </p>
     * 
     * @return Whether the contents of the field can be returned in the search results.
     */

    public Boolean getReturnEnabled() {
        return this.returnEnabled;
    }

    /**
     * <p>
     * Whether the contents of the field can be returned in the search results.
     * </p>
     * 
     * @param returnEnabled
     *        Whether the contents of the field can be returned in the search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextOptions withReturnEnabled(Boolean returnEnabled) {
        setReturnEnabled(returnEnabled);
        return this;
    }

    /**
     * <p>
     * Whether the contents of the field can be returned in the search results.
     * </p>
     * 
     * @return Whether the contents of the field can be returned in the search results.
     */

    public Boolean isReturnEnabled() {
        return this.returnEnabled;
    }

    /**
     * <p>
     * Whether the field can be used to sort the search results.
     * </p>
     * 
     * @param sortEnabled
     *        Whether the field can be used to sort the search results.
     */

    public void setSortEnabled(Boolean sortEnabled) {
        this.sortEnabled = sortEnabled;
    }

    /**
     * <p>
     * Whether the field can be used to sort the search results.
     * </p>
     * 
     * @return Whether the field can be used to sort the search results.
     */

    public Boolean getSortEnabled() {
        return this.sortEnabled;
    }

    /**
     * <p>
     * Whether the field can be used to sort the search results.
     * </p>
     * 
     * @param sortEnabled
     *        Whether the field can be used to sort the search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextOptions withSortEnabled(Boolean sortEnabled) {
        setSortEnabled(sortEnabled);
        return this;
    }

    /**
     * <p>
     * Whether the field can be used to sort the search results.
     * </p>
     * 
     * @return Whether the field can be used to sort the search results.
     */

    public Boolean isSortEnabled() {
        return this.sortEnabled;
    }

    /**
     * <p>
     * Whether highlights can be returned for the field.
     * </p>
     * 
     * @param highlightEnabled
     *        Whether highlights can be returned for the field.
     */

    public void setHighlightEnabled(Boolean highlightEnabled) {
        this.highlightEnabled = highlightEnabled;
    }

    /**
     * <p>
     * Whether highlights can be returned for the field.
     * </p>
     * 
     * @return Whether highlights can be returned for the field.
     */

    public Boolean getHighlightEnabled() {
        return this.highlightEnabled;
    }

    /**
     * <p>
     * Whether highlights can be returned for the field.
     * </p>
     * 
     * @param highlightEnabled
     *        Whether highlights can be returned for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextOptions withHighlightEnabled(Boolean highlightEnabled) {
        setHighlightEnabled(highlightEnabled);
        return this;
    }

    /**
     * <p>
     * Whether highlights can be returned for the field.
     * </p>
     * 
     * @return Whether highlights can be returned for the field.
     */

    public Boolean isHighlightEnabled() {
        return this.highlightEnabled;
    }

    /**
     * <p>
     * The name of an analysis scheme for a <code>text</code> field.
     * </p>
     * 
     * @param analysisScheme
     *        The name of an analysis scheme for a <code>text</code> field.
     */

    public void setAnalysisScheme(String analysisScheme) {
        this.analysisScheme = analysisScheme;
    }

    /**
     * <p>
     * The name of an analysis scheme for a <code>text</code> field.
     * </p>
     * 
     * @return The name of an analysis scheme for a <code>text</code> field.
     */

    public String getAnalysisScheme() {
        return this.analysisScheme;
    }

    /**
     * <p>
     * The name of an analysis scheme for a <code>text</code> field.
     * </p>
     * 
     * @param analysisScheme
     *        The name of an analysis scheme for a <code>text</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextOptions withAnalysisScheme(String analysisScheme) {
        setAnalysisScheme(analysisScheme);
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getSourceField() != null)
            sb.append("SourceField: ").append(getSourceField()).append(",");
        if (getReturnEnabled() != null)
            sb.append("ReturnEnabled: ").append(getReturnEnabled()).append(",");
        if (getSortEnabled() != null)
            sb.append("SortEnabled: ").append(getSortEnabled()).append(",");
        if (getHighlightEnabled() != null)
            sb.append("HighlightEnabled: ").append(getHighlightEnabled()).append(",");
        if (getAnalysisScheme() != null)
            sb.append("AnalysisScheme: ").append(getAnalysisScheme());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextOptions == false)
            return false;
        TextOptions other = (TextOptions) obj;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getSourceField() == null ^ this.getSourceField() == null)
            return false;
        if (other.getSourceField() != null && other.getSourceField().equals(this.getSourceField()) == false)
            return false;
        if (other.getReturnEnabled() == null ^ this.getReturnEnabled() == null)
            return false;
        if (other.getReturnEnabled() != null && other.getReturnEnabled().equals(this.getReturnEnabled()) == false)
            return false;
        if (other.getSortEnabled() == null ^ this.getSortEnabled() == null)
            return false;
        if (other.getSortEnabled() != null && other.getSortEnabled().equals(this.getSortEnabled()) == false)
            return false;
        if (other.getHighlightEnabled() == null ^ this.getHighlightEnabled() == null)
            return false;
        if (other.getHighlightEnabled() != null && other.getHighlightEnabled().equals(this.getHighlightEnabled()) == false)
            return false;
        if (other.getAnalysisScheme() == null ^ this.getAnalysisScheme() == null)
            return false;
        if (other.getAnalysisScheme() != null && other.getAnalysisScheme().equals(this.getAnalysisScheme()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getSourceField() == null) ? 0 : getSourceField().hashCode());
        hashCode = prime * hashCode + ((getReturnEnabled() == null) ? 0 : getReturnEnabled().hashCode());
        hashCode = prime * hashCode + ((getSortEnabled() == null) ? 0 : getSortEnabled().hashCode());
        hashCode = prime * hashCode + ((getHighlightEnabled() == null) ? 0 : getHighlightEnabled().hashCode());
        hashCode = prime * hashCode + ((getAnalysisScheme() == null) ? 0 : getAnalysisScheme().hashCode());
        return hashCode;
    }

    @Override
    public TextOptions clone() {
        try {
            return (TextOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
