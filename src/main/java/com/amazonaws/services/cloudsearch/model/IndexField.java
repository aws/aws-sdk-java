/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;


/**
 * <p>
 * Defines a field in the index, including its name, type, and the source of its data. The <code>IndexFieldType</code> indicates which of the options
 * will be present. It is invalid to specify options for a type other than the <code>IndexFieldType</code> .
 * </p>
 */
public class IndexField implements Serializable {

    /**
     * The name of a field in the search index. Field names must begin with a
     * letter and can contain the following characters: a-z (lowercase), 0-9,
     * and _ (underscore). Uppercase letters and hyphens are not allowed. The
     * names "body", "docid", and "text_relevance" are reserved and cannot be
     * specified as field or rank expression names.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     */
    private String indexFieldName;

    /**
     * The type of field. Based on this type, exactly one of the
     * <a>UIntOptions</a>, <a>LiteralOptions</a> or <a>TextOptions</a> must
     * be present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>uint, literal, text
     */
    private String indexFieldType;

    /**
     * Options for an unsigned integer field. Present if
     * <code>IndexFieldType</code> specifies the field is of type unsigned
     * integer.
     */
    private UIntOptions uIntOptions;

    /**
     * Options for literal field. Present if <code>IndexFieldType</code>
     * specifies the field is of type literal.
     */
    private LiteralOptions literalOptions;

    /**
     * Options for text field. Present if <code>IndexFieldType</code>
     * specifies the field is of type text.
     */
    private TextOptions textOptions;

    /**
     * An optional list of source attributes that provide data for this index
     * field. If not specified, the data is pulled from a source attribute
     * with the same name as this <code>IndexField</code>. When one or more
     * source attributes are specified, an optional data transformation can
     * be applied to the source data when populating the index field. You can
     * configure a maximum of 20 sources for an <code>IndexField</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SourceAttribute> sourceAttributes;

    /**
     * The name of a field in the search index. Field names must begin with a
     * letter and can contain the following characters: a-z (lowercase), 0-9,
     * and _ (underscore). Uppercase letters and hyphens are not allowed. The
     * names "body", "docid", and "text_relevance" are reserved and cannot be
     * specified as field or rank expression names.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @return The name of a field in the search index. Field names must begin with a
     *         letter and can contain the following characters: a-z (lowercase), 0-9,
     *         and _ (underscore). Uppercase letters and hyphens are not allowed. The
     *         names "body", "docid", and "text_relevance" are reserved and cannot be
     *         specified as field or rank expression names.
     */
    public String getIndexFieldName() {
        return indexFieldName;
    }
    
    /**
     * The name of a field in the search index. Field names must begin with a
     * letter and can contain the following characters: a-z (lowercase), 0-9,
     * and _ (underscore). Uppercase letters and hyphens are not allowed. The
     * names "body", "docid", and "text_relevance" are reserved and cannot be
     * specified as field or rank expression names.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param indexFieldName The name of a field in the search index. Field names must begin with a
     *         letter and can contain the following characters: a-z (lowercase), 0-9,
     *         and _ (underscore). Uppercase letters and hyphens are not allowed. The
     *         names "body", "docid", and "text_relevance" are reserved and cannot be
     *         specified as field or rank expression names.
     */
    public void setIndexFieldName(String indexFieldName) {
        this.indexFieldName = indexFieldName;
    }
    
    /**
     * The name of a field in the search index. Field names must begin with a
     * letter and can contain the following characters: a-z (lowercase), 0-9,
     * and _ (underscore). Uppercase letters and hyphens are not allowed. The
     * names "body", "docid", and "text_relevance" are reserved and cannot be
     * specified as field or rank expression names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param indexFieldName The name of a field in the search index. Field names must begin with a
     *         letter and can contain the following characters: a-z (lowercase), 0-9,
     *         and _ (underscore). Uppercase letters and hyphens are not allowed. The
     *         names "body", "docid", and "text_relevance" are reserved and cannot be
     *         specified as field or rank expression names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IndexField withIndexFieldName(String indexFieldName) {
        this.indexFieldName = indexFieldName;
        return this;
    }

    /**
     * The type of field. Based on this type, exactly one of the
     * <a>UIntOptions</a>, <a>LiteralOptions</a> or <a>TextOptions</a> must
     * be present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>uint, literal, text
     *
     * @return The type of field. Based on this type, exactly one of the
     *         <a>UIntOptions</a>, <a>LiteralOptions</a> or <a>TextOptions</a> must
     *         be present.
     *
     * @see IndexFieldType
     */
    public String getIndexFieldType() {
        return indexFieldType;
    }
    
