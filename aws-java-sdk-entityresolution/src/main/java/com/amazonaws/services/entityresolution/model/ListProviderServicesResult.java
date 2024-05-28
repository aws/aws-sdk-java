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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListProviderServices"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProviderServicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of <code>ProviderServices</code> objects.
     * </p>
     */
    private java.util.List<ProviderServiceSummary> providerServiceSummaries;

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @return The pagination token from the previous API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProviderServicesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of <code>ProviderServices</code> objects.
     * </p>
     * 
     * @return A list of <code>ProviderServices</code> objects.
     */

    public java.util.List<ProviderServiceSummary> getProviderServiceSummaries() {
        return providerServiceSummaries;
    }

    /**
     * <p>
     * A list of <code>ProviderServices</code> objects.
     * </p>
     * 
     * @param providerServiceSummaries
     *        A list of <code>ProviderServices</code> objects.
     */

    public void setProviderServiceSummaries(java.util.Collection<ProviderServiceSummary> providerServiceSummaries) {
        if (providerServiceSummaries == null) {
            this.providerServiceSummaries = null;
            return;
        }

        this.providerServiceSummaries = new java.util.ArrayList<ProviderServiceSummary>(providerServiceSummaries);
    }

    /**
     * <p>
     * A list of <code>ProviderServices</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProviderServiceSummaries(java.util.Collection)} or
     * {@link #withProviderServiceSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param providerServiceSummaries
     *        A list of <code>ProviderServices</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProviderServicesResult withProviderServiceSummaries(ProviderServiceSummary... providerServiceSummaries) {
        if (this.providerServiceSummaries == null) {
            setProviderServiceSummaries(new java.util.ArrayList<ProviderServiceSummary>(providerServiceSummaries.length));
        }
        for (ProviderServiceSummary ele : providerServiceSummaries) {
            this.providerServiceSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ProviderServices</code> objects.
     * </p>
     * 
     * @param providerServiceSummaries
     *        A list of <code>ProviderServices</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProviderServicesResult withProviderServiceSummaries(java.util.Collection<ProviderServiceSummary> providerServiceSummaries) {
        setProviderServiceSummaries(providerServiceSummaries);
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
        if (getProviderServiceSummaries() != null)
            sb.append("ProviderServiceSummaries: ").append(getProviderServiceSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProviderServicesResult == false)
            return false;
        ListProviderServicesResult other = (ListProviderServicesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProviderServiceSummaries() == null ^ this.getProviderServiceSummaries() == null)
            return false;
        if (other.getProviderServiceSummaries() != null && other.getProviderServiceSummaries().equals(this.getProviderServiceSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProviderServiceSummaries() == null) ? 0 : getProviderServiceSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListProviderServicesResult clone() {
        try {
            return (ListProviderServicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
