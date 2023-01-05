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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a traffic distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Distribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Distribution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Region where the traffic is distributed.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The percentage of the traffic that is distributed, in increments of 10.
     * </p>
     */
    private Integer percentage;

    /**
     * <p>
     * The Amazon Web Services Region where the traffic is distributed.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region where the traffic is distributed.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the traffic is distributed.
     * </p>
     * 
     * @return The Amazon Web Services Region where the traffic is distributed.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the traffic is distributed.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region where the traffic is distributed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The percentage of the traffic that is distributed, in increments of 10.
     * </p>
     * 
     * @param percentage
     *        The percentage of the traffic that is distributed, in increments of 10.
     */

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    /**
     * <p>
     * The percentage of the traffic that is distributed, in increments of 10.
     * </p>
     * 
     * @return The percentage of the traffic that is distributed, in increments of 10.
     */

    public Integer getPercentage() {
        return this.percentage;
    }

    /**
     * <p>
     * The percentage of the traffic that is distributed, in increments of 10.
     * </p>
     * 
     * @param percentage
     *        The percentage of the traffic that is distributed, in increments of 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withPercentage(Integer percentage) {
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
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

        if (obj instanceof Distribution == false)
            return false;
        Distribution other = (Distribution) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
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

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        return hashCode;
    }

    @Override
    public Distribution clone() {
        try {
            return (Distribution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.DistributionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
