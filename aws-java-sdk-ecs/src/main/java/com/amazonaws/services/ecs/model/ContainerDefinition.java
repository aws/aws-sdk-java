/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Container definitions are used in task definitions to describe the
 * different containers that are launched as part of a task.
 * </p>
 */
public class ContainerDefinition implements Serializable, Cloneable {

    /**
     * The name of a container. If you are linking multiple containers
     * together in a task definition, the <code>name</code> of one container
     * can be entered in the <code>links</code> of another container to
     * connect the containers.
     */
    private String name;

    /**
     * The image used to start a container. This string is passed directly to
     * the Docker daemon. Images in the Docker Hub registry are available by
     * default. Other repositories are specified with
     * <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>.
     */
    private String image;

    /**
     * The number of <code>cpu</code> units reserved for the container. A
     * container instance has 1,024 <code>cpu</code> units for every CPU
     * core. This parameter specifies the minimum amount of CPU to reserve
     * for a container, and containers share unallocated CPU units with other
     * containers on the instance with the same ratio as their allocated
     * amount. <p>For example, if you run a single-container task on a
     * single-core instance type with 512 CPU units specified for that
     * container, and that is the only task running on the container
     * instance, that container could use the full 1,024 CPU unit share at
     * any given time. However, if you launched another copy of the same task
     * on that container instance, each task would be guaranteed a minimum of
     * 512 CPU units when needed, and each container could float to higher
     * CPU usage if the other container was not using it, but if both tasks
     * were 100% active all of the time, they would be limited to 512 CPU
     * units. <p>The Docker daemon on the container instance uses the CPU
     * value to calculate the relative CPU share ratios for running
     * containers. For more information, see <a
     * href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     * share constraint</a> in the Docker documentation. The minimum valid
     * CPU share value that the Linux kernel will allow is 2; however, the
     * CPU parameter is not required, and you can use CPU values below 2 in
     * your container definitions. For CPU values below 2 (including null),
     * the behavior varies based on your Amazon ECS container agent version:
     * <ul> <li><b>Agent versions less than or equal to 1.1.0:</b> Null and
     * zero CPU values are passed to Docker as 0, which Docker then converts
     * to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which
     * the Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     * greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     * are passed to Docker as 2.</li></ul>
     */
    private Integer cpu;

    /**
     * The number of MiB of memory reserved for the container. If your
     * container attempts to exceed the memory allocated here, the container
     * is killed.
     */
    private Integer memory;

    /**
     * The <code>link</code> parameter allows containers to communicate with
     * each other without the need for port mappings, using the
     * <code>name</code> parameter. The <code>name:internalName</code>
     * construct is analogous to <code>name:alias</code> in Docker links. For
     * more information on linking Docker containers, see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     * <important> <p>Containers that are collocated on a single container
     * instance may be able to communicate with each other without requiring
     * links or host port mappings. Network isolation is achieved on the
     * container instance using security groups and VPC settings.
     * </important>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> links;

    /**
     * The list of port mappings for the container.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping> portMappings;

    /**
     * If the <code>essential</code> parameter of a container is marked as
     * <code>true</code>, the failure of that container will stop the task.
     * If the <code>essential</code> parameter of a container is marked as
     * <code>false</code>, then its failure will not affect the rest of the
     * containers in a task. If this parameter is omitted, a container is
     * assumed to be essential. <note> <p>All tasks must have at least one
     * essential container. </note>
     */
    private Boolean essential;

    /**
     * <important> <p>Early versions of the Amazon ECS container agent do not
     * properly handle <code>entryPoint</code> parameters. If you have
     * problems using <code>entryPoint</code>, update your container agent or
     * enter your commands and arguments as <code>command</code> array items
     * instead. </important> <p>The <code>ENTRYPOINT</code> that is passed to
     * the container. For more information on the Docker
     * <code>ENTRYPOINT</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> entryPoint;

    /**
     * The <code>CMD</code> that is passed to the container. For more
     * information on the Docker <code>CMD</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> command;

    /**
     * The environment variables to pass to a container.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair> environment;

    /**
     * The mount points for data volumes in your container.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint> mountPoints;

    /**
     * Data volumes to mount from another container.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom> volumesFrom;

    /**
     * The name of a container. If you are linking multiple containers
     * together in a task definition, the <code>name</code> of one container
     * can be entered in the <code>links</code> of another container to
     * connect the containers.
     *
     * @return The name of a container. If you are linking multiple containers
     *         together in a task definition, the <code>name</code> of one container
     *         can be entered in the <code>links</code> of another container to
     *         connect the containers.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of a container. If you are linking multiple containers
     * together in a task definition, the <code>name</code> of one container
     * can be entered in the <code>links</code> of another container to
     * connect the containers.
     *
     * @param name The name of a container. If you are linking multiple containers
     *         together in a task definition, the <code>name</code> of one container
     *         can be entered in the <code>links</code> of another container to
     *         connect the containers.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of a container. If you are linking multiple containers
     * together in a task definition, the <code>name</code> of one container
     * can be entered in the <code>links</code> of another container to
     * connect the containers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of a container. If you are linking multiple containers
     *         together in a task definition, the <code>name</code> of one container
     *         can be entered in the <code>links</code> of another container to
     *         connect the containers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The image used to start a container. This string is passed directly to
     * the Docker daemon. Images in the Docker Hub registry are available by
     * default. Other repositories are specified with
     * <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>.
     *
     * @return The image used to start a container. This string is passed directly to
     *         the Docker daemon. Images in the Docker Hub registry are available by
     *         default. Other repositories are specified with
     *         <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>.
     */
    public String getImage() {
        return image;
    }
    
