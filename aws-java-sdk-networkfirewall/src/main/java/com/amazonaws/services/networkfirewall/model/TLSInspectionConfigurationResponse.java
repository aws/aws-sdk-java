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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The high-level properties of a TLS inspection configuration. This, along with the
 * <code>TLSInspectionConfiguration</code>, define the TLS inspection configuration. You can retrieve all objects for a
 * TLS inspection configuration by calling <code>DescribeTLSInspectionConfiguration</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/TLSInspectionConfigurationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TLSInspectionConfigurationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * </p>
     */
    private String tLSInspectionConfigurationArn;
    /**
     * <p>
     * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     * configuration after you create it.
     * </p>
     */
    private String tLSInspectionConfigurationName;
    /**
     * <p>
     * A unique identifier for the TLS inspection configuration. This ID is returned in the responses to create and list
     * commands. You provide it to operations such as update and delete.
     * </p>
     */
    private String tLSInspectionConfigurationId;
    /**
     * <p>
     * Detailed information about the current status of a <a>TLSInspectionConfiguration</a>. You can retrieve this for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a> and providing the TLS
     * inspection configuration name and ARN.
     * </p>
     */
    private String tLSInspectionConfigurationStatus;
    /**
     * <p>
     * A description of the TLS inspection configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The last time that the TLS inspection configuration was changed.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The number of firewall policies that use this TLS inspection configuration.
     * </p>
     */
    private Integer numberOfAssociations;
    /**
     * <p>
     * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     * inspection configuration.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * A list of the certificates associated with the TLS inspection configuration.
     * </p>
     */
    private java.util.List<TlsCertificateData> certificates;

    private TlsCertificateData certificateAuthority;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * </p>
     * 
     * @param tLSInspectionConfigurationArn
     *        The Amazon Resource Name (ARN) of the TLS inspection configuration.
     */

    public void setTLSInspectionConfigurationArn(String tLSInspectionConfigurationArn) {
        this.tLSInspectionConfigurationArn = tLSInspectionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the TLS inspection configuration.
     */

    public String getTLSInspectionConfigurationArn() {
        return this.tLSInspectionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * </p>
     * 
     * @param tLSInspectionConfigurationArn
     *        The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfigurationResponse withTLSInspectionConfigurationArn(String tLSInspectionConfigurationArn) {
        setTLSInspectionConfigurationArn(tLSInspectionConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     * configuration after you create it.
     * </p>
     * 
     * @param tLSInspectionConfigurationName
     *        The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     *        configuration after you create it.
     */

    public void setTLSInspectionConfigurationName(String tLSInspectionConfigurationName) {
        this.tLSInspectionConfigurationName = tLSInspectionConfigurationName;
    }

    /**
     * <p>
     * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     * configuration after you create it.
     * </p>
     * 
     * @return The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     *         configuration after you create it.
     */

    public String getTLSInspectionConfigurationName() {
        return this.tLSInspectionConfigurationName;
    }

    /**
     * <p>
     * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     * configuration after you create it.
     * </p>
     * 
     * @param tLSInspectionConfigurationName
     *        The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     *        configuration after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfigurationResponse withTLSInspectionConfigurationName(String tLSInspectionConfigurationName) {
        setTLSInspectionConfigurationName(tLSInspectionConfigurationName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the TLS inspection configuration. This ID is returned in the responses to create and list
     * commands. You provide it to operations such as update and delete.
     * </p>
     * 
     * @param tLSInspectionConfigurationId
     *        A unique identifier for the TLS inspection configuration. This ID is returned in the responses to create
     *        and list commands. You provide it to operations such as update and delete.
     */

    public void setTLSInspectionConfigurationId(String tLSInspectionConfigurationId) {
        this.tLSInspectionConfigurationId = tLSInspectionConfigurationId;
    }

    /**
     * <p>
     * A unique identifier for the TLS inspection configuration. This ID is returned in the responses to create and list
     * commands. You provide it to operations such as update and delete.
     * </p>
     * 
     * @return A unique identifier for the TLS inspection configuration. This ID is returned in the responses to create
     *         and list commands. You provide it to operations such as update and delete.
     */

    public String getTLSInspectionConfigurationId() {
        return this.tLSInspectionConfigurationId;
    }

    /**
     * <p>
     * A unique identifier for the TLS inspection configuration. This ID is returned in the responses to create and list
     * commands. You provide it to operations such as update and delete.
     * </p>
     * 
     * @param tLSInspectionConfigurationId
     *        A unique identifier for the TLS inspection configuration. This ID is returned in the responses to create
     *        and list commands. You provide it to operations such as update and delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfigurationResponse withTLSInspectionConfigurationId(String tLSInspectionConfigurationId) {
        setTLSInspectionConfigurationId(tLSInspectionConfigurationId);
        return this;
    }

    /**
     * <p>
     * Detailed information about the current status of a <a>TLSInspectionConfiguration</a>. You can retrieve this for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a> and providing the TLS
     * inspection configuration name and ARN.
     * </p>
     * 
     * @param tLSInspectionConfigurationStatus
     *        Detailed information about the current status of a <a>TLSInspectionConfiguration</a>. You can retrieve
     *        this for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a> and providing
     *        the TLS inspection configuration name and ARN.
     * @see ResourceStatus
     */

    public void setTLSInspectionConfigurationStatus(String tLSInspectionConfigurationStatus) {
        this.tLSInspectionConfigurationStatus = tLSInspectionConfigurationStatus;
    }

    /**
     * <p>
     * Detailed information about the current status of a <a>TLSInspectionConfiguration</a>. You can retrieve this for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a> and providing the TLS
     * inspection configuration name and ARN.
     * </p>
     * 
     * @return Detailed information about the current status of a <a>TLSInspectionConfiguration</a>. You can retrieve
     *         this for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a> and
     *         providing the TLS inspection configuration name and ARN.
     * @see ResourceStatus
     */

    public String getTLSInspectionConfigurationStatus() {
        return this.tLSInspectionConfigurationStatus;
    }

    /**
     * <p>
     * Detailed information about the current status of a <a>TLSInspectionConfiguration</a>. You can retrieve this for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a> and providing the TLS
     * inspection configuration name and ARN.
     * </p>
     * 
     * @param tLSInspectionConfigurationStatus
     *        Detailed information about the current status of a <a>TLSInspectionConfiguration</a>. You can retrieve
     *        this for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a> and providing
     *        the TLS inspection configuration name and ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public TLSInspectionConfigurationResponse withTLSInspectionConfigurationStatus(String tLSInspectionConfigurationStatus) {
        setTLSInspectionConfigurationStatus(tLSInspectionConfigurationStatus);
        return this;
    }

    /**
     * <p>
     * Detailed information about the current status of a <a>TLSInspectionConfiguration</a>. You can retrieve this for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a> and providing the TLS
     * inspection configuration name and ARN.
     * </p>
     * 
     * @param tLSInspectionConfigurationStatus
     *        Detailed information about the current status of a <a>TLSInspectionConfiguration</a>. You can retrieve
     *        this for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a> and providing
     *        the TLS inspection configuration name and ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public TLSInspectionConfigurationResponse withTLSInspectionConfigurationStatus(ResourceStatus tLSInspectionConfigurationStatus) {
        this.tLSInspectionConfigurationStatus = tLSInspectionConfigurationStatus.toString();
        return this;
    }

    /**
     * <p>
     * A description of the TLS inspection configuration.
     * </p>
     * 
     * @param description
     *        A description of the TLS inspection configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the TLS inspection configuration.
     * </p>
     * 
     * @return A description of the TLS inspection configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the TLS inspection configuration.
     * </p>
     * 
     * @param description
     *        A description of the TLS inspection configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfigurationResponse withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @return The key:value pairs to associate with the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfigurationResponse withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfigurationResponse withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The last time that the TLS inspection configuration was changed.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time that the TLS inspection configuration was changed.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time that the TLS inspection configuration was changed.
     * </p>
     * 
     * @return The last time that the TLS inspection configuration was changed.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time that the TLS inspection configuration was changed.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time that the TLS inspection configuration was changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfigurationResponse withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The number of firewall policies that use this TLS inspection configuration.
     * </p>
     * 
     * @param numberOfAssociations
     *        The number of firewall policies that use this TLS inspection configuration.
     */

    public void setNumberOfAssociations(Integer numberOfAssociations) {
        this.numberOfAssociations = numberOfAssociations;
    }

    /**
     * <p>
     * The number of firewall policies that use this TLS inspection configuration.
     * </p>
     * 
     * @return The number of firewall policies that use this TLS inspection configuration.
     */

    public Integer getNumberOfAssociations() {
        return this.numberOfAssociations;
    }

    /**
     * <p>
     * The number of firewall policies that use this TLS inspection configuration.
     * </p>
     * 
     * @param numberOfAssociations
     *        The number of firewall policies that use this TLS inspection configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfigurationResponse withNumberOfAssociations(Integer numberOfAssociations) {
        setNumberOfAssociations(numberOfAssociations);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     * inspection configuration.
     * </p>
     * 
     * @param encryptionConfiguration
     *        A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     *        inspection configuration.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     * inspection configuration.
     * </p>
     * 
     * @return A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     *         inspection configuration.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     * inspection configuration.
     * </p>
     * 
     * @param encryptionConfiguration
     *        A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     *        inspection configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfigurationResponse withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of the certificates associated with the TLS inspection configuration.
     * </p>
     * 
     * @return A list of the certificates associated with the TLS inspection configuration.
     */

    public java.util.List<TlsCertificateData> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * A list of the certificates associated with the TLS inspection configuration.
     * </p>
     * 
     * @param certificates
     *        A list of the certificates associated with the TLS inspection configuration.
     */

    public void setCertificates(java.util.Collection<TlsCertificateData> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }

        this.certificates = new java.util.ArrayList<TlsCertificateData>(certificates);
    }

    /**
     * <p>
     * A list of the certificates associated with the TLS inspection configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        A list of the certificates associated with the TLS inspection configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfigurationResponse withCertificates(TlsCertificateData... certificates) {
        if (this.certificates == null) {
            setCertificates(new java.util.ArrayList<TlsCertificateData>(certificates.length));
        }
        for (TlsCertificateData ele : certificates) {
            this.certificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the certificates associated with the TLS inspection configuration.
     * </p>
     * 
     * @param certificates
     *        A list of the certificates associated with the TLS inspection configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfigurationResponse withCertificates(java.util.Collection<TlsCertificateData> certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * @param certificateAuthority
     */

    public void setCertificateAuthority(TlsCertificateData certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
    }

    /**
     * @return
     */

    public TlsCertificateData getCertificateAuthority() {
        return this.certificateAuthority;
    }

    /**
     * @param certificateAuthority
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfigurationResponse withCertificateAuthority(TlsCertificateData certificateAuthority) {
        setCertificateAuthority(certificateAuthority);
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
        if (getTLSInspectionConfigurationArn() != null)
            sb.append("TLSInspectionConfigurationArn: ").append(getTLSInspectionConfigurationArn()).append(",");
        if (getTLSInspectionConfigurationName() != null)
            sb.append("TLSInspectionConfigurationName: ").append(getTLSInspectionConfigurationName()).append(",");
        if (getTLSInspectionConfigurationId() != null)
            sb.append("TLSInspectionConfigurationId: ").append(getTLSInspectionConfigurationId()).append(",");
        if (getTLSInspectionConfigurationStatus() != null)
            sb.append("TLSInspectionConfigurationStatus: ").append(getTLSInspectionConfigurationStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getNumberOfAssociations() != null)
            sb.append("NumberOfAssociations: ").append(getNumberOfAssociations()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getCertificates() != null)
            sb.append("Certificates: ").append(getCertificates()).append(",");
        if (getCertificateAuthority() != null)
            sb.append("CertificateAuthority: ").append(getCertificateAuthority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TLSInspectionConfigurationResponse == false)
            return false;
        TLSInspectionConfigurationResponse other = (TLSInspectionConfigurationResponse) obj;
        if (other.getTLSInspectionConfigurationArn() == null ^ this.getTLSInspectionConfigurationArn() == null)
            return false;
        if (other.getTLSInspectionConfigurationArn() != null
                && other.getTLSInspectionConfigurationArn().equals(this.getTLSInspectionConfigurationArn()) == false)
            return false;
        if (other.getTLSInspectionConfigurationName() == null ^ this.getTLSInspectionConfigurationName() == null)
            return false;
        if (other.getTLSInspectionConfigurationName() != null
                && other.getTLSInspectionConfigurationName().equals(this.getTLSInspectionConfigurationName()) == false)
            return false;
        if (other.getTLSInspectionConfigurationId() == null ^ this.getTLSInspectionConfigurationId() == null)
            return false;
        if (other.getTLSInspectionConfigurationId() != null && other.getTLSInspectionConfigurationId().equals(this.getTLSInspectionConfigurationId()) == false)
            return false;
        if (other.getTLSInspectionConfigurationStatus() == null ^ this.getTLSInspectionConfigurationStatus() == null)
            return false;
        if (other.getTLSInspectionConfigurationStatus() != null
                && other.getTLSInspectionConfigurationStatus().equals(this.getTLSInspectionConfigurationStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getNumberOfAssociations() == null ^ this.getNumberOfAssociations() == null)
            return false;
        if (other.getNumberOfAssociations() != null && other.getNumberOfAssociations().equals(this.getNumberOfAssociations()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        if (other.getCertificateAuthority() == null ^ this.getCertificateAuthority() == null)
            return false;
        if (other.getCertificateAuthority() != null && other.getCertificateAuthority().equals(this.getCertificateAuthority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTLSInspectionConfigurationArn() == null) ? 0 : getTLSInspectionConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getTLSInspectionConfigurationName() == null) ? 0 : getTLSInspectionConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getTLSInspectionConfigurationId() == null) ? 0 : getTLSInspectionConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getTLSInspectionConfigurationStatus() == null) ? 0 : getTLSInspectionConfigurationStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getNumberOfAssociations() == null) ? 0 : getNumberOfAssociations().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthority() == null) ? 0 : getCertificateAuthority().hashCode());
        return hashCode;
    }

    @Override
    public TLSInspectionConfigurationResponse clone() {
        try {
            return (TLSInspectionConfigurationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.TLSInspectionConfigurationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
