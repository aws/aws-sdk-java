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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of all of the identities that you've attempted to verify for use with Amazon Pinpoint, regardless of whether
 * or not those identities were successfully verified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListEmailIdentities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEmailIdentitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array that includes all of the identities associated with your Amazon Pinpoint account.
     * </p>
     */
    private java.util.List<IdentityInfo> emailIdentities;
    /**
     * <p>
     * A token that indicates that there are additional configuration sets to list. To view additional configuration
     * sets, issue another request to <code>ListEmailIdentities</code>, and pass this token in the
     * <code>NextToken</code> parameter.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array that includes all of the identities associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @return An array that includes all of the identities associated with your Amazon Pinpoint account.
     */

    public java.util.List<IdentityInfo> getEmailIdentities() {
        return emailIdentities;
    }

    /**
     * <p>
     * An array that includes all of the identities associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param emailIdentities
     *        An array that includes all of the identities associated with your Amazon Pinpoint account.
     */

    public void setEmailIdentities(java.util.Collection<IdentityInfo> emailIdentities) {
        if (emailIdentities == null) {
            this.emailIdentities = null;
            return;
        }

        this.emailIdentities = new java.util.ArrayList<IdentityInfo>(emailIdentities);
    }

    /**
     * <p>
     * An array that includes all of the identities associated with your Amazon Pinpoint account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEmailIdentities(java.util.Collection)} or {@link #withEmailIdentities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param emailIdentities
     *        An array that includes all of the identities associated with your Amazon Pinpoint account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEmailIdentitiesResult withEmailIdentities(IdentityInfo... emailIdentities) {
        if (this.emailIdentities == null) {
            setEmailIdentities(new java.util.ArrayList<IdentityInfo>(emailIdentities.length));
        }
        for (IdentityInfo ele : emailIdentities) {
            this.emailIdentities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that includes all of the identities associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param emailIdentities
     *        An array that includes all of the identities associated with your Amazon Pinpoint account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEmailIdentitiesResult withEmailIdentities(java.util.Collection<IdentityInfo> emailIdentities) {
        setEmailIdentities(emailIdentities);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there are additional configuration sets to list. To view additional configuration
     * sets, issue another request to <code>ListEmailIdentities</code>, and pass this token in the
     * <code>NextToken</code> parameter.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there are additional configuration sets to list. To view additional
     *        configuration sets, issue another request to <code>ListEmailIdentities</code>, and pass this token in the
     *        <code>NextToken</code> parameter.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there are additional configuration sets to list. To view additional configuration
     * sets, issue another request to <code>ListEmailIdentities</code>, and pass this token in the
     * <code>NextToken</code> parameter.
     * </p>
     * 
     * @return A token that indicates that there are additional configuration sets to list. To view additional
     *         configuration sets, issue another request to <code>ListEmailIdentities</code>, and pass this token in the
     *         <code>NextToken</code> parameter.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there are additional configuration sets to list. To view additional configuration
     * sets, issue another request to <code>ListEmailIdentities</code>, and pass this token in the
     * <code>NextToken</code> parameter.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there are additional configuration sets to list. To view additional
     *        configuration sets, issue another request to <code>ListEmailIdentities</code>, and pass this token in the
     *        <code>NextToken</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEmailIdentitiesResult withNextToken(String nextToken) {
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
        if (getEmailIdentities() != null)
            sb.append("EmailIdentities: ").append(getEmailIdentities()).append(",");
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

        if (obj instanceof ListEmailIdentitiesResult == false)
            return false;
        ListEmailIdentitiesResult other = (ListEmailIdentitiesResult) obj;
        if (other.getEmailIdentities() == null ^ this.getEmailIdentities() == null)
            return false;
        if (other.getEmailIdentities() != null && other.getEmailIdentities().equals(this.getEmailIdentities()) == false)
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

        hashCode = prime * hashCode + ((getEmailIdentities() == null) ? 0 : getEmailIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEmailIdentitiesResult clone() {
        try {
            return (ListEmailIdentitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
