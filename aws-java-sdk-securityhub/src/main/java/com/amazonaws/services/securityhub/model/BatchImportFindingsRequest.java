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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchImportFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of findings that you want to import. Must be submitted in the AWSSecurityFinding format.
     * </p>
     */
    private java.util.List<AwsSecurityFinding> findings;

    /**
     * <p>
     * A list of findings that you want to import. Must be submitted in the AWSSecurityFinding format.
     * </p>
     * 
     * @return A list of findings that you want to import. Must be submitted in the AWSSecurityFinding format.
     */

    public java.util.List<AwsSecurityFinding> getFindings() {
        return findings;
    }

    /**
     * <p>
     * A list of findings that you want to import. Must be submitted in the AWSSecurityFinding format.
     * </p>
     * 
     * @param findings
     *        A list of findings that you want to import. Must be submitted in the AWSSecurityFinding format.
     */

    public void setFindings(java.util.Collection<AwsSecurityFinding> findings) {
        if (findings == null) {
            this.findings = null;
            return;
        }

        this.findings = new java.util.ArrayList<AwsSecurityFinding>(findings);
    }

    /**
     * <p>
     * A list of findings that you want to import. Must be submitted in the AWSSecurityFinding format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindings(java.util.Collection)} or {@link #withFindings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param findings
     *        A list of findings that you want to import. Must be submitted in the AWSSecurityFinding format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImportFindingsRequest withFindings(AwsSecurityFinding... findings) {
        if (this.findings == null) {
            setFindings(new java.util.ArrayList<AwsSecurityFinding>(findings.length));
        }
        for (AwsSecurityFinding ele : findings) {
            this.findings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of findings that you want to import. Must be submitted in the AWSSecurityFinding format.
     * </p>
     * 
     * @param findings
     *        A list of findings that you want to import. Must be submitted in the AWSSecurityFinding format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImportFindingsRequest withFindings(java.util.Collection<AwsSecurityFinding> findings) {
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

        if (obj instanceof BatchImportFindingsRequest == false)
            return false;
        BatchImportFindingsRequest other = (BatchImportFindingsRequest) obj;
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

        hashCode = prime * hashCode + ((getFindings() == null) ? 0 : getFindings().hashCode());
        return hashCode;
    }

    @Override
    public BatchImportFindingsRequest clone() {
        return (BatchImportFindingsRequest) super.clone();
    }

}
