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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * DescribeVTLDevicesInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeVTLDevices" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVTLDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.
     * </p>
     * <note>
     * <p>
     * All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the result will
     * contain all devices on the specified gateway.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> vTLDeviceARNs;
    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing the VTL devices.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Specifies that the number of VTL devices described be limited to the specified number.
     * </p>
     */
    private Integer limit;

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

    public DescribeVTLDevicesRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.
     * </p>
     * <note>
     * <p>
     * All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the result will
     * contain all devices on the specified gateway.
     * </p>
     * </note>
     * 
     * @return An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.</p>
     *         <note>
     *         <p>
     *         All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the
     *         result will contain all devices on the specified gateway.
     *         </p>
     */

    public java.util.List<String> getVTLDeviceARNs() {
        if (vTLDeviceARNs == null) {
            vTLDeviceARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vTLDeviceARNs;
    }

    /**
     * <p>
     * An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.
     * </p>
     * <note>
     * <p>
     * All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the result will
     * contain all devices on the specified gateway.
     * </p>
     * </note>
     * 
     * @param vTLDeviceARNs
     *        An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.</p>
     *        <note>
     *        <p>
     *        All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the
     *        result will contain all devices on the specified gateway.
     *        </p>
     */

    public void setVTLDeviceARNs(java.util.Collection<String> vTLDeviceARNs) {
        if (vTLDeviceARNs == null) {
            this.vTLDeviceARNs = null;
            return;
        }

        this.vTLDeviceARNs = new com.amazonaws.internal.SdkInternalList<String>(vTLDeviceARNs);
    }

    /**
     * <p>
     * An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.
     * </p>
     * <note>
     * <p>
     * All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the result will
     * contain all devices on the specified gateway.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVTLDeviceARNs(java.util.Collection)} or {@link #withVTLDeviceARNs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vTLDeviceARNs
     *        An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.</p>
     *        <note>
     *        <p>
     *        All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the
     *        result will contain all devices on the specified gateway.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVTLDevicesRequest withVTLDeviceARNs(String... vTLDeviceARNs) {
        if (this.vTLDeviceARNs == null) {
            setVTLDeviceARNs(new com.amazonaws.internal.SdkInternalList<String>(vTLDeviceARNs.length));
        }
        for (String ele : vTLDeviceARNs) {
            this.vTLDeviceARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.
     * </p>
     * <note>
     * <p>
     * All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the result will
     * contain all devices on the specified gateway.
     * </p>
     * </note>
     * 
     * @param vTLDeviceARNs
     *        An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.</p>
     *        <note>
     *        <p>
     *        All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the
     *        result will contain all devices on the specified gateway.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVTLDevicesRequest withVTLDeviceARNs(java.util.Collection<String> vTLDeviceARNs) {
        setVTLDeviceARNs(vTLDeviceARNs);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing the VTL devices.
     * </p>
     * 
     * @param marker
     *        An opaque string that indicates the position at which to begin describing the VTL devices.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing the VTL devices.
     * </p>
     * 
     * @return An opaque string that indicates the position at which to begin describing the VTL devices.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin describing the VTL devices.
     * </p>
     * 
     * @param marker
     *        An opaque string that indicates the position at which to begin describing the VTL devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVTLDevicesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Specifies that the number of VTL devices described be limited to the specified number.
     * </p>
     * 
     * @param limit
     *        Specifies that the number of VTL devices described be limited to the specified number.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifies that the number of VTL devices described be limited to the specified number.
     * </p>
     * 
     * @return Specifies that the number of VTL devices described be limited to the specified number.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Specifies that the number of VTL devices described be limited to the specified number.
     * </p>
     * 
     * @param limit
     *        Specifies that the number of VTL devices described be limited to the specified number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVTLDevicesRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getVTLDeviceARNs() != null)
            sb.append("VTLDeviceARNs: ").append(getVTLDeviceARNs()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVTLDevicesRequest == false)
            return false;
        DescribeVTLDevicesRequest other = (DescribeVTLDevicesRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getVTLDeviceARNs() == null ^ this.getVTLDeviceARNs() == null)
            return false;
        if (other.getVTLDeviceARNs() != null && other.getVTLDeviceARNs().equals(this.getVTLDeviceARNs()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getVTLDeviceARNs() == null) ? 0 : getVTLDeviceARNs().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVTLDevicesRequest clone() {
        return (DescribeVTLDevicesRequest) super.clone();
    }

}
