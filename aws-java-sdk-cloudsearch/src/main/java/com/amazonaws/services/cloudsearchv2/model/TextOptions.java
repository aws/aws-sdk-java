/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * Options for text field. Present if <code>IndexFieldType</code>
 * specifies the field is of type <code>text</code> . A <code>text</code>
 * field is always searchable. All options are enabled by default.
 * </p>
 */
public class TextOptions implements Serializable, Cloneable {

    /**
     * A value to use for the field if the field isn't specified for a
     * document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String defaultValue;

    /**
     * A string that represents the name of an index field. CloudSearch
     * supports regular index fields as well as dynamic fields. A dynamic
     * field's name defines a pattern that begins or ends with a wildcard.
     * Any document fields that don't map to a regular index field but do
     * match a dynamic field's pattern are configured with the dynamic
     * field's indexing options. <p>Regular field names begin with a letter
     * and can contain the following characters: a-z (lowercase), 0-9, and _
     * (underscore). Dynamic field names must begin or end with a wildcard
     * (*). The wildcard can also be the only character in a dynamic field
     * name. Multiple wildcards, and wildcards embedded within a string are
     * not supported. <p>The name <code>score</code> is reserved and cannot
     * be used as a field name. To reference a document's ID, you can use the
     * name <code>_id</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     */
    private String sourceField;

    /**
     * Whether the contents of the field can be returned in the search
     * results.
     */
    private Boolean returnEnabled;

    /**
     * Whether the field can be used to sort the search results.
     */
    private Boolean sortEnabled;

    /**
     * Whether highlights can be returned for the field.
     */
    private Boolean highlightEnabled;

    /**
     * The name of an analysis scheme for a <code>text</code> field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String analysisScheme;

    /**
     * A value to use for the field if the field isn't specified for a
     * document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return A value to use for the field if the field isn't specified for a
     *         document.
     */
    public String getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * A value to use for the field if the field isn't specified for a
     * document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param defaultValue A value to use for the field if the field isn't specified for a
     *         document.
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * A value to use for the field if the field isn't specified for a
     * document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param defaultValue A value to use for the field if the field isn't specified for a
     *         document.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TextOptions withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * A string that represents the name of an index field. CloudSearch
     * supports regular index fields as well as dynamic fields. A dynamic
     * field's name defines a pattern that begins or ends with a wildcard.
     * Any document fields that don't map to a regular index field but do
     * match a dynamic field's pattern are configured with the dynamic
     * field's indexing options. <p>Regular field names begin with a letter
     * and can contain the following characters: a-z (lowercase), 0-9, and _
     * (underscore). Dynamic field names must begin or end with a wildcard
     * (*). The wildcard can also be the only character in a dynamic field
     * name. Multiple wildcards, and wildcards embedded within a string are
     * not supported. <p>The name <code>score</code> is reserved and cannot
     * be used as a field name. To reference a document's ID, you can use the
     * name <code>_id</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @return A string that represents the name of an index field. CloudSearch
     *         supports regular index fields as well as dynamic fields. A dynamic
     *         field's name defines a pattern that begins or ends with a wildcard.
     *         Any document fields that don't map to a regular index field but do
     *         match a dynamic field's pattern are configured with the dynamic
     *         field's indexing options. <p>Regular field names begin with a letter
     *         and can contain the following characters: a-z (lowercase), 0-9, and _
     *         (underscore). Dynamic field names must begin or end with a wildcard
     *         (*). The wildcard can also be the only character in a dynamic field
     *         name. Multiple wildcards, and wildcards embedded within a string are
     *         not supported. <p>The name <code>score</code> is reserved and cannot
     *         be used as a field name. To reference a document's ID, you can use the
     *         name <code>_id</code>.
     */
    public String getSourceField() {
        return sourceField;
    }
    
