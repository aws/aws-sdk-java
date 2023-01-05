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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateAgreement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAgreementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * </p>
     */
    private String agreementId;
    /**
     * <p>
     * A system-assigned unique identifier for a server instance. This is the specific server that the agreement uses.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * To replace the existing description, provide a short description for the agreement.
     * </p>
     */
    private String description;
    /**
     * <p>
     * You can update the status for the agreement, either activating an inactive agreement or the reverse.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A unique identifier for the AS2 local profile.
     * </p>
     * <p>
     * To change the local profile identifier, provide a new value here.
     * </p>
     */
    private String localProfileId;
    /**
     * <p>
     * A unique identifier for the partner profile. To change the partner profile identifier, provide a new value here.
     * </p>
     */
    private String partnerProfileId;
    /**
     * <p>
     * To change the landing directory (folder) for files that are transferred, provide the bucket folder that you want
     * to use; for example, <code>/<i>DOC-EXAMPLE-BUCKET</i>/<i>home</i>/<i>mydirectory</i> </code>.
     * </p>
     */
    private String baseDirectory;
    /**
     * <p>
     * With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in the
     * request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     * <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a
     * final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code> needs to
     * provide read and write access to the parent directory of the file location used in the
     * <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the parent
     * directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * </p>
     */
    private String accessRole;

    /**
     * <p>
     * A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * </p>
     * 
     * @param agreementId
     *        A unique identifier for the agreement. This identifier is returned when you create an agreement.
     */

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    /**
     * <p>
     * A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * </p>
     * 
     * @return A unique identifier for the agreement. This identifier is returned when you create an agreement.
     */

    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     * <p>
     * A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * </p>
     * 
     * @param agreementId
     *        A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgreementRequest withAgreementId(String agreementId) {
        setAgreementId(agreementId);
        return this;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server instance. This is the specific server that the agreement uses.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for a server instance. This is the specific server that the agreement
     *        uses.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server instance. This is the specific server that the agreement uses.
     * </p>
     * 
     * @return A system-assigned unique identifier for a server instance. This is the specific server that the agreement
     *         uses.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server instance. This is the specific server that the agreement uses.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for a server instance. This is the specific server that the agreement
     *        uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgreementRequest withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * To replace the existing description, provide a short description for the agreement.
     * </p>
     * 
     * @param description
     *        To replace the existing description, provide a short description for the agreement.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * To replace the existing description, provide a short description for the agreement.
     * </p>
     * 
     * @return To replace the existing description, provide a short description for the agreement.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * To replace the existing description, provide a short description for the agreement.
     * </p>
     * 
     * @param description
     *        To replace the existing description, provide a short description for the agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgreementRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * You can update the status for the agreement, either activating an inactive agreement or the reverse.
     * </p>
     * 
     * @param status
     *        You can update the status for the agreement, either activating an inactive agreement or the reverse.
     * @see AgreementStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * You can update the status for the agreement, either activating an inactive agreement or the reverse.
     * </p>
     * 
     * @return You can update the status for the agreement, either activating an inactive agreement or the reverse.
     * @see AgreementStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * You can update the status for the agreement, either activating an inactive agreement or the reverse.
     * </p>
     * 
     * @param status
     *        You can update the status for the agreement, either activating an inactive agreement or the reverse.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgreementStatusType
     */

    public UpdateAgreementRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * You can update the status for the agreement, either activating an inactive agreement or the reverse.
     * </p>
     * 
     * @param status
     *        You can update the status for the agreement, either activating an inactive agreement or the reverse.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgreementStatusType
     */

    public UpdateAgreementRequest withStatus(AgreementStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for the AS2 local profile.
     * </p>
     * <p>
     * To change the local profile identifier, provide a new value here.
     * </p>
     * 
     * @param localProfileId
     *        A unique identifier for the AS2 local profile.</p>
     *        <p>
     *        To change the local profile identifier, provide a new value here.
     */

    public void setLocalProfileId(String localProfileId) {
        this.localProfileId = localProfileId;
    }

    /**
     * <p>
     * A unique identifier for the AS2 local profile.
     * </p>
     * <p>
     * To change the local profile identifier, provide a new value here.
     * </p>
     * 
     * @return A unique identifier for the AS2 local profile.</p>
     *         <p>
     *         To change the local profile identifier, provide a new value here.
     */

    public String getLocalProfileId() {
        return this.localProfileId;
    }

    /**
     * <p>
     * A unique identifier for the AS2 local profile.
     * </p>
     * <p>
     * To change the local profile identifier, provide a new value here.
     * </p>
     * 
     * @param localProfileId
     *        A unique identifier for the AS2 local profile.</p>
     *        <p>
     *        To change the local profile identifier, provide a new value here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgreementRequest withLocalProfileId(String localProfileId) {
        setLocalProfileId(localProfileId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the partner profile. To change the partner profile identifier, provide a new value here.
     * </p>
     * 
     * @param partnerProfileId
     *        A unique identifier for the partner profile. To change the partner profile identifier, provide a new value
     *        here.
     */

    public void setPartnerProfileId(String partnerProfileId) {
        this.partnerProfileId = partnerProfileId;
    }

    /**
     * <p>
     * A unique identifier for the partner profile. To change the partner profile identifier, provide a new value here.
     * </p>
     * 
     * @return A unique identifier for the partner profile. To change the partner profile identifier, provide a new
     *         value here.
     */

    public String getPartnerProfileId() {
        return this.partnerProfileId;
    }

    /**
     * <p>
     * A unique identifier for the partner profile. To change the partner profile identifier, provide a new value here.
     * </p>
     * 
     * @param partnerProfileId
     *        A unique identifier for the partner profile. To change the partner profile identifier, provide a new value
     *        here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgreementRequest withPartnerProfileId(String partnerProfileId) {
        setPartnerProfileId(partnerProfileId);
        return this;
    }

    /**
     * <p>
     * To change the landing directory (folder) for files that are transferred, provide the bucket folder that you want
     * to use; for example, <code>/<i>DOC-EXAMPLE-BUCKET</i>/<i>home</i>/<i>mydirectory</i> </code>.
     * </p>
     * 
     * @param baseDirectory
     *        To change the landing directory (folder) for files that are transferred, provide the bucket folder that
     *        you want to use; for example, <code>/<i>DOC-EXAMPLE-BUCKET</i>/<i>home</i>/<i>mydirectory</i> </code>.
     */

    public void setBaseDirectory(String baseDirectory) {
        this.baseDirectory = baseDirectory;
    }

    /**
     * <p>
     * To change the landing directory (folder) for files that are transferred, provide the bucket folder that you want
     * to use; for example, <code>/<i>DOC-EXAMPLE-BUCKET</i>/<i>home</i>/<i>mydirectory</i> </code>.
     * </p>
     * 
     * @return To change the landing directory (folder) for files that are transferred, provide the bucket folder that
     *         you want to use; for example, <code>/<i>DOC-EXAMPLE-BUCKET</i>/<i>home</i>/<i>mydirectory</i> </code>.
     */

    public String getBaseDirectory() {
        return this.baseDirectory;
    }

    /**
     * <p>
     * To change the landing directory (folder) for files that are transferred, provide the bucket folder that you want
     * to use; for example, <code>/<i>DOC-EXAMPLE-BUCKET</i>/<i>home</i>/<i>mydirectory</i> </code>.
     * </p>
     * 
     * @param baseDirectory
     *        To change the landing directory (folder) for files that are transferred, provide the bucket folder that
     *        you want to use; for example, <code>/<i>DOC-EXAMPLE-BUCKET</i>/<i>home</i>/<i>mydirectory</i> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgreementRequest withBaseDirectory(String baseDirectory) {
        setBaseDirectory(baseDirectory);
        return this;
    }

    /**
     * <p>
     * With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in the
     * request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     * <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a
     * final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code> needs to
     * provide read and write access to the parent directory of the file location used in the
     * <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the parent
     * directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * </p>
     * 
     * @param accessRole
     *        With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in
     *        the request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     *        <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     *        temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and
     *        write a final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code>
     *        needs to provide read and write access to the parent directory of the file location used in the
     *        <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the
     *        parent directory of the files that you intend to send with <code>StartFileTransfer</code>.
     */

    public void setAccessRole(String accessRole) {
        this.accessRole = accessRole;
    }

    /**
     * <p>
     * With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in the
     * request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     * <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a
     * final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code> needs to
     * provide read and write access to the parent directory of the file location used in the
     * <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the parent
     * directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * </p>
     * 
     * @return With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in
     *         the request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     *         <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     *         temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and
     *         write a final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code>
     *         needs to provide read and write access to the parent directory of the file location used in the
     *         <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the
     *         parent directory of the files that you intend to send with <code>StartFileTransfer</code>.
     */

    public String getAccessRole() {
        return this.accessRole;
    }

    /**
     * <p>
     * With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in the
     * request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     * <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a
     * final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code> needs to
     * provide read and write access to the parent directory of the file location used in the
     * <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the parent
     * directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * </p>
     * 
     * @param accessRole
     *        With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in
     *        the request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     *        <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     *        temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and
     *        write a final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code>
     *        needs to provide read and write access to the parent directory of the file location used in the
     *        <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the
     *        parent directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgreementRequest withAccessRole(String accessRole) {
        setAccessRole(accessRole);
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
        if (getAgreementId() != null)
            sb.append("AgreementId: ").append(getAgreementId()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLocalProfileId() != null)
            sb.append("LocalProfileId: ").append(getLocalProfileId()).append(",");
        if (getPartnerProfileId() != null)
            sb.append("PartnerProfileId: ").append(getPartnerProfileId()).append(",");
        if (getBaseDirectory() != null)
            sb.append("BaseDirectory: ").append(getBaseDirectory()).append(",");
        if (getAccessRole() != null)
            sb.append("AccessRole: ").append(getAccessRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAgreementRequest == false)
            return false;
        UpdateAgreementRequest other = (UpdateAgreementRequest) obj;
        if (other.getAgreementId() == null ^ this.getAgreementId() == null)
            return false;
        if (other.getAgreementId() != null && other.getAgreementId().equals(this.getAgreementId()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLocalProfileId() == null ^ this.getLocalProfileId() == null)
            return false;
        if (other.getLocalProfileId() != null && other.getLocalProfileId().equals(this.getLocalProfileId()) == false)
            return false;
        if (other.getPartnerProfileId() == null ^ this.getPartnerProfileId() == null)
            return false;
        if (other.getPartnerProfileId() != null && other.getPartnerProfileId().equals(this.getPartnerProfileId()) == false)
            return false;
        if (other.getBaseDirectory() == null ^ this.getBaseDirectory() == null)
            return false;
        if (other.getBaseDirectory() != null && other.getBaseDirectory().equals(this.getBaseDirectory()) == false)
            return false;
        if (other.getAccessRole() == null ^ this.getAccessRole() == null)
            return false;
        if (other.getAccessRole() != null && other.getAccessRole().equals(this.getAccessRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgreementId() == null) ? 0 : getAgreementId().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLocalProfileId() == null) ? 0 : getLocalProfileId().hashCode());
        hashCode = prime * hashCode + ((getPartnerProfileId() == null) ? 0 : getPartnerProfileId().hashCode());
        hashCode = prime * hashCode + ((getBaseDirectory() == null) ? 0 : getBaseDirectory().hashCode());
        hashCode = prime * hashCode + ((getAccessRole() == null) ? 0 : getAccessRole().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAgreementRequest clone() {
        return (UpdateAgreementRequest) super.clone();
    }

}
