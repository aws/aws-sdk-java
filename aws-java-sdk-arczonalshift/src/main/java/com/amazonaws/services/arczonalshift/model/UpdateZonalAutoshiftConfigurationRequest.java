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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdateZonalAutoshiftConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateZonalAutoshiftConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the resource that you want to update the zonal autoshift configuration for. The identifier is
     * the Amazon Resource Name (ARN) for the resource.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * The zonal autoshift status for the resource that you want to update the zonal autoshift configuration for.
     * </p>
     */
    private String zonalAutoshiftStatus;

    /**
     * <p>
     * The identifier for the resource that you want to update the zonal autoshift configuration for. The identifier is
     * the Amazon Resource Name (ARN) for the resource.
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier for the resource that you want to update the zonal autoshift configuration for. The
     *        identifier is the Amazon Resource Name (ARN) for the resource.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the resource that you want to update the zonal autoshift configuration for. The identifier is
     * the Amazon Resource Name (ARN) for the resource.
     * </p>
     * 
     * @return The identifier for the resource that you want to update the zonal autoshift configuration for. The
     *         identifier is the Amazon Resource Name (ARN) for the resource.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the resource that you want to update the zonal autoshift configuration for. The identifier is
     * the Amazon Resource Name (ARN) for the resource.
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier for the resource that you want to update the zonal autoshift configuration for. The
     *        identifier is the Amazon Resource Name (ARN) for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateZonalAutoshiftConfigurationRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The zonal autoshift status for the resource that you want to update the zonal autoshift configuration for.
     * </p>
     * 
     * @param zonalAutoshiftStatus
     *        The zonal autoshift status for the resource that you want to update the zonal autoshift configuration for.
     * @see ZonalAutoshiftStatus
     */

    public void setZonalAutoshiftStatus(String zonalAutoshiftStatus) {
        this.zonalAutoshiftStatus = zonalAutoshiftStatus;
    }

    /**
     * <p>
     * The zonal autoshift status for the resource that you want to update the zonal autoshift configuration for.
     * </p>
     * 
     * @return The zonal autoshift status for the resource that you want to update the zonal autoshift configuration
     *         for.
     * @see ZonalAutoshiftStatus
     */

    public String getZonalAutoshiftStatus() {
        return this.zonalAutoshiftStatus;
    }

    /**
     * <p>
     * The zonal autoshift status for the resource that you want to update the zonal autoshift configuration for.
     * </p>
     * 
     * @param zonalAutoshiftStatus
     *        The zonal autoshift status for the resource that you want to update the zonal autoshift configuration for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalAutoshiftStatus
     */

    public UpdateZonalAutoshiftConfigurationRequest withZonalAutoshiftStatus(String zonalAutoshiftStatus) {
        setZonalAutoshiftStatus(zonalAutoshiftStatus);
        return this;
    }

    /**
     * <p>
     * The zonal autoshift status for the resource that you want to update the zonal autoshift configuration for.
     * </p>
     * 
     * @param zonalAutoshiftStatus
     *        The zonal autoshift status for the resource that you want to update the zonal autoshift configuration for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalAutoshiftStatus
     */

    public UpdateZonalAutoshiftConfigurationRequest withZonalAutoshiftStatus(ZonalAutoshiftStatus zonalAutoshiftStatus) {
        this.zonalAutoshiftStatus = zonalAutoshiftStatus.toString();
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
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getZonalAutoshiftStatus() != null)
            sb.append("ZonalAutoshiftStatus: ").append(getZonalAutoshiftStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateZonalAutoshiftConfigurationRequest == false)
            return false;
        UpdateZonalAutoshiftConfigurationRequest other = (UpdateZonalAutoshiftConfigurationRequest) obj;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getZonalAutoshiftStatus() == null ^ this.getZonalAutoshiftStatus() == null)
            return false;
        if (other.getZonalAutoshiftStatus() != null && other.getZonalAutoshiftStatus().equals(this.getZonalAutoshiftStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getZonalAutoshiftStatus() == null) ? 0 : getZonalAutoshiftStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateZonalAutoshiftConfigurationRequest clone() {
        return (UpdateZonalAutoshiftConfigurationRequest) super.clone();
    }

}
