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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindingHistory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private AwsSecurityFindingIdentifier findingIdentifier;
    /**
     * <p>
     * A timestamp that indicates the start time of the requested finding history.
     * </p>
     * <p>
     * If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns finding
     * history for the specified time period. If you provide a value for <code>StartTime</code> but not for
     * <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the time at which
     * the API is called. If you provide a value for <code>EndTime</code> but not for <code>StartTime</code>, Security
     * Hub returns finding history from the <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     * >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     * <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     * timestamp of the finding to the time at which the API is called. In all of these scenarios, the response is
     * limited to 100 results, and the maximum time period is limited to 90 days.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * An ISO 8601-formatted timestamp that indicates the end time of the requested finding history.
     * </p>
     * <p>
     * If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns finding
     * history for the specified time period. If you provide a value for <code>StartTime</code> but not for
     * <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the time at which
     * the API is called. If you provide a value for <code>EndTime</code> but not for <code>StartTime</code>, Security
     * Hub returns finding history from the <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     * >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     * <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     * timestamp of the finding to the time at which the API is called. In all of these scenarios, the response is
     * limited to 100 results, and the maximum time period is limited to 90 days.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * A token for pagination purposes. Provide <code>NULL</code> as the initial value. In subsequent requests, provide
     * the token included in the response to get up to an additional 100 results of finding history. If you don’t
     * provide <code>NextToken</code>, Security Hub returns up to 100 results of finding history for each request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to be returned. If you don’t provide it, Security Hub returns up to 100 results of
     * finding history.
     * </p>
     */
    private Integer maxResults;

    /**
     * @param findingIdentifier
     */

    public void setFindingIdentifier(AwsSecurityFindingIdentifier findingIdentifier) {
        this.findingIdentifier = findingIdentifier;
    }

    /**
     * @return
     */

    public AwsSecurityFindingIdentifier getFindingIdentifier() {
        return this.findingIdentifier;
    }

    /**
     * @param findingIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingHistoryRequest withFindingIdentifier(AwsSecurityFindingIdentifier findingIdentifier) {
        setFindingIdentifier(findingIdentifier);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates the start time of the requested finding history.
     * </p>
     * <p>
     * If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns finding
     * history for the specified time period. If you provide a value for <code>StartTime</code> but not for
     * <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the time at which
     * the API is called. If you provide a value for <code>EndTime</code> but not for <code>StartTime</code>, Security
     * Hub returns finding history from the <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     * >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     * <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     * timestamp of the finding to the time at which the API is called. In all of these scenarios, the response is
     * limited to 100 results, and the maximum time period is limited to 90 days.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTime
     *        A timestamp that indicates the start time of the requested finding history.</p>
     *        <p>
     *        If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns
     *        finding history for the specified time period. If you provide a value for <code>StartTime</code> but not
     *        for <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the time
     *        at which the API is called. If you provide a value for <code>EndTime</code> but not for
     *        <code>StartTime</code>, Security Hub returns finding history from the <a href=
     *        "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     *        >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     *        <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     *        timestamp of the finding to the time at which the API is called. In all of these scenarios, the response
     *        is limited to 100 results, and the maximum time period is limited to 90 days.
     *        </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that indicates the start time of the requested finding history.
     * </p>
     * <p>
     * If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns finding
     * history for the specified time period. If you provide a value for <code>StartTime</code> but not for
     * <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the time at which
     * the API is called. If you provide a value for <code>EndTime</code> but not for <code>StartTime</code>, Security
     * Hub returns finding history from the <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     * >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     * <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     * timestamp of the finding to the time at which the API is called. In all of these scenarios, the response is
     * limited to 100 results, and the maximum time period is limited to 90 days.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return A timestamp that indicates the start time of the requested finding history.</p>
     *         <p>
     *         If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns
     *         finding history for the specified time period. If you provide a value for <code>StartTime</code> but not
     *         for <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the
     *         time at which the API is called. If you provide a value for <code>EndTime</code> but not for
     *         <code>StartTime</code>, Security Hub returns finding history from the <a href=
     *         "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     *         >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     *         <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     *         timestamp of the finding to the time at which the API is called. In all of these scenarios, the response
     *         is limited to 100 results, and the maximum time period is limited to 90 days.
     *         </p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A timestamp that indicates the start time of the requested finding history.
     * </p>
     * <p>
     * If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns finding
     * history for the specified time period. If you provide a value for <code>StartTime</code> but not for
     * <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the time at which
     * the API is called. If you provide a value for <code>EndTime</code> but not for <code>StartTime</code>, Security
     * Hub returns finding history from the <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     * >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     * <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     * timestamp of the finding to the time at which the API is called. In all of these scenarios, the response is
     * limited to 100 results, and the maximum time period is limited to 90 days.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTime
     *        A timestamp that indicates the start time of the requested finding history.</p>
     *        <p>
     *        If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns
     *        finding history for the specified time period. If you provide a value for <code>StartTime</code> but not
     *        for <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the time
     *        at which the API is called. If you provide a value for <code>EndTime</code> but not for
     *        <code>StartTime</code>, Security Hub returns finding history from the <a href=
     *        "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     *        >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     *        <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     *        timestamp of the finding to the time at which the API is called. In all of these scenarios, the response
     *        is limited to 100 results, and the maximum time period is limited to 90 days.
     *        </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingHistoryRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * An ISO 8601-formatted timestamp that indicates the end time of the requested finding history.
     * </p>
     * <p>
     * If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns finding
     * history for the specified time period. If you provide a value for <code>StartTime</code> but not for
     * <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the time at which
     * the API is called. If you provide a value for <code>EndTime</code> but not for <code>StartTime</code>, Security
     * Hub returns finding history from the <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     * >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     * <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     * timestamp of the finding to the time at which the API is called. In all of these scenarios, the response is
     * limited to 100 results, and the maximum time period is limited to 90 days.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param endTime
     *        An ISO 8601-formatted timestamp that indicates the end time of the requested finding history.</p>
     *        <p>
     *        If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns
     *        finding history for the specified time period. If you provide a value for <code>StartTime</code> but not
     *        for <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the time
     *        at which the API is called. If you provide a value for <code>EndTime</code> but not for
     *        <code>StartTime</code>, Security Hub returns finding history from the <a href=
     *        "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     *        >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     *        <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     *        timestamp of the finding to the time at which the API is called. In all of these scenarios, the response
     *        is limited to 100 results, and the maximum time period is limited to 90 days.
     *        </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * An ISO 8601-formatted timestamp that indicates the end time of the requested finding history.
     * </p>
     * <p>
     * If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns finding
     * history for the specified time period. If you provide a value for <code>StartTime</code> but not for
     * <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the time at which
     * the API is called. If you provide a value for <code>EndTime</code> but not for <code>StartTime</code>, Security
     * Hub returns finding history from the <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     * >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     * <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     * timestamp of the finding to the time at which the API is called. In all of these scenarios, the response is
     * limited to 100 results, and the maximum time period is limited to 90 days.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return An ISO 8601-formatted timestamp that indicates the end time of the requested finding history.</p>
     *         <p>
     *         If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns
     *         finding history for the specified time period. If you provide a value for <code>StartTime</code> but not
     *         for <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the
     *         time at which the API is called. If you provide a value for <code>EndTime</code> but not for
     *         <code>StartTime</code>, Security Hub returns finding history from the <a href=
     *         "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     *         >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     *         <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     *         timestamp of the finding to the time at which the API is called. In all of these scenarios, the response
     *         is limited to 100 results, and the maximum time period is limited to 90 days.
     *         </p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * An ISO 8601-formatted timestamp that indicates the end time of the requested finding history.
     * </p>
     * <p>
     * If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns finding
     * history for the specified time period. If you provide a value for <code>StartTime</code> but not for
     * <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the time at which
     * the API is called. If you provide a value for <code>EndTime</code> but not for <code>StartTime</code>, Security
     * Hub returns finding history from the <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     * >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     * <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     * timestamp of the finding to the time at which the API is called. In all of these scenarios, the response is
     * limited to 100 results, and the maximum time period is limited to 90 days.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param endTime
     *        An ISO 8601-formatted timestamp that indicates the end time of the requested finding history.</p>
     *        <p>
     *        If you provide values for both <code>StartTime</code> and <code>EndTime</code>, Security Hub returns
     *        finding history for the specified time period. If you provide a value for <code>StartTime</code> but not
     *        for <code>EndTime</code>, Security Hub returns finding history from the <code>StartTime</code> to the time
     *        at which the API is called. If you provide a value for <code>EndTime</code> but not for
     *        <code>StartTime</code>, Security Hub returns finding history from the <a href=
     *        "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_AwsSecurityFindingFilters.html#securityhub-Type-AwsSecurityFindingFilters-CreatedAt"
     *        >CreatedAt</a> timestamp of the finding to the <code>EndTime</code>. If you provide neither
     *        <code>StartTime</code> nor <code>EndTime</code>, Security Hub returns finding history from the CreatedAt
     *        timestamp of the finding to the time at which the API is called. In all of these scenarios, the response
     *        is limited to 100 results, and the maximum time period is limited to 90 days.
     *        </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingHistoryRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A token for pagination purposes. Provide <code>NULL</code> as the initial value. In subsequent requests, provide
     * the token included in the response to get up to an additional 100 results of finding history. If you don’t
     * provide <code>NextToken</code>, Security Hub returns up to 100 results of finding history for each request.
     * </p>
     * 
     * @param nextToken
     *        A token for pagination purposes. Provide <code>NULL</code> as the initial value. In subsequent requests,
     *        provide the token included in the response to get up to an additional 100 results of finding history. If
     *        you don’t provide <code>NextToken</code>, Security Hub returns up to 100 results of finding history for
     *        each request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for pagination purposes. Provide <code>NULL</code> as the initial value. In subsequent requests, provide
     * the token included in the response to get up to an additional 100 results of finding history. If you don’t
     * provide <code>NextToken</code>, Security Hub returns up to 100 results of finding history for each request.
     * </p>
     * 
     * @return A token for pagination purposes. Provide <code>NULL</code> as the initial value. In subsequent requests,
     *         provide the token included in the response to get up to an additional 100 results of finding history. If
     *         you don’t provide <code>NextToken</code>, Security Hub returns up to 100 results of finding history for
     *         each request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for pagination purposes. Provide <code>NULL</code> as the initial value. In subsequent requests, provide
     * the token included in the response to get up to an additional 100 results of finding history. If you don’t
     * provide <code>NextToken</code>, Security Hub returns up to 100 results of finding history for each request.
     * </p>
     * 
     * @param nextToken
     *        A token for pagination purposes. Provide <code>NULL</code> as the initial value. In subsequent requests,
     *        provide the token included in the response to get up to an additional 100 results of finding history. If
     *        you don’t provide <code>NextToken</code>, Security Hub returns up to 100 results of finding history for
     *        each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingHistoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned. If you don’t provide it, Security Hub returns up to 100 results of
     * finding history.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned. If you don’t provide it, Security Hub returns up to 100
     *        results of finding history.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned. If you don’t provide it, Security Hub returns up to 100 results of
     * finding history.
     * </p>
     * 
     * @return The maximum number of results to be returned. If you don’t provide it, Security Hub returns up to 100
     *         results of finding history.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned. If you don’t provide it, Security Hub returns up to 100 results of
     * finding history.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned. If you don’t provide it, Security Hub returns up to 100
     *        results of finding history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingHistoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getFindingIdentifier() != null)
            sb.append("FindingIdentifier: ").append(getFindingIdentifier()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingHistoryRequest == false)
            return false;
        GetFindingHistoryRequest other = (GetFindingHistoryRequest) obj;
        if (other.getFindingIdentifier() == null ^ this.getFindingIdentifier() == null)
            return false;
        if (other.getFindingIdentifier() != null && other.getFindingIdentifier().equals(this.getFindingIdentifier()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingIdentifier() == null) ? 0 : getFindingIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingHistoryRequest clone() {
        return (GetFindingHistoryRequest) super.clone();
    }

}
