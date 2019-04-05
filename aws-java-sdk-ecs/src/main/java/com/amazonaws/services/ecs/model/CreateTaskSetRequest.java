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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/CreateTaskSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTaskSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set
     * in.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * An optional non-unique tag that identifies this task set in external systems. If the task set is associated with
     * a service discovery registry, the tasks in this task set will have the <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS
     * Cloud Map attribute set to the provided value.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The task definition for the tasks in the task set to use.
     * </p>
     */
    private String taskDefinition;

    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * A load balancer object representing the load balancer to use with the task set. The supported load balancer types
     * are either an Application Load Balancer or a Network Load Balancer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LoadBalancer> loadBalancers;
    /**
     * <p>
     * The details of the service discovery registries to assign to this task set. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceRegistry> serviceRegistries;
    /**
     * <p>
     * The launch type that new tasks in the task set will use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String launchType;
    /**
     * <p>
     * The platform version that the tasks in the task set should use. A platform version is specified only for tasks
     * using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default.
     * </p>
     */
    private String platformVersion;

    private Scale scale;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32 ASCII
     * characters are allowed.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * </p>
     * 
     * @param service
     *        The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * </p>
     * 
     * @param service
     *        The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set
     * in.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task
     *        set in.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set
     * in.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the
     *         task set in.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set
     * in.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task
     *        set in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * An optional non-unique tag that identifies this task set in external systems. If the task set is associated with
     * a service discovery registry, the tasks in this task set will have the <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS
     * Cloud Map attribute set to the provided value.
     * </p>
     * 
     * @param externalId
     *        An optional non-unique tag that identifies this task set in external systems. If the task set is
     *        associated with a service discovery registry, the tasks in this task set will have the
     *        <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute set to the provided value.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * An optional non-unique tag that identifies this task set in external systems. If the task set is associated with
     * a service discovery registry, the tasks in this task set will have the <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS
     * Cloud Map attribute set to the provided value.
     * </p>
     * 
     * @return An optional non-unique tag that identifies this task set in external systems. If the task set is
     *         associated with a service discovery registry, the tasks in this task set will have the
     *         <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute set to the provided value.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * An optional non-unique tag that identifies this task set in external systems. If the task set is associated with
     * a service discovery registry, the tasks in this task set will have the <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS
     * Cloud Map attribute set to the provided value.
     * </p>
     * 
     * @param externalId
     *        An optional non-unique tag that identifies this task set in external systems. If the task set is
     *        associated with a service discovery registry, the tasks in this task set will have the
     *        <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute set to the provided value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetRequest withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The task definition for the tasks in the task set to use.
     * </p>
     * 
     * @param taskDefinition
     *        The task definition for the tasks in the task set to use.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The task definition for the tasks in the task set to use.
     * </p>
     * 
     * @return The task definition for the tasks in the task set to use.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The task definition for the tasks in the task set to use.
     * </p>
     * 
     * @param taskDefinition
     *        The task definition for the tasks in the task set to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetRequest withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * @param networkConfiguration
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * @return
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * @param networkConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetRequest withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with the task set. The supported load balancer types
     * are either an Application Load Balancer or a Network Load Balancer.
     * </p>
     * 
     * @return A load balancer object representing the load balancer to use with the task set. The supported load
     *         balancer types are either an Application Load Balancer or a Network Load Balancer.
     */

    public java.util.List<LoadBalancer> getLoadBalancers() {
        if (loadBalancers == null) {
            loadBalancers = new com.amazonaws.internal.SdkInternalList<LoadBalancer>();
        }
        return loadBalancers;
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with the task set. The supported load balancer types
     * are either an Application Load Balancer or a Network Load Balancer.
     * </p>
     * 
     * @param loadBalancers
     *        A load balancer object representing the load balancer to use with the task set. The supported load
     *        balancer types are either an Application Load Balancer or a Network Load Balancer.
     */

    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new com.amazonaws.internal.SdkInternalList<LoadBalancer>(loadBalancers);
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with the task set. The supported load balancer types
     * are either an Application Load Balancer or a Network Load Balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancers(java.util.Collection)} or {@link #withLoadBalancers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param loadBalancers
     *        A load balancer object representing the load balancer to use with the task set. The supported load
     *        balancer types are either an Application Load Balancer or a Network Load Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetRequest withLoadBalancers(LoadBalancer... loadBalancers) {
        if (this.loadBalancers == null) {
            setLoadBalancers(new com.amazonaws.internal.SdkInternalList<LoadBalancer>(loadBalancers.length));
        }
        for (LoadBalancer ele : loadBalancers) {
            this.loadBalancers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with the task set. The supported load balancer types
     * are either an Application Load Balancer or a Network Load Balancer.
     * </p>
     * 
     * @param loadBalancers
     *        A load balancer object representing the load balancer to use with the task set. The supported load
     *        balancer types are either an Application Load Balancer or a Network Load Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetRequest withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this task set. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a>.
     * </p>
     * 
     * @return The details of the service discovery registries to assign to this task set. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service
     *         Discovery</a>.
     */

    public java.util.List<ServiceRegistry> getServiceRegistries() {
        if (serviceRegistries == null) {
            serviceRegistries = new com.amazonaws.internal.SdkInternalList<ServiceRegistry>();
        }
        return serviceRegistries;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this task set. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a>.
     * </p>
     * 
     * @param serviceRegistries
     *        The details of the service discovery registries to assign to this task set. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service
     *        Discovery</a>.
     */

    public void setServiceRegistries(java.util.Collection<ServiceRegistry> serviceRegistries) {
        if (serviceRegistries == null) {
            this.serviceRegistries = null;
            return;
        }

        this.serviceRegistries = new com.amazonaws.internal.SdkInternalList<ServiceRegistry>(serviceRegistries);
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this task set. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceRegistries(java.util.Collection)} or {@link #withServiceRegistries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param serviceRegistries
     *        The details of the service discovery registries to assign to this task set. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service
     *        Discovery</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetRequest withServiceRegistries(ServiceRegistry... serviceRegistries) {
        if (this.serviceRegistries == null) {
            setServiceRegistries(new com.amazonaws.internal.SdkInternalList<ServiceRegistry>(serviceRegistries.length));
        }
        for (ServiceRegistry ele : serviceRegistries) {
            this.serviceRegistries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this task set. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a>.
     * </p>
     * 
     * @param serviceRegistries
     *        The details of the service discovery registries to assign to this task set. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service
     *        Discovery</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetRequest withServiceRegistries(java.util.Collection<ServiceRegistry> serviceRegistries) {
        setServiceRegistries(serviceRegistries);
        return this;
    }

    /**
     * <p>
     * The launch type that new tasks in the task set will use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type that new tasks in the task set will use. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type that new tasks in the task set will use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The launch type that new tasks in the task set will use. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *         Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * The launch type that new tasks in the task set will use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type that new tasks in the task set will use. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public CreateTaskSetRequest withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * The launch type that new tasks in the task set will use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type that new tasks in the task set will use. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public CreateTaskSetRequest withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The platform version that the tasks in the task set should use. A platform version is specified only for tasks
     * using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default.
     * </p>
     * 
     * @param platformVersion
     *        The platform version that the tasks in the task set should use. A platform version is specified only for
     *        tasks using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version is
     *        used by default.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version that the tasks in the task set should use. A platform version is specified only for tasks
     * using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default.
     * </p>
     * 
     * @return The platform version that the tasks in the task set should use. A platform version is specified only for
     *         tasks using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version is
     *         used by default.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The platform version that the tasks in the task set should use. A platform version is specified only for tasks
     * using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default.
     * </p>
     * 
     * @param platformVersion
     *        The platform version that the tasks in the task set should use. A platform version is specified only for
     *        tasks using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version is
     *        used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetRequest withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * @param scale
     */

    public void setScale(Scale scale) {
        this.scale = scale;
    }

    /**
     * @return
     */

    public Scale getScale() {
        return this.scale;
    }

    /**
     * @param scale
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetRequest withScale(Scale scale) {
        setScale(scale);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32 ASCII
     * characters are allowed.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32
     *        ASCII characters are allowed.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32 ASCII
     * characters are allowed.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32
     *         ASCII characters are allowed.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32 ASCII
     * characters are allowed.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32
     *        ASCII characters are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskSetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: ").append(getTaskDefinition()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getLoadBalancers() != null)
            sb.append("LoadBalancers: ").append(getLoadBalancers()).append(",");
        if (getServiceRegistries() != null)
            sb.append("ServiceRegistries: ").append(getServiceRegistries()).append(",");
        if (getLaunchType() != null)
            sb.append("LaunchType: ").append(getLaunchType()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getScale() != null)
            sb.append("Scale: ").append(getScale()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTaskSetRequest == false)
            return false;
        CreateTaskSetRequest other = (CreateTaskSetRequest) obj;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        if (other.getServiceRegistries() == null ^ this.getServiceRegistries() == null)
            return false;
        if (other.getServiceRegistries() != null && other.getServiceRegistries().equals(this.getServiceRegistries()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode + ((getServiceRegistries() == null) ? 0 : getServiceRegistries().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateTaskSetRequest clone() {
        return (CreateTaskSetRequest) super.clone();
    }

}
