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
 * The defining characteristics of a specific version of an Image Builder image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImageVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a specific version of an Image Builder image.
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
     * The name of this specific version of an Image Builder image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies whether this image is an AMI or a container image.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Details for a specific version of an Image Builder image. This version follows the semantic version syntax.
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
     * The platform of the image version, for example "Windows" or "Linux".
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The operating system version of the Amazon EC2 build instance. For example, Amazon Linux 2, Ubuntu 18, or
     * Microsoft Windows Server 2019.
     * </p>
     */
    private String osVersion;
    /**
     * <p>
     * The owner of the image version.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The date on which this specific version of the Image Builder image was created.
     * </p>
     */
    private String dateCreated;
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
     * The Amazon Resource Name (ARN) of a specific version of an Image Builder image.
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
     *        The Amazon Resource Name (ARN) of a specific version of an Image Builder image.</p> <note>
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
     * The Amazon Resource Name (ARN) of a specific version of an Image Builder image.
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
     * @return The Amazon Resource Name (ARN) of a specific version of an Image Builder image.</p> <note>
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
     * The Amazon Resource Name (ARN) of a specific version of an Image Builder image.
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
     *        The Amazon Resource Name (ARN) of a specific version of an Image Builder image.</p> <note>
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

    public ImageVersion withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of this specific version of an Image Builder image.
     * </p>
     * 
     * @param name
     *        The name of this specific version of an Image Builder image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this specific version of an Image Builder image.
     * </p>
     * 
     * @return The name of this specific version of an Image Builder image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this specific version of an Image Builder image.
     * </p>
     * 
     * @param name
     *        The name of this specific version of an Image Builder image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageVersion withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies whether this image is an AMI or a container image.
     * </p>
     * 
     * @param type
     *        Specifies whether this image is an AMI or a container image.
     * @see ImageType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies whether this image is an AMI or a container image.
     * </p>
     * 
     * @return Specifies whether this image is an AMI or a container image.
     * @see ImageType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies whether this image is an AMI or a container image.
     * </p>
     * 
     * @param type
     *        Specifies whether this image is an AMI or a container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageType
     */

    public ImageVersion withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies whether this image is an AMI or a container image.
     * </p>
     * 
     * @param type
     *        Specifies whether this image is an AMI or a container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageType
     */

    public ImageVersion withType(ImageType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Details for a specific version of an Image Builder image. This version follows the semantic version syntax.
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
     *        Details for a specific version of an Image Builder image. This version follows the semantic version
     *        syntax.</p> <note>
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
     * Details for a specific version of an Image Builder image. This version follows the semantic version syntax.
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
     * @return Details for a specific version of an Image Builder image. This version follows the semantic version
     *         syntax.</p> <note>
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
     * Details for a specific version of an Image Builder image. This version follows the semantic version syntax.
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
     *        Details for a specific version of an Image Builder image. This version follows the semantic version
     *        syntax.</p> <note>
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

    public ImageVersion withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The platform of the image version, for example "Windows" or "Linux".
     * </p>
     * 
     * @param platform
     *        The platform of the image version, for example "Windows" or "Linux".
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the image version, for example "Windows" or "Linux".
     * </p>
     * 
     * @return The platform of the image version, for example "Windows" or "Linux".
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the image version, for example "Windows" or "Linux".
     * </p>
     * 
     * @param platform
     *        The platform of the image version, for example "Windows" or "Linux".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ImageVersion withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the image version, for example "Windows" or "Linux".
     * </p>
     * 
     * @param platform
     *        The platform of the image version, for example "Windows" or "Linux".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ImageVersion withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The operating system version of the Amazon EC2 build instance. For example, Amazon Linux 2, Ubuntu 18, or
     * Microsoft Windows Server 2019.
     * </p>
     * 
     * @param osVersion
     *        The operating system version of the Amazon EC2 build instance. For example, Amazon Linux 2, Ubuntu 18, or
     *        Microsoft Windows Server 2019.
     */

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * <p>
     * The operating system version of the Amazon EC2 build instance. For example, Amazon Linux 2, Ubuntu 18, or
     * Microsoft Windows Server 2019.
     * </p>
     * 
     * @return The operating system version of the Amazon EC2 build instance. For example, Amazon Linux 2, Ubuntu 18, or
     *         Microsoft Windows Server 2019.
     */

    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * <p>
     * The operating system version of the Amazon EC2 build instance. For example, Amazon Linux 2, Ubuntu 18, or
     * Microsoft Windows Server 2019.
     * </p>
     * 
     * @param osVersion
     *        The operating system version of the Amazon EC2 build instance. For example, Amazon Linux 2, Ubuntu 18, or
     *        Microsoft Windows Server 2019.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageVersion withOsVersion(String osVersion) {
        setOsVersion(osVersion);
        return this;
    }

    /**
     * <p>
     * The owner of the image version.
     * </p>
     * 
     * @param owner
     *        The owner of the image version.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the image version.
     * </p>
     * 
     * @return The owner of the image version.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the image version.
     * </p>
     * 
     * @param owner
     *        The owner of the image version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageVersion withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The date on which this specific version of the Image Builder image was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which this specific version of the Image Builder image was created.
     */

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date on which this specific version of the Image Builder image was created.
     * </p>
     * 
     * @return The date on which this specific version of the Image Builder image was created.
     */

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date on which this specific version of the Image Builder image was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which this specific version of the Image Builder image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageVersion withDateCreated(String dateCreated) {
        setDateCreated(dateCreated);
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

    public ImageVersion withBuildType(String buildType) {
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

    public ImageVersion withBuildType(BuildType buildType) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getOsVersion() != null)
            sb.append("OsVersion: ").append(getOsVersion()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
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

        if (obj instanceof ImageVersion == false)
            return false;
        ImageVersion other = (ImageVersion) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getOsVersion() == null ^ this.getOsVersion() == null)
            return false;
        if (other.getOsVersion() != null && other.getOsVersion().equals(this.getOsVersion()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getOsVersion() == null) ? 0 : getOsVersion().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getBuildType() == null) ? 0 : getBuildType().hashCode());
        return hashCode;
    }

    @Override
    public ImageVersion clone() {
        try {
            return (ImageVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImageVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
