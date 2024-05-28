/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * An SAP application registered with AWS Systems Manager for SAP.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/Application" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Application implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of the application.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application Registry.
     * </p>
     */
    private String appRegistryArn;
    /**
     * <p>
     * The status of the application.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The latest discovery result for the application.
     * </p>
     */
    private String discoveryStatus;
    /**
     * <p>
     * The components of the application.
     * </p>
     */
    private java.util.List<String> components;
    /**
     * <p>
     * The time at which the application was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The status message.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param id
     *        The ID of the application.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param id
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of the application.
     * </p>
     * 
     * @param type
     *        The type of the application.
     * @see ApplicationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the application.
     * </p>
     * 
     * @return The type of the application.
     * @see ApplicationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the application.
     * </p>
     * 
     * @param type
     *        The type of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationType
     */

    public Application withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the application.
     * </p>
     * 
     * @param type
     *        The type of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationType
     */

    public Application withType(ApplicationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the application.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application Registry.
     * </p>
     * 
     * @param appRegistryArn
     *        The Amazon Resource Name (ARN) of the Application Registry.
     */

    public void setAppRegistryArn(String appRegistryArn) {
        this.appRegistryArn = appRegistryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application Registry.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Application Registry.
     */

    public String getAppRegistryArn() {
        return this.appRegistryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application Registry.
     * </p>
     * 
     * @param appRegistryArn
     *        The Amazon Resource Name (ARN) of the Application Registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withAppRegistryArn(String appRegistryArn) {
        setAppRegistryArn(appRegistryArn);
        return this;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param status
     *        The status of the application.
     * @see ApplicationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @return The status of the application.
     * @see ApplicationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param status
     *        The status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public Application withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param status
     *        The status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public Application withStatus(ApplicationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The latest discovery result for the application.
     * </p>
     * 
     * @param discoveryStatus
     *        The latest discovery result for the application.
     * @see ApplicationDiscoveryStatus
     */

    public void setDiscoveryStatus(String discoveryStatus) {
        this.discoveryStatus = discoveryStatus;
    }

    /**
     * <p>
     * The latest discovery result for the application.
     * </p>
     * 
     * @return The latest discovery result for the application.
     * @see ApplicationDiscoveryStatus
     */

    public String getDiscoveryStatus() {
        return this.discoveryStatus;
    }

    /**
     * <p>
     * The latest discovery result for the application.
     * </p>
     * 
     * @param discoveryStatus
     *        The latest discovery result for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationDiscoveryStatus
     */

    public Application withDiscoveryStatus(String discoveryStatus) {
        setDiscoveryStatus(discoveryStatus);
        return this;
    }

    /**
     * <p>
     * The latest discovery result for the application.
     * </p>
     * 
     * @param discoveryStatus
     *        The latest discovery result for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationDiscoveryStatus
     */

    public Application withDiscoveryStatus(ApplicationDiscoveryStatus discoveryStatus) {
        this.discoveryStatus = discoveryStatus.toString();
        return this;
    }

    /**
     * <p>
     * The components of the application.
     * </p>
     * 
     * @return The components of the application.
     */

    public java.util.List<String> getComponents() {
        return components;
    }

    /**
     * <p>
     * The components of the application.
     * </p>
     * 
     * @param components
     *        The components of the application.
     */

    public void setComponents(java.util.Collection<String> components) {
        if (components == null) {
            this.components = null;
            return;
        }

        this.components = new java.util.ArrayList<String>(components);
    }

    /**
     * <p>
     * The components of the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponents(java.util.Collection)} or {@link #withComponents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param components
     *        The components of the application.
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
     * <p>
     * The components of the application.
     * </p>
     * 
     * @param components
     *        The components of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withComponents(java.util.Collection<String> components) {
        setComponents(components);
        return this;
    }

    /**
     * <p>
     * The time at which the application was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time at which the application was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time at which the application was last updated.
     * </p>
     * 
     * @return The time at which the application was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The time at which the application was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time at which the application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @return The status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
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
        if (getDiscoveryStatus() != null)
            sb.append("DiscoveryStatus: ").append(getDiscoveryStatus()).append(",");
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
        if (other.getDiscoveryStatus() == null ^ this.getDiscoveryStatus() == null)
            return false;
        if (other.getDiscoveryStatus() != null && other.getDiscoveryStatus().equals(this.getDiscoveryStatus()) == false)
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
        hashCode = prime * hashCode + ((getDiscoveryStatus() == null) ? 0 : getDiscoveryStatus().hashCode());
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
