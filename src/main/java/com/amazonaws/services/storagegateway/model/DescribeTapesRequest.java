/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#describeTapes(DescribeTapesRequest) DescribeTapes operation}.
 * <p>
 * Returns a description of the specified Amazon Resource Name (ARN) of virtual tapes. If a <code>TapeARN</code> is not specified, returns a description
 * of all virtual tapes associated with the specified gateway.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#describeTapes(DescribeTapesRequest)
 */
public class DescribeTapesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * Specifies one or more unique Amazon Resource Names (ARNs) that
     * represent the virtual tapes you want to describe. If this parameter is
     * not specified, AWS Storage Gateway returns a description of all
     * virtual tapes associated with the specified gateway.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tapeARNs;

    /**
     * A marker value, obtained in a previous call to
     * <code>DescribeTapes</code>. This marker indicates which page of
     * results to retrieve. <p>If not specified, the first page of results is
     * retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * Specifies that the number of virtual tapes described be limited to the
     * specified number. <note>Amazon Web Services may impose its own limit,
     * if this field is not set.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTapesRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * Specifies one or more unique Amazon Resource Names (ARNs) that
     * represent the virtual tapes you want to describe. If this parameter is
     * not specified, AWS Storage Gateway returns a description of all
     * virtual tapes associated with the specified gateway.
     *
     * @return Specifies one or more unique Amazon Resource Names (ARNs) that
     *         represent the virtual tapes you want to describe. If this parameter is
     *         not specified, AWS Storage Gateway returns a description of all
     *         virtual tapes associated with the specified gateway.
     */
    public java.util.List<String> getTapeARNs() {
        if (tapeARNs == null) {
              tapeARNs = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tapeARNs.setAutoConstruct(true);
        }
        return tapeARNs;
    }
    
    /**
     * Specifies one or more unique Amazon Resource Names (ARNs) that
     * represent the virtual tapes you want to describe. If this parameter is
     * not specified, AWS Storage Gateway returns a description of all
     * virtual tapes associated with the specified gateway.
     *
     * @param tapeARNs Specifies one or more unique Amazon Resource Names (ARNs) that
     *         represent the virtual tapes you want to describe. If this parameter is
     *         not specified, AWS Storage Gateway returns a description of all
     *         virtual tapes associated with the specified gateway.
     */
    public void setTapeARNs(java.util.Collection<String> tapeARNs) {
        if (tapeARNs == null) {
            this.tapeARNs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tapeARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tapeARNs.size());
        tapeARNsCopy.addAll(tapeARNs);
        this.tapeARNs = tapeARNsCopy;
    }
    
    /**
     * Specifies one or more unique Amazon Resource Names (ARNs) that
     * represent the virtual tapes you want to describe. If this parameter is
     * not specified, AWS Storage Gateway returns a description of all
     * virtual tapes associated with the specified gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tapeARNs Specifies one or more unique Amazon Resource Names (ARNs) that
     *         represent the virtual tapes you want to describe. If this parameter is
     *         not specified, AWS Storage Gateway returns a description of all
     *         virtual tapes associated with the specified gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTapesRequest withTapeARNs(String... tapeARNs) {
        if (getTapeARNs() == null) setTapeARNs(new java.util.ArrayList<String>(tapeARNs.length));
        for (String value : tapeARNs) {
            getTapeARNs().add(value);
        }
        return this;
    }
    
    /**
     * Specifies one or more unique Amazon Resource Names (ARNs) that
     * represent the virtual tapes you want to describe. If this parameter is
     * not specified, AWS Storage Gateway returns a description of all
     * virtual tapes associated with the specified gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tapeARNs Specifies one or more unique Amazon Resource Names (ARNs) that
     *         represent the virtual tapes you want to describe. If this parameter is
     *         not specified, AWS Storage Gateway returns a description of all
     *         virtual tapes associated with the specified gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTapesRequest withTapeARNs(java.util.Collection<String> tapeARNs) {
        if (tapeARNs == null) {
            this.tapeARNs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tapeARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tapeARNs.size());
            tapeARNsCopy.addAll(tapeARNs);
            this.tapeARNs = tapeARNsCopy;
        }

        return this;
    }

    /**
     * A marker value, obtained in a previous call to
     * <code>DescribeTapes</code>. This marker indicates which page of
     * results to retrieve. <p>If not specified, the first page of results is
     * retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return A marker value, obtained in a previous call to
     *         <code>DescribeTapes</code>. This marker indicates which page of
     *         results to retrieve. <p>If not specified, the first page of results is
     *         retrieved.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A marker value, obtained in a previous call to
     * <code>DescribeTapes</code>. This marker indicates which page of
     * results to retrieve. <p>If not specified, the first page of results is
     * retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker A marker value, obtained in a previous call to
     *         <code>DescribeTapes</code>. This marker indicates which page of
     *         results to retrieve. <p>If not specified, the first page of results is
     *         retrieved.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A marker value, obtained in a previous call to
     * <code>DescribeTapes</code>. This marker indicates which page of
     * results to retrieve. <p>If not specified, the first page of results is
     * retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker A marker value, obtained in a previous call to
     *         <code>DescribeTapes</code>. This marker indicates which page of
     *         results to retrieve. <p>If not specified, the first page of results is
     *         retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTapesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Specifies that the number of virtual tapes described be limited to the
     * specified number. <note>Amazon Web Services may impose its own limit,
     * if this field is not set.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Specifies that the number of virtual tapes described be limited to the
     *         specified number. <note>Amazon Web Services may impose its own limit,
     *         if this field is not set.</note>
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * Specifies that the number of virtual tapes described be limited to the
     * specified number. <note>Amazon Web Services may impose its own limit,
     * if this field is not set.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit Specifies that the number of virtual tapes described be limited to the
     *         specified number. <note>Amazon Web Services may impose its own limit,
     *         if this field is not set.</note>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * Specifies that the number of virtual tapes described be limited to the
     * specified number. <note>Amazon Web Services may impose its own limit,
     * if this field is not set.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit Specifies that the number of virtual tapes described be limited to the
     *         specified number. <note>Amazon Web Services may impose its own limit,
     *         if this field is not set.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTapesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGatewayARN() != null) sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getTapeARNs() != null) sb.append("TapeARNs: " + getTapeARNs() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTapesRequest == false) return false;
        DescribeTapesRequest other = (DescribeTapesRequest)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getTapeARNs() == null ^ this.getTapeARNs() == null) return false;
        if (other.getTapeARNs() != null && other.getTapeARNs().equals(this.getTapeARNs()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
}
    