/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Describes a stack.
 * </p>
 */
public class Stack implements Serializable {

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * The stack name.
     */
    private String name;

    /**
     * The stack AWS region, such as "us-east-1". For more information about
     * AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     */
    private String region;

    /**
     * The VPC ID, if the stack is running in a VPC.
     */
    private String vpcId;

    /**
     * The contents of the stack's attributes bag.
     */
    private java.util.Map<String,String> attributes;

    /**
     * The stack AWS Identity and Access Management (IAM) role.
     */
    private String serviceRoleArn;

    /**
     * The ARN of an IAM profile that is the default profile for all of the
     * stack's EC2 instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     */
    private String defaultInstanceProfileArn;

    /**
     * The stack's default operating system, which must be set to
     * <code>Amazon Linux</code> or <code>Ubuntu 12.04 LTS</code>. The
     * default option is <code>Amazon Linux</code>.
     */
    private String defaultOs;

    /**
     * The stack host name theme, with spaces replaced by underscores.
     */
    private String hostnameTheme;

    /**
     * The stack's default Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     */
    private String defaultAvailabilityZone;

    /**
     * The default subnet ID, if the stack is running in a VPC.
     */
    private String defaultSubnetId;

    /**
     * A string that contains user-defined, custom JSON. It is used to
     * override the corresponding default stack configuration JSON values.
     * The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     * Custom JSON to Modify the Stack Configuration JSON</a>.
     */
    private String customJson;

    /**
     * The configuration manager.
     */
    private StackConfigurationManager configurationManager;

    /**
     * Whether the stack uses custom cookbooks.
     */
    private Boolean useCustomCookbooks;

    /**
     * Contains the information required to retrieve an app or cookbook from
     * a repository. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     * Apps</a> or <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Custom
     * Recipes and Cookbooks</a>.
     */
    private Source customCookbooksSource;

    /**
     * A default SSH key for the stack's instances. You can override this
     * value when you create or update an instance.
     */
    private String defaultSshKeyName;

    /**
     * Date when the stack was created.
     */
    private String createdAt;

    /**
     * The default root device type. This value is used by default for all
     * instances in the cloned stack, but you can override it when you create
     * an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     */
    private String defaultRootDeviceType;

    /**
     * The stack ID.
     *
     * @return The stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID.
     *
     * @param stackId The stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The stack name.
     *
     * @return The stack name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The stack name.
     *
     * @param name The stack name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The stack name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The stack name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The stack AWS region, such as "us-east-1". For more information about
     * AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @return The stack AWS region, such as "us-east-1". For more information about
     *         AWS regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * The stack AWS region, such as "us-east-1". For more information about
     * AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @param region The stack AWS region, such as "us-east-1". For more information about
     *         AWS regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * The stack AWS region, such as "us-east-1". For more information about
     * AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param region The stack AWS region, such as "us-east-1". For more information about
     *         AWS regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * The VPC ID, if the stack is running in a VPC.
     *
     * @return The VPC ID, if the stack is running in a VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The VPC ID, if the stack is running in a VPC.
     *
     * @param vpcId The VPC ID, if the stack is running in a VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The VPC ID, if the stack is running in a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The VPC ID, if the stack is running in a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The contents of the stack's attributes bag.
     *
     * @return The contents of the stack's attributes bag.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * The contents of the stack's attributes bag.
     *
     * @param attributes The contents of the stack's attributes bag.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * The contents of the stack's attributes bag.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The contents of the stack's attributes bag.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * The contents of the stack's attributes bag.
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
	public Stack addAttributesEntry(String key, String value) {
		if (null == this.attributes) {
			this.attributes = new java.util.HashMap<String,String>();
		}
		if (this.attributes.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.attributes.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Attributes.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public Stack clearAttributesEntries() {
		this.attributes = null;
		return this;
	}
	
    /**
     * The stack AWS Identity and Access Management (IAM) role.
     *
     * @return The stack AWS Identity and Access Management (IAM) role.
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }
    
    /**
     * The stack AWS Identity and Access Management (IAM) role.
     *
     * @param serviceRoleArn The stack AWS Identity and Access Management (IAM) role.
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }
    
    /**
     * The stack AWS Identity and Access Management (IAM) role.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceRoleArn The stack AWS Identity and Access Management (IAM) role.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * The ARN of an IAM profile that is the default profile for all of the
     * stack's EC2 instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @return The ARN of an IAM profile that is the default profile for all of the
     *         stack's EC2 instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public String getDefaultInstanceProfileArn() {
        return defaultInstanceProfileArn;
    }
    
    /**
     * The ARN of an IAM profile that is the default profile for all of the
     * stack's EC2 instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @param defaultInstanceProfileArn The ARN of an IAM profile that is the default profile for all of the
     *         stack's EC2 instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public void setDefaultInstanceProfileArn(String defaultInstanceProfileArn) {
        this.defaultInstanceProfileArn = defaultInstanceProfileArn;
    }
    
    /**
     * The ARN of an IAM profile that is the default profile for all of the
     * stack's EC2 instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultInstanceProfileArn The ARN of an IAM profile that is the default profile for all of the
     *         stack's EC2 instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withDefaultInstanceProfileArn(String defaultInstanceProfileArn) {
        this.defaultInstanceProfileArn = defaultInstanceProfileArn;
        return this;
    }

    /**
     * The stack's default operating system, which must be set to
     * <code>Amazon Linux</code> or <code>Ubuntu 12.04 LTS</code>. The
     * default option is <code>Amazon Linux</code>.
     *
     * @return The stack's default operating system, which must be set to
     *         <code>Amazon Linux</code> or <code>Ubuntu 12.04 LTS</code>. The
     *         default option is <code>Amazon Linux</code>.
     */
    public String getDefaultOs() {
        return defaultOs;
    }
    
