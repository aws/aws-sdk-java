/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents a device type that an app is tested against.
 * </p>
 */
public class Device implements Serializable, Cloneable {

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
        this.formFactor = formFactor.toString();
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
        setFormFactor(formFactor);
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
        this.platform = platform.toString();
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
        setPlatform(platform);
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
     * @param resolution
     */

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    /**
     * @return
     */

    public Resolution getResolution() {
        return this.resolution;
    }

    /**
     * @param resolution
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getManufacturer() != null)
            sb.append("Manufacturer: " + getManufacturer() + ",");
        if (getModel() != null)
            sb.append("Model: " + getModel() + ",");
        if (getFormFactor() != null)
            sb.append("FormFactor: " + getFormFactor() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getOs() != null)
            sb.append("Os: " + getOs() + ",");
        if (getCpu() != null)
            sb.append("Cpu: " + getCpu() + ",");
        if (getResolution() != null)
            sb.append("Resolution: " + getResolution() + ",");
        if (getHeapSize() != null)
            sb.append("HeapSize: " + getHeapSize() + ",");
        if (getMemory() != null)
            sb.append("Memory: " + getMemory() + ",");
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getCarrier() != null)
            sb.append("Carrier: " + getCarrier() + ",");
        if (getRadio() != null)
            sb.append("Radio: " + getRadio() + ",");
        if (getRemoteAccessEnabled() != null)
            sb.append("RemoteAccessEnabled: " + getRemoteAccessEnabled() + ",");
        if (getFleetType() != null)
            sb.append("FleetType: " + getFleetType() + ",");
        if (getFleetName() != null)
            sb.append("FleetName: " + getFleetName());
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
        if (other.getFleetType() == null ^ this.getFleetType() == null)
            return false;
        if (other.getFleetType() != null && other.getFleetType().equals(this.getFleetType()) == false)
            return false;
        if (other.getFleetName() == null ^ this.getFleetName() == null)
            return false;
        if (other.getFleetName() != null && other.getFleetName().equals(this.getFleetName()) == false)
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
        hashCode = prime * hashCode + ((getFleetType() == null) ? 0 : getFleetType().hashCode());
        hashCode = prime * hashCode + ((getFleetName() == null) ? 0 : getFleetName().hashCode());
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
}
