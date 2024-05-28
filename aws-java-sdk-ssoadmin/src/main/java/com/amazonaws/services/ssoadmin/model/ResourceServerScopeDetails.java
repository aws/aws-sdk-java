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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes details for an IAM Identity Center access scope that is associated with a resource server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ResourceServerScopeDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceServerScopeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The title of an access scope for a resource server.
     * </p>
     */
    private String detailedTitle;
    /**
     * <p>
     * The description of an access scope for a resource server.
     * </p>
     */
    private String longDescription;

    /**
     * <p>
     * The title of an access scope for a resource server.
     * </p>
     * 
     * @param detailedTitle
     *        The title of an access scope for a resource server.
     */

    public void setDetailedTitle(String detailedTitle) {
        this.detailedTitle = detailedTitle;
    }

    /**
     * <p>
     * The title of an access scope for a resource server.
     * </p>
     * 
     * @return The title of an access scope for a resource server.
     */

    public String getDetailedTitle() {
        return this.detailedTitle;
    }

    /**
     * <p>
     * The title of an access scope for a resource server.
     * </p>
     * 
     * @param detailedTitle
     *        The title of an access scope for a resource server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceServerScopeDetails withDetailedTitle(String detailedTitle) {
        setDetailedTitle(detailedTitle);
        return this;
    }

    /**
     * <p>
     * The description of an access scope for a resource server.
     * </p>
     * 
     * @param longDescription
     *        The description of an access scope for a resource server.
     */

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * <p>
     * The description of an access scope for a resource server.
     * </p>
     * 
     * @return The description of an access scope for a resource server.
     */

    public String getLongDescription() {
        return this.longDescription;
    }

    /**
     * <p>
     * The description of an access scope for a resource server.
     * </p>
     * 
     * @param longDescription
     *        The description of an access scope for a resource server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceServerScopeDetails withLongDescription(String longDescription) {
        setLongDescription(longDescription);
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
        if (getDetailedTitle() != null)
            sb.append("DetailedTitle: ").append(getDetailedTitle()).append(",");
        if (getLongDescription() != null)
            sb.append("LongDescription: ").append(getLongDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceServerScopeDetails == false)
            return false;
        ResourceServerScopeDetails other = (ResourceServerScopeDetails) obj;
        if (other.getDetailedTitle() == null ^ this.getDetailedTitle() == null)
            return false;
        if (other.getDetailedTitle() != null && other.getDetailedTitle().equals(this.getDetailedTitle()) == false)
            return false;
        if (other.getLongDescription() == null ^ this.getLongDescription() == null)
            return false;
        if (other.getLongDescription() != null && other.getLongDescription().equals(this.getLongDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetailedTitle() == null) ? 0 : getDetailedTitle().hashCode());
        hashCode = prime * hashCode + ((getLongDescription() == null) ? 0 : getLongDescription().hashCode());
        return hashCode;
    }

    @Override
    public ResourceServerScopeDetails clone() {
        try {
            return (ResourceServerScopeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.ResourceServerScopeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
