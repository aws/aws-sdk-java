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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The web portal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/Portal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Portal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the browser settings that is associated with this web portal.
     * </p>
     */
    private String browserSettingsArn;
    /**
     * <p>
     * The browser that users see when using a streaming session.
     * </p>
     */
    private String browserType;
    /**
     * <p>
     * The creation date of the web portal.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The name of the web portal.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The ARN of the network settings that is associated with the web portal.
     * </p>
     */
    private String networkSettingsArn;
    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     */
    private String portalArn;
    /**
     * <p>
     * The endpoint URL of the web portal that users access in order to start streaming sessions.
     * </p>
     */
    private String portalEndpoint;
    /**
     * <p>
     * The status of the web portal.
     * </p>
     */
    private String portalStatus;
    /**
     * <p>
     * The renderer that is used in streaming sessions.
     * </p>
     */
    private String rendererType;
    /**
     * <p>
     * A message that explains why the web portal is in its current status.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The ARN of the trust store that is associated with the web portal.
     * </p>
     */
    private String trustStoreArn;
    /**
     * <p>
     * The ARN of the user access logging settings that is associated with the web portal.
     * </p>
     */
    private String userAccessLoggingSettingsArn;
    /**
     * <p>
     * The ARN of the user settings that is associated with the web portal.
     * </p>
     */
    private String userSettingsArn;

    /**
     * <p>
     * The ARN of the browser settings that is associated with this web portal.
     * </p>
     * 
     * @param browserSettingsArn
     *        The ARN of the browser settings that is associated with this web portal.
     */

    public void setBrowserSettingsArn(String browserSettingsArn) {
        this.browserSettingsArn = browserSettingsArn;
    }

    /**
     * <p>
     * The ARN of the browser settings that is associated with this web portal.
     * </p>
     * 
     * @return The ARN of the browser settings that is associated with this web portal.
     */

    public String getBrowserSettingsArn() {
        return this.browserSettingsArn;
    }

    /**
     * <p>
     * The ARN of the browser settings that is associated with this web portal.
     * </p>
     * 
     * @param browserSettingsArn
     *        The ARN of the browser settings that is associated with this web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Portal withBrowserSettingsArn(String browserSettingsArn) {
        setBrowserSettingsArn(browserSettingsArn);
        return this;
    }

    /**
     * <p>
     * The browser that users see when using a streaming session.
     * </p>
     * 
     * @param browserType
     *        The browser that users see when using a streaming session.
     * @see BrowserType
     */

    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }

    /**
     * <p>
     * The browser that users see when using a streaming session.
     * </p>
     * 
     * @return The browser that users see when using a streaming session.
     * @see BrowserType
     */

    public String getBrowserType() {
        return this.browserType;
    }

    /**
     * <p>
     * The browser that users see when using a streaming session.
     * </p>
     * 
     * @param browserType
     *        The browser that users see when using a streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrowserType
     */

    public Portal withBrowserType(String browserType) {
        setBrowserType(browserType);
        return this;
    }

    /**
     * <p>
     * The browser that users see when using a streaming session.
     * </p>
     * 
     * @param browserType
     *        The browser that users see when using a streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrowserType
     */

    public Portal withBrowserType(BrowserType browserType) {
        this.browserType = browserType.toString();
        return this;
    }

    /**
     * <p>
     * The creation date of the web portal.
     * </p>
     * 
     * @param creationDate
     *        The creation date of the web portal.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date of the web portal.
     * </p>
     * 
     * @return The creation date of the web portal.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date of the web portal.
     * </p>
     * 
     * @param creationDate
     *        The creation date of the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Portal withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The name of the web portal.
     * </p>
     * 
     * @param displayName
     *        The name of the web portal.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the web portal.
     * </p>
     * 
     * @return The name of the web portal.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the web portal.
     * </p>
     * 
     * @param displayName
     *        The name of the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Portal withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The ARN of the network settings that is associated with the web portal.
     * </p>
     * 
     * @param networkSettingsArn
     *        The ARN of the network settings that is associated with the web portal.
     */

    public void setNetworkSettingsArn(String networkSettingsArn) {
        this.networkSettingsArn = networkSettingsArn;
    }

    /**
     * <p>
     * The ARN of the network settings that is associated with the web portal.
     * </p>
     * 
     * @return The ARN of the network settings that is associated with the web portal.
     */

    public String getNetworkSettingsArn() {
        return this.networkSettingsArn;
    }

    /**
     * <p>
     * The ARN of the network settings that is associated with the web portal.
     * </p>
     * 
     * @param networkSettingsArn
     *        The ARN of the network settings that is associated with the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Portal withNetworkSettingsArn(String networkSettingsArn) {
        setNetworkSettingsArn(networkSettingsArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @param portalArn
     *        The ARN of the web portal.
     */

    public void setPortalArn(String portalArn) {
        this.portalArn = portalArn;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @return The ARN of the web portal.
     */

    public String getPortalArn() {
        return this.portalArn;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @param portalArn
     *        The ARN of the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Portal withPortalArn(String portalArn) {
        setPortalArn(portalArn);
        return this;
    }

    /**
     * <p>
     * The endpoint URL of the web portal that users access in order to start streaming sessions.
     * </p>
     * 
     * @param portalEndpoint
     *        The endpoint URL of the web portal that users access in order to start streaming sessions.
     */

    public void setPortalEndpoint(String portalEndpoint) {
        this.portalEndpoint = portalEndpoint;
    }

    /**
     * <p>
     * The endpoint URL of the web portal that users access in order to start streaming sessions.
     * </p>
     * 
     * @return The endpoint URL of the web portal that users access in order to start streaming sessions.
     */

    public String getPortalEndpoint() {
        return this.portalEndpoint;
    }

    /**
     * <p>
     * The endpoint URL of the web portal that users access in order to start streaming sessions.
     * </p>
     * 
     * @param portalEndpoint
     *        The endpoint URL of the web portal that users access in order to start streaming sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Portal withPortalEndpoint(String portalEndpoint) {
        setPortalEndpoint(portalEndpoint);
        return this;
    }

    /**
     * <p>
     * The status of the web portal.
     * </p>
     * 
     * @param portalStatus
     *        The status of the web portal.
     * @see PortalStatus
     */

    public void setPortalStatus(String portalStatus) {
        this.portalStatus = portalStatus;
    }

    /**
     * <p>
     * The status of the web portal.
     * </p>
     * 
     * @return The status of the web portal.
     * @see PortalStatus
     */

    public String getPortalStatus() {
        return this.portalStatus;
    }

    /**
     * <p>
     * The status of the web portal.
     * </p>
     * 
     * @param portalStatus
     *        The status of the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortalStatus
     */

    public Portal withPortalStatus(String portalStatus) {
        setPortalStatus(portalStatus);
        return this;
    }

    /**
     * <p>
     * The status of the web portal.
     * </p>
     * 
     * @param portalStatus
     *        The status of the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortalStatus
     */

    public Portal withPortalStatus(PortalStatus portalStatus) {
        this.portalStatus = portalStatus.toString();
        return this;
    }

    /**
     * <p>
     * The renderer that is used in streaming sessions.
     * </p>
     * 
     * @param rendererType
     *        The renderer that is used in streaming sessions.
     * @see RendererType
     */

    public void setRendererType(String rendererType) {
        this.rendererType = rendererType;
    }

    /**
     * <p>
     * The renderer that is used in streaming sessions.
     * </p>
     * 
     * @return The renderer that is used in streaming sessions.
     * @see RendererType
     */

    public String getRendererType() {
        return this.rendererType;
    }

    /**
     * <p>
     * The renderer that is used in streaming sessions.
     * </p>
     * 
     * @param rendererType
     *        The renderer that is used in streaming sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RendererType
     */

    public Portal withRendererType(String rendererType) {
        setRendererType(rendererType);
        return this;
    }

    /**
     * <p>
     * The renderer that is used in streaming sessions.
     * </p>
     * 
     * @param rendererType
     *        The renderer that is used in streaming sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RendererType
     */

    public Portal withRendererType(RendererType rendererType) {
        this.rendererType = rendererType.toString();
        return this;
    }

    /**
     * <p>
     * A message that explains why the web portal is in its current status.
     * </p>
     * 
     * @param statusReason
     *        A message that explains why the web portal is in its current status.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * A message that explains why the web portal is in its current status.
     * </p>
     * 
     * @return A message that explains why the web portal is in its current status.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * A message that explains why the web portal is in its current status.
     * </p>
     * 
     * @param statusReason
     *        A message that explains why the web portal is in its current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Portal withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The ARN of the trust store that is associated with the web portal.
     * </p>
     * 
     * @param trustStoreArn
     *        The ARN of the trust store that is associated with the web portal.
     */

    public void setTrustStoreArn(String trustStoreArn) {
        this.trustStoreArn = trustStoreArn;
    }

    /**
     * <p>
     * The ARN of the trust store that is associated with the web portal.
     * </p>
     * 
     * @return The ARN of the trust store that is associated with the web portal.
     */

    public String getTrustStoreArn() {
        return this.trustStoreArn;
    }

    /**
     * <p>
     * The ARN of the trust store that is associated with the web portal.
     * </p>
     * 
     * @param trustStoreArn
     *        The ARN of the trust store that is associated with the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Portal withTrustStoreArn(String trustStoreArn) {
        setTrustStoreArn(trustStoreArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the user access logging settings that is associated with the web portal.
     * </p>
     * 
     * @param userAccessLoggingSettingsArn
     *        The ARN of the user access logging settings that is associated with the web portal.
     */

    public void setUserAccessLoggingSettingsArn(String userAccessLoggingSettingsArn) {
        this.userAccessLoggingSettingsArn = userAccessLoggingSettingsArn;
    }

    /**
     * <p>
     * The ARN of the user access logging settings that is associated with the web portal.
     * </p>
     * 
     * @return The ARN of the user access logging settings that is associated with the web portal.
     */

    public String getUserAccessLoggingSettingsArn() {
        return this.userAccessLoggingSettingsArn;
    }

    /**
     * <p>
     * The ARN of the user access logging settings that is associated with the web portal.
     * </p>
     * 
     * @param userAccessLoggingSettingsArn
     *        The ARN of the user access logging settings that is associated with the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Portal withUserAccessLoggingSettingsArn(String userAccessLoggingSettingsArn) {
        setUserAccessLoggingSettingsArn(userAccessLoggingSettingsArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the user settings that is associated with the web portal.
     * </p>
     * 
     * @param userSettingsArn
     *        The ARN of the user settings that is associated with the web portal.
     */

    public void setUserSettingsArn(String userSettingsArn) {
        this.userSettingsArn = userSettingsArn;
    }

    /**
     * <p>
     * The ARN of the user settings that is associated with the web portal.
     * </p>
     * 
     * @return The ARN of the user settings that is associated with the web portal.
     */

    public String getUserSettingsArn() {
        return this.userSettingsArn;
    }

    /**
     * <p>
     * The ARN of the user settings that is associated with the web portal.
     * </p>
     * 
     * @param userSettingsArn
     *        The ARN of the user settings that is associated with the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Portal withUserSettingsArn(String userSettingsArn) {
        setUserSettingsArn(userSettingsArn);
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
        if (getBrowserSettingsArn() != null)
            sb.append("BrowserSettingsArn: ").append(getBrowserSettingsArn()).append(",");
        if (getBrowserType() != null)
            sb.append("BrowserType: ").append(getBrowserType()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getNetworkSettingsArn() != null)
            sb.append("NetworkSettingsArn: ").append(getNetworkSettingsArn()).append(",");
        if (getPortalArn() != null)
            sb.append("PortalArn: ").append(getPortalArn()).append(",");
        if (getPortalEndpoint() != null)
            sb.append("PortalEndpoint: ").append(getPortalEndpoint()).append(",");
        if (getPortalStatus() != null)
            sb.append("PortalStatus: ").append(getPortalStatus()).append(",");
        if (getRendererType() != null)
            sb.append("RendererType: ").append(getRendererType()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getTrustStoreArn() != null)
            sb.append("TrustStoreArn: ").append(getTrustStoreArn()).append(",");
        if (getUserAccessLoggingSettingsArn() != null)
            sb.append("UserAccessLoggingSettingsArn: ").append(getUserAccessLoggingSettingsArn()).append(",");
        if (getUserSettingsArn() != null)
            sb.append("UserSettingsArn: ").append(getUserSettingsArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Portal == false)
            return false;
        Portal other = (Portal) obj;
        if (other.getBrowserSettingsArn() == null ^ this.getBrowserSettingsArn() == null)
            return false;
        if (other.getBrowserSettingsArn() != null && other.getBrowserSettingsArn().equals(this.getBrowserSettingsArn()) == false)
            return false;
        if (other.getBrowserType() == null ^ this.getBrowserType() == null)
            return false;
        if (other.getBrowserType() != null && other.getBrowserType().equals(this.getBrowserType()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getNetworkSettingsArn() == null ^ this.getNetworkSettingsArn() == null)
            return false;
        if (other.getNetworkSettingsArn() != null && other.getNetworkSettingsArn().equals(this.getNetworkSettingsArn()) == false)
            return false;
        if (other.getPortalArn() == null ^ this.getPortalArn() == null)
            return false;
        if (other.getPortalArn() != null && other.getPortalArn().equals(this.getPortalArn()) == false)
            return false;
        if (other.getPortalEndpoint() == null ^ this.getPortalEndpoint() == null)
            return false;
        if (other.getPortalEndpoint() != null && other.getPortalEndpoint().equals(this.getPortalEndpoint()) == false)
            return false;
        if (other.getPortalStatus() == null ^ this.getPortalStatus() == null)
            return false;
        if (other.getPortalStatus() != null && other.getPortalStatus().equals(this.getPortalStatus()) == false)
            return false;
        if (other.getRendererType() == null ^ this.getRendererType() == null)
            return false;
        if (other.getRendererType() != null && other.getRendererType().equals(this.getRendererType()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getTrustStoreArn() == null ^ this.getTrustStoreArn() == null)
            return false;
        if (other.getTrustStoreArn() != null && other.getTrustStoreArn().equals(this.getTrustStoreArn()) == false)
            return false;
        if (other.getUserAccessLoggingSettingsArn() == null ^ this.getUserAccessLoggingSettingsArn() == null)
            return false;
        if (other.getUserAccessLoggingSettingsArn() != null && other.getUserAccessLoggingSettingsArn().equals(this.getUserAccessLoggingSettingsArn()) == false)
            return false;
        if (other.getUserSettingsArn() == null ^ this.getUserSettingsArn() == null)
            return false;
        if (other.getUserSettingsArn() != null && other.getUserSettingsArn().equals(this.getUserSettingsArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrowserSettingsArn() == null) ? 0 : getBrowserSettingsArn().hashCode());
        hashCode = prime * hashCode + ((getBrowserType() == null) ? 0 : getBrowserType().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getNetworkSettingsArn() == null) ? 0 : getNetworkSettingsArn().hashCode());
        hashCode = prime * hashCode + ((getPortalArn() == null) ? 0 : getPortalArn().hashCode());
        hashCode = prime * hashCode + ((getPortalEndpoint() == null) ? 0 : getPortalEndpoint().hashCode());
        hashCode = prime * hashCode + ((getPortalStatus() == null) ? 0 : getPortalStatus().hashCode());
        hashCode = prime * hashCode + ((getRendererType() == null) ? 0 : getRendererType().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getTrustStoreArn() == null) ? 0 : getTrustStoreArn().hashCode());
        hashCode = prime * hashCode + ((getUserAccessLoggingSettingsArn() == null) ? 0 : getUserAccessLoggingSettingsArn().hashCode());
        hashCode = prime * hashCode + ((getUserSettingsArn() == null) ? 0 : getUserSettingsArn().hashCode());
        return hashCode;
    }

    @Override
    public Portal clone() {
        try {
            return (Portal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.PortalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
