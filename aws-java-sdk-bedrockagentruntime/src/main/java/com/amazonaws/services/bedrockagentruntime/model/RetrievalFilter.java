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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the filters to use on the metadata attributes in the knowledge base data sources before returning results.
 * For more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query
 * configurations</a>. See the examples below to see how to use these filters.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Retrieve.html#API_agent-runtime_Retrieve_RequestSyntax"
 * >Retrieve request</a> – in the <code>filter</code> field
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html#API_agent-runtime_RetrieveAndGenerate_RequestSyntax"
 * >RetrieveAndGenerate request</a> – in the <code>filter</code> field
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/RetrievalFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrievalFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Knowledge base data sources are returned if their metadata attributes fulfill all the filter conditions inside
     * this list.
     * </p>
     */
    private java.util.List<RetrievalFilter> andAll;
    /**
     * <p>
     * Knowledge base data sources are returned if their metadata attributes fulfill at least one of the filter
     * conditions inside this list.
     * </p>
     */
    private java.util.List<RetrievalFilter> orAll;

    /**
     * <p>
     * Knowledge base data sources are returned if their metadata attributes fulfill all the filter conditions inside
     * this list.
     * </p>
     * 
     * @return Knowledge base data sources are returned if their metadata attributes fulfill all the filter conditions
     *         inside this list.
     */

    public java.util.List<RetrievalFilter> getAndAll() {
        return andAll;
    }

    /**
     * <p>
     * Knowledge base data sources are returned if their metadata attributes fulfill all the filter conditions inside
     * this list.
     * </p>
     * 
     * @param andAll
     *        Knowledge base data sources are returned if their metadata attributes fulfill all the filter conditions
     *        inside this list.
     */

    public void setAndAll(java.util.Collection<RetrievalFilter> andAll) {
        if (andAll == null) {
            this.andAll = null;
            return;
        }

        this.andAll = new java.util.ArrayList<RetrievalFilter>(andAll);
    }

    /**
     * <p>
     * Knowledge base data sources are returned if their metadata attributes fulfill all the filter conditions inside
     * this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAndAll(java.util.Collection)} or {@link #withAndAll(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param andAll
     *        Knowledge base data sources are returned if their metadata attributes fulfill all the filter conditions
     *        inside this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalFilter withAndAll(RetrievalFilter... andAll) {
        if (this.andAll == null) {
            setAndAll(new java.util.ArrayList<RetrievalFilter>(andAll.length));
        }
        for (RetrievalFilter ele : andAll) {
            this.andAll.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Knowledge base data sources are returned if their metadata attributes fulfill all the filter conditions inside
     * this list.
     * </p>
     * 
     * @param andAll
     *        Knowledge base data sources are returned if their metadata attributes fulfill all the filter conditions
     *        inside this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalFilter withAndAll(java.util.Collection<RetrievalFilter> andAll) {
        setAndAll(andAll);
        return this;
    }

    /**
     * <p>
     * Knowledge base data sources are returned if their metadata attributes fulfill at least one of the filter
     * conditions inside this list.
     * </p>
     * 
     * @return Knowledge base data sources are returned if their metadata attributes fulfill at least one of the filter
     *         conditions inside this list.
     */

    public java.util.List<RetrievalFilter> getOrAll() {
        return orAll;
    }

    /**
     * <p>
     * Knowledge base data sources are returned if their metadata attributes fulfill at least one of the filter
     * conditions inside this list.
     * </p>
     * 
     * @param orAll
     *        Knowledge base data sources are returned if their metadata attributes fulfill at least one of the filter
     *        conditions inside this list.
     */

    public void setOrAll(java.util.Collection<RetrievalFilter> orAll) {
        if (orAll == null) {
            this.orAll = null;
            return;
        }

        this.orAll = new java.util.ArrayList<RetrievalFilter>(orAll);
    }

    /**
     * <p>
     * Knowledge base data sources are returned if their metadata attributes fulfill at least one of the filter
     * conditions inside this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrAll(java.util.Collection)} or {@link #withOrAll(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param orAll
     *        Knowledge base data sources are returned if their metadata attributes fulfill at least one of the filter
     *        conditions inside this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalFilter withOrAll(RetrievalFilter... orAll) {
        if (this.orAll == null) {
            setOrAll(new java.util.ArrayList<RetrievalFilter>(orAll.length));
        }
        for (RetrievalFilter ele : orAll) {
            this.orAll.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Knowledge base data sources are returned if their metadata attributes fulfill at least one of the filter
     * conditions inside this list.
     * </p>
     * 
     * @param orAll
     *        Knowledge base data sources are returned if their metadata attributes fulfill at least one of the filter
     *        conditions inside this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalFilter withOrAll(java.util.Collection<RetrievalFilter> orAll) {
        setOrAll(orAll);
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
        if (getAndAll() != null)
            sb.append("AndAll: ").append("***Sensitive Data Redacted***").append(",");
        if (getOrAll() != null)
            sb.append("OrAll: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrievalFilter == false)
            return false;
        RetrievalFilter other = (RetrievalFilter) obj;
        if (other.getAndAll() == null ^ this.getAndAll() == null)
            return false;
        if (other.getAndAll() != null && other.getAndAll().equals(this.getAndAll()) == false)
            return false;
        if (other.getOrAll() == null ^ this.getOrAll() == null)
            return false;
        if (other.getOrAll() != null && other.getOrAll().equals(this.getOrAll()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAndAll() == null) ? 0 : getAndAll().hashCode());
        hashCode = prime * hashCode + ((getOrAll() == null) ? 0 : getOrAll().hashCode());
        return hashCode;
    }

    @Override
    public RetrievalFilter clone() {
        try {
            return (RetrievalFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.RetrievalFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
