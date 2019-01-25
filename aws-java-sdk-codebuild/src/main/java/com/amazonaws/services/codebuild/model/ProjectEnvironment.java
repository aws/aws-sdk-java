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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the build environment of the build project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ProjectEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectEnvironment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The image tag or image digest that identifies the Docker image to use for this build project. Use the following
     * formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an image tag: <code>registry/repository:tag</code>. For example, to specify an image with the tag "latest,"
     * use <code>registry/repository:latest</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an image digest: <code>registry/repository@digest</code>. For example, to specify an image with the digest
     * "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     * <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String image;
    /**
     * <p>
     * Information about the compute resources the build project uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * </ul>
     */
    private String computeType;
    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     */
    private java.util.List<EnvironmentVariable> environmentVariables;
    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is be used to
     * build Docker images, and the specified build environment image is not provided by AWS CodeBuild with Docker
     * support. Otherwise, all associated builds that attempt to interact with the Docker daemon fail. You must also
     * start the Docker daemon so that builds can interact with it. One way to do this is to initialize the Docker
     * daemon during the install phase of your build spec by running the following build commands. (Do not run these
     * commands if the specified build environment image is provided by AWS CodeBuild with Docker support.)
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux, add the <code>-t</code> argument to <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 -t sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     */
    private Boolean privilegedMode;
    /**
     * <p>
     * The certificate to use with this build project.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     */
    private RegistryCredential registryCredential;
    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an
     * AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     */
    private String imagePullCredentialsType;

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * 
     * @param type
     *        The type of build environment to use for related builds.
     * @see EnvironmentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * 
     * @return The type of build environment to use for related builds.
     * @see EnvironmentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * 
     * @param type
     *        The type of build environment to use for related builds.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public ProjectEnvironment withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * 
     * @param type
     *        The type of build environment to use for related builds.
     * @see EnvironmentType
     */

    public void setType(EnvironmentType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * 
     * @param type
     *        The type of build environment to use for related builds.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public ProjectEnvironment withType(EnvironmentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The image tag or image digest that identifies the Docker image to use for this build project. Use the following
     * formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an image tag: <code>registry/repository:tag</code>. For example, to specify an image with the tag "latest,"
     * use <code>registry/repository:latest</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an image digest: <code>registry/repository@digest</code>. For example, to specify an image with the digest
     * "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     * <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param image
     *        The image tag or image digest that identifies the Docker image to use for this build project. Use the
     *        following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an image tag: <code>registry/repository:tag</code>. For example, to specify an image with the tag
     *        "latest," use <code>registry/repository:latest</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an image digest: <code>registry/repository@digest</code>. For example, to specify an image with the
     *        digest "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     *        <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>.
     *        </p>
     *        </li>
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The image tag or image digest that identifies the Docker image to use for this build project. Use the following
     * formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an image tag: <code>registry/repository:tag</code>. For example, to specify an image with the tag "latest,"
     * use <code>registry/repository:latest</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an image digest: <code>registry/repository@digest</code>. For example, to specify an image with the digest
     * "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     * <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The image tag or image digest that identifies the Docker image to use for this build project. Use the
     *         following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For an image tag: <code>registry/repository:tag</code>. For example, to specify an image with the tag
     *         "latest," use <code>registry/repository:latest</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an image digest: <code>registry/repository@digest</code>. For example, to specify an image with the
     *         digest "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     *         <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>.
     *         </p>
     *         </li>
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The image tag or image digest that identifies the Docker image to use for this build project. Use the following
     * formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an image tag: <code>registry/repository:tag</code>. For example, to specify an image with the tag "latest,"
     * use <code>registry/repository:latest</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an image digest: <code>registry/repository@digest</code>. For example, to specify an image with the digest
     * "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     * <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param image
     *        The image tag or image digest that identifies the Docker image to use for this build project. Use the
     *        following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an image tag: <code>registry/repository:tag</code>. For example, to specify an image with the tag
     *        "latest," use <code>registry/repository:latest</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an image digest: <code>registry/repository@digest</code>. For example, to specify an image with the
     *        digest "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     *        <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        Information about the compute resources the build project uses. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     * @see ComputeType
     */

    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the compute resources the build project uses. Available values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     *         </p>
     *         </li>
     * @see ComputeType
     */

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        Information about the compute resources the build project uses. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public ProjectEnvironment withComputeType(String computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        Information about the compute resources the build project uses. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     * @see ComputeType
     */

    public void setComputeType(ComputeType computeType) {
        withComputeType(computeType);
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        Information about the compute resources the build project uses. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public ProjectEnvironment withComputeType(ComputeType computeType) {
        this.computeType = computeType.toString();
        return this;
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     * 
     * @return A set of environment variables to make available to builds for this build project.
     */

    public java.util.List<EnvironmentVariable> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     * 
     * @param environmentVariables
     *        A set of environment variables to make available to builds for this build project.
     */

    public void setEnvironmentVariables(java.util.Collection<EnvironmentVariable> environmentVariables) {
        if (environmentVariables == null) {
            this.environmentVariables = null;
            return;
        }

        this.environmentVariables = new java.util.ArrayList<EnvironmentVariable>(environmentVariables);
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentVariables(java.util.Collection)} or {@link #withEnvironmentVariables(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param environmentVariables
     *        A set of environment variables to make available to builds for this build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withEnvironmentVariables(EnvironmentVariable... environmentVariables) {
        if (this.environmentVariables == null) {
            setEnvironmentVariables(new java.util.ArrayList<EnvironmentVariable>(environmentVariables.length));
        }
        for (EnvironmentVariable ele : environmentVariables) {
            this.environmentVariables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     * 
     * @param environmentVariables
     *        A set of environment variables to make available to builds for this build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withEnvironmentVariables(java.util.Collection<EnvironmentVariable> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is be used to
     * build Docker images, and the specified build environment image is not provided by AWS CodeBuild with Docker
     * support. Otherwise, all associated builds that attempt to interact with the Docker daemon fail. You must also
     * start the Docker daemon so that builds can interact with it. One way to do this is to initialize the Docker
     * daemon during the install phase of your build spec by running the following build commands. (Do not run these
     * commands if the specified build environment image is provided by AWS CodeBuild with Docker support.)
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux, add the <code>-t</code> argument to <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 -t sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * 
     * @param privilegedMode
     *        Enables running the Docker daemon inside a Docker container. Set to true only if the build project is be
     *        used to build Docker images, and the specified build environment image is not provided by AWS CodeBuild
     *        with Docker support. Otherwise, all associated builds that attempt to interact with the Docker daemon
     *        fail. You must also start the Docker daemon so that builds can interact with it. One way to do this is to
     *        initialize the Docker daemon during the install phase of your build spec by running the following build
     *        commands. (Do not run these commands if the specified build environment image is provided by AWS CodeBuild
     *        with Docker support.)</p>
     *        <p>
     *        If the operating system's base image is Ubuntu Linux:
     *        </p>
     *        <p>
     *        <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *        </p>
     *        <p>
     *        If the operating system's base image is Alpine Linux, add the <code>-t</code> argument to
     *        <code>timeout</code>:
     *        </p>
     *        <p>
     *        <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 -t sh -c "until docker info; do echo .; sleep 1; done"</code>
     */

    public void setPrivilegedMode(Boolean privilegedMode) {
        this.privilegedMode = privilegedMode;
    }

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is be used to
     * build Docker images, and the specified build environment image is not provided by AWS CodeBuild with Docker
     * support. Otherwise, all associated builds that attempt to interact with the Docker daemon fail. You must also
     * start the Docker daemon so that builds can interact with it. One way to do this is to initialize the Docker
     * daemon during the install phase of your build spec by running the following build commands. (Do not run these
     * commands if the specified build environment image is provided by AWS CodeBuild with Docker support.)
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux, add the <code>-t</code> argument to <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 -t sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * 
     * @return Enables running the Docker daemon inside a Docker container. Set to true only if the build project is be
     *         used to build Docker images, and the specified build environment image is not provided by AWS CodeBuild
     *         with Docker support. Otherwise, all associated builds that attempt to interact with the Docker daemon
     *         fail. You must also start the Docker daemon so that builds can interact with it. One way to do this is to
     *         initialize the Docker daemon during the install phase of your build spec by running the following build
     *         commands. (Do not run these commands if the specified build environment image is provided by AWS
     *         CodeBuild with Docker support.)</p>
     *         <p>
     *         If the operating system's base image is Ubuntu Linux:
     *         </p>
     *         <p>
     *         <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *         </p>
     *         <p>
     *         If the operating system's base image is Alpine Linux, add the <code>-t</code> argument to
     *         <code>timeout</code>:
     *         </p>
     *         <p>
     *         <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 -t sh -c "until docker info; do echo .; sleep 1; done"</code>
     */

    public Boolean getPrivilegedMode() {
        return this.privilegedMode;
    }

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is be used to
     * build Docker images, and the specified build environment image is not provided by AWS CodeBuild with Docker
     * support. Otherwise, all associated builds that attempt to interact with the Docker daemon fail. You must also
     * start the Docker daemon so that builds can interact with it. One way to do this is to initialize the Docker
     * daemon during the install phase of your build spec by running the following build commands. (Do not run these
     * commands if the specified build environment image is provided by AWS CodeBuild with Docker support.)
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux, add the <code>-t</code> argument to <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 -t sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * 
     * @param privilegedMode
     *        Enables running the Docker daemon inside a Docker container. Set to true only if the build project is be
     *        used to build Docker images, and the specified build environment image is not provided by AWS CodeBuild
     *        with Docker support. Otherwise, all associated builds that attempt to interact with the Docker daemon
     *        fail. You must also start the Docker daemon so that builds can interact with it. One way to do this is to
     *        initialize the Docker daemon during the install phase of your build spec by running the following build
     *        commands. (Do not run these commands if the specified build environment image is provided by AWS CodeBuild
     *        with Docker support.)</p>
     *        <p>
     *        If the operating system's base image is Ubuntu Linux:
     *        </p>
     *        <p>
     *        <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *        </p>
     *        <p>
     *        If the operating system's base image is Alpine Linux, add the <code>-t</code> argument to
     *        <code>timeout</code>:
     *        </p>
     *        <p>
     *        <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 -t sh -c "until docker info; do echo .; sleep 1; done"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withPrivilegedMode(Boolean privilegedMode) {
        setPrivilegedMode(privilegedMode);
        return this;
    }

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is be used to
     * build Docker images, and the specified build environment image is not provided by AWS CodeBuild with Docker
     * support. Otherwise, all associated builds that attempt to interact with the Docker daemon fail. You must also
     * start the Docker daemon so that builds can interact with it. One way to do this is to initialize the Docker
     * daemon during the install phase of your build spec by running the following build commands. (Do not run these
     * commands if the specified build environment image is provided by AWS CodeBuild with Docker support.)
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux, add the <code>-t</code> argument to <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 -t sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * 
     * @return Enables running the Docker daemon inside a Docker container. Set to true only if the build project is be
     *         used to build Docker images, and the specified build environment image is not provided by AWS CodeBuild
     *         with Docker support. Otherwise, all associated builds that attempt to interact with the Docker daemon
     *         fail. You must also start the Docker daemon so that builds can interact with it. One way to do this is to
     *         initialize the Docker daemon during the install phase of your build spec by running the following build
     *         commands. (Do not run these commands if the specified build environment image is provided by AWS
     *         CodeBuild with Docker support.)</p>
     *         <p>
     *         If the operating system's base image is Ubuntu Linux:
     *         </p>
     *         <p>
     *         <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *         </p>
     *         <p>
     *         If the operating system's base image is Alpine Linux, add the <code>-t</code> argument to
     *         <code>timeout</code>:
     *         </p>
     *         <p>
     *         <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 -t sh -c "until docker info; do echo .; sleep 1; done"</code>
     */

    public Boolean isPrivilegedMode() {
        return this.privilegedMode;
    }

    /**
     * <p>
     * The certificate to use with this build project.
     * </p>
     * 
     * @param certificate
     *        The certificate to use with this build project.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The certificate to use with this build project.
     * </p>
     * 
     * @return The certificate to use with this build project.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The certificate to use with this build project.
     * </p>
     * 
     * @param certificate
     *        The certificate to use with this build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     * 
     * @param registryCredential
     *        The credentials for access to a private registry.
     */

    public void setRegistryCredential(RegistryCredential registryCredential) {
        this.registryCredential = registryCredential;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     * 
     * @return The credentials for access to a private registry.
     */

    public RegistryCredential getRegistryCredential() {
        return this.registryCredential;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     * 
     * @param registryCredential
     *        The credentials for access to a private registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withRegistryCredential(RegistryCredential registryCredential) {
        setRegistryCredential(registryCredential);
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an
     * AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @param imagePullCredentialsType
     *        The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *        modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you
     *        use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @see ImagePullCredentialsType
     */

    public void setImagePullCredentialsType(String imagePullCredentialsType) {
        this.imagePullCredentialsType = imagePullCredentialsType;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an
     * AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @return The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *         modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you
     *         use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @see ImagePullCredentialsType
     */

    public String getImagePullCredentialsType() {
        return this.imagePullCredentialsType;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an
     * AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @param imagePullCredentialsType
     *        The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *        modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you
     *        use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImagePullCredentialsType
     */

    public ProjectEnvironment withImagePullCredentialsType(String imagePullCredentialsType) {
        setImagePullCredentialsType(imagePullCredentialsType);
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an
     * AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @param imagePullCredentialsType
     *        The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *        modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you
     *        use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @see ImagePullCredentialsType
     */

    public void setImagePullCredentialsType(ImagePullCredentialsType imagePullCredentialsType) {
        withImagePullCredentialsType(imagePullCredentialsType);
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an
     * AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @param imagePullCredentialsType
     *        The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *        modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you
     *        use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImagePullCredentialsType
     */

    public ProjectEnvironment withImagePullCredentialsType(ImagePullCredentialsType imagePullCredentialsType) {
        this.imagePullCredentialsType = imagePullCredentialsType.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getComputeType() != null)
            sb.append("ComputeType: ").append(getComputeType()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables()).append(",");
        if (getPrivilegedMode() != null)
            sb.append("PrivilegedMode: ").append(getPrivilegedMode()).append(",");
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getRegistryCredential() != null)
            sb.append("RegistryCredential: ").append(getRegistryCredential()).append(",");
        if (getImagePullCredentialsType() != null)
            sb.append("ImagePullCredentialsType: ").append(getImagePullCredentialsType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectEnvironment == false)
            return false;
        ProjectEnvironment other = (ProjectEnvironment) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getPrivilegedMode() == null ^ this.getPrivilegedMode() == null)
            return false;
        if (other.getPrivilegedMode() != null && other.getPrivilegedMode().equals(this.getPrivilegedMode()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getRegistryCredential() == null ^ this.getRegistryCredential() == null)
            return false;
        if (other.getRegistryCredential() != null && other.getRegistryCredential().equals(this.getRegistryCredential()) == false)
            return false;
        if (other.getImagePullCredentialsType() == null ^ this.getImagePullCredentialsType() == null)
            return false;
        if (other.getImagePullCredentialsType() != null && other.getImagePullCredentialsType().equals(this.getImagePullCredentialsType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getPrivilegedMode() == null) ? 0 : getPrivilegedMode().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getRegistryCredential() == null) ? 0 : getRegistryCredential().hashCode());
        hashCode = prime * hashCode + ((getImagePullCredentialsType() == null) ? 0 : getImagePullCredentialsType().hashCode());
        return hashCode;
    }

    @Override
    public ProjectEnvironment clone() {
        try {
            return (ProjectEnvironment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ProjectEnvironmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
