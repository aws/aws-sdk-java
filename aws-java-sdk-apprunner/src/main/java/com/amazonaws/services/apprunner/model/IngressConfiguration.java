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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Network configuration settings for inbound network traffic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/IngressConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngressConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether your App Runner service is publicly accessible. To make the service publicly accessible set it
     * to <code>True</code>. To make the service privately accessible, from only within an Amazon VPC set it to
     * <code>False</code>.
     * </p>
     */
    private Boolean isPubliclyAccessible;

    /**
     * <p>
     * Specifies whether your App Runner service is publicly accessible. To make the service publicly accessible set it
     * to <code>True</code>. To make the service privately accessible, from only within an Amazon VPC set it to
     * <code>False</code>.
     * </p>
     * 
     * @param isPubliclyAccessible
     *        Specifies whether your App Runner service is publicly accessible. To make the service publicly accessible
     *        set it to <code>True</code>. To make the service privately accessible, from only within an Amazon VPC set
     *        it to <code>False</code>.
     */

    public void setIsPubliclyAccessible(Boolean isPubliclyAccessible) {
        this.isPubliclyAccessible = isPubliclyAccessible;
    }

    /**
     * <p>
     * Specifies whether your App Runner service is publicly accessible. To make the service publicly accessible set it
     * to <code>True</code>. To make the service privately accessible, from only within an Amazon VPC set it to
     * <code>False</code>.
     * </p>
     * 
     * @return Specifies whether your App Runner service is publicly accessible. To make the service publicly accessible
     *         set it to <code>True</code>. To make the service privately accessible, from only within an Amazon VPC set
     *         it to <code>False</code>.
     */

    public Boolean getIsPubliclyAccessible() {
        return this.isPubliclyAccessible;
    }

    /**
     * <p>
     * Specifies whether your App Runner service is publicly accessible. To make the service publicly accessible set it
     * to <code>True</code>. To make the service privately accessible, from only within an Amazon VPC set it to
     * <code>False</code>.
     * </p>
     * 
     * @param isPubliclyAccessible
     *        Specifies whether your App Runner service is publicly accessible. To make the service publicly accessible
     *        set it to <code>True</code>. To make the service privately accessible, from only within an Amazon VPC set
     *        it to <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressConfiguration withIsPubliclyAccessible(Boolean isPubliclyAccessible) {
        setIsPubliclyAccessible(isPubliclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies whether your App Runner service is publicly accessible. To make the service publicly accessible set it
     * to <code>True</code>. To make the service privately accessible, from only within an Amazon VPC set it to
     * <code>False</code>.
     * </p>
     * 
     * @return Specifies whether your App Runner service is publicly accessible. To make the service publicly accessible
     *         set it to <code>True</code>. To make the service privately accessible, from only within an Amazon VPC set
     *         it to <code>False</code>.
     */

    public Boolean isPubliclyAccessible() {
        return this.isPubliclyAccessible;
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
        if (getIsPubliclyAccessible() != null)
            sb.append("IsPubliclyAccessible: ").append(getIsPubliclyAccessible());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngressConfiguration == false)
            return false;
        IngressConfiguration other = (IngressConfiguration) obj;
        if (other.getIsPubliclyAccessible() == null ^ this.getIsPubliclyAccessible() == null)
            return false;
        if (other.getIsPubliclyAccessible() != null && other.getIsPubliclyAccessible().equals(this.getIsPubliclyAccessible()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsPubliclyAccessible() == null) ? 0 : getIsPubliclyAccessible().hashCode());
        return hashCode;
    }

    @Override
    public IngressConfiguration clone() {
        try {
            return (IngressConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.IngressConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
