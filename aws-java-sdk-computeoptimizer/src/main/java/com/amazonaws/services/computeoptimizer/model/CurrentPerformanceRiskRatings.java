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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the performance risk ratings for a given resource type.
 * </p>
 * <p>
 * Resources with a <code>high</code> or <code>medium</code> rating are at risk of not meeting the performance needs of
 * their workloads, while resources with a <code>low</code> rating are performing well in their workloads.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/CurrentPerformanceRiskRatings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CurrentPerformanceRiskRatings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A count of the applicable resource types with a high performance risk rating.
     * </p>
     */
    private Long high;
    /**
     * <p>
     * A count of the applicable resource types with a medium performance risk rating.
     * </p>
     */
    private Long medium;
    /**
     * <p>
     * A count of the applicable resource types with a low performance risk rating.
     * </p>
     */
    private Long low;
    /**
     * <p>
     * A count of the applicable resource types with a very low performance risk rating.
     * </p>
     */
    private Long veryLow;

    /**
     * <p>
     * A count of the applicable resource types with a high performance risk rating.
     * </p>
     * 
     * @param high
     *        A count of the applicable resource types with a high performance risk rating.
     */

    public void setHigh(Long high) {
        this.high = high;
    }

    /**
     * <p>
     * A count of the applicable resource types with a high performance risk rating.
     * </p>
     * 
     * @return A count of the applicable resource types with a high performance risk rating.
     */

    public Long getHigh() {
        return this.high;
    }

    /**
     * <p>
     * A count of the applicable resource types with a high performance risk rating.
     * </p>
     * 
     * @param high
     *        A count of the applicable resource types with a high performance risk rating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentPerformanceRiskRatings withHigh(Long high) {
        setHigh(high);
        return this;
    }

    /**
     * <p>
     * A count of the applicable resource types with a medium performance risk rating.
     * </p>
     * 
     * @param medium
     *        A count of the applicable resource types with a medium performance risk rating.
     */

    public void setMedium(Long medium) {
        this.medium = medium;
    }

    /**
     * <p>
     * A count of the applicable resource types with a medium performance risk rating.
     * </p>
     * 
     * @return A count of the applicable resource types with a medium performance risk rating.
     */

    public Long getMedium() {
        return this.medium;
    }

    /**
     * <p>
     * A count of the applicable resource types with a medium performance risk rating.
     * </p>
     * 
     * @param medium
     *        A count of the applicable resource types with a medium performance risk rating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentPerformanceRiskRatings withMedium(Long medium) {
        setMedium(medium);
        return this;
    }

    /**
     * <p>
     * A count of the applicable resource types with a low performance risk rating.
     * </p>
     * 
     * @param low
     *        A count of the applicable resource types with a low performance risk rating.
     */

    public void setLow(Long low) {
        this.low = low;
    }

    /**
     * <p>
     * A count of the applicable resource types with a low performance risk rating.
     * </p>
     * 
     * @return A count of the applicable resource types with a low performance risk rating.
     */

    public Long getLow() {
        return this.low;
    }

    /**
     * <p>
     * A count of the applicable resource types with a low performance risk rating.
     * </p>
     * 
     * @param low
     *        A count of the applicable resource types with a low performance risk rating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentPerformanceRiskRatings withLow(Long low) {
        setLow(low);
        return this;
    }

    /**
     * <p>
     * A count of the applicable resource types with a very low performance risk rating.
     * </p>
     * 
     * @param veryLow
     *        A count of the applicable resource types with a very low performance risk rating.
     */

    public void setVeryLow(Long veryLow) {
        this.veryLow = veryLow;
    }

    /**
     * <p>
     * A count of the applicable resource types with a very low performance risk rating.
     * </p>
     * 
     * @return A count of the applicable resource types with a very low performance risk rating.
     */

    public Long getVeryLow() {
        return this.veryLow;
    }

    /**
     * <p>
     * A count of the applicable resource types with a very low performance risk rating.
     * </p>
     * 
     * @param veryLow
     *        A count of the applicable resource types with a very low performance risk rating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentPerformanceRiskRatings withVeryLow(Long veryLow) {
        setVeryLow(veryLow);
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
        if (getHigh() != null)
            sb.append("High: ").append(getHigh()).append(",");
        if (getMedium() != null)
            sb.append("Medium: ").append(getMedium()).append(",");
        if (getLow() != null)
            sb.append("Low: ").append(getLow()).append(",");
        if (getVeryLow() != null)
            sb.append("VeryLow: ").append(getVeryLow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CurrentPerformanceRiskRatings == false)
            return false;
        CurrentPerformanceRiskRatings other = (CurrentPerformanceRiskRatings) obj;
        if (other.getHigh() == null ^ this.getHigh() == null)
            return false;
        if (other.getHigh() != null && other.getHigh().equals(this.getHigh()) == false)
            return false;
        if (other.getMedium() == null ^ this.getMedium() == null)
            return false;
        if (other.getMedium() != null && other.getMedium().equals(this.getMedium()) == false)
            return false;
        if (other.getLow() == null ^ this.getLow() == null)
            return false;
        if (other.getLow() != null && other.getLow().equals(this.getLow()) == false)
            return false;
        if (other.getVeryLow() == null ^ this.getVeryLow() == null)
            return false;
        if (other.getVeryLow() != null && other.getVeryLow().equals(this.getVeryLow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHigh() == null) ? 0 : getHigh().hashCode());
        hashCode = prime * hashCode + ((getMedium() == null) ? 0 : getMedium().hashCode());
        hashCode = prime * hashCode + ((getLow() == null) ? 0 : getLow().hashCode());
        hashCode = prime * hashCode + ((getVeryLow() == null) ? 0 : getVeryLow().hashCode());
        return hashCode;
    }

    @Override
    public CurrentPerformanceRiskRatings clone() {
        try {
            return (CurrentPerformanceRiskRatings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.CurrentPerformanceRiskRatingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
