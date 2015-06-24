/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitosync.AmazonCognitoSync#updateRecords(UpdateRecordsRequest) UpdateRecords operation}.
 * <p>
 * Posts updates to records and adds and deletes records for a dataset
 * and user.
 * </p>
 * <p>
 * The sync count in the record patch is your last known sync count for
 * that record. The server will reject an UpdateRecords request with a
 * ResourceConflictException if you try to patch a record with a new
 * value but a stale sync count.
 * </p>
 * <p>
 * For example, if the sync count on the server is 5 for a key called
 * highScore and you try and submit a new highScore with sync count of 4,
 * the request will be rejected. To obtain the current sync count for a
 * record, call ListRecords. On a successful update of the record, the
 * response returns the new sync count for that record. You should
 * present that sync count the next time you try to update that same
 * record. When the record does not exist, specify the sync count as 0.
 * </p>
 * <p>
 * This API can be called with temporary user credentials provided by
 * Cognito Identity or with developer credentials.
 * </p>
 *
 * @see com.amazonaws.services.cognitosync.AmazonCognitoSync#updateRecords(UpdateRecordsRequest)
 */
public class UpdateRecordsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityId;

    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z,
     * 0-9, '_' (underscore), '-' (dash), and '.' (dot).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     */
    private String datasetName;

    /**
     * The unique ID generated for this device by Cognito.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String deviceId;

    /**
     * A list of patch operations.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch> recordPatches;

    /**
     * The SyncSessionToken returned by a previous call to ListRecords for
     * this dataset and identity.
     */
    private String syncSessionToken;

    /**
     * Intended to supply a device ID that will populate the lastModifiedBy
     * field referenced in other methods. The ClientContext field is not yet
     * implemented.
     */
    private String clientContext;

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public String getIdentityId() {
        return identityId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsRequest withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z,
     * 0-9, '_' (underscore), '-' (dash), and '.' (dot).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     *
     * @return A string of up to 128 characters. Allowed characters are a-z, A-Z,
     *         0-9, '_' (underscore), '-' (dash), and '.' (dot).
     */
    public String getDatasetName() {
        return datasetName;
    }
    
    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z,
     * 0-9, '_' (underscore), '-' (dash), and '.' (dot).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     *
     * @param datasetName A string of up to 128 characters. Allowed characters are a-z, A-Z,
     *         0-9, '_' (underscore), '-' (dash), and '.' (dot).
     */
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }
    
    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z,
     * 0-9, '_' (underscore), '-' (dash), and '.' (dot).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     *
     * @param datasetName A string of up to 128 characters. Allowed characters are a-z, A-Z,
     *         0-9, '_' (underscore), '-' (dash), and '.' (dot).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsRequest withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * The unique ID generated for this device by Cognito.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The unique ID generated for this device by Cognito.
     */
    public String getDeviceId() {
        return deviceId;
    }
    
    /**
     * The unique ID generated for this device by Cognito.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param deviceId The unique ID generated for this device by Cognito.
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    
    /**
     * The unique ID generated for this device by Cognito.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param deviceId The unique ID generated for this device by Cognito.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * A list of patch operations.
     *
     * @return A list of patch operations.
     */
    public java.util.List<RecordPatch> getRecordPatches() {
        if (recordPatches == null) {
              recordPatches = new com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch>();
              recordPatches.setAutoConstruct(true);
        }
        return recordPatches;
    }
    
    /**
     * A list of patch operations.
     *
     * @param recordPatches A list of patch operations.
     */
    public void setRecordPatches(java.util.Collection<RecordPatch> recordPatches) {
        if (recordPatches == null) {
            this.recordPatches = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch> recordPatchesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch>(recordPatches.size());
        recordPatchesCopy.addAll(recordPatches);
        this.recordPatches = recordPatchesCopy;
    }
    
    /**
     * A list of patch operations.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRecordPatches(java.util.Collection)} or {@link
     * #withRecordPatches(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recordPatches A list of patch operations.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsRequest withRecordPatches(RecordPatch... recordPatches) {
        if (getRecordPatches() == null) setRecordPatches(new java.util.ArrayList<RecordPatch>(recordPatches.length));
        for (RecordPatch value : recordPatches) {
            getRecordPatches().add(value);
        }
        return this;
    }
    
    /**
     * A list of patch operations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recordPatches A list of patch operations.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsRequest withRecordPatches(java.util.Collection<RecordPatch> recordPatches) {
        if (recordPatches == null) {
            this.recordPatches = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch> recordPatchesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch>(recordPatches.size());
            recordPatchesCopy.addAll(recordPatches);
            this.recordPatches = recordPatchesCopy;
        }

        return this;
    }

    /**
     * The SyncSessionToken returned by a previous call to ListRecords for
     * this dataset and identity.
     *
     * @return The SyncSessionToken returned by a previous call to ListRecords for
     *         this dataset and identity.
     */
    public String getSyncSessionToken() {
        return syncSessionToken;
    }
    
    /**
     * The SyncSessionToken returned by a previous call to ListRecords for
     * this dataset and identity.
     *
     * @param syncSessionToken The SyncSessionToken returned by a previous call to ListRecords for
     *         this dataset and identity.
     */
    public void setSyncSessionToken(String syncSessionToken) {
        this.syncSessionToken = syncSessionToken;
    }
    
    /**
     * The SyncSessionToken returned by a previous call to ListRecords for
     * this dataset and identity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param syncSessionToken The SyncSessionToken returned by a previous call to ListRecords for
     *         this dataset and identity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsRequest withSyncSessionToken(String syncSessionToken) {
        this.syncSessionToken = syncSessionToken;
        return this;
    }

    /**
     * Intended to supply a device ID that will populate the lastModifiedBy
     * field referenced in other methods. The ClientContext field is not yet
     * implemented.
     *
     * @return Intended to supply a device ID that will populate the lastModifiedBy
     *         field referenced in other methods. The ClientContext field is not yet
     *         implemented.
     */
    public String getClientContext() {
        return clientContext;
    }
    
    /**
     * Intended to supply a device ID that will populate the lastModifiedBy
     * field referenced in other methods. The ClientContext field is not yet
     * implemented.
     *
     * @param clientContext Intended to supply a device ID that will populate the lastModifiedBy
     *         field referenced in other methods. The ClientContext field is not yet
     *         implemented.
     */
    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }
    
    /**
     * Intended to supply a device ID that will populate the lastModifiedBy
     * field referenced in other methods. The ClientContext field is not yet
     * implemented.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientContext Intended to supply a device ID that will populate the lastModifiedBy
     *         field referenced in other methods. The ClientContext field is not yet
     *         implemented.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsRequest withClientContext(String clientContext) {
        this.clientContext = clientContext;
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
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getDatasetName() != null) sb.append("DatasetName: " + getDatasetName() + ",");
        if (getDeviceId() != null) sb.append("DeviceId: " + getDeviceId() + ",");
        if (getRecordPatches() != null) sb.append("RecordPatches: " + getRecordPatches() + ",");
        if (getSyncSessionToken() != null) sb.append("SyncSessionToken: " + getSyncSessionToken() + ",");
        if (getClientContext() != null) sb.append("ClientContext: " + getClientContext() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateRecordsRequest == false) return false;
        UpdateRecordsRequest other = (UpdateRecordsRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getDatasetName() == null ^ this.getDatasetName() == null) return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false) return false; 
        if (other.getDeviceId() == null ^ this.getDeviceId() == null) return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false) return false; 
        if (other.getRecordPatches() == null ^ this.getRecordPatches() == null) return false;
        if (other.getRecordPatches() != null && other.getRecordPatches().equals(this.getRecordPatches()) == false) return false; 
        if (other.getSyncSessionToken() == null ^ this.getSyncSessionToken() == null) return false;
        if (other.getSyncSessionToken() != null && other.getSyncSessionToken().equals(this.getSyncSessionToken()) == false) return false; 
        if (other.getClientContext() == null ^ this.getClientContext() == null) return false;
        if (other.getClientContext() != null && other.getClientContext().equals(this.getClientContext()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateRecordsRequest clone() {
        
            return (UpdateRecordsRequest) super.clone();
    }

}
    