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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing the identity provider (IdP) metadata used to integrate the identity provider with this
 * workspace. You can specify the metadata either by providing a URL to its location in the <code>url</code> parameter,
 * or by specifying the full metadata in XML format in the <code>xml</code> parameter. Specifying both will cause an
 * error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/IdpMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdpMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of the location containing the IdP metadata.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The full IdP metadata, in XML format.
     * </p>
     */
    private String xml;

    /**
     * <p>
     * The URL of the location containing the IdP metadata.
     * </p>
     * 
     * @param url
     *        The URL of the location containing the IdP metadata.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the location containing the IdP metadata.
     * </p>
     * 
     * @return The URL of the location containing the IdP metadata.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of the location containing the IdP metadata.
     * </p>
     * 
     * @param url
     *        The URL of the location containing the IdP metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdpMetadata withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The full IdP metadata, in XML format.
     * </p>
     * 
     * @param xml
     *        The full IdP metadata, in XML format.
     */

    public void setXml(String xml) {
        this.xml = xml;
    }

    /**
     * <p>
     * The full IdP metadata, in XML format.
     * </p>
     * 
     * @return The full IdP metadata, in XML format.
     */

    public String getXml() {
        return this.xml;
    }

    /**
     * <p>
     * The full IdP metadata, in XML format.
     * </p>
     * 
     * @param xml
     *        The full IdP metadata, in XML format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdpMetadata withXml(String xml) {
        setXml(xml);
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
            sb.append("Url: ").append(getUrl()).append(",");
        if (getXml() != null)
            sb.append("Xml: ").append(getXml());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdpMetadata == false)
            return false;
        IdpMetadata other = (IdpMetadata) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getXml() == null ^ this.getXml() == null)
            return false;
        if (other.getXml() != null && other.getXml().equals(this.getXml()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getXml() == null) ? 0 : getXml().hashCode());
        return hashCode;
    }

    @Override
    public IdpMetadata clone() {
        try {
            return (IdpMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.IdpMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
