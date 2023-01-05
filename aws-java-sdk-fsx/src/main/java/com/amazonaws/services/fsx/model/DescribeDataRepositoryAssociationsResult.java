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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataRepositoryAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of one or more data repository association descriptions.
     * </p>
     */
    private java.util.List<DataRepositoryAssociation> associations;

    private String nextToken;

    /**
     * <p>
     * An array of one or more data repository association descriptions.
     * </p>
     * 
     * @return An array of one or more data repository association descriptions.
     */

    public java.util.List<DataRepositoryAssociation> getAssociations() {
        return associations;
    }

    /**
     * <p>
     * An array of one or more data repository association descriptions.
     * </p>
     * 
     * @param associations
     *        An array of one or more data repository association descriptions.
     */

    public void setAssociations(java.util.Collection<DataRepositoryAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new java.util.ArrayList<DataRepositoryAssociation>(associations);
    }

    /**
     * <p>
     * An array of one or more data repository association descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociations(java.util.Collection)} or {@link #withAssociations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param associations
     *        An array of one or more data repository association descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryAssociationsResult withAssociations(DataRepositoryAssociation... associations) {
        if (this.associations == null) {
            setAssociations(new java.util.ArrayList<DataRepositoryAssociation>(associations.length));
        }
        for (DataRepositoryAssociation ele : associations) {
            this.associations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of one or more data repository association descriptions.
     * </p>
     * 
     * @param associations
     *        An array of one or more data repository association descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryAssociationsResult withAssociations(java.util.Collection<DataRepositoryAssociation> associations) {
        setAssociations(associations);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryAssociationsResult withNextToken(String nextToken) {
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
        if (getAssociations() != null)
            sb.append("Associations: ").append(getAssociations()).append(",");
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

        if (obj instanceof DescribeDataRepositoryAssociationsResult == false)
            return false;
        DescribeDataRepositoryAssociationsResult other = (DescribeDataRepositoryAssociationsResult) obj;
        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false)
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

        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataRepositoryAssociationsResult clone() {
        try {
            return (DescribeDataRepositoryAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
