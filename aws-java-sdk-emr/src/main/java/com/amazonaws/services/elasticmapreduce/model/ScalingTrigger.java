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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The conditions that trigger an automatic scaling activity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ScalingTrigger" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingTrigger implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The definition of a CloudWatch metric alarm. When the defined alarm conditions are met along with other trigger
     * parameters, scaling activity begins.
     * </p>
     */
    private CloudWatchAlarmDefinition cloudWatchAlarmDefinition;

    /**
     * <p>
     * The definition of a CloudWatch metric alarm. When the defined alarm conditions are met along with other trigger
     * parameters, scaling activity begins.
     * </p>
     * 
     * @param cloudWatchAlarmDefinition
     *        The definition of a CloudWatch metric alarm. When the defined alarm conditions are met along with other
     *        trigger parameters, scaling activity begins.
     */

    public void setCloudWatchAlarmDefinition(CloudWatchAlarmDefinition cloudWatchAlarmDefinition) {
        this.cloudWatchAlarmDefinition = cloudWatchAlarmDefinition;
    }

    /**
     * <p>
     * The definition of a CloudWatch metric alarm. When the defined alarm conditions are met along with other trigger
     * parameters, scaling activity begins.
     * </p>
     * 
     * @return The definition of a CloudWatch metric alarm. When the defined alarm conditions are met along with other
     *         trigger parameters, scaling activity begins.
     */

    public CloudWatchAlarmDefinition getCloudWatchAlarmDefinition() {
        return this.cloudWatchAlarmDefinition;
    }

    /**
     * <p>
     * The definition of a CloudWatch metric alarm. When the defined alarm conditions are met along with other trigger
     * parameters, scaling activity begins.
     * </p>
     * 
     * @param cloudWatchAlarmDefinition
     *        The definition of a CloudWatch metric alarm. When the defined alarm conditions are met along with other
     *        trigger parameters, scaling activity begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingTrigger withCloudWatchAlarmDefinition(CloudWatchAlarmDefinition cloudWatchAlarmDefinition) {
        setCloudWatchAlarmDefinition(cloudWatchAlarmDefinition);
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
        if (getCloudWatchAlarmDefinition() != null)
            sb.append("CloudWatchAlarmDefinition: ").append(getCloudWatchAlarmDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingTrigger == false)
            return false;
        ScalingTrigger other = (ScalingTrigger) obj;
        if (other.getCloudWatchAlarmDefinition() == null ^ this.getCloudWatchAlarmDefinition() == null)
            return false;
        if (other.getCloudWatchAlarmDefinition() != null && other.getCloudWatchAlarmDefinition().equals(this.getCloudWatchAlarmDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchAlarmDefinition() == null) ? 0 : getCloudWatchAlarmDefinition().hashCode());
        return hashCode;
    }

    @Override
    public ScalingTrigger clone() {
        try {
            return (ScalingTrigger) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.ScalingTriggerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
