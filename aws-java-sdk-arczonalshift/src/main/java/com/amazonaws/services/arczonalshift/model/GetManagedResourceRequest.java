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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/GetManagedResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetManagedResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for
     * the resource.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     */
    private String resourceIdentifier;

    /**
     * <p>
     * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for
     * the resource.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name
     *        (ARN) for the resource.</p>
     *        <p>
     *        At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers
     *        with cross-zone load balancing turned off.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for
     * the resource.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * 
     * @return The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name
     *         (ARN) for the resource.</p>
     *         <p>
     *         At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers
     *         with cross-zone load balancing turned off.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for
     * the resource.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name
     *        (ARN) for the resource.</p>
     *        <p>
     *        At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers
     *        with cross-zone load balancing turned off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedResourceRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
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
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetManagedResourceRequest == false)
            return false;
        GetManagedResourceRequest other = (GetManagedResourceRequest) obj;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetManagedResourceRequest clone() {
        return (GetManagedResourceRequest) super.clone();
    }

}
