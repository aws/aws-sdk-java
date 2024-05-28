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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An edge structure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/EdgeStructure" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeStructure implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of edges that have this specific structure.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * A list of edge properties present in this specific structure.
     * </p>
     */
    private java.util.List<String> edgeProperties;

    /**
     * <p>
     * The number of edges that have this specific structure.
     * </p>
     * 
     * @param count
     *        The number of edges that have this specific structure.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of edges that have this specific structure.
     * </p>
     * 
     * @return The number of edges that have this specific structure.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of edges that have this specific structure.
     * </p>
     * 
     * @param count
     *        The number of edges that have this specific structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeStructure withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * A list of edge properties present in this specific structure.
     * </p>
     * 
     * @return A list of edge properties present in this specific structure.
     */

    public java.util.List<String> getEdgeProperties() {
        return edgeProperties;
    }

    /**
     * <p>
     * A list of edge properties present in this specific structure.
     * </p>
     * 
     * @param edgeProperties
     *        A list of edge properties present in this specific structure.
     */

    public void setEdgeProperties(java.util.Collection<String> edgeProperties) {
        if (edgeProperties == null) {
            this.edgeProperties = null;
            return;
        }

        this.edgeProperties = new java.util.ArrayList<String>(edgeProperties);
    }

    /**
     * <p>
     * A list of edge properties present in this specific structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdgeProperties(java.util.Collection)} or {@link #withEdgeProperties(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param edgeProperties
     *        A list of edge properties present in this specific structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeStructure withEdgeProperties(String... edgeProperties) {
        if (this.edgeProperties == null) {
            setEdgeProperties(new java.util.ArrayList<String>(edgeProperties.length));
        }
        for (String ele : edgeProperties) {
            this.edgeProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of edge properties present in this specific structure.
     * </p>
     * 
     * @param edgeProperties
     *        A list of edge properties present in this specific structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeStructure withEdgeProperties(java.util.Collection<String> edgeProperties) {
        setEdgeProperties(edgeProperties);
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
        if (getEdgeProperties() != null)
            sb.append("EdgeProperties: ").append(getEdgeProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgeStructure == false)
            return false;
        EdgeStructure other = (EdgeStructure) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getEdgeProperties() == null ^ this.getEdgeProperties() == null)
            return false;
        if (other.getEdgeProperties() != null && other.getEdgeProperties().equals(this.getEdgeProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getEdgeProperties() == null) ? 0 : getEdgeProperties().hashCode());
        return hashCode;
    }

    @Override
    public EdgeStructure clone() {
        try {
            return (EdgeStructure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.EdgeStructureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
