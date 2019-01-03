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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/Stack" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Stack implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The stack name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The stack's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The VPC ID; applicable only if the stack is running in a VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The stack's attributes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;
    /**
     * <p>
     * The stack AWS Identity and Access Management (IAM) role.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information
     * about IAM ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * </p>
     */
    private String defaultInstanceProfileArn;
    /**
     * <p>
     * The stack's default operating system.
     * </p>
     */
    private String defaultOs;
    /**
     * <p>
     * The stack host name theme, with spaces replaced by underscores.
     * </p>
     */
    private String hostnameTheme;
    /**
     * <p>
     * The stack's default Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     */
    private String defaultAvailabilityZone;
    /**
     * <p>
     * The default subnet ID; applicable only if the stack is running in a VPC.
     * </p>
     */
    private String defaultSubnetId;
    /**
     * <p>
     * A JSON object that contains user-defined attributes to be added to the stack configuration and deployment
     * attributes. You can use custom JSON to override the corresponding default stack configuration attribute values or
     * to pass data to recipes. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>.
     * </p>
     */
    private String customJson;
    /**
     * <p>
     * The configuration manager.
     * </p>
     */
    private StackConfigurationManager configurationManager;
    /**
     * <p>
     * A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf version. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     */
    private ChefConfiguration chefConfiguration;
    /**
     * <p>
     * Whether the stack uses custom cookbooks.
     * </p>
     */
    private Boolean useCustomCookbooks;
    /**
     * <p>
     * Whether the stack automatically associates the AWS OpsWorks Stacks built-in security groups with the stack's
     * layers.
     * </p>
     */
    private Boolean useOpsworksSecurityGroups;

    private Source customCookbooksSource;
    /**
     * <p>
     * A default Amazon EC2 key pair for the stack's instances. You can override this value when you create or update an
     * instance.
     * </p>
     */
    private String defaultSshKeyName;
    /**
     * <p>
     * The date when the stack was created.
     * </p>
     */
    private String createdAt;
    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the stack, but you can override
     * it when you create an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     */
    private String defaultRootDeviceType;
    /**
     * <p>
     * The agent version. This parameter is set to <code>LATEST</code> for auto-update. or a version number for a fixed
     * agent version.
     * </p>
     */
    private String agentVersion;

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The stack name.
     * </p>
     * 
     * @param name
     *        The stack name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The stack name.
     * </p>
     * 
     * @return The stack name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The stack name.
     * </p>
     * 
     * @param name
     *        The stack name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The stack's ARN.
     * </p>
     * 
     * @param arn
     *        The stack's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The stack's ARN.
     * </p>
     * 
     * @return The stack's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The stack's ARN.
     * </p>
     * 
     * @param arn
     *        The stack's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param region
     *        The stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @return The stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param region
     *        The stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The VPC ID; applicable only if the stack is running in a VPC.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID; applicable only if the stack is running in a VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID; applicable only if the stack is running in a VPC.
     * </p>
     * 
     * @return The VPC ID; applicable only if the stack is running in a VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID; applicable only if the stack is running in a VPC.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID; applicable only if the stack is running in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The stack's attributes.
     * </p>
     * 
     * @return The stack's attributes.
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * The stack's attributes.
     * </p>
     * 
     * @param attributes
     *        The stack's attributes.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * The stack's attributes.
     * </p>
     * 
     * @param attributes
     *        The stack's attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public Stack addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The stack AWS Identity and Access Management (IAM) role.
     * </p>
     * 
     * @param serviceRoleArn
     *        The stack AWS Identity and Access Management (IAM) role.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The stack AWS Identity and Access Management (IAM) role.
     * </p>
     * 
     * @return The stack AWS Identity and Access Management (IAM) role.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The stack AWS Identity and Access Management (IAM) role.
     * </p>
     * 
     * @param serviceRoleArn
     *        The stack AWS Identity and Access Management (IAM) role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information
     * about IAM ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * </p>
     * 
     * @param defaultInstanceProfileArn
     *        The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more
     *        information about IAM ARNs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     */

    public void setDefaultInstanceProfileArn(String defaultInstanceProfileArn) {
        this.defaultInstanceProfileArn = defaultInstanceProfileArn;
    }

    /**
     * <p>
     * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information
     * about IAM ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * </p>
     * 
     * @return The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more
     *         information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     */

    public String getDefaultInstanceProfileArn() {
        return this.defaultInstanceProfileArn;
    }

    /**
     * <p>
     * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information
     * about IAM ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * </p>
     * 
     * @param defaultInstanceProfileArn
     *        The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more
     *        information about IAM ARNs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDefaultInstanceProfileArn(String defaultInstanceProfileArn) {
        setDefaultInstanceProfileArn(defaultInstanceProfileArn);
        return this;
    }

    /**
     * <p>
     * The stack's default operating system.
     * </p>
     * 
     * @param defaultOs
     *        The stack's default operating system.
     */

    public void setDefaultOs(String defaultOs) {
        this.defaultOs = defaultOs;
    }

    /**
     * <p>
     * The stack's default operating system.
     * </p>
     * 
     * @return The stack's default operating system.
     */

    public String getDefaultOs() {
        return this.defaultOs;
    }

    /**
     * <p>
     * The stack's default operating system.
     * </p>
     * 
     * @param defaultOs
     *        The stack's default operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDefaultOs(String defaultOs) {
        setDefaultOs(defaultOs);
        return this;
    }

    /**
     * <p>
     * The stack host name theme, with spaces replaced by underscores.
     * </p>
     * 
     * @param hostnameTheme
     *        The stack host name theme, with spaces replaced by underscores.
     */

    public void setHostnameTheme(String hostnameTheme) {
        this.hostnameTheme = hostnameTheme;
    }

    /**
     * <p>
     * The stack host name theme, with spaces replaced by underscores.
     * </p>
     * 
     * @return The stack host name theme, with spaces replaced by underscores.
     */

    public String getHostnameTheme() {
        return this.hostnameTheme;
    }

    /**
     * <p>
     * The stack host name theme, with spaces replaced by underscores.
     * </p>
     * 
     * @param hostnameTheme
     *        The stack host name theme, with spaces replaced by underscores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withHostnameTheme(String hostnameTheme) {
        setHostnameTheme(hostnameTheme);
        return this;
    }

    /**
     * <p>
     * The stack's default Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param defaultAvailabilityZone
     *        The stack's default Availability Zone. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public void setDefaultAvailabilityZone(String defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
    }

    /**
     * <p>
     * The stack's default Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @return The stack's default Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public String getDefaultAvailabilityZone() {
        return this.defaultAvailabilityZone;
    }

    /**
     * <p>
     * The stack's default Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param defaultAvailabilityZone
     *        The stack's default Availability Zone. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDefaultAvailabilityZone(String defaultAvailabilityZone) {
        setDefaultAvailabilityZone(defaultAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The default subnet ID; applicable only if the stack is running in a VPC.
     * </p>
     * 
     * @param defaultSubnetId
     *        The default subnet ID; applicable only if the stack is running in a VPC.
     */

    public void setDefaultSubnetId(String defaultSubnetId) {
        this.defaultSubnetId = defaultSubnetId;
    }

    /**
     * <p>
     * The default subnet ID; applicable only if the stack is running in a VPC.
     * </p>
     * 
     * @return The default subnet ID; applicable only if the stack is running in a VPC.
     */

    public String getDefaultSubnetId() {
        return this.defaultSubnetId;
    }

    /**
     * <p>
     * The default subnet ID; applicable only if the stack is running in a VPC.
     * </p>
     * 
     * @param defaultSubnetId
     *        The default subnet ID; applicable only if the stack is running in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDefaultSubnetId(String defaultSubnetId) {
        setDefaultSubnetId(defaultSubnetId);
        return this;
    }

    /**
     * <p>
     * A JSON object that contains user-defined attributes to be added to the stack configuration and deployment
     * attributes. You can use custom JSON to override the corresponding default stack configuration attribute values or
     * to pass data to recipes. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>.
     * </p>
     * 
     * @param customJson
     *        A JSON object that contains user-defined attributes to be added to the stack configuration and deployment
     *        attributes. You can use custom JSON to override the corresponding default stack configuration attribute
     *        values or to pass data to recipes. The string should be in the following format:</p>
     *        <p>
     *        <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *        </p>
     *        <p>
     *        For more information on custom JSON, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *        Modify the Stack Configuration Attributes</a>.
     */

    public void setCustomJson(String customJson) {
        this.customJson = customJson;
    }

    /**
     * <p>
     * A JSON object that contains user-defined attributes to be added to the stack configuration and deployment
     * attributes. You can use custom JSON to override the corresponding default stack configuration attribute values or
     * to pass data to recipes. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>.
     * </p>
     * 
     * @return A JSON object that contains user-defined attributes to be added to the stack configuration and deployment
     *         attributes. You can use custom JSON to override the corresponding default stack configuration attribute
     *         values or to pass data to recipes. The string should be in the following format:</p>
     *         <p>
     *         <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *         </p>
     *         <p>
     *         For more information on custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *         Modify the Stack Configuration Attributes</a>.
     */

    public String getCustomJson() {
        return this.customJson;
    }

    /**
     * <p>
     * A JSON object that contains user-defined attributes to be added to the stack configuration and deployment
     * attributes. You can use custom JSON to override the corresponding default stack configuration attribute values or
     * to pass data to recipes. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>.
     * </p>
     * 
     * @param customJson
     *        A JSON object that contains user-defined attributes to be added to the stack configuration and deployment
     *        attributes. You can use custom JSON to override the corresponding default stack configuration attribute
     *        values or to pass data to recipes. The string should be in the following format:</p>
     *        <p>
     *        <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *        </p>
     *        <p>
     *        For more information on custom JSON, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *        Modify the Stack Configuration Attributes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withCustomJson(String customJson) {
        setCustomJson(customJson);
        return this;
    }

    /**
     * <p>
     * The configuration manager.
     * </p>
     * 
     * @param configurationManager
     *        The configuration manager.
     */

    public void setConfigurationManager(StackConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
    }

    /**
     * <p>
     * The configuration manager.
     * </p>
     * 
     * @return The configuration manager.
     */

    public StackConfigurationManager getConfigurationManager() {
        return this.configurationManager;
    }

    /**
     * <p>
     * The configuration manager.
     * </p>
     * 
     * @param configurationManager
     *        The configuration manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withConfigurationManager(StackConfigurationManager configurationManager) {
        setConfigurationManager(configurationManager);
        return this;
    }

    /**
     * <p>
     * A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf version. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @param chefConfiguration
     *        A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf
     *        version. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *        Stack</a>.
     */

    public void setChefConfiguration(ChefConfiguration chefConfiguration) {
        this.chefConfiguration = chefConfiguration;
    }

    /**
     * <p>
     * A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf version. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @return A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf
     *         version. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *         Stack</a>.
     */

    public ChefConfiguration getChefConfiguration() {
        return this.chefConfiguration;
    }

    /**
     * <p>
     * A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf version. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @param chefConfiguration
     *        A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf
     *        version. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *        Stack</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withChefConfiguration(ChefConfiguration chefConfiguration) {
        setChefConfiguration(chefConfiguration);
        return this;
    }

    /**
     * <p>
     * Whether the stack uses custom cookbooks.
     * </p>
     * 
     * @param useCustomCookbooks
     *        Whether the stack uses custom cookbooks.
     */

    public void setUseCustomCookbooks(Boolean useCustomCookbooks) {
        this.useCustomCookbooks = useCustomCookbooks;
    }

    /**
     * <p>
     * Whether the stack uses custom cookbooks.
     * </p>
     * 
     * @return Whether the stack uses custom cookbooks.
     */

    public Boolean getUseCustomCookbooks() {
        return this.useCustomCookbooks;
    }

    /**
     * <p>
     * Whether the stack uses custom cookbooks.
     * </p>
     * 
     * @param useCustomCookbooks
     *        Whether the stack uses custom cookbooks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withUseCustomCookbooks(Boolean useCustomCookbooks) {
        setUseCustomCookbooks(useCustomCookbooks);
        return this;
    }

    /**
     * <p>
     * Whether the stack uses custom cookbooks.
     * </p>
     * 
     * @return Whether the stack uses custom cookbooks.
     */

    public Boolean isUseCustomCookbooks() {
        return this.useCustomCookbooks;
    }

    /**
     * <p>
     * Whether the stack automatically associates the AWS OpsWorks Stacks built-in security groups with the stack's
     * layers.
     * </p>
     * 
     * @param useOpsworksSecurityGroups
     *        Whether the stack automatically associates the AWS OpsWorks Stacks built-in security groups with the
     *        stack's layers.
     */

    public void setUseOpsworksSecurityGroups(Boolean useOpsworksSecurityGroups) {
        this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
    }

    /**
     * <p>
     * Whether the stack automatically associates the AWS OpsWorks Stacks built-in security groups with the stack's
     * layers.
     * </p>
     * 
     * @return Whether the stack automatically associates the AWS OpsWorks Stacks built-in security groups with the
     *         stack's layers.
     */

    public Boolean getUseOpsworksSecurityGroups() {
        return this.useOpsworksSecurityGroups;
    }

    /**
     * <p>
     * Whether the stack automatically associates the AWS OpsWorks Stacks built-in security groups with the stack's
     * layers.
     * </p>
     * 
     * @param useOpsworksSecurityGroups
     *        Whether the stack automatically associates the AWS OpsWorks Stacks built-in security groups with the
     *        stack's layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withUseOpsworksSecurityGroups(Boolean useOpsworksSecurityGroups) {
        setUseOpsworksSecurityGroups(useOpsworksSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Whether the stack automatically associates the AWS OpsWorks Stacks built-in security groups with the stack's
     * layers.
     * </p>
     * 
     * @return Whether the stack automatically associates the AWS OpsWorks Stacks built-in security groups with the
     *         stack's layers.
     */

    public Boolean isUseOpsworksSecurityGroups() {
        return this.useOpsworksSecurityGroups;
    }

    /**
     * @param customCookbooksSource
     */

    public void setCustomCookbooksSource(Source customCookbooksSource) {
        this.customCookbooksSource = customCookbooksSource;
    }

    /**
     * @return
     */

    public Source getCustomCookbooksSource() {
        return this.customCookbooksSource;
    }

    /**
     * @param customCookbooksSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withCustomCookbooksSource(Source customCookbooksSource) {
        setCustomCookbooksSource(customCookbooksSource);
        return this;
    }

    /**
     * <p>
     * A default Amazon EC2 key pair for the stack's instances. You can override this value when you create or update an
     * instance.
     * </p>
     * 
     * @param defaultSshKeyName
     *        A default Amazon EC2 key pair for the stack's instances. You can override this value when you create or
     *        update an instance.
     */

    public void setDefaultSshKeyName(String defaultSshKeyName) {
        this.defaultSshKeyName = defaultSshKeyName;
    }

    /**
     * <p>
     * A default Amazon EC2 key pair for the stack's instances. You can override this value when you create or update an
     * instance.
     * </p>
     * 
     * @return A default Amazon EC2 key pair for the stack's instances. You can override this value when you create or
     *         update an instance.
     */

    public String getDefaultSshKeyName() {
        return this.defaultSshKeyName;
    }

    /**
     * <p>
     * A default Amazon EC2 key pair for the stack's instances. You can override this value when you create or update an
     * instance.
     * </p>
     * 
     * @param defaultSshKeyName
     *        A default Amazon EC2 key pair for the stack's instances. You can override this value when you create or
     *        update an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDefaultSshKeyName(String defaultSshKeyName) {
        setDefaultSshKeyName(defaultSshKeyName);
        return this;
    }

    /**
     * <p>
     * The date when the stack was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the stack was created.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the stack was created.
     * </p>
     * 
     * @return The date when the stack was created.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date when the stack was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the stack was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the stack, but you can override
     * it when you create an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param defaultRootDeviceType
     *        The default root device type. This value is used by default for all instances in the stack, but you can
     *        override it when you create an instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public void setDefaultRootDeviceType(String defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType;
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the stack, but you can override
     * it when you create an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @return The default root device type. This value is used by default for all instances in the stack, but you can
     *         override it when you create an instance. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *         >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public String getDefaultRootDeviceType() {
        return this.defaultRootDeviceType;
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the stack, but you can override
     * it when you create an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param defaultRootDeviceType
     *        The default root device type. This value is used by default for all instances in the stack, but you can
     *        override it when you create an instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public Stack withDefaultRootDeviceType(String defaultRootDeviceType) {
        setDefaultRootDeviceType(defaultRootDeviceType);
        return this;
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the stack, but you can override
     * it when you create an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param defaultRootDeviceType
     *        The default root device type. This value is used by default for all instances in the stack, but you can
     *        override it when you create an instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public void setDefaultRootDeviceType(RootDeviceType defaultRootDeviceType) {
        withDefaultRootDeviceType(defaultRootDeviceType);
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the stack, but you can override
     * it when you create an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param defaultRootDeviceType
     *        The default root device type. This value is used by default for all instances in the stack, but you can
     *        override it when you create an instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public Stack withDefaultRootDeviceType(RootDeviceType defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType.toString();
        return this;
    }

    /**
     * <p>
     * The agent version. This parameter is set to <code>LATEST</code> for auto-update. or a version number for a fixed
     * agent version.
     * </p>
     * 
     * @param agentVersion
     *        The agent version. This parameter is set to <code>LATEST</code> for auto-update. or a version number for a
     *        fixed agent version.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The agent version. This parameter is set to <code>LATEST</code> for auto-update. or a version number for a fixed
     * agent version.
     * </p>
     * 
     * @return The agent version. This parameter is set to <code>LATEST</code> for auto-update. or a version number for
     *         a fixed agent version.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The agent version. This parameter is set to <code>LATEST</code> for auto-update. or a version number for a fixed
     * agent version.
     * </p>
     * 
     * @param agentVersion
     *        The agent version. This parameter is set to <code>LATEST</code> for auto-update. or a version number for a
     *        fixed agent version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getDefaultInstanceProfileArn() != null)
            sb.append("DefaultInstanceProfileArn: ").append(getDefaultInstanceProfileArn()).append(",");
        if (getDefaultOs() != null)
            sb.append("DefaultOs: ").append(getDefaultOs()).append(",");
        if (getHostnameTheme() != null)
            sb.append("HostnameTheme: ").append(getHostnameTheme()).append(",");
        if (getDefaultAvailabilityZone() != null)
            sb.append("DefaultAvailabilityZone: ").append(getDefaultAvailabilityZone()).append(",");
        if (getDefaultSubnetId() != null)
            sb.append("DefaultSubnetId: ").append(getDefaultSubnetId()).append(",");
        if (getCustomJson() != null)
            sb.append("CustomJson: ").append(getCustomJson()).append(",");
        if (getConfigurationManager() != null)
            sb.append("ConfigurationManager: ").append(getConfigurationManager()).append(",");
        if (getChefConfiguration() != null)
            sb.append("ChefConfiguration: ").append(getChefConfiguration()).append(",");
        if (getUseCustomCookbooks() != null)
            sb.append("UseCustomCookbooks: ").append(getUseCustomCookbooks()).append(",");
        if (getUseOpsworksSecurityGroups() != null)
            sb.append("UseOpsworksSecurityGroups: ").append(getUseOpsworksSecurityGroups()).append(",");
        if (getCustomCookbooksSource() != null)
            sb.append("CustomCookbooksSource: ").append(getCustomCookbooksSource()).append(",");
        if (getDefaultSshKeyName() != null)
            sb.append("DefaultSshKeyName: ").append(getDefaultSshKeyName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDefaultRootDeviceType() != null)
            sb.append("DefaultRootDeviceType: ").append(getDefaultRootDeviceType()).append(",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Stack == false)
            return false;
        Stack other = (Stack) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getDefaultInstanceProfileArn() == null ^ this.getDefaultInstanceProfileArn() == null)
            return false;
        if (other.getDefaultInstanceProfileArn() != null && other.getDefaultInstanceProfileArn().equals(this.getDefaultInstanceProfileArn()) == false)
            return false;
        if (other.getDefaultOs() == null ^ this.getDefaultOs() == null)
            return false;
        if (other.getDefaultOs() != null && other.getDefaultOs().equals(this.getDefaultOs()) == false)
            return false;
        if (other.getHostnameTheme() == null ^ this.getHostnameTheme() == null)
            return false;
        if (other.getHostnameTheme() != null && other.getHostnameTheme().equals(this.getHostnameTheme()) == false)
            return false;
        if (other.getDefaultAvailabilityZone() == null ^ this.getDefaultAvailabilityZone() == null)
            return false;
        if (other.getDefaultAvailabilityZone() != null && other.getDefaultAvailabilityZone().equals(this.getDefaultAvailabilityZone()) == false)
            return false;
        if (other.getDefaultSubnetId() == null ^ this.getDefaultSubnetId() == null)
            return false;
        if (other.getDefaultSubnetId() != null && other.getDefaultSubnetId().equals(this.getDefaultSubnetId()) == false)
            return false;
        if (other.getCustomJson() == null ^ this.getCustomJson() == null)
            return false;
        if (other.getCustomJson() != null && other.getCustomJson().equals(this.getCustomJson()) == false)
            return false;
        if (other.getConfigurationManager() == null ^ this.getConfigurationManager() == null)
            return false;
        if (other.getConfigurationManager() != null && other.getConfigurationManager().equals(this.getConfigurationManager()) == false)
            return false;
        if (other.getChefConfiguration() == null ^ this.getChefConfiguration() == null)
            return false;
        if (other.getChefConfiguration() != null && other.getChefConfiguration().equals(this.getChefConfiguration()) == false)
            return false;
        if (other.getUseCustomCookbooks() == null ^ this.getUseCustomCookbooks() == null)
            return false;
        if (other.getUseCustomCookbooks() != null && other.getUseCustomCookbooks().equals(this.getUseCustomCookbooks()) == false)
            return false;
        if (other.getUseOpsworksSecurityGroups() == null ^ this.getUseOpsworksSecurityGroups() == null)
            return false;
        if (other.getUseOpsworksSecurityGroups() != null && other.getUseOpsworksSecurityGroups().equals(this.getUseOpsworksSecurityGroups()) == false)
            return false;
        if (other.getCustomCookbooksSource() == null ^ this.getCustomCookbooksSource() == null)
            return false;
        if (other.getCustomCookbooksSource() != null && other.getCustomCookbooksSource().equals(this.getCustomCookbooksSource()) == false)
            return false;
        if (other.getDefaultSshKeyName() == null ^ this.getDefaultSshKeyName() == null)
            return false;
        if (other.getDefaultSshKeyName() != null && other.getDefaultSshKeyName().equals(this.getDefaultSshKeyName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDefaultRootDeviceType() == null ^ this.getDefaultRootDeviceType() == null)
            return false;
        if (other.getDefaultRootDeviceType() != null && other.getDefaultRootDeviceType().equals(this.getDefaultRootDeviceType()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultInstanceProfileArn() == null) ? 0 : getDefaultInstanceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultOs() == null) ? 0 : getDefaultOs().hashCode());
        hashCode = prime * hashCode + ((getHostnameTheme() == null) ? 0 : getHostnameTheme().hashCode());
        hashCode = prime * hashCode + ((getDefaultAvailabilityZone() == null) ? 0 : getDefaultAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDefaultSubnetId() == null) ? 0 : getDefaultSubnetId().hashCode());
        hashCode = prime * hashCode + ((getCustomJson() == null) ? 0 : getCustomJson().hashCode());
        hashCode = prime * hashCode + ((getConfigurationManager() == null) ? 0 : getConfigurationManager().hashCode());
        hashCode = prime * hashCode + ((getChefConfiguration() == null) ? 0 : getChefConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUseCustomCookbooks() == null) ? 0 : getUseCustomCookbooks().hashCode());
        hashCode = prime * hashCode + ((getUseOpsworksSecurityGroups() == null) ? 0 : getUseOpsworksSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getCustomCookbooksSource() == null) ? 0 : getCustomCookbooksSource().hashCode());
        hashCode = prime * hashCode + ((getDefaultSshKeyName() == null) ? 0 : getDefaultSshKeyName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDefaultRootDeviceType() == null) ? 0 : getDefaultRootDeviceType().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        return hashCode;
    }

    @Override
    public Stack clone() {
        try {
            return (Stack) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.StackMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
