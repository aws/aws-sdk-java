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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateLayer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLayerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The layer ID.
     * </p>
     */
    private String layerId;
    /**
     * <p>
     * The layer name, which is used by the console.
     * </p>
     */
    private String name;
    /**
     * <p>
     * For custom layers only, use this parameter to specify the layer's short name, which is used internally by AWS
     * OpsWorks Stacks and by Chef. The short name is also used as the name for the directory where your app files are
     * installed. It can have a maximum of 200 characters and must be in the following format: /\A[a-z0-9\-\_\.]+\Z/.
     * </p>
     * <p>
     * The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer Reference</a>
     * </p>
     */
    private String shortname;
    /**
     * <p>
     * One or more user-defined key/value pairs to be added to the stack attributes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;
    /**
     * <p>
     * Specifies CloudWatch Logs configuration options for the layer. For more information, see
     * <a>CloudWatchLogsLogStream</a>.
     * </p>
     */
    private CloudWatchLogsConfiguration cloudWatchLogsConfiguration;
    /**
     * <p>
     * The ARN of an IAM profile to be used for all of the layer's EC2 instances. For more information about IAM ARNs,
     * see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     */
    private String customInstanceProfileArn;
    /**
     * <p>
     * A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on the
     * layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html"> Using Custom
     * JSON</a>.
     * </p>
     */
    private String customJson;
    /**
     * <p>
     * An array containing the layer's custom security group IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> customSecurityGroupIds;
    /**
     * <p>
     * An array of <code>Package</code> objects that describe the layer's packages.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> packages;
    /**
     * <p>
     * A <code>VolumeConfigurations</code> object that describes the layer's Amazon EBS volumes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VolumeConfiguration> volumeConfigurations;
    /**
     * <p>
     * Whether to disable auto healing for the layer.
     * </p>
     */
    private Boolean enableAutoHealing;
    /**
     * <p>
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP address</a> to
     * the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     * Layer</a>.
     * </p>
     */
    private Boolean autoAssignElasticIps;
    /**
     * <p>
     * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     * Layer</a>.
     * </p>
     */
    private Boolean autoAssignPublicIps;
    /**
     * <p>
     * A <code>LayerCustomRecipes</code> object that specifies the layer's custom recipes.
     * </p>
     */
    private Recipes customRecipes;
    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     */
    private Boolean installUpdatesOnBoot;
    /**
     * <p>
     * Whether to use Amazon EBS-optimized instances.
     * </p>
     */
    private Boolean useEbsOptimizedInstances;
    /** <p/> */
    private LifecycleEventConfiguration lifecycleEventConfiguration;

    /**
     * <p>
     * The layer ID.
     * </p>
     * 
     * @param layerId
     *        The layer ID.
     */

    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }

    /**
     * <p>
     * The layer ID.
     * </p>
     * 
     * @return The layer ID.
     */

    public String getLayerId() {
        return this.layerId;
    }

    /**
     * <p>
     * The layer ID.
     * </p>
     * 
     * @param layerId
     *        The layer ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withLayerId(String layerId) {
        setLayerId(layerId);
        return this;
    }

    /**
     * <p>
     * The layer name, which is used by the console.
     * </p>
     * 
     * @param name
     *        The layer name, which is used by the console.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The layer name, which is used by the console.
     * </p>
     * 
     * @return The layer name, which is used by the console.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The layer name, which is used by the console.
     * </p>
     * 
     * @param name
     *        The layer name, which is used by the console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * For custom layers only, use this parameter to specify the layer's short name, which is used internally by AWS
     * OpsWorks Stacks and by Chef. The short name is also used as the name for the directory where your app files are
     * installed. It can have a maximum of 200 characters and must be in the following format: /\A[a-z0-9\-\_\.]+\Z/.
     * </p>
     * <p>
     * The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer Reference</a>
     * </p>
     * 
     * @param shortname
     *        For custom layers only, use this parameter to specify the layer's short name, which is used internally by
     *        AWS OpsWorks Stacks and by Chef. The short name is also used as the name for the directory where your app
     *        files are installed. It can have a maximum of 200 characters and must be in the following format:
     *        /\A[a-z0-9\-\_\.]+\Z/.</p>
     *        <p>
     *        The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer Reference</a>
     */

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    /**
     * <p>
     * For custom layers only, use this parameter to specify the layer's short name, which is used internally by AWS
     * OpsWorks Stacks and by Chef. The short name is also used as the name for the directory where your app files are
     * installed. It can have a maximum of 200 characters and must be in the following format: /\A[a-z0-9\-\_\.]+\Z/.
     * </p>
     * <p>
     * The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer Reference</a>
     * </p>
     * 
     * @return For custom layers only, use this parameter to specify the layer's short name, which is used internally by
     *         AWS OpsWorks Stacks and by Chef. The short name is also used as the name for the directory where your app
     *         files are installed. It can have a maximum of 200 characters and must be in the following format:
     *         /\A[a-z0-9\-\_\.]+\Z/.</p>
     *         <p>
     *         The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer Reference</a>
     */

    public String getShortname() {
        return this.shortname;
    }

    /**
     * <p>
     * For custom layers only, use this parameter to specify the layer's short name, which is used internally by AWS
     * OpsWorks Stacks and by Chef. The short name is also used as the name for the directory where your app files are
     * installed. It can have a maximum of 200 characters and must be in the following format: /\A[a-z0-9\-\_\.]+\Z/.
     * </p>
     * <p>
     * The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer Reference</a>
     * </p>
     * 
     * @param shortname
     *        For custom layers only, use this parameter to specify the layer's short name, which is used internally by
     *        AWS OpsWorks Stacks and by Chef. The short name is also used as the name for the directory where your app
     *        files are installed. It can have a maximum of 200 characters and must be in the following format:
     *        /\A[a-z0-9\-\_\.]+\Z/.</p>
     *        <p>
     *        The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer Reference</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withShortname(String shortname) {
        setShortname(shortname);
        return this;
    }

    /**
     * <p>
     * One or more user-defined key/value pairs to be added to the stack attributes.
     * </p>
     * 
     * @return One or more user-defined key/value pairs to be added to the stack attributes.
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * One or more user-defined key/value pairs to be added to the stack attributes.
     * </p>
     * 
     * @param attributes
     *        One or more user-defined key/value pairs to be added to the stack attributes.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * One or more user-defined key/value pairs to be added to the stack attributes.
     * </p>
     * 
     * @param attributes
     *        One or more user-defined key/value pairs to be added to the stack attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public UpdateLayerRequest addAttributesEntry(String key, String value) {
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

    public UpdateLayerRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Specifies CloudWatch Logs configuration options for the layer. For more information, see
     * <a>CloudWatchLogsLogStream</a>.
     * </p>
     * 
     * @param cloudWatchLogsConfiguration
     *        Specifies CloudWatch Logs configuration options for the layer. For more information, see
     *        <a>CloudWatchLogsLogStream</a>.
     */

    public void setCloudWatchLogsConfiguration(CloudWatchLogsConfiguration cloudWatchLogsConfiguration) {
        this.cloudWatchLogsConfiguration = cloudWatchLogsConfiguration;
    }

    /**
     * <p>
     * Specifies CloudWatch Logs configuration options for the layer. For more information, see
     * <a>CloudWatchLogsLogStream</a>.
     * </p>
     * 
     * @return Specifies CloudWatch Logs configuration options for the layer. For more information, see
     *         <a>CloudWatchLogsLogStream</a>.
     */

    public CloudWatchLogsConfiguration getCloudWatchLogsConfiguration() {
        return this.cloudWatchLogsConfiguration;
    }

    /**
     * <p>
     * Specifies CloudWatch Logs configuration options for the layer. For more information, see
     * <a>CloudWatchLogsLogStream</a>.
     * </p>
     * 
     * @param cloudWatchLogsConfiguration
     *        Specifies CloudWatch Logs configuration options for the layer. For more information, see
     *        <a>CloudWatchLogsLogStream</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withCloudWatchLogsConfiguration(CloudWatchLogsConfiguration cloudWatchLogsConfiguration) {
        setCloudWatchLogsConfiguration(cloudWatchLogsConfiguration);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM profile to be used for all of the layer's EC2 instances. For more information about IAM ARNs,
     * see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * 
     * @param customInstanceProfileArn
     *        The ARN of an IAM profile to be used for all of the layer's EC2 instances. For more information about IAM
     *        ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *        Identifiers</a>.
     */

    public void setCustomInstanceProfileArn(String customInstanceProfileArn) {
        this.customInstanceProfileArn = customInstanceProfileArn;
    }

    /**
     * <p>
     * The ARN of an IAM profile to be used for all of the layer's EC2 instances. For more information about IAM ARNs,
     * see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * 
     * @return The ARN of an IAM profile to be used for all of the layer's EC2 instances. For more information about IAM
     *         ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */

    public String getCustomInstanceProfileArn() {
        return this.customInstanceProfileArn;
    }

    /**
     * <p>
     * The ARN of an IAM profile to be used for all of the layer's EC2 instances. For more information about IAM ARNs,
     * see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * 
     * @param customInstanceProfileArn
     *        The ARN of an IAM profile to be used for all of the layer's EC2 instances. For more information about IAM
     *        ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *        Identifiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withCustomInstanceProfileArn(String customInstanceProfileArn) {
        setCustomInstanceProfileArn(customInstanceProfileArn);
        return this;
    }

    /**
     * <p>
     * A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on the
     * layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html"> Using Custom
     * JSON</a>.
     * </p>
     * 
     * @param customJson
     *        A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on
     *        the layer's instances. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html"> Using
     *        Custom JSON</a>.
     */

    public void setCustomJson(String customJson) {
        this.customJson = customJson;
    }

    /**
     * <p>
     * A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on the
     * layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html"> Using Custom
     * JSON</a>.
     * </p>
     * 
     * @return A JSON-formatted string containing custom stack configuration and deployment attributes to be installed
     *         on the layer's instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html"> Using
     *         Custom JSON</a>.
     */

    public String getCustomJson() {
        return this.customJson;
    }

    /**
     * <p>
     * A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on the
     * layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html"> Using Custom
     * JSON</a>.
     * </p>
     * 
     * @param customJson
     *        A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on
     *        the layer's instances. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html"> Using
     *        Custom JSON</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withCustomJson(String customJson) {
        setCustomJson(customJson);
        return this;
    }

    /**
     * <p>
     * An array containing the layer's custom security group IDs.
     * </p>
     * 
     * @return An array containing the layer's custom security group IDs.
     */

    public java.util.List<String> getCustomSecurityGroupIds() {
        if (customSecurityGroupIds == null) {
            customSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return customSecurityGroupIds;
    }

    /**
     * <p>
     * An array containing the layer's custom security group IDs.
     * </p>
     * 
     * @param customSecurityGroupIds
     *        An array containing the layer's custom security group IDs.
     */

    public void setCustomSecurityGroupIds(java.util.Collection<String> customSecurityGroupIds) {
        if (customSecurityGroupIds == null) {
            this.customSecurityGroupIds = null;
            return;
        }

        this.customSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(customSecurityGroupIds);
    }

    /**
     * <p>
     * An array containing the layer's custom security group IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomSecurityGroupIds(java.util.Collection)} or
     * {@link #withCustomSecurityGroupIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customSecurityGroupIds
     *        An array containing the layer's custom security group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withCustomSecurityGroupIds(String... customSecurityGroupIds) {
        if (this.customSecurityGroupIds == null) {
            setCustomSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(customSecurityGroupIds.length));
        }
        for (String ele : customSecurityGroupIds) {
            this.customSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the layer's custom security group IDs.
     * </p>
     * 
     * @param customSecurityGroupIds
     *        An array containing the layer's custom security group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withCustomSecurityGroupIds(java.util.Collection<String> customSecurityGroupIds) {
        setCustomSecurityGroupIds(customSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * An array of <code>Package</code> objects that describe the layer's packages.
     * </p>
     * 
     * @return An array of <code>Package</code> objects that describe the layer's packages.
     */

    public java.util.List<String> getPackages() {
        if (packages == null) {
            packages = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return packages;
    }

    /**
     * <p>
     * An array of <code>Package</code> objects that describe the layer's packages.
     * </p>
     * 
     * @param packages
     *        An array of <code>Package</code> objects that describe the layer's packages.
     */

    public void setPackages(java.util.Collection<String> packages) {
        if (packages == null) {
            this.packages = null;
            return;
        }

        this.packages = new com.amazonaws.internal.SdkInternalList<String>(packages);
    }

    /**
     * <p>
     * An array of <code>Package</code> objects that describe the layer's packages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPackages(java.util.Collection)} or {@link #withPackages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param packages
     *        An array of <code>Package</code> objects that describe the layer's packages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withPackages(String... packages) {
        if (this.packages == null) {
            setPackages(new com.amazonaws.internal.SdkInternalList<String>(packages.length));
        }
        for (String ele : packages) {
            this.packages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Package</code> objects that describe the layer's packages.
     * </p>
     * 
     * @param packages
     *        An array of <code>Package</code> objects that describe the layer's packages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withPackages(java.util.Collection<String> packages) {
        setPackages(packages);
        return this;
    }

    /**
     * <p>
     * A <code>VolumeConfigurations</code> object that describes the layer's Amazon EBS volumes.
     * </p>
     * 
     * @return A <code>VolumeConfigurations</code> object that describes the layer's Amazon EBS volumes.
     */

    public java.util.List<VolumeConfiguration> getVolumeConfigurations() {
        if (volumeConfigurations == null) {
            volumeConfigurations = new com.amazonaws.internal.SdkInternalList<VolumeConfiguration>();
        }
        return volumeConfigurations;
    }

    /**
     * <p>
     * A <code>VolumeConfigurations</code> object that describes the layer's Amazon EBS volumes.
     * </p>
     * 
     * @param volumeConfigurations
     *        A <code>VolumeConfigurations</code> object that describes the layer's Amazon EBS volumes.
     */

    public void setVolumeConfigurations(java.util.Collection<VolumeConfiguration> volumeConfigurations) {
        if (volumeConfigurations == null) {
            this.volumeConfigurations = null;
            return;
        }

        this.volumeConfigurations = new com.amazonaws.internal.SdkInternalList<VolumeConfiguration>(volumeConfigurations);
    }

    /**
     * <p>
     * A <code>VolumeConfigurations</code> object that describes the layer's Amazon EBS volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeConfigurations(java.util.Collection)} or {@link #withVolumeConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param volumeConfigurations
     *        A <code>VolumeConfigurations</code> object that describes the layer's Amazon EBS volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withVolumeConfigurations(VolumeConfiguration... volumeConfigurations) {
        if (this.volumeConfigurations == null) {
            setVolumeConfigurations(new com.amazonaws.internal.SdkInternalList<VolumeConfiguration>(volumeConfigurations.length));
        }
        for (VolumeConfiguration ele : volumeConfigurations) {
            this.volumeConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <code>VolumeConfigurations</code> object that describes the layer's Amazon EBS volumes.
     * </p>
     * 
     * @param volumeConfigurations
     *        A <code>VolumeConfigurations</code> object that describes the layer's Amazon EBS volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withVolumeConfigurations(java.util.Collection<VolumeConfiguration> volumeConfigurations) {
        setVolumeConfigurations(volumeConfigurations);
        return this;
    }

    /**
     * <p>
     * Whether to disable auto healing for the layer.
     * </p>
     * 
     * @param enableAutoHealing
     *        Whether to disable auto healing for the layer.
     */

    public void setEnableAutoHealing(Boolean enableAutoHealing) {
        this.enableAutoHealing = enableAutoHealing;
    }

    /**
     * <p>
     * Whether to disable auto healing for the layer.
     * </p>
     * 
     * @return Whether to disable auto healing for the layer.
     */

    public Boolean getEnableAutoHealing() {
        return this.enableAutoHealing;
    }

    /**
     * <p>
     * Whether to disable auto healing for the layer.
     * </p>
     * 
     * @param enableAutoHealing
     *        Whether to disable auto healing for the layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withEnableAutoHealing(Boolean enableAutoHealing) {
        setEnableAutoHealing(enableAutoHealing);
        return this;
    }

    /**
     * <p>
     * Whether to disable auto healing for the layer.
     * </p>
     * 
     * @return Whether to disable auto healing for the layer.
     */

    public Boolean isEnableAutoHealing() {
        return this.enableAutoHealing;
    }

    /**
     * <p>
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP address</a> to
     * the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     * Layer</a>.
     * </p>
     * 
     * @param autoAssignElasticIps
     *        Whether to automatically assign an <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP
     *        address</a> to the layer's instances. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     *        Layer</a>.
     */

    public void setAutoAssignElasticIps(Boolean autoAssignElasticIps) {
        this.autoAssignElasticIps = autoAssignElasticIps;
    }

    /**
     * <p>
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP address</a> to
     * the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     * Layer</a>.
     * </p>
     * 
     * @return Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP
     *         address</a> to the layer's instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     *         Layer</a>.
     */

    public Boolean getAutoAssignElasticIps() {
        return this.autoAssignElasticIps;
    }

    /**
     * <p>
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP address</a> to
     * the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     * Layer</a>.
     * </p>
     * 
     * @param autoAssignElasticIps
     *        Whether to automatically assign an <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP
     *        address</a> to the layer's instances. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     *        Layer</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withAutoAssignElasticIps(Boolean autoAssignElasticIps) {
        setAutoAssignElasticIps(autoAssignElasticIps);
        return this;
    }

    /**
     * <p>
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP address</a> to
     * the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     * Layer</a>.
     * </p>
     * 
     * @return Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP
     *         address</a> to the layer's instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     *         Layer</a>.
     */

    public Boolean isAutoAssignElasticIps() {
        return this.autoAssignElasticIps;
    }

    /**
     * <p>
     * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     * Layer</a>.
     * </p>
     * 
     * @param autoAssignPublicIps
     *        For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's
     *        instances. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     *        Layer</a>.
     */

    public void setAutoAssignPublicIps(Boolean autoAssignPublicIps) {
        this.autoAssignPublicIps = autoAssignPublicIps;
    }

    /**
     * <p>
     * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     * Layer</a>.
     * </p>
     * 
     * @return For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's
     *         instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     *         Layer</a>.
     */

    public Boolean getAutoAssignPublicIps() {
        return this.autoAssignPublicIps;
    }

    /**
     * <p>
     * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     * Layer</a>.
     * </p>
     * 
     * @param autoAssignPublicIps
     *        For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's
     *        instances. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     *        Layer</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withAutoAssignPublicIps(Boolean autoAssignPublicIps) {
        setAutoAssignPublicIps(autoAssignPublicIps);
        return this;
    }

    /**
     * <p>
     * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     * Layer</a>.
     * </p>
     * 
     * @return For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's
     *         instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How to Edit a
     *         Layer</a>.
     */

    public Boolean isAutoAssignPublicIps() {
        return this.autoAssignPublicIps;
    }

    /**
     * <p>
     * A <code>LayerCustomRecipes</code> object that specifies the layer's custom recipes.
     * </p>
     * 
     * @param customRecipes
     *        A <code>LayerCustomRecipes</code> object that specifies the layer's custom recipes.
     */

    public void setCustomRecipes(Recipes customRecipes) {
        this.customRecipes = customRecipes;
    }

    /**
     * <p>
     * A <code>LayerCustomRecipes</code> object that specifies the layer's custom recipes.
     * </p>
     * 
     * @return A <code>LayerCustomRecipes</code> object that specifies the layer's custom recipes.
     */

    public Recipes getCustomRecipes() {
        return this.customRecipes;
    }

    /**
     * <p>
     * A <code>LayerCustomRecipes</code> object that specifies the layer's custom recipes.
     * </p>
     * 
     * @param customRecipes
     *        A <code>LayerCustomRecipes</code> object that specifies the layer's custom recipes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withCustomRecipes(Recipes customRecipes) {
        setCustomRecipes(customRecipes);
        return this;
    }

    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     * 
     * @param installUpdatesOnBoot
     *        Whether to install operating system and package updates when the instance boots. The default value is
     *        <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must
     *        then update your instances manually by using <a>CreateDeployment</a> to run the
     *        <code>update_dependencies</code> stack command or manually running <code>yum</code> (Amazon Linux) or
     *        <code>apt-get</code> (Ubuntu) on the instances. </p> <note>
     *        <p>
     *        We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the
     *        latest security updates.
     *        </p>
     */

    public void setInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
    }

    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     * 
     * @return Whether to install operating system and package updates when the instance boots. The default value is
     *         <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must
     *         then update your instances manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or manually running <code>yum</code> (Amazon Linux) or
     *         <code>apt-get</code> (Ubuntu) on the instances. </p> <note>
     *         <p>
     *         We strongly recommend using the default value of <code>true</code>, to ensure that your instances have
     *         the latest security updates.
     *         </p>
     */

    public Boolean getInstallUpdatesOnBoot() {
        return this.installUpdatesOnBoot;
    }

    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     * 
     * @param installUpdatesOnBoot
     *        Whether to install operating system and package updates when the instance boots. The default value is
     *        <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must
     *        then update your instances manually by using <a>CreateDeployment</a> to run the
     *        <code>update_dependencies</code> stack command or manually running <code>yum</code> (Amazon Linux) or
     *        <code>apt-get</code> (Ubuntu) on the instances. </p> <note>
     *        <p>
     *        We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the
     *        latest security updates.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        setInstallUpdatesOnBoot(installUpdatesOnBoot);
        return this;
    }

    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     * 
     * @return Whether to install operating system and package updates when the instance boots. The default value is
     *         <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must
     *         then update your instances manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or manually running <code>yum</code> (Amazon Linux) or
     *         <code>apt-get</code> (Ubuntu) on the instances. </p> <note>
     *         <p>
     *         We strongly recommend using the default value of <code>true</code>, to ensure that your instances have
     *         the latest security updates.
     *         </p>
     */

    public Boolean isInstallUpdatesOnBoot() {
        return this.installUpdatesOnBoot;
    }

    /**
     * <p>
     * Whether to use Amazon EBS-optimized instances.
     * </p>
     * 
     * @param useEbsOptimizedInstances
     *        Whether to use Amazon EBS-optimized instances.
     */

    public void setUseEbsOptimizedInstances(Boolean useEbsOptimizedInstances) {
        this.useEbsOptimizedInstances = useEbsOptimizedInstances;
    }

    /**
     * <p>
     * Whether to use Amazon EBS-optimized instances.
     * </p>
     * 
     * @return Whether to use Amazon EBS-optimized instances.
     */

    public Boolean getUseEbsOptimizedInstances() {
        return this.useEbsOptimizedInstances;
    }

    /**
     * <p>
     * Whether to use Amazon EBS-optimized instances.
     * </p>
     * 
     * @param useEbsOptimizedInstances
     *        Whether to use Amazon EBS-optimized instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withUseEbsOptimizedInstances(Boolean useEbsOptimizedInstances) {
        setUseEbsOptimizedInstances(useEbsOptimizedInstances);
        return this;
    }

    /**
     * <p>
     * Whether to use Amazon EBS-optimized instances.
     * </p>
     * 
     * @return Whether to use Amazon EBS-optimized instances.
     */

    public Boolean isUseEbsOptimizedInstances() {
        return this.useEbsOptimizedInstances;
    }

    /**
     * <p/>
     * 
     * @param lifecycleEventConfiguration
     */

    public void setLifecycleEventConfiguration(LifecycleEventConfiguration lifecycleEventConfiguration) {
        this.lifecycleEventConfiguration = lifecycleEventConfiguration;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public LifecycleEventConfiguration getLifecycleEventConfiguration() {
        return this.lifecycleEventConfiguration;
    }

    /**
     * <p/>
     * 
     * @param lifecycleEventConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayerRequest withLifecycleEventConfiguration(LifecycleEventConfiguration lifecycleEventConfiguration) {
        setLifecycleEventConfiguration(lifecycleEventConfiguration);
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
        if (getLayerId() != null)
            sb.append("LayerId: ").append(getLayerId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getShortname() != null)
            sb.append("Shortname: ").append(getShortname()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getCloudWatchLogsConfiguration() != null)
            sb.append("CloudWatchLogsConfiguration: ").append(getCloudWatchLogsConfiguration()).append(",");
        if (getCustomInstanceProfileArn() != null)
            sb.append("CustomInstanceProfileArn: ").append(getCustomInstanceProfileArn()).append(",");
        if (getCustomJson() != null)
            sb.append("CustomJson: ").append(getCustomJson()).append(",");
        if (getCustomSecurityGroupIds() != null)
            sb.append("CustomSecurityGroupIds: ").append(getCustomSecurityGroupIds()).append(",");
        if (getPackages() != null)
            sb.append("Packages: ").append(getPackages()).append(",");
        if (getVolumeConfigurations() != null)
            sb.append("VolumeConfigurations: ").append(getVolumeConfigurations()).append(",");
        if (getEnableAutoHealing() != null)
            sb.append("EnableAutoHealing: ").append(getEnableAutoHealing()).append(",");
        if (getAutoAssignElasticIps() != null)
            sb.append("AutoAssignElasticIps: ").append(getAutoAssignElasticIps()).append(",");
        if (getAutoAssignPublicIps() != null)
            sb.append("AutoAssignPublicIps: ").append(getAutoAssignPublicIps()).append(",");
        if (getCustomRecipes() != null)
            sb.append("CustomRecipes: ").append(getCustomRecipes()).append(",");
        if (getInstallUpdatesOnBoot() != null)
            sb.append("InstallUpdatesOnBoot: ").append(getInstallUpdatesOnBoot()).append(",");
        if (getUseEbsOptimizedInstances() != null)
            sb.append("UseEbsOptimizedInstances: ").append(getUseEbsOptimizedInstances()).append(",");
        if (getLifecycleEventConfiguration() != null)
            sb.append("LifecycleEventConfiguration: ").append(getLifecycleEventConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLayerRequest == false)
            return false;
        UpdateLayerRequest other = (UpdateLayerRequest) obj;
        if (other.getLayerId() == null ^ this.getLayerId() == null)
            return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getShortname() == null ^ this.getShortname() == null)
            return false;
        if (other.getShortname() != null && other.getShortname().equals(this.getShortname()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCloudWatchLogsConfiguration() == null ^ this.getCloudWatchLogsConfiguration() == null)
            return false;
        if (other.getCloudWatchLogsConfiguration() != null && other.getCloudWatchLogsConfiguration().equals(this.getCloudWatchLogsConfiguration()) == false)
            return false;
        if (other.getCustomInstanceProfileArn() == null ^ this.getCustomInstanceProfileArn() == null)
            return false;
        if (other.getCustomInstanceProfileArn() != null && other.getCustomInstanceProfileArn().equals(this.getCustomInstanceProfileArn()) == false)
            return false;
        if (other.getCustomJson() == null ^ this.getCustomJson() == null)
            return false;
        if (other.getCustomJson() != null && other.getCustomJson().equals(this.getCustomJson()) == false)
            return false;
        if (other.getCustomSecurityGroupIds() == null ^ this.getCustomSecurityGroupIds() == null)
            return false;
        if (other.getCustomSecurityGroupIds() != null && other.getCustomSecurityGroupIds().equals(this.getCustomSecurityGroupIds()) == false)
            return false;
        if (other.getPackages() == null ^ this.getPackages() == null)
            return false;
        if (other.getPackages() != null && other.getPackages().equals(this.getPackages()) == false)
            return false;
        if (other.getVolumeConfigurations() == null ^ this.getVolumeConfigurations() == null)
            return false;
        if (other.getVolumeConfigurations() != null && other.getVolumeConfigurations().equals(this.getVolumeConfigurations()) == false)
            return false;
        if (other.getEnableAutoHealing() == null ^ this.getEnableAutoHealing() == null)
            return false;
        if (other.getEnableAutoHealing() != null && other.getEnableAutoHealing().equals(this.getEnableAutoHealing()) == false)
            return false;
        if (other.getAutoAssignElasticIps() == null ^ this.getAutoAssignElasticIps() == null)
            return false;
        if (other.getAutoAssignElasticIps() != null && other.getAutoAssignElasticIps().equals(this.getAutoAssignElasticIps()) == false)
            return false;
        if (other.getAutoAssignPublicIps() == null ^ this.getAutoAssignPublicIps() == null)
            return false;
        if (other.getAutoAssignPublicIps() != null && other.getAutoAssignPublicIps().equals(this.getAutoAssignPublicIps()) == false)
            return false;
        if (other.getCustomRecipes() == null ^ this.getCustomRecipes() == null)
            return false;
        if (other.getCustomRecipes() != null && other.getCustomRecipes().equals(this.getCustomRecipes()) == false)
            return false;
        if (other.getInstallUpdatesOnBoot() == null ^ this.getInstallUpdatesOnBoot() == null)
            return false;
        if (other.getInstallUpdatesOnBoot() != null && other.getInstallUpdatesOnBoot().equals(this.getInstallUpdatesOnBoot()) == false)
            return false;
        if (other.getUseEbsOptimizedInstances() == null ^ this.getUseEbsOptimizedInstances() == null)
            return false;
        if (other.getUseEbsOptimizedInstances() != null && other.getUseEbsOptimizedInstances().equals(this.getUseEbsOptimizedInstances()) == false)
            return false;
        if (other.getLifecycleEventConfiguration() == null ^ this.getLifecycleEventConfiguration() == null)
            return false;
        if (other.getLifecycleEventConfiguration() != null && other.getLifecycleEventConfiguration().equals(this.getLifecycleEventConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayerId() == null) ? 0 : getLayerId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getShortname() == null) ? 0 : getShortname().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsConfiguration() == null) ? 0 : getCloudWatchLogsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomInstanceProfileArn() == null) ? 0 : getCustomInstanceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getCustomJson() == null) ? 0 : getCustomJson().hashCode());
        hashCode = prime * hashCode + ((getCustomSecurityGroupIds() == null) ? 0 : getCustomSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getPackages() == null) ? 0 : getPackages().hashCode());
        hashCode = prime * hashCode + ((getVolumeConfigurations() == null) ? 0 : getVolumeConfigurations().hashCode());
        hashCode = prime * hashCode + ((getEnableAutoHealing() == null) ? 0 : getEnableAutoHealing().hashCode());
        hashCode = prime * hashCode + ((getAutoAssignElasticIps() == null) ? 0 : getAutoAssignElasticIps().hashCode());
        hashCode = prime * hashCode + ((getAutoAssignPublicIps() == null) ? 0 : getAutoAssignPublicIps().hashCode());
        hashCode = prime * hashCode + ((getCustomRecipes() == null) ? 0 : getCustomRecipes().hashCode());
        hashCode = prime * hashCode + ((getInstallUpdatesOnBoot() == null) ? 0 : getInstallUpdatesOnBoot().hashCode());
        hashCode = prime * hashCode + ((getUseEbsOptimizedInstances() == null) ? 0 : getUseEbsOptimizedInstances().hashCode());
        hashCode = prime * hashCode + ((getLifecycleEventConfiguration() == null) ? 0 : getLifecycleEventConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLayerRequest clone() {
        return (UpdateLayerRequest) super.clone();
    }

}
