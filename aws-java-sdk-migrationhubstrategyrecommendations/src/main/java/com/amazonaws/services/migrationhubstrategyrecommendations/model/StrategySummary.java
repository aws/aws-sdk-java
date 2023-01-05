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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object containing the summary of the strategy recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StrategySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StrategySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The count of recommendations per strategy.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The name of recommended strategy.
     * </p>
     */
    private String strategy;

    /**
     * <p>
     * The count of recommendations per strategy.
     * </p>
     * 
     * @param count
     *        The count of recommendations per strategy.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The count of recommendations per strategy.
     * </p>
     * 
     * @return The count of recommendations per strategy.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The count of recommendations per strategy.
     * </p>
     * 
     * @param count
     *        The count of recommendations per strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StrategySummary withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The name of recommended strategy.
     * </p>
     * 
     * @param strategy
     *        The name of recommended strategy.
     * @see Strategy
     */

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * The name of recommended strategy.
     * </p>
     * 
     * @return The name of recommended strategy.
     * @see Strategy
     */

    public String getStrategy() {
        return this.strategy;
    }

    /**
     * <p>
     * The name of recommended strategy.
     * </p>
     * 
     * @param strategy
     *        The name of recommended strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Strategy
     */

    public StrategySummary withStrategy(String strategy) {
        setStrategy(strategy);
        return this;
    }

    /**
     * <p>
     * The name of recommended strategy.
     * </p>
     * 
     * @param strategy
     *        The name of recommended strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Strategy
     */

    public StrategySummary withStrategy(Strategy strategy) {
        this.strategy = strategy.toString();
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
        if (getStrategy() != null)
            sb.append("Strategy: ").append(getStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StrategySummary == false)
            return false;
        StrategySummary other = (StrategySummary) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        return hashCode;
    }

    @Override
    public StrategySummary clone() {
        try {
            return (StrategySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.StrategySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
