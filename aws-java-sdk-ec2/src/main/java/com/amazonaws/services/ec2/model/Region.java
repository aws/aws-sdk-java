/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Region" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Region implements Serializable, Cloneable {

    /**
     * <p>
     * The Region service endpoint.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The name of the Region.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * The Region opt-in status. The possible values are <code>opt-in-not-required</code>, <code>opted-in</code>, and
     * <code>not-opted-in</code>.
     * </p>
     */
    private String optInStatus;

    /**
     * <p>
     * The Region service endpoint.
     * </p>
     * 
     * @param endpoint
     *        The Region service endpoint.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The Region service endpoint.
     * </p>
     * 
     * @return The Region service endpoint.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The Region service endpoint.
     * </p>
     * 
     * @param endpoint
     *        The Region service endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Region withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * 
     * @param regionName
     *        The name of the Region.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * 
     * @return The name of the Region.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * 
     * @param regionName
     *        The name of the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Region withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * The Region opt-in status. The possible values are <code>opt-in-not-required</code>, <code>opted-in</code>, and
     * <code>not-opted-in</code>.
     * </p>
     * 
     * @param optInStatus
     *        The Region opt-in status. The possible values are <code>opt-in-not-required</code>, <code>opted-in</code>,
     *        and <code>not-opted-in</code>.
     */

    public void setOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
    }

    /**
     * <p>
     * The Region opt-in status. The possible values are <code>opt-in-not-required</code>, <code>opted-in</code>, and
     * <code>not-opted-in</code>.
     * </p>
     * 
     * @return The Region opt-in status. The possible values are <code>opt-in-not-required</code>, <code>opted-in</code>
     *         , and <code>not-opted-in</code>.
     */

    public String getOptInStatus() {
        return this.optInStatus;
    }

    /**
     * <p>
     * The Region opt-in status. The possible values are <code>opt-in-not-required</code>, <code>opted-in</code>, and
     * <code>not-opted-in</code>.
     * </p>
     * 
     * @param optInStatus
     *        The Region opt-in status. The possible values are <code>opt-in-not-required</code>, <code>opted-in</code>,
     *        and <code>not-opted-in</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Region withOptInStatus(String optInStatus) {
        setOptInStatus(optInStatus);
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName()).append(",");
        if (getOptInStatus() != null)
            sb.append("OptInStatus: ").append(getOptInStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Region == false)
            return false;
        Region other = (Region) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getOptInStatus() == null ^ this.getOptInStatus() == null)
            return false;
        if (other.getOptInStatus() != null && other.getOptInStatus().equals(this.getOptInStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getOptInStatus() == null) ? 0 : getOptInStatus().hashCode());
        return hashCode;
    }

    @Override
    public Region clone() {
        try {
            return (Region) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
