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
 * Synonyms, stopwords, and stemming options for an analysis scheme.
 * Includes tokenization dictionary for Japanese.
 * </p>
 */
public class AnalysisOptions implements Serializable, Cloneable {

    /**
     * A JSON object that defines synonym groups and aliases. A synonym group
     * is an array of arrays, where each sub-array is a group of terms where
     * each term in the group is considered a synonym of every other term in
     * the group. The aliases value is an object that contains a collection
     * of string:value pairs where the string specifies a term and the array
     * of values specifies each of the aliases for that term. An alias is
     * considered a synonym of the specified term, but the term is not
     * considered a synonym of the alias. For more information about
     * specifying synonyms, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms">Synonyms</a>
     * in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    private String synonyms;

    /**
     * A JSON array of terms to ignore during indexing and searching. For
     * example, <code>["a", "an", "the", "of"]</code>. The stopwords
     * dictionary must explicitly list each word you want to ignore.
     * Wildcards and regular expressions are not supported.
     */
    private String stopwords;

    /**
     * A JSON object that contains a collection of string:value pairs that
     * each map a term to its stem. For example, <code>{"term1": "stem1",
     * "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is
     * applied in addition to any algorithmic stemming. This enables you to
     * override the results of the algorithmic stemming to correct specific
     * cases of overstemming or understemming. The maximum size of a stemming
     * dictionary is 500 KB.
     */
    private String stemmingDictionary;

    /**
     * A JSON array that contains a collection of terms, tokens, readings and
     * part of speech for Japanese Tokenizaiton. The Japanese tokenization
     * dictionary enables you to override the default tokenization for
     * selected terms. This is only valid for Japanese language fields.
     */
    private String japaneseTokenizationDictionary;

    /**
     * The level of algorithmic stemming to perform: <code>none</code>,
     * <code>minimal</code>, <code>light</code>, or <code>full</code>. The
     * available levels vary depending on the language. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     * target="_blank">Language Specific Text Processing Settings</a> in the
     * <i>Amazon CloudSearch Developer Guide</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, minimal, light, full
     */
    private String algorithmicStemming;

    /**
     * A JSON object that defines synonym groups and aliases. A synonym group
     * is an array of arrays, where each sub-array is a group of terms where
     * each term in the group is considered a synonym of every other term in
     * the group. The aliases value is an object that contains a collection
     * of string:value pairs where the string specifies a term and the array
     * of values specifies each of the aliases for that term. An alias is
     * considered a synonym of the specified term, but the term is not
     * considered a synonym of the alias. For more information about
     * specifying synonyms, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms">Synonyms</a>
     * in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @return A JSON object that defines synonym groups and aliases. A synonym group
     *         is an array of arrays, where each sub-array is a group of terms where
     *         each term in the group is considered a synonym of every other term in
     *         the group. The aliases value is an object that contains a collection
     *         of string:value pairs where the string specifies a term and the array
     *         of values specifies each of the aliases for that term. An alias is
     *         considered a synonym of the specified term, but the term is not
     *         considered a synonym of the alias. For more information about
     *         specifying synonyms, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms">Synonyms</a>
     *         in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    public String getSynonyms() {
        return synonyms;
    }
    
    /**
     * A JSON object that defines synonym groups and aliases. A synonym group
     * is an array of arrays, where each sub-array is a group of terms where
     * each term in the group is considered a synonym of every other term in
     * the group. The aliases value is an object that contains a collection
     * of string:value pairs where the string specifies a term and the array
     * of values specifies each of the aliases for that term. An alias is
     * considered a synonym of the specified term, but the term is not
     * considered a synonym of the alias. For more information about
     * specifying synonyms, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms">Synonyms</a>
     * in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @param synonyms A JSON object that defines synonym groups and aliases. A synonym group
     *         is an array of arrays, where each sub-array is a group of terms where
     *         each term in the group is considered a synonym of every other term in
     *         the group. The aliases value is an object that contains a collection
     *         of string:value pairs where the string specifies a term and the array
     *         of values specifies each of the aliases for that term. An alias is
     *         considered a synonym of the specified term, but the term is not
     *         considered a synonym of the alias. For more information about
     *         specifying synonyms, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms">Synonyms</a>
     *         in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }
    
    /**
     * A JSON object that defines synonym groups and aliases. A synonym group
     * is an array of arrays, where each sub-array is a group of terms where
     * each term in the group is considered a synonym of every other term in
     * the group. The aliases value is an object that contains a collection
     * of string:value pairs where the string specifies a term and the array
     * of values specifies each of the aliases for that term. An alias is
     * considered a synonym of the specified term, but the term is not
     * considered a synonym of the alias. For more information about
     * specifying synonyms, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms">Synonyms</a>
     * in the <i>Amazon CloudSearch Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param synonyms A JSON object that defines synonym groups and aliases. A synonym group
     *         is an array of arrays, where each sub-array is a group of terms where
     *         each term in the group is considered a synonym of every other term in
     *         the group. The aliases value is an object that contains a collection
     *         of string:value pairs where the string specifies a term and the array
     *         of values specifies each of the aliases for that term. An alias is
     *         considered a synonym of the specified term, but the term is not
     *         considered a synonym of the alias. For more information about
     *         specifying synonyms, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html#synonyms">Synonyms</a>
     *         in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AnalysisOptions withSynonyms(String synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    /**
     * A JSON array of terms to ignore during indexing and searching. For
     * example, <code>["a", "an", "the", "of"]</code>. The stopwords
     * dictionary must explicitly list each word you want to ignore.
     * Wildcards and regular expressions are not supported.
     *
     * @return A JSON array of terms to ignore during indexing and searching. For
     *         example, <code>["a", "an", "the", "of"]</code>. The stopwords
     *         dictionary must explicitly list each word you want to ignore.
     *         Wildcards and regular expressions are not supported.
     */
    public String getStopwords() {
        return stopwords;
    }
    
