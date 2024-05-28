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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTemplateGroupAccessControlEntries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplateGroupAccessControlEntriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An access control entry grants or denies permission to an Active Directory group to enroll certificates for a
     * template.
     * </p>
     */
    private java.util.List<AccessControlEntrySummary> accessControlEntries;
    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An access control entry grants or denies permission to an Active Directory group to enroll certificates for a
     * template.
     * </p>
     * 
     * @return An access control entry grants or denies permission to an Active Directory group to enroll certificates
     *         for a template.
     */

    public java.util.List<AccessControlEntrySummary> getAccessControlEntries() {
        return accessControlEntries;
    }

    /**
     * <p>
     * An access control entry grants or denies permission to an Active Directory group to enroll certificates for a
     * template.
     * </p>
     * 
     * @param accessControlEntries
     *        An access control entry grants or denies permission to an Active Directory group to enroll certificates
     *        for a template.
     */

    public void setAccessControlEntries(java.util.Collection<AccessControlEntrySummary> accessControlEntries) {
        if (accessControlEntries == null) {
            this.accessControlEntries = null;
            return;
        }

        this.accessControlEntries = new java.util.ArrayList<AccessControlEntrySummary>(accessControlEntries);
    }

    /**
     * <p>
     * An access control entry grants or denies permission to an Active Directory group to enroll certificates for a
     * template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessControlEntries(java.util.Collection)} or {@link #withAccessControlEntries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param accessControlEntries
     *        An access control entry grants or denies permission to an Active Directory group to enroll certificates
     *        for a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateGroupAccessControlEntriesResult withAccessControlEntries(AccessControlEntrySummary... accessControlEntries) {
        if (this.accessControlEntries == null) {
            setAccessControlEntries(new java.util.ArrayList<AccessControlEntrySummary>(accessControlEntries.length));
        }
        for (AccessControlEntrySummary ele : accessControlEntries) {
            this.accessControlEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An access control entry grants or denies permission to an Active Directory group to enroll certificates for a
     * template.
     * </p>
     * 
     * @param accessControlEntries
     *        An access control entry grants or denies permission to an Active Directory group to enroll certificates
     *        for a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateGroupAccessControlEntriesResult withAccessControlEntries(java.util.Collection<AccessControlEntrySummary> accessControlEntries) {
        setAccessControlEntries(accessControlEntries);
        return this;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter when paginating results in a subsequent request after you receive a response with
     *        truncated results. Set it to the value of the <code>NextToken</code> parameter from the response you just
     *        received.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     * 
     * @return Use this parameter when paginating results in a subsequent request after you receive a response with
     *         truncated results. Set it to the value of the <code>NextToken</code> parameter from the response you just
     *         received.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter when paginating results in a subsequent request after you receive a response with
     *        truncated results. Set it to the value of the <code>NextToken</code> parameter from the response you just
     *        received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateGroupAccessControlEntriesResult withNextToken(String nextToken) {
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
        if (getAccessControlEntries() != null)
            sb.append("AccessControlEntries: ").append(getAccessControlEntries()).append(",");
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

        if (obj instanceof ListTemplateGroupAccessControlEntriesResult == false)
            return false;
        ListTemplateGroupAccessControlEntriesResult other = (ListTemplateGroupAccessControlEntriesResult) obj;
        if (other.getAccessControlEntries() == null ^ this.getAccessControlEntries() == null)
            return false;
        if (other.getAccessControlEntries() != null && other.getAccessControlEntries().equals(this.getAccessControlEntries()) == false)
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

        hashCode = prime * hashCode + ((getAccessControlEntries() == null) ? 0 : getAccessControlEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTemplateGroupAccessControlEntriesResult clone() {
        try {
            return (ListTemplateGroupAccessControlEntriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
