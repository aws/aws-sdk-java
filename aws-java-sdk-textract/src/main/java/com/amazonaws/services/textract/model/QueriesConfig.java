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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/QueriesConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueriesConfig implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private java.util.List<Query> queries;

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<Query> getQueries() {
        return queries;
    }

    /**
     * <p/>
     * 
     * @param queries
     */

    public void setQueries(java.util.Collection<Query> queries) {
        if (queries == null) {
            this.queries = null;
            return;
        }

        this.queries = new java.util.ArrayList<Query>(queries);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueries(java.util.Collection)} or {@link #withQueries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param queries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueriesConfig withQueries(Query... queries) {
        if (this.queries == null) {
            setQueries(new java.util.ArrayList<Query>(queries.length));
        }
        for (Query ele : queries) {
            this.queries.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param queries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueriesConfig withQueries(java.util.Collection<Query> queries) {
        setQueries(queries);
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
        if (getQueries() != null)
            sb.append("Queries: ").append(getQueries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueriesConfig == false)
            return false;
        QueriesConfig other = (QueriesConfig) obj;
        if (other.getQueries() == null ^ this.getQueries() == null)
            return false;
        if (other.getQueries() != null && other.getQueries().equals(this.getQueries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueries() == null) ? 0 : getQueries().hashCode());
        return hashCode;
    }

    @Override
    public QueriesConfig clone() {
        try {
            return (QueriesConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.QueriesConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
