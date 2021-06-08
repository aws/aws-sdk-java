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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListPolicyGenerations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPolicyGenerationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy. Use this with
     * <code>ListGeneratedPolicies</code> to filter the results to only include results for a specific principal.
     * </p>
     */
    private String principalArn;

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyGenerationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @return A token used for pagination of results returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyGenerationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy. Use this with
     * <code>ListGeneratedPolicies</code> to filter the results to only include results for a specific principal.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM entity (user or role) for which you are generating a policy. Use this with
     *        <code>ListGeneratedPolicies</code> to filter the results to only include results for a specific principal.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy. Use this with
     * <code>ListGeneratedPolicies</code> to filter the results to only include results for a specific principal.
     * </p>
     * 
     * @return The ARN of the IAM entity (user or role) for which you are generating a policy. Use this with
     *         <code>ListGeneratedPolicies</code> to filter the results to only include results for a specific
     *         principal.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy. Use this with
     * <code>ListGeneratedPolicies</code> to filter the results to only include results for a specific principal.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM entity (user or role) for which you are generating a policy. Use this with
     *        <code>ListGeneratedPolicies</code> to filter the results to only include results for a specific principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyGenerationsRequest withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPolicyGenerationsRequest == false)
            return false;
        ListPolicyGenerationsRequest other = (ListPolicyGenerationsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        return hashCode;
    }

    @Override
    public ListPolicyGenerationsRequest clone() {
        return (ListPolicyGenerationsRequest) super.clone();
    }

}
