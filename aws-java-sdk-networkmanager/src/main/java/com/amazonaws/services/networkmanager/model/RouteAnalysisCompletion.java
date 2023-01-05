/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the status of an analysis at completion.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RouteAnalysisCompletion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteAnalysisCompletion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The result of the analysis. If the status is <code>NOT_CONNECTED</code>, check the reason code.
     * </p>
     */
    private String resultCode;
    /**
     * <p>
     * The reason code. Available only if a connection is not found.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND</code> - Found a black hole route with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CYCLIC_PATH_DETECTED</code> - Found the same resource multiple times while traversing the path.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE_ROUTE_FOR_DESTINATION_FOUND</code> - Found an inactive route with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX_HOPS_EXCEEDED</code> - Analysis exceeded 64 hops without finding the destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROUTE_NOT_FOUND</code> - Cannot find a route table with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_ARN_NO_MATCH</code> - Found an attachment, but not with the correct destination ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_NOT_FOUND</code> - Cannot find an attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_NOT_IN_TGW</code> - Found an attachment, but not to the correct transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_STABLE_ROUTE_TABLE_NOT_FOUND</code> - The state of the route table association is not
     * associated.
     * </p>
     * </li>
     * </ul>
     */
    private String reasonCode;
    /**
     * <p>
     * Additional information about the path. Available only if a connection is not found.
     * </p>
     */
    private java.util.Map<String, String> reasonContext;

    /**
     * <p>
     * The result of the analysis. If the status is <code>NOT_CONNECTED</code>, check the reason code.
     * </p>
     * 
     * @param resultCode
     *        The result of the analysis. If the status is <code>NOT_CONNECTED</code>, check the reason code.
     * @see RouteAnalysisCompletionResultCode
     */

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * <p>
     * The result of the analysis. If the status is <code>NOT_CONNECTED</code>, check the reason code.
     * </p>
     * 
     * @return The result of the analysis. If the status is <code>NOT_CONNECTED</code>, check the reason code.
     * @see RouteAnalysisCompletionResultCode
     */

    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * <p>
     * The result of the analysis. If the status is <code>NOT_CONNECTED</code>, check the reason code.
     * </p>
     * 
     * @param resultCode
     *        The result of the analysis. If the status is <code>NOT_CONNECTED</code>, check the reason code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteAnalysisCompletionResultCode
     */

    public RouteAnalysisCompletion withResultCode(String resultCode) {
        setResultCode(resultCode);
        return this;
    }

    /**
     * <p>
     * The result of the analysis. If the status is <code>NOT_CONNECTED</code>, check the reason code.
     * </p>
     * 
     * @param resultCode
     *        The result of the analysis. If the status is <code>NOT_CONNECTED</code>, check the reason code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteAnalysisCompletionResultCode
     */

    public RouteAnalysisCompletion withResultCode(RouteAnalysisCompletionResultCode resultCode) {
        this.resultCode = resultCode.toString();
        return this;
    }

    /**
     * <p>
     * The reason code. Available only if a connection is not found.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND</code> - Found a black hole route with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CYCLIC_PATH_DETECTED</code> - Found the same resource multiple times while traversing the path.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE_ROUTE_FOR_DESTINATION_FOUND</code> - Found an inactive route with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX_HOPS_EXCEEDED</code> - Analysis exceeded 64 hops without finding the destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROUTE_NOT_FOUND</code> - Cannot find a route table with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_ARN_NO_MATCH</code> - Found an attachment, but not with the correct destination ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_NOT_FOUND</code> - Cannot find an attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_NOT_IN_TGW</code> - Found an attachment, but not to the correct transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_STABLE_ROUTE_TABLE_NOT_FOUND</code> - The state of the route table association is not
     * associated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reasonCode
     *        The reason code. Available only if a connection is not found.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND</code> - Found a black hole route with the destination CIDR
     *        block.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CYCLIC_PATH_DETECTED</code> - Found the same resource multiple times while traversing the path.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE_ROUTE_FOR_DESTINATION_FOUND</code> - Found an inactive route with the destination CIDR
     *        block.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAX_HOPS_EXCEEDED</code> - Analysis exceeded 64 hops without finding the destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ROUTE_NOT_FOUND</code> - Cannot find a route table with the destination CIDR block.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TGW_ATTACH_ARN_NO_MATCH</code> - Found an attachment, but not with the correct destination ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TGW_ATTACH_NOT_FOUND</code> - Cannot find an attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TGW_ATTACH_NOT_IN_TGW</code> - Found an attachment, but not to the correct transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TGW_ATTACH_STABLE_ROUTE_TABLE_NOT_FOUND</code> - The state of the route table association is not
     *        associated.
     *        </p>
     *        </li>
     * @see RouteAnalysisCompletionReasonCode
     */

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * <p>
     * The reason code. Available only if a connection is not found.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND</code> - Found a black hole route with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CYCLIC_PATH_DETECTED</code> - Found the same resource multiple times while traversing the path.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE_ROUTE_FOR_DESTINATION_FOUND</code> - Found an inactive route with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX_HOPS_EXCEEDED</code> - Analysis exceeded 64 hops without finding the destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROUTE_NOT_FOUND</code> - Cannot find a route table with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_ARN_NO_MATCH</code> - Found an attachment, but not with the correct destination ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_NOT_FOUND</code> - Cannot find an attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_NOT_IN_TGW</code> - Found an attachment, but not to the correct transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_STABLE_ROUTE_TABLE_NOT_FOUND</code> - The state of the route table association is not
     * associated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The reason code. Available only if a connection is not found.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND</code> - Found a black hole route with the destination CIDR
     *         block.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CYCLIC_PATH_DETECTED</code> - Found the same resource multiple times while traversing the path.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INACTIVE_ROUTE_FOR_DESTINATION_FOUND</code> - Found an inactive route with the destination CIDR
     *         block.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MAX_HOPS_EXCEEDED</code> - Analysis exceeded 64 hops without finding the destination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ROUTE_NOT_FOUND</code> - Cannot find a route table with the destination CIDR block.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TGW_ATTACH_ARN_NO_MATCH</code> - Found an attachment, but not with the correct destination ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TGW_ATTACH_NOT_FOUND</code> - Cannot find an attachment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TGW_ATTACH_NOT_IN_TGW</code> - Found an attachment, but not to the correct transit gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TGW_ATTACH_STABLE_ROUTE_TABLE_NOT_FOUND</code> - The state of the route table association is not
     *         associated.
     *         </p>
     *         </li>
     * @see RouteAnalysisCompletionReasonCode
     */

    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * <p>
     * The reason code. Available only if a connection is not found.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND</code> - Found a black hole route with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CYCLIC_PATH_DETECTED</code> - Found the same resource multiple times while traversing the path.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE_ROUTE_FOR_DESTINATION_FOUND</code> - Found an inactive route with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX_HOPS_EXCEEDED</code> - Analysis exceeded 64 hops without finding the destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROUTE_NOT_FOUND</code> - Cannot find a route table with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_ARN_NO_MATCH</code> - Found an attachment, but not with the correct destination ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_NOT_FOUND</code> - Cannot find an attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_NOT_IN_TGW</code> - Found an attachment, but not to the correct transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_STABLE_ROUTE_TABLE_NOT_FOUND</code> - The state of the route table association is not
     * associated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reasonCode
     *        The reason code. Available only if a connection is not found.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND</code> - Found a black hole route with the destination CIDR
     *        block.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CYCLIC_PATH_DETECTED</code> - Found the same resource multiple times while traversing the path.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE_ROUTE_FOR_DESTINATION_FOUND</code> - Found an inactive route with the destination CIDR
     *        block.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAX_HOPS_EXCEEDED</code> - Analysis exceeded 64 hops without finding the destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ROUTE_NOT_FOUND</code> - Cannot find a route table with the destination CIDR block.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TGW_ATTACH_ARN_NO_MATCH</code> - Found an attachment, but not with the correct destination ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TGW_ATTACH_NOT_FOUND</code> - Cannot find an attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TGW_ATTACH_NOT_IN_TGW</code> - Found an attachment, but not to the correct transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TGW_ATTACH_STABLE_ROUTE_TABLE_NOT_FOUND</code> - The state of the route table association is not
     *        associated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteAnalysisCompletionReasonCode
     */

    public RouteAnalysisCompletion withReasonCode(String reasonCode) {
        setReasonCode(reasonCode);
        return this;
    }

    /**
     * <p>
     * The reason code. Available only if a connection is not found.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND</code> - Found a black hole route with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CYCLIC_PATH_DETECTED</code> - Found the same resource multiple times while traversing the path.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE_ROUTE_FOR_DESTINATION_FOUND</code> - Found an inactive route with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX_HOPS_EXCEEDED</code> - Analysis exceeded 64 hops without finding the destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROUTE_NOT_FOUND</code> - Cannot find a route table with the destination CIDR block.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_ARN_NO_MATCH</code> - Found an attachment, but not with the correct destination ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_NOT_FOUND</code> - Cannot find an attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_NOT_IN_TGW</code> - Found an attachment, but not to the correct transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TGW_ATTACH_STABLE_ROUTE_TABLE_NOT_FOUND</code> - The state of the route table association is not
     * associated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reasonCode
     *        The reason code. Available only if a connection is not found.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND</code> - Found a black hole route with the destination CIDR
     *        block.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CYCLIC_PATH_DETECTED</code> - Found the same resource multiple times while traversing the path.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE_ROUTE_FOR_DESTINATION_FOUND</code> - Found an inactive route with the destination CIDR
     *        block.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAX_HOPS_EXCEEDED</code> - Analysis exceeded 64 hops without finding the destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ROUTE_NOT_FOUND</code> - Cannot find a route table with the destination CIDR block.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TGW_ATTACH_ARN_NO_MATCH</code> - Found an attachment, but not with the correct destination ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TGW_ATTACH_NOT_FOUND</code> - Cannot find an attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TGW_ATTACH_NOT_IN_TGW</code> - Found an attachment, but not to the correct transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TGW_ATTACH_STABLE_ROUTE_TABLE_NOT_FOUND</code> - The state of the route table association is not
     *        associated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteAnalysisCompletionReasonCode
     */

    public RouteAnalysisCompletion withReasonCode(RouteAnalysisCompletionReasonCode reasonCode) {
        this.reasonCode = reasonCode.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the path. Available only if a connection is not found.
     * </p>
     * 
     * @return Additional information about the path. Available only if a connection is not found.
     */

    public java.util.Map<String, String> getReasonContext() {
        return reasonContext;
    }

    /**
     * <p>
     * Additional information about the path. Available only if a connection is not found.
     * </p>
     * 
     * @param reasonContext
     *        Additional information about the path. Available only if a connection is not found.
     */

    public void setReasonContext(java.util.Map<String, String> reasonContext) {
        this.reasonContext = reasonContext;
    }

    /**
     * <p>
     * Additional information about the path. Available only if a connection is not found.
     * </p>
     * 
     * @param reasonContext
     *        Additional information about the path. Available only if a connection is not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysisCompletion withReasonContext(java.util.Map<String, String> reasonContext) {
        setReasonContext(reasonContext);
        return this;
    }

    /**
     * Add a single ReasonContext entry
     *
     * @see RouteAnalysisCompletion#withReasonContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysisCompletion addReasonContextEntry(String key, String value) {
        if (null == this.reasonContext) {
            this.reasonContext = new java.util.HashMap<String, String>();
        }
        if (this.reasonContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.reasonContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ReasonContext.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysisCompletion clearReasonContextEntries() {
        this.reasonContext = null;
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
        if (getResultCode() != null)
            sb.append("ResultCode: ").append(getResultCode()).append(",");
        if (getReasonCode() != null)
            sb.append("ReasonCode: ").append(getReasonCode()).append(",");
        if (getReasonContext() != null)
            sb.append("ReasonContext: ").append(getReasonContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteAnalysisCompletion == false)
            return false;
        RouteAnalysisCompletion other = (RouteAnalysisCompletion) obj;
        if (other.getResultCode() == null ^ this.getResultCode() == null)
            return false;
        if (other.getResultCode() != null && other.getResultCode().equals(this.getResultCode()) == false)
            return false;
        if (other.getReasonCode() == null ^ this.getReasonCode() == null)
            return false;
        if (other.getReasonCode() != null && other.getReasonCode().equals(this.getReasonCode()) == false)
            return false;
        if (other.getReasonContext() == null ^ this.getReasonContext() == null)
            return false;
        if (other.getReasonContext() != null && other.getReasonContext().equals(this.getReasonContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        hashCode = prime * hashCode + ((getReasonCode() == null) ? 0 : getReasonCode().hashCode());
        hashCode = prime * hashCode + ((getReasonContext() == null) ? 0 : getReasonContext().hashCode());
        return hashCode;
    }

    @Override
    public RouteAnalysisCompletion clone() {
        try {
            return (RouteAnalysisCompletion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.RouteAnalysisCompletionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
