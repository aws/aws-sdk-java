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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVerifiedAccessInstanceLoggingConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The current logging configuration for the Amazon Web Services Verified Access instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VerifiedAccessInstanceLoggingConfiguration> loggingConfigurations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The current logging configuration for the Amazon Web Services Verified Access instances.
     * </p>
     * 
     * @return The current logging configuration for the Amazon Web Services Verified Access instances.
     */

    public java.util.List<VerifiedAccessInstanceLoggingConfiguration> getLoggingConfigurations() {
        if (loggingConfigurations == null) {
            loggingConfigurations = new com.amazonaws.internal.SdkInternalList<VerifiedAccessInstanceLoggingConfiguration>();
        }
        return loggingConfigurations;
    }

    /**
     * <p>
     * The current logging configuration for the Amazon Web Services Verified Access instances.
     * </p>
     * 
     * @param loggingConfigurations
     *        The current logging configuration for the Amazon Web Services Verified Access instances.
     */

    public void setLoggingConfigurations(java.util.Collection<VerifiedAccessInstanceLoggingConfiguration> loggingConfigurations) {
        if (loggingConfigurations == null) {
            this.loggingConfigurations = null;
            return;
        }

        this.loggingConfigurations = new com.amazonaws.internal.SdkInternalList<VerifiedAccessInstanceLoggingConfiguration>(loggingConfigurations);
    }

    /**
     * <p>
     * The current logging configuration for the Amazon Web Services Verified Access instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoggingConfigurations(java.util.Collection)} or
     * {@link #withLoggingConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param loggingConfigurations
     *        The current logging configuration for the Amazon Web Services Verified Access instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessInstanceLoggingConfigurationsResult withLoggingConfigurations(
            VerifiedAccessInstanceLoggingConfiguration... loggingConfigurations) {
        if (this.loggingConfigurations == null) {
            setLoggingConfigurations(new com.amazonaws.internal.SdkInternalList<VerifiedAccessInstanceLoggingConfiguration>(loggingConfigurations.length));
        }
        for (VerifiedAccessInstanceLoggingConfiguration ele : loggingConfigurations) {
            this.loggingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current logging configuration for the Amazon Web Services Verified Access instances.
     * </p>
     * 
     * @param loggingConfigurations
     *        The current logging configuration for the Amazon Web Services Verified Access instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessInstanceLoggingConfigurationsResult withLoggingConfigurations(
            java.util.Collection<VerifiedAccessInstanceLoggingConfiguration> loggingConfigurations) {
        setLoggingConfigurations(loggingConfigurations);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessInstanceLoggingConfigurationsResult withNextToken(String nextToken) {
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
        if (getLoggingConfigurations() != null)
            sb.append("LoggingConfigurations: ").append(getLoggingConfigurations()).append(",");
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

        if (obj instanceof DescribeVerifiedAccessInstanceLoggingConfigurationsResult == false)
            return false;
        DescribeVerifiedAccessInstanceLoggingConfigurationsResult other = (DescribeVerifiedAccessInstanceLoggingConfigurationsResult) obj;
        if (other.getLoggingConfigurations() == null ^ this.getLoggingConfigurations() == null)
            return false;
        if (other.getLoggingConfigurations() != null && other.getLoggingConfigurations().equals(this.getLoggingConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getLoggingConfigurations() == null) ? 0 : getLoggingConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVerifiedAccessInstanceLoggingConfigurationsResult clone() {
        try {
            return (DescribeVerifiedAccessInstanceLoggingConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
