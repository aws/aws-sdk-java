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
 * Represents the input of a <code>ListTables</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListTables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTablesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The first table name that this operation will evaluate. Use the value that was returned for
     * <code>LastEvaluatedTableName</code> in a previous operation, so that you can obtain the next page of results.
     * </p>
     */
    private String exclusiveStartTableName;
    /**
     * <p>
     * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
     * </p>
     */
    private Integer limit;

    /**
     * Default constructor for ListTablesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ListTablesRequest() {
    }

    /**
     * Constructs a new ListTablesRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param exclusiveStartTableName
     *        The first table name that this operation will evaluate. Use the value that was returned for
     *        <code>LastEvaluatedTableName</code> in a previous operation, so that you can obtain the next page of
     *        results.
     */
    public ListTablesRequest(String exclusiveStartTableName) {
        setExclusiveStartTableName(exclusiveStartTableName);
    }

    /**
     * Constructs a new ListTablesRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param exclusiveStartTableName
     *        The first table name that this operation will evaluate. Use the value that was returned for
     *        <code>LastEvaluatedTableName</code> in a previous operation, so that you can obtain the next page of
     *        results.
     * @param limit
     *        A maximum number of table names to return. If this parameter is not specified, the limit is 100.
     */
    public ListTablesRequest(String exclusiveStartTableName, Integer limit) {
        setExclusiveStartTableName(exclusiveStartTableName);
        setLimit(limit);
    }

    /**
     * <p>
     * The first table name that this operation will evaluate. Use the value that was returned for
     * <code>LastEvaluatedTableName</code> in a previous operation, so that you can obtain the next page of results.
     * </p>
     * 
     * @param exclusiveStartTableName
     *        The first table name that this operation will evaluate. Use the value that was returned for
     *        <code>LastEvaluatedTableName</code> in a previous operation, so that you can obtain the next page of
     *        results.
     */

    public void setExclusiveStartTableName(String exclusiveStartTableName) {
        this.exclusiveStartTableName = exclusiveStartTableName;
    }

    /**
     * <p>
     * The first table name that this operation will evaluate. Use the value that was returned for
     * <code>LastEvaluatedTableName</code> in a previous operation, so that you can obtain the next page of results.
     * </p>
     * 
     * @return The first table name that this operation will evaluate. Use the value that was returned for
     *         <code>LastEvaluatedTableName</code> in a previous operation, so that you can obtain the next page of
     *         results.
     */

    public String getExclusiveStartTableName() {
        return this.exclusiveStartTableName;
    }

    /**
     * <p>
     * The first table name that this operation will evaluate. Use the value that was returned for
     * <code>LastEvaluatedTableName</code> in a previous operation, so that you can obtain the next page of results.
     * </p>
     * 
     * @param exclusiveStartTableName
     *        The first table name that this operation will evaluate. Use the value that was returned for
     *        <code>LastEvaluatedTableName</code> in a previous operation, so that you can obtain the next page of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTablesRequest withExclusiveStartTableName(String exclusiveStartTableName) {
        setExclusiveStartTableName(exclusiveStartTableName);
        return this;
    }

    /**
     * <p>
     * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
     * </p>
     * 
     * @param limit
     *        A maximum number of table names to return. If this parameter is not specified, the limit is 100.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
     * </p>
     * 
     * @return A maximum number of table names to return. If this parameter is not specified, the limit is 100.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
     * </p>
     * 
     * @param limit
     *        A maximum number of table names to return. If this parameter is not specified, the limit is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTablesRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getExclusiveStartTableName() != null)
            sb.append("ExclusiveStartTableName: ").append(getExclusiveStartTableName()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTablesRequest == false)
            return false;
        ListTablesRequest other = (ListTablesRequest) obj;
        if (other.getExclusiveStartTableName() == null ^ this.getExclusiveStartTableName() == null)
            return false;
        if (other.getExclusiveStartTableName() != null && other.getExclusiveStartTableName().equals(this.getExclusiveStartTableName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExclusiveStartTableName() == null) ? 0 : getExclusiveStartTableName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public ListTablesRequest clone() {
        return (ListTablesRequest) super.clone();
    }

}
