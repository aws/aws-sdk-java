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
 * The configuration that specifies how traffic is shifted from one version of a Lambda function to another version
 * during an AWS Lambda deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/TrafficRoutingConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficRoutingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of traffic shifting (<code>TimeBasedCanary</code> or <code>TimeBasedLinear</code>) used by a deployment
     * configuration .
     * </p>
     */
    private String type;
    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function to another in two increments. The
     * original and target Lambda function versions are specified in the deployment's AppSpec file.
     * </p>
     */
    private TimeBasedCanary timeBasedCanary;
    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function to another in equal increments, with an
     * equal number of minutes between each increment. The original and target Lambda function versions are specified in
     * the deployment's AppSpec file.
     * </p>
     */
    private TimeBasedLinear timeBasedLinear;

    /**
     * <p>
     * The type of traffic shifting (<code>TimeBasedCanary</code> or <code>TimeBasedLinear</code>) used by a deployment
     * configuration .
     * </p>
     * 
     * @param type
     *        The type of traffic shifting (<code>TimeBasedCanary</code> or <code>TimeBasedLinear</code>) used by a
     *        deployment configuration .
     * @see TrafficRoutingType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of traffic shifting (<code>TimeBasedCanary</code> or <code>TimeBasedLinear</code>) used by a deployment
     * configuration .
     * </p>
     * 
     * @return The type of traffic shifting (<code>TimeBasedCanary</code> or <code>TimeBasedLinear</code>) used by a
     *         deployment configuration .
     * @see TrafficRoutingType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of traffic shifting (<code>TimeBasedCanary</code> or <code>TimeBasedLinear</code>) used by a deployment
     * configuration .
     * </p>
     * 
     * @param type
     *        The type of traffic shifting (<code>TimeBasedCanary</code> or <code>TimeBasedLinear</code>) used by a
     *        deployment configuration .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficRoutingType
     */

    public TrafficRoutingConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of traffic shifting (<code>TimeBasedCanary</code> or <code>TimeBasedLinear</code>) used by a deployment
     * configuration .
     * </p>
     * 
     * @param type
     *        The type of traffic shifting (<code>TimeBasedCanary</code> or <code>TimeBasedLinear</code>) used by a
     *        deployment configuration .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficRoutingType
     */

    public TrafficRoutingConfig withType(TrafficRoutingType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function to another in two increments. The
     * original and target Lambda function versions are specified in the deployment's AppSpec file.
     * </p>
     * 
     * @param timeBasedCanary
     *        A configuration that shifts traffic from one version of a Lambda function to another in two increments.
     *        The original and target Lambda function versions are specified in the deployment's AppSpec file.
     */

    public void setTimeBasedCanary(TimeBasedCanary timeBasedCanary) {
        this.timeBasedCanary = timeBasedCanary;
    }

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function to another in two increments. The
     * original and target Lambda function versions are specified in the deployment's AppSpec file.
     * </p>
     * 
     * @return A configuration that shifts traffic from one version of a Lambda function to another in two increments.
     *         The original and target Lambda function versions are specified in the deployment's AppSpec file.
     */

    public TimeBasedCanary getTimeBasedCanary() {
        return this.timeBasedCanary;
    }

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function to another in two increments. The
     * original and target Lambda function versions are specified in the deployment's AppSpec file.
     * </p>
     * 
     * @param timeBasedCanary
     *        A configuration that shifts traffic from one version of a Lambda function to another in two increments.
     *        The original and target Lambda function versions are specified in the deployment's AppSpec file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficRoutingConfig withTimeBasedCanary(TimeBasedCanary timeBasedCanary) {
        setTimeBasedCanary(timeBasedCanary);
        return this;
    }

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function to another in equal increments, with an
     * equal number of minutes between each increment. The original and target Lambda function versions are specified in
     * the deployment's AppSpec file.
     * </p>
     * 
     * @param timeBasedLinear
     *        A configuration that shifts traffic from one version of a Lambda function to another in equal increments,
     *        with an equal number of minutes between each increment. The original and target Lambda function versions
     *        are specified in the deployment's AppSpec file.
     */

    public void setTimeBasedLinear(TimeBasedLinear timeBasedLinear) {
        this.timeBasedLinear = timeBasedLinear;
    }

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function to another in equal increments, with an
     * equal number of minutes between each increment. The original and target Lambda function versions are specified in
     * the deployment's AppSpec file.
     * </p>
     * 
     * @return A configuration that shifts traffic from one version of a Lambda function to another in equal increments,
     *         with an equal number of minutes between each increment. The original and target Lambda function versions
     *         are specified in the deployment's AppSpec file.
     */

    public TimeBasedLinear getTimeBasedLinear() {
        return this.timeBasedLinear;
    }

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function to another in equal increments, with an
     * equal number of minutes between each increment. The original and target Lambda function versions are specified in
     * the deployment's AppSpec file.
     * </p>
     * 
     * @param timeBasedLinear
     *        A configuration that shifts traffic from one version of a Lambda function to another in equal increments,
     *        with an equal number of minutes between each increment. The original and target Lambda function versions
     *        are specified in the deployment's AppSpec file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficRoutingConfig withTimeBasedLinear(TimeBasedLinear timeBasedLinear) {
        setTimeBasedLinear(timeBasedLinear);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTimeBasedCanary() != null)
            sb.append("TimeBasedCanary: ").append(getTimeBasedCanary()).append(",");
        if (getTimeBasedLinear() != null)
            sb.append("TimeBasedLinear: ").append(getTimeBasedLinear());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficRoutingConfig == false)
            return false;
        TrafficRoutingConfig other = (TrafficRoutingConfig) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTimeBasedCanary() == null ^ this.getTimeBasedCanary() == null)
            return false;
        if (other.getTimeBasedCanary() != null && other.getTimeBasedCanary().equals(this.getTimeBasedCanary()) == false)
            return false;
        if (other.getTimeBasedLinear() == null ^ this.getTimeBasedLinear() == null)
            return false;
        if (other.getTimeBasedLinear() != null && other.getTimeBasedLinear().equals(this.getTimeBasedLinear()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTimeBasedCanary() == null) ? 0 : getTimeBasedCanary().hashCode());
        hashCode = prime * hashCode + ((getTimeBasedLinear() == null) ? 0 : getTimeBasedLinear().hashCode());
        return hashCode;
    }

    @Override
    public TrafficRoutingConfig clone() {
        try {
            return (TrafficRoutingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.TrafficRoutingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
