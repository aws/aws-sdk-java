/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class ListSecurityProfilesForTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     */
    private Boolean recursive;
    /**
     * <p>
     * The ARN of the target (thing group) whose attached security profiles you want to get.
     * </p>
     */
    private String securityProfileTargetArn;

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

    public ListSecurityProfilesForTargetRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @return The maximum number of results to return at one time.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilesForTargetRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     * 
     * @param recursive
     *        If true, return child groups as well.
     */

    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     * 
     * @return If true, return child groups as well.
     */

    public Boolean getRecursive() {
        return this.recursive;
    }

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     * 
     * @param recursive
     *        If true, return child groups as well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilesForTargetRequest withRecursive(Boolean recursive) {
        setRecursive(recursive);
        return this;
    }

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     * 
     * @return If true, return child groups as well.
     */

    public Boolean isRecursive() {
        return this.recursive;
    }

    /**
     * <p>
     * The ARN of the target (thing group) whose attached security profiles you want to get.
     * </p>
     * 
     * @param securityProfileTargetArn
     *        The ARN of the target (thing group) whose attached security profiles you want to get.
     */

    public void setSecurityProfileTargetArn(String securityProfileTargetArn) {
        this.securityProfileTargetArn = securityProfileTargetArn;
    }

    /**
     * <p>
     * The ARN of the target (thing group) whose attached security profiles you want to get.
     * </p>
     * 
     * @return The ARN of the target (thing group) whose attached security profiles you want to get.
     */

    public String getSecurityProfileTargetArn() {
        return this.securityProfileTargetArn;
    }

    /**
     * <p>
     * The ARN of the target (thing group) whose attached security profiles you want to get.
     * </p>
     * 
     * @param securityProfileTargetArn
     *        The ARN of the target (thing group) whose attached security profiles you want to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilesForTargetRequest withSecurityProfileTargetArn(String securityProfileTargetArn) {
        setSecurityProfileTargetArn(securityProfileTargetArn);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getRecursive() != null)
            sb.append("Recursive: ").append(getRecursive()).append(",");
        if (getSecurityProfileTargetArn() != null)
            sb.append("SecurityProfileTargetArn: ").append(getSecurityProfileTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSecurityProfilesForTargetRequest == false)
            return false;
        ListSecurityProfilesForTargetRequest other = (ListSecurityProfilesForTargetRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getRecursive() == null ^ this.getRecursive() == null)
            return false;
        if (other.getRecursive() != null && other.getRecursive().equals(this.getRecursive()) == false)
            return false;
        if (other.getSecurityProfileTargetArn() == null ^ this.getSecurityProfileTargetArn() == null)
            return false;
        if (other.getSecurityProfileTargetArn() != null && other.getSecurityProfileTargetArn().equals(this.getSecurityProfileTargetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getRecursive() == null) ? 0 : getRecursive().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileTargetArn() == null) ? 0 : getSecurityProfileTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityProfilesForTargetRequest clone() {
        return (ListSecurityProfilesForTargetRequest) super.clone();
    }

}
