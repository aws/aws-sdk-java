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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBehaviorModelTrainingSummariesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the security profile.
     * </p>
     */
    private String securityProfileName;
    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile.
     */

    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * 
     * @return The name of the security profile.
     */

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBehaviorModelTrainingSummariesRequest withSecurityProfileName(String securityProfileName) {
        setSecurityProfileName(securityProfileName);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time. The default is 25.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * 
     * @return The maximum number of results to return at one time. The default is 25.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time. The default is 25.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBehaviorModelTrainingSummariesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBehaviorModelTrainingSummariesRequest withNextToken(String nextToken) {
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
        if (getSecurityProfileName() != null)
            sb.append("SecurityProfileName: ").append(getSecurityProfileName()).append(",");
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

        if (obj instanceof GetBehaviorModelTrainingSummariesRequest == false)
            return false;
        GetBehaviorModelTrainingSummariesRequest other = (GetBehaviorModelTrainingSummariesRequest) obj;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
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

        hashCode = prime * hashCode + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetBehaviorModelTrainingSummariesRequest clone() {
        return (GetBehaviorModelTrainingSummariesRequest) super.clone();
    }

}
