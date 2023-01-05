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
 * Details about the origin restrictions set on the package. The package origin restrictions determine how new versions
 * of a package can be added to a specific repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PackageOriginRestrictions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageOriginRestrictions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The package origin configuration that determines if new versions of the package can be published directly to the
     * repository.
     * </p>
     */
    private String publish;
    /**
     * <p>
     * The package origin configuration that determines if new versions of the package can be added to the repository
     * from an external connection or upstream source.
     * </p>
     */
    private String upstream;

    /**
     * <p>
     * The package origin configuration that determines if new versions of the package can be published directly to the
     * repository.
     * </p>
     * 
     * @param publish
     *        The package origin configuration that determines if new versions of the package can be published directly
     *        to the repository.
     * @see AllowPublish
     */

    public void setPublish(String publish) {
        this.publish = publish;
    }

    /**
     * <p>
     * The package origin configuration that determines if new versions of the package can be published directly to the
     * repository.
     * </p>
     * 
     * @return The package origin configuration that determines if new versions of the package can be published directly
     *         to the repository.
     * @see AllowPublish
     */

    public String getPublish() {
        return this.publish;
    }

    /**
     * <p>
     * The package origin configuration that determines if new versions of the package can be published directly to the
     * repository.
     * </p>
     * 
     * @param publish
     *        The package origin configuration that determines if new versions of the package can be published directly
     *        to the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowPublish
     */

    public PackageOriginRestrictions withPublish(String publish) {
        setPublish(publish);
        return this;
    }

    /**
     * <p>
     * The package origin configuration that determines if new versions of the package can be published directly to the
     * repository.
     * </p>
     * 
     * @param publish
     *        The package origin configuration that determines if new versions of the package can be published directly
     *        to the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowPublish
     */

    public PackageOriginRestrictions withPublish(AllowPublish publish) {
        this.publish = publish.toString();
        return this;
    }

    /**
     * <p>
     * The package origin configuration that determines if new versions of the package can be added to the repository
     * from an external connection or upstream source.
     * </p>
     * 
     * @param upstream
     *        The package origin configuration that determines if new versions of the package can be added to the
     *        repository from an external connection or upstream source.
     * @see AllowUpstream
     */

    public void setUpstream(String upstream) {
        this.upstream = upstream;
    }

    /**
     * <p>
     * The package origin configuration that determines if new versions of the package can be added to the repository
     * from an external connection or upstream source.
     * </p>
     * 
     * @return The package origin configuration that determines if new versions of the package can be added to the
     *         repository from an external connection or upstream source.
     * @see AllowUpstream
     */

    public String getUpstream() {
        return this.upstream;
    }

    /**
     * <p>
     * The package origin configuration that determines if new versions of the package can be added to the repository
     * from an external connection or upstream source.
     * </p>
     * 
     * @param upstream
     *        The package origin configuration that determines if new versions of the package can be added to the
     *        repository from an external connection or upstream source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowUpstream
     */

    public PackageOriginRestrictions withUpstream(String upstream) {
        setUpstream(upstream);
        return this;
    }

    /**
     * <p>
     * The package origin configuration that determines if new versions of the package can be added to the repository
     * from an external connection or upstream source.
     * </p>
     * 
     * @param upstream
     *        The package origin configuration that determines if new versions of the package can be added to the
     *        repository from an external connection or upstream source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowUpstream
     */

    public PackageOriginRestrictions withUpstream(AllowUpstream upstream) {
        this.upstream = upstream.toString();
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
        if (getPublish() != null)
            sb.append("Publish: ").append(getPublish()).append(",");
        if (getUpstream() != null)
            sb.append("Upstream: ").append(getUpstream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageOriginRestrictions == false)
            return false;
        PackageOriginRestrictions other = (PackageOriginRestrictions) obj;
        if (other.getPublish() == null ^ this.getPublish() == null)
            return false;
        if (other.getPublish() != null && other.getPublish().equals(this.getPublish()) == false)
            return false;
        if (other.getUpstream() == null ^ this.getUpstream() == null)
            return false;
        if (other.getUpstream() != null && other.getUpstream().equals(this.getUpstream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublish() == null) ? 0 : getPublish().hashCode());
        hashCode = prime * hashCode + ((getUpstream() == null) ? 0 : getUpstream().hashCode());
        return hashCode;
    }

    @Override
    public PackageOriginRestrictions clone() {
        try {
            return (PackageOriginRestrictions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.PackageOriginRestrictionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
