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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetUsageStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUsageStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The usage statistics object. If a UsageStatisticType was provided, the objects representing other types will be
     * null.
     * </p>
     */
    private UsageStatistics usageStatistics;
    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The usage statistics object. If a UsageStatisticType was provided, the objects representing other types will be
     * null.
     * </p>
     * 
     * @param usageStatistics
     *        The usage statistics object. If a UsageStatisticType was provided, the objects representing other types
     *        will be null.
     */

    public void setUsageStatistics(UsageStatistics usageStatistics) {
        this.usageStatistics = usageStatistics;
    }

    /**
     * <p>
     * The usage statistics object. If a UsageStatisticType was provided, the objects representing other types will be
     * null.
     * </p>
     * 
     * @return The usage statistics object. If a UsageStatisticType was provided, the objects representing other types
     *         will be null.
     */

    public UsageStatistics getUsageStatistics() {
        return this.usageStatistics;
    }

    /**
     * <p>
     * The usage statistics object. If a UsageStatisticType was provided, the objects representing other types will be
     * null.
     * </p>
     * 
     * @param usageStatistics
     *        The usage statistics object. If a UsageStatisticType was provided, the objects representing other types
     *        will be null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsResult withUsageStatistics(UsageStatistics usageStatistics) {
        setUsageStatistics(usageStatistics);
        return this;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @param nextToken
     *        The pagination parameter to be used on the next list operation to retrieve more items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @return The pagination parameter to be used on the next list operation to retrieve more items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @param nextToken
     *        The pagination parameter to be used on the next list operation to retrieve more items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageStatisticsResult withNextToken(String nextToken) {
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
        if (getUsageStatistics() != null)
            sb.append("UsageStatistics: ").append(getUsageStatistics()).append(",");
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

        if (obj instanceof GetUsageStatisticsResult == false)
            return false;
        GetUsageStatisticsResult other = (GetUsageStatisticsResult) obj;
        if (other.getUsageStatistics() == null ^ this.getUsageStatistics() == null)
            return false;
        if (other.getUsageStatistics() != null && other.getUsageStatistics().equals(this.getUsageStatistics()) == false)
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

        hashCode = prime * hashCode + ((getUsageStatistics() == null) ? 0 : getUsageStatistics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetUsageStatisticsResult clone() {
        try {
            return (GetUsageStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
