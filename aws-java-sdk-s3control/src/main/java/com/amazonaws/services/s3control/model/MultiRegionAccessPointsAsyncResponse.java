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
 * <p>
 * The Multi-Region Access Point details that are returned when querying about an asynchronous request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/MultiRegionAccessPointsAsyncResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiRegionAccessPointsAsyncResponse implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of status information for the different Regions that a Multi-Region Access Point supports.
     * </p>
     */
    private java.util.List<MultiRegionAccessPointRegionalResponse> regions;

    /**
     * <p>
     * A collection of status information for the different Regions that a Multi-Region Access Point supports.
     * </p>
     * 
     * @return A collection of status information for the different Regions that a Multi-Region Access Point supports.
     */

    public java.util.List<MultiRegionAccessPointRegionalResponse> getRegions() {
        return regions;
    }

    /**
     * <p>
     * A collection of status information for the different Regions that a Multi-Region Access Point supports.
     * </p>
     * 
     * @param regions
     *        A collection of status information for the different Regions that a Multi-Region Access Point supports.
     */

    public void setRegions(java.util.Collection<MultiRegionAccessPointRegionalResponse> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<MultiRegionAccessPointRegionalResponse>(regions);
    }

    /**
     * <p>
     * A collection of status information for the different Regions that a Multi-Region Access Point supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        A collection of status information for the different Regions that a Multi-Region Access Point supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointsAsyncResponse withRegions(MultiRegionAccessPointRegionalResponse... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<MultiRegionAccessPointRegionalResponse>(regions.length));
        }
        for (MultiRegionAccessPointRegionalResponse ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of status information for the different Regions that a Multi-Region Access Point supports.
     * </p>
     * 
     * @param regions
     *        A collection of status information for the different Regions that a Multi-Region Access Point supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointsAsyncResponse withRegions(java.util.Collection<MultiRegionAccessPointRegionalResponse> regions) {
        setRegions(regions);
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
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiRegionAccessPointsAsyncResponse == false)
            return false;
        MultiRegionAccessPointsAsyncResponse other = (MultiRegionAccessPointsAsyncResponse) obj;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public MultiRegionAccessPointsAsyncResponse clone() {
        try {
            return (MultiRegionAccessPointsAsyncResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
