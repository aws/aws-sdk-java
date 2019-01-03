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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the instance (a virtual private server) to stop.
     * </p>
     */
    private String instanceName;
    /**
     * <p>
     * When set to <code>True</code>, forces a Lightsail instance that is stuck in a <code>stopping</code> state to
     * stop.
     * </p>
     * <important>
     * <p>
     * Only use the <code>force</code> parameter if your instance is stuck in the <code>stopping</code> state. In any
     * other state, your instance should stop normally without adding this parameter to your API request.
     * </p>
     * </important>
     */
    private Boolean force;

    /**
     * <p>
     * The name of the instance (a virtual private server) to stop.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance (a virtual private server) to stop.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the instance (a virtual private server) to stop.
     * </p>
     * 
     * @return The name of the instance (a virtual private server) to stop.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the instance (a virtual private server) to stop.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance (a virtual private server) to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInstanceRequest withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }

    /**
     * <p>
     * When set to <code>True</code>, forces a Lightsail instance that is stuck in a <code>stopping</code> state to
     * stop.
     * </p>
     * <important>
     * <p>
     * Only use the <code>force</code> parameter if your instance is stuck in the <code>stopping</code> state. In any
     * other state, your instance should stop normally without adding this parameter to your API request.
     * </p>
     * </important>
     * 
     * @param force
     *        When set to <code>True</code>, forces a Lightsail instance that is stuck in a <code>stopping</code> state
     *        to stop.</p> <important>
     *        <p>
     *        Only use the <code>force</code> parameter if your instance is stuck in the <code>stopping</code> state. In
     *        any other state, your instance should stop normally without adding this parameter to your API request.
     *        </p>
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * When set to <code>True</code>, forces a Lightsail instance that is stuck in a <code>stopping</code> state to
     * stop.
     * </p>
     * <important>
     * <p>
     * Only use the <code>force</code> parameter if your instance is stuck in the <code>stopping</code> state. In any
     * other state, your instance should stop normally without adding this parameter to your API request.
     * </p>
     * </important>
     * 
     * @return When set to <code>True</code>, forces a Lightsail instance that is stuck in a <code>stopping</code> state
     *         to stop.</p> <important>
     *         <p>
     *         Only use the <code>force</code> parameter if your instance is stuck in the <code>stopping</code> state.
     *         In any other state, your instance should stop normally without adding this parameter to your API request.
     *         </p>
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * When set to <code>True</code>, forces a Lightsail instance that is stuck in a <code>stopping</code> state to
     * stop.
     * </p>
     * <important>
     * <p>
     * Only use the <code>force</code> parameter if your instance is stuck in the <code>stopping</code> state. In any
     * other state, your instance should stop normally without adding this parameter to your API request.
     * </p>
     * </important>
     * 
     * @param force
     *        When set to <code>True</code>, forces a Lightsail instance that is stuck in a <code>stopping</code> state
     *        to stop.</p> <important>
     *        <p>
     *        Only use the <code>force</code> parameter if your instance is stuck in the <code>stopping</code> state. In
     *        any other state, your instance should stop normally without adding this parameter to your API request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInstanceRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * When set to <code>True</code>, forces a Lightsail instance that is stuck in a <code>stopping</code> state to
     * stop.
     * </p>
     * <important>
     * <p>
     * Only use the <code>force</code> parameter if your instance is stuck in the <code>stopping</code> state. In any
     * other state, your instance should stop normally without adding this parameter to your API request.
     * </p>
     * </important>
     * 
     * @return When set to <code>True</code>, forces a Lightsail instance that is stuck in a <code>stopping</code> state
     *         to stop.</p> <important>
     *         <p>
     *         Only use the <code>force</code> parameter if your instance is stuck in the <code>stopping</code> state.
     *         In any other state, your instance should stop normally without adding this parameter to your API request.
     *         </p>
     */

    public Boolean isForce() {
        return this.force;
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
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopInstanceRequest == false)
            return false;
        StopInstanceRequest other = (StopInstanceRequest) obj;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public StopInstanceRequest clone() {
        return (StopInstanceRequest) super.clone();
    }

}
