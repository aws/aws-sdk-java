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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBrokerEngineTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBrokerEngineTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** List of available engine types and versions. */
    private java.util.List<BrokerEngineType> brokerEngineTypes;
    /**
     * Required. The maximum number of engine types that can be returned per page (20 by default). This value must be an
     * integer from 5 to 100.
     */
    private Integer maxResults;
    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     */
    private String nextToken;

    /**
     * List of available engine types and versions.
     * 
     * @return List of available engine types and versions.
     */

    public java.util.List<BrokerEngineType> getBrokerEngineTypes() {
        return brokerEngineTypes;
    }

    /**
     * List of available engine types and versions.
     * 
     * @param brokerEngineTypes
     *        List of available engine types and versions.
     */

    public void setBrokerEngineTypes(java.util.Collection<BrokerEngineType> brokerEngineTypes) {
        if (brokerEngineTypes == null) {
            this.brokerEngineTypes = null;
            return;
        }

        this.brokerEngineTypes = new java.util.ArrayList<BrokerEngineType>(brokerEngineTypes);
    }

    /**
     * List of available engine types and versions.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBrokerEngineTypes(java.util.Collection)} or {@link #withBrokerEngineTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param brokerEngineTypes
     *        List of available engine types and versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerEngineTypesResult withBrokerEngineTypes(BrokerEngineType... brokerEngineTypes) {
        if (this.brokerEngineTypes == null) {
            setBrokerEngineTypes(new java.util.ArrayList<BrokerEngineType>(brokerEngineTypes.length));
        }
        for (BrokerEngineType ele : brokerEngineTypes) {
            this.brokerEngineTypes.add(ele);
        }
        return this;
    }

    /**
     * List of available engine types and versions.
     * 
     * @param brokerEngineTypes
     *        List of available engine types and versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerEngineTypesResult withBrokerEngineTypes(java.util.Collection<BrokerEngineType> brokerEngineTypes) {
        setBrokerEngineTypes(brokerEngineTypes);
        return this;
    }

    /**
     * Required. The maximum number of engine types that can be returned per page (20 by default). This value must be an
     * integer from 5 to 100.
     * 
     * @param maxResults
     *        Required. The maximum number of engine types that can be returned per page (20 by default). This value
     *        must be an integer from 5 to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Required. The maximum number of engine types that can be returned per page (20 by default). This value must be an
     * integer from 5 to 100.
     * 
     * @return Required. The maximum number of engine types that can be returned per page (20 by default). This value
     *         must be an integer from 5 to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Required. The maximum number of engine types that can be returned per page (20 by default). This value must be an
     * integer from 5 to 100.
     * 
     * @param maxResults
     *        Required. The maximum number of engine types that can be returned per page (20 by default). This value
     *        must be an integer from 5 to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerEngineTypesResult withMaxResults(Integer maxResults) {
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

    public DescribeBrokerEngineTypesResult withNextToken(String nextToken) {
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
        if (getBrokerEngineTypes() != null)
            sb.append("BrokerEngineTypes: ").append(getBrokerEngineTypes()).append(",");
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

        if (obj instanceof DescribeBrokerEngineTypesResult == false)
            return false;
        DescribeBrokerEngineTypesResult other = (DescribeBrokerEngineTypesResult) obj;
        if (other.getBrokerEngineTypes() == null ^ this.getBrokerEngineTypes() == null)
            return false;
        if (other.getBrokerEngineTypes() != null && other.getBrokerEngineTypes().equals(this.getBrokerEngineTypes()) == false)
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

        hashCode = prime * hashCode + ((getBrokerEngineTypes() == null) ? 0 : getBrokerEngineTypes().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBrokerEngineTypesResult clone() {
        try {
            return (DescribeBrokerEngineTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
