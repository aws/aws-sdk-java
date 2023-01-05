/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailDomains" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMailDomainsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of mail domain summaries, specifying domains that exist in the specified WorkMail organization, along
     * with the information about whether the domain is or isn't the default.
     * </p>
     */
    private java.util.List<MailDomainSummary> mailDomains;
    /**
     * <p>
     * The token to use to retrieve the next page of results. The value becomes <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of mail domain summaries, specifying domains that exist in the specified WorkMail organization, along
     * with the information about whether the domain is or isn't the default.
     * </p>
     * 
     * @return The list of mail domain summaries, specifying domains that exist in the specified WorkMail organization,
     *         along with the information about whether the domain is or isn't the default.
     */

    public java.util.List<MailDomainSummary> getMailDomains() {
        return mailDomains;
    }

    /**
     * <p>
     * The list of mail domain summaries, specifying domains that exist in the specified WorkMail organization, along
     * with the information about whether the domain is or isn't the default.
     * </p>
     * 
     * @param mailDomains
     *        The list of mail domain summaries, specifying domains that exist in the specified WorkMail organization,
     *        along with the information about whether the domain is or isn't the default.
     */

    public void setMailDomains(java.util.Collection<MailDomainSummary> mailDomains) {
        if (mailDomains == null) {
            this.mailDomains = null;
            return;
        }

        this.mailDomains = new java.util.ArrayList<MailDomainSummary>(mailDomains);
    }

    /**
     * <p>
     * The list of mail domain summaries, specifying domains that exist in the specified WorkMail organization, along
     * with the information about whether the domain is or isn't the default.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMailDomains(java.util.Collection)} or {@link #withMailDomains(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mailDomains
     *        The list of mail domain summaries, specifying domains that exist in the specified WorkMail organization,
     *        along with the information about whether the domain is or isn't the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMailDomainsResult withMailDomains(MailDomainSummary... mailDomains) {
        if (this.mailDomains == null) {
            setMailDomains(new java.util.ArrayList<MailDomainSummary>(mailDomains.length));
        }
        for (MailDomainSummary ele : mailDomains) {
            this.mailDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of mail domain summaries, specifying domains that exist in the specified WorkMail organization, along
     * with the information about whether the domain is or isn't the default.
     * </p>
     * 
     * @param mailDomains
     *        The list of mail domain summaries, specifying domains that exist in the specified WorkMail organization,
     *        along with the information about whether the domain is or isn't the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMailDomainsResult withMailDomains(java.util.Collection<MailDomainSummary> mailDomains) {
        setMailDomains(mailDomains);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value becomes <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value becomes <code>null</code> when there are
     *        no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value becomes <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. The value becomes <code>null</code> when there are
     *         no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value becomes <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value becomes <code>null</code> when there are
     *        no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMailDomainsResult withNextToken(String nextToken) {
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
        if (getMailDomains() != null)
            sb.append("MailDomains: ").append(getMailDomains()).append(",");
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

        if (obj instanceof ListMailDomainsResult == false)
            return false;
        ListMailDomainsResult other = (ListMailDomainsResult) obj;
        if (other.getMailDomains() == null ^ this.getMailDomains() == null)
            return false;
        if (other.getMailDomains() != null && other.getMailDomains().equals(this.getMailDomains()) == false)
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

        hashCode = prime * hashCode + ((getMailDomains() == null) ? 0 : getMailDomains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMailDomainsResult clone() {
        try {
            return (ListMailDomainsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
