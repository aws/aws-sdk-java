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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetPoliciesStats"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPoliciesStatsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the data access policies in your account.
     * </p>
     */
    private AccessPolicyStats accessPolicyStats;
    /**
     * <p>
     * Information about the security configurations in your account.
     * </p>
     */
    private SecurityConfigStats securityConfigStats;
    /**
     * <p>
     * Information about the security policies in your account.
     * </p>
     */
    private SecurityPolicyStats securityPolicyStats;
    /**
     * <p>
     * The total number of OpenSearch Serverless security policies and configurations in your account.
     * </p>
     */
    private Long totalPolicyCount;

    /**
     * <p>
     * Information about the data access policies in your account.
     * </p>
     * 
     * @param accessPolicyStats
     *        Information about the data access policies in your account.
     */

    public void setAccessPolicyStats(AccessPolicyStats accessPolicyStats) {
        this.accessPolicyStats = accessPolicyStats;
    }

    /**
     * <p>
     * Information about the data access policies in your account.
     * </p>
     * 
     * @return Information about the data access policies in your account.
     */

    public AccessPolicyStats getAccessPolicyStats() {
        return this.accessPolicyStats;
    }

    /**
     * <p>
     * Information about the data access policies in your account.
     * </p>
     * 
     * @param accessPolicyStats
     *        Information about the data access policies in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPoliciesStatsResult withAccessPolicyStats(AccessPolicyStats accessPolicyStats) {
        setAccessPolicyStats(accessPolicyStats);
        return this;
    }

    /**
     * <p>
     * Information about the security configurations in your account.
     * </p>
     * 
     * @param securityConfigStats
     *        Information about the security configurations in your account.
     */

    public void setSecurityConfigStats(SecurityConfigStats securityConfigStats) {
        this.securityConfigStats = securityConfigStats;
    }

    /**
     * <p>
     * Information about the security configurations in your account.
     * </p>
     * 
     * @return Information about the security configurations in your account.
     */

    public SecurityConfigStats getSecurityConfigStats() {
        return this.securityConfigStats;
    }

    /**
     * <p>
     * Information about the security configurations in your account.
     * </p>
     * 
     * @param securityConfigStats
     *        Information about the security configurations in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPoliciesStatsResult withSecurityConfigStats(SecurityConfigStats securityConfigStats) {
        setSecurityConfigStats(securityConfigStats);
        return this;
    }

    /**
     * <p>
     * Information about the security policies in your account.
     * </p>
     * 
     * @param securityPolicyStats
     *        Information about the security policies in your account.
     */

    public void setSecurityPolicyStats(SecurityPolicyStats securityPolicyStats) {
        this.securityPolicyStats = securityPolicyStats;
    }

    /**
     * <p>
     * Information about the security policies in your account.
     * </p>
     * 
     * @return Information about the security policies in your account.
     */

    public SecurityPolicyStats getSecurityPolicyStats() {
        return this.securityPolicyStats;
    }

    /**
     * <p>
     * Information about the security policies in your account.
     * </p>
     * 
     * @param securityPolicyStats
     *        Information about the security policies in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPoliciesStatsResult withSecurityPolicyStats(SecurityPolicyStats securityPolicyStats) {
        setSecurityPolicyStats(securityPolicyStats);
        return this;
    }

    /**
     * <p>
     * The total number of OpenSearch Serverless security policies and configurations in your account.
     * </p>
     * 
     * @param totalPolicyCount
     *        The total number of OpenSearch Serverless security policies and configurations in your account.
     */

    public void setTotalPolicyCount(Long totalPolicyCount) {
        this.totalPolicyCount = totalPolicyCount;
    }

    /**
     * <p>
     * The total number of OpenSearch Serverless security policies and configurations in your account.
     * </p>
     * 
     * @return The total number of OpenSearch Serverless security policies and configurations in your account.
     */

    public Long getTotalPolicyCount() {
        return this.totalPolicyCount;
    }

    /**
     * <p>
     * The total number of OpenSearch Serverless security policies and configurations in your account.
     * </p>
     * 
     * @param totalPolicyCount
     *        The total number of OpenSearch Serverless security policies and configurations in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPoliciesStatsResult withTotalPolicyCount(Long totalPolicyCount) {
        setTotalPolicyCount(totalPolicyCount);
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
        if (getAccessPolicyStats() != null)
            sb.append("AccessPolicyStats: ").append(getAccessPolicyStats()).append(",");
        if (getSecurityConfigStats() != null)
            sb.append("SecurityConfigStats: ").append(getSecurityConfigStats()).append(",");
        if (getSecurityPolicyStats() != null)
            sb.append("SecurityPolicyStats: ").append(getSecurityPolicyStats()).append(",");
        if (getTotalPolicyCount() != null)
            sb.append("TotalPolicyCount: ").append(getTotalPolicyCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPoliciesStatsResult == false)
            return false;
        GetPoliciesStatsResult other = (GetPoliciesStatsResult) obj;
        if (other.getAccessPolicyStats() == null ^ this.getAccessPolicyStats() == null)
            return false;
        if (other.getAccessPolicyStats() != null && other.getAccessPolicyStats().equals(this.getAccessPolicyStats()) == false)
            return false;
        if (other.getSecurityConfigStats() == null ^ this.getSecurityConfigStats() == null)
            return false;
        if (other.getSecurityConfigStats() != null && other.getSecurityConfigStats().equals(this.getSecurityConfigStats()) == false)
            return false;
        if (other.getSecurityPolicyStats() == null ^ this.getSecurityPolicyStats() == null)
            return false;
        if (other.getSecurityPolicyStats() != null && other.getSecurityPolicyStats().equals(this.getSecurityPolicyStats()) == false)
            return false;
        if (other.getTotalPolicyCount() == null ^ this.getTotalPolicyCount() == null)
            return false;
        if (other.getTotalPolicyCount() != null && other.getTotalPolicyCount().equals(this.getTotalPolicyCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPolicyStats() == null) ? 0 : getAccessPolicyStats().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfigStats() == null) ? 0 : getSecurityConfigStats().hashCode());
        hashCode = prime * hashCode + ((getSecurityPolicyStats() == null) ? 0 : getSecurityPolicyStats().hashCode());
        hashCode = prime * hashCode + ((getTotalPolicyCount() == null) ? 0 : getTotalPolicyCount().hashCode());
        return hashCode;
    }

    @Override
    public GetPoliciesStatsResult clone() {
        try {
            return (GetPoliciesStatsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
