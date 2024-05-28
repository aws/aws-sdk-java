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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListLandingZones" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLandingZonesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of returned landing zone ARNs, which is one.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to continue the list from a previous API call with the same parameters.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of returned landing zone ARNs, which is one.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of returned landing zone ARNs, which is one.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of returned landing zone ARNs, which is one.
     * </p>
     * 
     * @return The maximum number of returned landing zone ARNs, which is one.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of returned landing zone ARNs, which is one.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of returned landing zone ARNs, which is one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLandingZonesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to continue the list from a previous API call with the same parameters.
     * </p>
     * 
     * @param nextToken
     *        The token to continue the list from a previous API call with the same parameters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to continue the list from a previous API call with the same parameters.
     * </p>
     * 
     * @return The token to continue the list from a previous API call with the same parameters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to continue the list from a previous API call with the same parameters.
     * </p>
     * 
     * @param nextToken
     *        The token to continue the list from a previous API call with the same parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLandingZonesRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListLandingZonesRequest == false)
            return false;
        ListLandingZonesRequest other = (ListLandingZonesRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLandingZonesRequest clone() {
        return (ListLandingZonesRequest) super.clone();
    }

}
