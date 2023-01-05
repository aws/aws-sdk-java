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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListEnvironments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of <code>EnvironmentSummary</code> objects.
     * </p>
     */
    private java.util.List<EnvironmentSummary> environmentSummaryList;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of <code>EnvironmentSummary</code> objects.
     * </p>
     * 
     * @return The list of <code>EnvironmentSummary</code> objects.
     */

    public java.util.List<EnvironmentSummary> getEnvironmentSummaryList() {
        return environmentSummaryList;
    }

    /**
     * <p>
     * The list of <code>EnvironmentSummary</code> objects.
     * </p>
     * 
     * @param environmentSummaryList
     *        The list of <code>EnvironmentSummary</code> objects.
     */

    public void setEnvironmentSummaryList(java.util.Collection<EnvironmentSummary> environmentSummaryList) {
        if (environmentSummaryList == null) {
            this.environmentSummaryList = null;
            return;
        }

        this.environmentSummaryList = new java.util.ArrayList<EnvironmentSummary>(environmentSummaryList);
    }

    /**
     * <p>
     * The list of <code>EnvironmentSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentSummaryList(java.util.Collection)} or
     * {@link #withEnvironmentSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param environmentSummaryList
     *        The list of <code>EnvironmentSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsResult withEnvironmentSummaryList(EnvironmentSummary... environmentSummaryList) {
        if (this.environmentSummaryList == null) {
            setEnvironmentSummaryList(new java.util.ArrayList<EnvironmentSummary>(environmentSummaryList.length));
        }
        for (EnvironmentSummary ele : environmentSummaryList) {
            this.environmentSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>EnvironmentSummary</code> objects.
     * </p>
     * 
     * @param environmentSummaryList
     *        The list of <code>EnvironmentSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsResult withEnvironmentSummaryList(java.util.Collection<EnvironmentSummary> environmentSummaryList) {
        setEnvironmentSummaryList(environmentSummaryList);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsResult withNextToken(String nextToken) {
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
        if (getEnvironmentSummaryList() != null)
            sb.append("EnvironmentSummaryList: ").append(getEnvironmentSummaryList()).append(",");
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

        if (obj instanceof ListEnvironmentsResult == false)
            return false;
        ListEnvironmentsResult other = (ListEnvironmentsResult) obj;
        if (other.getEnvironmentSummaryList() == null ^ this.getEnvironmentSummaryList() == null)
            return false;
        if (other.getEnvironmentSummaryList() != null && other.getEnvironmentSummaryList().equals(this.getEnvironmentSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getEnvironmentSummaryList() == null) ? 0 : getEnvironmentSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentsResult clone() {
        try {
            return (ListEnvironmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
