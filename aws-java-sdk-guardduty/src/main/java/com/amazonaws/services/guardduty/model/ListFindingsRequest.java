/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFindings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose findings you want to list.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * Represents the criteria used for querying findings. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * JSON field name
     * </p>
     * </li>
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
     * When this attribute is set to 'true', only archived findings are listed. When it's set to 'false', only
     * unarchived findings are listed. When this attribute is not set, all existing findings are listed.
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
     * Type: Timestamp in Unix Epoch millisecond format: 1486685375000
     * </p>
     * </li>
     * </ul>
     */
    private FindingCriteria findingCriteria;
    /**
     * <p>
     * Represents the criteria used for sorting findings.
     * </p>
     */
    private SortCriteria sortCriteria;
    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you want in the response. The default value is
     * 50. The maximum value is 50.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the list action. For subsequent calls to the action fill nextToken in the request with the value of NextToken
     * from the previous response to continue listing data.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose findings you want to list.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector that specifies the GuardDuty service whose findings you want to list.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose findings you want to list.
     * </p>
     * 
     * @return The ID of the detector that specifies the GuardDuty service whose findings you want to list.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The ID of the detector that specifies the GuardDuty service whose findings you want to list.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector that specifies the GuardDuty service whose findings you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * Represents the criteria used for querying findings. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * JSON field name
     * </p>
     * </li>
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
     * When this attribute is set to 'true', only archived findings are listed. When it's set to 'false', only
     * unarchived findings are listed. When this attribute is not set, all existing findings are listed.
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
     * Type: Timestamp in Unix Epoch millisecond format: 1486685375000
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingCriteria
     *        Represents the criteria used for querying findings. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        JSON field name
     *        </p>
     *        </li>
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
     *        When this attribute is set to 'true', only archived findings are listed. When it's set to 'false', only
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
     *        Type: Timestamp in Unix Epoch millisecond format: 1486685375000
     *        </p>
     *        </li>
     */

    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * <p>
     * Represents the criteria used for querying findings. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * JSON field name
     * </p>
     * </li>
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
     * When this attribute is set to 'true', only archived findings are listed. When it's set to 'false', only
     * unarchived findings are listed. When this attribute is not set, all existing findings are listed.
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
     * Type: Timestamp in Unix Epoch millisecond format: 1486685375000
     * </p>
     * </li>
     * </ul>
     * 
     * @return Represents the criteria used for querying findings. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         JSON field name
     *         </p>
     *         </li>
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
     *         When this attribute is set to 'true', only archived findings are listed. When it's set to 'false', only
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
     *         Type: Timestamp in Unix Epoch millisecond format: 1486685375000
     *         </p>
     *         </li>
     */

    public FindingCriteria getFindingCriteria() {
        return this.findingCriteria;
    }

    /**
     * <p>
     * Represents the criteria used for querying findings. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * JSON field name
     * </p>
     * </li>
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
     * When this attribute is set to 'true', only archived findings are listed. When it's set to 'false', only
     * unarchived findings are listed. When this attribute is not set, all existing findings are listed.
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
     * Type: Timestamp in Unix Epoch millisecond format: 1486685375000
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingCriteria
     *        Represents the criteria used for querying findings. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        JSON field name
     *        </p>
     *        </li>
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
     *        When this attribute is set to 'true', only archived findings are listed. When it's set to 'false', only
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
     *        Type: Timestamp in Unix Epoch millisecond format: 1486685375000
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsRequest withFindingCriteria(FindingCriteria findingCriteria) {
        setFindingCriteria(findingCriteria);
        return this;
    }

    /**
     * <p>
     * Represents the criteria used for sorting findings.
     * </p>
     * 
     * @param sortCriteria
     *        Represents the criteria used for sorting findings.
     */

    public void setSortCriteria(SortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    /**
     * <p>
     * Represents the criteria used for sorting findings.
     * </p>
     * 
     * @return Represents the criteria used for sorting findings.
     */

    public SortCriteria getSortCriteria() {
        return this.sortCriteria;
    }

    /**
     * <p>
     * Represents the criteria used for sorting findings.
     * </p>
     * 
     * @param sortCriteria
     *        Represents the criteria used for sorting findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsRequest withSortCriteria(SortCriteria sortCriteria) {
        setSortCriteria(sortCriteria);
        return this;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you want in the response. The default value is
     * 50. The maximum value is 50.
     * </p>
     * 
     * @param maxResults
     *        You can use this parameter to indicate the maximum number of items you want in the response. The default
     *        value is 50. The maximum value is 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you want in the response. The default value is
     * 50. The maximum value is 50.
     * </p>
     * 
     * @return You can use this parameter to indicate the maximum number of items you want in the response. The default
     *         value is 50. The maximum value is 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you want in the response. The default value is
     * 50. The maximum value is 50.
     * </p>
     * 
     * @param maxResults
     *        You can use this parameter to indicate the maximum number of items you want in the response. The default
     *        value is 50. The maximum value is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the list action. For subsequent calls to the action fill nextToken in the request with the value of NextToken
     * from the previous response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *        call to the list action. For subsequent calls to the action fill nextToken in the request with the value
     *        of NextToken from the previous response to continue listing data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the list action. For subsequent calls to the action fill nextToken in the request with the value of NextToken
     * from the previous response to continue listing data.
     * </p>
     * 
     * @return You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *         call to the list action. For subsequent calls to the action fill nextToken in the request with the value
     *         of NextToken from the previous response to continue listing data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the list action. For subsequent calls to the action fill nextToken in the request with the value of NextToken
     * from the previous response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *        call to the list action. For subsequent calls to the action fill nextToken in the request with the value
     *        of NextToken from the previous response to continue listing data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getFindingCriteria() != null)
            sb.append("FindingCriteria: ").append(getFindingCriteria()).append(",");
        if (getSortCriteria() != null)
            sb.append("SortCriteria: ").append(getSortCriteria()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFindingsRequest == false)
            return false;
        ListFindingsRequest other = (ListFindingsRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null && other.getSortCriteria().equals(this.getSortCriteria()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFindingsRequest clone() {
        return (ListFindingsRequest) super.clone();
    }

}
