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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PutPackageOriginConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPackageOriginConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginConfiguration.html">
     * PackageOriginConfiguration</a> object that describes the origin configuration set for the package. It contains a
     * <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html">
     * PackageOriginRestrictions</a> object that describes how new versions of the package can be introduced to the
     * repository.
     * </p>
     */
    private PackageOriginConfiguration originConfiguration;

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginConfiguration.html">
     * PackageOriginConfiguration</a> object that describes the origin configuration set for the package. It contains a
     * <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html">
     * PackageOriginRestrictions</a> object that describes how new versions of the package can be introduced to the
     * repository.
     * </p>
     * 
     * @param originConfiguration
     *        A <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginConfiguration.html"
     *        >PackageOriginConfiguration</a> object that describes the origin configuration set for the package. It
     *        contains a <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *        >PackageOriginRestrictions</a> object that describes how new versions of the package can be introduced to
     *        the repository.
     */

    public void setOriginConfiguration(PackageOriginConfiguration originConfiguration) {
        this.originConfiguration = originConfiguration;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginConfiguration.html">
     * PackageOriginConfiguration</a> object that describes the origin configuration set for the package. It contains a
     * <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html">
     * PackageOriginRestrictions</a> object that describes how new versions of the package can be introduced to the
     * repository.
     * </p>
     * 
     * @return A <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginConfiguration.html"
     *         >PackageOriginConfiguration</a> object that describes the origin configuration set for the package. It
     *         contains a <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *         >PackageOriginRestrictions</a> object that describes how new versions of the package can be introduced to
     *         the repository.
     */

    public PackageOriginConfiguration getOriginConfiguration() {
        return this.originConfiguration;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginConfiguration.html">
     * PackageOriginConfiguration</a> object that describes the origin configuration set for the package. It contains a
     * <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html">
     * PackageOriginRestrictions</a> object that describes how new versions of the package can be introduced to the
     * repository.
     * </p>
     * 
     * @param originConfiguration
     *        A <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginConfiguration.html"
     *        >PackageOriginConfiguration</a> object that describes the origin configuration set for the package. It
     *        contains a <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *        >PackageOriginRestrictions</a> object that describes how new versions of the package can be introduced to
     *        the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPackageOriginConfigurationResult withOriginConfiguration(PackageOriginConfiguration originConfiguration) {
        setOriginConfiguration(originConfiguration);
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
        if (getOriginConfiguration() != null)
            sb.append("OriginConfiguration: ").append(getOriginConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPackageOriginConfigurationResult == false)
            return false;
        PutPackageOriginConfigurationResult other = (PutPackageOriginConfigurationResult) obj;
        if (other.getOriginConfiguration() == null ^ this.getOriginConfiguration() == null)
            return false;
        if (other.getOriginConfiguration() != null && other.getOriginConfiguration().equals(this.getOriginConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginConfiguration() == null) ? 0 : getOriginConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutPackageOriginConfigurationResult clone() {
        try {
            return (PutPackageOriginConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
