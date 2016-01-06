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
 * The result of a <code>DescribeAnalysisSchemes</code> request. Contains
 * the analysis schemes configured for the domain specified in the
 * request.
 * </p>
 */
public class DescribeAnalysisSchemesResult implements Serializable, Cloneable {

    /**
     * The analysis scheme descriptions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AnalysisSchemeStatus> analysisSchemes;

    /**
     * The analysis scheme descriptions.
     *
     * @return The analysis scheme descriptions.
     */
    public java.util.List<AnalysisSchemeStatus> getAnalysisSchemes() {
        if (analysisSchemes == null) {
              analysisSchemes = new com.amazonaws.internal.ListWithAutoConstructFlag<AnalysisSchemeStatus>();
              analysisSchemes.setAutoConstruct(true);
        }
        return analysisSchemes;
    }
    
    /**
     * The analysis scheme descriptions.
     *
     * @param analysisSchemes The analysis scheme descriptions.
     */
    public void setAnalysisSchemes(java.util.Collection<AnalysisSchemeStatus> analysisSchemes) {
        if (analysisSchemes == null) {
            this.analysisSchemes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AnalysisSchemeStatus> analysisSchemesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AnalysisSchemeStatus>(analysisSchemes.size());
        analysisSchemesCopy.addAll(analysisSchemes);
        this.analysisSchemes = analysisSchemesCopy;
    }
    
    /**
     * The analysis scheme descriptions.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAnalysisSchemes(java.util.Collection)} or {@link
     * #withAnalysisSchemes(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param analysisSchemes The analysis scheme descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAnalysisSchemesResult withAnalysisSchemes(AnalysisSchemeStatus... analysisSchemes) {
        if (getAnalysisSchemes() == null) setAnalysisSchemes(new java.util.ArrayList<AnalysisSchemeStatus>(analysisSchemes.length));
        for (AnalysisSchemeStatus value : analysisSchemes) {
            getAnalysisSchemes().add(value);
        }
        return this;
    }
    
    /**
     * The analysis scheme descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param analysisSchemes The analysis scheme descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAnalysisSchemesResult withAnalysisSchemes(java.util.Collection<AnalysisSchemeStatus> analysisSchemes) {
        if (analysisSchemes == null) {
            this.analysisSchemes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AnalysisSchemeStatus> analysisSchemesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AnalysisSchemeStatus>(analysisSchemes.size());
            analysisSchemesCopy.addAll(analysisSchemes);
            this.analysisSchemes = analysisSchemesCopy;
        }

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
        if (getAnalysisSchemes() != null) sb.append("AnalysisSchemes: " + getAnalysisSchemes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAnalysisSchemes() == null) ? 0 : getAnalysisSchemes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAnalysisSchemesResult == false) return false;
        DescribeAnalysisSchemesResult other = (DescribeAnalysisSchemesResult)obj;
        
        if (other.getAnalysisSchemes() == null ^ this.getAnalysisSchemes() == null) return false;
        if (other.getAnalysisSchemes() != null && other.getAnalysisSchemes().equals(this.getAnalysisSchemes()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeAnalysisSchemesResult clone() {
        try {
            return (DescribeAnalysisSchemesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    