    /**
     * The type of field. Based on this type, exactly one of the
     * <a>UIntOptions</a>, <a>LiteralOptions</a> or <a>TextOptions</a> must
     * be present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>uint, literal, text
     *
     * @param indexFieldType The type of field. Based on this type, exactly one of the
     *         <a>UIntOptions</a>, <a>LiteralOptions</a> or <a>TextOptions</a> must
     *         be present.
     *
     * @see IndexFieldType
     */
    public void setIndexFieldType(String indexFieldType) {
        this.indexFieldType = indexFieldType;
    }
    
    /**
     * The type of field. Based on this type, exactly one of the
     * <a>UIntOptions</a>, <a>LiteralOptions</a> or <a>TextOptions</a> must
     * be present.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>uint, literal, text
     *
     * @param indexFieldType The type of field. Based on this type, exactly one of the
     *         <a>UIntOptions</a>, <a>LiteralOptions</a> or <a>TextOptions</a> must
     *         be present.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see IndexFieldType
     */
    public IndexField withIndexFieldType(String indexFieldType) {
        this.indexFieldType = indexFieldType;
        return this;
    }

    /**
     * The type of field. Based on this type, exactly one of the
     * <a>UIntOptions</a>, <a>LiteralOptions</a> or <a>TextOptions</a> must
     * be present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>uint, literal, text
     *
     * @param indexFieldType The type of field. Based on this type, exactly one of the
     *         <a>UIntOptions</a>, <a>LiteralOptions</a> or <a>TextOptions</a> must
     *         be present.
     *
     * @see IndexFieldType
     */
    public void setIndexFieldType(IndexFieldType indexFieldType) {
        this.indexFieldType = indexFieldType.toString();
    }
    
    /**
     * The type of field. Based on this type, exactly one of the
     * <a>UIntOptions</a>, <a>LiteralOptions</a> or <a>TextOptions</a> must
     * be present.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>uint, literal, text
     *
     * @param indexFieldType The type of field. Based on this type, exactly one of the
     *         <a>UIntOptions</a>, <a>LiteralOptions</a> or <a>TextOptions</a> must
     *         be present.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see IndexFieldType
     */
    public IndexField withIndexFieldType(IndexFieldType indexFieldType) {
        this.indexFieldType = indexFieldType.toString();
        return this;
    }

    /**
     * Options for an unsigned integer field. Present if
     * <code>IndexFieldType</code> specifies the field is of type unsigned
     * integer.
     *
     * @return Options for an unsigned integer field. Present if
     *         <code>IndexFieldType</code> specifies the field is of type unsigned
     *         integer.
     */
    public UIntOptions getUIntOptions() {
        return uIntOptions;
    }
    
    /**
     * Options for an unsigned integer field. Present if
     * <code>IndexFieldType</code> specifies the field is of type unsigned
     * integer.
     *
     * @param uIntOptions Options for an unsigned integer field. Present if
     *         <code>IndexFieldType</code> specifies the field is of type unsigned
     *         integer.
     */
    public void setUIntOptions(UIntOptions uIntOptions) {
        this.uIntOptions = uIntOptions;
    }
    
    /**
     * Options for an unsigned integer field. Present if
     * <code>IndexFieldType</code> specifies the field is of type unsigned
     * integer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uIntOptions Options for an unsigned integer field. Present if
     *         <code>IndexFieldType</code> specifies the field is of type unsigned
     *         integer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IndexField withUIntOptions(UIntOptions uIntOptions) {
        this.uIntOptions = uIntOptions;
        return this;
    }

    /**
     * Options for literal field. Present if <code>IndexFieldType</code>
     * specifies the field is of type literal.
     *
     * @return Options for literal field. Present if <code>IndexFieldType</code>
     *         specifies the field is of type literal.
     */
    public LiteralOptions getLiteralOptions() {
        return literalOptions;
    }
    
