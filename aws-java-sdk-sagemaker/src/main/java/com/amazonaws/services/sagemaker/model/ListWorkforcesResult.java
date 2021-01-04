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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListWorkforces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkforcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list containing information about your workforce.
     * </p>
     */
    private java.util.List<Workforce> workforces;
    /**
     * <p>
     * A token to resume pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list containing information about your workforce.
     * </p>
     * 
     * @return A list containing information about your workforce.
     */

    public java.util.List<Workforce> getWorkforces() {
        return workforces;
    }

    /**
     * <p>
     * A list containing information about your workforce.
     * </p>
     * 
     * @param workforces
     *        A list containing information about your workforce.
     */

    public void setWorkforces(java.util.Collection<Workforce> workforces) {
        if (workforces == null) {
            this.workforces = null;
            return;
        }

        this.workforces = new java.util.ArrayList<Workforce>(workforces);
    }

    /**
     * <p>
     * A list containing information about your workforce.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkforces(java.util.Collection)} or {@link #withWorkforces(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workforces
     *        A list containing information about your workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkforcesResult withWorkforces(Workforce... workforces) {
        if (this.workforces == null) {
            setWorkforces(new java.util.ArrayList<Workforce>(workforces.length));
        }
        for (Workforce ele : workforces) {
            this.workforces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information about your workforce.
     * </p>
     * 
     * @param workforces
     *        A list containing information about your workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkforcesResult withWorkforces(java.util.Collection<Workforce> workforces) {
        setWorkforces(workforces);
        return this;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * 
     * @return A token to resume pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkforcesResult withNextToken(String nextToken) {
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
        if (getWorkforces() != null)
            sb.append("Workforces: ").append(getWorkforces()).append(",");
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

        if (obj instanceof ListWorkforcesResult == false)
            return false;
        ListWorkforcesResult other = (ListWorkforcesResult) obj;
        if (other.getWorkforces() == null ^ this.getWorkforces() == null)
            return false;
        if (other.getWorkforces() != null && other.getWorkforces().equals(this.getWorkforces()) == false)
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

        hashCode = prime * hashCode + ((getWorkforces() == null) ? 0 : getWorkforces().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkforcesResult clone() {
        try {
            return (ListWorkforcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
