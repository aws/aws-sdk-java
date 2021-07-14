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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDistributionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the distribution for which to return information.
     * </p>
     * <p>
     * When omitted, the response includes all of your distributions in the AWS Region where the request is made.
     * </p>
     */
    private String distributionName;
    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetDistributions</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The name of the distribution for which to return information.
     * </p>
     * <p>
     * When omitted, the response includes all of your distributions in the AWS Region where the request is made.
     * </p>
     * 
     * @param distributionName
     *        The name of the distribution for which to return information.</p>
     *        <p>
     *        When omitted, the response includes all of your distributions in the AWS Region where the request is made.
     */

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    /**
     * <p>
     * The name of the distribution for which to return information.
     * </p>
     * <p>
     * When omitted, the response includes all of your distributions in the AWS Region where the request is made.
     * </p>
     * 
     * @return The name of the distribution for which to return information.</p>
     *         <p>
     *         When omitted, the response includes all of your distributions in the AWS Region where the request is
     *         made.
     */

    public String getDistributionName() {
        return this.distributionName;
    }

    /**
     * <p>
     * The name of the distribution for which to return information.
     * </p>
     * <p>
     * When omitted, the response includes all of your distributions in the AWS Region where the request is made.
     * </p>
     * 
     * @param distributionName
     *        The name of the distribution for which to return information.</p>
     *        <p>
     *        When omitted, the response includes all of your distributions in the AWS Region where the request is made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionsRequest withDistributionName(String distributionName) {
        setDistributionName(distributionName);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetDistributions</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @param pageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        To get a page token, perform an initial <code>GetDistributions</code> request. If your results are
     *        paginated, the response will return a next page token that you can specify as the page token in a
     *        subsequent request.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetDistributions</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @return The token to advance to the next page of results from your request.</p>
     *         <p>
     *         To get a page token, perform an initial <code>GetDistributions</code> request. If your results are
     *         paginated, the response will return a next page token that you can specify as the page token in a
     *         subsequent request.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetDistributions</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @param pageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        To get a page token, perform an initial <code>GetDistributions</code> request. If your results are
     *        paginated, the response will return a next page token that you can specify as the page token in a
     *        subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionsRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
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
        if (getDistributionName() != null)
            sb.append("DistributionName: ").append(getDistributionName()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDistributionsRequest == false)
            return false;
        GetDistributionsRequest other = (GetDistributionsRequest) obj;
        if (other.getDistributionName() == null ^ this.getDistributionName() == null)
            return false;
        if (other.getDistributionName() != null && other.getDistributionName().equals(this.getDistributionName()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionName() == null) ? 0 : getDistributionName().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDistributionsRequest clone() {
        return (GetDistributionsRequest) super.clone();
    }

}
