/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for <code>ListJobs</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ListJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the job queue used to list jobs.
     * </p>
     */
    private String jobQueue;
    /**
     * <p>
     * The job ID for an array job. Specifying an array job ID with this parameter lists all child jobs from within the
     * specified array.
     * </p>
     */
    private String arrayJobId;
    /**
     * <p>
     * The job ID for a multi-node parallel job. Specifying a multi-node parallel job ID with this parameter lists all
     * nodes that are associated with the specified job.
     * </p>
     */
    private String multiNodeJobId;
    /**
     * <p>
     * The job status used to filter jobs in the specified queue. If the <code>filters</code> parameter is specified,
     * the <code>jobStatus</code> parameter is ignored and jobs with any status are returned. If you don't specify a
     * status, only <code>RUNNING</code> jobs are returned.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter is used,
     * <code>ListJobs</code> only returns <code>maxResults</code> results in a single page and a <code>nextToken</code>
     * response element. The remaining results of the initial request can be seen by sending another
     * <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value can be between 1 and
     * 100. If this parameter isn't used, then <code>ListJobs</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * Treat this token as an opaque identifier that's only used to retrieve the next items in a list and not for other
     * programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * The filter to apply to the query. Only one filter can be used at a time. When the filter is used,
     * <code>jobStatus</code> is ignored. The filter doesn't apply to child jobs in an array or multi-node parallel
     * (MNP) jobs. The results are sorted by the <code>createdAt</code> field, with the most recent jobs being first.
     * </p>
     * <dl>
     * <dt>JOB_NAME</dt>
     * <dd>
     * <p>
     * The value of the filter is a case-insensitive match for the job name. If the value ends with an asterisk (*), the
     * filter matches any job name that begins with the string before the '*'. This corresponds to the
     * <code>jobName</code> value. For example, <code>test1</code> matches both <code>Test1</code> and
     * <code>test1</code>, and <code>test1*</code> matches both <code>test1</code> and <code>Test10</code>. When the
     * <code>JOB_NAME</code> filter is used, the results are grouped by the job name and version.
     * </p>
     * </dd>
     * <dt>JOB_DEFINITION</dt>
     * <dd>
     * <p>
     * The value for the filter is the name or Amazon Resource Name (ARN) of the job definition. This corresponds to the
     * <code>jobDefinition</code> value. The value is case sensitive. When the value for the filter is the job
     * definition name, the results include all the jobs that used any revision of that job definition name. If the
     * value ends with an asterisk (*), the filter matches any job definition name that begins with the string before
     * the '*'. For example, <code>jd1</code> matches only <code>jd1</code>, and <code>jd1*</code> matches both
     * <code>jd1</code> and <code>jd1A</code>. The version of the job definition that's used doesn't affect the sort
     * order. When the <code>JOB_DEFINITION</code> filter is used and the ARN is used (which is in the form
     * <code>arn:${Partition}:batch:${Region}:${Account}:job-definition/${JobDefinitionName}:${Revision}</code>), the
     * results include jobs that used the specified revision of the job definition. Asterisk (*) isn't supported when
     * the ARN is used.
     * </p>
     * </dd>
     * <dt>BEFORE_CREATED_AT</dt>
     * <dd>
     * <p>
     * The value for the filter is the time that's before the job was created. This corresponds to the
     * <code>createdAt</code> value. The value is a string representation of the number of milliseconds since 00:00:00
     * UTC (midnight) on January 1, 1970.
     * </p>
     * </dd>
     * <dt>AFTER_CREATED_AT</dt>
     * <dd>
     * <p>
     * The value for the filter is the time that's after the job was created. This corresponds to the
     * <code>createdAt</code> value. The value is a string representation of the number of milliseconds since 00:00:00
     * UTC (midnight) on January 1, 1970.
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.List<KeyValuesPair> filters;

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the job queue used to list jobs.
     * </p>
     * 
     * @param jobQueue
     *        The name or full Amazon Resource Name (ARN) of the job queue used to list jobs.
     */

    public void setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
    }

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the job queue used to list jobs.
     * </p>
     * 
     * @return The name or full Amazon Resource Name (ARN) of the job queue used to list jobs.
     */

    public String getJobQueue() {
        return this.jobQueue;
    }

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the job queue used to list jobs.
     * </p>
     * 
     * @param jobQueue
     *        The name or full Amazon Resource Name (ARN) of the job queue used to list jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withJobQueue(String jobQueue) {
        setJobQueue(jobQueue);
        return this;
    }

    /**
     * <p>
     * The job ID for an array job. Specifying an array job ID with this parameter lists all child jobs from within the
     * specified array.
     * </p>
     * 
     * @param arrayJobId
     *        The job ID for an array job. Specifying an array job ID with this parameter lists all child jobs from
     *        within the specified array.
     */

    public void setArrayJobId(String arrayJobId) {
        this.arrayJobId = arrayJobId;
    }

    /**
     * <p>
     * The job ID for an array job. Specifying an array job ID with this parameter lists all child jobs from within the
     * specified array.
     * </p>
     * 
     * @return The job ID for an array job. Specifying an array job ID with this parameter lists all child jobs from
     *         within the specified array.
     */

    public String getArrayJobId() {
        return this.arrayJobId;
    }

    /**
     * <p>
     * The job ID for an array job. Specifying an array job ID with this parameter lists all child jobs from within the
     * specified array.
     * </p>
     * 
     * @param arrayJobId
     *        The job ID for an array job. Specifying an array job ID with this parameter lists all child jobs from
     *        within the specified array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withArrayJobId(String arrayJobId) {
        setArrayJobId(arrayJobId);
        return this;
    }

    /**
     * <p>
     * The job ID for a multi-node parallel job. Specifying a multi-node parallel job ID with this parameter lists all
     * nodes that are associated with the specified job.
     * </p>
     * 
     * @param multiNodeJobId
     *        The job ID for a multi-node parallel job. Specifying a multi-node parallel job ID with this parameter
     *        lists all nodes that are associated with the specified job.
     */

    public void setMultiNodeJobId(String multiNodeJobId) {
        this.multiNodeJobId = multiNodeJobId;
    }

    /**
     * <p>
     * The job ID for a multi-node parallel job. Specifying a multi-node parallel job ID with this parameter lists all
     * nodes that are associated with the specified job.
     * </p>
     * 
     * @return The job ID for a multi-node parallel job. Specifying a multi-node parallel job ID with this parameter
     *         lists all nodes that are associated with the specified job.
     */

    public String getMultiNodeJobId() {
        return this.multiNodeJobId;
    }

    /**
     * <p>
     * The job ID for a multi-node parallel job. Specifying a multi-node parallel job ID with this parameter lists all
     * nodes that are associated with the specified job.
     * </p>
     * 
     * @param multiNodeJobId
     *        The job ID for a multi-node parallel job. Specifying a multi-node parallel job ID with this parameter
     *        lists all nodes that are associated with the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withMultiNodeJobId(String multiNodeJobId) {
        setMultiNodeJobId(multiNodeJobId);
        return this;
    }

    /**
     * <p>
     * The job status used to filter jobs in the specified queue. If the <code>filters</code> parameter is specified,
     * the <code>jobStatus</code> parameter is ignored and jobs with any status are returned. If you don't specify a
     * status, only <code>RUNNING</code> jobs are returned.
     * </p>
     * 
     * @param jobStatus
     *        The job status used to filter jobs in the specified queue. If the <code>filters</code> parameter is
     *        specified, the <code>jobStatus</code> parameter is ignored and jobs with any status are returned. If you
     *        don't specify a status, only <code>RUNNING</code> jobs are returned.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The job status used to filter jobs in the specified queue. If the <code>filters</code> parameter is specified,
     * the <code>jobStatus</code> parameter is ignored and jobs with any status are returned. If you don't specify a
     * status, only <code>RUNNING</code> jobs are returned.
     * </p>
     * 
     * @return The job status used to filter jobs in the specified queue. If the <code>filters</code> parameter is
     *         specified, the <code>jobStatus</code> parameter is ignored and jobs with any status are returned. If you
     *         don't specify a status, only <code>RUNNING</code> jobs are returned.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The job status used to filter jobs in the specified queue. If the <code>filters</code> parameter is specified,
     * the <code>jobStatus</code> parameter is ignored and jobs with any status are returned. If you don't specify a
     * status, only <code>RUNNING</code> jobs are returned.
     * </p>
     * 
     * @param jobStatus
     *        The job status used to filter jobs in the specified queue. If the <code>filters</code> parameter is
     *        specified, the <code>jobStatus</code> parameter is ignored and jobs with any status are returned. If you
     *        don't specify a status, only <code>RUNNING</code> jobs are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListJobsRequest withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The job status used to filter jobs in the specified queue. If the <code>filters</code> parameter is specified,
     * the <code>jobStatus</code> parameter is ignored and jobs with any status are returned. If you don't specify a
     * status, only <code>RUNNING</code> jobs are returned.
     * </p>
     * 
     * @param jobStatus
     *        The job status used to filter jobs in the specified queue. If the <code>filters</code> parameter is
     *        specified, the <code>jobStatus</code> parameter is ignored and jobs with any status are returned. If you
     *        don't specify a status, only <code>RUNNING</code> jobs are returned.
     * @see JobStatus
     */

    public void setJobStatus(JobStatus jobStatus) {
        withJobStatus(jobStatus);
    }

    /**
     * <p>
     * The job status used to filter jobs in the specified queue. If the <code>filters</code> parameter is specified,
     * the <code>jobStatus</code> parameter is ignored and jobs with any status are returned. If you don't specify a
     * status, only <code>RUNNING</code> jobs are returned.
     * </p>
     * 
     * @param jobStatus
     *        The job status used to filter jobs in the specified queue. If the <code>filters</code> parameter is
     *        specified, the <code>jobStatus</code> parameter is ignored and jobs with any status are returned. If you
     *        don't specify a status, only <code>RUNNING</code> jobs are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListJobsRequest withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter is used,
     * <code>ListJobs</code> only returns <code>maxResults</code> results in a single page and a <code>nextToken</code>
     * response element. The remaining results of the initial request can be seen by sending another
     * <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value can be between 1 and
     * 100. If this parameter isn't used, then <code>ListJobs</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter
     *        is used, <code>ListJobs</code> only returns <code>maxResults</code> results in a single page and a
     *        <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     *        sending another <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value
     *        can be between 1 and 100. If this parameter isn't used, then <code>ListJobs</code> returns up to 100
     *        results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter is used,
     * <code>ListJobs</code> only returns <code>maxResults</code> results in a single page and a <code>nextToken</code>
     * response element. The remaining results of the initial request can be seen by sending another
     * <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value can be between 1 and
     * 100. If this parameter isn't used, then <code>ListJobs</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter
     *         is used, <code>ListJobs</code> only returns <code>maxResults</code> results in a single page and a
     *         <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     *         sending another <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value
     *         can be between 1 and 100. If this parameter isn't used, then <code>ListJobs</code> returns up to 100
     *         results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter is used,
     * <code>ListJobs</code> only returns <code>maxResults</code> results in a single page and a <code>nextToken</code>
     * response element. The remaining results of the initial request can be seen by sending another
     * <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value can be between 1 and
     * 100. If this parameter isn't used, then <code>ListJobs</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter
     *        is used, <code>ListJobs</code> only returns <code>maxResults</code> results in a single page and a
     *        <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     *        sending another <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value
     *        can be between 1 and 100. If this parameter isn't used, then <code>ListJobs</code> returns up to 100
     *        results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * Treat this token as an opaque identifier that's only used to retrieve the next items in a list and not for other
     * programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.</p> <note>
     *        <p>
     *        Treat this token as an opaque identifier that's only used to retrieve the next items in a list and not for
     *        other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * Treat this token as an opaque identifier that's only used to retrieve the next items in a list and not for other
     * programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     *         <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *         is <code>null</code> when there are no more results to return.</p> <note>
     *         <p>
     *         Treat this token as an opaque identifier that's only used to retrieve the next items in a list and not
     *         for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * Treat this token as an opaque identifier that's only used to retrieve the next items in a list and not for other
     * programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.</p> <note>
     *        <p>
     *        Treat this token as an opaque identifier that's only used to retrieve the next items in a list and not for
     *        other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The filter to apply to the query. Only one filter can be used at a time. When the filter is used,
     * <code>jobStatus</code> is ignored. The filter doesn't apply to child jobs in an array or multi-node parallel
     * (MNP) jobs. The results are sorted by the <code>createdAt</code> field, with the most recent jobs being first.
     * </p>
     * <dl>
     * <dt>JOB_NAME</dt>
     * <dd>
     * <p>
     * The value of the filter is a case-insensitive match for the job name. If the value ends with an asterisk (*), the
     * filter matches any job name that begins with the string before the '*'. This corresponds to the
     * <code>jobName</code> value. For example, <code>test1</code> matches both <code>Test1</code> and
     * <code>test1</code>, and <code>test1*</code> matches both <code>test1</code> and <code>Test10</code>. When the
     * <code>JOB_NAME</code> filter is used, the results are grouped by the job name and version.
     * </p>
     * </dd>
     * <dt>JOB_DEFINITION</dt>
     * <dd>
     * <p>
     * The value for the filter is the name or Amazon Resource Name (ARN) of the job definition. This corresponds to the
     * <code>jobDefinition</code> value. The value is case sensitive. When the value for the filter is the job
     * definition name, the results include all the jobs that used any revision of that job definition name. If the
     * value ends with an asterisk (*), the filter matches any job definition name that begins with the string before
     * the '*'. For example, <code>jd1</code> matches only <code>jd1</code>, and <code>jd1*</code> matches both
     * <code>jd1</code> and <code>jd1A</code>. The version of the job definition that's used doesn't affect the sort
     * order. When the <code>JOB_DEFINITION</code> filter is used and the ARN is used (which is in the form
     * <code>arn:${Partition}:batch:${Region}:${Account}:job-definition/${JobDefinitionName}:${Revision}</code>), the
     * results include jobs that used the specified revision of the job definition. Asterisk (*) isn't supported when
     * the ARN is used.
     * </p>
     * </dd>
     * <dt>BEFORE_CREATED_AT</dt>
     * <dd>
     * <p>
     * The value for the filter is the time that's before the job was created. This corresponds to the
     * <code>createdAt</code> value. The value is a string representation of the number of milliseconds since 00:00:00
     * UTC (midnight) on January 1, 1970.
     * </p>
     * </dd>
     * <dt>AFTER_CREATED_AT</dt>
     * <dd>
     * <p>
     * The value for the filter is the time that's after the job was created. This corresponds to the
     * <code>createdAt</code> value. The value is a string representation of the number of milliseconds since 00:00:00
     * UTC (midnight) on January 1, 1970.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The filter to apply to the query. Only one filter can be used at a time. When the filter is used,
     *         <code>jobStatus</code> is ignored. The filter doesn't apply to child jobs in an array or multi-node
     *         parallel (MNP) jobs. The results are sorted by the <code>createdAt</code> field, with the most recent
     *         jobs being first.</p>
     *         <dl>
     *         <dt>JOB_NAME</dt>
     *         <dd>
     *         <p>
     *         The value of the filter is a case-insensitive match for the job name. If the value ends with an asterisk
     *         (*), the filter matches any job name that begins with the string before the '*'. This corresponds to the
     *         <code>jobName</code> value. For example, <code>test1</code> matches both <code>Test1</code> and
     *         <code>test1</code>, and <code>test1*</code> matches both <code>test1</code> and <code>Test10</code>. When
     *         the <code>JOB_NAME</code> filter is used, the results are grouped by the job name and version.
     *         </p>
     *         </dd>
     *         <dt>JOB_DEFINITION</dt>
     *         <dd>
     *         <p>
     *         The value for the filter is the name or Amazon Resource Name (ARN) of the job definition. This
     *         corresponds to the <code>jobDefinition</code> value. The value is case sensitive. When the value for the
     *         filter is the job definition name, the results include all the jobs that used any revision of that job
     *         definition name. If the value ends with an asterisk (*), the filter matches any job definition name that
     *         begins with the string before the '*'. For example, <code>jd1</code> matches only <code>jd1</code>, and
     *         <code>jd1*</code> matches both <code>jd1</code> and <code>jd1A</code>. The version of the job definition
     *         that's used doesn't affect the sort order. When the <code>JOB_DEFINITION</code> filter is used and the
     *         ARN is used (which is in the form
     *         <code>arn:${Partition}:batch:${Region}:${Account}:job-definition/${JobDefinitionName}:${Revision}</code>
     *         ), the results include jobs that used the specified revision of the job definition. Asterisk (*) isn't
     *         supported when the ARN is used.
     *         </p>
     *         </dd>
     *         <dt>BEFORE_CREATED_AT</dt>
     *         <dd>
     *         <p>
     *         The value for the filter is the time that's before the job was created. This corresponds to the
     *         <code>createdAt</code> value. The value is a string representation of the number of milliseconds since
     *         00:00:00 UTC (midnight) on January 1, 1970.
     *         </p>
     *         </dd>
     *         <dt>AFTER_CREATED_AT</dt>
     *         <dd>
     *         <p>
     *         The value for the filter is the time that's after the job was created. This corresponds to the
     *         <code>createdAt</code> value. The value is a string representation of the number of milliseconds since
     *         00:00:00 UTC (midnight) on January 1, 1970.
     *         </p>
     *         </dd>
     */

    public java.util.List<KeyValuesPair> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filter to apply to the query. Only one filter can be used at a time. When the filter is used,
     * <code>jobStatus</code> is ignored. The filter doesn't apply to child jobs in an array or multi-node parallel
     * (MNP) jobs. The results are sorted by the <code>createdAt</code> field, with the most recent jobs being first.
     * </p>
     * <dl>
     * <dt>JOB_NAME</dt>
     * <dd>
     * <p>
     * The value of the filter is a case-insensitive match for the job name. If the value ends with an asterisk (*), the
     * filter matches any job name that begins with the string before the '*'. This corresponds to the
     * <code>jobName</code> value. For example, <code>test1</code> matches both <code>Test1</code> and
     * <code>test1</code>, and <code>test1*</code> matches both <code>test1</code> and <code>Test10</code>. When the
     * <code>JOB_NAME</code> filter is used, the results are grouped by the job name and version.
     * </p>
     * </dd>
     * <dt>JOB_DEFINITION</dt>
     * <dd>
     * <p>
     * The value for the filter is the name or Amazon Resource Name (ARN) of the job definition. This corresponds to the
     * <code>jobDefinition</code> value. The value is case sensitive. When the value for the filter is the job
     * definition name, the results include all the jobs that used any revision of that job definition name. If the
     * value ends with an asterisk (*), the filter matches any job definition name that begins with the string before
     * the '*'. For example, <code>jd1</code> matches only <code>jd1</code>, and <code>jd1*</code> matches both
     * <code>jd1</code> and <code>jd1A</code>. The version of the job definition that's used doesn't affect the sort
     * order. When the <code>JOB_DEFINITION</code> filter is used and the ARN is used (which is in the form
     * <code>arn:${Partition}:batch:${Region}:${Account}:job-definition/${JobDefinitionName}:${Revision}</code>), the
     * results include jobs that used the specified revision of the job definition. Asterisk (*) isn't supported when
     * the ARN is used.
     * </p>
     * </dd>
     * <dt>BEFORE_CREATED_AT</dt>
     * <dd>
     * <p>
     * The value for the filter is the time that's before the job was created. This corresponds to the
     * <code>createdAt</code> value. The value is a string representation of the number of milliseconds since 00:00:00
     * UTC (midnight) on January 1, 1970.
     * </p>
     * </dd>
     * <dt>AFTER_CREATED_AT</dt>
     * <dd>
     * <p>
     * The value for the filter is the time that's after the job was created. This corresponds to the
     * <code>createdAt</code> value. The value is a string representation of the number of milliseconds since 00:00:00
     * UTC (midnight) on January 1, 1970.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param filters
     *        The filter to apply to the query. Only one filter can be used at a time. When the filter is used,
     *        <code>jobStatus</code> is ignored. The filter doesn't apply to child jobs in an array or multi-node
     *        parallel (MNP) jobs. The results are sorted by the <code>createdAt</code> field, with the most recent jobs
     *        being first.</p>
     *        <dl>
     *        <dt>JOB_NAME</dt>
     *        <dd>
     *        <p>
     *        The value of the filter is a case-insensitive match for the job name. If the value ends with an asterisk
     *        (*), the filter matches any job name that begins with the string before the '*'. This corresponds to the
     *        <code>jobName</code> value. For example, <code>test1</code> matches both <code>Test1</code> and
     *        <code>test1</code>, and <code>test1*</code> matches both <code>test1</code> and <code>Test10</code>. When
     *        the <code>JOB_NAME</code> filter is used, the results are grouped by the job name and version.
     *        </p>
     *        </dd>
     *        <dt>JOB_DEFINITION</dt>
     *        <dd>
     *        <p>
     *        The value for the filter is the name or Amazon Resource Name (ARN) of the job definition. This corresponds
     *        to the <code>jobDefinition</code> value. The value is case sensitive. When the value for the filter is the
     *        job definition name, the results include all the jobs that used any revision of that job definition name.
     *        If the value ends with an asterisk (*), the filter matches any job definition name that begins with the
     *        string before the '*'. For example, <code>jd1</code> matches only <code>jd1</code>, and <code>jd1*</code>
     *        matches both <code>jd1</code> and <code>jd1A</code>. The version of the job definition that's used doesn't
     *        affect the sort order. When the <code>JOB_DEFINITION</code> filter is used and the ARN is used (which is
     *        in the form
     *        <code>arn:${Partition}:batch:${Region}:${Account}:job-definition/${JobDefinitionName}:${Revision}</code>),
     *        the results include jobs that used the specified revision of the job definition. Asterisk (*) isn't
     *        supported when the ARN is used.
     *        </p>
     *        </dd>
     *        <dt>BEFORE_CREATED_AT</dt>
     *        <dd>
     *        <p>
     *        The value for the filter is the time that's before the job was created. This corresponds to the
     *        <code>createdAt</code> value. The value is a string representation of the number of milliseconds since
     *        00:00:00 UTC (midnight) on January 1, 1970.
     *        </p>
     *        </dd>
     *        <dt>AFTER_CREATED_AT</dt>
     *        <dd>
     *        <p>
     *        The value for the filter is the time that's after the job was created. This corresponds to the
     *        <code>createdAt</code> value. The value is a string representation of the number of milliseconds since
     *        00:00:00 UTC (midnight) on January 1, 1970.
     *        </p>
     *        </dd>
     */

    public void setFilters(java.util.Collection<KeyValuesPair> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<KeyValuesPair>(filters);
    }

    /**
     * <p>
     * The filter to apply to the query. Only one filter can be used at a time. When the filter is used,
     * <code>jobStatus</code> is ignored. The filter doesn't apply to child jobs in an array or multi-node parallel
     * (MNP) jobs. The results are sorted by the <code>createdAt</code> field, with the most recent jobs being first.
     * </p>
     * <dl>
     * <dt>JOB_NAME</dt>
     * <dd>
     * <p>
     * The value of the filter is a case-insensitive match for the job name. If the value ends with an asterisk (*), the
     * filter matches any job name that begins with the string before the '*'. This corresponds to the
     * <code>jobName</code> value. For example, <code>test1</code> matches both <code>Test1</code> and
     * <code>test1</code>, and <code>test1*</code> matches both <code>test1</code> and <code>Test10</code>. When the
     * <code>JOB_NAME</code> filter is used, the results are grouped by the job name and version.
     * </p>
     * </dd>
     * <dt>JOB_DEFINITION</dt>
     * <dd>
     * <p>
     * The value for the filter is the name or Amazon Resource Name (ARN) of the job definition. This corresponds to the
     * <code>jobDefinition</code> value. The value is case sensitive. When the value for the filter is the job
     * definition name, the results include all the jobs that used any revision of that job definition name. If the
     * value ends with an asterisk (*), the filter matches any job definition name that begins with the string before
     * the '*'. For example, <code>jd1</code> matches only <code>jd1</code>, and <code>jd1*</code> matches both
     * <code>jd1</code> and <code>jd1A</code>. The version of the job definition that's used doesn't affect the sort
     * order. When the <code>JOB_DEFINITION</code> filter is used and the ARN is used (which is in the form
     * <code>arn:${Partition}:batch:${Region}:${Account}:job-definition/${JobDefinitionName}:${Revision}</code>), the
     * results include jobs that used the specified revision of the job definition. Asterisk (*) isn't supported when
     * the ARN is used.
     * </p>
     * </dd>
     * <dt>BEFORE_CREATED_AT</dt>
     * <dd>
     * <p>
     * The value for the filter is the time that's before the job was created. This corresponds to the
     * <code>createdAt</code> value. The value is a string representation of the number of milliseconds since 00:00:00
     * UTC (midnight) on January 1, 1970.
     * </p>
     * </dd>
     * <dt>AFTER_CREATED_AT</dt>
     * <dd>
     * <p>
     * The value for the filter is the time that's after the job was created. This corresponds to the
     * <code>createdAt</code> value. The value is a string representation of the number of milliseconds since 00:00:00
     * UTC (midnight) on January 1, 1970.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filter to apply to the query. Only one filter can be used at a time. When the filter is used,
     *        <code>jobStatus</code> is ignored. The filter doesn't apply to child jobs in an array or multi-node
     *        parallel (MNP) jobs. The results are sorted by the <code>createdAt</code> field, with the most recent jobs
     *        being first.</p>
     *        <dl>
     *        <dt>JOB_NAME</dt>
     *        <dd>
     *        <p>
     *        The value of the filter is a case-insensitive match for the job name. If the value ends with an asterisk
     *        (*), the filter matches any job name that begins with the string before the '*'. This corresponds to the
     *        <code>jobName</code> value. For example, <code>test1</code> matches both <code>Test1</code> and
     *        <code>test1</code>, and <code>test1*</code> matches both <code>test1</code> and <code>Test10</code>. When
     *        the <code>JOB_NAME</code> filter is used, the results are grouped by the job name and version.
     *        </p>
     *        </dd>
     *        <dt>JOB_DEFINITION</dt>
     *        <dd>
     *        <p>
     *        The value for the filter is the name or Amazon Resource Name (ARN) of the job definition. This corresponds
     *        to the <code>jobDefinition</code> value. The value is case sensitive. When the value for the filter is the
     *        job definition name, the results include all the jobs that used any revision of that job definition name.
     *        If the value ends with an asterisk (*), the filter matches any job definition name that begins with the
     *        string before the '*'. For example, <code>jd1</code> matches only <code>jd1</code>, and <code>jd1*</code>
     *        matches both <code>jd1</code> and <code>jd1A</code>. The version of the job definition that's used doesn't
     *        affect the sort order. When the <code>JOB_DEFINITION</code> filter is used and the ARN is used (which is
     *        in the form
     *        <code>arn:${Partition}:batch:${Region}:${Account}:job-definition/${JobDefinitionName}:${Revision}</code>),
     *        the results include jobs that used the specified revision of the job definition. Asterisk (*) isn't
     *        supported when the ARN is used.
     *        </p>
     *        </dd>
     *        <dt>BEFORE_CREATED_AT</dt>
     *        <dd>
     *        <p>
     *        The value for the filter is the time that's before the job was created. This corresponds to the
     *        <code>createdAt</code> value. The value is a string representation of the number of milliseconds since
     *        00:00:00 UTC (midnight) on January 1, 1970.
     *        </p>
     *        </dd>
     *        <dt>AFTER_CREATED_AT</dt>
     *        <dd>
     *        <p>
     *        The value for the filter is the time that's after the job was created. This corresponds to the
     *        <code>createdAt</code> value. The value is a string representation of the number of milliseconds since
     *        00:00:00 UTC (midnight) on January 1, 1970.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withFilters(KeyValuesPair... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<KeyValuesPair>(filters.length));
        }
        for (KeyValuesPair ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filter to apply to the query. Only one filter can be used at a time. When the filter is used,
     * <code>jobStatus</code> is ignored. The filter doesn't apply to child jobs in an array or multi-node parallel
     * (MNP) jobs. The results are sorted by the <code>createdAt</code> field, with the most recent jobs being first.
     * </p>
     * <dl>
     * <dt>JOB_NAME</dt>
     * <dd>
     * <p>
     * The value of the filter is a case-insensitive match for the job name. If the value ends with an asterisk (*), the
     * filter matches any job name that begins with the string before the '*'. This corresponds to the
     * <code>jobName</code> value. For example, <code>test1</code> matches both <code>Test1</code> and
     * <code>test1</code>, and <code>test1*</code> matches both <code>test1</code> and <code>Test10</code>. When the
     * <code>JOB_NAME</code> filter is used, the results are grouped by the job name and version.
     * </p>
     * </dd>
     * <dt>JOB_DEFINITION</dt>
     * <dd>
     * <p>
     * The value for the filter is the name or Amazon Resource Name (ARN) of the job definition. This corresponds to the
     * <code>jobDefinition</code> value. The value is case sensitive. When the value for the filter is the job
     * definition name, the results include all the jobs that used any revision of that job definition name. If the
     * value ends with an asterisk (*), the filter matches any job definition name that begins with the string before
     * the '*'. For example, <code>jd1</code> matches only <code>jd1</code>, and <code>jd1*</code> matches both
     * <code>jd1</code> and <code>jd1A</code>. The version of the job definition that's used doesn't affect the sort
     * order. When the <code>JOB_DEFINITION</code> filter is used and the ARN is used (which is in the form
     * <code>arn:${Partition}:batch:${Region}:${Account}:job-definition/${JobDefinitionName}:${Revision}</code>), the
     * results include jobs that used the specified revision of the job definition. Asterisk (*) isn't supported when
     * the ARN is used.
     * </p>
     * </dd>
     * <dt>BEFORE_CREATED_AT</dt>
     * <dd>
     * <p>
     * The value for the filter is the time that's before the job was created. This corresponds to the
     * <code>createdAt</code> value. The value is a string representation of the number of milliseconds since 00:00:00
     * UTC (midnight) on January 1, 1970.
     * </p>
     * </dd>
     * <dt>AFTER_CREATED_AT</dt>
     * <dd>
     * <p>
     * The value for the filter is the time that's after the job was created. This corresponds to the
     * <code>createdAt</code> value. The value is a string representation of the number of milliseconds since 00:00:00
     * UTC (midnight) on January 1, 1970.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param filters
     *        The filter to apply to the query. Only one filter can be used at a time. When the filter is used,
     *        <code>jobStatus</code> is ignored. The filter doesn't apply to child jobs in an array or multi-node
     *        parallel (MNP) jobs. The results are sorted by the <code>createdAt</code> field, with the most recent jobs
     *        being first.</p>
     *        <dl>
     *        <dt>JOB_NAME</dt>
     *        <dd>
     *        <p>
     *        The value of the filter is a case-insensitive match for the job name. If the value ends with an asterisk
     *        (*), the filter matches any job name that begins with the string before the '*'. This corresponds to the
     *        <code>jobName</code> value. For example, <code>test1</code> matches both <code>Test1</code> and
     *        <code>test1</code>, and <code>test1*</code> matches both <code>test1</code> and <code>Test10</code>. When
     *        the <code>JOB_NAME</code> filter is used, the results are grouped by the job name and version.
     *        </p>
     *        </dd>
     *        <dt>JOB_DEFINITION</dt>
     *        <dd>
     *        <p>
     *        The value for the filter is the name or Amazon Resource Name (ARN) of the job definition. This corresponds
     *        to the <code>jobDefinition</code> value. The value is case sensitive. When the value for the filter is the
     *        job definition name, the results include all the jobs that used any revision of that job definition name.
     *        If the value ends with an asterisk (*), the filter matches any job definition name that begins with the
     *        string before the '*'. For example, <code>jd1</code> matches only <code>jd1</code>, and <code>jd1*</code>
     *        matches both <code>jd1</code> and <code>jd1A</code>. The version of the job definition that's used doesn't
     *        affect the sort order. When the <code>JOB_DEFINITION</code> filter is used and the ARN is used (which is
     *        in the form
     *        <code>arn:${Partition}:batch:${Region}:${Account}:job-definition/${JobDefinitionName}:${Revision}</code>),
     *        the results include jobs that used the specified revision of the job definition. Asterisk (*) isn't
     *        supported when the ARN is used.
     *        </p>
     *        </dd>
     *        <dt>BEFORE_CREATED_AT</dt>
     *        <dd>
     *        <p>
     *        The value for the filter is the time that's before the job was created. This corresponds to the
     *        <code>createdAt</code> value. The value is a string representation of the number of milliseconds since
     *        00:00:00 UTC (midnight) on January 1, 1970.
     *        </p>
     *        </dd>
     *        <dt>AFTER_CREATED_AT</dt>
     *        <dd>
     *        <p>
     *        The value for the filter is the time that's after the job was created. This corresponds to the
     *        <code>createdAt</code> value. The value is a string representation of the number of milliseconds since
     *        00:00:00 UTC (midnight) on January 1, 1970.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withFilters(java.util.Collection<KeyValuesPair> filters) {
        setFilters(filters);
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
        if (getJobQueue() != null)
            sb.append("JobQueue: ").append(getJobQueue()).append(",");
        if (getArrayJobId() != null)
            sb.append("ArrayJobId: ").append(getArrayJobId()).append(",");
        if (getMultiNodeJobId() != null)
            sb.append("MultiNodeJobId: ").append(getMultiNodeJobId()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsRequest == false)
            return false;
        ListJobsRequest other = (ListJobsRequest) obj;
        if (other.getJobQueue() == null ^ this.getJobQueue() == null)
            return false;
        if (other.getJobQueue() != null && other.getJobQueue().equals(this.getJobQueue()) == false)
            return false;
        if (other.getArrayJobId() == null ^ this.getArrayJobId() == null)
            return false;
        if (other.getArrayJobId() != null && other.getArrayJobId().equals(this.getArrayJobId()) == false)
            return false;
        if (other.getMultiNodeJobId() == null ^ this.getMultiNodeJobId() == null)
            return false;
        if (other.getMultiNodeJobId() != null && other.getMultiNodeJobId().equals(this.getMultiNodeJobId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobQueue() == null) ? 0 : getJobQueue().hashCode());
        hashCode = prime * hashCode + ((getArrayJobId() == null) ? 0 : getArrayJobId().hashCode());
        hashCode = prime * hashCode + ((getMultiNodeJobId() == null) ? 0 : getMultiNodeJobId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsRequest clone() {
        return (ListJobsRequest) super.clone();
    }

}
