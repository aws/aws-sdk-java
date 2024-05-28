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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about how to query content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/QueryCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The condition for the query.
     * </p>
     */
    private QueryConditionItem single;

    /**
     * <p>
     * The condition for the query.
     * </p>
     * 
     * @param single
     *        The condition for the query.
     */

    public void setSingle(QueryConditionItem single) {
        this.single = single;
    }

    /**
     * <p>
     * The condition for the query.
     * </p>
     * 
     * @return The condition for the query.
     */

    public QueryConditionItem getSingle() {
        return this.single;
    }

    /**
     * <p>
     * The condition for the query.
     * </p>
     * 
     * @param single
     *        The condition for the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryCondition withSingle(QueryConditionItem single) {
        setSingle(single);
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
        if (getSingle() != null)
            sb.append("Single: ").append(getSingle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryCondition == false)
            return false;
        QueryCondition other = (QueryCondition) obj;
        if (other.getSingle() == null ^ this.getSingle() == null)
            return false;
        if (other.getSingle() != null && other.getSingle().equals(this.getSingle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSingle() == null) ? 0 : getSingle().hashCode());
        return hashCode;
    }

    @Override
    public QueryCondition clone() {
        try {
            return (QueryCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.QueryConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
