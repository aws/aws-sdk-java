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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeAccountModifications"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountModificationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of modifications to the configuration of BYOL.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccountModification> accountModifications;
    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of modifications to the configuration of BYOL.
     * </p>
     * 
     * @return The list of modifications to the configuration of BYOL.
     */

    public java.util.List<AccountModification> getAccountModifications() {
        if (accountModifications == null) {
            accountModifications = new com.amazonaws.internal.SdkInternalList<AccountModification>();
        }
        return accountModifications;
    }

    /**
     * <p>
     * The list of modifications to the configuration of BYOL.
     * </p>
     * 
     * @param accountModifications
     *        The list of modifications to the configuration of BYOL.
     */

    public void setAccountModifications(java.util.Collection<AccountModification> accountModifications) {
        if (accountModifications == null) {
            this.accountModifications = null;
            return;
        }

        this.accountModifications = new com.amazonaws.internal.SdkInternalList<AccountModification>(accountModifications);
    }

    /**
     * <p>
     * The list of modifications to the configuration of BYOL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountModifications(java.util.Collection)} or {@link #withAccountModifications(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param accountModifications
     *        The list of modifications to the configuration of BYOL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountModificationsResult withAccountModifications(AccountModification... accountModifications) {
        if (this.accountModifications == null) {
            setAccountModifications(new com.amazonaws.internal.SdkInternalList<AccountModification>(accountModifications.length));
        }
        for (AccountModification ele : accountModifications) {
            this.accountModifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of modifications to the configuration of BYOL.
     * </p>
     * 
     * @param accountModifications
     *        The list of modifications to the configuration of BYOL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountModificationsResult withAccountModifications(java.util.Collection<AccountModification> accountModifications) {
        setAccountModifications(accountModifications);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next set of results, or null if no more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @return The token to use to retrieve the next set of results, or null if no more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next set of results, or null if no more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountModificationsResult withNextToken(String nextToken) {
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
        if (getAccountModifications() != null)
            sb.append("AccountModifications: ").append(getAccountModifications()).append(",");
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

        if (obj instanceof DescribeAccountModificationsResult == false)
            return false;
        DescribeAccountModificationsResult other = (DescribeAccountModificationsResult) obj;
        if (other.getAccountModifications() == null ^ this.getAccountModifications() == null)
            return false;
        if (other.getAccountModifications() != null && other.getAccountModifications().equals(this.getAccountModifications()) == false)
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

        hashCode = prime * hashCode + ((getAccountModifications() == null) ? 0 : getAccountModifications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountModificationsResult clone() {
        try {
            return (DescribeAccountModificationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