    /**
     * The stack's default operating system, which must be set to
     * <code>Amazon Linux</code> or <code>Ubuntu 12.04 LTS</code>. The
     * default option is <code>Amazon Linux</code>.
     *
     * @param defaultOs The stack's default operating system, which must be set to
     *         <code>Amazon Linux</code> or <code>Ubuntu 12.04 LTS</code>. The
     *         default option is <code>Amazon Linux</code>.
     */
    public void setDefaultOs(String defaultOs) {
        this.defaultOs = defaultOs;
    }
    
    /**
     * The stack's default operating system, which must be set to
     * <code>Amazon Linux</code> or <code>Ubuntu 12.04 LTS</code>. The
     * default option is <code>Amazon Linux</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultOs The stack's default operating system, which must be set to
     *         <code>Amazon Linux</code> or <code>Ubuntu 12.04 LTS</code>. The
     *         default option is <code>Amazon Linux</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withDefaultOs(String defaultOs) {
        this.defaultOs = defaultOs;
        return this;
    }

    /**
     * The stack host name theme, with spaces replaced by underscores.
     *
     * @return The stack host name theme, with spaces replaced by underscores.
     */
    public String getHostnameTheme() {
        return hostnameTheme;
    }
    
    /**
     * The stack host name theme, with spaces replaced by underscores.
     *
     * @param hostnameTheme The stack host name theme, with spaces replaced by underscores.
     */
    public void setHostnameTheme(String hostnameTheme) {
        this.hostnameTheme = hostnameTheme;
    }
    
    /**
     * The stack host name theme, with spaces replaced by underscores.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostnameTheme The stack host name theme, with spaces replaced by underscores.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withHostnameTheme(String hostnameTheme) {
        this.hostnameTheme = hostnameTheme;
        return this;
    }

    /**
     * The stack's default Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @return The stack's default Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public String getDefaultAvailabilityZone() {
        return defaultAvailabilityZone;
    }
    
    /**
     * The stack's default Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @param defaultAvailabilityZone The stack's default Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public void setDefaultAvailabilityZone(String defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
    }
    
    /**
     * The stack's default Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultAvailabilityZone The stack's default Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withDefaultAvailabilityZone(String defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
        return this;
    }

    /**
     * The default subnet ID, if the stack is running in a VPC.
     *
     * @return The default subnet ID, if the stack is running in a VPC.
     */
    public String getDefaultSubnetId() {
        return defaultSubnetId;
    }
    
