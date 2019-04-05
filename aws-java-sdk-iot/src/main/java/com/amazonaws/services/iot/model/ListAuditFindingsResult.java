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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAuditFindingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The findings (results) of the audit.
     * </p>
     */
    private java.util.List<AuditFinding> findings;
    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The findings (results) of the audit.
     * </p>
     * 
     * @return The findings (results) of the audit.
     */

    public java.util.List<AuditFinding> getFindings() {
        return findings;
    }

    /**
     * <p>
     * The findings (results) of the audit.
     * </p>
     * 
     * @param findings
     *        The findings (results) of the audit.
     */

    public void setFindings(java.util.Collection<AuditFinding> findings) {
        if (findings == null) {
            this.findings = null;
            return;
        }

        this.findings = new java.util.ArrayList<AuditFinding>(findings);
    }

    /**
     * <p>
     * The findings (results) of the audit.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindings(java.util.Collection)} or {@link #withFindings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param findings
     *        The findings (results) of the audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditFindingsResult withFindings(AuditFinding... findings) {
        if (this.findings == null) {
            setFindings(new java.util.ArrayList<AuditFinding>(findings.length));
        }
        for (AuditFinding ele : findings) {
            this.findings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The findings (results) of the audit.
     * </p>
     * 
     * @param findings
     *        The findings (results) of the audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditFindingsResult withFindings(java.util.Collection<AuditFinding> findings) {
        setFindings(findings);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *        additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @return A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *         additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *        additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditFindingsResult withNextToken(String nextToken) {
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
        if (getFindings() != null)
            sb.append("Findings: ").append(getFindings()).append(",");
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

        if (obj instanceof ListAuditFindingsResult == false)
            return false;
        ListAuditFindingsResult other = (ListAuditFindingsResult) obj;
        if (other.getFindings() == null ^ this.getFindings() == null)
            return false;
        if (other.getFindings() != null && other.getFindings().equals(this.getFindings()) == false)
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

        hashCode = prime * hashCode + ((getFindings() == null) ? 0 : getFindings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAuditFindingsResult clone() {
        try {
            return (ListAuditFindingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
