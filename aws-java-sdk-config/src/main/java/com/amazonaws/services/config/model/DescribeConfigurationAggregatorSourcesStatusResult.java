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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationAggregatorSourcesStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationAggregatorSourcesStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Returns an AggregatedSourceStatus object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AggregatedSourceStatus> aggregatedSourceStatusList;
    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns an AggregatedSourceStatus object.
     * </p>
     * 
     * @return Returns an AggregatedSourceStatus object.
     */

    public java.util.List<AggregatedSourceStatus> getAggregatedSourceStatusList() {
        if (aggregatedSourceStatusList == null) {
            aggregatedSourceStatusList = new com.amazonaws.internal.SdkInternalList<AggregatedSourceStatus>();
        }
        return aggregatedSourceStatusList;
    }

    /**
     * <p>
     * Returns an AggregatedSourceStatus object.
     * </p>
     * 
     * @param aggregatedSourceStatusList
     *        Returns an AggregatedSourceStatus object.
     */

    public void setAggregatedSourceStatusList(java.util.Collection<AggregatedSourceStatus> aggregatedSourceStatusList) {
        if (aggregatedSourceStatusList == null) {
            this.aggregatedSourceStatusList = null;
            return;
        }

        this.aggregatedSourceStatusList = new com.amazonaws.internal.SdkInternalList<AggregatedSourceStatus>(aggregatedSourceStatusList);
    }

    /**
     * <p>
     * Returns an AggregatedSourceStatus object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregatedSourceStatusList(java.util.Collection)} or
     * {@link #withAggregatedSourceStatusList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param aggregatedSourceStatusList
     *        Returns an AggregatedSourceStatus object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationAggregatorSourcesStatusResult withAggregatedSourceStatusList(AggregatedSourceStatus... aggregatedSourceStatusList) {
        if (this.aggregatedSourceStatusList == null) {
            setAggregatedSourceStatusList(new com.amazonaws.internal.SdkInternalList<AggregatedSourceStatus>(aggregatedSourceStatusList.length));
        }
        for (AggregatedSourceStatus ele : aggregatedSourceStatusList) {
            this.aggregatedSourceStatusList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns an AggregatedSourceStatus object.
     * </p>
     * 
     * @param aggregatedSourceStatusList
     *        Returns an AggregatedSourceStatus object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationAggregatorSourcesStatusResult withAggregatedSourceStatusList(
            java.util.Collection<AggregatedSourceStatus> aggregatedSourceStatusList) {
        setAggregatedSourceStatusList(aggregatedSourceStatusList);
        return this;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @return The nextToken string returned on a previous page that you use to get the next page of results in a
     *         paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationAggregatorSourcesStatusResult withNextToken(String nextToken) {
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
        if (getAggregatedSourceStatusList() != null)
            sb.append("AggregatedSourceStatusList: ").append(getAggregatedSourceStatusList()).append(",");
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

        if (obj instanceof DescribeConfigurationAggregatorSourcesStatusResult == false)
            return false;
        DescribeConfigurationAggregatorSourcesStatusResult other = (DescribeConfigurationAggregatorSourcesStatusResult) obj;
        if (other.getAggregatedSourceStatusList() == null ^ this.getAggregatedSourceStatusList() == null)
            return false;
        if (other.getAggregatedSourceStatusList() != null && other.getAggregatedSourceStatusList().equals(this.getAggregatedSourceStatusList()) == false)
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

        hashCode = prime * hashCode + ((getAggregatedSourceStatusList() == null) ? 0 : getAggregatedSourceStatusList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationAggregatorSourcesStatusResult clone() {
        try {
            return (DescribeConfigurationAggregatorSourcesStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
