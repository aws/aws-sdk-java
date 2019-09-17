/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.monitoring;



/**
 * Base class contains a collection of data that describes a specific Api Call event that occurs during the execution of SDK logic
 */
public abstract class ApiMonitoringEvent implements MonitoringEvent {

    protected String api;
    protected String service;
    protected String clientId;
    protected Long timestamp;
    protected Integer version;
    protected String region;
    protected String userAgent;

    /**
     * @return the operation name for the api call being made.
     */
    public String getApi() {
        return api;
    }

    /**
     * @return The service against which the call is being made.
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the service against which the call is being made.
     *
     * @param service The new service value.
     * @return This object for method chaining.
     */
    public abstract ApiMonitoringEvent withService(String service);

    /**
     * @return The "ClientId" configuration value as obtained from an application configuration provider chain
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the clientId
     *
     * @param clientId The new clientId value.
     * @return This object for method chaining.
     */
    public abstract ApiMonitoringEvent withClientId(String clientId);

    /**
     * @return Contains the elapsed time, in milliseconds, since January 1st, 1970, for the time point at which the event
     * occurred.
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the timestamp, in milliseconds, since January 1st, 1970, for the time point at which the event.
     *
     * @param timestamp The new timestamp value.
     * @return This object for method chaining.
     */
    public abstract ApiMonitoringEvent withTimestamp(Long timestamp);

    /**
     * Sets the api
     *
     * @param api The new api value.
     * @return This object for method chaining.
     */
    public abstract ApiMonitoringEvent withApi(String api);

    /**
     * @return the version.
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version the new version value.
     * @return This object for method chaining.
     */
    public abstract ApiMonitoringEvent withVersion(Integer version);

    /**
     * @return the signing region used by the service client to perform the
     * request's attempt(s).  For requests that end up making attempts to more than
     * one region due to redirection, the region used on the final attempt must be
     * used as the Region value for the overall Api Call event.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the region
     *
     * @param region The new region value.
     * @return This object for method chaining.
     */
    public abstract ApiMonitoringEvent withRegion(String region);

    /**
     * @return The full value of the SDK's default user agent header for http requests.
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the userAgent
     *
     * @param userAgent The new userAgent value.
     * @return This object for method chaining.
     */
    public abstract ApiMonitoringEvent withUserAgent(String userAgent);

    /**
     * @return the type of the event
     */
    public abstract String getType();
}
