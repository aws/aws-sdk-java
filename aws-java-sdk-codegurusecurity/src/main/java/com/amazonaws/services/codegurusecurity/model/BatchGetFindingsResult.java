/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/BatchGetFindings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetFindingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of errors for individual findings which were not fetched. Each BatchGetFindingsError contains the
     * <code>scanName</code>, <code>findingId</code>, <code>errorCode</code> and error <code>message</code>.
     * </p>
     */
    private java.util.List<BatchGetFindingsError> failedFindings;
    /**
     * <p>
     * A list of all requested findings.
     * </p>
     */
    private java.util.List<Finding> findings;

    /**
     * <p>
     * A list of errors for individual findings which were not fetched. Each BatchGetFindingsError contains the
     * <code>scanName</code>, <code>findingId</code>, <code>errorCode</code> and error <code>message</code>.
     * </p>
     * 
     * @return A list of errors for individual findings which were not fetched. Each BatchGetFindingsError contains the
     *         <code>scanName</code>, <code>findingId</code>, <code>errorCode</code> and error <code>message</code>.
     */

    public java.util.List<BatchGetFindingsError> getFailedFindings() {
        return failedFindings;
    }

    /**
     * <p>
     * A list of errors for individual findings which were not fetched. Each BatchGetFindingsError contains the
     * <code>scanName</code>, <code>findingId</code>, <code>errorCode</code> and error <code>message</code>.
     * </p>
     * 
     * @param failedFindings
     *        A list of errors for individual findings which were not fetched. Each BatchGetFindingsError contains the
     *        <code>scanName</code>, <code>findingId</code>, <code>errorCode</code> and error <code>message</code>.
     */

    public void setFailedFindings(java.util.Collection<BatchGetFindingsError> failedFindings) {
        if (failedFindings == null) {
            this.failedFindings = null;
            return;
        }

        this.failedFindings = new java.util.ArrayList<BatchGetFindingsError>(failedFindings);
    }

    /**
     * <p>
     * A list of errors for individual findings which were not fetched. Each BatchGetFindingsError contains the
     * <code>scanName</code>, <code>findingId</code>, <code>errorCode</code> and error <code>message</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedFindings(java.util.Collection)} or {@link #withFailedFindings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failedFindings
     *        A list of errors for individual findings which were not fetched. Each BatchGetFindingsError contains the
     *        <code>scanName</code>, <code>findingId</code>, <code>errorCode</code> and error <code>message</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingsResult withFailedFindings(BatchGetFindingsError... failedFindings) {
        if (this.failedFindings == null) {
            setFailedFindings(new java.util.ArrayList<BatchGetFindingsError>(failedFindings.length));
        }
        for (BatchGetFindingsError ele : failedFindings) {
            this.failedFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors for individual findings which were not fetched. Each BatchGetFindingsError contains the
     * <code>scanName</code>, <code>findingId</code>, <code>errorCode</code> and error <code>message</code>.
     * </p>
     * 
     * @param failedFindings
     *        A list of errors for individual findings which were not fetched. Each BatchGetFindingsError contains the
     *        <code>scanName</code>, <code>findingId</code>, <code>errorCode</code> and error <code>message</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingsResult withFailedFindings(java.util.Collection<BatchGetFindingsError> failedFindings) {
        setFailedFindings(failedFindings);
        return this;
    }

    /**
     * <p>
     * A list of all requested findings.
     * </p>
     * 
     * @return A list of all requested findings.
     */

    public java.util.List<Finding> getFindings() {
        return findings;
    }

    /**
     * <p>
     * A list of all requested findings.
     * </p>
     * 
     * @param findings
     *        A list of all requested findings.
     */

    public void setFindings(java.util.Collection<Finding> findings) {
        if (findings == null) {
            this.findings = null;
            return;
        }

        this.findings = new java.util.ArrayList<Finding>(findings);
    }

    /**
     * <p>
     * A list of all requested findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindings(java.util.Collection)} or {@link #withFindings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param findings
     *        A list of all requested findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingsResult withFindings(Finding... findings) {
        if (this.findings == null) {
            setFindings(new java.util.ArrayList<Finding>(findings.length));
        }
        for (Finding ele : findings) {
            this.findings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all requested findings.
     * </p>
     * 
     * @param findings
     *        A list of all requested findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingsResult withFindings(java.util.Collection<Finding> findings) {
        setFindings(findings);
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
        if (getFailedFindings() != null)
            sb.append("FailedFindings: ").append(getFailedFindings()).append(",");
        if (getFindings() != null)
            sb.append("Findings: ").append(getFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetFindingsResult == false)
            return false;
        BatchGetFindingsResult other = (BatchGetFindingsResult) obj;
        if (other.getFailedFindings() == null ^ this.getFailedFindings() == null)
            return false;
        if (other.getFailedFindings() != null && other.getFailedFindings().equals(this.getFailedFindings()) == false)
            return false;
        if (other.getFindings() == null ^ this.getFindings() == null)
            return false;
        if (other.getFindings() != null && other.getFindings().equals(this.getFindings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedFindings() == null) ? 0 : getFailedFindings().hashCode());
        hashCode = prime * hashCode + ((getFindings() == null) ? 0 : getFindings().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetFindingsResult clone() {
        try {
            return (BatchGetFindingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