    /**
     * The default subnet ID, if the stack is running in a VPC.
     *
     * @param defaultSubnetId The default subnet ID, if the stack is running in a VPC.
     */
    public void setDefaultSubnetId(String defaultSubnetId) {
        this.defaultSubnetId = defaultSubnetId;
    }
    
    /**
     * The default subnet ID, if the stack is running in a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultSubnetId The default subnet ID, if the stack is running in a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withDefaultSubnetId(String defaultSubnetId) {
        this.defaultSubnetId = defaultSubnetId;
        return this;
    }

    /**
     * A string that contains user-defined, custom JSON. It is used to
     * override the corresponding default stack configuration JSON values.
     * The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     * Custom JSON to Modify the Stack Configuration JSON</a>.
     *
     * @return A string that contains user-defined, custom JSON. It is used to
     *         override the corresponding default stack configuration JSON values.
     *         The string should be in the following format and must escape
     *         characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     *         \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     *         Custom JSON to Modify the Stack Configuration JSON</a>.
     */
    public String getCustomJson() {
        return customJson;
    }
    
    /**
     * A string that contains user-defined, custom JSON. It is used to
     * override the corresponding default stack configuration JSON values.
     * The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     * Custom JSON to Modify the Stack Configuration JSON</a>.
     *
     * @param customJson A string that contains user-defined, custom JSON. It is used to
     *         override the corresponding default stack configuration JSON values.
     *         The string should be in the following format and must escape
     *         characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     *         \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     *         Custom JSON to Modify the Stack Configuration JSON</a>.
     */
    public void setCustomJson(String customJson) {
        this.customJson = customJson;
    }
    
    /**
     * A string that contains user-defined, custom JSON. It is used to
     * override the corresponding default stack configuration JSON values.
     * The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     * Custom JSON to Modify the Stack Configuration JSON</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customJson A string that contains user-defined, custom JSON. It is used to
     *         override the corresponding default stack configuration JSON values.
     *         The string should be in the following format and must escape
     *         characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     *         \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     *         Custom JSON to Modify the Stack Configuration JSON</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withCustomJson(String customJson) {
        this.customJson = customJson;
        return this;
    }

    /**
     * The configuration manager.
     *
     * @return The configuration manager.
     */
    public StackConfigurationManager getConfigurationManager() {
        return configurationManager;
    }
    
    /**
     * The configuration manager.
     *
     * @param configurationManager The configuration manager.
     */
    public void setConfigurationManager(StackConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
    }
    
    /**
     * The configuration manager.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationManager The configuration manager.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withConfigurationManager(StackConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
        return this;
    }

    /**
     * Whether the stack uses custom cookbooks.
     *
     * @return Whether the stack uses custom cookbooks.
     */
    public Boolean isUseCustomCookbooks() {
        return useCustomCookbooks;
    }
    
    /**
     * Whether the stack uses custom cookbooks.
     *
     * @param useCustomCookbooks Whether the stack uses custom cookbooks.
     */
    public void setUseCustomCookbooks(Boolean useCustomCookbooks) {
        this.useCustomCookbooks = useCustomCookbooks;
    }
    
    /**
     * Whether the stack uses custom cookbooks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param useCustomCookbooks Whether the stack uses custom cookbooks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withUseCustomCookbooks(Boolean useCustomCookbooks) {
        this.useCustomCookbooks = useCustomCookbooks;
        return this;
    }

    /**
     * Whether the stack uses custom cookbooks.
     *
     * @return Whether the stack uses custom cookbooks.
     */
    public Boolean getUseCustomCookbooks() {
        return useCustomCookbooks;
    }

    /**
     * Contains the information required to retrieve an app or cookbook from
     * a repository. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     * Apps</a> or <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Custom
     * Recipes and Cookbooks</a>.
     *
     * @return Contains the information required to retrieve an app or cookbook from
     *         a repository. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     *         Apps</a> or <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Custom
     *         Recipes and Cookbooks</a>.
     */
    public Source getCustomCookbooksSource() {
        return customCookbooksSource;
    }
    
