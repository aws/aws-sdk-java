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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListDataIntegrations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataIntegrationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The DataIntegrations associated with this account.
     * </p>
     */
    private java.util.List<DataIntegrationSummary> dataIntegrations;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The DataIntegrations associated with this account.
     * </p>
     * 
     * @return The DataIntegrations associated with this account.
     */

    public java.util.List<DataIntegrationSummary> getDataIntegrations() {
        return dataIntegrations;
    }

    /**
     * <p>
     * The DataIntegrations associated with this account.
     * </p>
     * 
     * @param dataIntegrations
     *        The DataIntegrations associated with this account.
     */

    public void setDataIntegrations(java.util.Collection<DataIntegrationSummary> dataIntegrations) {
        if (dataIntegrations == null) {
            this.dataIntegrations = null;
            return;
        }

        this.dataIntegrations = new java.util.ArrayList<DataIntegrationSummary>(dataIntegrations);
    }

    /**
     * <p>
     * The DataIntegrations associated with this account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataIntegrations(java.util.Collection)} or {@link #withDataIntegrations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dataIntegrations
     *        The DataIntegrations associated with this account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataIntegrationsResult withDataIntegrations(DataIntegrationSummary... dataIntegrations) {
        if (this.dataIntegrations == null) {
            setDataIntegrations(new java.util.ArrayList<DataIntegrationSummary>(dataIntegrations.length));
        }
        for (DataIntegrationSummary ele : dataIntegrations) {
            this.dataIntegrations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The DataIntegrations associated with this account.
     * </p>
     * 
     * @param dataIntegrations
     *        The DataIntegrations associated with this account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataIntegrationsResult withDataIntegrations(java.util.Collection<DataIntegrationSummary> dataIntegrations) {
        setDataIntegrations(dataIntegrations);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataIntegrationsResult withNextToken(String nextToken) {
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
        if (getDataIntegrations() != null)
            sb.append("DataIntegrations: ").append(getDataIntegrations()).append(",");
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

        if (obj instanceof ListDataIntegrationsResult == false)
            return false;
        ListDataIntegrationsResult other = (ListDataIntegrationsResult) obj;
        if (other.getDataIntegrations() == null ^ this.getDataIntegrations() == null)
            return false;
        if (other.getDataIntegrations() != null && other.getDataIntegrations().equals(this.getDataIntegrations()) == false)
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

        hashCode = prime * hashCode + ((getDataIntegrations() == null) ? 0 : getDataIntegrations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDataIntegrationsResult clone() {
        try {
            return (ListDataIntegrationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
