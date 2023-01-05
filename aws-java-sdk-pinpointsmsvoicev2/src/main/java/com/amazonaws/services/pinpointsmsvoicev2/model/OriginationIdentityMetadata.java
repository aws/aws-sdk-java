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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata for an origination identity associated with a pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/OriginationIdentityMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginationIdentityMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the origination identity.
     * </p>
     */
    private String originationIdentityArn;
    /**
     * <p>
     * The unique identifier of the origination identity.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     */
    private String isoCountryCode;
    /**
     * <p>
     * Describes if the origination identity can be used for text messages, voice calls or both.
     * </p>
     */
    private java.util.List<String> numberCapabilities;

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the origination identity.
     * </p>
     * 
     * @param originationIdentityArn
     *        The Amazon Resource Name (ARN) associated with the origination identity.
     */

    public void setOriginationIdentityArn(String originationIdentityArn) {
        this.originationIdentityArn = originationIdentityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the origination identity.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the origination identity.
     */

    public String getOriginationIdentityArn() {
        return this.originationIdentityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the origination identity.
     * </p>
     * 
     * @param originationIdentityArn
     *        The Amazon Resource Name (ARN) associated with the origination identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginationIdentityMetadata withOriginationIdentityArn(String originationIdentityArn) {
        setOriginationIdentityArn(originationIdentityArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the origination identity.
     * </p>
     * 
     * @param originationIdentity
     *        The unique identifier of the origination identity.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The unique identifier of the origination identity.
     * </p>
     * 
     * @return The unique identifier of the origination identity.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The unique identifier of the origination identity.
     * </p>
     * 
     * @param originationIdentity
     *        The unique identifier of the origination identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginationIdentityMetadata withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     */

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @return The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     */

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginationIdentityMetadata withIsoCountryCode(String isoCountryCode) {
        setIsoCountryCode(isoCountryCode);
        return this;
    }

    /**
     * <p>
     * Describes if the origination identity can be used for text messages, voice calls or both.
     * </p>
     * 
     * @return Describes if the origination identity can be used for text messages, voice calls or both.
     * @see NumberCapability
     */

    public java.util.List<String> getNumberCapabilities() {
        return numberCapabilities;
    }

    /**
     * <p>
     * Describes if the origination identity can be used for text messages, voice calls or both.
     * </p>
     * 
     * @param numberCapabilities
     *        Describes if the origination identity can be used for text messages, voice calls or both.
     * @see NumberCapability
     */

    public void setNumberCapabilities(java.util.Collection<String> numberCapabilities) {
        if (numberCapabilities == null) {
            this.numberCapabilities = null;
            return;
        }

        this.numberCapabilities = new java.util.ArrayList<String>(numberCapabilities);
    }

    /**
     * <p>
     * Describes if the origination identity can be used for text messages, voice calls or both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNumberCapabilities(java.util.Collection)} or {@link #withNumberCapabilities(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param numberCapabilities
     *        Describes if the origination identity can be used for text messages, voice calls or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public OriginationIdentityMetadata withNumberCapabilities(String... numberCapabilities) {
        if (this.numberCapabilities == null) {
            setNumberCapabilities(new java.util.ArrayList<String>(numberCapabilities.length));
        }
        for (String ele : numberCapabilities) {
            this.numberCapabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes if the origination identity can be used for text messages, voice calls or both.
     * </p>
     * 
     * @param numberCapabilities
     *        Describes if the origination identity can be used for text messages, voice calls or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public OriginationIdentityMetadata withNumberCapabilities(java.util.Collection<String> numberCapabilities) {
        setNumberCapabilities(numberCapabilities);
        return this;
    }

    /**
     * <p>
     * Describes if the origination identity can be used for text messages, voice calls or both.
     * </p>
     * 
     * @param numberCapabilities
     *        Describes if the origination identity can be used for text messages, voice calls or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public OriginationIdentityMetadata withNumberCapabilities(NumberCapability... numberCapabilities) {
        java.util.ArrayList<String> numberCapabilitiesCopy = new java.util.ArrayList<String>(numberCapabilities.length);
        for (NumberCapability value : numberCapabilities) {
            numberCapabilitiesCopy.add(value.toString());
        }
        if (getNumberCapabilities() == null) {
            setNumberCapabilities(numberCapabilitiesCopy);
        } else {
            getNumberCapabilities().addAll(numberCapabilitiesCopy);
        }
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
        if (getOriginationIdentityArn() != null)
            sb.append("OriginationIdentityArn: ").append(getOriginationIdentityArn()).append(",");
        if (getOriginationIdentity() != null)
            sb.append("OriginationIdentity: ").append(getOriginationIdentity()).append(",");
        if (getIsoCountryCode() != null)
            sb.append("IsoCountryCode: ").append(getIsoCountryCode()).append(",");
        if (getNumberCapabilities() != null)
            sb.append("NumberCapabilities: ").append(getNumberCapabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginationIdentityMetadata == false)
            return false;
        OriginationIdentityMetadata other = (OriginationIdentityMetadata) obj;
        if (other.getOriginationIdentityArn() == null ^ this.getOriginationIdentityArn() == null)
            return false;
        if (other.getOriginationIdentityArn() != null && other.getOriginationIdentityArn().equals(this.getOriginationIdentityArn()) == false)
            return false;
        if (other.getOriginationIdentity() == null ^ this.getOriginationIdentity() == null)
            return false;
        if (other.getOriginationIdentity() != null && other.getOriginationIdentity().equals(this.getOriginationIdentity()) == false)
            return false;
        if (other.getIsoCountryCode() == null ^ this.getIsoCountryCode() == null)
            return false;
        if (other.getIsoCountryCode() != null && other.getIsoCountryCode().equals(this.getIsoCountryCode()) == false)
            return false;
        if (other.getNumberCapabilities() == null ^ this.getNumberCapabilities() == null)
            return false;
        if (other.getNumberCapabilities() != null && other.getNumberCapabilities().equals(this.getNumberCapabilities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginationIdentityArn() == null) ? 0 : getOriginationIdentityArn().hashCode());
        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getIsoCountryCode() == null) ? 0 : getIsoCountryCode().hashCode());
        hashCode = prime * hashCode + ((getNumberCapabilities() == null) ? 0 : getNumberCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public OriginationIdentityMetadata clone() {
        try {
            return (OriginationIdentityMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.OriginationIdentityMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
