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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a device type that an app is tested against.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/Device" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Device implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The device's display name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The device's manufacturer name.
     * </p>
     */
    private String manufacturer;
    /**
     * <p>
     * The device's model name.
     * </p>
     */
    private String model;
    /**
     * <p>
     * The device's model ID.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * The device's form factor.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PHONE: The phone form factor.
     * </p>
     * </li>
     * <li>
     * <p>
     * TABLET: The tablet form factor.
     * </p>
     * </li>
     * </ul>
     */
    private String formFactor;
    /**
     * <p>
     * The device's platform.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID: The Android platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS: The iOS platform.
     * </p>
     * </li>
     * </ul>
     */
    private String platform;
    /**
     * <p>
     * The device's operating system type.
     * </p>
     */
    private String os;
    /**
     * <p>
     * Information about the device's CPU.
     * </p>
     */
    private CPU cpu;
    /**
     * <p>
     * The resolution of the device.
     * </p>
     */
    private Resolution resolution;
    /**
     * <p>
     * The device's heap size, expressed in bytes.
     * </p>
     */
    private Long heapSize;
    /**
     * <p>
     * The device's total memory size, expressed in bytes.
     * </p>
     */
    private Long memory;
    /**
     * <p>
     * The device's image name.
     * </p>
     */
    private String image;
    /**
     * <p>
     * The device's carrier.
     * </p>
     */
    private String carrier;
    /**
     * <p>
     * The device's radio.
     * </p>
     */
    private String radio;
    /**
     * <p>
     * Specifies whether remote access has been enabled for the specified device.
     * </p>
     */
    private Boolean remoteAccessEnabled;
    /**
     * <p>
     * This flag is set to <code>true</code> if remote debugging is enabled for the device.
     * </p>
     */
    private Boolean remoteDebugEnabled;
    /**
     * <p>
     * The type of fleet to which this device belongs. Possible values for fleet type are PRIVATE and PUBLIC.
     * </p>
     */
    private String fleetType;
    /**
     * <p>
     * The name of the fleet to which this device belongs.
     * </p>
     */
    private String fleetName;
    /**
     * <p>
     * The instances belonging to this device.
     * </p>
     */
    private java.util.List<DeviceInstance> instances;
    /**
     * <p>
     * Reflects how likely a device will be available for a test run. It is currently available in the ListDevices and
     * GetDevice API methods.
     * </p>
     */
    private String availability;

    /**
     * <p>
     * The device's ARN.
     * </p>
     * 
     * @param arn
     *        The device's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The device's ARN.
     * </p>
     * 
     * @return The device's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The device's ARN.
     * </p>
     * 
     * @param arn
     *        The device's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The device's display name.
     * </p>
     * 
     * @param name
     *        The device's display name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The device's display name.
     * </p>
     * 
     * @return The device's display name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The device's display name.
     * </p>
     * 
     * @param name
     *        The device's display name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The device's manufacturer name.
     * </p>
     * 
     * @param manufacturer
     *        The device's manufacturer name.
     */

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * <p>
     * The device's manufacturer name.
     * </p>
     * 
     * @return The device's manufacturer name.
     */

    public String getManufacturer() {
        return this.manufacturer;
    }

    /**
     * <p>
     * The device's manufacturer name.
     * </p>
     * 
     * @param manufacturer
     *        The device's manufacturer name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withManufacturer(String manufacturer) {
        setManufacturer(manufacturer);
        return this;
    }

    /**
     * <p>
     * The device's model name.
     * </p>
     * 
     * @param model
     *        The device's model name.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The device's model name.
     * </p>
     * 
     * @return The device's model name.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * The device's model name.
     * </p>
     * 
     * @param model
     *        The device's model name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The device's model ID.
     * </p>
     * 
     * @param modelId
     *        The device's model ID.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The device's model ID.
     * </p>
     * 
     * @return The device's model ID.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The device's model ID.
     * </p>
     * 
     * @param modelId
     *        The device's model ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * The device's form factor.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PHONE: The phone form factor.
     * </p>
     * </li>
     * <li>
     * <p>
     * TABLET: The tablet form factor.
     * </p>
     * </li>
     * </ul>
     * 
     * @param formFactor
     *        The device's form factor.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PHONE: The phone form factor.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TABLET: The tablet form factor.
     *        </p>
     *        </li>
     * @see DeviceFormFactor
     */

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    /**
     * <p>
     * The device's form factor.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PHONE: The phone form factor.
     * </p>
     * </li>
     * <li>
     * <p>
     * TABLET: The tablet form factor.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The device's form factor.</p>
     *         <p>
     *         Allowed values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PHONE: The phone form factor.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TABLET: The tablet form factor.
     *         </p>
     *         </li>
     * @see DeviceFormFactor
     */

    public String getFormFactor() {
        return this.formFactor;
    }

    /**
     * <p>
     * The device's form factor.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PHONE: The phone form factor.
     * </p>
     * </li>
     * <li>
     * <p>
     * TABLET: The tablet form factor.
     * </p>
     * </li>
     * </ul>
     * 
     * @param formFactor
     *        The device's form factor.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PHONE: The phone form factor.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TABLET: The tablet form factor.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceFormFactor
     */

    public Device withFormFactor(String formFactor) {
        setFormFactor(formFactor);
        return this;
    }

    /**
     * <p>
     * The device's form factor.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PHONE: The phone form factor.
     * </p>
     * </li>
     * <li>
     * <p>
     * TABLET: The tablet form factor.
     * </p>
     * </li>
     * </ul>
     * 
     * @param formFactor
     *        The device's form factor.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PHONE: The phone form factor.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TABLET: The tablet form factor.
     *        </p>
     *        </li>
     * @see DeviceFormFactor
     */

    public void setFormFactor(DeviceFormFactor formFactor) {
        withFormFactor(formFactor);
    }

    /**
     * <p>
     * The device's form factor.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PHONE: The phone form factor.
     * </p>
     * </li>
     * <li>
     * <p>
     * TABLET: The tablet form factor.
     * </p>
     * </li>
     * </ul>
     * 
     * @param formFactor
     *        The device's form factor.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PHONE: The phone form factor.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TABLET: The tablet form factor.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceFormFactor
     */

    public Device withFormFactor(DeviceFormFactor formFactor) {
        this.formFactor = formFactor.toString();
        return this;
    }

    /**
     * <p>
     * The device's platform.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID: The Android platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS: The iOS platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @param platform
     *        The device's platform.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID: The Android platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS: The iOS platform.
     *        </p>
     *        </li>
     * @see DevicePlatform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The device's platform.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID: The Android platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS: The iOS platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The device's platform.</p>
     *         <p>
     *         Allowed values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ANDROID: The Android platform.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IOS: The iOS platform.
     *         </p>
     *         </li>
     * @see DevicePlatform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The device's platform.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID: The Android platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS: The iOS platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @param platform
     *        The device's platform.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID: The Android platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS: The iOS platform.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DevicePlatform
     */

    public Device withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The device's platform.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID: The Android platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS: The iOS platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @param platform
     *        The device's platform.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID: The Android platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS: The iOS platform.
     *        </p>
     *        </li>
     * @see DevicePlatform
     */

    public void setPlatform(DevicePlatform platform) {
        withPlatform(platform);
    }

    /**
     * <p>
     * The device's platform.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ANDROID: The Android platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * IOS: The iOS platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @param platform
     *        The device's platform.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ANDROID: The Android platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IOS: The iOS platform.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DevicePlatform
     */

    public Device withPlatform(DevicePlatform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The device's operating system type.
     * </p>
     * 
     * @param os
     *        The device's operating system type.
     */

    public void setOs(String os) {
        this.os = os;
    }

    /**
     * <p>
     * The device's operating system type.
     * </p>
     * 
     * @return The device's operating system type.
     */

    public String getOs() {
        return this.os;
    }

    /**
     * <p>
     * The device's operating system type.
     * </p>
     * 
     * @param os
     *        The device's operating system type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withOs(String os) {
        setOs(os);
        return this;
    }

    /**
     * <p>
     * Information about the device's CPU.
     * </p>
     * 
     * @param cpu
     *        Information about the device's CPU.
     */

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * Information about the device's CPU.
     * </p>
     * 
     * @return Information about the device's CPU.
     */

    public CPU getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * Information about the device's CPU.
     * </p>
     * 
     * @param cpu
     *        Information about the device's CPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withCpu(CPU cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The resolution of the device.
     * </p>
     * 
     * @param resolution
     *        The resolution of the device.
     */

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    /**
     * <p>
     * The resolution of the device.
     * </p>
     * 
     * @return The resolution of the device.
     */

    public Resolution getResolution() {
        return this.resolution;
    }

    /**
     * <p>
     * The resolution of the device.
     * </p>
     * 
     * @param resolution
     *        The resolution of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withResolution(Resolution resolution) {
        setResolution(resolution);
        return this;
    }

    /**
     * <p>
     * The device's heap size, expressed in bytes.
     * </p>
     * 
     * @param heapSize
     *        The device's heap size, expressed in bytes.
     */

    public void setHeapSize(Long heapSize) {
        this.heapSize = heapSize;
    }

    /**
     * <p>
     * The device's heap size, expressed in bytes.
     * </p>
     * 
     * @return The device's heap size, expressed in bytes.
     */

    public Long getHeapSize() {
        return this.heapSize;
    }

    /**
     * <p>
     * The device's heap size, expressed in bytes.
     * </p>
     * 
     * @param heapSize
     *        The device's heap size, expressed in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withHeapSize(Long heapSize) {
        setHeapSize(heapSize);
        return this;
    }

    /**
     * <p>
     * The device's total memory size, expressed in bytes.
     * </p>
     * 
     * @param memory
     *        The device's total memory size, expressed in bytes.
     */

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The device's total memory size, expressed in bytes.
     * </p>
     * 
     * @return The device's total memory size, expressed in bytes.
     */

    public Long getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The device's total memory size, expressed in bytes.
     * </p>
     * 
     * @param memory
     *        The device's total memory size, expressed in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withMemory(Long memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The device's image name.
     * </p>
     * 
     * @param image
     *        The device's image name.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The device's image name.
     * </p>
     * 
     * @return The device's image name.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The device's image name.
     * </p>
     * 
     * @param image
     *        The device's image name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The device's carrier.
     * </p>
     * 
     * @param carrier
     *        The device's carrier.
     */

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * <p>
     * The device's carrier.
     * </p>
     * 
     * @return The device's carrier.
     */

    public String getCarrier() {
        return this.carrier;
    }

    /**
     * <p>
     * The device's carrier.
     * </p>
     * 
     * @param carrier
     *        The device's carrier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withCarrier(String carrier) {
        setCarrier(carrier);
        return this;
    }

    /**
     * <p>
     * The device's radio.
     * </p>
     * 
     * @param radio
     *        The device's radio.
     */

    public void setRadio(String radio) {
        this.radio = radio;
    }

    /**
     * <p>
     * The device's radio.
     * </p>
     * 
     * @return The device's radio.
     */

    public String getRadio() {
        return this.radio;
    }

    /**
     * <p>
     * The device's radio.
     * </p>
     * 
     * @param radio
     *        The device's radio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withRadio(String radio) {
        setRadio(radio);
        return this;
    }

    /**
     * <p>
     * Specifies whether remote access has been enabled for the specified device.
     * </p>
     * 
     * @param remoteAccessEnabled
     *        Specifies whether remote access has been enabled for the specified device.
     */

    public void setRemoteAccessEnabled(Boolean remoteAccessEnabled) {
        this.remoteAccessEnabled = remoteAccessEnabled;
    }

    /**
     * <p>
     * Specifies whether remote access has been enabled for the specified device.
     * </p>
     * 
     * @return Specifies whether remote access has been enabled for the specified device.
     */

    public Boolean getRemoteAccessEnabled() {
        return this.remoteAccessEnabled;
    }

    /**
     * <p>
     * Specifies whether remote access has been enabled for the specified device.
     * </p>
     * 
     * @param remoteAccessEnabled
     *        Specifies whether remote access has been enabled for the specified device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withRemoteAccessEnabled(Boolean remoteAccessEnabled) {
        setRemoteAccessEnabled(remoteAccessEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether remote access has been enabled for the specified device.
     * </p>
     * 
     * @return Specifies whether remote access has been enabled for the specified device.
     */

    public Boolean isRemoteAccessEnabled() {
        return this.remoteAccessEnabled;
    }

    /**
     * <p>
     * This flag is set to <code>true</code> if remote debugging is enabled for the device.
     * </p>
     * 
     * @param remoteDebugEnabled
     *        This flag is set to <code>true</code> if remote debugging is enabled for the device.
     */

    public void setRemoteDebugEnabled(Boolean remoteDebugEnabled) {
        this.remoteDebugEnabled = remoteDebugEnabled;
    }

    /**
     * <p>
     * This flag is set to <code>true</code> if remote debugging is enabled for the device.
     * </p>
     * 
     * @return This flag is set to <code>true</code> if remote debugging is enabled for the device.
     */

    public Boolean getRemoteDebugEnabled() {
        return this.remoteDebugEnabled;
    }

    /**
     * <p>
     * This flag is set to <code>true</code> if remote debugging is enabled for the device.
     * </p>
     * 
     * @param remoteDebugEnabled
     *        This flag is set to <code>true</code> if remote debugging is enabled for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withRemoteDebugEnabled(Boolean remoteDebugEnabled) {
        setRemoteDebugEnabled(remoteDebugEnabled);
        return this;
    }

    /**
     * <p>
     * This flag is set to <code>true</code> if remote debugging is enabled for the device.
     * </p>
     * 
     * @return This flag is set to <code>true</code> if remote debugging is enabled for the device.
     */

    public Boolean isRemoteDebugEnabled() {
        return this.remoteDebugEnabled;
    }

    /**
     * <p>
     * The type of fleet to which this device belongs. Possible values for fleet type are PRIVATE and PUBLIC.
     * </p>
     * 
     * @param fleetType
     *        The type of fleet to which this device belongs. Possible values for fleet type are PRIVATE and PUBLIC.
     */

    public void setFleetType(String fleetType) {
        this.fleetType = fleetType;
    }

    /**
     * <p>
     * The type of fleet to which this device belongs. Possible values for fleet type are PRIVATE and PUBLIC.
     * </p>
     * 
     * @return The type of fleet to which this device belongs. Possible values for fleet type are PRIVATE and PUBLIC.
     */

    public String getFleetType() {
        return this.fleetType;
    }

    /**
     * <p>
     * The type of fleet to which this device belongs. Possible values for fleet type are PRIVATE and PUBLIC.
     * </p>
     * 
     * @param fleetType
     *        The type of fleet to which this device belongs. Possible values for fleet type are PRIVATE and PUBLIC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withFleetType(String fleetType) {
        setFleetType(fleetType);
        return this;
    }

    /**
     * <p>
     * The name of the fleet to which this device belongs.
     * </p>
     * 
     * @param fleetName
     *        The name of the fleet to which this device belongs.
     */

    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    /**
     * <p>
     * The name of the fleet to which this device belongs.
     * </p>
     * 
     * @return The name of the fleet to which this device belongs.
     */

    public String getFleetName() {
        return this.fleetName;
    }

    /**
     * <p>
     * The name of the fleet to which this device belongs.
     * </p>
     * 
     * @param fleetName
     *        The name of the fleet to which this device belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withFleetName(String fleetName) {
        setFleetName(fleetName);
        return this;
    }

    /**
     * <p>
     * The instances belonging to this device.
     * </p>
     * 
     * @return The instances belonging to this device.
     */

    public java.util.List<DeviceInstance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * The instances belonging to this device.
     * </p>
     * 
     * @param instances
     *        The instances belonging to this device.
     */

    public void setInstances(java.util.Collection<DeviceInstance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<DeviceInstance>(instances);
    }

    /**
     * <p>
     * The instances belonging to this device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        The instances belonging to this device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withInstances(DeviceInstance... instances) {
        if (this.instances == null) {
            setInstances(new java.util.ArrayList<DeviceInstance>(instances.length));
        }
        for (DeviceInstance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instances belonging to this device.
     * </p>
     * 
     * @param instances
     *        The instances belonging to this device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withInstances(java.util.Collection<DeviceInstance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * Reflects how likely a device will be available for a test run. It is currently available in the ListDevices and
     * GetDevice API methods.
     * </p>
     * 
     * @param availability
     *        Reflects how likely a device will be available for a test run. It is currently available in the
     *        ListDevices and GetDevice API methods.
     * @see DeviceAvailability
     */

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * <p>
     * Reflects how likely a device will be available for a test run. It is currently available in the ListDevices and
     * GetDevice API methods.
     * </p>
     * 
     * @return Reflects how likely a device will be available for a test run. It is currently available in the
     *         ListDevices and GetDevice API methods.
     * @see DeviceAvailability
     */

    public String getAvailability() {
        return this.availability;
    }

    /**
     * <p>
     * Reflects how likely a device will be available for a test run. It is currently available in the ListDevices and
     * GetDevice API methods.
     * </p>
     * 
     * @param availability
     *        Reflects how likely a device will be available for a test run. It is currently available in the
     *        ListDevices and GetDevice API methods.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceAvailability
     */

    public Device withAvailability(String availability) {
        setAvailability(availability);
        return this;
    }

    /**
     * <p>
     * Reflects how likely a device will be available for a test run. It is currently available in the ListDevices and
     * GetDevice API methods.
     * </p>
     * 
     * @param availability
     *        Reflects how likely a device will be available for a test run. It is currently available in the
     *        ListDevices and GetDevice API methods.
     * @see DeviceAvailability
     */

    public void setAvailability(DeviceAvailability availability) {
        withAvailability(availability);
    }

    /**
     * <p>
     * Reflects how likely a device will be available for a test run. It is currently available in the ListDevices and
     * GetDevice API methods.
     * </p>
     * 
     * @param availability
     *        Reflects how likely a device will be available for a test run. It is currently available in the
     *        ListDevices and GetDevice API methods.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceAvailability
     */

    public Device withAvailability(DeviceAvailability availability) {
        this.availability = availability.toString();
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
        if (getManufacturer() != null)
            sb.append("Manufacturer: ").append(getManufacturer()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId()).append(",");
        if (getFormFactor() != null)
            sb.append("FormFactor: ").append(getFormFactor()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getOs() != null)
            sb.append("Os: ").append(getOs()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getResolution() != null)
            sb.append("Resolution: ").append(getResolution()).append(",");
        if (getHeapSize() != null)
            sb.append("HeapSize: ").append(getHeapSize()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getCarrier() != null)
            sb.append("Carrier: ").append(getCarrier()).append(",");
        if (getRadio() != null)
            sb.append("Radio: ").append(getRadio()).append(",");
        if (getRemoteAccessEnabled() != null)
            sb.append("RemoteAccessEnabled: ").append(getRemoteAccessEnabled()).append(",");
        if (getRemoteDebugEnabled() != null)
            sb.append("RemoteDebugEnabled: ").append(getRemoteDebugEnabled()).append(",");
        if (getFleetType() != null)
            sb.append("FleetType: ").append(getFleetType()).append(",");
        if (getFleetName() != null)
            sb.append("FleetName: ").append(getFleetName()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getAvailability() != null)
            sb.append("Availability: ").append(getAvailability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Device == false)
            return false;
        Device other = (Device) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getManufacturer() == null ^ this.getManufacturer() == null)
            return false;
        if (other.getManufacturer() != null && other.getManufacturer().equals(this.getManufacturer()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getFormFactor() == null ^ this.getFormFactor() == null)
            return false;
        if (other.getFormFactor() != null && other.getFormFactor().equals(this.getFormFactor()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getOs() == null ^ this.getOs() == null)
            return false;
        if (other.getOs() != null && other.getOs().equals(this.getOs()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false)
            return false;
        if (other.getHeapSize() == null ^ this.getHeapSize() == null)
            return false;
        if (other.getHeapSize() != null && other.getHeapSize().equals(this.getHeapSize()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getCarrier() == null ^ this.getCarrier() == null)
            return false;
        if (other.getCarrier() != null && other.getCarrier().equals(this.getCarrier()) == false)
            return false;
        if (other.getRadio() == null ^ this.getRadio() == null)
            return false;
        if (other.getRadio() != null && other.getRadio().equals(this.getRadio()) == false)
            return false;
        if (other.getRemoteAccessEnabled() == null ^ this.getRemoteAccessEnabled() == null)
            return false;
        if (other.getRemoteAccessEnabled() != null && other.getRemoteAccessEnabled().equals(this.getRemoteAccessEnabled()) == false)
            return false;
        if (other.getRemoteDebugEnabled() == null ^ this.getRemoteDebugEnabled() == null)
            return false;
        if (other.getRemoteDebugEnabled() != null && other.getRemoteDebugEnabled().equals(this.getRemoteDebugEnabled()) == false)
            return false;
        if (other.getFleetType() == null ^ this.getFleetType() == null)
            return false;
        if (other.getFleetType() != null && other.getFleetType().equals(this.getFleetType()) == false)
            return false;
        if (other.getFleetName() == null ^ this.getFleetName() == null)
            return false;
        if (other.getFleetName() != null && other.getFleetName().equals(this.getFleetName()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getAvailability() == null ^ this.getAvailability() == null)
            return false;
        if (other.getAvailability() != null && other.getAvailability().equals(this.getAvailability()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getFormFactor() == null) ? 0 : getFormFactor().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getOs() == null) ? 0 : getOs().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        hashCode = prime * hashCode + ((getHeapSize() == null) ? 0 : getHeapSize().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getCarrier() == null) ? 0 : getCarrier().hashCode());
        hashCode = prime * hashCode + ((getRadio() == null) ? 0 : getRadio().hashCode());
        hashCode = prime * hashCode + ((getRemoteAccessEnabled() == null) ? 0 : getRemoteAccessEnabled().hashCode());
        hashCode = prime * hashCode + ((getRemoteDebugEnabled() == null) ? 0 : getRemoteDebugEnabled().hashCode());
        hashCode = prime * hashCode + ((getFleetType() == null) ? 0 : getFleetType().hashCode());
        hashCode = prime * hashCode + ((getFleetName() == null) ? 0 : getFleetName().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getAvailability() == null) ? 0 : getAvailability().hashCode());
        return hashCode;
    }

    @Override
    public Device clone() {
        try {
            return (Device) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.DeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
