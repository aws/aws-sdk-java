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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListGlobalTables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGlobalTablesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The first global table name that this operation will evaluate.
     * </p>
     */
    private String exclusiveStartGlobalTableName;
    /**
     * <p>
     * The maximum number of table names to return.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Lists the global tables in a specific region.
     * </p>
     */
    private String regionName;

    /**
     * <p>
     * The first global table name that this operation will evaluate.
     * </p>
     * 
     * @param exclusiveStartGlobalTableName
     *        The first global table name that this operation will evaluate.
     */

    public void setExclusiveStartGlobalTableName(String exclusiveStartGlobalTableName) {
        this.exclusiveStartGlobalTableName = exclusiveStartGlobalTableName;
    }

    /**
     * <p>
     * The first global table name that this operation will evaluate.
     * </p>
     * 
     * @return The first global table name that this operation will evaluate.
     */

    public String getExclusiveStartGlobalTableName() {
        return this.exclusiveStartGlobalTableName;
    }

    /**
     * <p>
     * The first global table name that this operation will evaluate.
     * </p>
     * 
     * @param exclusiveStartGlobalTableName
     *        The first global table name that this operation will evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGlobalTablesRequest withExclusiveStartGlobalTableName(String exclusiveStartGlobalTableName) {
        setExclusiveStartGlobalTableName(exclusiveStartGlobalTableName);
        return this;
    }

    /**
     * <p>
     * The maximum number of table names to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of table names to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of table names to return.
     * </p>
     * 
     * @return The maximum number of table names to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of table names to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of table names to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGlobalTablesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Lists the global tables in a specific region.
     * </p>
     * 
     * @param regionName
     *        Lists the global tables in a specific region.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * Lists the global tables in a specific region.
     * </p>
     * 
     * @return Lists the global tables in a specific region.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * Lists the global tables in a specific region.
     * </p>
     * 
     * @param regionName
     *        Lists the global tables in a specific region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGlobalTablesRequest withRegionName(String regionName) {
        setRegionName(regionName);
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
        if (getExclusiveStartGlobalTableName() != null)
            sb.append("ExclusiveStartGlobalTableName: ").append(getExclusiveStartGlobalTableName()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGlobalTablesRequest == false)
            return false;
        ListGlobalTablesRequest other = (ListGlobalTablesRequest) obj;
        if (other.getExclusiveStartGlobalTableName() == null ^ this.getExclusiveStartGlobalTableName() == null)
            return false;
        if (other.getExclusiveStartGlobalTableName() != null
                && other.getExclusiveStartGlobalTableName().equals(this.getExclusiveStartGlobalTableName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExclusiveStartGlobalTableName() == null) ? 0 : getExclusiveStartGlobalTableName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        return hashCode;
    }

    @Override
    public ListGlobalTablesRequest clone() {
        return (ListGlobalTablesRequest) super.clone();
    }

}
