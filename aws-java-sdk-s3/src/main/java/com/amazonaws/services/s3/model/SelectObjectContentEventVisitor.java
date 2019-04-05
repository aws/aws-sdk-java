/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.model.SelectObjectContentEvent.ContinuationEvent;
import com.amazonaws.services.s3.model.SelectObjectContentEvent.EndEvent;
import com.amazonaws.services.s3.model.SelectObjectContentEvent.ProgressEvent;
import com.amazonaws.services.s3.model.SelectObjectContentEvent.StatsEvent;
import com.amazonaws.services.s3.model.SelectObjectContentEvent.RecordsEvent;

/**
 * A method for applying logic to an unknown type of {@link SelectObjectContentEvent} without needing to perform "instanceof"
 * checks and casting.
 *
 * A visitor can be applied to an entire event stream with
 * {@link SelectObjectContentEventStream#visitAllEvents(SelectObjectContentEventVisitor)} or to an individual event with
 * {@link SelectObjectContentEvent#visit(SelectObjectContentEventVisitor)}.
 */
public abstract class SelectObjectContentEventVisitor {
    /**
     * Invoked when a {@link RecordsEvent} is encountered. If this is not overridden, the event will be given to
     * {@link #visitDefault(SelectObjectContentEvent)}.
     */
    public void visit(RecordsEvent event) {
        visitDefault(event);
    }

    /**
     * Invoked when a {@link ContinuationEvent} is encountered. If this is not overridden, the event will be given to
     * {@link #visitDefault(SelectObjectContentEvent)}.
     */
    public void visit(ContinuationEvent event) {
        visitDefault(event);
    }

    /**
     * Invoked when a {@link ProgressEvent} is encountered. If this is not overridden, the event will be given to
     * {@link #visitDefault(SelectObjectContentEvent)}.
     */
    public void visit(ProgressEvent event) {
        visitDefault(event);
    }

    /**
     * Invoked when a {@link StatsEvent} is encountered. If this is not overridden, the event will be given to
     * {@link #visitDefault(SelectObjectContentEvent)}.
     */
    public void visit(StatsEvent event) {
        visitDefault(event);
    }

    /**
     * Invoked when a {@link EndEvent} is encountered. If this is not overridden, the event will be given to
     * {@link #visitDefault(SelectObjectContentEvent)}.
     */
    public void visit(EndEvent event) {
        visitDefault(event);
    }

    /**
     * A required "else" or "default" block, invoked with no other more-specific "visit" method is appropriate. This is
     * invoked under two circumstances:
     * <ol>
     *     <li>The event encountered is newer than the current version of the SDK, so no other more-specific "visit" method
     *     could be called. In this case, the provided event will be a generic {@link SelectObjectContentEvent}. These events
     *     can be processed by upgrading the SDK.</li>
     *     <li>The event is known by the SDK, but the "visit" was not overridden above. In this case, the provided event will
     *     be a specific type of {@link SelectObjectContentEvent}.</li>
     * </ol>
     *
     * @param selectEvent The event that was not handled by a more-specific "visit" method.
     */
    public void visitDefault(SelectObjectContentEvent selectEvent) {
    }
}
