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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListCheckDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCheckDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details about the Trusted Advisor checks related to the Well-Architected best practice.
     * </p>
     */
    private java.util.List<CheckDetail> checkDetails;

    private String nextToken;

    /**
     * <p>
     * The details about the Trusted Advisor checks related to the Well-Architected best practice.
     * </p>
     * 
     * @return The details about the Trusted Advisor checks related to the Well-Architected best practice.
     */

    public java.util.List<CheckDetail> getCheckDetails() {
        return checkDetails;
    }

    /**
     * <p>
     * The details about the Trusted Advisor checks related to the Well-Architected best practice.
     * </p>
     * 
     * @param checkDetails
     *        The details about the Trusted Advisor checks related to the Well-Architected best practice.
     */

    public void setCheckDetails(java.util.Collection<CheckDetail> checkDetails) {
        if (checkDetails == null) {
            this.checkDetails = null;
            return;
        }

        this.checkDetails = new java.util.ArrayList<CheckDetail>(checkDetails);
    }

    /**
     * <p>
     * The details about the Trusted Advisor checks related to the Well-Architected best practice.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCheckDetails(java.util.Collection)} or {@link #withCheckDetails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param checkDetails
     *        The details about the Trusted Advisor checks related to the Well-Architected best practice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCheckDetailsResult withCheckDetails(CheckDetail... checkDetails) {
        if (this.checkDetails == null) {
            setCheckDetails(new java.util.ArrayList<CheckDetail>(checkDetails.length));
        }
        for (CheckDetail ele : checkDetails) {
            this.checkDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details about the Trusted Advisor checks related to the Well-Architected best practice.
     * </p>
     * 
     * @param checkDetails
     *        The details about the Trusted Advisor checks related to the Well-Architected best practice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCheckDetailsResult withCheckDetails(java.util.Collection<CheckDetail> checkDetails) {
        setCheckDetails(checkDetails);
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

    public ListCheckDetailsResult withNextToken(String nextToken) {
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
        if (getCheckDetails() != null)
            sb.append("CheckDetails: ").append(getCheckDetails()).append(",");
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

        if (obj instanceof ListCheckDetailsResult == false)
            return false;
        ListCheckDetailsResult other = (ListCheckDetailsResult) obj;
        if (other.getCheckDetails() == null ^ this.getCheckDetails() == null)
            return false;
        if (other.getCheckDetails() != null && other.getCheckDetails().equals(this.getCheckDetails()) == false)
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

        hashCode = prime * hashCode + ((getCheckDetails() == null) ? 0 : getCheckDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCheckDetailsResult clone() {
        try {
            return (ListCheckDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
