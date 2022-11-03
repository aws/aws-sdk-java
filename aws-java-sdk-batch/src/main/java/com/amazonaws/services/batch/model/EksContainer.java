/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * EKS container properties are used in job definitions for Amazon EKS based job definitions to describe the properties
 * for a container node in the pod that's launched as part of a job. This can't be specified for Amazon ECS based job
 * definitions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksContainer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksContainer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the container. If the name isn't specified, the default name "<code>Default</code>" is used. Each
     * container in a pod must have a unique name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Docker image used to start the container.
     * </p>
     */
    private String image;
    /**
     * <p>
     * The image pull policy for the container. Supported values are <code>Always</code>, <code>IfNotPresent</code>, and
     * <code>Never</code>. This parameter defaults to <code>IfNotPresent</code>. However, if the <code>:latest</code>
     * tag is specified, it defaults to <code>Always</code>. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/containers/images/#updating-images">Updating images</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     */
    private String imagePullPolicy;
    /**
     * <p>
     * The entrypoint for the container. This isn't run within a shell. If this isn't specified, the
     * <code>ENTRYPOINT</code> of the container image is used. Environment variable references are expanded using the
     * container's environment.
     * </p>
     * <p>
     * If the referenced environment variable doesn't exist, the reference in the command isn't changed. For example, if
     * the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable doesn't exist, the
     * command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with <code>$</code> and the
     * resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> will be passed as
     * <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists. The entrypoint
     * can't be updated. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#entrypoint">ENTRYPOINT</a> in the <i>Dockerfile
     * reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command and arguments for a container</a> and <a
     * href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint">Entrypoint</a>
     * in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * An array of arguments to the entrypoint. If this isn't specified, the <code>CMD</code> of the container image is
     * used. This corresponds to the <code>args</code> member in the <a
     * href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint">Entrypoint</a>
     * portion of the <a href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/">Pod</a>
     * in Kubernetes. Environment variable references are expanded using the container's environment.
     * </p>
     * <p>
     * If the referenced environment variable doesn't exist, the reference in the command isn't changed. For example, if
     * the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable doesn't exist, the
     * command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with <code>$</code>, and the
     * resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> is passed as <code>$(VAR_NAME)</code>
     * whether or not the <code>VAR_NAME</code> environment variable exists. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command and arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private java.util.List<String> args;
    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     * variables that Batch sets.
     * </p>
     * </note>
     */
    private java.util.List<EksContainerEnvironmentVariable> env;
    /**
     * <p>
     * The type and amount of resources to assign to a container. The supported resources include <code>memory</code>,
     * <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management for
     * pods and containers</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private EksContainerResourceRequirements resources;
    /**
     * <p>
     * The volume mounts for the container. Batch supports <code>emptyDir</code>, <code>hostPath</code>, and
     * <code>secret</code> volume types. For more information about volumes and volume mounts in Kubernetes, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/">Volumes</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private java.util.List<EksContainerVolumeMount> volumeMounts;
    /**
     * <p>
     * The security context for a job. For more information, see <a
     * href="https://kubernetes.io/docs/tasks/configure-pod-container/security-context/">Configure a security context
     * for a pod or container</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private EksContainerSecurityContext securityContext;

    /**
     * <p>
     * The name of the container. If the name isn't specified, the default name "<code>Default</code>" is used. Each
     * container in a pod must have a unique name.
     * </p>
     * 
     * @param name
     *        The name of the container. If the name isn't specified, the default name "<code>Default</code>" is used.
     *        Each container in a pod must have a unique name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container. If the name isn't specified, the default name "<code>Default</code>" is used. Each
     * container in a pod must have a unique name.
     * </p>
     * 
     * @return The name of the container. If the name isn't specified, the default name "<code>Default</code>" is used.
     *         Each container in a pod must have a unique name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the container. If the name isn't specified, the default name "<code>Default</code>" is used. Each
     * container in a pod must have a unique name.
     * </p>
     * 
     * @param name
     *        The name of the container. If the name isn't specified, the default name "<code>Default</code>" is used.
     *        Each container in a pod must have a unique name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Docker image used to start the container.
     * </p>
     * 
     * @param image
     *        The Docker image used to start the container.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The Docker image used to start the container.
     * </p>
     * 
     * @return The Docker image used to start the container.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The Docker image used to start the container.
     * </p>
     * 
     * @param image
     *        The Docker image used to start the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The image pull policy for the container. Supported values are <code>Always</code>, <code>IfNotPresent</code>, and
     * <code>Never</code>. This parameter defaults to <code>IfNotPresent</code>. However, if the <code>:latest</code>
     * tag is specified, it defaults to <code>Always</code>. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/containers/images/#updating-images">Updating images</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param imagePullPolicy
     *        The image pull policy for the container. Supported values are <code>Always</code>,
     *        <code>IfNotPresent</code>, and <code>Never</code>. This parameter defaults to <code>IfNotPresent</code>.
     *        However, if the <code>:latest</code> tag is specified, it defaults to <code>Always</code>. For more
     *        information, see <a href="https://kubernetes.io/docs/concepts/containers/images/#updating-images">Updating
     *        images</a> in the <i>Kubernetes documentation</i>.
     */

    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    /**
     * <p>
     * The image pull policy for the container. Supported values are <code>Always</code>, <code>IfNotPresent</code>, and
     * <code>Never</code>. This parameter defaults to <code>IfNotPresent</code>. However, if the <code>:latest</code>
     * tag is specified, it defaults to <code>Always</code>. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/containers/images/#updating-images">Updating images</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return The image pull policy for the container. Supported values are <code>Always</code>,
     *         <code>IfNotPresent</code>, and <code>Never</code>. This parameter defaults to <code>IfNotPresent</code>.
     *         However, if the <code>:latest</code> tag is specified, it defaults to <code>Always</code>. For more
     *         information, see <a
     *         href="https://kubernetes.io/docs/concepts/containers/images/#updating-images">Updating images</a> in the
     *         <i>Kubernetes documentation</i>.
     */

    public String getImagePullPolicy() {
        return this.imagePullPolicy;
    }

    /**
     * <p>
     * The image pull policy for the container. Supported values are <code>Always</code>, <code>IfNotPresent</code>, and
     * <code>Never</code>. This parameter defaults to <code>IfNotPresent</code>. However, if the <code>:latest</code>
     * tag is specified, it defaults to <code>Always</code>. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/containers/images/#updating-images">Updating images</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param imagePullPolicy
     *        The image pull policy for the container. Supported values are <code>Always</code>,
     *        <code>IfNotPresent</code>, and <code>Never</code>. This parameter defaults to <code>IfNotPresent</code>.
     *        However, if the <code>:latest</code> tag is specified, it defaults to <code>Always</code>. For more
     *        information, see <a href="https://kubernetes.io/docs/concepts/containers/images/#updating-images">Updating
     *        images</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withImagePullPolicy(String imagePullPolicy) {
        setImagePullPolicy(imagePullPolicy);
        return this;
    }

    /**
     * <p>
     * The entrypoint for the container. This isn't run within a shell. If this isn't specified, the
     * <code>ENTRYPOINT</code> of the container image is used. Environment variable references are expanded using the
     * container's environment.
     * </p>
     * <p>
     * If the referenced environment variable doesn't exist, the reference in the command isn't changed. For example, if
     * the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable doesn't exist, the
     * command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with <code>$</code> and the
     * resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> will be passed as
     * <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists. The entrypoint
     * can't be updated. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#entrypoint">ENTRYPOINT</a> in the <i>Dockerfile
     * reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command and arguments for a container</a> and <a
     * href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint">Entrypoint</a>
     * in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return The entrypoint for the container. This isn't run within a shell. If this isn't specified, the
     *         <code>ENTRYPOINT</code> of the container image is used. Environment variable references are expanded
     *         using the container's environment.</p>
     *         <p>
     *         If the referenced environment variable doesn't exist, the reference in the command isn't changed. For
     *         example, if the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable
     *         doesn't exist, the command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with
     *         <code>$</code> and the resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> will be
     *         passed as <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists.
     *         The entrypoint can't be updated. For more information, see <a
     *         href="https://docs.docker.com/engine/reference/builder/#entrypoint">ENTRYPOINT</a> in the <i>Dockerfile
     *         reference</i> and <a
     *         href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define
     *         a command and arguments for a container</a> and <a
     *         href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint"
     *         >Entrypoint</a> in the <i>Kubernetes documentation</i>.
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * The entrypoint for the container. This isn't run within a shell. If this isn't specified, the
     * <code>ENTRYPOINT</code> of the container image is used. Environment variable references are expanded using the
     * container's environment.
     * </p>
     * <p>
     * If the referenced environment variable doesn't exist, the reference in the command isn't changed. For example, if
     * the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable doesn't exist, the
     * command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with <code>$</code> and the
     * resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> will be passed as
     * <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists. The entrypoint
     * can't be updated. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#entrypoint">ENTRYPOINT</a> in the <i>Dockerfile
     * reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command and arguments for a container</a> and <a
     * href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint">Entrypoint</a>
     * in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param command
     *        The entrypoint for the container. This isn't run within a shell. If this isn't specified, the
     *        <code>ENTRYPOINT</code> of the container image is used. Environment variable references are expanded using
     *        the container's environment.</p>
     *        <p>
     *        If the referenced environment variable doesn't exist, the reference in the command isn't changed. For
     *        example, if the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable
     *        doesn't exist, the command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with
     *        <code>$</code> and the resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> will be
     *        passed as <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists.
     *        The entrypoint can't be updated. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/builder/#entrypoint">ENTRYPOINT</a> in the <i>Dockerfile
     *        reference</i> and <a
     *        href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define
     *        a command and arguments for a container</a> and <a
     *        href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint"
     *        >Entrypoint</a> in the <i>Kubernetes documentation</i>.
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
     * The entrypoint for the container. This isn't run within a shell. If this isn't specified, the
     * <code>ENTRYPOINT</code> of the container image is used. Environment variable references are expanded using the
     * container's environment.
     * </p>
     * <p>
     * If the referenced environment variable doesn't exist, the reference in the command isn't changed. For example, if
     * the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable doesn't exist, the
     * command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with <code>$</code> and the
     * resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> will be passed as
     * <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists. The entrypoint
     * can't be updated. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#entrypoint">ENTRYPOINT</a> in the <i>Dockerfile
     * reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command and arguments for a container</a> and <a
     * href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint">Entrypoint</a>
     * in the <i>Kubernetes documentation</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The entrypoint for the container. This isn't run within a shell. If this isn't specified, the
     *        <code>ENTRYPOINT</code> of the container image is used. Environment variable references are expanded using
     *        the container's environment.</p>
     *        <p>
     *        If the referenced environment variable doesn't exist, the reference in the command isn't changed. For
     *        example, if the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable
     *        doesn't exist, the command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with
     *        <code>$</code> and the resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> will be
     *        passed as <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists.
     *        The entrypoint can't be updated. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/builder/#entrypoint">ENTRYPOINT</a> in the <i>Dockerfile
     *        reference</i> and <a
     *        href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define
     *        a command and arguments for a container</a> and <a
     *        href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint"
     *        >Entrypoint</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withCommand(String... command) {
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
     * The entrypoint for the container. This isn't run within a shell. If this isn't specified, the
     * <code>ENTRYPOINT</code> of the container image is used. Environment variable references are expanded using the
     * container's environment.
     * </p>
     * <p>
     * If the referenced environment variable doesn't exist, the reference in the command isn't changed. For example, if
     * the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable doesn't exist, the
     * command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with <code>$</code> and the
     * resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> will be passed as
     * <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists. The entrypoint
     * can't be updated. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#entrypoint">ENTRYPOINT</a> in the <i>Dockerfile
     * reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command and arguments for a container</a> and <a
     * href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint">Entrypoint</a>
     * in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param command
     *        The entrypoint for the container. This isn't run within a shell. If this isn't specified, the
     *        <code>ENTRYPOINT</code> of the container image is used. Environment variable references are expanded using
     *        the container's environment.</p>
     *        <p>
     *        If the referenced environment variable doesn't exist, the reference in the command isn't changed. For
     *        example, if the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable
     *        doesn't exist, the command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with
     *        <code>$</code> and the resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> will be
     *        passed as <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists.
     *        The entrypoint can't be updated. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/builder/#entrypoint">ENTRYPOINT</a> in the <i>Dockerfile
     *        reference</i> and <a
     *        href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define
     *        a command and arguments for a container</a> and <a
     *        href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint"
     *        >Entrypoint</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * An array of arguments to the entrypoint. If this isn't specified, the <code>CMD</code> of the container image is
     * used. This corresponds to the <code>args</code> member in the <a
     * href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint">Entrypoint</a>
     * portion of the <a href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/">Pod</a>
     * in Kubernetes. Environment variable references are expanded using the container's environment.
     * </p>
     * <p>
     * If the referenced environment variable doesn't exist, the reference in the command isn't changed. For example, if
     * the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable doesn't exist, the
     * command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with <code>$</code>, and the
     * resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> is passed as <code>$(VAR_NAME)</code>
     * whether or not the <code>VAR_NAME</code> environment variable exists. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command and arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return An array of arguments to the entrypoint. If this isn't specified, the <code>CMD</code> of the container
     *         image is used. This corresponds to the <code>args</code> member in the <a
     *         href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint"
     *         >Entrypoint</a> portion of the <a
     *         href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/">Pod</a> in
     *         Kubernetes. Environment variable references are expanded using the container's environment.</p>
     *         <p>
     *         If the referenced environment variable doesn't exist, the reference in the command isn't changed. For
     *         example, if the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable
     *         doesn't exist, the command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with
     *         <code>$</code>, and the resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> is passed
     *         as <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists. For
     *         more information, see <a href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the
     *         <i>Dockerfile reference</i> and <a
     *         href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define
     *         a command and arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     */

    public java.util.List<String> getArgs() {
        return args;
    }

    /**
     * <p>
     * An array of arguments to the entrypoint. If this isn't specified, the <code>CMD</code> of the container image is
     * used. This corresponds to the <code>args</code> member in the <a
     * href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint">Entrypoint</a>
     * portion of the <a href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/">Pod</a>
     * in Kubernetes. Environment variable references are expanded using the container's environment.
     * </p>
     * <p>
     * If the referenced environment variable doesn't exist, the reference in the command isn't changed. For example, if
     * the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable doesn't exist, the
     * command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with <code>$</code>, and the
     * resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> is passed as <code>$(VAR_NAME)</code>
     * whether or not the <code>VAR_NAME</code> environment variable exists. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command and arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param args
     *        An array of arguments to the entrypoint. If this isn't specified, the <code>CMD</code> of the container
     *        image is used. This corresponds to the <code>args</code> member in the <a
     *        href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint"
     *        >Entrypoint</a> portion of the <a
     *        href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/">Pod</a> in
     *        Kubernetes. Environment variable references are expanded using the container's environment.</p>
     *        <p>
     *        If the referenced environment variable doesn't exist, the reference in the command isn't changed. For
     *        example, if the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable
     *        doesn't exist, the command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with
     *        <code>$</code>, and the resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> is passed
     *        as <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists. For more
     *        information, see <a href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the
     *        <i>Dockerfile reference</i> and <a
     *        href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define
     *        a command and arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     */

    public void setArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
            return;
        }

        this.args = new java.util.ArrayList<String>(args);
    }

    /**
     * <p>
     * An array of arguments to the entrypoint. If this isn't specified, the <code>CMD</code> of the container image is
     * used. This corresponds to the <code>args</code> member in the <a
     * href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint">Entrypoint</a>
     * portion of the <a href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/">Pod</a>
     * in Kubernetes. Environment variable references are expanded using the container's environment.
     * </p>
     * <p>
     * If the referenced environment variable doesn't exist, the reference in the command isn't changed. For example, if
     * the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable doesn't exist, the
     * command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with <code>$</code>, and the
     * resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> is passed as <code>$(VAR_NAME)</code>
     * whether or not the <code>VAR_NAME</code> environment variable exists. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command and arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArgs(java.util.Collection)} or {@link #withArgs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param args
     *        An array of arguments to the entrypoint. If this isn't specified, the <code>CMD</code> of the container
     *        image is used. This corresponds to the <code>args</code> member in the <a
     *        href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint"
     *        >Entrypoint</a> portion of the <a
     *        href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/">Pod</a> in
     *        Kubernetes. Environment variable references are expanded using the container's environment.</p>
     *        <p>
     *        If the referenced environment variable doesn't exist, the reference in the command isn't changed. For
     *        example, if the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable
     *        doesn't exist, the command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with
     *        <code>$</code>, and the resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> is passed
     *        as <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists. For more
     *        information, see <a href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the
     *        <i>Dockerfile reference</i> and <a
     *        href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define
     *        a command and arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withArgs(String... args) {
        if (this.args == null) {
            setArgs(new java.util.ArrayList<String>(args.length));
        }
        for (String ele : args) {
            this.args.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of arguments to the entrypoint. If this isn't specified, the <code>CMD</code> of the container image is
     * used. This corresponds to the <code>args</code> member in the <a
     * href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint">Entrypoint</a>
     * portion of the <a href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/">Pod</a>
     * in Kubernetes. Environment variable references are expanded using the container's environment.
     * </p>
     * <p>
     * If the referenced environment variable doesn't exist, the reference in the command isn't changed. For example, if
     * the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable doesn't exist, the
     * command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with <code>$</code>, and the
     * resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> is passed as <code>$(VAR_NAME)</code>
     * whether or not the <code>VAR_NAME</code> environment variable exists. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command and arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param args
     *        An array of arguments to the entrypoint. If this isn't specified, the <code>CMD</code> of the container
     *        image is used. This corresponds to the <code>args</code> member in the <a
     *        href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint"
     *        >Entrypoint</a> portion of the <a
     *        href="https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/">Pod</a> in
     *        Kubernetes. Environment variable references are expanded using the container's environment.</p>
     *        <p>
     *        If the referenced environment variable doesn't exist, the reference in the command isn't changed. For
     *        example, if the reference is to "<code>$(NAME1)</code>" and the <code>NAME1</code> environment variable
     *        doesn't exist, the command string will remain "<code>$(NAME1)</code>." <code>$$</code> is replaced with
     *        <code>$</code>, and the resulting string isn't expanded. For example, <code>$$(VAR_NAME)</code> is passed
     *        as <code>$(VAR_NAME)</code> whether or not the <code>VAR_NAME</code> environment variable exists. For more
     *        information, see <a href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the
     *        <i>Dockerfile reference</i> and <a
     *        href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define
     *        a command and arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withArgs(java.util.Collection<String> args) {
        setArgs(args);
        return this;
    }

    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     * variables that Batch sets.
     * </p>
     * </note>
     * 
     * @return The environment variables to pass to a container.</p> <note>
     *         <p>
     *         Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     *         variables that Batch sets.
     *         </p>
     */

    public java.util.List<EksContainerEnvironmentVariable> getEnv() {
        return env;
    }

    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     * variables that Batch sets.
     * </p>
     * </note>
     * 
     * @param env
     *        The environment variables to pass to a container.</p> <note>
     *        <p>
     *        Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     */

    public void setEnv(java.util.Collection<EksContainerEnvironmentVariable> env) {
        if (env == null) {
            this.env = null;
            return;
        }

        this.env = new java.util.ArrayList<EksContainerEnvironmentVariable>(env);
    }

    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     * variables that Batch sets.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnv(java.util.Collection)} or {@link #withEnv(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param env
     *        The environment variables to pass to a container.</p> <note>
     *        <p>
     *        Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withEnv(EksContainerEnvironmentVariable... env) {
        if (this.env == null) {
            setEnv(new java.util.ArrayList<EksContainerEnvironmentVariable>(env.length));
        }
        for (EksContainerEnvironmentVariable ele : env) {
            this.env.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     * variables that Batch sets.
     * </p>
     * </note>
     * 
     * @param env
     *        The environment variables to pass to a container.</p> <note>
     *        <p>
     *        Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withEnv(java.util.Collection<EksContainerEnvironmentVariable> env) {
        setEnv(env);
        return this;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. The supported resources include <code>memory</code>,
     * <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management for
     * pods and containers</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param resources
     *        The type and amount of resources to assign to a container. The supported resources include
     *        <code>memory</code>, <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management
     *        for pods and containers</a> in the <i>Kubernetes documentation</i>.
     */

    public void setResources(EksContainerResourceRequirements resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. The supported resources include <code>memory</code>,
     * <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management for
     * pods and containers</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return The type and amount of resources to assign to a container. The supported resources include
     *         <code>memory</code>, <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more information, see <a
     *         href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management
     *         for pods and containers</a> in the <i>Kubernetes documentation</i>.
     */

    public EksContainerResourceRequirements getResources() {
        return this.resources;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. The supported resources include <code>memory</code>,
     * <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management for
     * pods and containers</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param resources
     *        The type and amount of resources to assign to a container. The supported resources include
     *        <code>memory</code>, <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management
     *        for pods and containers</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withResources(EksContainerResourceRequirements resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The volume mounts for the container. Batch supports <code>emptyDir</code>, <code>hostPath</code>, and
     * <code>secret</code> volume types. For more information about volumes and volume mounts in Kubernetes, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/">Volumes</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return The volume mounts for the container. Batch supports <code>emptyDir</code>, <code>hostPath</code>, and
     *         <code>secret</code> volume types. For more information about volumes and volume mounts in Kubernetes, see
     *         <a href="https://kubernetes.io/docs/concepts/storage/volumes/">Volumes</a> in the <i>Kubernetes
     *         documentation</i>.
     */

    public java.util.List<EksContainerVolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * <p>
     * The volume mounts for the container. Batch supports <code>emptyDir</code>, <code>hostPath</code>, and
     * <code>secret</code> volume types. For more information about volumes and volume mounts in Kubernetes, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/">Volumes</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param volumeMounts
     *        The volume mounts for the container. Batch supports <code>emptyDir</code>, <code>hostPath</code>, and
     *        <code>secret</code> volume types. For more information about volumes and volume mounts in Kubernetes, see
     *        <a href="https://kubernetes.io/docs/concepts/storage/volumes/">Volumes</a> in the <i>Kubernetes
     *        documentation</i>.
     */

    public void setVolumeMounts(java.util.Collection<EksContainerVolumeMount> volumeMounts) {
        if (volumeMounts == null) {
            this.volumeMounts = null;
            return;
        }

        this.volumeMounts = new java.util.ArrayList<EksContainerVolumeMount>(volumeMounts);
    }

    /**
     * <p>
     * The volume mounts for the container. Batch supports <code>emptyDir</code>, <code>hostPath</code>, and
     * <code>secret</code> volume types. For more information about volumes and volume mounts in Kubernetes, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/">Volumes</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeMounts(java.util.Collection)} or {@link #withVolumeMounts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumeMounts
     *        The volume mounts for the container. Batch supports <code>emptyDir</code>, <code>hostPath</code>, and
     *        <code>secret</code> volume types. For more information about volumes and volume mounts in Kubernetes, see
     *        <a href="https://kubernetes.io/docs/concepts/storage/volumes/">Volumes</a> in the <i>Kubernetes
     *        documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withVolumeMounts(EksContainerVolumeMount... volumeMounts) {
        if (this.volumeMounts == null) {
            setVolumeMounts(new java.util.ArrayList<EksContainerVolumeMount>(volumeMounts.length));
        }
        for (EksContainerVolumeMount ele : volumeMounts) {
            this.volumeMounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The volume mounts for the container. Batch supports <code>emptyDir</code>, <code>hostPath</code>, and
     * <code>secret</code> volume types. For more information about volumes and volume mounts in Kubernetes, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/">Volumes</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param volumeMounts
     *        The volume mounts for the container. Batch supports <code>emptyDir</code>, <code>hostPath</code>, and
     *        <code>secret</code> volume types. For more information about volumes and volume mounts in Kubernetes, see
     *        <a href="https://kubernetes.io/docs/concepts/storage/volumes/">Volumes</a> in the <i>Kubernetes
     *        documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withVolumeMounts(java.util.Collection<EksContainerVolumeMount> volumeMounts) {
        setVolumeMounts(volumeMounts);
        return this;
    }

    /**
     * <p>
     * The security context for a job. For more information, see <a
     * href="https://kubernetes.io/docs/tasks/configure-pod-container/security-context/">Configure a security context
     * for a pod or container</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param securityContext
     *        The security context for a job. For more information, see <a
     *        href="https://kubernetes.io/docs/tasks/configure-pod-container/security-context/">Configure a security
     *        context for a pod or container</a> in the <i>Kubernetes documentation</i>.
     */

    public void setSecurityContext(EksContainerSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * <p>
     * The security context for a job. For more information, see <a
     * href="https://kubernetes.io/docs/tasks/configure-pod-container/security-context/">Configure a security context
     * for a pod or container</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return The security context for a job. For more information, see <a
     *         href="https://kubernetes.io/docs/tasks/configure-pod-container/security-context/">Configure a security
     *         context for a pod or container</a> in the <i>Kubernetes documentation</i>.
     */

    public EksContainerSecurityContext getSecurityContext() {
        return this.securityContext;
    }

    /**
     * <p>
     * The security context for a job. For more information, see <a
     * href="https://kubernetes.io/docs/tasks/configure-pod-container/security-context/">Configure a security context
     * for a pod or container</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param securityContext
     *        The security context for a job. For more information, see <a
     *        href="https://kubernetes.io/docs/tasks/configure-pod-container/security-context/">Configure a security
     *        context for a pod or container</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainer withSecurityContext(EksContainerSecurityContext securityContext) {
        setSecurityContext(securityContext);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getImagePullPolicy() != null)
            sb.append("ImagePullPolicy: ").append(getImagePullPolicy()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getArgs() != null)
            sb.append("Args: ").append(getArgs()).append(",");
        if (getEnv() != null)
            sb.append("Env: ").append(getEnv()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getVolumeMounts() != null)
            sb.append("VolumeMounts: ").append(getVolumeMounts()).append(",");
        if (getSecurityContext() != null)
            sb.append("SecurityContext: ").append(getSecurityContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksContainer == false)
            return false;
        EksContainer other = (EksContainer) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getImagePullPolicy() == null ^ this.getImagePullPolicy() == null)
            return false;
        if (other.getImagePullPolicy() != null && other.getImagePullPolicy().equals(this.getImagePullPolicy()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        if (other.getEnv() == null ^ this.getEnv() == null)
            return false;
        if (other.getEnv() != null && other.getEnv().equals(this.getEnv()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getVolumeMounts() == null ^ this.getVolumeMounts() == null)
            return false;
        if (other.getVolumeMounts() != null && other.getVolumeMounts().equals(this.getVolumeMounts()) == false)
            return false;
        if (other.getSecurityContext() == null ^ this.getSecurityContext() == null)
            return false;
        if (other.getSecurityContext() != null && other.getSecurityContext().equals(this.getSecurityContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getImagePullPolicy() == null) ? 0 : getImagePullPolicy().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        hashCode = prime * hashCode + ((getEnv() == null) ? 0 : getEnv().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getVolumeMounts() == null) ? 0 : getVolumeMounts().hashCode());
        hashCode = prime * hashCode + ((getSecurityContext() == null) ? 0 : getSecurityContext().hashCode());
        return hashCode;
    }

    @Override
    public EksContainer clone() {
        try {
            return (EksContainer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksContainerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
