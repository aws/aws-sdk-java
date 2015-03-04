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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement#updateAssociationStatus(UpdateAssociationStatusRequest) UpdateAssociationStatus operation}.
 * <p>
 * Updates the status of the configuration document associated with the
 * specified instance.
 * </p>
 *
 * @see com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement#updateAssociationStatus(UpdateAssociationStatusRequest)
 */
public class UpdateAssociationStatusRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,64}$<br/>
     */
    private String name;

    /**
     * The ID of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 10<br/>
     * <b>Pattern: </b>^(?=.{10}$)(i-(\w){8})<br/>
     */
    private String instanceId;

    /**
     * The association status.
     */
    private AssociationStatus associationStatus;

    /**
     * The name of the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,64}$<br/>
     *
     * @return The name of the configuration document.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,64}$<br/>
     *
     * @param name The name of the configuration document.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the configuration document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,64}$<br/>
     *
     * @param name The name of the configuration document.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAssociationStatusRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The ID of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 10<br/>
     * <b>Pattern: </b>^(?=.{10}$)(i-(\w){8})<br/>
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 10<br/>
     * <b>Pattern: </b>^(?=.{10}$)(i-(\w){8})<br/>
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 10<br/>
     * <b>Pattern: </b>^(?=.{10}$)(i-(\w){8})<br/>
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAssociationStatusRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The association status.
     *
     * @return The association status.
     */
    public AssociationStatus getAssociationStatus() {
        return associationStatus;
    }
    
    /**
     * The association status.
     *
     * @param associationStatus The association status.
     */
    public void setAssociationStatus(AssociationStatus associationStatus) {
        this.associationStatus = associationStatus;
    }
    
    /**
     * The association status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationStatus The association status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAssociationStatusRequest withAssociationStatus(AssociationStatus associationStatus) {
        this.associationStatus = associationStatus;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAssociationStatus() != null) sb.append("AssociationStatus: " + getAssociationStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateAssociationStatusRequest == false) return false;
        UpdateAssociationStatusRequest other = (UpdateAssociationStatusRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null) return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateAssociationStatusRequest clone() {
        
            return (UpdateAssociationStatusRequest) super.clone();
    }

}
    