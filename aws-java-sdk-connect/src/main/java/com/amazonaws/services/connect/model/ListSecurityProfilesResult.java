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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecurityProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>SecurityProfileSummary</code> objects.
     * </p>
     */
    private java.util.List<SecurityProfileSummary> securityProfileSummaryList;
    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>SecurityProfileSummary</code> objects.
     * </p>
     * 
     * @return An array of <code>SecurityProfileSummary</code> objects.
     */

    public java.util.List<SecurityProfileSummary> getSecurityProfileSummaryList() {
        return securityProfileSummaryList;
    }

    /**
     * <p>
     * An array of <code>SecurityProfileSummary</code> objects.
     * </p>
     * 
     * @param securityProfileSummaryList
     *        An array of <code>SecurityProfileSummary</code> objects.
     */

    public void setSecurityProfileSummaryList(java.util.Collection<SecurityProfileSummary> securityProfileSummaryList) {
        if (securityProfileSummaryList == null) {
            this.securityProfileSummaryList = null;
            return;
        }

        this.securityProfileSummaryList = new java.util.ArrayList<SecurityProfileSummary>(securityProfileSummaryList);
    }

    /**
     * <p>
     * An array of <code>SecurityProfileSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityProfileSummaryList(java.util.Collection)} or
     * {@link #withSecurityProfileSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param securityProfileSummaryList
     *        An array of <code>SecurityProfileSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilesResult withSecurityProfileSummaryList(SecurityProfileSummary... securityProfileSummaryList) {
        if (this.securityProfileSummaryList == null) {
            setSecurityProfileSummaryList(new java.util.ArrayList<SecurityProfileSummary>(securityProfileSummaryList.length));
        }
        for (SecurityProfileSummary ele : securityProfileSummaryList) {
            this.securityProfileSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>SecurityProfileSummary</code> objects.
     * </p>
     * 
     * @param securityProfileSummaryList
     *        An array of <code>SecurityProfileSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilesResult withSecurityProfileSummaryList(java.util.Collection<SecurityProfileSummary> securityProfileSummaryList) {
        setSecurityProfileSummaryList(securityProfileSummaryList);
        return this;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A string returned in the response. Use the value returned in the response as the value of the NextToken in
     *        a subsequent request to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * 
     * @return A string returned in the response. Use the value returned in the response as the value of the NextToken
     *         in a subsequent request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A string returned in the response. Use the value returned in the response as the value of the NextToken in
     *        a subsequent request to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilesResult withNextToken(String nextToken) {
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
        if (getSecurityProfileSummaryList() != null)
            sb.append("SecurityProfileSummaryList: ").append(getSecurityProfileSummaryList()).append(",");
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

        if (obj instanceof ListSecurityProfilesResult == false)
            return false;
        ListSecurityProfilesResult other = (ListSecurityProfilesResult) obj;
        if (other.getSecurityProfileSummaryList() == null ^ this.getSecurityProfileSummaryList() == null)
            return false;
        if (other.getSecurityProfileSummaryList() != null && other.getSecurityProfileSummaryList().equals(this.getSecurityProfileSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getSecurityProfileSummaryList() == null) ? 0 : getSecurityProfileSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityProfilesResult clone() {
        try {
            return (ListSecurityProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
