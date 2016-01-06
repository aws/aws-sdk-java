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
 * Options for a search suggester.
 * </p>
 */
public class DocumentSuggesterOptions implements Serializable, Cloneable {

    /**
     * The name of the index field you want to use for suggestions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     */
    private String sourceField;

    /**
     * The level of fuzziness allowed when suggesting matches for a string:
     * <code>none</code>, <code>low</code>, or <code>high</code>. With none,
     * the specified string is treated as an exact prefix. With low,
     * suggestions must differ from the specified string by no more than one
     * character. With high, suggestions can differ by up to two characters.
     * The default is none.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, low, high
     */
    private String fuzzyMatching;

    /**
     * An expression that computes a score for each suggestion to control how
     * they are sorted. The scores are rounded to the nearest integer, with a
     * floor of 0 and a ceiling of 2^31-1. A document's relevance score is
     * not computed for suggestions, so sort expressions cannot reference the
     * <code>_score</code> value. To sort suggestions using a numeric field
     * or existing expression, simply specify the name of the field or
     * expression. If no expression is configured for the suggester, the
     * suggestions are sorted with the closest matches listed first.
     */
    private String sortExpression;

    /**
     * The name of the index field you want to use for suggestions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @return The name of the index field you want to use for suggestions.
     */
    public String getSourceField() {
        return sourceField;
    }
    
    /**
     * The name of the index field you want to use for suggestions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param sourceField The name of the index field you want to use for suggestions.
     */
    public void setSourceField(String sourceField) {
        this.sourceField = sourceField;
    }
    
    /**
     * The name of the index field you want to use for suggestions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param sourceField The name of the index field you want to use for suggestions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DocumentSuggesterOptions withSourceField(String sourceField) {
        this.sourceField = sourceField;
        return this;
    }

    /**
     * The level of fuzziness allowed when suggesting matches for a string:
     * <code>none</code>, <code>low</code>, or <code>high</code>. With none,
     * the specified string is treated as an exact prefix. With low,
     * suggestions must differ from the specified string by no more than one
     * character. With high, suggestions can differ by up to two characters.
     * The default is none.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, low, high
     *
     * @return The level of fuzziness allowed when suggesting matches for a string:
     *         <code>none</code>, <code>low</code>, or <code>high</code>. With none,
     *         the specified string is treated as an exact prefix. With low,
     *         suggestions must differ from the specified string by no more than one
     *         character. With high, suggestions can differ by up to two characters.
     *         The default is none.
     *
     * @see SuggesterFuzzyMatching
     */
    public String getFuzzyMatching() {
        return fuzzyMatching;
    }
    
    /**
     * The level of fuzziness allowed when suggesting matches for a string:
     * <code>none</code>, <code>low</code>, or <code>high</code>. With none,
     * the specified string is treated as an exact prefix. With low,
     * suggestions must differ from the specified string by no more than one
     * character. With high, suggestions can differ by up to two characters.
     * The default is none.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, low, high
     *
     * @param fuzzyMatching The level of fuzziness allowed when suggesting matches for a string:
     *         <code>none</code>, <code>low</code>, or <code>high</code>. With none,
     *         the specified string is treated as an exact prefix. With low,
     *         suggestions must differ from the specified string by no more than one
     *         character. With high, suggestions can differ by up to two characters.
     *         The default is none.
     *
     * @see SuggesterFuzzyMatching
     */
    public void setFuzzyMatching(String fuzzyMatching) {
        this.fuzzyMatching = fuzzyMatching;
    }
    
    /**
     * The level of fuzziness allowed when suggesting matches for a string:
     * <code>none</code>, <code>low</code>, or <code>high</code>. With none,
     * the specified string is treated as an exact prefix. With low,
     * suggestions must differ from the specified string by no more than one
     * character. With high, suggestions can differ by up to two characters.
     * The default is none.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, low, high
     *
     * @param fuzzyMatching The level of fuzziness allowed when suggesting matches for a string:
     *         <code>none</code>, <code>low</code>, or <code>high</code>. With none,
     *         the specified string is treated as an exact prefix. With low,
     *         suggestions must differ from the specified string by no more than one
     *         character. With high, suggestions can differ by up to two characters.
     *         The default is none.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SuggesterFuzzyMatching
     */
    public DocumentSuggesterOptions withFuzzyMatching(String fuzzyMatching) {
        this.fuzzyMatching = fuzzyMatching;
        return this;
    }

    /**
     * The level of fuzziness allowed when suggesting matches for a string:
     * <code>none</code>, <code>low</code>, or <code>high</code>. With none,
     * the specified string is treated as an exact prefix. With low,
     * suggestions must differ from the specified string by no more than one
     * character. With high, suggestions can differ by up to two characters.
     * The default is none.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, low, high
     *
     * @param fuzzyMatching The level of fuzziness allowed when suggesting matches for a string:
     *         <code>none</code>, <code>low</code>, or <code>high</code>. With none,
     *         the specified string is treated as an exact prefix. With low,
     *         suggestions must differ from the specified string by no more than one
     *         character. With high, suggestions can differ by up to two characters.
     *         The default is none.
     *
     * @see SuggesterFuzzyMatching
     */
    public void setFuzzyMatching(SuggesterFuzzyMatching fuzzyMatching) {
        this.fuzzyMatching = fuzzyMatching.toString();
    }
    
