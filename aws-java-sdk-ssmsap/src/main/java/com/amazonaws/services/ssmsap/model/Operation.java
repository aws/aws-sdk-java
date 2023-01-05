/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/Operation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Operation implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String id;
    /** <p/> */
    private String type;
    /** <p/> */
    private String status;
    /** <p/> */
    private String statusMessage;
    /** <p/> */
    private java.util.Map<String, String> properties;
    /** <p/> */
    private String resourceType;
    /** <p/> */
    private String resourceId;
    /** <p/> */
    private String resourceArn;
    /** <p/> */
    private java.util.Date startTime;
    /** <p/> */
    private java.util.Date endTime;
    /** <p/> */
    private java.util.Date lastUpdatedTime;

    /**
     * <p/>
     * 
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p/>
     * 
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p/>
     * 
     * @param type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p/>
     * 
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p/>
     * 
     * @param status
     * @see OperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p/>
     * 
     * @return
     * @see OperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p/>
     * 
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public Operation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p/>
     * 
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public Operation withStatus(OperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param statusMessage
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p/>
     * 
     * @param statusMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p/>
     * 
     * @param properties
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p/>
     * 
     * @param properties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see Operation#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Operation addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p/>
     * 
     * @param resourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p/>
     * 
     * @param resourceType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param resourceId
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p/>
     * 
     * @param resourceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param resourceArn
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p/>
     * 
     * @param resourceArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param startTime
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p/>
     * 
     * @param startTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p/>
     * 
     * @param endTime
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p/>
     * 
     * @param endTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p/>
     * 
     * @param lastUpdatedTime
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p/>
     * 
     * @param lastUpdatedTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Operation == false)
            return false;
        Operation other = (Operation) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public Operation clone() {
        try {
            return (Operation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.OperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
