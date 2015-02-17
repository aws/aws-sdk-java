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

/**
 * <p>
 * Describes an association status.
 * </p>
 */
public class AssociationStatus implements Serializable {

    /**
     * The date when the status changed.
     */
    private java.util.Date date;

    /**
     * The status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed
     */
    private String name;

    /**
     * The reason for the status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String message;

    /**
     * A user-defined string.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String additionalInfo;

    /**
     * The date when the status changed.
     *
     * @return The date when the status changed.
     */
    public java.util.Date getDate() {
        return date;
    }
    
    /**
     * The date when the status changed.
     *
     * @param date The date when the status changed.
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }
    
    /**
     * The date when the status changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param date The date when the status changed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssociationStatus withDate(java.util.Date date) {
        this.date = date;
        return this;
    }

    /**
     * The status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed
     *
     * @return The status.
     *
     * @see AssociationStatusName
     */
    public String getName() {
        return name;
    }
    
    /**
     * The status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed
     *
     * @param name The status.
     *
     * @see AssociationStatusName
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed
     *
     * @param name The status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AssociationStatusName
     */
    public AssociationStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed
     *
     * @param name The status.
     *
     * @see AssociationStatusName
     */
    public void setName(AssociationStatusName name) {
        this.name = name.toString();
    }
    
    /**
     * The status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed
     *
     * @param name The status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AssociationStatusName
     */
    public AssociationStatus withName(AssociationStatusName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * The reason for the status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The reason for the status.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The reason for the status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param message The reason for the status.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The reason for the status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param message The reason for the status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssociationStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * A user-defined string.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return A user-defined string.
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    
    /**
     * A user-defined string.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param additionalInfo A user-defined string.
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    /**
     * A user-defined string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param additionalInfo A user-defined string.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssociationStatus withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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
        if (getDate() != null) sb.append("Date: " + getDate() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getAdditionalInfo() != null) sb.append("AdditionalInfo: " + getAdditionalInfo() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssociationStatus == false) return false;
        AssociationStatus other = (AssociationStatus)obj;
        
        if (other.getDate() == null ^ this.getDate() == null) return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null) return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false) return false; 
        return true;
    }
    
}
    