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
package com.amazonaws.services.marketplacecommerceanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the GenerateDataSet operation.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplacecommerceanalytics-2015-07-01/GenerateDataSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateDataSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The desired data set type.
     * </p>
     * <p>
     * <ul>
     * <li><strong>customer_subscriber_hourly_monthly_subscriptions</strong>
     * <p>
     * From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>customer_subscriber_annual_subscriptions</strong>
     * <p>
     * From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_usage_by_instance_type</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_fees</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_free_trial_conversions</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_new_instances</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_new_product_subscribers</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_canceled_product_subscribers</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>monthly_revenue_billing_and_revenue_data</strong>
     * <p>
     * From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from two months prior.
     * </p>
     * <p>
     * From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from one month prior.
     * </p>
     * </li>
     * <li><strong>monthly_revenue_annual_subscriptions</strong>
     * <p>
     * From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * up-front software charges (e.g. annual) from one month prior.
     * </p>
     * <p>
     * From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * up-front software charges (e.g. annual) from one month prior.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_product</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_product_with_uncollected_funds</strong>
     * <p>
     * From 2012-04-19 to 2015-01-25: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2015-01-26 to present: This data set was split into three data sets: disbursed_amount_by_product,
     * disbursed_amount_by_age_of_uncollected_funds, and disbursed_amount_by_age_of_disbursed_funds.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_instance_hours</strong>
     * <p>
     * From 2012-09-04 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_customer_geo</strong>
     * <p>
     * From 2012-04-19 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_age_of_uncollected_funds</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_age_of_disbursed_funds</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_industry</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_revenue</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_geography</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>sales_compensation_billed_revenue</strong>
     * <p>
     * From 2016-12 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from two months prior, and up-front software charges (e.g. annual) from one
     * month prior.
     * </p>
     * <p>
     * From 2017-06 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g. annual) from one
     * month prior.
     * </p>
     * </li>
     * <li><strong>us_sales_and_use_tax_records</strong>
     * <p>
     * From 2017-02-15 to present: Available monthly on the 15th day of the month by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * </ul>
     * </p>
     */
    private String dataSetType;
    /**
     * The date a data set was published. For daily data sets, provide a date with day-level granularity for the desired
     * day. For weekly data sets, provide a date with day-level granularity within the desired week (the day value will
     * be ignored). For monthly data sets, provide a date with month-level granularity for the desired month (the day
     * value will be ignored).
     */
    private java.util.Date dataSetPublicationDate;
    /**
     * The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the provided AWS
     * services.
     */
    private String roleNameArn;
    /** The name (friendly name, not ARN) of the destination S3 bucket. */
    private String destinationS3BucketName;
    /**
     * (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     * systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output file
     * "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix directory
     * structure does not exist, it will be created. If no prefix is provided, the data set will be published to the S3
     * bucket root.
     */
    private String destinationS3Prefix;
    /**
     * Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or if an
     * error has occurred.
     */
    private String snsTopicArn;
    /**
     * (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and the
     * data set metadata file. These key-value pairs can be used to correlated responses with tracking information from
     * other systems.
     */
    private java.util.Map<String, String> customerDefinedValues;

    /**
     * <p>
     * The desired data set type.
     * </p>
     * <p>
     * <ul>
     * <li><strong>customer_subscriber_hourly_monthly_subscriptions</strong>
     * <p>
     * From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>customer_subscriber_annual_subscriptions</strong>
     * <p>
     * From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_usage_by_instance_type</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_fees</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_free_trial_conversions</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_new_instances</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_new_product_subscribers</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_canceled_product_subscribers</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>monthly_revenue_billing_and_revenue_data</strong>
     * <p>
     * From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from two months prior.
     * </p>
     * <p>
     * From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from one month prior.
     * </p>
     * </li>
     * <li><strong>monthly_revenue_annual_subscriptions</strong>
     * <p>
     * From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * up-front software charges (e.g. annual) from one month prior.
     * </p>
     * <p>
     * From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * up-front software charges (e.g. annual) from one month prior.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_product</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_product_with_uncollected_funds</strong>
     * <p>
     * From 2012-04-19 to 2015-01-25: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2015-01-26 to present: This data set was split into three data sets: disbursed_amount_by_product,
     * disbursed_amount_by_age_of_uncollected_funds, and disbursed_amount_by_age_of_disbursed_funds.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_instance_hours</strong>
     * <p>
     * From 2012-09-04 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_customer_geo</strong>
     * <p>
     * From 2012-04-19 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_age_of_uncollected_funds</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_age_of_disbursed_funds</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_industry</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_revenue</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_geography</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>sales_compensation_billed_revenue</strong>
     * <p>
     * From 2016-12 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from two months prior, and up-front software charges (e.g. annual) from one
     * month prior.
     * </p>
     * <p>
     * From 2017-06 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g. annual) from one
     * month prior.
     * </p>
     * </li>
     * <li><strong>us_sales_and_use_tax_records</strong>
     * <p>
     * From 2017-02-15 to present: Available monthly on the 15th day of the month by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * </ul>
     * </p>
     * 
     * @param dataSetType
     *        The desired data set type.</p>
     *        <p>
     *        <ul>
     *        <li><strong>customer_subscriber_hourly_monthly_subscriptions</strong>
     *        <p>
     *        From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>customer_subscriber_annual_subscriptions</strong>
     *        <p>
     *        From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_usage_by_instance_type</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_fees</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_free_trial_conversions</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_new_instances</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_new_product_subscribers</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_canceled_product_subscribers</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>monthly_revenue_billing_and_revenue_data</strong>
     *        <p>
     *        From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from two months prior.
     *        </p>
     *        <p>
     *        From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from one month prior.
     *        </p>
     *        </li>
     *        <li><strong>monthly_revenue_annual_subscriptions</strong>
     *        <p>
     *        From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *        includes up-front software charges (e.g. annual) from one month prior.
     *        </p>
     *        <p>
     *        From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *        includes up-front software charges (e.g. annual) from one month prior.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_product</strong>
     *        <p>
     *        From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_product_with_uncollected_funds</strong>
     *        <p>
     *        From 2012-04-19 to 2015-01-25: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2015-01-26 to present: This data set was split into three data sets: disbursed_amount_by_product,
     *        disbursed_amount_by_age_of_uncollected_funds, and disbursed_amount_by_age_of_disbursed_funds.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_instance_hours</strong>
     *        <p>
     *        From 2012-09-04 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_customer_geo</strong>
     *        <p>
     *        From 2012-04-19 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_age_of_uncollected_funds</strong>
     *        <p>
     *        From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_age_of_disbursed_funds</strong>
     *        <p>
     *        From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>customer_profile_by_industry</strong>
     *        <p>
     *        From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2017-06-30 to present: This data set is no longer available.
     *        </p>
     *        </li>
     *        <li><strong>customer_profile_by_revenue</strong>
     *        <p>
     *        From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2017-06-30 to present: This data set is no longer available.
     *        </p>
     *        </li>
     *        <li><strong>customer_profile_by_geography</strong>
     *        <p>
     *        From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2017-06-30 to present: This data set is no longer available.
     *        </p>
     *        </li>
     *        <li><strong>sales_compensation_billed_revenue</strong>
     *        <p>
     *        From 2016-12 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from two months prior, and up-front software charges (e.g.
     *        annual) from one month prior.
     *        </p>
     *        <p>
     *        From 2017-06 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g.
     *        annual) from one month prior.
     *        </p>
     *        </li>
     *        <li><strong>us_sales_and_use_tax_records</strong>
     *        <p>
     *        From 2017-02-15 to present: Available monthly on the 15th day of the month by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        </ul>
     * @see DataSetType
     */

    public void setDataSetType(String dataSetType) {
        this.dataSetType = dataSetType;
    }

    /**
     * <p>
     * The desired data set type.
     * </p>
     * <p>
     * <ul>
     * <li><strong>customer_subscriber_hourly_monthly_subscriptions</strong>
     * <p>
     * From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>customer_subscriber_annual_subscriptions</strong>
     * <p>
     * From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_usage_by_instance_type</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_fees</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_free_trial_conversions</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_new_instances</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_new_product_subscribers</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_canceled_product_subscribers</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>monthly_revenue_billing_and_revenue_data</strong>
     * <p>
     * From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from two months prior.
     * </p>
     * <p>
     * From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from one month prior.
     * </p>
     * </li>
     * <li><strong>monthly_revenue_annual_subscriptions</strong>
     * <p>
     * From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * up-front software charges (e.g. annual) from one month prior.
     * </p>
     * <p>
     * From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * up-front software charges (e.g. annual) from one month prior.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_product</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_product_with_uncollected_funds</strong>
     * <p>
     * From 2012-04-19 to 2015-01-25: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2015-01-26 to present: This data set was split into three data sets: disbursed_amount_by_product,
     * disbursed_amount_by_age_of_uncollected_funds, and disbursed_amount_by_age_of_disbursed_funds.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_instance_hours</strong>
     * <p>
     * From 2012-09-04 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_customer_geo</strong>
     * <p>
     * From 2012-04-19 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_age_of_uncollected_funds</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_age_of_disbursed_funds</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_industry</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_revenue</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_geography</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>sales_compensation_billed_revenue</strong>
     * <p>
     * From 2016-12 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from two months prior, and up-front software charges (e.g. annual) from one
     * month prior.
     * </p>
     * <p>
     * From 2017-06 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g. annual) from one
     * month prior.
     * </p>
     * </li>
     * <li><strong>us_sales_and_use_tax_records</strong>
     * <p>
     * From 2017-02-15 to present: Available monthly on the 15th day of the month by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * </ul>
     * </p>
     * 
     * @return The desired data set type.</p>
     *         <p>
     *         <ul>
     *         <li><strong>customer_subscriber_hourly_monthly_subscriptions</strong>
     *         <p>
     *         From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>customer_subscriber_annual_subscriptions</strong>
     *         <p>
     *         From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>daily_business_usage_by_instance_type</strong>
     *         <p>
     *         From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>daily_business_fees</strong>
     *         <p>
     *         From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>daily_business_free_trial_conversions</strong>
     *         <p>
     *         From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>daily_business_new_instances</strong>
     *         <p>
     *         From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>daily_business_new_product_subscribers</strong>
     *         <p>
     *         From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>daily_business_canceled_product_subscribers</strong>
     *         <p>
     *         From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>monthly_revenue_billing_and_revenue_data</strong>
     *         <p>
     *         From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *         includes metered transactions (e.g. hourly) from two months prior.
     *         </p>
     *         <p>
     *         From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *         includes metered transactions (e.g. hourly) from one month prior.
     *         </p>
     *         </li>
     *         <li><strong>monthly_revenue_annual_subscriptions</strong>
     *         <p>
     *         From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *         includes up-front software charges (e.g. annual) from one month prior.
     *         </p>
     *         <p>
     *         From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *         includes up-front software charges (e.g. annual) from one month prior.
     *         </p>
     *         </li>
     *         <li><strong>disbursed_amount_by_product</strong>
     *         <p>
     *         From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>disbursed_amount_by_product_with_uncollected_funds</strong>
     *         <p>
     *         From 2012-04-19 to 2015-01-25: Available every 30 days by 5:00 PM Pacific Time.
     *         </p>
     *         <p>
     *         From 2015-01-26 to present: This data set was split into three data sets: disbursed_amount_by_product,
     *         disbursed_amount_by_age_of_uncollected_funds, and disbursed_amount_by_age_of_disbursed_funds.
     *         </p>
     *         </li>
     *         <li><strong>disbursed_amount_by_instance_hours</strong>
     *         <p>
     *         From 2012-09-04 to present: Available every 30 days by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>disbursed_amount_by_customer_geo</strong>
     *         <p>
     *         From 2012-04-19 to present: Available every 30 days by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>disbursed_amount_by_age_of_uncollected_funds</strong>
     *         <p>
     *         From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>disbursed_amount_by_age_of_disbursed_funds</strong>
     *         <p>
     *         From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         <li><strong>customer_profile_by_industry</strong>
     *         <p>
     *         From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *         </p>
     *         <p>
     *         From 2017-06-30 to present: This data set is no longer available.
     *         </p>
     *         </li>
     *         <li><strong>customer_profile_by_revenue</strong>
     *         <p>
     *         From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *         </p>
     *         <p>
     *         From 2017-06-30 to present: This data set is no longer available.
     *         </p>
     *         </li>
     *         <li><strong>customer_profile_by_geography</strong>
     *         <p>
     *         From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *         </p>
     *         <p>
     *         From 2017-06-30 to present: This data set is no longer available.
     *         </p>
     *         </li>
     *         <li><strong>sales_compensation_billed_revenue</strong>
     *         <p>
     *         From 2016-12 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *         includes metered transactions (e.g. hourly) from two months prior, and up-front software charges (e.g.
     *         annual) from one month prior.
     *         </p>
     *         <p>
     *         From 2017-06 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *         includes metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g.
     *         annual) from one month prior.
     *         </p>
     *         </li>
     *         <li><strong>us_sales_and_use_tax_records</strong>
     *         <p>
     *         From 2017-02-15 to present: Available monthly on the 15th day of the month by 5:00 PM Pacific Time.
     *         </p>
     *         </li>
     *         </ul>
     * @see DataSetType
     */

    public String getDataSetType() {
        return this.dataSetType;
    }

    /**
     * <p>
     * The desired data set type.
     * </p>
     * <p>
     * <ul>
     * <li><strong>customer_subscriber_hourly_monthly_subscriptions</strong>
     * <p>
     * From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>customer_subscriber_annual_subscriptions</strong>
     * <p>
     * From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_usage_by_instance_type</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_fees</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_free_trial_conversions</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_new_instances</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_new_product_subscribers</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_canceled_product_subscribers</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>monthly_revenue_billing_and_revenue_data</strong>
     * <p>
     * From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from two months prior.
     * </p>
     * <p>
     * From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from one month prior.
     * </p>
     * </li>
     * <li><strong>monthly_revenue_annual_subscriptions</strong>
     * <p>
     * From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * up-front software charges (e.g. annual) from one month prior.
     * </p>
     * <p>
     * From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * up-front software charges (e.g. annual) from one month prior.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_product</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_product_with_uncollected_funds</strong>
     * <p>
     * From 2012-04-19 to 2015-01-25: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2015-01-26 to present: This data set was split into three data sets: disbursed_amount_by_product,
     * disbursed_amount_by_age_of_uncollected_funds, and disbursed_amount_by_age_of_disbursed_funds.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_instance_hours</strong>
     * <p>
     * From 2012-09-04 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_customer_geo</strong>
     * <p>
     * From 2012-04-19 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_age_of_uncollected_funds</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_age_of_disbursed_funds</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_industry</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_revenue</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_geography</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>sales_compensation_billed_revenue</strong>
     * <p>
     * From 2016-12 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from two months prior, and up-front software charges (e.g. annual) from one
     * month prior.
     * </p>
     * <p>
     * From 2017-06 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g. annual) from one
     * month prior.
     * </p>
     * </li>
     * <li><strong>us_sales_and_use_tax_records</strong>
     * <p>
     * From 2017-02-15 to present: Available monthly on the 15th day of the month by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * </ul>
     * </p>
     * 
     * @param dataSetType
     *        The desired data set type.</p>
     *        <p>
     *        <ul>
     *        <li><strong>customer_subscriber_hourly_monthly_subscriptions</strong>
     *        <p>
     *        From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>customer_subscriber_annual_subscriptions</strong>
     *        <p>
     *        From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_usage_by_instance_type</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_fees</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_free_trial_conversions</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_new_instances</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_new_product_subscribers</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_canceled_product_subscribers</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>monthly_revenue_billing_and_revenue_data</strong>
     *        <p>
     *        From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from two months prior.
     *        </p>
     *        <p>
     *        From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from one month prior.
     *        </p>
     *        </li>
     *        <li><strong>monthly_revenue_annual_subscriptions</strong>
     *        <p>
     *        From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *        includes up-front software charges (e.g. annual) from one month prior.
     *        </p>
     *        <p>
     *        From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *        includes up-front software charges (e.g. annual) from one month prior.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_product</strong>
     *        <p>
     *        From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_product_with_uncollected_funds</strong>
     *        <p>
     *        From 2012-04-19 to 2015-01-25: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2015-01-26 to present: This data set was split into three data sets: disbursed_amount_by_product,
     *        disbursed_amount_by_age_of_uncollected_funds, and disbursed_amount_by_age_of_disbursed_funds.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_instance_hours</strong>
     *        <p>
     *        From 2012-09-04 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_customer_geo</strong>
     *        <p>
     *        From 2012-04-19 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_age_of_uncollected_funds</strong>
     *        <p>
     *        From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_age_of_disbursed_funds</strong>
     *        <p>
     *        From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>customer_profile_by_industry</strong>
     *        <p>
     *        From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2017-06-30 to present: This data set is no longer available.
     *        </p>
     *        </li>
     *        <li><strong>customer_profile_by_revenue</strong>
     *        <p>
     *        From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2017-06-30 to present: This data set is no longer available.
     *        </p>
     *        </li>
     *        <li><strong>customer_profile_by_geography</strong>
     *        <p>
     *        From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2017-06-30 to present: This data set is no longer available.
     *        </p>
     *        </li>
     *        <li><strong>sales_compensation_billed_revenue</strong>
     *        <p>
     *        From 2016-12 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from two months prior, and up-front software charges (e.g.
     *        annual) from one month prior.
     *        </p>
     *        <p>
     *        From 2017-06 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g.
     *        annual) from one month prior.
     *        </p>
     *        </li>
     *        <li><strong>us_sales_and_use_tax_records</strong>
     *        <p>
     *        From 2017-02-15 to present: Available monthly on the 15th day of the month by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSetType
     */

    public GenerateDataSetRequest withDataSetType(String dataSetType) {
        setDataSetType(dataSetType);
        return this;
    }

    /**
     * <p>
     * The desired data set type.
     * </p>
     * <p>
     * <ul>
     * <li><strong>customer_subscriber_hourly_monthly_subscriptions</strong>
     * <p>
     * From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>customer_subscriber_annual_subscriptions</strong>
     * <p>
     * From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_usage_by_instance_type</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_fees</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_free_trial_conversions</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_new_instances</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_new_product_subscribers</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_canceled_product_subscribers</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>monthly_revenue_billing_and_revenue_data</strong>
     * <p>
     * From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from two months prior.
     * </p>
     * <p>
     * From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from one month prior.
     * </p>
     * </li>
     * <li><strong>monthly_revenue_annual_subscriptions</strong>
     * <p>
     * From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * up-front software charges (e.g. annual) from one month prior.
     * </p>
     * <p>
     * From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * up-front software charges (e.g. annual) from one month prior.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_product</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_product_with_uncollected_funds</strong>
     * <p>
     * From 2012-04-19 to 2015-01-25: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2015-01-26 to present: This data set was split into three data sets: disbursed_amount_by_product,
     * disbursed_amount_by_age_of_uncollected_funds, and disbursed_amount_by_age_of_disbursed_funds.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_instance_hours</strong>
     * <p>
     * From 2012-09-04 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_customer_geo</strong>
     * <p>
     * From 2012-04-19 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_age_of_uncollected_funds</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_age_of_disbursed_funds</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_industry</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_revenue</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_geography</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>sales_compensation_billed_revenue</strong>
     * <p>
     * From 2016-12 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from two months prior, and up-front software charges (e.g. annual) from one
     * month prior.
     * </p>
     * <p>
     * From 2017-06 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g. annual) from one
     * month prior.
     * </p>
     * </li>
     * <li><strong>us_sales_and_use_tax_records</strong>
     * <p>
     * From 2017-02-15 to present: Available monthly on the 15th day of the month by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * </ul>
     * </p>
     * 
     * @param dataSetType
     *        The desired data set type.</p>
     *        <p>
     *        <ul>
     *        <li><strong>customer_subscriber_hourly_monthly_subscriptions</strong>
     *        <p>
     *        From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>customer_subscriber_annual_subscriptions</strong>
     *        <p>
     *        From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_usage_by_instance_type</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_fees</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_free_trial_conversions</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_new_instances</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_new_product_subscribers</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_canceled_product_subscribers</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>monthly_revenue_billing_and_revenue_data</strong>
     *        <p>
     *        From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from two months prior.
     *        </p>
     *        <p>
     *        From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from one month prior.
     *        </p>
     *        </li>
     *        <li><strong>monthly_revenue_annual_subscriptions</strong>
     *        <p>
     *        From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *        includes up-front software charges (e.g. annual) from one month prior.
     *        </p>
     *        <p>
     *        From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *        includes up-front software charges (e.g. annual) from one month prior.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_product</strong>
     *        <p>
     *        From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_product_with_uncollected_funds</strong>
     *        <p>
     *        From 2012-04-19 to 2015-01-25: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2015-01-26 to present: This data set was split into three data sets: disbursed_amount_by_product,
     *        disbursed_amount_by_age_of_uncollected_funds, and disbursed_amount_by_age_of_disbursed_funds.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_instance_hours</strong>
     *        <p>
     *        From 2012-09-04 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_customer_geo</strong>
     *        <p>
     *        From 2012-04-19 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_age_of_uncollected_funds</strong>
     *        <p>
     *        From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_age_of_disbursed_funds</strong>
     *        <p>
     *        From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>customer_profile_by_industry</strong>
     *        <p>
     *        From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2017-06-30 to present: This data set is no longer available.
     *        </p>
     *        </li>
     *        <li><strong>customer_profile_by_revenue</strong>
     *        <p>
     *        From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2017-06-30 to present: This data set is no longer available.
     *        </p>
     *        </li>
     *        <li><strong>customer_profile_by_geography</strong>
     *        <p>
     *        From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2017-06-30 to present: This data set is no longer available.
     *        </p>
     *        </li>
     *        <li><strong>sales_compensation_billed_revenue</strong>
     *        <p>
     *        From 2016-12 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from two months prior, and up-front software charges (e.g.
     *        annual) from one month prior.
     *        </p>
     *        <p>
     *        From 2017-06 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g.
     *        annual) from one month prior.
     *        </p>
     *        </li>
     *        <li><strong>us_sales_and_use_tax_records</strong>
     *        <p>
     *        From 2017-02-15 to present: Available monthly on the 15th day of the month by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        </ul>
     * @see DataSetType
     */

    public void setDataSetType(DataSetType dataSetType) {
        withDataSetType(dataSetType);
    }

    /**
     * <p>
     * The desired data set type.
     * </p>
     * <p>
     * <ul>
     * <li><strong>customer_subscriber_hourly_monthly_subscriptions</strong>
     * <p>
     * From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>customer_subscriber_annual_subscriptions</strong>
     * <p>
     * From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_usage_by_instance_type</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_fees</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_free_trial_conversions</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_new_instances</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_new_product_subscribers</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>daily_business_canceled_product_subscribers</strong>
     * <p>
     * From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>monthly_revenue_billing_and_revenue_data</strong>
     * <p>
     * From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from two months prior.
     * </p>
     * <p>
     * From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from one month prior.
     * </p>
     * </li>
     * <li><strong>monthly_revenue_annual_subscriptions</strong>
     * <p>
     * From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * up-front software charges (e.g. annual) from one month prior.
     * </p>
     * <p>
     * From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * up-front software charges (e.g. annual) from one month prior.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_product</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_product_with_uncollected_funds</strong>
     * <p>
     * From 2012-04-19 to 2015-01-25: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2015-01-26 to present: This data set was split into three data sets: disbursed_amount_by_product,
     * disbursed_amount_by_age_of_uncollected_funds, and disbursed_amount_by_age_of_disbursed_funds.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_instance_hours</strong>
     * <p>
     * From 2012-09-04 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_customer_geo</strong>
     * <p>
     * From 2012-04-19 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_age_of_uncollected_funds</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>disbursed_amount_by_age_of_disbursed_funds</strong>
     * <p>
     * From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_industry</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_revenue</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>customer_profile_by_geography</strong>
     * <p>
     * From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     * </p>
     * <p>
     * From 2017-06-30 to present: This data set is no longer available.
     * </p>
     * </li>
     * <li><strong>sales_compensation_billed_revenue</strong>
     * <p>
     * From 2016-12 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from two months prior, and up-front software charges (e.g. annual) from one
     * month prior.
     * </p>
     * <p>
     * From 2017-06 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data includes
     * metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g. annual) from one
     * month prior.
     * </p>
     * </li>
     * <li><strong>us_sales_and_use_tax_records</strong>
     * <p>
     * From 2017-02-15 to present: Available monthly on the 15th day of the month by 5:00 PM Pacific Time.
     * </p>
     * </li>
     * </ul>
     * </p>
     * 
     * @param dataSetType
     *        The desired data set type.</p>
     *        <p>
     *        <ul>
     *        <li><strong>customer_subscriber_hourly_monthly_subscriptions</strong>
     *        <p>
     *        From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>customer_subscriber_annual_subscriptions</strong>
     *        <p>
     *        From 2014-07-21 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_usage_by_instance_type</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_fees</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_free_trial_conversions</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_new_instances</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_new_product_subscribers</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>daily_business_canceled_product_subscribers</strong>
     *        <p>
     *        From 2015-01-26 to present: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>monthly_revenue_billing_and_revenue_data</strong>
     *        <p>
     *        From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from two months prior.
     *        </p>
     *        <p>
     *        From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from one month prior.
     *        </p>
     *        </li>
     *        <li><strong>monthly_revenue_annual_subscriptions</strong>
     *        <p>
     *        From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *        includes up-front software charges (e.g. annual) from one month prior.
     *        </p>
     *        <p>
     *        From 2017-07 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *        includes up-front software charges (e.g. annual) from one month prior.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_product</strong>
     *        <p>
     *        From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_product_with_uncollected_funds</strong>
     *        <p>
     *        From 2012-04-19 to 2015-01-25: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2015-01-26 to present: This data set was split into three data sets: disbursed_amount_by_product,
     *        disbursed_amount_by_age_of_uncollected_funds, and disbursed_amount_by_age_of_disbursed_funds.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_instance_hours</strong>
     *        <p>
     *        From 2012-09-04 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_customer_geo</strong>
     *        <p>
     *        From 2012-04-19 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_age_of_uncollected_funds</strong>
     *        <p>
     *        From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>disbursed_amount_by_age_of_disbursed_funds</strong>
     *        <p>
     *        From 2015-01-26 to present: Available every 30 days by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        <li><strong>customer_profile_by_industry</strong>
     *        <p>
     *        From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2017-06-30 to present: This data set is no longer available.
     *        </p>
     *        </li>
     *        <li><strong>customer_profile_by_revenue</strong>
     *        <p>
     *        From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2017-06-30 to present: This data set is no longer available.
     *        </p>
     *        </li>
     *        <li><strong>customer_profile_by_geography</strong>
     *        <p>
     *        From 2015-10-01 to 2017-06-29: Available daily by 5:00 PM Pacific Time.
     *        </p>
     *        <p>
     *        From 2017-06-30 to present: This data set is no longer available.
     *        </p>
     *        </li>
     *        <li><strong>sales_compensation_billed_revenue</strong>
     *        <p>
     *        From 2016-12 to 2017-06: Available monthly on the 4th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from two months prior, and up-front software charges (e.g.
     *        annual) from one month prior.
     *        </p>
     *        <p>
     *        From 2017-06 to present: Available monthly on the 15th day of the month by 5:00pm Pacific Time. Data
     *        includes metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g.
     *        annual) from one month prior.
     *        </p>
     *        </li>
     *        <li><strong>us_sales_and_use_tax_records</strong>
     *        <p>
     *        From 2017-02-15 to present: Available monthly on the 15th day of the month by 5:00 PM Pacific Time.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSetType
     */

    public GenerateDataSetRequest withDataSetType(DataSetType dataSetType) {
        this.dataSetType = dataSetType.toString();
        return this;
    }

    /**
     * The date a data set was published. For daily data sets, provide a date with day-level granularity for the desired
     * day. For weekly data sets, provide a date with day-level granularity within the desired week (the day value will
     * be ignored). For monthly data sets, provide a date with month-level granularity for the desired month (the day
     * value will be ignored).
     * 
     * @param dataSetPublicationDate
     *        The date a data set was published. For daily data sets, provide a date with day-level granularity for the
     *        desired day. For weekly data sets, provide a date with day-level granularity within the desired week (the
     *        day value will be ignored). For monthly data sets, provide a date with month-level granularity for the
     *        desired month (the day value will be ignored).
     */

    public void setDataSetPublicationDate(java.util.Date dataSetPublicationDate) {
        this.dataSetPublicationDate = dataSetPublicationDate;
    }

    /**
     * The date a data set was published. For daily data sets, provide a date with day-level granularity for the desired
     * day. For weekly data sets, provide a date with day-level granularity within the desired week (the day value will
     * be ignored). For monthly data sets, provide a date with month-level granularity for the desired month (the day
     * value will be ignored).
     * 
     * @return The date a data set was published. For daily data sets, provide a date with day-level granularity for the
     *         desired day. For weekly data sets, provide a date with day-level granularity within the desired week (the
     *         day value will be ignored). For monthly data sets, provide a date with month-level granularity for the
     *         desired month (the day value will be ignored).
     */

    public java.util.Date getDataSetPublicationDate() {
        return this.dataSetPublicationDate;
    }

    /**
     * The date a data set was published. For daily data sets, provide a date with day-level granularity for the desired
     * day. For weekly data sets, provide a date with day-level granularity within the desired week (the day value will
     * be ignored). For monthly data sets, provide a date with month-level granularity for the desired month (the day
     * value will be ignored).
     * 
     * @param dataSetPublicationDate
     *        The date a data set was published. For daily data sets, provide a date with day-level granularity for the
     *        desired day. For weekly data sets, provide a date with day-level granularity within the desired week (the
     *        day value will be ignored). For monthly data sets, provide a date with month-level granularity for the
     *        desired month (the day value will be ignored).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataSetRequest withDataSetPublicationDate(java.util.Date dataSetPublicationDate) {
        setDataSetPublicationDate(dataSetPublicationDate);
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the provided AWS
     * services.
     * 
     * @param roleNameArn
     *        The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the
     *        provided AWS services.
     */

    public void setRoleNameArn(String roleNameArn) {
        this.roleNameArn = roleNameArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the provided AWS
     * services.
     * 
     * @return The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the
     *         provided AWS services.
     */

    public String getRoleNameArn() {
        return this.roleNameArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the provided AWS
     * services.
     * 
     * @param roleNameArn
     *        The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the
     *        provided AWS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataSetRequest withRoleNameArn(String roleNameArn) {
        setRoleNameArn(roleNameArn);
        return this;
    }

    /**
     * The name (friendly name, not ARN) of the destination S3 bucket.
     * 
     * @param destinationS3BucketName
     *        The name (friendly name, not ARN) of the destination S3 bucket.
     */

    public void setDestinationS3BucketName(String destinationS3BucketName) {
        this.destinationS3BucketName = destinationS3BucketName;
    }

    /**
     * The name (friendly name, not ARN) of the destination S3 bucket.
     * 
     * @return The name (friendly name, not ARN) of the destination S3 bucket.
     */

    public String getDestinationS3BucketName() {
        return this.destinationS3BucketName;
    }

    /**
     * The name (friendly name, not ARN) of the destination S3 bucket.
     * 
     * @param destinationS3BucketName
     *        The name (friendly name, not ARN) of the destination S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataSetRequest withDestinationS3BucketName(String destinationS3BucketName) {
        setDestinationS3BucketName(destinationS3BucketName);
        return this;
    }

    /**
     * (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     * systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output file
     * "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix directory
     * structure does not exist, it will be created. If no prefix is provided, the data set will be published to the S3
     * bucket root.
     * 
     * @param destinationS3Prefix
     *        (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     *        systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output
     *        file "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix
     *        directory structure does not exist, it will be created. If no prefix is provided, the data set will be
     *        published to the S3 bucket root.
     */

    public void setDestinationS3Prefix(String destinationS3Prefix) {
        this.destinationS3Prefix = destinationS3Prefix;
    }

    /**
     * (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     * systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output file
     * "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix directory
     * structure does not exist, it will be created. If no prefix is provided, the data set will be published to the S3
     * bucket root.
     * 
     * @return (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     *         systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the
     *         output file "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the
     *         prefix directory structure does not exist, it will be created. If no prefix is provided, the data set
     *         will be published to the S3 bucket root.
     */

    public String getDestinationS3Prefix() {
        return this.destinationS3Prefix;
    }

    /**
     * (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     * systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output file
     * "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix directory
     * structure does not exist, it will be created. If no prefix is provided, the data set will be published to the S3
     * bucket root.
     * 
     * @param destinationS3Prefix
     *        (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     *        systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output
     *        file "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix
     *        directory structure does not exist, it will be created. If no prefix is provided, the data set will be
     *        published to the S3 bucket root.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataSetRequest withDestinationS3Prefix(String destinationS3Prefix) {
        setDestinationS3Prefix(destinationS3Prefix);
        return this;
    }

    /**
     * Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or if an
     * error has occurred.
     * 
     * @param snsTopicArn
     *        Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or
     *        if an error has occurred.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or if an
     * error has occurred.
     * 
     * @return Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published
     *         or if an error has occurred.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or if an
     * error has occurred.
     * 
     * @param snsTopicArn
     *        Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or
     *        if an error has occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataSetRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and the
     * data set metadata file. These key-value pairs can be used to correlated responses with tracking information from
     * other systems.
     * 
     * @return (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and
     *         the data set metadata file. These key-value pairs can be used to correlated responses with tracking
     *         information from other systems.
     */

    public java.util.Map<String, String> getCustomerDefinedValues() {
        return customerDefinedValues;
    }

    /**
     * (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and the
     * data set metadata file. These key-value pairs can be used to correlated responses with tracking information from
     * other systems.
     * 
     * @param customerDefinedValues
     *        (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and
     *        the data set metadata file. These key-value pairs can be used to correlated responses with tracking
     *        information from other systems.
     */

    public void setCustomerDefinedValues(java.util.Map<String, String> customerDefinedValues) {
        this.customerDefinedValues = customerDefinedValues;
    }

    /**
     * (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and the
     * data set metadata file. These key-value pairs can be used to correlated responses with tracking information from
     * other systems.
     * 
     * @param customerDefinedValues
     *        (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and
     *        the data set metadata file. These key-value pairs can be used to correlated responses with tracking
     *        information from other systems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataSetRequest withCustomerDefinedValues(java.util.Map<String, String> customerDefinedValues) {
        setCustomerDefinedValues(customerDefinedValues);
        return this;
    }

    public GenerateDataSetRequest addCustomerDefinedValuesEntry(String key, String value) {
        if (null == this.customerDefinedValues) {
            this.customerDefinedValues = new java.util.HashMap<String, String>();
        }
        if (this.customerDefinedValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.customerDefinedValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CustomerDefinedValues.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataSetRequest clearCustomerDefinedValuesEntries() {
        this.customerDefinedValues = null;
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
        if (getDataSetType() != null)
            sb.append("DataSetType: ").append(getDataSetType()).append(",");
        if (getDataSetPublicationDate() != null)
            sb.append("DataSetPublicationDate: ").append(getDataSetPublicationDate()).append(",");
        if (getRoleNameArn() != null)
            sb.append("RoleNameArn: ").append(getRoleNameArn()).append(",");
        if (getDestinationS3BucketName() != null)
            sb.append("DestinationS3BucketName: ").append(getDestinationS3BucketName()).append(",");
        if (getDestinationS3Prefix() != null)
            sb.append("DestinationS3Prefix: ").append(getDestinationS3Prefix()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getCustomerDefinedValues() != null)
            sb.append("CustomerDefinedValues: ").append(getCustomerDefinedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateDataSetRequest == false)
            return false;
        GenerateDataSetRequest other = (GenerateDataSetRequest) obj;
        if (other.getDataSetType() == null ^ this.getDataSetType() == null)
            return false;
        if (other.getDataSetType() != null && other.getDataSetType().equals(this.getDataSetType()) == false)
            return false;
        if (other.getDataSetPublicationDate() == null ^ this.getDataSetPublicationDate() == null)
            return false;
        if (other.getDataSetPublicationDate() != null && other.getDataSetPublicationDate().equals(this.getDataSetPublicationDate()) == false)
            return false;
        if (other.getRoleNameArn() == null ^ this.getRoleNameArn() == null)
            return false;
        if (other.getRoleNameArn() != null && other.getRoleNameArn().equals(this.getRoleNameArn()) == false)
            return false;
        if (other.getDestinationS3BucketName() == null ^ this.getDestinationS3BucketName() == null)
            return false;
        if (other.getDestinationS3BucketName() != null && other.getDestinationS3BucketName().equals(this.getDestinationS3BucketName()) == false)
            return false;
        if (other.getDestinationS3Prefix() == null ^ this.getDestinationS3Prefix() == null)
            return false;
        if (other.getDestinationS3Prefix() != null && other.getDestinationS3Prefix().equals(this.getDestinationS3Prefix()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getCustomerDefinedValues() == null ^ this.getCustomerDefinedValues() == null)
            return false;
        if (other.getCustomerDefinedValues() != null && other.getCustomerDefinedValues().equals(this.getCustomerDefinedValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetType() == null) ? 0 : getDataSetType().hashCode());
        hashCode = prime * hashCode + ((getDataSetPublicationDate() == null) ? 0 : getDataSetPublicationDate().hashCode());
        hashCode = prime * hashCode + ((getRoleNameArn() == null) ? 0 : getRoleNameArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationS3BucketName() == null) ? 0 : getDestinationS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getDestinationS3Prefix() == null) ? 0 : getDestinationS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getCustomerDefinedValues() == null) ? 0 : getCustomerDefinedValues().hashCode());
        return hashCode;
    }

    @Override
    public GenerateDataSetRequest clone() {
        return (GenerateDataSetRequest) super.clone();
    }

}
