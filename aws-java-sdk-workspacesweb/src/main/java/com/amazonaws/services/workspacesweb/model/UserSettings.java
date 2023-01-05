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
 * A user settings resource that can be associated with a web portal. Once associated with a web portal, user settings
 * control how users can transfer data between a streaming session and the their local devices.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UserSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of web portal ARNs that this user settings is associated with.
     * </p>
     */
    private java.util.List<String> associatedPortalArns;
    /**
     * <p>
     * Specifies whether the user can copy text from the streaming session to the local device.
     * </p>
     */
    private String copyAllowed;
    /**
     * <p>
     * The amount of time that a streaming session remains active after users disconnect.
     * </p>
     */
    private Integer disconnectTimeoutInMinutes;
    /**
     * <p>
     * Specifies whether the user can download files from the streaming session to the local device.
     * </p>
     */
    private String downloadAllowed;
    /**
     * <p>
     * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session
     * and the disconnect timeout interval begins.
     * </p>
     */
    private Integer idleDisconnectTimeoutInMinutes;
    /**
     * <p>
     * Specifies whether the user can paste text from the local device to the streaming session.
     * </p>
     */
    private String pasteAllowed;
    /**
     * <p>
     * Specifies whether the user can print to the local device.
     * </p>
     */
    private String printAllowed;
    /**
     * <p>
     * Specifies whether the user can upload files from the local device to the streaming session.
     * </p>
     */
    private String uploadAllowed;
    /**
     * <p>
     * The ARN of the user settings.
     * </p>
     */
    private String userSettingsArn;

    /**
     * <p>
     * A list of web portal ARNs that this user settings is associated with.
     * </p>
     * 
     * @return A list of web portal ARNs that this user settings is associated with.
     */

    public java.util.List<String> getAssociatedPortalArns() {
        return associatedPortalArns;
    }

    /**
     * <p>
     * A list of web portal ARNs that this user settings is associated with.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this user settings is associated with.
     */

    public void setAssociatedPortalArns(java.util.Collection<String> associatedPortalArns) {
        if (associatedPortalArns == null) {
            this.associatedPortalArns = null;
            return;
        }

        this.associatedPortalArns = new java.util.ArrayList<String>(associatedPortalArns);
    }

    /**
     * <p>
     * A list of web portal ARNs that this user settings is associated with.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedPortalArns(java.util.Collection)} or {@link #withAssociatedPortalArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this user settings is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withAssociatedPortalArns(String... associatedPortalArns) {
        if (this.associatedPortalArns == null) {
            setAssociatedPortalArns(new java.util.ArrayList<String>(associatedPortalArns.length));
        }
        for (String ele : associatedPortalArns) {
            this.associatedPortalArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of web portal ARNs that this user settings is associated with.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this user settings is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withAssociatedPortalArns(java.util.Collection<String> associatedPortalArns) {
        setAssociatedPortalArns(associatedPortalArns);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user can copy text from the streaming session to the local device.
     * </p>
     * 
     * @param copyAllowed
     *        Specifies whether the user can copy text from the streaming session to the local device.
     * @see EnabledType
     */

    public void setCopyAllowed(String copyAllowed) {
        this.copyAllowed = copyAllowed;
    }

    /**
     * <p>
     * Specifies whether the user can copy text from the streaming session to the local device.
     * </p>
     * 
     * @return Specifies whether the user can copy text from the streaming session to the local device.
     * @see EnabledType
     */

    public String getCopyAllowed() {
        return this.copyAllowed;
    }

    /**
     * <p>
     * Specifies whether the user can copy text from the streaming session to the local device.
     * </p>
     * 
     * @param copyAllowed
     *        Specifies whether the user can copy text from the streaming session to the local device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledType
     */

    public UserSettings withCopyAllowed(String copyAllowed) {
        setCopyAllowed(copyAllowed);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user can copy text from the streaming session to the local device.
     * </p>
     * 
     * @param copyAllowed
     *        Specifies whether the user can copy text from the streaming session to the local device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledType
     */

    public UserSettings withCopyAllowed(EnabledType copyAllowed) {
        this.copyAllowed = copyAllowed.toString();
        return this;
    }

    /**
     * <p>
     * The amount of time that a streaming session remains active after users disconnect.
     * </p>
     * 
     * @param disconnectTimeoutInMinutes
     *        The amount of time that a streaming session remains active after users disconnect.
     */

    public void setDisconnectTimeoutInMinutes(Integer disconnectTimeoutInMinutes) {
        this.disconnectTimeoutInMinutes = disconnectTimeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time that a streaming session remains active after users disconnect.
     * </p>
     * 
     * @return The amount of time that a streaming session remains active after users disconnect.
     */

    public Integer getDisconnectTimeoutInMinutes() {
        return this.disconnectTimeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time that a streaming session remains active after users disconnect.
     * </p>
     * 
     * @param disconnectTimeoutInMinutes
     *        The amount of time that a streaming session remains active after users disconnect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withDisconnectTimeoutInMinutes(Integer disconnectTimeoutInMinutes) {
        setDisconnectTimeoutInMinutes(disconnectTimeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user can download files from the streaming session to the local device.
     * </p>
     * 
     * @param downloadAllowed
     *        Specifies whether the user can download files from the streaming session to the local device.
     * @see EnabledType
     */

    public void setDownloadAllowed(String downloadAllowed) {
        this.downloadAllowed = downloadAllowed;
    }

    /**
     * <p>
     * Specifies whether the user can download files from the streaming session to the local device.
     * </p>
     * 
     * @return Specifies whether the user can download files from the streaming session to the local device.
     * @see EnabledType
     */

    public String getDownloadAllowed() {
        return this.downloadAllowed;
    }

    /**
     * <p>
     * Specifies whether the user can download files from the streaming session to the local device.
     * </p>
     * 
     * @param downloadAllowed
     *        Specifies whether the user can download files from the streaming session to the local device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledType
     */

    public UserSettings withDownloadAllowed(String downloadAllowed) {
        setDownloadAllowed(downloadAllowed);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user can download files from the streaming session to the local device.
     * </p>
     * 
     * @param downloadAllowed
     *        Specifies whether the user can download files from the streaming session to the local device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledType
     */

    public UserSettings withDownloadAllowed(EnabledType downloadAllowed) {
        this.downloadAllowed = downloadAllowed.toString();
        return this;
    }

    /**
     * <p>
     * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session
     * and the disconnect timeout interval begins.
     * </p>
     * 
     * @param idleDisconnectTimeoutInMinutes
     *        The amount of time that users can be idle (inactive) before they are disconnected from their streaming
     *        session and the disconnect timeout interval begins.
     */

    public void setIdleDisconnectTimeoutInMinutes(Integer idleDisconnectTimeoutInMinutes) {
        this.idleDisconnectTimeoutInMinutes = idleDisconnectTimeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session
     * and the disconnect timeout interval begins.
     * </p>
     * 
     * @return The amount of time that users can be idle (inactive) before they are disconnected from their streaming
     *         session and the disconnect timeout interval begins.
     */

    public Integer getIdleDisconnectTimeoutInMinutes() {
        return this.idleDisconnectTimeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session
     * and the disconnect timeout interval begins.
     * </p>
     * 
     * @param idleDisconnectTimeoutInMinutes
     *        The amount of time that users can be idle (inactive) before they are disconnected from their streaming
     *        session and the disconnect timeout interval begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withIdleDisconnectTimeoutInMinutes(Integer idleDisconnectTimeoutInMinutes) {
        setIdleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user can paste text from the local device to the streaming session.
     * </p>
     * 
     * @param pasteAllowed
     *        Specifies whether the user can paste text from the local device to the streaming session.
     * @see EnabledType
     */

    public void setPasteAllowed(String pasteAllowed) {
        this.pasteAllowed = pasteAllowed;
    }

    /**
     * <p>
     * Specifies whether the user can paste text from the local device to the streaming session.
     * </p>
     * 
     * @return Specifies whether the user can paste text from the local device to the streaming session.
     * @see EnabledType
     */

    public String getPasteAllowed() {
        return this.pasteAllowed;
    }

    /**
     * <p>
     * Specifies whether the user can paste text from the local device to the streaming session.
     * </p>
     * 
     * @param pasteAllowed
     *        Specifies whether the user can paste text from the local device to the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledType
     */

    public UserSettings withPasteAllowed(String pasteAllowed) {
        setPasteAllowed(pasteAllowed);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user can paste text from the local device to the streaming session.
     * </p>
     * 
     * @param pasteAllowed
     *        Specifies whether the user can paste text from the local device to the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledType
     */

    public UserSettings withPasteAllowed(EnabledType pasteAllowed) {
        this.pasteAllowed = pasteAllowed.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the user can print to the local device.
     * </p>
     * 
     * @param printAllowed
     *        Specifies whether the user can print to the local device.
     * @see EnabledType
     */

    public void setPrintAllowed(String printAllowed) {
        this.printAllowed = printAllowed;
    }

    /**
     * <p>
     * Specifies whether the user can print to the local device.
     * </p>
     * 
     * @return Specifies whether the user can print to the local device.
     * @see EnabledType
     */

    public String getPrintAllowed() {
        return this.printAllowed;
    }

    /**
     * <p>
     * Specifies whether the user can print to the local device.
     * </p>
     * 
     * @param printAllowed
     *        Specifies whether the user can print to the local device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledType
     */

    public UserSettings withPrintAllowed(String printAllowed) {
        setPrintAllowed(printAllowed);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user can print to the local device.
     * </p>
     * 
     * @param printAllowed
     *        Specifies whether the user can print to the local device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledType
     */

    public UserSettings withPrintAllowed(EnabledType printAllowed) {
        this.printAllowed = printAllowed.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the user can upload files from the local device to the streaming session.
     * </p>
     * 
     * @param uploadAllowed
     *        Specifies whether the user can upload files from the local device to the streaming session.
     * @see EnabledType
     */

    public void setUploadAllowed(String uploadAllowed) {
        this.uploadAllowed = uploadAllowed;
    }

    /**
     * <p>
     * Specifies whether the user can upload files from the local device to the streaming session.
     * </p>
     * 
     * @return Specifies whether the user can upload files from the local device to the streaming session.
     * @see EnabledType
     */

    public String getUploadAllowed() {
        return this.uploadAllowed;
    }

    /**
     * <p>
     * Specifies whether the user can upload files from the local device to the streaming session.
     * </p>
     * 
     * @param uploadAllowed
     *        Specifies whether the user can upload files from the local device to the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledType
     */

    public UserSettings withUploadAllowed(String uploadAllowed) {
        setUploadAllowed(uploadAllowed);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user can upload files from the local device to the streaming session.
     * </p>
     * 
     * @param uploadAllowed
     *        Specifies whether the user can upload files from the local device to the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledType
     */

    public UserSettings withUploadAllowed(EnabledType uploadAllowed) {
        this.uploadAllowed = uploadAllowed.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the user settings.
     * </p>
     * 
     * @param userSettingsArn
     *        The ARN of the user settings.
     */

    public void setUserSettingsArn(String userSettingsArn) {
        this.userSettingsArn = userSettingsArn;
    }

    /**
     * <p>
     * The ARN of the user settings.
     * </p>
     * 
     * @return The ARN of the user settings.
     */

    public String getUserSettingsArn() {
        return this.userSettingsArn;
    }

    /**
     * <p>
     * The ARN of the user settings.
     * </p>
     * 
     * @param userSettingsArn
     *        The ARN of the user settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withUserSettingsArn(String userSettingsArn) {
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
        if (getAssociatedPortalArns() != null)
            sb.append("AssociatedPortalArns: ").append(getAssociatedPortalArns()).append(",");
        if (getCopyAllowed() != null)
            sb.append("CopyAllowed: ").append(getCopyAllowed()).append(",");
        if (getDisconnectTimeoutInMinutes() != null)
            sb.append("DisconnectTimeoutInMinutes: ").append(getDisconnectTimeoutInMinutes()).append(",");
        if (getDownloadAllowed() != null)
            sb.append("DownloadAllowed: ").append(getDownloadAllowed()).append(",");
        if (getIdleDisconnectTimeoutInMinutes() != null)
            sb.append("IdleDisconnectTimeoutInMinutes: ").append(getIdleDisconnectTimeoutInMinutes()).append(",");
        if (getPasteAllowed() != null)
            sb.append("PasteAllowed: ").append(getPasteAllowed()).append(",");
        if (getPrintAllowed() != null)
            sb.append("PrintAllowed: ").append(getPrintAllowed()).append(",");
        if (getUploadAllowed() != null)
            sb.append("UploadAllowed: ").append(getUploadAllowed()).append(",");
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

        if (obj instanceof UserSettings == false)
            return false;
        UserSettings other = (UserSettings) obj;
        if (other.getAssociatedPortalArns() == null ^ this.getAssociatedPortalArns() == null)
            return false;
        if (other.getAssociatedPortalArns() != null && other.getAssociatedPortalArns().equals(this.getAssociatedPortalArns()) == false)
            return false;
        if (other.getCopyAllowed() == null ^ this.getCopyAllowed() == null)
            return false;
        if (other.getCopyAllowed() != null && other.getCopyAllowed().equals(this.getCopyAllowed()) == false)
            return false;
        if (other.getDisconnectTimeoutInMinutes() == null ^ this.getDisconnectTimeoutInMinutes() == null)
            return false;
        if (other.getDisconnectTimeoutInMinutes() != null && other.getDisconnectTimeoutInMinutes().equals(this.getDisconnectTimeoutInMinutes()) == false)
            return false;
        if (other.getDownloadAllowed() == null ^ this.getDownloadAllowed() == null)
            return false;
        if (other.getDownloadAllowed() != null && other.getDownloadAllowed().equals(this.getDownloadAllowed()) == false)
            return false;
        if (other.getIdleDisconnectTimeoutInMinutes() == null ^ this.getIdleDisconnectTimeoutInMinutes() == null)
            return false;
        if (other.getIdleDisconnectTimeoutInMinutes() != null
                && other.getIdleDisconnectTimeoutInMinutes().equals(this.getIdleDisconnectTimeoutInMinutes()) == false)
            return false;
        if (other.getPasteAllowed() == null ^ this.getPasteAllowed() == null)
            return false;
        if (other.getPasteAllowed() != null && other.getPasteAllowed().equals(this.getPasteAllowed()) == false)
            return false;
        if (other.getPrintAllowed() == null ^ this.getPrintAllowed() == null)
            return false;
        if (other.getPrintAllowed() != null && other.getPrintAllowed().equals(this.getPrintAllowed()) == false)
            return false;
        if (other.getUploadAllowed() == null ^ this.getUploadAllowed() == null)
            return false;
        if (other.getUploadAllowed() != null && other.getUploadAllowed().equals(this.getUploadAllowed()) == false)
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

        hashCode = prime * hashCode + ((getAssociatedPortalArns() == null) ? 0 : getAssociatedPortalArns().hashCode());
        hashCode = prime * hashCode + ((getCopyAllowed() == null) ? 0 : getCopyAllowed().hashCode());
        hashCode = prime * hashCode + ((getDisconnectTimeoutInMinutes() == null) ? 0 : getDisconnectTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getDownloadAllowed() == null) ? 0 : getDownloadAllowed().hashCode());
        hashCode = prime * hashCode + ((getIdleDisconnectTimeoutInMinutes() == null) ? 0 : getIdleDisconnectTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getPasteAllowed() == null) ? 0 : getPasteAllowed().hashCode());
        hashCode = prime * hashCode + ((getPrintAllowed() == null) ? 0 : getPrintAllowed().hashCode());
        hashCode = prime * hashCode + ((getUploadAllowed() == null) ? 0 : getUploadAllowed().hashCode());
        hashCode = prime * hashCode + ((getUserSettingsArn() == null) ? 0 : getUserSettingsArn().hashCode());
        return hashCode;
    }

    @Override
    public UserSettings clone() {
        try {
            return (UserSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.UserSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