    /**
     * A string that represents the name of an index field. CloudSearch
     * supports regular index fields as well as dynamic fields. A dynamic
     * field's name defines a pattern that begins or ends with a wildcard.
     * Any document fields that don't map to a regular index field but do
     * match a dynamic field's pattern are configured with the dynamic
     * field's indexing options. <p>Regular field names begin with a letter
     * and can contain the following characters: a-z (lowercase), 0-9, and _
     * (underscore). Dynamic field names must begin or end with a wildcard
     * (*). The wildcard can also be the only character in a dynamic field
     * name. Multiple wildcards, and wildcards embedded within a string are
     * not supported. <p>The name <code>score</code> is reserved and cannot
     * be used as a field name. To reference a document's ID, you can use the
     * name <code>_id</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param sourceField A string that represents the name of an index field. CloudSearch
     *         supports regular index fields as well as dynamic fields. A dynamic
     *         field's name defines a pattern that begins or ends with a wildcard.
     *         Any document fields that don't map to a regular index field but do
     *         match a dynamic field's pattern are configured with the dynamic
     *         field's indexing options. <p>Regular field names begin with a letter
     *         and can contain the following characters: a-z (lowercase), 0-9, and _
     *         (underscore). Dynamic field names must begin or end with a wildcard
     *         (*). The wildcard can also be the only character in a dynamic field
     *         name. Multiple wildcards, and wildcards embedded within a string are
     *         not supported. <p>The name <code>score</code> is reserved and cannot
     *         be used as a field name. To reference a document's ID, you can use the
     *         name <code>_id</code>.
     */
    public void setSourceField(String sourceField) {
        this.sourceField = sourceField;
    }
    
    /**
     * A string that represents the name of an index field. CloudSearch
     * supports regular index fields as well as dynamic fields. A dynamic
     * field's name defines a pattern that begins or ends with a wildcard.
     * Any document fields that don't map to a regular index field but do
     * match a dynamic field's pattern are configured with the dynamic
     * field's indexing options. <p>Regular field names begin with a letter
     * and can contain the following characters: a-z (lowercase), 0-9, and _
     * (underscore). Dynamic field names must begin or end with a wildcard
     * (*). The wildcard can also be the only character in a dynamic field
     * name. Multiple wildcards, and wildcards embedded within a string are
     * not supported. <p>The name <code>score</code> is reserved and cannot
     * be used as a field name. To reference a document's ID, you can use the
     * name <code>_id</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param sourceField A string that represents the name of an index field. CloudSearch
     *         supports regular index fields as well as dynamic fields. A dynamic
     *         field's name defines a pattern that begins or ends with a wildcard.
     *         Any document fields that don't map to a regular index field but do
     *         match a dynamic field's pattern are configured with the dynamic
     *         field's indexing options. <p>Regular field names begin with a letter
     *         and can contain the following characters: a-z (lowercase), 0-9, and _
     *         (underscore). Dynamic field names must begin or end with a wildcard
     *         (*). The wildcard can also be the only character in a dynamic field
     *         name. Multiple wildcards, and wildcards embedded within a string are
     *         not supported. <p>The name <code>score</code> is reserved and cannot
     *         be used as a field name. To reference a document's ID, you can use the
     *         name <code>_id</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TextOptions withSourceField(String sourceField) {
        this.sourceField = sourceField;
        return this;
    }

    /**
     * Whether the contents of the field can be returned in the search
     * results.
     *
     * @return Whether the contents of the field can be returned in the search
     *         results.
     */
    public Boolean isReturnEnabled() {
        return returnEnabled;
    }
    
    /**
     * Whether the contents of the field can be returned in the search
     * results.
     *
     * @param returnEnabled Whether the contents of the field can be returned in the search
     *         results.
     */
    public void setReturnEnabled(Boolean returnEnabled) {
        this.returnEnabled = returnEnabled;
    }
    
    /**
     * Whether the contents of the field can be returned in the search
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param returnEnabled Whether the contents of the field can be returned in the search
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TextOptions withReturnEnabled(Boolean returnEnabled) {
        this.returnEnabled = returnEnabled;
        return this;
    }

    /**
     * Whether the contents of the field can be returned in the search
     * results.
     *
     * @return Whether the contents of the field can be returned in the search
     *         results.
     */
    public Boolean getReturnEnabled() {
        return returnEnabled;
    }

    /**
     * Whether the field can be used to sort the search results.
     *
     * @return Whether the field can be used to sort the search results.
     */
    public Boolean isSortEnabled() {
        return sortEnabled;
    }
    
    /**
     * Whether the field can be used to sort the search results.
     *
     * @param sortEnabled Whether the field can be used to sort the search results.
     */
    public void setSortEnabled(Boolean sortEnabled) {
        this.sortEnabled = sortEnabled;
    }
    
