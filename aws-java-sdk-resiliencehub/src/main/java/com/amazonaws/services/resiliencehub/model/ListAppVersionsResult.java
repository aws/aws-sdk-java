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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The version of the application.
     * </p>
     */
    private java.util.List<AppVersionSummary> appVersions;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @return The version of the application.
     */

    public java.util.List<AppVersionSummary> getAppVersions() {
        return appVersions;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param appVersions
     *        The version of the application.
     */

    public void setAppVersions(java.util.Collection<AppVersionSummary> appVersions) {
        if (appVersions == null) {
            this.appVersions = null;
            return;
        }

        this.appVersions = new java.util.ArrayList<AppVersionSummary>(appVersions);
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppVersions(java.util.Collection)} or {@link #withAppVersions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param appVersions
     *        The version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionsResult withAppVersions(AppVersionSummary... appVersions) {
        if (this.appVersions == null) {
            setAppVersions(new java.util.ArrayList<AppVersionSummary>(appVersions.length));
        }
        for (AppVersionSummary ele : appVersions) {
            this.appVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param appVersions
     *        The version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionsResult withAppVersions(java.util.Collection<AppVersionSummary> appVersions) {
        setAppVersions(appVersions);
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

    public ListAppVersionsResult withNextToken(String nextToken) {
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
        if (getAppVersions() != null)
            sb.append("AppVersions: ").append(getAppVersions()).append(",");
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

        if (obj instanceof ListAppVersionsResult == false)
            return false;
        ListAppVersionsResult other = (ListAppVersionsResult) obj;
        if (other.getAppVersions() == null ^ this.getAppVersions() == null)
            return false;
        if (other.getAppVersions() != null && other.getAppVersions().equals(this.getAppVersions()) == false)
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

        hashCode = prime * hashCode + ((getAppVersions() == null) ? 0 : getAppVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppVersionsResult clone() {
        try {
            return (ListAppVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
