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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The streaming protocol you want your stack to prefer. This can be UDP or TCP. Currently, UDP is only supported in the
 * Windows native client.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StreamingExperienceSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingExperienceSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The preferred protocol that you want to use while streaming your application.
     * </p>
     */
    private String preferredProtocol;

    /**
     * <p>
     * The preferred protocol that you want to use while streaming your application.
     * </p>
     * 
     * @param preferredProtocol
     *        The preferred protocol that you want to use while streaming your application.
     * @see PreferredProtocol
     */

    public void setPreferredProtocol(String preferredProtocol) {
        this.preferredProtocol = preferredProtocol;
    }

    /**
     * <p>
     * The preferred protocol that you want to use while streaming your application.
     * </p>
     * 
     * @return The preferred protocol that you want to use while streaming your application.
     * @see PreferredProtocol
     */

    public String getPreferredProtocol() {
        return this.preferredProtocol;
    }

    /**
     * <p>
     * The preferred protocol that you want to use while streaming your application.
     * </p>
     * 
     * @param preferredProtocol
     *        The preferred protocol that you want to use while streaming your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreferredProtocol
     */

    public StreamingExperienceSettings withPreferredProtocol(String preferredProtocol) {
        setPreferredProtocol(preferredProtocol);
        return this;
    }

    /**
     * <p>
     * The preferred protocol that you want to use while streaming your application.
     * </p>
     * 
     * @param preferredProtocol
     *        The preferred protocol that you want to use while streaming your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreferredProtocol
     */

    public StreamingExperienceSettings withPreferredProtocol(PreferredProtocol preferredProtocol) {
        this.preferredProtocol = preferredProtocol.toString();
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
        if (getPreferredProtocol() != null)
            sb.append("PreferredProtocol: ").append(getPreferredProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingExperienceSettings == false)
            return false;
        StreamingExperienceSettings other = (StreamingExperienceSettings) obj;
        if (other.getPreferredProtocol() == null ^ this.getPreferredProtocol() == null)
            return false;
        if (other.getPreferredProtocol() != null && other.getPreferredProtocol().equals(this.getPreferredProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreferredProtocol() == null) ? 0 : getPreferredProtocol().hashCode());
        return hashCode;
    }

    @Override
    public StreamingExperienceSettings clone() {
        try {
            return (StreamingExperienceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.StreamingExperienceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
