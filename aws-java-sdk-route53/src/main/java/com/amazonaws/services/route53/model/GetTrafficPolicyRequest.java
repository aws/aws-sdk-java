/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about a specific traffic policy version. To get the information, send a GET request to the
 * /2013-04-01/trafficpolicy resource, and specify the ID and the version of the traffic policy.
 * </p>
 */
public class GetTrafficPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the traffic policy that you want to get information about.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The version number of the traffic policy that you want to get information about.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The ID of the traffic policy that you want to get information about.
     * </p>
     * 
     * @param id
     *        The ID of the traffic policy that you want to get information about.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want to get information about.
     * </p>
     * 
     * @return The ID of the traffic policy that you want to get information about.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want to get information about.
     * </p>
     * 
     * @param id
     *        The ID of the traffic policy that you want to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrafficPolicyRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The version number of the traffic policy that you want to get information about.
     * </p>
     * 
     * @param version
     *        The version number of the traffic policy that you want to get information about.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the traffic policy that you want to get information about.
     * </p>
     * 
     * @return The version number of the traffic policy that you want to get information about.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the traffic policy that you want to get information about.
     * </p>
     * 
     * @param version
     *        The version number of the traffic policy that you want to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrafficPolicyRequest withVersion(Integer version) {
        setVersion(version);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTrafficPolicyRequest == false)
            return false;
        GetTrafficPolicyRequest other = (GetTrafficPolicyRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetTrafficPolicyRequest clone() {
        return (GetTrafficPolicyRequest) super.clone();
    }
}
