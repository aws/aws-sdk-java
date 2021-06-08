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
 * In the response to an <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverQueryLogConfig.html"
 * >AssociateResolverQueryLogConfig</a>, <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverQueryLogConfig.html"
 * >DisassociateResolverQueryLogConfig</a>, <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverQueryLogConfigAssociation.html"
 * >GetResolverQueryLogConfigAssociation</a>, or <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigAssociations.html"
 * >ListResolverQueryLogConfigAssociations</a>, request, a complex type that contains settings for a specified
 * association between an Amazon VPC and a query logging configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ResolverQueryLogConfigAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolverQueryLogConfigAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the query logging association.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the query logging configuration that a VPC is associated with.
     * </p>
     */
    private String resolverQueryLogConfigId;
    /**
     * <p>
     * The ID of the Amazon VPC that is associated with the query logging configuration.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The status of the specified query logging association. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was successfully
     * created. Resolver is logging queries that originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code> indicates the cause:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the value of <code>Status</code> is a value other than <code>FAILED</code>, <code>Error</code> is null.
     * </p>
     */
    private String error;
    /**
     * <p>
     * Contains additional information about the error. If the value or <code>Error</code> is null, the value of
     * <code>ErrorMessage</code> also is null.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The date and time that the VPC was associated with the query logging configuration, in Unix time format and
     * Coordinated Universal Time (UTC).
     * </p>
     */
    private String creationTime;

    /**
     * <p>
     * The ID of the query logging association.
     * </p>
     * 
     * @param id
     *        The ID of the query logging association.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the query logging association.
     * </p>
     * 
     * @return The ID of the query logging association.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the query logging association.
     * </p>
     * 
     * @param id
     *        The ID of the query logging association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfigAssociation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the query logging configuration that a VPC is associated with.
     * </p>
     * 
     * @param resolverQueryLogConfigId
     *        The ID of the query logging configuration that a VPC is associated with.
     */

    public void setResolverQueryLogConfigId(String resolverQueryLogConfigId) {
        this.resolverQueryLogConfigId = resolverQueryLogConfigId;
    }

    /**
     * <p>
     * The ID of the query logging configuration that a VPC is associated with.
     * </p>
     * 
     * @return The ID of the query logging configuration that a VPC is associated with.
     */

    public String getResolverQueryLogConfigId() {
        return this.resolverQueryLogConfigId;
    }

    /**
     * <p>
     * The ID of the query logging configuration that a VPC is associated with.
     * </p>
     * 
     * @param resolverQueryLogConfigId
     *        The ID of the query logging configuration that a VPC is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfigAssociation withResolverQueryLogConfigId(String resolverQueryLogConfigId) {
        setResolverQueryLogConfigId(resolverQueryLogConfigId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that is associated with the query logging configuration.
     * </p>
     * 
     * @param resourceId
     *        The ID of the Amazon VPC that is associated with the query logging configuration.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that is associated with the query logging configuration.
     * </p>
     * 
     * @return The ID of the Amazon VPC that is associated with the query logging configuration.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that is associated with the query logging configuration.
     * </p>
     * 
     * @param resourceId
     *        The ID of the Amazon VPC that is associated with the query logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfigAssociation withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The status of the specified query logging association. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was successfully
     * created. Resolver is logging queries that originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the specified query logging association. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was
     *        successfully created. Resolver is logging queries that originate in the specified VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: Resolver is deleting this query logging association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association.
     *        </p>
     *        </li>
     * @see ResolverQueryLogConfigAssociationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the specified query logging association. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was successfully
     * created. Resolver is logging queries that originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the specified query logging association. Valid values include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     *         configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was
     *         successfully created. Resolver is logging queries that originate in the specified VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code>: Resolver is deleting this query logging association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association.
     *         </p>
     *         </li>
     * @see ResolverQueryLogConfigAssociationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the specified query logging association. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was successfully
     * created. Resolver is logging queries that originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the specified query logging association. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was
     *        successfully created. Resolver is logging queries that originate in the specified VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: Resolver is deleting this query logging association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverQueryLogConfigAssociationStatus
     */

    public ResolverQueryLogConfigAssociation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the specified query logging association. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was successfully
     * created. Resolver is logging queries that originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the specified query logging association. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was
     *        successfully created. Resolver is logging queries that originate in the specified VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: Resolver is deleting this query logging association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverQueryLogConfigAssociationStatus
     */

    public ResolverQueryLogConfigAssociation withStatus(ResolverQueryLogConfigAssociationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code> indicates the cause:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the value of <code>Status</code> is a value other than <code>FAILED</code>, <code>Error</code> is null.
     * </p>
     * 
     * @param error
     *        If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code> indicates the
     *        cause:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was
     *        deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the value of <code>Status</code> is a value other than <code>FAILED</code>, <code>Error</code> is null.
     * @see ResolverQueryLogConfigAssociationError
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code> indicates the cause:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the value of <code>Status</code> is a value other than <code>FAILED</code>, <code>Error</code> is null.
     * </p>
     * 
     * @return If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code> indicates the
     *         cause:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was
     *         deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the value of <code>Status</code> is a value other than <code>FAILED</code>, <code>Error</code> is
     *         null.
     * @see ResolverQueryLogConfigAssociationError
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code> indicates the cause:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the value of <code>Status</code> is a value other than <code>FAILED</code>, <code>Error</code> is null.
     * </p>
     * 
     * @param error
     *        If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code> indicates the
     *        cause:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was
     *        deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the value of <code>Status</code> is a value other than <code>FAILED</code>, <code>Error</code> is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverQueryLogConfigAssociationError
     */

    public ResolverQueryLogConfigAssociation withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code> indicates the cause:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the value of <code>Status</code> is a value other than <code>FAILED</code>, <code>Error</code> is null.
     * </p>
     * 
     * @param error
     *        If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code> indicates the
     *        cause:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was
     *        deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the value of <code>Status</code> is a value other than <code>FAILED</code>, <code>Error</code> is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverQueryLogConfigAssociationError
     */

    public ResolverQueryLogConfigAssociation withError(ResolverQueryLogConfigAssociationError error) {
        this.error = error.toString();
        return this;
    }

    /**
     * <p>
     * Contains additional information about the error. If the value or <code>Error</code> is null, the value of
     * <code>ErrorMessage</code> also is null.
     * </p>
     * 
     * @param errorMessage
     *        Contains additional information about the error. If the value or <code>Error</code> is null, the value of
     *        <code>ErrorMessage</code> also is null.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Contains additional information about the error. If the value or <code>Error</code> is null, the value of
     * <code>ErrorMessage</code> also is null.
     * </p>
     * 
     * @return Contains additional information about the error. If the value or <code>Error</code> is null, the value of
     *         <code>ErrorMessage</code> also is null.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Contains additional information about the error. If the value or <code>Error</code> is null, the value of
     * <code>ErrorMessage</code> also is null.
     * </p>
     * 
     * @param errorMessage
     *        Contains additional information about the error. If the value or <code>Error</code> is null, the value of
     *        <code>ErrorMessage</code> also is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfigAssociation withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The date and time that the VPC was associated with the query logging configuration, in Unix time format and
     * Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the VPC was associated with the query logging configuration, in Unix time format
     *        and Coordinated Universal Time (UTC).
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the VPC was associated with the query logging configuration, in Unix time format and
     * Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The date and time that the VPC was associated with the query logging configuration, in Unix time format
     *         and Coordinated Universal Time (UTC).
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the VPC was associated with the query logging configuration, in Unix time format and
     * Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the VPC was associated with the query logging configuration, in Unix time format
     *        and Coordinated Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverQueryLogConfigAssociation withCreationTime(String creationTime) {
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
        if (getResolverQueryLogConfigId() != null)
            sb.append("ResolverQueryLogConfigId: ").append(getResolverQueryLogConfigId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
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

        if (obj instanceof ResolverQueryLogConfigAssociation == false)
            return false;
        ResolverQueryLogConfigAssociation other = (ResolverQueryLogConfigAssociation) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResolverQueryLogConfigId() == null ^ this.getResolverQueryLogConfigId() == null)
            return false;
        if (other.getResolverQueryLogConfigId() != null && other.getResolverQueryLogConfigId().equals(this.getResolverQueryLogConfigId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
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
        hashCode = prime * hashCode + ((getResolverQueryLogConfigId() == null) ? 0 : getResolverQueryLogConfigId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public ResolverQueryLogConfigAssociation clone() {
        try {
            return (ResolverQueryLogConfigAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.ResolverQueryLogConfigAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
