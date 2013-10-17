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
 * Specifies how to trim common words from the beginning of a field to enable title sorting by that field.
 * </p>
 */
public class SourceDataTrimTitle implements Serializable {

    /**
     * The name of the document source field to add to this
     * <code>IndexField</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     */
    private String sourceName;

    /**
     * The default value to use if the source attribute is not specified in a
     * document. Optional.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String defaultValue;

    /**
     * The separator that follows the text to trim.
     */
    private String separator;

    /**
     * An <a href="http://tools.ietf.org/html/rfc4646">IETF RFC 4646</a>
     * language code. Only the primary language is considered. English (en)
     * is currently the only supported language.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z]{2,8}(?:-[a-zA-Z]{2,8})*<br/>
     */
    private String language;

    /**
     * The name of the document source field to add to this
     * <code>IndexField</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @return The name of the document source field to add to this
     *         <code>IndexField</code>.
     */
    public String getSourceName() {
        return sourceName;
    }
    
    /**
     * The name of the document source field to add to this
     * <code>IndexField</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param sourceName The name of the document source field to add to this
     *         <code>IndexField</code>.
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }
    
    /**
     * The name of the document source field to add to this
     * <code>IndexField</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param sourceName The name of the document source field to add to this
     *         <code>IndexField</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SourceDataTrimTitle withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * The default value to use if the source attribute is not specified in a
     * document. Optional.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The default value to use if the source attribute is not specified in a
     *         document. Optional.
     */
    public String getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * The default value to use if the source attribute is not specified in a
     * document. Optional.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param defaultValue The default value to use if the source attribute is not specified in a
     *         document. Optional.
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * The default value to use if the source attribute is not specified in a
     * document. Optional.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param defaultValue The default value to use if the source attribute is not specified in a
     *         document. Optional.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SourceDataTrimTitle withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * The separator that follows the text to trim.
     *
     * @return The separator that follows the text to trim.
     */
    public String getSeparator() {
        return separator;
    }
    
    /**
     * The separator that follows the text to trim.
     *
     * @param separator The separator that follows the text to trim.
     */
    public void setSeparator(String separator) {
        this.separator = separator;
    }
    
    /**
     * The separator that follows the text to trim.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param separator The separator that follows the text to trim.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SourceDataTrimTitle withSeparator(String separator) {
        this.separator = separator;
        return this;
    }

    /**
     * An <a href="http://tools.ietf.org/html/rfc4646">IETF RFC 4646</a>
     * language code. Only the primary language is considered. English (en)
     * is currently the only supported language.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z]{2,8}(?:-[a-zA-Z]{2,8})*<br/>
     *
     * @return An <a href="http://tools.ietf.org/html/rfc4646">IETF RFC 4646</a>
     *         language code. Only the primary language is considered. English (en)
     *         is currently the only supported language.
     */
    public String getLanguage() {
        return language;
    }
    
    /**
     * An <a href="http://tools.ietf.org/html/rfc4646">IETF RFC 4646</a>
     * language code. Only the primary language is considered. English (en)
     * is currently the only supported language.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z]{2,8}(?:-[a-zA-Z]{2,8})*<br/>
     *
     * @param language An <a href="http://tools.ietf.org/html/rfc4646">IETF RFC 4646</a>
     *         language code. Only the primary language is considered. English (en)
     *         is currently the only supported language.
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    
    /**
     * An <a href="http://tools.ietf.org/html/rfc4646">IETF RFC 4646</a>
     * language code. Only the primary language is considered. English (en)
     * is currently the only supported language.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z]{2,8}(?:-[a-zA-Z]{2,8})*<br/>
     *
     * @param language An <a href="http://tools.ietf.org/html/rfc4646">IETF RFC 4646</a>
     *         language code. Only the primary language is considered. English (en)
     *         is currently the only supported language.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SourceDataTrimTitle withLanguage(String language) {
        this.language = language;
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
        if (getSourceName() != null) sb.append("SourceName: " + getSourceName() + ",");
        if (getDefaultValue() != null) sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (getSeparator() != null) sb.append("Separator: " + getSeparator() + ",");
        if (getLanguage() != null) sb.append("Language: " + getLanguage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode()); 
        hashCode = prime * hashCode + ((getSeparator() == null) ? 0 : getSeparator().hashCode()); 
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SourceDataTrimTitle == false) return false;
        SourceDataTrimTitle other = (SourceDataTrimTitle)obj;
        
        if (other.getSourceName() == null ^ this.getSourceName() == null) return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false) return false; 
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null) return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false) return false; 
        if (other.getSeparator() == null ^ this.getSeparator() == null) return false;
        if (other.getSeparator() != null && other.getSeparator().equals(this.getSeparator()) == false) return false; 
        if (other.getLanguage() == null ^ this.getLanguage() == null) return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false) return false; 
        return true;
    }
    
}
    