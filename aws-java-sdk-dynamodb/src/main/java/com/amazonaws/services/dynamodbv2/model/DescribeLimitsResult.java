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

/**
 * <p>
 * Represents the output of a <code>DescribeLimits</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum total read capacity units that your account allows you to provision across all of your tables in this
     * region.
     * </p>
     */
    private Long accountMaxReadCapacityUnits;
    /**
     * <p>
     * The maximum total write capacity units that your account allows you to provision across all of your tables in
     * this region.
     * </p>
     */
    private Long accountMaxWriteCapacityUnits;
    /**
     * <p>
     * The maximum read capacity units that your account allows you to provision for a new table that you are creating
     * in this region, including the read capacity units provisioned for its global secondary indexes (GSIs).
     * </p>
     */
    private Long tableMaxReadCapacityUnits;
    /**
     * <p>
     * The maximum write capacity units that your account allows you to provision for a new table that you are creating
     * in this region, including the write capacity units provisioned for its global secondary indexes (GSIs).
     * </p>
     */
    private Long tableMaxWriteCapacityUnits;

    /**
     * <p>
     * The maximum total read capacity units that your account allows you to provision across all of your tables in this
     * region.
     * </p>
     * 
     * @param accountMaxReadCapacityUnits
     *        The maximum total read capacity units that your account allows you to provision across all of your tables
     *        in this region.
     */

    public void setAccountMaxReadCapacityUnits(Long accountMaxReadCapacityUnits) {
        this.accountMaxReadCapacityUnits = accountMaxReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum total read capacity units that your account allows you to provision across all of your tables in this
     * region.
     * </p>
     * 
     * @return The maximum total read capacity units that your account allows you to provision across all of your tables
     *         in this region.
     */

    public Long getAccountMaxReadCapacityUnits() {
        return this.accountMaxReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum total read capacity units that your account allows you to provision across all of your tables in this
     * region.
     * </p>
     * 
     * @param accountMaxReadCapacityUnits
     *        The maximum total read capacity units that your account allows you to provision across all of your tables
     *        in this region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLimitsResult withAccountMaxReadCapacityUnits(Long accountMaxReadCapacityUnits) {
        setAccountMaxReadCapacityUnits(accountMaxReadCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The maximum total write capacity units that your account allows you to provision across all of your tables in
     * this region.
     * </p>
     * 
     * @param accountMaxWriteCapacityUnits
     *        The maximum total write capacity units that your account allows you to provision across all of your tables
     *        in this region.
     */

    public void setAccountMaxWriteCapacityUnits(Long accountMaxWriteCapacityUnits) {
        this.accountMaxWriteCapacityUnits = accountMaxWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum total write capacity units that your account allows you to provision across all of your tables in
     * this region.
     * </p>
     * 
     * @return The maximum total write capacity units that your account allows you to provision across all of your
     *         tables in this region.
     */

    public Long getAccountMaxWriteCapacityUnits() {
        return this.accountMaxWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum total write capacity units that your account allows you to provision across all of your tables in
     * this region.
     * </p>
     * 
     * @param accountMaxWriteCapacityUnits
     *        The maximum total write capacity units that your account allows you to provision across all of your tables
     *        in this region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLimitsResult withAccountMaxWriteCapacityUnits(Long accountMaxWriteCapacityUnits) {
        setAccountMaxWriteCapacityUnits(accountMaxWriteCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The maximum read capacity units that your account allows you to provision for a new table that you are creating
     * in this region, including the read capacity units provisioned for its global secondary indexes (GSIs).
     * </p>
     * 
     * @param tableMaxReadCapacityUnits
     *        The maximum read capacity units that your account allows you to provision for a new table that you are
     *        creating in this region, including the read capacity units provisioned for its global secondary indexes
     *        (GSIs).
     */

    public void setTableMaxReadCapacityUnits(Long tableMaxReadCapacityUnits) {
        this.tableMaxReadCapacityUnits = tableMaxReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum read capacity units that your account allows you to provision for a new table that you are creating
     * in this region, including the read capacity units provisioned for its global secondary indexes (GSIs).
     * </p>
     * 
     * @return The maximum read capacity units that your account allows you to provision for a new table that you are
     *         creating in this region, including the read capacity units provisioned for its global secondary indexes
     *         (GSIs).
     */

    public Long getTableMaxReadCapacityUnits() {
        return this.tableMaxReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum read capacity units that your account allows you to provision for a new table that you are creating
     * in this region, including the read capacity units provisioned for its global secondary indexes (GSIs).
     * </p>
     * 
     * @param tableMaxReadCapacityUnits
     *        The maximum read capacity units that your account allows you to provision for a new table that you are
     *        creating in this region, including the read capacity units provisioned for its global secondary indexes
     *        (GSIs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLimitsResult withTableMaxReadCapacityUnits(Long tableMaxReadCapacityUnits) {
        setTableMaxReadCapacityUnits(tableMaxReadCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The maximum write capacity units that your account allows you to provision for a new table that you are creating
     * in this region, including the write capacity units provisioned for its global secondary indexes (GSIs).
     * </p>
     * 
     * @param tableMaxWriteCapacityUnits
     *        The maximum write capacity units that your account allows you to provision for a new table that you are
     *        creating in this region, including the write capacity units provisioned for its global secondary indexes
     *        (GSIs).
     */

    public void setTableMaxWriteCapacityUnits(Long tableMaxWriteCapacityUnits) {
        this.tableMaxWriteCapacityUnits = tableMaxWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum write capacity units that your account allows you to provision for a new table that you are creating
     * in this region, including the write capacity units provisioned for its global secondary indexes (GSIs).
     * </p>
     * 
     * @return The maximum write capacity units that your account allows you to provision for a new table that you are
     *         creating in this region, including the write capacity units provisioned for its global secondary indexes
     *         (GSIs).
     */

    public Long getTableMaxWriteCapacityUnits() {
        return this.tableMaxWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum write capacity units that your account allows you to provision for a new table that you are creating
     * in this region, including the write capacity units provisioned for its global secondary indexes (GSIs).
     * </p>
     * 
     * @param tableMaxWriteCapacityUnits
     *        The maximum write capacity units that your account allows you to provision for a new table that you are
     *        creating in this region, including the write capacity units provisioned for its global secondary indexes
     *        (GSIs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLimitsResult withTableMaxWriteCapacityUnits(Long tableMaxWriteCapacityUnits) {
        setTableMaxWriteCapacityUnits(tableMaxWriteCapacityUnits);
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
        if (getAccountMaxReadCapacityUnits() != null)
            sb.append("AccountMaxReadCapacityUnits: ").append(getAccountMaxReadCapacityUnits()).append(",");
        if (getAccountMaxWriteCapacityUnits() != null)
            sb.append("AccountMaxWriteCapacityUnits: ").append(getAccountMaxWriteCapacityUnits()).append(",");
        if (getTableMaxReadCapacityUnits() != null)
            sb.append("TableMaxReadCapacityUnits: ").append(getTableMaxReadCapacityUnits()).append(",");
        if (getTableMaxWriteCapacityUnits() != null)
            sb.append("TableMaxWriteCapacityUnits: ").append(getTableMaxWriteCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLimitsResult == false)
            return false;
        DescribeLimitsResult other = (DescribeLimitsResult) obj;
        if (other.getAccountMaxReadCapacityUnits() == null ^ this.getAccountMaxReadCapacityUnits() == null)
            return false;
        if (other.getAccountMaxReadCapacityUnits() != null && other.getAccountMaxReadCapacityUnits().equals(this.getAccountMaxReadCapacityUnits()) == false)
            return false;
        if (other.getAccountMaxWriteCapacityUnits() == null ^ this.getAccountMaxWriteCapacityUnits() == null)
            return false;
        if (other.getAccountMaxWriteCapacityUnits() != null && other.getAccountMaxWriteCapacityUnits().equals(this.getAccountMaxWriteCapacityUnits()) == false)
            return false;
        if (other.getTableMaxReadCapacityUnits() == null ^ this.getTableMaxReadCapacityUnits() == null)
            return false;
        if (other.getTableMaxReadCapacityUnits() != null && other.getTableMaxReadCapacityUnits().equals(this.getTableMaxReadCapacityUnits()) == false)
            return false;
        if (other.getTableMaxWriteCapacityUnits() == null ^ this.getTableMaxWriteCapacityUnits() == null)
            return false;
        if (other.getTableMaxWriteCapacityUnits() != null && other.getTableMaxWriteCapacityUnits().equals(this.getTableMaxWriteCapacityUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountMaxReadCapacityUnits() == null) ? 0 : getAccountMaxReadCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getAccountMaxWriteCapacityUnits() == null) ? 0 : getAccountMaxWriteCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getTableMaxReadCapacityUnits() == null) ? 0 : getTableMaxReadCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getTableMaxWriteCapacityUnits() == null) ? 0 : getTableMaxWriteCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLimitsResult clone() {
        try {
            return (DescribeLimitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
