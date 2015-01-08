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
public class ContainerDefinition implements Serializable {

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
     * core.
     */
    private Integer cpu;

    /**
     * The number of MiB of memory reserved for the container. Docker will
     * allocate a minimum of 4 MiB of memory to a container.
     */
    private Integer memory;

    /**
     * The <code>link</code> parameter allows containers to communicate with
     * each other without the need for port mappings, using the
     * <code>name</code> parameter. For more information on linking Docker
     * containers, see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
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
     * containers in a task.
     */
    private Boolean essential;

    /**
     * The <code>ENTRYPOINT</code> that is passed to the container. For more
     * information on the Docker <code>ENTRYPOINT</code> parameter, see <a
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
     * core.
     *
     * @return The number of <code>cpu</code> units reserved for the container. A
     *         container instance has 1,024 <code>cpu</code> units for every CPU
     *         core.
     */
    public Integer getCpu() {
        return cpu;
    }
    
    /**
     * The number of <code>cpu</code> units reserved for the container. A
     * container instance has 1,024 <code>cpu</code> units for every CPU
     * core.
     *
     * @param cpu The number of <code>cpu</code> units reserved for the container. A
     *         container instance has 1,024 <code>cpu</code> units for every CPU
     *         core.
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }
    
    /**
     * The number of <code>cpu</code> units reserved for the container. A
     * container instance has 1,024 <code>cpu</code> units for every CPU
     * core.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cpu The number of <code>cpu</code> units reserved for the container. A
     *         container instance has 1,024 <code>cpu</code> units for every CPU
     *         core.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * The number of MiB of memory reserved for the container. Docker will
     * allocate a minimum of 4 MiB of memory to a container.
     *
     * @return The number of MiB of memory reserved for the container. Docker will
     *         allocate a minimum of 4 MiB of memory to a container.
     */
    public Integer getMemory() {
        return memory;
    }
    
    /**
     * The number of MiB of memory reserved for the container. Docker will
     * allocate a minimum of 4 MiB of memory to a container.
     *
     * @param memory The number of MiB of memory reserved for the container. Docker will
     *         allocate a minimum of 4 MiB of memory to a container.
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }
    
    /**
     * The number of MiB of memory reserved for the container. Docker will
     * allocate a minimum of 4 MiB of memory to a container.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param memory The number of MiB of memory reserved for the container. Docker will
     *         allocate a minimum of 4 MiB of memory to a container.
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
     * <code>name</code> parameter. For more information on linking Docker
     * containers, see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     *
     * @return The <code>link</code> parameter allows containers to communicate with
     *         each other without the need for port mappings, using the
     *         <code>name</code> parameter. For more information on linking Docker
     *         containers, see <a
     *         href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
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
     * <code>name</code> parameter. For more information on linking Docker
     * containers, see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     *
     * @param links The <code>link</code> parameter allows containers to communicate with
     *         each other without the need for port mappings, using the
     *         <code>name</code> parameter. For more information on linking Docker
     *         containers, see <a
     *         href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
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
     * <code>name</code> parameter. For more information on linking Docker
     * containers, see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param links The <code>link</code> parameter allows containers to communicate with
     *         each other without the need for port mappings, using the
     *         <code>name</code> parameter. For more information on linking Docker
     *         containers, see <a
     *         href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
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
     * <code>name</code> parameter. For more information on linking Docker
     * containers, see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param links The <code>link</code> parameter allows containers to communicate with
     *         each other without the need for port mappings, using the
     *         <code>name</code> parameter. For more information on linking Docker
     *         containers, see <a
     *         href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
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
     * containers in a task.
     *
     * @return If the <code>essential</code> parameter of a container is marked as
     *         <code>true</code>, the failure of that container will stop the task.
     *         If the <code>essential</code> parameter of a container is marked as
     *         <code>false</code>, then its failure will not affect the rest of the
     *         containers in a task.
     */
    public Boolean isEssential() {
        return essential;
    }
    
    /**
     * If the <code>essential</code> parameter of a container is marked as
     * <code>true</code>, the failure of that container will stop the task.
     * If the <code>essential</code> parameter of a container is marked as
     * <code>false</code>, then its failure will not affect the rest of the
     * containers in a task.
     *
     * @param essential If the <code>essential</code> parameter of a container is marked as
     *         <code>true</code>, the failure of that container will stop the task.
     *         If the <code>essential</code> parameter of a container is marked as
     *         <code>false</code>, then its failure will not affect the rest of the
     *         containers in a task.
     */
    public void setEssential(Boolean essential) {
        this.essential = essential;
    }
    
    /**
     * If the <code>essential</code> parameter of a container is marked as
     * <code>true</code>, the failure of that container will stop the task.
     * If the <code>essential</code> parameter of a container is marked as
     * <code>false</code>, then its failure will not affect the rest of the
     * containers in a task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param essential If the <code>essential</code> parameter of a container is marked as
     *         <code>true</code>, the failure of that container will stop the task.
     *         If the <code>essential</code> parameter of a container is marked as
     *         <code>false</code>, then its failure will not affect the rest of the
     *         containers in a task.
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
     * containers in a task.
     *
     * @return If the <code>essential</code> parameter of a container is marked as
     *         <code>true</code>, the failure of that container will stop the task.
     *         If the <code>essential</code> parameter of a container is marked as
     *         <code>false</code>, then its failure will not affect the rest of the
     *         containers in a task.
     */
    public Boolean getEssential() {
        return essential;
    }

    /**
     * The <code>ENTRYPOINT</code> that is passed to the container. For more
     * information on the Docker <code>ENTRYPOINT</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     *
     * @return The <code>ENTRYPOINT</code> that is passed to the container. For more
     *         information on the Docker <code>ENTRYPOINT</code> parameter, see <a
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
     * The <code>ENTRYPOINT</code> that is passed to the container. For more
     * information on the Docker <code>ENTRYPOINT</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     *
     * @param entryPoint The <code>ENTRYPOINT</code> that is passed to the container. For more
     *         information on the Docker <code>ENTRYPOINT</code> parameter, see <a
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
     * The <code>ENTRYPOINT</code> that is passed to the container. For more
     * information on the Docker <code>ENTRYPOINT</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entryPoint The <code>ENTRYPOINT</code> that is passed to the container. For more
     *         information on the Docker <code>ENTRYPOINT</code> parameter, see <a
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
     * The <code>ENTRYPOINT</code> that is passed to the container. For more
     * information on the Docker <code>ENTRYPOINT</code> parameter, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entryPoint The <code>ENTRYPOINT</code> that is passed to the container. For more
     *         information on the Docker <code>ENTRYPOINT</code> parameter, see <a
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
        if (getEnvironment() != null) sb.append("Environment: " + getEnvironment() );
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
        return true;
    }
    
}
    