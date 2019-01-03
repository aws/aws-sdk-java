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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to enable or disable the email sending capabilities for your entire Amazon SES account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateAccountSendingEnabled" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountSendingEnabledRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS Region.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS Region.
     * </p>
     * 
     * @param enabled
     *        Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS
     *        Region.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS Region.
     * </p>
     * 
     * @return Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS
     *         Region.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS Region.
     * </p>
     * 
     * @param enabled
     *        Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSendingEnabledRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS Region.
     * </p>
     * 
     * @return Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS
     *         Region.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountSendingEnabledRequest == false)
            return false;
        UpdateAccountSendingEnabledRequest other = (UpdateAccountSendingEnabledRequest) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountSendingEnabledRequest clone() {
        return (UpdateAccountSendingEnabledRequest) super.clone();
    }

}
