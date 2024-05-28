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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/SearchVulnerabilities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchVulnerabilitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Details about the listed vulnerability.
     * </p>
     */
    private java.util.List<Vulnerability> vulnerabilities;

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @param nextToken
     *        The pagination parameter to be used on the next list operation to retrieve more items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @return The pagination parameter to be used on the next list operation to retrieve more items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @param nextToken
     *        The pagination parameter to be used on the next list operation to retrieve more items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchVulnerabilitiesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Details about the listed vulnerability.
     * </p>
     * 
     * @return Details about the listed vulnerability.
     */

    public java.util.List<Vulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

    /**
     * <p>
     * Details about the listed vulnerability.
     * </p>
     * 
     * @param vulnerabilities
     *        Details about the listed vulnerability.
     */

    public void setVulnerabilities(java.util.Collection<Vulnerability> vulnerabilities) {
        if (vulnerabilities == null) {
            this.vulnerabilities = null;
            return;
        }

        this.vulnerabilities = new java.util.ArrayList<Vulnerability>(vulnerabilities);
    }

    /**
     * <p>
     * Details about the listed vulnerability.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVulnerabilities(java.util.Collection)} or {@link #withVulnerabilities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param vulnerabilities
     *        Details about the listed vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchVulnerabilitiesResult withVulnerabilities(Vulnerability... vulnerabilities) {
        if (this.vulnerabilities == null) {
            setVulnerabilities(new java.util.ArrayList<Vulnerability>(vulnerabilities.length));
        }
        for (Vulnerability ele : vulnerabilities) {
            this.vulnerabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the listed vulnerability.
     * </p>
     * 
     * @param vulnerabilities
     *        Details about the listed vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchVulnerabilitiesResult withVulnerabilities(java.util.Collection<Vulnerability> vulnerabilities) {
        setVulnerabilities(vulnerabilities);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getVulnerabilities() != null)
            sb.append("Vulnerabilities: ").append(getVulnerabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchVulnerabilitiesResult == false)
            return false;
        SearchVulnerabilitiesResult other = (SearchVulnerabilitiesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVulnerabilities() == null ^ this.getVulnerabilities() == null)
            return false;
        if (other.getVulnerabilities() != null && other.getVulnerabilities().equals(this.getVulnerabilities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVulnerabilities() == null) ? 0 : getVulnerabilities().hashCode());
        return hashCode;
    }

    @Override
    public SearchVulnerabilitiesResult clone() {
        try {
            return (SearchVulnerabilitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
