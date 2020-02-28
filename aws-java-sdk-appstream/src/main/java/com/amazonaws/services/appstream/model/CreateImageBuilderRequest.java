/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImageBuilderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name for the image builder.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the image used to create the image builder.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The ARN of the public, private, or shared image to use.
     * </p>
     */
    private String imageArn;
    /**
     * <p>
     * The instance type to use when launching the image builder. The following instance types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.medium
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-desktop.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.16xlarge
     * </p>
     * </li>
     * </ul>
     */
    private String instanceType;
    /**
     * <p>
     * The description to display.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The image builder name to display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The VPC configuration for the image builder. You can specify only one subnet.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to apply to the image builder. To assume a role, the image builder
     * calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role
     * to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary
     * credentials and creates the <b>AppStream_Machine_Role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     */
    private Boolean enableDefaultInternetAccess;
    /**
     * <p>
     * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active
     * Directory domain.
     * </p>
     */
    private DomainJoinInfo domainJoinInfo;
    /**
     * <p>
     * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream
     * 2.0 agent, specify [LATEST].
     * </p>
     */
    private String appstreamAgentVersion;
    /**
     * <p>
     * The tags to associate with the image builder. A tag is a key-value pair, and the value is optional. For example,
     * Environment=Test. If you do not specify a value, Environment=.
     * </p>
     * <p>
     * Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special
     * characters:
     * </p>
     * <p>
     * _ . : / = + \ - @
     * </p>
     * <p>
     * If you do not specify a value, the value is set to an empty string.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the image builder
     * only through the specified endpoints.
     * </p>
     */
    private java.util.List<AccessEndpoint> accessEndpoints;

    /**
     * <p>
     * A unique name for the image builder.
     * </p>
     * 
     * @param name
     *        A unique name for the image builder.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name for the image builder.
     * </p>
     * 
     * @return A unique name for the image builder.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique name for the image builder.
     * </p>
     * 
     * @param name
     *        A unique name for the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the image used to create the image builder.
     * </p>
     * 
     * @param imageName
     *        The name of the image used to create the image builder.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The name of the image used to create the image builder.
     * </p>
     * 
     * @return The name of the image used to create the image builder.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The name of the image used to create the image builder.
     * </p>
     * 
     * @param imageName
     *        The name of the image used to create the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The ARN of the public, private, or shared image to use.
     * </p>
     * 
     * @param imageArn
     *        The ARN of the public, private, or shared image to use.
     */

    public void setImageArn(String imageArn) {
        this.imageArn = imageArn;
    }

    /**
     * <p>
     * The ARN of the public, private, or shared image to use.
     * </p>
     * 
     * @return The ARN of the public, private, or shared image to use.
     */

    public String getImageArn() {
        return this.imageArn;
    }

    /**
     * <p>
     * The ARN of the public, private, or shared image to use.
     * </p>
     * 
     * @param imageArn
     *        The ARN of the public, private, or shared image to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withImageArn(String imageArn) {
        setImageArn(imageArn);
        return this;
    }

    /**
     * <p>
     * The instance type to use when launching the image builder. The following instance types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.medium
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-desktop.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.16xlarge
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceType
     *        The instance type to use when launching the image builder. The following instance types are available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        stream.standard.medium
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.standard.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-desktop.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.16xlarge
     *        </p>
     *        </li>
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type to use when launching the image builder. The following instance types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.medium
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-desktop.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.16xlarge
     * </p>
     * </li>
     * </ul>
     * 
     * @return The instance type to use when launching the image builder. The following instance types are
     *         available:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         stream.standard.medium
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.standard.large
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.large
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.2xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.4xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.8xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.large
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.2xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.4xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.8xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-design.large
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-design.xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-design.2xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-design.4xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-desktop.2xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-pro.4xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-pro.8xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-pro.16xlarge
     *         </p>
     *         </li>
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type to use when launching the image builder. The following instance types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.medium
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-design.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-desktop.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.16xlarge
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceType
     *        The instance type to use when launching the image builder. The following instance types are available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        stream.standard.medium
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.standard.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-design.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-desktop.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.16xlarge
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The description to display.
     * </p>
     * 
     * @param description
     *        The description to display.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to display.
     * </p>
     * 
     * @return The description to display.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description to display.
     * </p>
     * 
     * @param description
     *        The description to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The image builder name to display.
     * </p>
     * 
     * @param displayName
     *        The image builder name to display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The image builder name to display.
     * </p>
     * 
     * @return The image builder name to display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The image builder name to display.
     * </p>
     * 
     * @param displayName
     *        The image builder name to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The VPC configuration for the image builder. You can specify only one subnet.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the image builder. You can specify only one subnet.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the image builder. You can specify only one subnet.
     * </p>
     * 
     * @return The VPC configuration for the image builder. You can specify only one subnet.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the image builder. You can specify only one subnet.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the image builder. You can specify only one subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to apply to the image builder. To assume a role, the image builder
     * calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role
     * to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary
     * credentials and creates the <b>AppStream_Machine_Role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role to apply to the image builder. To assume a role, the image
     *        builder calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the
     *        ARN of the role to use. The operation creates a new session with temporary credentials. AppStream 2.0
     *        retrieves the temporary credentials and creates the <b>AppStream_Machine_Role</b> credential profile on
     *        the instance.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     *        >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     *        Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to apply to the image builder. To assume a role, the image builder
     * calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role
     * to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary
     * credentials and creates the <b>AppStream_Machine_Role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to apply to the image builder. To assume a role, the image
     *         builder calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the
     *         ARN of the role to use. The operation creates a new session with temporary credentials. AppStream 2.0
     *         retrieves the temporary credentials and creates the <b>AppStream_Machine_Role</b> credential profile on
     *         the instance.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     *         >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     *         Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to apply to the image builder. To assume a role, the image builder
     * calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of the role
     * to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary
     * credentials and creates the <b>AppStream_Machine_Role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role to apply to the image builder. To assume a role, the image
     *        builder calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the
     *        ARN of the role to use. The operation creates a new session with temporary credentials. AppStream 2.0
     *        retrieves the temporary credentials and creates the <b>AppStream_Machine_Role</b> credential profile on
     *        the instance.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     *        >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     *        Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Enables or disables default internet access for the image builder.
     */

    public void setEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     * 
     * @return Enables or disables default internet access for the image builder.
     */

    public Boolean getEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Enables or disables default internet access for the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        setEnableDefaultInternetAccess(enableDefaultInternetAccess);
        return this;
    }

    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     * 
     * @return Enables or disables default internet access for the image builder.
     */

    public Boolean isEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active
     * Directory domain.
     * </p>
     * 
     * @param domainJoinInfo
     *        The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft
     *        Active Directory domain.
     */

    public void setDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        this.domainJoinInfo = domainJoinInfo;
    }

    /**
     * <p>
     * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active
     * Directory domain.
     * </p>
     * 
     * @return The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft
     *         Active Directory domain.
     */

    public DomainJoinInfo getDomainJoinInfo() {
        return this.domainJoinInfo;
    }

    /**
     * <p>
     * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active
     * Directory domain.
     * </p>
     * 
     * @param domainJoinInfo
     *        The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft
     *        Active Directory domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        setDomainJoinInfo(domainJoinInfo);
        return this;
    }

    /**
     * <p>
     * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream
     * 2.0 agent, specify [LATEST].
     * </p>
     * 
     * @param appstreamAgentVersion
     *        The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the
     *        AppStream 2.0 agent, specify [LATEST].
     */

    public void setAppstreamAgentVersion(String appstreamAgentVersion) {
        this.appstreamAgentVersion = appstreamAgentVersion;
    }

    /**
     * <p>
     * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream
     * 2.0 agent, specify [LATEST].
     * </p>
     * 
     * @return The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the
     *         AppStream 2.0 agent, specify [LATEST].
     */

    public String getAppstreamAgentVersion() {
        return this.appstreamAgentVersion;
    }

    /**
     * <p>
     * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream
     * 2.0 agent, specify [LATEST].
     * </p>
     * 
     * @param appstreamAgentVersion
     *        The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the
     *        AppStream 2.0 agent, specify [LATEST].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withAppstreamAgentVersion(String appstreamAgentVersion) {
        setAppstreamAgentVersion(appstreamAgentVersion);
        return this;
    }

    /**
     * <p>
     * The tags to associate with the image builder. A tag is a key-value pair, and the value is optional. For example,
     * Environment=Test. If you do not specify a value, Environment=.
     * </p>
     * <p>
     * Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special
     * characters:
     * </p>
     * <p>
     * _ . : / = + \ - @
     * </p>
     * <p>
     * If you do not specify a value, the value is set to an empty string.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @return The tags to associate with the image builder. A tag is a key-value pair, and the value is optional. For
     *         example, Environment=Test. If you do not specify a value, Environment=. </p>
     *         <p>
     *         Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following
     *         special characters:
     *         </p>
     *         <p>
     *         _ . : / = + \ - @
     *         </p>
     *         <p>
     *         If you do not specify a value, the value is set to an empty string.
     *         </p>
     *         <p>
     *         For more information about tags, see <a
     *         href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your
     *         Resources</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to associate with the image builder. A tag is a key-value pair, and the value is optional. For example,
     * Environment=Test. If you do not specify a value, Environment=.
     * </p>
     * <p>
     * Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special
     * characters:
     * </p>
     * <p>
     * _ . : / = + \ - @
     * </p>
     * <p>
     * If you do not specify a value, the value is set to an empty string.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the image builder. A tag is a key-value pair, and the value is optional. For
     *        example, Environment=Test. If you do not specify a value, Environment=. </p>
     *        <p>
     *        Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following
     *        special characters:
     *        </p>
     *        <p>
     *        _ . : / = + \ - @
     *        </p>
     *        <p>
     *        If you do not specify a value, the value is set to an empty string.
     *        </p>
     *        <p>
     *        For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your
     *        Resources</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to associate with the image builder. A tag is a key-value pair, and the value is optional. For example,
     * Environment=Test. If you do not specify a value, Environment=.
     * </p>
     * <p>
     * Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special
     * characters:
     * </p>
     * <p>
     * _ . : / = + \ - @
     * </p>
     * <p>
     * If you do not specify a value, the value is set to an empty string.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the image builder. A tag is a key-value pair, and the value is optional. For
     *        example, Environment=Test. If you do not specify a value, Environment=. </p>
     *        <p>
     *        Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following
     *        special characters:
     *        </p>
     *        <p>
     *        _ . : / = + \ - @
     *        </p>
     *        <p>
     *        If you do not specify a value, the value is set to an empty string.
     *        </p>
     *        <p>
     *        For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your
     *        Resources</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateImageBuilderRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest addTagsEntry(String key, String value) {
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

    public CreateImageBuilderRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the image builder
     * only through the specified endpoints.
     * </p>
     * 
     * @return The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the image
     *         builder only through the specified endpoints.
     */

    public java.util.List<AccessEndpoint> getAccessEndpoints() {
        return accessEndpoints;
    }

    /**
     * <p>
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the image builder
     * only through the specified endpoints.
     * </p>
     * 
     * @param accessEndpoints
     *        The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the image
     *        builder only through the specified endpoints.
     */

    public void setAccessEndpoints(java.util.Collection<AccessEndpoint> accessEndpoints) {
        if (accessEndpoints == null) {
            this.accessEndpoints = null;
            return;
        }

        this.accessEndpoints = new java.util.ArrayList<AccessEndpoint>(accessEndpoints);
    }

    /**
     * <p>
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the image builder
     * only through the specified endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessEndpoints(java.util.Collection)} or {@link #withAccessEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param accessEndpoints
     *        The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the image
     *        builder only through the specified endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withAccessEndpoints(AccessEndpoint... accessEndpoints) {
        if (this.accessEndpoints == null) {
            setAccessEndpoints(new java.util.ArrayList<AccessEndpoint>(accessEndpoints.length));
        }
        for (AccessEndpoint ele : accessEndpoints) {
            this.accessEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the image builder
     * only through the specified endpoints.
     * </p>
     * 
     * @param accessEndpoints
     *        The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the image
     *        builder only through the specified endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withAccessEndpoints(java.util.Collection<AccessEndpoint> accessEndpoints) {
        setAccessEndpoints(accessEndpoints);
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
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getImageArn() != null)
            sb.append("ImageArn: ").append(getImageArn()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getEnableDefaultInternetAccess() != null)
            sb.append("EnableDefaultInternetAccess: ").append(getEnableDefaultInternetAccess()).append(",");
        if (getDomainJoinInfo() != null)
            sb.append("DomainJoinInfo: ").append(getDomainJoinInfo()).append(",");
        if (getAppstreamAgentVersion() != null)
            sb.append("AppstreamAgentVersion: ").append(getAppstreamAgentVersion()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAccessEndpoints() != null)
            sb.append("AccessEndpoints: ").append(getAccessEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImageBuilderRequest == false)
            return false;
        CreateImageBuilderRequest other = (CreateImageBuilderRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getImageArn() == null ^ this.getImageArn() == null)
            return false;
        if (other.getImageArn() != null && other.getImageArn().equals(this.getImageArn()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getEnableDefaultInternetAccess() == null ^ this.getEnableDefaultInternetAccess() == null)
            return false;
        if (other.getEnableDefaultInternetAccess() != null && other.getEnableDefaultInternetAccess().equals(this.getEnableDefaultInternetAccess()) == false)
            return false;
        if (other.getDomainJoinInfo() == null ^ this.getDomainJoinInfo() == null)
            return false;
        if (other.getDomainJoinInfo() != null && other.getDomainJoinInfo().equals(this.getDomainJoinInfo()) == false)
            return false;
        if (other.getAppstreamAgentVersion() == null ^ this.getAppstreamAgentVersion() == null)
            return false;
        if (other.getAppstreamAgentVersion() != null && other.getAppstreamAgentVersion().equals(this.getAppstreamAgentVersion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAccessEndpoints() == null ^ this.getAccessEndpoints() == null)
            return false;
        if (other.getAccessEndpoints() != null && other.getAccessEndpoints().equals(this.getAccessEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getImageArn() == null) ? 0 : getImageArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEnableDefaultInternetAccess() == null) ? 0 : getEnableDefaultInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getDomainJoinInfo() == null) ? 0 : getDomainJoinInfo().hashCode());
        hashCode = prime * hashCode + ((getAppstreamAgentVersion() == null) ? 0 : getAppstreamAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAccessEndpoints() == null) ? 0 : getAccessEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public CreateImageBuilderRequest clone() {
        return (CreateImageBuilderRequest) super.clone();
    }

}
