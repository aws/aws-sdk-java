/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Provides additional information about an error that was returned by the service as an InvalidGatewayRequestException or InternalServiceError. See the
 * <code>errorCode</code> and <code>errorDetails</code> members for more information about the error.
 * </p>
 */
public class StorageGatewayError {

    /**
     * Additional information about the error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ActivationKeyExpired, ActivationKeyInvalid, ActivationKeyNotFound, GatewayInternalError, GatewayNotConnected, GatewayNotFound, GatewayProxyNetworkConnectionBusy, AuthenticationFailure, BandwidthThrottleScheduleNotFound, Blocked, CannotExportSnapshot, ChapCredentialNotFound, DiskAlreadyAllocated, DiskDoesNotExist, DiskSizeGreaterThanVolumeMaxSize, DiskSizeLessThanVolumeSize, DiskSizeNotGigAligned, DuplicateCertificateInfo, DuplicateSchedule, EndpointNotFound, IAMNotSupported, InitiatorInvalid, InitiatorNotFound, InternalError, InvalidGateway, InvalidEndpoint, InvalidParameters, InvalidSchedule, LocalStorageLimitExceeded, LunAlreadyAllocated , LunInvalid, MaximumContentLengthExceeded, MaximumVolumeCountExceeded, NetworkConfigurationChanged, NoDisksAvailable, NotImplemented, NotSupported, OperationAborted, OutdatedGateway, ParametersNotImplemented, RegionInvalid, RequestTimeout, ServiceUnavailable, SnapshotDeleted, SnapshotIdInvalid, SnapshotInProgress, SnapshotNotFound, SnapshotScheduleNotFound, StagingAreaFull, StorageFailure, TargetAlreadyExists, TargetInvalid, TargetNotFound, UnauthorizedOperation, VolumeAlreadyExists, VolumeIdInvalid, VolumeInUse, VolumeNotFound, VolumeNotReady
     */
    private String errorCode;

    /**
     * Human-readable text that provides detail about the error that occured.
     */
    private java.util.Map<String,String> errorDetails;

    /**
     * Additional information about the error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ActivationKeyExpired, ActivationKeyInvalid, ActivationKeyNotFound, GatewayInternalError, GatewayNotConnected, GatewayNotFound, GatewayProxyNetworkConnectionBusy, AuthenticationFailure, BandwidthThrottleScheduleNotFound, Blocked, CannotExportSnapshot, ChapCredentialNotFound, DiskAlreadyAllocated, DiskDoesNotExist, DiskSizeGreaterThanVolumeMaxSize, DiskSizeLessThanVolumeSize, DiskSizeNotGigAligned, DuplicateCertificateInfo, DuplicateSchedule, EndpointNotFound, IAMNotSupported, InitiatorInvalid, InitiatorNotFound, InternalError, InvalidGateway, InvalidEndpoint, InvalidParameters, InvalidSchedule, LocalStorageLimitExceeded, LunAlreadyAllocated , LunInvalid, MaximumContentLengthExceeded, MaximumVolumeCountExceeded, NetworkConfigurationChanged, NoDisksAvailable, NotImplemented, NotSupported, OperationAborted, OutdatedGateway, ParametersNotImplemented, RegionInvalid, RequestTimeout, ServiceUnavailable, SnapshotDeleted, SnapshotIdInvalid, SnapshotInProgress, SnapshotNotFound, SnapshotScheduleNotFound, StagingAreaFull, StorageFailure, TargetAlreadyExists, TargetInvalid, TargetNotFound, UnauthorizedOperation, VolumeAlreadyExists, VolumeIdInvalid, VolumeInUse, VolumeNotFound, VolumeNotReady
     *
     * @return Additional information about the error.
     *
     * @see ErrorCode
     */
    public String getErrorCode() {
        return errorCode;
    }
    
