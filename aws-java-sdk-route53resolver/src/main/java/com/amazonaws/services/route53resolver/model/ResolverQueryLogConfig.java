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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In the response to a <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverQueryLogConfig.html"
 * >CreateResolverQueryLogConfig</a>, <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DeleteResolverQueryLogConfig.html"
 * >DeleteResolverQueryLogConfig</a>, <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverQueryLogConfig.html"
 * >GetResolverQueryLogConfig</a>, or <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigs.html"
 * >ListResolverQueryLogConfigs</a> request, a complex type that contains settings for one query logging configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ResolverQueryLogConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolverQueryLogConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for the query logging configuration.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The AWS account ID for the account that created the query logging configuration.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The status of the specified query logging configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging queries that
     * originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver can't deliver logs to the location that is specified in the query logging
     * configuration. Here are two common causes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with
     * the current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     */
    private String shareStatus;
    /**
     * <p>
     * The number of VPCs that are associated with the query logging configuration.
     * </p>
     */
    private Integer associationCount;
    /**
     * <p>
     * The ARN for the query logging configuration.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the query logging configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a CloudWatch Logs log
     * group, or a Kinesis Data Firehose delivery stream.
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * A unique string that identifies the request that created the query logging configuration. The
     * <code>CreatorRequestId</code> allows failed requests to be retried without the risk of running the operation
     * twice.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The date and time that the query logging configuration was created, in Unix time format and Coordinated Universal
     * Time (UTC).
     * </p>
     */
    private String creationTime;

    /**
     * <p>
     * The ID for the query logging configuration.
     * </p>
     * 
     * @param id
     *        The ID for the query logging configuration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for the query logging configuration.
     * </p>
     * 
     * @return The ID for the query logging configuration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for the query logging configuration.
     * </p>
     * 
     * @param id
     *        The ID for the query logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfig withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The AWS account ID for the account that created the query logging configuration.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID for the account that created the query logging configuration.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID for the account that created the query logging configuration.
     * </p>
     * 
     * @return The AWS account ID for the account that created the query logging configuration.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID for the account that created the query logging configuration.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID for the account that created the query logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfig withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The status of the specified query logging configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging queries that
     * originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver can't deliver logs to the location that is specified in the query logging
     * configuration. Here are two common causes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the specified query logging configuration. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: Resolver is creating the query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging
     *        queries that originate in the specified VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: Resolver is deleting this query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: Resolver can't deliver logs to the location that is specified in the query logging
     *        configuration. Here are two common causes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The specified destination (for example, an Amazon S3 bucket) was deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Permissions don't allow sending logs to the destination.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see ResolverQueryLogConfigStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the specified query logging configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging queries that
     * originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver can't deliver logs to the location that is specified in the query logging
     * configuration. Here are two common causes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The status of the specified query logging configuration. Valid values include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code>: Resolver is creating the query logging configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging
     *         queries that originate in the specified VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code>: Resolver is deleting this query logging configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: Resolver can't deliver logs to the location that is specified in the query logging
     *         configuration. Here are two common causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The specified destination (for example, an Amazon S3 bucket) was deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Permissions don't allow sending logs to the destination.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see ResolverQueryLogConfigStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the specified query logging configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging queries that
     * originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver can't deliver logs to the location that is specified in the query logging
     * configuration. Here are two common causes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the specified query logging configuration. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: Resolver is creating the query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging
     *        queries that originate in the specified VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: Resolver is deleting this query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: Resolver can't deliver logs to the location that is specified in the query logging
     *        configuration. Here are two common causes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The specified destination (for example, an Amazon S3 bucket) was deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Permissions don't allow sending logs to the destination.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverQueryLogConfigStatus
     */

    public ResolverQueryLogConfig withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the specified query logging configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging queries that
     * originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver can't deliver logs to the location that is specified in the query logging
     * configuration. Here are two common causes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the specified query logging configuration. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: Resolver is creating the query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging
     *        queries that originate in the specified VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: Resolver is deleting this query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: Resolver can't deliver logs to the location that is specified in the query logging
     *        configuration. Here are two common causes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The specified destination (for example, an Amazon S3 bucket) was deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Permissions don't allow sending logs to the destination.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverQueryLogConfigStatus
     */

    public ResolverQueryLogConfig withStatus(ResolverQueryLogConfigStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with
     * the current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @param shareStatus
     *        An indication of whether the query logging configuration is shared with other AWS accounts, or was shared
     *        with the current account by another AWS account. Sharing is configured through AWS Resource Access Manager
     *        (AWS RAM).
     * @see ShareStatus
     */

    public void setShareStatus(String shareStatus) {
        this.shareStatus = shareStatus;
    }

    /**
     * <p>
     * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with
     * the current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @return An indication of whether the query logging configuration is shared with other AWS accounts, or was shared
     *         with the current account by another AWS account. Sharing is configured through AWS Resource Access
     *         Manager (AWS RAM).
     * @see ShareStatus
     */

    public String getShareStatus() {
        return this.shareStatus;
    }

    /**
     * <p>
     * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with
     * the current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @param shareStatus
     *        An indication of whether the query logging configuration is shared with other AWS accounts, or was shared
     *        with the current account by another AWS account. Sharing is configured through AWS Resource Access Manager
     *        (AWS RAM).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public ResolverQueryLogConfig withShareStatus(String shareStatus) {
        setShareStatus(shareStatus);
        return this;
    }

    /**
     * <p>
     * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with
     * the current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @param shareStatus
     *        An indication of whether the query logging configuration is shared with other AWS accounts, or was shared
     *        with the current account by another AWS account. Sharing is configured through AWS Resource Access Manager
     *        (AWS RAM).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public ResolverQueryLogConfig withShareStatus(ShareStatus shareStatus) {
        this.shareStatus = shareStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of VPCs that are associated with the query logging configuration.
     * </p>
     * 
     * @param associationCount
     *        The number of VPCs that are associated with the query logging configuration.
     */

    public void setAssociationCount(Integer associationCount) {
        this.associationCount = associationCount;
    }

    /**
     * <p>
     * The number of VPCs that are associated with the query logging configuration.
     * </p>
     * 
     * @return The number of VPCs that are associated with the query logging configuration.
     */

    public Integer getAssociationCount() {
        return this.associationCount;
    }

    /**
     * <p>
     * The number of VPCs that are associated with the query logging configuration.
     * </p>
     * 
     * @param associationCount
     *        The number of VPCs that are associated with the query logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfig withAssociationCount(Integer associationCount) {
        setAssociationCount(associationCount);
        return this;
    }

    /**
     * <p>
     * The ARN for the query logging configuration.
     * </p>
     * 
     * @param arn
     *        The ARN for the query logging configuration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the query logging configuration.
     * </p>
     * 
     * @return The ARN for the query logging configuration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN for the query logging configuration.
     * </p>
     * 
     * @param arn
     *        The ARN for the query logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfig withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the query logging configuration.
     * </p>
     * 
     * @param name
     *        The name of the query logging configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the query logging configuration.
     * </p>
     * 
     * @return The name of the query logging configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the query logging configuration.
     * </p>
     * 
     * @param name
     *        The name of the query logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a CloudWatch Logs log
     * group, or a Kinesis Data Firehose delivery stream.
     * </p>
     * 
     * @param destinationArn
     *        The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a CloudWatch Logs
     *        log group, or a Kinesis Data Firehose delivery stream.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a CloudWatch Logs log
     * group, or a Kinesis Data Firehose delivery stream.
     * </p>
     * 
     * @return The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a CloudWatch Logs
     *         log group, or a Kinesis Data Firehose delivery stream.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a CloudWatch Logs log
     * group, or a Kinesis Data Firehose delivery stream.
     * </p>
     * 
     * @param destinationArn
     *        The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a CloudWatch Logs
     *        log group, or a Kinesis Data Firehose delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfig withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request that created the query logging configuration. The
     * <code>CreatorRequestId</code> allows failed requests to be retried without the risk of running the operation
     * twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request that created the query logging configuration. The
     *        <code>CreatorRequestId</code> allows failed requests to be retried without the risk of running the
     *        operation twice.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request that created the query logging configuration. The
     * <code>CreatorRequestId</code> allows failed requests to be retried without the risk of running the operation
     * twice.
     * </p>
     * 
     * @return A unique string that identifies the request that created the query logging configuration. The
     *         <code>CreatorRequestId</code> allows failed requests to be retried without the risk of running the
     *         operation twice.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request that created the query logging configuration. The
     * <code>CreatorRequestId</code> allows failed requests to be retried without the risk of running the operation
     * twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request that created the query logging configuration. The
     *        <code>CreatorRequestId</code> allows failed requests to be retried without the risk of running the
     *        operation twice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfig withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The date and time that the query logging configuration was created, in Unix time format and Coordinated Universal
     * Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the query logging configuration was created, in Unix time format and Coordinated
     *        Universal Time (UTC).
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the query logging configuration was created, in Unix time format and Coordinated Universal
     * Time (UTC).
     * </p>
     * 
     * @return The date and time that the query logging configuration was created, in Unix time format and Coordinated
     *         Universal Time (UTC).
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the query logging configuration was created, in Unix time format and Coordinated Universal
     * Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the query logging configuration was created, in Unix time format and Coordinated
     *        Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfig withCreationTime(String creationTime) {
        setCreationTime(creationTime);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getShareStatus() != null)
            sb.append("ShareStatus: ").append(getShareStatus()).append(",");
        if (getAssociationCount() != null)
            sb.append("AssociationCount: ").append(getAssociationCount()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolverQueryLogConfig == false)
            return false;
        ResolverQueryLogConfig other = (ResolverQueryLogConfig) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getShareStatus() == null ^ this.getShareStatus() == null)
            return false;
        if (other.getShareStatus() != null && other.getShareStatus().equals(this.getShareStatus()) == false)
            return false;
        if (other.getAssociationCount() == null ^ this.getAssociationCount() == null)
            return false;
        if (other.getAssociationCount() != null && other.getAssociationCount().equals(this.getAssociationCount()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getShareStatus() == null) ? 0 : getShareStatus().hashCode());
        hashCode = prime * hashCode + ((getAssociationCount() == null) ? 0 : getAssociationCount().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public ResolverQueryLogConfig clone() {
        try {
            return (ResolverQueryLogConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.ResolverQueryLogConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
