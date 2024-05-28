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
package com.amazonaws.services.managedblockchainquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/BatchGetTokenBalance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetTokenBalanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceInputItem</code> objects whose balance is being requested.
     * </p>
     */
    private java.util.List<BatchGetTokenBalanceInputItem> getTokenBalanceInputs;

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceInputItem</code> objects whose balance is being requested.
     * </p>
     * 
     * @return An array of <code>BatchGetTokenBalanceInputItem</code> objects whose balance is being requested.
     */

    public java.util.List<BatchGetTokenBalanceInputItem> getGetTokenBalanceInputs() {
        return getTokenBalanceInputs;
    }

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceInputItem</code> objects whose balance is being requested.
     * </p>
     * 
     * @param getTokenBalanceInputs
     *        An array of <code>BatchGetTokenBalanceInputItem</code> objects whose balance is being requested.
     */

    public void setGetTokenBalanceInputs(java.util.Collection<BatchGetTokenBalanceInputItem> getTokenBalanceInputs) {
        if (getTokenBalanceInputs == null) {
            this.getTokenBalanceInputs = null;
            return;
        }

        this.getTokenBalanceInputs = new java.util.ArrayList<BatchGetTokenBalanceInputItem>(getTokenBalanceInputs);
    }

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceInputItem</code> objects whose balance is being requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGetTokenBalanceInputs(java.util.Collection)} or
     * {@link #withGetTokenBalanceInputs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param getTokenBalanceInputs
     *        An array of <code>BatchGetTokenBalanceInputItem</code> objects whose balance is being requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTokenBalanceRequest withGetTokenBalanceInputs(BatchGetTokenBalanceInputItem... getTokenBalanceInputs) {
        if (this.getTokenBalanceInputs == null) {
            setGetTokenBalanceInputs(new java.util.ArrayList<BatchGetTokenBalanceInputItem>(getTokenBalanceInputs.length));
        }
        for (BatchGetTokenBalanceInputItem ele : getTokenBalanceInputs) {
            this.getTokenBalanceInputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceInputItem</code> objects whose balance is being requested.
     * </p>
     * 
     * @param getTokenBalanceInputs
     *        An array of <code>BatchGetTokenBalanceInputItem</code> objects whose balance is being requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTokenBalanceRequest withGetTokenBalanceInputs(java.util.Collection<BatchGetTokenBalanceInputItem> getTokenBalanceInputs) {
        setGetTokenBalanceInputs(getTokenBalanceInputs);
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
        if (getGetTokenBalanceInputs() != null)
            sb.append("GetTokenBalanceInputs: ").append(getGetTokenBalanceInputs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetTokenBalanceRequest == false)
            return false;
        BatchGetTokenBalanceRequest other = (BatchGetTokenBalanceRequest) obj;
        if (other.getGetTokenBalanceInputs() == null ^ this.getGetTokenBalanceInputs() == null)
            return false;
        if (other.getGetTokenBalanceInputs() != null && other.getGetTokenBalanceInputs().equals(this.getGetTokenBalanceInputs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGetTokenBalanceInputs() == null) ? 0 : getGetTokenBalanceInputs().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetTokenBalanceRequest clone() {
        return (BatchGetTokenBalanceRequest) super.clone();
    }

}
