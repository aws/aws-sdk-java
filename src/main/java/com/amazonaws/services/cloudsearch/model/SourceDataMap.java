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
 * Specifies how to map source attribute values to custom values when populating an <code>IndexField</code> .
 * </p>
 */
public class SourceDataMap implements Serializable {

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
     * A map that translates source field values to custom values.
     */
    private java.util.Map<String,String> cases;

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
    public SourceDataMap withSourceName(String sourceName) {
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
    public SourceDataMap withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * A map that translates source field values to custom values.
     *
     * @return A map that translates source field values to custom values.
     */
    public java.util.Map<String,String> getCases() {
        
        if (cases == null) {
            cases = new java.util.HashMap<String,String>();
        }
        return cases;
    }
    
    /**
     * A map that translates source field values to custom values.
     *
     * @param cases A map that translates source field values to custom values.
     */
    public void setCases(java.util.Map<String,String> cases) {
        this.cases = cases;
    }
    
    /**
     * A map that translates source field values to custom values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cases A map that translates source field values to custom values.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SourceDataMap withCases(java.util.Map<String,String> cases) {
        setCases(cases);
        return this;
    }

    /**
     * A map that translates source field values to custom values.
     * <p>
     * The method adds a new key-value pair into Cases parameter, and returns
     * a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Cases.
     * @param value The corresponding value of the entry to be added into Cases.
     */
	public SourceDataMap addCasesEntry(String key, String value) {
		if (null == this.cases) {
			this.cases = new java.util.HashMap<String,String>();
		}
		if (this.cases.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.cases.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Cases.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public SourceDataMap clearCasesEntries() {
		this.cases = null;
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
        if (getCases() != null) sb.append("Cases: " + getCases() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode()); 
        hashCode = prime * hashCode + ((getCases() == null) ? 0 : getCases().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SourceDataMap == false) return false;
        SourceDataMap other = (SourceDataMap)obj;
        
        if (other.getSourceName() == null ^ this.getSourceName() == null) return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false) return false; 
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null) return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false) return false; 
        if (other.getCases() == null ^ this.getCases() == null) return false;
        if (other.getCases() != null && other.getCases().equals(this.getCases()) == false) return false; 
        return true;
    }
    
}
    