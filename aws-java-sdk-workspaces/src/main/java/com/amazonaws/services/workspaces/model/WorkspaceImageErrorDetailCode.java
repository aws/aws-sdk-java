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
package com.amazonaws.services.workspaces.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum WorkspaceImageErrorDetailCode {

    OutdatedPowershellVersion("OutdatedPowershellVersion"),
    OfficeInstalled("OfficeInstalled"),
    PCoIPAgentInstalled("PCoIPAgentInstalled"),
    WindowsUpdatesEnabled("WindowsUpdatesEnabled"),
    AutoMountDisabled("AutoMountDisabled"),
    WorkspacesBYOLAccountNotFound("WorkspacesBYOLAccountNotFound"),
    WorkspacesBYOLAccountDisabled("WorkspacesBYOLAccountDisabled"),
    DHCPDisabled("DHCPDisabled"),
    DiskFreeSpace("DiskFreeSpace"),
    AdditionalDrivesAttached("AdditionalDrivesAttached"),
    OSNotSupported("OSNotSupported"),
    DomainJoined("DomainJoined"),
    AzureDomainJoined("AzureDomainJoined"),
    FirewallEnabled("FirewallEnabled"),
    VMWareToolsInstalled("VMWareToolsInstalled"),
    DiskSizeExceeded("DiskSizeExceeded"),
    IncompatiblePartitioning("IncompatiblePartitioning"),
    PendingReboot("PendingReboot"),
    AutoLogonEnabled("AutoLogonEnabled"),
    RealTimeUniversalDisabled("RealTimeUniversalDisabled"),
    MultipleBootPartition("MultipleBootPartition"),
    Requires64BitOS("Requires64BitOS"),
    ZeroRearmCount("ZeroRearmCount"),
    InPlaceUpgrade("InPlaceUpgrade"),
    AntiVirusInstalled("AntiVirusInstalled"),
    UEFINotSupported("UEFINotSupported");

    private String value;

    private WorkspaceImageErrorDetailCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return WorkspaceImageErrorDetailCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static WorkspaceImageErrorDetailCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (WorkspaceImageErrorDetailCode enumEntry : WorkspaceImageErrorDetailCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
