/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateLag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLagRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     */
    private String lagId;
    /**
     * <p>
     * The name of the LAG.
     * </p>
     */
    private String lagName;
    /**
     * <p>
     * The minimum number of physical connections that must be operational for the LAG itself to be operational.
     * </p>
     */
    private Integer minimumLinks;

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * 
     * @param lagId
     *        The ID of the LAG.
     */

    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * 
     * @return The ID of the LAG.
     */

    public String getLagId() {
        return this.lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * 
     * @param lagId
     *        The ID of the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagRequest withLagId(String lagId) {
        setLagId(lagId);
        return this;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     * 
     * @param lagName
     *        The name of the LAG.
     */

    public void setLagName(String lagName) {
        this.lagName = lagName;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     * 
     * @return The name of the LAG.
     */

    public String getLagName() {
        return this.lagName;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     * 
     * @param lagName
     *        The name of the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagRequest withLagName(String lagName) {
        setLagName(lagName);
        return this;
    }

    /**
     * <p>
     * The minimum number of physical connections that must be operational for the LAG itself to be operational.
     * </p>
     * 
     * @param minimumLinks
     *        The minimum number of physical connections that must be operational for the LAG itself to be operational.
     */

    public void setMinimumLinks(Integer minimumLinks) {
        this.minimumLinks = minimumLinks;
    }

    /**
     * <p>
     * The minimum number of physical connections that must be operational for the LAG itself to be operational.
     * </p>
     * 
     * @return The minimum number of physical connections that must be operational for the LAG itself to be operational.
     */

    public Integer getMinimumLinks() {
        return this.minimumLinks;
    }

    /**
     * <p>
     * The minimum number of physical connections that must be operational for the LAG itself to be operational.
     * </p>
     * 
     * @param minimumLinks
     *        The minimum number of physical connections that must be operational for the LAG itself to be operational.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagRequest withMinimumLinks(Integer minimumLinks) {
        setMinimumLinks(minimumLinks);
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
        if (getLagId() != null)
            sb.append("LagId: ").append(getLagId()).append(",");
        if (getLagName() != null)
            sb.append("LagName: ").append(getLagName()).append(",");
        if (getMinimumLinks() != null)
            sb.append("MinimumLinks: ").append(getMinimumLinks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLagRequest == false)
            return false;
        UpdateLagRequest other = (UpdateLagRequest) obj;
        if (other.getLagId() == null ^ this.getLagId() == null)
            return false;
        if (other.getLagId() != null && other.getLagId().equals(this.getLagId()) == false)
            return false;
        if (other.getLagName() == null ^ this.getLagName() == null)
            return false;
        if (other.getLagName() != null && other.getLagName().equals(this.getLagName()) == false)
            return false;
        if (other.getMinimumLinks() == null ^ this.getMinimumLinks() == null)
            return false;
        if (other.getMinimumLinks() != null && other.getMinimumLinks().equals(this.getMinimumLinks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLagId() == null) ? 0 : getLagId().hashCode());
        hashCode = prime * hashCode + ((getLagName() == null) ? 0 : getLagName().hashCode());
        hashCode = prime * hashCode + ((getMinimumLinks() == null) ? 0 : getMinimumLinks().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLagRequest clone() {
        return (UpdateLagRequest) super.clone();
    }

}
