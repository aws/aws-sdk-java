/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains an AWS Region name as the result of a successful call to the <a>DescribeSourceRegions</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/SourceRegion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceRegion implements Serializable, Cloneable {

    /**
     * <p>
     * The source region name.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * The source region endpoint.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The status of the source region.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The source region name.
     * </p>
     * 
     * @param regionName
     *        The source region name.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The source region name.
     * </p>
     * 
     * @return The source region name.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The source region name.
     * </p>
     * 
     * @param regionName
     *        The source region name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRegion withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * The source region endpoint.
     * </p>
     * 
     * @param endpoint
     *        The source region endpoint.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The source region endpoint.
     * </p>
     * 
     * @return The source region endpoint.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The source region endpoint.
     * </p>
     * 
     * @param endpoint
     *        The source region endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRegion withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The status of the source region.
     * </p>
     * 
     * @param status
     *        The status of the source region.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the source region.
     * </p>
     * 
     * @return The status of the source region.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the source region.
     * </p>
     * 
     * @param status
     *        The status of the source region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRegion withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceRegion == false)
            return false;
        SourceRegion other = (SourceRegion) obj;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SourceRegion clone() {
        try {
            return (SourceRegion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
