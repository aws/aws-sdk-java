/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Allows you to define a criteria to initiate the increase in rate of rollout for a job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateIncreaseCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The threshold for number of notified things that will initiate the increase in rate of rollout.
     * </p>
     */
    private Integer numberOfNotifiedThings;
    /**
     * <p>
     * The threshold for number of succeeded things that will initiate the increase in rate of rollout.
     * </p>
     */
    private Integer numberOfSucceededThings;

    /**
     * <p>
     * The threshold for number of notified things that will initiate the increase in rate of rollout.
     * </p>
     * 
     * @param numberOfNotifiedThings
     *        The threshold for number of notified things that will initiate the increase in rate of rollout.
     */

    public void setNumberOfNotifiedThings(Integer numberOfNotifiedThings) {
        this.numberOfNotifiedThings = numberOfNotifiedThings;
    }

    /**
     * <p>
     * The threshold for number of notified things that will initiate the increase in rate of rollout.
     * </p>
     * 
     * @return The threshold for number of notified things that will initiate the increase in rate of rollout.
     */

    public Integer getNumberOfNotifiedThings() {
        return this.numberOfNotifiedThings;
    }

    /**
     * <p>
     * The threshold for number of notified things that will initiate the increase in rate of rollout.
     * </p>
     * 
     * @param numberOfNotifiedThings
     *        The threshold for number of notified things that will initiate the increase in rate of rollout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateIncreaseCriteria withNumberOfNotifiedThings(Integer numberOfNotifiedThings) {
        setNumberOfNotifiedThings(numberOfNotifiedThings);
        return this;
    }

    /**
     * <p>
     * The threshold for number of succeeded things that will initiate the increase in rate of rollout.
     * </p>
     * 
     * @param numberOfSucceededThings
     *        The threshold for number of succeeded things that will initiate the increase in rate of rollout.
     */

    public void setNumberOfSucceededThings(Integer numberOfSucceededThings) {
        this.numberOfSucceededThings = numberOfSucceededThings;
    }

    /**
     * <p>
     * The threshold for number of succeeded things that will initiate the increase in rate of rollout.
     * </p>
     * 
     * @return The threshold for number of succeeded things that will initiate the increase in rate of rollout.
     */

    public Integer getNumberOfSucceededThings() {
        return this.numberOfSucceededThings;
    }

    /**
     * <p>
     * The threshold for number of succeeded things that will initiate the increase in rate of rollout.
     * </p>
     * 
     * @param numberOfSucceededThings
     *        The threshold for number of succeeded things that will initiate the increase in rate of rollout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateIncreaseCriteria withNumberOfSucceededThings(Integer numberOfSucceededThings) {
        setNumberOfSucceededThings(numberOfSucceededThings);
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
        if (getNumberOfNotifiedThings() != null)
            sb.append("NumberOfNotifiedThings: ").append(getNumberOfNotifiedThings()).append(",");
        if (getNumberOfSucceededThings() != null)
            sb.append("NumberOfSucceededThings: ").append(getNumberOfSucceededThings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RateIncreaseCriteria == false)
            return false;
        RateIncreaseCriteria other = (RateIncreaseCriteria) obj;
        if (other.getNumberOfNotifiedThings() == null ^ this.getNumberOfNotifiedThings() == null)
            return false;
        if (other.getNumberOfNotifiedThings() != null && other.getNumberOfNotifiedThings().equals(this.getNumberOfNotifiedThings()) == false)
            return false;
        if (other.getNumberOfSucceededThings() == null ^ this.getNumberOfSucceededThings() == null)
            return false;
        if (other.getNumberOfSucceededThings() != null && other.getNumberOfSucceededThings().equals(this.getNumberOfSucceededThings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfNotifiedThings() == null) ? 0 : getNumberOfNotifiedThings().hashCode());
        hashCode = prime * hashCode + ((getNumberOfSucceededThings() == null) ? 0 : getNumberOfSucceededThings().hashCode());
        return hashCode;
    }

    @Override
    public RateIncreaseCriteria clone() {
        try {
            return (RateIncreaseCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.RateIncreaseCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
