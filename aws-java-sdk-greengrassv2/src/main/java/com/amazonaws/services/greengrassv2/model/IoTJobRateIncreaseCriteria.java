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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about criteria to meet before a job increases its rollout rate. Specify either
 * <code>numberOfNotifiedThings</code> or <code>numberOfSucceededThings</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/IoTJobRateIncreaseCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IoTJobRateIncreaseCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of devices to receive the job notification before the rollout rate increases.
     * </p>
     */
    private Integer numberOfNotifiedThings;
    /**
     * <p>
     * The number of devices to successfully run the configuration job before the rollout rate increases.
     * </p>
     */
    private Integer numberOfSucceededThings;

    /**
     * <p>
     * The number of devices to receive the job notification before the rollout rate increases.
     * </p>
     * 
     * @param numberOfNotifiedThings
     *        The number of devices to receive the job notification before the rollout rate increases.
     */

    public void setNumberOfNotifiedThings(Integer numberOfNotifiedThings) {
        this.numberOfNotifiedThings = numberOfNotifiedThings;
    }

    /**
     * <p>
     * The number of devices to receive the job notification before the rollout rate increases.
     * </p>
     * 
     * @return The number of devices to receive the job notification before the rollout rate increases.
     */

    public Integer getNumberOfNotifiedThings() {
        return this.numberOfNotifiedThings;
    }

    /**
     * <p>
     * The number of devices to receive the job notification before the rollout rate increases.
     * </p>
     * 
     * @param numberOfNotifiedThings
     *        The number of devices to receive the job notification before the rollout rate increases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IoTJobRateIncreaseCriteria withNumberOfNotifiedThings(Integer numberOfNotifiedThings) {
        setNumberOfNotifiedThings(numberOfNotifiedThings);
        return this;
    }

    /**
     * <p>
     * The number of devices to successfully run the configuration job before the rollout rate increases.
     * </p>
     * 
     * @param numberOfSucceededThings
     *        The number of devices to successfully run the configuration job before the rollout rate increases.
     */

    public void setNumberOfSucceededThings(Integer numberOfSucceededThings) {
        this.numberOfSucceededThings = numberOfSucceededThings;
    }

    /**
     * <p>
     * The number of devices to successfully run the configuration job before the rollout rate increases.
     * </p>
     * 
     * @return The number of devices to successfully run the configuration job before the rollout rate increases.
     */

    public Integer getNumberOfSucceededThings() {
        return this.numberOfSucceededThings;
    }

    /**
     * <p>
     * The number of devices to successfully run the configuration job before the rollout rate increases.
     * </p>
     * 
     * @param numberOfSucceededThings
     *        The number of devices to successfully run the configuration job before the rollout rate increases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IoTJobRateIncreaseCriteria withNumberOfSucceededThings(Integer numberOfSucceededThings) {
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

        if (obj instanceof IoTJobRateIncreaseCriteria == false)
            return false;
        IoTJobRateIncreaseCriteria other = (IoTJobRateIncreaseCriteria) obj;
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
    public IoTJobRateIncreaseCriteria clone() {
        try {
            return (IoTJobRateIncreaseCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.IoTJobRateIncreaseCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
