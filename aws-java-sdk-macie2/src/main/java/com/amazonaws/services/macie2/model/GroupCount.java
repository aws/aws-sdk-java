/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a group of results for a query that retrieved aggregated statistical data about findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GroupCount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupCount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of findings in the group of query results.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * The name of the property that defines the group in the query results, as specified by the groupBy property in the
     * query request.
     * </p>
     */
    private String groupKey;

    /**
     * <p>
     * The total number of findings in the group of query results.
     * </p>
     * 
     * @param count
     *        The total number of findings in the group of query results.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The total number of findings in the group of query results.
     * </p>
     * 
     * @return The total number of findings in the group of query results.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The total number of findings in the group of query results.
     * </p>
     * 
     * @param count
     *        The total number of findings in the group of query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupCount withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The name of the property that defines the group in the query results, as specified by the groupBy property in the
     * query request.
     * </p>
     * 
     * @param groupKey
     *        The name of the property that defines the group in the query results, as specified by the groupBy property
     *        in the query request.
     */

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    /**
     * <p>
     * The name of the property that defines the group in the query results, as specified by the groupBy property in the
     * query request.
     * </p>
     * 
     * @return The name of the property that defines the group in the query results, as specified by the groupBy
     *         property in the query request.
     */

    public String getGroupKey() {
        return this.groupKey;
    }

    /**
     * <p>
     * The name of the property that defines the group in the query results, as specified by the groupBy property in the
     * query request.
     * </p>
     * 
     * @param groupKey
     *        The name of the property that defines the group in the query results, as specified by the groupBy property
     *        in the query request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupCount withGroupKey(String groupKey) {
        setGroupKey(groupKey);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getGroupKey() != null)
            sb.append("GroupKey: ").append(getGroupKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupCount == false)
            return false;
        GroupCount other = (GroupCount) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getGroupKey() == null ^ this.getGroupKey() == null)
            return false;
        if (other.getGroupKey() != null && other.getGroupKey().equals(this.getGroupKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getGroupKey() == null) ? 0 : getGroupKey().hashCode());
        return hashCode;
    }

    @Override
    public GroupCount clone() {
        try {
            return (GroupCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.GroupCountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
