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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListHapgs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHapgsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of high-availability partition groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> hapgList;
    /**
     * <p>
     * If not null, more results are available. Pass this value to <code>ListHapgs</code> to retrieve the next set of
     * items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of high-availability partition groups.
     * </p>
     * 
     * @return The list of high-availability partition groups.
     */

    public java.util.List<String> getHapgList() {
        if (hapgList == null) {
            hapgList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hapgList;
    }

    /**
     * <p>
     * The list of high-availability partition groups.
     * </p>
     * 
     * @param hapgList
     *        The list of high-availability partition groups.
     */

    public void setHapgList(java.util.Collection<String> hapgList) {
        if (hapgList == null) {
            this.hapgList = null;
            return;
        }

        this.hapgList = new com.amazonaws.internal.SdkInternalList<String>(hapgList);
    }

    /**
     * <p>
     * The list of high-availability partition groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHapgList(java.util.Collection)} or {@link #withHapgList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param hapgList
     *        The list of high-availability partition groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHapgsResult withHapgList(String... hapgList) {
        if (this.hapgList == null) {
            setHapgList(new com.amazonaws.internal.SdkInternalList<String>(hapgList.length));
        }
        for (String ele : hapgList) {
            this.hapgList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of high-availability partition groups.
     * </p>
     * 
     * @param hapgList
     *        The list of high-availability partition groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHapgsResult withHapgList(java.util.Collection<String> hapgList) {
        setHapgList(hapgList);
        return this;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value to <code>ListHapgs</code> to retrieve the next set of
     * items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value to <code>ListHapgs</code> to retrieve the next
     *        set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value to <code>ListHapgs</code> to retrieve the next set of
     * items.
     * </p>
     * 
     * @return If not null, more results are available. Pass this value to <code>ListHapgs</code> to retrieve the next
     *         set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value to <code>ListHapgs</code> to retrieve the next set of
     * items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value to <code>ListHapgs</code> to retrieve the next
     *        set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHapgsResult withNextToken(String nextToken) {
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
        if (getHapgList() != null)
            sb.append("HapgList: ").append(getHapgList()).append(",");
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

        if (obj instanceof ListHapgsResult == false)
            return false;
        ListHapgsResult other = (ListHapgsResult) obj;
        if (other.getHapgList() == null ^ this.getHapgList() == null)
            return false;
        if (other.getHapgList() != null && other.getHapgList().equals(this.getHapgList()) == false)
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

        hashCode = prime * hashCode + ((getHapgList() == null) ? 0 : getHapgList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHapgsResult clone() {
        try {
            return (ListHapgsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
