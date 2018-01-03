/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Container for the parameters to the DescribeLoa operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLoa" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLoaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of a connection, LAG, or interconnect for which to get the LOA-CFA information.
     * </p>
     * <p>
     * Example: dxcon-abc123 or dxlag-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The name of the service provider who establishes connectivity on your behalf. If you supply this parameter, the
     * LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * A standard media type indicating the content type of the LOA-CFA document. Currently, the only supported value is
     * "application/pdf".
     * </p>
     * <p>
     * Default: application/pdf
     * </p>
     */
    private String loaContentType;

    /**
     * <p>
     * The ID of a connection, LAG, or interconnect for which to get the LOA-CFA information.
     * </p>
     * <p>
     * Example: dxcon-abc123 or dxlag-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionId
     *        The ID of a connection, LAG, or interconnect for which to get the LOA-CFA information.</p>
     *        <p>
     *        Example: dxcon-abc123 or dxlag-abc123
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of a connection, LAG, or interconnect for which to get the LOA-CFA information.
     * </p>
     * <p>
     * Example: dxcon-abc123 or dxlag-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The ID of a connection, LAG, or interconnect for which to get the LOA-CFA information.</p>
     *         <p>
     *         Example: dxcon-abc123 or dxlag-abc123
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of a connection, LAG, or interconnect for which to get the LOA-CFA information.
     * </p>
     * <p>
     * Example: dxcon-abc123 or dxlag-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionId
     *        The ID of a connection, LAG, or interconnect for which to get the LOA-CFA information.</p>
     *        <p>
     *        Example: dxcon-abc123 or dxlag-abc123
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoaRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The name of the service provider who establishes connectivity on your behalf. If you supply this parameter, the
     * LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param providerName
     *        The name of the service provider who establishes connectivity on your behalf. If you supply this
     *        parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross
     *        connect.</p>
     *        <p>
     *        Default: None
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the service provider who establishes connectivity on your behalf. If you supply this parameter, the
     * LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The name of the service provider who establishes connectivity on your behalf. If you supply this
     *         parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross
     *         connect.</p>
     *         <p>
     *         Default: None
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The name of the service provider who establishes connectivity on your behalf. If you supply this parameter, the
     * LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param providerName
     *        The name of the service provider who establishes connectivity on your behalf. If you supply this
     *        parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross
     *        connect.</p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoaRequest withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * A standard media type indicating the content type of the LOA-CFA document. Currently, the only supported value is
     * "application/pdf".
     * </p>
     * <p>
     * Default: application/pdf
     * </p>
     * 
     * @param loaContentType
     *        A standard media type indicating the content type of the LOA-CFA document. Currently, the only supported
     *        value is "application/pdf".</p>
     *        <p>
     *        Default: application/pdf
     * @see LoaContentType
     */

    public void setLoaContentType(String loaContentType) {
        this.loaContentType = loaContentType;
    }

    /**
     * <p>
     * A standard media type indicating the content type of the LOA-CFA document. Currently, the only supported value is
     * "application/pdf".
     * </p>
     * <p>
     * Default: application/pdf
     * </p>
     * 
     * @return A standard media type indicating the content type of the LOA-CFA document. Currently, the only supported
     *         value is "application/pdf".</p>
     *         <p>
     *         Default: application/pdf
     * @see LoaContentType
     */

    public String getLoaContentType() {
        return this.loaContentType;
    }

    /**
     * <p>
     * A standard media type indicating the content type of the LOA-CFA document. Currently, the only supported value is
     * "application/pdf".
     * </p>
     * <p>
     * Default: application/pdf
     * </p>
     * 
     * @param loaContentType
     *        A standard media type indicating the content type of the LOA-CFA document. Currently, the only supported
     *        value is "application/pdf".</p>
     *        <p>
     *        Default: application/pdf
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoaContentType
     */

    public DescribeLoaRequest withLoaContentType(String loaContentType) {
        setLoaContentType(loaContentType);
        return this;
    }

    /**
     * <p>
     * A standard media type indicating the content type of the LOA-CFA document. Currently, the only supported value is
     * "application/pdf".
     * </p>
     * <p>
     * Default: application/pdf
     * </p>
     * 
     * @param loaContentType
     *        A standard media type indicating the content type of the LOA-CFA document. Currently, the only supported
     *        value is "application/pdf".</p>
     *        <p>
     *        Default: application/pdf
     * @see LoaContentType
     */

    public void setLoaContentType(LoaContentType loaContentType) {
        withLoaContentType(loaContentType);
    }

    /**
     * <p>
     * A standard media type indicating the content type of the LOA-CFA document. Currently, the only supported value is
     * "application/pdf".
     * </p>
     * <p>
     * Default: application/pdf
     * </p>
     * 
     * @param loaContentType
     *        A standard media type indicating the content type of the LOA-CFA document. Currently, the only supported
     *        value is "application/pdf".</p>
     *        <p>
     *        Default: application/pdf
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoaContentType
     */

    public DescribeLoaRequest withLoaContentType(LoaContentType loaContentType) {
        this.loaContentType = loaContentType.toString();
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
        if (getLoaContentType() != null)
            sb.append("LoaContentType: ").append(getLoaContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoaRequest == false)
            return false;
        DescribeLoaRequest other = (DescribeLoaRequest) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getLoaContentType() == null ^ this.getLoaContentType() == null)
            return false;
        if (other.getLoaContentType() != null && other.getLoaContentType().equals(this.getLoaContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getLoaContentType() == null) ? 0 : getLoaContentType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLoaRequest clone() {
        return (DescribeLoaRequest) super.clone();
    }

}
