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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/Application" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Application implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String id;
    /** <p/> */
    private String type;
    /** <p/> */
    private String arn;
    /** <p/> */
    private String appRegistryArn;
    /** <p/> */
    private String status;
    /** <p/> */
    private java.util.List<String> components;
    /** <p/> */
    private java.util.Date lastUpdated;
    /** <p/> */
    private String statusMessage;

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

    public Application withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p/>
     * 
     * @param type
     * @see ApplicationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p/>
     * 
     * @return
     * @see ApplicationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p/>
     * 
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationType
     */

    public Application withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p/>
     * 
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationType
     */

    public Application withType(ApplicationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param arn
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p/>
     * 
     * @param arn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param appRegistryArn
     */

    public void setAppRegistryArn(String appRegistryArn) {
        this.appRegistryArn = appRegistryArn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getAppRegistryArn() {
        return this.appRegistryArn;
    }

    /**
     * <p/>
     * 
     * @param appRegistryArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withAppRegistryArn(String appRegistryArn) {
        setAppRegistryArn(appRegistryArn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param status
     * @see ApplicationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p/>
     * 
     * @return
     * @see ApplicationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p/>
     * 
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public Application withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p/>
     * 
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public Application withStatus(ApplicationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getComponents() {
        return components;
    }

    /**
     * <p/>
     * 
     * @param components
     */

    public void setComponents(java.util.Collection<String> components) {
        if (components == null) {
            this.components = null;
            return;
        }

        this.components = new java.util.ArrayList<String>(components);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponents(java.util.Collection)} or {@link #withComponents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param components
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withComponents(String... components) {
        if (this.components == null) {
            setComponents(new java.util.ArrayList<String>(components.length));
        }
        for (String ele : components) {
            this.components.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param components
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withComponents(java.util.Collection<String> components) {
        setComponents(components);
        return this;
    }

    /**
     * <p/>
     * 
     * @param lastUpdated
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p/>
     * 
     * @param lastUpdated
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
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

    public Application withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAppRegistryArn() != null)
            sb.append("AppRegistryArn: ").append(getAppRegistryArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getComponents() != null)
            sb.append("Components: ").append(getComponents()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Application == false)
            return false;
        Application other = (Application) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAppRegistryArn() == null ^ this.getAppRegistryArn() == null)
            return false;
        if (other.getAppRegistryArn() != null && other.getAppRegistryArn().equals(this.getAppRegistryArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getComponents() == null ^ this.getComponents() == null)
            return false;
        if (other.getComponents() != null && other.getComponents().equals(this.getComponents()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAppRegistryArn() == null) ? 0 : getAppRegistryArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public Application clone() {
        try {
            return (Application) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.ApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
