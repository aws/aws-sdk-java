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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket in your delivery
 * channel.
 * </p>
 * <note>
 * <p>
 * If you want to create a rule that triggers evaluations for your resources when AWS Config delivers the configuration
 * snapshot, see the following:
 * </p>
 * </note>
 * <p>
 * The frequency for a rule that triggers evaluations for your resources when AWS Config delivers the configuration
 * snapshot is set by one of two values, depending on which is less frequent:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The value for the <code>deliveryFrequency</code> parameter within the delivery channel configuration, which sets how
 * often AWS Config delivers configuration snapshots. This value also sets how often AWS Config invokes evaluations for
 * AWS Config rules.
 * </p>
 * </li>
 * <li>
 * <p>
 * The value for the <code>MaximumExecutionFrequency</code> parameter, which sets the maximum frequency with which AWS
 * Config invokes evaluations for the rule. For more information, see <a>ConfigRule</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If the <code>deliveryFrequency</code> value is less frequent than the <code>MaximumExecutionFrequency</code> value
 * for a rule, AWS Config invokes the rule only as often as the <code>deliveryFrequency</code> value.
 * </p>
 * <ol>
 * <li>
 * <p>
 * For example, you want your rule to run evaluations when AWS Config delivers the configuration snapshot.
 * </p>
 * </li>
 * <li>
 * <p>
 * You specify the <code>MaximumExecutionFrequency</code> value for <code>Six_Hours</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You then specify the delivery channel <code>deliveryFrequency</code> value for <code>TwentyFour_Hours</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Because the value for <code>deliveryFrequency</code> is less frequent than <code>MaximumExecutionFrequency</code>,
 * AWS Config invokes evaluations for the rule every 24 hours.
 * </p>
 * </li>
 * </ol>
 * <p>
 * You should set the <code>MaximumExecutionFrequency</code> value to be at least as frequent as the
 * <code>deliveryFrequency</code> value. You can view the <code>deliveryFrequency</code> value by using the
 * <code>DescribeDeliveryChannnels</code> action.
 * </p>
 * <p>
 * To update the <code>deliveryFrequency</code> with which AWS Config delivers your configuration snapshots, use the
 * <code>PutDeliveryChannel</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConfigSnapshotDeliveryProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigSnapshotDeliveryProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The frequency with which AWS Config delivers configuration snapshots.
     * </p>
     */
    private String deliveryFrequency;

    /**
     * <p>
     * The frequency with which AWS Config delivers configuration snapshots.
     * </p>
     * 
     * @param deliveryFrequency
     *        The frequency with which AWS Config delivers configuration snapshots.
     * @see MaximumExecutionFrequency
     */

    public void setDeliveryFrequency(String deliveryFrequency) {
        this.deliveryFrequency = deliveryFrequency;
    }

    /**
     * <p>
     * The frequency with which AWS Config delivers configuration snapshots.
     * </p>
     * 
     * @return The frequency with which AWS Config delivers configuration snapshots.
     * @see MaximumExecutionFrequency
     */

    public String getDeliveryFrequency() {
        return this.deliveryFrequency;
    }

    /**
     * <p>
     * The frequency with which AWS Config delivers configuration snapshots.
     * </p>
     * 
     * @param deliveryFrequency
     *        The frequency with which AWS Config delivers configuration snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumExecutionFrequency
     */

    public ConfigSnapshotDeliveryProperties withDeliveryFrequency(String deliveryFrequency) {
        setDeliveryFrequency(deliveryFrequency);
        return this;
    }

    /**
     * <p>
     * The frequency with which AWS Config delivers configuration snapshots.
     * </p>
     * 
     * @param deliveryFrequency
     *        The frequency with which AWS Config delivers configuration snapshots.
     * @see MaximumExecutionFrequency
     */

    public void setDeliveryFrequency(MaximumExecutionFrequency deliveryFrequency) {
        withDeliveryFrequency(deliveryFrequency);
    }

    /**
     * <p>
     * The frequency with which AWS Config delivers configuration snapshots.
     * </p>
     * 
     * @param deliveryFrequency
     *        The frequency with which AWS Config delivers configuration snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumExecutionFrequency
     */

    public ConfigSnapshotDeliveryProperties withDeliveryFrequency(MaximumExecutionFrequency deliveryFrequency) {
        this.deliveryFrequency = deliveryFrequency.toString();
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
        if (getDeliveryFrequency() != null)
            sb.append("DeliveryFrequency: ").append(getDeliveryFrequency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigSnapshotDeliveryProperties == false)
            return false;
        ConfigSnapshotDeliveryProperties other = (ConfigSnapshotDeliveryProperties) obj;
        if (other.getDeliveryFrequency() == null ^ this.getDeliveryFrequency() == null)
            return false;
        if (other.getDeliveryFrequency() != null && other.getDeliveryFrequency().equals(this.getDeliveryFrequency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryFrequency() == null) ? 0 : getDeliveryFrequency().hashCode());
        return hashCode;
    }

    @Override
    public ConfigSnapshotDeliveryProperties clone() {
        try {
            return (ConfigSnapshotDeliveryProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConfigSnapshotDeliveryPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
