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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Entity that comprises information of count and percentage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CountPercent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CountPercent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the count of occurences of the given statistic.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * Indicates the percentage of occurances of the given statistic.
     * </p>
     */
    private Float percentage;

    /**
     * <p>
     * Indicates the count of occurences of the given statistic.
     * </p>
     * 
     * @param count
     *        Indicates the count of occurences of the given statistic.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * Indicates the count of occurences of the given statistic.
     * </p>
     * 
     * @return Indicates the count of occurences of the given statistic.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * Indicates the count of occurences of the given statistic.
     * </p>
     * 
     * @param count
     *        Indicates the count of occurences of the given statistic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountPercent withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * Indicates the percentage of occurances of the given statistic.
     * </p>
     * 
     * @param percentage
     *        Indicates the percentage of occurances of the given statistic.
     */

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    /**
     * <p>
     * Indicates the percentage of occurances of the given statistic.
     * </p>
     * 
     * @return Indicates the percentage of occurances of the given statistic.
     */

    public Float getPercentage() {
        return this.percentage;
    }

    /**
     * <p>
     * Indicates the percentage of occurances of the given statistic.
     * </p>
     * 
     * @param percentage
     *        Indicates the percentage of occurances of the given statistic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountPercent withPercentage(Float percentage) {
        setPercentage(percentage);
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
        if (getPercentage() != null)
            sb.append("Percentage: ").append(getPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CountPercent == false)
            return false;
        CountPercent other = (CountPercent) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getPercentage() == null ^ this.getPercentage() == null)
            return false;
        if (other.getPercentage() != null && other.getPercentage().equals(this.getPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        return hashCode;
    }

    @Override
    public CountPercent clone() {
        try {
            return (CountPercent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.CountPercentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
