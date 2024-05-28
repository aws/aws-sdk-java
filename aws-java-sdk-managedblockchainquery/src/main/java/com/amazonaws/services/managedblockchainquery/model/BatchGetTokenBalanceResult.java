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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/BatchGetTokenBalance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetTokenBalanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceOutputItem</code> objects returned by the response.
     * </p>
     */
    private java.util.List<BatchGetTokenBalanceOutputItem> tokenBalances;
    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceErrorItem</code> objects returned from the request.
     * </p>
     */
    private java.util.List<BatchGetTokenBalanceErrorItem> errors;

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceOutputItem</code> objects returned by the response.
     * </p>
     * 
     * @return An array of <code>BatchGetTokenBalanceOutputItem</code> objects returned by the response.
     */

    public java.util.List<BatchGetTokenBalanceOutputItem> getTokenBalances() {
        return tokenBalances;
    }

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceOutputItem</code> objects returned by the response.
     * </p>
     * 
     * @param tokenBalances
     *        An array of <code>BatchGetTokenBalanceOutputItem</code> objects returned by the response.
     */

    public void setTokenBalances(java.util.Collection<BatchGetTokenBalanceOutputItem> tokenBalances) {
        if (tokenBalances == null) {
            this.tokenBalances = null;
            return;
        }

        this.tokenBalances = new java.util.ArrayList<BatchGetTokenBalanceOutputItem>(tokenBalances);
    }

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceOutputItem</code> objects returned by the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenBalances(java.util.Collection)} or {@link #withTokenBalances(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tokenBalances
     *        An array of <code>BatchGetTokenBalanceOutputItem</code> objects returned by the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTokenBalanceResult withTokenBalances(BatchGetTokenBalanceOutputItem... tokenBalances) {
        if (this.tokenBalances == null) {
            setTokenBalances(new java.util.ArrayList<BatchGetTokenBalanceOutputItem>(tokenBalances.length));
        }
        for (BatchGetTokenBalanceOutputItem ele : tokenBalances) {
            this.tokenBalances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceOutputItem</code> objects returned by the response.
     * </p>
     * 
     * @param tokenBalances
     *        An array of <code>BatchGetTokenBalanceOutputItem</code> objects returned by the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTokenBalanceResult withTokenBalances(java.util.Collection<BatchGetTokenBalanceOutputItem> tokenBalances) {
        setTokenBalances(tokenBalances);
        return this;
    }

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceErrorItem</code> objects returned from the request.
     * </p>
     * 
     * @return An array of <code>BatchGetTokenBalanceErrorItem</code> objects returned from the request.
     */

    public java.util.List<BatchGetTokenBalanceErrorItem> getErrors() {
        return errors;
    }

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceErrorItem</code> objects returned from the request.
     * </p>
     * 
     * @param errors
     *        An array of <code>BatchGetTokenBalanceErrorItem</code> objects returned from the request.
     */

    public void setErrors(java.util.Collection<BatchGetTokenBalanceErrorItem> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetTokenBalanceErrorItem>(errors);
    }

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceErrorItem</code> objects returned from the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        An array of <code>BatchGetTokenBalanceErrorItem</code> objects returned from the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTokenBalanceResult withErrors(BatchGetTokenBalanceErrorItem... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchGetTokenBalanceErrorItem>(errors.length));
        }
        for (BatchGetTokenBalanceErrorItem ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BatchGetTokenBalanceErrorItem</code> objects returned from the request.
     * </p>
     * 
     * @param errors
     *        An array of <code>BatchGetTokenBalanceErrorItem</code> objects returned from the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTokenBalanceResult withErrors(java.util.Collection<BatchGetTokenBalanceErrorItem> errors) {
        setErrors(errors);
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
        if (getTokenBalances() != null)
            sb.append("TokenBalances: ").append(getTokenBalances()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetTokenBalanceResult == false)
            return false;
        BatchGetTokenBalanceResult other = (BatchGetTokenBalanceResult) obj;
        if (other.getTokenBalances() == null ^ this.getTokenBalances() == null)
            return false;
        if (other.getTokenBalances() != null && other.getTokenBalances().equals(this.getTokenBalances()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenBalances() == null) ? 0 : getTokenBalances().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetTokenBalanceResult clone() {
        try {
            return (BatchGetTokenBalanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
