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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connection between two service in an insight impact graph.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/InsightImpactGraphEdge" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightImpactGraphEdge implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the edge. Unique within a service map.
     * </p>
     */
    private Integer referenceId;

    /**
     * <p>
     * Identifier of the edge. Unique within a service map.
     * </p>
     * 
     * @param referenceId
     *        Identifier of the edge. Unique within a service map.
     */

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * Identifier of the edge. Unique within a service map.
     * </p>
     * 
     * @return Identifier of the edge. Unique within a service map.
     */

    public Integer getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * Identifier of the edge. Unique within a service map.
     * </p>
     * 
     * @param referenceId
     *        Identifier of the edge. Unique within a service map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightImpactGraphEdge withReferenceId(Integer referenceId) {
        setReferenceId(referenceId);
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
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightImpactGraphEdge == false)
            return false;
        InsightImpactGraphEdge other = (InsightImpactGraphEdge) obj;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        return hashCode;
    }

    @Override
    public InsightImpactGraphEdge clone() {
        try {
            return (InsightImpactGraphEdge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.InsightImpactGraphEdgeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
