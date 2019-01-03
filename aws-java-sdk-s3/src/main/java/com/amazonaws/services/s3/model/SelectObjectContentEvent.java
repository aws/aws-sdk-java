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

import java.io.Serializable;
import java.nio.ByteBuffer;

public class SelectObjectContentEvent implements Serializable, Cloneable {

    public void visit(SelectObjectContentEventVisitor visitor) {
        visitor.visitDefault(this);
    }

    /**
     * The Record Event.
     */
    public static class RecordsEvent extends SelectObjectContentEvent {
        private ByteBuffer payload;

        /**
         * The byte array of partial, one or more result records.
         */
        public ByteBuffer getPayload() {
            return payload;
        }

        /**
         * The byte array of partial, one or more result records.
         */
        public void setPayload(ByteBuffer payload) {
            this.payload = payload;
        }

        /**
         * The byte array of partial, one or more result records.
         */
        public RecordsEvent withPayload(ByteBuffer payload) {
            setPayload(payload);
            return this;
        }

        @Override
        public void visit(SelectObjectContentEventVisitor visitor) {
            visitor.visit(this);
        }
    }

    /**
     * The Stats Event.
     */
    public static class StatsEvent extends SelectObjectContentEvent {
        private Stats details;

        /**
         * The Stats event details.
         */
        public Stats getDetails() {
            return details;
        }

        /**
         * The Stats event details.
         */
        public void setDetails(Stats details) {
            this.details = details;
        }

        /**
         * The Stats event details.
         */
        public StatsEvent withDetails(Stats details) {
            setDetails(details);
            return this;
        }

        @Override
        public void visit(SelectObjectContentEventVisitor visitor) {
            visitor.visit(this);
        }
    }

    /**
     * The Progress Event.
     */
    public static class ProgressEvent extends SelectObjectContentEvent {
        private Progress details;

        /**
         * The Progress event details.
         */
        public Progress getDetails() {
            return details;
        }

        /**
         * The Progress event details.
         */
        public void setDetails(Progress details) {
            this.details = details;
        }

        /**
         * The Progress event details.
         */
        public ProgressEvent withDetails(Progress details) {
            setDetails(details);
            return this;
        }

        @Override
        public void visit(SelectObjectContentEventVisitor visitor) {
            visitor.visit(this);
        }
    }

    /**
     * The Continuation Event.
     */
    public static class ContinuationEvent extends SelectObjectContentEvent {
        @Override
        public void visit(SelectObjectContentEventVisitor visitor) {
            visitor.visit(this);
        }
    }

    /**
     * The End Event.
     */
    public static class EndEvent extends SelectObjectContentEvent {
        @Override
        public void visit(SelectObjectContentEventVisitor visitor) {
            visitor.visit(this);
        }
    }

    @Override
    public SelectObjectContentEvent clone() {
        try {
            return (SelectObjectContentEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
