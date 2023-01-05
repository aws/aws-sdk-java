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
 * Information about how a package version was added to a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PackageVersionOrigin" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageVersionOrigin implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainEntryPoint.html">DomainEntryPoint
     * </a> object that contains information about from which repository or external connection the package version was
     * added to the domain.
     * </p>
     */
    private DomainEntryPoint domainEntryPoint;
    /**
     * <p>
     * Describes how the package version was originally added to the domain. An <code>INTERNAL</code> origin type means
     * the package version was published directly to a repository in the domain. An <code>EXTERNAL</code> origin type
     * means the package version was ingested from an external connection.
     * </p>
     */
    private String originType;

    /**
     * <p>
     * A <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainEntryPoint.html">DomainEntryPoint
     * </a> object that contains information about from which repository or external connection the package version was
     * added to the domain.
     * </p>
     * 
     * @param domainEntryPoint
     *        A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainEntryPoint.html">
     *        DomainEntryPoint</a> object that contains information about from which repository or external connection
     *        the package version was added to the domain.
     */

    public void setDomainEntryPoint(DomainEntryPoint domainEntryPoint) {
        this.domainEntryPoint = domainEntryPoint;
    }

    /**
     * <p>
     * A <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainEntryPoint.html">DomainEntryPoint
     * </a> object that contains information about from which repository or external connection the package version was
     * added to the domain.
     * </p>
     * 
     * @return A <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainEntryPoint.html">DomainEntryPoint
     *         </a> object that contains information about from which repository or external connection the package
     *         version was added to the domain.
     */

    public DomainEntryPoint getDomainEntryPoint() {
        return this.domainEntryPoint;
    }

    /**
     * <p>
     * A <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainEntryPoint.html">DomainEntryPoint
     * </a> object that contains information about from which repository or external connection the package version was
     * added to the domain.
     * </p>
     * 
     * @param domainEntryPoint
     *        A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainEntryPoint.html">
     *        DomainEntryPoint</a> object that contains information about from which repository or external connection
     *        the package version was added to the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionOrigin withDomainEntryPoint(DomainEntryPoint domainEntryPoint) {
        setDomainEntryPoint(domainEntryPoint);
        return this;
    }

    /**
     * <p>
     * Describes how the package version was originally added to the domain. An <code>INTERNAL</code> origin type means
     * the package version was published directly to a repository in the domain. An <code>EXTERNAL</code> origin type
     * means the package version was ingested from an external connection.
     * </p>
     * 
     * @param originType
     *        Describes how the package version was originally added to the domain. An <code>INTERNAL</code> origin type
     *        means the package version was published directly to a repository in the domain. An <code>EXTERNAL</code>
     *        origin type means the package version was ingested from an external connection.
     * @see PackageVersionOriginType
     */

    public void setOriginType(String originType) {
        this.originType = originType;
    }

    /**
     * <p>
     * Describes how the package version was originally added to the domain. An <code>INTERNAL</code> origin type means
     * the package version was published directly to a repository in the domain. An <code>EXTERNAL</code> origin type
     * means the package version was ingested from an external connection.
     * </p>
     * 
     * @return Describes how the package version was originally added to the domain. An <code>INTERNAL</code> origin
     *         type means the package version was published directly to a repository in the domain. An
     *         <code>EXTERNAL</code> origin type means the package version was ingested from an external connection.
     * @see PackageVersionOriginType
     */

    public String getOriginType() {
        return this.originType;
    }

    /**
     * <p>
     * Describes how the package version was originally added to the domain. An <code>INTERNAL</code> origin type means
     * the package version was published directly to a repository in the domain. An <code>EXTERNAL</code> origin type
     * means the package version was ingested from an external connection.
     * </p>
     * 
     * @param originType
     *        Describes how the package version was originally added to the domain. An <code>INTERNAL</code> origin type
     *        means the package version was published directly to a repository in the domain. An <code>EXTERNAL</code>
     *        origin type means the package version was ingested from an external connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionOriginType
     */

    public PackageVersionOrigin withOriginType(String originType) {
        setOriginType(originType);
        return this;
    }

    /**
     * <p>
     * Describes how the package version was originally added to the domain. An <code>INTERNAL</code> origin type means
     * the package version was published directly to a repository in the domain. An <code>EXTERNAL</code> origin type
     * means the package version was ingested from an external connection.
     * </p>
     * 
     * @param originType
     *        Describes how the package version was originally added to the domain. An <code>INTERNAL</code> origin type
     *        means the package version was published directly to a repository in the domain. An <code>EXTERNAL</code>
     *        origin type means the package version was ingested from an external connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionOriginType
     */

    public PackageVersionOrigin withOriginType(PackageVersionOriginType originType) {
        this.originType = originType.toString();
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
        if (getDomainEntryPoint() != null)
            sb.append("DomainEntryPoint: ").append(getDomainEntryPoint()).append(",");
        if (getOriginType() != null)
            sb.append("OriginType: ").append(getOriginType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageVersionOrigin == false)
            return false;
        PackageVersionOrigin other = (PackageVersionOrigin) obj;
        if (other.getDomainEntryPoint() == null ^ this.getDomainEntryPoint() == null)
            return false;
        if (other.getDomainEntryPoint() != null && other.getDomainEntryPoint().equals(this.getDomainEntryPoint()) == false)
            return false;
        if (other.getOriginType() == null ^ this.getOriginType() == null)
            return false;
        if (other.getOriginType() != null && other.getOriginType().equals(this.getOriginType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainEntryPoint() == null) ? 0 : getDomainEntryPoint().hashCode());
        hashCode = prime * hashCode + ((getOriginType() == null) ? 0 : getOriginType().hashCode());
        return hashCode;
    }

    @Override
    public PackageVersionOrigin clone() {
        try {
            return (PackageVersionOrigin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.PackageVersionOriginMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
