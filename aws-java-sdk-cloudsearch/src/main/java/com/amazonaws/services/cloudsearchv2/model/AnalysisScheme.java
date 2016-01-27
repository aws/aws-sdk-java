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
 * Configuration information for an analysis scheme. Each analysis scheme
 * has a unique name and specifies the language of the text to be
 * processed. The following options can be configured for an analysis
 * scheme: <code>Synonyms</code> ,
 * <code>Stopwords</code> ,
 * <code>StemmingDictionary</code> ,
 * <code>JapaneseTokenizationDictionary</code> and
 * <code>AlgorithmicStemming</code> .
 * </p>
 */
public class AnalysisScheme implements Serializable, Cloneable {

    /**
     * Names must begin with a letter and can contain the following
     * characters: a-z (lowercase), 0-9, and _ (underscore).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     */
    private String analysisSchemeName;

    /**
     * An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF
     * RFC 4646</a> language code or <code>mul</code> for multiple languages.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar, bg, ca, cs, da, de, el, en, es, eu, fa, fi, fr, ga, gl, he, hi, hu, hy, id, it, ja, ko, lv, mul, nl, no, pt, ro, ru, sv, th, tr, zh-Hans, zh-Hant
     */
    private String analysisSchemeLanguage;

    /**
     * Synonyms, stopwords, and stemming options for an analysis scheme.
     * Includes tokenization dictionary for Japanese.
     */
    private AnalysisOptions analysisOptions;

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
    public String getAnalysisSchemeName() {
        return analysisSchemeName;
    }
    
