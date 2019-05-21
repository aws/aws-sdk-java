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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/EndpointOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointOptions implements Serializable, Cloneable, StructuredPojo {

    private Boolean fips;

    private Boolean privateLink;

    /**
     * @param fips
     */

    public void setFips(Boolean fips) {
        this.fips = fips;
    }

    /**
     * @return
     */

    public Boolean getFips() {
        return this.fips;
    }

    /**
     * @param fips
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointOptions withFips(Boolean fips) {
        setFips(fips);
        return this;
    }

    /**
     * @return
     */

    public Boolean isFips() {
        return this.fips;
    }

    /**
     * @param privateLink
     */

    public void setPrivateLink(Boolean privateLink) {
        this.privateLink = privateLink;
    }

    /**
     * @return
     */

    public Boolean getPrivateLink() {
        return this.privateLink;
    }

    /**
     * @param privateLink
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointOptions withPrivateLink(Boolean privateLink) {
        setPrivateLink(privateLink);
        return this;
    }

    /**
     * @return
     */

    public Boolean isPrivateLink() {
        return this.privateLink;
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
        if (getFips() != null)
            sb.append("Fips: ").append(getFips()).append(",");
        if (getPrivateLink() != null)
            sb.append("PrivateLink: ").append(getPrivateLink());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointOptions == false)
            return false;
        EndpointOptions other = (EndpointOptions) obj;
        if (other.getFips() == null ^ this.getFips() == null)
            return false;
        if (other.getFips() != null && other.getFips().equals(this.getFips()) == false)
            return false;
        if (other.getPrivateLink() == null ^ this.getPrivateLink() == null)
            return false;
        if (other.getPrivateLink() != null && other.getPrivateLink().equals(this.getPrivateLink()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFips() == null) ? 0 : getFips().hashCode());
        hashCode = prime * hashCode + ((getPrivateLink() == null) ? 0 : getPrivateLink().hashCode());
        return hashCode;
    }

    @Override
    public EndpointOptions clone() {
        try {
            return (EndpointOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.EndpointOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
