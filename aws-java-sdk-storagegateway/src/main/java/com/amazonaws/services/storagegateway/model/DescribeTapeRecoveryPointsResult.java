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
 * DescribeTapeRecoveryPointsOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapeRecoveryPoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTapeRecoveryPointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * An array of TapeRecoveryPointInfos that are available for the specified gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TapeRecoveryPointInfo> tapeRecoveryPointInfos;
    /**
     * <p>
     * An opaque string that indicates the position at which the virtual tape recovery points that were listed for
     * description ended.
     * </p>
     * <p>
     * Use this marker in your next request to list the next set of virtual tape recovery points in the list. If there
     * are no more recovery points to describe, this field does not appear in the response.
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

    public DescribeTapeRecoveryPointsResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * An array of TapeRecoveryPointInfos that are available for the specified gateway.
     * </p>
     * 
     * @return An array of TapeRecoveryPointInfos that are available for the specified gateway.
     */

    public java.util.List<TapeRecoveryPointInfo> getTapeRecoveryPointInfos() {
        if (tapeRecoveryPointInfos == null) {
            tapeRecoveryPointInfos = new com.amazonaws.internal.SdkInternalList<TapeRecoveryPointInfo>();
        }
        return tapeRecoveryPointInfos;
    }

    /**
     * <p>
     * An array of TapeRecoveryPointInfos that are available for the specified gateway.
     * </p>
     * 
     * @param tapeRecoveryPointInfos
     *        An array of TapeRecoveryPointInfos that are available for the specified gateway.
     */

    public void setTapeRecoveryPointInfos(java.util.Collection<TapeRecoveryPointInfo> tapeRecoveryPointInfos) {
        if (tapeRecoveryPointInfos == null) {
            this.tapeRecoveryPointInfos = null;
            return;
        }

        this.tapeRecoveryPointInfos = new com.amazonaws.internal.SdkInternalList<TapeRecoveryPointInfo>(tapeRecoveryPointInfos);
    }

    /**
     * <p>
     * An array of TapeRecoveryPointInfos that are available for the specified gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTapeRecoveryPointInfos(java.util.Collection)} or
     * {@link #withTapeRecoveryPointInfos(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param tapeRecoveryPointInfos
     *        An array of TapeRecoveryPointInfos that are available for the specified gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapeRecoveryPointsResult withTapeRecoveryPointInfos(TapeRecoveryPointInfo... tapeRecoveryPointInfos) {
        if (this.tapeRecoveryPointInfos == null) {
            setTapeRecoveryPointInfos(new com.amazonaws.internal.SdkInternalList<TapeRecoveryPointInfo>(tapeRecoveryPointInfos.length));
        }
        for (TapeRecoveryPointInfo ele : tapeRecoveryPointInfos) {
            this.tapeRecoveryPointInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of TapeRecoveryPointInfos that are available for the specified gateway.
     * </p>
     * 
     * @param tapeRecoveryPointInfos
     *        An array of TapeRecoveryPointInfos that are available for the specified gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapeRecoveryPointsResult withTapeRecoveryPointInfos(java.util.Collection<TapeRecoveryPointInfo> tapeRecoveryPointInfos) {
        setTapeRecoveryPointInfos(tapeRecoveryPointInfos);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which the virtual tape recovery points that were listed for
     * description ended.
     * </p>
     * <p>
     * Use this marker in your next request to list the next set of virtual tape recovery points in the list. If there
     * are no more recovery points to describe, this field does not appear in the response.
     * </p>
     * 
     * @param marker
     *        An opaque string that indicates the position at which the virtual tape recovery points that were listed
     *        for description ended.</p>
     *        <p>
     *        Use this marker in your next request to list the next set of virtual tape recovery points in the list. If
     *        there are no more recovery points to describe, this field does not appear in the response.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which the virtual tape recovery points that were listed for
     * description ended.
     * </p>
     * <p>
     * Use this marker in your next request to list the next set of virtual tape recovery points in the list. If there
     * are no more recovery points to describe, this field does not appear in the response.
     * </p>
     * 
     * @return An opaque string that indicates the position at which the virtual tape recovery points that were listed
     *         for description ended.</p>
     *         <p>
     *         Use this marker in your next request to list the next set of virtual tape recovery points in the list. If
     *         there are no more recovery points to describe, this field does not appear in the response.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which the virtual tape recovery points that were listed for
     * description ended.
     * </p>
     * <p>
     * Use this marker in your next request to list the next set of virtual tape recovery points in the list. If there
     * are no more recovery points to describe, this field does not appear in the response.
     * </p>
     * 
     * @param marker
     *        An opaque string that indicates the position at which the virtual tape recovery points that were listed
     *        for description ended.</p>
     *        <p>
     *        Use this marker in your next request to list the next set of virtual tape recovery points in the list. If
     *        there are no more recovery points to describe, this field does not appear in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapeRecoveryPointsResult withMarker(String marker) {
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
        if (getTapeRecoveryPointInfos() != null)
            sb.append("TapeRecoveryPointInfos: ").append(getTapeRecoveryPointInfos()).append(",");
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

        if (obj instanceof DescribeTapeRecoveryPointsResult == false)
            return false;
        DescribeTapeRecoveryPointsResult other = (DescribeTapeRecoveryPointsResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getTapeRecoveryPointInfos() == null ^ this.getTapeRecoveryPointInfos() == null)
            return false;
        if (other.getTapeRecoveryPointInfos() != null && other.getTapeRecoveryPointInfos().equals(this.getTapeRecoveryPointInfos()) == false)
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
        hashCode = prime * hashCode + ((getTapeRecoveryPointInfos() == null) ? 0 : getTapeRecoveryPointInfos().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTapeRecoveryPointsResult clone() {
        try {
            return (DescribeTapeRecoveryPointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
