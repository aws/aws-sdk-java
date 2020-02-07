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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListDistributionConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDistributionConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The list of distributions.
     * </p>
     */
    private java.util.List<DistributionConfigurationSummary> distributionConfigurationSummaryList;
    /**
     * <p>
     * The next token used for paginated responses. When this is not empty, there are additional elements that the
     * service has not included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @return The request ID that uniquely identifies this request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDistributionConfigurationsResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The list of distributions.
     * </p>
     * 
     * @return The list of distributions.
     */

    public java.util.List<DistributionConfigurationSummary> getDistributionConfigurationSummaryList() {
        return distributionConfigurationSummaryList;
    }

    /**
     * <p>
     * The list of distributions.
     * </p>
     * 
     * @param distributionConfigurationSummaryList
     *        The list of distributions.
     */

    public void setDistributionConfigurationSummaryList(java.util.Collection<DistributionConfigurationSummary> distributionConfigurationSummaryList) {
        if (distributionConfigurationSummaryList == null) {
            this.distributionConfigurationSummaryList = null;
            return;
        }

        this.distributionConfigurationSummaryList = new java.util.ArrayList<DistributionConfigurationSummary>(distributionConfigurationSummaryList);
    }

    /**
     * <p>
     * The list of distributions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDistributionConfigurationSummaryList(java.util.Collection)} or
     * {@link #withDistributionConfigurationSummaryList(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param distributionConfigurationSummaryList
     *        The list of distributions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDistributionConfigurationsResult withDistributionConfigurationSummaryList(
            DistributionConfigurationSummary... distributionConfigurationSummaryList) {
        if (this.distributionConfigurationSummaryList == null) {
            setDistributionConfigurationSummaryList(new java.util.ArrayList<DistributionConfigurationSummary>(distributionConfigurationSummaryList.length));
        }
        for (DistributionConfigurationSummary ele : distributionConfigurationSummaryList) {
            this.distributionConfigurationSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of distributions.
     * </p>
     * 
     * @param distributionConfigurationSummaryList
     *        The list of distributions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDistributionConfigurationsResult withDistributionConfigurationSummaryList(
            java.util.Collection<DistributionConfigurationSummary> distributionConfigurationSummaryList) {
        setDistributionConfigurationSummaryList(distributionConfigurationSummaryList);
        return this;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty, there are additional elements that the
     * service has not included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this is not empty, there are additional elements that
     *        the service has not included in this request. Use this token with the next request to retrieve additional
     *        objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty, there are additional elements that the
     * service has not included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @return The next token used for paginated responses. When this is not empty, there are additional elements that
     *         the service has not included in this request. Use this token with the next request to retrieve additional
     *         objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty, there are additional elements that the
     * service has not included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this is not empty, there are additional elements that
     *        the service has not included in this request. Use this token with the next request to retrieve additional
     *        objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDistributionConfigurationsResult withNextToken(String nextToken) {
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getDistributionConfigurationSummaryList() != null)
            sb.append("DistributionConfigurationSummaryList: ").append(getDistributionConfigurationSummaryList()).append(",");
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

        if (obj instanceof ListDistributionConfigurationsResult == false)
            return false;
        ListDistributionConfigurationsResult other = (ListDistributionConfigurationsResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getDistributionConfigurationSummaryList() == null ^ this.getDistributionConfigurationSummaryList() == null)
            return false;
        if (other.getDistributionConfigurationSummaryList() != null
                && other.getDistributionConfigurationSummaryList().equals(this.getDistributionConfigurationSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getDistributionConfigurationSummaryList() == null) ? 0 : getDistributionConfigurationSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDistributionConfigurationsResult clone() {
        try {
            return (ListDistributionConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