    /**
     * A JSON array of terms to ignore during indexing and searching. For
     * example, <code>["a", "an", "the", "of"]</code>. The stopwords
     * dictionary must explicitly list each word you want to ignore.
     * Wildcards and regular expressions are not supported.
     *
     * @param stopwords A JSON array of terms to ignore during indexing and searching. For
     *         example, <code>["a", "an", "the", "of"]</code>. The stopwords
     *         dictionary must explicitly list each word you want to ignore.
     *         Wildcards and regular expressions are not supported.
     */
    public void setStopwords(String stopwords) {
        this.stopwords = stopwords;
    }
    
    /**
     * A JSON array of terms to ignore during indexing and searching. For
     * example, <code>["a", "an", "the", "of"]</code>. The stopwords
     * dictionary must explicitly list each word you want to ignore.
     * Wildcards and regular expressions are not supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stopwords A JSON array of terms to ignore during indexing and searching. For
     *         example, <code>["a", "an", "the", "of"]</code>. The stopwords
     *         dictionary must explicitly list each word you want to ignore.
     *         Wildcards and regular expressions are not supported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AnalysisOptions withStopwords(String stopwords) {
        this.stopwords = stopwords;
        return this;
    }

    /**
     * A JSON object that contains a collection of string:value pairs that
     * each map a term to its stem. For example, <code>{"term1": "stem1",
     * "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is
     * applied in addition to any algorithmic stemming. This enables you to
     * override the results of the algorithmic stemming to correct specific
     * cases of overstemming or understemming. The maximum size of a stemming
     * dictionary is 500 KB.
     *
     * @return A JSON object that contains a collection of string:value pairs that
     *         each map a term to its stem. For example, <code>{"term1": "stem1",
     *         "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is
     *         applied in addition to any algorithmic stemming. This enables you to
     *         override the results of the algorithmic stemming to correct specific
     *         cases of overstemming or understemming. The maximum size of a stemming
     *         dictionary is 500 KB.
     */
    public String getStemmingDictionary() {
        return stemmingDictionary;
    }
    
    /**
     * A JSON object that contains a collection of string:value pairs that
     * each map a term to its stem. For example, <code>{"term1": "stem1",
     * "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is
     * applied in addition to any algorithmic stemming. This enables you to
     * override the results of the algorithmic stemming to correct specific
     * cases of overstemming or understemming. The maximum size of a stemming
     * dictionary is 500 KB.
     *
     * @param stemmingDictionary A JSON object that contains a collection of string:value pairs that
     *         each map a term to its stem. For example, <code>{"term1": "stem1",
     *         "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is
     *         applied in addition to any algorithmic stemming. This enables you to
     *         override the results of the algorithmic stemming to correct specific
     *         cases of overstemming or understemming. The maximum size of a stemming
     *         dictionary is 500 KB.
     */
    public void setStemmingDictionary(String stemmingDictionary) {
        this.stemmingDictionary = stemmingDictionary;
    }
    
