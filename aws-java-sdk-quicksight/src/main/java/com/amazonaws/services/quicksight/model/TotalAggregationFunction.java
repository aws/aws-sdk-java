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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An aggregation function that aggregates the total values of a measure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TotalAggregationFunction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TotalAggregationFunction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A built in aggregation function for total values.
     * </p>
     */
    private String simpleTotalAggregationFunction;

    /**
     * <p>
     * A built in aggregation function for total values.
     * </p>
     * 
     * @param simpleTotalAggregationFunction
     *        A built in aggregation function for total values.
     * @see SimpleTotalAggregationFunction
     */

    public void setSimpleTotalAggregationFunction(String simpleTotalAggregationFunction) {
        this.simpleTotalAggregationFunction = simpleTotalAggregationFunction;
    }

    /**
     * <p>
     * A built in aggregation function for total values.
     * </p>
     * 
     * @return A built in aggregation function for total values.
     * @see SimpleTotalAggregationFunction
     */

    public String getSimpleTotalAggregationFunction() {
        return this.simpleTotalAggregationFunction;
    }

    /**
     * <p>
     * A built in aggregation function for total values.
     * </p>
     * 
     * @param simpleTotalAggregationFunction
     *        A built in aggregation function for total values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimpleTotalAggregationFunction
     */

    public TotalAggregationFunction withSimpleTotalAggregationFunction(String simpleTotalAggregationFunction) {
        setSimpleTotalAggregationFunction(simpleTotalAggregationFunction);
        return this;
    }

    /**
     * <p>
     * A built in aggregation function for total values.
     * </p>
     * 
     * @param simpleTotalAggregationFunction
     *        A built in aggregation function for total values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimpleTotalAggregationFunction
     */

    public TotalAggregationFunction withSimpleTotalAggregationFunction(SimpleTotalAggregationFunction simpleTotalAggregationFunction) {
        this.simpleTotalAggregationFunction = simpleTotalAggregationFunction.toString();
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
        if (getSimpleTotalAggregationFunction() != null)
            sb.append("SimpleTotalAggregationFunction: ").append(getSimpleTotalAggregationFunction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TotalAggregationFunction == false)
            return false;
        TotalAggregationFunction other = (TotalAggregationFunction) obj;
        if (other.getSimpleTotalAggregationFunction() == null ^ this.getSimpleTotalAggregationFunction() == null)
            return false;
        if (other.getSimpleTotalAggregationFunction() != null
                && other.getSimpleTotalAggregationFunction().equals(this.getSimpleTotalAggregationFunction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimpleTotalAggregationFunction() == null) ? 0 : getSimpleTotalAggregationFunction().hashCode());
        return hashCode;
    }

    @Override
    public TotalAggregationFunction clone() {
        try {
            return (TotalAggregationFunction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TotalAggregationFunctionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
