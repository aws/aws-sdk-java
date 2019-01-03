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
 * DescribeTapesInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTapesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
     * If this parameter is not specified, Tape gateway returns a description of all virtual tapes associated with the
     * specified gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tapeARNs;
    /**
     * <p>
     * A marker value, obtained in a previous call to <code>DescribeTapes</code>. This marker indicates which page of
     * results to retrieve.
     * </p>
     * <p>
     * If not specified, the first page of results is retrieved.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Specifies that the number of virtual tapes described be limited to the specified number.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services may impose its own limit, if this field is not set.
     * </p>
     * </note>
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

    public DescribeTapesRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
     * If this parameter is not specified, Tape gateway returns a description of all virtual tapes associated with the
     * specified gateway.
     * </p>
     * 
     * @return Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to
     *         describe. If this parameter is not specified, Tape gateway returns a description of all virtual tapes
     *         associated with the specified gateway.
     */

    public java.util.List<String> getTapeARNs() {
        if (tapeARNs == null) {
            tapeARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tapeARNs;
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
     * If this parameter is not specified, Tape gateway returns a description of all virtual tapes associated with the
     * specified gateway.
     * </p>
     * 
     * @param tapeARNs
     *        Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to
     *        describe. If this parameter is not specified, Tape gateway returns a description of all virtual tapes
     *        associated with the specified gateway.
     */

    public void setTapeARNs(java.util.Collection<String> tapeARNs) {
        if (tapeARNs == null) {
            this.tapeARNs = null;
            return;
        }

        this.tapeARNs = new com.amazonaws.internal.SdkInternalList<String>(tapeARNs);
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
     * If this parameter is not specified, Tape gateway returns a description of all virtual tapes associated with the
     * specified gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTapeARNs(java.util.Collection)} or {@link #withTapeARNs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tapeARNs
     *        Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to
     *        describe. If this parameter is not specified, Tape gateway returns a description of all virtual tapes
     *        associated with the specified gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapesRequest withTapeARNs(String... tapeARNs) {
        if (this.tapeARNs == null) {
            setTapeARNs(new com.amazonaws.internal.SdkInternalList<String>(tapeARNs.length));
        }
        for (String ele : tapeARNs) {
            this.tapeARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
     * If this parameter is not specified, Tape gateway returns a description of all virtual tapes associated with the
     * specified gateway.
     * </p>
     * 
     * @param tapeARNs
     *        Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to
     *        describe. If this parameter is not specified, Tape gateway returns a description of all virtual tapes
     *        associated with the specified gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapesRequest withTapeARNs(java.util.Collection<String> tapeARNs) {
        setTapeARNs(tapeARNs);
        return this;
    }

    /**
     * <p>
     * A marker value, obtained in a previous call to <code>DescribeTapes</code>. This marker indicates which page of
     * results to retrieve.
     * </p>
     * <p>
     * If not specified, the first page of results is retrieved.
     * </p>
     * 
     * @param marker
     *        A marker value, obtained in a previous call to <code>DescribeTapes</code>. This marker indicates which
     *        page of results to retrieve. </p>
     *        <p>
     *        If not specified, the first page of results is retrieved.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A marker value, obtained in a previous call to <code>DescribeTapes</code>. This marker indicates which page of
     * results to retrieve.
     * </p>
     * <p>
     * If not specified, the first page of results is retrieved.
     * </p>
     * 
     * @return A marker value, obtained in a previous call to <code>DescribeTapes</code>. This marker indicates which
     *         page of results to retrieve. </p>
     *         <p>
     *         If not specified, the first page of results is retrieved.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A marker value, obtained in a previous call to <code>DescribeTapes</code>. This marker indicates which page of
     * results to retrieve.
     * </p>
     * <p>
     * If not specified, the first page of results is retrieved.
     * </p>
     * 
     * @param marker
     *        A marker value, obtained in a previous call to <code>DescribeTapes</code>. This marker indicates which
     *        page of results to retrieve. </p>
     *        <p>
     *        If not specified, the first page of results is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Specifies that the number of virtual tapes described be limited to the specified number.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services may impose its own limit, if this field is not set.
     * </p>
     * </note>
     * 
     * @param limit
     *        Specifies that the number of virtual tapes described be limited to the specified number.</p> <note>
     *        <p>
     *        Amazon Web Services may impose its own limit, if this field is not set.
     *        </p>
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifies that the number of virtual tapes described be limited to the specified number.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services may impose its own limit, if this field is not set.
     * </p>
     * </note>
     * 
     * @return Specifies that the number of virtual tapes described be limited to the specified number.</p> <note>
     *         <p>
     *         Amazon Web Services may impose its own limit, if this field is not set.
     *         </p>
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Specifies that the number of virtual tapes described be limited to the specified number.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services may impose its own limit, if this field is not set.
     * </p>
     * </note>
     * 
     * @param limit
     *        Specifies that the number of virtual tapes described be limited to the specified number.</p> <note>
     *        <p>
     *        Amazon Web Services may impose its own limit, if this field is not set.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapesRequest withLimit(Integer limit) {
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
        if (getTapeARNs() != null)
            sb.append("TapeARNs: ").append(getTapeARNs()).append(",");
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

        if (obj instanceof DescribeTapesRequest == false)
            return false;
        DescribeTapesRequest other = (DescribeTapesRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getTapeARNs() == null ^ this.getTapeARNs() == null)
            return false;
        if (other.getTapeARNs() != null && other.getTapeARNs().equals(this.getTapeARNs()) == false)
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
        hashCode = prime * hashCode + ((getTapeARNs() == null) ? 0 : getTapeARNs().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTapesRequest clone() {
        return (DescribeTapesRequest) super.clone();
    }

}
