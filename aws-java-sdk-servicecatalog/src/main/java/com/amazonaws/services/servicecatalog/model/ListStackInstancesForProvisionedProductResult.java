/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListStackInstancesForProvisionedProduct"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackInstancesForProvisionedProductResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * List of stack instances.
     * </p>
     */
    private java.util.List<StackInstance> stackInstances;
    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * List of stack instances.
     * </p>
     * 
     * @return List of stack instances.
     */

    public java.util.List<StackInstance> getStackInstances() {
        return stackInstances;
    }

    /**
     * <p>
     * List of stack instances.
     * </p>
     * 
     * @param stackInstances
     *        List of stack instances.
     */

    public void setStackInstances(java.util.Collection<StackInstance> stackInstances) {
        if (stackInstances == null) {
            this.stackInstances = null;
            return;
        }

        this.stackInstances = new java.util.ArrayList<StackInstance>(stackInstances);
    }

    /**
     * <p>
     * List of stack instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackInstances(java.util.Collection)} or {@link #withStackInstances(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stackInstances
     *        List of stack instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstancesForProvisionedProductResult withStackInstances(StackInstance... stackInstances) {
        if (this.stackInstances == null) {
            setStackInstances(new java.util.ArrayList<StackInstance>(stackInstances.length));
        }
        for (StackInstance ele : stackInstances) {
            this.stackInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of stack instances.
     * </p>
     * 
     * @param stackInstances
     *        List of stack instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstancesForProvisionedProductResult withStackInstances(java.util.Collection<StackInstance> stackInstances) {
        setStackInstances(stackInstances);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @return The page token to use to retrieve the next set of results. If there are no additional results, this value
     *         is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstancesForProvisionedProductResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getStackInstances() != null)
            sb.append("StackInstances: ").append(getStackInstances()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStackInstancesForProvisionedProductResult == false)
            return false;
        ListStackInstancesForProvisionedProductResult other = (ListStackInstancesForProvisionedProductResult) obj;
        if (other.getStackInstances() == null ^ this.getStackInstances() == null)
            return false;
        if (other.getStackInstances() != null && other.getStackInstances().equals(this.getStackInstances()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackInstances() == null) ? 0 : getStackInstances().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStackInstancesForProvisionedProductResult clone() {
        try {
            return (ListStackInstancesForProvisionedProductResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