    /**
     * The image used to start a container. This string is passed directly to
     * the Docker daemon. Images in the Docker Hub registry are available by
     * default. Other repositories are specified with
     * <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>.
     *
     * @param image The image used to start a container. This string is passed directly to
     *         the Docker daemon. Images in the Docker Hub registry are available by
     *         default. Other repositories are specified with
     *         <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>.
     */
    public void setImage(String image) {
        this.image = image;
    }
    
    /**
     * The image used to start a container. This string is passed directly to
     * the Docker daemon. Images in the Docker Hub registry are available by
     * default. Other repositories are specified with
     * <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param image The image used to start a container. This string is passed directly to
     *         the Docker daemon. Images in the Docker Hub registry are available by
     *         default. Other repositories are specified with
     *         <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * The number of <code>cpu</code> units reserved for the container. A
     * container instance has 1,024 <code>cpu</code> units for every CPU
     * core. This parameter specifies the minimum amount of CPU to reserve
     * for a container, and containers share unallocated CPU units with other
     * containers on the instance with the same ratio as their allocated
     * amount. <p>For example, if you run a single-container task on a
     * single-core instance type with 512 CPU units specified for that
     * container, and that is the only task running on the container
     * instance, that container could use the full 1,024 CPU unit share at
     * any given time. However, if you launched another copy of the same task
     * on that container instance, each task would be guaranteed a minimum of
     * 512 CPU units when needed, and each container could float to higher
     * CPU usage if the other container was not using it, but if both tasks
     * were 100% active all of the time, they would be limited to 512 CPU
     * units. <p>The Docker daemon on the container instance uses the CPU
     * value to calculate the relative CPU share ratios for running
     * containers. For more information, see <a
     * href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     * share constraint</a> in the Docker documentation. The minimum valid
     * CPU share value that the Linux kernel will allow is 2; however, the
     * CPU parameter is not required, and you can use CPU values below 2 in
     * your container definitions. For CPU values below 2 (including null),
     * the behavior varies based on your Amazon ECS container agent version:
     * <ul> <li><b>Agent versions less than or equal to 1.1.0:</b> Null and
     * zero CPU values are passed to Docker as 0, which Docker then converts
     * to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which
     * the Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     * greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     * are passed to Docker as 2.</li></ul>
     *
     * @return The number of <code>cpu</code> units reserved for the container. A
     *         container instance has 1,024 <code>cpu</code> units for every CPU
     *         core. This parameter specifies the minimum amount of CPU to reserve
     *         for a container, and containers share unallocated CPU units with other
     *         containers on the instance with the same ratio as their allocated
     *         amount. <p>For example, if you run a single-container task on a
     *         single-core instance type with 512 CPU units specified for that
     *         container, and that is the only task running on the container
     *         instance, that container could use the full 1,024 CPU unit share at
     *         any given time. However, if you launched another copy of the same task
     *         on that container instance, each task would be guaranteed a minimum of
     *         512 CPU units when needed, and each container could float to higher
     *         CPU usage if the other container was not using it, but if both tasks
     *         were 100% active all of the time, they would be limited to 512 CPU
     *         units. <p>The Docker daemon on the container instance uses the CPU
     *         value to calculate the relative CPU share ratios for running
     *         containers. For more information, see <a
     *         href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     *         share constraint</a> in the Docker documentation. The minimum valid
     *         CPU share value that the Linux kernel will allow is 2; however, the
     *         CPU parameter is not required, and you can use CPU values below 2 in
     *         your container definitions. For CPU values below 2 (including null),
     *         the behavior varies based on your Amazon ECS container agent version:
     *         <ul> <li><b>Agent versions less than or equal to 1.1.0:</b> Null and
     *         zero CPU values are passed to Docker as 0, which Docker then converts
     *         to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which
     *         the Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     *         greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     *         are passed to Docker as 2.</li></ul>
     */
    public Integer getCpu() {
        return cpu;
    }
    