    /**
     * A JSON object that contains a collection of string:value pairs that
     * each map a term to its stem. For example, <code>{"term1": "stem1",
     * "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is
     * applied in addition to any algorithmic stemming. This enables you to
     * override the results of the algorithmic stemming to correct specific
     * cases of overstemming or understemming. The maximum size of a stemming
     * dictionary is 500 KB.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stemmingDictionary A JSON object that contains a collection of string:value pairs that
     *         each map a term to its stem. For example, <code>{"term1": "stem1",
     *         "term2": "stem2", "term3": "stem3"}</code>. The stemming dictionary is
     *         applied in addition to any algorithmic stemming. This enables you to
     *         override the results of the algorithmic stemming to correct specific
     *         cases of overstemming or understemming. The maximum size of a stemming
     *         dictionary is 500 KB.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AnalysisOptions withStemmingDictionary(String stemmingDictionary) {
        this.stemmingDictionary = stemmingDictionary;
        return this;
    }

    /**
     * A JSON array that contains a collection of terms, tokens, readings and
     * part of speech for Japanese Tokenizaiton. The Japanese tokenization
     * dictionary enables you to override the default tokenization for
     * selected terms. This is only valid for Japanese language fields.
     *
     * @return A JSON array that contains a collection of terms, tokens, readings and
     *         part of speech for Japanese Tokenizaiton. The Japanese tokenization
     *         dictionary enables you to override the default tokenization for
     *         selected terms. This is only valid for Japanese language fields.
     */
    public String getJapaneseTokenizationDictionary() {
        return japaneseTokenizationDictionary;
    }
    
    /**
     * A JSON array that contains a collection of terms, tokens, readings and
     * part of speech for Japanese Tokenizaiton. The Japanese tokenization
     * dictionary enables you to override the default tokenization for
     * selected terms. This is only valid for Japanese language fields.
     *
     * @param japaneseTokenizationDictionary A JSON array that contains a collection of terms, tokens, readings and
     *         part of speech for Japanese Tokenizaiton. The Japanese tokenization
     *         dictionary enables you to override the default tokenization for
     *         selected terms. This is only valid for Japanese language fields.
     */
    public void setJapaneseTokenizationDictionary(String japaneseTokenizationDictionary) {
        this.japaneseTokenizationDictionary = japaneseTokenizationDictionary;
    }
    
    /**
     * A JSON array that contains a collection of terms, tokens, readings and
     * part of speech for Japanese Tokenizaiton. The Japanese tokenization
     * dictionary enables you to override the default tokenization for
     * selected terms. This is only valid for Japanese language fields.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param japaneseTokenizationDictionary A JSON array that contains a collection of terms, tokens, readings and
     *         part of speech for Japanese Tokenizaiton. The Japanese tokenization
     *         dictionary enables you to override the default tokenization for
     *         selected terms. This is only valid for Japanese language fields.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AnalysisOptions withJapaneseTokenizationDictionary(String japaneseTokenizationDictionary) {
        this.japaneseTokenizationDictionary = japaneseTokenizationDictionary;
        return this;
    }

    /**
     * The level of algorithmic stemming to perform: <code>none</code>,
     * <code>minimal</code>, <code>light</code>, or <code>full</code>. The
     * available levels vary depending on the language. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     * target="_blank">Language Specific Text Processing Settings</a> in the
     * <i>Amazon CloudSearch Developer Guide</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, minimal, light, full
     *
     * @return The level of algorithmic stemming to perform: <code>none</code>,
     *         <code>minimal</code>, <code>light</code>, or <code>full</code>. The
     *         available levels vary depending on the language. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     *         target="_blank">Language Specific Text Processing Settings</a> in the
     *         <i>Amazon CloudSearch Developer Guide</i>
     *
     * @see AlgorithmicStemming
     */
    public String getAlgorithmicStemming() {
        return algorithmicStemming;
    }
    
    /**
     * The level of algorithmic stemming to perform: <code>none</code>,
     * <code>minimal</code>, <code>light</code>, or <code>full</code>. The
     * available levels vary depending on the language. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     * target="_blank">Language Specific Text Processing Settings</a> in the
     * <i>Amazon CloudSearch Developer Guide</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, minimal, light, full
     *
     * @param algorithmicStemming The level of algorithmic stemming to perform: <code>none</code>,
     *         <code>minimal</code>, <code>light</code>, or <code>full</code>. The
     *         available levels vary depending on the language. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     *         target="_blank">Language Specific Text Processing Settings</a> in the
     *         <i>Amazon CloudSearch Developer Guide</i>
     *
     * @see AlgorithmicStemming
     */
    public void setAlgorithmicStemming(String algorithmicStemming) {
        this.algorithmicStemming = algorithmicStemming;
    }
    
