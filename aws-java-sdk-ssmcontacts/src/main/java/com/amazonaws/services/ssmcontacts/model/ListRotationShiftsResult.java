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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListRotationShifts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRotationShiftsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about shifts that meet the filter criteria.
     * </p>
     */
    private java.util.List<RotationShift> rotationShifts;
    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about shifts that meet the filter criteria.
     * </p>
     * 
     * @return Information about shifts that meet the filter criteria.
     */

    public java.util.List<RotationShift> getRotationShifts() {
        return rotationShifts;
    }

    /**
     * <p>
     * Information about shifts that meet the filter criteria.
     * </p>
     * 
     * @param rotationShifts
     *        Information about shifts that meet the filter criteria.
     */

    public void setRotationShifts(java.util.Collection<RotationShift> rotationShifts) {
        if (rotationShifts == null) {
            this.rotationShifts = null;
            return;
        }

        this.rotationShifts = new java.util.ArrayList<RotationShift>(rotationShifts);
    }

    /**
     * <p>
     * Information about shifts that meet the filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRotationShifts(java.util.Collection)} or {@link #withRotationShifts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param rotationShifts
     *        Information about shifts that meet the filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationShiftsResult withRotationShifts(RotationShift... rotationShifts) {
        if (this.rotationShifts == null) {
            setRotationShifts(new java.util.ArrayList<RotationShift>(rotationShifts.length));
        }
        for (RotationShift ele : rotationShifts) {
            this.rotationShifts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about shifts that meet the filter criteria.
     * </p>
     * 
     * @param rotationShifts
     *        Information about shifts that meet the filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationShiftsResult withRotationShifts(java.util.Collection<RotationShift> rotationShifts) {
        setRotationShifts(rotationShifts);
        return this;
    }

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

    public ListRotationShiftsResult withNextToken(String nextToken) {
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
        if (getRotationShifts() != null)
            sb.append("RotationShifts: ").append(getRotationShifts()).append(",");
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

        if (obj instanceof ListRotationShiftsResult == false)
            return false;
        ListRotationShiftsResult other = (ListRotationShiftsResult) obj;
        if (other.getRotationShifts() == null ^ this.getRotationShifts() == null)
            return false;
        if (other.getRotationShifts() != null && other.getRotationShifts().equals(this.getRotationShifts()) == false)
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

        hashCode = prime * hashCode + ((getRotationShifts() == null) ? 0 : getRotationShifts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRotationShiftsResult clone() {
        try {
            return (ListRotationShiftsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
