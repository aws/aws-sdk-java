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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * DescribeVTLDevicesOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeVTLDevices" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVTLDevicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * An array of VTL device objects composed of the Amazon Resource Name(ARN) of the VTL devices.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VTLDevice> vTLDevices;
    /**
     * <p>
     * An opaque string that indicates the position at which the VTL devices that were fetched for description ended.
     * Use the marker in your next request to fetch the next set of VTL devices in the list. If there are no more VTL
     * devices to describe, this field does not appear in the response.
     * </p>
     */
    private String marker;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVTLDevicesResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * An array of VTL device objects composed of the Amazon Resource Name(ARN) of the VTL devices.
     * </p>
     * 
     * @return An array of VTL device objects composed of the Amazon Resource Name(ARN) of the VTL devices.
     */

    public java.util.List<VTLDevice> getVTLDevices() {
        if (vTLDevices == null) {
            vTLDevices = new com.amazonaws.internal.SdkInternalList<VTLDevice>();
        }
        return vTLDevices;
    }

    /**
     * <p>
     * An array of VTL device objects composed of the Amazon Resource Name(ARN) of the VTL devices.
     * </p>
     * 
     * @param vTLDevices
     *        An array of VTL device objects composed of the Amazon Resource Name(ARN) of the VTL devices.
     */

    public void setVTLDevices(java.util.Collection<VTLDevice> vTLDevices) {
        if (vTLDevices == null) {
            this.vTLDevices = null;
            return;
        }

        this.vTLDevices = new com.amazonaws.internal.SdkInternalList<VTLDevice>(vTLDevices);
    }

    /**
     * <p>
     * An array of VTL device objects composed of the Amazon Resource Name(ARN) of the VTL devices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVTLDevices(java.util.Collection)} or {@link #withVTLDevices(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vTLDevices
     *        An array of VTL device objects composed of the Amazon Resource Name(ARN) of the VTL devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVTLDevicesResult withVTLDevices(VTLDevice... vTLDevices) {
        if (this.vTLDevices == null) {
            setVTLDevices(new com.amazonaws.internal.SdkInternalList<VTLDevice>(vTLDevices.length));
        }
        for (VTLDevice ele : vTLDevices) {
            this.vTLDevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of VTL device objects composed of the Amazon Resource Name(ARN) of the VTL devices.
     * </p>
     * 
     * @param vTLDevices
     *        An array of VTL device objects composed of the Amazon Resource Name(ARN) of the VTL devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVTLDevicesResult withVTLDevices(java.util.Collection<VTLDevice> vTLDevices) {
        setVTLDevices(vTLDevices);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which the VTL devices that were fetched for description ended.
     * Use the marker in your next request to fetch the next set of VTL devices in the list. If there are no more VTL
     * devices to describe, this field does not appear in the response.
     * </p>
     * 
     * @param marker
     *        An opaque string that indicates the position at which the VTL devices that were fetched for description
     *        ended. Use the marker in your next request to fetch the next set of VTL devices in the list. If there are
     *        no more VTL devices to describe, this field does not appear in the response.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which the VTL devices that were fetched for description ended.
     * Use the marker in your next request to fetch the next set of VTL devices in the list. If there are no more VTL
     * devices to describe, this field does not appear in the response.
     * </p>
     * 
     * @return An opaque string that indicates the position at which the VTL devices that were fetched for description
     *         ended. Use the marker in your next request to fetch the next set of VTL devices in the list. If there are
     *         no more VTL devices to describe, this field does not appear in the response.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which the VTL devices that were fetched for description ended.
     * Use the marker in your next request to fetch the next set of VTL devices in the list. If there are no more VTL
     * devices to describe, this field does not appear in the response.
     * </p>
     * 
     * @param marker
     *        An opaque string that indicates the position at which the VTL devices that were fetched for description
     *        ended. Use the marker in your next request to fetch the next set of VTL devices in the list. If there are
     *        no more VTL devices to describe, this field does not appear in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVTLDevicesResult withMarker(String marker) {
        setMarker(marker);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getVTLDevices() != null)
            sb.append("VTLDevices: ").append(getVTLDevices()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVTLDevicesResult == false)
            return false;
        DescribeVTLDevicesResult other = (DescribeVTLDevicesResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getVTLDevices() == null ^ this.getVTLDevices() == null)
            return false;
        if (other.getVTLDevices() != null && other.getVTLDevices().equals(this.getVTLDevices()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getVTLDevices() == null) ? 0 : getVTLDevices().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVTLDevicesResult clone() {
        try {
            return (DescribeVTLDevicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
