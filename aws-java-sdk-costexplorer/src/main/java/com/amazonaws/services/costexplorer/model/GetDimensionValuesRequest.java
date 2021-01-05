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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetDimensionValues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDimensionValuesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The value that you want to search the filter values for.
     * </p>
     */
    private String searchString;
    /**
     * <p>
     * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is
     * exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     */
    private DateInterval timePeriod;
    /**
     * <p>
     * The name of the dimension. Each <code>Dimension</code> is available for a different <code>Context</code>. For
     * more information, see <code>Context</code>.
     * </p>
     */
    private String dimension;
    /**
     * <p>
     * The context for the call to <code>GetDimensionValues</code>. This can be <code>RESERVATIONS</code> or
     * <code>COST_AND_USAGE</code>. The default value is <code>COST_AND_USAGE</code>. If the context is set to
     * <code>RESERVATIONS</code>, the resulting dimension values can be used in the
     * <code>GetReservationUtilization</code> operation. If the context is set to <code>COST_AND_USAGE</code>, the
     * resulting dimension values can be used in the <code>GetCostAndUsage</code> operation.
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
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESOURCE_ID - The unique identifier of the resource. ResourceId is an opt-in feature only available for last 14
     * days for EC2-Compute Service.
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
     * If you set the context to <code>SAVINGS_PLANS</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     * </p>
     * </li>
     * <li>
     * <p>
     * PAYMENT_OPTION - Payment option for the given Savings Plans (for example, All Upfront)
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE_FAMILY - The family of instances (For example, <code>m5</code>)
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
     * SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     * </p>
     * </li>
     * </ul>
     */
    private String context;

    private Expression filter;
    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The key represents cost and usage metrics. The following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BlendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetAmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetUnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsageQuantity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NormalizedUsageAmount</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <p>
     * When you specify a <code>SortBy</code> paramater, the context must be <code>COST_AND_USAGE</code>. Further, when
     * using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not supported.
     * </p>
     */
    private java.util.List<SortDefinition> sortBy;
    /**
     * <p>
     * This field is only used when SortBy is provided in the request. The maximum number of objects that to be returned
     * for this request. If MaxResults is not specified with SortBy, the request will return 1000 results as the default
     * value for this parameter.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The value that you want to search the filter values for.
     * </p>
     * 
     * @param searchString
     *        The value that you want to search the filter values for.
     */

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    /**
     * <p>
     * The value that you want to search the filter values for.
     * </p>
     * 
     * @return The value that you want to search the filter values for.
     */

    public String getSearchString() {
        return this.searchString;
    }

    /**
     * <p>
     * The value that you want to search the filter values for.
     * </p>
     * 
     * @param searchString
     *        The value that you want to search the filter values for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionValuesRequest withSearchString(String searchString) {
        setSearchString(searchString);
        return this;
    }

    /**
     * <p>
     * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is
     * exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     * 
     * @param timePeriod
     *        The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date
     *        is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     *        <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     *        including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is
     * exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     * 
     * @return The start and end dates for retrieving the dimension values. The start date is inclusive, but the end
     *         date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     *         <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     *         including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is
     * exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     * 
     * @param timePeriod
     *        The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date
     *        is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     *        <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     *        including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionValuesRequest withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * The name of the dimension. Each <code>Dimension</code> is available for a different <code>Context</code>. For
     * more information, see <code>Context</code>.
     * </p>
     * 
     * @param dimension
     *        The name of the dimension. Each <code>Dimension</code> is available for a different <code>Context</code>.
     *        For more information, see <code>Context</code>.
     * @see Dimension
     */

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * <p>
     * The name of the dimension. Each <code>Dimension</code> is available for a different <code>Context</code>. For
     * more information, see <code>Context</code>.
     * </p>
     * 
     * @return The name of the dimension. Each <code>Dimension</code> is available for a different <code>Context</code>.
     *         For more information, see <code>Context</code>.
     * @see Dimension
     */

    public String getDimension() {
        return this.dimension;
    }

    /**
     * <p>
     * The name of the dimension. Each <code>Dimension</code> is available for a different <code>Context</code>. For
     * more information, see <code>Context</code>.
     * </p>
     * 
     * @param dimension
     *        The name of the dimension. Each <code>Dimension</code> is available for a different <code>Context</code>.
     *        For more information, see <code>Context</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Dimension
     */

    public GetDimensionValuesRequest withDimension(String dimension) {
        setDimension(dimension);
        return this;
    }

    /**
     * <p>
     * The name of the dimension. Each <code>Dimension</code> is available for a different <code>Context</code>. For
     * more information, see <code>Context</code>.
     * </p>
     * 
     * @param dimension
     *        The name of the dimension. Each <code>Dimension</code> is available for a different <code>Context</code>.
     *        For more information, see <code>Context</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Dimension
     */

    public GetDimensionValuesRequest withDimension(Dimension dimension) {
        this.dimension = dimension.toString();
        return this;
    }

    /**
     * <p>
     * The context for the call to <code>GetDimensionValues</code>. This can be <code>RESERVATIONS</code> or
     * <code>COST_AND_USAGE</code>. The default value is <code>COST_AND_USAGE</code>. If the context is set to
     * <code>RESERVATIONS</code>, the resulting dimension values can be used in the
     * <code>GetReservationUtilization</code> operation. If the context is set to <code>COST_AND_USAGE</code>, the
     * resulting dimension values can be used in the <code>GetCostAndUsage</code> operation.
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
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESOURCE_ID - The unique identifier of the resource. ResourceId is an opt-in feature only available for last 14
     * days for EC2-Compute Service.
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
     * If you set the context to <code>SAVINGS_PLANS</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     * </p>
     * </li>
     * <li>
     * <p>
     * PAYMENT_OPTION - Payment option for the given Savings Plans (for example, All Upfront)
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE_FAMILY - The family of instances (For example, <code>m5</code>)
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
     * SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     * </p>
     * </li>
     * </ul>
     * 
     * @param context
     *        The context for the call to <code>GetDimensionValues</code>. This can be <code>RESERVATIONS</code> or
     *        <code>COST_AND_USAGE</code>. The default value is <code>COST_AND_USAGE</code>. If the context is set to
     *        <code>RESERVATIONS</code>, the resulting dimension values can be used in the
     *        <code>GetReservationUtilization</code> operation. If the context is set to <code>COST_AND_USAGE</code>,
     *        the resulting dimension values can be used in the <code>GetCostAndUsage</code> operation.</p>
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
     *        REGION - The AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RESOURCE_ID - The unique identifier of the resource. ResourceId is an opt-in feature only available for
     *        last 14 days for EC2-Compute Service.
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
     *        </ul>
     *        <p>
     *        If you set the context to <code>SAVINGS_PLANS</code>, you can use the following dimensions for searching:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PAYMENT_OPTION - Payment option for the given Savings Plans (for example, All Upfront)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGION - The AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE_FAMILY - The family of instances (For example, <code>m5</code>)
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
     *        SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     *        </p>
     *        </li>
     * @see Context
     */

    public void setContext(String context) {
        this.context = context;
    }

    /**
     * <p>
     * The context for the call to <code>GetDimensionValues</code>. This can be <code>RESERVATIONS</code> or
     * <code>COST_AND_USAGE</code>. The default value is <code>COST_AND_USAGE</code>. If the context is set to
     * <code>RESERVATIONS</code>, the resulting dimension values can be used in the
     * <code>GetReservationUtilization</code> operation. If the context is set to <code>COST_AND_USAGE</code>, the
     * resulting dimension values can be used in the <code>GetCostAndUsage</code> operation.
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
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESOURCE_ID - The unique identifier of the resource. ResourceId is an opt-in feature only available for last 14
     * days for EC2-Compute Service.
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
     * If you set the context to <code>SAVINGS_PLANS</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     * </p>
     * </li>
     * <li>
     * <p>
     * PAYMENT_OPTION - Payment option for the given Savings Plans (for example, All Upfront)
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE_FAMILY - The family of instances (For example, <code>m5</code>)
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
     * SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     * </p>
     * </li>
     * </ul>
     * 
     * @return The context for the call to <code>GetDimensionValues</code>. This can be <code>RESERVATIONS</code> or
     *         <code>COST_AND_USAGE</code>. The default value is <code>COST_AND_USAGE</code>. If the context is set to
     *         <code>RESERVATIONS</code>, the resulting dimension values can be used in the
     *         <code>GetReservationUtilization</code> operation. If the context is set to <code>COST_AND_USAGE</code>,
     *         the resulting dimension values can be used in the <code>GetCostAndUsage</code> operation.</p>
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
     *         REGION - The AWS Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RESOURCE_ID - The unique identifier of the resource. ResourceId is an opt-in feature only available for
     *         last 14 days for EC2-Compute Service.
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
     *         </ul>
     *         <p>
     *         If you set the context to <code>SAVINGS_PLANS</code>, you can use the following dimensions for searching:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PAYMENT_OPTION - Payment option for the given Savings Plans (for example, All Upfront)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGION - The AWS Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_TYPE_FAMILY - The family of instances (For example, <code>m5</code>)
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
     *         SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     *         </p>
     *         </li>
     * @see Context
     */

    public String getContext() {
        return this.context;
    }

    /**
     * <p>
     * The context for the call to <code>GetDimensionValues</code>. This can be <code>RESERVATIONS</code> or
     * <code>COST_AND_USAGE</code>. The default value is <code>COST_AND_USAGE</code>. If the context is set to
     * <code>RESERVATIONS</code>, the resulting dimension values can be used in the
     * <code>GetReservationUtilization</code> operation. If the context is set to <code>COST_AND_USAGE</code>, the
     * resulting dimension values can be used in the <code>GetCostAndUsage</code> operation.
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
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESOURCE_ID - The unique identifier of the resource. ResourceId is an opt-in feature only available for last 14
     * days for EC2-Compute Service.
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
     * If you set the context to <code>SAVINGS_PLANS</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     * </p>
     * </li>
     * <li>
     * <p>
     * PAYMENT_OPTION - Payment option for the given Savings Plans (for example, All Upfront)
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE_FAMILY - The family of instances (For example, <code>m5</code>)
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
     * SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     * </p>
     * </li>
     * </ul>
     * 
     * @param context
     *        The context for the call to <code>GetDimensionValues</code>. This can be <code>RESERVATIONS</code> or
     *        <code>COST_AND_USAGE</code>. The default value is <code>COST_AND_USAGE</code>. If the context is set to
     *        <code>RESERVATIONS</code>, the resulting dimension values can be used in the
     *        <code>GetReservationUtilization</code> operation. If the context is set to <code>COST_AND_USAGE</code>,
     *        the resulting dimension values can be used in the <code>GetCostAndUsage</code> operation.</p>
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
     *        REGION - The AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RESOURCE_ID - The unique identifier of the resource. ResourceId is an opt-in feature only available for
     *        last 14 days for EC2-Compute Service.
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
     *        </ul>
     *        <p>
     *        If you set the context to <code>SAVINGS_PLANS</code>, you can use the following dimensions for searching:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PAYMENT_OPTION - Payment option for the given Savings Plans (for example, All Upfront)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGION - The AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE_FAMILY - The family of instances (For example, <code>m5</code>)
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
     *        SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Context
     */

    public GetDimensionValuesRequest withContext(String context) {
        setContext(context);
        return this;
    }

    /**
     * <p>
     * The context for the call to <code>GetDimensionValues</code>. This can be <code>RESERVATIONS</code> or
     * <code>COST_AND_USAGE</code>. The default value is <code>COST_AND_USAGE</code>. If the context is set to
     * <code>RESERVATIONS</code>, the resulting dimension values can be used in the
     * <code>GetReservationUtilization</code> operation. If the context is set to <code>COST_AND_USAGE</code>, the
     * resulting dimension values can be used in the <code>GetCostAndUsage</code> operation.
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
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESOURCE_ID - The unique identifier of the resource. ResourceId is an opt-in feature only available for last 14
     * days for EC2-Compute Service.
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
     * If you set the context to <code>SAVINGS_PLANS</code>, you can use the following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     * </p>
     * </li>
     * <li>
     * <p>
     * PAYMENT_OPTION - Payment option for the given Savings Plans (for example, All Upfront)
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE_FAMILY - The family of instances (For example, <code>m5</code>)
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
     * SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     * </p>
     * </li>
     * </ul>
     * 
     * @param context
     *        The context for the call to <code>GetDimensionValues</code>. This can be <code>RESERVATIONS</code> or
     *        <code>COST_AND_USAGE</code>. The default value is <code>COST_AND_USAGE</code>. If the context is set to
     *        <code>RESERVATIONS</code>, the resulting dimension values can be used in the
     *        <code>GetReservationUtilization</code> operation. If the context is set to <code>COST_AND_USAGE</code>,
     *        the resulting dimension values can be used in the <code>GetCostAndUsage</code> operation.</p>
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
     *        REGION - The AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RESOURCE_ID - The unique identifier of the resource. ResourceId is an opt-in feature only available for
     *        last 14 days for EC2-Compute Service.
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
     *        </ul>
     *        <p>
     *        If you set the context to <code>SAVINGS_PLANS</code>, you can use the following dimensions for searching:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PAYMENT_OPTION - Payment option for the given Savings Plans (for example, All Upfront)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGION - The AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE_FAMILY - The family of instances (For example, <code>m5</code>)
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
     *        SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Context
     */

    public GetDimensionValuesRequest withContext(Context context) {
        this.context = context.toString();
        return this;
    }

    /**
     * @param filter
     */

    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * @return
     */

    public Expression getFilter() {
        return this.filter;
    }

    /**
     * @param filter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionValuesRequest withFilter(Expression filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The key represents cost and usage metrics. The following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BlendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetAmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetUnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsageQuantity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NormalizedUsageAmount</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <p>
     * When you specify a <code>SortBy</code> paramater, the context must be <code>COST_AND_USAGE</code>. Further, when
     * using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not supported.
     * </p>
     * 
     * @return The value by which you want to sort the data.</p>
     *         <p>
     *         The key represents cost and usage metrics. The following values are supported:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BlendedCost</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UnblendedCost</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AmortizedCost</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NetAmortizedCost</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NetUnblendedCost</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UsageQuantity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NormalizedUsageAmount</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     *         </p>
     *         <p>
     *         When you specify a <code>SortBy</code> paramater, the context must be <code>COST_AND_USAGE</code>.
     *         Further, when using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not
     *         supported.
     */

    public java.util.List<SortDefinition> getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The key represents cost and usage metrics. The following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BlendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetAmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetUnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsageQuantity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NormalizedUsageAmount</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <p>
     * When you specify a <code>SortBy</code> paramater, the context must be <code>COST_AND_USAGE</code>. Further, when
     * using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not supported.
     * </p>
     * 
     * @param sortBy
     *        The value by which you want to sort the data.</p>
     *        <p>
     *        The key represents cost and usage metrics. The following values are supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BlendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UnblendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AmortizedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetAmortizedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetUnblendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UsageQuantity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NormalizedUsageAmount</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     *        </p>
     *        <p>
     *        When you specify a <code>SortBy</code> paramater, the context must be <code>COST_AND_USAGE</code>.
     *        Further, when using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not
     *        supported.
     */

    public void setSortBy(java.util.Collection<SortDefinition> sortBy) {
        if (sortBy == null) {
            this.sortBy = null;
            return;
        }

        this.sortBy = new java.util.ArrayList<SortDefinition>(sortBy);
    }

    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The key represents cost and usage metrics. The following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BlendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetAmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetUnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsageQuantity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NormalizedUsageAmount</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <p>
     * When you specify a <code>SortBy</code> paramater, the context must be <code>COST_AND_USAGE</code>. Further, when
     * using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSortBy(java.util.Collection)} or {@link #withSortBy(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sortBy
     *        The value by which you want to sort the data.</p>
     *        <p>
     *        The key represents cost and usage metrics. The following values are supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BlendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UnblendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AmortizedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetAmortizedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetUnblendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UsageQuantity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NormalizedUsageAmount</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     *        </p>
     *        <p>
     *        When you specify a <code>SortBy</code> paramater, the context must be <code>COST_AND_USAGE</code>.
     *        Further, when using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionValuesRequest withSortBy(SortDefinition... sortBy) {
        if (this.sortBy == null) {
            setSortBy(new java.util.ArrayList<SortDefinition>(sortBy.length));
        }
        for (SortDefinition ele : sortBy) {
            this.sortBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The key represents cost and usage metrics. The following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BlendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetAmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetUnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsageQuantity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NormalizedUsageAmount</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <p>
     * When you specify a <code>SortBy</code> paramater, the context must be <code>COST_AND_USAGE</code>. Further, when
     * using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not supported.
     * </p>
     * 
     * @param sortBy
     *        The value by which you want to sort the data.</p>
     *        <p>
     *        The key represents cost and usage metrics. The following values are supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BlendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UnblendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AmortizedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetAmortizedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetUnblendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UsageQuantity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NormalizedUsageAmount</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     *        </p>
     *        <p>
     *        When you specify a <code>SortBy</code> paramater, the context must be <code>COST_AND_USAGE</code>.
     *        Further, when using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionValuesRequest withSortBy(java.util.Collection<SortDefinition> sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * This field is only used when SortBy is provided in the request. The maximum number of objects that to be returned
     * for this request. If MaxResults is not specified with SortBy, the request will return 1000 results as the default
     * value for this parameter.
     * </p>
     * 
     * @param maxResults
     *        This field is only used when SortBy is provided in the request. The maximum number of objects that to be
     *        returned for this request. If MaxResults is not specified with SortBy, the request will return 1000
     *        results as the default value for this parameter.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * This field is only used when SortBy is provided in the request. The maximum number of objects that to be returned
     * for this request. If MaxResults is not specified with SortBy, the request will return 1000 results as the default
     * value for this parameter.
     * </p>
     * 
     * @return This field is only used when SortBy is provided in the request. The maximum number of objects that to be
     *         returned for this request. If MaxResults is not specified with SortBy, the request will return 1000
     *         results as the default value for this parameter.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * This field is only used when SortBy is provided in the request. The maximum number of objects that to be returned
     * for this request. If MaxResults is not specified with SortBy, the request will return 1000 results as the default
     * value for this parameter.
     * </p>
     * 
     * @param maxResults
     *        This field is only used when SortBy is provided in the request. The maximum number of objects that to be
     *        returned for this request. If MaxResults is not specified with SortBy, the request will return 1000
     *        results as the default value for this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionValuesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *        call has more results than the maximum page size.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *         call has more results than the maximum page size.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *        call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDimensionValuesRequest withNextPageToken(String nextPageToken) {
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
        if (getSearchString() != null)
            sb.append("SearchString: ").append(getSearchString()).append(",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod()).append(",");
        if (getDimension() != null)
            sb.append("Dimension: ").append(getDimension()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof GetDimensionValuesRequest == false)
            return false;
        GetDimensionValuesRequest other = (GetDimensionValuesRequest) obj;
        if (other.getSearchString() == null ^ this.getSearchString() == null)
            return false;
        if (other.getSearchString() != null && other.getSearchString().equals(this.getSearchString()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getDimension() == null ^ this.getDimension() == null)
            return false;
        if (other.getDimension() != null && other.getDimension().equals(this.getDimension()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getSearchString() == null) ? 0 : getSearchString().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getDimension() == null) ? 0 : getDimension().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDimensionValuesRequest clone() {
        return (GetDimensionValuesRequest) super.clone();
    }

}
