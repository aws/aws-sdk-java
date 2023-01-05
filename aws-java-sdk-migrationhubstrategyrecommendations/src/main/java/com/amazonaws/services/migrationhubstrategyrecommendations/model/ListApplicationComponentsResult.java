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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListApplicationComponents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationComponentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of application components with detailed information about each component.
     * </p>
     */
    private java.util.List<ApplicationComponentDetail> applicationComponentInfos;
    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of application components with detailed information about each component.
     * </p>
     * 
     * @return The list of application components with detailed information about each component.
     */

    public java.util.List<ApplicationComponentDetail> getApplicationComponentInfos() {
        return applicationComponentInfos;
    }

    /**
     * <p>
     * The list of application components with detailed information about each component.
     * </p>
     * 
     * @param applicationComponentInfos
     *        The list of application components with detailed information about each component.
     */

    public void setApplicationComponentInfos(java.util.Collection<ApplicationComponentDetail> applicationComponentInfos) {
        if (applicationComponentInfos == null) {
            this.applicationComponentInfos = null;
            return;
        }

        this.applicationComponentInfos = new java.util.ArrayList<ApplicationComponentDetail>(applicationComponentInfos);
    }

    /**
     * <p>
     * The list of application components with detailed information about each component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationComponentInfos(java.util.Collection)} or
     * {@link #withApplicationComponentInfos(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param applicationComponentInfos
     *        The list of application components with detailed information about each component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationComponentsResult withApplicationComponentInfos(ApplicationComponentDetail... applicationComponentInfos) {
        if (this.applicationComponentInfos == null) {
            setApplicationComponentInfos(new java.util.ArrayList<ApplicationComponentDetail>(applicationComponentInfos.length));
        }
        for (ApplicationComponentDetail ele : applicationComponentInfos) {
            this.applicationComponentInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of application components with detailed information about each component.
     * </p>
     * 
     * @param applicationComponentInfos
     *        The list of application components with detailed information about each component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationComponentsResult withApplicationComponentInfos(java.util.Collection<ApplicationComponentDetail> applicationComponentInfos) {
        setApplicationComponentInfos(applicationComponentInfos);
        return this;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token you use to retrieve the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token you use to retrieve the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token you use to retrieve the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationComponentsResult withNextToken(String nextToken) {
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
        if (getApplicationComponentInfos() != null)
            sb.append("ApplicationComponentInfos: ").append(getApplicationComponentInfos()).append(",");
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

        if (obj instanceof ListApplicationComponentsResult == false)
            return false;
        ListApplicationComponentsResult other = (ListApplicationComponentsResult) obj;
        if (other.getApplicationComponentInfos() == null ^ this.getApplicationComponentInfos() == null)
            return false;
        if (other.getApplicationComponentInfos() != null && other.getApplicationComponentInfos().equals(this.getApplicationComponentInfos()) == false)
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

        hashCode = prime * hashCode + ((getApplicationComponentInfos() == null) ? 0 : getApplicationComponentInfos().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationComponentsResult clone() {
        try {
            return (ListApplicationComponentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
