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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxEnvironments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKxEnvironmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of environments in an account.
     * </p>
     */
    private java.util.List<KxEnvironment> environments;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of environments in an account.
     * </p>
     * 
     * @return A list of environments in an account.
     */

    public java.util.List<KxEnvironment> getEnvironments() {
        return environments;
    }

    /**
     * <p>
     * A list of environments in an account.
     * </p>
     * 
     * @param environments
     *        A list of environments in an account.
     */

    public void setEnvironments(java.util.Collection<KxEnvironment> environments) {
        if (environments == null) {
            this.environments = null;
            return;
        }

        this.environments = new java.util.ArrayList<KxEnvironment>(environments);
    }

    /**
     * <p>
     * A list of environments in an account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironments(java.util.Collection)} or {@link #withEnvironments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environments
     *        A list of environments in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxEnvironmentsResult withEnvironments(KxEnvironment... environments) {
        if (this.environments == null) {
            setEnvironments(new java.util.ArrayList<KxEnvironment>(environments.length));
        }
        for (KxEnvironment ele : environments) {
            this.environments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of environments in an account.
     * </p>
     * 
     * @param environments
     *        A list of environments in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxEnvironmentsResult withEnvironments(java.util.Collection<KxEnvironment> environments) {
        setEnvironments(environments);
        return this;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @return A token that indicates where a results page should begin.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxEnvironmentsResult withNextToken(String nextToken) {
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
        if (getEnvironments() != null)
            sb.append("Environments: ").append(getEnvironments()).append(",");
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

        if (obj instanceof ListKxEnvironmentsResult == false)
            return false;
        ListKxEnvironmentsResult other = (ListKxEnvironmentsResult) obj;
        if (other.getEnvironments() == null ^ this.getEnvironments() == null)
            return false;
        if (other.getEnvironments() != null && other.getEnvironments().equals(this.getEnvironments()) == false)
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

        hashCode = prime * hashCode + ((getEnvironments() == null) ? 0 : getEnvironments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListKxEnvironmentsResult clone() {
        try {
            return (ListKxEnvironmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