    /**
     * Contains the information required to retrieve an app or cookbook from
     * a repository. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     * Apps</a> or <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Custom
     * Recipes and Cookbooks</a>.
     *
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook from
     *         a repository. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     *         Apps</a> or <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Custom
     *         Recipes and Cookbooks</a>.
     */
    public void setCustomCookbooksSource(Source customCookbooksSource) {
        this.customCookbooksSource = customCookbooksSource;
    }
    
    /**
     * Contains the information required to retrieve an app or cookbook from
     * a repository. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     * Apps</a> or <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Custom
     * Recipes and Cookbooks</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook from
     *         a repository. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     *         Apps</a> or <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Custom
     *         Recipes and Cookbooks</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withCustomCookbooksSource(Source customCookbooksSource) {
        this.customCookbooksSource = customCookbooksSource;
        return this;
    }

    /**
     * A default SSH key for the stack's instances. You can override this
     * value when you create or update an instance.
     *
     * @return A default SSH key for the stack's instances. You can override this
     *         value when you create or update an instance.
     */
    public String getDefaultSshKeyName() {
        return defaultSshKeyName;
    }
    
    /**
     * A default SSH key for the stack's instances. You can override this
     * value when you create or update an instance.
     *
     * @param defaultSshKeyName A default SSH key for the stack's instances. You can override this
     *         value when you create or update an instance.
     */
    public void setDefaultSshKeyName(String defaultSshKeyName) {
        this.defaultSshKeyName = defaultSshKeyName;
    }
    
    /**
     * A default SSH key for the stack's instances. You can override this
     * value when you create or update an instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultSshKeyName A default SSH key for the stack's instances. You can override this
     *         value when you create or update an instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withDefaultSshKeyName(String defaultSshKeyName) {
        this.defaultSshKeyName = defaultSshKeyName;
        return this;
    }

    /**
     * Date when the stack was created.
     *
     * @return Date when the stack was created.
     */
    public String getCreatedAt() {
        return createdAt;
    }
    
    /**
     * Date when the stack was created.
     *
     * @param createdAt Date when the stack was created.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * Date when the stack was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt Date when the stack was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The default root device type. This value is used by default for all
     * instances in the cloned stack, but you can override it when you create
     * an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @return The default root device type. This value is used by default for all
     *         instances in the cloned stack, but you can override it when you create
     *         an instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public String getDefaultRootDeviceType() {
        return defaultRootDeviceType;
    }
    
    /**
     * The default root device type. This value is used by default for all
     * instances in the cloned stack, but you can override it when you create
     * an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param defaultRootDeviceType The default root device type. This value is used by default for all
     *         instances in the cloned stack, but you can override it when you create
     *         an instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public void setDefaultRootDeviceType(String defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType;
    }
    
    /**
     * The default root device type. This value is used by default for all
     * instances in the cloned stack, but you can override it when you create
     * an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param defaultRootDeviceType The default root device type. This value is used by default for all
     *         instances in the cloned stack, but you can override it when you create
     *         an instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RootDeviceType
     */
    public Stack withDefaultRootDeviceType(String defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType;
        return this;
    }

