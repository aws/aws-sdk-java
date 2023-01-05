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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the details for a connector object. The connector object is used for AS2 outbound processes, to connect the
 * Transfer Family customer with the trading partner.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/As2ConnectorConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class As2ConnectorConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the AS2 local profile.
     * </p>
     */
    private String localProfileId;
    /**
     * <p>
     * A unique identifier for the partner profile for the connector.
     * </p>
     */
    private String partnerProfileId;
    /**
     * <p>
     * Used as the <code>Subject</code> HTTP header attribute in AS2 messages that are being sent with the connector.
     * </p>
     */
    private String messageSubject;
    /**
     * <p>
     * Specifies whether the AS2 file is compressed.
     * </p>
     */
    private String compression;
    /**
     * <p>
     * The algorithm that is used to encrypt the file.
     * </p>
     */
    private String encryptionAlgorithm;
    /**
     * <p>
     * The algorithm that is used to sign the AS2 messages sent with the connector.
     * </p>
     */
    private String signingAlgorithm;
    /**
     * <p>
     * The signing algorithm for the MDN response.
     * </p>
     * <note>
     * <p>
     * If set to DEFAULT (or not set at all), the value for <code>SigningAlogorithm</code> is used.
     * </p>
     * </note>
     */
    private String mdnSigningAlgorithm;
    /**
     * <p>
     * Used for outbound requests (from an Transfer Family server to a partner AS2 server) to determine whether the
     * partner response for transfers is synchronous or asynchronous. Specify either of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYNC</code>: The system expects a synchronous MDN response, confirming that the file was transferred
     * successfully (or not).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Specifies that no MDN response is required.
     * </p>
     * </li>
     * </ul>
     */
    private String mdnResponse;

    /**
     * <p>
     * A unique identifier for the AS2 local profile.
     * </p>
     * 
     * @param localProfileId
     *        A unique identifier for the AS2 local profile.
     */

    public void setLocalProfileId(String localProfileId) {
        this.localProfileId = localProfileId;
    }

    /**
     * <p>
     * A unique identifier for the AS2 local profile.
     * </p>
     * 
     * @return A unique identifier for the AS2 local profile.
     */

    public String getLocalProfileId() {
        return this.localProfileId;
    }

    /**
     * <p>
     * A unique identifier for the AS2 local profile.
     * </p>
     * 
     * @param localProfileId
     *        A unique identifier for the AS2 local profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public As2ConnectorConfig withLocalProfileId(String localProfileId) {
        setLocalProfileId(localProfileId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the partner profile for the connector.
     * </p>
     * 
     * @param partnerProfileId
     *        A unique identifier for the partner profile for the connector.
     */

    public void setPartnerProfileId(String partnerProfileId) {
        this.partnerProfileId = partnerProfileId;
    }

    /**
     * <p>
     * A unique identifier for the partner profile for the connector.
     * </p>
     * 
     * @return A unique identifier for the partner profile for the connector.
     */

    public String getPartnerProfileId() {
        return this.partnerProfileId;
    }

    /**
     * <p>
     * A unique identifier for the partner profile for the connector.
     * </p>
     * 
     * @param partnerProfileId
     *        A unique identifier for the partner profile for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public As2ConnectorConfig withPartnerProfileId(String partnerProfileId) {
        setPartnerProfileId(partnerProfileId);
        return this;
    }

    /**
     * <p>
     * Used as the <code>Subject</code> HTTP header attribute in AS2 messages that are being sent with the connector.
     * </p>
     * 
     * @param messageSubject
     *        Used as the <code>Subject</code> HTTP header attribute in AS2 messages that are being sent with the
     *        connector.
     */

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    /**
     * <p>
     * Used as the <code>Subject</code> HTTP header attribute in AS2 messages that are being sent with the connector.
     * </p>
     * 
     * @return Used as the <code>Subject</code> HTTP header attribute in AS2 messages that are being sent with the
     *         connector.
     */

    public String getMessageSubject() {
        return this.messageSubject;
    }

    /**
     * <p>
     * Used as the <code>Subject</code> HTTP header attribute in AS2 messages that are being sent with the connector.
     * </p>
     * 
     * @param messageSubject
     *        Used as the <code>Subject</code> HTTP header attribute in AS2 messages that are being sent with the
     *        connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public As2ConnectorConfig withMessageSubject(String messageSubject) {
        setMessageSubject(messageSubject);
        return this;
    }

    /**
     * <p>
     * Specifies whether the AS2 file is compressed.
     * </p>
     * 
     * @param compression
     *        Specifies whether the AS2 file is compressed.
     * @see CompressionEnum
     */

    public void setCompression(String compression) {
        this.compression = compression;
    }

    /**
     * <p>
     * Specifies whether the AS2 file is compressed.
     * </p>
     * 
     * @return Specifies whether the AS2 file is compressed.
     * @see CompressionEnum
     */

    public String getCompression() {
        return this.compression;
    }

    /**
     * <p>
     * Specifies whether the AS2 file is compressed.
     * </p>
     * 
     * @param compression
     *        Specifies whether the AS2 file is compressed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionEnum
     */

    public As2ConnectorConfig withCompression(String compression) {
        setCompression(compression);
        return this;
    }

    /**
     * <p>
     * Specifies whether the AS2 file is compressed.
     * </p>
     * 
     * @param compression
     *        Specifies whether the AS2 file is compressed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionEnum
     */

    public As2ConnectorConfig withCompression(CompressionEnum compression) {
        this.compression = compression.toString();
        return this;
    }

    /**
     * <p>
     * The algorithm that is used to encrypt the file.
     * </p>
     * 
     * @param encryptionAlgorithm
     *        The algorithm that is used to encrypt the file.
     * @see EncryptionAlg
     */

    public void setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    /**
     * <p>
     * The algorithm that is used to encrypt the file.
     * </p>
     * 
     * @return The algorithm that is used to encrypt the file.
     * @see EncryptionAlg
     */

    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * <p>
     * The algorithm that is used to encrypt the file.
     * </p>
     * 
     * @param encryptionAlgorithm
     *        The algorithm that is used to encrypt the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlg
     */

    public As2ConnectorConfig withEncryptionAlgorithm(String encryptionAlgorithm) {
        setEncryptionAlgorithm(encryptionAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm that is used to encrypt the file.
     * </p>
     * 
     * @param encryptionAlgorithm
     *        The algorithm that is used to encrypt the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlg
     */

    public As2ConnectorConfig withEncryptionAlgorithm(EncryptionAlg encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The algorithm that is used to sign the AS2 messages sent with the connector.
     * </p>
     * 
     * @param signingAlgorithm
     *        The algorithm that is used to sign the AS2 messages sent with the connector.
     * @see SigningAlg
     */

    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    /**
     * <p>
     * The algorithm that is used to sign the AS2 messages sent with the connector.
     * </p>
     * 
     * @return The algorithm that is used to sign the AS2 messages sent with the connector.
     * @see SigningAlg
     */

    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * <p>
     * The algorithm that is used to sign the AS2 messages sent with the connector.
     * </p>
     * 
     * @param signingAlgorithm
     *        The algorithm that is used to sign the AS2 messages sent with the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlg
     */

    public As2ConnectorConfig withSigningAlgorithm(String signingAlgorithm) {
        setSigningAlgorithm(signingAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm that is used to sign the AS2 messages sent with the connector.
     * </p>
     * 
     * @param signingAlgorithm
     *        The algorithm that is used to sign the AS2 messages sent with the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlg
     */

    public As2ConnectorConfig withSigningAlgorithm(SigningAlg signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The signing algorithm for the MDN response.
     * </p>
     * <note>
     * <p>
     * If set to DEFAULT (or not set at all), the value for <code>SigningAlogorithm</code> is used.
     * </p>
     * </note>
     * 
     * @param mdnSigningAlgorithm
     *        The signing algorithm for the MDN response.</p> <note>
     *        <p>
     *        If set to DEFAULT (or not set at all), the value for <code>SigningAlogorithm</code> is used.
     *        </p>
     * @see MdnSigningAlg
     */

    public void setMdnSigningAlgorithm(String mdnSigningAlgorithm) {
        this.mdnSigningAlgorithm = mdnSigningAlgorithm;
    }

    /**
     * <p>
     * The signing algorithm for the MDN response.
     * </p>
     * <note>
     * <p>
     * If set to DEFAULT (or not set at all), the value for <code>SigningAlogorithm</code> is used.
     * </p>
     * </note>
     * 
     * @return The signing algorithm for the MDN response.</p> <note>
     *         <p>
     *         If set to DEFAULT (or not set at all), the value for <code>SigningAlogorithm</code> is used.
     *         </p>
     * @see MdnSigningAlg
     */

    public String getMdnSigningAlgorithm() {
        return this.mdnSigningAlgorithm;
    }

    /**
     * <p>
     * The signing algorithm for the MDN response.
     * </p>
     * <note>
     * <p>
     * If set to DEFAULT (or not set at all), the value for <code>SigningAlogorithm</code> is used.
     * </p>
     * </note>
     * 
     * @param mdnSigningAlgorithm
     *        The signing algorithm for the MDN response.</p> <note>
     *        <p>
     *        If set to DEFAULT (or not set at all), the value for <code>SigningAlogorithm</code> is used.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MdnSigningAlg
     */

    public As2ConnectorConfig withMdnSigningAlgorithm(String mdnSigningAlgorithm) {
        setMdnSigningAlgorithm(mdnSigningAlgorithm);
        return this;
    }

    /**
     * <p>
     * The signing algorithm for the MDN response.
     * </p>
     * <note>
     * <p>
     * If set to DEFAULT (or not set at all), the value for <code>SigningAlogorithm</code> is used.
     * </p>
     * </note>
     * 
     * @param mdnSigningAlgorithm
     *        The signing algorithm for the MDN response.</p> <note>
     *        <p>
     *        If set to DEFAULT (or not set at all), the value for <code>SigningAlogorithm</code> is used.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MdnSigningAlg
     */

    public As2ConnectorConfig withMdnSigningAlgorithm(MdnSigningAlg mdnSigningAlgorithm) {
        this.mdnSigningAlgorithm = mdnSigningAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * Used for outbound requests (from an Transfer Family server to a partner AS2 server) to determine whether the
     * partner response for transfers is synchronous or asynchronous. Specify either of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYNC</code>: The system expects a synchronous MDN response, confirming that the file was transferred
     * successfully (or not).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Specifies that no MDN response is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mdnResponse
     *        Used for outbound requests (from an Transfer Family server to a partner AS2 server) to determine whether
     *        the partner response for transfers is synchronous or asynchronous. Specify either of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SYNC</code>: The system expects a synchronous MDN response, confirming that the file was transferred
     *        successfully (or not).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Specifies that no MDN response is required.
     *        </p>
     *        </li>
     * @see MdnResponse
     */

    public void setMdnResponse(String mdnResponse) {
        this.mdnResponse = mdnResponse;
    }

    /**
     * <p>
     * Used for outbound requests (from an Transfer Family server to a partner AS2 server) to determine whether the
     * partner response for transfers is synchronous or asynchronous. Specify either of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYNC</code>: The system expects a synchronous MDN response, confirming that the file was transferred
     * successfully (or not).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Specifies that no MDN response is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Used for outbound requests (from an Transfer Family server to a partner AS2 server) to determine whether
     *         the partner response for transfers is synchronous or asynchronous. Specify either of the following
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SYNC</code>: The system expects a synchronous MDN response, confirming that the file was
     *         transferred successfully (or not).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code>: Specifies that no MDN response is required.
     *         </p>
     *         </li>
     * @see MdnResponse
     */

    public String getMdnResponse() {
        return this.mdnResponse;
    }

    /**
     * <p>
     * Used for outbound requests (from an Transfer Family server to a partner AS2 server) to determine whether the
     * partner response for transfers is synchronous or asynchronous. Specify either of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYNC</code>: The system expects a synchronous MDN response, confirming that the file was transferred
     * successfully (or not).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Specifies that no MDN response is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mdnResponse
     *        Used for outbound requests (from an Transfer Family server to a partner AS2 server) to determine whether
     *        the partner response for transfers is synchronous or asynchronous. Specify either of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SYNC</code>: The system expects a synchronous MDN response, confirming that the file was transferred
     *        successfully (or not).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Specifies that no MDN response is required.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MdnResponse
     */

    public As2ConnectorConfig withMdnResponse(String mdnResponse) {
        setMdnResponse(mdnResponse);
        return this;
    }

    /**
     * <p>
     * Used for outbound requests (from an Transfer Family server to a partner AS2 server) to determine whether the
     * partner response for transfers is synchronous or asynchronous. Specify either of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYNC</code>: The system expects a synchronous MDN response, confirming that the file was transferred
     * successfully (or not).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Specifies that no MDN response is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mdnResponse
     *        Used for outbound requests (from an Transfer Family server to a partner AS2 server) to determine whether
     *        the partner response for transfers is synchronous or asynchronous. Specify either of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SYNC</code>: The system expects a synchronous MDN response, confirming that the file was transferred
     *        successfully (or not).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Specifies that no MDN response is required.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MdnResponse
     */

    public As2ConnectorConfig withMdnResponse(MdnResponse mdnResponse) {
        this.mdnResponse = mdnResponse.toString();
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
        if (getLocalProfileId() != null)
            sb.append("LocalProfileId: ").append(getLocalProfileId()).append(",");
        if (getPartnerProfileId() != null)
            sb.append("PartnerProfileId: ").append(getPartnerProfileId()).append(",");
        if (getMessageSubject() != null)
            sb.append("MessageSubject: ").append(getMessageSubject()).append(",");
        if (getCompression() != null)
            sb.append("Compression: ").append(getCompression()).append(",");
        if (getEncryptionAlgorithm() != null)
            sb.append("EncryptionAlgorithm: ").append(getEncryptionAlgorithm()).append(",");
        if (getSigningAlgorithm() != null)
            sb.append("SigningAlgorithm: ").append(getSigningAlgorithm()).append(",");
        if (getMdnSigningAlgorithm() != null)
            sb.append("MdnSigningAlgorithm: ").append(getMdnSigningAlgorithm()).append(",");
        if (getMdnResponse() != null)
            sb.append("MdnResponse: ").append(getMdnResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof As2ConnectorConfig == false)
            return false;
        As2ConnectorConfig other = (As2ConnectorConfig) obj;
        if (other.getLocalProfileId() == null ^ this.getLocalProfileId() == null)
            return false;
        if (other.getLocalProfileId() != null && other.getLocalProfileId().equals(this.getLocalProfileId()) == false)
            return false;
        if (other.getPartnerProfileId() == null ^ this.getPartnerProfileId() == null)
            return false;
        if (other.getPartnerProfileId() != null && other.getPartnerProfileId().equals(this.getPartnerProfileId()) == false)
            return false;
        if (other.getMessageSubject() == null ^ this.getMessageSubject() == null)
            return false;
        if (other.getMessageSubject() != null && other.getMessageSubject().equals(this.getMessageSubject()) == false)
            return false;
        if (other.getCompression() == null ^ this.getCompression() == null)
            return false;
        if (other.getCompression() != null && other.getCompression().equals(this.getCompression()) == false)
            return false;
        if (other.getEncryptionAlgorithm() == null ^ this.getEncryptionAlgorithm() == null)
            return false;
        if (other.getEncryptionAlgorithm() != null && other.getEncryptionAlgorithm().equals(this.getEncryptionAlgorithm()) == false)
            return false;
        if (other.getSigningAlgorithm() == null ^ this.getSigningAlgorithm() == null)
            return false;
        if (other.getSigningAlgorithm() != null && other.getSigningAlgorithm().equals(this.getSigningAlgorithm()) == false)
            return false;
        if (other.getMdnSigningAlgorithm() == null ^ this.getMdnSigningAlgorithm() == null)
            return false;
        if (other.getMdnSigningAlgorithm() != null && other.getMdnSigningAlgorithm().equals(this.getMdnSigningAlgorithm()) == false)
            return false;
        if (other.getMdnResponse() == null ^ this.getMdnResponse() == null)
            return false;
        if (other.getMdnResponse() != null && other.getMdnResponse().equals(this.getMdnResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalProfileId() == null) ? 0 : getLocalProfileId().hashCode());
        hashCode = prime * hashCode + ((getPartnerProfileId() == null) ? 0 : getPartnerProfileId().hashCode());
        hashCode = prime * hashCode + ((getMessageSubject() == null) ? 0 : getMessageSubject().hashCode());
        hashCode = prime * hashCode + ((getCompression() == null) ? 0 : getCompression().hashCode());
        hashCode = prime * hashCode + ((getEncryptionAlgorithm() == null) ? 0 : getEncryptionAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getSigningAlgorithm() == null) ? 0 : getSigningAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getMdnSigningAlgorithm() == null) ? 0 : getMdnSigningAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getMdnResponse() == null) ? 0 : getMdnResponse().hashCode());
        return hashCode;
    }

    @Override
    public As2ConnectorConfig clone() {
        try {
            return (As2ConnectorConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.As2ConnectorConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
