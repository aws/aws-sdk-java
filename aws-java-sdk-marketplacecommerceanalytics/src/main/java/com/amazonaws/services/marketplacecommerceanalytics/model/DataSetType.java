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

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DataSetType {

    Customer_subscriber_hourly_monthly_subscriptions("customer_subscriber_hourly_monthly_subscriptions"),
    Customer_subscriber_annual_subscriptions("customer_subscriber_annual_subscriptions"),
    Daily_business_usage_by_instance_type("daily_business_usage_by_instance_type"),
    Daily_business_fees("daily_business_fees"),
    Daily_business_free_trial_conversions("daily_business_free_trial_conversions"),
    Daily_business_new_instances("daily_business_new_instances"),
    Daily_business_new_product_subscribers("daily_business_new_product_subscribers"),
    Daily_business_canceled_product_subscribers("daily_business_canceled_product_subscribers"),
    Monthly_revenue_billing_and_revenue_data("monthly_revenue_billing_and_revenue_data"),
    Monthly_revenue_annual_subscriptions("monthly_revenue_annual_subscriptions"),
    Disbursed_amount_by_product("disbursed_amount_by_product"),
    Disbursed_amount_by_product_with_uncollected_funds("disbursed_amount_by_product_with_uncollected_funds"),
    Disbursed_amount_by_instance_hours("disbursed_amount_by_instance_hours"),
    Disbursed_amount_by_customer_geo("disbursed_amount_by_customer_geo"),
    Disbursed_amount_by_age_of_uncollected_funds("disbursed_amount_by_age_of_uncollected_funds"),
    Disbursed_amount_by_age_of_disbursed_funds("disbursed_amount_by_age_of_disbursed_funds"),
    Customer_profile_by_industry("customer_profile_by_industry"),
    Customer_profile_by_revenue("customer_profile_by_revenue"),
    Customer_profile_by_geography("customer_profile_by_geography"),
    Sales_compensation_billed_revenue("sales_compensation_billed_revenue"),
    Us_sales_and_use_tax_records("us_sales_and_use_tax_records");

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
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DataSetType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DataSetType enumEntry : DataSetType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
