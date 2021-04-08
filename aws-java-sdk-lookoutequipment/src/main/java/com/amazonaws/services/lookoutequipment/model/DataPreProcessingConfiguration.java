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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration is the <code>TargetSamplingRate</code>, which is the sampling rate of the data after post
 * processing by Amazon Lookout for Equipment. For example, if you provide data that has been collected at a 1 second
 * level and you want the system to resample the data at a 1 minute rate before training, the
 * <code>TargetSamplingRate</code> is 1 minute.
 * </p>
 * <p>
 * When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the rate you want.
 * The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is <i>PT15M</i>, and the value
 * for a 1 hour rate is <i>PT1H</i>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DataPreProcessingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataPreProcessingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you provide
     * data that has been collected at a 1 second level and you want the system to resample the data at a 1 minute rate
     * before training, the <code>TargetSamplingRate</code> is 1 minute.
     * </p>
     * <p>
     * When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the rate you
     * want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is <i>PT15M</i>, and
     * the value for a 1 hour rate is <i>PT1H</i>
     * </p>
     */
    private String targetSamplingRate;

    /**
     * <p>
     * The sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you provide
     * data that has been collected at a 1 second level and you want the system to resample the data at a 1 minute rate
     * before training, the <code>TargetSamplingRate</code> is 1 minute.
     * </p>
     * <p>
     * When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the rate you
     * want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is <i>PT15M</i>, and
     * the value for a 1 hour rate is <i>PT1H</i>
     * </p>
     * 
     * @param targetSamplingRate
     *        The sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you
     *        provide data that has been collected at a 1 second level and you want the system to resample the data at a
     *        1 minute rate before training, the <code>TargetSamplingRate</code> is 1 minute.</p>
     *        <p>
     *        When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the
     *        rate you want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is
     *        <i>PT15M</i>, and the value for a 1 hour rate is <i>PT1H</i>
     * @see TargetSamplingRate
     */

    public void setTargetSamplingRate(String targetSamplingRate) {
        this.targetSamplingRate = targetSamplingRate;
    }

    /**
     * <p>
     * The sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you provide
     * data that has been collected at a 1 second level and you want the system to resample the data at a 1 minute rate
     * before training, the <code>TargetSamplingRate</code> is 1 minute.
     * </p>
     * <p>
     * When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the rate you
     * want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is <i>PT15M</i>, and
     * the value for a 1 hour rate is <i>PT1H</i>
     * </p>
     * 
     * @return The sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you
     *         provide data that has been collected at a 1 second level and you want the system to resample the data at
     *         a 1 minute rate before training, the <code>TargetSamplingRate</code> is 1 minute.</p>
     *         <p>
     *         When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the
     *         rate you want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is
     *         <i>PT15M</i>, and the value for a 1 hour rate is <i>PT1H</i>
     * @see TargetSamplingRate
     */

    public String getTargetSamplingRate() {
        return this.targetSamplingRate;
    }

    /**
     * <p>
     * The sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you provide
     * data that has been collected at a 1 second level and you want the system to resample the data at a 1 minute rate
     * before training, the <code>TargetSamplingRate</code> is 1 minute.
     * </p>
     * <p>
     * When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the rate you
     * want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is <i>PT15M</i>, and
     * the value for a 1 hour rate is <i>PT1H</i>
     * </p>
     * 
     * @param targetSamplingRate
     *        The sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you
     *        provide data that has been collected at a 1 second level and you want the system to resample the data at a
     *        1 minute rate before training, the <code>TargetSamplingRate</code> is 1 minute.</p>
     *        <p>
     *        When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the
     *        rate you want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is
     *        <i>PT15M</i>, and the value for a 1 hour rate is <i>PT1H</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSamplingRate
     */

    public DataPreProcessingConfiguration withTargetSamplingRate(String targetSamplingRate) {
        setTargetSamplingRate(targetSamplingRate);
        return this;
    }

    /**
     * <p>
     * The sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you provide
     * data that has been collected at a 1 second level and you want the system to resample the data at a 1 minute rate
     * before training, the <code>TargetSamplingRate</code> is 1 minute.
     * </p>
     * <p>
     * When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the rate you
     * want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is <i>PT15M</i>, and
     * the value for a 1 hour rate is <i>PT1H</i>
     * </p>
     * 
     * @param targetSamplingRate
     *        The sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you
     *        provide data that has been collected at a 1 second level and you want the system to resample the data at a
     *        1 minute rate before training, the <code>TargetSamplingRate</code> is 1 minute.</p>
     *        <p>
     *        When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the
     *        rate you want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is
     *        <i>PT15M</i>, and the value for a 1 hour rate is <i>PT1H</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSamplingRate
     */

    public DataPreProcessingConfiguration withTargetSamplingRate(TargetSamplingRate targetSamplingRate) {
        this.targetSamplingRate = targetSamplingRate.toString();
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
        if (getTargetSamplingRate() != null)
            sb.append("TargetSamplingRate: ").append(getTargetSamplingRate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataPreProcessingConfiguration == false)
            return false;
        DataPreProcessingConfiguration other = (DataPreProcessingConfiguration) obj;
        if (other.getTargetSamplingRate() == null ^ this.getTargetSamplingRate() == null)
            return false;
        if (other.getTargetSamplingRate() != null && other.getTargetSamplingRate().equals(this.getTargetSamplingRate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetSamplingRate() == null) ? 0 : getTargetSamplingRate().hashCode());
        return hashCode;
    }

    @Override
    public DataPreProcessingConfiguration clone() {
        try {
            return (DataPreProcessingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.DataPreProcessingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
