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
 * The details for a local or partner AS2 profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribedProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the profile.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A unique identifier for the local or partner AS2 profile.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * Indicates whether to list only <code>LOCAL</code> type profiles or only <code>PARTNER</code> type profiles. If
     * not supplied in the request, the command lists all types of profiles.
     * </p>
     */
    private String profileType;
    /**
     * <p>
     * The <code>As2Id</code> is the <i>AS2-name</i>, as defined in the <a
     * href="https://datatracker.ietf.org/doc/html/rfc4130">RFC 4130</a>. For inbound transfers, this is the
     * <code>AS2-From</code> header for the AS2 messages sent from the partner. For outbound connectors, this is the
     * <code>AS2-To</code> header for the AS2 messages sent to the partner using the <code>StartFileTransfer</code> API
     * operation. This ID cannot include spaces.
     * </p>
     */
    private String as2Id;
    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     */
    private java.util.List<String> certificateIds;
    /**
     * <p>
     * Key-value pairs that can be used to group and search for profiles.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the profile.
     * </p>
     * 
     * @param arn
     *        The unique Amazon Resource Name (ARN) for the profile.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the profile.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) for the profile.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the profile.
     * </p>
     * 
     * @param arn
     *        The unique Amazon Resource Name (ARN) for the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedProfile withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the local or partner AS2 profile.
     * </p>
     * 
     * @param profileId
     *        A unique identifier for the local or partner AS2 profile.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * A unique identifier for the local or partner AS2 profile.
     * </p>
     * 
     * @return A unique identifier for the local or partner AS2 profile.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * A unique identifier for the local or partner AS2 profile.
     * </p>
     * 
     * @param profileId
     *        A unique identifier for the local or partner AS2 profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedProfile withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * Indicates whether to list only <code>LOCAL</code> type profiles or only <code>PARTNER</code> type profiles. If
     * not supplied in the request, the command lists all types of profiles.
     * </p>
     * 
     * @param profileType
     *        Indicates whether to list only <code>LOCAL</code> type profiles or only <code>PARTNER</code> type
     *        profiles. If not supplied in the request, the command lists all types of profiles.
     * @see ProfileType
     */

    public void setProfileType(String profileType) {
        this.profileType = profileType;
    }

    /**
     * <p>
     * Indicates whether to list only <code>LOCAL</code> type profiles or only <code>PARTNER</code> type profiles. If
     * not supplied in the request, the command lists all types of profiles.
     * </p>
     * 
     * @return Indicates whether to list only <code>LOCAL</code> type profiles or only <code>PARTNER</code> type
     *         profiles. If not supplied in the request, the command lists all types of profiles.
     * @see ProfileType
     */

    public String getProfileType() {
        return this.profileType;
    }

    /**
     * <p>
     * Indicates whether to list only <code>LOCAL</code> type profiles or only <code>PARTNER</code> type profiles. If
     * not supplied in the request, the command lists all types of profiles.
     * </p>
     * 
     * @param profileType
     *        Indicates whether to list only <code>LOCAL</code> type profiles or only <code>PARTNER</code> type
     *        profiles. If not supplied in the request, the command lists all types of profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileType
     */

    public DescribedProfile withProfileType(String profileType) {
        setProfileType(profileType);
        return this;
    }

    /**
     * <p>
     * Indicates whether to list only <code>LOCAL</code> type profiles or only <code>PARTNER</code> type profiles. If
     * not supplied in the request, the command lists all types of profiles.
     * </p>
     * 
     * @param profileType
     *        Indicates whether to list only <code>LOCAL</code> type profiles or only <code>PARTNER</code> type
     *        profiles. If not supplied in the request, the command lists all types of profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileType
     */

    public DescribedProfile withProfileType(ProfileType profileType) {
        this.profileType = profileType.toString();
        return this;
    }

    /**
     * <p>
     * The <code>As2Id</code> is the <i>AS2-name</i>, as defined in the <a
     * href="https://datatracker.ietf.org/doc/html/rfc4130">RFC 4130</a>. For inbound transfers, this is the
     * <code>AS2-From</code> header for the AS2 messages sent from the partner. For outbound connectors, this is the
     * <code>AS2-To</code> header for the AS2 messages sent to the partner using the <code>StartFileTransfer</code> API
     * operation. This ID cannot include spaces.
     * </p>
     * 
     * @param as2Id
     *        The <code>As2Id</code> is the <i>AS2-name</i>, as defined in the <a
     *        href="https://datatracker.ietf.org/doc/html/rfc4130">RFC 4130</a>. For inbound transfers, this is the
     *        <code>AS2-From</code> header for the AS2 messages sent from the partner. For outbound connectors, this is
     *        the <code>AS2-To</code> header for the AS2 messages sent to the partner using the
     *        <code>StartFileTransfer</code> API operation. This ID cannot include spaces.
     */

    public void setAs2Id(String as2Id) {
        this.as2Id = as2Id;
    }

    /**
     * <p>
     * The <code>As2Id</code> is the <i>AS2-name</i>, as defined in the <a
     * href="https://datatracker.ietf.org/doc/html/rfc4130">RFC 4130</a>. For inbound transfers, this is the
     * <code>AS2-From</code> header for the AS2 messages sent from the partner. For outbound connectors, this is the
     * <code>AS2-To</code> header for the AS2 messages sent to the partner using the <code>StartFileTransfer</code> API
     * operation. This ID cannot include spaces.
     * </p>
     * 
     * @return The <code>As2Id</code> is the <i>AS2-name</i>, as defined in the <a
     *         href="https://datatracker.ietf.org/doc/html/rfc4130">RFC 4130</a>. For inbound transfers, this is the
     *         <code>AS2-From</code> header for the AS2 messages sent from the partner. For outbound connectors, this is
     *         the <code>AS2-To</code> header for the AS2 messages sent to the partner using the
     *         <code>StartFileTransfer</code> API operation. This ID cannot include spaces.
     */

    public String getAs2Id() {
        return this.as2Id;
    }

    /**
     * <p>
     * The <code>As2Id</code> is the <i>AS2-name</i>, as defined in the <a
     * href="https://datatracker.ietf.org/doc/html/rfc4130">RFC 4130</a>. For inbound transfers, this is the
     * <code>AS2-From</code> header for the AS2 messages sent from the partner. For outbound connectors, this is the
     * <code>AS2-To</code> header for the AS2 messages sent to the partner using the <code>StartFileTransfer</code> API
     * operation. This ID cannot include spaces.
     * </p>
     * 
     * @param as2Id
     *        The <code>As2Id</code> is the <i>AS2-name</i>, as defined in the <a
     *        href="https://datatracker.ietf.org/doc/html/rfc4130">RFC 4130</a>. For inbound transfers, this is the
     *        <code>AS2-From</code> header for the AS2 messages sent from the partner. For outbound connectors, this is
     *        the <code>AS2-To</code> header for the AS2 messages sent to the partner using the
     *        <code>StartFileTransfer</code> API operation. This ID cannot include spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedProfile withAs2Id(String as2Id) {
        setAs2Id(as2Id);
        return this;
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * 
     * @return An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *         and partner profiles.
     */

    public java.util.List<String> getCertificateIds() {
        return certificateIds;
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * 
     * @param certificateIds
     *        An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *        and partner profiles.
     */

    public void setCertificateIds(java.util.Collection<String> certificateIds) {
        if (certificateIds == null) {
            this.certificateIds = null;
            return;
        }

        this.certificateIds = new java.util.ArrayList<String>(certificateIds);
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateIds(java.util.Collection)} or {@link #withCertificateIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param certificateIds
     *        An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *        and partner profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedProfile withCertificateIds(String... certificateIds) {
        if (this.certificateIds == null) {
            setCertificateIds(new java.util.ArrayList<String>(certificateIds.length));
        }
        for (String ele : certificateIds) {
            this.certificateIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * 
     * @param certificateIds
     *        An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *        and partner profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedProfile withCertificateIds(java.util.Collection<String> certificateIds) {
        setCertificateIds(certificateIds);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for profiles.
     * </p>
     * 
     * @return Key-value pairs that can be used to group and search for profiles.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for profiles.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for profiles.
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
     * Key-value pairs that can be used to group and search for profiles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedProfile withTags(Tag... tags) {
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
     * Key-value pairs that can be used to group and search for profiles.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedProfile withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getProfileType() != null)
            sb.append("ProfileType: ").append(getProfileType()).append(",");
        if (getAs2Id() != null)
            sb.append("As2Id: ").append(getAs2Id()).append(",");
        if (getCertificateIds() != null)
            sb.append("CertificateIds: ").append(getCertificateIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribedProfile == false)
            return false;
        DescribedProfile other = (DescribedProfile) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getProfileType() == null ^ this.getProfileType() == null)
            return false;
        if (other.getProfileType() != null && other.getProfileType().equals(this.getProfileType()) == false)
            return false;
        if (other.getAs2Id() == null ^ this.getAs2Id() == null)
            return false;
        if (other.getAs2Id() != null && other.getAs2Id().equals(this.getAs2Id()) == false)
            return false;
        if (other.getCertificateIds() == null ^ this.getCertificateIds() == null)
            return false;
        if (other.getCertificateIds() != null && other.getCertificateIds().equals(this.getCertificateIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getProfileType() == null) ? 0 : getProfileType().hashCode());
        hashCode = prime * hashCode + ((getAs2Id() == null) ? 0 : getAs2Id().hashCode());
        hashCode = prime * hashCode + ((getCertificateIds() == null) ? 0 : getCertificateIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribedProfile clone() {
        try {
            return (DescribedProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.DescribedProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
