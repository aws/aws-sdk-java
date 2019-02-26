/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An abstract class for all the notification configurations associated with an Amazon S3 bucket.
 */
public abstract class NotificationConfiguration {

    /**
     * Set of events for a notification configuration.
     */
    private Set<String> events = new HashSet<String>();

    /**
     * @deprecated This field is not used by S3. It will be removed in the next major version of the
     *             SDK
     */
    @Deprecated
    private List<String> objectPrefixes = new ArrayList<String>();

    private Filter filter;

    /**
     * Creates a NotificationConfiguration with empty events and prefixes.
     */
    protected NotificationConfiguration() {
    }

    /**
     * Creates a notification configuration with the given set of events.
     *
     * @param events
     *            the list of events for the notification configuration.
     */
    protected NotificationConfiguration(EnumSet<S3Event> events) {
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
        if (events != null) {
            for (String event : events) {
                this.events.add(event);
            }
        }
    }

    /**
     * Returns the set of events associated with this notification configuration.
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
     * @deprecated This field is not used by S3. It will be removed in the next major version of the
     *             SDK. See {@link #getFilter()} for the correct way to filter notifications.
     */
    @Deprecated
    public List<String> getObjectPrefixes() {
        return objectPrefixes;
    }

    /**
     * @deprecated This field is not used by S3. It will be removed in the next major version of the
     *             SDK. See {@link #setFilter(Filter)} for the correct way to filter notifications.
     */
    @Deprecated
    public void setObjectPrefixes(List<String> objectPrefixes) {
        this.objectPrefixes = objectPrefixes;
    }

    /**
     * Sets the given events in this {@link NotificationConfiguration} object and returns this
     * object.
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
     * @deprecated This field is not used by S3. It will be removed in the next major version of the
     *             SDK. See {@link #withFilter(Filter)} for the correct way to filter notifications.
     */
    @Deprecated
    public NotificationConfiguration withObjectPrefixes(String... objectPrefixes) {
        this.objectPrefixes.clear();
        if (objectPrefixes != null && objectPrefixes.length > 0)
            this.objectPrefixes.addAll(Arrays.asList(objectPrefixes));
        return this;
    }

    /**
     * Adds the given event to the set of events for this {@link NotificationConfiguration} object.
     *
     * @param event
     *            the event to add to this notification configuration
     */
    public void addEvent(String event) {
        this.events.add(event);
    }

    /**
     * Adds the given event to the set of events for this {@link NotificationConfiguration} object.
     *
     * @param event
     *            the event to add to this notification configuration
     */
    public void addEvent(S3Event event) {
        this.events.add(event.toString());
    }

    /**
     * @deprecated This field is not used by S3. It will be removed in the next major version of the
     *             SDK
     */
    @Deprecated
    public void addObjectPrefix(String prefix) {
        this.objectPrefixes.add(prefix);
    }

    /**
     * Filter criteria for determining which S3 objects trigger event notifications.
     *
     * @return {@link Filter} object associated with this {@link NotificationConfiguration}
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Sets the filter criteria for this {@link NotificationConfiguration}.
     *
     * @param filter
     *            New {@link Filter}
     */
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    /**
     * Sets the filter criteria for this {@link NotificationConfiguration} and returns this object
     * for method chaining.
     *
     * @param filter
     *            New {@link Filter}
     * @return This object for method chaining
     */
    public NotificationConfiguration withFilter(Filter filter) {
        setFilter(filter);
        return this;
    }

}
