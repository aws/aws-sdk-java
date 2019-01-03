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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The default conference provider that is used if no other scheduled meetings are detected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ConferencePreference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConferencePreference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the default conference provider.
     * </p>
     */
    private String defaultConferenceProviderArn;

    /**
     * <p>
     * The ARN of the default conference provider.
     * </p>
     * 
     * @param defaultConferenceProviderArn
     *        The ARN of the default conference provider.
     */

    public void setDefaultConferenceProviderArn(String defaultConferenceProviderArn) {
        this.defaultConferenceProviderArn = defaultConferenceProviderArn;
    }

    /**
     * <p>
     * The ARN of the default conference provider.
     * </p>
     * 
     * @return The ARN of the default conference provider.
     */

    public String getDefaultConferenceProviderArn() {
        return this.defaultConferenceProviderArn;
    }

    /**
     * <p>
     * The ARN of the default conference provider.
     * </p>
     * 
     * @param defaultConferenceProviderArn
     *        The ARN of the default conference provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConferencePreference withDefaultConferenceProviderArn(String defaultConferenceProviderArn) {
        setDefaultConferenceProviderArn(defaultConferenceProviderArn);
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
        if (getDefaultConferenceProviderArn() != null)
            sb.append("DefaultConferenceProviderArn: ").append(getDefaultConferenceProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConferencePreference == false)
            return false;
        ConferencePreference other = (ConferencePreference) obj;
        if (other.getDefaultConferenceProviderArn() == null ^ this.getDefaultConferenceProviderArn() == null)
            return false;
        if (other.getDefaultConferenceProviderArn() != null && other.getDefaultConferenceProviderArn().equals(this.getDefaultConferenceProviderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultConferenceProviderArn() == null) ? 0 : getDefaultConferenceProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public ConferencePreference clone() {
        try {
            return (ConferencePreference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.ConferencePreferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