    /**
     * The level of fuzziness allowed when suggesting matches for a string:
     * <code>none</code>, <code>low</code>, or <code>high</code>. With none,
     * the specified string is treated as an exact prefix. With low,
     * suggestions must differ from the specified string by no more than one
     * character. With high, suggestions can differ by up to two characters.
     * The default is none.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, low, high
     *
     * @param fuzzyMatching The level of fuzziness allowed when suggesting matches for a string:
     *         <code>none</code>, <code>low</code>, or <code>high</code>. With none,
     *         the specified string is treated as an exact prefix. With low,
     *         suggestions must differ from the specified string by no more than one
     *         character. With high, suggestions can differ by up to two characters.
     *         The default is none.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SuggesterFuzzyMatching
     */
    public DocumentSuggesterOptions withFuzzyMatching(SuggesterFuzzyMatching fuzzyMatching) {
        this.fuzzyMatching = fuzzyMatching.toString();
        return this;
    }

    /**
     * An expression that computes a score for each suggestion to control how
     * they are sorted. The scores are rounded to the nearest integer, with a
     * floor of 0 and a ceiling of 2^31-1. A document's relevance score is
     * not computed for suggestions, so sort expressions cannot reference the
     * <code>_score</code> value. To sort suggestions using a numeric field
     * or existing expression, simply specify the name of the field or
     * expression. If no expression is configured for the suggester, the
     * suggestions are sorted with the closest matches listed first.
     *
     * @return An expression that computes a score for each suggestion to control how
     *         they are sorted. The scores are rounded to the nearest integer, with a
     *         floor of 0 and a ceiling of 2^31-1. A document's relevance score is
     *         not computed for suggestions, so sort expressions cannot reference the
     *         <code>_score</code> value. To sort suggestions using a numeric field
     *         or existing expression, simply specify the name of the field or
     *         expression. If no expression is configured for the suggester, the
     *         suggestions are sorted with the closest matches listed first.
     */
    public String getSortExpression() {
        return sortExpression;
    }
    
    /**
     * An expression that computes a score for each suggestion to control how
     * they are sorted. The scores are rounded to the nearest integer, with a
     * floor of 0 and a ceiling of 2^31-1. A document's relevance score is
     * not computed for suggestions, so sort expressions cannot reference the
     * <code>_score</code> value. To sort suggestions using a numeric field
     * or existing expression, simply specify the name of the field or
     * expression. If no expression is configured for the suggester, the
     * suggestions are sorted with the closest matches listed first.
     *
     * @param sortExpression An expression that computes a score for each suggestion to control how
     *         they are sorted. The scores are rounded to the nearest integer, with a
     *         floor of 0 and a ceiling of 2^31-1. A document's relevance score is
     *         not computed for suggestions, so sort expressions cannot reference the
     *         <code>_score</code> value. To sort suggestions using a numeric field
     *         or existing expression, simply specify the name of the field or
     *         expression. If no expression is configured for the suggester, the
     *         suggestions are sorted with the closest matches listed first.
     */
    public void setSortExpression(String sortExpression) {
        this.sortExpression = sortExpression;
    }
    
    /**
     * An expression that computes a score for each suggestion to control how
     * they are sorted. The scores are rounded to the nearest integer, with a
     * floor of 0 and a ceiling of 2^31-1. A document's relevance score is
     * not computed for suggestions, so sort expressions cannot reference the
     * <code>_score</code> value. To sort suggestions using a numeric field
     * or existing expression, simply specify the name of the field or
     * expression. If no expression is configured for the suggester, the
     * suggestions are sorted with the closest matches listed first.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sortExpression An expression that computes a score for each suggestion to control how
     *         they are sorted. The scores are rounded to the nearest integer, with a
     *         floor of 0 and a ceiling of 2^31-1. A document's relevance score is
     *         not computed for suggestions, so sort expressions cannot reference the
     *         <code>_score</code> value. To sort suggestions using a numeric field
     *         or existing expression, simply specify the name of the field or
     *         expression. If no expression is configured for the suggester, the
     *         suggestions are sorted with the closest matches listed first.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DocumentSuggesterOptions withSortExpression(String sortExpression) {
        this.sortExpression = sortExpression;
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
        if (getSourceField() != null) sb.append("SourceField: " + getSourceField() + ",");
        if (getFuzzyMatching() != null) sb.append("FuzzyMatching: " + getFuzzyMatching() + ",");
        if (getSortExpression() != null) sb.append("SortExpression: " + getSortExpression() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceField() == null) ? 0 : getSourceField().hashCode()); 
        hashCode = prime * hashCode + ((getFuzzyMatching() == null) ? 0 : getFuzzyMatching().hashCode()); 
        hashCode = prime * hashCode + ((getSortExpression() == null) ? 0 : getSortExpression().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DocumentSuggesterOptions == false) return false;
        DocumentSuggesterOptions other = (DocumentSuggesterOptions)obj;
        
        if (other.getSourceField() == null ^ this.getSourceField() == null) return false;
        if (other.getSourceField() != null && other.getSourceField().equals(this.getSourceField()) == false) return false; 
        if (other.getFuzzyMatching() == null ^ this.getFuzzyMatching() == null) return false;
        if (other.getFuzzyMatching() != null && other.getFuzzyMatching().equals(this.getFuzzyMatching()) == false) return false; 
        if (other.getSortExpression() == null ^ this.getSortExpression() == null) return false;
        if (other.getSortExpression() != null && other.getSortExpression().equals(this.getSortExpression()) == false) return false; 
        return true;
    }
    
    @Override
    public DocumentSuggesterOptions clone() {
        try {
            return (DocumentSuggesterOptions) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    