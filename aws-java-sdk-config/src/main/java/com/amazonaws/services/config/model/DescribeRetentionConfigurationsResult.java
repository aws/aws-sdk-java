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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRetentionConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRetentionConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns a retention configuration object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RetentionConfiguration> retentionConfigurations;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a retention configuration object.
     * </p>
     * 
     * @return Returns a retention configuration object.
     */

    public java.util.List<RetentionConfiguration> getRetentionConfigurations() {
        if (retentionConfigurations == null) {
            retentionConfigurations = new com.amazonaws.internal.SdkInternalList<RetentionConfiguration>();
        }
        return retentionConfigurations;
    }

    /**
     * <p>
     * Returns a retention configuration object.
     * </p>
     * 
     * @param retentionConfigurations
     *        Returns a retention configuration object.
     */

    public void setRetentionConfigurations(java.util.Collection<RetentionConfiguration> retentionConfigurations) {
        if (retentionConfigurations == null) {
            this.retentionConfigurations = null;
            return;
        }

        this.retentionConfigurations = new com.amazonaws.internal.SdkInternalList<RetentionConfiguration>(retentionConfigurations);
    }

    /**
     * <p>
     * Returns a retention configuration object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRetentionConfigurations(java.util.Collection)} or
     * {@link #withRetentionConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param retentionConfigurations
     *        Returns a retention configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRetentionConfigurationsResult withRetentionConfigurations(RetentionConfiguration... retentionConfigurations) {
        if (this.retentionConfigurations == null) {
            setRetentionConfigurations(new com.amazonaws.internal.SdkInternalList<RetentionConfiguration>(retentionConfigurations.length));
        }
        for (RetentionConfiguration ele : retentionConfigurations) {
            this.retentionConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a retention configuration object.
     * </p>
     * 
     * @param retentionConfigurations
     *        Returns a retention configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRetentionConfigurationsResult withRetentionConfigurations(java.util.Collection<RetentionConfiguration> retentionConfigurations) {
        setRetentionConfigurations(retentionConfigurations);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRetentionConfigurationsResult withNextToken(String nextToken) {
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
        if (getRetentionConfigurations() != null)
            sb.append("RetentionConfigurations: ").append(getRetentionConfigurations()).append(",");
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

        if (obj instanceof DescribeRetentionConfigurationsResult == false)
            return false;
        DescribeRetentionConfigurationsResult other = (DescribeRetentionConfigurationsResult) obj;
        if (other.getRetentionConfigurations() == null ^ this.getRetentionConfigurations() == null)
            return false;
        if (other.getRetentionConfigurations() != null && other.getRetentionConfigurations().equals(this.getRetentionConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getRetentionConfigurations() == null) ? 0 : getRetentionConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRetentionConfigurationsResult clone() {
        try {
            return (DescribeRetentionConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
