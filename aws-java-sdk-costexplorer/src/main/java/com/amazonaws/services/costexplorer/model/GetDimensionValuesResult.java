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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetDimensionValues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDimensionValuesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The filters that you used to filter your request. Some dimensions are available only for a specific context.
     * </p>
     * <p>
     * If you set the context to <code>COST_AND_USAGE</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LEGAL_ENTITY_NAME - The name of the organization that sells you AWS services, such as Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The
     * value field contains the AWS ID of the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATION - The action performed. Examples include <code>RunInstance</code> and <code>CreateBucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * PURCHASE_TYPE - The reservation type of the purchase to which this usage is related. Examples include On-Demand
     * Instances and Standard Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE - The AWS service such as Amazon DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the
     * <code>GetDimensionValues</code> operation includes a unit attribute. Examples include GB and Hrs.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The
     * response for this operation includes a unit attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>RESERVATIONS</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are
     * <code>SingleAZ</code> and <code>MultiAZ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The
     * value field contains the AWS ID of the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single Availability
     * Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<DimensionValuesWithAttributes> dimensionValues;
    /**
     * <p>
     * The number of results that AWS returned at one time.
     * </p>
     */
    private Integer returnSize;
    /**
     * <p>
     * The total number of search results.
     * </p>
     */
    private Integer totalSize;
    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The filters that you used to filter your request. Some dimensions are available only for a specific context.
     * </p>
     * <p>
     * If you set the context to <code>COST_AND_USAGE</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LEGAL_ENTITY_NAME - The name of the organization that sells you AWS services, such as Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The
     * value field contains the AWS ID of the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATION - The action performed. Examples include <code>RunInstance</code> and <code>CreateBucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * PURCHASE_TYPE - The reservation type of the purchase to which this usage is related. Examples include On-Demand
     * Instances and Standard Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE - The AWS service such as Amazon DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the
     * <code>GetDimensionValues</code> operation includes a unit attribute. Examples include GB and Hrs.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The
     * response for this operation includes a unit attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>RESERVATIONS</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are
     * <code>SingleAZ</code> and <code>MultiAZ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The
     * value field contains the AWS ID of the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single Availability
     * Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters that you used to filter your request. Some dimensions are available only for a specific
     *         context.</p>
     *         <p>
     *         If you set the context to <code>COST_AND_USAGE</code>, you can use the following dimensions for
     *         searching:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LEGAL_ENTITY_NAME - The name of the organization that sells you AWS services, such as Amazon Web
     *         Services.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account.
     *         The value field contains the AWS ID of the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPERATION - The action performed. Examples include <code>RunInstance</code> and <code>CreateBucket</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PURCHASE_TYPE - The reservation type of the purchase to which this usage is related. Examples include
     *         On-Demand Instances and Standard Reserved Instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SERVICE - The AWS service such as Amazon DynamoDB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the
     *         <code>GetDimensionValues</code> operation includes a unit attribute. Examples include GB and Hrs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The
     *         response for this operation includes a unit attribute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you set the context to <code>RESERVATIONS</code>, you can use the following dimensions for searching:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are
     *         <code>SingleAZ</code> and <code>MultiAZ</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account.
     *         The value field contains the AWS ID of the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGION - The AWS Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single
     *         Availability Zone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     *         </p>
     *         </li>
     */

    public java.util.List<DimensionValuesWithAttributes> getDimensionValues() {
        return dimensionValues;
    }

    /**
     * <p>
     * The filters that you used to filter your request. Some dimensions are available only for a specific context.
     * </p>
     * <p>
     * If you set the context to <code>COST_AND_USAGE</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LEGAL_ENTITY_NAME - The name of the organization that sells you AWS services, such as Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The
     * value field contains the AWS ID of the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATION - The action performed. Examples include <code>RunInstance</code> and <code>CreateBucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * PURCHASE_TYPE - The reservation type of the purchase to which this usage is related. Examples include On-Demand
     * Instances and Standard Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE - The AWS service such as Amazon DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the
     * <code>GetDimensionValues</code> operation includes a unit attribute. Examples include GB and Hrs.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The
     * response for this operation includes a unit attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>RESERVATIONS</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are
     * <code>SingleAZ</code> and <code>MultiAZ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The
     * value field contains the AWS ID of the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single Availability
     * Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dimensionValues
     *        The filters that you used to filter your request. Some dimensions are available only for a specific
     *        context.</p>
     *        <p>
     *        If you set the context to <code>COST_AND_USAGE</code>, you can use the following dimensions for searching:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LEGAL_ENTITY_NAME - The name of the organization that sells you AWS services, such as Amazon Web Services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account.
     *        The value field contains the AWS ID of the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPERATION - The action performed. Examples include <code>RunInstance</code> and <code>CreateBucket</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PURCHASE_TYPE - The reservation type of the purchase to which this usage is related. Examples include
     *        On-Demand Instances and Standard Reserved Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SERVICE - The AWS service such as Amazon DynamoDB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the
     *        <code>GetDimensionValues</code> operation includes a unit attribute. Examples include GB and Hrs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The
     *        response for this operation includes a unit attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you set the context to <code>RESERVATIONS</code>, you can use the following dimensions for searching:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are
     *        <code>SingleAZ</code> and <code>MultiAZ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account.
     *        The value field contains the AWS ID of the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGION - The AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single
     *        Availability Zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     *        </p>
     *        </li>
     */

    public void setDimensionValues(java.util.Collection<DimensionValuesWithAttributes> dimensionValues) {
        if (dimensionValues == null) {
            this.dimensionValues = null;
            return;
        }

        this.dimensionValues = new java.util.ArrayList<DimensionValuesWithAttributes>(dimensionValues);
    }

    /**
     * <p>
     * The filters that you used to filter your request. Some dimensions are available only for a specific context.
     * </p>
     * <p>
     * If you set the context to <code>COST_AND_USAGE</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LEGAL_ENTITY_NAME - The name of the organization that sells you AWS services, such as Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The
     * value field contains the AWS ID of the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATION - The action performed. Examples include <code>RunInstance</code> and <code>CreateBucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * PURCHASE_TYPE - The reservation type of the purchase to which this usage is related. Examples include On-Demand
     * Instances and Standard Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE - The AWS service such as Amazon DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the
     * <code>GetDimensionValues</code> operation includes a unit attribute. Examples include GB and Hrs.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The
     * response for this operation includes a unit attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>RESERVATIONS</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are
     * <code>SingleAZ</code> and <code>MultiAZ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The
     * value field contains the AWS ID of the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single Availability
     * Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionValues(java.util.Collection)} or {@link #withDimensionValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dimensionValues
     *        The filters that you used to filter your request. Some dimensions are available only for a specific
     *        context.</p>
     *        <p>
     *        If you set the context to <code>COST_AND_USAGE</code>, you can use the following dimensions for searching:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LEGAL_ENTITY_NAME - The name of the organization that sells you AWS services, such as Amazon Web Services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account.
     *        The value field contains the AWS ID of the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPERATION - The action performed. Examples include <code>RunInstance</code> and <code>CreateBucket</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PURCHASE_TYPE - The reservation type of the purchase to which this usage is related. Examples include
     *        On-Demand Instances and Standard Reserved Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SERVICE - The AWS service such as Amazon DynamoDB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the
     *        <code>GetDimensionValues</code> operation includes a unit attribute. Examples include GB and Hrs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The
     *        response for this operation includes a unit attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you set the context to <code>RESERVATIONS</code>, you can use the following dimensions for searching:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are
     *        <code>SingleAZ</code> and <code>MultiAZ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account.
     *        The value field contains the AWS ID of the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGION - The AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single
     *        Availability Zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionValuesResult withDimensionValues(DimensionValuesWithAttributes... dimensionValues) {
        if (this.dimensionValues == null) {
            setDimensionValues(new java.util.ArrayList<DimensionValuesWithAttributes>(dimensionValues.length));
        }
        for (DimensionValuesWithAttributes ele : dimensionValues) {
            this.dimensionValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters that you used to filter your request. Some dimensions are available only for a specific context.
     * </p>
     * <p>
     * If you set the context to <code>COST_AND_USAGE</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LEGAL_ENTITY_NAME - The name of the organization that sells you AWS services, such as Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The
     * value field contains the AWS ID of the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATION - The action performed. Examples include <code>RunInstance</code> and <code>CreateBucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * PURCHASE_TYPE - The reservation type of the purchase to which this usage is related. Examples include On-Demand
     * Instances and Standard Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE - The AWS service such as Amazon DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the
     * <code>GetDimensionValues</code> operation includes a unit attribute. Examples include GB and Hrs.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The
     * response for this operation includes a unit attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>RESERVATIONS</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are
     * <code>SingleAZ</code> and <code>MultiAZ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The
     * value field contains the AWS ID of the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single Availability
     * Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dimensionValues
     *        The filters that you used to filter your request. Some dimensions are available only for a specific
     *        context.</p>
     *        <p>
     *        If you set the context to <code>COST_AND_USAGE</code>, you can use the following dimensions for searching:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LEGAL_ENTITY_NAME - The name of the organization that sells you AWS services, such as Amazon Web Services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account.
     *        The value field contains the AWS ID of the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPERATION - The action performed. Examples include <code>RunInstance</code> and <code>CreateBucket</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PURCHASE_TYPE - The reservation type of the purchase to which this usage is related. Examples include
     *        On-Demand Instances and Standard Reserved Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SERVICE - The AWS service such as Amazon DynamoDB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the
     *        <code>GetDimensionValues</code> operation includes a unit attribute. Examples include GB and Hrs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The
     *        response for this operation includes a unit attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you set the context to <code>RESERVATIONS</code>, you can use the following dimensions for searching:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are
     *        <code>SingleAZ</code> and <code>MultiAZ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE - The type of Amazon EC2 instance. An example is <code>m4.xlarge</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account.
     *        The value field contains the AWS ID of the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGION - The AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single
     *        Availability Zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionValuesResult withDimensionValues(java.util.Collection<DimensionValuesWithAttributes> dimensionValues) {
        setDimensionValues(dimensionValues);
        return this;
    }

    /**
     * <p>
     * The number of results that AWS returned at one time.
     * </p>
     * 
     * @param returnSize
     *        The number of results that AWS returned at one time.
     */

    public void setReturnSize(Integer returnSize) {
        this.returnSize = returnSize;
    }

    /**
     * <p>
     * The number of results that AWS returned at one time.
     * </p>
     * 
     * @return The number of results that AWS returned at one time.
     */

    public Integer getReturnSize() {
        return this.returnSize;
    }

    /**
     * <p>
     * The number of results that AWS returned at one time.
     * </p>
     * 
     * @param returnSize
     *        The number of results that AWS returned at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionValuesResult withReturnSize(Integer returnSize) {
        setReturnSize(returnSize);
        return this;
    }

    /**
     * <p>
     * The total number of search results.
     * </p>
     * 
     * @param totalSize
     *        The total number of search results.
     */

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * <p>
     * The total number of search results.
     * </p>
     * 
     * @return The total number of search results.
     */

    public Integer getTotalSize() {
        return this.totalSize;
    }

    /**
     * <p>
     * The total number of search results.
     * </p>
     * 
     * @param totalSize
     *        The total number of search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionValuesResult withTotalSize(Integer totalSize) {
        setTotalSize(totalSize);
        return this;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token for the next set of retrievable results. AWS provides the token when the response from a
     *        previous call has more results than the maximum page size.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @return The token for the next set of retrievable results. AWS provides the token when the response from a
     *         previous call has more results than the maximum page size.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token for the next set of retrievable results. AWS provides the token when the response from a
     *        previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionValuesResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getDimensionValues() != null)
            sb.append("DimensionValues: ").append(getDimensionValues()).append(",");
        if (getReturnSize() != null)
            sb.append("ReturnSize: ").append(getReturnSize()).append(",");
        if (getTotalSize() != null)
            sb.append("TotalSize: ").append(getTotalSize()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDimensionValuesResult == false)
            return false;
        GetDimensionValuesResult other = (GetDimensionValuesResult) obj;
        if (other.getDimensionValues() == null ^ this.getDimensionValues() == null)
            return false;
        if (other.getDimensionValues() != null && other.getDimensionValues().equals(this.getDimensionValues()) == false)
            return false;
        if (other.getReturnSize() == null ^ this.getReturnSize() == null)
            return false;
        if (other.getReturnSize() != null && other.getReturnSize().equals(this.getReturnSize()) == false)
            return false;
        if (other.getTotalSize() == null ^ this.getTotalSize() == null)
            return false;
        if (other.getTotalSize() != null && other.getTotalSize().equals(this.getTotalSize()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionValues() == null) ? 0 : getDimensionValues().hashCode());
        hashCode = prime * hashCode + ((getReturnSize() == null) ? 0 : getReturnSize().hashCode());
        hashCode = prime * hashCode + ((getTotalSize() == null) ? 0 : getTotalSize().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDimensionValuesResult clone() {
        try {
            return (GetDimensionValuesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
