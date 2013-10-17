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
 * Options that define a text field in the search index.
 * </p>
 */
public class TextOptions implements Serializable {

    /**
     * The default value for a text field. Optional.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String defaultValue;

    /**
     * Specifies whether facets are enabled for this field. Default: False.
     */
    private Boolean facetEnabled;

    /**
     * Specifies whether values of this field can be returned in search
     * results and used for ranking. Default: False.
     */
    private Boolean resultEnabled;

    /**
     * The text processor to apply to this field. Optional. Possible values:
     * <ul> <li><code>cs_text_no_stemming</code>: turns off stemming for the
     * field.</li> </ul> <p>Default: none
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     */
    private String textProcessor;

    /**
     * The default value for a text field. Optional.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The default value for a text field. Optional.
     */
    public String getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * The default value for a text field. Optional.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param defaultValue The default value for a text field. Optional.
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * The default value for a text field. Optional.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param defaultValue The default value for a text field. Optional.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TextOptions withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Specifies whether facets are enabled for this field. Default: False.
     *
     * @return Specifies whether facets are enabled for this field. Default: False.
     */
    public Boolean isFacetEnabled() {
        return facetEnabled;
    }
    
    /**
     * Specifies whether facets are enabled for this field. Default: False.
     *
     * @param facetEnabled Specifies whether facets are enabled for this field. Default: False.
     */
    public void setFacetEnabled(Boolean facetEnabled) {
        this.facetEnabled = facetEnabled;
    }
    
    /**
     * Specifies whether facets are enabled for this field. Default: False.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param facetEnabled Specifies whether facets are enabled for this field. Default: False.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TextOptions withFacetEnabled(Boolean facetEnabled) {
        this.facetEnabled = facetEnabled;
        return this;
    }

    /**
     * Specifies whether facets are enabled for this field. Default: False.
     *
     * @return Specifies whether facets are enabled for this field. Default: False.
     */
    public Boolean getFacetEnabled() {
        return facetEnabled;
    }

    /**
     * Specifies whether values of this field can be returned in search
     * results and used for ranking. Default: False.
     *
     * @return Specifies whether values of this field can be returned in search
     *         results and used for ranking. Default: False.
     */
    public Boolean isResultEnabled() {
        return resultEnabled;
    }
    
    /**
     * Specifies whether values of this field can be returned in search
     * results and used for ranking. Default: False.
     *
     * @param resultEnabled Specifies whether values of this field can be returned in search
     *         results and used for ranking. Default: False.
     */
    public void setResultEnabled(Boolean resultEnabled) {
        this.resultEnabled = resultEnabled;
    }
    
    /**
     * Specifies whether values of this field can be returned in search
     * results and used for ranking. Default: False.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resultEnabled Specifies whether values of this field can be returned in search
     *         results and used for ranking. Default: False.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TextOptions withResultEnabled(Boolean resultEnabled) {
        this.resultEnabled = resultEnabled;
        return this;
    }

    /**
     * Specifies whether values of this field can be returned in search
     * results and used for ranking. Default: False.
     *
     * @return Specifies whether values of this field can be returned in search
     *         results and used for ranking. Default: False.
     */
    public Boolean getResultEnabled() {
        return resultEnabled;
    }

    /**
     * The text processor to apply to this field. Optional. Possible values:
     * <ul> <li><code>cs_text_no_stemming</code>: turns off stemming for the
     * field.</li> </ul> <p>Default: none
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @return The text processor to apply to this field. Optional. Possible values:
     *         <ul> <li><code>cs_text_no_stemming</code>: turns off stemming for the
     *         field.</li> </ul> <p>Default: none
     */
    public String getTextProcessor() {
        return textProcessor;
    }
    
    /**
     * The text processor to apply to this field. Optional. Possible values:
     * <ul> <li><code>cs_text_no_stemming</code>: turns off stemming for the
     * field.</li> </ul> <p>Default: none
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param textProcessor The text processor to apply to this field. Optional. Possible values:
     *         <ul> <li><code>cs_text_no_stemming</code>: turns off stemming for the
     *         field.</li> </ul> <p>Default: none
     */
    public void setTextProcessor(String textProcessor) {
        this.textProcessor = textProcessor;
    }
    
    /**
     * The text processor to apply to this field. Optional. Possible values:
     * <ul> <li><code>cs_text_no_stemming</code>: turns off stemming for the
     * field.</li> </ul> <p>Default: none
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param textProcessor The text processor to apply to this field. Optional. Possible values:
     *         <ul> <li><code>cs_text_no_stemming</code>: turns off stemming for the
     *         field.</li> </ul> <p>Default: none
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TextOptions withTextProcessor(String textProcessor) {
        this.textProcessor = textProcessor;
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
        if (isFacetEnabled() != null) sb.append("FacetEnabled: " + isFacetEnabled() + ",");
        if (isResultEnabled() != null) sb.append("ResultEnabled: " + isResultEnabled() + ",");
        if (getTextProcessor() != null) sb.append("TextProcessor: " + getTextProcessor() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode()); 
        hashCode = prime * hashCode + ((isFacetEnabled() == null) ? 0 : isFacetEnabled().hashCode()); 
        hashCode = prime * hashCode + ((isResultEnabled() == null) ? 0 : isResultEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getTextProcessor() == null) ? 0 : getTextProcessor().hashCode()); 
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
        if (other.isFacetEnabled() == null ^ this.isFacetEnabled() == null) return false;
        if (other.isFacetEnabled() != null && other.isFacetEnabled().equals(this.isFacetEnabled()) == false) return false; 
        if (other.isResultEnabled() == null ^ this.isResultEnabled() == null) return false;
        if (other.isResultEnabled() != null && other.isResultEnabled().equals(this.isResultEnabled()) == false) return false; 
        if (other.getTextProcessor() == null ^ this.getTextProcessor() == null) return false;
        if (other.getTextProcessor() != null && other.getTextProcessor().equals(this.getTextProcessor()) == false) return false; 
        return true;
    }
    
}
    