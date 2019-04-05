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
 * Information about two target groups and how traffic is routed during an Amazon ECS deployment. An optional test
 * traffic route can be specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/TargetGroupPairInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetGroupPairInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One pair of target groups. One is associated with the original task set. The second is associated with the task
     * set that serves traffic after the deployment is complete.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TargetGroupInfo> targetGroups;
    /**
     * <p>
     * The path used by a load balancer to route production traffic when an Amazon ECS deployment is complete.
     * </p>
     */
    private TrafficRoute prodTrafficRoute;
    /**
     * <p>
     * An optional path used by a load balancer to route test traffic after an Amazon ECS deployment. Validation can
     * occur while test traffic is served during a deployment.
     * </p>
     */
    private TrafficRoute testTrafficRoute;

    /**
     * <p>
     * One pair of target groups. One is associated with the original task set. The second is associated with the task
     * set that serves traffic after the deployment is complete.
     * </p>
     * 
     * @return One pair of target groups. One is associated with the original task set. The second is associated with
     *         the task set that serves traffic after the deployment is complete.
     */

    public java.util.List<TargetGroupInfo> getTargetGroups() {
        if (targetGroups == null) {
            targetGroups = new com.amazonaws.internal.SdkInternalList<TargetGroupInfo>();
        }
        return targetGroups;
    }

    /**
     * <p>
     * One pair of target groups. One is associated with the original task set. The second is associated with the task
     * set that serves traffic after the deployment is complete.
     * </p>
     * 
     * @param targetGroups
     *        One pair of target groups. One is associated with the original task set. The second is associated with the
     *        task set that serves traffic after the deployment is complete.
     */

    public void setTargetGroups(java.util.Collection<TargetGroupInfo> targetGroups) {
        if (targetGroups == null) {
            this.targetGroups = null;
            return;
        }

        this.targetGroups = new com.amazonaws.internal.SdkInternalList<TargetGroupInfo>(targetGroups);
    }

    /**
     * <p>
     * One pair of target groups. One is associated with the original task set. The second is associated with the task
     * set that serves traffic after the deployment is complete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroups(java.util.Collection)} or {@link #withTargetGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetGroups
     *        One pair of target groups. One is associated with the original task set. The second is associated with the
     *        task set that serves traffic after the deployment is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupPairInfo withTargetGroups(TargetGroupInfo... targetGroups) {
        if (this.targetGroups == null) {
            setTargetGroups(new com.amazonaws.internal.SdkInternalList<TargetGroupInfo>(targetGroups.length));
        }
        for (TargetGroupInfo ele : targetGroups) {
            this.targetGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One pair of target groups. One is associated with the original task set. The second is associated with the task
     * set that serves traffic after the deployment is complete.
     * </p>
     * 
     * @param targetGroups
     *        One pair of target groups. One is associated with the original task set. The second is associated with the
     *        task set that serves traffic after the deployment is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupPairInfo withTargetGroups(java.util.Collection<TargetGroupInfo> targetGroups) {
        setTargetGroups(targetGroups);
        return this;
    }

    /**
     * <p>
     * The path used by a load balancer to route production traffic when an Amazon ECS deployment is complete.
     * </p>
     * 
     * @param prodTrafficRoute
     *        The path used by a load balancer to route production traffic when an Amazon ECS deployment is complete.
     */

    public void setProdTrafficRoute(TrafficRoute prodTrafficRoute) {
        this.prodTrafficRoute = prodTrafficRoute;
    }

    /**
     * <p>
     * The path used by a load balancer to route production traffic when an Amazon ECS deployment is complete.
     * </p>
     * 
     * @return The path used by a load balancer to route production traffic when an Amazon ECS deployment is complete.
     */

    public TrafficRoute getProdTrafficRoute() {
        return this.prodTrafficRoute;
    }

    /**
     * <p>
     * The path used by a load balancer to route production traffic when an Amazon ECS deployment is complete.
     * </p>
     * 
     * @param prodTrafficRoute
     *        The path used by a load balancer to route production traffic when an Amazon ECS deployment is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupPairInfo withProdTrafficRoute(TrafficRoute prodTrafficRoute) {
        setProdTrafficRoute(prodTrafficRoute);
        return this;
    }

    /**
     * <p>
     * An optional path used by a load balancer to route test traffic after an Amazon ECS deployment. Validation can
     * occur while test traffic is served during a deployment.
     * </p>
     * 
     * @param testTrafficRoute
     *        An optional path used by a load balancer to route test traffic after an Amazon ECS deployment. Validation
     *        can occur while test traffic is served during a deployment.
     */

    public void setTestTrafficRoute(TrafficRoute testTrafficRoute) {
        this.testTrafficRoute = testTrafficRoute;
    }

    /**
     * <p>
     * An optional path used by a load balancer to route test traffic after an Amazon ECS deployment. Validation can
     * occur while test traffic is served during a deployment.
     * </p>
     * 
     * @return An optional path used by a load balancer to route test traffic after an Amazon ECS deployment. Validation
     *         can occur while test traffic is served during a deployment.
     */

    public TrafficRoute getTestTrafficRoute() {
        return this.testTrafficRoute;
    }

    /**
     * <p>
     * An optional path used by a load balancer to route test traffic after an Amazon ECS deployment. Validation can
     * occur while test traffic is served during a deployment.
     * </p>
     * 
     * @param testTrafficRoute
     *        An optional path used by a load balancer to route test traffic after an Amazon ECS deployment. Validation
     *        can occur while test traffic is served during a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupPairInfo withTestTrafficRoute(TrafficRoute testTrafficRoute) {
        setTestTrafficRoute(testTrafficRoute);
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
        if (getTargetGroups() != null)
            sb.append("TargetGroups: ").append(getTargetGroups()).append(",");
        if (getProdTrafficRoute() != null)
            sb.append("ProdTrafficRoute: ").append(getProdTrafficRoute()).append(",");
        if (getTestTrafficRoute() != null)
            sb.append("TestTrafficRoute: ").append(getTestTrafficRoute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetGroupPairInfo == false)
            return false;
        TargetGroupPairInfo other = (TargetGroupPairInfo) obj;
        if (other.getTargetGroups() == null ^ this.getTargetGroups() == null)
            return false;
        if (other.getTargetGroups() != null && other.getTargetGroups().equals(this.getTargetGroups()) == false)
            return false;
        if (other.getProdTrafficRoute() == null ^ this.getProdTrafficRoute() == null)
            return false;
        if (other.getProdTrafficRoute() != null && other.getProdTrafficRoute().equals(this.getProdTrafficRoute()) == false)
            return false;
        if (other.getTestTrafficRoute() == null ^ this.getTestTrafficRoute() == null)
            return false;
        if (other.getTestTrafficRoute() != null && other.getTestTrafficRoute().equals(this.getTestTrafficRoute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetGroups() == null) ? 0 : getTargetGroups().hashCode());
        hashCode = prime * hashCode + ((getProdTrafficRoute() == null) ? 0 : getProdTrafficRoute().hashCode());
        hashCode = prime * hashCode + ((getTestTrafficRoute() == null) ? 0 : getTestTrafficRoute().hashCode());
        return hashCode;
    }

    @Override
    public TargetGroupPairInfo clone() {
        try {
            return (TargetGroupPairInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.TargetGroupPairInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