    /**
     * Names must begin with a letter and can contain the following
     * characters: a-z (lowercase), 0-9, and _ (underscore).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param analysisSchemeName Names must begin with a letter and can contain the following
     *         characters: a-z (lowercase), 0-9, and _ (underscore).
     */
    public void setAnalysisSchemeName(String analysisSchemeName) {
        this.analysisSchemeName = analysisSchemeName;
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
     * @param analysisSchemeName Names must begin with a letter and can contain the following
     *         characters: a-z (lowercase), 0-9, and _ (underscore).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AnalysisScheme withAnalysisSchemeName(String analysisSchemeName) {
        this.analysisSchemeName = analysisSchemeName;
        return this;
    }

    /**
     * An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF
     * RFC 4646</a> language code or <code>mul</code> for multiple languages.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar, bg, ca, cs, da, de, el, en, es, eu, fa, fi, fr, ga, gl, he, hi, hu, hy, id, it, ja, ko, lv, mul, nl, no, pt, ro, ru, sv, th, tr, zh-Hans, zh-Hant
     *
     * @return An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF
     *         RFC 4646</a> language code or <code>mul</code> for multiple languages.
     *
     * @see AnalysisSchemeLanguage
     */
    public String getAnalysisSchemeLanguage() {
        return analysisSchemeLanguage;
    }
    
    /**
     * An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF
     * RFC 4646</a> language code or <code>mul</code> for multiple languages.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar, bg, ca, cs, da, de, el, en, es, eu, fa, fi, fr, ga, gl, he, hi, hu, hy, id, it, ja, ko, lv, mul, nl, no, pt, ro, ru, sv, th, tr, zh-Hans, zh-Hant
     *
     * @param analysisSchemeLanguage An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF
     *         RFC 4646</a> language code or <code>mul</code> for multiple languages.
     *
     * @see AnalysisSchemeLanguage
     */
    public void setAnalysisSchemeLanguage(String analysisSchemeLanguage) {
        this.analysisSchemeLanguage = analysisSchemeLanguage;
    }
    
    /**
     * An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF
     * RFC 4646</a> language code or <code>mul</code> for multiple languages.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar, bg, ca, cs, da, de, el, en, es, eu, fa, fi, fr, ga, gl, he, hi, hu, hy, id, it, ja, ko, lv, mul, nl, no, pt, ro, ru, sv, th, tr, zh-Hans, zh-Hant
     *
     * @param analysisSchemeLanguage An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF
     *         RFC 4646</a> language code or <code>mul</code> for multiple languages.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AnalysisSchemeLanguage
     */
    public AnalysisScheme withAnalysisSchemeLanguage(String analysisSchemeLanguage) {
        this.analysisSchemeLanguage = analysisSchemeLanguage;
        return this;
    }

    /**
     * An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF
     * RFC 4646</a> language code or <code>mul</code> for multiple languages.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar, bg, ca, cs, da, de, el, en, es, eu, fa, fi, fr, ga, gl, he, hi, hu, hy, id, it, ja, ko, lv, mul, nl, no, pt, ro, ru, sv, th, tr, zh-Hans, zh-Hant
     *
     * @param analysisSchemeLanguage An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF
     *         RFC 4646</a> language code or <code>mul</code> for multiple languages.
     *
     * @see AnalysisSchemeLanguage
     */
    public void setAnalysisSchemeLanguage(AnalysisSchemeLanguage analysisSchemeLanguage) {
        this.analysisSchemeLanguage = analysisSchemeLanguage.toString();
    }
    
    /**
     * An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF
     * RFC 4646</a> language code or <code>mul</code> for multiple languages.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar, bg, ca, cs, da, de, el, en, es, eu, fa, fi, fr, ga, gl, he, hi, hu, hy, id, it, ja, ko, lv, mul, nl, no, pt, ro, ru, sv, th, tr, zh-Hans, zh-Hant
     *
     * @param analysisSchemeLanguage An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF
     *         RFC 4646</a> language code or <code>mul</code> for multiple languages.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AnalysisSchemeLanguage
     */
    public AnalysisScheme withAnalysisSchemeLanguage(AnalysisSchemeLanguage analysisSchemeLanguage) {
        this.analysisSchemeLanguage = analysisSchemeLanguage.toString();
        return this;
    }

    /**
     * Synonyms, stopwords, and stemming options for an analysis scheme.
     * Includes tokenization dictionary for Japanese.
     *
     * @return Synonyms, stopwords, and stemming options for an analysis scheme.
     *         Includes tokenization dictionary for Japanese.
     */
    public AnalysisOptions getAnalysisOptions() {
        return analysisOptions;
    }
    
    /**
     * Synonyms, stopwords, and stemming options for an analysis scheme.
     * Includes tokenization dictionary for Japanese.
     *
     * @param analysisOptions Synonyms, stopwords, and stemming options for an analysis scheme.
     *         Includes tokenization dictionary for Japanese.
     */
    public void setAnalysisOptions(AnalysisOptions analysisOptions) {
        this.analysisOptions = analysisOptions;
    }
    
    /**
     * Synonyms, stopwords, and stemming options for an analysis scheme.
     * Includes tokenization dictionary for Japanese.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param analysisOptions Synonyms, stopwords, and stemming options for an analysis scheme.
     *         Includes tokenization dictionary for Japanese.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AnalysisScheme withAnalysisOptions(AnalysisOptions analysisOptions) {
        this.analysisOptions = analysisOptions;
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
        if (getAnalysisSchemeName() != null) sb.append("AnalysisSchemeName: " + getAnalysisSchemeName() + ",");
        if (getAnalysisSchemeLanguage() != null) sb.append("AnalysisSchemeLanguage: " + getAnalysisSchemeLanguage() + ",");
        if (getAnalysisOptions() != null) sb.append("AnalysisOptions: " + getAnalysisOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAnalysisSchemeName() == null) ? 0 : getAnalysisSchemeName().hashCode()); 
        hashCode = prime * hashCode + ((getAnalysisSchemeLanguage() == null) ? 0 : getAnalysisSchemeLanguage().hashCode()); 
        hashCode = prime * hashCode + ((getAnalysisOptions() == null) ? 0 : getAnalysisOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AnalysisScheme == false) return false;
        AnalysisScheme other = (AnalysisScheme)obj;
        
        if (other.getAnalysisSchemeName() == null ^ this.getAnalysisSchemeName() == null) return false;
        if (other.getAnalysisSchemeName() != null && other.getAnalysisSchemeName().equals(this.getAnalysisSchemeName()) == false) return false; 
        if (other.getAnalysisSchemeLanguage() == null ^ this.getAnalysisSchemeLanguage() == null) return false;
        if (other.getAnalysisSchemeLanguage() != null && other.getAnalysisSchemeLanguage().equals(this.getAnalysisSchemeLanguage()) == false) return false; 
        if (other.getAnalysisOptions() == null ^ this.getAnalysisOptions() == null) return false;
        if (other.getAnalysisOptions() != null && other.getAnalysisOptions().equals(this.getAnalysisOptions()) == false) return false; 
        return true;
    }
    
    @Override
    public AnalysisScheme clone() {
        try {
            return (AnalysisScheme) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    