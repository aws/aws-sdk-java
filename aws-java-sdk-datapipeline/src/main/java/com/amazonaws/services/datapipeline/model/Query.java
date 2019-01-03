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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the query to run against an object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/Query" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Query implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of selectors that define the query. An object must satisfy all of the selectors to match the query.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Selector> selectors;

    /**
     * <p>
     * List of selectors that define the query. An object must satisfy all of the selectors to match the query.
     * </p>
     * 
     * @return List of selectors that define the query. An object must satisfy all of the selectors to match the query.
     */

    public java.util.List<Selector> getSelectors() {
        if (selectors == null) {
            selectors = new com.amazonaws.internal.SdkInternalList<Selector>();
        }
        return selectors;
    }

    /**
     * <p>
     * List of selectors that define the query. An object must satisfy all of the selectors to match the query.
     * </p>
     * 
     * @param selectors
     *        List of selectors that define the query. An object must satisfy all of the selectors to match the query.
     */

    public void setSelectors(java.util.Collection<Selector> selectors) {
        if (selectors == null) {
            this.selectors = null;
            return;
        }

        this.selectors = new com.amazonaws.internal.SdkInternalList<Selector>(selectors);
    }

    /**
     * <p>
     * List of selectors that define the query. An object must satisfy all of the selectors to match the query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectors(java.util.Collection)} or {@link #withSelectors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param selectors
     *        List of selectors that define the query. An object must satisfy all of the selectors to match the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Query withSelectors(Selector... selectors) {
        if (this.selectors == null) {
            setSelectors(new com.amazonaws.internal.SdkInternalList<Selector>(selectors.length));
        }
        for (Selector ele : selectors) {
            this.selectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of selectors that define the query. An object must satisfy all of the selectors to match the query.
     * </p>
     * 
     * @param selectors
     *        List of selectors that define the query. An object must satisfy all of the selectors to match the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Query withSelectors(java.util.Collection<Selector> selectors) {
        setSelectors(selectors);
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
        if (getSelectors() != null)
            sb.append("Selectors: ").append(getSelectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Query == false)
            return false;
        Query other = (Query) obj;
        if (other.getSelectors() == null ^ this.getSelectors() == null)
            return false;
        if (other.getSelectors() != null && other.getSelectors().equals(this.getSelectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectors() == null) ? 0 : getSelectors().hashCode());
        return hashCode;
    }

    @Override
    public Query clone() {
        try {
            return (Query) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datapipeline.model.transform.QueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
