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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to post updates to records or add and delete records for a dataset and user.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/UpdateRecords" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRecordsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     */
    private String identityPoolId;
    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     */
    private String identityId;
    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.'
     * (dot).
     */
    private String datasetName;
    /**
     * <p>
     * The unique ID generated for this device by Cognito.
     * </p>
     */
    private String deviceId;
    /** A list of patch operations. */
    private com.amazonaws.internal.SdkInternalList<RecordPatch> recordPatches;
    /** The SyncSessionToken returned by a previous call to ListRecords for this dataset and identity. */
    private String syncSessionToken;
    /**
     * Intended to supply a device ID that will populate the lastModifiedBy field referenced in other methods. The
     * ClientContext field is not yet implemented.
     */
    private String clientContext;

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @return A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecordsRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @return A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecordsRequest withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.'
     * (dot).
     * 
     * @param datasetName
     *        A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and
     *        '.' (dot).
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.'
     * (dot).
     * 
     * @return A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and
     *         '.' (dot).
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.'
     * (dot).
     * 
     * @param datasetName
     *        A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and
     *        '.' (dot).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecordsRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The unique ID generated for this device by Cognito.
     * </p>
     * 
     * @param deviceId
     *        The unique ID generated for this device by Cognito.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The unique ID generated for this device by Cognito.
     * </p>
     * 
     * @return The unique ID generated for this device by Cognito.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The unique ID generated for this device by Cognito.
     * </p>
     * 
     * @param deviceId
     *        The unique ID generated for this device by Cognito.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecordsRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * A list of patch operations.
     * 
     * @return A list of patch operations.
     */

    public java.util.List<RecordPatch> getRecordPatches() {
        if (recordPatches == null) {
            recordPatches = new com.amazonaws.internal.SdkInternalList<RecordPatch>();
        }
        return recordPatches;
    }

    /**
     * A list of patch operations.
     * 
     * @param recordPatches
     *        A list of patch operations.
     */

    public void setRecordPatches(java.util.Collection<RecordPatch> recordPatches) {
        if (recordPatches == null) {
            this.recordPatches = null;
            return;
        }

        this.recordPatches = new com.amazonaws.internal.SdkInternalList<RecordPatch>(recordPatches);
    }

    /**
     * A list of patch operations.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordPatches(java.util.Collection)} or {@link #withRecordPatches(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param recordPatches
     *        A list of patch operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecordsRequest withRecordPatches(RecordPatch... recordPatches) {
        if (this.recordPatches == null) {
            setRecordPatches(new com.amazonaws.internal.SdkInternalList<RecordPatch>(recordPatches.length));
        }
        for (RecordPatch ele : recordPatches) {
            this.recordPatches.add(ele);
        }
        return this;
    }

    /**
     * A list of patch operations.
     * 
     * @param recordPatches
     *        A list of patch operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecordsRequest withRecordPatches(java.util.Collection<RecordPatch> recordPatches) {
        setRecordPatches(recordPatches);
        return this;
    }

    /**
     * The SyncSessionToken returned by a previous call to ListRecords for this dataset and identity.
     * 
     * @param syncSessionToken
     *        The SyncSessionToken returned by a previous call to ListRecords for this dataset and identity.
     */

    public void setSyncSessionToken(String syncSessionToken) {
        this.syncSessionToken = syncSessionToken;
    }

    /**
     * The SyncSessionToken returned by a previous call to ListRecords for this dataset and identity.
     * 
     * @return The SyncSessionToken returned by a previous call to ListRecords for this dataset and identity.
     */

    public String getSyncSessionToken() {
        return this.syncSessionToken;
    }

    /**
     * The SyncSessionToken returned by a previous call to ListRecords for this dataset and identity.
     * 
     * @param syncSessionToken
     *        The SyncSessionToken returned by a previous call to ListRecords for this dataset and identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecordsRequest withSyncSessionToken(String syncSessionToken) {
        setSyncSessionToken(syncSessionToken);
        return this;
    }

    /**
     * Intended to supply a device ID that will populate the lastModifiedBy field referenced in other methods. The
     * ClientContext field is not yet implemented.
     * 
     * @param clientContext
     *        Intended to supply a device ID that will populate the lastModifiedBy field referenced in other methods.
     *        The ClientContext field is not yet implemented.
     */

    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }

    /**
     * Intended to supply a device ID that will populate the lastModifiedBy field referenced in other methods. The
     * ClientContext field is not yet implemented.
     * 
     * @return Intended to supply a device ID that will populate the lastModifiedBy field referenced in other methods.
     *         The ClientContext field is not yet implemented.
     */

    public String getClientContext() {
        return this.clientContext;
    }

    /**
     * Intended to supply a device ID that will populate the lastModifiedBy field referenced in other methods. The
     * ClientContext field is not yet implemented.
     * 
     * @param clientContext
     *        Intended to supply a device ID that will populate the lastModifiedBy field referenced in other methods.
     *        The ClientContext field is not yet implemented.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecordsRequest withClientContext(String clientContext) {
        setClientContext(clientContext);
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getRecordPatches() != null)
            sb.append("RecordPatches: ").append(getRecordPatches()).append(",");
        if (getSyncSessionToken() != null)
            sb.append("SyncSessionToken: ").append(getSyncSessionToken()).append(",");
        if (getClientContext() != null)
            sb.append("ClientContext: ").append(getClientContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRecordsRequest == false)
            return false;
        UpdateRecordsRequest other = (UpdateRecordsRequest) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getRecordPatches() == null ^ this.getRecordPatches() == null)
            return false;
        if (other.getRecordPatches() != null && other.getRecordPatches().equals(this.getRecordPatches()) == false)
            return false;
        if (other.getSyncSessionToken() == null ^ this.getSyncSessionToken() == null)
            return false;
        if (other.getSyncSessionToken() != null && other.getSyncSessionToken().equals(this.getSyncSessionToken()) == false)
            return false;
        if (other.getClientContext() == null ^ this.getClientContext() == null)
            return false;
        if (other.getClientContext() != null && other.getClientContext().equals(this.getClientContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getRecordPatches() == null) ? 0 : getRecordPatches().hashCode());
        hashCode = prime * hashCode + ((getSyncSessionToken() == null) ? 0 : getSyncSessionToken().hashCode());
        hashCode = prime * hashCode + ((getClientContext() == null) ? 0 : getClientContext().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRecordsRequest clone() {
        return (UpdateRecordsRequest) super.clone();
    }

}
