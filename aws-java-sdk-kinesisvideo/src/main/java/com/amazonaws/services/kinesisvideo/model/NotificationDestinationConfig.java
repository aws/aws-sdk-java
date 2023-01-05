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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure that contains the information required to deliver a notification to a customer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/NotificationDestinationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationDestinationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Uniform Resource Identifier (URI) that identifies where the images will be delivered.
     * </p>
     */
    private String uri;

    /**
     * <p>
     * The Uniform Resource Identifier (URI) that identifies where the images will be delivered.
     * </p>
     * 
     * @param uri
     *        The Uniform Resource Identifier (URI) that identifies where the images will be delivered.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) that identifies where the images will be delivered.
     * </p>
     * 
     * @return The Uniform Resource Identifier (URI) that identifies where the images will be delivered.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) that identifies where the images will be delivered.
     * </p>
     * 
     * @param uri
     *        The Uniform Resource Identifier (URI) that identifies where the images will be delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationDestinationConfig withUri(String uri) {
        setUri(uri);
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
        if (getUri() != null)
            sb.append("Uri: ").append(getUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationDestinationConfig == false)
            return false;
        NotificationDestinationConfig other = (NotificationDestinationConfig) obj;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        return hashCode;
    }

    @Override
    public NotificationDestinationConfig clone() {
        try {
            return (NotificationDestinationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.NotificationDestinationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
