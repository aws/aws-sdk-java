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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Send OTP message request parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendOTPMessageRequestParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendOTPMessageRequestParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attempts allowed to validate an OTP.
     * </p>
     */
    private Integer allowedAttempts;
    /**
     * <p>
     * The brand name that will be substituted into the OTP message body. Should be owned by calling AWS account.
     * </p>
     */
    private String brandName;
    /**
     * <p>
     * Channel type for the OTP message. Supported values: [SMS].
     * </p>
     */
    private String channel;
    /**
     * <p>
     * The number of characters in the generated OTP.
     * </p>
     */
    private Integer codeLength;
    /**
     * <p>
     * The destination identity to send OTP to.
     * </p>
     */
    private String destinationIdentity;
    /**
     * <p>
     * A unique Entity ID received from DLT after entity registration is approved.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The language to be used for the outgoing message body containing the OTP.
     * </p>
     */
    private String language;
    /**
     * <p>
     * The origination identity used to send OTP from.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * Developer-specified reference identifier. Required to match during OTP verification.
     * </p>
     */
    private String referenceId;
    /**
     * <p>
     * A unique Template ID received from DLT after entity registration is approved.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * The time in minutes before the OTP is no longer valid.
     * </p>
     */
    private Integer validityPeriod;

    /**
     * <p>
     * The attempts allowed to validate an OTP.
     * </p>
     * 
     * @param allowedAttempts
     *        The attempts allowed to validate an OTP.
     */

    public void setAllowedAttempts(Integer allowedAttempts) {
        this.allowedAttempts = allowedAttempts;
    }

    /**
     * <p>
     * The attempts allowed to validate an OTP.
     * </p>
     * 
     * @return The attempts allowed to validate an OTP.
     */

    public Integer getAllowedAttempts() {
        return this.allowedAttempts;
    }

    /**
     * <p>
     * The attempts allowed to validate an OTP.
     * </p>
     * 
     * @param allowedAttempts
     *        The attempts allowed to validate an OTP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendOTPMessageRequestParameters withAllowedAttempts(Integer allowedAttempts) {
        setAllowedAttempts(allowedAttempts);
        return this;
    }

    /**
     * <p>
     * The brand name that will be substituted into the OTP message body. Should be owned by calling AWS account.
     * </p>
     * 
     * @param brandName
     *        The brand name that will be substituted into the OTP message body. Should be owned by calling AWS account.
     */

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * <p>
     * The brand name that will be substituted into the OTP message body. Should be owned by calling AWS account.
     * </p>
     * 
     * @return The brand name that will be substituted into the OTP message body. Should be owned by calling AWS
     *         account.
     */

    public String getBrandName() {
        return this.brandName;
    }

    /**
     * <p>
     * The brand name that will be substituted into the OTP message body. Should be owned by calling AWS account.
     * </p>
     * 
     * @param brandName
     *        The brand name that will be substituted into the OTP message body. Should be owned by calling AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendOTPMessageRequestParameters withBrandName(String brandName) {
        setBrandName(brandName);
        return this;
    }

    /**
     * <p>
     * Channel type for the OTP message. Supported values: [SMS].
     * </p>
     * 
     * @param channel
     *        Channel type for the OTP message. Supported values: [SMS].
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * Channel type for the OTP message. Supported values: [SMS].
     * </p>
     * 
     * @return Channel type for the OTP message. Supported values: [SMS].
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * Channel type for the OTP message. Supported values: [SMS].
     * </p>
     * 
     * @param channel
     *        Channel type for the OTP message. Supported values: [SMS].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendOTPMessageRequestParameters withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * The number of characters in the generated OTP.
     * </p>
     * 
     * @param codeLength
     *        The number of characters in the generated OTP.
     */

    public void setCodeLength(Integer codeLength) {
        this.codeLength = codeLength;
    }

    /**
     * <p>
     * The number of characters in the generated OTP.
     * </p>
     * 
     * @return The number of characters in the generated OTP.
     */

    public Integer getCodeLength() {
        return this.codeLength;
    }

    /**
     * <p>
     * The number of characters in the generated OTP.
     * </p>
     * 
     * @param codeLength
     *        The number of characters in the generated OTP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendOTPMessageRequestParameters withCodeLength(Integer codeLength) {
        setCodeLength(codeLength);
        return this;
    }

    /**
     * <p>
     * The destination identity to send OTP to.
     * </p>
     * 
     * @param destinationIdentity
     *        The destination identity to send OTP to.
     */

    public void setDestinationIdentity(String destinationIdentity) {
        this.destinationIdentity = destinationIdentity;
    }

    /**
     * <p>
     * The destination identity to send OTP to.
     * </p>
     * 
     * @return The destination identity to send OTP to.
     */

    public String getDestinationIdentity() {
        return this.destinationIdentity;
    }

    /**
     * <p>
     * The destination identity to send OTP to.
     * </p>
     * 
     * @param destinationIdentity
     *        The destination identity to send OTP to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendOTPMessageRequestParameters withDestinationIdentity(String destinationIdentity) {
        setDestinationIdentity(destinationIdentity);
        return this;
    }

    /**
     * <p>
     * A unique Entity ID received from DLT after entity registration is approved.
     * </p>
     * 
     * @param entityId
     *        A unique Entity ID received from DLT after entity registration is approved.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * A unique Entity ID received from DLT after entity registration is approved.
     * </p>
     * 
     * @return A unique Entity ID received from DLT after entity registration is approved.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * A unique Entity ID received from DLT after entity registration is approved.
     * </p>
     * 
     * @param entityId
     *        A unique Entity ID received from DLT after entity registration is approved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendOTPMessageRequestParameters withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The language to be used for the outgoing message body containing the OTP.
     * </p>
     * 
     * @param language
     *        The language to be used for the outgoing message body containing the OTP.
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The language to be used for the outgoing message body containing the OTP.
     * </p>
     * 
     * @return The language to be used for the outgoing message body containing the OTP.
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The language to be used for the outgoing message body containing the OTP.
     * </p>
     * 
     * @param language
     *        The language to be used for the outgoing message body containing the OTP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendOTPMessageRequestParameters withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The origination identity used to send OTP from.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity used to send OTP from.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The origination identity used to send OTP from.
     * </p>
     * 
     * @return The origination identity used to send OTP from.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The origination identity used to send OTP from.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity used to send OTP from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendOTPMessageRequestParameters withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * Developer-specified reference identifier. Required to match during OTP verification.
     * </p>
     * 
     * @param referenceId
     *        Developer-specified reference identifier. Required to match during OTP verification.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * Developer-specified reference identifier. Required to match during OTP verification.
     * </p>
     * 
     * @return Developer-specified reference identifier. Required to match during OTP verification.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * Developer-specified reference identifier. Required to match during OTP verification.
     * </p>
     * 
     * @param referenceId
     *        Developer-specified reference identifier. Required to match during OTP verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendOTPMessageRequestParameters withReferenceId(String referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * A unique Template ID received from DLT after entity registration is approved.
     * </p>
     * 
     * @param templateId
     *        A unique Template ID received from DLT after entity registration is approved.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * A unique Template ID received from DLT after entity registration is approved.
     * </p>
     * 
     * @return A unique Template ID received from DLT after entity registration is approved.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * A unique Template ID received from DLT after entity registration is approved.
     * </p>
     * 
     * @param templateId
     *        A unique Template ID received from DLT after entity registration is approved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendOTPMessageRequestParameters withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * The time in minutes before the OTP is no longer valid.
     * </p>
     * 
     * @param validityPeriod
     *        The time in minutes before the OTP is no longer valid.
     */

    public void setValidityPeriod(Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * <p>
     * The time in minutes before the OTP is no longer valid.
     * </p>
     * 
     * @return The time in minutes before the OTP is no longer valid.
     */

    public Integer getValidityPeriod() {
        return this.validityPeriod;
    }

    /**
     * <p>
     * The time in minutes before the OTP is no longer valid.
     * </p>
     * 
     * @param validityPeriod
     *        The time in minutes before the OTP is no longer valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendOTPMessageRequestParameters withValidityPeriod(Integer validityPeriod) {
        setValidityPeriod(validityPeriod);
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
        if (getAllowedAttempts() != null)
            sb.append("AllowedAttempts: ").append(getAllowedAttempts()).append(",");
        if (getBrandName() != null)
            sb.append("BrandName: ").append(getBrandName()).append(",");
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getCodeLength() != null)
            sb.append("CodeLength: ").append(getCodeLength()).append(",");
        if (getDestinationIdentity() != null)
            sb.append("DestinationIdentity: ").append(getDestinationIdentity()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getOriginationIdentity() != null)
            sb.append("OriginationIdentity: ").append(getOriginationIdentity()).append(",");
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getValidityPeriod() != null)
            sb.append("ValidityPeriod: ").append(getValidityPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendOTPMessageRequestParameters == false)
            return false;
        SendOTPMessageRequestParameters other = (SendOTPMessageRequestParameters) obj;
        if (other.getAllowedAttempts() == null ^ this.getAllowedAttempts() == null)
            return false;
        if (other.getAllowedAttempts() != null && other.getAllowedAttempts().equals(this.getAllowedAttempts()) == false)
            return false;
        if (other.getBrandName() == null ^ this.getBrandName() == null)
            return false;
        if (other.getBrandName() != null && other.getBrandName().equals(this.getBrandName()) == false)
            return false;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getCodeLength() == null ^ this.getCodeLength() == null)
            return false;
        if (other.getCodeLength() != null && other.getCodeLength().equals(this.getCodeLength()) == false)
            return false;
        if (other.getDestinationIdentity() == null ^ this.getDestinationIdentity() == null)
            return false;
        if (other.getDestinationIdentity() != null && other.getDestinationIdentity().equals(this.getDestinationIdentity()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getOriginationIdentity() == null ^ this.getOriginationIdentity() == null)
            return false;
        if (other.getOriginationIdentity() != null && other.getOriginationIdentity().equals(this.getOriginationIdentity()) == false)
            return false;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getValidityPeriod() == null ^ this.getValidityPeriod() == null)
            return false;
        if (other.getValidityPeriod() != null && other.getValidityPeriod().equals(this.getValidityPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedAttempts() == null) ? 0 : getAllowedAttempts().hashCode());
        hashCode = prime * hashCode + ((getBrandName() == null) ? 0 : getBrandName().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getCodeLength() == null) ? 0 : getCodeLength().hashCode());
        hashCode = prime * hashCode + ((getDestinationIdentity() == null) ? 0 : getDestinationIdentity().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getValidityPeriod() == null) ? 0 : getValidityPeriod().hashCode());
        return hashCode;
    }

    @Override
    public SendOTPMessageRequestParameters clone() {
        try {
            return (SendOTPMessageRequestParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SendOTPMessageRequestParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
