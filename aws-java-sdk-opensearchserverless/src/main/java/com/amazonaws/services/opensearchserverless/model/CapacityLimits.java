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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The maximum capacity limits for all OpenSearch Serverless collections, in OpenSearch Compute Units (OCUs). These
 * limits are used to scale your collections based on the current workload. For more information, see <a href=
 * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-scaling"
 * >Autoscaling</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CapacityLimits"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum indexing capacity for collections.
     * </p>
     */
    private Integer maxIndexingCapacityInOCU;
    /**
     * <p>
     * The maximum search capacity for collections.
     * </p>
     */
    private Integer maxSearchCapacityInOCU;

    /**
     * <p>
     * The maximum indexing capacity for collections.
     * </p>
     * 
     * @param maxIndexingCapacityInOCU
     *        The maximum indexing capacity for collections.
     */

    public void setMaxIndexingCapacityInOCU(Integer maxIndexingCapacityInOCU) {
        this.maxIndexingCapacityInOCU = maxIndexingCapacityInOCU;
    }

    /**
     * <p>
     * The maximum indexing capacity for collections.
     * </p>
     * 
     * @return The maximum indexing capacity for collections.
     */

    public Integer getMaxIndexingCapacityInOCU() {
        return this.maxIndexingCapacityInOCU;
    }

    /**
     * <p>
     * The maximum indexing capacity for collections.
     * </p>
     * 
     * @param maxIndexingCapacityInOCU
     *        The maximum indexing capacity for collections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityLimits withMaxIndexingCapacityInOCU(Integer maxIndexingCapacityInOCU) {
        setMaxIndexingCapacityInOCU(maxIndexingCapacityInOCU);
        return this;
    }

    /**
     * <p>
     * The maximum search capacity for collections.
     * </p>
     * 
     * @param maxSearchCapacityInOCU
     *        The maximum search capacity for collections.
     */

    public void setMaxSearchCapacityInOCU(Integer maxSearchCapacityInOCU) {
        this.maxSearchCapacityInOCU = maxSearchCapacityInOCU;
    }

    /**
     * <p>
     * The maximum search capacity for collections.
     * </p>
     * 
     * @return The maximum search capacity for collections.
     */

    public Integer getMaxSearchCapacityInOCU() {
        return this.maxSearchCapacityInOCU;
    }

    /**
     * <p>
     * The maximum search capacity for collections.
     * </p>
     * 
     * @param maxSearchCapacityInOCU
     *        The maximum search capacity for collections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityLimits withMaxSearchCapacityInOCU(Integer maxSearchCapacityInOCU) {
        setMaxSearchCapacityInOCU(maxSearchCapacityInOCU);
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
        if (getMaxIndexingCapacityInOCU() != null)
            sb.append("MaxIndexingCapacityInOCU: ").append(getMaxIndexingCapacityInOCU()).append(",");
        if (getMaxSearchCapacityInOCU() != null)
            sb.append("MaxSearchCapacityInOCU: ").append(getMaxSearchCapacityInOCU());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityLimits == false)
            return false;
        CapacityLimits other = (CapacityLimits) obj;
        if (other.getMaxIndexingCapacityInOCU() == null ^ this.getMaxIndexingCapacityInOCU() == null)
            return false;
        if (other.getMaxIndexingCapacityInOCU() != null && other.getMaxIndexingCapacityInOCU().equals(this.getMaxIndexingCapacityInOCU()) == false)
            return false;
        if (other.getMaxSearchCapacityInOCU() == null ^ this.getMaxSearchCapacityInOCU() == null)
            return false;
        if (other.getMaxSearchCapacityInOCU() != null && other.getMaxSearchCapacityInOCU().equals(this.getMaxSearchCapacityInOCU()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxIndexingCapacityInOCU() == null) ? 0 : getMaxIndexingCapacityInOCU().hashCode());
        hashCode = prime * hashCode + ((getMaxSearchCapacityInOCU() == null) ? 0 : getMaxSearchCapacityInOCU().hashCode());
        return hashCode;
    }

    @Override
    public CapacityLimits clone() {
        try {
            return (CapacityLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.CapacityLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
