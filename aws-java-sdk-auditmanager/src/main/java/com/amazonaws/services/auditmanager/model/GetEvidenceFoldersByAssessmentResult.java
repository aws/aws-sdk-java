/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFoldersByAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEvidenceFoldersByAssessmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of evidence folders returned by the <code>GetEvidenceFoldersByAssessment</code> API.
     * </p>
     */
    private java.util.List<AssessmentEvidenceFolder> evidenceFolders;
    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of evidence folders returned by the <code>GetEvidenceFoldersByAssessment</code> API.
     * </p>
     * 
     * @return The list of evidence folders returned by the <code>GetEvidenceFoldersByAssessment</code> API.
     */

    public java.util.List<AssessmentEvidenceFolder> getEvidenceFolders() {
        return evidenceFolders;
    }

    /**
     * <p>
     * The list of evidence folders returned by the <code>GetEvidenceFoldersByAssessment</code> API.
     * </p>
     * 
     * @param evidenceFolders
     *        The list of evidence folders returned by the <code>GetEvidenceFoldersByAssessment</code> API.
     */

    public void setEvidenceFolders(java.util.Collection<AssessmentEvidenceFolder> evidenceFolders) {
        if (evidenceFolders == null) {
            this.evidenceFolders = null;
            return;
        }

        this.evidenceFolders = new java.util.ArrayList<AssessmentEvidenceFolder>(evidenceFolders);
    }

    /**
     * <p>
     * The list of evidence folders returned by the <code>GetEvidenceFoldersByAssessment</code> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvidenceFolders(java.util.Collection)} or {@link #withEvidenceFolders(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param evidenceFolders
     *        The list of evidence folders returned by the <code>GetEvidenceFoldersByAssessment</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceFoldersByAssessmentResult withEvidenceFolders(AssessmentEvidenceFolder... evidenceFolders) {
        if (this.evidenceFolders == null) {
            setEvidenceFolders(new java.util.ArrayList<AssessmentEvidenceFolder>(evidenceFolders.length));
        }
        for (AssessmentEvidenceFolder ele : evidenceFolders) {
            this.evidenceFolders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of evidence folders returned by the <code>GetEvidenceFoldersByAssessment</code> API.
     * </p>
     * 
     * @param evidenceFolders
     *        The list of evidence folders returned by the <code>GetEvidenceFoldersByAssessment</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceFoldersByAssessmentResult withEvidenceFolders(java.util.Collection<AssessmentEvidenceFolder> evidenceFolders) {
        setEvidenceFolders(evidenceFolders);
        return this;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @return The pagination token used to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceFoldersByAssessmentResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getEvidenceFolders() != null)
            sb.append("EvidenceFolders: ").append(getEvidenceFolders()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEvidenceFoldersByAssessmentResult == false)
            return false;
        GetEvidenceFoldersByAssessmentResult other = (GetEvidenceFoldersByAssessmentResult) obj;
        if (other.getEvidenceFolders() == null ^ this.getEvidenceFolders() == null)
            return false;
        if (other.getEvidenceFolders() != null && other.getEvidenceFolders().equals(this.getEvidenceFolders()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvidenceFolders() == null) ? 0 : getEvidenceFolders().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetEvidenceFoldersByAssessmentResult clone() {
        try {
            return (GetEvidenceFoldersByAssessmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
