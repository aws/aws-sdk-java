/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListSecurityConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecurityConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time after which the security configuration was created.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * The date and time before which the security configuration was created.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * The maximum number of security configurations the operation can list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of security configurations to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The date and time after which the security configuration was created.
     * </p>
     * 
     * @param createdAfter
     *        The date and time after which the security configuration was created.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * The date and time after which the security configuration was created.
     * </p>
     * 
     * @return The date and time after which the security configuration was created.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * The date and time after which the security configuration was created.
     * </p>
     * 
     * @param createdAfter
     *        The date and time after which the security configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityConfigurationsRequest withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * The date and time before which the security configuration was created.
     * </p>
     * 
     * @param createdBefore
     *        The date and time before which the security configuration was created.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * The date and time before which the security configuration was created.
     * </p>
     * 
     * @return The date and time before which the security configuration was created.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * The date and time before which the security configuration was created.
     * </p>
     * 
     * @param createdBefore
     *        The date and time before which the security configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityConfigurationsRequest withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * The maximum number of security configurations the operation can list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of security configurations the operation can list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of security configurations the operation can list.
     * </p>
     * 
     * @return The maximum number of security configurations the operation can list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of security configurations the operation can list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of security configurations the operation can list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityConfigurationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of security configurations to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of security configurations to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of security configurations to return.
     * </p>
     * 
     * @return The token for the next set of security configurations to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of security configurations to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of security configurations to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityConfigurationsRequest withNextToken(String nextToken) {
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
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
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

        if (obj instanceof ListSecurityConfigurationsRequest == false)
            return false;
        ListSecurityConfigurationsRequest other = (ListSecurityConfigurationsRequest) obj;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
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

        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityConfigurationsRequest clone() {
        return (ListSecurityConfigurationsRequest) super.clone();
    }

}
