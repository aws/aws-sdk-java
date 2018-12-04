/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the CreateDirectConnectGateway operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGateway"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDirectConnectGatewayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the direct connect gateway.
     * </p>
     * <p>
     * Example: "My direct connect gateway"
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String directConnectGatewayName;
    /**
     * <p>
     * The autonomous system number (ASN) for Border Gateway Protocol (BGP) to be configured on the Amazon side of the
     * connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294
     * </p>
     * <p>
     * Example: 65200
     * </p>
     * <p>
     * Default: 64512
     * </p>
     */
    private Long amazonSideAsn;

    /**
     * <p>
     * The name of the direct connect gateway.
     * </p>
     * <p>
     * Example: "My direct connect gateway"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param directConnectGatewayName
     *        The name of the direct connect gateway.</p>
     *        <p>
     *        Example: "My direct connect gateway"
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setDirectConnectGatewayName(String directConnectGatewayName) {
        this.directConnectGatewayName = directConnectGatewayName;
    }

    /**
     * <p>
     * The name of the direct connect gateway.
     * </p>
     * <p>
     * Example: "My direct connect gateway"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The name of the direct connect gateway.</p>
     *         <p>
     *         Example: "My direct connect gateway"
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getDirectConnectGatewayName() {
        return this.directConnectGatewayName;
    }

    /**
     * <p>
     * The name of the direct connect gateway.
     * </p>
     * <p>
     * Example: "My direct connect gateway"
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param directConnectGatewayName
     *        The name of the direct connect gateway.</p>
     *        <p>
     *        Example: "My direct connect gateway"
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectConnectGatewayRequest withDirectConnectGatewayName(String directConnectGatewayName) {
        setDirectConnectGatewayName(directConnectGatewayName);
        return this;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for Border Gateway Protocol (BGP) to be configured on the Amazon side of the
     * connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294
     * </p>
     * <p>
     * Example: 65200
     * </p>
     * <p>
     * Default: 64512
     * </p>
     * 
     * @param amazonSideAsn
     *        The autonomous system number (ASN) for Border Gateway Protocol (BGP) to be configured on the Amazon side
     *        of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to
     *        4,294,967,294 </p>
     *        <p>
     *        Example: 65200
     *        </p>
     *        <p>
     *        Default: 64512
     */

    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for Border Gateway Protocol (BGP) to be configured on the Amazon side of the
     * connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294
     * </p>
     * <p>
     * Example: 65200
     * </p>
     * <p>
     * Default: 64512
     * </p>
     * 
     * @return The autonomous system number (ASN) for Border Gateway Protocol (BGP) to be configured on the Amazon side
     *         of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to
     *         4,294,967,294 </p>
     *         <p>
     *         Example: 65200
     *         </p>
     *         <p>
     *         Default: 64512
     */

    public Long getAmazonSideAsn() {
        return this.amazonSideAsn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for Border Gateway Protocol (BGP) to be configured on the Amazon side of the
     * connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294
     * </p>
     * <p>
     * Example: 65200
     * </p>
     * <p>
     * Default: 64512
     * </p>
     * 
     * @param amazonSideAsn
     *        The autonomous system number (ASN) for Border Gateway Protocol (BGP) to be configured on the Amazon side
     *        of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to
     *        4,294,967,294 </p>
     *        <p>
     *        Example: 65200
     *        </p>
     *        <p>
     *        Default: 64512
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectConnectGatewayRequest withAmazonSideAsn(Long amazonSideAsn) {
        setAmazonSideAsn(amazonSideAsn);
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
        if (getDirectConnectGatewayName() != null)
            sb.append("DirectConnectGatewayName: ").append(getDirectConnectGatewayName()).append(",");
        if (getAmazonSideAsn() != null)
            sb.append("AmazonSideAsn: ").append(getAmazonSideAsn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDirectConnectGatewayRequest == false)
            return false;
        CreateDirectConnectGatewayRequest other = (CreateDirectConnectGatewayRequest) obj;
        if (other.getDirectConnectGatewayName() == null ^ this.getDirectConnectGatewayName() == null)
            return false;
        if (other.getDirectConnectGatewayName() != null && other.getDirectConnectGatewayName().equals(this.getDirectConnectGatewayName()) == false)
            return false;
        if (other.getAmazonSideAsn() == null ^ this.getAmazonSideAsn() == null)
            return false;
        if (other.getAmazonSideAsn() != null && other.getAmazonSideAsn().equals(this.getAmazonSideAsn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGatewayName() == null) ? 0 : getDirectConnectGatewayName().hashCode());
        hashCode = prime * hashCode + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        return hashCode;
    }

    @Override
    public CreateDirectConnectGatewayRequest clone() {
        return (CreateDirectConnectGatewayRequest) super.clone();
    }

}
