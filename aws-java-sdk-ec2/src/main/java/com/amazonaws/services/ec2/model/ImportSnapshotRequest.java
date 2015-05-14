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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ImportSnapshotRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#importSnapshot(ImportSnapshotRequest) ImportSnapshot operation}.
 * <p>
 * Imports a disk into an EBS snapshot.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#importSnapshot(ImportSnapshotRequest)
 */
public class ImportSnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ImportSnapshotRequest> {

    /**
     * The description string for the import snapshot task.
     */
    private String description;

    /**
     * Information about the disk container.
     */
    private SnapshotDiskContainer diskContainer;

    /**
     * The client-specific data.
     */
    private ClientData clientData;

    /**
     * Token to enable idempotency for VM import requests.
     */
    private String clientToken;

    /**
     * The name of the role to use when not using the default role,
     * 'vmimport'.
     */
    private String roleName;

    /**
     * The description string for the import snapshot task.
     *
     * @return The description string for the import snapshot task.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description string for the import snapshot task.
     *
     * @param description The description string for the import snapshot task.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description string for the import snapshot task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description string for the import snapshot task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportSnapshotRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Information about the disk container.
     *
     * @return Information about the disk container.
     */
    public SnapshotDiskContainer getDiskContainer() {
        return diskContainer;
    }
    
    /**
     * Information about the disk container.
     *
     * @param diskContainer Information about the disk container.
     */
    public void setDiskContainer(SnapshotDiskContainer diskContainer) {
        this.diskContainer = diskContainer;
    }
    
    /**
     * Information about the disk container.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskContainer Information about the disk container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportSnapshotRequest withDiskContainer(SnapshotDiskContainer diskContainer) {
        this.diskContainer = diskContainer;
        return this;
    }

    /**
     * The client-specific data.
     *
     * @return The client-specific data.
     */
    public ClientData getClientData() {
        return clientData;
    }
    
    /**
     * The client-specific data.
     *
     * @param clientData The client-specific data.
     */
    public void setClientData(ClientData clientData) {
        this.clientData = clientData;
    }
    
    /**
     * The client-specific data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientData The client-specific data.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportSnapshotRequest withClientData(ClientData clientData) {
        this.clientData = clientData;
        return this;
    }

    /**
     * Token to enable idempotency for VM import requests.
     *
     * @return Token to enable idempotency for VM import requests.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Token to enable idempotency for VM import requests.
     *
     * @param clientToken Token to enable idempotency for VM import requests.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Token to enable idempotency for VM import requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Token to enable idempotency for VM import requests.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportSnapshotRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * The name of the role to use when not using the default role,
     * 'vmimport'.
     *
     * @return The name of the role to use when not using the default role,
     *         'vmimport'.
     */
    public String getRoleName() {
        return roleName;
    }
    
    /**
     * The name of the role to use when not using the default role,
     * 'vmimport'.
     *
     * @param roleName The name of the role to use when not using the default role,
     *         'vmimport'.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    /**
     * The name of the role to use when not using the default role,
     * 'vmimport'.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleName The name of the role to use when not using the default role,
     *         'vmimport'.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportSnapshotRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ImportSnapshotRequest> getDryRunRequest() {
        Request<ImportSnapshotRequest> request = new ImportSnapshotRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDiskContainer() != null) sb.append("DiskContainer: " + getDiskContainer() + ",");
        if (getClientData() != null) sb.append("ClientData: " + getClientData() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getRoleName() != null) sb.append("RoleName: " + getRoleName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getDiskContainer() == null) ? 0 : getDiskContainer().hashCode()); 
        hashCode = prime * hashCode + ((getClientData() == null) ? 0 : getClientData().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportSnapshotRequest == false) return false;
        ImportSnapshotRequest other = (ImportSnapshotRequest)obj;
        
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getDiskContainer() == null ^ this.getDiskContainer() == null) return false;
        if (other.getDiskContainer() != null && other.getDiskContainer().equals(this.getDiskContainer()) == false) return false; 
        if (other.getClientData() == null ^ this.getClientData() == null) return false;
        if (other.getClientData() != null && other.getClientData().equals(this.getClientData()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getRoleName() == null ^ this.getRoleName() == null) return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false) return false; 
        return true;
    }
    
    @Override
    public ImportSnapshotRequest clone() {
        
            return (ImportSnapshotRequest) super.clone();
    }

}
    