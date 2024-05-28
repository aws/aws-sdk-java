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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/ListAdapters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAdaptersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of adapters that matches the filtering criteria specified when calling ListAdapters.
     * </p>
     */
    private java.util.List<AdapterOverview> adapters;
    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of adapters that matches the filtering criteria specified when calling ListAdapters.
     * </p>
     * 
     * @return A list of adapters that matches the filtering criteria specified when calling ListAdapters.
     */

    public java.util.List<AdapterOverview> getAdapters() {
        return adapters;
    }

    /**
     * <p>
     * A list of adapters that matches the filtering criteria specified when calling ListAdapters.
     * </p>
     * 
     * @param adapters
     *        A list of adapters that matches the filtering criteria specified when calling ListAdapters.
     */

    public void setAdapters(java.util.Collection<AdapterOverview> adapters) {
        if (adapters == null) {
            this.adapters = null;
            return;
        }

        this.adapters = new java.util.ArrayList<AdapterOverview>(adapters);
    }

    /**
     * <p>
     * A list of adapters that matches the filtering criteria specified when calling ListAdapters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdapters(java.util.Collection)} or {@link #withAdapters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param adapters
     *        A list of adapters that matches the filtering criteria specified when calling ListAdapters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAdaptersResult withAdapters(AdapterOverview... adapters) {
        if (this.adapters == null) {
            setAdapters(new java.util.ArrayList<AdapterOverview>(adapters.length));
        }
        for (AdapterOverview ele : adapters) {
            this.adapters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of adapters that matches the filtering criteria specified when calling ListAdapters.
     * </p>
     * 
     * @param adapters
     *        A list of adapters that matches the filtering criteria specified when calling ListAdapters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAdaptersResult withAdapters(java.util.Collection<AdapterOverview> adapters) {
        setAdapters(adapters);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return when listing adapters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * 
     * @return Identifies the next page of results to return when listing adapters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return when listing adapters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAdaptersResult withNextToken(String nextToken) {
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
        if (getAdapters() != null)
            sb.append("Adapters: ").append(getAdapters()).append(",");
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

        if (obj instanceof ListAdaptersResult == false)
            return false;
        ListAdaptersResult other = (ListAdaptersResult) obj;
        if (other.getAdapters() == null ^ this.getAdapters() == null)
            return false;
        if (other.getAdapters() != null && other.getAdapters().equals(this.getAdapters()) == false)
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

        hashCode = prime * hashCode + ((getAdapters() == null) ? 0 : getAdapters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAdaptersResult clone() {
        try {
            return (ListAdaptersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
