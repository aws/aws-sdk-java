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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationExecutionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRemediationExecutionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns a list of remediation execution statuses objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RemediationExecutionStatus> remediationExecutionStatuses;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a list of remediation execution statuses objects.
     * </p>
     * 
     * @return Returns a list of remediation execution statuses objects.
     */

    public java.util.List<RemediationExecutionStatus> getRemediationExecutionStatuses() {
        if (remediationExecutionStatuses == null) {
            remediationExecutionStatuses = new com.amazonaws.internal.SdkInternalList<RemediationExecutionStatus>();
        }
        return remediationExecutionStatuses;
    }

    /**
     * <p>
     * Returns a list of remediation execution statuses objects.
     * </p>
     * 
     * @param remediationExecutionStatuses
     *        Returns a list of remediation execution statuses objects.
     */

    public void setRemediationExecutionStatuses(java.util.Collection<RemediationExecutionStatus> remediationExecutionStatuses) {
        if (remediationExecutionStatuses == null) {
            this.remediationExecutionStatuses = null;
            return;
        }

        this.remediationExecutionStatuses = new com.amazonaws.internal.SdkInternalList<RemediationExecutionStatus>(remediationExecutionStatuses);
    }

    /**
     * <p>
     * Returns a list of remediation execution statuses objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemediationExecutionStatuses(java.util.Collection)} or
     * {@link #withRemediationExecutionStatuses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param remediationExecutionStatuses
     *        Returns a list of remediation execution statuses objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRemediationExecutionStatusResult withRemediationExecutionStatuses(RemediationExecutionStatus... remediationExecutionStatuses) {
        if (this.remediationExecutionStatuses == null) {
            setRemediationExecutionStatuses(new com.amazonaws.internal.SdkInternalList<RemediationExecutionStatus>(remediationExecutionStatuses.length));
        }
        for (RemediationExecutionStatus ele : remediationExecutionStatuses) {
            this.remediationExecutionStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of remediation execution statuses objects.
     * </p>
     * 
     * @param remediationExecutionStatuses
     *        Returns a list of remediation execution statuses objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRemediationExecutionStatusResult withRemediationExecutionStatuses(
            java.util.Collection<RemediationExecutionStatus> remediationExecutionStatuses) {
        setRemediationExecutionStatuses(remediationExecutionStatuses);
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

    public DescribeRemediationExecutionStatusResult withNextToken(String nextToken) {
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
        if (getRemediationExecutionStatuses() != null)
            sb.append("RemediationExecutionStatuses: ").append(getRemediationExecutionStatuses()).append(",");
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

        if (obj instanceof DescribeRemediationExecutionStatusResult == false)
            return false;
        DescribeRemediationExecutionStatusResult other = (DescribeRemediationExecutionStatusResult) obj;
        if (other.getRemediationExecutionStatuses() == null ^ this.getRemediationExecutionStatuses() == null)
            return false;
        if (other.getRemediationExecutionStatuses() != null && other.getRemediationExecutionStatuses().equals(this.getRemediationExecutionStatuses()) == false)
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

        hashCode = prime * hashCode + ((getRemediationExecutionStatuses() == null) ? 0 : getRemediationExecutionStatuses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRemediationExecutionStatusResult clone() {
        try {
            return (DescribeRemediationExecutionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
