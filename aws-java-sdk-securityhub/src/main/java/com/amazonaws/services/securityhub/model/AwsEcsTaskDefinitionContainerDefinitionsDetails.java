/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container definition that describes a container in the task.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionContainerDefinitionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The command that is passed to the container.
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * The number of CPU units reserved for the container.
     * </p>
     */
    private Integer cpu;
    /**
     * <p>
     * The dependencies that are defined for container startup and shutdown.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails> dependsOn;
    /**
     * <p>
     * Whether to disable networking within the container.
     * </p>
     */
    private Boolean disableNetworking;
    /**
     * <p>
     * A list of DNS search domains that are presented to the container.
     * </p>
     */
    private java.util.List<String> dnsSearchDomains;
    /**
     * <p>
     * A list of DNS servers that are presented to the container.
     * </p>
     */
    private java.util.List<String> dnsServers;
    /**
     * <p>
     * A key-value map of labels to add to the container.
     * </p>
     */
    private java.util.Map<String, String> dockerLabels;
    /**
     * <p>
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems.
     * </p>
     */
    private java.util.List<String> dockerSecurityOptions;
    /**
     * <p>
     * The entry point that is passed to the container.
     * </p>
     */
    private java.util.List<String> entryPoint;
    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails> environment;
    /**
     * <p>
     * A list of files containing the environment variables to pass to a container.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails> environmentFiles;
    /**
     * <p>
     * Whether the container is essential. All tasks must have at least one essential container.
     * </p>
     */
    private Boolean essential;
    /**
     * <p>
     * A list of hostnames and IP address mappings to append to the <b>/etc/hosts</b> file on the container.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails> extraHosts;
    /**
     * <p>
     * The FireLens configuration for the container. Specifies and configures a log router for container logs.
     * </p>
     */
    private AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails firelensConfiguration;
    /**
     * <p>
     * The container health check command and associated configuration parameters for the container.
     * </p>
     */
    private AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails healthCheck;
    /**
     * <p>
     * The hostname to use for the container.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * The image used to start the container.
     * </p>
     */
    private String image;
    /**
     * <p>
     * If set to true, then containerized applications can be deployed that require <code>stdin</code> or a
     * <code>tty</code> to be allocated.
     * </p>
     */
    private Boolean interactive;
    /**
     * <p>
     * A list of links for the container in the form <code> <i>container_name</i>:<i>alias</i> </code>. Allows
     * containers to communicate with each other without the need for port mappings.
     * </p>
     */
    private java.util.List<String> links;
    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as Linux kernel capabilities.
     * </p>
     */
    private AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails linuxParameters;
    /**
     * <p>
     * The log configuration specification for the container.
     * </p>
     */
    private AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails logConfiguration;
    /**
     * <p>
     * The amount (in MiB) of memory to present to the container. If the container attempts to exceed the memory
     * specified here, the container is shut down. The total amount of memory reserved for all containers within a task
     * must be lower than the task memory value, if one is specified.
     * </p>
     */
    private Integer memory;
    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container.
     * </p>
     */
    private Integer memoryReservation;
    /**
     * <p>
     * The mount points for the data volumes in the container.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails> mountPoints;
    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The list of port mappings for the container.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails> portMappings;
    /**
     * <p>
     * Whether the container is given elevated privileges on the host container instance. The elevated privileges are
     * similar to the root user.
     * </p>
     */
    private Boolean privileged;
    /**
     * <p>
     * Whether to allocate a TTY to the container.
     * </p>
     */
    private Boolean pseudoTerminal;
    /**
     * <p>
     * Whether the container is given read-only access to its root file system.
     * </p>
     */
    private Boolean readonlyRootFilesystem;
    /**
     * <p>
     * The private repository authentication credentials to use.
     * </p>
     */
    private AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails repositoryCredentials;
    /**
     * <p>
     * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails> resourceRequirements;
    /**
     * <p>
     * The secrets to pass to the container.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails> secrets;
    /**
     * <p>
     * The number of seconds to wait before giving up on resolving dependencies for a container.
     * </p>
     */
    private Integer startTimeout;
    /**
     * <p>
     * The number of seconds to wait before the container is stopped if it doesn't shut down normally on its own.
     * </p>
     */
    private Integer stopTimeout;
    /**
     * <p>
     * A list of namespaced kernel parameters to set in the container.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails> systemControls;
    /**
     * <p>
     * A list of ulimits to set in the container.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails> ulimits;
    /**
     * <p>
     * The user to use inside the container.
     * </p>
     * <p>
     * The value can use one of the following formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> <i>user</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>user</i> </code>:<code> <i>group</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>uid</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>uid</i> </code>:<code> <i>gid</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>user</i> </code>:<code> <i>gid</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>uid</i> </code>:<code> <i>group</i> </code>
     * </p>
     * </li>
     * </ul>
     */
    private String user;
    /**
     * <p>
     * Data volumes to mount from another container.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails> volumesFrom;
    /**
     * <p>
     * The working directory in which to run commands inside the container.
     * </p>
     */
    private String workingDirectory;

    /**
     * <p>
     * The command that is passed to the container.
     * </p>
     * 
     * @return The command that is passed to the container.
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * The command that is passed to the container.
     * </p>
     * 
     * @param command
     *        The command that is passed to the container.
     */

    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }

        this.command = new java.util.ArrayList<String>(command);
    }

    /**
     * <p>
     * The command that is passed to the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The command that is passed to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withCommand(String... command) {
        if (this.command == null) {
            setCommand(new java.util.ArrayList<String>(command.length));
        }
        for (String ele : command) {
            this.command.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The command that is passed to the container.
     * </p>
     * 
     * @param command
     *        The command that is passed to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The number of CPU units reserved for the container.
     * </p>
     * 
     * @param cpu
     *        The number of CPU units reserved for the container.
     */

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of CPU units reserved for the container.
     * </p>
     * 
     * @return The number of CPU units reserved for the container.
     */

    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of CPU units reserved for the container.
     * </p>
     * 
     * @param cpu
     *        The number of CPU units reserved for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withCpu(Integer cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The dependencies that are defined for container startup and shutdown.
     * </p>
     * 
     * @return The dependencies that are defined for container startup and shutdown.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails> getDependsOn() {
        return dependsOn;
    }

    /**
     * <p>
     * The dependencies that are defined for container startup and shutdown.
     * </p>
     * 
     * @param dependsOn
     *        The dependencies that are defined for container startup and shutdown.
     */

    public void setDependsOn(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails> dependsOn) {
        if (dependsOn == null) {
            this.dependsOn = null;
            return;
        }

        this.dependsOn = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails>(dependsOn);
    }

    /**
     * <p>
     * The dependencies that are defined for container startup and shutdown.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependsOn(java.util.Collection)} or {@link #withDependsOn(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependsOn
     *        The dependencies that are defined for container startup and shutdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withDependsOn(AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails... dependsOn) {
        if (this.dependsOn == null) {
            setDependsOn(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails>(dependsOn.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails ele : dependsOn) {
            this.dependsOn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dependencies that are defined for container startup and shutdown.
     * </p>
     * 
     * @param dependsOn
     *        The dependencies that are defined for container startup and shutdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withDependsOn(
            java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails> dependsOn) {
        setDependsOn(dependsOn);
        return this;
    }

    /**
     * <p>
     * Whether to disable networking within the container.
     * </p>
     * 
     * @param disableNetworking
     *        Whether to disable networking within the container.
     */

    public void setDisableNetworking(Boolean disableNetworking) {
        this.disableNetworking = disableNetworking;
    }

    /**
     * <p>
     * Whether to disable networking within the container.
     * </p>
     * 
     * @return Whether to disable networking within the container.
     */

    public Boolean getDisableNetworking() {
        return this.disableNetworking;
    }

    /**
     * <p>
     * Whether to disable networking within the container.
     * </p>
     * 
     * @param disableNetworking
     *        Whether to disable networking within the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withDisableNetworking(Boolean disableNetworking) {
        setDisableNetworking(disableNetworking);
        return this;
    }

    /**
     * <p>
     * Whether to disable networking within the container.
     * </p>
     * 
     * @return Whether to disable networking within the container.
     */

    public Boolean isDisableNetworking() {
        return this.disableNetworking;
    }

    /**
     * <p>
     * A list of DNS search domains that are presented to the container.
     * </p>
     * 
     * @return A list of DNS search domains that are presented to the container.
     */

    public java.util.List<String> getDnsSearchDomains() {
        return dnsSearchDomains;
    }

    /**
     * <p>
     * A list of DNS search domains that are presented to the container.
     * </p>
     * 
     * @param dnsSearchDomains
     *        A list of DNS search domains that are presented to the container.
     */

    public void setDnsSearchDomains(java.util.Collection<String> dnsSearchDomains) {
        if (dnsSearchDomains == null) {
            this.dnsSearchDomains = null;
            return;
        }

        this.dnsSearchDomains = new java.util.ArrayList<String>(dnsSearchDomains);
    }

    /**
     * <p>
     * A list of DNS search domains that are presented to the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsSearchDomains(java.util.Collection)} or {@link #withDnsSearchDomains(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dnsSearchDomains
     *        A list of DNS search domains that are presented to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withDnsSearchDomains(String... dnsSearchDomains) {
        if (this.dnsSearchDomains == null) {
            setDnsSearchDomains(new java.util.ArrayList<String>(dnsSearchDomains.length));
        }
        for (String ele : dnsSearchDomains) {
            this.dnsSearchDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DNS search domains that are presented to the container.
     * </p>
     * 
     * @param dnsSearchDomains
     *        A list of DNS search domains that are presented to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withDnsSearchDomains(java.util.Collection<String> dnsSearchDomains) {
        setDnsSearchDomains(dnsSearchDomains);
        return this;
    }

    /**
     * <p>
     * A list of DNS servers that are presented to the container.
     * </p>
     * 
     * @return A list of DNS servers that are presented to the container.
     */

    public java.util.List<String> getDnsServers() {
        return dnsServers;
    }

    /**
     * <p>
     * A list of DNS servers that are presented to the container.
     * </p>
     * 
     * @param dnsServers
     *        A list of DNS servers that are presented to the container.
     */

    public void setDnsServers(java.util.Collection<String> dnsServers) {
        if (dnsServers == null) {
            this.dnsServers = null;
            return;
        }

        this.dnsServers = new java.util.ArrayList<String>(dnsServers);
    }

    /**
     * <p>
     * A list of DNS servers that are presented to the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsServers(java.util.Collection)} or {@link #withDnsServers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsServers
     *        A list of DNS servers that are presented to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withDnsServers(String... dnsServers) {
        if (this.dnsServers == null) {
            setDnsServers(new java.util.ArrayList<String>(dnsServers.length));
        }
        for (String ele : dnsServers) {
            this.dnsServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DNS servers that are presented to the container.
     * </p>
     * 
     * @param dnsServers
     *        A list of DNS servers that are presented to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withDnsServers(java.util.Collection<String> dnsServers) {
        setDnsServers(dnsServers);
        return this;
    }

    /**
     * <p>
     * A key-value map of labels to add to the container.
     * </p>
     * 
     * @return A key-value map of labels to add to the container.
     */

    public java.util.Map<String, String> getDockerLabels() {
        return dockerLabels;
    }

    /**
     * <p>
     * A key-value map of labels to add to the container.
     * </p>
     * 
     * @param dockerLabels
     *        A key-value map of labels to add to the container.
     */

    public void setDockerLabels(java.util.Map<String, String> dockerLabels) {
        this.dockerLabels = dockerLabels;
    }

    /**
     * <p>
     * A key-value map of labels to add to the container.
     * </p>
     * 
     * @param dockerLabels
     *        A key-value map of labels to add to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withDockerLabels(java.util.Map<String, String> dockerLabels) {
        setDockerLabels(dockerLabels);
        return this;
    }

    /**
     * Add a single DockerLabels entry
     *
     * @see AwsEcsTaskDefinitionContainerDefinitionsDetails#withDockerLabels
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails addDockerLabelsEntry(String key, String value) {
        if (null == this.dockerLabels) {
            this.dockerLabels = new java.util.HashMap<String, String>();
        }
        if (this.dockerLabels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dockerLabels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DockerLabels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails clearDockerLabelsEntries() {
        this.dockerLabels = null;
        return this;
    }

    /**
     * <p>
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems.
     * </p>
     * 
     * @return A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems.
     */

    public java.util.List<String> getDockerSecurityOptions() {
        return dockerSecurityOptions;
    }

    /**
     * <p>
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems.
     * </p>
     * 
     * @param dockerSecurityOptions
     *        A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems.
     */

    public void setDockerSecurityOptions(java.util.Collection<String> dockerSecurityOptions) {
        if (dockerSecurityOptions == null) {
            this.dockerSecurityOptions = null;
            return;
        }

        this.dockerSecurityOptions = new java.util.ArrayList<String>(dockerSecurityOptions);
    }

    /**
     * <p>
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDockerSecurityOptions(java.util.Collection)} or
     * {@link #withDockerSecurityOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dockerSecurityOptions
     *        A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withDockerSecurityOptions(String... dockerSecurityOptions) {
        if (this.dockerSecurityOptions == null) {
            setDockerSecurityOptions(new java.util.ArrayList<String>(dockerSecurityOptions.length));
        }
        for (String ele : dockerSecurityOptions) {
            this.dockerSecurityOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems.
     * </p>
     * 
     * @param dockerSecurityOptions
     *        A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withDockerSecurityOptions(java.util.Collection<String> dockerSecurityOptions) {
        setDockerSecurityOptions(dockerSecurityOptions);
        return this;
    }

    /**
     * <p>
     * The entry point that is passed to the container.
     * </p>
     * 
     * @return The entry point that is passed to the container.
     */

    public java.util.List<String> getEntryPoint() {
        return entryPoint;
    }

    /**
     * <p>
     * The entry point that is passed to the container.
     * </p>
     * 
     * @param entryPoint
     *        The entry point that is passed to the container.
     */

    public void setEntryPoint(java.util.Collection<String> entryPoint) {
        if (entryPoint == null) {
            this.entryPoint = null;
            return;
        }

        this.entryPoint = new java.util.ArrayList<String>(entryPoint);
    }

    /**
     * <p>
     * The entry point that is passed to the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntryPoint(java.util.Collection)} or {@link #withEntryPoint(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entryPoint
     *        The entry point that is passed to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withEntryPoint(String... entryPoint) {
        if (this.entryPoint == null) {
            setEntryPoint(new java.util.ArrayList<String>(entryPoint.length));
        }
        for (String ele : entryPoint) {
            this.entryPoint.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The entry point that is passed to the container.
     * </p>
     * 
     * @param entryPoint
     *        The entry point that is passed to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withEntryPoint(java.util.Collection<String> entryPoint) {
        setEntryPoint(entryPoint);
        return this;
    }

    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * 
     * @return The environment variables to pass to a container.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * 
     * @param environment
     *        The environment variables to pass to a container.
     */

    public void setEnvironment(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }

        this.environment = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails>(environment);
    }

    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironment(java.util.Collection)} or {@link #withEnvironment(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environment
     *        The environment variables to pass to a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withEnvironment(AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails... environment) {
        if (this.environment == null) {
            setEnvironment(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails>(environment.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails ele : environment) {
            this.environment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * 
     * @param environment
     *        The environment variables to pass to a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withEnvironment(
            java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * A list of files containing the environment variables to pass to a container.
     * </p>
     * 
     * @return A list of files containing the environment variables to pass to a container.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails> getEnvironmentFiles() {
        return environmentFiles;
    }

    /**
     * <p>
     * A list of files containing the environment variables to pass to a container.
     * </p>
     * 
     * @param environmentFiles
     *        A list of files containing the environment variables to pass to a container.
     */

    public void setEnvironmentFiles(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails> environmentFiles) {
        if (environmentFiles == null) {
            this.environmentFiles = null;
            return;
        }

        this.environmentFiles = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails>(environmentFiles);
    }

    /**
     * <p>
     * A list of files containing the environment variables to pass to a container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentFiles(java.util.Collection)} or {@link #withEnvironmentFiles(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param environmentFiles
     *        A list of files containing the environment variables to pass to a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withEnvironmentFiles(
            AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails... environmentFiles) {
        if (this.environmentFiles == null) {
            setEnvironmentFiles(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails>(environmentFiles.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails ele : environmentFiles) {
            this.environmentFiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of files containing the environment variables to pass to a container.
     * </p>
     * 
     * @param environmentFiles
     *        A list of files containing the environment variables to pass to a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withEnvironmentFiles(
            java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails> environmentFiles) {
        setEnvironmentFiles(environmentFiles);
        return this;
    }

    /**
     * <p>
     * Whether the container is essential. All tasks must have at least one essential container.
     * </p>
     * 
     * @param essential
     *        Whether the container is essential. All tasks must have at least one essential container.
     */

    public void setEssential(Boolean essential) {
        this.essential = essential;
    }

    /**
     * <p>
     * Whether the container is essential. All tasks must have at least one essential container.
     * </p>
     * 
     * @return Whether the container is essential. All tasks must have at least one essential container.
     */

    public Boolean getEssential() {
        return this.essential;
    }

    /**
     * <p>
     * Whether the container is essential. All tasks must have at least one essential container.
     * </p>
     * 
     * @param essential
     *        Whether the container is essential. All tasks must have at least one essential container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withEssential(Boolean essential) {
        setEssential(essential);
        return this;
    }

    /**
     * <p>
     * Whether the container is essential. All tasks must have at least one essential container.
     * </p>
     * 
     * @return Whether the container is essential. All tasks must have at least one essential container.
     */

    public Boolean isEssential() {
        return this.essential;
    }

    /**
     * <p>
     * A list of hostnames and IP address mappings to append to the <b>/etc/hosts</b> file on the container.
     * </p>
     * 
     * @return A list of hostnames and IP address mappings to append to the <b>/etc/hosts</b> file on the container.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails> getExtraHosts() {
        return extraHosts;
    }

    /**
     * <p>
     * A list of hostnames and IP address mappings to append to the <b>/etc/hosts</b> file on the container.
     * </p>
     * 
     * @param extraHosts
     *        A list of hostnames and IP address mappings to append to the <b>/etc/hosts</b> file on the container.
     */

    public void setExtraHosts(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails> extraHosts) {
        if (extraHosts == null) {
            this.extraHosts = null;
            return;
        }

        this.extraHosts = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails>(extraHosts);
    }

    /**
     * <p>
     * A list of hostnames and IP address mappings to append to the <b>/etc/hosts</b> file on the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtraHosts(java.util.Collection)} or {@link #withExtraHosts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param extraHosts
     *        A list of hostnames and IP address mappings to append to the <b>/etc/hosts</b> file on the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withExtraHosts(AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails... extraHosts) {
        if (this.extraHosts == null) {
            setExtraHosts(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails>(extraHosts.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails ele : extraHosts) {
            this.extraHosts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of hostnames and IP address mappings to append to the <b>/etc/hosts</b> file on the container.
     * </p>
     * 
     * @param extraHosts
     *        A list of hostnames and IP address mappings to append to the <b>/etc/hosts</b> file on the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withExtraHosts(
            java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails> extraHosts) {
        setExtraHosts(extraHosts);
        return this;
    }

    /**
     * <p>
     * The FireLens configuration for the container. Specifies and configures a log router for container logs.
     * </p>
     * 
     * @param firelensConfiguration
     *        The FireLens configuration for the container. Specifies and configures a log router for container logs.
     */

    public void setFirelensConfiguration(AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails firelensConfiguration) {
        this.firelensConfiguration = firelensConfiguration;
    }

    /**
     * <p>
     * The FireLens configuration for the container. Specifies and configures a log router for container logs.
     * </p>
     * 
     * @return The FireLens configuration for the container. Specifies and configures a log router for container logs.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails getFirelensConfiguration() {
        return this.firelensConfiguration;
    }

    /**
     * <p>
     * The FireLens configuration for the container. Specifies and configures a log router for container logs.
     * </p>
     * 
     * @param firelensConfiguration
     *        The FireLens configuration for the container. Specifies and configures a log router for container logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withFirelensConfiguration(
            AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails firelensConfiguration) {
        setFirelensConfiguration(firelensConfiguration);
        return this;
    }

    /**
     * <p>
     * The container health check command and associated configuration parameters for the container.
     * </p>
     * 
     * @param healthCheck
     *        The container health check command and associated configuration parameters for the container.
     */

    public void setHealthCheck(AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * The container health check command and associated configuration parameters for the container.
     * </p>
     * 
     * @return The container health check command and associated configuration parameters for the container.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * The container health check command and associated configuration parameters for the container.
     * </p>
     * 
     * @param healthCheck
     *        The container health check command and associated configuration parameters for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withHealthCheck(AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails healthCheck) {
        setHealthCheck(healthCheck);
        return this;
    }

    /**
     * <p>
     * The hostname to use for the container.
     * </p>
     * 
     * @param hostname
     *        The hostname to use for the container.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The hostname to use for the container.
     * </p>
     * 
     * @return The hostname to use for the container.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The hostname to use for the container.
     * </p>
     * 
     * @param hostname
     *        The hostname to use for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The image used to start the container.
     * </p>
     * 
     * @param image
     *        The image used to start the container.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The image used to start the container.
     * </p>
     * 
     * @return The image used to start the container.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The image used to start the container.
     * </p>
     * 
     * @param image
     *        The image used to start the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * If set to true, then containerized applications can be deployed that require <code>stdin</code> or a
     * <code>tty</code> to be allocated.
     * </p>
     * 
     * @param interactive
     *        If set to true, then containerized applications can be deployed that require <code>stdin</code> or a
     *        <code>tty</code> to be allocated.
     */

    public void setInteractive(Boolean interactive) {
        this.interactive = interactive;
    }

    /**
     * <p>
     * If set to true, then containerized applications can be deployed that require <code>stdin</code> or a
     * <code>tty</code> to be allocated.
     * </p>
     * 
     * @return If set to true, then containerized applications can be deployed that require <code>stdin</code> or a
     *         <code>tty</code> to be allocated.
     */

    public Boolean getInteractive() {
        return this.interactive;
    }

    /**
     * <p>
     * If set to true, then containerized applications can be deployed that require <code>stdin</code> or a
     * <code>tty</code> to be allocated.
     * </p>
     * 
     * @param interactive
     *        If set to true, then containerized applications can be deployed that require <code>stdin</code> or a
     *        <code>tty</code> to be allocated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withInteractive(Boolean interactive) {
        setInteractive(interactive);
        return this;
    }

    /**
     * <p>
     * If set to true, then containerized applications can be deployed that require <code>stdin</code> or a
     * <code>tty</code> to be allocated.
     * </p>
     * 
     * @return If set to true, then containerized applications can be deployed that require <code>stdin</code> or a
     *         <code>tty</code> to be allocated.
     */

    public Boolean isInteractive() {
        return this.interactive;
    }

    /**
     * <p>
     * A list of links for the container in the form <code> <i>container_name</i>:<i>alias</i> </code>. Allows
     * containers to communicate with each other without the need for port mappings.
     * </p>
     * 
     * @return A list of links for the container in the form <code> <i>container_name</i>:<i>alias</i> </code>. Allows
     *         containers to communicate with each other without the need for port mappings.
     */

    public java.util.List<String> getLinks() {
        return links;
    }

    /**
     * <p>
     * A list of links for the container in the form <code> <i>container_name</i>:<i>alias</i> </code>. Allows
     * containers to communicate with each other without the need for port mappings.
     * </p>
     * 
     * @param links
     *        A list of links for the container in the form <code> <i>container_name</i>:<i>alias</i> </code>. Allows
     *        containers to communicate with each other without the need for port mappings.
     */

    public void setLinks(java.util.Collection<String> links) {
        if (links == null) {
            this.links = null;
            return;
        }

        this.links = new java.util.ArrayList<String>(links);
    }

    /**
     * <p>
     * A list of links for the container in the form <code> <i>container_name</i>:<i>alias</i> </code>. Allows
     * containers to communicate with each other without the need for port mappings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLinks(java.util.Collection)} or {@link #withLinks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param links
     *        A list of links for the container in the form <code> <i>container_name</i>:<i>alias</i> </code>. Allows
     *        containers to communicate with each other without the need for port mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withLinks(String... links) {
        if (this.links == null) {
            setLinks(new java.util.ArrayList<String>(links.length));
        }
        for (String ele : links) {
            this.links.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of links for the container in the form <code> <i>container_name</i>:<i>alias</i> </code>. Allows
     * containers to communicate with each other without the need for port mappings.
     * </p>
     * 
     * @param links
     *        A list of links for the container in the form <code> <i>container_name</i>:<i>alias</i> </code>. Allows
     *        containers to communicate with each other without the need for port mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withLinks(java.util.Collection<String> links) {
        setLinks(links);
        return this;
    }

    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as Linux kernel capabilities.
     * </p>
     * 
     * @param linuxParameters
     *        Linux-specific modifications that are applied to the container, such as Linux kernel capabilities.
     */

    public void setLinuxParameters(AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails linuxParameters) {
        this.linuxParameters = linuxParameters;
    }

    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as Linux kernel capabilities.
     * </p>
     * 
     * @return Linux-specific modifications that are applied to the container, such as Linux kernel capabilities.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails getLinuxParameters() {
        return this.linuxParameters;
    }

    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as Linux kernel capabilities.
     * </p>
     * 
     * @param linuxParameters
     *        Linux-specific modifications that are applied to the container, such as Linux kernel capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withLinuxParameters(AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails linuxParameters) {
        setLinuxParameters(linuxParameters);
        return this;
    }

    /**
     * <p>
     * The log configuration specification for the container.
     * </p>
     * 
     * @param logConfiguration
     *        The log configuration specification for the container.
     */

    public void setLogConfiguration(AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    /**
     * <p>
     * The log configuration specification for the container.
     * </p>
     * 
     * @return The log configuration specification for the container.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * <p>
     * The log configuration specification for the container.
     * </p>
     * 
     * @param logConfiguration
     *        The log configuration specification for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withLogConfiguration(AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails logConfiguration) {
        setLogConfiguration(logConfiguration);
        return this;
    }

    /**
     * <p>
     * The amount (in MiB) of memory to present to the container. If the container attempts to exceed the memory
     * specified here, the container is shut down. The total amount of memory reserved for all containers within a task
     * must be lower than the task memory value, if one is specified.
     * </p>
     * 
     * @param memory
     *        The amount (in MiB) of memory to present to the container. If the container attempts to exceed the memory
     *        specified here, the container is shut down. The total amount of memory reserved for all containers within
     *        a task must be lower than the task memory value, if one is specified.
     */

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The amount (in MiB) of memory to present to the container. If the container attempts to exceed the memory
     * specified here, the container is shut down. The total amount of memory reserved for all containers within a task
     * must be lower than the task memory value, if one is specified.
     * </p>
     * 
     * @return The amount (in MiB) of memory to present to the container. If the container attempts to exceed the memory
     *         specified here, the container is shut down. The total amount of memory reserved for all containers within
     *         a task must be lower than the task memory value, if one is specified.
     */

    public Integer getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The amount (in MiB) of memory to present to the container. If the container attempts to exceed the memory
     * specified here, the container is shut down. The total amount of memory reserved for all containers within a task
     * must be lower than the task memory value, if one is specified.
     * </p>
     * 
     * @param memory
     *        The amount (in MiB) of memory to present to the container. If the container attempts to exceed the memory
     *        specified here, the container is shut down. The total amount of memory reserved for all containers within
     *        a task must be lower than the task memory value, if one is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withMemory(Integer memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container.
     * </p>
     * 
     * @param memoryReservation
     *        The soft limit (in MiB) of memory to reserve for the container.
     */

    public void setMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container.
     * </p>
     * 
     * @return The soft limit (in MiB) of memory to reserve for the container.
     */

    public Integer getMemoryReservation() {
        return this.memoryReservation;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container.
     * </p>
     * 
     * @param memoryReservation
     *        The soft limit (in MiB) of memory to reserve for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withMemoryReservation(Integer memoryReservation) {
        setMemoryReservation(memoryReservation);
        return this;
    }

    /**
     * <p>
     * The mount points for the data volumes in the container.
     * </p>
     * 
     * @return The mount points for the data volumes in the container.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails> getMountPoints() {
        return mountPoints;
    }

    /**
     * <p>
     * The mount points for the data volumes in the container.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for the data volumes in the container.
     */

    public void setMountPoints(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails> mountPoints) {
        if (mountPoints == null) {
            this.mountPoints = null;
            return;
        }

        this.mountPoints = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails>(mountPoints);
    }

    /**
     * <p>
     * The mount points for the data volumes in the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMountPoints(java.util.Collection)} or {@link #withMountPoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for the data volumes in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withMountPoints(AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails... mountPoints) {
        if (this.mountPoints == null) {
            setMountPoints(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails>(mountPoints.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails ele : mountPoints) {
            this.mountPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The mount points for the data volumes in the container.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for the data volumes in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withMountPoints(
            java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails> mountPoints) {
        setMountPoints(mountPoints);
        return this;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param name
     *        The name of the container.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @return The name of the container.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param name
     *        The name of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The list of port mappings for the container.
     * </p>
     * 
     * @return The list of port mappings for the container.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails> getPortMappings() {
        return portMappings;
    }

    /**
     * <p>
     * The list of port mappings for the container.
     * </p>
     * 
     * @param portMappings
     *        The list of port mappings for the container.
     */

    public void setPortMappings(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails> portMappings) {
        if (portMappings == null) {
            this.portMappings = null;
            return;
        }

        this.portMappings = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails>(portMappings);
    }

    /**
     * <p>
     * The list of port mappings for the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortMappings(java.util.Collection)} or {@link #withPortMappings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param portMappings
     *        The list of port mappings for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withPortMappings(AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails... portMappings) {
        if (this.portMappings == null) {
            setPortMappings(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails>(portMappings.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails ele : portMappings) {
            this.portMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of port mappings for the container.
     * </p>
     * 
     * @param portMappings
     *        The list of port mappings for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withPortMappings(
            java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails> portMappings) {
        setPortMappings(portMappings);
        return this;
    }

    /**
     * <p>
     * Whether the container is given elevated privileges on the host container instance. The elevated privileges are
     * similar to the root user.
     * </p>
     * 
     * @param privileged
     *        Whether the container is given elevated privileges on the host container instance. The elevated privileges
     *        are similar to the root user.
     */

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * <p>
     * Whether the container is given elevated privileges on the host container instance. The elevated privileges are
     * similar to the root user.
     * </p>
     * 
     * @return Whether the container is given elevated privileges on the host container instance. The elevated
     *         privileges are similar to the root user.
     */

    public Boolean getPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * Whether the container is given elevated privileges on the host container instance. The elevated privileges are
     * similar to the root user.
     * </p>
     * 
     * @param privileged
     *        Whether the container is given elevated privileges on the host container instance. The elevated privileges
     *        are similar to the root user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withPrivileged(Boolean privileged) {
        setPrivileged(privileged);
        return this;
    }

    /**
     * <p>
     * Whether the container is given elevated privileges on the host container instance. The elevated privileges are
     * similar to the root user.
     * </p>
     * 
     * @return Whether the container is given elevated privileges on the host container instance. The elevated
     *         privileges are similar to the root user.
     */

    public Boolean isPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * Whether to allocate a TTY to the container.
     * </p>
     * 
     * @param pseudoTerminal
     *        Whether to allocate a TTY to the container.
     */

    public void setPseudoTerminal(Boolean pseudoTerminal) {
        this.pseudoTerminal = pseudoTerminal;
    }

    /**
     * <p>
     * Whether to allocate a TTY to the container.
     * </p>
     * 
     * @return Whether to allocate a TTY to the container.
     */

    public Boolean getPseudoTerminal() {
        return this.pseudoTerminal;
    }

    /**
     * <p>
     * Whether to allocate a TTY to the container.
     * </p>
     * 
     * @param pseudoTerminal
     *        Whether to allocate a TTY to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withPseudoTerminal(Boolean pseudoTerminal) {
        setPseudoTerminal(pseudoTerminal);
        return this;
    }

    /**
     * <p>
     * Whether to allocate a TTY to the container.
     * </p>
     * 
     * @return Whether to allocate a TTY to the container.
     */

    public Boolean isPseudoTerminal() {
        return this.pseudoTerminal;
    }

    /**
     * <p>
     * Whether the container is given read-only access to its root file system.
     * </p>
     * 
     * @param readonlyRootFilesystem
     *        Whether the container is given read-only access to its root file system.
     */

    public void setReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
    }

    /**
     * <p>
     * Whether the container is given read-only access to its root file system.
     * </p>
     * 
     * @return Whether the container is given read-only access to its root file system.
     */

    public Boolean getReadonlyRootFilesystem() {
        return this.readonlyRootFilesystem;
    }

    /**
     * <p>
     * Whether the container is given read-only access to its root file system.
     * </p>
     * 
     * @param readonlyRootFilesystem
     *        Whether the container is given read-only access to its root file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        setReadonlyRootFilesystem(readonlyRootFilesystem);
        return this;
    }

    /**
     * <p>
     * Whether the container is given read-only access to its root file system.
     * </p>
     * 
     * @return Whether the container is given read-only access to its root file system.
     */

    public Boolean isReadonlyRootFilesystem() {
        return this.readonlyRootFilesystem;
    }

    /**
     * <p>
     * The private repository authentication credentials to use.
     * </p>
     * 
     * @param repositoryCredentials
     *        The private repository authentication credentials to use.
     */

    public void setRepositoryCredentials(AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails repositoryCredentials) {
        this.repositoryCredentials = repositoryCredentials;
    }

    /**
     * <p>
     * The private repository authentication credentials to use.
     * </p>
     * 
     * @return The private repository authentication credentials to use.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails getRepositoryCredentials() {
        return this.repositoryCredentials;
    }

    /**
     * <p>
     * The private repository authentication credentials to use.
     * </p>
     * 
     * @param repositoryCredentials
     *        The private repository authentication credentials to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withRepositoryCredentials(
            AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails repositoryCredentials) {
        setRepositoryCredentials(repositoryCredentials);
        return this;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * </p>
     * 
     * @return The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails> getResourceRequirements() {
        return resourceRequirements;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     */

    public void setResourceRequirements(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails> resourceRequirements) {
        if (resourceRequirements == null) {
            this.resourceRequirements = null;
            return;
        }

        this.resourceRequirements = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails>(resourceRequirements);
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceRequirements(java.util.Collection)} or {@link #withResourceRequirements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withResourceRequirements(
            AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails... resourceRequirements) {
        if (this.resourceRequirements == null) {
            setResourceRequirements(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails>(resourceRequirements.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails ele : resourceRequirements) {
            this.resourceRequirements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withResourceRequirements(
            java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails> resourceRequirements) {
        setResourceRequirements(resourceRequirements);
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the container.
     * </p>
     * 
     * @return The secrets to pass to the container.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails> getSecrets() {
        return secrets;
    }

    /**
     * <p>
     * The secrets to pass to the container.
     * </p>
     * 
     * @param secrets
     *        The secrets to pass to the container.
     */

    public void setSecrets(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails> secrets) {
        if (secrets == null) {
            this.secrets = null;
            return;
        }

        this.secrets = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails>(secrets);
    }

    /**
     * <p>
     * The secrets to pass to the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecrets(java.util.Collection)} or {@link #withSecrets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param secrets
     *        The secrets to pass to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withSecrets(AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails... secrets) {
        if (this.secrets == null) {
            setSecrets(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails>(secrets.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails ele : secrets) {
            this.secrets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the container.
     * </p>
     * 
     * @param secrets
     *        The secrets to pass to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withSecrets(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails> secrets) {
        setSecrets(secrets);
        return this;
    }

    /**
     * <p>
     * The number of seconds to wait before giving up on resolving dependencies for a container.
     * </p>
     * 
     * @param startTimeout
     *        The number of seconds to wait before giving up on resolving dependencies for a container.
     */

    public void setStartTimeout(Integer startTimeout) {
        this.startTimeout = startTimeout;
    }

    /**
     * <p>
     * The number of seconds to wait before giving up on resolving dependencies for a container.
     * </p>
     * 
     * @return The number of seconds to wait before giving up on resolving dependencies for a container.
     */

    public Integer getStartTimeout() {
        return this.startTimeout;
    }

    /**
     * <p>
     * The number of seconds to wait before giving up on resolving dependencies for a container.
     * </p>
     * 
     * @param startTimeout
     *        The number of seconds to wait before giving up on resolving dependencies for a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withStartTimeout(Integer startTimeout) {
        setStartTimeout(startTimeout);
        return this;
    }

    /**
     * <p>
     * The number of seconds to wait before the container is stopped if it doesn't shut down normally on its own.
     * </p>
     * 
     * @param stopTimeout
     *        The number of seconds to wait before the container is stopped if it doesn't shut down normally on its own.
     */

    public void setStopTimeout(Integer stopTimeout) {
        this.stopTimeout = stopTimeout;
    }

    /**
     * <p>
     * The number of seconds to wait before the container is stopped if it doesn't shut down normally on its own.
     * </p>
     * 
     * @return The number of seconds to wait before the container is stopped if it doesn't shut down normally on its
     *         own.
     */

    public Integer getStopTimeout() {
        return this.stopTimeout;
    }

    /**
     * <p>
     * The number of seconds to wait before the container is stopped if it doesn't shut down normally on its own.
     * </p>
     * 
     * @param stopTimeout
     *        The number of seconds to wait before the container is stopped if it doesn't shut down normally on its own.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withStopTimeout(Integer stopTimeout) {
        setStopTimeout(stopTimeout);
        return this;
    }

    /**
     * <p>
     * A list of namespaced kernel parameters to set in the container.
     * </p>
     * 
     * @return A list of namespaced kernel parameters to set in the container.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails> getSystemControls() {
        return systemControls;
    }

    /**
     * <p>
     * A list of namespaced kernel parameters to set in the container.
     * </p>
     * 
     * @param systemControls
     *        A list of namespaced kernel parameters to set in the container.
     */

    public void setSystemControls(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails> systemControls) {
        if (systemControls == null) {
            this.systemControls = null;
            return;
        }

        this.systemControls = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails>(systemControls);
    }

    /**
     * <p>
     * A list of namespaced kernel parameters to set in the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSystemControls(java.util.Collection)} or {@link #withSystemControls(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param systemControls
     *        A list of namespaced kernel parameters to set in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withSystemControls(AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails... systemControls) {
        if (this.systemControls == null) {
            setSystemControls(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails>(systemControls.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails ele : systemControls) {
            this.systemControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of namespaced kernel parameters to set in the container.
     * </p>
     * 
     * @param systemControls
     *        A list of namespaced kernel parameters to set in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withSystemControls(
            java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails> systemControls) {
        setSystemControls(systemControls);
        return this;
    }

    /**
     * <p>
     * A list of ulimits to set in the container.
     * </p>
     * 
     * @return A list of ulimits to set in the container.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails> getUlimits() {
        return ulimits;
    }

    /**
     * <p>
     * A list of ulimits to set in the container.
     * </p>
     * 
     * @param ulimits
     *        A list of ulimits to set in the container.
     */

    public void setUlimits(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails> ulimits) {
        if (ulimits == null) {
            this.ulimits = null;
            return;
        }

        this.ulimits = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails>(ulimits);
    }

    /**
     * <p>
     * A list of ulimits to set in the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUlimits(java.util.Collection)} or {@link #withUlimits(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ulimits
     *        A list of ulimits to set in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withUlimits(AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails... ulimits) {
        if (this.ulimits == null) {
            setUlimits(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails>(ulimits.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails ele : ulimits) {
            this.ulimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ulimits to set in the container.
     * </p>
     * 
     * @param ulimits
     *        A list of ulimits to set in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withUlimits(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails> ulimits) {
        setUlimits(ulimits);
        return this;
    }

    /**
     * <p>
     * The user to use inside the container.
     * </p>
     * <p>
     * The value can use one of the following formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> <i>user</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>user</i> </code>:<code> <i>group</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>uid</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>uid</i> </code>:<code> <i>gid</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>user</i> </code>:<code> <i>gid</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>uid</i> </code>:<code> <i>group</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param user
     *        The user to use inside the container.</p>
     *        <p>
     *        The value can use one of the following formats.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code> <i>user</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>user</i> </code>:<code> <i>group</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>uid</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>uid</i> </code>:<code> <i>gid</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>user</i> </code>:<code> <i>gid</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>uid</i> </code>:<code> <i>group</i> </code>
     *        </p>
     *        </li>
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user to use inside the container.
     * </p>
     * <p>
     * The value can use one of the following formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> <i>user</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>user</i> </code>:<code> <i>group</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>uid</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>uid</i> </code>:<code> <i>gid</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>user</i> </code>:<code> <i>gid</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>uid</i> </code>:<code> <i>group</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The user to use inside the container.</p>
     *         <p>
     *         The value can use one of the following formats.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code> <i>user</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code> <i>user</i> </code>:<code> <i>group</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code> <i>uid</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code> <i>uid</i> </code>:<code> <i>gid</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code> <i>user</i> </code>:<code> <i>gid</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code> <i>uid</i> </code>:<code> <i>group</i> </code>
     *         </p>
     *         </li>
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user to use inside the container.
     * </p>
     * <p>
     * The value can use one of the following formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> <i>user</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>user</i> </code>:<code> <i>group</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>uid</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>uid</i> </code>:<code> <i>gid</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>user</i> </code>:<code> <i>gid</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>uid</i> </code>:<code> <i>group</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param user
     *        The user to use inside the container.</p>
     *        <p>
     *        The value can use one of the following formats.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code> <i>user</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>user</i> </code>:<code> <i>group</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>uid</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>uid</i> </code>:<code> <i>gid</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>user</i> </code>:<code> <i>gid</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>uid</i> </code>:<code> <i>group</i> </code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * Data volumes to mount from another container.
     * </p>
     * 
     * @return Data volumes to mount from another container.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails> getVolumesFrom() {
        return volumesFrom;
    }

    /**
     * <p>
     * Data volumes to mount from another container.
     * </p>
     * 
     * @param volumesFrom
     *        Data volumes to mount from another container.
     */

    public void setVolumesFrom(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails> volumesFrom) {
        if (volumesFrom == null) {
            this.volumesFrom = null;
            return;
        }

        this.volumesFrom = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails>(volumesFrom);
    }

    /**
     * <p>
     * Data volumes to mount from another container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumesFrom(java.util.Collection)} or {@link #withVolumesFrom(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumesFrom
     *        Data volumes to mount from another container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withVolumesFrom(AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails... volumesFrom) {
        if (this.volumesFrom == null) {
            setVolumesFrom(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails>(volumesFrom.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails ele : volumesFrom) {
            this.volumesFrom.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Data volumes to mount from another container.
     * </p>
     * 
     * @param volumesFrom
     *        Data volumes to mount from another container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withVolumesFrom(
            java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails> volumesFrom) {
        setVolumesFrom(volumesFrom);
        return this;
    }

    /**
     * <p>
     * The working directory in which to run commands inside the container.
     * </p>
     * 
     * @param workingDirectory
     *        The working directory in which to run commands inside the container.
     */

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * <p>
     * The working directory in which to run commands inside the container.
     * </p>
     * 
     * @return The working directory in which to run commands inside the container.
     */

    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * <p>
     * The working directory in which to run commands inside the container.
     * </p>
     * 
     * @param workingDirectory
     *        The working directory in which to run commands inside the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDetails withWorkingDirectory(String workingDirectory) {
        setWorkingDirectory(workingDirectory);
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
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getDependsOn() != null)
            sb.append("DependsOn: ").append(getDependsOn()).append(",");
        if (getDisableNetworking() != null)
            sb.append("DisableNetworking: ").append(getDisableNetworking()).append(",");
        if (getDnsSearchDomains() != null)
            sb.append("DnsSearchDomains: ").append(getDnsSearchDomains()).append(",");
        if (getDnsServers() != null)
            sb.append("DnsServers: ").append(getDnsServers()).append(",");
        if (getDockerLabels() != null)
            sb.append("DockerLabels: ").append(getDockerLabels()).append(",");
        if (getDockerSecurityOptions() != null)
            sb.append("DockerSecurityOptions: ").append(getDockerSecurityOptions()).append(",");
        if (getEntryPoint() != null)
            sb.append("EntryPoint: ").append(getEntryPoint()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getEnvironmentFiles() != null)
            sb.append("EnvironmentFiles: ").append(getEnvironmentFiles()).append(",");
        if (getEssential() != null)
            sb.append("Essential: ").append(getEssential()).append(",");
        if (getExtraHosts() != null)
            sb.append("ExtraHosts: ").append(getExtraHosts()).append(",");
        if (getFirelensConfiguration() != null)
            sb.append("FirelensConfiguration: ").append(getFirelensConfiguration()).append(",");
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getInteractive() != null)
            sb.append("Interactive: ").append(getInteractive()).append(",");
        if (getLinks() != null)
            sb.append("Links: ").append(getLinks()).append(",");
        if (getLinuxParameters() != null)
            sb.append("LinuxParameters: ").append(getLinuxParameters()).append(",");
        if (getLogConfiguration() != null)
            sb.append("LogConfiguration: ").append(getLogConfiguration()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getMemoryReservation() != null)
            sb.append("MemoryReservation: ").append(getMemoryReservation()).append(",");
        if (getMountPoints() != null)
            sb.append("MountPoints: ").append(getMountPoints()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPortMappings() != null)
            sb.append("PortMappings: ").append(getPortMappings()).append(",");
        if (getPrivileged() != null)
            sb.append("Privileged: ").append(getPrivileged()).append(",");
        if (getPseudoTerminal() != null)
            sb.append("PseudoTerminal: ").append(getPseudoTerminal()).append(",");
        if (getReadonlyRootFilesystem() != null)
            sb.append("ReadonlyRootFilesystem: ").append(getReadonlyRootFilesystem()).append(",");
        if (getRepositoryCredentials() != null)
            sb.append("RepositoryCredentials: ").append(getRepositoryCredentials()).append(",");
        if (getResourceRequirements() != null)
            sb.append("ResourceRequirements: ").append(getResourceRequirements()).append(",");
        if (getSecrets() != null)
            sb.append("Secrets: ").append(getSecrets()).append(",");
        if (getStartTimeout() != null)
            sb.append("StartTimeout: ").append(getStartTimeout()).append(",");
        if (getStopTimeout() != null)
            sb.append("StopTimeout: ").append(getStopTimeout()).append(",");
        if (getSystemControls() != null)
            sb.append("SystemControls: ").append(getSystemControls()).append(",");
        if (getUlimits() != null)
            sb.append("Ulimits: ").append(getUlimits()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getVolumesFrom() != null)
            sb.append("VolumesFrom: ").append(getVolumesFrom()).append(",");
        if (getWorkingDirectory() != null)
            sb.append("WorkingDirectory: ").append(getWorkingDirectory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionContainerDefinitionsDetails == false)
            return false;
        AwsEcsTaskDefinitionContainerDefinitionsDetails other = (AwsEcsTaskDefinitionContainerDefinitionsDetails) obj;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getDependsOn() == null ^ this.getDependsOn() == null)
            return false;
        if (other.getDependsOn() != null && other.getDependsOn().equals(this.getDependsOn()) == false)
            return false;
        if (other.getDisableNetworking() == null ^ this.getDisableNetworking() == null)
            return false;
        if (other.getDisableNetworking() != null && other.getDisableNetworking().equals(this.getDisableNetworking()) == false)
            return false;
        if (other.getDnsSearchDomains() == null ^ this.getDnsSearchDomains() == null)
            return false;
        if (other.getDnsSearchDomains() != null && other.getDnsSearchDomains().equals(this.getDnsSearchDomains()) == false)
            return false;
        if (other.getDnsServers() == null ^ this.getDnsServers() == null)
            return false;
        if (other.getDnsServers() != null && other.getDnsServers().equals(this.getDnsServers()) == false)
            return false;
        if (other.getDockerLabels() == null ^ this.getDockerLabels() == null)
            return false;
        if (other.getDockerLabels() != null && other.getDockerLabels().equals(this.getDockerLabels()) == false)
            return false;
        if (other.getDockerSecurityOptions() == null ^ this.getDockerSecurityOptions() == null)
            return false;
        if (other.getDockerSecurityOptions() != null && other.getDockerSecurityOptions().equals(this.getDockerSecurityOptions()) == false)
            return false;
        if (other.getEntryPoint() == null ^ this.getEntryPoint() == null)
            return false;
        if (other.getEntryPoint() != null && other.getEntryPoint().equals(this.getEntryPoint()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getEnvironmentFiles() == null ^ this.getEnvironmentFiles() == null)
            return false;
        if (other.getEnvironmentFiles() != null && other.getEnvironmentFiles().equals(this.getEnvironmentFiles()) == false)
            return false;
        if (other.getEssential() == null ^ this.getEssential() == null)
            return false;
        if (other.getEssential() != null && other.getEssential().equals(this.getEssential()) == false)
            return false;
        if (other.getExtraHosts() == null ^ this.getExtraHosts() == null)
            return false;
        if (other.getExtraHosts() != null && other.getExtraHosts().equals(this.getExtraHosts()) == false)
            return false;
        if (other.getFirelensConfiguration() == null ^ this.getFirelensConfiguration() == null)
            return false;
        if (other.getFirelensConfiguration() != null && other.getFirelensConfiguration().equals(this.getFirelensConfiguration()) == false)
            return false;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getInteractive() == null ^ this.getInteractive() == null)
            return false;
        if (other.getInteractive() != null && other.getInteractive().equals(this.getInteractive()) == false)
            return false;
        if (other.getLinks() == null ^ this.getLinks() == null)
            return false;
        if (other.getLinks() != null && other.getLinks().equals(this.getLinks()) == false)
            return false;
        if (other.getLinuxParameters() == null ^ this.getLinuxParameters() == null)
            return false;
        if (other.getLinuxParameters() != null && other.getLinuxParameters().equals(this.getLinuxParameters()) == false)
            return false;
        if (other.getLogConfiguration() == null ^ this.getLogConfiguration() == null)
            return false;
        if (other.getLogConfiguration() != null && other.getLogConfiguration().equals(this.getLogConfiguration()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getMemoryReservation() == null ^ this.getMemoryReservation() == null)
            return false;
        if (other.getMemoryReservation() != null && other.getMemoryReservation().equals(this.getMemoryReservation()) == false)
            return false;
        if (other.getMountPoints() == null ^ this.getMountPoints() == null)
            return false;
        if (other.getMountPoints() != null && other.getMountPoints().equals(this.getMountPoints()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPortMappings() == null ^ this.getPortMappings() == null)
            return false;
        if (other.getPortMappings() != null && other.getPortMappings().equals(this.getPortMappings()) == false)
            return false;
        if (other.getPrivileged() == null ^ this.getPrivileged() == null)
            return false;
        if (other.getPrivileged() != null && other.getPrivileged().equals(this.getPrivileged()) == false)
            return false;
        if (other.getPseudoTerminal() == null ^ this.getPseudoTerminal() == null)
            return false;
        if (other.getPseudoTerminal() != null && other.getPseudoTerminal().equals(this.getPseudoTerminal()) == false)
            return false;
        if (other.getReadonlyRootFilesystem() == null ^ this.getReadonlyRootFilesystem() == null)
            return false;
        if (other.getReadonlyRootFilesystem() != null && other.getReadonlyRootFilesystem().equals(this.getReadonlyRootFilesystem()) == false)
            return false;
        if (other.getRepositoryCredentials() == null ^ this.getRepositoryCredentials() == null)
            return false;
        if (other.getRepositoryCredentials() != null && other.getRepositoryCredentials().equals(this.getRepositoryCredentials()) == false)
            return false;
        if (other.getResourceRequirements() == null ^ this.getResourceRequirements() == null)
            return false;
        if (other.getResourceRequirements() != null && other.getResourceRequirements().equals(this.getResourceRequirements()) == false)
            return false;
        if (other.getSecrets() == null ^ this.getSecrets() == null)
            return false;
        if (other.getSecrets() != null && other.getSecrets().equals(this.getSecrets()) == false)
            return false;
        if (other.getStartTimeout() == null ^ this.getStartTimeout() == null)
            return false;
        if (other.getStartTimeout() != null && other.getStartTimeout().equals(this.getStartTimeout()) == false)
            return false;
        if (other.getStopTimeout() == null ^ this.getStopTimeout() == null)
            return false;
        if (other.getStopTimeout() != null && other.getStopTimeout().equals(this.getStopTimeout()) == false)
            return false;
        if (other.getSystemControls() == null ^ this.getSystemControls() == null)
            return false;
        if (other.getSystemControls() != null && other.getSystemControls().equals(this.getSystemControls()) == false)
            return false;
        if (other.getUlimits() == null ^ this.getUlimits() == null)
            return false;
        if (other.getUlimits() != null && other.getUlimits().equals(this.getUlimits()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getVolumesFrom() == null ^ this.getVolumesFrom() == null)
            return false;
        if (other.getVolumesFrom() != null && other.getVolumesFrom().equals(this.getVolumesFrom()) == false)
            return false;
        if (other.getWorkingDirectory() == null ^ this.getWorkingDirectory() == null)
            return false;
        if (other.getWorkingDirectory() != null && other.getWorkingDirectory().equals(this.getWorkingDirectory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getDependsOn() == null) ? 0 : getDependsOn().hashCode());
        hashCode = prime * hashCode + ((getDisableNetworking() == null) ? 0 : getDisableNetworking().hashCode());
        hashCode = prime * hashCode + ((getDnsSearchDomains() == null) ? 0 : getDnsSearchDomains().hashCode());
        hashCode = prime * hashCode + ((getDnsServers() == null) ? 0 : getDnsServers().hashCode());
        hashCode = prime * hashCode + ((getDockerLabels() == null) ? 0 : getDockerLabels().hashCode());
        hashCode = prime * hashCode + ((getDockerSecurityOptions() == null) ? 0 : getDockerSecurityOptions().hashCode());
        hashCode = prime * hashCode + ((getEntryPoint() == null) ? 0 : getEntryPoint().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentFiles() == null) ? 0 : getEnvironmentFiles().hashCode());
        hashCode = prime * hashCode + ((getEssential() == null) ? 0 : getEssential().hashCode());
        hashCode = prime * hashCode + ((getExtraHosts() == null) ? 0 : getExtraHosts().hashCode());
        hashCode = prime * hashCode + ((getFirelensConfiguration() == null) ? 0 : getFirelensConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getInteractive() == null) ? 0 : getInteractive().hashCode());
        hashCode = prime * hashCode + ((getLinks() == null) ? 0 : getLinks().hashCode());
        hashCode = prime * hashCode + ((getLinuxParameters() == null) ? 0 : getLinuxParameters().hashCode());
        hashCode = prime * hashCode + ((getLogConfiguration() == null) ? 0 : getLogConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getMemoryReservation() == null) ? 0 : getMemoryReservation().hashCode());
        hashCode = prime * hashCode + ((getMountPoints() == null) ? 0 : getMountPoints().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPortMappings() == null) ? 0 : getPortMappings().hashCode());
        hashCode = prime * hashCode + ((getPrivileged() == null) ? 0 : getPrivileged().hashCode());
        hashCode = prime * hashCode + ((getPseudoTerminal() == null) ? 0 : getPseudoTerminal().hashCode());
        hashCode = prime * hashCode + ((getReadonlyRootFilesystem() == null) ? 0 : getReadonlyRootFilesystem().hashCode());
        hashCode = prime * hashCode + ((getRepositoryCredentials() == null) ? 0 : getRepositoryCredentials().hashCode());
        hashCode = prime * hashCode + ((getResourceRequirements() == null) ? 0 : getResourceRequirements().hashCode());
        hashCode = prime * hashCode + ((getSecrets() == null) ? 0 : getSecrets().hashCode());
        hashCode = prime * hashCode + ((getStartTimeout() == null) ? 0 : getStartTimeout().hashCode());
        hashCode = prime * hashCode + ((getStopTimeout() == null) ? 0 : getStopTimeout().hashCode());
        hashCode = prime * hashCode + ((getSystemControls() == null) ? 0 : getSystemControls().hashCode());
        hashCode = prime * hashCode + ((getUlimits() == null) ? 0 : getUlimits().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getVolumesFrom() == null) ? 0 : getVolumesFrom().hashCode());
        hashCode = prime * hashCode + ((getWorkingDirectory() == null) ? 0 : getWorkingDirectory().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionContainerDefinitionsDetails clone() {
        try {
            return (AwsEcsTaskDefinitionContainerDefinitionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionContainerDefinitionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
