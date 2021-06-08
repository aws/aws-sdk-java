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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The aggregation settings that you can use to customize the output format of your flow data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/AggregationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them unaggregated.
     * </p>
     */
    private String aggregationType;

    /**
     * <p>
     * Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them unaggregated.
     * </p>
     * 
     * @param aggregationType
     *        Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them
     *        unaggregated.
     * @see AggregationType
     */

    public void setAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
    }

    /**
     * <p>
     * Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them unaggregated.
     * </p>
     * 
     * @return Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them
     *         unaggregated.
     * @see AggregationType
     */

    public String getAggregationType() {
        return this.aggregationType;
    }

    /**
     * <p>
     * Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them unaggregated.
     * </p>
     * 
     * @param aggregationType
     *        Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them
     *        unaggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationType
     */

    public AggregationConfig withAggregationType(String aggregationType) {
        setAggregationType(aggregationType);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them unaggregated.
     * </p>
     * 
     * @param aggregationType
     *        Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them
     *        unaggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationType
     */

    public AggregationConfig withAggregationType(AggregationType aggregationType) {
        this.aggregationType = aggregationType.toString();
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
        if (getAggregationType() != null)
            sb.append("AggregationType: ").append(getAggregationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregationConfig == false)
            return false;
        AggregationConfig other = (AggregationConfig) obj;
        if (other.getAggregationType() == null ^ this.getAggregationType() == null)
            return false;
        if (other.getAggregationType() != null && other.getAggregationType().equals(this.getAggregationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregationType() == null) ? 0 : getAggregationType().hashCode());
        return hashCode;
    }

    @Override
    public AggregationConfig clone() {
        try {
            return (AggregationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.AggregationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
