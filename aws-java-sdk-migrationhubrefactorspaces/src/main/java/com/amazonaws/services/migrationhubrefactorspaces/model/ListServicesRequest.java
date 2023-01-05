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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListServices"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String applicationIdentifier;
    /**
     * <p>
     * The ID of the environment.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationIdentifier
     *        The ID of the application.
     */

    public void setApplicationIdentifier(String applicationIdentifier) {
        this.applicationIdentifier = applicationIdentifier;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationIdentifier
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withApplicationIdentifier(String applicationIdentifier) {
        setApplicationIdentifier(applicationIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @return The ID of the environment.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public ListServicesRequest withNextToken(String nextToken) {
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
        if (getApplicationIdentifier() != null)
            sb.append("ApplicationIdentifier: ").append(getApplicationIdentifier()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListServicesRequest == false)
            return false;
        ListServicesRequest other = (ListServicesRequest) obj;
        if (other.getApplicationIdentifier() == null ^ this.getApplicationIdentifier() == null)
            return false;
        if (other.getApplicationIdentifier() != null && other.getApplicationIdentifier().equals(this.getApplicationIdentifier()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getApplicationIdentifier() == null) ? 0 : getApplicationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServicesRequest clone() {
        return (ListServicesRequest) super.clone();
    }

}
