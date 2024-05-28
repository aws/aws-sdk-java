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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/GetTrustStoreCaCertificatesBundle"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTrustStoreCaCertificatesBundleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ca certificate bundles Amazon S3 URI.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The ca certificate bundles Amazon S3 URI.
     * </p>
     * 
     * @param location
     *        The ca certificate bundles Amazon S3 URI.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The ca certificate bundles Amazon S3 URI.
     * </p>
     * 
     * @return The ca certificate bundles Amazon S3 URI.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The ca certificate bundles Amazon S3 URI.
     * </p>
     * 
     * @param location
     *        The ca certificate bundles Amazon S3 URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrustStoreCaCertificatesBundleResult withLocation(String location) {
        setLocation(location);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTrustStoreCaCertificatesBundleResult == false)
            return false;
        GetTrustStoreCaCertificatesBundleResult other = (GetTrustStoreCaCertificatesBundleResult) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public GetTrustStoreCaCertificatesBundleResult clone() {
        try {
            return (GetTrustStoreCaCertificatesBundleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