    /**
     * The number of <code>cpu</code> units reserved for the container. A
     * container instance has 1,024 <code>cpu</code> units for every CPU
     * core. This parameter specifies the minimum amount of CPU to reserve
     * for a container, and containers share unallocated CPU units with other
     * containers on the instance with the same ratio as their allocated
     * amount. <p>For example, if you run a single-container task on a
     * single-core instance type with 512 CPU units specified for that
     * container, and that is the only task running on the container
     * instance, that container could use the full 1,024 CPU unit share at
     * any given time. However, if you launched another copy of the same task
     * on that container instance, each task would be guaranteed a minimum of
     * 512 CPU units when needed, and each container could float to higher
     * CPU usage if the other container was not using it, but if both tasks
     * were 100% active all of the time, they would be limited to 512 CPU
     * units. <p>The Docker daemon on the container instance uses the CPU
     * value to calculate the relative CPU share ratios for running
     * containers. For more information, see <a
     * href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     * share constraint</a> in the Docker documentation. The minimum valid
     * CPU share value that the Linux kernel will allow is 2; however, the
     * CPU parameter is not required, and you can use CPU values below 2 in
     * your container definitions. For CPU values below 2 (including null),
     * the behavior varies based on your Amazon ECS container agent version:
     * <ul> <li><b>Agent versions less than or equal to 1.1.0:</b> Null and
     * zero CPU values are passed to Docker as 0, which Docker then converts
     * to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which
     * the Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     * greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     * are passed to Docker as 2.</li></ul>
     *
     * @param cpu The number of <code>cpu</code> units reserved for the container. A
     *         container instance has 1,024 <code>cpu</code> units for every CPU
     *         core. This parameter specifies the minimum amount of CPU to reserve
     *         for a container, and containers share unallocated CPU units with other
     *         containers on the instance with the same ratio as their allocated
     *         amount. <p>For example, if you run a single-container task on a
     *         single-core instance type with 512 CPU units specified for that
     *         container, and that is the only task running on the container
     *         instance, that container could use the full 1,024 CPU unit share at
     *         any given time. However, if you launched another copy of the same task
     *         on that container instance, each task would be guaranteed a minimum of
     *         512 CPU units when needed, and each container could float to higher
     *         CPU usage if the other container was not using it, but if both tasks
     *         were 100% active all of the time, they would be limited to 512 CPU
     *         units. <p>The Docker daemon on the container instance uses the CPU
     *         value to calculate the relative CPU share ratios for running
     *         containers. For more information, see <a
     *         href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     *         share constraint</a> in the Docker documentation. The minimum valid
     *         CPU share value that the Linux kernel will allow is 2; however, the
     *         CPU parameter is not required, and you can use CPU values below 2 in
     *         your container definitions. For CPU values below 2 (including null),
     *         the behavior varies based on your Amazon ECS container agent version:
     *         <ul> <li><b>Agent versions less than or equal to 1.1.0:</b> Null and
     *         zero CPU values are passed to Docker as 0, which Docker then converts
     *         to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which
     *         the Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     *         greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     *         are passed to Docker as 2.</li></ul>
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }
    
    /**
     * The number of <code>cpu</code> units reserved for the container. A
     * container instance has 1,024 <code>cpu</code> units for every CPU
     * core. This parameter specifies the minimum amount of CPU to reserve
     * for a container, and containers share unallocated CPU units with other
     * containers on the instance with the same ratio as their allocated
     * amount. <p>For example, if you run a single-container task on a
     * single-core instance type with 512 CPU units specified for that
     * container, and that is the only task running on the container
     * instance, that container could use the full 1,024 CPU unit share at
     * any given time. However, if you launched another copy of the same task
     * on that container instance, each task would be guaranteed a minimum of
     * 512 CPU units when needed, and each container could float to higher
     * CPU usage if the other container was not using it, but if both tasks
     * were 100% active all of the time, they would be limited to 512 CPU
     * units. <p>The Docker daemon on the container instance uses the CPU
     * value to calculate the relative CPU share ratios for running
     * containers. For more information, see <a
     * href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     * share constraint</a> in the Docker documentation. The minimum valid
     * CPU share value that the Linux kernel will allow is 2; however, the
     * CPU parameter is not required, and you can use CPU values below 2 in
     * your container definitions. For CPU values below 2 (including null),
     * the behavior varies based on your Amazon ECS container agent version:
     * <ul> <li><b>Agent versions less than or equal to 1.1.0:</b> Null and
     * zero CPU values are passed to Docker as 0, which Docker then converts
     * to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which
     * the Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     * greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     * are passed to Docker as 2.</li></ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cpu The number of <code>cpu</code> units reserved for the container. A
     *         container instance has 1,024 <code>cpu</code> units for every CPU
     *         core. This parameter specifies the minimum amount of CPU to reserve
     *         for a container, and containers share unallocated CPU units with other
     *         containers on the instance with the same ratio as their allocated
     *         amount. <p>For example, if you run a single-container task on a
     *         single-core instance type with 512 CPU units specified for that
     *         container, and that is the only task running on the container
     *         instance, that container could use the full 1,024 CPU unit share at
     *         any given time. However, if you launched another copy of the same task
     *         on that container instance, each task would be guaranteed a minimum of
     *         512 CPU units when needed, and each container could float to higher
     *         CPU usage if the other container was not using it, but if both tasks
     *         were 100% active all of the time, they would be limited to 512 CPU
     *         units. <p>The Docker daemon on the container instance uses the CPU
     *         value to calculate the relative CPU share ratios for running
     *         containers. For more information, see <a
     *         href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     *         share constraint</a> in the Docker documentation. The minimum valid
     *         CPU share value that the Linux kernel will allow is 2; however, the
     *         CPU parameter is not required, and you can use CPU values below 2 in
     *         your container definitions. For CPU values below 2 (including null),
     *         the behavior varies based on your Amazon ECS container agent version:
     *         <ul> <li><b>Agent versions less than or equal to 1.1.0:</b> Null and
     *         zero CPU values are passed to Docker as 0, which Docker then converts
     *         to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which
     *         the Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     *         greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     *         are passed to Docker as 2.</li></ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * The number of MiB of memory reserved for the container. If your
     * container attempts to exceed the memory allocated here, the container
     * is killed.
     *
     * @return The number of MiB of memory reserved for the container. If your
     *         container attempts to exceed the memory allocated here, the container
     *         is killed.
     */
    public Integer getMemory() {
        return memory;
    }
    
