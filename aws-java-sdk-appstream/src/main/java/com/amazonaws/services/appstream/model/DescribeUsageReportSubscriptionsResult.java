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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeUsageReportSubscriptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUsageReportSubscriptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the usage report subscription.
     * </p>
     */
    private java.util.List<UsageReportSubscription> usageReportSubscriptions;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the usage report subscription.
     * </p>
     * 
     * @return Information about the usage report subscription.
     */

    public java.util.List<UsageReportSubscription> getUsageReportSubscriptions() {
        return usageReportSubscriptions;
    }

    /**
     * <p>
     * Information about the usage report subscription.
     * </p>
     * 
     * @param usageReportSubscriptions
     *        Information about the usage report subscription.
     */

    public void setUsageReportSubscriptions(java.util.Collection<UsageReportSubscription> usageReportSubscriptions) {
        if (usageReportSubscriptions == null) {
            this.usageReportSubscriptions = null;
            return;
        }

        this.usageReportSubscriptions = new java.util.ArrayList<UsageReportSubscription>(usageReportSubscriptions);
    }

    /**
     * <p>
     * Information about the usage report subscription.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsageReportSubscriptions(java.util.Collection)} or
     * {@link #withUsageReportSubscriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param usageReportSubscriptions
     *        Information about the usage report subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsageReportSubscriptionsResult withUsageReportSubscriptions(UsageReportSubscription... usageReportSubscriptions) {
        if (this.usageReportSubscriptions == null) {
            setUsageReportSubscriptions(new java.util.ArrayList<UsageReportSubscription>(usageReportSubscriptions.length));
        }
        for (UsageReportSubscription ele : usageReportSubscriptions) {
            this.usageReportSubscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the usage report subscription.
     * </p>
     * 
     * @param usageReportSubscriptions
     *        Information about the usage report subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsageReportSubscriptionsResult withUsageReportSubscriptions(java.util.Collection<UsageReportSubscription> usageReportSubscriptions) {
        setUsageReportSubscriptions(usageReportSubscriptions);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsageReportSubscriptionsResult withNextToken(String nextToken) {
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
        if (getUsageReportSubscriptions() != null)
            sb.append("UsageReportSubscriptions: ").append(getUsageReportSubscriptions()).append(",");
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

        if (obj instanceof DescribeUsageReportSubscriptionsResult == false)
            return false;
        DescribeUsageReportSubscriptionsResult other = (DescribeUsageReportSubscriptionsResult) obj;
        if (other.getUsageReportSubscriptions() == null ^ this.getUsageReportSubscriptions() == null)
            return false;
        if (other.getUsageReportSubscriptions() != null && other.getUsageReportSubscriptions().equals(this.getUsageReportSubscriptions()) == false)
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

        hashCode = prime * hashCode + ((getUsageReportSubscriptions() == null) ? 0 : getUsageReportSubscriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUsageReportSubscriptionsResult clone() {
        try {
            return (DescribeUsageReportSubscriptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
