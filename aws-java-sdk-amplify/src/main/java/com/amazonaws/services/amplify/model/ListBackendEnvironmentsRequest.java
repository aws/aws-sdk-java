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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure for list backend environments request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBackendEnvironments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackendEnvironmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique Id for an amplify App.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Name of the backend environment
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * Pagination token. Set to null to start listing backen environments from start. If a non-null pagination token is
     * returned in a result, then pass its value in here to list more backend environments.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of records to list in a single response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Unique Id for an amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an amplify App.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * Unique Id for an amplify App.
     * </p>
     * 
     * @return Unique Id for an amplify App.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * Unique Id for an amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendEnvironmentsRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Name of the backend environment
     * </p>
     * 
     * @param environmentName
     *        Name of the backend environment
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * Name of the backend environment
     * </p>
     * 
     * @return Name of the backend environment
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * Name of the backend environment
     * </p>
     * 
     * @param environmentName
     *        Name of the backend environment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendEnvironmentsRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * Pagination token. Set to null to start listing backen environments from start. If a non-null pagination token is
     * returned in a result, then pass its value in here to list more backend environments.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Set to null to start listing backen environments from start. If a non-null pagination
     *        token is returned in a result, then pass its value in here to list more backend environments.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. Set to null to start listing backen environments from start. If a non-null pagination token is
     * returned in a result, then pass its value in here to list more backend environments.
     * </p>
     * 
     * @return Pagination token. Set to null to start listing backen environments from start. If a non-null pagination
     *         token is returned in a result, then pass its value in here to list more backend environments.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. Set to null to start listing backen environments from start. If a non-null pagination token is
     * returned in a result, then pass its value in here to list more backend environments.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Set to null to start listing backen environments from start. If a non-null pagination
     *        token is returned in a result, then pass its value in here to list more backend environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendEnvironmentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of records to list in a single response.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of records to list in a single response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of records to list in a single response.
     * </p>
     * 
     * @return Maximum number of records to list in a single response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of records to list in a single response.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of records to list in a single response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendEnvironmentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackendEnvironmentsRequest == false)
            return false;
        ListBackendEnvironmentsRequest other = (ListBackendEnvironmentsRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListBackendEnvironmentsRequest clone() {
        return (ListBackendEnvironmentsRequest) super.clone();
    }

}
