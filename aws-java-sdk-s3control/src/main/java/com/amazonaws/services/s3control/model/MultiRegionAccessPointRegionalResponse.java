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
 * Status information for a single Multi-Region Access Point Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/MultiRegionAccessPointRegionalResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiRegionAccessPointRegionalResponse implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Region in the Multi-Region Access Point.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the Multi-Region Access Point in this Region.
     * </p>
     */
    private String requestStatus;

    /**
     * <p>
     * The name of the Region in the Multi-Region Access Point.
     * </p>
     * 
     * @param name
     *        The name of the Region in the Multi-Region Access Point.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Region in the Multi-Region Access Point.
     * </p>
     * 
     * @return The name of the Region in the Multi-Region Access Point.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Region in the Multi-Region Access Point.
     * </p>
     * 
     * @param name
     *        The name of the Region in the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointRegionalResponse withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the Multi-Region Access Point in this Region.
     * </p>
     * 
     * @param requestStatus
     *        The current status of the Multi-Region Access Point in this Region.
     */

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    /**
     * <p>
     * The current status of the Multi-Region Access Point in this Region.
     * </p>
     * 
     * @return The current status of the Multi-Region Access Point in this Region.
     */

    public String getRequestStatus() {
        return this.requestStatus;
    }

    /**
     * <p>
     * The current status of the Multi-Region Access Point in this Region.
     * </p>
     * 
     * @param requestStatus
     *        The current status of the Multi-Region Access Point in this Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionAccessPointRegionalResponse withRequestStatus(String requestStatus) {
        setRequestStatus(requestStatus);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRequestStatus() != null)
            sb.append("RequestStatus: ").append(getRequestStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiRegionAccessPointRegionalResponse == false)
            return false;
        MultiRegionAccessPointRegionalResponse other = (MultiRegionAccessPointRegionalResponse) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequestStatus() == null ^ this.getRequestStatus() == null)
            return false;
        if (other.getRequestStatus() != null && other.getRequestStatus().equals(this.getRequestStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequestStatus() == null) ? 0 : getRequestStatus().hashCode());
        return hashCode;
    }

    @Override
    public MultiRegionAccessPointRegionalResponse clone() {
        try {
            return (MultiRegionAccessPointRegionalResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
