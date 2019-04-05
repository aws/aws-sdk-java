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
 * The result of a <code>DescribeAnalysisSchemes</code> request. Contains the analysis schemes configured for the domain
 * specified in the request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAnalysisSchemesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The analysis scheme descriptions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AnalysisSchemeStatus> analysisSchemes;

    /**
     * <p>
     * The analysis scheme descriptions.
     * </p>
     * 
     * @return The analysis scheme descriptions.
     */

    public java.util.List<AnalysisSchemeStatus> getAnalysisSchemes() {
        if (analysisSchemes == null) {
            analysisSchemes = new com.amazonaws.internal.SdkInternalList<AnalysisSchemeStatus>();
        }
        return analysisSchemes;
    }

    /**
     * <p>
     * The analysis scheme descriptions.
     * </p>
     * 
     * @param analysisSchemes
     *        The analysis scheme descriptions.
     */

    public void setAnalysisSchemes(java.util.Collection<AnalysisSchemeStatus> analysisSchemes) {
        if (analysisSchemes == null) {
            this.analysisSchemes = null;
            return;
        }

        this.analysisSchemes = new com.amazonaws.internal.SdkInternalList<AnalysisSchemeStatus>(analysisSchemes);
    }

    /**
     * <p>
     * The analysis scheme descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisSchemes(java.util.Collection)} or {@link #withAnalysisSchemes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param analysisSchemes
     *        The analysis scheme descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnalysisSchemesResult withAnalysisSchemes(AnalysisSchemeStatus... analysisSchemes) {
        if (this.analysisSchemes == null) {
            setAnalysisSchemes(new com.amazonaws.internal.SdkInternalList<AnalysisSchemeStatus>(analysisSchemes.length));
        }
        for (AnalysisSchemeStatus ele : analysisSchemes) {
            this.analysisSchemes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The analysis scheme descriptions.
     * </p>
     * 
     * @param analysisSchemes
     *        The analysis scheme descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnalysisSchemesResult withAnalysisSchemes(java.util.Collection<AnalysisSchemeStatus> analysisSchemes) {
        setAnalysisSchemes(analysisSchemes);
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
        if (getAnalysisSchemes() != null)
            sb.append("AnalysisSchemes: ").append(getAnalysisSchemes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAnalysisSchemesResult == false)
            return false;
        DescribeAnalysisSchemesResult other = (DescribeAnalysisSchemesResult) obj;
        if (other.getAnalysisSchemes() == null ^ this.getAnalysisSchemes() == null)
            return false;
        if (other.getAnalysisSchemes() != null && other.getAnalysisSchemes().equals(this.getAnalysisSchemes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisSchemes() == null) ? 0 : getAnalysisSchemes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAnalysisSchemesResult clone() {
        try {
            return (DescribeAnalysisSchemesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
