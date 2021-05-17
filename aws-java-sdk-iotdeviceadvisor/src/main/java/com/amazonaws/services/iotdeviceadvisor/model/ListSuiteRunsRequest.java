/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListSuiteRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSuiteRunsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the test suite runs of the specified test suite based on suite definition Id.
     * </p>
     */
    private String suiteDefinitionId;
    /**
     * <p>
     * Must be passed along with suiteDefinitionId. Lists the test suite runs of the specified test suite based on suite
     * definition version.
     * </p>
     */
    private String suiteDefinitionVersion;
    /**
     * <p>
     * The maximum number of results to return at once.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the test suite runs of the specified test suite based on suite definition Id.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Lists the test suite runs of the specified test suite based on suite definition Id.
     */

    public void setSuiteDefinitionId(String suiteDefinitionId) {
        this.suiteDefinitionId = suiteDefinitionId;
    }

    /**
     * <p>
     * Lists the test suite runs of the specified test suite based on suite definition Id.
     * </p>
     * 
     * @return Lists the test suite runs of the specified test suite based on suite definition Id.
     */

    public String getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }

    /**
     * <p>
     * Lists the test suite runs of the specified test suite based on suite definition Id.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Lists the test suite runs of the specified test suite based on suite definition Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuiteRunsRequest withSuiteDefinitionId(String suiteDefinitionId) {
        setSuiteDefinitionId(suiteDefinitionId);
        return this;
    }

    /**
     * <p>
     * Must be passed along with suiteDefinitionId. Lists the test suite runs of the specified test suite based on suite
     * definition version.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Must be passed along with suiteDefinitionId. Lists the test suite runs of the specified test suite based
     *        on suite definition version.
     */

    public void setSuiteDefinitionVersion(String suiteDefinitionVersion) {
        this.suiteDefinitionVersion = suiteDefinitionVersion;
    }

    /**
     * <p>
     * Must be passed along with suiteDefinitionId. Lists the test suite runs of the specified test suite based on suite
     * definition version.
     * </p>
     * 
     * @return Must be passed along with suiteDefinitionId. Lists the test suite runs of the specified test suite based
     *         on suite definition version.
     */

    public String getSuiteDefinitionVersion() {
        return this.suiteDefinitionVersion;
    }

    /**
     * <p>
     * Must be passed along with suiteDefinitionId. Lists the test suite runs of the specified test suite based on suite
     * definition version.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Must be passed along with suiteDefinitionId. Lists the test suite runs of the specified test suite based
     *        on suite definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuiteRunsRequest withSuiteDefinitionVersion(String suiteDefinitionVersion) {
        setSuiteDefinitionVersion(suiteDefinitionVersion);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at once.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at once.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at once.
     * </p>
     * 
     * @return The maximum number of results to return at once.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at once.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuiteRunsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     * 
     * @return A token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuiteRunsRequest withNextToken(String nextToken) {
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
        if (getSuiteDefinitionId() != null)
            sb.append("SuiteDefinitionId: ").append(getSuiteDefinitionId()).append(",");
        if (getSuiteDefinitionVersion() != null)
            sb.append("SuiteDefinitionVersion: ").append(getSuiteDefinitionVersion()).append(",");
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

        if (obj instanceof ListSuiteRunsRequest == false)
            return false;
        ListSuiteRunsRequest other = (ListSuiteRunsRequest) obj;
        if (other.getSuiteDefinitionId() == null ^ this.getSuiteDefinitionId() == null)
            return false;
        if (other.getSuiteDefinitionId() != null && other.getSuiteDefinitionId().equals(this.getSuiteDefinitionId()) == false)
            return false;
        if (other.getSuiteDefinitionVersion() == null ^ this.getSuiteDefinitionVersion() == null)
            return false;
        if (other.getSuiteDefinitionVersion() != null && other.getSuiteDefinitionVersion().equals(this.getSuiteDefinitionVersion()) == false)
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

        hashCode = prime * hashCode + ((getSuiteDefinitionId() == null) ? 0 : getSuiteDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionVersion() == null) ? 0 : getSuiteDefinitionVersion().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSuiteRunsRequest clone() {
        return (ListSuiteRunsRequest) super.clone();
    }

}
