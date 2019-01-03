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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationAggregators"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationAggregatorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns a ConfigurationAggregators object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationAggregator> configurationAggregators;
    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a ConfigurationAggregators object.
     * </p>
     * 
     * @return Returns a ConfigurationAggregators object.
     */

    public java.util.List<ConfigurationAggregator> getConfigurationAggregators() {
        if (configurationAggregators == null) {
            configurationAggregators = new com.amazonaws.internal.SdkInternalList<ConfigurationAggregator>();
        }
        return configurationAggregators;
    }

    /**
     * <p>
     * Returns a ConfigurationAggregators object.
     * </p>
     * 
     * @param configurationAggregators
     *        Returns a ConfigurationAggregators object.
     */

    public void setConfigurationAggregators(java.util.Collection<ConfigurationAggregator> configurationAggregators) {
        if (configurationAggregators == null) {
            this.configurationAggregators = null;
            return;
        }

        this.configurationAggregators = new com.amazonaws.internal.SdkInternalList<ConfigurationAggregator>(configurationAggregators);
    }

    /**
     * <p>
     * Returns a ConfigurationAggregators object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationAggregators(java.util.Collection)} or
     * {@link #withConfigurationAggregators(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationAggregators
     *        Returns a ConfigurationAggregators object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationAggregatorsResult withConfigurationAggregators(ConfigurationAggregator... configurationAggregators) {
        if (this.configurationAggregators == null) {
            setConfigurationAggregators(new com.amazonaws.internal.SdkInternalList<ConfigurationAggregator>(configurationAggregators.length));
        }
        for (ConfigurationAggregator ele : configurationAggregators) {
            this.configurationAggregators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a ConfigurationAggregators object.
     * </p>
     * 
     * @param configurationAggregators
     *        Returns a ConfigurationAggregators object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationAggregatorsResult withConfigurationAggregators(java.util.Collection<ConfigurationAggregator> configurationAggregators) {
        setConfigurationAggregators(configurationAggregators);
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

    public DescribeConfigurationAggregatorsResult withNextToken(String nextToken) {
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
        if (getConfigurationAggregators() != null)
            sb.append("ConfigurationAggregators: ").append(getConfigurationAggregators()).append(",");
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

        if (obj instanceof DescribeConfigurationAggregatorsResult == false)
            return false;
        DescribeConfigurationAggregatorsResult other = (DescribeConfigurationAggregatorsResult) obj;
        if (other.getConfigurationAggregators() == null ^ this.getConfigurationAggregators() == null)
            return false;
        if (other.getConfigurationAggregators() != null && other.getConfigurationAggregators().equals(this.getConfigurationAggregators()) == false)
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

        hashCode = prime * hashCode + ((getConfigurationAggregators() == null) ? 0 : getConfigurationAggregators().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationAggregatorsResult clone() {
        try {
            return (DescribeConfigurationAggregatorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
