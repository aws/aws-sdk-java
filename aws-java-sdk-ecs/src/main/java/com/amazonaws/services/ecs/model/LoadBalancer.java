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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on a load balancer that is used with a service.
 * </p>
 * <p>
 * If the service is using the <code>ECS</code> deployment controller, you are limited to one load balancer or target
 * group.
 * </p>
 * <p>
 * If the service is using the <code>CODE_DEPLOY</code> deployment controller, the service is required to use either an
 * Application Load Balancer or Network Load Balancer. When you are creating an AWS CodeDeploy deployment group, you
 * specify two target groups (referred to as a <code>targetGroupPair</code>). Each target group binds to a separate task
 * set in the deployment. The load balancer can also have up to two listeners, a required listener for production
 * traffic and an optional listener that allows you to test new revisions of the service before routing production
 * traffic to it.
 * </p>
 * <p>
 * Services with tasks that use the <code>awsvpc</code> network mode (for example, those with the Fargate launch type)
 * only support Application Load Balancers and Network Load Balancers. Classic Load Balancers are not supported. Also,
 * when you create any target groups for these services, you must choose <code>ip</code> as the target type, not
 * <code>instance</code>. Tasks that use the <code>awsvpc</code> network mode are associated with an elastic network
 * interface, not an Amazon EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/LoadBalancer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a
     * service. For services using the <code>ECS</code> deployment controller, you are limited to one target group. For
     * services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define two target groups
     * for the load balancer.
     * </p>
     * <important>
     * <p>
     * If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the Fargate
     * launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>, because tasks that
     * use the <code>awsvpc</code> network mode are associated with an elastic network interface, not an Amazon EC2
     * instance.
     * </p>
     * </important>
     */
    private String targetGroupArn;
    /**
     * <p>
     * The name of a load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The name of the container (as it appears in a container definition) to associate with the load balancer.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The port on the container to associate with the load balancer. This port must correspond to a
     * <code>containerPort</code> in the service's task definition. Your container instances must allow ingress traffic
     * on the <code>hostPort</code> of the port mapping.
     * </p>
     */
    private Integer containerPort;

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a
     * service. For services using the <code>ECS</code> deployment controller, you are limited to one target group. For
     * services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define two target groups
     * for the load balancer.
     * </p>
     * <important>
     * <p>
     * If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the Fargate
     * launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>, because tasks that
     * use the <code>awsvpc</code> network mode are associated with an elastic network interface, not an Amazon EC2
     * instance.
     * </p>
     * </important>
     * 
     * @param targetGroupArn
     *        The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a
     *        service. For services using the <code>ECS</code> deployment controller, you are limited to one target
     *        group. For services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define
     *        two target groups for the load balancer.</p> <important>
     *        <p>
     *        If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the
     *        Fargate launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>,
     *        because tasks that use the <code>awsvpc</code> network mode are associated with an elastic network
     *        interface, not an Amazon EC2 instance.
     *        </p>
     */

    public void setTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a
     * service. For services using the <code>ECS</code> deployment controller, you are limited to one target group. For
     * services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define two target groups
     * for the load balancer.
     * </p>
     * <important>
     * <p>
     * If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the Fargate
     * launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>, because tasks that
     * use the <code>awsvpc</code> network mode are associated with an elastic network interface, not an Amazon EC2
     * instance.
     * </p>
     * </important>
     * 
     * @return The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with
     *         a service. For services using the <code>ECS</code> deployment controller, you are limited to one target
     *         group. For services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define
     *         two target groups for the load balancer.</p> <important>
     *         <p>
     *         If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the
     *         Fargate launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>,
     *         because tasks that use the <code>awsvpc</code> network mode are associated with an elastic network
     *         interface, not an Amazon EC2 instance.
     *         </p>
     */

    public String getTargetGroupArn() {
        return this.targetGroupArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a
     * service. For services using the <code>ECS</code> deployment controller, you are limited to one target group. For
     * services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define two target groups
     * for the load balancer.
     * </p>
     * <important>
     * <p>
     * If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the Fargate
     * launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>, because tasks that
     * use the <code>awsvpc</code> network mode are associated with an elastic network interface, not an Amazon EC2
     * instance.
     * </p>
     * </important>
     * 
     * @param targetGroupArn
     *        The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a
     *        service. For services using the <code>ECS</code> deployment controller, you are limited to one target
     *        group. For services using the <code>CODE_DEPLOY</code> deployment controller, you are required to define
     *        two target groups for the load balancer.</p> <important>
     *        <p>
     *        If your service's task definition uses the <code>awsvpc</code> network mode (which is required for the
     *        Fargate launch type), you must choose <code>ip</code> as the target type, not <code>instance</code>,
     *        because tasks that use the <code>awsvpc</code> network mode are associated with an elastic network
     *        interface, not an Amazon EC2 instance.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withTargetGroupArn(String targetGroupArn) {
        setTargetGroupArn(targetGroupArn);
        return this;
    }

    /**
     * <p>
     * The name of a load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of a load balancer.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of a load balancer.
     * </p>
     * 
     * @return The name of a load balancer.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of a load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of a load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The name of the container (as it appears in a container definition) to associate with the load balancer.
     * </p>
     * 
     * @param containerName
     *        The name of the container (as it appears in a container definition) to associate with the load balancer.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container (as it appears in a container definition) to associate with the load balancer.
     * </p>
     * 
     * @return The name of the container (as it appears in a container definition) to associate with the load balancer.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container (as it appears in a container definition) to associate with the load balancer.
     * </p>
     * 
     * @param containerName
     *        The name of the container (as it appears in a container definition) to associate with the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The port on the container to associate with the load balancer. This port must correspond to a
     * <code>containerPort</code> in the service's task definition. Your container instances must allow ingress traffic
     * on the <code>hostPort</code> of the port mapping.
     * </p>
     * 
     * @param containerPort
     *        The port on the container to associate with the load balancer. This port must correspond to a
     *        <code>containerPort</code> in the service's task definition. Your container instances must allow ingress
     *        traffic on the <code>hostPort</code> of the port mapping.
     */

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port on the container to associate with the load balancer. This port must correspond to a
     * <code>containerPort</code> in the service's task definition. Your container instances must allow ingress traffic
     * on the <code>hostPort</code> of the port mapping.
     * </p>
     * 
     * @return The port on the container to associate with the load balancer. This port must correspond to a
     *         <code>containerPort</code> in the service's task definition. Your container instances must allow ingress
     *         traffic on the <code>hostPort</code> of the port mapping.
     */

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * <p>
     * The port on the container to associate with the load balancer. This port must correspond to a
     * <code>containerPort</code> in the service's task definition. Your container instances must allow ingress traffic
     * on the <code>hostPort</code> of the port mapping.
     * </p>
     * 
     * @param containerPort
     *        The port on the container to associate with the load balancer. This port must correspond to a
     *        <code>containerPort</code> in the service's task definition. Your container instances must allow ingress
     *        traffic on the <code>hostPort</code> of the port mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withContainerPort(Integer containerPort) {
        setContainerPort(containerPort);
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
        if (getTargetGroupArn() != null)
            sb.append("TargetGroupArn: ").append(getTargetGroupArn()).append(",");
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getContainerPort() != null)
            sb.append("ContainerPort: ").append(getContainerPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancer == false)
            return false;
        LoadBalancer other = (LoadBalancer) obj;
        if (other.getTargetGroupArn() == null ^ this.getTargetGroupArn() == null)
            return false;
        if (other.getTargetGroupArn() != null && other.getTargetGroupArn().equals(this.getTargetGroupArn()) == false)
            return false;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getContainerPort() == null ^ this.getContainerPort() == null)
            return false;
        if (other.getContainerPort() != null && other.getContainerPort().equals(this.getContainerPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetGroupArn() == null) ? 0 : getTargetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancer clone() {
        try {
            return (LoadBalancer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.LoadBalancerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
