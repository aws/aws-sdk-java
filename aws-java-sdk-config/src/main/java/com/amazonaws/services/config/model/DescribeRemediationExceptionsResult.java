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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationExceptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRemediationExceptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns a list of remediation exception objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RemediationException> remediationExceptions;
    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a list of remediation exception objects.
     * </p>
     * 
     * @return Returns a list of remediation exception objects.
     */

    public java.util.List<RemediationException> getRemediationExceptions() {
        if (remediationExceptions == null) {
            remediationExceptions = new com.amazonaws.internal.SdkInternalList<RemediationException>();
        }
        return remediationExceptions;
    }

    /**
     * <p>
     * Returns a list of remediation exception objects.
     * </p>
     * 
     * @param remediationExceptions
     *        Returns a list of remediation exception objects.
     */

    public void setRemediationExceptions(java.util.Collection<RemediationException> remediationExceptions) {
        if (remediationExceptions == null) {
            this.remediationExceptions = null;
            return;
        }

        this.remediationExceptions = new com.amazonaws.internal.SdkInternalList<RemediationException>(remediationExceptions);
    }

    /**
     * <p>
     * Returns a list of remediation exception objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemediationExceptions(java.util.Collection)} or
     * {@link #withRemediationExceptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param remediationExceptions
     *        Returns a list of remediation exception objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRemediationExceptionsResult withRemediationExceptions(RemediationException... remediationExceptions) {
        if (this.remediationExceptions == null) {
            setRemediationExceptions(new com.amazonaws.internal.SdkInternalList<RemediationException>(remediationExceptions.length));
        }
        for (RemediationException ele : remediationExceptions) {
            this.remediationExceptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of remediation exception objects.
     * </p>
     * 
     * @param remediationExceptions
     *        Returns a list of remediation exception objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRemediationExceptionsResult withRemediationExceptions(java.util.Collection<RemediationException> remediationExceptions) {
        setRemediationExceptions(remediationExceptions);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *        results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *        results in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRemediationExceptionsResult withNextToken(String nextToken) {
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
        if (getRemediationExceptions() != null)
            sb.append("RemediationExceptions: ").append(getRemediationExceptions()).append(",");
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

        if (obj instanceof DescribeRemediationExceptionsResult == false)
            return false;
        DescribeRemediationExceptionsResult other = (DescribeRemediationExceptionsResult) obj;
        if (other.getRemediationExceptions() == null ^ this.getRemediationExceptions() == null)
            return false;
        if (other.getRemediationExceptions() != null && other.getRemediationExceptions().equals(this.getRemediationExceptions()) == false)
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

        hashCode = prime * hashCode + ((getRemediationExceptions() == null) ? 0 : getRemediationExceptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRemediationExceptionsResult clone() {
        try {
            return (DescribeRemediationExceptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
