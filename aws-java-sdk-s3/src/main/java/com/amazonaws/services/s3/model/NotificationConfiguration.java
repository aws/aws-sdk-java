/*
 * Copyright 2014-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * An abstract class for all the notification configurations associated with an
 * Amazon S3 bucket.
 */
public abstract class NotificationConfiguration {

    /**
     * Set of events for a notification configuration.
     */
    private Set<String> events;

    /**
     * A collection of Amazon S3 Object prefixes associated with this
     * notification configuration.
     */
    private List<String> objectPrefixes;

    /**
     * Creates a NotificationConfiguration with empty events and prefixes.
     */
    protected NotificationConfiguration() {
        this.events = new HashSet<String>();
        this.objectPrefixes = new ArrayList<String>();
    }

    /**
     * Creates a notification configuration with the given set of events.
     *
     * @param events
     *            the list of events for the notification configuration.
     */
    protected NotificationConfiguration(EnumSet<S3Event> events) {
        this.events = new HashSet<String>();
        this.objectPrefixes = new ArrayList<String>();

        if (events != null) {
            for (S3Event s3Event : events) {
                this.events.add(s3Event.toString());
            }
        }
    }

    /**
     * Creates a notification configuration with the given set of events.
     *
     * @param events
     *            the list of events for the notification configuration.
     */
    protected NotificationConfiguration(String... events) {
        this.events = new HashSet<String>();
        this.objectPrefixes = new ArrayList<String>();

        if (events != null) {
            for (String event : events) {
                this.events.add(event);
            }
        }
    }

    /**
     * Returns the set of events associated with this notification
     * configuration.
     */
    public Set<String> getEvents() {
        return events;
    }

    /**
     * Sets the given events in this {@link NotificationConfiguration} object.
     *
     * @param events
     *            the set of events for the notification configuration.
     */
    public void setEvents(Set<String> events) {
        this.events = events;
    }

    /**
     * Retuns the list of Amazon S3 object prefixes for this notification
     * configuration.
     */
    public List<String> getObjectPrefixes() {
        return objectPrefixes;
    }

    /**
     * Sets the given prefixes in this {@link NotificationConfiguration} object.
     *
     * @param objectPrefixes
     *            the list of prefixes for the notification configuration.
     */
    public void setObjectPrefixes(List<String> objectPrefixes) {
        this.objectPrefixes = objectPrefixes;
    }

    /**
     * Sets the given events in this {@link NotificationConfiguration} object
     * and returns this object.
     *
     * @param events
     *            the set of events for the notification configuration.
     */
    public NotificationConfiguration withEvents(Set<String> events) {
        this.events.clear();
        this.events.addAll(events);
        return this;
    }

    /**
     * Sets the given prefixes in this {@link NotificationConfiguration} object
     * and returns this object.
     *
     * @param objectPrefixes
     *            the list of prefixes for the notification configuration.
     */
    public NotificationConfiguration withObjectPrefixes(
            String... objectPrefixes) {
        this.objectPrefixes.clear();
        if (objectPrefixes != null && objectPrefixes.length > 0)
            this.objectPrefixes.addAll(Arrays.asList(objectPrefixes));
        return this;
    }

    /**
     * Adds the given event to the set of events for this
     * {@link NotificationConfiguration} object.
     *
     * @param event
     *            the event to add to this notification configuration
     */
    public void addEvent(String event) {
        this.events.add(event);
    }

    /**
     * Adds the given event to the set of events for this
     * {@link NotificationConfiguration} object.
     *
     * @param event
     *            the event to add to this notification configuration
     */
    public void addEvent(S3Event event) {
        this.events.add(event.toString());
    }

    /**
     * Adds the given prefix to the list of prefix for this
     * {@link NotificationConfiguration} object.
     *
     * @param prefix
     *            the prefix to add to this notification configuration
     */
    public void addObjectPrefix(String prefix) {
        this.objectPrefixes.add(prefix);
    }
}
