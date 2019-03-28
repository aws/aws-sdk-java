/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * If the email identity is a domain, this object contains tokens that you can use to create a set of CNAME records. To
 * sucessfully verify your domain, you have to add these records to the DNS configuration for your domain.
 * </p>
 * <p>
 * If the email identity is an email address, this object is empty.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateEmailIdentity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEmailIdentityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The email identity type.
     * </p>
     */
    private String identityType;
    /**
     * <p>
     * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified
     * email addresses or domains. For more information about verifying identities, see the <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon Pinpoint
     * User Guide</a>.
     * </p>
     */
    private Boolean verifiedForSendingStatus;
    /**
     * <p>
     * An object that contains information about the DKIM attributes for the identity. This object includes the tokens
     * that you use to create the CNAME records that are required to complete the DKIM verification process.
     * </p>
     */
    private DkimAttributes dkimAttributes;

    /**
     * <p>
     * The email identity type.
     * </p>
     * 
     * @param identityType
     *        The email identity type.
     * @see IdentityType
     */

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * The email identity type.
     * </p>
     * 
     * @return The email identity type.
     * @see IdentityType
     */

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * <p>
     * The email identity type.
     * </p>
     * 
     * @param identityType
     *        The email identity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public CreateEmailIdentityResult withIdentityType(String identityType) {
        setIdentityType(identityType);
        return this;
    }

    /**
     * <p>
     * The email identity type.
     * </p>
     * 
     * @param identityType
     *        The email identity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public CreateEmailIdentityResult withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified
     * email addresses or domains. For more information about verifying identities, see the <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon Pinpoint
     * User Guide</a>.
     * </p>
     * 
     * @param verifiedForSendingStatus
     *        Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from
     *        verified email addresses or domains. For more information about verifying identities, see the <a
     *        href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon
     *        Pinpoint User Guide</a>.
     */

    public void setVerifiedForSendingStatus(Boolean verifiedForSendingStatus) {
        this.verifiedForSendingStatus = verifiedForSendingStatus;
    }

    /**
     * <p>
     * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified
     * email addresses or domains. For more information about verifying identities, see the <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon Pinpoint
     * User Guide</a>.
     * </p>
     * 
     * @return Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from
     *         verified email addresses or domains. For more information about verifying identities, see the <a
     *         href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon
     *         Pinpoint User Guide</a>.
     */

    public Boolean getVerifiedForSendingStatus() {
        return this.verifiedForSendingStatus;
    }

    /**
     * <p>
     * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified
     * email addresses or domains. For more information about verifying identities, see the <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon Pinpoint
     * User Guide</a>.
     * </p>
     * 
     * @param verifiedForSendingStatus
     *        Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from
     *        verified email addresses or domains. For more information about verifying identities, see the <a
     *        href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon
     *        Pinpoint User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEmailIdentityResult withVerifiedForSendingStatus(Boolean verifiedForSendingStatus) {
        setVerifiedForSendingStatus(verifiedForSendingStatus);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified
     * email addresses or domains. For more information about verifying identities, see the <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon Pinpoint
     * User Guide</a>.
     * </p>
     * 
     * @return Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from
     *         verified email addresses or domains. For more information about verifying identities, see the <a
     *         href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon
     *         Pinpoint User Guide</a>.
     */

    public Boolean isVerifiedForSendingStatus() {
        return this.verifiedForSendingStatus;
    }

    /**
     * <p>
     * An object that contains information about the DKIM attributes for the identity. This object includes the tokens
     * that you use to create the CNAME records that are required to complete the DKIM verification process.
     * </p>
     * 
     * @param dkimAttributes
     *        An object that contains information about the DKIM attributes for the identity. This object includes the
     *        tokens that you use to create the CNAME records that are required to complete the DKIM verification
     *        process.
     */

    public void setDkimAttributes(DkimAttributes dkimAttributes) {
        this.dkimAttributes = dkimAttributes;
    }

    /**
     * <p>
     * An object that contains information about the DKIM attributes for the identity. This object includes the tokens
     * that you use to create the CNAME records that are required to complete the DKIM verification process.
     * </p>
     * 
     * @return An object that contains information about the DKIM attributes for the identity. This object includes the
     *         tokens that you use to create the CNAME records that are required to complete the DKIM verification
     *         process.
     */

    public DkimAttributes getDkimAttributes() {
        return this.dkimAttributes;
    }

    /**
     * <p>
     * An object that contains information about the DKIM attributes for the identity. This object includes the tokens
     * that you use to create the CNAME records that are required to complete the DKIM verification process.
     * </p>
     * 
     * @param dkimAttributes
     *        An object that contains information about the DKIM attributes for the identity. This object includes the
     *        tokens that you use to create the CNAME records that are required to complete the DKIM verification
     *        process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEmailIdentityResult withDkimAttributes(DkimAttributes dkimAttributes) {
        setDkimAttributes(dkimAttributes);
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
        if (getIdentityType() != null)
            sb.append("IdentityType: ").append(getIdentityType()).append(",");
        if (getVerifiedForSendingStatus() != null)
            sb.append("VerifiedForSendingStatus: ").append(getVerifiedForSendingStatus()).append(",");
        if (getDkimAttributes() != null)
            sb.append("DkimAttributes: ").append(getDkimAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEmailIdentityResult == false)
            return false;
        CreateEmailIdentityResult other = (CreateEmailIdentityResult) obj;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getVerifiedForSendingStatus() == null ^ this.getVerifiedForSendingStatus() == null)
            return false;
        if (other.getVerifiedForSendingStatus() != null && other.getVerifiedForSendingStatus().equals(this.getVerifiedForSendingStatus()) == false)
            return false;
        if (other.getDkimAttributes() == null ^ this.getDkimAttributes() == null)
            return false;
        if (other.getDkimAttributes() != null && other.getDkimAttributes().equals(this.getDkimAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getVerifiedForSendingStatus() == null) ? 0 : getVerifiedForSendingStatus().hashCode());
        hashCode = prime * hashCode + ((getDkimAttributes() == null) ? 0 : getDkimAttributes().hashCode());
        return hashCode;
    }

    @Override
    public CreateEmailIdentityResult clone() {
        try {
            return (CreateEmailIdentityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
