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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeEngineVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEngineVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Redis engine version
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The name of a specific parameter group family to return details for.
     * </p>
     */
    private String parameterGroupFamily;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * If true, specifies that only the default version of the specified engine or engine and major version combination
     * is to be returned.
     * </p>
     */
    private Boolean defaultOnly;

    /**
     * <p>
     * The Redis engine version
     * </p>
     * 
     * @param engineVersion
     *        The Redis engine version
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The Redis engine version
     * </p>
     * 
     * @return The Redis engine version
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The Redis engine version
     * </p>
     * 
     * @param engineVersion
     *        The Redis engine version
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngineVersionsRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The name of a specific parameter group family to return details for.
     * </p>
     * 
     * @param parameterGroupFamily
     *        The name of a specific parameter group family to return details for.
     */

    public void setParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
    }

    /**
     * <p>
     * The name of a specific parameter group family to return details for.
     * </p>
     * 
     * @return The name of a specific parameter group family to return details for.
     */

    public String getParameterGroupFamily() {
        return this.parameterGroupFamily;
    }

    /**
     * <p>
     * The name of a specific parameter group family to return details for.
     * </p>
     * 
     * @param parameterGroupFamily
     *        The name of a specific parameter group family to return details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngineVersionsRequest withParameterGroupFamily(String parameterGroupFamily) {
        setParameterGroupFamily(parameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngineVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *        nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @return An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *         nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *         token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *         other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *        nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngineVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * If true, specifies that only the default version of the specified engine or engine and major version combination
     * is to be returned.
     * </p>
     * 
     * @param defaultOnly
     *        If true, specifies that only the default version of the specified engine or engine and major version
     *        combination is to be returned.
     */

    public void setDefaultOnly(Boolean defaultOnly) {
        this.defaultOnly = defaultOnly;
    }

    /**
     * <p>
     * If true, specifies that only the default version of the specified engine or engine and major version combination
     * is to be returned.
     * </p>
     * 
     * @return If true, specifies that only the default version of the specified engine or engine and major version
     *         combination is to be returned.
     */

    public Boolean getDefaultOnly() {
        return this.defaultOnly;
    }

    /**
     * <p>
     * If true, specifies that only the default version of the specified engine or engine and major version combination
     * is to be returned.
     * </p>
     * 
     * @param defaultOnly
     *        If true, specifies that only the default version of the specified engine or engine and major version
     *        combination is to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngineVersionsRequest withDefaultOnly(Boolean defaultOnly) {
        setDefaultOnly(defaultOnly);
        return this;
    }

    /**
     * <p>
     * If true, specifies that only the default version of the specified engine or engine and major version combination
     * is to be returned.
     * </p>
     * 
     * @return If true, specifies that only the default version of the specified engine or engine and major version
     *         combination is to be returned.
     */

    public Boolean isDefaultOnly() {
        return this.defaultOnly;
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
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getParameterGroupFamily() != null)
            sb.append("ParameterGroupFamily: ").append(getParameterGroupFamily()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getDefaultOnly() != null)
            sb.append("DefaultOnly: ").append(getDefaultOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEngineVersionsRequest == false)
            return false;
        DescribeEngineVersionsRequest other = (DescribeEngineVersionsRequest) obj;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getParameterGroupFamily() == null ^ this.getParameterGroupFamily() == null)
            return false;
        if (other.getParameterGroupFamily() != null && other.getParameterGroupFamily().equals(this.getParameterGroupFamily()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDefaultOnly() == null ^ this.getDefaultOnly() == null)
            return false;
        if (other.getDefaultOnly() != null && other.getDefaultOnly().equals(this.getDefaultOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupFamily() == null) ? 0 : getParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDefaultOnly() == null) ? 0 : getDefaultOnly().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEngineVersionsRequest clone() {
        return (DescribeEngineVersionsRequest) super.clone();
    }

}
