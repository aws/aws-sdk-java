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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListAccessControlConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessControlConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token, which you can use in the subsequent request to
     * retrieve the next set of access control configurations.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The details of your access control configurations.
     * </p>
     */
    private java.util.List<AccessControlConfigurationSummary> accessControlConfigurations;

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token, which you can use in the subsequent request to
     * retrieve the next set of access control configurations.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token, which you can use in the subsequent
     *        request to retrieve the next set of access control configurations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token, which you can use in the subsequent request to
     * retrieve the next set of access control configurations.
     * </p>
     * 
     * @return If the response is truncated, Amazon Kendra returns this token, which you can use in the subsequent
     *         request to retrieve the next set of access control configurations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token, which you can use in the subsequent request to
     * retrieve the next set of access control configurations.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token, which you can use in the subsequent
     *        request to retrieve the next set of access control configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessControlConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The details of your access control configurations.
     * </p>
     * 
     * @return The details of your access control configurations.
     */

    public java.util.List<AccessControlConfigurationSummary> getAccessControlConfigurations() {
        return accessControlConfigurations;
    }

    /**
     * <p>
     * The details of your access control configurations.
     * </p>
     * 
     * @param accessControlConfigurations
     *        The details of your access control configurations.
     */

    public void setAccessControlConfigurations(java.util.Collection<AccessControlConfigurationSummary> accessControlConfigurations) {
        if (accessControlConfigurations == null) {
            this.accessControlConfigurations = null;
            return;
        }

        this.accessControlConfigurations = new java.util.ArrayList<AccessControlConfigurationSummary>(accessControlConfigurations);
    }

    /**
     * <p>
     * The details of your access control configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessControlConfigurations(java.util.Collection)} or
     * {@link #withAccessControlConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param accessControlConfigurations
     *        The details of your access control configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessControlConfigurationsResult withAccessControlConfigurations(AccessControlConfigurationSummary... accessControlConfigurations) {
        if (this.accessControlConfigurations == null) {
            setAccessControlConfigurations(new java.util.ArrayList<AccessControlConfigurationSummary>(accessControlConfigurations.length));
        }
        for (AccessControlConfigurationSummary ele : accessControlConfigurations) {
            this.accessControlConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of your access control configurations.
     * </p>
     * 
     * @param accessControlConfigurations
     *        The details of your access control configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessControlConfigurationsResult withAccessControlConfigurations(
            java.util.Collection<AccessControlConfigurationSummary> accessControlConfigurations) {
        setAccessControlConfigurations(accessControlConfigurations);
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
        if (getAccessControlConfigurations() != null)
            sb.append("AccessControlConfigurations: ").append(getAccessControlConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccessControlConfigurationsResult == false)
            return false;
        ListAccessControlConfigurationsResult other = (ListAccessControlConfigurationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAccessControlConfigurations() == null ^ this.getAccessControlConfigurations() == null)
            return false;
        if (other.getAccessControlConfigurations() != null && other.getAccessControlConfigurations().equals(this.getAccessControlConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAccessControlConfigurations() == null) ? 0 : getAccessControlConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessControlConfigurationsResult clone() {
        try {
            return (ListAccessControlConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
