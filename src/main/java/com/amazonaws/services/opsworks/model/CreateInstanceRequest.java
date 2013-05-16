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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#createInstance(CreateInstanceRequest) CreateInstance operation}.
 * <p>
 * Creates an instance in a specified stack. For more information, see <a
 * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> Adding an Instance to a Layer </a> .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#createInstance(CreateInstanceRequest)
 */
public class CreateInstanceRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * An array that contains the instance layer IDs.
     */
    private java.util.List<String> layerIds;

    /**
     * The instance type. OpsWorks supports all instance types except Cluster
     * Compute, Cluster GPU, and High Memory Cluster. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that you use to specify
     * the various types are in the API Name column of the Available Instance
     * Types table.
     */
    private String instanceType;

    /**
     * The instance auto scaling type, which has three possible values: <ul>
     * <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected by
     * auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based auto
     * scaling instance, which is started and stopped based on a specified
     * schedule. To specify the schedule, call
     * <a>SetTimeBasedAutoScaling</a>.</li> <li><b>LoadBasedAutoScaling</b>:
     * A load-based auto scaling instance, which is started and stopped based
     * on load metrics. To use load-based auto scaling, you must enable it
     * for the instance layer and configure the thresholds by calling
     * <a>SetLoadBasedAutoScaling</a>.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     */
    private String autoScalingType;

    /**
     * The instance host name.
     */
    private String hostname;

    /**
     * The instance's operating system, which must be either "Amazon Linux"
     * or "Ubuntu 12.04 LTS".
     */
    private String os;

    /**
     * The instance SSH key name.
     */
    private String sshKeyName;

    /**
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     */
    private String availabilityZone;

    /**
     * The instance architecture. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported
     * by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     */
    private String architecture;

    /**
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     */
    private String rootDeviceType;

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
    public CreateInstanceRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    
    
    /**
     * An array that contains the instance layer IDs.
     *
     * @return An array that contains the instance layer IDs.
     */
    public java.util.List<String> getLayerIds() {
        
        if (layerIds == null) {
            layerIds = new java.util.ArrayList<String>();
        }
        return layerIds;
    }
    
    /**
     * An array that contains the instance layer IDs.
     *
     * @param layerIds An array that contains the instance layer IDs.
     */
    public void setLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
            return;
        }

        java.util.List<String> layerIdsCopy = new java.util.ArrayList<String>(layerIds.size());
        layerIdsCopy.addAll(layerIds);
        this.layerIds = layerIdsCopy;
    }
    
    /**
     * An array that contains the instance layer IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds An array that contains the instance layer IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateInstanceRequest withLayerIds(String... layerIds) {
        if (getLayerIds() == null) setLayerIds(new java.util.ArrayList<String>(layerIds.length));
        for (String value : layerIds) {
            getLayerIds().add(value);
        }
        return this;
    }
    
    /**
     * An array that contains the instance layer IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds An array that contains the instance layer IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateInstanceRequest withLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
        } else {
            java.util.List<String> layerIdsCopy = new java.util.ArrayList<String>(layerIds.size());
            layerIdsCopy.addAll(layerIds);
            this.layerIds = layerIdsCopy;
        }

        return this;
    }
    
    /**
     * The instance type. OpsWorks supports all instance types except Cluster
     * Compute, Cluster GPU, and High Memory Cluster. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that you use to specify
     * the various types are in the API Name column of the Available Instance
     * Types table.
     *
     * @return The instance type. OpsWorks supports all instance types except Cluster
     *         Compute, Cluster GPU, and High Memory Cluster. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>. The parameter values that you use to specify
     *         the various types are in the API Name column of the Available Instance
     *         Types table.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type. OpsWorks supports all instance types except Cluster
     * Compute, Cluster GPU, and High Memory Cluster. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that you use to specify
     * the various types are in the API Name column of the Available Instance
     * Types table.
     *
     * @param instanceType The instance type. OpsWorks supports all instance types except Cluster
     *         Compute, Cluster GPU, and High Memory Cluster. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>. The parameter values that you use to specify
     *         the various types are in the API Name column of the Available Instance
     *         Types table.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type. OpsWorks supports all instance types except Cluster
     * Compute, Cluster GPU, and High Memory Cluster. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that you use to specify
     * the various types are in the API Name column of the Available Instance
     * Types table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type. OpsWorks supports all instance types except Cluster
     *         Compute, Cluster GPU, and High Memory Cluster. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>. The parameter values that you use to specify
     *         the various types are in the API Name column of the Available Instance
     *         Types table.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateInstanceRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    
    /**
     * The instance auto scaling type, which has three possible values: <ul>
     * <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected by
     * auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based auto
     * scaling instance, which is started and stopped based on a specified
     * schedule. To specify the schedule, call
     * <a>SetTimeBasedAutoScaling</a>.</li> <li><b>LoadBasedAutoScaling</b>:
     * A load-based auto scaling instance, which is started and stopped based
     * on load metrics. To use load-based auto scaling, you must enable it
     * for the instance layer and configure the thresholds by calling
     * <a>SetLoadBasedAutoScaling</a>.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @return The instance auto scaling type, which has three possible values: <ul>
     *         <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected by
     *         auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based auto
     *         scaling instance, which is started and stopped based on a specified
     *         schedule. To specify the schedule, call
     *         <a>SetTimeBasedAutoScaling</a>.</li> <li><b>LoadBasedAutoScaling</b>:
     *         A load-based auto scaling instance, which is started and stopped based
     *         on load metrics. To use load-based auto scaling, you must enable it
     *         for the instance layer and configure the thresholds by calling
     *         <a>SetLoadBasedAutoScaling</a>.</li> </ul>
     *
     * @see AutoScalingType
     */
    public String getAutoScalingType() {
        return autoScalingType;
    }
    
    /**
     * The instance auto scaling type, which has three possible values: <ul>
     * <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected by
     * auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based auto
     * scaling instance, which is started and stopped based on a specified
     * schedule. To specify the schedule, call
     * <a>SetTimeBasedAutoScaling</a>.</li> <li><b>LoadBasedAutoScaling</b>:
     * A load-based auto scaling instance, which is started and stopped based
     * on load metrics. To use load-based auto scaling, you must enable it
     * for the instance layer and configure the thresholds by calling
     * <a>SetLoadBasedAutoScaling</a>.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType The instance auto scaling type, which has three possible values: <ul>
     *         <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected by
     *         auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based auto
     *         scaling instance, which is started and stopped based on a specified
     *         schedule. To specify the schedule, call
     *         <a>SetTimeBasedAutoScaling</a>.</li> <li><b>LoadBasedAutoScaling</b>:
     *         A load-based auto scaling instance, which is started and stopped based
     *         on load metrics. To use load-based auto scaling, you must enable it
     *         for the instance layer and configure the thresholds by calling
     *         <a>SetLoadBasedAutoScaling</a>.</li> </ul>
     *
     * @see AutoScalingType
     */
    public void setAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
    }
    
    /**
     * The instance auto scaling type, which has three possible values: <ul>
     * <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected by
     * auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based auto
     * scaling instance, which is started and stopped based on a specified
     * schedule. To specify the schedule, call
     * <a>SetTimeBasedAutoScaling</a>.</li> <li><b>LoadBasedAutoScaling</b>:
     * A load-based auto scaling instance, which is started and stopped based
     * on load metrics. To use load-based auto scaling, you must enable it
     * for the instance layer and configure the thresholds by calling
     * <a>SetLoadBasedAutoScaling</a>.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType The instance auto scaling type, which has three possible values: <ul>
     *         <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected by
     *         auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based auto
     *         scaling instance, which is started and stopped based on a specified
     *         schedule. To specify the schedule, call
     *         <a>SetTimeBasedAutoScaling</a>.</li> <li><b>LoadBasedAutoScaling</b>:
     *         A load-based auto scaling instance, which is started and stopped based
     *         on load metrics. To use load-based auto scaling, you must enable it
     *         for the instance layer and configure the thresholds by calling
     *         <a>SetLoadBasedAutoScaling</a>.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see AutoScalingType
     */
    public CreateInstanceRequest withAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
        return this;
    }
    
    
    /**
     * The instance auto scaling type, which has three possible values: <ul>
     * <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected by
     * auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based auto
     * scaling instance, which is started and stopped based on a specified
     * schedule. To specify the schedule, call
     * <a>SetTimeBasedAutoScaling</a>.</li> <li><b>LoadBasedAutoScaling</b>:
     * A load-based auto scaling instance, which is started and stopped based
     * on load metrics. To use load-based auto scaling, you must enable it
     * for the instance layer and configure the thresholds by calling
     * <a>SetLoadBasedAutoScaling</a>.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType The instance auto scaling type, which has three possible values: <ul>
     *         <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected by
     *         auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based auto
     *         scaling instance, which is started and stopped based on a specified
     *         schedule. To specify the schedule, call
     *         <a>SetTimeBasedAutoScaling</a>.</li> <li><b>LoadBasedAutoScaling</b>:
     *         A load-based auto scaling instance, which is started and stopped based
     *         on load metrics. To use load-based auto scaling, you must enable it
     *         for the instance layer and configure the thresholds by calling
     *         <a>SetLoadBasedAutoScaling</a>.</li> </ul>
     *
     * @see AutoScalingType
     */
    public void setAutoScalingType(AutoScalingType autoScalingType) {
        this.autoScalingType = autoScalingType.toString();
    }
    
    /**
     * The instance auto scaling type, which has three possible values: <ul>
     * <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected by
     * auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based auto
     * scaling instance, which is started and stopped based on a specified
     * schedule. To specify the schedule, call
     * <a>SetTimeBasedAutoScaling</a>.</li> <li><b>LoadBasedAutoScaling</b>:
     * A load-based auto scaling instance, which is started and stopped based
     * on load metrics. To use load-based auto scaling, you must enable it
     * for the instance layer and configure the thresholds by calling
     * <a>SetLoadBasedAutoScaling</a>.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType The instance auto scaling type, which has three possible values: <ul>
     *         <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected by
     *         auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based auto
     *         scaling instance, which is started and stopped based on a specified
     *         schedule. To specify the schedule, call
     *         <a>SetTimeBasedAutoScaling</a>.</li> <li><b>LoadBasedAutoScaling</b>:
     *         A load-based auto scaling instance, which is started and stopped based
     *         on load metrics. To use load-based auto scaling, you must enable it
     *         for the instance layer and configure the thresholds by calling
     *         <a>SetLoadBasedAutoScaling</a>.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see AutoScalingType
     */
    public CreateInstanceRequest withAutoScalingType(AutoScalingType autoScalingType) {
        this.autoScalingType = autoScalingType.toString();
        return this;
    }
    
    /**
     * The instance host name.
     *
     * @return The instance host name.
     */
    public String getHostname() {
        return hostname;
    }
    
    /**
     * The instance host name.
     *
     * @param hostname The instance host name.
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    /**
     * The instance host name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostname The instance host name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateInstanceRequest withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    
    
    /**
     * The instance's operating system, which must be either "Amazon Linux"
     * or "Ubuntu 12.04 LTS".
     *
     * @return The instance's operating system, which must be either "Amazon Linux"
     *         or "Ubuntu 12.04 LTS".
     */
    public String getOs() {
        return os;
    }
    
    /**
     * The instance's operating system, which must be either "Amazon Linux"
     * or "Ubuntu 12.04 LTS".
     *
     * @param os The instance's operating system, which must be either "Amazon Linux"
     *         or "Ubuntu 12.04 LTS".
     */
    public void setOs(String os) {
        this.os = os;
    }
    
    /**
     * The instance's operating system, which must be either "Amazon Linux"
     * or "Ubuntu 12.04 LTS".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param os The instance's operating system, which must be either "Amazon Linux"
     *         or "Ubuntu 12.04 LTS".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateInstanceRequest withOs(String os) {
        this.os = os;
        return this;
    }
    
    
    /**
     * The instance SSH key name.
     *
     * @return The instance SSH key name.
     */
    public String getSshKeyName() {
        return sshKeyName;
    }
    
    /**
     * The instance SSH key name.
     *
     * @param sshKeyName The instance SSH key name.
     */
    public void setSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
    }
    
    /**
     * The instance SSH key name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshKeyName The instance SSH key name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateInstanceRequest withSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
        return this;
    }
    
    
    /**
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @return The instance Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @param availabilityZone The instance Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The instance Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateInstanceRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * The instance architecture. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported
     * by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @return The instance architecture. Instance types do not necessarily support
     *         both architectures. For a list of the architectures that are supported
     *         by the different instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @see Architecture
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The instance architecture. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported
     * by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture. Instance types do not necessarily support
     *         both architectures. For a list of the architectures that are supported
     *         by the different instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @see Architecture
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The instance architecture. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported
     * by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture. Instance types do not necessarily support
     *         both architectures. For a list of the architectures that are supported
     *         by the different instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see Architecture
     */
    public CreateInstanceRequest withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    
    
    /**
     * The instance architecture. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported
     * by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture. Instance types do not necessarily support
     *         both architectures. For a list of the architectures that are supported
     *         by the different instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @see Architecture
     */
    public void setArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
    }
    
    /**
     * The instance architecture. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported
     * by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture. Instance types do not necessarily support
     *         both architectures. For a list of the architectures that are supported
     *         by the different instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see Architecture
     */
    public CreateInstanceRequest withArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
        return this;
    }
    
    /**
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @return The instance root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }
    
    /**
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The instance root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }
    
    /**
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The instance root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see RootDeviceType
     */
    public CreateInstanceRequest withRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }
    
    
    /**
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The instance root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public void setRootDeviceType(RootDeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
    }
    
    /**
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The instance root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see RootDeviceType
     */
    public CreateInstanceRequest withRootDeviceType(RootDeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
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
        if (getLayerIds() != null) sb.append("LayerIds: " + getLayerIds() + ",");    	
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");    	
        if (getAutoScalingType() != null) sb.append("AutoScalingType: " + getAutoScalingType() + ",");    	
        if (getHostname() != null) sb.append("Hostname: " + getHostname() + ",");    	
        if (getOs() != null) sb.append("Os: " + getOs() + ",");    	
        if (getSshKeyName() != null) sb.append("SshKeyName: " + getSshKeyName() + ",");    	
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");    	
        if (getArchitecture() != null) sb.append("Architecture: " + getArchitecture() + ",");    	
        if (getRootDeviceType() != null) sb.append("RootDeviceType: " + getRootDeviceType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getLayerIds() == null) ? 0 : getLayerIds().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingType() == null) ? 0 : getAutoScalingType().hashCode()); 
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode()); 
        hashCode = prime * hashCode + ((getOs() == null) ? 0 : getOs().hashCode()); 
        hashCode = prime * hashCode + ((getSshKeyName() == null) ? 0 : getSshKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode()); 
        hashCode = prime * hashCode + ((getRootDeviceType() == null) ? 0 : getRootDeviceType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateInstanceRequest == false) return false;
        CreateInstanceRequest other = (CreateInstanceRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getLayerIds() == null ^ this.getLayerIds() == null) return false;
        if (other.getLayerIds() != null && other.getLayerIds().equals(this.getLayerIds()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getAutoScalingType() == null ^ this.getAutoScalingType() == null) return false;
        if (other.getAutoScalingType() != null && other.getAutoScalingType().equals(this.getAutoScalingType()) == false) return false; 
        if (other.getHostname() == null ^ this.getHostname() == null) return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false) return false; 
        if (other.getOs() == null ^ this.getOs() == null) return false;
        if (other.getOs() != null && other.getOs().equals(this.getOs()) == false) return false; 
        if (other.getSshKeyName() == null ^ this.getSshKeyName() == null) return false;
        if (other.getSshKeyName() != null && other.getSshKeyName().equals(this.getSshKeyName()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getArchitecture() == null ^ this.getArchitecture() == null) return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false) return false; 
        if (other.getRootDeviceType() == null ^ this.getRootDeviceType() == null) return false;
        if (other.getRootDeviceType() != null && other.getRootDeviceType().equals(this.getRootDeviceType()) == false) return false; 
        return true;
    }
    
}
    