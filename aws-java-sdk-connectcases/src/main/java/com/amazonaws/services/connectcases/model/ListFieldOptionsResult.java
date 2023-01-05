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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListFieldOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFieldOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of <code>FieldOption</code> objects.
     * </p>
     */
    private java.util.List<FieldOption> options;

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @return The token for the next set of results. This is null if there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFieldOptionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of <code>FieldOption</code> objects.
     * </p>
     * 
     * @return A list of <code>FieldOption</code> objects.
     */

    public java.util.List<FieldOption> getOptions() {
        return options;
    }

    /**
     * <p>
     * A list of <code>FieldOption</code> objects.
     * </p>
     * 
     * @param options
     *        A list of <code>FieldOption</code> objects.
     */

    public void setOptions(java.util.Collection<FieldOption> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<FieldOption>(options);
    }

    /**
     * <p>
     * A list of <code>FieldOption</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        A list of <code>FieldOption</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFieldOptionsResult withOptions(FieldOption... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<FieldOption>(options.length));
        }
        for (FieldOption ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>FieldOption</code> objects.
     * </p>
     * 
     * @param options
     *        A list of <code>FieldOption</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFieldOptionsResult withOptions(java.util.Collection<FieldOption> options) {
        setOptions(options);
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
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFieldOptionsResult == false)
            return false;
        ListFieldOptionsResult other = (ListFieldOptionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public ListFieldOptionsResult clone() {
        try {
            return (ListFieldOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