    /**
     * The level of algorithmic stemming to perform: <code>none</code>,
     * <code>minimal</code>, <code>light</code>, or <code>full</code>. The
     * available levels vary depending on the language. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     * target="_blank">Language Specific Text Processing Settings</a> in the
     * <i>Amazon CloudSearch Developer Guide</i>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, minimal, light, full
     *
     * @param algorithmicStemming The level of algorithmic stemming to perform: <code>none</code>,
     *         <code>minimal</code>, <code>light</code>, or <code>full</code>. The
     *         available levels vary depending on the language. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     *         target="_blank">Language Specific Text Processing Settings</a> in the
     *         <i>Amazon CloudSearch Developer Guide</i>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AlgorithmicStemming
     */
    public AnalysisOptions withAlgorithmicStemming(String algorithmicStemming) {
        this.algorithmicStemming = algorithmicStemming;
        return this;
    }

    /**
     * The level of algorithmic stemming to perform: <code>none</code>,
     * <code>minimal</code>, <code>light</code>, or <code>full</code>. The
     * available levels vary depending on the language. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     * target="_blank">Language Specific Text Processing Settings</a> in the
     * <i>Amazon CloudSearch Developer Guide</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, minimal, light, full
     *
     * @param algorithmicStemming The level of algorithmic stemming to perform: <code>none</code>,
     *         <code>minimal</code>, <code>light</code>, or <code>full</code>. The
     *         available levels vary depending on the language. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     *         target="_blank">Language Specific Text Processing Settings</a> in the
     *         <i>Amazon CloudSearch Developer Guide</i>
     *
     * @see AlgorithmicStemming
     */
    public void setAlgorithmicStemming(AlgorithmicStemming algorithmicStemming) {
        this.algorithmicStemming = algorithmicStemming.toString();
    }
    
    /**
     * The level of algorithmic stemming to perform: <code>none</code>,
     * <code>minimal</code>, <code>light</code>, or <code>full</code>. The
     * available levels vary depending on the language. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     * target="_blank">Language Specific Text Processing Settings</a> in the
     * <i>Amazon CloudSearch Developer Guide</i>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, minimal, light, full
     *
     * @param algorithmicStemming The level of algorithmic stemming to perform: <code>none</code>,
     *         <code>minimal</code>, <code>light</code>, or <code>full</code>. The
     *         available levels vary depending on the language. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/text-processing.html#text-processing-settings"
     *         target="_blank">Language Specific Text Processing Settings</a> in the
     *         <i>Amazon CloudSearch Developer Guide</i>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AlgorithmicStemming
     */
    public AnalysisOptions withAlgorithmicStemming(AlgorithmicStemming algorithmicStemming) {
        this.algorithmicStemming = algorithmicStemming.toString();
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
        if (getSynonyms() != null) sb.append("Synonyms: " + getSynonyms() + ",");
        if (getStopwords() != null) sb.append("Stopwords: " + getStopwords() + ",");
        if (getStemmingDictionary() != null) sb.append("StemmingDictionary: " + getStemmingDictionary() + ",");
        if (getJapaneseTokenizationDictionary() != null) sb.append("JapaneseTokenizationDictionary: " + getJapaneseTokenizationDictionary() + ",");
        if (getAlgorithmicStemming() != null) sb.append("AlgorithmicStemming: " + getAlgorithmicStemming() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AnalysisOptions == false) return false;
        AnalysisOptions other = (AnalysisOptions)obj;
        
        if (other.getSynonyms() == null ^ this.getSynonyms() == null) return false;
        if (other.getSynonyms() != null && other.getSynonyms().equals(this.getSynonyms()) == false) return false; 
        if (other.getStopwords() == null ^ this.getStopwords() == null) return false;
        if (other.getStopwords() != null && other.getStopwords().equals(this.getStopwords()) == false) return false; 
        if (other.getStemmingDictionary() == null ^ this.getStemmingDictionary() == null) return false;
        if (other.getStemmingDictionary() != null && other.getStemmingDictionary().equals(this.getStemmingDictionary()) == false) return false; 
        if (other.getJapaneseTokenizationDictionary() == null ^ this.getJapaneseTokenizationDictionary() == null) return false;
        if (other.getJapaneseTokenizationDictionary() != null && other.getJapaneseTokenizationDictionary().equals(this.getJapaneseTokenizationDictionary()) == false) return false; 
        if (other.getAlgorithmicStemming() == null ^ this.getAlgorithmicStemming() == null) return false;
        if (other.getAlgorithmicStemming() != null && other.getAlgorithmicStemming().equals(this.getAlgorithmicStemming()) == false) return false; 
        return true;
    }
    
    @Override
    public AnalysisOptions clone() {
        try {
            return (AnalysisOptions) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    