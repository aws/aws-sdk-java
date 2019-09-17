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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBrokerInstanceOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBrokerInstanceOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /** List of available broker instance options. */
    private java.util.List<BrokerInstanceOption> brokerInstanceOptions;
    /**
     * Required. The maximum number of instance options that can be returned per page (20 by default). This value must
     * be an integer from 5 to 100.
     */
    private Integer maxResults;
    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     */
    private String nextToken;

    /**
     * List of available broker instance options.
     * 
     * @return List of available broker instance options.
     */

    public java.util.List<BrokerInstanceOption> getBrokerInstanceOptions() {
        return brokerInstanceOptions;
    }

    /**
     * List of available broker instance options.
     * 
     * @param brokerInstanceOptions
     *        List of available broker instance options.
     */

    public void setBrokerInstanceOptions(java.util.Collection<BrokerInstanceOption> brokerInstanceOptions) {
        if (brokerInstanceOptions == null) {
            this.brokerInstanceOptions = null;
            return;
        }

        this.brokerInstanceOptions = new java.util.ArrayList<BrokerInstanceOption>(brokerInstanceOptions);
    }

    /**
     * List of available broker instance options.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBrokerInstanceOptions(java.util.Collection)} or
     * {@link #withBrokerInstanceOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param brokerInstanceOptions
     *        List of available broker instance options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerInstanceOptionsResult withBrokerInstanceOptions(BrokerInstanceOption... brokerInstanceOptions) {
        if (this.brokerInstanceOptions == null) {
            setBrokerInstanceOptions(new java.util.ArrayList<BrokerInstanceOption>(brokerInstanceOptions.length));
        }
        for (BrokerInstanceOption ele : brokerInstanceOptions) {
            this.brokerInstanceOptions.add(ele);
        }
        return this;
    }

    /**
     * List of available broker instance options.
     * 
     * @param brokerInstanceOptions
     *        List of available broker instance options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerInstanceOptionsResult withBrokerInstanceOptions(java.util.Collection<BrokerInstanceOption> brokerInstanceOptions) {
        setBrokerInstanceOptions(brokerInstanceOptions);
        return this;
    }

    /**
     * Required. The maximum number of instance options that can be returned per page (20 by default). This value must
     * be an integer from 5 to 100.
     * 
     * @param maxResults
     *        Required. The maximum number of instance options that can be returned per page (20 by default). This value
     *        must be an integer from 5 to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Required. The maximum number of instance options that can be returned per page (20 by default). This value must
     * be an integer from 5 to 100.
     * 
     * @return Required. The maximum number of instance options that can be returned per page (20 by default). This
     *         value must be an integer from 5 to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Required. The maximum number of instance options that can be returned per page (20 by default). This value must
     * be an integer from 5 to 100.
     * 
     * @param maxResults
     *        Required. The maximum number of instance options that can be returned per page (20 by default). This value
     *        must be an integer from 5 to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerInstanceOptionsResult withMaxResults(Integer maxResults) {
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

    public DescribeBrokerInstanceOptionsResult withNextToken(String nextToken) {
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
        if (getBrokerInstanceOptions() != null)
            sb.append("BrokerInstanceOptions: ").append(getBrokerInstanceOptions()).append(",");
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

        if (obj instanceof DescribeBrokerInstanceOptionsResult == false)
            return false;
        DescribeBrokerInstanceOptionsResult other = (DescribeBrokerInstanceOptionsResult) obj;
        if (other.getBrokerInstanceOptions() == null ^ this.getBrokerInstanceOptions() == null)
            return false;
        if (other.getBrokerInstanceOptions() != null && other.getBrokerInstanceOptions().equals(this.getBrokerInstanceOptions()) == false)
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

        hashCode = prime * hashCode + ((getBrokerInstanceOptions() == null) ? 0 : getBrokerInstanceOptions().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBrokerInstanceOptionsResult clone() {
        try {
            return (DescribeBrokerInstanceOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
