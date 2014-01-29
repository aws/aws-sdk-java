/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeSecurityGroupsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSecurityGroups(DescribeSecurityGroupsRequest) DescribeSecurityGroups operation}.
 * <p>
 * Describes one or more of your security groups.
 * </p>
 * <p>
 * A security group is for use with instances either in the EC2-Classic platform or in a specific VPC. For more information, see <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"> Amazon EC2 Security Groups </a> in the <i>Amazon Elastic
 * Compute Cloud User Guide</i> and <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC
 * </a> in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSecurityGroups(DescribeSecurityGroupsRequest)
 */
public class DescribeSecurityGroupsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSecurityGroupsRequest> {

    /**
     * [EC2-Classic, default VPC] One or more security group names.
     * <p>Default: Describes all your security groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNames;

    /**
     * One or more security group IDs. <p>Default: Describes all your
     * security groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groupIds;

    /**
     * One or more filters. <ul> <li> <p><code>description</code> - The
     * description of the security group. </li> <li> <p><code>group-id</code>
     * - The ID of the security group. </li> <li> <p><code>group-name</code>
     * - The name of the security group. </li> <li>
     * <p><code>ip-permission.cidr</code> - A CIDR range that has been
     * granted permission. </li> <li> <p><code>ip-permission.from-port</code>
     * - The start of port range for the TCP and UDP protocols, or an ICMP
     * type number. </li> <li> <p><code>ip-permission.group-name</code> - The
     * name of a security group that has been granted permission. </li> <li>
     * <p><code>ip-permission.protocol</code> - The IP protocol for the
     * permission (<code>tcp</code> | <code>udp</code> | <code>icmp</code> or
     * a protocol number). </li> <li> <p><code>ip-permission.to-port</code> -
     * The end of port range for the TCP and UDP protocols, or an ICMP code.
     * </li> <li> <p><code>ip-permission.user-id</code> - The ID of an AWS
     * account that has been granted permission. </li> <li>
     * <p><code>owner-id</code> - The AWS account ID of the owner of the
     * security group. </li> <li> <p><code>tag-key</code> - The key of a tag
     * assigned to the security group. </li> <li> <p><code>tag-value</code> -
     * The value of a tag assigned to the security group. </li> <li>
     * <p><code>vpc-id</code> - The ID of the VPC specified when the security
     * group was created. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * [EC2-Classic, default VPC] One or more security group names.
     * <p>Default: Describes all your security groups.
     *
     * @return [EC2-Classic, default VPC] One or more security group names.
     *         <p>Default: Describes all your security groups.
     */
    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
              groupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groupNames.setAutoConstruct(true);
        }
        return groupNames;
    }
    
    /**
     * [EC2-Classic, default VPC] One or more security group names.
     * <p>Default: Describes all your security groups.
     *
     * @param groupNames [EC2-Classic, default VPC] One or more security group names.
     *         <p>Default: Describes all your security groups.
     */
    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupNames.size());
        groupNamesCopy.addAll(groupNames);
        this.groupNames = groupNamesCopy;
    }
    
    /**
     * [EC2-Classic, default VPC] One or more security group names.
     * <p>Default: Describes all your security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames [EC2-Classic, default VPC] One or more security group names.
     *         <p>Default: Describes all your security groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSecurityGroupsRequest withGroupNames(String... groupNames) {
        if (getGroupNames() == null) setGroupNames(new java.util.ArrayList<String>(groupNames.length));
        for (String value : groupNames) {
            getGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * [EC2-Classic, default VPC] One or more security group names.
     * <p>Default: Describes all your security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames [EC2-Classic, default VPC] One or more security group names.
     *         <p>Default: Describes all your security groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSecurityGroupsRequest withGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupNames.size());
            groupNamesCopy.addAll(groupNames);
            this.groupNames = groupNamesCopy;
        }

        return this;
    }

    /**
     * One or more security group IDs. <p>Default: Describes all your
     * security groups.
     *
     * @return One or more security group IDs. <p>Default: Describes all your
     *         security groups.
     */
    public java.util.List<String> getGroupIds() {
        if (groupIds == null) {
              groupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groupIds.setAutoConstruct(true);
        }
        return groupIds;
    }
    
    /**
     * One or more security group IDs. <p>Default: Describes all your
     * security groups.
     *
     * @param groupIds One or more security group IDs. <p>Default: Describes all your
     *         security groups.
     */
    public void setGroupIds(java.util.Collection<String> groupIds) {
        if (groupIds == null) {
            this.groupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupIds.size());
        groupIdsCopy.addAll(groupIds);
        this.groupIds = groupIdsCopy;
    }
    
    /**
     * One or more security group IDs. <p>Default: Describes all your
     * security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupIds One or more security group IDs. <p>Default: Describes all your
     *         security groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSecurityGroupsRequest withGroupIds(String... groupIds) {
        if (getGroupIds() == null) setGroupIds(new java.util.ArrayList<String>(groupIds.length));
        for (String value : groupIds) {
            getGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more security group IDs. <p>Default: Describes all your
     * security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupIds One or more security group IDs. <p>Default: Describes all your
     *         security groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSecurityGroupsRequest withGroupIds(java.util.Collection<String> groupIds) {
        if (groupIds == null) {
            this.groupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupIds.size());
            groupIdsCopy.addAll(groupIds);
            this.groupIds = groupIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>description</code> - The
     * description of the security group. </li> <li> <p><code>group-id</code>
     * - The ID of the security group. </li> <li> <p><code>group-name</code>
     * - The name of the security group. </li> <li>
     * <p><code>ip-permission.cidr</code> - A CIDR range that has been
     * granted permission. </li> <li> <p><code>ip-permission.from-port</code>
     * - The start of port range for the TCP and UDP protocols, or an ICMP
     * type number. </li> <li> <p><code>ip-permission.group-name</code> - The
     * name of a security group that has been granted permission. </li> <li>
     * <p><code>ip-permission.protocol</code> - The IP protocol for the
     * permission (<code>tcp</code> | <code>udp</code> | <code>icmp</code> or
     * a protocol number). </li> <li> <p><code>ip-permission.to-port</code> -
     * The end of port range for the TCP and UDP protocols, or an ICMP code.
     * </li> <li> <p><code>ip-permission.user-id</code> - The ID of an AWS
     * account that has been granted permission. </li> <li>
     * <p><code>owner-id</code> - The AWS account ID of the owner of the
     * security group. </li> <li> <p><code>tag-key</code> - The key of a tag
     * assigned to the security group. </li> <li> <p><code>tag-value</code> -
     * The value of a tag assigned to the security group. </li> <li>
     * <p><code>vpc-id</code> - The ID of the VPC specified when the security
     * group was created. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>description</code> - The
     *         description of the security group. </li> <li> <p><code>group-id</code>
     *         - The ID of the security group. </li> <li> <p><code>group-name</code>
     *         - The name of the security group. </li> <li>
     *         <p><code>ip-permission.cidr</code> - A CIDR range that has been
     *         granted permission. </li> <li> <p><code>ip-permission.from-port</code>
     *         - The start of port range for the TCP and UDP protocols, or an ICMP
     *         type number. </li> <li> <p><code>ip-permission.group-name</code> - The
     *         name of a security group that has been granted permission. </li> <li>
     *         <p><code>ip-permission.protocol</code> - The IP protocol for the
     *         permission (<code>tcp</code> | <code>udp</code> | <code>icmp</code> or
     *         a protocol number). </li> <li> <p><code>ip-permission.to-port</code> -
     *         The end of port range for the TCP and UDP protocols, or an ICMP code.
     *         </li> <li> <p><code>ip-permission.user-id</code> - The ID of an AWS
     *         account that has been granted permission. </li> <li>
     *         <p><code>owner-id</code> - The AWS account ID of the owner of the
     *         security group. </li> <li> <p><code>tag-key</code> - The key of a tag
     *         assigned to the security group. </li> <li> <p><code>tag-value</code> -
     *         The value of a tag assigned to the security group. </li> <li>
     *         <p><code>vpc-id</code> - The ID of the VPC specified when the security
     *         group was created. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>description</code> - The
     * description of the security group. </li> <li> <p><code>group-id</code>
     * - The ID of the security group. </li> <li> <p><code>group-name</code>
     * - The name of the security group. </li> <li>
     * <p><code>ip-permission.cidr</code> - A CIDR range that has been
     * granted permission. </li> <li> <p><code>ip-permission.from-port</code>
     * - The start of port range for the TCP and UDP protocols, or an ICMP
     * type number. </li> <li> <p><code>ip-permission.group-name</code> - The
     * name of a security group that has been granted permission. </li> <li>
     * <p><code>ip-permission.protocol</code> - The IP protocol for the
     * permission (<code>tcp</code> | <code>udp</code> | <code>icmp</code> or
     * a protocol number). </li> <li> <p><code>ip-permission.to-port</code> -
     * The end of port range for the TCP and UDP protocols, or an ICMP code.
     * </li> <li> <p><code>ip-permission.user-id</code> - The ID of an AWS
     * account that has been granted permission. </li> <li>
     * <p><code>owner-id</code> - The AWS account ID of the owner of the
     * security group. </li> <li> <p><code>tag-key</code> - The key of a tag
     * assigned to the security group. </li> <li> <p><code>tag-value</code> -
     * The value of a tag assigned to the security group. </li> <li>
     * <p><code>vpc-id</code> - The ID of the VPC specified when the security
     * group was created. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>description</code> - The
     *         description of the security group. </li> <li> <p><code>group-id</code>
     *         - The ID of the security group. </li> <li> <p><code>group-name</code>
     *         - The name of the security group. </li> <li>
     *         <p><code>ip-permission.cidr</code> - A CIDR range that has been
     *         granted permission. </li> <li> <p><code>ip-permission.from-port</code>
     *         - The start of port range for the TCP and UDP protocols, or an ICMP
     *         type number. </li> <li> <p><code>ip-permission.group-name</code> - The
     *         name of a security group that has been granted permission. </li> <li>
     *         <p><code>ip-permission.protocol</code> - The IP protocol for the
     *         permission (<code>tcp</code> | <code>udp</code> | <code>icmp</code> or
     *         a protocol number). </li> <li> <p><code>ip-permission.to-port</code> -
     *         The end of port range for the TCP and UDP protocols, or an ICMP code.
     *         </li> <li> <p><code>ip-permission.user-id</code> - The ID of an AWS
     *         account that has been granted permission. </li> <li>
     *         <p><code>owner-id</code> - The AWS account ID of the owner of the
     *         security group. </li> <li> <p><code>tag-key</code> - The key of a tag
     *         assigned to the security group. </li> <li> <p><code>tag-value</code> -
     *         The value of a tag assigned to the security group. </li> <li>
     *         <p><code>vpc-id</code> - The ID of the VPC specified when the security
     *         group was created. </li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>description</code> - The
     * description of the security group. </li> <li> <p><code>group-id</code>
     * - The ID of the security group. </li> <li> <p><code>group-name</code>
     * - The name of the security group. </li> <li>
     * <p><code>ip-permission.cidr</code> - A CIDR range that has been
     * granted permission. </li> <li> <p><code>ip-permission.from-port</code>
     * - The start of port range for the TCP and UDP protocols, or an ICMP
     * type number. </li> <li> <p><code>ip-permission.group-name</code> - The
     * name of a security group that has been granted permission. </li> <li>
     * <p><code>ip-permission.protocol</code> - The IP protocol for the
     * permission (<code>tcp</code> | <code>udp</code> | <code>icmp</code> or
     * a protocol number). </li> <li> <p><code>ip-permission.to-port</code> -
     * The end of port range for the TCP and UDP protocols, or an ICMP code.
     * </li> <li> <p><code>ip-permission.user-id</code> - The ID of an AWS
     * account that has been granted permission. </li> <li>
     * <p><code>owner-id</code> - The AWS account ID of the owner of the
     * security group. </li> <li> <p><code>tag-key</code> - The key of a tag
     * assigned to the security group. </li> <li> <p><code>tag-value</code> -
     * The value of a tag assigned to the security group. </li> <li>
     * <p><code>vpc-id</code> - The ID of the VPC specified when the security
     * group was created. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>description</code> - The
     *         description of the security group. </li> <li> <p><code>group-id</code>
     *         - The ID of the security group. </li> <li> <p><code>group-name</code>
     *         - The name of the security group. </li> <li>
     *         <p><code>ip-permission.cidr</code> - A CIDR range that has been
     *         granted permission. </li> <li> <p><code>ip-permission.from-port</code>
     *         - The start of port range for the TCP and UDP protocols, or an ICMP
     *         type number. </li> <li> <p><code>ip-permission.group-name</code> - The
     *         name of a security group that has been granted permission. </li> <li>
     *         <p><code>ip-permission.protocol</code> - The IP protocol for the
     *         permission (<code>tcp</code> | <code>udp</code> | <code>icmp</code> or
     *         a protocol number). </li> <li> <p><code>ip-permission.to-port</code> -
     *         The end of port range for the TCP and UDP protocols, or an ICMP code.
     *         </li> <li> <p><code>ip-permission.user-id</code> - The ID of an AWS
     *         account that has been granted permission. </li> <li>
     *         <p><code>owner-id</code> - The AWS account ID of the owner of the
     *         security group. </li> <li> <p><code>tag-key</code> - The key of a tag
     *         assigned to the security group. </li> <li> <p><code>tag-value</code> -
     *         The value of a tag assigned to the security group. </li> <li>
     *         <p><code>vpc-id</code> - The ID of the VPC specified when the security
     *         group was created. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSecurityGroupsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>description</code> - The
     * description of the security group. </li> <li> <p><code>group-id</code>
     * - The ID of the security group. </li> <li> <p><code>group-name</code>
     * - The name of the security group. </li> <li>
     * <p><code>ip-permission.cidr</code> - A CIDR range that has been
     * granted permission. </li> <li> <p><code>ip-permission.from-port</code>
     * - The start of port range for the TCP and UDP protocols, or an ICMP
     * type number. </li> <li> <p><code>ip-permission.group-name</code> - The
     * name of a security group that has been granted permission. </li> <li>
     * <p><code>ip-permission.protocol</code> - The IP protocol for the
     * permission (<code>tcp</code> | <code>udp</code> | <code>icmp</code> or
     * a protocol number). </li> <li> <p><code>ip-permission.to-port</code> -
     * The end of port range for the TCP and UDP protocols, or an ICMP code.
     * </li> <li> <p><code>ip-permission.user-id</code> - The ID of an AWS
     * account that has been granted permission. </li> <li>
     * <p><code>owner-id</code> - The AWS account ID of the owner of the
     * security group. </li> <li> <p><code>tag-key</code> - The key of a tag
     * assigned to the security group. </li> <li> <p><code>tag-value</code> -
     * The value of a tag assigned to the security group. </li> <li>
     * <p><code>vpc-id</code> - The ID of the VPC specified when the security
     * group was created. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>description</code> - The
     *         description of the security group. </li> <li> <p><code>group-id</code>
     *         - The ID of the security group. </li> <li> <p><code>group-name</code>
     *         - The name of the security group. </li> <li>
     *         <p><code>ip-permission.cidr</code> - A CIDR range that has been
     *         granted permission. </li> <li> <p><code>ip-permission.from-port</code>
     *         - The start of port range for the TCP and UDP protocols, or an ICMP
     *         type number. </li> <li> <p><code>ip-permission.group-name</code> - The
     *         name of a security group that has been granted permission. </li> <li>
     *         <p><code>ip-permission.protocol</code> - The IP protocol for the
     *         permission (<code>tcp</code> | <code>udp</code> | <code>icmp</code> or
     *         a protocol number). </li> <li> <p><code>ip-permission.to-port</code> -
     *         The end of port range for the TCP and UDP protocols, or an ICMP code.
     *         </li> <li> <p><code>ip-permission.user-id</code> - The ID of an AWS
     *         account that has been granted permission. </li> <li>
     *         <p><code>owner-id</code> - The AWS account ID of the owner of the
     *         security group. </li> <li> <p><code>tag-key</code> - The key of a tag
     *         assigned to the security group. </li> <li> <p><code>tag-value</code> -
     *         The value of a tag assigned to the security group. </li> <li>
     *         <p><code>vpc-id</code> - The ID of the VPC specified when the security
     *         group was created. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSecurityGroupsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeSecurityGroupsRequest> getDryRunRequest() {
        Request<DescribeSecurityGroupsRequest> request = new DescribeSecurityGroupsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getGroupNames() != null) sb.append("GroupNames: " + getGroupNames() + ",");
        if (getGroupIds() != null) sb.append("GroupIds: " + getGroupIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getGroupIds() == null) ? 0 : getGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSecurityGroupsRequest == false) return false;
        DescribeSecurityGroupsRequest other = (DescribeSecurityGroupsRequest)obj;
        
        if (other.getGroupNames() == null ^ this.getGroupNames() == null) return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false) return false; 
        if (other.getGroupIds() == null ^ this.getGroupIds() == null) return false;
        if (other.getGroupIds() != null && other.getGroupIds().equals(this.getGroupIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    