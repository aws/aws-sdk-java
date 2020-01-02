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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeCapacityProviders" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCapacityProvidersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of capacity providers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CapacityProvider> capacityProviders;
    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Failure> failures;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeCapacityProviders</code> request. When the
     * results of a <code>DescribeCapacityProviders</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of capacity providers.
     * </p>
     * 
     * @return The list of capacity providers.
     */

    public java.util.List<CapacityProvider> getCapacityProviders() {
        if (capacityProviders == null) {
            capacityProviders = new com.amazonaws.internal.SdkInternalList<CapacityProvider>();
        }
        return capacityProviders;
    }

    /**
     * <p>
     * The list of capacity providers.
     * </p>
     * 
     * @param capacityProviders
     *        The list of capacity providers.
     */

    public void setCapacityProviders(java.util.Collection<CapacityProvider> capacityProviders) {
        if (capacityProviders == null) {
            this.capacityProviders = null;
            return;
        }

        this.capacityProviders = new com.amazonaws.internal.SdkInternalList<CapacityProvider>(capacityProviders);
    }

    /**
     * <p>
     * The list of capacity providers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityProviders(java.util.Collection)} or {@link #withCapacityProviders(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param capacityProviders
     *        The list of capacity providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityProvidersResult withCapacityProviders(CapacityProvider... capacityProviders) {
        if (this.capacityProviders == null) {
            setCapacityProviders(new com.amazonaws.internal.SdkInternalList<CapacityProvider>(capacityProviders.length));
        }
        for (CapacityProvider ele : capacityProviders) {
            this.capacityProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of capacity providers.
     * </p>
     * 
     * @param capacityProviders
     *        The list of capacity providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityProvidersResult withCapacityProviders(java.util.Collection<CapacityProvider> capacityProviders) {
        setCapacityProviders(capacityProviders);
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @return Any failures associated with the call.
     */

    public java.util.List<Failure> getFailures() {
        if (failures == null) {
            failures = new com.amazonaws.internal.SdkInternalList<Failure>();
        }
        return failures;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     */

    public void setFailures(java.util.Collection<Failure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new com.amazonaws.internal.SdkInternalList<Failure>(failures);
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityProvidersResult withFailures(Failure... failures) {
        if (this.failures == null) {
            setFailures(new com.amazonaws.internal.SdkInternalList<Failure>(failures.length));
        }
        for (Failure ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityProvidersResult withFailures(java.util.Collection<Failure> failures) {
        setFailures(failures);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeCapacityProviders</code> request. When the
     * results of a <code>DescribeCapacityProviders</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeCapacityProviders</code> request.
     *        When the results of a <code>DescribeCapacityProviders</code> request exceed <code>maxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeCapacityProviders</code> request. When the
     * results of a <code>DescribeCapacityProviders</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>DescribeCapacityProviders</code> request.
     *         When the results of a <code>DescribeCapacityProviders</code> request exceed <code>maxResults</code>, this
     *         value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeCapacityProviders</code> request. When the
     * results of a <code>DescribeCapacityProviders</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeCapacityProviders</code> request.
     *        When the results of a <code>DescribeCapacityProviders</code> request exceed <code>maxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityProvidersResult withNextToken(String nextToken) {
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
        if (getCapacityProviders() != null)
            sb.append("CapacityProviders: ").append(getCapacityProviders()).append(",");
        if (getFailures() != null)
            sb.append("Failures: ").append(getFailures()).append(",");
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

        if (obj instanceof DescribeCapacityProvidersResult == false)
            return false;
        DescribeCapacityProvidersResult other = (DescribeCapacityProvidersResult) obj;
        if (other.getCapacityProviders() == null ^ this.getCapacityProviders() == null)
            return false;
        if (other.getCapacityProviders() != null && other.getCapacityProviders().equals(this.getCapacityProviders()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
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

        hashCode = prime * hashCode + ((getCapacityProviders() == null) ? 0 : getCapacityProviders().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCapacityProvidersResult clone() {
        try {
            return (DescribeCapacityProvidersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
