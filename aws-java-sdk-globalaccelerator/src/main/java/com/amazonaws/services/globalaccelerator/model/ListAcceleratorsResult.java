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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListAccelerators" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAcceleratorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of accelerators for a customer account.
     * </p>
     */
    private java.util.List<Accelerator> accelerators;
    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of accelerators for a customer account.
     * </p>
     * 
     * @return The list of accelerators for a customer account.
     */

    public java.util.List<Accelerator> getAccelerators() {
        return accelerators;
    }

    /**
     * <p>
     * The list of accelerators for a customer account.
     * </p>
     * 
     * @param accelerators
     *        The list of accelerators for a customer account.
     */

    public void setAccelerators(java.util.Collection<Accelerator> accelerators) {
        if (accelerators == null) {
            this.accelerators = null;
            return;
        }

        this.accelerators = new java.util.ArrayList<Accelerator>(accelerators);
    }

    /**
     * <p>
     * The list of accelerators for a customer account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccelerators(java.util.Collection)} or {@link #withAccelerators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accelerators
     *        The list of accelerators for a customer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAcceleratorsResult withAccelerators(Accelerator... accelerators) {
        if (this.accelerators == null) {
            setAccelerators(new java.util.ArrayList<Accelerator>(accelerators.length));
        }
        for (Accelerator ele : accelerators) {
            this.accelerators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of accelerators for a customer account.
     * </p>
     * 
     * @param accelerators
     *        The list of accelerators for a customer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAcceleratorsResult withAccelerators(java.util.Collection<Accelerator> accelerators) {
        setAccelerators(accelerators);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @return The token for the next set of results. You receive this token from a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAcceleratorsResult withNextToken(String nextToken) {
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
        if (getAccelerators() != null)
            sb.append("Accelerators: ").append(getAccelerators()).append(",");
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

        if (obj instanceof ListAcceleratorsResult == false)
            return false;
        ListAcceleratorsResult other = (ListAcceleratorsResult) obj;
        if (other.getAccelerators() == null ^ this.getAccelerators() == null)
            return false;
        if (other.getAccelerators() != null && other.getAccelerators().equals(this.getAccelerators()) == false)
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

        hashCode = prime * hashCode + ((getAccelerators() == null) ? 0 : getAccelerators().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAcceleratorsResult clone() {
        try {
            return (ListAcceleratorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