    /**
     * The default root device type. This value is used by default for all
     * instances in the cloned stack, but you can override it when you create
     * an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param defaultRootDeviceType The default root device type. This value is used by default for all
     *         instances in the cloned stack, but you can override it when you create
     *         an instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public void setDefaultRootDeviceType(RootDeviceType defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType.toString();
    }
    
    /**
     * The default root device type. This value is used by default for all
     * instances in the cloned stack, but you can override it when you create
     * an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param defaultRootDeviceType The default root device type. This value is used by default for all
     *         instances in the cloned stack, but you can override it when you create
     *         an instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RootDeviceType
     */
    public Stack withDefaultRootDeviceType(RootDeviceType defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType.toString();
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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getRegion() != null) sb.append("Region: " + getRegion() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() + ",");
        if (getServiceRoleArn() != null) sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getDefaultInstanceProfileArn() != null) sb.append("DefaultInstanceProfileArn: " + getDefaultInstanceProfileArn() + ",");
        if (getDefaultOs() != null) sb.append("DefaultOs: " + getDefaultOs() + ",");
        if (getHostnameTheme() != null) sb.append("HostnameTheme: " + getHostnameTheme() + ",");
        if (getDefaultAvailabilityZone() != null) sb.append("DefaultAvailabilityZone: " + getDefaultAvailabilityZone() + ",");
        if (getDefaultSubnetId() != null) sb.append("DefaultSubnetId: " + getDefaultSubnetId() + ",");
        if (getCustomJson() != null) sb.append("CustomJson: " + getCustomJson() + ",");
        if (getConfigurationManager() != null) sb.append("ConfigurationManager: " + getConfigurationManager() + ",");
        if (isUseCustomCookbooks() != null) sb.append("UseCustomCookbooks: " + isUseCustomCookbooks() + ",");
        if (getCustomCookbooksSource() != null) sb.append("CustomCookbooksSource: " + getCustomCookbooksSource() + ",");
        if (getDefaultSshKeyName() != null) sb.append("DefaultSshKeyName: " + getDefaultSshKeyName() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getDefaultRootDeviceType() != null) sb.append("DefaultRootDeviceType: " + getDefaultRootDeviceType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
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
        hashCode = prime * hashCode + ((isUseCustomCookbooks() == null) ? 0 : isUseCustomCookbooks().hashCode()); 
        hashCode = prime * hashCode + ((getCustomCookbooksSource() == null) ? 0 : getCustomCookbooksSource().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultSshKeyName() == null) ? 0 : getDefaultSshKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultRootDeviceType() == null) ? 0 : getDefaultRootDeviceType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Stack == false) return false;
        Stack other = (Stack)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null) return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false) return false; 
        if (other.getDefaultInstanceProfileArn() == null ^ this.getDefaultInstanceProfileArn() == null) return false;
        if (other.getDefaultInstanceProfileArn() != null && other.getDefaultInstanceProfileArn().equals(this.getDefaultInstanceProfileArn()) == false) return false; 
        if (other.getDefaultOs() == null ^ this.getDefaultOs() == null) return false;
        if (other.getDefaultOs() != null && other.getDefaultOs().equals(this.getDefaultOs()) == false) return false; 
        if (other.getHostnameTheme() == null ^ this.getHostnameTheme() == null) return false;
        if (other.getHostnameTheme() != null && other.getHostnameTheme().equals(this.getHostnameTheme()) == false) return false; 
        if (other.getDefaultAvailabilityZone() == null ^ this.getDefaultAvailabilityZone() == null) return false;
        if (other.getDefaultAvailabilityZone() != null && other.getDefaultAvailabilityZone().equals(this.getDefaultAvailabilityZone()) == false) return false; 
        if (other.getDefaultSubnetId() == null ^ this.getDefaultSubnetId() == null) return false;
        if (other.getDefaultSubnetId() != null && other.getDefaultSubnetId().equals(this.getDefaultSubnetId()) == false) return false; 
        if (other.getCustomJson() == null ^ this.getCustomJson() == null) return false;
        if (other.getCustomJson() != null && other.getCustomJson().equals(this.getCustomJson()) == false) return false; 
        if (other.getConfigurationManager() == null ^ this.getConfigurationManager() == null) return false;
        if (other.getConfigurationManager() != null && other.getConfigurationManager().equals(this.getConfigurationManager()) == false) return false; 
        if (other.isUseCustomCookbooks() == null ^ this.isUseCustomCookbooks() == null) return false;
        if (other.isUseCustomCookbooks() != null && other.isUseCustomCookbooks().equals(this.isUseCustomCookbooks()) == false) return false; 
        if (other.getCustomCookbooksSource() == null ^ this.getCustomCookbooksSource() == null) return false;
        if (other.getCustomCookbooksSource() != null && other.getCustomCookbooksSource().equals(this.getCustomCookbooksSource()) == false) return false; 
        if (other.getDefaultSshKeyName() == null ^ this.getDefaultSshKeyName() == null) return false;
        if (other.getDefaultSshKeyName() != null && other.getDefaultSshKeyName().equals(this.getDefaultSshKeyName()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        if (other.getDefaultRootDeviceType() == null ^ this.getDefaultRootDeviceType() == null) return false;
        if (other.getDefaultRootDeviceType() != null && other.getDefaultRootDeviceType().equals(this.getDefaultRootDeviceType()) == false) return false; 
        return true;
    }
    
}
    