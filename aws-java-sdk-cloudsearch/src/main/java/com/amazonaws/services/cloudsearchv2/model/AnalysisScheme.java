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
 * Configuration information for an analysis scheme. Each analysis scheme has a unique name and specifies the language
 * of the text to be processed. The following options can be configured for an analysis scheme: <code>Synonyms</code>,
 * <code>Stopwords</code>, <code>StemmingDictionary</code>, <code>JapaneseTokenizationDictionary</code> and
 * <code>AlgorithmicStemming</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisScheme implements Serializable, Cloneable {

    private String analysisSchemeName;

    private String analysisSchemeLanguage;

    private AnalysisOptions analysisOptions;

    /**
     * @param analysisSchemeName
     */

    public void setAnalysisSchemeName(String analysisSchemeName) {
        this.analysisSchemeName = analysisSchemeName;
    }

    /**
     * @return
     */

    public String getAnalysisSchemeName() {
        return this.analysisSchemeName;
    }

    /**
     * @param analysisSchemeName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisScheme withAnalysisSchemeName(String analysisSchemeName) {
        setAnalysisSchemeName(analysisSchemeName);
        return this;
    }

    /**
     * @param analysisSchemeLanguage
     * @see AnalysisSchemeLanguage
     */

    public void setAnalysisSchemeLanguage(String analysisSchemeLanguage) {
        this.analysisSchemeLanguage = analysisSchemeLanguage;
    }

    /**
     * @return
     * @see AnalysisSchemeLanguage
     */

    public String getAnalysisSchemeLanguage() {
        return this.analysisSchemeLanguage;
    }

    /**
     * @param analysisSchemeLanguage
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisSchemeLanguage
     */

    public AnalysisScheme withAnalysisSchemeLanguage(String analysisSchemeLanguage) {
        setAnalysisSchemeLanguage(analysisSchemeLanguage);
        return this;
    }

    /**
     * @param analysisSchemeLanguage
     * @see AnalysisSchemeLanguage
     */

    public void setAnalysisSchemeLanguage(AnalysisSchemeLanguage analysisSchemeLanguage) {
        withAnalysisSchemeLanguage(analysisSchemeLanguage);
    }

    /**
     * @param analysisSchemeLanguage
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisSchemeLanguage
     */

    public AnalysisScheme withAnalysisSchemeLanguage(AnalysisSchemeLanguage analysisSchemeLanguage) {
        this.analysisSchemeLanguage = analysisSchemeLanguage.toString();
        return this;
    }

    /**
     * @param analysisOptions
     */

    public void setAnalysisOptions(AnalysisOptions analysisOptions) {
        this.analysisOptions = analysisOptions;
    }

    /**
     * @return
     */

    public AnalysisOptions getAnalysisOptions() {
        return this.analysisOptions;
    }

    /**
     * @param analysisOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisScheme withAnalysisOptions(AnalysisOptions analysisOptions) {
        setAnalysisOptions(analysisOptions);
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
        if (getAnalysisSchemeName() != null)
            sb.append("AnalysisSchemeName: ").append(getAnalysisSchemeName()).append(",");
        if (getAnalysisSchemeLanguage() != null)
            sb.append("AnalysisSchemeLanguage: ").append(getAnalysisSchemeLanguage()).append(",");
        if (getAnalysisOptions() != null)
            sb.append("AnalysisOptions: ").append(getAnalysisOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisScheme == false)
            return false;
        AnalysisScheme other = (AnalysisScheme) obj;
        if (other.getAnalysisSchemeName() == null ^ this.getAnalysisSchemeName() == null)
            return false;
        if (other.getAnalysisSchemeName() != null && other.getAnalysisSchemeName().equals(this.getAnalysisSchemeName()) == false)
            return false;
        if (other.getAnalysisSchemeLanguage() == null ^ this.getAnalysisSchemeLanguage() == null)
            return false;
        if (other.getAnalysisSchemeLanguage() != null && other.getAnalysisSchemeLanguage().equals(this.getAnalysisSchemeLanguage()) == false)
            return false;
        if (other.getAnalysisOptions() == null ^ this.getAnalysisOptions() == null)
            return false;
        if (other.getAnalysisOptions() != null && other.getAnalysisOptions().equals(this.getAnalysisOptions()) == false)
            return false;
        return true;
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
    public AnalysisScheme clone() {
        try {
            return (AnalysisScheme) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
