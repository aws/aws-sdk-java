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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the license data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/LicenseInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the license.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The URL for license data.
     * </p>
     */
    private String url;

    /**
     * <p>
     * Name of the license.
     * </p>
     * 
     * @param name
     *        Name of the license.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the license.
     * </p>
     * 
     * @return Name of the license.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the license.
     * </p>
     * 
     * @param name
     *        Name of the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The URL for license data.
     * </p>
     * 
     * @param url
     *        The URL for license data.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL for license data.
     * </p>
     * 
     * @return The URL for license data.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL for license data.
     * </p>
     * 
     * @param url
     *        The URL for license data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseInfo withUrl(String url) {
        setUrl(url);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LicenseInfo == false)
            return false;
        LicenseInfo other = (LicenseInfo) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public LicenseInfo clone() {
        try {
            return (LicenseInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.LicenseInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
