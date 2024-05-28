/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListRotations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRotationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about rotations that meet the filter criteria.
     * </p>
     */
    private java.util.List<Rotation> rotations;

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

    public ListRotationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about rotations that meet the filter criteria.
     * </p>
     * 
     * @return Information about rotations that meet the filter criteria.
     */

    public java.util.List<Rotation> getRotations() {
        return rotations;
    }

    /**
     * <p>
     * Information about rotations that meet the filter criteria.
     * </p>
     * 
     * @param rotations
     *        Information about rotations that meet the filter criteria.
     */

    public void setRotations(java.util.Collection<Rotation> rotations) {
        if (rotations == null) {
            this.rotations = null;
            return;
        }

        this.rotations = new java.util.ArrayList<Rotation>(rotations);
    }

    /**
     * <p>
     * Information about rotations that meet the filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRotations(java.util.Collection)} or {@link #withRotations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param rotations
     *        Information about rotations that meet the filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationsResult withRotations(Rotation... rotations) {
        if (this.rotations == null) {
            setRotations(new java.util.ArrayList<Rotation>(rotations.length));
        }
        for (Rotation ele : rotations) {
            this.rotations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about rotations that meet the filter criteria.
     * </p>
     * 
     * @param rotations
     *        Information about rotations that meet the filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationsResult withRotations(java.util.Collection<Rotation> rotations) {
        setRotations(rotations);
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
        if (getRotations() != null)
            sb.append("Rotations: ").append(getRotations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRotationsResult == false)
            return false;
        ListRotationsResult other = (ListRotationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRotations() == null ^ this.getRotations() == null)
            return false;
        if (other.getRotations() != null && other.getRotations().equals(this.getRotations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRotations() == null) ? 0 : getRotations().hashCode());
        return hashCode;
    }

    @Override
    public ListRotationsResult clone() {
        try {
            return (ListRotationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
