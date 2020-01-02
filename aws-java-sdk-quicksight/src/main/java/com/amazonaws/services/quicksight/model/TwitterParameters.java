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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Twitter parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TwitterParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TwitterParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Twitter query string.
     * </p>
     */
    private String query;
    /**
     * <p>
     * Maximum number of rows to query Twitter.
     * </p>
     */
    private Integer maxRows;

    /**
     * <p>
     * Twitter query string.
     * </p>
     * 
     * @param query
     *        Twitter query string.
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * Twitter query string.
     * </p>
     * 
     * @return Twitter query string.
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * <p>
     * Twitter query string.
     * </p>
     * 
     * @param query
     *        Twitter query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TwitterParameters withQuery(String query) {
        setQuery(query);
        return this;
    }

    /**
     * <p>
     * Maximum number of rows to query Twitter.
     * </p>
     * 
     * @param maxRows
     *        Maximum number of rows to query Twitter.
     */

    public void setMaxRows(Integer maxRows) {
        this.maxRows = maxRows;
    }

    /**
     * <p>
     * Maximum number of rows to query Twitter.
     * </p>
     * 
     * @return Maximum number of rows to query Twitter.
     */

    public Integer getMaxRows() {
        return this.maxRows;
    }

    /**
     * <p>
     * Maximum number of rows to query Twitter.
     * </p>
     * 
     * @param maxRows
     *        Maximum number of rows to query Twitter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TwitterParameters withMaxRows(Integer maxRows) {
        setMaxRows(maxRows);
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
        if (getQuery() != null)
            sb.append("Query: ").append(getQuery()).append(",");
        if (getMaxRows() != null)
            sb.append("MaxRows: ").append(getMaxRows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TwitterParameters == false)
            return false;
        TwitterParameters other = (TwitterParameters) obj;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getMaxRows() == null ^ this.getMaxRows() == null)
            return false;
        if (other.getMaxRows() != null && other.getMaxRows().equals(this.getMaxRows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        hashCode = prime * hashCode + ((getMaxRows() == null) ? 0 : getMaxRows().hashCode());
        return hashCode;
    }

    @Override
    public TwitterParameters clone() {
        try {
            return (TwitterParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TwitterParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
