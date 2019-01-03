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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyIdFormatRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyIdFormatRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyIdFormatRequest> {

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> | <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     * <code>subnet</code> | <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * <p>
     * Alternatively, use the <code>all-current</code> option to include all resource types that are currently within
     * their opt-in period for longer IDs.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * Indicate whether the resource should use longer IDs (17-character IDs).
     * </p>
     */
    private Boolean useLongIds;

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> | <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     * <code>subnet</code> | <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * <p>
     * Alternatively, use the <code>all-current</code> option to include all resource types that are currently within
     * their opt-in period for longer IDs.
     * </p>
     * 
     * @param resource
     *        The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     *        <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     *        <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     *        <code>internet-gateway</code> | <code>network-acl</code> | <code>network-acl-association</code> |
     *        <code>network-interface</code> | <code>network-interface-attachment</code> | <code>prefix-list</code> |
     *        <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     *        <code>subnet</code> | <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     *        <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code>
     *        | <code>vpn-connection</code> | <code>vpn-gateway</code>.</p>
     *        <p>
     *        Alternatively, use the <code>all-current</code> option to include all resource types that are currently
     *        within their opt-in period for longer IDs.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> | <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     * <code>subnet</code> | <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * <p>
     * Alternatively, use the <code>all-current</code> option to include all resource types that are currently within
     * their opt-in period for longer IDs.
     * </p>
     * 
     * @return The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code>
     *         | <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     *         <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     *         <code>internet-gateway</code> | <code>network-acl</code> | <code>network-acl-association</code> |
     *         <code>network-interface</code> | <code>network-interface-attachment</code> | <code>prefix-list</code> |
     *         <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     *         <code>subnet</code> | <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     *         <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code>
     *         | <code>vpn-connection</code> | <code>vpn-gateway</code>.</p>
     *         <p>
     *         Alternatively, use the <code>all-current</code> option to include all resource types that are currently
     *         within their opt-in period for longer IDs.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> | <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     * <code>subnet</code> | <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * <p>
     * Alternatively, use the <code>all-current</code> option to include all resource types that are currently within
     * their opt-in period for longer IDs.
     * </p>
     * 
     * @param resource
     *        The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     *        <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     *        <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     *        <code>internet-gateway</code> | <code>network-acl</code> | <code>network-acl-association</code> |
     *        <code>network-interface</code> | <code>network-interface-attachment</code> | <code>prefix-list</code> |
     *        <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     *        <code>subnet</code> | <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     *        <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code>
     *        | <code>vpn-connection</code> | <code>vpn-gateway</code>.</p>
     *        <p>
     *        Alternatively, use the <code>all-current</code> option to include all resource types that are currently
     *        within their opt-in period for longer IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIdFormatRequest withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * Indicate whether the resource should use longer IDs (17-character IDs).
     * </p>
     * 
     * @param useLongIds
     *        Indicate whether the resource should use longer IDs (17-character IDs).
     */

    public void setUseLongIds(Boolean useLongIds) {
        this.useLongIds = useLongIds;
    }

    /**
     * <p>
     * Indicate whether the resource should use longer IDs (17-character IDs).
     * </p>
     * 
     * @return Indicate whether the resource should use longer IDs (17-character IDs).
     */

    public Boolean getUseLongIds() {
        return this.useLongIds;
    }

    /**
     * <p>
     * Indicate whether the resource should use longer IDs (17-character IDs).
     * </p>
     * 
     * @param useLongIds
     *        Indicate whether the resource should use longer IDs (17-character IDs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIdFormatRequest withUseLongIds(Boolean useLongIds) {
        setUseLongIds(useLongIds);
        return this;
    }

    /**
     * <p>
     * Indicate whether the resource should use longer IDs (17-character IDs).
     * </p>
     * 
     * @return Indicate whether the resource should use longer IDs (17-character IDs).
     */

    public Boolean isUseLongIds() {
        return this.useLongIds;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyIdFormatRequest> getDryRunRequest() {
        Request<ModifyIdFormatRequest> request = new ModifyIdFormatRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getUseLongIds() != null)
            sb.append("UseLongIds: ").append(getUseLongIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyIdFormatRequest == false)
            return false;
        ModifyIdFormatRequest other = (ModifyIdFormatRequest) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getUseLongIds() == null ^ this.getUseLongIds() == null)
            return false;
        if (other.getUseLongIds() != null && other.getUseLongIds().equals(this.getUseLongIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getUseLongIds() == null) ? 0 : getUseLongIds().hashCode());
        return hashCode;
    }

    @Override
    public ModifyIdFormatRequest clone() {
        return (ModifyIdFormatRequest) super.clone();
    }
}
