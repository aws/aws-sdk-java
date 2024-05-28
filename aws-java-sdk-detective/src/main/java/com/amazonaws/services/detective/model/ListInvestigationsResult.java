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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListInvestigations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInvestigationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the summary of uncommon behavior or malicious activity which indicates a compromise.
     * </p>
     */
    private java.util.List<InvestigationDetail> investigationDetails;
    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the summary of uncommon behavior or malicious activity which indicates a compromise.
     * </p>
     * 
     * @return Lists the summary of uncommon behavior or malicious activity which indicates a compromise.
     */

    public java.util.List<InvestigationDetail> getInvestigationDetails() {
        return investigationDetails;
    }

    /**
     * <p>
     * Lists the summary of uncommon behavior or malicious activity which indicates a compromise.
     * </p>
     * 
     * @param investigationDetails
     *        Lists the summary of uncommon behavior or malicious activity which indicates a compromise.
     */

    public void setInvestigationDetails(java.util.Collection<InvestigationDetail> investigationDetails) {
        if (investigationDetails == null) {
            this.investigationDetails = null;
            return;
        }

        this.investigationDetails = new java.util.ArrayList<InvestigationDetail>(investigationDetails);
    }

    /**
     * <p>
     * Lists the summary of uncommon behavior or malicious activity which indicates a compromise.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvestigationDetails(java.util.Collection)} or {@link #withInvestigationDetails(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param investigationDetails
     *        Lists the summary of uncommon behavior or malicious activity which indicates a compromise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvestigationsResult withInvestigationDetails(InvestigationDetail... investigationDetails) {
        if (this.investigationDetails == null) {
            setInvestigationDetails(new java.util.ArrayList<InvestigationDetail>(investigationDetails.length));
        }
        for (InvestigationDetail ele : investigationDetails) {
            this.investigationDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the summary of uncommon behavior or malicious activity which indicates a compromise.
     * </p>
     * 
     * @param investigationDetails
     *        Lists the summary of uncommon behavior or malicious activity which indicates a compromise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvestigationsResult withInvestigationDetails(java.util.Collection<InvestigationDetail> investigationDetails) {
        setInvestigationDetails(investigationDetails);
        return this;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        Each pagination token expires after 24 hours.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours.
     * </p>
     * 
     * @return Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *         page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *         unchanged.</p>
     *         <p>
     *         Each pagination token expires after 24 hours.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        Each pagination token expires after 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvestigationsResult withNextToken(String nextToken) {
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
        if (getInvestigationDetails() != null)
            sb.append("InvestigationDetails: ").append(getInvestigationDetails()).append(",");
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

        if (obj instanceof ListInvestigationsResult == false)
            return false;
        ListInvestigationsResult other = (ListInvestigationsResult) obj;
        if (other.getInvestigationDetails() == null ^ this.getInvestigationDetails() == null)
            return false;
        if (other.getInvestigationDetails() != null && other.getInvestigationDetails().equals(this.getInvestigationDetails()) == false)
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

        hashCode = prime * hashCode + ((getInvestigationDetails() == null) ? 0 : getInvestigationDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInvestigationsResult clone() {
        try {
            return (ListInvestigationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
