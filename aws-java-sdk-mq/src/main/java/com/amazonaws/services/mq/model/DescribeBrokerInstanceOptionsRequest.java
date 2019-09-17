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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBrokerInstanceOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBrokerInstanceOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Filter response by engine type. */
    private String engineType;
    /** Filter response by host instance type. */
    private String hostInstanceType;
    /**
     * The maximum number of instance options that Amazon MQ can return per page (20 by default). This value must be an
     * integer from 5 to 100.
     */
    private Integer maxResults;
    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     */
    private String nextToken;

    /**
     * Filter response by engine type.
     * 
     * @param engineType
     *        Filter response by engine type.
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * Filter response by engine type.
     * 
     * @return Filter response by engine type.
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * Filter response by engine type.
     * 
     * @param engineType
     *        Filter response by engine type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerInstanceOptionsRequest withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * Filter response by host instance type.
     * 
     * @param hostInstanceType
     *        Filter response by host instance type.
     */

    public void setHostInstanceType(String hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
    }

    /**
     * Filter response by host instance type.
     * 
     * @return Filter response by host instance type.
     */

    public String getHostInstanceType() {
        return this.hostInstanceType;
    }

    /**
     * Filter response by host instance type.
     * 
     * @param hostInstanceType
     *        Filter response by host instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerInstanceOptionsRequest withHostInstanceType(String hostInstanceType) {
        setHostInstanceType(hostInstanceType);
        return this;
    }

    /**
     * The maximum number of instance options that Amazon MQ can return per page (20 by default). This value must be an
     * integer from 5 to 100.
     * 
     * @param maxResults
     *        The maximum number of instance options that Amazon MQ can return per page (20 by default). This value must
     *        be an integer from 5 to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maximum number of instance options that Amazon MQ can return per page (20 by default). This value must be an
     * integer from 5 to 100.
     * 
     * @return The maximum number of instance options that Amazon MQ can return per page (20 by default). This value
     *         must be an integer from 5 to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The maximum number of instance options that Amazon MQ can return per page (20 by default). This value must be an
     * integer from 5 to 100.
     * 
     * @param maxResults
     *        The maximum number of instance options that Amazon MQ can return per page (20 by default). This value must
     *        be an integer from 5 to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerInstanceOptionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @param nextToken
     *        The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *        leave nextToken empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @return The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *         leave nextToken empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @param nextToken
     *        The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *        leave nextToken empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerInstanceOptionsRequest withNextToken(String nextToken) {
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
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getHostInstanceType() != null)
            sb.append("HostInstanceType: ").append(getHostInstanceType()).append(",");
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

        if (obj instanceof DescribeBrokerInstanceOptionsRequest == false)
            return false;
        DescribeBrokerInstanceOptionsRequest other = (DescribeBrokerInstanceOptionsRequest) obj;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getHostInstanceType() == null ^ this.getHostInstanceType() == null)
            return false;
        if (other.getHostInstanceType() != null && other.getHostInstanceType().equals(this.getHostInstanceType()) == false)
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

        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getHostInstanceType() == null) ? 0 : getHostInstanceType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBrokerInstanceOptionsRequest clone() {
        return (DescribeBrokerInstanceOptionsRequest) super.clone();
    }

}
