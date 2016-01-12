/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.marketplacecommerceanalytics.model;

/**
 * The type of the data set to publish.
 */
public enum DataSetType {

    Customer_subscriber_hourly_monthly_subscriptions(
            "customer_subscriber_hourly_monthly_subscriptions"),
    Customer_subscriber_annual_subscriptions(
            "customer_subscriber_annual_subscriptions"),
    Daily_business_usage_by_instance_type(
            "daily_business_usage_by_instance_type"),
    Daily_business_fees("daily_business_fees"),
    Daily_business_free_trial_conversions(
            "daily_business_free_trial_conversions"),
    Daily_business_new_instances("daily_business_new_instances"),
    Daily_business_new_product_subscribers(
            "daily_business_new_product_subscribers"),
    Daily_business_canceled_product_subscribers(
            "daily_business_canceled_product_subscribers"),
    Monthly_revenue_billing_and_revenue_data(
            "monthly_revenue_billing_and_revenue_data"),
    Monthly_revenue_annual_subscriptions("monthly_revenue_annual_subscriptions"),
    Disbursed_amount_by_product("disbursed_amount_by_product"),
    Disbursed_amount_by_customer_geo("disbursed_amount_by_customer_geo"),
    Disbursed_amount_by_age_of_uncollected_funds(
            "disbursed_amount_by_age_of_uncollected_funds"),
    Disbursed_amount_by_age_of_disbursed_funds(
            "disbursed_amount_by_age_of_disbursed_funds"),
    Customer_profile_by_industry("customer_profile_by_industry"),
    Customer_profile_by_revenue("customer_profile_by_revenue");

    private String value;

    private DataSetType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return DataSetType corresponding to the value
     */
    public static DataSetType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("customer_subscriber_hourly_monthly_subscriptions"
                .equals(value)) {
            return Customer_subscriber_hourly_monthly_subscriptions;
        } else if ("customer_subscriber_annual_subscriptions".equals(value)) {
            return Customer_subscriber_annual_subscriptions;
        } else if ("daily_business_usage_by_instance_type".equals(value)) {
            return Daily_business_usage_by_instance_type;
        } else if ("daily_business_fees".equals(value)) {
            return Daily_business_fees;
        } else if ("daily_business_free_trial_conversions".equals(value)) {
            return Daily_business_free_trial_conversions;
        } else if ("daily_business_new_instances".equals(value)) {
            return Daily_business_new_instances;
        } else if ("daily_business_new_product_subscribers".equals(value)) {
            return Daily_business_new_product_subscribers;
        } else if ("daily_business_canceled_product_subscribers".equals(value)) {
            return Daily_business_canceled_product_subscribers;
        } else if ("monthly_revenue_billing_and_revenue_data".equals(value)) {
            return Monthly_revenue_billing_and_revenue_data;
        } else if ("monthly_revenue_annual_subscriptions".equals(value)) {
            return Monthly_revenue_annual_subscriptions;
        } else if ("disbursed_amount_by_product".equals(value)) {
            return Disbursed_amount_by_product;
        } else if ("disbursed_amount_by_customer_geo".equals(value)) {
            return Disbursed_amount_by_customer_geo;
        } else if ("disbursed_amount_by_age_of_uncollected_funds".equals(value)) {
            return Disbursed_amount_by_age_of_uncollected_funds;
        } else if ("disbursed_amount_by_age_of_disbursed_funds".equals(value)) {
            return Disbursed_amount_by_age_of_disbursed_funds;
        } else if ("customer_profile_by_industry".equals(value)) {
            return Customer_profile_by_industry;
        } else if ("customer_profile_by_revenue".equals(value)) {
            return Customer_profile_by_revenue;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}