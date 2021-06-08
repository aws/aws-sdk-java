/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceByEvidenceFolder"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEvidenceByEvidenceFolderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of evidence returned by the <code>GetEvidenceByEvidenceFolder</code> API.
     * </p>
     */
    private java.util.List<Evidence> evidence;
    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of evidence returned by the <code>GetEvidenceByEvidenceFolder</code> API.
     * </p>
     * 
     * @return The list of evidence returned by the <code>GetEvidenceByEvidenceFolder</code> API.
     */

    public java.util.List<Evidence> getEvidence() {
        return evidence;
    }

    /**
     * <p>
     * The list of evidence returned by the <code>GetEvidenceByEvidenceFolder</code> API.
     * </p>
     * 
     * @param evidence
     *        The list of evidence returned by the <code>GetEvidenceByEvidenceFolder</code> API.
     */

    public void setEvidence(java.util.Collection<Evidence> evidence) {
        if (evidence == null) {
            this.evidence = null;
            return;
        }

        this.evidence = new java.util.ArrayList<Evidence>(evidence);
    }

    /**
     * <p>
     * The list of evidence returned by the <code>GetEvidenceByEvidenceFolder</code> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvidence(java.util.Collection)} or {@link #withEvidence(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param evidence
     *        The list of evidence returned by the <code>GetEvidenceByEvidenceFolder</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceByEvidenceFolderResult withEvidence(Evidence... evidence) {
        if (this.evidence == null) {
            setEvidence(new java.util.ArrayList<Evidence>(evidence.length));
        }
        for (Evidence ele : evidence) {
            this.evidence.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of evidence returned by the <code>GetEvidenceByEvidenceFolder</code> API.
     * </p>
     * 
     * @param evidence
     *        The list of evidence returned by the <code>GetEvidenceByEvidenceFolder</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceByEvidenceFolderResult withEvidence(java.util.Collection<Evidence> evidence) {
        setEvidence(evidence);
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

    public GetEvidenceByEvidenceFolderResult withNextToken(String nextToken) {
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
        if (getEvidence() != null)
            sb.append("Evidence: ").append(getEvidence()).append(",");
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

        if (obj instanceof GetEvidenceByEvidenceFolderResult == false)
            return false;
        GetEvidenceByEvidenceFolderResult other = (GetEvidenceByEvidenceFolderResult) obj;
        if (other.getEvidence() == null ^ this.getEvidence() == null)
            return false;
        if (other.getEvidence() != null && other.getEvidence().equals(this.getEvidence()) == false)
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

        hashCode = prime * hashCode + ((getEvidence() == null) ? 0 : getEvidence().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetEvidenceByEvidenceFolderResult clone() {
        try {
            return (GetEvidenceByEvidenceFolderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
