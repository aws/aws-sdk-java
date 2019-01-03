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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A result message containing a list of completed and failed managed actions.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentManagedActionHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentManagedActionHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list of completed and failed managed actions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ManagedActionHistoryItem> managedActionHistoryItems;
    /**
     * <p>
     * A pagination token that you pass to <a>DescribeEnvironmentManagedActionHistory</a> to get the next page of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of completed and failed managed actions.
     * </p>
     * 
     * @return A list of completed and failed managed actions.
     */

    public java.util.List<ManagedActionHistoryItem> getManagedActionHistoryItems() {
        if (managedActionHistoryItems == null) {
            managedActionHistoryItems = new com.amazonaws.internal.SdkInternalList<ManagedActionHistoryItem>();
        }
        return managedActionHistoryItems;
    }

    /**
     * <p>
     * A list of completed and failed managed actions.
     * </p>
     * 
     * @param managedActionHistoryItems
     *        A list of completed and failed managed actions.
     */

    public void setManagedActionHistoryItems(java.util.Collection<ManagedActionHistoryItem> managedActionHistoryItems) {
        if (managedActionHistoryItems == null) {
            this.managedActionHistoryItems = null;
            return;
        }

        this.managedActionHistoryItems = new com.amazonaws.internal.SdkInternalList<ManagedActionHistoryItem>(managedActionHistoryItems);
    }

    /**
     * <p>
     * A list of completed and failed managed actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedActionHistoryItems(java.util.Collection)} or
     * {@link #withManagedActionHistoryItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param managedActionHistoryItems
     *        A list of completed and failed managed actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentManagedActionHistoryResult withManagedActionHistoryItems(ManagedActionHistoryItem... managedActionHistoryItems) {
        if (this.managedActionHistoryItems == null) {
            setManagedActionHistoryItems(new com.amazonaws.internal.SdkInternalList<ManagedActionHistoryItem>(managedActionHistoryItems.length));
        }
        for (ManagedActionHistoryItem ele : managedActionHistoryItems) {
            this.managedActionHistoryItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of completed and failed managed actions.
     * </p>
     * 
     * @param managedActionHistoryItems
     *        A list of completed and failed managed actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentManagedActionHistoryResult withManagedActionHistoryItems(java.util.Collection<ManagedActionHistoryItem> managedActionHistoryItems) {
        setManagedActionHistoryItems(managedActionHistoryItems);
        return this;
    }

    /**
     * <p>
     * A pagination token that you pass to <a>DescribeEnvironmentManagedActionHistory</a> to get the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that you pass to <a>DescribeEnvironmentManagedActionHistory</a> to get the next page of
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that you pass to <a>DescribeEnvironmentManagedActionHistory</a> to get the next page of
     * results.
     * </p>
     * 
     * @return A pagination token that you pass to <a>DescribeEnvironmentManagedActionHistory</a> to get the next page
     *         of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that you pass to <a>DescribeEnvironmentManagedActionHistory</a> to get the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that you pass to <a>DescribeEnvironmentManagedActionHistory</a> to get the next page of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentManagedActionHistoryResult withNextToken(String nextToken) {
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
        if (getManagedActionHistoryItems() != null)
            sb.append("ManagedActionHistoryItems: ").append(getManagedActionHistoryItems()).append(",");
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

        if (obj instanceof DescribeEnvironmentManagedActionHistoryResult == false)
            return false;
        DescribeEnvironmentManagedActionHistoryResult other = (DescribeEnvironmentManagedActionHistoryResult) obj;
        if (other.getManagedActionHistoryItems() == null ^ this.getManagedActionHistoryItems() == null)
            return false;
        if (other.getManagedActionHistoryItems() != null && other.getManagedActionHistoryItems().equals(this.getManagedActionHistoryItems()) == false)
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

        hashCode = prime * hashCode + ((getManagedActionHistoryItems() == null) ? 0 : getManagedActionHistoryItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentManagedActionHistoryResult clone() {
        try {
            return (DescribeEnvironmentManagedActionHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
