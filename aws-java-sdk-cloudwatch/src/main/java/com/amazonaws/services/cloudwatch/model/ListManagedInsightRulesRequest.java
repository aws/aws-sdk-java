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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListManagedInsightRules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListManagedInsightRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * Include this value to get the next set of rules if the value was returned by the previous operation.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in one operation. If you omit this parameter, the default number is used.
     * The default number is <code>100</code>.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     * </p>
     * 
     * @param resourceARN
     *        The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     * </p>
     * 
     * @return The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     * </p>
     * 
     * @param resourceARN
     *        The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedInsightRulesRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * Include this value to get the next set of rules if the value was returned by the previous operation.
     * </p>
     * 
     * @param nextToken
     *        Include this value to get the next set of rules if the value was returned by the previous operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Include this value to get the next set of rules if the value was returned by the previous operation.
     * </p>
     * 
     * @return Include this value to get the next set of rules if the value was returned by the previous operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Include this value to get the next set of rules if the value was returned by the previous operation.
     * </p>
     * 
     * @param nextToken
     *        Include this value to get the next set of rules if the value was returned by the previous operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedInsightRulesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. If you omit this parameter, the default number is used.
     * The default number is <code>100</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in one operation. If you omit this parameter, the default number
     *        is used. The default number is <code>100</code>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. If you omit this parameter, the default number is used.
     * The default number is <code>100</code>.
     * </p>
     * 
     * @return The maximum number of results to return in one operation. If you omit this parameter, the default number
     *         is used. The default number is <code>100</code>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. If you omit this parameter, the default number is used.
     * The default number is <code>100</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in one operation. If you omit this parameter, the default number
     *        is used. The default number is <code>100</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedInsightRulesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListManagedInsightRulesRequest == false)
            return false;
        ListManagedInsightRulesRequest other = (ListManagedInsightRulesRequest) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListManagedInsightRulesRequest clone() {
        return (ListManagedInsightRulesRequest) super.clone();
    }

}
