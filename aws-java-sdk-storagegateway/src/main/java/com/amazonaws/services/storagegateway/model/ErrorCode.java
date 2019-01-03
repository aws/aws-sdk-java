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
package com.amazonaws.services.storagegateway.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ErrorCode {

    ActivationKeyExpired("ActivationKeyExpired"),
    ActivationKeyInvalid("ActivationKeyInvalid"),
    ActivationKeyNotFound("ActivationKeyNotFound"),
    GatewayInternalError("GatewayInternalError"),
    GatewayNotConnected("GatewayNotConnected"),
    GatewayNotFound("GatewayNotFound"),
    GatewayProxyNetworkConnectionBusy("GatewayProxyNetworkConnectionBusy"),
    AuthenticationFailure("AuthenticationFailure"),
    BandwidthThrottleScheduleNotFound("BandwidthThrottleScheduleNotFound"),
    Blocked("Blocked"),
    CannotExportSnapshot("CannotExportSnapshot"),
    ChapCredentialNotFound("ChapCredentialNotFound"),
    DiskAlreadyAllocated("DiskAlreadyAllocated"),
    DiskDoesNotExist("DiskDoesNotExist"),
    DiskSizeGreaterThanVolumeMaxSize("DiskSizeGreaterThanVolumeMaxSize"),
    DiskSizeLessThanVolumeSize("DiskSizeLessThanVolumeSize"),
    DiskSizeNotGigAligned("DiskSizeNotGigAligned"),
    DuplicateCertificateInfo("DuplicateCertificateInfo"),
    DuplicateSchedule("DuplicateSchedule"),
    EndpointNotFound("EndpointNotFound"),
    IAMNotSupported("IAMNotSupported"),
    InitiatorInvalid("InitiatorInvalid"),
    InitiatorNotFound("InitiatorNotFound"),
    InternalError("InternalError"),
    InvalidGateway("InvalidGateway"),
    InvalidEndpoint("InvalidEndpoint"),
    InvalidParameters("InvalidParameters"),
    InvalidSchedule("InvalidSchedule"),
    LocalStorageLimitExceeded("LocalStorageLimitExceeded"),
    LunAlreadyAllocated("LunAlreadyAllocated "),
    LunInvalid("LunInvalid"),
    MaximumContentLengthExceeded("MaximumContentLengthExceeded"),
    MaximumTapeCartridgeCountExceeded("MaximumTapeCartridgeCountExceeded"),
    MaximumVolumeCountExceeded("MaximumVolumeCountExceeded"),
    NetworkConfigurationChanged("NetworkConfigurationChanged"),
    NoDisksAvailable("NoDisksAvailable"),
    NotImplemented("NotImplemented"),
    NotSupported("NotSupported"),
    OperationAborted("OperationAborted"),
    OutdatedGateway("OutdatedGateway"),
    ParametersNotImplemented("ParametersNotImplemented"),
    RegionInvalid("RegionInvalid"),
    RequestTimeout("RequestTimeout"),
    ServiceUnavailable("ServiceUnavailable"),
    SnapshotDeleted("SnapshotDeleted"),
    SnapshotIdInvalid("SnapshotIdInvalid"),
    SnapshotInProgress("SnapshotInProgress"),
    SnapshotNotFound("SnapshotNotFound"),
    SnapshotScheduleNotFound("SnapshotScheduleNotFound"),
    StagingAreaFull("StagingAreaFull"),
    StorageFailure("StorageFailure"),
    TapeCartridgeNotFound("TapeCartridgeNotFound"),
    TargetAlreadyExists("TargetAlreadyExists"),
    TargetInvalid("TargetInvalid"),
    TargetNotFound("TargetNotFound"),
    UnauthorizedOperation("UnauthorizedOperation"),
    VolumeAlreadyExists("VolumeAlreadyExists"),
    VolumeIdInvalid("VolumeIdInvalid"),
    VolumeInUse("VolumeInUse"),
    VolumeNotFound("VolumeNotFound"),
    VolumeNotReady("VolumeNotReady");

    private String value;

    private ErrorCode(String value) {
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
     * @return ErrorCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ErrorCode enumEntry : ErrorCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
