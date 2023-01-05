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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the package origin configuration of a package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PackageOriginConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageOriginConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>PackageOriginRestrictions</code> object that contains information about the upstream and publish package
     * origin configuration for the package.
     * </p>
     */
    private PackageOriginRestrictions restrictions;

    /**
     * <p>
     * A <code>PackageOriginRestrictions</code> object that contains information about the upstream and publish package
     * origin configuration for the package.
     * </p>
     * 
     * @param restrictions
     *        A <code>PackageOriginRestrictions</code> object that contains information about the upstream and publish
     *        package origin configuration for the package.
     */

    public void setRestrictions(PackageOriginRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p>
     * A <code>PackageOriginRestrictions</code> object that contains information about the upstream and publish package
     * origin configuration for the package.
     * </p>
     * 
     * @return A <code>PackageOriginRestrictions</code> object that contains information about the upstream and publish
     *         package origin configuration for the package.
     */

    public PackageOriginRestrictions getRestrictions() {
        return this.restrictions;
    }

    /**
     * <p>
     * A <code>PackageOriginRestrictions</code> object that contains information about the upstream and publish package
     * origin configuration for the package.
     * </p>
     * 
     * @param restrictions
     *        A <code>PackageOriginRestrictions</code> object that contains information about the upstream and publish
     *        package origin configuration for the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageOriginConfiguration withRestrictions(PackageOriginRestrictions restrictions) {
        setRestrictions(restrictions);
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
        if (getRestrictions() != null)
            sb.append("Restrictions: ").append(getRestrictions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageOriginConfiguration == false)
            return false;
        PackageOriginConfiguration other = (PackageOriginConfiguration) obj;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        return hashCode;
    }

    @Override
    public PackageOriginConfiguration clone() {
        try {
            return (PackageOriginConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.PackageOriginConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
