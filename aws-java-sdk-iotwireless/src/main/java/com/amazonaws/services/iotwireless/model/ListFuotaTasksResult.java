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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListFuotaTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFuotaTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     */
    private String nextToken;

    private java.util.List<FuotaTask> fuotaTaskList;

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @param nextToken
     *        To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *        <b>null</b> to receive the first set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @return To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *         <b>null</b> to receive the first set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @param nextToken
     *        To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *        <b>null</b> to receive the first set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFuotaTasksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<FuotaTask> getFuotaTaskList() {
        return fuotaTaskList;
    }

    /**
     * @param fuotaTaskList
     */

    public void setFuotaTaskList(java.util.Collection<FuotaTask> fuotaTaskList) {
        if (fuotaTaskList == null) {
            this.fuotaTaskList = null;
            return;
        }

        this.fuotaTaskList = new java.util.ArrayList<FuotaTask>(fuotaTaskList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFuotaTaskList(java.util.Collection)} or {@link #withFuotaTaskList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fuotaTaskList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFuotaTasksResult withFuotaTaskList(FuotaTask... fuotaTaskList) {
        if (this.fuotaTaskList == null) {
            setFuotaTaskList(new java.util.ArrayList<FuotaTask>(fuotaTaskList.length));
        }
        for (FuotaTask ele : fuotaTaskList) {
            this.fuotaTaskList.add(ele);
        }
        return this;
    }

    /**
     * @param fuotaTaskList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFuotaTasksResult withFuotaTaskList(java.util.Collection<FuotaTask> fuotaTaskList) {
        setFuotaTaskList(fuotaTaskList);
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
        if (getFuotaTaskList() != null)
            sb.append("FuotaTaskList: ").append(getFuotaTaskList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFuotaTasksResult == false)
            return false;
        ListFuotaTasksResult other = (ListFuotaTasksResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFuotaTaskList() == null ^ this.getFuotaTaskList() == null)
            return false;
        if (other.getFuotaTaskList() != null && other.getFuotaTaskList().equals(this.getFuotaTaskList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFuotaTaskList() == null) ? 0 : getFuotaTaskList().hashCode());
        return hashCode;
    }

    @Override
    public ListFuotaTasksResult clone() {
        try {
            return (ListFuotaTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
