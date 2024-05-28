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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutInsightSelectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutInsightSelectorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the CloudTrail trail for which you want to change or add Insights selectors.
     * </p>
     * <p>
     * You cannot use this parameter with the <code>EventDataStore</code> and <code>InsightsDestination</code>
     * parameters.
     * </p>
     */
    private String trailName;
    /**
     * <p>
     * A JSON string that contains the Insights types you want to log on a trail or event data store.
     * <code>ApiCallRateInsight</code> and <code>ApiErrorRateInsight</code> are valid Insight types.
     * </p>
     * <p>
     * The <code>ApiCallRateInsight</code> Insights type analyzes write-only management API calls that are aggregated
     * per minute against a baseline API call volume.
     * </p>
     * <p>
     * The <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes. The
     * error is shown if the API call is unsuccessful.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InsightSelector> insightSelectors;
    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the source event data store for which you want to change or add Insights
     * selectors. To enable Insights on an event data store, you must provide both the <code>EventDataStore</code> and
     * <code>InsightsDestination</code> parameters.
     * </p>
     * <p>
     * You cannot use this parameter with the <code>TrailName</code> parameter.
     * </p>
     */
    private String eventDataStore;
    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights events. To enable
     * Insights on an event data store, you must provide both the <code>EventDataStore</code> and
     * <code>InsightsDestination</code> parameters.
     * </p>
     * <p>
     * You cannot use this parameter with the <code>TrailName</code> parameter.
     * </p>
     */
    private String insightsDestination;

    /**
     * <p>
     * The name of the CloudTrail trail for which you want to change or add Insights selectors.
     * </p>
     * <p>
     * You cannot use this parameter with the <code>EventDataStore</code> and <code>InsightsDestination</code>
     * parameters.
     * </p>
     * 
     * @param trailName
     *        The name of the CloudTrail trail for which you want to change or add Insights selectors.</p>
     *        <p>
     *        You cannot use this parameter with the <code>EventDataStore</code> and <code>InsightsDestination</code>
     *        parameters.
     */

    public void setTrailName(String trailName) {
        this.trailName = trailName;
    }

    /**
     * <p>
     * The name of the CloudTrail trail for which you want to change or add Insights selectors.
     * </p>
     * <p>
     * You cannot use this parameter with the <code>EventDataStore</code> and <code>InsightsDestination</code>
     * parameters.
     * </p>
     * 
     * @return The name of the CloudTrail trail for which you want to change or add Insights selectors.</p>
     *         <p>
     *         You cannot use this parameter with the <code>EventDataStore</code> and <code>InsightsDestination</code>
     *         parameters.
     */

    public String getTrailName() {
        return this.trailName;
    }

    /**
     * <p>
     * The name of the CloudTrail trail for which you want to change or add Insights selectors.
     * </p>
     * <p>
     * You cannot use this parameter with the <code>EventDataStore</code> and <code>InsightsDestination</code>
     * parameters.
     * </p>
     * 
     * @param trailName
     *        The name of the CloudTrail trail for which you want to change or add Insights selectors.</p>
     *        <p>
     *        You cannot use this parameter with the <code>EventDataStore</code> and <code>InsightsDestination</code>
     *        parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightSelectorsRequest withTrailName(String trailName) {
        setTrailName(trailName);
        return this;
    }

    /**
     * <p>
     * A JSON string that contains the Insights types you want to log on a trail or event data store.
     * <code>ApiCallRateInsight</code> and <code>ApiErrorRateInsight</code> are valid Insight types.
     * </p>
     * <p>
     * The <code>ApiCallRateInsight</code> Insights type analyzes write-only management API calls that are aggregated
     * per minute against a baseline API call volume.
     * </p>
     * <p>
     * The <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes. The
     * error is shown if the API call is unsuccessful.
     * </p>
     * 
     * @return A JSON string that contains the Insights types you want to log on a trail or event data store.
     *         <code>ApiCallRateInsight</code> and <code>ApiErrorRateInsight</code> are valid Insight types.</p>
     *         <p>
     *         The <code>ApiCallRateInsight</code> Insights type analyzes write-only management API calls that are
     *         aggregated per minute against a baseline API call volume.
     *         </p>
     *         <p>
     *         The <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error
     *         codes. The error is shown if the API call is unsuccessful.
     */

    public java.util.List<InsightSelector> getInsightSelectors() {
        if (insightSelectors == null) {
            insightSelectors = new com.amazonaws.internal.SdkInternalList<InsightSelector>();
        }
        return insightSelectors;
    }

    /**
     * <p>
     * A JSON string that contains the Insights types you want to log on a trail or event data store.
     * <code>ApiCallRateInsight</code> and <code>ApiErrorRateInsight</code> are valid Insight types.
     * </p>
     * <p>
     * The <code>ApiCallRateInsight</code> Insights type analyzes write-only management API calls that are aggregated
     * per minute against a baseline API call volume.
     * </p>
     * <p>
     * The <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes. The
     * error is shown if the API call is unsuccessful.
     * </p>
     * 
     * @param insightSelectors
     *        A JSON string that contains the Insights types you want to log on a trail or event data store.
     *        <code>ApiCallRateInsight</code> and <code>ApiErrorRateInsight</code> are valid Insight types.</p>
     *        <p>
     *        The <code>ApiCallRateInsight</code> Insights type analyzes write-only management API calls that are
     *        aggregated per minute against a baseline API call volume.
     *        </p>
     *        <p>
     *        The <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error
     *        codes. The error is shown if the API call is unsuccessful.
     */

    public void setInsightSelectors(java.util.Collection<InsightSelector> insightSelectors) {
        if (insightSelectors == null) {
            this.insightSelectors = null;
            return;
        }

        this.insightSelectors = new com.amazonaws.internal.SdkInternalList<InsightSelector>(insightSelectors);
    }

    /**
     * <p>
     * A JSON string that contains the Insights types you want to log on a trail or event data store.
     * <code>ApiCallRateInsight</code> and <code>ApiErrorRateInsight</code> are valid Insight types.
     * </p>
     * <p>
     * The <code>ApiCallRateInsight</code> Insights type analyzes write-only management API calls that are aggregated
     * per minute against a baseline API call volume.
     * </p>
     * <p>
     * The <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes. The
     * error is shown if the API call is unsuccessful.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsightSelectors(java.util.Collection)} or {@link #withInsightSelectors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param insightSelectors
     *        A JSON string that contains the Insights types you want to log on a trail or event data store.
     *        <code>ApiCallRateInsight</code> and <code>ApiErrorRateInsight</code> are valid Insight types.</p>
     *        <p>
     *        The <code>ApiCallRateInsight</code> Insights type analyzes write-only management API calls that are
     *        aggregated per minute against a baseline API call volume.
     *        </p>
     *        <p>
     *        The <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error
     *        codes. The error is shown if the API call is unsuccessful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightSelectorsRequest withInsightSelectors(InsightSelector... insightSelectors) {
        if (this.insightSelectors == null) {
            setInsightSelectors(new com.amazonaws.internal.SdkInternalList<InsightSelector>(insightSelectors.length));
        }
        for (InsightSelector ele : insightSelectors) {
            this.insightSelectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON string that contains the Insights types you want to log on a trail or event data store.
     * <code>ApiCallRateInsight</code> and <code>ApiErrorRateInsight</code> are valid Insight types.
     * </p>
     * <p>
     * The <code>ApiCallRateInsight</code> Insights type analyzes write-only management API calls that are aggregated
     * per minute against a baseline API call volume.
     * </p>
     * <p>
     * The <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes. The
     * error is shown if the API call is unsuccessful.
     * </p>
     * 
     * @param insightSelectors
     *        A JSON string that contains the Insights types you want to log on a trail or event data store.
     *        <code>ApiCallRateInsight</code> and <code>ApiErrorRateInsight</code> are valid Insight types.</p>
     *        <p>
     *        The <code>ApiCallRateInsight</code> Insights type analyzes write-only management API calls that are
     *        aggregated per minute against a baseline API call volume.
     *        </p>
     *        <p>
     *        The <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error
     *        codes. The error is shown if the API call is unsuccessful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightSelectorsRequest withInsightSelectors(java.util.Collection<InsightSelector> insightSelectors) {
        setInsightSelectors(insightSelectors);
        return this;
    }

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the source event data store for which you want to change or add Insights
     * selectors. To enable Insights on an event data store, you must provide both the <code>EventDataStore</code> and
     * <code>InsightsDestination</code> parameters.
     * </p>
     * <p>
     * You cannot use this parameter with the <code>TrailName</code> parameter.
     * </p>
     * 
     * @param eventDataStore
     *        The ARN (or ID suffix of the ARN) of the source event data store for which you want to change or add
     *        Insights selectors. To enable Insights on an event data store, you must provide both the
     *        <code>EventDataStore</code> and <code>InsightsDestination</code> parameters.</p>
     *        <p>
     *        You cannot use this parameter with the <code>TrailName</code> parameter.
     */

    public void setEventDataStore(String eventDataStore) {
        this.eventDataStore = eventDataStore;
    }

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the source event data store for which you want to change or add Insights
     * selectors. To enable Insights on an event data store, you must provide both the <code>EventDataStore</code> and
     * <code>InsightsDestination</code> parameters.
     * </p>
     * <p>
     * You cannot use this parameter with the <code>TrailName</code> parameter.
     * </p>
     * 
     * @return The ARN (or ID suffix of the ARN) of the source event data store for which you want to change or add
     *         Insights selectors. To enable Insights on an event data store, you must provide both the
     *         <code>EventDataStore</code> and <code>InsightsDestination</code> parameters.</p>
     *         <p>
     *         You cannot use this parameter with the <code>TrailName</code> parameter.
     */

    public String getEventDataStore() {
        return this.eventDataStore;
    }

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the source event data store for which you want to change or add Insights
     * selectors. To enable Insights on an event data store, you must provide both the <code>EventDataStore</code> and
     * <code>InsightsDestination</code> parameters.
     * </p>
     * <p>
     * You cannot use this parameter with the <code>TrailName</code> parameter.
     * </p>
     * 
     * @param eventDataStore
     *        The ARN (or ID suffix of the ARN) of the source event data store for which you want to change or add
     *        Insights selectors. To enable Insights on an event data store, you must provide both the
     *        <code>EventDataStore</code> and <code>InsightsDestination</code> parameters.</p>
     *        <p>
     *        You cannot use this parameter with the <code>TrailName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightSelectorsRequest withEventDataStore(String eventDataStore) {
        setEventDataStore(eventDataStore);
        return this;
    }

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights events. To enable
     * Insights on an event data store, you must provide both the <code>EventDataStore</code> and
     * <code>InsightsDestination</code> parameters.
     * </p>
     * <p>
     * You cannot use this parameter with the <code>TrailName</code> parameter.
     * </p>
     * 
     * @param insightsDestination
     *        The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights events. To enable
     *        Insights on an event data store, you must provide both the <code>EventDataStore</code> and
     *        <code>InsightsDestination</code> parameters. </p>
     *        <p>
     *        You cannot use this parameter with the <code>TrailName</code> parameter.
     */

    public void setInsightsDestination(String insightsDestination) {
        this.insightsDestination = insightsDestination;
    }

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights events. To enable
     * Insights on an event data store, you must provide both the <code>EventDataStore</code> and
     * <code>InsightsDestination</code> parameters.
     * </p>
     * <p>
     * You cannot use this parameter with the <code>TrailName</code> parameter.
     * </p>
     * 
     * @return The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights events. To
     *         enable Insights on an event data store, you must provide both the <code>EventDataStore</code> and
     *         <code>InsightsDestination</code> parameters. </p>
     *         <p>
     *         You cannot use this parameter with the <code>TrailName</code> parameter.
     */

    public String getInsightsDestination() {
        return this.insightsDestination;
    }

    /**
     * <p>
     * The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights events. To enable
     * Insights on an event data store, you must provide both the <code>EventDataStore</code> and
     * <code>InsightsDestination</code> parameters.
     * </p>
     * <p>
     * You cannot use this parameter with the <code>TrailName</code> parameter.
     * </p>
     * 
     * @param insightsDestination
     *        The ARN (or ID suffix of the ARN) of the destination event data store that logs Insights events. To enable
     *        Insights on an event data store, you must provide both the <code>EventDataStore</code> and
     *        <code>InsightsDestination</code> parameters. </p>
     *        <p>
     *        You cannot use this parameter with the <code>TrailName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightSelectorsRequest withInsightsDestination(String insightsDestination) {
        setInsightsDestination(insightsDestination);
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
        if (getTrailName() != null)
            sb.append("TrailName: ").append(getTrailName()).append(",");
        if (getInsightSelectors() != null)
            sb.append("InsightSelectors: ").append(getInsightSelectors()).append(",");
        if (getEventDataStore() != null)
            sb.append("EventDataStore: ").append(getEventDataStore()).append(",");
        if (getInsightsDestination() != null)
            sb.append("InsightsDestination: ").append(getInsightsDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutInsightSelectorsRequest == false)
            return false;
        PutInsightSelectorsRequest other = (PutInsightSelectorsRequest) obj;
        if (other.getTrailName() == null ^ this.getTrailName() == null)
            return false;
        if (other.getTrailName() != null && other.getTrailName().equals(this.getTrailName()) == false)
            return false;
        if (other.getInsightSelectors() == null ^ this.getInsightSelectors() == null)
            return false;
        if (other.getInsightSelectors() != null && other.getInsightSelectors().equals(this.getInsightSelectors()) == false)
            return false;
        if (other.getEventDataStore() == null ^ this.getEventDataStore() == null)
            return false;
        if (other.getEventDataStore() != null && other.getEventDataStore().equals(this.getEventDataStore()) == false)
            return false;
        if (other.getInsightsDestination() == null ^ this.getInsightsDestination() == null)
            return false;
        if (other.getInsightsDestination() != null && other.getInsightsDestination().equals(this.getInsightsDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrailName() == null) ? 0 : getTrailName().hashCode());
        hashCode = prime * hashCode + ((getInsightSelectors() == null) ? 0 : getInsightSelectors().hashCode());
        hashCode = prime * hashCode + ((getEventDataStore() == null) ? 0 : getEventDataStore().hashCode());
        hashCode = prime * hashCode + ((getInsightsDestination() == null) ? 0 : getInsightsDestination().hashCode());
        return hashCode;
    }

    @Override
    public PutInsightSelectorsRequest clone() {
        return (PutInsightSelectorsRequest) super.clone();
    }

}
