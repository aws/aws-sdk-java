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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnectionLoa"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectionLoaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The name of the APN partner or service provider who establishes connectivity on your behalf. If you specify this
     * parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
     * </p>
     */
    private String loaContentType;

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @return The ID of the connection.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionLoaRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The name of the APN partner or service provider who establishes connectivity on your behalf. If you specify this
     * parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
     * </p>
     * 
     * @param providerName
     *        The name of the APN partner or service provider who establishes connectivity on your behalf. If you
     *        specify this parameter, the LOA-CFA lists the provider name alongside your company name as the requester
     *        of the cross connect.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the APN partner or service provider who establishes connectivity on your behalf. If you specify this
     * parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
     * </p>
     * 
     * @return The name of the APN partner or service provider who establishes connectivity on your behalf. If you
     *         specify this parameter, the LOA-CFA lists the provider name alongside your company name as the requester
     *         of the cross connect.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The name of the APN partner or service provider who establishes connectivity on your behalf. If you specify this
     * parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
     * </p>
     * 
     * @param providerName
     *        The name of the APN partner or service provider who establishes connectivity on your behalf. If you
     *        specify this parameter, the LOA-CFA lists the provider name alongside your company name as the requester
     *        of the cross connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionLoaRequest withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
     * </p>
     * 
     * @param loaContentType
     *        The standard media type for the LOA-CFA document. The only supported value is application/pdf.
     * @see LoaContentType
     */

    public void setLoaContentType(String loaContentType) {
        this.loaContentType = loaContentType;
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
     * </p>
     * 
     * @return The standard media type for the LOA-CFA document. The only supported value is application/pdf.
     * @see LoaContentType
     */

    public String getLoaContentType() {
        return this.loaContentType;
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
     * </p>
     * 
     * @param loaContentType
     *        The standard media type for the LOA-CFA document. The only supported value is application/pdf.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoaContentType
     */

    public DescribeConnectionLoaRequest withLoaContentType(String loaContentType) {
        setLoaContentType(loaContentType);
        return this;
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
     * </p>
     * 
     * @param loaContentType
     *        The standard media type for the LOA-CFA document. The only supported value is application/pdf.
     * @see LoaContentType
     */

    public void setLoaContentType(LoaContentType loaContentType) {
        withLoaContentType(loaContentType);
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
     * </p>
     * 
     * @param loaContentType
     *        The standard media type for the LOA-CFA document. The only supported value is application/pdf.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoaContentType
     */

    public DescribeConnectionLoaRequest withLoaContentType(LoaContentType loaContentType) {
        this.loaContentType = loaContentType.toString();
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

        if (obj instanceof DescribeConnectionLoaRequest == false)
            return false;
        DescribeConnectionLoaRequest other = (DescribeConnectionLoaRequest) obj;
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
    public DescribeConnectionLoaRequest clone() {
        return (DescribeConnectionLoaRequest) super.clone();
    }

}
