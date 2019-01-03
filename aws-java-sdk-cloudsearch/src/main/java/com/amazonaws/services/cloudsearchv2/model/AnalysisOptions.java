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
 * Synonyms, stopwords, and stemming options for an analysis scheme. Includes tokenization dictionary for Japanese.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisOptions implements Serializable, Cloneable {

    /**
     * <p>
     * A JSON object that defines synonym groups and aliases. A synonym group is an array of arrays, where each
     * sub-array is a group of terms where each term in the group is considered a synonym of every other term in the
     * group. The aliases value is an object that contains a collection of string:value pairs where the string specifies
     * a term and the array of values specifies each of the aliases for that term. An alias is considered a synonym of
     * the specified term, but the term is not considered a synonym of the alias. For more information about specifying
     * synonyms, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms"
     * >Synonyms</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     */
    private String synonyms;
    /**
     * <p>
     * A JSON array of terms to ignore during indexing and searching. For example, <code>["a", "an", "the", "of"]</code>
     * . The stopwords dictionary must explicitly list each word you want to ignore. Wildcards and regular expressions
     * are not supported.
     * </p>
     */
    private String stopwords;
    /**
     * <p>
     * A JSON object that contains a collection of string:value pairs that each map a term to its stem. For example,
     * <code>{"term1": "stem1", "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is applied in
     * addition to any algorithmic stemming. This enables you to override the results of the algorithmic stemming to
     * correct specific cases of overstemming or understemming. The maximum size of a stemming dictionary is 500 KB.
     * </p>
     */
    private String stemmingDictionary;
    /**
     * <p>
     * A JSON array that contains a collection of terms, tokens, readings and part of speech for Japanese Tokenizaiton.
     * The Japanese tokenization dictionary enables you to override the default tokenization for selected terms. This is
     * only valid for Japanese language fields.
     * </p>
     */
    private String japaneseTokenizationDictionary;
    /**
     * <p>
     * The level of algorithmic stemming to perform: <code>none</code>, <code>minimal</code>, <code>light</code>, or
     * <code>full</code>. The available levels vary depending on the language. For more information, see <a href=
     * "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     * target="_blank">Language Specific Text Processing Settings</a> in the <i>Amazon CloudSearch Developer Guide</i>
     * </p>
     */
    private String algorithmicStemming;

    /**
     * <p>
     * A JSON object that defines synonym groups and aliases. A synonym group is an array of arrays, where each
     * sub-array is a group of terms where each term in the group is considered a synonym of every other term in the
     * group. The aliases value is an object that contains a collection of string:value pairs where the string specifies
     * a term and the array of values specifies each of the aliases for that term. An alias is considered a synonym of
     * the specified term, but the term is not considered a synonym of the alias. For more information about specifying
     * synonyms, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms"
     * >Synonyms</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param synonyms
     *        A JSON object that defines synonym groups and aliases. A synonym group is an array of arrays, where each
     *        sub-array is a group of terms where each term in the group is considered a synonym of every other term in
     *        the group. The aliases value is an object that contains a collection of string:value pairs where the
     *        string specifies a term and the array of values specifies each of the aliases for that term. An alias is
     *        considered a synonym of the specified term, but the term is not considered a synonym of the alias. For
     *        more information about specifying synonyms, see <a href=
     *        "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms"
     *        >Synonyms</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */

    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    /**
     * <p>
     * A JSON object that defines synonym groups and aliases. A synonym group is an array of arrays, where each
     * sub-array is a group of terms where each term in the group is considered a synonym of every other term in the
     * group. The aliases value is an object that contains a collection of string:value pairs where the string specifies
     * a term and the array of values specifies each of the aliases for that term. An alias is considered a synonym of
     * the specified term, but the term is not considered a synonym of the alias. For more information about specifying
     * synonyms, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms"
     * >Synonyms</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @return A JSON object that defines synonym groups and aliases. A synonym group is an array of arrays, where each
     *         sub-array is a group of terms where each term in the group is considered a synonym of every other term in
     *         the group. The aliases value is an object that contains a collection of string:value pairs where the
     *         string specifies a term and the array of values specifies each of the aliases for that term. An alias is
     *         considered a synonym of the specified term, but the term is not considered a synonym of the alias. For
     *         more information about specifying synonyms, see <a href=
     *         "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms"
     *         >Synonyms</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */

    public String getSynonyms() {
        return this.synonyms;
    }

    /**
     * <p>
     * A JSON object that defines synonym groups and aliases. A synonym group is an array of arrays, where each
     * sub-array is a group of terms where each term in the group is considered a synonym of every other term in the
     * group. The aliases value is an object that contains a collection of string:value pairs where the string specifies
     * a term and the array of values specifies each of the aliases for that term. An alias is considered a synonym of
     * the specified term, but the term is not considered a synonym of the alias. For more information about specifying
     * synonyms, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms"
     * >Synonyms</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param synonyms
     *        A JSON object that defines synonym groups and aliases. A synonym group is an array of arrays, where each
     *        sub-array is a group of terms where each term in the group is considered a synonym of every other term in
     *        the group. The aliases value is an object that contains a collection of string:value pairs where the
     *        string specifies a term and the array of values specifies each of the aliases for that term. An alias is
     *        considered a synonym of the specified term, but the term is not considered a synonym of the alias. For
     *        more information about specifying synonyms, see <a href=
     *        "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms"
     *        >Synonyms</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisOptions withSynonyms(String synonyms) {
        setSynonyms(synonyms);
        return this;
    }

    /**
     * <p>
     * A JSON array of terms to ignore during indexing and searching. For example, <code>["a", "an", "the", "of"]</code>
     * . The stopwords dictionary must explicitly list each word you want to ignore. Wildcards and regular expressions
     * are not supported.
     * </p>
     * 
     * @param stopwords
     *        A JSON array of terms to ignore during indexing and searching. For example,
     *        <code>["a", "an", "the", "of"]</code>. The stopwords dictionary must explicitly list each word you want to
     *        ignore. Wildcards and regular expressions are not supported.
     */

    public void setStopwords(String stopwords) {
        this.stopwords = stopwords;
    }

    /**
     * <p>
     * A JSON array of terms to ignore during indexing and searching. For example, <code>["a", "an", "the", "of"]</code>
     * . The stopwords dictionary must explicitly list each word you want to ignore. Wildcards and regular expressions
     * are not supported.
     * </p>
     * 
     * @return A JSON array of terms to ignore during indexing and searching. For example,
     *         <code>["a", "an", "the", "of"]</code>. The stopwords dictionary must explicitly list each word you want
     *         to ignore. Wildcards and regular expressions are not supported.
     */

    public String getStopwords() {
        return this.stopwords;
    }

    /**
     * <p>
     * A JSON array of terms to ignore during indexing and searching. For example, <code>["a", "an", "the", "of"]</code>
     * . The stopwords dictionary must explicitly list each word you want to ignore. Wildcards and regular expressions
     * are not supported.
     * </p>
     * 
     * @param stopwords
     *        A JSON array of terms to ignore during indexing and searching. For example,
     *        <code>["a", "an", "the", "of"]</code>. The stopwords dictionary must explicitly list each word you want to
     *        ignore. Wildcards and regular expressions are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisOptions withStopwords(String stopwords) {
        setStopwords(stopwords);
        return this;
    }

    /**
     * <p>
     * A JSON object that contains a collection of string:value pairs that each map a term to its stem. For example,
     * <code>{"term1": "stem1", "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is applied in
     * addition to any algorithmic stemming. This enables you to override the results of the algorithmic stemming to
     * correct specific cases of overstemming or understemming. The maximum size of a stemming dictionary is 500 KB.
     * </p>
     * 
     * @param stemmingDictionary
     *        A JSON object that contains a collection of string:value pairs that each map a term to its stem. For
     *        example, <code>{"term1": "stem1", "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is
     *        applied in addition to any algorithmic stemming. This enables you to override the results of the
     *        algorithmic stemming to correct specific cases of overstemming or understemming. The maximum size of a
     *        stemming dictionary is 500 KB.
     */

    public void setStemmingDictionary(String stemmingDictionary) {
        this.stemmingDictionary = stemmingDictionary;
    }

    /**
     * <p>
     * A JSON object that contains a collection of string:value pairs that each map a term to its stem. For example,
     * <code>{"term1": "stem1", "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is applied in
     * addition to any algorithmic stemming. This enables you to override the results of the algorithmic stemming to
     * correct specific cases of overstemming or understemming. The maximum size of a stemming dictionary is 500 KB.
     * </p>
     * 
     * @return A JSON object that contains a collection of string:value pairs that each map a term to its stem. For
     *         example, <code>{"term1": "stem1", "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is
     *         applied in addition to any algorithmic stemming. This enables you to override the results of the
     *         algorithmic stemming to correct specific cases of overstemming or understemming. The maximum size of a
     *         stemming dictionary is 500 KB.
     */

    public String getStemmingDictionary() {
        return this.stemmingDictionary;
    }

    /**
     * <p>
     * A JSON object that contains a collection of string:value pairs that each map a term to its stem. For example,
     * <code>{"term1": "stem1", "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is applied in
     * addition to any algorithmic stemming. This enables you to override the results of the algorithmic stemming to
     * correct specific cases of overstemming or understemming. The maximum size of a stemming dictionary is 500 KB.
     * </p>
     * 
     * @param stemmingDictionary
     *        A JSON object that contains a collection of string:value pairs that each map a term to its stem. For
     *        example, <code>{"term1": "stem1", "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is
     *        applied in addition to any algorithmic stemming. This enables you to override the results of the
     *        algorithmic stemming to correct specific cases of overstemming or understemming. The maximum size of a
     *        stemming dictionary is 500 KB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisOptions withStemmingDictionary(String stemmingDictionary) {
        setStemmingDictionary(stemmingDictionary);
        return this;
    }

    /**
     * <p>
     * A JSON array that contains a collection of terms, tokens, readings and part of speech for Japanese Tokenizaiton.
     * The Japanese tokenization dictionary enables you to override the default tokenization for selected terms. This is
     * only valid for Japanese language fields.
     * </p>
     * 
     * @param japaneseTokenizationDictionary
     *        A JSON array that contains a collection of terms, tokens, readings and part of speech for Japanese
     *        Tokenizaiton. The Japanese tokenization dictionary enables you to override the default tokenization for
     *        selected terms. This is only valid for Japanese language fields.
     */

    public void setJapaneseTokenizationDictionary(String japaneseTokenizationDictionary) {
        this.japaneseTokenizationDictionary = japaneseTokenizationDictionary;
    }

    /**
     * <p>
     * A JSON array that contains a collection of terms, tokens, readings and part of speech for Japanese Tokenizaiton.
     * The Japanese tokenization dictionary enables you to override the default tokenization for selected terms. This is
     * only valid for Japanese language fields.
     * </p>
     * 
     * @return A JSON array that contains a collection of terms, tokens, readings and part of speech for Japanese
     *         Tokenizaiton. The Japanese tokenization dictionary enables you to override the default tokenization for
     *         selected terms. This is only valid for Japanese language fields.
     */

    public String getJapaneseTokenizationDictionary() {
        return this.japaneseTokenizationDictionary;
    }

    /**
     * <p>
     * A JSON array that contains a collection of terms, tokens, readings and part of speech for Japanese Tokenizaiton.
     * The Japanese tokenization dictionary enables you to override the default tokenization for selected terms. This is
     * only valid for Japanese language fields.
     * </p>
     * 
     * @param japaneseTokenizationDictionary
     *        A JSON array that contains a collection of terms, tokens, readings and part of speech for Japanese
     *        Tokenizaiton. The Japanese tokenization dictionary enables you to override the default tokenization for
     *        selected terms. This is only valid for Japanese language fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisOptions withJapaneseTokenizationDictionary(String japaneseTokenizationDictionary) {
        setJapaneseTokenizationDictionary(japaneseTokenizationDictionary);
        return this;
    }

    /**
     * <p>
     * The level of algorithmic stemming to perform: <code>none</code>, <code>minimal</code>, <code>light</code>, or
     * <code>full</code>. The available levels vary depending on the language. For more information, see <a href=
     * "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     * target="_blank">Language Specific Text Processing Settings</a> in the <i>Amazon CloudSearch Developer Guide</i>
     * </p>
     * 
     * @param algorithmicStemming
     *        The level of algorithmic stemming to perform: <code>none</code>, <code>minimal</code>, <code>light</code>,
     *        or <code>full</code>. The available levels vary depending on the language. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     *        target="_blank">Language Specific Text Processing Settings</a> in the <i>Amazon CloudSearch Developer
     *        Guide</i>
     * @see AlgorithmicStemming
     */

    public void setAlgorithmicStemming(String algorithmicStemming) {
        this.algorithmicStemming = algorithmicStemming;
    }

    /**
     * <p>
     * The level of algorithmic stemming to perform: <code>none</code>, <code>minimal</code>, <code>light</code>, or
     * <code>full</code>. The available levels vary depending on the language. For more information, see <a href=
     * "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     * target="_blank">Language Specific Text Processing Settings</a> in the <i>Amazon CloudSearch Developer Guide</i>
     * </p>
     * 
     * @return The level of algorithmic stemming to perform: <code>none</code>, <code>minimal</code>, <code>light</code>
     *         , or <code>full</code>. The available levels vary depending on the language. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     *         target="_blank">Language Specific Text Processing Settings</a> in the <i>Amazon CloudSearch Developer
     *         Guide</i>
     * @see AlgorithmicStemming
     */

    public String getAlgorithmicStemming() {
        return this.algorithmicStemming;
    }

    /**
     * <p>
     * The level of algorithmic stemming to perform: <code>none</code>, <code>minimal</code>, <code>light</code>, or
     * <code>full</code>. The available levels vary depending on the language. For more information, see <a href=
     * "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     * target="_blank">Language Specific Text Processing Settings</a> in the <i>Amazon CloudSearch Developer Guide</i>
     * </p>
     * 
     * @param algorithmicStemming
     *        The level of algorithmic stemming to perform: <code>none</code>, <code>minimal</code>, <code>light</code>,
     *        or <code>full</code>. The available levels vary depending on the language. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     *        target="_blank">Language Specific Text Processing Settings</a> in the <i>Amazon CloudSearch Developer
     *        Guide</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmicStemming
     */

    public AnalysisOptions withAlgorithmicStemming(String algorithmicStemming) {
        setAlgorithmicStemming(algorithmicStemming);
        return this;
    }

    /**
     * <p>
     * The level of algorithmic stemming to perform: <code>none</code>, <code>minimal</code>, <code>light</code>, or
     * <code>full</code>. The available levels vary depending on the language. For more information, see <a href=
     * "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     * target="_blank">Language Specific Text Processing Settings</a> in the <i>Amazon CloudSearch Developer Guide</i>
     * </p>
     * 
     * @param algorithmicStemming
     *        The level of algorithmic stemming to perform: <code>none</code>, <code>minimal</code>, <code>light</code>,
     *        or <code>full</code>. The available levels vary depending on the language. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     *        target="_blank">Language Specific Text Processing Settings</a> in the <i>Amazon CloudSearch Developer
     *        Guide</i>
     * @see AlgorithmicStemming
     */

    public void setAlgorithmicStemming(AlgorithmicStemming algorithmicStemming) {
        withAlgorithmicStemming(algorithmicStemming);
    }

    /**
     * <p>
     * The level of algorithmic stemming to perform: <code>none</code>, <code>minimal</code>, <code>light</code>, or
     * <code>full</code>. The available levels vary depending on the language. For more information, see <a href=
     * "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     * target="_blank">Language Specific Text Processing Settings</a> in the <i>Amazon CloudSearch Developer Guide</i>
     * </p>
     * 
     * @param algorithmicStemming
     *        The level of algorithmic stemming to perform: <code>none</code>, <code>minimal</code>, <code>light</code>,
     *        or <code>full</code>. The available levels vary depending on the language. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     *        target="_blank">Language Specific Text Processing Settings</a> in the <i>Amazon CloudSearch Developer
     *        Guide</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmicStemming
     */

    public AnalysisOptions withAlgorithmicStemming(AlgorithmicStemming algorithmicStemming) {
        this.algorithmicStemming = algorithmicStemming.toString();
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
        if (getSynonyms() != null)
            sb.append("Synonyms: ").append(getSynonyms()).append(",");
        if (getStopwords() != null)
            sb.append("Stopwords: ").append(getStopwords()).append(",");
        if (getStemmingDictionary() != null)
            sb.append("StemmingDictionary: ").append(getStemmingDictionary()).append(",");
        if (getJapaneseTokenizationDictionary() != null)
            sb.append("JapaneseTokenizationDictionary: ").append(getJapaneseTokenizationDictionary()).append(",");
        if (getAlgorithmicStemming() != null)
            sb.append("AlgorithmicStemming: ").append(getAlgorithmicStemming());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisOptions == false)
            return false;
        AnalysisOptions other = (AnalysisOptions) obj;
        if (other.getSynonyms() == null ^ this.getSynonyms() == null)
            return false;
        if (other.getSynonyms() != null && other.getSynonyms().equals(this.getSynonyms()) == false)
            return false;
        if (other.getStopwords() == null ^ this.getStopwords() == null)
            return false;
        if (other.getStopwords() != null && other.getStopwords().equals(this.getStopwords()) == false)
            return false;
        if (other.getStemmingDictionary() == null ^ this.getStemmingDictionary() == null)
            return false;
        if (other.getStemmingDictionary() != null && other.getStemmingDictionary().equals(this.getStemmingDictionary()) == false)
            return false;
        if (other.getJapaneseTokenizationDictionary() == null ^ this.getJapaneseTokenizationDictionary() == null)
            return false;
        if (other.getJapaneseTokenizationDictionary() != null
                && other.getJapaneseTokenizationDictionary().equals(this.getJapaneseTokenizationDictionary()) == false)
            return false;
        if (other.getAlgorithmicStemming() == null ^ this.getAlgorithmicStemming() == null)
            return false;
        if (other.getAlgorithmicStemming() != null && other.getAlgorithmicStemming().equals(this.getAlgorithmicStemming()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSynonyms() == null) ? 0 : getSynonyms().hashCode());
        hashCode = prime * hashCode + ((getStopwords() == null) ? 0 : getStopwords().hashCode());
        hashCode = prime * hashCode + ((getStemmingDictionary() == null) ? 0 : getStemmingDictionary().hashCode());
        hashCode = prime * hashCode + ((getJapaneseTokenizationDictionary() == null) ? 0 : getJapaneseTokenizationDictionary().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmicStemming() == null) ? 0 : getAlgorithmicStemming().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisOptions clone() {
        try {
            return (AnalysisOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
