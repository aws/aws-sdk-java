/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a kdb environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxEnvironment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the kdb environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The unique identifier of the AWS account in which you create the kdb environment.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The status of the environment creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE_REQUESTED – Environment creation has been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING – Environment is in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED_CREATION – Environment creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATED – Environment is successfully created and is currently active.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE REQUESTED – Environment deletion has been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – Environment is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETRY_DELETION – Initial environment deletion failed, system is reattempting delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – Environment has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED_DELETION – Environment deletion has failed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The status of the network configuration.
     * </p>
     */
    private String tgwStatus;
    /**
     * <p>
     * The status of DNS configuration.
     * </p>
     */
    private String dnsStatus;
    /**
     * <p>
     * Specifies the error message that appears if a flow fails.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * A description of the kdb environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of your kdb environment.
     * </p>
     */
    private String environmentArn;
    /**
     * <p>
     * The unique identifier of the KMS key.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A unique identifier for the AWS environment infrastructure account.
     * </p>
     */
    private String dedicatedServiceAccountId;
    /**
     * <p>
     * Specifies the transit gateway and network configuration to connect the kdb environment to an internal network.
     * </p>
     */
    private TransitGatewayConfiguration transitGatewayConfiguration;
    /**
     * <p>
     * A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * </p>
     */
    private java.util.List<CustomDNSServer> customDNSConfiguration;
    /**
     * <p>
     * The timestamp at which the kdb environment was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The timestamp at which the kdb environment was modified in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date updateTimestamp;
    /**
     * <p>
     * The identifier of the availability zones where subnets for the environment are created.
     * </p>
     */
    private java.util.List<String> availabilityZoneIds;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate authority:
     * </p>
     */
    private String certificateAuthorityArn;

    /**
     * <p>
     * The name of the kdb environment.
     * </p>
     * 
     * @param name
     *        The name of the kdb environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the kdb environment.
     * </p>
     * 
     * @return The name of the kdb environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the kdb environment.
     * </p>
     * 
     * @param name
     *        The name of the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @return A unique identifier for the kdb environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the AWS account in which you create the kdb environment.
     * </p>
     * 
     * @param awsAccountId
     *        The unique identifier of the AWS account in which you create the kdb environment.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The unique identifier of the AWS account in which you create the kdb environment.
     * </p>
     * 
     * @return The unique identifier of the AWS account in which you create the kdb environment.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The unique identifier of the AWS account in which you create the kdb environment.
     * </p>
     * 
     * @param awsAccountId
     *        The unique identifier of the AWS account in which you create the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The status of the environment creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE_REQUESTED – Environment creation has been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING – Environment is in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED_CREATION – Environment creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATED – Environment is successfully created and is currently active.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE REQUESTED – Environment deletion has been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – Environment is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETRY_DELETION – Initial environment deletion failed, system is reattempting delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – Environment has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED_DELETION – Environment deletion has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the environment creation. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE_REQUESTED – Environment creation has been requested.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATING – Environment is in the process of being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED_CREATION – Environment creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATED – Environment is successfully created and is currently active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE REQUESTED – Environment deletion has been requested.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – Environment is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RETRY_DELETION – Initial environment deletion failed, system is reattempting delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – Environment has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED_DELETION – Environment deletion has failed.
     *        </p>
     *        </li>
     * @see EnvironmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the environment creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE_REQUESTED – Environment creation has been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING – Environment is in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED_CREATION – Environment creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATED – Environment is successfully created and is currently active.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE REQUESTED – Environment deletion has been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – Environment is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETRY_DELETION – Initial environment deletion failed, system is reattempting delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – Environment has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED_DELETION – Environment deletion has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the environment creation. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE_REQUESTED – Environment creation has been requested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATING – Environment is in the process of being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED_CREATION – Environment creation has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATED – Environment is successfully created and is currently active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE REQUESTED – Environment deletion has been requested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETING – Environment is in the process of being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RETRY_DELETION – Initial environment deletion failed, system is reattempting delete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETED – Environment has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED_DELETION – Environment deletion has failed.
     *         </p>
     *         </li>
     * @see EnvironmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the environment creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE_REQUESTED – Environment creation has been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING – Environment is in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED_CREATION – Environment creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATED – Environment is successfully created and is currently active.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE REQUESTED – Environment deletion has been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – Environment is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETRY_DELETION – Initial environment deletion failed, system is reattempting delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – Environment has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED_DELETION – Environment deletion has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the environment creation. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE_REQUESTED – Environment creation has been requested.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATING – Environment is in the process of being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED_CREATION – Environment creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATED – Environment is successfully created and is currently active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE REQUESTED – Environment deletion has been requested.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – Environment is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RETRY_DELETION – Initial environment deletion failed, system is reattempting delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – Environment has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED_DELETION – Environment deletion has failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public KxEnvironment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the environment creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE_REQUESTED – Environment creation has been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING – Environment is in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED_CREATION – Environment creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATED – Environment is successfully created and is currently active.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE REQUESTED – Environment deletion has been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – Environment is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETRY_DELETION – Initial environment deletion failed, system is reattempting delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – Environment has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED_DELETION – Environment deletion has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the environment creation. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE_REQUESTED – Environment creation has been requested.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATING – Environment is in the process of being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED_CREATION – Environment creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATED – Environment is successfully created and is currently active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE REQUESTED – Environment deletion has been requested.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – Environment is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RETRY_DELETION – Initial environment deletion failed, system is reattempting delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – Environment has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED_DELETION – Environment deletion has failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public KxEnvironment withStatus(EnvironmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status of the network configuration.
     * </p>
     * 
     * @param tgwStatus
     *        The status of the network configuration.
     * @see TgwStatus
     */

    public void setTgwStatus(String tgwStatus) {
        this.tgwStatus = tgwStatus;
    }

    /**
     * <p>
     * The status of the network configuration.
     * </p>
     * 
     * @return The status of the network configuration.
     * @see TgwStatus
     */

    public String getTgwStatus() {
        return this.tgwStatus;
    }

    /**
     * <p>
     * The status of the network configuration.
     * </p>
     * 
     * @param tgwStatus
     *        The status of the network configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TgwStatus
     */

    public KxEnvironment withTgwStatus(String tgwStatus) {
        setTgwStatus(tgwStatus);
        return this;
    }

    /**
     * <p>
     * The status of the network configuration.
     * </p>
     * 
     * @param tgwStatus
     *        The status of the network configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TgwStatus
     */

    public KxEnvironment withTgwStatus(TgwStatus tgwStatus) {
        this.tgwStatus = tgwStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of DNS configuration.
     * </p>
     * 
     * @param dnsStatus
     *        The status of DNS configuration.
     * @see DnsStatus
     */

    public void setDnsStatus(String dnsStatus) {
        this.dnsStatus = dnsStatus;
    }

    /**
     * <p>
     * The status of DNS configuration.
     * </p>
     * 
     * @return The status of DNS configuration.
     * @see DnsStatus
     */

    public String getDnsStatus() {
        return this.dnsStatus;
    }

    /**
     * <p>
     * The status of DNS configuration.
     * </p>
     * 
     * @param dnsStatus
     *        The status of DNS configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsStatus
     */

    public KxEnvironment withDnsStatus(String dnsStatus) {
        setDnsStatus(dnsStatus);
        return this;
    }

    /**
     * <p>
     * The status of DNS configuration.
     * </p>
     * 
     * @param dnsStatus
     *        The status of DNS configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsStatus
     */

    public KxEnvironment withDnsStatus(DnsStatus dnsStatus) {
        this.dnsStatus = dnsStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the error message that appears if a flow fails.
     * </p>
     * 
     * @param errorMessage
     *        Specifies the error message that appears if a flow fails.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Specifies the error message that appears if a flow fails.
     * </p>
     * 
     * @return Specifies the error message that appears if a flow fails.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Specifies the error message that appears if a flow fails.
     * </p>
     * 
     * @param errorMessage
     *        Specifies the error message that appears if a flow fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * A description of the kdb environment.
     * </p>
     * 
     * @param description
     *        A description of the kdb environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the kdb environment.
     * </p>
     * 
     * @return A description of the kdb environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the kdb environment.
     * </p>
     * 
     * @param description
     *        A description of the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your kdb environment.
     * </p>
     * 
     * @param environmentArn
     *        The Amazon Resource Name (ARN) of your kdb environment.
     */

    public void setEnvironmentArn(String environmentArn) {
        this.environmentArn = environmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your kdb environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of your kdb environment.
     */

    public String getEnvironmentArn() {
        return this.environmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your kdb environment.
     * </p>
     * 
     * @param environmentArn
     *        The Amazon Resource Name (ARN) of your kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withEnvironmentArn(String environmentArn) {
        setEnvironmentArn(environmentArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the KMS key.
     * </p>
     * 
     * @param kmsKeyId
     *        The unique identifier of the KMS key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The unique identifier of the KMS key.
     * </p>
     * 
     * @return The unique identifier of the KMS key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The unique identifier of the KMS key.
     * </p>
     * 
     * @param kmsKeyId
     *        The unique identifier of the KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the AWS environment infrastructure account.
     * </p>
     * 
     * @param dedicatedServiceAccountId
     *        A unique identifier for the AWS environment infrastructure account.
     */

    public void setDedicatedServiceAccountId(String dedicatedServiceAccountId) {
        this.dedicatedServiceAccountId = dedicatedServiceAccountId;
    }

    /**
     * <p>
     * A unique identifier for the AWS environment infrastructure account.
     * </p>
     * 
     * @return A unique identifier for the AWS environment infrastructure account.
     */

    public String getDedicatedServiceAccountId() {
        return this.dedicatedServiceAccountId;
    }

    /**
     * <p>
     * A unique identifier for the AWS environment infrastructure account.
     * </p>
     * 
     * @param dedicatedServiceAccountId
     *        A unique identifier for the AWS environment infrastructure account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withDedicatedServiceAccountId(String dedicatedServiceAccountId) {
        setDedicatedServiceAccountId(dedicatedServiceAccountId);
        return this;
    }

    /**
     * <p>
     * Specifies the transit gateway and network configuration to connect the kdb environment to an internal network.
     * </p>
     * 
     * @param transitGatewayConfiguration
     *        Specifies the transit gateway and network configuration to connect the kdb environment to an internal
     *        network.
     */

    public void setTransitGatewayConfiguration(TransitGatewayConfiguration transitGatewayConfiguration) {
        this.transitGatewayConfiguration = transitGatewayConfiguration;
    }

    /**
     * <p>
     * Specifies the transit gateway and network configuration to connect the kdb environment to an internal network.
     * </p>
     * 
     * @return Specifies the transit gateway and network configuration to connect the kdb environment to an internal
     *         network.
     */

    public TransitGatewayConfiguration getTransitGatewayConfiguration() {
        return this.transitGatewayConfiguration;
    }

    /**
     * <p>
     * Specifies the transit gateway and network configuration to connect the kdb environment to an internal network.
     * </p>
     * 
     * @param transitGatewayConfiguration
     *        Specifies the transit gateway and network configuration to connect the kdb environment to an internal
     *        network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withTransitGatewayConfiguration(TransitGatewayConfiguration transitGatewayConfiguration) {
        setTransitGatewayConfiguration(transitGatewayConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * </p>
     * 
     * @return A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     */

    public java.util.List<CustomDNSServer> getCustomDNSConfiguration() {
        return customDNSConfiguration;
    }

    /**
     * <p>
     * A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * </p>
     * 
     * @param customDNSConfiguration
     *        A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     */

    public void setCustomDNSConfiguration(java.util.Collection<CustomDNSServer> customDNSConfiguration) {
        if (customDNSConfiguration == null) {
            this.customDNSConfiguration = null;
            return;
        }

        this.customDNSConfiguration = new java.util.ArrayList<CustomDNSServer>(customDNSConfiguration);
    }

    /**
     * <p>
     * A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomDNSConfiguration(java.util.Collection)} or
     * {@link #withCustomDNSConfiguration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customDNSConfiguration
     *        A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withCustomDNSConfiguration(CustomDNSServer... customDNSConfiguration) {
        if (this.customDNSConfiguration == null) {
            setCustomDNSConfiguration(new java.util.ArrayList<CustomDNSServer>(customDNSConfiguration.length));
        }
        for (CustomDNSServer ele : customDNSConfiguration) {
            this.customDNSConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * </p>
     * 
     * @param customDNSConfiguration
     *        A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withCustomDNSConfiguration(java.util.Collection<CustomDNSServer> customDNSConfiguration) {
        setCustomDNSConfiguration(customDNSConfiguration);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the kdb environment was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param creationTimestamp
     *        The timestamp at which the kdb environment was created in FinSpace. The value is determined as epoch time
     *        in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the kdb environment was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the kdb environment was created in FinSpace. The value is determined as epoch time
     *         in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the kdb environment was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param creationTimestamp
     *        The timestamp at which the kdb environment was created in FinSpace. The value is determined as epoch time
     *        in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the kdb environment was modified in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param updateTimestamp
     *        The timestamp at which the kdb environment was modified in FinSpace. The value is determined as epoch time
     *        in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setUpdateTimestamp(java.util.Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the kdb environment was modified in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the kdb environment was modified in FinSpace. The value is determined as epoch
     *         time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the kdb environment was modified in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param updateTimestamp
     *        The timestamp at which the kdb environment was modified in FinSpace. The value is determined as epoch time
     *        in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withUpdateTimestamp(java.util.Date updateTimestamp) {
        setUpdateTimestamp(updateTimestamp);
        return this;
    }

    /**
     * <p>
     * The identifier of the availability zones where subnets for the environment are created.
     * </p>
     * 
     * @return The identifier of the availability zones where subnets for the environment are created.
     */

    public java.util.List<String> getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    /**
     * <p>
     * The identifier of the availability zones where subnets for the environment are created.
     * </p>
     * 
     * @param availabilityZoneIds
     *        The identifier of the availability zones where subnets for the environment are created.
     */

    public void setAvailabilityZoneIds(java.util.Collection<String> availabilityZoneIds) {
        if (availabilityZoneIds == null) {
            this.availabilityZoneIds = null;
            return;
        }

        this.availabilityZoneIds = new java.util.ArrayList<String>(availabilityZoneIds);
    }

    /**
     * <p>
     * The identifier of the availability zones where subnets for the environment are created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZoneIds(java.util.Collection)} or {@link #withAvailabilityZoneIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param availabilityZoneIds
     *        The identifier of the availability zones where subnets for the environment are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withAvailabilityZoneIds(String... availabilityZoneIds) {
        if (this.availabilityZoneIds == null) {
            setAvailabilityZoneIds(new java.util.ArrayList<String>(availabilityZoneIds.length));
        }
        for (String ele : availabilityZoneIds) {
            this.availabilityZoneIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier of the availability zones where subnets for the environment are created.
     * </p>
     * 
     * @param availabilityZoneIds
     *        The identifier of the availability zones where subnets for the environment are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withAvailabilityZoneIds(java.util.Collection<String> availabilityZoneIds) {
        setAvailabilityZoneIds(availabilityZoneIds);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate authority:
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the certificate authority:
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate authority:
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate authority:
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate authority:
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the certificate authority:
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxEnvironment withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTgwStatus() != null)
            sb.append("TgwStatus: ").append(getTgwStatus()).append(",");
        if (getDnsStatus() != null)
            sb.append("DnsStatus: ").append(getDnsStatus()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnvironmentArn() != null)
            sb.append("EnvironmentArn: ").append(getEnvironmentArn()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDedicatedServiceAccountId() != null)
            sb.append("DedicatedServiceAccountId: ").append(getDedicatedServiceAccountId()).append(",");
        if (getTransitGatewayConfiguration() != null)
            sb.append("TransitGatewayConfiguration: ").append(getTransitGatewayConfiguration()).append(",");
        if (getCustomDNSConfiguration() != null)
            sb.append("CustomDNSConfiguration: ").append(getCustomDNSConfiguration()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getUpdateTimestamp() != null)
            sb.append("UpdateTimestamp: ").append(getUpdateTimestamp()).append(",");
        if (getAvailabilityZoneIds() != null)
            sb.append("AvailabilityZoneIds: ").append(getAvailabilityZoneIds()).append(",");
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxEnvironment == false)
            return false;
        KxEnvironment other = (KxEnvironment) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTgwStatus() == null ^ this.getTgwStatus() == null)
            return false;
        if (other.getTgwStatus() != null && other.getTgwStatus().equals(this.getTgwStatus()) == false)
            return false;
        if (other.getDnsStatus() == null ^ this.getDnsStatus() == null)
            return false;
        if (other.getDnsStatus() != null && other.getDnsStatus().equals(this.getDnsStatus()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnvironmentArn() == null ^ this.getEnvironmentArn() == null)
            return false;
        if (other.getEnvironmentArn() != null && other.getEnvironmentArn().equals(this.getEnvironmentArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDedicatedServiceAccountId() == null ^ this.getDedicatedServiceAccountId() == null)
            return false;
        if (other.getDedicatedServiceAccountId() != null && other.getDedicatedServiceAccountId().equals(this.getDedicatedServiceAccountId()) == false)
            return false;
        if (other.getTransitGatewayConfiguration() == null ^ this.getTransitGatewayConfiguration() == null)
            return false;
        if (other.getTransitGatewayConfiguration() != null && other.getTransitGatewayConfiguration().equals(this.getTransitGatewayConfiguration()) == false)
            return false;
        if (other.getCustomDNSConfiguration() == null ^ this.getCustomDNSConfiguration() == null)
            return false;
        if (other.getCustomDNSConfiguration() != null && other.getCustomDNSConfiguration().equals(this.getCustomDNSConfiguration()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getUpdateTimestamp() == null ^ this.getUpdateTimestamp() == null)
            return false;
        if (other.getUpdateTimestamp() != null && other.getUpdateTimestamp().equals(this.getUpdateTimestamp()) == false)
            return false;
        if (other.getAvailabilityZoneIds() == null ^ this.getAvailabilityZoneIds() == null)
            return false;
        if (other.getAvailabilityZoneIds() != null && other.getAvailabilityZoneIds().equals(this.getAvailabilityZoneIds()) == false)
            return false;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTgwStatus() == null) ? 0 : getTgwStatus().hashCode());
        hashCode = prime * hashCode + ((getDnsStatus() == null) ? 0 : getDnsStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentArn() == null) ? 0 : getEnvironmentArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDedicatedServiceAccountId() == null) ? 0 : getDedicatedServiceAccountId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayConfiguration() == null) ? 0 : getTransitGatewayConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomDNSConfiguration() == null) ? 0 : getCustomDNSConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdateTimestamp() == null) ? 0 : getUpdateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneIds() == null) ? 0 : getAvailabilityZoneIds().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        return hashCode;
    }

    @Override
    public KxEnvironment clone() {
        try {
            return (KxEnvironment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxEnvironmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
