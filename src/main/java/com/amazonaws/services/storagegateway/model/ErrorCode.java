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
package com.amazonaws.services.storagegateway.model;

/**
 * Error Code
 */
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
     *            real value
     * @return ErrorCode corresponding to the value
     */
    public static ErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("ActivationKeyExpired".equals(value)) {
            return ErrorCode.ActivationKeyExpired;
        } else if ("ActivationKeyInvalid".equals(value)) {
            return ErrorCode.ActivationKeyInvalid;
        } else if ("ActivationKeyNotFound".equals(value)) {
            return ErrorCode.ActivationKeyNotFound;
        } else if ("GatewayInternalError".equals(value)) {
            return ErrorCode.GatewayInternalError;
        } else if ("GatewayNotConnected".equals(value)) {
            return ErrorCode.GatewayNotConnected;
        } else if ("GatewayNotFound".equals(value)) {
            return ErrorCode.GatewayNotFound;
        } else if ("GatewayProxyNetworkConnectionBusy".equals(value)) {
            return ErrorCode.GatewayProxyNetworkConnectionBusy;
        } else if ("AuthenticationFailure".equals(value)) {
            return ErrorCode.AuthenticationFailure;
        } else if ("BandwidthThrottleScheduleNotFound".equals(value)) {
            return ErrorCode.BandwidthThrottleScheduleNotFound;
        } else if ("Blocked".equals(value)) {
            return ErrorCode.Blocked;
        } else if ("CannotExportSnapshot".equals(value)) {
            return ErrorCode.CannotExportSnapshot;
        } else if ("ChapCredentialNotFound".equals(value)) {
            return ErrorCode.ChapCredentialNotFound;
        } else if ("DiskAlreadyAllocated".equals(value)) {
            return ErrorCode.DiskAlreadyAllocated;
        } else if ("DiskDoesNotExist".equals(value)) {
            return ErrorCode.DiskDoesNotExist;
        } else if ("DiskSizeGreaterThanVolumeMaxSize".equals(value)) {
            return ErrorCode.DiskSizeGreaterThanVolumeMaxSize;
        } else if ("DiskSizeLessThanVolumeSize".equals(value)) {
            return ErrorCode.DiskSizeLessThanVolumeSize;
        } else if ("DiskSizeNotGigAligned".equals(value)) {
            return ErrorCode.DiskSizeNotGigAligned;
        } else if ("DuplicateCertificateInfo".equals(value)) {
            return ErrorCode.DuplicateCertificateInfo;
        } else if ("DuplicateSchedule".equals(value)) {
            return ErrorCode.DuplicateSchedule;
        } else if ("EndpointNotFound".equals(value)) {
            return ErrorCode.EndpointNotFound;
        } else if ("IAMNotSupported".equals(value)) {
            return ErrorCode.IAMNotSupported;
        } else if ("InitiatorInvalid".equals(value)) {
            return ErrorCode.InitiatorInvalid;
        } else if ("InitiatorNotFound".equals(value)) {
            return ErrorCode.InitiatorNotFound;
        } else if ("InternalError".equals(value)) {
            return ErrorCode.InternalError;
        } else if ("InvalidGateway".equals(value)) {
            return ErrorCode.InvalidGateway;
        } else if ("InvalidEndpoint".equals(value)) {
            return ErrorCode.InvalidEndpoint;
        } else if ("InvalidParameters".equals(value)) {
            return ErrorCode.InvalidParameters;
        } else if ("InvalidSchedule".equals(value)) {
            return ErrorCode.InvalidSchedule;
        } else if ("LocalStorageLimitExceeded".equals(value)) {
            return ErrorCode.LocalStorageLimitExceeded;
        } else if ("LunAlreadyAllocated ".equals(value)) {
            return ErrorCode.LunAlreadyAllocated;
        } else if ("LunInvalid".equals(value)) {
            return ErrorCode.LunInvalid;
        } else if ("MaximumContentLengthExceeded".equals(value)) {
            return ErrorCode.MaximumContentLengthExceeded;
        } else if ("MaximumTapeCartridgeCountExceeded".equals(value)) {
            return ErrorCode.MaximumTapeCartridgeCountExceeded;
        } else if ("MaximumVolumeCountExceeded".equals(value)) {
            return ErrorCode.MaximumVolumeCountExceeded;
        } else if ("NetworkConfigurationChanged".equals(value)) {
            return ErrorCode.NetworkConfigurationChanged;
        } else if ("NoDisksAvailable".equals(value)) {
            return ErrorCode.NoDisksAvailable;
        } else if ("NotImplemented".equals(value)) {
            return ErrorCode.NotImplemented;
        } else if ("NotSupported".equals(value)) {
            return ErrorCode.NotSupported;
        } else if ("OperationAborted".equals(value)) {
            return ErrorCode.OperationAborted;
        } else if ("OutdatedGateway".equals(value)) {
            return ErrorCode.OutdatedGateway;
        } else if ("ParametersNotImplemented".equals(value)) {
            return ErrorCode.ParametersNotImplemented;
        } else if ("RegionInvalid".equals(value)) {
            return ErrorCode.RegionInvalid;
        } else if ("RequestTimeout".equals(value)) {
            return ErrorCode.RequestTimeout;
        } else if ("ServiceUnavailable".equals(value)) {
            return ErrorCode.ServiceUnavailable;
        } else if ("SnapshotDeleted".equals(value)) {
            return ErrorCode.SnapshotDeleted;
        } else if ("SnapshotIdInvalid".equals(value)) {
            return ErrorCode.SnapshotIdInvalid;
        } else if ("SnapshotInProgress".equals(value)) {
            return ErrorCode.SnapshotInProgress;
        } else if ("SnapshotNotFound".equals(value)) {
            return ErrorCode.SnapshotNotFound;
        } else if ("SnapshotScheduleNotFound".equals(value)) {
            return ErrorCode.SnapshotScheduleNotFound;
        } else if ("StagingAreaFull".equals(value)) {
            return ErrorCode.StagingAreaFull;
        } else if ("StorageFailure".equals(value)) {
            return ErrorCode.StorageFailure;
        } else if ("TapeCartridgeNotFound".equals(value)) {
            return ErrorCode.TapeCartridgeNotFound;
        } else if ("TargetAlreadyExists".equals(value)) {
            return ErrorCode.TargetAlreadyExists;
        } else if ("TargetInvalid".equals(value)) {
            return ErrorCode.TargetInvalid;
        } else if ("TargetNotFound".equals(value)) {
            return ErrorCode.TargetNotFound;
        } else if ("UnauthorizedOperation".equals(value)) {
            return ErrorCode.UnauthorizedOperation;
        } else if ("VolumeAlreadyExists".equals(value)) {
            return ErrorCode.VolumeAlreadyExists;
        } else if ("VolumeIdInvalid".equals(value)) {
            return ErrorCode.VolumeIdInvalid;
        } else if ("VolumeInUse".equals(value)) {
            return ErrorCode.VolumeInUse;
        } else if ("VolumeNotFound".equals(value)) {
            return ErrorCode.VolumeNotFound;
        } else if ("VolumeNotReady".equals(value)) {
            return ErrorCode.VolumeNotReady;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    