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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The settings object that specifies whether evidence finder is enabled. This object also describes the related event
 * data store, and the backfill status for populating the event data store with evidence data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/EvidenceFinderEnablement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvidenceFinderEnablement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudTrail Lake event data store that’s used by evidence finder. The event
     * data store is the lake of evidence data that evidence finder runs queries against.
     * </p>
     */
    private String eventDataStoreArn;
    /**
     * <p>
     * The current status of the evidence finder feature and the related event data store.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE_IN_PROGRESS</code> means that you requested to enable evidence finder. An event data store is
     * currently being created to support evidence finder queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> means that an event data store was successfully created and evidence finder is enabled. We
     * recommend that you wait 7 days until the event data store is backfilled with your past two years’ worth of
     * evidence data. You can use evidence finder in the meantime, but not all data might be available until the
     * backfill is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE_IN_PROGRESS</code> means that you requested to disable evidence finder, and your request is pending
     * the deletion of the event data store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> means that you have permanently disabled evidence finder and the event data store has been
     * deleted. You can't re-enable evidence finder after this point.
     * </p>
     * </li>
     * </ul>
     */
    private String enablementStatus;
    /**
     * <p>
     * The current status of the evidence data backfill process.
     * </p>
     * <p>
     * The backfill starts after you enable evidence finder. During this task, Audit Manager populates an event data
     * store with your past two years’ worth of evidence data so that your evidence can be queried.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> means that the backfill hasn’t started yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means that the backfill is in progress. This can take up to 7 days to complete,
     * depending on the amount of evidence data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> means that the backfill is complete. All of your past evidence is now queryable.
     * </p>
     * </li>
     * </ul>
     */
    private String backfillStatus;
    /**
     * <p>
     * Represents any errors that occurred when enabling or disabling evidence finder.
     * </p>
     */
    private String error;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudTrail Lake event data store that’s used by evidence finder. The event
     * data store is the lake of evidence data that evidence finder runs queries against.
     * </p>
     * 
     * @param eventDataStoreArn
     *        The Amazon Resource Name (ARN) of the CloudTrail Lake event data store that’s used by evidence finder. The
     *        event data store is the lake of evidence data that evidence finder runs queries against.
     */

    public void setEventDataStoreArn(String eventDataStoreArn) {
        this.eventDataStoreArn = eventDataStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudTrail Lake event data store that’s used by evidence finder. The event
     * data store is the lake of evidence data that evidence finder runs queries against.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CloudTrail Lake event data store that’s used by evidence finder.
     *         The event data store is the lake of evidence data that evidence finder runs queries against.
     */

    public String getEventDataStoreArn() {
        return this.eventDataStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudTrail Lake event data store that’s used by evidence finder. The event
     * data store is the lake of evidence data that evidence finder runs queries against.
     * </p>
     * 
     * @param eventDataStoreArn
     *        The Amazon Resource Name (ARN) of the CloudTrail Lake event data store that’s used by evidence finder. The
     *        event data store is the lake of evidence data that evidence finder runs queries against.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvidenceFinderEnablement withEventDataStoreArn(String eventDataStoreArn) {
        setEventDataStoreArn(eventDataStoreArn);
        return this;
    }

    /**
     * <p>
     * The current status of the evidence finder feature and the related event data store.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE_IN_PROGRESS</code> means that you requested to enable evidence finder. An event data store is
     * currently being created to support evidence finder queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> means that an event data store was successfully created and evidence finder is enabled. We
     * recommend that you wait 7 days until the event data store is backfilled with your past two years’ worth of
     * evidence data. You can use evidence finder in the meantime, but not all data might be available until the
     * backfill is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE_IN_PROGRESS</code> means that you requested to disable evidence finder, and your request is pending
     * the deletion of the event data store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> means that you have permanently disabled evidence finder and the event data store has been
     * deleted. You can't re-enable evidence finder after this point.
     * </p>
     * </li>
     * </ul>
     * 
     * @param enablementStatus
     *        The current status of the evidence finder feature and the related event data store. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLE_IN_PROGRESS</code> means that you requested to enable evidence finder. An event data store is
     *        currently being created to support evidence finder queries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> means that an event data store was successfully created and evidence finder is
     *        enabled. We recommend that you wait 7 days until the event data store is backfilled with your past two
     *        years’ worth of evidence data. You can use evidence finder in the meantime, but not all data might be
     *        available until the backfill is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLE_IN_PROGRESS</code> means that you requested to disable evidence finder, and your request is
     *        pending the deletion of the event data store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> means that you have permanently disabled evidence finder and the event data store
     *        has been deleted. You can't re-enable evidence finder after this point.
     *        </p>
     *        </li>
     * @see EvidenceFinderEnablementStatus
     */

    public void setEnablementStatus(String enablementStatus) {
        this.enablementStatus = enablementStatus;
    }

    /**
     * <p>
     * The current status of the evidence finder feature and the related event data store.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE_IN_PROGRESS</code> means that you requested to enable evidence finder. An event data store is
     * currently being created to support evidence finder queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> means that an event data store was successfully created and evidence finder is enabled. We
     * recommend that you wait 7 days until the event data store is backfilled with your past two years’ worth of
     * evidence data. You can use evidence finder in the meantime, but not all data might be available until the
     * backfill is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE_IN_PROGRESS</code> means that you requested to disable evidence finder, and your request is pending
     * the deletion of the event data store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> means that you have permanently disabled evidence finder and the event data store has been
     * deleted. You can't re-enable evidence finder after this point.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the evidence finder feature and the related event data store. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLE_IN_PROGRESS</code> means that you requested to enable evidence finder. An event data store
     *         is currently being created to support evidence finder queries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> means that an event data store was successfully created and evidence finder is
     *         enabled. We recommend that you wait 7 days until the event data store is backfilled with your past two
     *         years’ worth of evidence data. You can use evidence finder in the meantime, but not all data might be
     *         available until the backfill is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLE_IN_PROGRESS</code> means that you requested to disable evidence finder, and your request is
     *         pending the deletion of the event data store.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> means that you have permanently disabled evidence finder and the event data store
     *         has been deleted. You can't re-enable evidence finder after this point.
     *         </p>
     *         </li>
     * @see EvidenceFinderEnablementStatus
     */

    public String getEnablementStatus() {
        return this.enablementStatus;
    }

    /**
     * <p>
     * The current status of the evidence finder feature and the related event data store.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE_IN_PROGRESS</code> means that you requested to enable evidence finder. An event data store is
     * currently being created to support evidence finder queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> means that an event data store was successfully created and evidence finder is enabled. We
     * recommend that you wait 7 days until the event data store is backfilled with your past two years’ worth of
     * evidence data. You can use evidence finder in the meantime, but not all data might be available until the
     * backfill is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE_IN_PROGRESS</code> means that you requested to disable evidence finder, and your request is pending
     * the deletion of the event data store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> means that you have permanently disabled evidence finder and the event data store has been
     * deleted. You can't re-enable evidence finder after this point.
     * </p>
     * </li>
     * </ul>
     * 
     * @param enablementStatus
     *        The current status of the evidence finder feature and the related event data store. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLE_IN_PROGRESS</code> means that you requested to enable evidence finder. An event data store is
     *        currently being created to support evidence finder queries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> means that an event data store was successfully created and evidence finder is
     *        enabled. We recommend that you wait 7 days until the event data store is backfilled with your past two
     *        years’ worth of evidence data. You can use evidence finder in the meantime, but not all data might be
     *        available until the backfill is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLE_IN_PROGRESS</code> means that you requested to disable evidence finder, and your request is
     *        pending the deletion of the event data store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> means that you have permanently disabled evidence finder and the event data store
     *        has been deleted. You can't re-enable evidence finder after this point.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvidenceFinderEnablementStatus
     */

    public EvidenceFinderEnablement withEnablementStatus(String enablementStatus) {
        setEnablementStatus(enablementStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the evidence finder feature and the related event data store.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE_IN_PROGRESS</code> means that you requested to enable evidence finder. An event data store is
     * currently being created to support evidence finder queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> means that an event data store was successfully created and evidence finder is enabled. We
     * recommend that you wait 7 days until the event data store is backfilled with your past two years’ worth of
     * evidence data. You can use evidence finder in the meantime, but not all data might be available until the
     * backfill is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE_IN_PROGRESS</code> means that you requested to disable evidence finder, and your request is pending
     * the deletion of the event data store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> means that you have permanently disabled evidence finder and the event data store has been
     * deleted. You can't re-enable evidence finder after this point.
     * </p>
     * </li>
     * </ul>
     * 
     * @param enablementStatus
     *        The current status of the evidence finder feature and the related event data store. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLE_IN_PROGRESS</code> means that you requested to enable evidence finder. An event data store is
     *        currently being created to support evidence finder queries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> means that an event data store was successfully created and evidence finder is
     *        enabled. We recommend that you wait 7 days until the event data store is backfilled with your past two
     *        years’ worth of evidence data. You can use evidence finder in the meantime, but not all data might be
     *        available until the backfill is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLE_IN_PROGRESS</code> means that you requested to disable evidence finder, and your request is
     *        pending the deletion of the event data store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> means that you have permanently disabled evidence finder and the event data store
     *        has been deleted. You can't re-enable evidence finder after this point.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvidenceFinderEnablementStatus
     */

    public EvidenceFinderEnablement withEnablementStatus(EvidenceFinderEnablementStatus enablementStatus) {
        this.enablementStatus = enablementStatus.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the evidence data backfill process.
     * </p>
     * <p>
     * The backfill starts after you enable evidence finder. During this task, Audit Manager populates an event data
     * store with your past two years’ worth of evidence data so that your evidence can be queried.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> means that the backfill hasn’t started yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means that the backfill is in progress. This can take up to 7 days to complete,
     * depending on the amount of evidence data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> means that the backfill is complete. All of your past evidence is now queryable.
     * </p>
     * </li>
     * </ul>
     * 
     * @param backfillStatus
     *        The current status of the evidence data backfill process. </p>
     *        <p>
     *        The backfill starts after you enable evidence finder. During this task, Audit Manager populates an event
     *        data store with your past two years’ worth of evidence data so that your evidence can be queried.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOT_STARTED</code> means that the backfill hasn’t started yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> means that the backfill is in progress. This can take up to 7 days to complete,
     *        depending on the amount of evidence data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> means that the backfill is complete. All of your past evidence is now queryable.
     *        </p>
     *        </li>
     * @see EvidenceFinderBackfillStatus
     */

    public void setBackfillStatus(String backfillStatus) {
        this.backfillStatus = backfillStatus;
    }

    /**
     * <p>
     * The current status of the evidence data backfill process.
     * </p>
     * <p>
     * The backfill starts after you enable evidence finder. During this task, Audit Manager populates an event data
     * store with your past two years’ worth of evidence data so that your evidence can be queried.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> means that the backfill hasn’t started yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means that the backfill is in progress. This can take up to 7 days to complete,
     * depending on the amount of evidence data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> means that the backfill is complete. All of your past evidence is now queryable.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the evidence data backfill process. </p>
     *         <p>
     *         The backfill starts after you enable evidence finder. During this task, Audit Manager populates an event
     *         data store with your past two years’ worth of evidence data so that your evidence can be queried.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NOT_STARTED</code> means that the backfill hasn’t started yet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> means that the backfill is in progress. This can take up to 7 days to complete,
     *         depending on the amount of evidence data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code> means that the backfill is complete. All of your past evidence is now queryable.
     *         </p>
     *         </li>
     * @see EvidenceFinderBackfillStatus
     */

    public String getBackfillStatus() {
        return this.backfillStatus;
    }

    /**
     * <p>
     * The current status of the evidence data backfill process.
     * </p>
     * <p>
     * The backfill starts after you enable evidence finder. During this task, Audit Manager populates an event data
     * store with your past two years’ worth of evidence data so that your evidence can be queried.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> means that the backfill hasn’t started yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means that the backfill is in progress. This can take up to 7 days to complete,
     * depending on the amount of evidence data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> means that the backfill is complete. All of your past evidence is now queryable.
     * </p>
     * </li>
     * </ul>
     * 
     * @param backfillStatus
     *        The current status of the evidence data backfill process. </p>
     *        <p>
     *        The backfill starts after you enable evidence finder. During this task, Audit Manager populates an event
     *        data store with your past two years’ worth of evidence data so that your evidence can be queried.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOT_STARTED</code> means that the backfill hasn’t started yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> means that the backfill is in progress. This can take up to 7 days to complete,
     *        depending on the amount of evidence data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> means that the backfill is complete. All of your past evidence is now queryable.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvidenceFinderBackfillStatus
     */

    public EvidenceFinderEnablement withBackfillStatus(String backfillStatus) {
        setBackfillStatus(backfillStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the evidence data backfill process.
     * </p>
     * <p>
     * The backfill starts after you enable evidence finder. During this task, Audit Manager populates an event data
     * store with your past two years’ worth of evidence data so that your evidence can be queried.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> means that the backfill hasn’t started yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means that the backfill is in progress. This can take up to 7 days to complete,
     * depending on the amount of evidence data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> means that the backfill is complete. All of your past evidence is now queryable.
     * </p>
     * </li>
     * </ul>
     * 
     * @param backfillStatus
     *        The current status of the evidence data backfill process. </p>
     *        <p>
     *        The backfill starts after you enable evidence finder. During this task, Audit Manager populates an event
     *        data store with your past two years’ worth of evidence data so that your evidence can be queried.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOT_STARTED</code> means that the backfill hasn’t started yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> means that the backfill is in progress. This can take up to 7 days to complete,
     *        depending on the amount of evidence data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> means that the backfill is complete. All of your past evidence is now queryable.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvidenceFinderBackfillStatus
     */

    public EvidenceFinderEnablement withBackfillStatus(EvidenceFinderBackfillStatus backfillStatus) {
        this.backfillStatus = backfillStatus.toString();
        return this;
    }

    /**
     * <p>
     * Represents any errors that occurred when enabling or disabling evidence finder.
     * </p>
     * 
     * @param error
     *        Represents any errors that occurred when enabling or disabling evidence finder.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * Represents any errors that occurred when enabling or disabling evidence finder.
     * </p>
     * 
     * @return Represents any errors that occurred when enabling or disabling evidence finder.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * Represents any errors that occurred when enabling or disabling evidence finder.
     * </p>
     * 
     * @param error
     *        Represents any errors that occurred when enabling or disabling evidence finder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvidenceFinderEnablement withError(String error) {
        setError(error);
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
        if (getEventDataStoreArn() != null)
            sb.append("EventDataStoreArn: ").append(getEventDataStoreArn()).append(",");
        if (getEnablementStatus() != null)
            sb.append("EnablementStatus: ").append(getEnablementStatus()).append(",");
        if (getBackfillStatus() != null)
            sb.append("BackfillStatus: ").append(getBackfillStatus()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvidenceFinderEnablement == false)
            return false;
        EvidenceFinderEnablement other = (EvidenceFinderEnablement) obj;
        if (other.getEventDataStoreArn() == null ^ this.getEventDataStoreArn() == null)
            return false;
        if (other.getEventDataStoreArn() != null && other.getEventDataStoreArn().equals(this.getEventDataStoreArn()) == false)
            return false;
        if (other.getEnablementStatus() == null ^ this.getEnablementStatus() == null)
            return false;
        if (other.getEnablementStatus() != null && other.getEnablementStatus().equals(this.getEnablementStatus()) == false)
            return false;
        if (other.getBackfillStatus() == null ^ this.getBackfillStatus() == null)
            return false;
        if (other.getBackfillStatus() != null && other.getBackfillStatus().equals(this.getBackfillStatus()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventDataStoreArn() == null) ? 0 : getEventDataStoreArn().hashCode());
        hashCode = prime * hashCode + ((getEnablementStatus() == null) ? 0 : getEnablementStatus().hashCode());
        hashCode = prime * hashCode + ((getBackfillStatus() == null) ? 0 : getBackfillStatus().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public EvidenceFinderEnablement clone() {
        try {
            return (EvidenceFinderEnablement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.EvidenceFinderEnablementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
