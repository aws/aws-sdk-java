/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListIntegrationAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIntegrationAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AppIntegration associations.
     * </p>
     */
    private java.util.List<IntegrationAssociationSummary> integrationAssociationSummaryList;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The AppIntegration associations.
     * </p>
     * 
     * @return The AppIntegration associations.
     */

    public java.util.List<IntegrationAssociationSummary> getIntegrationAssociationSummaryList() {
        return integrationAssociationSummaryList;
    }

    /**
     * <p>
     * The AppIntegration associations.
     * </p>
     * 
     * @param integrationAssociationSummaryList
     *        The AppIntegration associations.
     */

    public void setIntegrationAssociationSummaryList(java.util.Collection<IntegrationAssociationSummary> integrationAssociationSummaryList) {
        if (integrationAssociationSummaryList == null) {
            this.integrationAssociationSummaryList = null;
            return;
        }

        this.integrationAssociationSummaryList = new java.util.ArrayList<IntegrationAssociationSummary>(integrationAssociationSummaryList);
    }

    /**
     * <p>
     * The AppIntegration associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntegrationAssociationSummaryList(java.util.Collection)} or
     * {@link #withIntegrationAssociationSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param integrationAssociationSummaryList
     *        The AppIntegration associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationAssociationsResult withIntegrationAssociationSummaryList(IntegrationAssociationSummary... integrationAssociationSummaryList) {
        if (this.integrationAssociationSummaryList == null) {
            setIntegrationAssociationSummaryList(new java.util.ArrayList<IntegrationAssociationSummary>(integrationAssociationSummaryList.length));
        }
        for (IntegrationAssociationSummary ele : integrationAssociationSummaryList) {
            this.integrationAssociationSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AppIntegration associations.
     * </p>
     * 
     * @param integrationAssociationSummaryList
     *        The AppIntegration associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationAssociationsResult withIntegrationAssociationSummaryList(
            java.util.Collection<IntegrationAssociationSummary> integrationAssociationSummaryList) {
        setIntegrationAssociationSummaryList(integrationAssociationSummaryList);
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

    public ListIntegrationAssociationsResult withNextToken(String nextToken) {
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
        if (getIntegrationAssociationSummaryList() != null)
            sb.append("IntegrationAssociationSummaryList: ").append(getIntegrationAssociationSummaryList()).append(",");
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

        if (obj instanceof ListIntegrationAssociationsResult == false)
            return false;
        ListIntegrationAssociationsResult other = (ListIntegrationAssociationsResult) obj;
        if (other.getIntegrationAssociationSummaryList() == null ^ this.getIntegrationAssociationSummaryList() == null)
            return false;
        if (other.getIntegrationAssociationSummaryList() != null
                && other.getIntegrationAssociationSummaryList().equals(this.getIntegrationAssociationSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getIntegrationAssociationSummaryList() == null) ? 0 : getIntegrationAssociationSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIntegrationAssociationsResult clone() {
        try {
            return (ListIntegrationAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
