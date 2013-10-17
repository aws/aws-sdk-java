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
 * Describes a layer.
 * </p>
 */
public class Layer implements Serializable {

    /**
     * The layer stack ID.
     */
    private String stackId;

    /**
     * The layer ID.
     */
    private String layerId;

    /**
     * The layer type, which must be one of the following: <ul>
     * <li>Custom</li> <li>GangliaMonitoringMaster</li> <li>HaProxy</li>
     * <li>MemcachedServer</li> <li>MySqlMaster</li> <li>NodeJsAppServer</li>
     * <li>PhpAppServer</li> <li>RailsAppServer</li> <li>WebServer</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lb, web, php-app, rails-app, nodejs-app, memcached, db-master, monitoring-master, custom
     */
    private String type;

    /**
     * The layer name.
     */
    private String name;

    /**
     * The layer short name.
     */
    private String shortname;

    /**
     * The layer attributes.
     */
    private java.util.Map<String,String> attributes;

    /**
     * The ARN of the default IAM profile to be used for the layer's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     */
    private String customInstanceProfileArn;

    /**
     * An array containing the layer's custom security group IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> customSecurityGroupIds;

    /**
     * An array containing the layer's security group names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> defaultSecurityGroupNames;

    /**
     * An array of <code>Package</code> objects that describe the layer's
     * packages.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> packages;

    /**
     * A <code>VolumeConfigurations</code> object that describes the layer's
     * Amazon EBS volumes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeConfiguration> volumeConfigurations;

    /**
     * Whether auto healing is disabled for the layer.
     */
    private Boolean enableAutoHealing;

    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     */
    private Boolean autoAssignElasticIps;

    /**
     * For stacks that are running in a VPC, whether to automatically assign
     * a public IP address to the layer's instances. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     */
    private Boolean autoAssignPublicIps;

    /**
     * AWS OpsWorks supports five lifecycle events, <b>setup</b>,
     * <b>configuration</b>, <b>deploy</b>, <b>undeploy</b>, and
     * <b>shutdown</b>. For each layer, AWS OpsWorks runs a set of standard
     * recipes for each event. In addition, you can provide custom recipes
     * for any or all layers and events. AWS OpsWorks runs custom event
     * recipes after the standard recipes. <code>LayerCustomRecipes</code>
     * specifies the custom recipes for a particular layer to be run in
     * response to each of the five events. <p>To specify a recipe, use the
     * cookbook's directory name in the repository followed by two colons and
     * the recipe name, which is the recipe's file name without the .rb
     * extension. For example: phpapp2::dbsetup specifies the dbsetup.rb
     * recipe in the repository's phpapp2 folder.
     */
    private Recipes defaultRecipes;

    /**
     * A <code>LayerCustomRecipes</code> object that specifies the layer's
     * custom recipes.
     */
    private Recipes customRecipes;

    /**
     * Date when the layer was created.
     */
    private String createdAt;

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note>We strongly recommend using the default value of
     * <code>true</code>, to ensure that your instances have the latest
     * security updates.</note>
     */
    private Boolean installUpdatesOnBoot;

    /**
     * The layer stack ID.
     *
     * @return The layer stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The layer stack ID.
     *
     * @param stackId The layer stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The layer stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The layer stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The layer ID.
     *
     * @return The layer ID.
     */
    public String getLayerId() {
        return layerId;
    }
    
