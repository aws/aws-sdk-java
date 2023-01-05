/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Image Builder image. You must specify exactly one recipe for the image – either a container recipe (
 * <code>containerRecipe</code>), which creates a container image, or an image recipe (<code>imageRecipe</code>), which
 * creates an AMI.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/Image" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Image implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * <note>
     * <p>
     * Semantic versioning is included in each object's Amazon Resource Name (ARN), at the level that applies to that
     * object as follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Versionless ARNs and Name ARNs do not include specific values in any of the nodes. The nodes are either left off
     * entirely, or they are specified as wildcards, for example: x.x.x.
     * </p>
     * </li>
     * <li>
     * <p>
     * Version ARNs have only the first three nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;
     * </p>
     * </li>
     * <li>
     * <p>
     * Build version ARNs have all four nodes, and point to a specific build for a specific version of an object.
     * </p>
     * </li>
     * </ol>
     * </note>
     */
    private String arn;
    /**
     * <p>
     * Specifies whether this is an AMI or container image.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The semantic version of the image.
     * </p>
     * <note>
     * <p>
     * The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign
     * values for the first three, and can filter on all of them.
     * </p>
     * <p>
     * <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero, with an
     * upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the
     * fourth node.
     * </p>
     * <p>
     * <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the nodes that
     * you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as
     * 2021.01.01.
     * </p>
     * <p>
     * <b>Filtering:</b> With semantic versioning, you have the flexibility to use wildcards (x) to specify the most
     * recent versions or nodes when selecting the base image or components for your recipe. When you use a wildcard in
     * any node, all nodes to the right of the first wildcard must also be wildcards.
     * </p>
     * </note>
     */
    private String version;
    /**
     * <p>
     * The platform of the image.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * Collects additional information about the image being created, including the operating system (OS) version and
     * package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by
     * default.
     * </p>
     */
    private Boolean enhancedImageMetadataEnabled;
    /**
     * <p>
     * The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server
     * 2019.
     * </p>
     */
    private String osVersion;
    /**
     * <p>
     * The state of the image.
     * </p>
     */
    private ImageState state;
    /**
     * <p>
     * The image recipe used when creating the image.
     * </p>
     */
    private ImageRecipe imageRecipe;
    /**
     * <p>
     * The recipe that is used to create an Image Builder container image.
     * </p>
     */
    private ContainerRecipe containerRecipe;
    /**
     * <p>
     * The name of the image pipeline that created this image.
     * </p>
     */
    private String sourcePipelineName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that created this image.
     * </p>
     */
    private String sourcePipelineArn;
    /**
     * <p>
     * The infrastructure used when creating this image.
     * </p>
     */
    private InfrastructureConfiguration infrastructureConfiguration;
    /**
     * <p>
     * The distribution configuration used when creating this image.
     * </p>
     */
    private DistributionConfiguration distributionConfiguration;
    /**
     * <p>
     * The image tests configuration used when creating this image.
     * </p>
     */
    private ImageTestsConfiguration imageTestsConfiguration;
    /**
     * <p>
     * The date on which this image was created.
     * </p>
     */
    private String dateCreated;
    /**
     * <p>
     * The output resources produced when creating this image.
     * </p>
     */
    private OutputResources outputResources;
    /**
     * <p>
     * The tags of the image.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Indicates the type of build that created this image. The build can be initiated in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>USER_INITIATED</b> – A manual pipeline build request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SCHEDULED</b> – A pipeline build initiated by a cron expression in the Image Builder pipeline, or from
     * EventBridge.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IMPORT</b> – A VM import created the image to use as the base image for the recipe.
     * </p>
     * </li>
     * </ul>
     */
    private String buildType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * <note>
     * <p>
     * Semantic versioning is included in each object's Amazon Resource Name (ARN), at the level that applies to that
     * object as follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Versionless ARNs and Name ARNs do not include specific values in any of the nodes. The nodes are either left off
     * entirely, or they are specified as wildcards, for example: x.x.x.
     * </p>
     * </li>
     * <li>
     * <p>
     * Version ARNs have only the first three nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;
     * </p>
     * </li>
     * <li>
     * <p>
     * Build version ARNs have all four nodes, and point to a specific build for a specific version of an object.
     * </p>
     * </li>
     * </ol>
     * </note>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the image.</p> <note>
     *        <p>
     *        Semantic versioning is included in each object's Amazon Resource Name (ARN), at the level that applies to
     *        that object as follows:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Versionless ARNs and Name ARNs do not include specific values in any of the nodes. The nodes are either
     *        left off entirely, or they are specified as wildcards, for example: x.x.x.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Version ARNs have only the first three nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Build version ARNs have all four nodes, and point to a specific build for a specific version of an object.
     *        </p>
     *        </li>
     *        </ol>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * <note>
     * <p>
     * Semantic versioning is included in each object's Amazon Resource Name (ARN), at the level that applies to that
     * object as follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Versionless ARNs and Name ARNs do not include specific values in any of the nodes. The nodes are either left off
     * entirely, or they are specified as wildcards, for example: x.x.x.
     * </p>
     * </li>
     * <li>
     * <p>
     * Version ARNs have only the first three nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;
     * </p>
     * </li>
     * <li>
     * <p>
     * Build version ARNs have all four nodes, and point to a specific build for a specific version of an object.
     * </p>
     * </li>
     * </ol>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the image.</p> <note>
     *         <p>
     *         Semantic versioning is included in each object's Amazon Resource Name (ARN), at the level that applies to
     *         that object as follows:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         Versionless ARNs and Name ARNs do not include specific values in any of the nodes. The nodes are either
     *         left off entirely, or they are specified as wildcards, for example: x.x.x.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Version ARNs have only the first three nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Build version ARNs have all four nodes, and point to a specific build for a specific version of an
     *         object.
     *         </p>
     *         </li>
     *         </ol>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * <note>
     * <p>
     * Semantic versioning is included in each object's Amazon Resource Name (ARN), at the level that applies to that
     * object as follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Versionless ARNs and Name ARNs do not include specific values in any of the nodes. The nodes are either left off
     * entirely, or they are specified as wildcards, for example: x.x.x.
     * </p>
     * </li>
     * <li>
     * <p>
     * Version ARNs have only the first three nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;
     * </p>
     * </li>
     * <li>
     * <p>
     * Build version ARNs have all four nodes, and point to a specific build for a specific version of an object.
     * </p>
     * </li>
     * </ol>
     * </note>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the image.</p> <note>
     *        <p>
     *        Semantic versioning is included in each object's Amazon Resource Name (ARN), at the level that applies to
     *        that object as follows:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Versionless ARNs and Name ARNs do not include specific values in any of the nodes. The nodes are either
     *        left off entirely, or they are specified as wildcards, for example: x.x.x.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Version ARNs have only the first three nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Build version ARNs have all four nodes, and point to a specific build for a specific version of an object.
     *        </p>
     *        </li>
     *        </ol>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is an AMI or container image.
     * </p>
     * 
     * @param type
     *        Specifies whether this is an AMI or container image.
     * @see ImageType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies whether this is an AMI or container image.
     * </p>
     * 
     * @return Specifies whether this is an AMI or container image.
     * @see ImageType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies whether this is an AMI or container image.
     * </p>
     * 
     * @param type
     *        Specifies whether this is an AMI or container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageType
     */

    public Image withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is an AMI or container image.
     * </p>
     * 
     * @param type
     *        Specifies whether this is an AMI or container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageType
     */

    public Image withType(ImageType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param name
     *        The name of the image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @return The name of the image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param name
     *        The name of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The semantic version of the image.
     * </p>
     * <note>
     * <p>
     * The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign
     * values for the first three, and can filter on all of them.
     * </p>
     * <p>
     * <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero, with an
     * upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the
     * fourth node.
     * </p>
     * <p>
     * <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the nodes that
     * you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as
     * 2021.01.01.
     * </p>
     * <p>
     * <b>Filtering:</b> With semantic versioning, you have the flexibility to use wildcards (x) to specify the most
     * recent versions or nodes when selecting the base image or components for your recipe. When you use a wildcard in
     * any node, all nodes to the right of the first wildcard must also be wildcards.
     * </p>
     * </note>
     * 
     * @param version
     *        The semantic version of the image.</p> <note>
     *        <p>
     *        The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can
     *        assign values for the first three, and can filter on all of them.
     *        </p>
     *        <p>
     *        <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero,
     *        with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build
     *        number to the fourth node.
     *        </p>
     *        <p>
     *        <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the nodes
     *        that you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date,
     *        such as 2021.01.01.
     *        </p>
     *        <p>
     *        <b>Filtering:</b> With semantic versioning, you have the flexibility to use wildcards (x) to specify the
     *        most recent versions or nodes when selecting the base image or components for your recipe. When you use a
     *        wildcard in any node, all nodes to the right of the first wildcard must also be wildcards.
     *        </p>
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The semantic version of the image.
     * </p>
     * <note>
     * <p>
     * The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign
     * values for the first three, and can filter on all of them.
     * </p>
     * <p>
     * <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero, with an
     * upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the
     * fourth node.
     * </p>
     * <p>
     * <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the nodes that
     * you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as
     * 2021.01.01.
     * </p>
     * <p>
     * <b>Filtering:</b> With semantic versioning, you have the flexibility to use wildcards (x) to specify the most
     * recent versions or nodes when selecting the base image or components for your recipe. When you use a wildcard in
     * any node, all nodes to the right of the first wildcard must also be wildcards.
     * </p>
     * </note>
     * 
     * @return The semantic version of the image.</p> <note>
     *         <p>
     *         The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can
     *         assign values for the first three, and can filter on all of them.
     *         </p>
     *         <p>
     *         <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero,
     *         with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build
     *         number to the fourth node.
     *         </p>
     *         <p>
     *         <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the
     *         nodes that you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a
     *         date, such as 2021.01.01.
     *         </p>
     *         <p>
     *         <b>Filtering:</b> With semantic versioning, you have the flexibility to use wildcards (x) to specify the
     *         most recent versions or nodes when selecting the base image or components for your recipe. When you use a
     *         wildcard in any node, all nodes to the right of the first wildcard must also be wildcards.
     *         </p>
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The semantic version of the image.
     * </p>
     * <note>
     * <p>
     * The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign
     * values for the first three, and can filter on all of them.
     * </p>
     * <p>
     * <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero, with an
     * upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the
     * fourth node.
     * </p>
     * <p>
     * <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the nodes that
     * you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as
     * 2021.01.01.
     * </p>
     * <p>
     * <b>Filtering:</b> With semantic versioning, you have the flexibility to use wildcards (x) to specify the most
     * recent versions or nodes when selecting the base image or components for your recipe. When you use a wildcard in
     * any node, all nodes to the right of the first wildcard must also be wildcards.
     * </p>
     * </note>
     * 
     * @param version
     *        The semantic version of the image.</p> <note>
     *        <p>
     *        The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can
     *        assign values for the first three, and can filter on all of them.
     *        </p>
     *        <p>
     *        <b>Assignment:</b> For the first three nodes you can assign any positive integer value, including zero,
     *        with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build
     *        number to the fourth node.
     *        </p>
     *        <p>
     *        <b>Patterns:</b> You can use any numeric pattern that adheres to the assignment requirements for the nodes
     *        that you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date,
     *        such as 2021.01.01.
     *        </p>
     *        <p>
     *        <b>Filtering:</b> With semantic versioning, you have the flexibility to use wildcards (x) to specify the
     *        most recent versions or nodes when selecting the base image or components for your recipe. When you use a
     *        wildcard in any node, all nodes to the right of the first wildcard must also be wildcards.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * 
     * @param platform
     *        The platform of the image.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * 
     * @return The platform of the image.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * 
     * @param platform
     *        The platform of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public Image withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * 
     * @param platform
     *        The platform of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public Image withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * Collects additional information about the image being created, including the operating system (OS) version and
     * package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by
     * default.
     * </p>
     * 
     * @param enhancedImageMetadataEnabled
     *        Collects additional information about the image being created, including the operating system (OS) version
     *        and package list. This information is used to enhance the overall experience of using EC2 Image Builder.
     *        Enabled by default.
     */

    public void setEnhancedImageMetadataEnabled(Boolean enhancedImageMetadataEnabled) {
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
    }

    /**
     * <p>
     * Collects additional information about the image being created, including the operating system (OS) version and
     * package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by
     * default.
     * </p>
     * 
     * @return Collects additional information about the image being created, including the operating system (OS)
     *         version and package list. This information is used to enhance the overall experience of using EC2 Image
     *         Builder. Enabled by default.
     */

    public Boolean getEnhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled;
    }

    /**
     * <p>
     * Collects additional information about the image being created, including the operating system (OS) version and
     * package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by
     * default.
     * </p>
     * 
     * @param enhancedImageMetadataEnabled
     *        Collects additional information about the image being created, including the operating system (OS) version
     *        and package list. This information is used to enhance the overall experience of using EC2 Image Builder.
     *        Enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withEnhancedImageMetadataEnabled(Boolean enhancedImageMetadataEnabled) {
        setEnhancedImageMetadataEnabled(enhancedImageMetadataEnabled);
        return this;
    }

    /**
     * <p>
     * Collects additional information about the image being created, including the operating system (OS) version and
     * package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by
     * default.
     * </p>
     * 
     * @return Collects additional information about the image being created, including the operating system (OS)
     *         version and package list. This information is used to enhance the overall experience of using EC2 Image
     *         Builder. Enabled by default.
     */

    public Boolean isEnhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled;
    }

    /**
     * <p>
     * The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server
     * 2019.
     * </p>
     * 
     * @param osVersion
     *        The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows
     *        Server 2019.
     */

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * <p>
     * The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server
     * 2019.
     * </p>
     * 
     * @return The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft
     *         Windows Server 2019.
     */

    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * <p>
     * The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server
     * 2019.
     * </p>
     * 
     * @param osVersion
     *        The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows
     *        Server 2019.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withOsVersion(String osVersion) {
        setOsVersion(osVersion);
        return this;
    }

    /**
     * <p>
     * The state of the image.
     * </p>
     * 
     * @param state
     *        The state of the image.
     */

    public void setState(ImageState state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the image.
     * </p>
     * 
     * @return The state of the image.
     */

    public ImageState getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the image.
     * </p>
     * 
     * @param state
     *        The state of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withState(ImageState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The image recipe used when creating the image.
     * </p>
     * 
     * @param imageRecipe
     *        The image recipe used when creating the image.
     */

    public void setImageRecipe(ImageRecipe imageRecipe) {
        this.imageRecipe = imageRecipe;
    }

    /**
     * <p>
     * The image recipe used when creating the image.
     * </p>
     * 
     * @return The image recipe used when creating the image.
     */

    public ImageRecipe getImageRecipe() {
        return this.imageRecipe;
    }

    /**
     * <p>
     * The image recipe used when creating the image.
     * </p>
     * 
     * @param imageRecipe
     *        The image recipe used when creating the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withImageRecipe(ImageRecipe imageRecipe) {
        setImageRecipe(imageRecipe);
        return this;
    }

    /**
     * <p>
     * The recipe that is used to create an Image Builder container image.
     * </p>
     * 
     * @param containerRecipe
     *        The recipe that is used to create an Image Builder container image.
     */

    public void setContainerRecipe(ContainerRecipe containerRecipe) {
        this.containerRecipe = containerRecipe;
    }

    /**
     * <p>
     * The recipe that is used to create an Image Builder container image.
     * </p>
     * 
     * @return The recipe that is used to create an Image Builder container image.
     */

    public ContainerRecipe getContainerRecipe() {
        return this.containerRecipe;
    }

    /**
     * <p>
     * The recipe that is used to create an Image Builder container image.
     * </p>
     * 
     * @param containerRecipe
     *        The recipe that is used to create an Image Builder container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withContainerRecipe(ContainerRecipe containerRecipe) {
        setContainerRecipe(containerRecipe);
        return this;
    }

    /**
     * <p>
     * The name of the image pipeline that created this image.
     * </p>
     * 
     * @param sourcePipelineName
     *        The name of the image pipeline that created this image.
     */

    public void setSourcePipelineName(String sourcePipelineName) {
        this.sourcePipelineName = sourcePipelineName;
    }

    /**
     * <p>
     * The name of the image pipeline that created this image.
     * </p>
     * 
     * @return The name of the image pipeline that created this image.
     */

    public String getSourcePipelineName() {
        return this.sourcePipelineName;
    }

    /**
     * <p>
     * The name of the image pipeline that created this image.
     * </p>
     * 
     * @param sourcePipelineName
     *        The name of the image pipeline that created this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withSourcePipelineName(String sourcePipelineName) {
        setSourcePipelineName(sourcePipelineName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that created this image.
     * </p>
     * 
     * @param sourcePipelineArn
     *        The Amazon Resource Name (ARN) of the image pipeline that created this image.
     */

    public void setSourcePipelineArn(String sourcePipelineArn) {
        this.sourcePipelineArn = sourcePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that created this image.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image pipeline that created this image.
     */

    public String getSourcePipelineArn() {
        return this.sourcePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that created this image.
     * </p>
     * 
     * @param sourcePipelineArn
     *        The Amazon Resource Name (ARN) of the image pipeline that created this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withSourcePipelineArn(String sourcePipelineArn) {
        setSourcePipelineArn(sourcePipelineArn);
        return this;
    }

    /**
     * <p>
     * The infrastructure used when creating this image.
     * </p>
     * 
     * @param infrastructureConfiguration
     *        The infrastructure used when creating this image.
     */

    public void setInfrastructureConfiguration(InfrastructureConfiguration infrastructureConfiguration) {
        this.infrastructureConfiguration = infrastructureConfiguration;
    }

    /**
     * <p>
     * The infrastructure used when creating this image.
     * </p>
     * 
     * @return The infrastructure used when creating this image.
     */

    public InfrastructureConfiguration getInfrastructureConfiguration() {
        return this.infrastructureConfiguration;
    }

    /**
     * <p>
     * The infrastructure used when creating this image.
     * </p>
     * 
     * @param infrastructureConfiguration
     *        The infrastructure used when creating this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withInfrastructureConfiguration(InfrastructureConfiguration infrastructureConfiguration) {
        setInfrastructureConfiguration(infrastructureConfiguration);
        return this;
    }

    /**
     * <p>
     * The distribution configuration used when creating this image.
     * </p>
     * 
     * @param distributionConfiguration
     *        The distribution configuration used when creating this image.
     */

    public void setDistributionConfiguration(DistributionConfiguration distributionConfiguration) {
        this.distributionConfiguration = distributionConfiguration;
    }

    /**
     * <p>
     * The distribution configuration used when creating this image.
     * </p>
     * 
     * @return The distribution configuration used when creating this image.
     */

    public DistributionConfiguration getDistributionConfiguration() {
        return this.distributionConfiguration;
    }

    /**
     * <p>
     * The distribution configuration used when creating this image.
     * </p>
     * 
     * @param distributionConfiguration
     *        The distribution configuration used when creating this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withDistributionConfiguration(DistributionConfiguration distributionConfiguration) {
        setDistributionConfiguration(distributionConfiguration);
        return this;
    }

    /**
     * <p>
     * The image tests configuration used when creating this image.
     * </p>
     * 
     * @param imageTestsConfiguration
     *        The image tests configuration used when creating this image.
     */

    public void setImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration used when creating this image.
     * </p>
     * 
     * @return The image tests configuration used when creating this image.
     */

    public ImageTestsConfiguration getImageTestsConfiguration() {
        return this.imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration used when creating this image.
     * </p>
     * 
     * @param imageTestsConfiguration
     *        The image tests configuration used when creating this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        setImageTestsConfiguration(imageTestsConfiguration);
        return this;
    }

    /**
     * <p>
     * The date on which this image was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which this image was created.
     */

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date on which this image was created.
     * </p>
     * 
     * @return The date on which this image was created.
     */

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date on which this image was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which this image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withDateCreated(String dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The output resources produced when creating this image.
     * </p>
     * 
     * @param outputResources
     *        The output resources produced when creating this image.
     */

    public void setOutputResources(OutputResources outputResources) {
        this.outputResources = outputResources;
    }

    /**
     * <p>
     * The output resources produced when creating this image.
     * </p>
     * 
     * @return The output resources produced when creating this image.
     */

    public OutputResources getOutputResources() {
        return this.outputResources;
    }

    /**
     * <p>
     * The output resources produced when creating this image.
     * </p>
     * 
     * @param outputResources
     *        The output resources produced when creating this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withOutputResources(OutputResources outputResources) {
        setOutputResources(outputResources);
        return this;
    }

    /**
     * <p>
     * The tags of the image.
     * </p>
     * 
     * @return The tags of the image.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the image.
     * </p>
     * 
     * @param tags
     *        The tags of the image.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the image.
     * </p>
     * 
     * @param tags
     *        The tags of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Image#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Image addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Indicates the type of build that created this image. The build can be initiated in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>USER_INITIATED</b> – A manual pipeline build request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SCHEDULED</b> – A pipeline build initiated by a cron expression in the Image Builder pipeline, or from
     * EventBridge.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IMPORT</b> – A VM import created the image to use as the base image for the recipe.
     * </p>
     * </li>
     * </ul>
     * 
     * @param buildType
     *        Indicates the type of build that created this image. The build can be initiated in the following ways:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>USER_INITIATED</b> – A manual pipeline build request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SCHEDULED</b> – A pipeline build initiated by a cron expression in the Image Builder pipeline, or from
     *        EventBridge.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IMPORT</b> – A VM import created the image to use as the base image for the recipe.
     *        </p>
     *        </li>
     * @see BuildType
     */

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    /**
     * <p>
     * Indicates the type of build that created this image. The build can be initiated in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>USER_INITIATED</b> – A manual pipeline build request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SCHEDULED</b> – A pipeline build initiated by a cron expression in the Image Builder pipeline, or from
     * EventBridge.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IMPORT</b> – A VM import created the image to use as the base image for the recipe.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the type of build that created this image. The build can be initiated in the following
     *         ways:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>USER_INITIATED</b> – A manual pipeline build request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SCHEDULED</b> – A pipeline build initiated by a cron expression in the Image Builder pipeline, or from
     *         EventBridge.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IMPORT</b> – A VM import created the image to use as the base image for the recipe.
     *         </p>
     *         </li>
     * @see BuildType
     */

    public String getBuildType() {
        return this.buildType;
    }

    /**
     * <p>
     * Indicates the type of build that created this image. The build can be initiated in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>USER_INITIATED</b> – A manual pipeline build request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SCHEDULED</b> – A pipeline build initiated by a cron expression in the Image Builder pipeline, or from
     * EventBridge.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IMPORT</b> – A VM import created the image to use as the base image for the recipe.
     * </p>
     * </li>
     * </ul>
     * 
     * @param buildType
     *        Indicates the type of build that created this image. The build can be initiated in the following ways:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>USER_INITIATED</b> – A manual pipeline build request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SCHEDULED</b> – A pipeline build initiated by a cron expression in the Image Builder pipeline, or from
     *        EventBridge.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IMPORT</b> – A VM import created the image to use as the base image for the recipe.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BuildType
     */

    public Image withBuildType(String buildType) {
        setBuildType(buildType);
        return this;
    }

    /**
     * <p>
     * Indicates the type of build that created this image. The build can be initiated in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>USER_INITIATED</b> – A manual pipeline build request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SCHEDULED</b> – A pipeline build initiated by a cron expression in the Image Builder pipeline, or from
     * EventBridge.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IMPORT</b> – A VM import created the image to use as the base image for the recipe.
     * </p>
     * </li>
     * </ul>
     * 
     * @param buildType
     *        Indicates the type of build that created this image. The build can be initiated in the following ways:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>USER_INITIATED</b> – A manual pipeline build request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SCHEDULED</b> – A pipeline build initiated by a cron expression in the Image Builder pipeline, or from
     *        EventBridge.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IMPORT</b> – A VM import created the image to use as the base image for the recipe.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BuildType
     */

    public Image withBuildType(BuildType buildType) {
        this.buildType = buildType.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getEnhancedImageMetadataEnabled() != null)
            sb.append("EnhancedImageMetadataEnabled: ").append(getEnhancedImageMetadataEnabled()).append(",");
        if (getOsVersion() != null)
            sb.append("OsVersion: ").append(getOsVersion()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getImageRecipe() != null)
            sb.append("ImageRecipe: ").append(getImageRecipe()).append(",");
        if (getContainerRecipe() != null)
            sb.append("ContainerRecipe: ").append(getContainerRecipe()).append(",");
        if (getSourcePipelineName() != null)
            sb.append("SourcePipelineName: ").append(getSourcePipelineName()).append(",");
        if (getSourcePipelineArn() != null)
            sb.append("SourcePipelineArn: ").append(getSourcePipelineArn()).append(",");
        if (getInfrastructureConfiguration() != null)
            sb.append("InfrastructureConfiguration: ").append(getInfrastructureConfiguration()).append(",");
        if (getDistributionConfiguration() != null)
            sb.append("DistributionConfiguration: ").append(getDistributionConfiguration()).append(",");
        if (getImageTestsConfiguration() != null)
            sb.append("ImageTestsConfiguration: ").append(getImageTestsConfiguration()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getOutputResources() != null)
            sb.append("OutputResources: ").append(getOutputResources()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getBuildType() != null)
            sb.append("BuildType: ").append(getBuildType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Image == false)
            return false;
        Image other = (Image) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getEnhancedImageMetadataEnabled() == null ^ this.getEnhancedImageMetadataEnabled() == null)
            return false;
        if (other.getEnhancedImageMetadataEnabled() != null && other.getEnhancedImageMetadataEnabled().equals(this.getEnhancedImageMetadataEnabled()) == false)
            return false;
        if (other.getOsVersion() == null ^ this.getOsVersion() == null)
            return false;
        if (other.getOsVersion() != null && other.getOsVersion().equals(this.getOsVersion()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getImageRecipe() == null ^ this.getImageRecipe() == null)
            return false;
        if (other.getImageRecipe() != null && other.getImageRecipe().equals(this.getImageRecipe()) == false)
            return false;
        if (other.getContainerRecipe() == null ^ this.getContainerRecipe() == null)
            return false;
        if (other.getContainerRecipe() != null && other.getContainerRecipe().equals(this.getContainerRecipe()) == false)
            return false;
        if (other.getSourcePipelineName() == null ^ this.getSourcePipelineName() == null)
            return false;
        if (other.getSourcePipelineName() != null && other.getSourcePipelineName().equals(this.getSourcePipelineName()) == false)
            return false;
        if (other.getSourcePipelineArn() == null ^ this.getSourcePipelineArn() == null)
            return false;
        if (other.getSourcePipelineArn() != null && other.getSourcePipelineArn().equals(this.getSourcePipelineArn()) == false)
            return false;
        if (other.getInfrastructureConfiguration() == null ^ this.getInfrastructureConfiguration() == null)
            return false;
        if (other.getInfrastructureConfiguration() != null && other.getInfrastructureConfiguration().equals(this.getInfrastructureConfiguration()) == false)
            return false;
        if (other.getDistributionConfiguration() == null ^ this.getDistributionConfiguration() == null)
            return false;
        if (other.getDistributionConfiguration() != null && other.getDistributionConfiguration().equals(this.getDistributionConfiguration()) == false)
            return false;
        if (other.getImageTestsConfiguration() == null ^ this.getImageTestsConfiguration() == null)
            return false;
        if (other.getImageTestsConfiguration() != null && other.getImageTestsConfiguration().equals(this.getImageTestsConfiguration()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getOutputResources() == null ^ this.getOutputResources() == null)
            return false;
        if (other.getOutputResources() != null && other.getOutputResources().equals(this.getOutputResources()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getBuildType() == null ^ this.getBuildType() == null)
            return false;
        if (other.getBuildType() != null && other.getBuildType().equals(this.getBuildType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getEnhancedImageMetadataEnabled() == null) ? 0 : getEnhancedImageMetadataEnabled().hashCode());
        hashCode = prime * hashCode + ((getOsVersion() == null) ? 0 : getOsVersion().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getImageRecipe() == null) ? 0 : getImageRecipe().hashCode());
        hashCode = prime * hashCode + ((getContainerRecipe() == null) ? 0 : getContainerRecipe().hashCode());
        hashCode = prime * hashCode + ((getSourcePipelineName() == null) ? 0 : getSourcePipelineName().hashCode());
        hashCode = prime * hashCode + ((getSourcePipelineArn() == null) ? 0 : getSourcePipelineArn().hashCode());
        hashCode = prime * hashCode + ((getInfrastructureConfiguration() == null) ? 0 : getInfrastructureConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDistributionConfiguration() == null) ? 0 : getDistributionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getImageTestsConfiguration() == null) ? 0 : getImageTestsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getOutputResources() == null) ? 0 : getOutputResources().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getBuildType() == null) ? 0 : getBuildType().hashCode());
        return hashCode;
    }

    @Override
    public Image clone() {
        try {
            return (Image) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
