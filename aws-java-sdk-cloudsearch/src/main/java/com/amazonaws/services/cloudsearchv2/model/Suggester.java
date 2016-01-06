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
 * Configuration information for a search suggester. Each suggester has a
 * unique name and specifies the text field you want to use for
 * suggestions. The following options can be configured for a suggester:
 * <code>FuzzyMatching</code> ,
 * <code>SortExpression</code> .
 * </p>
 */
public class Suggester implements Serializable, Cloneable {

    /**
     * Names must begin with a letter and can contain the following
     * characters: a-z (lowercase), 0-9, and _ (underscore).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     */
    private String suggesterName;

    /**
     * Options for a search suggester.
     */
    private DocumentSuggesterOptions documentSuggesterOptions;

    /**
     * Names must begin with a letter and can contain the following
     * characters: a-z (lowercase), 0-9, and _ (underscore).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @return Names must begin with a letter and can contain the following
     *         characters: a-z (lowercase), 0-9, and _ (underscore).
     */
    public String getSuggesterName() {
        return suggesterName;
    }
    
    /**
     * Names must begin with a letter and can contain the following
     * characters: a-z (lowercase), 0-9, and _ (underscore).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param suggesterName Names must begin with a letter and can contain the following
     *         characters: a-z (lowercase), 0-9, and _ (underscore).
     */
    public void setSuggesterName(String suggesterName) {
        this.suggesterName = suggesterName;
    }
    
    /**
     * Names must begin with a letter and can contain the following
     * characters: a-z (lowercase), 0-9, and _ (underscore).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param suggesterName Names must begin with a letter and can contain the following
     *         characters: a-z (lowercase), 0-9, and _ (underscore).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Suggester withSuggesterName(String suggesterName) {
        this.suggesterName = suggesterName;
        return this;
    }

    /**
     * Options for a search suggester.
     *
     * @return Options for a search suggester.
     */
    public DocumentSuggesterOptions getDocumentSuggesterOptions() {
        return documentSuggesterOptions;
    }
    
    /**
     * Options for a search suggester.
     *
     * @param documentSuggesterOptions Options for a search suggester.
     */
    public void setDocumentSuggesterOptions(DocumentSuggesterOptions documentSuggesterOptions) {
        this.documentSuggesterOptions = documentSuggesterOptions;
    }
    
    /**
     * Options for a search suggester.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param documentSuggesterOptions Options for a search suggester.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Suggester withDocumentSuggesterOptions(DocumentSuggesterOptions documentSuggesterOptions) {
        this.documentSuggesterOptions = documentSuggesterOptions;
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
        if (getSuggesterName() != null) sb.append("SuggesterName: " + getSuggesterName() + ",");
        if (getDocumentSuggesterOptions() != null) sb.append("DocumentSuggesterOptions: " + getDocumentSuggesterOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSuggesterName() == null) ? 0 : getSuggesterName().hashCode()); 
        hashCode = prime * hashCode + ((getDocumentSuggesterOptions() == null) ? 0 : getDocumentSuggesterOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Suggester == false) return false;
        Suggester other = (Suggester)obj;
        
        if (other.getSuggesterName() == null ^ this.getSuggesterName() == null) return false;
        if (other.getSuggesterName() != null && other.getSuggesterName().equals(this.getSuggesterName()) == false) return false; 
        if (other.getDocumentSuggesterOptions() == null ^ this.getDocumentSuggesterOptions() == null) return false;
        if (other.getDocumentSuggesterOptions() != null && other.getDocumentSuggesterOptions().equals(this.getDocumentSuggesterOptions()) == false) return false; 
        return true;
    }
    
    @Override
    public Suggester clone() {
        try {
            return (Suggester) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    