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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ValidatePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidatePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of findings in a policy returned by Access Analyzer based on its suite of policy checks.
     * </p>
     */
    private java.util.List<ValidatePolicyFinding> findings;
    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of findings in a policy returned by Access Analyzer based on its suite of policy checks.
     * </p>
     * 
     * @return The list of findings in a policy returned by Access Analyzer based on its suite of policy checks.
     */

    public java.util.List<ValidatePolicyFinding> getFindings() {
        return findings;
    }

    /**
     * <p>
     * The list of findings in a policy returned by Access Analyzer based on its suite of policy checks.
     * </p>
     * 
     * @param findings
     *        The list of findings in a policy returned by Access Analyzer based on its suite of policy checks.
     */

    public void setFindings(java.util.Collection<ValidatePolicyFinding> findings) {
        if (findings == null) {
            this.findings = null;
            return;
        }

        this.findings = new java.util.ArrayList<ValidatePolicyFinding>(findings);
    }

    /**
     * <p>
     * The list of findings in a policy returned by Access Analyzer based on its suite of policy checks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindings(java.util.Collection)} or {@link #withFindings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param findings
     *        The list of findings in a policy returned by Access Analyzer based on its suite of policy checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePolicyResult withFindings(ValidatePolicyFinding... findings) {
        if (this.findings == null) {
            setFindings(new java.util.ArrayList<ValidatePolicyFinding>(findings.length));
        }
        for (ValidatePolicyFinding ele : findings) {
            this.findings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of findings in a policy returned by Access Analyzer based on its suite of policy checks.
     * </p>
     * 
     * @param findings
     *        The list of findings in a policy returned by Access Analyzer based on its suite of policy checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePolicyResult withFindings(java.util.Collection<ValidatePolicyFinding> findings) {
        setFindings(findings);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @return A token used for pagination of results returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePolicyResult withNextToken(String nextToken) {
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

        if (obj instanceof ValidatePolicyResult == false)
            return false;
        ValidatePolicyResult other = (ValidatePolicyResult) obj;
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
    public ValidatePolicyResult clone() {
        try {
            return (ValidatePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
