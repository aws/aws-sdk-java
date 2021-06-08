/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the detector belonging to the GuardDuty account that you want to create a filter for.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     * characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the filter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Specifies the position of the filter in the list of current filters. Also specifies the order in which this
     * filter is applied to the findings.
     * </p>
     */
    private Integer rank;
    /**
     * <p>
     * Represents the criteria to be used in the filter for querying findings.
     * </p>
     * <p>
     * You can only use the following attributes to query findings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId
     * </p>
     * </li>
     * <li>
     * <p>
     * region
     * </p>
     * </li>
     * <li>
     * <p>
     * confidence
     * </p>
     * </li>
     * <li>
     * <p>
     * id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.accessKeyId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.principalId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userType
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.iamInstanceProfile.id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.imageId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.instanceId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.outpostArn
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.ipv6Addresses
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicDnsName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicIp
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.subnetId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.vpcId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.key
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.value
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.resourceType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.actionType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.api
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.callerType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.errorCode
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.country.countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.serviceName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.dnsRequestAction.domain
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.blocked
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.connectionDirection
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.localPortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.protocol
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.localIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.country.countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remotePortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.additionalInfo.threatListName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.archived
     * </p>
     * <p>
     * When this attribute is set to TRUE, only archived findings are listed. When it's set to FALSE, only unarchived
     * findings are listed. When this attribute is not set, all existing findings are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * service.resourceRole
     * </p>
     * </li>
     * <li>
     * <p>
     * severity
     * </p>
     * </li>
     * <li>
     * <p>
     * type
     * </p>
     * </li>
     * <li>
     * <p>
     * updatedAt
     * </p>
     * <p>
     * Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on whether the value
     * contains milliseconds.
     * </p>
     * </li>
     * </ul>
     */
    private FindingCriteria findingCriteria;
    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags to be added to a new filter resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the detector belonging to the GuardDuty account that you want to create a filter for.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector belonging to the GuardDuty account that you want to create a filter for.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector belonging to the GuardDuty account that you want to create a filter for.
     * </p>
     * 
     * @return The ID of the detector belonging to the GuardDuty account that you want to create a filter for.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The ID of the detector belonging to the GuardDuty account that you want to create a filter for.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector belonging to the GuardDuty account that you want to create a filter for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     * characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     * </p>
     * 
     * @param name
     *        The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     *        characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     * characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     * </p>
     * 
     * @return The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     *         characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     * characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     * </p>
     * 
     * @param name
     *        The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     *        characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the filter.
     * </p>
     * 
     * @param description
     *        The description of the filter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the filter.
     * </p>
     * 
     * @return The description of the filter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the filter.
     * </p>
     * 
     * @param description
     *        The description of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param action
     *        Specifies the action that is to be applied to the findings that match the filter.
     * @see FilterAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @return Specifies the action that is to be applied to the findings that match the filter.
     * @see FilterAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param action
     *        Specifies the action that is to be applied to the findings that match the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterAction
     */

    public CreateFilterRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param action
     *        Specifies the action that is to be applied to the findings that match the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterAction
     */

    public CreateFilterRequest withAction(FilterAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the position of the filter in the list of current filters. Also specifies the order in which this
     * filter is applied to the findings.
     * </p>
     * 
     * @param rank
     *        Specifies the position of the filter in the list of current filters. Also specifies the order in which
     *        this filter is applied to the findings.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * Specifies the position of the filter in the list of current filters. Also specifies the order in which this
     * filter is applied to the findings.
     * </p>
     * 
     * @return Specifies the position of the filter in the list of current filters. Also specifies the order in which
     *         this filter is applied to the findings.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * <p>
     * Specifies the position of the filter in the list of current filters. Also specifies the order in which this
     * filter is applied to the findings.
     * </p>
     * 
     * @param rank
     *        Specifies the position of the filter in the list of current filters. Also specifies the order in which
     *        this filter is applied to the findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withRank(Integer rank) {
        setRank(rank);
        return this;
    }

    /**
     * <p>
     * Represents the criteria to be used in the filter for querying findings.
     * </p>
     * <p>
     * You can only use the following attributes to query findings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId
     * </p>
     * </li>
     * <li>
     * <p>
     * region
     * </p>
     * </li>
     * <li>
     * <p>
     * confidence
     * </p>
     * </li>
     * <li>
     * <p>
     * id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.accessKeyId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.principalId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userType
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.iamInstanceProfile.id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.imageId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.instanceId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.outpostArn
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.ipv6Addresses
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicDnsName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicIp
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.subnetId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.vpcId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.key
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.value
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.resourceType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.actionType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.api
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.callerType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.errorCode
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.country.countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.serviceName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.dnsRequestAction.domain
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.blocked
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.connectionDirection
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.localPortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.protocol
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.localIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.country.countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remotePortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.additionalInfo.threatListName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.archived
     * </p>
     * <p>
     * When this attribute is set to TRUE, only archived findings are listed. When it's set to FALSE, only unarchived
     * findings are listed. When this attribute is not set, all existing findings are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * service.resourceRole
     * </p>
     * </li>
     * <li>
     * <p>
     * severity
     * </p>
     * </li>
     * <li>
     * <p>
     * type
     * </p>
     * </li>
     * <li>
     * <p>
     * updatedAt
     * </p>
     * <p>
     * Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on whether the value
     * contains milliseconds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingCriteria
     *        Represents the criteria to be used in the filter for querying findings.</p>
     *        <p>
     *        You can only use the following attributes to query findings:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        accountId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        region
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        confidence
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.accessKeyDetails.accessKeyId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.accessKeyDetails.principalId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.accessKeyDetails.userName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.accessKeyDetails.userType
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.iamInstanceProfile.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.imageId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.instanceId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.outpostArn
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.ipv6Addresses
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.publicDnsName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.publicIp
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.securityGroups.groupId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.securityGroups.groupName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.subnetId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.vpcId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.tags.key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.tags.value
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.resourceType
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.actionType
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.api
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.callerType
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.errorCode
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.remoteIpDetails.city.cityName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.remoteIpDetails.country.countryName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.remoteIpDetails.organization.asn
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.serviceName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.dnsRequestAction.domain
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.blocked
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.connectionDirection
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.localPortDetails.port
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.protocol
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.localIpDetails.ipAddressV4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.remoteIpDetails.city.cityName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.remoteIpDetails.country.countryName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.remoteIpDetails.organization.asn
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.remotePortDetails.port
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.additionalInfo.threatListName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.archived
     *        </p>
     *        <p>
     *        When this attribute is set to TRUE, only archived findings are listed. When it's set to FALSE, only
     *        unarchived findings are listed. When this attribute is not set, all existing findings are listed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.resourceRole
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        severity
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        type
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        updatedAt
     *        </p>
     *        <p>
     *        Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on whether the
     *        value contains milliseconds.
     *        </p>
     *        </li>
     */

    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * <p>
     * Represents the criteria to be used in the filter for querying findings.
     * </p>
     * <p>
     * You can only use the following attributes to query findings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId
     * </p>
     * </li>
     * <li>
     * <p>
     * region
     * </p>
     * </li>
     * <li>
     * <p>
     * confidence
     * </p>
     * </li>
     * <li>
     * <p>
     * id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.accessKeyId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.principalId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userType
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.iamInstanceProfile.id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.imageId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.instanceId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.outpostArn
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.ipv6Addresses
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicDnsName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicIp
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.subnetId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.vpcId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.key
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.value
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.resourceType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.actionType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.api
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.callerType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.errorCode
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.country.countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.serviceName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.dnsRequestAction.domain
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.blocked
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.connectionDirection
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.localPortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.protocol
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.localIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.country.countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remotePortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.additionalInfo.threatListName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.archived
     * </p>
     * <p>
     * When this attribute is set to TRUE, only archived findings are listed. When it's set to FALSE, only unarchived
     * findings are listed. When this attribute is not set, all existing findings are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * service.resourceRole
     * </p>
     * </li>
     * <li>
     * <p>
     * severity
     * </p>
     * </li>
     * <li>
     * <p>
     * type
     * </p>
     * </li>
     * <li>
     * <p>
     * updatedAt
     * </p>
     * <p>
     * Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on whether the value
     * contains milliseconds.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Represents the criteria to be used in the filter for querying findings.</p>
     *         <p>
     *         You can only use the following attributes to query findings:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         accountId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         region
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         confidence
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.accessKeyDetails.accessKeyId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.accessKeyDetails.principalId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.accessKeyDetails.userName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.accessKeyDetails.userType
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.iamInstanceProfile.id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.imageId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.instanceId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.outpostArn
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.ipv6Addresses
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.publicDnsName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.publicIp
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.securityGroups.groupId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.securityGroups.groupName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.subnetId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.networkInterfaces.vpcId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.tags.key
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.instanceDetails.tags.value
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resource.resourceType
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.actionType
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.api
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.callerType
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.errorCode
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.remoteIpDetails.city.cityName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.remoteIpDetails.country.countryName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.remoteIpDetails.organization.asn
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.awsApiCallAction.serviceName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.dnsRequestAction.domain
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.blocked
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.connectionDirection
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.localPortDetails.port
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.protocol
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.localIpDetails.ipAddressV4
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.remoteIpDetails.city.cityName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.remoteIpDetails.country.countryName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.remoteIpDetails.organization.asn
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.action.networkConnectionAction.remotePortDetails.port
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.additionalInfo.threatListName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.archived
     *         </p>
     *         <p>
     *         When this attribute is set to TRUE, only archived findings are listed. When it's set to FALSE, only
     *         unarchived findings are listed. When this attribute is not set, all existing findings are listed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         service.resourceRole
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         severity
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         type
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         updatedAt
     *         </p>
     *         <p>
     *         Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on whether the
     *         value contains milliseconds.
     *         </p>
     *         </li>
     */

    public FindingCriteria getFindingCriteria() {
        return this.findingCriteria;
    }

    /**
     * <p>
     * Represents the criteria to be used in the filter for querying findings.
     * </p>
     * <p>
     * You can only use the following attributes to query findings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId
     * </p>
     * </li>
     * <li>
     * <p>
     * region
     * </p>
     * </li>
     * <li>
     * <p>
     * confidence
     * </p>
     * </li>
     * <li>
     * <p>
     * id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.accessKeyId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.principalId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.accessKeyDetails.userType
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.iamInstanceProfile.id
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.imageId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.instanceId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.outpostArn
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.ipv6Addresses
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicDnsName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.publicIp
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.securityGroups.groupName
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.subnetId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.networkInterfaces.vpcId
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.key
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.instanceDetails.tags.value
     * </p>
     * </li>
     * <li>
     * <p>
     * resource.resourceType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.actionType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.api
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.callerType
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.errorCode
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.country.countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.awsApiCallAction.serviceName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.dnsRequestAction.domain
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.blocked
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.connectionDirection
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.localPortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.protocol
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.localIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.city.cityName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.country.countryName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.asn
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg
     * </p>
     * </li>
     * <li>
     * <p>
     * service.action.networkConnectionAction.remotePortDetails.port
     * </p>
     * </li>
     * <li>
     * <p>
     * service.additionalInfo.threatListName
     * </p>
     * </li>
     * <li>
     * <p>
     * service.archived
     * </p>
     * <p>
     * When this attribute is set to TRUE, only archived findings are listed. When it's set to FALSE, only unarchived
     * findings are listed. When this attribute is not set, all existing findings are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * service.resourceRole
     * </p>
     * </li>
     * <li>
     * <p>
     * severity
     * </p>
     * </li>
     * <li>
     * <p>
     * type
     * </p>
     * </li>
     * <li>
     * <p>
     * updatedAt
     * </p>
     * <p>
     * Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on whether the value
     * contains milliseconds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingCriteria
     *        Represents the criteria to be used in the filter for querying findings.</p>
     *        <p>
     *        You can only use the following attributes to query findings:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        accountId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        region
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        confidence
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.accessKeyDetails.accessKeyId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.accessKeyDetails.principalId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.accessKeyDetails.userName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.accessKeyDetails.userType
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.iamInstanceProfile.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.imageId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.instanceId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.outpostArn
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.ipv6Addresses
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.publicDnsName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.publicIp
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.securityGroups.groupId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.securityGroups.groupName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.subnetId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.networkInterfaces.vpcId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.tags.key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.instanceDetails.tags.value
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resource.resourceType
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.actionType
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.api
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.callerType
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.errorCode
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.remoteIpDetails.city.cityName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.remoteIpDetails.country.countryName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.remoteIpDetails.organization.asn
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.awsApiCallAction.serviceName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.dnsRequestAction.domain
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.blocked
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.connectionDirection
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.localPortDetails.port
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.protocol
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.localIpDetails.ipAddressV4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.remoteIpDetails.city.cityName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.remoteIpDetails.country.countryName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.remoteIpDetails.organization.asn
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.action.networkConnectionAction.remotePortDetails.port
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.additionalInfo.threatListName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.archived
     *        </p>
     *        <p>
     *        When this attribute is set to TRUE, only archived findings are listed. When it's set to FALSE, only
     *        unarchived findings are listed. When this attribute is not set, all existing findings are listed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        service.resourceRole
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        severity
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        type
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        updatedAt
     *        </p>
     *        <p>
     *        Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on whether the
     *        value contains milliseconds.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withFindingCriteria(FindingCriteria findingCriteria) {
        setFindingCriteria(findingCriteria);
        return this;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the create request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * 
     * @return The idempotency token for the create request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the create request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags to be added to a new filter resource.
     * </p>
     * 
     * @return The tags to be added to a new filter resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be added to a new filter resource.
     * </p>
     * 
     * @param tags
     *        The tags to be added to a new filter resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be added to a new filter resource.
     * </p>
     * 
     * @param tags
     *        The tags to be added to a new filter resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateFilterRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getRank() != null)
            sb.append("Rank: ").append(getRank()).append(",");
        if (getFindingCriteria() != null)
            sb.append("FindingCriteria: ").append(getFindingCriteria()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFilterRequest == false)
            return false;
        CreateFilterRequest other = (CreateFilterRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        hashCode = prime * hashCode + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFilterRequest clone() {
        return (CreateFilterRequest) super.clone();
    }

}
