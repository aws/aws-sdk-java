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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The password configuration of the ingress endpoint resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/IngressPointPasswordConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngressPointPasswordConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The previous password expiry timestamp of the ingress endpoint resource.
     * </p>
     */
    private java.util.Date previousSmtpPasswordExpiryTimestamp;
    /**
     * <p>
     * The previous password version of the ingress endpoint resource.
     * </p>
     */
    private String previousSmtpPasswordVersion;
    /**
     * <p>
     * The current password expiry timestamp of the ingress endpoint resource.
     * </p>
     */
    private String smtpPasswordVersion;

    /**
     * <p>
     * The previous password expiry timestamp of the ingress endpoint resource.
     * </p>
     * 
     * @param previousSmtpPasswordExpiryTimestamp
     *        The previous password expiry timestamp of the ingress endpoint resource.
     */

    public void setPreviousSmtpPasswordExpiryTimestamp(java.util.Date previousSmtpPasswordExpiryTimestamp) {
        this.previousSmtpPasswordExpiryTimestamp = previousSmtpPasswordExpiryTimestamp;
    }

    /**
     * <p>
     * The previous password expiry timestamp of the ingress endpoint resource.
     * </p>
     * 
     * @return The previous password expiry timestamp of the ingress endpoint resource.
     */

    public java.util.Date getPreviousSmtpPasswordExpiryTimestamp() {
        return this.previousSmtpPasswordExpiryTimestamp;
    }

    /**
     * <p>
     * The previous password expiry timestamp of the ingress endpoint resource.
     * </p>
     * 
     * @param previousSmtpPasswordExpiryTimestamp
     *        The previous password expiry timestamp of the ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressPointPasswordConfiguration withPreviousSmtpPasswordExpiryTimestamp(java.util.Date previousSmtpPasswordExpiryTimestamp) {
        setPreviousSmtpPasswordExpiryTimestamp(previousSmtpPasswordExpiryTimestamp);
        return this;
    }

    /**
     * <p>
     * The previous password version of the ingress endpoint resource.
     * </p>
     * 
     * @param previousSmtpPasswordVersion
     *        The previous password version of the ingress endpoint resource.
     */

    public void setPreviousSmtpPasswordVersion(String previousSmtpPasswordVersion) {
        this.previousSmtpPasswordVersion = previousSmtpPasswordVersion;
    }

    /**
     * <p>
     * The previous password version of the ingress endpoint resource.
     * </p>
     * 
     * @return The previous password version of the ingress endpoint resource.
     */

    public String getPreviousSmtpPasswordVersion() {
        return this.previousSmtpPasswordVersion;
    }

    /**
     * <p>
     * The previous password version of the ingress endpoint resource.
     * </p>
     * 
     * @param previousSmtpPasswordVersion
     *        The previous password version of the ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressPointPasswordConfiguration withPreviousSmtpPasswordVersion(String previousSmtpPasswordVersion) {
        setPreviousSmtpPasswordVersion(previousSmtpPasswordVersion);
        return this;
    }

    /**
     * <p>
     * The current password expiry timestamp of the ingress endpoint resource.
     * </p>
     * 
     * @param smtpPasswordVersion
     *        The current password expiry timestamp of the ingress endpoint resource.
     */

    public void setSmtpPasswordVersion(String smtpPasswordVersion) {
        this.smtpPasswordVersion = smtpPasswordVersion;
    }

    /**
     * <p>
     * The current password expiry timestamp of the ingress endpoint resource.
     * </p>
     * 
     * @return The current password expiry timestamp of the ingress endpoint resource.
     */

    public String getSmtpPasswordVersion() {
        return this.smtpPasswordVersion;
    }

    /**
     * <p>
     * The current password expiry timestamp of the ingress endpoint resource.
     * </p>
     * 
     * @param smtpPasswordVersion
     *        The current password expiry timestamp of the ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressPointPasswordConfiguration withSmtpPasswordVersion(String smtpPasswordVersion) {
        setSmtpPasswordVersion(smtpPasswordVersion);
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
        if (getPreviousSmtpPasswordExpiryTimestamp() != null)
            sb.append("PreviousSmtpPasswordExpiryTimestamp: ").append(getPreviousSmtpPasswordExpiryTimestamp()).append(",");
        if (getPreviousSmtpPasswordVersion() != null)
            sb.append("PreviousSmtpPasswordVersion: ").append(getPreviousSmtpPasswordVersion()).append(",");
        if (getSmtpPasswordVersion() != null)
            sb.append("SmtpPasswordVersion: ").append(getSmtpPasswordVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngressPointPasswordConfiguration == false)
            return false;
        IngressPointPasswordConfiguration other = (IngressPointPasswordConfiguration) obj;
        if (other.getPreviousSmtpPasswordExpiryTimestamp() == null ^ this.getPreviousSmtpPasswordExpiryTimestamp() == null)
            return false;
        if (other.getPreviousSmtpPasswordExpiryTimestamp() != null
                && other.getPreviousSmtpPasswordExpiryTimestamp().equals(this.getPreviousSmtpPasswordExpiryTimestamp()) == false)
            return false;
        if (other.getPreviousSmtpPasswordVersion() == null ^ this.getPreviousSmtpPasswordVersion() == null)
            return false;
        if (other.getPreviousSmtpPasswordVersion() != null && other.getPreviousSmtpPasswordVersion().equals(this.getPreviousSmtpPasswordVersion()) == false)
            return false;
        if (other.getSmtpPasswordVersion() == null ^ this.getSmtpPasswordVersion() == null)
            return false;
        if (other.getSmtpPasswordVersion() != null && other.getSmtpPasswordVersion().equals(this.getSmtpPasswordVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreviousSmtpPasswordExpiryTimestamp() == null) ? 0 : getPreviousSmtpPasswordExpiryTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPreviousSmtpPasswordVersion() == null) ? 0 : getPreviousSmtpPasswordVersion().hashCode());
        hashCode = prime * hashCode + ((getSmtpPasswordVersion() == null) ? 0 : getSmtpPasswordVersion().hashCode());
        return hashCode;
    }

    @Override
    public IngressPointPasswordConfiguration clone() {
        try {
            return (IngressPointPasswordConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.IngressPointPasswordConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
