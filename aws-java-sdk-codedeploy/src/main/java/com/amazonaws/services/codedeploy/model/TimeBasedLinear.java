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
 * A configuration that shifts traffic from one version of a Lambda function to another in equal increments, with an
 * equal number of minutes between each increment. The original and target Lambda function versions are specified in the
 * deployment's AppSpec file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/TimeBasedLinear" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeBasedLinear implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage of traffic that is shifted at the start of each increment of a <code>TimeBasedLinear</code>
     * deployment.
     * </p>
     */
    private Integer linearPercentage;
    /**
     * <p>
     * The number of minutes between each incremental traffic shift of a <code>TimeBasedLinear</code> deployment.
     * </p>
     */
    private Integer linearInterval;

    /**
     * <p>
     * The percentage of traffic that is shifted at the start of each increment of a <code>TimeBasedLinear</code>
     * deployment.
     * </p>
     * 
     * @param linearPercentage
     *        The percentage of traffic that is shifted at the start of each increment of a <code>TimeBasedLinear</code>
     *        deployment.
     */

    public void setLinearPercentage(Integer linearPercentage) {
        this.linearPercentage = linearPercentage;
    }

    /**
     * <p>
     * The percentage of traffic that is shifted at the start of each increment of a <code>TimeBasedLinear</code>
     * deployment.
     * </p>
     * 
     * @return The percentage of traffic that is shifted at the start of each increment of a
     *         <code>TimeBasedLinear</code> deployment.
     */

    public Integer getLinearPercentage() {
        return this.linearPercentage;
    }

    /**
     * <p>
     * The percentage of traffic that is shifted at the start of each increment of a <code>TimeBasedLinear</code>
     * deployment.
     * </p>
     * 
     * @param linearPercentage
     *        The percentage of traffic that is shifted at the start of each increment of a <code>TimeBasedLinear</code>
     *        deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedLinear withLinearPercentage(Integer linearPercentage) {
        setLinearPercentage(linearPercentage);
        return this;
    }

    /**
     * <p>
     * The number of minutes between each incremental traffic shift of a <code>TimeBasedLinear</code> deployment.
     * </p>
     * 
     * @param linearInterval
     *        The number of minutes between each incremental traffic shift of a <code>TimeBasedLinear</code> deployment.
     */

    public void setLinearInterval(Integer linearInterval) {
        this.linearInterval = linearInterval;
    }

    /**
     * <p>
     * The number of minutes between each incremental traffic shift of a <code>TimeBasedLinear</code> deployment.
     * </p>
     * 
     * @return The number of minutes between each incremental traffic shift of a <code>TimeBasedLinear</code>
     *         deployment.
     */

    public Integer getLinearInterval() {
        return this.linearInterval;
    }

    /**
     * <p>
     * The number of minutes between each incremental traffic shift of a <code>TimeBasedLinear</code> deployment.
     * </p>
     * 
     * @param linearInterval
     *        The number of minutes between each incremental traffic shift of a <code>TimeBasedLinear</code> deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedLinear withLinearInterval(Integer linearInterval) {
        setLinearInterval(linearInterval);
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
        if (getLinearPercentage() != null)
            sb.append("LinearPercentage: ").append(getLinearPercentage()).append(",");
        if (getLinearInterval() != null)
            sb.append("LinearInterval: ").append(getLinearInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeBasedLinear == false)
            return false;
        TimeBasedLinear other = (TimeBasedLinear) obj;
        if (other.getLinearPercentage() == null ^ this.getLinearPercentage() == null)
            return false;
        if (other.getLinearPercentage() != null && other.getLinearPercentage().equals(this.getLinearPercentage()) == false)
            return false;
        if (other.getLinearInterval() == null ^ this.getLinearInterval() == null)
            return false;
        if (other.getLinearInterval() != null && other.getLinearInterval().equals(this.getLinearInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLinearPercentage() == null) ? 0 : getLinearPercentage().hashCode());
        hashCode = prime * hashCode + ((getLinearInterval() == null) ? 0 : getLinearInterval().hashCode());
        return hashCode;
    }

    @Override
    public TimeBasedLinear clone() {
        try {
            return (TimeBasedLinear) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.TimeBasedLinearMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