    /**
     * Whether the field can be used to sort the search results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sortEnabled Whether the field can be used to sort the search results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TextOptions withSortEnabled(Boolean sortEnabled) {
        this.sortEnabled = sortEnabled;
        return this;
    }

    /**
     * Whether the field can be used to sort the search results.
     *
     * @return Whether the field can be used to sort the search results.
     */
    public Boolean getSortEnabled() {
        return sortEnabled;
    }

    /**
     * Whether highlights can be returned for the field.
     *
     * @return Whether highlights can be returned for the field.
     */
    public Boolean isHighlightEnabled() {
        return highlightEnabled;
    }
    
    /**
     * Whether highlights can be returned for the field.
     *
     * @param highlightEnabled Whether highlights can be returned for the field.
     */
    public void setHighlightEnabled(Boolean highlightEnabled) {
        this.highlightEnabled = highlightEnabled;
    }
    
    /**
     * Whether highlights can be returned for the field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param highlightEnabled Whether highlights can be returned for the field.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TextOptions withHighlightEnabled(Boolean highlightEnabled) {
        this.highlightEnabled = highlightEnabled;
        return this;
    }

    /**
     * Whether highlights can be returned for the field.
     *
     * @return Whether highlights can be returned for the field.
     */
    public Boolean getHighlightEnabled() {
        return highlightEnabled;
    }

    /**
     * The name of an analysis scheme for a <code>text</code> field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return The name of an analysis scheme for a <code>text</code> field.
     */
    public String getAnalysisScheme() {
        return analysisScheme;
    }
    
    /**
     * The name of an analysis scheme for a <code>text</code> field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param analysisScheme The name of an analysis scheme for a <code>text</code> field.
     */
    public void setAnalysisScheme(String analysisScheme) {
        this.analysisScheme = analysisScheme;
    }
    
    /**
     * The name of an analysis scheme for a <code>text</code> field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param analysisScheme The name of an analysis scheme for a <code>text</code> field.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TextOptions withAnalysisScheme(String analysisScheme) {
        this.analysisScheme = analysisScheme;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDefaultValue() != null) sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (getSourceField() != null) sb.append("SourceField: " + getSourceField() + ",");
        if (isReturnEnabled() != null) sb.append("ReturnEnabled: " + isReturnEnabled() + ",");
        if (isSortEnabled() != null) sb.append("SortEnabled: " + isSortEnabled() + ",");
        if (isHighlightEnabled() != null) sb.append("HighlightEnabled: " + isHighlightEnabled() + ",");
        if (getAnalysisScheme() != null) sb.append("AnalysisScheme: " + getAnalysisScheme() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode()); 
        hashCode = prime * hashCode + ((getSourceField() == null) ? 0 : getSourceField().hashCode()); 
        hashCode = prime * hashCode + ((isReturnEnabled() == null) ? 0 : isReturnEnabled().hashCode()); 
        hashCode = prime * hashCode + ((isSortEnabled() == null) ? 0 : isSortEnabled().hashCode()); 
        hashCode = prime * hashCode + ((isHighlightEnabled() == null) ? 0 : isHighlightEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getAnalysisScheme() == null) ? 0 : getAnalysisScheme().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TextOptions == false) return false;
        TextOptions other = (TextOptions)obj;
        
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null) return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false) return false; 
        if (other.getSourceField() == null ^ this.getSourceField() == null) return false;
        if (other.getSourceField() != null && other.getSourceField().equals(this.getSourceField()) == false) return false; 
        if (other.isReturnEnabled() == null ^ this.isReturnEnabled() == null) return false;
        if (other.isReturnEnabled() != null && other.isReturnEnabled().equals(this.isReturnEnabled()) == false) return false; 
        if (other.isSortEnabled() == null ^ this.isSortEnabled() == null) return false;
        if (other.isSortEnabled() != null && other.isSortEnabled().equals(this.isSortEnabled()) == false) return false; 
        if (other.isHighlightEnabled() == null ^ this.isHighlightEnabled() == null) return false;
        if (other.isHighlightEnabled() != null && other.isHighlightEnabled().equals(this.isHighlightEnabled()) == false) return false; 
        if (other.getAnalysisScheme() == null ^ this.getAnalysisScheme() == null) return false;
        if (other.getAnalysisScheme() != null && other.getAnalysisScheme().equals(this.getAnalysisScheme()) == false) return false; 
        return true;
    }
    
    @Override
    public TextOptions clone() {
        try {
            return (TextOptions) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    