    /**
     * The number of MiB of memory reserved for the container. If your
     * container attempts to exceed the memory allocated here, the container
     * is killed.
     *
     * @param memory The number of MiB of memory reserved for the container. If your
     *         container attempts to exceed the memory allocated here, the container
     *         is killed.
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }
    
    /**
     * The number of MiB of memory reserved for the container. If your
     * container attempts to exceed the memory allocated here, the container
     * is killed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param memory The number of MiB of memory reserved for the container. If your
     *         container attempts to exceed the memory allocated here, the container
     *         is killed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * The <code>link</code> parameter allows containers to communicate with
     * each other without the need for port mappings, using the
     * <code>name</code> parameter. The <code>name:internalName</code>
     * construct is analogous to <code>name:alias</code> in Docker links. For
     * more information on linking Docker containers, see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     * <important> <p>Containers that are collocated on a single container
     * instance may be able to communicate with each other without requiring
     * links or host port mappings. Network isolation is achieved on the
     * container instance using security groups and VPC settings.
     * </important>
     *
     * @return The <code>link</code> parameter allows containers to communicate with
     *         each other without the need for port mappings, using the
     *         <code>name</code> parameter. The <code>name:internalName</code>
     *         construct is analogous to <code>name:alias</code> in Docker links. For
     *         more information on linking Docker containers, see <a
     *         href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     *         <important> <p>Containers that are collocated on a single container
     *         instance may be able to communicate with each other without requiring
     *         links or host port mappings. Network isolation is achieved on the
     *         container instance using security groups and VPC settings.
     *         </important>
     */
    public java.util.List<String> getLinks() {
        if (links == null) {
              links = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              links.setAutoConstruct(true);
        }
        return links;
    }
    