    /**
     * Additional information about the error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ActivationKeyExpired, ActivationKeyInvalid, ActivationKeyNotFound, GatewayInternalError, GatewayNotConnected, GatewayNotFound, GatewayProxyNetworkConnectionBusy, AuthenticationFailure, BandwidthThrottleScheduleNotFound, Blocked, CannotExportSnapshot, ChapCredentialNotFound, DiskAlreadyAllocated, DiskDoesNotExist, DiskSizeGreaterThanVolumeMaxSize, DiskSizeLessThanVolumeSize, DiskSizeNotGigAligned, DuplicateCertificateInfo, DuplicateSchedule, EndpointNotFound, IAMNotSupported, InitiatorInvalid, InitiatorNotFound, InternalError, InvalidGateway, InvalidEndpoint, InvalidParameters, InvalidSchedule, LocalStorageLimitExceeded, LunAlreadyAllocated , LunInvalid, MaximumContentLengthExceeded, MaximumVolumeCountExceeded, NetworkConfigurationChanged, NoDisksAvailable, NotImplemented, NotSupported, OperationAborted, OutdatedGateway, ParametersNotImplemented, RegionInvalid, RequestTimeout, ServiceUnavailable, SnapshotDeleted, SnapshotIdInvalid, SnapshotInProgress, SnapshotNotFound, SnapshotScheduleNotFound, StagingAreaFull, StorageFailure, TargetAlreadyExists, TargetInvalid, TargetNotFound, UnauthorizedOperation, VolumeAlreadyExists, VolumeIdInvalid, VolumeInUse, VolumeNotFound, VolumeNotReady
     *
     * @param errorCode Additional information about the error.
     *
     * @see ErrorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    /**
     * Additional information about the error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ActivationKeyExpired, ActivationKeyInvalid, ActivationKeyNotFound, GatewayInternalError, GatewayNotConnected, GatewayNotFound, GatewayProxyNetworkConnectionBusy, AuthenticationFailure, BandwidthThrottleScheduleNotFound, Blocked, CannotExportSnapshot, ChapCredentialNotFound, DiskAlreadyAllocated, DiskDoesNotExist, DiskSizeGreaterThanVolumeMaxSize, DiskSizeLessThanVolumeSize, DiskSizeNotGigAligned, DuplicateCertificateInfo, DuplicateSchedule, EndpointNotFound, IAMNotSupported, InitiatorInvalid, InitiatorNotFound, InternalError, InvalidGateway, InvalidEndpoint, InvalidParameters, InvalidSchedule, LocalStorageLimitExceeded, LunAlreadyAllocated , LunInvalid, MaximumContentLengthExceeded, MaximumVolumeCountExceeded, NetworkConfigurationChanged, NoDisksAvailable, NotImplemented, NotSupported, OperationAborted, OutdatedGateway, ParametersNotImplemented, RegionInvalid, RequestTimeout, ServiceUnavailable, SnapshotDeleted, SnapshotIdInvalid, SnapshotInProgress, SnapshotNotFound, SnapshotScheduleNotFound, StagingAreaFull, StorageFailure, TargetAlreadyExists, TargetInvalid, TargetNotFound, UnauthorizedOperation, VolumeAlreadyExists, VolumeIdInvalid, VolumeInUse, VolumeNotFound, VolumeNotReady
     *
     * @param errorCode Additional information about the error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ErrorCode
     */
    public StorageGatewayError withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    
    
