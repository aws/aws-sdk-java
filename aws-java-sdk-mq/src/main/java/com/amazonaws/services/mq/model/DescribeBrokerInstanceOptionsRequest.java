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

    /**
     * <p>
     * Filter response by engine type.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * Filter response by host instance type.
     * </p>
     */
    private String hostInstanceType;
    /**
     * <p>
     * The maximum number of brokers that Amazon MQ can return per page (20 by default). This value must be an integer
     * from 5 to 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Filter response by storage type.
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * Filter response by engine type.
     * </p>
     * 
     * @param engineType
     *        Filter response by engine type.
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * Filter response by engine type.
     * </p>
     * 
     * @return Filter response by engine type.
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * Filter response by engine type.
     * </p>
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
     * <p>
     * Filter response by host instance type.
     * </p>
     * 
     * @param hostInstanceType
     *        Filter response by host instance type.
     */

    public void setHostInstanceType(String hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
    }

    /**
     * <p>
     * Filter response by host instance type.
     * </p>
     * 
     * @return Filter response by host instance type.
     */

    public String getHostInstanceType() {
        return this.hostInstanceType;
    }

    /**
     * <p>
     * Filter response by host instance type.
     * </p>
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
     * <p>
     * The maximum number of brokers that Amazon MQ can return per page (20 by default). This value must be an integer
     * from 5 to 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of brokers that Amazon MQ can return per page (20 by default). This value must be an
     *        integer from 5 to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of brokers that Amazon MQ can return per page (20 by default). This value must be an integer
     * from 5 to 100.
     * </p>
     * 
     * @return The maximum number of brokers that Amazon MQ can return per page (20 by default). This value must be an
     *         integer from 5 to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of brokers that Amazon MQ can return per page (20 by default). This value must be an integer
     * from 5 to 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of brokers that Amazon MQ can return per page (20 by default). This value must be an
     *        integer from 5 to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerInstanceOptionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * </p>
     * 
     * @param nextToken
     *        The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *        leave nextToken empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * </p>
     * 
     * @return The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *         leave nextToken empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * </p>
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
     * <p>
     * Filter response by storage type.
     * </p>
     * 
     * @param storageType
     *        Filter response by storage type.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Filter response by storage type.
     * </p>
     * 
     * @return Filter response by storage type.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Filter response by storage type.
     * </p>
     * 
     * @param storageType
     *        Filter response by storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerInstanceOptionsRequest withStorageType(String storageType) {
        setStorageType(storageType);
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
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType());
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
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
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
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBrokerInstanceOptionsRequest clone() {
        return (DescribeBrokerInstanceOptionsRequest) super.clone();
    }

}
