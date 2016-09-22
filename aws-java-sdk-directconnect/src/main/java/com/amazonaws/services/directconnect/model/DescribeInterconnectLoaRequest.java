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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the DescribeInterconnectLoa operation.
 * </p>
 */
public class DescribeInterconnectLoaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String interconnectId;
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

    private String loaContentType;

    /**
     * @param interconnectId
     */

    public void setInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
    }

    /**
     * @return
     */

    public String getInterconnectId() {
        return this.interconnectId;
    }

    /**
     * @param interconnectId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInterconnectLoaRequest withInterconnectId(String interconnectId) {
        setInterconnectId(interconnectId);
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

    public DescribeInterconnectLoaRequest withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * @param loaContentType
     * @see LoaContentType
     */

    public void setLoaContentType(String loaContentType) {
        this.loaContentType = loaContentType;
    }

    /**
     * @return
     * @see LoaContentType
     */

    public String getLoaContentType() {
        return this.loaContentType;
    }

    /**
     * @param loaContentType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoaContentType
     */

    public DescribeInterconnectLoaRequest withLoaContentType(String loaContentType) {
        setLoaContentType(loaContentType);
        return this;
    }

    /**
     * @param loaContentType
     * @see LoaContentType
     */

    public void setLoaContentType(LoaContentType loaContentType) {
        this.loaContentType = loaContentType.toString();
    }

    /**
     * @param loaContentType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoaContentType
     */

    public DescribeInterconnectLoaRequest withLoaContentType(LoaContentType loaContentType) {
        setLoaContentType(loaContentType);
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
        if (getInterconnectId() != null)
            sb.append("InterconnectId: " + getInterconnectId() + ",");
        if (getProviderName() != null)
            sb.append("ProviderName: " + getProviderName() + ",");
        if (getLoaContentType() != null)
            sb.append("LoaContentType: " + getLoaContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInterconnectLoaRequest == false)
            return false;
        DescribeInterconnectLoaRequest other = (DescribeInterconnectLoaRequest) obj;
        if (other.getInterconnectId() == null ^ this.getInterconnectId() == null)
            return false;
        if (other.getInterconnectId() != null && other.getInterconnectId().equals(this.getInterconnectId()) == false)
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

        hashCode = prime * hashCode + ((getInterconnectId() == null) ? 0 : getInterconnectId().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getLoaContentType() == null) ? 0 : getLoaContentType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInterconnectLoaRequest clone() {
        return (DescribeInterconnectLoaRequest) super.clone();
    }
}
