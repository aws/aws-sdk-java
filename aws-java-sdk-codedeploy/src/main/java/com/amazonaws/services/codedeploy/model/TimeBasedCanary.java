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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A configuration that shifts traffic from one version of a Lambda function to another in two increments. The original
 * and target Lambda function versions are specified in the deployment's AppSpec file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/TimeBasedCanary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeBasedCanary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage of traffic to shift in the first increment of a <code>TimeBasedCanary</code> deployment.
     * </p>
     */
    private Integer canaryPercentage;
    /**
     * <p>
     * The number of minutes between the first and second traffic shifts of a <code>TimeBasedCanary</code> deployment.
     * </p>
     */
    private Integer canaryInterval;

    /**
     * <p>
     * The percentage of traffic to shift in the first increment of a <code>TimeBasedCanary</code> deployment.
     * </p>
     * 
     * @param canaryPercentage
     *        The percentage of traffic to shift in the first increment of a <code>TimeBasedCanary</code> deployment.
     */

    public void setCanaryPercentage(Integer canaryPercentage) {
        this.canaryPercentage = canaryPercentage;
    }

    /**
     * <p>
     * The percentage of traffic to shift in the first increment of a <code>TimeBasedCanary</code> deployment.
     * </p>
     * 
     * @return The percentage of traffic to shift in the first increment of a <code>TimeBasedCanary</code> deployment.
     */

    public Integer getCanaryPercentage() {
        return this.canaryPercentage;
    }

    /**
     * <p>
     * The percentage of traffic to shift in the first increment of a <code>TimeBasedCanary</code> deployment.
     * </p>
     * 
     * @param canaryPercentage
     *        The percentage of traffic to shift in the first increment of a <code>TimeBasedCanary</code> deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedCanary withCanaryPercentage(Integer canaryPercentage) {
        setCanaryPercentage(canaryPercentage);
        return this;
    }

    /**
     * <p>
     * The number of minutes between the first and second traffic shifts of a <code>TimeBasedCanary</code> deployment.
     * </p>
     * 
     * @param canaryInterval
     *        The number of minutes between the first and second traffic shifts of a <code>TimeBasedCanary</code>
     *        deployment.
     */

    public void setCanaryInterval(Integer canaryInterval) {
        this.canaryInterval = canaryInterval;
    }

    /**
     * <p>
     * The number of minutes between the first and second traffic shifts of a <code>TimeBasedCanary</code> deployment.
     * </p>
     * 
     * @return The number of minutes between the first and second traffic shifts of a <code>TimeBasedCanary</code>
     *         deployment.
     */

    public Integer getCanaryInterval() {
        return this.canaryInterval;
    }

    /**
     * <p>
     * The number of minutes between the first and second traffic shifts of a <code>TimeBasedCanary</code> deployment.
     * </p>
     * 
     * @param canaryInterval
     *        The number of minutes between the first and second traffic shifts of a <code>TimeBasedCanary</code>
     *        deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedCanary withCanaryInterval(Integer canaryInterval) {
        setCanaryInterval(canaryInterval);
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
        if (getCanaryPercentage() != null)
            sb.append("CanaryPercentage: ").append(getCanaryPercentage()).append(",");
        if (getCanaryInterval() != null)
            sb.append("CanaryInterval: ").append(getCanaryInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeBasedCanary == false)
            return false;
        TimeBasedCanary other = (TimeBasedCanary) obj;
        if (other.getCanaryPercentage() == null ^ this.getCanaryPercentage() == null)
            return false;
        if (other.getCanaryPercentage() != null && other.getCanaryPercentage().equals(this.getCanaryPercentage()) == false)
            return false;
        if (other.getCanaryInterval() == null ^ this.getCanaryInterval() == null)
            return false;
        if (other.getCanaryInterval() != null && other.getCanaryInterval().equals(this.getCanaryInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCanaryPercentage() == null) ? 0 : getCanaryPercentage().hashCode());
        hashCode = prime * hashCode + ((getCanaryInterval() == null) ? 0 : getCanaryInterval().hashCode());
        return hashCode;
    }

    @Override
    public TimeBasedCanary clone() {
        try {
            return (TimeBasedCanary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.TimeBasedCanaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
