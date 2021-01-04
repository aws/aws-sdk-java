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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidence" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEvidenceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The evidence returned by the <code>GetEvidenceResponse</code> API.
     * </p>
     */
    private Evidence evidence;

    /**
     * <p>
     * The evidence returned by the <code>GetEvidenceResponse</code> API.
     * </p>
     * 
     * @param evidence
     *        The evidence returned by the <code>GetEvidenceResponse</code> API.
     */

    public void setEvidence(Evidence evidence) {
        this.evidence = evidence;
    }

    /**
     * <p>
     * The evidence returned by the <code>GetEvidenceResponse</code> API.
     * </p>
     * 
     * @return The evidence returned by the <code>GetEvidenceResponse</code> API.
     */

    public Evidence getEvidence() {
        return this.evidence;
    }

    /**
     * <p>
     * The evidence returned by the <code>GetEvidenceResponse</code> API.
     * </p>
     * 
     * @param evidence
     *        The evidence returned by the <code>GetEvidenceResponse</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceResult withEvidence(Evidence evidence) {
        setEvidence(evidence);
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
            sb.append("Evidence: ").append(getEvidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEvidenceResult == false)
            return false;
        GetEvidenceResult other = (GetEvidenceResult) obj;
        if (other.getEvidence() == null ^ this.getEvidence() == null)
            return false;
        if (other.getEvidence() != null && other.getEvidence().equals(this.getEvidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvidence() == null) ? 0 : getEvidence().hashCode());
        return hashCode;
    }

    @Override
    public GetEvidenceResult clone() {
        try {
            return (GetEvidenceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
