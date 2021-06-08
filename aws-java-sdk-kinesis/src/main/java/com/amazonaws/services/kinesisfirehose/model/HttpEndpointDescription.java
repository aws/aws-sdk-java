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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the HTTP endpoint selected as the destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/HttpEndpointDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpEndpointDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of the HTTP endpoint selected as the destination.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The name of the HTTP endpoint selected as the destination.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The URL of the HTTP endpoint selected as the destination.
     * </p>
     * 
     * @param url
     *        The URL of the HTTP endpoint selected as the destination.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the HTTP endpoint selected as the destination.
     * </p>
     * 
     * @return The URL of the HTTP endpoint selected as the destination.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of the HTTP endpoint selected as the destination.
     * </p>
     * 
     * @param url
     *        The URL of the HTTP endpoint selected as the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointDescription withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The name of the HTTP endpoint selected as the destination.
     * </p>
     * 
     * @param name
     *        The name of the HTTP endpoint selected as the destination.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the HTTP endpoint selected as the destination.
     * </p>
     * 
     * @return The name of the HTTP endpoint selected as the destination.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the HTTP endpoint selected as the destination.
     * </p>
     * 
     * @param name
     *        The name of the HTTP endpoint selected as the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointDescription withName(String name) {
        setName(name);
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
        if (getUrl() != null)
            sb.append("Url: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpEndpointDescription == false)
            return false;
        HttpEndpointDescription other = (HttpEndpointDescription) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public HttpEndpointDescription clone() {
        try {
            return (HttpEndpointDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.HttpEndpointDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
