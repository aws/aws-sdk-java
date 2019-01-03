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
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for AWSBudgets.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BudgetsActions implements Action {

    /** Represents any action executed on AWSBudgets. */
    AllBudgetsActions("budgets:*"),

    /** Action for the CreateBudget operation. */
    CreateBudget("budgets:CreateBudget"),
    /** Action for the CreateNotification operation. */
    CreateNotification("budgets:CreateNotification"),
    /** Action for the CreateSubscriber operation. */
    CreateSubscriber("budgets:CreateSubscriber"),
    /** Action for the DeleteBudget operation. */
    DeleteBudget("budgets:DeleteBudget"),
    /** Action for the DeleteNotification operation. */
    DeleteNotification("budgets:DeleteNotification"),
    /** Action for the DeleteSubscriber operation. */
    DeleteSubscriber("budgets:DeleteSubscriber"),
    /** Action for the DescribeBudget operation. */
    DescribeBudget("budgets:DescribeBudget"),
    /** Action for the DescribeBudgetPerformanceHistory operation. */
    DescribeBudgetPerformanceHistory("budgets:DescribeBudgetPerformanceHistory"),
    /** Action for the DescribeBudgets operation. */
    DescribeBudgets("budgets:DescribeBudgets"),
    /** Action for the DescribeNotificationsForBudget operation. */
    DescribeNotificationsForBudget("budgets:DescribeNotificationsForBudget"),
    /** Action for the DescribeSubscribersForNotification operation. */
    DescribeSubscribersForNotification("budgets:DescribeSubscribersForNotification"),
    /** Action for the UpdateBudget operation. */
    UpdateBudget("budgets:UpdateBudget"),
    /** Action for the UpdateNotification operation. */
    UpdateNotification("budgets:UpdateNotification"),
    /** Action for the UpdateSubscriber operation. */
    UpdateSubscriber("budgets:UpdateSubscriber"),

    ;

    private final String action;

    private BudgetsActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
