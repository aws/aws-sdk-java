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
 * Returns the properties of the profile that was specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListedProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified profile.
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
     * Indicates whether to list only <code>LOCAL</code> type profiles or only <code>PARTNER</code> type profiles. If
     * not supplied in the request, the command lists all types of profiles.
     * </p>
     */
    private String profileType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified profile.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified profile.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedProfile withArn(String arn) {
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

    public ListedProfile withProfileId(String profileId) {
        setProfileId(profileId);
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

    public ListedProfile withAs2Id(String as2Id) {
        setAs2Id(as2Id);
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

    public ListedProfile withProfileType(String profileType) {
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

    public ListedProfile withProfileType(ProfileType profileType) {
        this.profileType = profileType.toString();
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
        if (getAs2Id() != null)
            sb.append("As2Id: ").append(getAs2Id()).append(",");
        if (getProfileType() != null)
            sb.append("ProfileType: ").append(getProfileType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedProfile == false)
            return false;
        ListedProfile other = (ListedProfile) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getAs2Id() == null ^ this.getAs2Id() == null)
            return false;
        if (other.getAs2Id() != null && other.getAs2Id().equals(this.getAs2Id()) == false)
            return false;
        if (other.getProfileType() == null ^ this.getProfileType() == null)
            return false;
        if (other.getProfileType() != null && other.getProfileType().equals(this.getProfileType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getAs2Id() == null) ? 0 : getAs2Id().hashCode());
        hashCode = prime * hashCode + ((getProfileType() == null) ? 0 : getProfileType().hashCode());
        return hashCode;
    }

    @Override
    public ListedProfile clone() {
        try {
            return (ListedProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ListedProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
