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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeOpsItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOpsItemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of OpsItems.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OpsItemSummary> opsItemSummaries;

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @return The token for the next set of items to return. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOpsItemsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of OpsItems.
     * </p>
     * 
     * @return A list of OpsItems.
     */

    public java.util.List<OpsItemSummary> getOpsItemSummaries() {
        if (opsItemSummaries == null) {
            opsItemSummaries = new com.amazonaws.internal.SdkInternalList<OpsItemSummary>();
        }
        return opsItemSummaries;
    }

    /**
     * <p>
     * A list of OpsItems.
     * </p>
     * 
     * @param opsItemSummaries
     *        A list of OpsItems.
     */

    public void setOpsItemSummaries(java.util.Collection<OpsItemSummary> opsItemSummaries) {
        if (opsItemSummaries == null) {
            this.opsItemSummaries = null;
            return;
        }

        this.opsItemSummaries = new com.amazonaws.internal.SdkInternalList<OpsItemSummary>(opsItemSummaries);
    }

    /**
     * <p>
     * A list of OpsItems.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOpsItemSummaries(java.util.Collection)} or {@link #withOpsItemSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param opsItemSummaries
     *        A list of OpsItems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOpsItemsResult withOpsItemSummaries(OpsItemSummary... opsItemSummaries) {
        if (this.opsItemSummaries == null) {
            setOpsItemSummaries(new com.amazonaws.internal.SdkInternalList<OpsItemSummary>(opsItemSummaries.length));
        }
        for (OpsItemSummary ele : opsItemSummaries) {
            this.opsItemSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of OpsItems.
     * </p>
     * 
     * @param opsItemSummaries
     *        A list of OpsItems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOpsItemsResult withOpsItemSummaries(java.util.Collection<OpsItemSummary> opsItemSummaries) {
        setOpsItemSummaries(opsItemSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOpsItemSummaries() != null)
            sb.append("OpsItemSummaries: ").append(getOpsItemSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOpsItemsResult == false)
            return false;
        DescribeOpsItemsResult other = (DescribeOpsItemsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOpsItemSummaries() == null ^ this.getOpsItemSummaries() == null)
            return false;
        if (other.getOpsItemSummaries() != null && other.getOpsItemSummaries().equals(this.getOpsItemSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOpsItemSummaries() == null) ? 0 : getOpsItemSummaries().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOpsItemsResult clone() {
        try {
            return (DescribeOpsItemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
