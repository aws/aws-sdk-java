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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListApps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summaries for the Resilience Hub application.
     * </p>
     */
    private java.util.List<AppSummary> appSummaries;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summaries for the Resilience Hub application.
     * </p>
     * 
     * @return Summaries for the Resilience Hub application.
     */

    public java.util.List<AppSummary> getAppSummaries() {
        return appSummaries;
    }

    /**
     * <p>
     * Summaries for the Resilience Hub application.
     * </p>
     * 
     * @param appSummaries
     *        Summaries for the Resilience Hub application.
     */

    public void setAppSummaries(java.util.Collection<AppSummary> appSummaries) {
        if (appSummaries == null) {
            this.appSummaries = null;
            return;
        }

        this.appSummaries = new java.util.ArrayList<AppSummary>(appSummaries);
    }

    /**
     * <p>
     * Summaries for the Resilience Hub application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppSummaries(java.util.Collection)} or {@link #withAppSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param appSummaries
     *        Summaries for the Resilience Hub application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsResult withAppSummaries(AppSummary... appSummaries) {
        if (this.appSummaries == null) {
            setAppSummaries(new java.util.ArrayList<AppSummary>(appSummaries.length));
        }
        for (AppSummary ele : appSummaries) {
            this.appSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summaries for the Resilience Hub application.
     * </p>
     * 
     * @param appSummaries
     *        Summaries for the Resilience Hub application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsResult withAppSummaries(java.util.Collection<AppSummary> appSummaries) {
        setAppSummaries(appSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsResult withNextToken(String nextToken) {
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
        if (getAppSummaries() != null)
            sb.append("AppSummaries: ").append(getAppSummaries()).append(",");
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

        if (obj instanceof ListAppsResult == false)
            return false;
        ListAppsResult other = (ListAppsResult) obj;
        if (other.getAppSummaries() == null ^ this.getAppSummaries() == null)
            return false;
        if (other.getAppSummaries() != null && other.getAppSummaries().equals(this.getAppSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAppSummaries() == null) ? 0 : getAppSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppsResult clone() {
        try {
            return (ListAppsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
