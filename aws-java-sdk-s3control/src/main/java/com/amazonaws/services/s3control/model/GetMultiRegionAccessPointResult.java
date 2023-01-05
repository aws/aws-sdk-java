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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMultiRegionAccessPointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A container element containing the details of the requested Multi-Region Access Point.
     * </p>
     */
    private MultiRegionAccessPointReport accessPoint;

    /**
     * <p>
     * A container element containing the details of the requested Multi-Region Access Point.
     * </p>
     * 
     * @param accessPoint
     *        A container element containing the details of the requested Multi-Region Access Point.
     */

    public void setAccessPoint(MultiRegionAccessPointReport accessPoint) {
        this.accessPoint = accessPoint;
    }

    /**
     * <p>
     * A container element containing the details of the requested Multi-Region Access Point.
     * </p>
     * 
     * @return A container element containing the details of the requested Multi-Region Access Point.
     */

    public MultiRegionAccessPointReport getAccessPoint() {
        return this.accessPoint;
    }

    /**
     * <p>
     * A container element containing the details of the requested Multi-Region Access Point.
     * </p>
     * 
     * @param accessPoint
     *        A container element containing the details of the requested Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMultiRegionAccessPointResult withAccessPoint(MultiRegionAccessPointReport accessPoint) {
        setAccessPoint(accessPoint);
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
        if (getAccessPoint() != null)
            sb.append("AccessPoint: ").append(getAccessPoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMultiRegionAccessPointResult == false)
            return false;
        GetMultiRegionAccessPointResult other = (GetMultiRegionAccessPointResult) obj;
        if (other.getAccessPoint() == null ^ this.getAccessPoint() == null)
            return false;
        if (other.getAccessPoint() != null && other.getAccessPoint().equals(this.getAccessPoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPoint() == null) ? 0 : getAccessPoint().hashCode());
        return hashCode;
    }

    @Override
    public GetMultiRegionAccessPointResult clone() {
        try {
            return (GetMultiRegionAccessPointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