    /**
     * The <code>link</code> parameter allows containers to communicate with
     * each other without the need for port mappings, using the
     * <code>name</code> parameter. The <code>name:internalName</code>
     * construct is analogous to <code>name:alias</code> in Docker links. For
     * more information on linking Docker containers, see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     * <important> <p>Containers that are collocated on a single container
     * instance may be able to communicate with each other without requiring
     * links or host port mappings. Network isolation is achieved on the
     * container instance using security groups and VPC settings.
     * </important>
     *
     * @param links The <code>link</code> parameter allows containers to communicate with
     *         each other without the need for port mappings, using the
     *         <code>name</code> parameter. The <code>name:internalName</code>
     *         construct is analogous to <code>name:alias</code> in Docker links. For
     *         more information on linking Docker containers, see <a
     *         href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     *         <important> <p>Containers that are collocated on a single container
     *         instance may be able to communicate with each other without requiring
     *         links or host port mappings. Network isolation is achieved on the
     *         container instance using security groups and VPC settings.
     *         </important>
     */
    public void setLinks(java.util.Collection<String> links) {
        if (links == null) {
            this.links = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> linksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(links.size());
        linksCopy.addAll(links);
        this.links = linksCopy;
    }
    
    /**
     * The <code>link</code> parameter allows containers to communicate with
     * each other without the need for port mappings, using the
     * <code>name</code> parameter. The <code>name:internalName</code>
     * construct is analogous to <code>name:alias</code> in Docker links. For
     * more information on linking Docker containers, see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     * <important> <p>Containers that are collocated on a single container
     * instance may be able to communicate with each other without requiring
     * links or host port mappings. Network isolation is achieved on the
     * container instance using security groups and VPC settings.
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLinks(java.util.Collection)} or {@link
     * #withLinks(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param links The <code>link</code> parameter allows containers to communicate with
     *         each other without the need for port mappings, using the
     *         <code>name</code> parameter. The <code>name:internalName</code>
     *         construct is analogous to <code>name:alias</code> in Docker links. For
     *         more information on linking Docker containers, see <a
     *         href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     *         <important> <p>Containers that are collocated on a single container
     *         instance may be able to communicate with each other without requiring
     *         links or host port mappings. Network isolation is achieved on the
     *         container instance using security groups and VPC settings.
     *         </important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withLinks(String... links) {
        if (getLinks() == null) setLinks(new java.util.ArrayList<String>(links.length));
        for (String value : links) {
            getLinks().add(value);
        }
        return this;
    }
    
    /**
     * The <code>link</code> parameter allows containers to communicate with
     * each other without the need for port mappings, using the
     * <code>name</code> parameter. The <code>name:internalName</code>
     * construct is analogous to <code>name:alias</code> in Docker links. For
     * more information on linking Docker containers, see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     * <important> <p>Containers that are collocated on a single container
     * instance may be able to communicate with each other without requiring
     * links or host port mappings. Network isolation is achieved on the
     * container instance using security groups and VPC settings.
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param links The <code>link</code> parameter allows containers to communicate with
     *         each other without the need for port mappings, using the
     *         <code>name</code> parameter. The <code>name:internalName</code>
     *         construct is analogous to <code>name:alias</code> in Docker links. For
     *         more information on linking Docker containers, see <a
     *         href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     *         <important> <p>Containers that are collocated on a single container
     *         instance may be able to communicate with each other without requiring
     *         links or host port mappings. Network isolation is achieved on the
     *         container instance using security groups and VPC settings.
     *         </important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withLinks(java.util.Collection<String> links) {
        if (links == null) {
            this.links = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> linksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(links.size());
            linksCopy.addAll(links);
            this.links = linksCopy;
        }

        return this;
    }

    /**
     * The list of port mappings for the container.
     *
     * @return The list of port mappings for the container.
     */
    public java.util.List<PortMapping> getPortMappings() {
        if (portMappings == null) {
              portMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping>();
              portMappings.setAutoConstruct(true);
        }
        return portMappings;
    }
    
    /**
     * The list of port mappings for the container.
     *
     * @param portMappings The list of port mappings for the container.
     */
    public void setPortMappings(java.util.Collection<PortMapping> portMappings) {
        if (portMappings == null) {
            this.portMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping> portMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping>(portMappings.size());
        portMappingsCopy.addAll(portMappings);
        this.portMappings = portMappingsCopy;
    }
    
    /**
     * The list of port mappings for the container.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPortMappings(java.util.Collection)} or {@link
     * #withPortMappings(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param portMappings The list of port mappings for the container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withPortMappings(PortMapping... portMappings) {
        if (getPortMappings() == null) setPortMappings(new java.util.ArrayList<PortMapping>(portMappings.length));
        for (PortMapping value : portMappings) {
            getPortMappings().add(value);
        }
        return this;
    }
    
    /**
     * The list of port mappings for the container.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param portMappings The list of port mappings for the container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withPortMappings(java.util.Collection<PortMapping> portMappings) {
        if (portMappings == null) {
            this.portMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping> portMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping>(portMappings.size());
            portMappingsCopy.addAll(portMappings);
            this.portMappings = portMappingsCopy;
        }

        return this;
    }

    /**
     * If the <code>essential</code> parameter of a container is marked as
     * <code>true</code>, the failure of that container will stop the task.
     * If the <code>essential</code> parameter of a container is marked as
     * <code>false</code>, then its failure will not affect the rest of the
     * containers in a task. If this parameter is omitted, a container is
     * assumed to be essential. <note> <p>All tasks must have at least one
     * essential container. </note>
     *
     * @return If the <code>essential</code> parameter of a container is marked as
     *         <code>true</code>, the failure of that container will stop the task.
     *         If the <code>essential</code> parameter of a container is marked as
     *         <code>false</code>, then its failure will not affect the rest of the
     *         containers in a task. If this parameter is omitted, a container is
     *         assumed to be essential. <note> <p>All tasks must have at least one
     *         essential container. </note>
     */
    public Boolean isEssential() {
        return essential;
    }
    
    /**
     * If the <code>essential</code> parameter of a container is marked as
     * <code>true</code>, the failure of that container will stop the task.
     * If the <code>essential</code> parameter of a container is marked as
     * <code>false</code>, then its failure will not affect the rest of the
     * containers in a task. If this parameter is omitted, a container is
     * assumed to be essential. <note> <p>All tasks must have at least one
     * essential container. </note>
     *
     * @param essential If the <code>essential</code> parameter of a container is marked as
     *         <code>true</code>, the failure of that container will stop the task.
     *         If the <code>essential</code> parameter of a container is marked as
     *         <code>false</code>, then its failure will not affect the rest of the
     *         containers in a task. If this parameter is omitted, a container is
     *         assumed to be essential. <note> <p>All tasks must have at least one
     *         essential container. </note>
     */
    public void setEssential(Boolean essential) {
        this.essential = essential;
    }
    
    /**
     * If the <code>essential</code> parameter of a container is marked as
     * <code>true</code>, the failure of that container will stop the task.
     * If the <code>essential</code> parameter of a container is marked as
     * <code>false</code>, then its failure will not affect the rest of the
     * containers in a task. If this parameter is omitted, a container is
     * assumed to be essential. <note> <p>All tasks must have at least one
     * essential container. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param essential If the <code>essential</code> parameter of a container is marked as
     *         <code>true</code>, the failure of that container will stop the task.
     *         If the <code>essential</code> parameter of a container is marked as
     *         <code>false</code>, then its failure will not affect the rest of the
     *         containers in a task. If this parameter is omitted, a container is
     *         assumed to be essential. <note> <p>All tasks must have at least one
     *         essential container. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withEssential(Boolean essential) {
        this.essential = essential;
        return this;
    }

    /**
     * If the <code>essential</code> parameter of a container is marked as
     * <code>true</code>, the failure of that container will stop the task.
     * If the <code>essential</code> parameter of a container is marked as
     * <code>false</code>, then its failure will not affect the rest of the
     * containers in a task. If this parameter is omitted, a container is
     * assumed to be essential. <note> <p>All tasks must have at least one
     * essential container. </note>
     *
     * @return If the <code>essential</code> parameter of a container is marked as
     *         <code>true</code>, the failure of that container will stop the task.
     *         If the <code>essential</code> parameter of a container is marked as
     *         <code>false</code>, then its failure will not affect the rest of the
     *         containers in a task. If this parameter is omitted, a container is
     *         assumed to be essential. <note> <p>All tasks must have at least one
     *         essential container. </note>
     */
    public Boolean getEssential() {
        return essential;
    }

    /**
     * <important> <p>Early versions of the Amazon ECS container agent do not
     * properly handle <code>entryPoint</code> parameters. If you have
     * problems using <code>entryPoint</code>, update your container agent or
     * enter your commands and arguments as <code>command</code> array items
     * instead. </important> <p>The <code>ENTRYPOINT</code> that is passed to
     * the container. For more information on the Docker
     * <code>ENTRYPOINT</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     *
     * @return <important> <p>Early versions of the Amazon ECS container agent do not
     *         properly handle <code>entryPoint</code> parameters. If you have
     *         problems using <code>entryPoint</code>, update your container agent or
     *         enter your commands and arguments as <code>command</code> array items
     *         instead. </important> <p>The <code>ENTRYPOINT</code> that is passed to
     *         the container. For more information on the Docker
     *         <code>ENTRYPOINT</code> parameter, see <a
     *         href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     */
    public java.util.List<String> getEntryPoint() {
        if (entryPoint == null) {
              entryPoint = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              entryPoint.setAutoConstruct(true);
        }
        return entryPoint;
    }
    
    /**
     * <important> <p>Early versions of the Amazon ECS container agent do not
     * properly handle <code>entryPoint</code> parameters. If you have
     * problems using <code>entryPoint</code>, update your container agent or
     * enter your commands and arguments as <code>command</code> array items
     * instead. </important> <p>The <code>ENTRYPOINT</code> that is passed to
     * the container. For more information on the Docker
     * <code>ENTRYPOINT</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     *
     * @param entryPoint <important> <p>Early versions of the Amazon ECS container agent do not
     *         properly handle <code>entryPoint</code> parameters. If you have
     *         problems using <code>entryPoint</code>, update your container agent or
     *         enter your commands and arguments as <code>command</code> array items
     *         instead. </important> <p>The <code>ENTRYPOINT</code> that is passed to
     *         the container. For more information on the Docker
     *         <code>ENTRYPOINT</code> parameter, see <a
     *         href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     */
    public void setEntryPoint(java.util.Collection<String> entryPoint) {
        if (entryPoint == null) {
            this.entryPoint = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> entryPointCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(entryPoint.size());
        entryPointCopy.addAll(entryPoint);
        this.entryPoint = entryPointCopy;
    }
    
    /**
     * <important> <p>Early versions of the Amazon ECS container agent do not
     * properly handle <code>entryPoint</code> parameters. If you have
     * problems using <code>entryPoint</code>, update your container agent or
     * enter your commands and arguments as <code>command</code> array items
     * instead. </important> <p>The <code>ENTRYPOINT</code> that is passed to
     * the container. For more information on the Docker
     * <code>ENTRYPOINT</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEntryPoint(java.util.Collection)} or {@link
     * #withEntryPoint(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entryPoint <important> <p>Early versions of the Amazon ECS container agent do not
     *         properly handle <code>entryPoint</code> parameters. If you have
     *         problems using <code>entryPoint</code>, update your container agent or
     *         enter your commands and arguments as <code>command</code> array items
     *         instead. </important> <p>The <code>ENTRYPOINT</code> that is passed to
     *         the container. For more information on the Docker
     *         <code>ENTRYPOINT</code> parameter, see <a
     *         href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withEntryPoint(String... entryPoint) {
        if (getEntryPoint() == null) setEntryPoint(new java.util.ArrayList<String>(entryPoint.length));
        for (String value : entryPoint) {
            getEntryPoint().add(value);
        }
        return this;
    }
    
    /**
     * <important> <p>Early versions of the Amazon ECS container agent do not
     * properly handle <code>entryPoint</code> parameters. If you have
     * problems using <code>entryPoint</code>, update your container agent or
     * enter your commands and arguments as <code>command</code> array items
     * instead. </important> <p>The <code>ENTRYPOINT</code> that is passed to
     * the container. For more information on the Docker
     * <code>ENTRYPOINT</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entryPoint <important> <p>Early versions of the Amazon ECS container agent do not
     *         properly handle <code>entryPoint</code> parameters. If you have
     *         problems using <code>entryPoint</code>, update your container agent or
     *         enter your commands and arguments as <code>command</code> array items
     *         instead. </important> <p>The <code>ENTRYPOINT</code> that is passed to
     *         the container. For more information on the Docker
     *         <code>ENTRYPOINT</code> parameter, see <a
     *         href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withEntryPoint(java.util.Collection<String> entryPoint) {
        if (entryPoint == null) {
            this.entryPoint = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> entryPointCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(entryPoint.size());
            entryPointCopy.addAll(entryPoint);
            this.entryPoint = entryPointCopy;
        }

        return this;
    }

    /**
     * The <code>CMD</code> that is passed to the container. For more
     * information on the Docker <code>CMD</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     *
     * @return The <code>CMD</code> that is passed to the container. For more
     *         information on the Docker <code>CMD</code> parameter, see <a
     *         href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     */
    public java.util.List<String> getCommand() {
        if (command == null) {
              command = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              command.setAutoConstruct(true);
        }
        return command;
    }
    
    /**
     * The <code>CMD</code> that is passed to the container. For more
     * information on the Docker <code>CMD</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     *
     * @param command The <code>CMD</code> that is passed to the container. For more
     *         information on the Docker <code>CMD</code> parameter, see <a
     *         href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     */
    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> commandCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(command.size());
        commandCopy.addAll(command);
        this.command = commandCopy;
    }
    
    /**
     * The <code>CMD</code> that is passed to the container. For more
     * information on the Docker <code>CMD</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCommand(java.util.Collection)} or {@link
     * #withCommand(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param command The <code>CMD</code> that is passed to the container. For more
     *         information on the Docker <code>CMD</code> parameter, see <a
     *         href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withCommand(String... command) {
        if (getCommand() == null) setCommand(new java.util.ArrayList<String>(command.length));
        for (String value : command) {
            getCommand().add(value);
        }
        return this;
    }
    
    /**
     * The <code>CMD</code> that is passed to the container. For more
     * information on the Docker <code>CMD</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param command The <code>CMD</code> that is passed to the container. For more
     *         information on the Docker <code>CMD</code> parameter, see <a
     *         href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> commandCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(command.size());
            commandCopy.addAll(command);
            this.command = commandCopy;
        }

        return this;
    }

    /**
     * The environment variables to pass to a container.
     *
     * @return The environment variables to pass to a container.
     */
    public java.util.List<KeyValuePair> getEnvironment() {
        if (environment == null) {
              environment = new com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair>();
              environment.setAutoConstruct(true);
        }
        return environment;
    }
    
    /**
     * The environment variables to pass to a container.
     *
     * @param environment The environment variables to pass to a container.
     */
    public void setEnvironment(java.util.Collection<KeyValuePair> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair> environmentCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair>(environment.size());
        environmentCopy.addAll(environment);
        this.environment = environmentCopy;
    }
    
    /**
     * The environment variables to pass to a container.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEnvironment(java.util.Collection)} or {@link
     * #withEnvironment(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environment The environment variables to pass to a container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withEnvironment(KeyValuePair... environment) {
        if (getEnvironment() == null) setEnvironment(new java.util.ArrayList<KeyValuePair>(environment.length));
        for (KeyValuePair value : environment) {
            getEnvironment().add(value);
        }
        return this;
    }
    
    /**
     * The environment variables to pass to a container.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environment The environment variables to pass to a container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withEnvironment(java.util.Collection<KeyValuePair> environment) {
        if (environment == null) {
            this.environment = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair> environmentCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair>(environment.size());
            environmentCopy.addAll(environment);
            this.environment = environmentCopy;
        }

        return this;
    }

    /**
     * The mount points for data volumes in your container.
     *
     * @return The mount points for data volumes in your container.
     */
    public java.util.List<MountPoint> getMountPoints() {
        if (mountPoints == null) {
              mountPoints = new com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint>();
              mountPoints.setAutoConstruct(true);
        }
        return mountPoints;
    }
    
    /**
     * The mount points for data volumes in your container.
     *
     * @param mountPoints The mount points for data volumes in your container.
     */
    public void setMountPoints(java.util.Collection<MountPoint> mountPoints) {
        if (mountPoints == null) {
            this.mountPoints = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint> mountPointsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint>(mountPoints.size());
        mountPointsCopy.addAll(mountPoints);
        this.mountPoints = mountPointsCopy;
    }
    
    /**
     * The mount points for data volumes in your container.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMountPoints(java.util.Collection)} or {@link
     * #withMountPoints(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mountPoints The mount points for data volumes in your container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withMountPoints(MountPoint... mountPoints) {
        if (getMountPoints() == null) setMountPoints(new java.util.ArrayList<MountPoint>(mountPoints.length));
        for (MountPoint value : mountPoints) {
            getMountPoints().add(value);
        }
        return this;
    }
    
    /**
     * The mount points for data volumes in your container.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mountPoints The mount points for data volumes in your container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withMountPoints(java.util.Collection<MountPoint> mountPoints) {
        if (mountPoints == null) {
            this.mountPoints = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint> mountPointsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint>(mountPoints.size());
            mountPointsCopy.addAll(mountPoints);
            this.mountPoints = mountPointsCopy;
        }

        return this;
    }

    /**
     * Data volumes to mount from another container.
     *
     * @return Data volumes to mount from another container.
     */
    public java.util.List<VolumeFrom> getVolumesFrom() {
        if (volumesFrom == null) {
              volumesFrom = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom>();
              volumesFrom.setAutoConstruct(true);
        }
        return volumesFrom;
    }
    
    /**
     * Data volumes to mount from another container.
     *
     * @param volumesFrom Data volumes to mount from another container.
     */
    public void setVolumesFrom(java.util.Collection<VolumeFrom> volumesFrom) {
        if (volumesFrom == null) {
            this.volumesFrom = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom> volumesFromCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom>(volumesFrom.size());
        volumesFromCopy.addAll(volumesFrom);
        this.volumesFrom = volumesFromCopy;
    }
    
    /**
     * Data volumes to mount from another container.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVolumesFrom(java.util.Collection)} or {@link
     * #withVolumesFrom(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumesFrom Data volumes to mount from another container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withVolumesFrom(VolumeFrom... volumesFrom) {
        if (getVolumesFrom() == null) setVolumesFrom(new java.util.ArrayList<VolumeFrom>(volumesFrom.length));
        for (VolumeFrom value : volumesFrom) {
            getVolumesFrom().add(value);
        }
        return this;
    }
    
    /**
     * Data volumes to mount from another container.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumesFrom Data volumes to mount from another container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withVolumesFrom(java.util.Collection<VolumeFrom> volumesFrom) {
        if (volumesFrom == null) {
            this.volumesFrom = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom> volumesFromCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom>(volumesFrom.size());
            volumesFromCopy.addAll(volumesFrom);
            this.volumesFrom = volumesFromCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getImage() != null) sb.append("Image: " + getImage() + ",");
        if (getCpu() != null) sb.append("Cpu: " + getCpu() + ",");
        if (getMemory() != null) sb.append("Memory: " + getMemory() + ",");
        if (getLinks() != null) sb.append("Links: " + getLinks() + ",");
        if (getPortMappings() != null) sb.append("PortMappings: " + getPortMappings() + ",");
        if (isEssential() != null) sb.append("Essential: " + isEssential() + ",");
        if (getEntryPoint() != null) sb.append("EntryPoint: " + getEntryPoint() + ",");
        if (getCommand() != null) sb.append("Command: " + getCommand() + ",");
        if (getEnvironment() != null) sb.append("Environment: " + getEnvironment() + ",");
        if (getMountPoints() != null) sb.append("MountPoints: " + getMountPoints() + ",");
        if (getVolumesFrom() != null) sb.append("VolumesFrom: " + getVolumesFrom() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode()); 
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode()); 
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode()); 
        hashCode = prime * hashCode + ((getLinks() == null) ? 0 : getLinks().hashCode()); 
        hashCode = prime * hashCode + ((getPortMappings() == null) ? 0 : getPortMappings().hashCode()); 
        hashCode = prime * hashCode + ((isEssential() == null) ? 0 : isEssential().hashCode()); 
        hashCode = prime * hashCode + ((getEntryPoint() == null) ? 0 : getEntryPoint().hashCode()); 
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode()); 
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode()); 
        hashCode = prime * hashCode + ((getMountPoints() == null) ? 0 : getMountPoints().hashCode()); 
        hashCode = prime * hashCode + ((getVolumesFrom() == null) ? 0 : getVolumesFrom().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ContainerDefinition == false) return false;
        ContainerDefinition other = (ContainerDefinition)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getImage() == null ^ this.getImage() == null) return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false) return false; 
        if (other.getCpu() == null ^ this.getCpu() == null) return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false) return false; 
        if (other.getMemory() == null ^ this.getMemory() == null) return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false) return false; 
        if (other.getLinks() == null ^ this.getLinks() == null) return false;
        if (other.getLinks() != null && other.getLinks().equals(this.getLinks()) == false) return false; 
        if (other.getPortMappings() == null ^ this.getPortMappings() == null) return false;
        if (other.getPortMappings() != null && other.getPortMappings().equals(this.getPortMappings()) == false) return false; 
        if (other.isEssential() == null ^ this.isEssential() == null) return false;
        if (other.isEssential() != null && other.isEssential().equals(this.isEssential()) == false) return false; 
        if (other.getEntryPoint() == null ^ this.getEntryPoint() == null) return false;
        if (other.getEntryPoint() != null && other.getEntryPoint().equals(this.getEntryPoint()) == false) return false; 
        if (other.getCommand() == null ^ this.getCommand() == null) return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false) return false; 
        if (other.getEnvironment() == null ^ this.getEnvironment() == null) return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false) return false; 
        if (other.getMountPoints() == null ^ this.getMountPoints() == null) return false;
        if (other.getMountPoints() != null && other.getMountPoints().equals(this.getMountPoints()) == false) return false; 
        if (other.getVolumesFrom() == null ^ this.getVolumesFrom() == null) return false;
        if (other.getVolumesFrom() != null && other.getVolumesFrom().equals(this.getVolumesFrom()) == false) return false; 
        return true;
    }
    
    @Override
    public ContainerDefinition clone() {
        try {
            return (ContainerDefinition) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    