    /**
     * Options for literal field. Present if <code>IndexFieldType</code>
     * specifies the field is of type literal.
     *
     * @param literalOptions Options for literal field. Present if <code>IndexFieldType</code>
     *         specifies the field is of type literal.
     */
    public void setLiteralOptions(LiteralOptions literalOptions) {
        this.literalOptions = literalOptions;
    }
    
    /**
     * Options for literal field. Present if <code>IndexFieldType</code>
     * specifies the field is of type literal.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param literalOptions Options for literal field. Present if <code>IndexFieldType</code>
     *         specifies the field is of type literal.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IndexField withLiteralOptions(LiteralOptions literalOptions) {
        this.literalOptions = literalOptions;
        return this;
    }

    /**
     * Options for text field. Present if <code>IndexFieldType</code>
     * specifies the field is of type text.
     *
     * @return Options for text field. Present if <code>IndexFieldType</code>
     *         specifies the field is of type text.
     */
    public TextOptions getTextOptions() {
        return textOptions;
    }
    
    /**
     * Options for text field. Present if <code>IndexFieldType</code>
     * specifies the field is of type text.
     *
     * @param textOptions Options for text field. Present if <code>IndexFieldType</code>
     *         specifies the field is of type text.
     */
    public void setTextOptions(TextOptions textOptions) {
        this.textOptions = textOptions;
    }
    
    /**
     * Options for text field. Present if <code>IndexFieldType</code>
     * specifies the field is of type text.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param textOptions Options for text field. Present if <code>IndexFieldType</code>
     *         specifies the field is of type text.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IndexField withTextOptions(TextOptions textOptions) {
        this.textOptions = textOptions;
        return this;
    }

    /**
     * An optional list of source attributes that provide data for this index
     * field. If not specified, the data is pulled from a source attribute
     * with the same name as this <code>IndexField</code>. When one or more
     * source attributes are specified, an optional data transformation can
     * be applied to the source data when populating the index field. You can
     * configure a maximum of 20 sources for an <code>IndexField</code>.
     *
     * @return An optional list of source attributes that provide data for this index
     *         field. If not specified, the data is pulled from a source attribute
     *         with the same name as this <code>IndexField</code>. When one or more
     *         source attributes are specified, an optional data transformation can
     *         be applied to the source data when populating the index field. You can
     *         configure a maximum of 20 sources for an <code>IndexField</code>.
     */
    public java.util.List<SourceAttribute> getSourceAttributes() {
        if (sourceAttributes == null) {
              sourceAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<SourceAttribute>();
              sourceAttributes.setAutoConstruct(true);
        }
        return sourceAttributes;
    }
    