    /**
     * Additional information about the error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ActivationKeyExpired, ActivationKeyInvalid, ActivationKeyNotFound, GatewayInternalError, GatewayNotConnected, GatewayNotFound, GatewayProxyNetworkConnectionBusy, AuthenticationFailure, BandwidthThrottleScheduleNotFound, Blocked, CannotExportSnapshot, ChapCredentialNotFound, DiskAlreadyAllocated, DiskDoesNotExist, DiskSizeGreaterThanVolumeMaxSize, DiskSizeLessThanVolumeSize, DiskSizeNotGigAligned, DuplicateCertificateInfo, DuplicateSchedule, EndpointNotFound, IAMNotSupported, InitiatorInvalid, InitiatorNotFound, InternalError, InvalidGateway, InvalidEndpoint, InvalidParameters, InvalidSchedule, LocalStorageLimitExceeded, LunAlreadyAllocated , LunInvalid, MaximumContentLengthExceeded, MaximumVolumeCountExceeded, NetworkConfigurationChanged, NoDisksAvailable, NotImplemented, NotSupported, OperationAborted, OutdatedGateway, ParametersNotImplemented, RegionInvalid, RequestTimeout, ServiceUnavailable, SnapshotDeleted, SnapshotIdInvalid, SnapshotInProgress, SnapshotNotFound, SnapshotScheduleNotFound, StagingAreaFull, StorageFailure, TargetAlreadyExists, TargetInvalid, TargetNotFound, UnauthorizedOperation, VolumeAlreadyExists, VolumeIdInvalid, VolumeInUse, VolumeNotFound, VolumeNotReady
     *
     * @param errorCode Additional information about the error.
     *
     * @see ErrorCode
     */
    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }
    
    /**
     * Additional information about the error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ActivationKeyExpired, ActivationKeyInvalid, ActivationKeyNotFound, GatewayInternalError, GatewayNotConnected, GatewayNotFound, GatewayProxyNetworkConnectionBusy, AuthenticationFailure, BandwidthThrottleScheduleNotFound, Blocked, CannotExportSnapshot, ChapCredentialNotFound, DiskAlreadyAllocated, DiskDoesNotExist, DiskSizeGreaterThanVolumeMaxSize, DiskSizeLessThanVolumeSize, DiskSizeNotGigAligned, DuplicateCertificateInfo, DuplicateSchedule, EndpointNotFound, IAMNotSupported, InitiatorInvalid, InitiatorNotFound, InternalError, InvalidGateway, InvalidEndpoint, InvalidParameters, InvalidSchedule, LocalStorageLimitExceeded, LunAlreadyAllocated , LunInvalid, MaximumContentLengthExceeded, MaximumVolumeCountExceeded, NetworkConfigurationChanged, NoDisksAvailable, NotImplemented, NotSupported, OperationAborted, OutdatedGateway, ParametersNotImplemented, RegionInvalid, RequestTimeout, ServiceUnavailable, SnapshotDeleted, SnapshotIdInvalid, SnapshotInProgress, SnapshotNotFound, SnapshotScheduleNotFound, StagingAreaFull, StorageFailure, TargetAlreadyExists, TargetInvalid, TargetNotFound, UnauthorizedOperation, VolumeAlreadyExists, VolumeIdInvalid, VolumeInUse, VolumeNotFound, VolumeNotReady
     *
     * @param errorCode Additional information about the error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ErrorCode
     */
    public StorageGatewayError withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }
    
    /**
     * Human-readable text that provides detail about the error that occured.
     *
     * @return Human-readable text that provides detail about the error that occured.
     */
    public java.util.Map<String,String> getErrorDetails() {
        
        if (errorDetails == null) {
            errorDetails = new java.util.HashMap<String,String>();
        }
        return errorDetails;
    }
    
    /**
     * Human-readable text that provides detail about the error that occured.
     *
     * @param errorDetails Human-readable text that provides detail about the error that occured.
     */
    public void setErrorDetails(java.util.Map<String,String> errorDetails) {
        this.errorDetails = errorDetails;
    }
    
    /**
     * Human-readable text that provides detail about the error that occured.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorDetails Human-readable text that provides detail about the error that occured.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StorageGatewayError withErrorDetails(java.util.Map<String,String> errorDetails) {
        setErrorDetails(errorDetails);
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
        if (errorCode != null) sb.append("ErrorCode: " + errorCode + ", ");
        if (errorDetails != null) sb.append("ErrorDetails: " + errorDetails + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode()); 
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof StorageGatewayError == false) return false;
        StorageGatewayError other = (StorageGatewayError)obj;
        
        if (other.getErrorCode() == null ^ this.getErrorCode() == null) return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false) return false; 
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null) return false;
        if (other.getErrorDetails() != null && other.getErrorDetails().equals(this.getErrorDetails()) == false) return false; 
        return true;
    }
    
}
    