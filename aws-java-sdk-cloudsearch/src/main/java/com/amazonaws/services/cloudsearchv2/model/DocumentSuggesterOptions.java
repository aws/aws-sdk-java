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
 * Options for a search suggester.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentSuggesterOptions implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the index field you want to use for suggestions.
     * </p>
     */
    private String sourceField;
    /**
     * <p>
     * The level of fuzziness allowed when suggesting matches for a string: <code>none</code>, <code>low</code>, or
     * <code>high</code>. With none, the specified string is treated as an exact prefix. With low, suggestions must
     * differ from the specified string by no more than one character. With high, suggestions can differ by up to two
     * characters. The default is none.
     * </p>
     */
    private String fuzzyMatching;
    /**
     * <p>
     * An expression that computes a score for each suggestion to control how they are sorted. The scores are rounded to
     * the nearest integer, with a floor of 0 and a ceiling of 2^31-1. A document's relevance score is not computed for
     * suggestions, so sort expressions cannot reference the <code>_score</code> value. To sort suggestions using a
     * numeric field or existing expression, simply specify the name of the field or expression. If no expression is
     * configured for the suggester, the suggestions are sorted with the closest matches listed first.
     * </p>
     */
    private String sortExpression;

    /**
     * <p>
     * The name of the index field you want to use for suggestions.
     * </p>
     * 
     * @param sourceField
     *        The name of the index field you want to use for suggestions.
     */

    public void setSourceField(String sourceField) {
        this.sourceField = sourceField;
    }

    /**
     * <p>
     * The name of the index field you want to use for suggestions.
     * </p>
     * 
     * @return The name of the index field you want to use for suggestions.
     */

    public String getSourceField() {
        return this.sourceField;
    }

    /**
     * <p>
     * The name of the index field you want to use for suggestions.
     * </p>
     * 
     * @param sourceField
     *        The name of the index field you want to use for suggestions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentSuggesterOptions withSourceField(String sourceField) {
        setSourceField(sourceField);
        return this;
    }

    /**
     * <p>
     * The level of fuzziness allowed when suggesting matches for a string: <code>none</code>, <code>low</code>, or
     * <code>high</code>. With none, the specified string is treated as an exact prefix. With low, suggestions must
     * differ from the specified string by no more than one character. With high, suggestions can differ by up to two
     * characters. The default is none.
     * </p>
     * 
     * @param fuzzyMatching
     *        The level of fuzziness allowed when suggesting matches for a string: <code>none</code>, <code>low</code>,
     *        or <code>high</code>. With none, the specified string is treated as an exact prefix. With low, suggestions
     *        must differ from the specified string by no more than one character. With high, suggestions can differ by
     *        up to two characters. The default is none.
     * @see SuggesterFuzzyMatching
     */

    public void setFuzzyMatching(String fuzzyMatching) {
        this.fuzzyMatching = fuzzyMatching;
    }

    /**
     * <p>
     * The level of fuzziness allowed when suggesting matches for a string: <code>none</code>, <code>low</code>, or
     * <code>high</code>. With none, the specified string is treated as an exact prefix. With low, suggestions must
     * differ from the specified string by no more than one character. With high, suggestions can differ by up to two
     * characters. The default is none.
     * </p>
     * 
     * @return The level of fuzziness allowed when suggesting matches for a string: <code>none</code>, <code>low</code>,
     *         or <code>high</code>. With none, the specified string is treated as an exact prefix. With low,
     *         suggestions must differ from the specified string by no more than one character. With high, suggestions
     *         can differ by up to two characters. The default is none.
     * @see SuggesterFuzzyMatching
     */

    public String getFuzzyMatching() {
        return this.fuzzyMatching;
    }

    /**
     * <p>
     * The level of fuzziness allowed when suggesting matches for a string: <code>none</code>, <code>low</code>, or
     * <code>high</code>. With none, the specified string is treated as an exact prefix. With low, suggestions must
     * differ from the specified string by no more than one character. With high, suggestions can differ by up to two
     * characters. The default is none.
     * </p>
     * 
     * @param fuzzyMatching
     *        The level of fuzziness allowed when suggesting matches for a string: <code>none</code>, <code>low</code>,
     *        or <code>high</code>. With none, the specified string is treated as an exact prefix. With low, suggestions
     *        must differ from the specified string by no more than one character. With high, suggestions can differ by
     *        up to two characters. The default is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuggesterFuzzyMatching
     */

    public DocumentSuggesterOptions withFuzzyMatching(String fuzzyMatching) {
        setFuzzyMatching(fuzzyMatching);
        return this;
    }

    /**
     * <p>
     * The level of fuzziness allowed when suggesting matches for a string: <code>none</code>, <code>low</code>, or
     * <code>high</code>. With none, the specified string is treated as an exact prefix. With low, suggestions must
     * differ from the specified string by no more than one character. With high, suggestions can differ by up to two
     * characters. The default is none.
     * </p>
     * 
     * @param fuzzyMatching
     *        The level of fuzziness allowed when suggesting matches for a string: <code>none</code>, <code>low</code>,
     *        or <code>high</code>. With none, the specified string is treated as an exact prefix. With low, suggestions
     *        must differ from the specified string by no more than one character. With high, suggestions can differ by
     *        up to two characters. The default is none.
     * @see SuggesterFuzzyMatching
     */

    public void setFuzzyMatching(SuggesterFuzzyMatching fuzzyMatching) {
        withFuzzyMatching(fuzzyMatching);
    }

    /**
     * <p>
     * The level of fuzziness allowed when suggesting matches for a string: <code>none</code>, <code>low</code>, or
     * <code>high</code>. With none, the specified string is treated as an exact prefix. With low, suggestions must
     * differ from the specified string by no more than one character. With high, suggestions can differ by up to two
     * characters. The default is none.
     * </p>
     * 
     * @param fuzzyMatching
     *        The level of fuzziness allowed when suggesting matches for a string: <code>none</code>, <code>low</code>,
     *        or <code>high</code>. With none, the specified string is treated as an exact prefix. With low, suggestions
     *        must differ from the specified string by no more than one character. With high, suggestions can differ by
     *        up to two characters. The default is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuggesterFuzzyMatching
     */

    public DocumentSuggesterOptions withFuzzyMatching(SuggesterFuzzyMatching fuzzyMatching) {
        this.fuzzyMatching = fuzzyMatching.toString();
        return this;
    }

    /**
     * <p>
     * An expression that computes a score for each suggestion to control how they are sorted. The scores are rounded to
     * the nearest integer, with a floor of 0 and a ceiling of 2^31-1. A document's relevance score is not computed for
     * suggestions, so sort expressions cannot reference the <code>_score</code> value. To sort suggestions using a
     * numeric field or existing expression, simply specify the name of the field or expression. If no expression is
     * configured for the suggester, the suggestions are sorted with the closest matches listed first.
     * </p>
     * 
     * @param sortExpression
     *        An expression that computes a score for each suggestion to control how they are sorted. The scores are
     *        rounded to the nearest integer, with a floor of 0 and a ceiling of 2^31-1. A document's relevance score is
     *        not computed for suggestions, so sort expressions cannot reference the <code>_score</code> value. To sort
     *        suggestions using a numeric field or existing expression, simply specify the name of the field or
     *        expression. If no expression is configured for the suggester, the suggestions are sorted with the closest
     *        matches listed first.
     */

    public void setSortExpression(String sortExpression) {
        this.sortExpression = sortExpression;
    }

    /**
     * <p>
     * An expression that computes a score for each suggestion to control how they are sorted. The scores are rounded to
     * the nearest integer, with a floor of 0 and a ceiling of 2^31-1. A document's relevance score is not computed for
     * suggestions, so sort expressions cannot reference the <code>_score</code> value. To sort suggestions using a
     * numeric field or existing expression, simply specify the name of the field or expression. If no expression is
     * configured for the suggester, the suggestions are sorted with the closest matches listed first.
     * </p>
     * 
     * @return An expression that computes a score for each suggestion to control how they are sorted. The scores are
     *         rounded to the nearest integer, with a floor of 0 and a ceiling of 2^31-1. A document's relevance score
     *         is not computed for suggestions, so sort expressions cannot reference the <code>_score</code> value. To
     *         sort suggestions using a numeric field or existing expression, simply specify the name of the field or
     *         expression. If no expression is configured for the suggester, the suggestions are sorted with the closest
     *         matches listed first.
     */

    public String getSortExpression() {
        return this.sortExpression;
    }

    /**
     * <p>
     * An expression that computes a score for each suggestion to control how they are sorted. The scores are rounded to
     * the nearest integer, with a floor of 0 and a ceiling of 2^31-1. A document's relevance score is not computed for
     * suggestions, so sort expressions cannot reference the <code>_score</code> value. To sort suggestions using a
     * numeric field or existing expression, simply specify the name of the field or expression. If no expression is
     * configured for the suggester, the suggestions are sorted with the closest matches listed first.
     * </p>
     * 
     * @param sortExpression
     *        An expression that computes a score for each suggestion to control how they are sorted. The scores are
     *        rounded to the nearest integer, with a floor of 0 and a ceiling of 2^31-1. A document's relevance score is
     *        not computed for suggestions, so sort expressions cannot reference the <code>_score</code> value. To sort
     *        suggestions using a numeric field or existing expression, simply specify the name of the field or
     *        expression. If no expression is configured for the suggester, the suggestions are sorted with the closest
     *        matches listed first.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentSuggesterOptions withSortExpression(String sortExpression) {
        setSortExpression(sortExpression);
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
        if (getSourceField() != null)
            sb.append("SourceField: ").append(getSourceField()).append(",");
        if (getFuzzyMatching() != null)
            sb.append("FuzzyMatching: ").append(getFuzzyMatching()).append(",");
        if (getSortExpression() != null)
            sb.append("SortExpression: ").append(getSortExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentSuggesterOptions == false)
            return false;
        DocumentSuggesterOptions other = (DocumentSuggesterOptions) obj;
        if (other.getSourceField() == null ^ this.getSourceField() == null)
            return false;
        if (other.getSourceField() != null && other.getSourceField().equals(this.getSourceField()) == false)
            return false;
        if (other.getFuzzyMatching() == null ^ this.getFuzzyMatching() == null)
            return false;
        if (other.getFuzzyMatching() != null && other.getFuzzyMatching().equals(this.getFuzzyMatching()) == false)
            return false;
        if (other.getSortExpression() == null ^ this.getSortExpression() == null)
            return false;
        if (other.getSortExpression() != null && other.getSortExpression().equals(this.getSortExpression()) == false)
            return false;
        return true;
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
    public DocumentSuggesterOptions clone() {
        try {
            return (DocumentSuggesterOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
