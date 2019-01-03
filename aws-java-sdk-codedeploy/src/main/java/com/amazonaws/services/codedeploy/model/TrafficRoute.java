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
 * Information about a listener. The listener contains the path used to route traffic that is received from the load
 * balancer to a target group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/TrafficRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficRoute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of one listener. The listener identifies the route between a target group and a load balancer. This is an
     * array of strings with a maximum size of one.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> listenerArns;

    /**
     * <p>
     * The ARN of one listener. The listener identifies the route between a target group and a load balancer. This is an
     * array of strings with a maximum size of one.
     * </p>
     * 
     * @return The ARN of one listener. The listener identifies the route between a target group and a load balancer.
     *         This is an array of strings with a maximum size of one.
     */

    public java.util.List<String> getListenerArns() {
        if (listenerArns == null) {
            listenerArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return listenerArns;
    }

    /**
     * <p>
     * The ARN of one listener. The listener identifies the route between a target group and a load balancer. This is an
     * array of strings with a maximum size of one.
     * </p>
     * 
     * @param listenerArns
     *        The ARN of one listener. The listener identifies the route between a target group and a load balancer.
     *        This is an array of strings with a maximum size of one.
     */

    public void setListenerArns(java.util.Collection<String> listenerArns) {
        if (listenerArns == null) {
            this.listenerArns = null;
            return;
        }

        this.listenerArns = new com.amazonaws.internal.SdkInternalList<String>(listenerArns);
    }

    /**
     * <p>
     * The ARN of one listener. The listener identifies the route between a target group and a load balancer. This is an
     * array of strings with a maximum size of one.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListenerArns(java.util.Collection)} or {@link #withListenerArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listenerArns
     *        The ARN of one listener. The listener identifies the route between a target group and a load balancer.
     *        This is an array of strings with a maximum size of one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficRoute withListenerArns(String... listenerArns) {
        if (this.listenerArns == null) {
            setListenerArns(new com.amazonaws.internal.SdkInternalList<String>(listenerArns.length));
        }
        for (String ele : listenerArns) {
            this.listenerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN of one listener. The listener identifies the route between a target group and a load balancer. This is an
     * array of strings with a maximum size of one.
     * </p>
     * 
     * @param listenerArns
     *        The ARN of one listener. The listener identifies the route between a target group and a load balancer.
     *        This is an array of strings with a maximum size of one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficRoute withListenerArns(java.util.Collection<String> listenerArns) {
        setListenerArns(listenerArns);
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
        if (getListenerArns() != null)
            sb.append("ListenerArns: ").append(getListenerArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficRoute == false)
            return false;
        TrafficRoute other = (TrafficRoute) obj;
        if (other.getListenerArns() == null ^ this.getListenerArns() == null)
            return false;
        if (other.getListenerArns() != null && other.getListenerArns().equals(this.getListenerArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerArns() == null) ? 0 : getListenerArns().hashCode());
        return hashCode;
    }

    @Override
    public TrafficRoute clone() {
        try {
            return (TrafficRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.TrafficRouteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
