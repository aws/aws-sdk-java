/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ActivateContactChannel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivateContactChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     */
    private String contactChannelId;
    /**
     * <p>
     * The code sent to the contact channel when it was created in the contact.
     * </p>
     */
    private String activationCode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     * 
     * @param contactChannelId
     *        The Amazon Resource Name (ARN) of the contact channel.
     */

    public void setContactChannelId(String contactChannelId) {
        this.contactChannelId = contactChannelId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact channel.
     */

    public String getContactChannelId() {
        return this.contactChannelId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     * 
     * @param contactChannelId
     *        The Amazon Resource Name (ARN) of the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateContactChannelRequest withContactChannelId(String contactChannelId) {
        setContactChannelId(contactChannelId);
        return this;
    }

    /**
     * <p>
     * The code sent to the contact channel when it was created in the contact.
     * </p>
     * 
     * @param activationCode
     *        The code sent to the contact channel when it was created in the contact.
     */

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    /**
     * <p>
     * The code sent to the contact channel when it was created in the contact.
     * </p>
     * 
     * @return The code sent to the contact channel when it was created in the contact.
     */

    public String getActivationCode() {
        return this.activationCode;
    }

    /**
     * <p>
     * The code sent to the contact channel when it was created in the contact.
     * </p>
     * 
     * @param activationCode
     *        The code sent to the contact channel when it was created in the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateContactChannelRequest withActivationCode(String activationCode) {
        setActivationCode(activationCode);
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
        if (getContactChannelId() != null)
            sb.append("ContactChannelId: ").append(getContactChannelId()).append(",");
        if (getActivationCode() != null)
            sb.append("ActivationCode: ").append(getActivationCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivateContactChannelRequest == false)
            return false;
        ActivateContactChannelRequest other = (ActivateContactChannelRequest) obj;
        if (other.getContactChannelId() == null ^ this.getContactChannelId() == null)
            return false;
        if (other.getContactChannelId() != null && other.getContactChannelId().equals(this.getContactChannelId()) == false)
            return false;
        if (other.getActivationCode() == null ^ this.getActivationCode() == null)
            return false;
        if (other.getActivationCode() != null && other.getActivationCode().equals(this.getActivationCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactChannelId() == null) ? 0 : getContactChannelId().hashCode());
        hashCode = prime * hashCode + ((getActivationCode() == null) ? 0 : getActivationCode().hashCode());
        return hashCode;
    }

    @Override
    public ActivateContactChannelRequest clone() {
        return (ActivateContactChannelRequest) super.clone();
    }

}
