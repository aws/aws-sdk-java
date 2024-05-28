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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of events that changed the specified finding during the specified time period. Each record represents a single
 * finding change event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/FindingHistoryRecord" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingHistoryRecord implements Serializable, Cloneable, StructuredPojo {

    private AwsSecurityFindingIdentifier findingIdentifier;
    /**
     * <p>
     * A timestamp that indicates when Security Hub processed the updated finding record.
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
    private java.util.Date updateTime;
    /**
     * <p>
     * Identifies whether the event marks the creation of a new finding. A value of <code>True</code> means that the
     * finding is newly created. A value of <code>False</code> means that the finding isn’t newly created.
     * </p>
     */
    private Boolean findingCreated;
    /**
     * <p>
     * Identifies the source of the event that changed the finding. For example, an integrated Amazon Web Service or
     * third-party partner integration may call <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     * <code>BatchImportFindings</code> </a>, or an Security Hub customer may call <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     * <code>BatchUpdateFindings</code> </a>.
     * </p>
     */
    private FindingHistoryUpdateSource updateSource;
    /**
     * <p>
     * An array of objects that provides details about the finding change event, including the Amazon Web Services
     * Security Finding Format (ASFF) field that changed, the value of the field before the change, and the value of the
     * field after the change.
     * </p>
     */
    private java.util.List<FindingHistoryUpdate> updates;
    /**
     * <p>
     * A token for pagination purposes. Provide this token in the subsequent request to <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_GetFindingsHistory.html">
     * <code>GetFindingsHistory</code> </a> to get up to an additional 100 results of history for the same finding that
     * you specified in your initial request.
     * </p>
     */
    private String nextToken;

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

    public FindingHistoryRecord withFindingIdentifier(AwsSecurityFindingIdentifier findingIdentifier) {
        setFindingIdentifier(findingIdentifier);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when Security Hub processed the updated finding record.
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
     * @param updateTime
     *        A timestamp that indicates when Security Hub processed the updated finding record.</p>
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

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * A timestamp that indicates when Security Hub processed the updated finding record.
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
     * @return A timestamp that indicates when Security Hub processed the updated finding record.</p>
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

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * A timestamp that indicates when Security Hub processed the updated finding record.
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
     * @param updateTime
     *        A timestamp that indicates when Security Hub processed the updated finding record.</p>
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

    public FindingHistoryRecord withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * Identifies whether the event marks the creation of a new finding. A value of <code>True</code> means that the
     * finding is newly created. A value of <code>False</code> means that the finding isn’t newly created.
     * </p>
     * 
     * @param findingCreated
     *        Identifies whether the event marks the creation of a new finding. A value of <code>True</code> means that
     *        the finding is newly created. A value of <code>False</code> means that the finding isn’t newly created.
     */

    public void setFindingCreated(Boolean findingCreated) {
        this.findingCreated = findingCreated;
    }

    /**
     * <p>
     * Identifies whether the event marks the creation of a new finding. A value of <code>True</code> means that the
     * finding is newly created. A value of <code>False</code> means that the finding isn’t newly created.
     * </p>
     * 
     * @return Identifies whether the event marks the creation of a new finding. A value of <code>True</code> means that
     *         the finding is newly created. A value of <code>False</code> means that the finding isn’t newly created.
     */

    public Boolean getFindingCreated() {
        return this.findingCreated;
    }

    /**
     * <p>
     * Identifies whether the event marks the creation of a new finding. A value of <code>True</code> means that the
     * finding is newly created. A value of <code>False</code> means that the finding isn’t newly created.
     * </p>
     * 
     * @param findingCreated
     *        Identifies whether the event marks the creation of a new finding. A value of <code>True</code> means that
     *        the finding is newly created. A value of <code>False</code> means that the finding isn’t newly created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingHistoryRecord withFindingCreated(Boolean findingCreated) {
        setFindingCreated(findingCreated);
        return this;
    }

    /**
     * <p>
     * Identifies whether the event marks the creation of a new finding. A value of <code>True</code> means that the
     * finding is newly created. A value of <code>False</code> means that the finding isn’t newly created.
     * </p>
     * 
     * @return Identifies whether the event marks the creation of a new finding. A value of <code>True</code> means that
     *         the finding is newly created. A value of <code>False</code> means that the finding isn’t newly created.
     */

    public Boolean isFindingCreated() {
        return this.findingCreated;
    }

    /**
     * <p>
     * Identifies the source of the event that changed the finding. For example, an integrated Amazon Web Service or
     * third-party partner integration may call <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     * <code>BatchImportFindings</code> </a>, or an Security Hub customer may call <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     * <code>BatchUpdateFindings</code> </a>.
     * </p>
     * 
     * @param updateSource
     *        Identifies the source of the event that changed the finding. For example, an integrated Amazon Web Service
     *        or third-party partner integration may call <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     *        <code>BatchImportFindings</code> </a>, or an Security Hub customer may call <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     *        <code>BatchUpdateFindings</code> </a>.
     */

    public void setUpdateSource(FindingHistoryUpdateSource updateSource) {
        this.updateSource = updateSource;
    }

    /**
     * <p>
     * Identifies the source of the event that changed the finding. For example, an integrated Amazon Web Service or
     * third-party partner integration may call <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     * <code>BatchImportFindings</code> </a>, or an Security Hub customer may call <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     * <code>BatchUpdateFindings</code> </a>.
     * </p>
     * 
     * @return Identifies the source of the event that changed the finding. For example, an integrated Amazon Web
     *         Service or third-party partner integration may call <a
     *         href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     *         <code>BatchImportFindings</code> </a>, or an Security Hub customer may call <a
     *         href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     *         <code>BatchUpdateFindings</code> </a>.
     */

    public FindingHistoryUpdateSource getUpdateSource() {
        return this.updateSource;
    }

    /**
     * <p>
     * Identifies the source of the event that changed the finding. For example, an integrated Amazon Web Service or
     * third-party partner integration may call <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     * <code>BatchImportFindings</code> </a>, or an Security Hub customer may call <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     * <code>BatchUpdateFindings</code> </a>.
     * </p>
     * 
     * @param updateSource
     *        Identifies the source of the event that changed the finding. For example, an integrated Amazon Web Service
     *        or third-party partner integration may call <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     *        <code>BatchImportFindings</code> </a>, or an Security Hub customer may call <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     *        <code>BatchUpdateFindings</code> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingHistoryRecord withUpdateSource(FindingHistoryUpdateSource updateSource) {
        setUpdateSource(updateSource);
        return this;
    }

    /**
     * <p>
     * An array of objects that provides details about the finding change event, including the Amazon Web Services
     * Security Finding Format (ASFF) field that changed, the value of the field before the change, and the value of the
     * field after the change.
     * </p>
     * 
     * @return An array of objects that provides details about the finding change event, including the Amazon Web
     *         Services Security Finding Format (ASFF) field that changed, the value of the field before the change, and
     *         the value of the field after the change.
     */

    public java.util.List<FindingHistoryUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of objects that provides details about the finding change event, including the Amazon Web Services
     * Security Finding Format (ASFF) field that changed, the value of the field before the change, and the value of the
     * field after the change.
     * </p>
     * 
     * @param updates
     *        An array of objects that provides details about the finding change event, including the Amazon Web
     *        Services Security Finding Format (ASFF) field that changed, the value of the field before the change, and
     *        the value of the field after the change.
     */

    public void setUpdates(java.util.Collection<FindingHistoryUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<FindingHistoryUpdate>(updates);
    }

    /**
     * <p>
     * An array of objects that provides details about the finding change event, including the Amazon Web Services
     * Security Finding Format (ASFF) field that changed, the value of the field before the change, and the value of the
     * field after the change.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdates(java.util.Collection)} or {@link #withUpdates(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param updates
     *        An array of objects that provides details about the finding change event, including the Amazon Web
     *        Services Security Finding Format (ASFF) field that changed, the value of the field before the change, and
     *        the value of the field after the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingHistoryRecord withUpdates(FindingHistoryUpdate... updates) {
        if (this.updates == null) {
            setUpdates(new java.util.ArrayList<FindingHistoryUpdate>(updates.length));
        }
        for (FindingHistoryUpdate ele : updates) {
            this.updates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that provides details about the finding change event, including the Amazon Web Services
     * Security Finding Format (ASFF) field that changed, the value of the field before the change, and the value of the
     * field after the change.
     * </p>
     * 
     * @param updates
     *        An array of objects that provides details about the finding change event, including the Amazon Web
     *        Services Security Finding Format (ASFF) field that changed, the value of the field before the change, and
     *        the value of the field after the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingHistoryRecord withUpdates(java.util.Collection<FindingHistoryUpdate> updates) {
        setUpdates(updates);
        return this;
    }

    /**
     * <p>
     * A token for pagination purposes. Provide this token in the subsequent request to <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_GetFindingsHistory.html">
     * <code>GetFindingsHistory</code> </a> to get up to an additional 100 results of history for the same finding that
     * you specified in your initial request.
     * </p>
     * 
     * @param nextToken
     *        A token for pagination purposes. Provide this token in the subsequent request to <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_GetFindingsHistory.html">
     *        <code>GetFindingsHistory</code> </a> to get up to an additional 100 results of history for the same
     *        finding that you specified in your initial request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for pagination purposes. Provide this token in the subsequent request to <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_GetFindingsHistory.html">
     * <code>GetFindingsHistory</code> </a> to get up to an additional 100 results of history for the same finding that
     * you specified in your initial request.
     * </p>
     * 
     * @return A token for pagination purposes. Provide this token in the subsequent request to <a
     *         href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_GetFindingsHistory.html">
     *         <code>GetFindingsHistory</code> </a> to get up to an additional 100 results of history for the same
     *         finding that you specified in your initial request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for pagination purposes. Provide this token in the subsequent request to <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_GetFindingsHistory.html">
     * <code>GetFindingsHistory</code> </a> to get up to an additional 100 results of history for the same finding that
     * you specified in your initial request.
     * </p>
     * 
     * @param nextToken
     *        A token for pagination purposes. Provide this token in the subsequent request to <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_GetFindingsHistory.html">
     *        <code>GetFindingsHistory</code> </a> to get up to an additional 100 results of history for the same
     *        finding that you specified in your initial request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingHistoryRecord withNextToken(String nextToken) {
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
        if (getFindingIdentifier() != null)
            sb.append("FindingIdentifier: ").append(getFindingIdentifier()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getFindingCreated() != null)
            sb.append("FindingCreated: ").append(getFindingCreated()).append(",");
        if (getUpdateSource() != null)
            sb.append("UpdateSource: ").append(getUpdateSource()).append(",");
        if (getUpdates() != null)
            sb.append("Updates: ").append(getUpdates()).append(",");
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

        if (obj instanceof FindingHistoryRecord == false)
            return false;
        FindingHistoryRecord other = (FindingHistoryRecord) obj;
        if (other.getFindingIdentifier() == null ^ this.getFindingIdentifier() == null)
            return false;
        if (other.getFindingIdentifier() != null && other.getFindingIdentifier().equals(this.getFindingIdentifier()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getFindingCreated() == null ^ this.getFindingCreated() == null)
            return false;
        if (other.getFindingCreated() != null && other.getFindingCreated().equals(this.getFindingCreated()) == false)
            return false;
        if (other.getUpdateSource() == null ^ this.getUpdateSource() == null)
            return false;
        if (other.getUpdateSource() != null && other.getUpdateSource().equals(this.getUpdateSource()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
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

        hashCode = prime * hashCode + ((getFindingIdentifier() == null) ? 0 : getFindingIdentifier().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getFindingCreated() == null) ? 0 : getFindingCreated().hashCode());
        hashCode = prime * hashCode + ((getUpdateSource() == null) ? 0 : getUpdateSource().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public FindingHistoryRecord clone() {
        try {
            return (FindingHistoryRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.FindingHistoryRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
