/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateAppBlockBuilder" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppBlockBuilderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name for the app block builder.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the app block builder.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the app block builder.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The platform of the app block builder.
     * </p>
     * <p>
     * <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The instance type to use when launching the app block builder. The following instance types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.small
     * </p>
     * </li>
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
     * stream.standard.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.2xlarge
     * </p>
     * </li>
     * </ul>
     */
    private String instanceType;
    /**
     * <p>
     * The VPC configuration for the app block builder.
     * </p>
     * <p>
     * App block builders require that you specify at least two subnets in different availability zones.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * Enables or disables default internet access for the app block builder.
     * </p>
     */
    private Boolean enableDefaultInternetAccess;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to apply to the app block builder. To assume a role, the app block
     * builder calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of
     * the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the
     * temporary credentials and creates the <b>appstream_machine_role</b> credential profile on the instance.
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
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app block
     * builder only through the specified endpoints.
     * </p>
     */
    private java.util.List<AccessEndpoint> accessEndpoints;
    /**
     * <p>
     * The attributes to delete from the app block builder.
     * </p>
     */
    private java.util.List<String> attributesToDelete;

    /**
     * <p>
     * The unique name for the app block builder.
     * </p>
     * 
     * @param name
     *        The unique name for the app block builder.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name for the app block builder.
     * </p>
     * 
     * @return The unique name for the app block builder.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name for the app block builder.
     * </p>
     * 
     * @param name
     *        The unique name for the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppBlockBuilderRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the app block builder.
     * </p>
     * 
     * @param description
     *        The description of the app block builder.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the app block builder.
     * </p>
     * 
     * @return The description of the app block builder.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the app block builder.
     * </p>
     * 
     * @param description
     *        The description of the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppBlockBuilderRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the app block builder.
     * </p>
     * 
     * @param displayName
     *        The display name of the app block builder.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the app block builder.
     * </p>
     * 
     * @return The display name of the app block builder.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the app block builder.
     * </p>
     * 
     * @param displayName
     *        The display name of the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppBlockBuilderRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The platform of the app block builder.
     * </p>
     * <p>
     * <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * </p>
     * 
     * @param platform
     *        The platform of the app block builder.</p>
     *        <p>
     *        <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * @see PlatformType
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the app block builder.
     * </p>
     * <p>
     * <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * </p>
     * 
     * @return The platform of the app block builder.</p>
     *         <p>
     *         <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * @see PlatformType
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the app block builder.
     * </p>
     * <p>
     * <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * </p>
     * 
     * @param platform
     *        The platform of the app block builder.</p>
     *        <p>
     *        <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public UpdateAppBlockBuilderRequest withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the app block builder.
     * </p>
     * <p>
     * <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * </p>
     * 
     * @param platform
     *        The platform of the app block builder.</p>
     *        <p>
     *        <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public UpdateAppBlockBuilderRequest withPlatform(PlatformType platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The instance type to use when launching the app block builder. The following instance types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.small
     * </p>
     * </li>
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
     * stream.standard.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.2xlarge
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceType
     *        The instance type to use when launching the app block builder. The following instance types are
     *        available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        stream.standard.small
     *        </p>
     *        </li>
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
     *        stream.standard.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.standard.2xlarge
     *        </p>
     *        </li>
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type to use when launching the app block builder. The following instance types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.small
     * </p>
     * </li>
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
     * stream.standard.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.2xlarge
     * </p>
     * </li>
     * </ul>
     * 
     * @return The instance type to use when launching the app block builder. The following instance types are
     *         available:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         stream.standard.small
     *         </p>
     *         </li>
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
     *         stream.standard.xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.standard.2xlarge
     *         </p>
     *         </li>
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type to use when launching the app block builder. The following instance types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.small
     * </p>
     * </li>
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
     * stream.standard.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.2xlarge
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceType
     *        The instance type to use when launching the app block builder. The following instance types are
     *        available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        stream.standard.small
     *        </p>
     *        </li>
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
     *        stream.standard.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.standard.2xlarge
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppBlockBuilderRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The VPC configuration for the app block builder.
     * </p>
     * <p>
     * App block builders require that you specify at least two subnets in different availability zones.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the app block builder.</p>
     *        <p>
     *        App block builders require that you specify at least two subnets in different availability zones.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the app block builder.
     * </p>
     * <p>
     * App block builders require that you specify at least two subnets in different availability zones.
     * </p>
     * 
     * @return The VPC configuration for the app block builder.</p>
     *         <p>
     *         App block builders require that you specify at least two subnets in different availability zones.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the app block builder.
     * </p>
     * <p>
     * App block builders require that you specify at least two subnets in different availability zones.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the app block builder.</p>
     *        <p>
     *        App block builders require that you specify at least two subnets in different availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppBlockBuilderRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * Enables or disables default internet access for the app block builder.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Enables or disables default internet access for the app block builder.
     */

    public void setEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Enables or disables default internet access for the app block builder.
     * </p>
     * 
     * @return Enables or disables default internet access for the app block builder.
     */

    public Boolean getEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Enables or disables default internet access for the app block builder.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Enables or disables default internet access for the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppBlockBuilderRequest withEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        setEnableDefaultInternetAccess(enableDefaultInternetAccess);
        return this;
    }

    /**
     * <p>
     * Enables or disables default internet access for the app block builder.
     * </p>
     * 
     * @return Enables or disables default internet access for the app block builder.
     */

    public Boolean isEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to apply to the app block builder. To assume a role, the app block
     * builder calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of
     * the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the
     * temporary credentials and creates the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role to apply to the app block builder. To assume a role, the
     *        app block builder calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and
     *        passes the ARN of the role to use. The operation creates a new session with temporary credentials.
     *        AppStream 2.0 retrieves the temporary credentials and creates the <b>appstream_machine_role</b> credential
     *        profile on the instance.</p>
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
     * The Amazon Resource Name (ARN) of the IAM role to apply to the app block builder. To assume a role, the app block
     * builder calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of
     * the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the
     * temporary credentials and creates the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to apply to the app block builder. To assume a role, the
     *         app block builder calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and
     *         passes the ARN of the role to use. The operation creates a new session with temporary credentials.
     *         AppStream 2.0 retrieves the temporary credentials and creates the <b>appstream_machine_role</b>
     *         credential profile on the instance.</p>
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
     * The Amazon Resource Name (ARN) of the IAM role to apply to the app block builder. To assume a role, the app block
     * builder calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and passes the ARN of
     * the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the
     * temporary credentials and creates the <b>appstream_machine_role</b> credential profile on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     * >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     * Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role to apply to the app block builder. To assume a role, the
     *        app block builder calls the AWS Security Token Service (STS) <code>AssumeRole</code> API operation and
     *        passes the ARN of the role to use. The operation creates a new session with temporary credentials.
     *        AppStream 2.0 retrieves the temporary credentials and creates the <b>appstream_machine_role</b> credential
     *        profile on the instance.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html"
     *        >Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming
     *        Instances</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppBlockBuilderRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app block
     * builder only through the specified endpoints.
     * </p>
     * 
     * @return The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app
     *         block builder only through the specified endpoints.
     */

    public java.util.List<AccessEndpoint> getAccessEndpoints() {
        return accessEndpoints;
    }

    /**
     * <p>
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app block
     * builder only through the specified endpoints.
     * </p>
     * 
     * @param accessEndpoints
     *        The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app
     *        block builder only through the specified endpoints.
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
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app block
     * builder only through the specified endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessEndpoints(java.util.Collection)} or {@link #withAccessEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param accessEndpoints
     *        The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app
     *        block builder only through the specified endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppBlockBuilderRequest withAccessEndpoints(AccessEndpoint... accessEndpoints) {
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
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app block
     * builder only through the specified endpoints.
     * </p>
     * 
     * @param accessEndpoints
     *        The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app
     *        block builder only through the specified endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppBlockBuilderRequest withAccessEndpoints(java.util.Collection<AccessEndpoint> accessEndpoints) {
        setAccessEndpoints(accessEndpoints);
        return this;
    }

    /**
     * <p>
     * The attributes to delete from the app block builder.
     * </p>
     * 
     * @return The attributes to delete from the app block builder.
     * @see AppBlockBuilderAttribute
     */

    public java.util.List<String> getAttributesToDelete() {
        return attributesToDelete;
    }

    /**
     * <p>
     * The attributes to delete from the app block builder.
     * </p>
     * 
     * @param attributesToDelete
     *        The attributes to delete from the app block builder.
     * @see AppBlockBuilderAttribute
     */

    public void setAttributesToDelete(java.util.Collection<String> attributesToDelete) {
        if (attributesToDelete == null) {
            this.attributesToDelete = null;
            return;
        }

        this.attributesToDelete = new java.util.ArrayList<String>(attributesToDelete);
    }

    /**
     * <p>
     * The attributes to delete from the app block builder.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributesToDelete(java.util.Collection)} or {@link #withAttributesToDelete(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param attributesToDelete
     *        The attributes to delete from the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppBlockBuilderAttribute
     */

    public UpdateAppBlockBuilderRequest withAttributesToDelete(String... attributesToDelete) {
        if (this.attributesToDelete == null) {
            setAttributesToDelete(new java.util.ArrayList<String>(attributesToDelete.length));
        }
        for (String ele : attributesToDelete) {
            this.attributesToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes to delete from the app block builder.
     * </p>
     * 
     * @param attributesToDelete
     *        The attributes to delete from the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppBlockBuilderAttribute
     */

    public UpdateAppBlockBuilderRequest withAttributesToDelete(java.util.Collection<String> attributesToDelete) {
        setAttributesToDelete(attributesToDelete);
        return this;
    }

    /**
     * <p>
     * The attributes to delete from the app block builder.
     * </p>
     * 
     * @param attributesToDelete
     *        The attributes to delete from the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppBlockBuilderAttribute
     */

    public UpdateAppBlockBuilderRequest withAttributesToDelete(AppBlockBuilderAttribute... attributesToDelete) {
        java.util.ArrayList<String> attributesToDeleteCopy = new java.util.ArrayList<String>(attributesToDelete.length);
        for (AppBlockBuilderAttribute value : attributesToDelete) {
            attributesToDeleteCopy.add(value.toString());
        }
        if (getAttributesToDelete() == null) {
            setAttributesToDelete(attributesToDeleteCopy);
        } else {
            getAttributesToDelete().addAll(attributesToDeleteCopy);
        }
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getEnableDefaultInternetAccess() != null)
            sb.append("EnableDefaultInternetAccess: ").append(getEnableDefaultInternetAccess()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getAccessEndpoints() != null)
            sb.append("AccessEndpoints: ").append(getAccessEndpoints()).append(",");
        if (getAttributesToDelete() != null)
            sb.append("AttributesToDelete: ").append(getAttributesToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppBlockBuilderRequest == false)
            return false;
        UpdateAppBlockBuilderRequest other = (UpdateAppBlockBuilderRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getEnableDefaultInternetAccess() == null ^ this.getEnableDefaultInternetAccess() == null)
            return false;
        if (other.getEnableDefaultInternetAccess() != null && other.getEnableDefaultInternetAccess().equals(this.getEnableDefaultInternetAccess()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getAccessEndpoints() == null ^ this.getAccessEndpoints() == null)
            return false;
        if (other.getAccessEndpoints() != null && other.getAccessEndpoints().equals(this.getAccessEndpoints()) == false)
            return false;
        if (other.getAttributesToDelete() == null ^ this.getAttributesToDelete() == null)
            return false;
        if (other.getAttributesToDelete() != null && other.getAttributesToDelete().equals(this.getAttributesToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getEnableDefaultInternetAccess() == null) ? 0 : getEnableDefaultInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAccessEndpoints() == null) ? 0 : getAccessEndpoints().hashCode());
        hashCode = prime * hashCode + ((getAttributesToDelete() == null) ? 0 : getAttributesToDelete().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppBlockBuilderRequest clone() {
        return (UpdateAppBlockBuilderRequest) super.clone();
    }

}
