/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetCurrentMetricData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCurrentMetricDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The queues, up to 100, or channels, to use to filter the metrics returned. Metric data is retrieved only for the
     * resources associated with the queues or channels included in the filter. You can include both queue IDs and queue
     * ARNs in the same request. The only supported channel is <code>VOICE</code>.
     * </p>
     */
    private Filters filters;
    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when grouped by <code>QUEUE</code>, the metrics
     * returned apply to each queue rather than aggregated for all queues. If you group by <code>CHANNEL</code>, you
     * should include a Channels filter. The only supported channel is <code>VOICE</code>.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of metrics is returned.
     * </p>
     */
    private java.util.List<String> groupings;
    /**
     * <p>
     * The metrics to retrieve. Specify the name and unit for each metric. The following metrics are available:
     * </p>
     * <dl>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CONTACT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * </dd>
     * <dt>SLOTS_ACTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>SLOTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.List<CurrentMetric> currentMetrics;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use
     * the same request parameters as the request that generated the token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximimum number of results to return per page.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentMetricDataRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The queues, up to 100, or channels, to use to filter the metrics returned. Metric data is retrieved only for the
     * resources associated with the queues or channels included in the filter. You can include both queue IDs and queue
     * ARNs in the same request. The only supported channel is <code>VOICE</code>.
     * </p>
     * 
     * @param filters
     *        The queues, up to 100, or channels, to use to filter the metrics returned. Metric data is retrieved only
     *        for the resources associated with the queues or channels included in the filter. You can include both
     *        queue IDs and queue ARNs in the same request. The only supported channel is <code>VOICE</code>.
     */

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The queues, up to 100, or channels, to use to filter the metrics returned. Metric data is retrieved only for the
     * resources associated with the queues or channels included in the filter. You can include both queue IDs and queue
     * ARNs in the same request. The only supported channel is <code>VOICE</code>.
     * </p>
     * 
     * @return The queues, up to 100, or channels, to use to filter the metrics returned. Metric data is retrieved only
     *         for the resources associated with the queues or channels included in the filter. You can include both
     *         queue IDs and queue ARNs in the same request. The only supported channel is <code>VOICE</code>.
     */

    public Filters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * The queues, up to 100, or channels, to use to filter the metrics returned. Metric data is retrieved only for the
     * resources associated with the queues or channels included in the filter. You can include both queue IDs and queue
     * ARNs in the same request. The only supported channel is <code>VOICE</code>.
     * </p>
     * 
     * @param filters
     *        The queues, up to 100, or channels, to use to filter the metrics returned. Metric data is retrieved only
     *        for the resources associated with the queues or channels included in the filter. You can include both
     *        queue IDs and queue ARNs in the same request. The only supported channel is <code>VOICE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentMetricDataRequest withFilters(Filters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when grouped by <code>QUEUE</code>, the metrics
     * returned apply to each queue rather than aggregated for all queues. If you group by <code>CHANNEL</code>, you
     * should include a Channels filter. The only supported channel is <code>VOICE</code>.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of metrics is returned.
     * </p>
     * 
     * @return The grouping applied to the metrics returned. For example, when grouped by <code>QUEUE</code>, the
     *         metrics returned apply to each queue rather than aggregated for all queues. If you group by
     *         <code>CHANNEL</code>, you should include a Channels filter. The only supported channel is
     *         <code>VOICE</code>.</p>
     *         <p>
     *         If no <code>Grouping</code> is included in the request, a summary of metrics is returned.
     * @see Grouping
     */

    public java.util.List<String> getGroupings() {
        return groupings;
    }

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when grouped by <code>QUEUE</code>, the metrics
     * returned apply to each queue rather than aggregated for all queues. If you group by <code>CHANNEL</code>, you
     * should include a Channels filter. The only supported channel is <code>VOICE</code>.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of metrics is returned.
     * </p>
     * 
     * @param groupings
     *        The grouping applied to the metrics returned. For example, when grouped by <code>QUEUE</code>, the metrics
     *        returned apply to each queue rather than aggregated for all queues. If you group by <code>CHANNEL</code>,
     *        you should include a Channels filter. The only supported channel is <code>VOICE</code>.</p>
     *        <p>
     *        If no <code>Grouping</code> is included in the request, a summary of metrics is returned.
     * @see Grouping
     */

    public void setGroupings(java.util.Collection<String> groupings) {
        if (groupings == null) {
            this.groupings = null;
            return;
        }

        this.groupings = new java.util.ArrayList<String>(groupings);
    }

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when grouped by <code>QUEUE</code>, the metrics
     * returned apply to each queue rather than aggregated for all queues. If you group by <code>CHANNEL</code>, you
     * should include a Channels filter. The only supported channel is <code>VOICE</code>.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of metrics is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupings(java.util.Collection)} or {@link #withGroupings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param groupings
     *        The grouping applied to the metrics returned. For example, when grouped by <code>QUEUE</code>, the metrics
     *        returned apply to each queue rather than aggregated for all queues. If you group by <code>CHANNEL</code>,
     *        you should include a Channels filter. The only supported channel is <code>VOICE</code>.</p>
     *        <p>
     *        If no <code>Grouping</code> is included in the request, a summary of metrics is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Grouping
     */

    public GetCurrentMetricDataRequest withGroupings(String... groupings) {
        if (this.groupings == null) {
            setGroupings(new java.util.ArrayList<String>(groupings.length));
        }
        for (String ele : groupings) {
            this.groupings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when grouped by <code>QUEUE</code>, the metrics
     * returned apply to each queue rather than aggregated for all queues. If you group by <code>CHANNEL</code>, you
     * should include a Channels filter. The only supported channel is <code>VOICE</code>.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of metrics is returned.
     * </p>
     * 
     * @param groupings
     *        The grouping applied to the metrics returned. For example, when grouped by <code>QUEUE</code>, the metrics
     *        returned apply to each queue rather than aggregated for all queues. If you group by <code>CHANNEL</code>,
     *        you should include a Channels filter. The only supported channel is <code>VOICE</code>.</p>
     *        <p>
     *        If no <code>Grouping</code> is included in the request, a summary of metrics is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Grouping
     */

    public GetCurrentMetricDataRequest withGroupings(java.util.Collection<String> groupings) {
        setGroupings(groupings);
        return this;
    }

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when grouped by <code>QUEUE</code>, the metrics
     * returned apply to each queue rather than aggregated for all queues. If you group by <code>CHANNEL</code>, you
     * should include a Channels filter. The only supported channel is <code>VOICE</code>.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of metrics is returned.
     * </p>
     * 
     * @param groupings
     *        The grouping applied to the metrics returned. For example, when grouped by <code>QUEUE</code>, the metrics
     *        returned apply to each queue rather than aggregated for all queues. If you group by <code>CHANNEL</code>,
     *        you should include a Channels filter. The only supported channel is <code>VOICE</code>.</p>
     *        <p>
     *        If no <code>Grouping</code> is included in the request, a summary of metrics is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Grouping
     */

    public GetCurrentMetricDataRequest withGroupings(Grouping... groupings) {
        java.util.ArrayList<String> groupingsCopy = new java.util.ArrayList<String>(groupings.length);
        for (Grouping value : groupings) {
            groupingsCopy.add(value.toString());
        }
        if (getGroupings() == null) {
            setGroupings(groupingsCopy);
        } else {
            getGroupings().addAll(groupingsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The metrics to retrieve. Specify the name and unit for each metric. The following metrics are available:
     * </p>
     * <dl>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CONTACT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * </dd>
     * <dt>SLOTS_ACTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>SLOTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The metrics to retrieve. Specify the name and unit for each metric. The following metrics are
     *         available:</p>
     *         <dl>
     *         <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_AVAILABLE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_ERROR</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_NON_PRODUCTIVE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_ON_CALL</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_ON_CONTACT</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_ONLINE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_STAFFED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_IN_QUEUE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_SCHEDULED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>OLDEST_CONTACT_AGE</dt>
     *         <dd>
     *         <p>
     *         Unit: SECONDS
     *         </p>
     *         </dd>
     *         <dt>SLOTS_ACTIVE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>SLOTS_AVAILABLE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     */

    public java.util.List<CurrentMetric> getCurrentMetrics() {
        return currentMetrics;
    }

    /**
     * <p>
     * The metrics to retrieve. Specify the name and unit for each metric. The following metrics are available:
     * </p>
     * <dl>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CONTACT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * </dd>
     * <dt>SLOTS_ACTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>SLOTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * </dl>
     * 
     * @param currentMetrics
     *        The metrics to retrieve. Specify the name and unit for each metric. The following metrics are
     *        available:</p>
     *        <dl>
     *        <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_AVAILABLE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_ERROR</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_NON_PRODUCTIVE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_ON_CALL</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_ON_CONTACT</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_ONLINE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_STAFFED</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>CONTACTS_IN_QUEUE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>CONTACTS_SCHEDULED</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>OLDEST_CONTACT_AGE</dt>
     *        <dd>
     *        <p>
     *        Unit: SECONDS
     *        </p>
     *        </dd>
     *        <dt>SLOTS_ACTIVE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>SLOTS_AVAILABLE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     */

    public void setCurrentMetrics(java.util.Collection<CurrentMetric> currentMetrics) {
        if (currentMetrics == null) {
            this.currentMetrics = null;
            return;
        }

        this.currentMetrics = new java.util.ArrayList<CurrentMetric>(currentMetrics);
    }

    /**
     * <p>
     * The metrics to retrieve. Specify the name and unit for each metric. The following metrics are available:
     * </p>
     * <dl>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CONTACT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * </dd>
     * <dt>SLOTS_ACTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>SLOTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCurrentMetrics(java.util.Collection)} or {@link #withCurrentMetrics(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param currentMetrics
     *        The metrics to retrieve. Specify the name and unit for each metric. The following metrics are
     *        available:</p>
     *        <dl>
     *        <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_AVAILABLE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_ERROR</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_NON_PRODUCTIVE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_ON_CALL</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_ON_CONTACT</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_ONLINE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_STAFFED</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>CONTACTS_IN_QUEUE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>CONTACTS_SCHEDULED</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>OLDEST_CONTACT_AGE</dt>
     *        <dd>
     *        <p>
     *        Unit: SECONDS
     *        </p>
     *        </dd>
     *        <dt>SLOTS_ACTIVE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>SLOTS_AVAILABLE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentMetricDataRequest withCurrentMetrics(CurrentMetric... currentMetrics) {
        if (this.currentMetrics == null) {
            setCurrentMetrics(new java.util.ArrayList<CurrentMetric>(currentMetrics.length));
        }
        for (CurrentMetric ele : currentMetrics) {
            this.currentMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metrics to retrieve. Specify the name and unit for each metric. The following metrics are available:
     * </p>
     * <dl>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CONTACT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * </dd>
     * <dt>SLOTS_ACTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>SLOTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * </dl>
     * 
     * @param currentMetrics
     *        The metrics to retrieve. Specify the name and unit for each metric. The following metrics are
     *        available:</p>
     *        <dl>
     *        <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_AVAILABLE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_ERROR</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_NON_PRODUCTIVE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_ON_CALL</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_ON_CONTACT</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_ONLINE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>AGENTS_STAFFED</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>CONTACTS_IN_QUEUE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>CONTACTS_SCHEDULED</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>OLDEST_CONTACT_AGE</dt>
     *        <dd>
     *        <p>
     *        Unit: SECONDS
     *        </p>
     *        </dd>
     *        <dt>SLOTS_ACTIVE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     *        <dt>SLOTS_AVAILABLE</dt>
     *        <dd>
     *        <p>
     *        Unit: COUNT
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentMetricDataRequest withCurrentMetrics(java.util.Collection<CurrentMetric> currentMetrics) {
        setCurrentMetrics(currentMetrics);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use
     * the same request parameters as the request that generated the token.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.</p>
     *        <p>
     *        The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must
     *        use the same request parameters as the request that generated the token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use
     * the same request parameters as the request that generated the token.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.</p>
     *         <p>
     *         The token expires after 5 minutes from the time it is created. Subsequent requests that use the token
     *         must use the same request parameters as the request that generated the token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use
     * the same request parameters as the request that generated the token.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.</p>
     *        <p>
     *        The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must
     *        use the same request parameters as the request that generated the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentMetricDataRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximimum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximimum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximimum number of results to return per page.
     * </p>
     * 
     * @return The maximimum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximimum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximimum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentMetricDataRequest withMaxResults(Integer maxResults) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getGroupings() != null)
            sb.append("Groupings: ").append(getGroupings()).append(",");
        if (getCurrentMetrics() != null)
            sb.append("CurrentMetrics: ").append(getCurrentMetrics()).append(",");
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

        if (obj instanceof GetCurrentMetricDataRequest == false)
            return false;
        GetCurrentMetricDataRequest other = (GetCurrentMetricDataRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getGroupings() == null ^ this.getGroupings() == null)
            return false;
        if (other.getGroupings() != null && other.getGroupings().equals(this.getGroupings()) == false)
            return false;
        if (other.getCurrentMetrics() == null ^ this.getCurrentMetrics() == null)
            return false;
        if (other.getCurrentMetrics() != null && other.getCurrentMetrics().equals(this.getCurrentMetrics()) == false)
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getGroupings() == null) ? 0 : getGroupings().hashCode());
        hashCode = prime * hashCode + ((getCurrentMetrics() == null) ? 0 : getCurrentMetrics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetCurrentMetricDataRequest clone() {
        return (GetCurrentMetricDataRequest) super.clone();
    }

}
