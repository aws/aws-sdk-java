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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for <code>ListStreams</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ListStreams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of streams to list.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The name of the stream to start the list with.
     * </p>
     */
    private String exclusiveStartStreamName;

    /**
     * <p>
     * The maximum number of streams to list.
     * </p>
     * 
     * @param limit
     *        The maximum number of streams to list.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of streams to list.
     * </p>
     * 
     * @return The maximum number of streams to list.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of streams to list.
     * </p>
     * 
     * @param limit
     *        The maximum number of streams to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The name of the stream to start the list with.
     * </p>
     * 
     * @param exclusiveStartStreamName
     *        The name of the stream to start the list with.
     */

    public void setExclusiveStartStreamName(String exclusiveStartStreamName) {
        this.exclusiveStartStreamName = exclusiveStartStreamName;
    }

    /**
     * <p>
     * The name of the stream to start the list with.
     * </p>
     * 
     * @return The name of the stream to start the list with.
     */

    public String getExclusiveStartStreamName() {
        return this.exclusiveStartStreamName;
    }

    /**
     * <p>
     * The name of the stream to start the list with.
     * </p>
     * 
     * @param exclusiveStartStreamName
     *        The name of the stream to start the list with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsRequest withExclusiveStartStreamName(String exclusiveStartStreamName) {
        setExclusiveStartStreamName(exclusiveStartStreamName);
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getExclusiveStartStreamName() != null)
            sb.append("ExclusiveStartStreamName: ").append(getExclusiveStartStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamsRequest == false)
            return false;
        ListStreamsRequest other = (ListStreamsRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getExclusiveStartStreamName() == null ^ this.getExclusiveStartStreamName() == null)
            return false;
        if (other.getExclusiveStartStreamName() != null && other.getExclusiveStartStreamName().equals(this.getExclusiveStartStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getExclusiveStartStreamName() == null) ? 0 : getExclusiveStartStreamName().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamsRequest clone() {
        return (ListStreamsRequest) super.clone();
    }

}