    /**
     * The layer ID.
     *
     * @param layerId The layer ID.
     */
    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }
    
    /**
     * The layer ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerId The layer ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }

    /**
     * The layer type, which must be one of the following: <ul>
     * <li>Custom</li> <li>GangliaMonitoringMaster</li> <li>HaProxy</li>
     * <li>MemcachedServer</li> <li>MySqlMaster</li> <li>NodeJsAppServer</li>
     * <li>PhpAppServer</li> <li>RailsAppServer</li> <li>WebServer</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lb, web, php-app, rails-app, nodejs-app, memcached, db-master, monitoring-master, custom
     *
     * @return The layer type, which must be one of the following: <ul>
     *         <li>Custom</li> <li>GangliaMonitoringMaster</li> <li>HaProxy</li>
     *         <li>MemcachedServer</li> <li>MySqlMaster</li> <li>NodeJsAppServer</li>
     *         <li>PhpAppServer</li> <li>RailsAppServer</li> <li>WebServer</li> </ul>
     *
     * @see LayerType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The layer type, which must be one of the following: <ul>
     * <li>Custom</li> <li>GangliaMonitoringMaster</li> <li>HaProxy</li>
     * <li>MemcachedServer</li> <li>MySqlMaster</li> <li>NodeJsAppServer</li>
     * <li>PhpAppServer</li> <li>RailsAppServer</li> <li>WebServer</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lb, web, php-app, rails-app, nodejs-app, memcached, db-master, monitoring-master, custom
     *
     * @param type The layer type, which must be one of the following: <ul>
     *         <li>Custom</li> <li>GangliaMonitoringMaster</li> <li>HaProxy</li>
     *         <li>MemcachedServer</li> <li>MySqlMaster</li> <li>NodeJsAppServer</li>
     *         <li>PhpAppServer</li> <li>RailsAppServer</li> <li>WebServer</li> </ul>
     *
     * @see LayerType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The layer type, which must be one of the following: <ul>
     * <li>Custom</li> <li>GangliaMonitoringMaster</li> <li>HaProxy</li>
     * <li>MemcachedServer</li> <li>MySqlMaster</li> <li>NodeJsAppServer</li>
     * <li>PhpAppServer</li> <li>RailsAppServer</li> <li>WebServer</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lb, web, php-app, rails-app, nodejs-app, memcached, db-master, monitoring-master, custom
     *
     * @param type The layer type, which must be one of the following: <ul>
     *         <li>Custom</li> <li>GangliaMonitoringMaster</li> <li>HaProxy</li>
     *         <li>MemcachedServer</li> <li>MySqlMaster</li> <li>NodeJsAppServer</li>
     *         <li>PhpAppServer</li> <li>RailsAppServer</li> <li>WebServer</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see LayerType
     */
    public Layer withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The layer type, which must be one of the following: <ul>
     * <li>Custom</li> <li>GangliaMonitoringMaster</li> <li>HaProxy</li>
     * <li>MemcachedServer</li> <li>MySqlMaster</li> <li>NodeJsAppServer</li>
     * <li>PhpAppServer</li> <li>RailsAppServer</li> <li>WebServer</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lb, web, php-app, rails-app, nodejs-app, memcached, db-master, monitoring-master, custom
     *
     * @param type The layer type, which must be one of the following: <ul>
     *         <li>Custom</li> <li>GangliaMonitoringMaster</li> <li>HaProxy</li>
     *         <li>MemcachedServer</li> <li>MySqlMaster</li> <li>NodeJsAppServer</li>
     *         <li>PhpAppServer</li> <li>RailsAppServer</li> <li>WebServer</li> </ul>
     *
     * @see LayerType
     */
    public void setType(LayerType type) {
        this.type = type.toString();
    }
    
    /**
     * The layer type, which must be one of the following: <ul>
     * <li>Custom</li> <li>GangliaMonitoringMaster</li> <li>HaProxy</li>
     * <li>MemcachedServer</li> <li>MySqlMaster</li> <li>NodeJsAppServer</li>
     * <li>PhpAppServer</li> <li>RailsAppServer</li> <li>WebServer</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lb, web, php-app, rails-app, nodejs-app, memcached, db-master, monitoring-master, custom
     *
     * @param type The layer type, which must be one of the following: <ul>
     *         <li>Custom</li> <li>GangliaMonitoringMaster</li> <li>HaProxy</li>
     *         <li>MemcachedServer</li> <li>MySqlMaster</li> <li>NodeJsAppServer</li>
     *         <li>PhpAppServer</li> <li>RailsAppServer</li> <li>WebServer</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see LayerType
     */
    public Layer withType(LayerType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * The layer name.
     *
     * @return The layer name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The layer name.
     *
     * @param name The layer name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The layer name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The layer name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The layer short name.
     *
     * @return The layer short name.
     */
    public String getShortname() {
        return shortname;
    }
    
    /**
     * The layer short name.
     *
     * @param shortname The layer short name.
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }
    
    /**
     * The layer short name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shortname The layer short name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withShortname(String shortname) {
        this.shortname = shortname;
        return this;
    }

    /**
     * The layer attributes.
     *
     * @return The layer attributes.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * The layer attributes.
     *
     * @param attributes The layer attributes.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * The layer attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The layer attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * The layer attributes.
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
	public Layer addAttributesEntry(String key, String value) {
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
	public Layer clearAttributesEntries() {
		this.attributes = null;
		return this;
	}
	
    /**
     * The ARN of the default IAM profile to be used for the layer's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @return The ARN of the default IAM profile to be used for the layer's EC2
     *         instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public String getCustomInstanceProfileArn() {
        return customInstanceProfileArn;
    }
    
    /**
     * The ARN of the default IAM profile to be used for the layer's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @param customInstanceProfileArn The ARN of the default IAM profile to be used for the layer's EC2
     *         instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public void setCustomInstanceProfileArn(String customInstanceProfileArn) {
        this.customInstanceProfileArn = customInstanceProfileArn;
    }
    
    /**
     * The ARN of the default IAM profile to be used for the layer's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customInstanceProfileArn The ARN of the default IAM profile to be used for the layer's EC2
     *         instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withCustomInstanceProfileArn(String customInstanceProfileArn) {
        this.customInstanceProfileArn = customInstanceProfileArn;
        return this;
    }

    /**
     * An array containing the layer's custom security group IDs.
     *
     * @return An array containing the layer's custom security group IDs.
     */
    public java.util.List<String> getCustomSecurityGroupIds() {
        if (customSecurityGroupIds == null) {
              customSecurityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              customSecurityGroupIds.setAutoConstruct(true);
        }
        return customSecurityGroupIds;
    }
    
    /**
     * An array containing the layer's custom security group IDs.
     *
     * @param customSecurityGroupIds An array containing the layer's custom security group IDs.
     */
    public void setCustomSecurityGroupIds(java.util.Collection<String> customSecurityGroupIds) {
        if (customSecurityGroupIds == null) {
            this.customSecurityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> customSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(customSecurityGroupIds.size());
        customSecurityGroupIdsCopy.addAll(customSecurityGroupIds);
        this.customSecurityGroupIds = customSecurityGroupIdsCopy;
    }
    
    /**
     * An array containing the layer's custom security group IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customSecurityGroupIds An array containing the layer's custom security group IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withCustomSecurityGroupIds(String... customSecurityGroupIds) {
        if (getCustomSecurityGroupIds() == null) setCustomSecurityGroupIds(new java.util.ArrayList<String>(customSecurityGroupIds.length));
        for (String value : customSecurityGroupIds) {
            getCustomSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * An array containing the layer's custom security group IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customSecurityGroupIds An array containing the layer's custom security group IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withCustomSecurityGroupIds(java.util.Collection<String> customSecurityGroupIds) {
        if (customSecurityGroupIds == null) {
            this.customSecurityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> customSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(customSecurityGroupIds.size());
            customSecurityGroupIdsCopy.addAll(customSecurityGroupIds);
            this.customSecurityGroupIds = customSecurityGroupIdsCopy;
        }

        return this;
    }

    /**
     * An array containing the layer's security group names.
     *
     * @return An array containing the layer's security group names.
     */
    public java.util.List<String> getDefaultSecurityGroupNames() {
        if (defaultSecurityGroupNames == null) {
              defaultSecurityGroupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              defaultSecurityGroupNames.setAutoConstruct(true);
        }
        return defaultSecurityGroupNames;
    }
    
    /**
     * An array containing the layer's security group names.
     *
     * @param defaultSecurityGroupNames An array containing the layer's security group names.
     */
    public void setDefaultSecurityGroupNames(java.util.Collection<String> defaultSecurityGroupNames) {
        if (defaultSecurityGroupNames == null) {
            this.defaultSecurityGroupNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> defaultSecurityGroupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(defaultSecurityGroupNames.size());
        defaultSecurityGroupNamesCopy.addAll(defaultSecurityGroupNames);
        this.defaultSecurityGroupNames = defaultSecurityGroupNamesCopy;
    }
    
    /**
     * An array containing the layer's security group names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultSecurityGroupNames An array containing the layer's security group names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withDefaultSecurityGroupNames(String... defaultSecurityGroupNames) {
        if (getDefaultSecurityGroupNames() == null) setDefaultSecurityGroupNames(new java.util.ArrayList<String>(defaultSecurityGroupNames.length));
        for (String value : defaultSecurityGroupNames) {
            getDefaultSecurityGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * An array containing the layer's security group names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultSecurityGroupNames An array containing the layer's security group names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withDefaultSecurityGroupNames(java.util.Collection<String> defaultSecurityGroupNames) {
        if (defaultSecurityGroupNames == null) {
            this.defaultSecurityGroupNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> defaultSecurityGroupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(defaultSecurityGroupNames.size());
            defaultSecurityGroupNamesCopy.addAll(defaultSecurityGroupNames);
            this.defaultSecurityGroupNames = defaultSecurityGroupNamesCopy;
        }

        return this;
    }

    /**
     * An array of <code>Package</code> objects that describe the layer's
     * packages.
     *
     * @return An array of <code>Package</code> objects that describe the layer's
     *         packages.
     */
    public java.util.List<String> getPackages() {
        if (packages == null) {
              packages = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              packages.setAutoConstruct(true);
        }
        return packages;
    }
    
    /**
     * An array of <code>Package</code> objects that describe the layer's
     * packages.
     *
     * @param packages An array of <code>Package</code> objects that describe the layer's
     *         packages.
     */
    public void setPackages(java.util.Collection<String> packages) {
        if (packages == null) {
            this.packages = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> packagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(packages.size());
        packagesCopy.addAll(packages);
        this.packages = packagesCopy;
    }
    
    /**
     * An array of <code>Package</code> objects that describe the layer's
     * packages.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param packages An array of <code>Package</code> objects that describe the layer's
     *         packages.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withPackages(String... packages) {
        if (getPackages() == null) setPackages(new java.util.ArrayList<String>(packages.length));
        for (String value : packages) {
            getPackages().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>Package</code> objects that describe the layer's
     * packages.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param packages An array of <code>Package</code> objects that describe the layer's
     *         packages.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withPackages(java.util.Collection<String> packages) {
        if (packages == null) {
            this.packages = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> packagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(packages.size());
            packagesCopy.addAll(packages);
            this.packages = packagesCopy;
        }

        return this;
    }

    /**
     * A <code>VolumeConfigurations</code> object that describes the layer's
     * Amazon EBS volumes.
     *
     * @return A <code>VolumeConfigurations</code> object that describes the layer's
     *         Amazon EBS volumes.
     */
    public java.util.List<VolumeConfiguration> getVolumeConfigurations() {
        if (volumeConfigurations == null) {
              volumeConfigurations = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeConfiguration>();
              volumeConfigurations.setAutoConstruct(true);
        }
        return volumeConfigurations;
    }
    
    /**
     * A <code>VolumeConfigurations</code> object that describes the layer's
     * Amazon EBS volumes.
     *
     * @param volumeConfigurations A <code>VolumeConfigurations</code> object that describes the layer's
     *         Amazon EBS volumes.
     */
    public void setVolumeConfigurations(java.util.Collection<VolumeConfiguration> volumeConfigurations) {
        if (volumeConfigurations == null) {
            this.volumeConfigurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VolumeConfiguration> volumeConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeConfiguration>(volumeConfigurations.size());
        volumeConfigurationsCopy.addAll(volumeConfigurations);
        this.volumeConfigurations = volumeConfigurationsCopy;
    }
    
    /**
     * A <code>VolumeConfigurations</code> object that describes the layer's
     * Amazon EBS volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeConfigurations A <code>VolumeConfigurations</code> object that describes the layer's
     *         Amazon EBS volumes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withVolumeConfigurations(VolumeConfiguration... volumeConfigurations) {
        if (getVolumeConfigurations() == null) setVolumeConfigurations(new java.util.ArrayList<VolumeConfiguration>(volumeConfigurations.length));
        for (VolumeConfiguration value : volumeConfigurations) {
            getVolumeConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * A <code>VolumeConfigurations</code> object that describes the layer's
     * Amazon EBS volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeConfigurations A <code>VolumeConfigurations</code> object that describes the layer's
     *         Amazon EBS volumes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withVolumeConfigurations(java.util.Collection<VolumeConfiguration> volumeConfigurations) {
        if (volumeConfigurations == null) {
            this.volumeConfigurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VolumeConfiguration> volumeConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeConfiguration>(volumeConfigurations.size());
            volumeConfigurationsCopy.addAll(volumeConfigurations);
            this.volumeConfigurations = volumeConfigurationsCopy;
        }

        return this;
    }

    /**
     * Whether auto healing is disabled for the layer.
     *
     * @return Whether auto healing is disabled for the layer.
     */
    public Boolean isEnableAutoHealing() {
        return enableAutoHealing;
    }
    
    /**
     * Whether auto healing is disabled for the layer.
     *
     * @param enableAutoHealing Whether auto healing is disabled for the layer.
     */
    public void setEnableAutoHealing(Boolean enableAutoHealing) {
        this.enableAutoHealing = enableAutoHealing;
    }
    
    /**
     * Whether auto healing is disabled for the layer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableAutoHealing Whether auto healing is disabled for the layer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withEnableAutoHealing(Boolean enableAutoHealing) {
        this.enableAutoHealing = enableAutoHealing;
        return this;
    }

    /**
     * Whether auto healing is disabled for the layer.
     *
     * @return Whether auto healing is disabled for the layer.
     */
    public Boolean getEnableAutoHealing() {
        return enableAutoHealing;
    }

    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     *
     * @return Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address</a> to the layer's instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     */
    public Boolean isAutoAssignElasticIps() {
        return autoAssignElasticIps;
    }
    
    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     *
     * @param autoAssignElasticIps Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address</a> to the layer's instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     */
    public void setAutoAssignElasticIps(Boolean autoAssignElasticIps) {
        this.autoAssignElasticIps = autoAssignElasticIps;
    }
    
    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoAssignElasticIps Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address</a> to the layer's instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withAutoAssignElasticIps(Boolean autoAssignElasticIps) {
        this.autoAssignElasticIps = autoAssignElasticIps;
        return this;
    }

    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     *
     * @return Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address</a> to the layer's instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     */
    public Boolean getAutoAssignElasticIps() {
        return autoAssignElasticIps;
    }

    /**
     * For stacks that are running in a VPC, whether to automatically assign
     * a public IP address to the layer's instances. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     *
     * @return For stacks that are running in a VPC, whether to automatically assign
     *         a public IP address to the layer's instances. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     */
    public Boolean isAutoAssignPublicIps() {
        return autoAssignPublicIps;
    }
    
    /**
     * For stacks that are running in a VPC, whether to automatically assign
     * a public IP address to the layer's instances. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     *
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically assign
     *         a public IP address to the layer's instances. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     */
    public void setAutoAssignPublicIps(Boolean autoAssignPublicIps) {
        this.autoAssignPublicIps = autoAssignPublicIps;
    }
    
    /**
     * For stacks that are running in a VPC, whether to automatically assign
     * a public IP address to the layer's instances. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically assign
     *         a public IP address to the layer's instances. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withAutoAssignPublicIps(Boolean autoAssignPublicIps) {
        this.autoAssignPublicIps = autoAssignPublicIps;
        return this;
    }

    /**
     * For stacks that are running in a VPC, whether to automatically assign
     * a public IP address to the layer's instances. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     *
     * @return For stacks that are running in a VPC, whether to automatically assign
     *         a public IP address to the layer's instances. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     */
    public Boolean getAutoAssignPublicIps() {
        return autoAssignPublicIps;
    }

    /**
     * AWS OpsWorks supports five lifecycle events, <b>setup</b>,
     * <b>configuration</b>, <b>deploy</b>, <b>undeploy</b>, and
     * <b>shutdown</b>. For each layer, AWS OpsWorks runs a set of standard
     * recipes for each event. In addition, you can provide custom recipes
     * for any or all layers and events. AWS OpsWorks runs custom event
     * recipes after the standard recipes. <code>LayerCustomRecipes</code>
     * specifies the custom recipes for a particular layer to be run in
     * response to each of the five events. <p>To specify a recipe, use the
     * cookbook's directory name in the repository followed by two colons and
     * the recipe name, which is the recipe's file name without the .rb
     * extension. For example: phpapp2::dbsetup specifies the dbsetup.rb
     * recipe in the repository's phpapp2 folder.
     *
     * @return AWS OpsWorks supports five lifecycle events, <b>setup</b>,
     *         <b>configuration</b>, <b>deploy</b>, <b>undeploy</b>, and
     *         <b>shutdown</b>. For each layer, AWS OpsWorks runs a set of standard
     *         recipes for each event. In addition, you can provide custom recipes
     *         for any or all layers and events. AWS OpsWorks runs custom event
     *         recipes after the standard recipes. <code>LayerCustomRecipes</code>
     *         specifies the custom recipes for a particular layer to be run in
     *         response to each of the five events. <p>To specify a recipe, use the
     *         cookbook's directory name in the repository followed by two colons and
     *         the recipe name, which is the recipe's file name without the .rb
     *         extension. For example: phpapp2::dbsetup specifies the dbsetup.rb
     *         recipe in the repository's phpapp2 folder.
     */
    public Recipes getDefaultRecipes() {
        return defaultRecipes;
    }
    
    /**
     * AWS OpsWorks supports five lifecycle events, <b>setup</b>,
     * <b>configuration</b>, <b>deploy</b>, <b>undeploy</b>, and
     * <b>shutdown</b>. For each layer, AWS OpsWorks runs a set of standard
     * recipes for each event. In addition, you can provide custom recipes
     * for any or all layers and events. AWS OpsWorks runs custom event
     * recipes after the standard recipes. <code>LayerCustomRecipes</code>
     * specifies the custom recipes for a particular layer to be run in
     * response to each of the five events. <p>To specify a recipe, use the
     * cookbook's directory name in the repository followed by two colons and
     * the recipe name, which is the recipe's file name without the .rb
     * extension. For example: phpapp2::dbsetup specifies the dbsetup.rb
     * recipe in the repository's phpapp2 folder.
     *
     * @param defaultRecipes AWS OpsWorks supports five lifecycle events, <b>setup</b>,
     *         <b>configuration</b>, <b>deploy</b>, <b>undeploy</b>, and
     *         <b>shutdown</b>. For each layer, AWS OpsWorks runs a set of standard
     *         recipes for each event. In addition, you can provide custom recipes
     *         for any or all layers and events. AWS OpsWorks runs custom event
     *         recipes after the standard recipes. <code>LayerCustomRecipes</code>
     *         specifies the custom recipes for a particular layer to be run in
     *         response to each of the five events. <p>To specify a recipe, use the
     *         cookbook's directory name in the repository followed by two colons and
     *         the recipe name, which is the recipe's file name without the .rb
     *         extension. For example: phpapp2::dbsetup specifies the dbsetup.rb
     *         recipe in the repository's phpapp2 folder.
     */
    public void setDefaultRecipes(Recipes defaultRecipes) {
        this.defaultRecipes = defaultRecipes;
    }
    
    /**
     * AWS OpsWorks supports five lifecycle events, <b>setup</b>,
     * <b>configuration</b>, <b>deploy</b>, <b>undeploy</b>, and
     * <b>shutdown</b>. For each layer, AWS OpsWorks runs a set of standard
     * recipes for each event. In addition, you can provide custom recipes
     * for any or all layers and events. AWS OpsWorks runs custom event
     * recipes after the standard recipes. <code>LayerCustomRecipes</code>
     * specifies the custom recipes for a particular layer to be run in
     * response to each of the five events. <p>To specify a recipe, use the
     * cookbook's directory name in the repository followed by two colons and
     * the recipe name, which is the recipe's file name without the .rb
     * extension. For example: phpapp2::dbsetup specifies the dbsetup.rb
     * recipe in the repository's phpapp2 folder.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultRecipes AWS OpsWorks supports five lifecycle events, <b>setup</b>,
     *         <b>configuration</b>, <b>deploy</b>, <b>undeploy</b>, and
     *         <b>shutdown</b>. For each layer, AWS OpsWorks runs a set of standard
     *         recipes for each event. In addition, you can provide custom recipes
     *         for any or all layers and events. AWS OpsWorks runs custom event
     *         recipes after the standard recipes. <code>LayerCustomRecipes</code>
     *         specifies the custom recipes for a particular layer to be run in
     *         response to each of the five events. <p>To specify a recipe, use the
     *         cookbook's directory name in the repository followed by two colons and
     *         the recipe name, which is the recipe's file name without the .rb
     *         extension. For example: phpapp2::dbsetup specifies the dbsetup.rb
     *         recipe in the repository's phpapp2 folder.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withDefaultRecipes(Recipes defaultRecipes) {
        this.defaultRecipes = defaultRecipes;
        return this;
    }

    /**
     * A <code>LayerCustomRecipes</code> object that specifies the layer's
     * custom recipes.
     *
     * @return A <code>LayerCustomRecipes</code> object that specifies the layer's
     *         custom recipes.
     */
    public Recipes getCustomRecipes() {
        return customRecipes;
    }
    
    /**
     * A <code>LayerCustomRecipes</code> object that specifies the layer's
     * custom recipes.
     *
     * @param customRecipes A <code>LayerCustomRecipes</code> object that specifies the layer's
     *         custom recipes.
     */
    public void setCustomRecipes(Recipes customRecipes) {
        this.customRecipes = customRecipes;
    }
    
    /**
     * A <code>LayerCustomRecipes</code> object that specifies the layer's
     * custom recipes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customRecipes A <code>LayerCustomRecipes</code> object that specifies the layer's
     *         custom recipes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withCustomRecipes(Recipes customRecipes) {
        this.customRecipes = customRecipes;
        return this;
    }

    /**
     * Date when the layer was created.
     *
     * @return Date when the layer was created.
     */
    public String getCreatedAt() {
        return createdAt;
    }
    
    /**
     * Date when the layer was created.
     *
     * @param createdAt Date when the layer was created.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * Date when the layer was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt Date when the layer was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note>We strongly recommend using the default value of
     * <code>true</code>, to ensure that your instances have the latest
     * security updates.</note>
     *
     * @return Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. If this value
     *         is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or manually running
     *         <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     *         the instances. <note>We strongly recommend using the default value of
     *         <code>true</code>, to ensure that your instances have the latest
     *         security updates.</note>
     */
    public Boolean isInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }
    
    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note>We strongly recommend using the default value of
     * <code>true</code>, to ensure that your instances have the latest
     * security updates.</note>
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. If this value
     *         is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or manually running
     *         <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     *         the instances. <note>We strongly recommend using the default value of
     *         <code>true</code>, to ensure that your instances have the latest
     *         security updates.</note>
     */
    public void setInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
    }
    
    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note>We strongly recommend using the default value of
     * <code>true</code>, to ensure that your instances have the latest
     * security updates.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. If this value
     *         is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or manually running
     *         <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     *         the instances. <note>We strongly recommend using the default value of
     *         <code>true</code>, to ensure that your instances have the latest
     *         security updates.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Layer withInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
        return this;
    }

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note>We strongly recommend using the default value of
     * <code>true</code>, to ensure that your instances have the latest
     * security updates.</note>
     *
     * @return Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. If this value
     *         is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or manually running
     *         <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     *         the instances. <note>We strongly recommend using the default value of
     *         <code>true</code>, to ensure that your instances have the latest
     *         security updates.</note>
     */
    public Boolean getInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
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
        if (getLayerId() != null) sb.append("LayerId: " + getLayerId() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getShortname() != null) sb.append("Shortname: " + getShortname() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() + ",");
        if (getCustomInstanceProfileArn() != null) sb.append("CustomInstanceProfileArn: " + getCustomInstanceProfileArn() + ",");
        if (getCustomSecurityGroupIds() != null) sb.append("CustomSecurityGroupIds: " + getCustomSecurityGroupIds() + ",");
        if (getDefaultSecurityGroupNames() != null) sb.append("DefaultSecurityGroupNames: " + getDefaultSecurityGroupNames() + ",");
        if (getPackages() != null) sb.append("Packages: " + getPackages() + ",");
        if (getVolumeConfigurations() != null) sb.append("VolumeConfigurations: " + getVolumeConfigurations() + ",");
        if (isEnableAutoHealing() != null) sb.append("EnableAutoHealing: " + isEnableAutoHealing() + ",");
        if (isAutoAssignElasticIps() != null) sb.append("AutoAssignElasticIps: " + isAutoAssignElasticIps() + ",");
        if (isAutoAssignPublicIps() != null) sb.append("AutoAssignPublicIps: " + isAutoAssignPublicIps() + ",");
        if (getDefaultRecipes() != null) sb.append("DefaultRecipes: " + getDefaultRecipes() + ",");
        if (getCustomRecipes() != null) sb.append("CustomRecipes: " + getCustomRecipes() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (isInstallUpdatesOnBoot() != null) sb.append("InstallUpdatesOnBoot: " + isInstallUpdatesOnBoot() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getLayerId() == null) ? 0 : getLayerId().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getShortname() == null) ? 0 : getShortname().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getCustomInstanceProfileArn() == null) ? 0 : getCustomInstanceProfileArn().hashCode()); 
        hashCode = prime * hashCode + ((getCustomSecurityGroupIds() == null) ? 0 : getCustomSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultSecurityGroupNames() == null) ? 0 : getDefaultSecurityGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getPackages() == null) ? 0 : getPackages().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeConfigurations() == null) ? 0 : getVolumeConfigurations().hashCode()); 
        hashCode = prime * hashCode + ((isEnableAutoHealing() == null) ? 0 : isEnableAutoHealing().hashCode()); 
        hashCode = prime * hashCode + ((isAutoAssignElasticIps() == null) ? 0 : isAutoAssignElasticIps().hashCode()); 
        hashCode = prime * hashCode + ((isAutoAssignPublicIps() == null) ? 0 : isAutoAssignPublicIps().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultRecipes() == null) ? 0 : getDefaultRecipes().hashCode()); 
        hashCode = prime * hashCode + ((getCustomRecipes() == null) ? 0 : getCustomRecipes().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        hashCode = prime * hashCode + ((isInstallUpdatesOnBoot() == null) ? 0 : isInstallUpdatesOnBoot().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Layer == false) return false;
        Layer other = (Layer)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getLayerId() == null ^ this.getLayerId() == null) return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getShortname() == null ^ this.getShortname() == null) return false;
        if (other.getShortname() != null && other.getShortname().equals(this.getShortname()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getCustomInstanceProfileArn() == null ^ this.getCustomInstanceProfileArn() == null) return false;
        if (other.getCustomInstanceProfileArn() != null && other.getCustomInstanceProfileArn().equals(this.getCustomInstanceProfileArn()) == false) return false; 
        if (other.getCustomSecurityGroupIds() == null ^ this.getCustomSecurityGroupIds() == null) return false;
        if (other.getCustomSecurityGroupIds() != null && other.getCustomSecurityGroupIds().equals(this.getCustomSecurityGroupIds()) == false) return false; 
        if (other.getDefaultSecurityGroupNames() == null ^ this.getDefaultSecurityGroupNames() == null) return false;
        if (other.getDefaultSecurityGroupNames() != null && other.getDefaultSecurityGroupNames().equals(this.getDefaultSecurityGroupNames()) == false) return false; 
        if (other.getPackages() == null ^ this.getPackages() == null) return false;
        if (other.getPackages() != null && other.getPackages().equals(this.getPackages()) == false) return false; 
        if (other.getVolumeConfigurations() == null ^ this.getVolumeConfigurations() == null) return false;
        if (other.getVolumeConfigurations() != null && other.getVolumeConfigurations().equals(this.getVolumeConfigurations()) == false) return false; 
        if (other.isEnableAutoHealing() == null ^ this.isEnableAutoHealing() == null) return false;
        if (other.isEnableAutoHealing() != null && other.isEnableAutoHealing().equals(this.isEnableAutoHealing()) == false) return false; 
        if (other.isAutoAssignElasticIps() == null ^ this.isAutoAssignElasticIps() == null) return false;
        if (other.isAutoAssignElasticIps() != null && other.isAutoAssignElasticIps().equals(this.isAutoAssignElasticIps()) == false) return false; 
        if (other.isAutoAssignPublicIps() == null ^ this.isAutoAssignPublicIps() == null) return false;
        if (other.isAutoAssignPublicIps() != null && other.isAutoAssignPublicIps().equals(this.isAutoAssignPublicIps()) == false) return false; 
        if (other.getDefaultRecipes() == null ^ this.getDefaultRecipes() == null) return false;
        if (other.getDefaultRecipes() != null && other.getDefaultRecipes().equals(this.getDefaultRecipes()) == false) return false; 
        if (other.getCustomRecipes() == null ^ this.getCustomRecipes() == null) return false;
        if (other.getCustomRecipes() != null && other.getCustomRecipes().equals(this.getCustomRecipes()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        if (other.isInstallUpdatesOnBoot() == null ^ this.isInstallUpdatesOnBoot() == null) return false;
        if (other.isInstallUpdatesOnBoot() != null && other.isInstallUpdatesOnBoot().equals(this.isInstallUpdatesOnBoot()) == false) return false; 
        return true;
    }
    
}
    