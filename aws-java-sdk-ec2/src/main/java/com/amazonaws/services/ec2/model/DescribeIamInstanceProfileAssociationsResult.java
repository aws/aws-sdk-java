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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIamInstanceProfileAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about one or more IAM instance profile associations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IamInstanceProfileAssociation> iamInstanceProfileAssociations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about one or more IAM instance profile associations.
     * </p>
     * 
     * @return Information about one or more IAM instance profile associations.
     */

    public java.util.List<IamInstanceProfileAssociation> getIamInstanceProfileAssociations() {
        if (iamInstanceProfileAssociations == null) {
            iamInstanceProfileAssociations = new com.amazonaws.internal.SdkInternalList<IamInstanceProfileAssociation>();
        }
        return iamInstanceProfileAssociations;
    }

    /**
     * <p>
     * Information about one or more IAM instance profile associations.
     * </p>
     * 
     * @param iamInstanceProfileAssociations
     *        Information about one or more IAM instance profile associations.
     */

    public void setIamInstanceProfileAssociations(java.util.Collection<IamInstanceProfileAssociation> iamInstanceProfileAssociations) {
        if (iamInstanceProfileAssociations == null) {
            this.iamInstanceProfileAssociations = null;
            return;
        }

        this.iamInstanceProfileAssociations = new com.amazonaws.internal.SdkInternalList<IamInstanceProfileAssociation>(iamInstanceProfileAssociations);
    }

    /**
     * <p>
     * Information about one or more IAM instance profile associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIamInstanceProfileAssociations(java.util.Collection)} or
     * {@link #withIamInstanceProfileAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param iamInstanceProfileAssociations
     *        Information about one or more IAM instance profile associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIamInstanceProfileAssociationsResult withIamInstanceProfileAssociations(IamInstanceProfileAssociation... iamInstanceProfileAssociations) {
        if (this.iamInstanceProfileAssociations == null) {
            setIamInstanceProfileAssociations(new com.amazonaws.internal.SdkInternalList<IamInstanceProfileAssociation>(iamInstanceProfileAssociations.length));
        }
        for (IamInstanceProfileAssociation ele : iamInstanceProfileAssociations) {
            this.iamInstanceProfileAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more IAM instance profile associations.
     * </p>
     * 
     * @param iamInstanceProfileAssociations
     *        Information about one or more IAM instance profile associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIamInstanceProfileAssociationsResult withIamInstanceProfileAssociations(
            java.util.Collection<IamInstanceProfileAssociation> iamInstanceProfileAssociations) {
        setIamInstanceProfileAssociations(iamInstanceProfileAssociations);
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

    public DescribeIamInstanceProfileAssociationsResult withNextToken(String nextToken) {
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
        if (getIamInstanceProfileAssociations() != null)
            sb.append("IamInstanceProfileAssociations: ").append(getIamInstanceProfileAssociations()).append(",");
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

        if (obj instanceof DescribeIamInstanceProfileAssociationsResult == false)
            return false;
        DescribeIamInstanceProfileAssociationsResult other = (DescribeIamInstanceProfileAssociationsResult) obj;
        if (other.getIamInstanceProfileAssociations() == null ^ this.getIamInstanceProfileAssociations() == null)
            return false;
        if (other.getIamInstanceProfileAssociations() != null
                && other.getIamInstanceProfileAssociations().equals(this.getIamInstanceProfileAssociations()) == false)
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

        hashCode = prime * hashCode + ((getIamInstanceProfileAssociations() == null) ? 0 : getIamInstanceProfileAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIamInstanceProfileAssociationsResult clone() {
        try {
            return (DescribeIamInstanceProfileAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
