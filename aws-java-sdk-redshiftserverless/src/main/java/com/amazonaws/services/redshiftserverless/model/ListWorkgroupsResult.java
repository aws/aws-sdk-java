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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListWorkgroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkgroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. To retrieve the next page, make the call again using the returned token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The returned array of workgroups.
     * </p>
     */
    private java.util.List<Workgroup> workgroups;

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. To retrieve the next page, make the call again using the returned token.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, make the
     *        call again using the returned token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. To retrieve the next page, make the call again using the returned token.
     * </p>
     * 
     * @return If <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, make the
     *         call again using the returned token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. To retrieve the next page, make the call again using the returned token.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, make the
     *        call again using the returned token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkgroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The returned array of workgroups.
     * </p>
     * 
     * @return The returned array of workgroups.
     */

    public java.util.List<Workgroup> getWorkgroups() {
        return workgroups;
    }

    /**
     * <p>
     * The returned array of workgroups.
     * </p>
     * 
     * @param workgroups
     *        The returned array of workgroups.
     */

    public void setWorkgroups(java.util.Collection<Workgroup> workgroups) {
        if (workgroups == null) {
            this.workgroups = null;
            return;
        }

        this.workgroups = new java.util.ArrayList<Workgroup>(workgroups);
    }

    /**
     * <p>
     * The returned array of workgroups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkgroups(java.util.Collection)} or {@link #withWorkgroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workgroups
     *        The returned array of workgroups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkgroupsResult withWorkgroups(Workgroup... workgroups) {
        if (this.workgroups == null) {
            setWorkgroups(new java.util.ArrayList<Workgroup>(workgroups.length));
        }
        for (Workgroup ele : workgroups) {
            this.workgroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned array of workgroups.
     * </p>
     * 
     * @param workgroups
     *        The returned array of workgroups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkgroupsResult withWorkgroups(java.util.Collection<Workgroup> workgroups) {
        setWorkgroups(workgroups);
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
        if (getWorkgroups() != null)
            sb.append("Workgroups: ").append(getWorkgroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkgroupsResult == false)
            return false;
        ListWorkgroupsResult other = (ListWorkgroupsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWorkgroups() == null ^ this.getWorkgroups() == null)
            return false;
        if (other.getWorkgroups() != null && other.getWorkgroups().equals(this.getWorkgroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkgroups() == null) ? 0 : getWorkgroups().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkgroupsResult clone() {
        try {
            return (ListWorkgroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
