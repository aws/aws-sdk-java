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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>ListStreams</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/ListStreams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If this parameter is provided, then only the streams associated with this table name are returned.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The maximum number of streams to return. The upper limit is 100.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the first item that this operation will evaluate. Use the value that was
     * returned for <code>LastEvaluatedStreamArn</code> in the previous operation.
     * </p>
     */
    private String exclusiveStartStreamArn;

    /**
     * <p>
     * If this parameter is provided, then only the streams associated with this table name are returned.
     * </p>
     * 
     * @param tableName
     *        If this parameter is provided, then only the streams associated with this table name are returned.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * If this parameter is provided, then only the streams associated with this table name are returned.
     * </p>
     * 
     * @return If this parameter is provided, then only the streams associated with this table name are returned.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * If this parameter is provided, then only the streams associated with this table name are returned.
     * </p>
     * 
     * @param tableName
     *        If this parameter is provided, then only the streams associated with this table name are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The maximum number of streams to return. The upper limit is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of streams to return. The upper limit is 100.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of streams to return. The upper limit is 100.
     * </p>
     * 
     * @return The maximum number of streams to return. The upper limit is 100.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of streams to return. The upper limit is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of streams to return. The upper limit is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the first item that this operation will evaluate. Use the value that was
     * returned for <code>LastEvaluatedStreamArn</code> in the previous operation.
     * </p>
     * 
     * @param exclusiveStartStreamArn
     *        The ARN (Amazon Resource Name) of the first item that this operation will evaluate. Use the value that was
     *        returned for <code>LastEvaluatedStreamArn</code> in the previous operation.
     */

    public void setExclusiveStartStreamArn(String exclusiveStartStreamArn) {
        this.exclusiveStartStreamArn = exclusiveStartStreamArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the first item that this operation will evaluate. Use the value that was
     * returned for <code>LastEvaluatedStreamArn</code> in the previous operation.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the first item that this operation will evaluate. Use the value that
     *         was returned for <code>LastEvaluatedStreamArn</code> in the previous operation.
     */

    public String getExclusiveStartStreamArn() {
        return this.exclusiveStartStreamArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the first item that this operation will evaluate. Use the value that was
     * returned for <code>LastEvaluatedStreamArn</code> in the previous operation.
     * </p>
     * 
     * @param exclusiveStartStreamArn
     *        The ARN (Amazon Resource Name) of the first item that this operation will evaluate. Use the value that was
     *        returned for <code>LastEvaluatedStreamArn</code> in the previous operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsRequest withExclusiveStartStreamArn(String exclusiveStartStreamArn) {
        setExclusiveStartStreamArn(exclusiveStartStreamArn);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getExclusiveStartStreamArn() != null)
            sb.append("ExclusiveStartStreamArn: ").append(getExclusiveStartStreamArn());
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
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getExclusiveStartStreamArn() == null ^ this.getExclusiveStartStreamArn() == null)
            return false;
        if (other.getExclusiveStartStreamArn() != null && other.getExclusiveStartStreamArn().equals(this.getExclusiveStartStreamArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getExclusiveStartStreamArn() == null) ? 0 : getExclusiveStartStreamArn().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamsRequest clone() {
        return (ListStreamsRequest) super.clone();
    }

}
