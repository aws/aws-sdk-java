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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupJobSummaries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackupJobSummariesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the job count for the specified account.
     * </p>
     * <p>
     * If the request is sent from a member account or an account not part of Amazon Web Services Organizations, jobs
     * within requestor's account will be returned.
     * </p>
     * <p>
     * Root, admin, and delegated administrator accounts can use the value ANY to return job counts from every account
     * in the organization.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts from all accounts within the authenticated organization, then
     * returns the sum.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * This parameter returns the job count for jobs with the specified state.
     * </p>
     * <p>
     * The the value ANY returns count of all states.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all states and returns the sum.
     * </p>
     * <p>
     * <code>Completed with issues</code> is a status found only in the Backup console. For API, this status refers to
     * jobs with a state of <code>COMPLETED</code> and a <code>MessageCategory</code> with a value other than
     * <code>SUCCESS</code>; that is, the status is completed but comes with a status message. To obtain the job count
     * for <code>Completed with issues</code>, run two GET requests, and subtract the second, smaller number:
     * </p>
     * <p>
     * GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;State=COMPLETED
     * </p>
     * <p>
     * GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;MessageCategory=SUCCESS&amp;State=COMPLETED
     * </p>
     */
    private String state;
    /**
     * <p>
     * Returns the job count for the specified resource type. Use request <code>GetSupportedResourceTypes</code> to
     * obtain strings for supported resource types.
     * </p>
     * <p>
     * The the value ANY returns count of all resource types.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all resource types and returns the sum.
     * </p>
     * <p>
     * The type of Amazon Web Services resource to be backed up; for example, an Amazon Elastic Block Store (Amazon EBS)
     * volume or an Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * This parameter returns the job count for the specified message category.
     * </p>
     * <p>
     * Example accepted strings include <code>AccessDenied</code>, <code>Success</code>, and
     * <code>InvalidParameters</code>. See <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/monitoring.html">Monitoring</a> for a list of
     * accepted MessageCategory strings.
     * </p>
     * <p>
     * The the value ANY returns count of all message categories.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all message categories and returns the sum.
     * </p>
     */
    private String messageCategory;
    /**
     * <p>
     * This is the period that sets the boundaries for returned results.
     * </p>
     * <p>
     * Acceptable values include
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONE_DAY</code> for daily job count for the prior 14 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     * </p>
     * </li>
     * </ul>
     */
    private String aggregationPeriod;
    /**
     * <p>
     * This parameter sets the maximum number of items to be returned.
     * </p>
     * <p>
     * The value is an integer. Range of accepted values is from 1 to 500.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns the job count for the specified account.
     * </p>
     * <p>
     * If the request is sent from a member account or an account not part of Amazon Web Services Organizations, jobs
     * within requestor's account will be returned.
     * </p>
     * <p>
     * Root, admin, and delegated administrator accounts can use the value ANY to return job counts from every account
     * in the organization.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts from all accounts within the authenticated organization, then
     * returns the sum.
     * </p>
     * 
     * @param accountId
     *        Returns the job count for the specified account.</p>
     *        <p>
     *        If the request is sent from a member account or an account not part of Amazon Web Services Organizations,
     *        jobs within requestor's account will be returned.
     *        </p>
     *        <p>
     *        Root, admin, and delegated administrator accounts can use the value ANY to return job counts from every
     *        account in the organization.
     *        </p>
     *        <p>
     *        <code>AGGREGATE_ALL</code> aggregates job counts from all accounts within the authenticated organization,
     *        then returns the sum.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Returns the job count for the specified account.
     * </p>
     * <p>
     * If the request is sent from a member account or an account not part of Amazon Web Services Organizations, jobs
     * within requestor's account will be returned.
     * </p>
     * <p>
     * Root, admin, and delegated administrator accounts can use the value ANY to return job counts from every account
     * in the organization.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts from all accounts within the authenticated organization, then
     * returns the sum.
     * </p>
     * 
     * @return Returns the job count for the specified account.</p>
     *         <p>
     *         If the request is sent from a member account or an account not part of Amazon Web Services Organizations,
     *         jobs within requestor's account will be returned.
     *         </p>
     *         <p>
     *         Root, admin, and delegated administrator accounts can use the value ANY to return job counts from every
     *         account in the organization.
     *         </p>
     *         <p>
     *         <code>AGGREGATE_ALL</code> aggregates job counts from all accounts within the authenticated organization,
     *         then returns the sum.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * Returns the job count for the specified account.
     * </p>
     * <p>
     * If the request is sent from a member account or an account not part of Amazon Web Services Organizations, jobs
     * within requestor's account will be returned.
     * </p>
     * <p>
     * Root, admin, and delegated administrator accounts can use the value ANY to return job counts from every account
     * in the organization.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts from all accounts within the authenticated organization, then
     * returns the sum.
     * </p>
     * 
     * @param accountId
     *        Returns the job count for the specified account.</p>
     *        <p>
     *        If the request is sent from a member account or an account not part of Amazon Web Services Organizations,
     *        jobs within requestor's account will be returned.
     *        </p>
     *        <p>
     *        Root, admin, and delegated administrator accounts can use the value ANY to return job counts from every
     *        account in the organization.
     *        </p>
     *        <p>
     *        <code>AGGREGATE_ALL</code> aggregates job counts from all accounts within the authenticated organization,
     *        then returns the sum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupJobSummariesRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * This parameter returns the job count for jobs with the specified state.
     * </p>
     * <p>
     * The the value ANY returns count of all states.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all states and returns the sum.
     * </p>
     * <p>
     * <code>Completed with issues</code> is a status found only in the Backup console. For API, this status refers to
     * jobs with a state of <code>COMPLETED</code> and a <code>MessageCategory</code> with a value other than
     * <code>SUCCESS</code>; that is, the status is completed but comes with a status message. To obtain the job count
     * for <code>Completed with issues</code>, run two GET requests, and subtract the second, smaller number:
     * </p>
     * <p>
     * GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;State=COMPLETED
     * </p>
     * <p>
     * GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;MessageCategory=SUCCESS&amp;State=COMPLETED
     * </p>
     * 
     * @param state
     *        This parameter returns the job count for jobs with the specified state.</p>
     *        <p>
     *        The the value ANY returns count of all states.
     *        </p>
     *        <p>
     *        <code>AGGREGATE_ALL</code> aggregates job counts for all states and returns the sum.
     *        </p>
     *        <p>
     *        <code>Completed with issues</code> is a status found only in the Backup console. For API, this status
     *        refers to jobs with a state of <code>COMPLETED</code> and a <code>MessageCategory</code> with a value
     *        other than <code>SUCCESS</code>; that is, the status is completed but comes with a status message. To
     *        obtain the job count for <code>Completed with issues</code>, run two GET requests, and subtract the
     *        second, smaller number:
     *        </p>
     *        <p>
     *        GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;State=COMPLETED
     *        </p>
     *        <p>
     *        GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;MessageCategory=SUCCESS&amp;State=
     *        COMPLETED
     * @see BackupJobStatus
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * This parameter returns the job count for jobs with the specified state.
     * </p>
     * <p>
     * The the value ANY returns count of all states.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all states and returns the sum.
     * </p>
     * <p>
     * <code>Completed with issues</code> is a status found only in the Backup console. For API, this status refers to
     * jobs with a state of <code>COMPLETED</code> and a <code>MessageCategory</code> with a value other than
     * <code>SUCCESS</code>; that is, the status is completed but comes with a status message. To obtain the job count
     * for <code>Completed with issues</code>, run two GET requests, and subtract the second, smaller number:
     * </p>
     * <p>
     * GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;State=COMPLETED
     * </p>
     * <p>
     * GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;MessageCategory=SUCCESS&amp;State=COMPLETED
     * </p>
     * 
     * @return This parameter returns the job count for jobs with the specified state.</p>
     *         <p>
     *         The the value ANY returns count of all states.
     *         </p>
     *         <p>
     *         <code>AGGREGATE_ALL</code> aggregates job counts for all states and returns the sum.
     *         </p>
     *         <p>
     *         <code>Completed with issues</code> is a status found only in the Backup console. For API, this status
     *         refers to jobs with a state of <code>COMPLETED</code> and a <code>MessageCategory</code> with a value
     *         other than <code>SUCCESS</code>; that is, the status is completed but comes with a status message. To
     *         obtain the job count for <code>Completed with issues</code>, run two GET requests, and subtract the
     *         second, smaller number:
     *         </p>
     *         <p>
     *         GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;State=COMPLETED
     *         </p>
     *         <p>
     *         GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;MessageCategory=SUCCESS&amp;State=
     *         COMPLETED
     * @see BackupJobStatus
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * This parameter returns the job count for jobs with the specified state.
     * </p>
     * <p>
     * The the value ANY returns count of all states.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all states and returns the sum.
     * </p>
     * <p>
     * <code>Completed with issues</code> is a status found only in the Backup console. For API, this status refers to
     * jobs with a state of <code>COMPLETED</code> and a <code>MessageCategory</code> with a value other than
     * <code>SUCCESS</code>; that is, the status is completed but comes with a status message. To obtain the job count
     * for <code>Completed with issues</code>, run two GET requests, and subtract the second, smaller number:
     * </p>
     * <p>
     * GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;State=COMPLETED
     * </p>
     * <p>
     * GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;MessageCategory=SUCCESS&amp;State=COMPLETED
     * </p>
     * 
     * @param state
     *        This parameter returns the job count for jobs with the specified state.</p>
     *        <p>
     *        The the value ANY returns count of all states.
     *        </p>
     *        <p>
     *        <code>AGGREGATE_ALL</code> aggregates job counts for all states and returns the sum.
     *        </p>
     *        <p>
     *        <code>Completed with issues</code> is a status found only in the Backup console. For API, this status
     *        refers to jobs with a state of <code>COMPLETED</code> and a <code>MessageCategory</code> with a value
     *        other than <code>SUCCESS</code>; that is, the status is completed but comes with a status message. To
     *        obtain the job count for <code>Completed with issues</code>, run two GET requests, and subtract the
     *        second, smaller number:
     *        </p>
     *        <p>
     *        GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;State=COMPLETED
     *        </p>
     *        <p>
     *        GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;MessageCategory=SUCCESS&amp;State=
     *        COMPLETED
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupJobStatus
     */

    public ListBackupJobSummariesRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * This parameter returns the job count for jobs with the specified state.
     * </p>
     * <p>
     * The the value ANY returns count of all states.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all states and returns the sum.
     * </p>
     * <p>
     * <code>Completed with issues</code> is a status found only in the Backup console. For API, this status refers to
     * jobs with a state of <code>COMPLETED</code> and a <code>MessageCategory</code> with a value other than
     * <code>SUCCESS</code>; that is, the status is completed but comes with a status message. To obtain the job count
     * for <code>Completed with issues</code>, run two GET requests, and subtract the second, smaller number:
     * </p>
     * <p>
     * GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;State=COMPLETED
     * </p>
     * <p>
     * GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;MessageCategory=SUCCESS&amp;State=COMPLETED
     * </p>
     * 
     * @param state
     *        This parameter returns the job count for jobs with the specified state.</p>
     *        <p>
     *        The the value ANY returns count of all states.
     *        </p>
     *        <p>
     *        <code>AGGREGATE_ALL</code> aggregates job counts for all states and returns the sum.
     *        </p>
     *        <p>
     *        <code>Completed with issues</code> is a status found only in the Backup console. For API, this status
     *        refers to jobs with a state of <code>COMPLETED</code> and a <code>MessageCategory</code> with a value
     *        other than <code>SUCCESS</code>; that is, the status is completed but comes with a status message. To
     *        obtain the job count for <code>Completed with issues</code>, run two GET requests, and subtract the
     *        second, smaller number:
     *        </p>
     *        <p>
     *        GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;State=COMPLETED
     *        </p>
     *        <p>
     *        GET /audit/backup-job-summaries?AggregationPeriod=FOURTEEN_DAYS&amp;MessageCategory=SUCCESS&amp;State=
     *        COMPLETED
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupJobStatus
     */

    public ListBackupJobSummariesRequest withState(BackupJobStatus state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Returns the job count for the specified resource type. Use request <code>GetSupportedResourceTypes</code> to
     * obtain strings for supported resource types.
     * </p>
     * <p>
     * The the value ANY returns count of all resource types.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all resource types and returns the sum.
     * </p>
     * <p>
     * The type of Amazon Web Services resource to be backed up; for example, an Amazon Elastic Block Store (Amazon EBS)
     * volume or an Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @param resourceType
     *        Returns the job count for the specified resource type. Use request <code>GetSupportedResourceTypes</code>
     *        to obtain strings for supported resource types.</p>
     *        <p>
     *        The the value ANY returns count of all resource types.
     *        </p>
     *        <p>
     *        <code>AGGREGATE_ALL</code> aggregates job counts for all resource types and returns the sum.
     *        </p>
     *        <p>
     *        The type of Amazon Web Services resource to be backed up; for example, an Amazon Elastic Block Store
     *        (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Returns the job count for the specified resource type. Use request <code>GetSupportedResourceTypes</code> to
     * obtain strings for supported resource types.
     * </p>
     * <p>
     * The the value ANY returns count of all resource types.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all resource types and returns the sum.
     * </p>
     * <p>
     * The type of Amazon Web Services resource to be backed up; for example, an Amazon Elastic Block Store (Amazon EBS)
     * volume or an Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @return Returns the job count for the specified resource type. Use request <code>GetSupportedResourceTypes</code>
     *         to obtain strings for supported resource types.</p>
     *         <p>
     *         The the value ANY returns count of all resource types.
     *         </p>
     *         <p>
     *         <code>AGGREGATE_ALL</code> aggregates job counts for all resource types and returns the sum.
     *         </p>
     *         <p>
     *         The type of Amazon Web Services resource to be backed up; for example, an Amazon Elastic Block Store
     *         (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Returns the job count for the specified resource type. Use request <code>GetSupportedResourceTypes</code> to
     * obtain strings for supported resource types.
     * </p>
     * <p>
     * The the value ANY returns count of all resource types.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all resource types and returns the sum.
     * </p>
     * <p>
     * The type of Amazon Web Services resource to be backed up; for example, an Amazon Elastic Block Store (Amazon EBS)
     * volume or an Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @param resourceType
     *        Returns the job count for the specified resource type. Use request <code>GetSupportedResourceTypes</code>
     *        to obtain strings for supported resource types.</p>
     *        <p>
     *        The the value ANY returns count of all resource types.
     *        </p>
     *        <p>
     *        <code>AGGREGATE_ALL</code> aggregates job counts for all resource types and returns the sum.
     *        </p>
     *        <p>
     *        The type of Amazon Web Services resource to be backed up; for example, an Amazon Elastic Block Store
     *        (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupJobSummariesRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * This parameter returns the job count for the specified message category.
     * </p>
     * <p>
     * Example accepted strings include <code>AccessDenied</code>, <code>Success</code>, and
     * <code>InvalidParameters</code>. See <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/monitoring.html">Monitoring</a> for a list of
     * accepted MessageCategory strings.
     * </p>
     * <p>
     * The the value ANY returns count of all message categories.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all message categories and returns the sum.
     * </p>
     * 
     * @param messageCategory
     *        This parameter returns the job count for the specified message category.</p>
     *        <p>
     *        Example accepted strings include <code>AccessDenied</code>, <code>Success</code>, and
     *        <code>InvalidParameters</code>. See <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/monitoring.html">Monitoring</a> for a list of
     *        accepted MessageCategory strings.
     *        </p>
     *        <p>
     *        The the value ANY returns count of all message categories.
     *        </p>
     *        <p>
     *        <code>AGGREGATE_ALL</code> aggregates job counts for all message categories and returns the sum.
     */

    public void setMessageCategory(String messageCategory) {
        this.messageCategory = messageCategory;
    }

    /**
     * <p>
     * This parameter returns the job count for the specified message category.
     * </p>
     * <p>
     * Example accepted strings include <code>AccessDenied</code>, <code>Success</code>, and
     * <code>InvalidParameters</code>. See <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/monitoring.html">Monitoring</a> for a list of
     * accepted MessageCategory strings.
     * </p>
     * <p>
     * The the value ANY returns count of all message categories.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all message categories and returns the sum.
     * </p>
     * 
     * @return This parameter returns the job count for the specified message category.</p>
     *         <p>
     *         Example accepted strings include <code>AccessDenied</code>, <code>Success</code>, and
     *         <code>InvalidParameters</code>. See <a
     *         href="https://docs.aws.amazon.com/aws-backup/latest/devguide/monitoring.html">Monitoring</a> for a list
     *         of accepted MessageCategory strings.
     *         </p>
     *         <p>
     *         The the value ANY returns count of all message categories.
     *         </p>
     *         <p>
     *         <code>AGGREGATE_ALL</code> aggregates job counts for all message categories and returns the sum.
     */

    public String getMessageCategory() {
        return this.messageCategory;
    }

    /**
     * <p>
     * This parameter returns the job count for the specified message category.
     * </p>
     * <p>
     * Example accepted strings include <code>AccessDenied</code>, <code>Success</code>, and
     * <code>InvalidParameters</code>. See <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/monitoring.html">Monitoring</a> for a list of
     * accepted MessageCategory strings.
     * </p>
     * <p>
     * The the value ANY returns count of all message categories.
     * </p>
     * <p>
     * <code>AGGREGATE_ALL</code> aggregates job counts for all message categories and returns the sum.
     * </p>
     * 
     * @param messageCategory
     *        This parameter returns the job count for the specified message category.</p>
     *        <p>
     *        Example accepted strings include <code>AccessDenied</code>, <code>Success</code>, and
     *        <code>InvalidParameters</code>. See <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/monitoring.html">Monitoring</a> for a list of
     *        accepted MessageCategory strings.
     *        </p>
     *        <p>
     *        The the value ANY returns count of all message categories.
     *        </p>
     *        <p>
     *        <code>AGGREGATE_ALL</code> aggregates job counts for all message categories and returns the sum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupJobSummariesRequest withMessageCategory(String messageCategory) {
        setMessageCategory(messageCategory);
        return this;
    }

    /**
     * <p>
     * This is the period that sets the boundaries for returned results.
     * </p>
     * <p>
     * Acceptable values include
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONE_DAY</code> for daily job count for the prior 14 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregationPeriod
     *        This is the period that sets the boundaries for returned results.</p>
     *        <p>
     *        Acceptable values include
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONE_DAY</code> for daily job count for the prior 14 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     *        </p>
     *        </li>
     * @see AggregationPeriod
     */

    public void setAggregationPeriod(String aggregationPeriod) {
        this.aggregationPeriod = aggregationPeriod;
    }

    /**
     * <p>
     * This is the period that sets the boundaries for returned results.
     * </p>
     * <p>
     * Acceptable values include
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONE_DAY</code> for daily job count for the prior 14 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This is the period that sets the boundaries for returned results.</p>
     *         <p>
     *         Acceptable values include
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ONE_DAY</code> for daily job count for the prior 14 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     *         </p>
     *         </li>
     * @see AggregationPeriod
     */

    public String getAggregationPeriod() {
        return this.aggregationPeriod;
    }

    /**
     * <p>
     * This is the period that sets the boundaries for returned results.
     * </p>
     * <p>
     * Acceptable values include
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONE_DAY</code> for daily job count for the prior 14 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregationPeriod
     *        This is the period that sets the boundaries for returned results.</p>
     *        <p>
     *        Acceptable values include
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONE_DAY</code> for daily job count for the prior 14 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationPeriod
     */

    public ListBackupJobSummariesRequest withAggregationPeriod(String aggregationPeriod) {
        setAggregationPeriod(aggregationPeriod);
        return this;
    }

    /**
     * <p>
     * This is the period that sets the boundaries for returned results.
     * </p>
     * <p>
     * Acceptable values include
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONE_DAY</code> for daily job count for the prior 14 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregationPeriod
     *        This is the period that sets the boundaries for returned results.</p>
     *        <p>
     *        Acceptable values include
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONE_DAY</code> for daily job count for the prior 14 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SEVEN_DAYS</code> for the aggregated job count for the prior 7 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOURTEEN_DAYS</code> for aggregated job count for prior 14 days.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationPeriod
     */

    public ListBackupJobSummariesRequest withAggregationPeriod(AggregationPeriod aggregationPeriod) {
        this.aggregationPeriod = aggregationPeriod.toString();
        return this;
    }

    /**
     * <p>
     * This parameter sets the maximum number of items to be returned.
     * </p>
     * <p>
     * The value is an integer. Range of accepted values is from 1 to 500.
     * </p>
     * 
     * @param maxResults
     *        This parameter sets the maximum number of items to be returned.</p>
     *        <p>
     *        The value is an integer. Range of accepted values is from 1 to 500.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * This parameter sets the maximum number of items to be returned.
     * </p>
     * <p>
     * The value is an integer. Range of accepted values is from 1 to 500.
     * </p>
     * 
     * @return This parameter sets the maximum number of items to be returned.</p>
     *         <p>
     *         The value is an integer. Range of accepted values is from 1 to 500.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * This parameter sets the maximum number of items to be returned.
     * </p>
     * <p>
     * The value is an integer. Range of accepted values is from 1 to 500.
     * </p>
     * 
     * @param maxResults
     *        This parameter sets the maximum number of items to be returned.</p>
     *        <p>
     *        The value is an integer. Range of accepted values is from 1 to 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupJobSummariesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned resources. For example, if a request is made to return
     *        <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *        your list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned resources. For example, if a request is made to return
     *         <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *         your list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned resources. For example, if a request is made to return
     *        <code>MaxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *        your list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupJobSummariesRequest withNextToken(String nextToken) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getMessageCategory() != null)
            sb.append("MessageCategory: ").append(getMessageCategory()).append(",");
        if (getAggregationPeriod() != null)
            sb.append("AggregationPeriod: ").append(getAggregationPeriod()).append(",");
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

        if (obj instanceof ListBackupJobSummariesRequest == false)
            return false;
        ListBackupJobSummariesRequest other = (ListBackupJobSummariesRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getMessageCategory() == null ^ this.getMessageCategory() == null)
            return false;
        if (other.getMessageCategory() != null && other.getMessageCategory().equals(this.getMessageCategory()) == false)
            return false;
        if (other.getAggregationPeriod() == null ^ this.getAggregationPeriod() == null)
            return false;
        if (other.getAggregationPeriod() != null && other.getAggregationPeriod().equals(this.getAggregationPeriod()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getMessageCategory() == null) ? 0 : getMessageCategory().hashCode());
        hashCode = prime * hashCode + ((getAggregationPeriod() == null) ? 0 : getAggregationPeriod().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBackupJobSummariesRequest clone() {
        return (ListBackupJobSummariesRequest) super.clone();
    }

}