    /**
     * An optional list of source attributes that provide data for this index
     * field. If not specified, the data is pulled from a source attribute
     * with the same name as this <code>IndexField</code>. When one or more
     * source attributes are specified, an optional data transformation can
     * be applied to the source data when populating the index field. You can
     * configure a maximum of 20 sources for an <code>IndexField</code>.
     *
     * @param sourceAttributes An optional list of source attributes that provide data for this index
     *         field. If not specified, the data is pulled from a source attribute
     *         with the same name as this <code>IndexField</code>. When one or more
     *         source attributes are specified, an optional data transformation can
     *         be applied to the source data when populating the index field. You can
     *         configure a maximum of 20 sources for an <code>IndexField</code>.
     */
    public void setSourceAttributes(java.util.Collection<SourceAttribute> sourceAttributes) {
        if (sourceAttributes == null) {
            this.sourceAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SourceAttribute> sourceAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SourceAttribute>(sourceAttributes.size());
        sourceAttributesCopy.addAll(sourceAttributes);
        this.sourceAttributes = sourceAttributesCopy;
    }
    
    /**
     * An optional list of source attributes that provide data for this index
     * field. If not specified, the data is pulled from a source attribute
     * with the same name as this <code>IndexField</code>. When one or more
     * source attributes are specified, an optional data transformation can
     * be applied to the source data when populating the index field. You can
     * configure a maximum of 20 sources for an <code>IndexField</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceAttributes An optional list of source attributes that provide data for this index
     *         field. If not specified, the data is pulled from a source attribute
     *         with the same name as this <code>IndexField</code>. When one or more
     *         source attributes are specified, an optional data transformation can
     *         be applied to the source data when populating the index field. You can
     *         configure a maximum of 20 sources for an <code>IndexField</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IndexField withSourceAttributes(SourceAttribute... sourceAttributes) {
        if (getSourceAttributes() == null) setSourceAttributes(new java.util.ArrayList<SourceAttribute>(sourceAttributes.length));
        for (SourceAttribute value : sourceAttributes) {
            getSourceAttributes().add(value);
        }
        return this;
    }
    
    /**
     * An optional list of source attributes that provide data for this index
     * field. If not specified, the data is pulled from a source attribute
     * with the same name as this <code>IndexField</code>. When one or more
     * source attributes are specified, an optional data transformation can
     * be applied to the source data when populating the index field. You can
     * configure a maximum of 20 sources for an <code>IndexField</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceAttributes An optional list of source attributes that provide data for this index
     *         field. If not specified, the data is pulled from a source attribute
     *         with the same name as this <code>IndexField</code>. When one or more
     *         source attributes are specified, an optional data transformation can
     *         be applied to the source data when populating the index field. You can
     *         configure a maximum of 20 sources for an <code>IndexField</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IndexField withSourceAttributes(java.util.Collection<SourceAttribute> sourceAttributes) {
        if (sourceAttributes == null) {
            this.sourceAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SourceAttribute> sourceAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SourceAttribute>(sourceAttributes.size());
            sourceAttributesCopy.addAll(sourceAttributes);
            this.sourceAttributes = sourceAttributesCopy;
        }

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
        if (getIndexFieldName() != null) sb.append("IndexFieldName: " + getIndexFieldName() + ",");
        if (getIndexFieldType() != null) sb.append("IndexFieldType: " + getIndexFieldType() + ",");
        if (getUIntOptions() != null) sb.append("UIntOptions: " + getUIntOptions() + ",");
        if (getLiteralOptions() != null) sb.append("LiteralOptions: " + getLiteralOptions() + ",");
        if (getTextOptions() != null) sb.append("TextOptions: " + getTextOptions() + ",");
        if (getSourceAttributes() != null) sb.append("SourceAttributes: " + getSourceAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIndexFieldName() == null) ? 0 : getIndexFieldName().hashCode()); 
        hashCode = prime * hashCode + ((getIndexFieldType() == null) ? 0 : getIndexFieldType().hashCode()); 
        hashCode = prime * hashCode + ((getUIntOptions() == null) ? 0 : getUIntOptions().hashCode()); 
        hashCode = prime * hashCode + ((getLiteralOptions() == null) ? 0 : getLiteralOptions().hashCode()); 
        hashCode = prime * hashCode + ((getTextOptions() == null) ? 0 : getTextOptions().hashCode()); 
        hashCode = prime * hashCode + ((getSourceAttributes() == null) ? 0 : getSourceAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IndexField == false) return false;
        IndexField other = (IndexField)obj;
        
        if (other.getIndexFieldName() == null ^ this.getIndexFieldName() == null) return false;
        if (other.getIndexFieldName() != null && other.getIndexFieldName().equals(this.getIndexFieldName()) == false) return false; 
        if (other.getIndexFieldType() == null ^ this.getIndexFieldType() == null) return false;
        if (other.getIndexFieldType() != null && other.getIndexFieldType().equals(this.getIndexFieldType()) == false) return false; 
        if (other.getUIntOptions() == null ^ this.getUIntOptions() == null) return false;
        if (other.getUIntOptions() != null && other.getUIntOptions().equals(this.getUIntOptions()) == false) return false; 
        if (other.getLiteralOptions() == null ^ this.getLiteralOptions() == null) return false;
        if (other.getLiteralOptions() != null && other.getLiteralOptions().equals(this.getLiteralOptions()) == false) return false; 
        if (other.getTextOptions() == null ^ this.getTextOptions() == null) return false;
        if (other.getTextOptions() != null && other.getTextOptions().equals(this.getTextOptions()) == false) return false; 
        if (other.getSourceAttributes() == null ^ this.getSourceAttributes() == null) return false;
        if (other.getSourceAttributes() != null && other.getSourceAttributes().equals(this.getSourceAttributes()) == false) return false; 
        return true;
    }
    
}
    