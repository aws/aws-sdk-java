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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateConnector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate authority being used.
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * Idempotency token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The identifier of the Active Directory.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * Metadata assigned to a connector consisting of a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Security group IDs that describe the inbound and outbound rules.
     * </p>
     */
    private VpcInformation vpcInformation;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate authority being used.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the certificate authority being used.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate authority being used.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate authority being used.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate authority being used.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the certificate authority being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * Idempotency token.
     * </p>
     * 
     * @param clientToken
     *        Idempotency token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Idempotency token.
     * </p>
     * 
     * @return Idempotency token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Idempotency token.
     * </p>
     * 
     * @param clientToken
     *        Idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the Active Directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the Active Directory.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the Active Directory.
     * </p>
     * 
     * @return The identifier of the Active Directory.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the Active Directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the Active Directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * Metadata assigned to a connector consisting of a key-value pair.
     * </p>
     * 
     * @return Metadata assigned to a connector consisting of a key-value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata assigned to a connector consisting of a key-value pair.
     * </p>
     * 
     * @param tags
     *        Metadata assigned to a connector consisting of a key-value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata assigned to a connector consisting of a key-value pair.
     * </p>
     * 
     * @param tags
     *        Metadata assigned to a connector consisting of a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateConnectorRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Security group IDs that describe the inbound and outbound rules.
     * </p>
     * 
     * @param vpcInformation
     *        Security group IDs that describe the inbound and outbound rules.
     */

    public void setVpcInformation(VpcInformation vpcInformation) {
        this.vpcInformation = vpcInformation;
    }

    /**
     * <p>
     * Security group IDs that describe the inbound and outbound rules.
     * </p>
     * 
     * @return Security group IDs that describe the inbound and outbound rules.
     */

    public VpcInformation getVpcInformation() {
        return this.vpcInformation;
    }

    /**
     * <p>
     * Security group IDs that describe the inbound and outbound rules.
     * </p>
     * 
     * @param vpcInformation
     *        Security group IDs that describe the inbound and outbound rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withVpcInformation(VpcInformation vpcInformation) {
        setVpcInformation(vpcInformation);
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
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcInformation() != null)
            sb.append("VpcInformation: ").append(getVpcInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectorRequest == false)
            return false;
        CreateConnectorRequest other = (CreateConnectorRequest) obj;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcInformation() == null ^ this.getVpcInformation() == null)
            return false;
        if (other.getVpcInformation() != null && other.getVpcInformation().equals(this.getVpcInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcInformation() == null) ? 0 : getVpcInformation().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectorRequest clone() {
        return (CreateConnectorRequest) super.clone();
    }

}
