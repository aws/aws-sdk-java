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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/AddIpRoutes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddIpRoutesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier (ID) of the directory to which to add the address block.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * IP address blocks, using CIDR format, of the traffic to route. This is often the IP address block of the DNS
     * server used for your on-premises domain.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpRoute> ipRoutes;
    /**
     * <p>
     * If set to true, updates the inbound and outbound rules of the security group that has the description:
     * "AWS created security group for <i>directory ID</i> directory controllers." Following are the new rules:
     * </p>
     * <p>
     * Inbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 88, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 123, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 138, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 389, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 464, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 445, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 88, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 135, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 445, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 464, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 636, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 1024-65535, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 3268-33269, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: DNS (UDP), Protocol: UDP, Range: 53, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: DNS (TCP), Protocol: TCP, Range: 53, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: LDAP, Protocol: TCP, Range: 389, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: All ICMP, Protocol: All, Range: N/A, Source: 0.0.0.0/0
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <p>
     * Outbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: All traffic, Protocol: All, Range: All, Destination: 0.0.0.0/0
     * </p>
     * </li>
     * </ul>
     * <p>
     * These security rules impact an internal network interface that is not exposed publicly.
     * </p>
     */
    private Boolean updateSecurityGroupForDirectoryControllers;

    /**
     * <p>
     * Identifier (ID) of the directory to which to add the address block.
     * </p>
     * 
     * @param directoryId
     *        Identifier (ID) of the directory to which to add the address block.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Identifier (ID) of the directory to which to add the address block.
     * </p>
     * 
     * @return Identifier (ID) of the directory to which to add the address block.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Identifier (ID) of the directory to which to add the address block.
     * </p>
     * 
     * @param directoryId
     *        Identifier (ID) of the directory to which to add the address block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddIpRoutesRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * IP address blocks, using CIDR format, of the traffic to route. This is often the IP address block of the DNS
     * server used for your on-premises domain.
     * </p>
     * 
     * @return IP address blocks, using CIDR format, of the traffic to route. This is often the IP address block of the
     *         DNS server used for your on-premises domain.
     */

    public java.util.List<IpRoute> getIpRoutes() {
        if (ipRoutes == null) {
            ipRoutes = new com.amazonaws.internal.SdkInternalList<IpRoute>();
        }
        return ipRoutes;
    }

    /**
     * <p>
     * IP address blocks, using CIDR format, of the traffic to route. This is often the IP address block of the DNS
     * server used for your on-premises domain.
     * </p>
     * 
     * @param ipRoutes
     *        IP address blocks, using CIDR format, of the traffic to route. This is often the IP address block of the
     *        DNS server used for your on-premises domain.
     */

    public void setIpRoutes(java.util.Collection<IpRoute> ipRoutes) {
        if (ipRoutes == null) {
            this.ipRoutes = null;
            return;
        }

        this.ipRoutes = new com.amazonaws.internal.SdkInternalList<IpRoute>(ipRoutes);
    }

    /**
     * <p>
     * IP address blocks, using CIDR format, of the traffic to route. This is often the IP address block of the DNS
     * server used for your on-premises domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpRoutes(java.util.Collection)} or {@link #withIpRoutes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ipRoutes
     *        IP address blocks, using CIDR format, of the traffic to route. This is often the IP address block of the
     *        DNS server used for your on-premises domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddIpRoutesRequest withIpRoutes(IpRoute... ipRoutes) {
        if (this.ipRoutes == null) {
            setIpRoutes(new com.amazonaws.internal.SdkInternalList<IpRoute>(ipRoutes.length));
        }
        for (IpRoute ele : ipRoutes) {
            this.ipRoutes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IP address blocks, using CIDR format, of the traffic to route. This is often the IP address block of the DNS
     * server used for your on-premises domain.
     * </p>
     * 
     * @param ipRoutes
     *        IP address blocks, using CIDR format, of the traffic to route. This is often the IP address block of the
     *        DNS server used for your on-premises domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddIpRoutesRequest withIpRoutes(java.util.Collection<IpRoute> ipRoutes) {
        setIpRoutes(ipRoutes);
        return this;
    }

    /**
     * <p>
     * If set to true, updates the inbound and outbound rules of the security group that has the description:
     * "AWS created security group for <i>directory ID</i> directory controllers." Following are the new rules:
     * </p>
     * <p>
     * Inbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 88, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 123, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 138, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 389, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 464, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 445, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 88, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 135, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 445, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 464, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 636, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 1024-65535, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 3268-33269, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: DNS (UDP), Protocol: UDP, Range: 53, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: DNS (TCP), Protocol: TCP, Range: 53, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: LDAP, Protocol: TCP, Range: 389, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: All ICMP, Protocol: All, Range: N/A, Source: 0.0.0.0/0
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <p>
     * Outbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: All traffic, Protocol: All, Range: All, Destination: 0.0.0.0/0
     * </p>
     * </li>
     * </ul>
     * <p>
     * These security rules impact an internal network interface that is not exposed publicly.
     * </p>
     * 
     * @param updateSecurityGroupForDirectoryControllers
     *        If set to true, updates the inbound and outbound rules of the security group that has the description:
     *        "AWS created security group for <i>directory ID</i> directory controllers." Following are the new rules:
     *        </p>
     *        <p>
     *        Inbound:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Type: Custom UDP Rule, Protocol: UDP, Range: 88, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom UDP Rule, Protocol: UDP, Range: 123, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom UDP Rule, Protocol: UDP, Range: 138, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom UDP Rule, Protocol: UDP, Range: 389, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom UDP Rule, Protocol: UDP, Range: 464, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom UDP Rule, Protocol: UDP, Range: 445, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 88, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 135, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 445, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 464, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 636, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 1024-65535, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 3268-33269, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: DNS (UDP), Protocol: UDP, Range: 53, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: DNS (TCP), Protocol: TCP, Range: 53, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: LDAP, Protocol: TCP, Range: 389, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: All ICMP, Protocol: All, Range: N/A, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        </ul>
     *        <p/>
     *        <p>
     *        Outbound:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Type: All traffic, Protocol: All, Range: All, Destination: 0.0.0.0/0
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        These security rules impact an internal network interface that is not exposed publicly.
     */

    public void setUpdateSecurityGroupForDirectoryControllers(Boolean updateSecurityGroupForDirectoryControllers) {
        this.updateSecurityGroupForDirectoryControllers = updateSecurityGroupForDirectoryControllers;
    }

    /**
     * <p>
     * If set to true, updates the inbound and outbound rules of the security group that has the description:
     * "AWS created security group for <i>directory ID</i> directory controllers." Following are the new rules:
     * </p>
     * <p>
     * Inbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 88, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 123, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 138, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 389, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 464, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 445, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 88, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 135, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 445, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 464, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 636, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 1024-65535, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 3268-33269, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: DNS (UDP), Protocol: UDP, Range: 53, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: DNS (TCP), Protocol: TCP, Range: 53, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: LDAP, Protocol: TCP, Range: 389, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: All ICMP, Protocol: All, Range: N/A, Source: 0.0.0.0/0
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <p>
     * Outbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: All traffic, Protocol: All, Range: All, Destination: 0.0.0.0/0
     * </p>
     * </li>
     * </ul>
     * <p>
     * These security rules impact an internal network interface that is not exposed publicly.
     * </p>
     * 
     * @return If set to true, updates the inbound and outbound rules of the security group that has the description:
     *         "AWS created security group for <i>directory ID</i> directory controllers." Following are the new rules:
     *         </p>
     *         <p>
     *         Inbound:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Type: Custom UDP Rule, Protocol: UDP, Range: 88, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom UDP Rule, Protocol: UDP, Range: 123, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom UDP Rule, Protocol: UDP, Range: 138, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom UDP Rule, Protocol: UDP, Range: 389, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom UDP Rule, Protocol: UDP, Range: 464, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom UDP Rule, Protocol: UDP, Range: 445, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 88, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 135, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 445, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 464, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 636, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 1024-65535, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 3268-33269, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: DNS (UDP), Protocol: UDP, Range: 53, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: DNS (TCP), Protocol: TCP, Range: 53, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: LDAP, Protocol: TCP, Range: 389, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: All ICMP, Protocol: All, Range: N/A, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         </ul>
     *         <p/>
     *         <p>
     *         Outbound:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Type: All traffic, Protocol: All, Range: All, Destination: 0.0.0.0/0
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         These security rules impact an internal network interface that is not exposed publicly.
     */

    public Boolean getUpdateSecurityGroupForDirectoryControllers() {
        return this.updateSecurityGroupForDirectoryControllers;
    }

    /**
     * <p>
     * If set to true, updates the inbound and outbound rules of the security group that has the description:
     * "AWS created security group for <i>directory ID</i> directory controllers." Following are the new rules:
     * </p>
     * <p>
     * Inbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 88, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 123, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 138, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 389, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 464, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 445, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 88, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 135, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 445, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 464, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 636, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 1024-65535, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 3268-33269, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: DNS (UDP), Protocol: UDP, Range: 53, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: DNS (TCP), Protocol: TCP, Range: 53, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: LDAP, Protocol: TCP, Range: 389, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: All ICMP, Protocol: All, Range: N/A, Source: 0.0.0.0/0
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <p>
     * Outbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: All traffic, Protocol: All, Range: All, Destination: 0.0.0.0/0
     * </p>
     * </li>
     * </ul>
     * <p>
     * These security rules impact an internal network interface that is not exposed publicly.
     * </p>
     * 
     * @param updateSecurityGroupForDirectoryControllers
     *        If set to true, updates the inbound and outbound rules of the security group that has the description:
     *        "AWS created security group for <i>directory ID</i> directory controllers." Following are the new rules:
     *        </p>
     *        <p>
     *        Inbound:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Type: Custom UDP Rule, Protocol: UDP, Range: 88, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom UDP Rule, Protocol: UDP, Range: 123, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom UDP Rule, Protocol: UDP, Range: 138, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom UDP Rule, Protocol: UDP, Range: 389, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom UDP Rule, Protocol: UDP, Range: 464, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom UDP Rule, Protocol: UDP, Range: 445, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 88, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 135, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 445, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 464, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 636, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 1024-65535, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: Custom TCP Rule, Protocol: TCP, Range: 3268-33269, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: DNS (UDP), Protocol: UDP, Range: 53, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: DNS (TCP), Protocol: TCP, Range: 53, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: LDAP, Protocol: TCP, Range: 389, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Type: All ICMP, Protocol: All, Range: N/A, Source: 0.0.0.0/0
     *        </p>
     *        </li>
     *        </ul>
     *        <p/>
     *        <p>
     *        Outbound:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Type: All traffic, Protocol: All, Range: All, Destination: 0.0.0.0/0
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        These security rules impact an internal network interface that is not exposed publicly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddIpRoutesRequest withUpdateSecurityGroupForDirectoryControllers(Boolean updateSecurityGroupForDirectoryControllers) {
        setUpdateSecurityGroupForDirectoryControllers(updateSecurityGroupForDirectoryControllers);
        return this;
    }

    /**
     * <p>
     * If set to true, updates the inbound and outbound rules of the security group that has the description:
     * "AWS created security group for <i>directory ID</i> directory controllers." Following are the new rules:
     * </p>
     * <p>
     * Inbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 88, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 123, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 138, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 389, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 464, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom UDP Rule, Protocol: UDP, Range: 445, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 88, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 135, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 445, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 464, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 636, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 1024-65535, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: Custom TCP Rule, Protocol: TCP, Range: 3268-33269, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: DNS (UDP), Protocol: UDP, Range: 53, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: DNS (TCP), Protocol: TCP, Range: 53, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: LDAP, Protocol: TCP, Range: 389, Source: 0.0.0.0/0
     * </p>
     * </li>
     * <li>
     * <p>
     * Type: All ICMP, Protocol: All, Range: N/A, Source: 0.0.0.0/0
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <p>
     * Outbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Type: All traffic, Protocol: All, Range: All, Destination: 0.0.0.0/0
     * </p>
     * </li>
     * </ul>
     * <p>
     * These security rules impact an internal network interface that is not exposed publicly.
     * </p>
     * 
     * @return If set to true, updates the inbound and outbound rules of the security group that has the description:
     *         "AWS created security group for <i>directory ID</i> directory controllers." Following are the new rules:
     *         </p>
     *         <p>
     *         Inbound:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Type: Custom UDP Rule, Protocol: UDP, Range: 88, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom UDP Rule, Protocol: UDP, Range: 123, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom UDP Rule, Protocol: UDP, Range: 138, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom UDP Rule, Protocol: UDP, Range: 389, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom UDP Rule, Protocol: UDP, Range: 464, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom UDP Rule, Protocol: UDP, Range: 445, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 88, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 135, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 445, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 464, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 636, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 1024-65535, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: Custom TCP Rule, Protocol: TCP, Range: 3268-33269, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: DNS (UDP), Protocol: UDP, Range: 53, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: DNS (TCP), Protocol: TCP, Range: 53, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: LDAP, Protocol: TCP, Range: 389, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Type: All ICMP, Protocol: All, Range: N/A, Source: 0.0.0.0/0
     *         </p>
     *         </li>
     *         </ul>
     *         <p/>
     *         <p>
     *         Outbound:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Type: All traffic, Protocol: All, Range: All, Destination: 0.0.0.0/0
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         These security rules impact an internal network interface that is not exposed publicly.
     */

    public Boolean isUpdateSecurityGroupForDirectoryControllers() {
        return this.updateSecurityGroupForDirectoryControllers;
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getIpRoutes() != null)
            sb.append("IpRoutes: ").append(getIpRoutes()).append(",");
        if (getUpdateSecurityGroupForDirectoryControllers() != null)
            sb.append("UpdateSecurityGroupForDirectoryControllers: ").append(getUpdateSecurityGroupForDirectoryControllers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddIpRoutesRequest == false)
            return false;
        AddIpRoutesRequest other = (AddIpRoutesRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getIpRoutes() == null ^ this.getIpRoutes() == null)
            return false;
        if (other.getIpRoutes() != null && other.getIpRoutes().equals(this.getIpRoutes()) == false)
            return false;
        if (other.getUpdateSecurityGroupForDirectoryControllers() == null ^ this.getUpdateSecurityGroupForDirectoryControllers() == null)
            return false;
        if (other.getUpdateSecurityGroupForDirectoryControllers() != null
                && other.getUpdateSecurityGroupForDirectoryControllers().equals(this.getUpdateSecurityGroupForDirectoryControllers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getIpRoutes() == null) ? 0 : getIpRoutes().hashCode());
        hashCode = prime * hashCode
                + ((getUpdateSecurityGroupForDirectoryControllers() == null) ? 0 : getUpdateSecurityGroupForDirectoryControllers().hashCode());
        return hashCode;
    }

    @Override
    public AddIpRoutesRequest clone() {
        return (AddIpRoutesRequest) super.clone();
    }

}
