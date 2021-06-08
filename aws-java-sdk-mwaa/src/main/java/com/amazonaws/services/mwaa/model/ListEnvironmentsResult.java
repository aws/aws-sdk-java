/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mwaa.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/ListEnvironments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the list of Amazon MWAA environments.
     * </p>
     */
    private java.util.List<String> environments;
    /**
     * <p>
     * Retrieves the next page of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns the list of Amazon MWAA environments.
     * </p>
     * 
     * @return Returns the list of Amazon MWAA environments.
     */

    public java.util.List<String> getEnvironments() {
        return environments;
    }

    /**
     * <p>
     * Returns the list of Amazon MWAA environments.
     * </p>
     * 
     * @param environments
     *        Returns the list of Amazon MWAA environments.
     */

    public void setEnvironments(java.util.Collection<String> environments) {
        if (environments == null) {
            this.environments = null;
            return;
        }

        this.environments = new java.util.ArrayList<String>(environments);
    }

    /**
     * <p>
     * Returns the list of Amazon MWAA environments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironments(java.util.Collection)} or {@link #withEnvironments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environments
     *        Returns the list of Amazon MWAA environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsResult withEnvironments(String... environments) {
        if (this.environments == null) {
            setEnvironments(new java.util.ArrayList<String>(environments.length));
        }
        for (String ele : environments) {
            this.environments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the list of Amazon MWAA environments.
     * </p>
     * 
     * @param environments
     *        Returns the list of Amazon MWAA environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsResult withEnvironments(java.util.Collection<String> environments) {
        setEnvironments(environments);
        return this;
    }

    /**
     * <p>
     * Retrieves the next page of the results.
     * </p>
     * 
     * @param nextToken
     *        Retrieves the next page of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Retrieves the next page of the results.
     * </p>
     * 
     * @return Retrieves the next page of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Retrieves the next page of the results.
     * </p>
     * 
     * @param nextToken
     *        Retrieves the next page of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListEnvironmentsResult == false)
            return false;
        ListEnvironmentsResult other = (ListEnvironmentsResult) obj;
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
    public ListEnvironmentsResult clone() {
        try {
            return (ListEnvironmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
