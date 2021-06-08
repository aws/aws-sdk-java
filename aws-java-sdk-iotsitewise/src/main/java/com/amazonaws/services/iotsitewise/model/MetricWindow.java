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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a time interval window used for data aggregate computations (for example, average, sum, count, and so on).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/MetricWindow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricWindow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tumbling time interval window.
     * </p>
     */
    private TumblingWindow tumbling;

    /**
     * <p>
     * The tumbling time interval window.
     * </p>
     * 
     * @param tumbling
     *        The tumbling time interval window.
     */

    public void setTumbling(TumblingWindow tumbling) {
        this.tumbling = tumbling;
    }

    /**
     * <p>
     * The tumbling time interval window.
     * </p>
     * 
     * @return The tumbling time interval window.
     */

    public TumblingWindow getTumbling() {
        return this.tumbling;
    }

    /**
     * <p>
     * The tumbling time interval window.
     * </p>
     * 
     * @param tumbling
     *        The tumbling time interval window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricWindow withTumbling(TumblingWindow tumbling) {
        setTumbling(tumbling);
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
        if (getTumbling() != null)
            sb.append("Tumbling: ").append(getTumbling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricWindow == false)
            return false;
        MetricWindow other = (MetricWindow) obj;
        if (other.getTumbling() == null ^ this.getTumbling() == null)
            return false;
        if (other.getTumbling() != null && other.getTumbling().equals(this.getTumbling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTumbling() == null) ? 0 : getTumbling().hashCode());
        return hashCode;
    }

    @Override
    public MetricWindow clone() {
        try {
            return (MetricWindow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.MetricWindowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
