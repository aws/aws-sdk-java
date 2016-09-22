/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about the request to get health check status for a health check.
 * </p>
 */
public class GetHealthCheckStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a health
     * check is passing, include the <code>HealthCheckId</code> element and specify the ID of the applicable health
     * check.
     * </p>
     * <p>
     * Amazon Route 53 determines whether a resource record set is healthy by periodically sending a request to the
     * endpoint that is specified in the health check. If that endpoint returns an HTTP status code of 2xx or 3xx, the
     * endpoint is healthy. If the endpoint returns an HTTP status code of 400 or greater, or if the endpoint doesn't
     * respond for a certain amount of time, Amazon Route 53 considers the endpoint unhealthy and also considers the
     * resource record set unhealthy.
     * </p>
     * <p>
     * The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or more
     * resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in part on the
     * status of a health check. Configuring health checks only makes sense in the following configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're checking the health of the resource record sets in a weighted, latency, geolocation, or failover resource
     * record set, and you specify health check IDs for all of the resource record sets. If the health check for one
     * resource record set specifies an endpoint that is not healthy, Amazon Route 53 stops responding to queries using
     * the value for that resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You set <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record sets in an alias, weighted
     * alias, latency alias, geolocation alias, or failover alias resource record set, and you specify health check IDs
     * for all of the resource record sets that are referenced by the alias resource record sets. For more information
     * about this configuration, see <code>EvaluateTargetHealth</code>.
     * </p>
     * <p>
     * Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for example, the
     * endpoint specified by the IP address in the <code>Value</code> element. When you add a <code>HealthCheckId</code>
     * element to a resource record set, Amazon Route 53 checks the health of the endpoint that you specified in the
     * health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource record
     * set for the larger, associated geographic region. For example, suppose you have resource record sets for a state
     * in the United States, for the United States, for North America, and for all locations. If the endpoint for the
     * state resource record set is unhealthy, Amazon Route 53 checks the resource record sets for the United States,
     * for North America, and for all locations (a resource record set for which the value of CountryCode is
     * <code>*</code>), in that order, until it finds a resource record set for which the endpoint is healthy.
     * </p>
     * <p>
     * If your health checks specify the endpoint only by domain name, we recommend that you create a separate health
     * check for each endpoint. For example, create a health check for each HTTP server that is serving content for
     * www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain name of the server
     * (such as <code>us-east-1-www.example.com</code>), not the name of the resource record sets (example.com).
     * </p>
     * <important>
     * <p>
     * In this configuration, if you create a health check for which the value of <code>FullyQualifiedDomainName</code>
     * matches the name of the resource record sets and then associate the health check with those resource record sets,
     * health check results will be unpredictable.
     * </p>
     * </important>
     */
    private String healthCheckId;

    /**
     * <p>
     * If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a health
     * check is passing, include the <code>HealthCheckId</code> element and specify the ID of the applicable health
     * check.
     * </p>
     * <p>
     * Amazon Route 53 determines whether a resource record set is healthy by periodically sending a request to the
     * endpoint that is specified in the health check. If that endpoint returns an HTTP status code of 2xx or 3xx, the
     * endpoint is healthy. If the endpoint returns an HTTP status code of 400 or greater, or if the endpoint doesn't
     * respond for a certain amount of time, Amazon Route 53 considers the endpoint unhealthy and also considers the
     * resource record set unhealthy.
     * </p>
     * <p>
     * The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or more
     * resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in part on the
     * status of a health check. Configuring health checks only makes sense in the following configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're checking the health of the resource record sets in a weighted, latency, geolocation, or failover resource
     * record set, and you specify health check IDs for all of the resource record sets. If the health check for one
     * resource record set specifies an endpoint that is not healthy, Amazon Route 53 stops responding to queries using
     * the value for that resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You set <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record sets in an alias, weighted
     * alias, latency alias, geolocation alias, or failover alias resource record set, and you specify health check IDs
     * for all of the resource record sets that are referenced by the alias resource record sets. For more information
     * about this configuration, see <code>EvaluateTargetHealth</code>.
     * </p>
     * <p>
     * Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for example, the
     * endpoint specified by the IP address in the <code>Value</code> element. When you add a <code>HealthCheckId</code>
     * element to a resource record set, Amazon Route 53 checks the health of the endpoint that you specified in the
     * health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource record
     * set for the larger, associated geographic region. For example, suppose you have resource record sets for a state
     * in the United States, for the United States, for North America, and for all locations. If the endpoint for the
     * state resource record set is unhealthy, Amazon Route 53 checks the resource record sets for the United States,
     * for North America, and for all locations (a resource record set for which the value of CountryCode is
     * <code>*</code>), in that order, until it finds a resource record set for which the endpoint is healthy.
     * </p>
     * <p>
     * If your health checks specify the endpoint only by domain name, we recommend that you create a separate health
     * check for each endpoint. For example, create a health check for each HTTP server that is serving content for
     * www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain name of the server
     * (such as <code>us-east-1-www.example.com</code>), not the name of the resource record sets (example.com).
     * </p>
     * <important>
     * <p>
     * In this configuration, if you create a health check for which the value of <code>FullyQualifiedDomainName</code>
     * matches the name of the resource record sets and then associate the health check with those resource record sets,
     * health check results will be unpredictable.
     * </p>
     * </important>
     * 
     * @param healthCheckId
     *        If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a
     *        health check is passing, include the <code>HealthCheckId</code> element and specify the ID of the
     *        applicable health check.</p>
     *        <p>
     *        Amazon Route 53 determines whether a resource record set is healthy by periodically sending a request to
     *        the endpoint that is specified in the health check. If that endpoint returns an HTTP status code of 2xx or
     *        3xx, the endpoint is healthy. If the endpoint returns an HTTP status code of 400 or greater, or if the
     *        endpoint doesn't respond for a certain amount of time, Amazon Route 53 considers the endpoint unhealthy
     *        and also considers the resource record set unhealthy.
     *        </p>
     *        <p>
     *        The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or more
     *        resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in part on
     *        the status of a health check. Configuring health checks only makes sense in the following configurations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You're checking the health of the resource record sets in a weighted, latency, geolocation, or failover
     *        resource record set, and you specify health check IDs for all of the resource record sets. If the health
     *        check for one resource record set specifies an endpoint that is not healthy, Amazon Route 53 stops
     *        responding to queries using the value for that resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You set <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record sets in an alias,
     *        weighted alias, latency alias, geolocation alias, or failover alias resource record set, and you specify
     *        health check IDs for all of the resource record sets that are referenced by the alias resource record
     *        sets. For more information about this configuration, see <code>EvaluateTargetHealth</code>.
     *        </p>
     *        <p>
     *        Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for
     *        example, the endpoint specified by the IP address in the <code>Value</code> element. When you add a
     *        <code>HealthCheckId</code> element to a resource record set, Amazon Route 53 checks the health of the
     *        endpoint that you specified in the health check.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource
     *        record set for the larger, associated geographic region. For example, suppose you have resource record
     *        sets for a state in the United States, for the United States, for North America, and for all locations. If
     *        the endpoint for the state resource record set is unhealthy, Amazon Route 53 checks the resource record
     *        sets for the United States, for North America, and for all locations (a resource record set for which the
     *        value of CountryCode is <code>*</code>), in that order, until it finds a resource record set for which the
     *        endpoint is healthy.
     *        </p>
     *        <p>
     *        If your health checks specify the endpoint only by domain name, we recommend that you create a separate
     *        health check for each endpoint. For example, create a health check for each HTTP server that is serving
     *        content for www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain
     *        name of the server (such as <code>us-east-1-www.example.com</code>), not the name of the resource record
     *        sets (example.com).
     *        </p>
     *        <important>
     *        <p>
     *        In this configuration, if you create a health check for which the value of
     *        <code>FullyQualifiedDomainName</code> matches the name of the resource record sets and then associate the
     *        health check with those resource record sets, health check results will be unpredictable.
     *        </p>
     */

    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    /**
     * <p>
     * If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a health
     * check is passing, include the <code>HealthCheckId</code> element and specify the ID of the applicable health
     * check.
     * </p>
     * <p>
     * Amazon Route 53 determines whether a resource record set is healthy by periodically sending a request to the
     * endpoint that is specified in the health check. If that endpoint returns an HTTP status code of 2xx or 3xx, the
     * endpoint is healthy. If the endpoint returns an HTTP status code of 400 or greater, or if the endpoint doesn't
     * respond for a certain amount of time, Amazon Route 53 considers the endpoint unhealthy and also considers the
     * resource record set unhealthy.
     * </p>
     * <p>
     * The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or more
     * resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in part on the
     * status of a health check. Configuring health checks only makes sense in the following configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're checking the health of the resource record sets in a weighted, latency, geolocation, or failover resource
     * record set, and you specify health check IDs for all of the resource record sets. If the health check for one
     * resource record set specifies an endpoint that is not healthy, Amazon Route 53 stops responding to queries using
     * the value for that resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You set <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record sets in an alias, weighted
     * alias, latency alias, geolocation alias, or failover alias resource record set, and you specify health check IDs
     * for all of the resource record sets that are referenced by the alias resource record sets. For more information
     * about this configuration, see <code>EvaluateTargetHealth</code>.
     * </p>
     * <p>
     * Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for example, the
     * endpoint specified by the IP address in the <code>Value</code> element. When you add a <code>HealthCheckId</code>
     * element to a resource record set, Amazon Route 53 checks the health of the endpoint that you specified in the
     * health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource record
     * set for the larger, associated geographic region. For example, suppose you have resource record sets for a state
     * in the United States, for the United States, for North America, and for all locations. If the endpoint for the
     * state resource record set is unhealthy, Amazon Route 53 checks the resource record sets for the United States,
     * for North America, and for all locations (a resource record set for which the value of CountryCode is
     * <code>*</code>), in that order, until it finds a resource record set for which the endpoint is healthy.
     * </p>
     * <p>
     * If your health checks specify the endpoint only by domain name, we recommend that you create a separate health
     * check for each endpoint. For example, create a health check for each HTTP server that is serving content for
     * www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain name of the server
     * (such as <code>us-east-1-www.example.com</code>), not the name of the resource record sets (example.com).
     * </p>
     * <important>
     * <p>
     * In this configuration, if you create a health check for which the value of <code>FullyQualifiedDomainName</code>
     * matches the name of the resource record sets and then associate the health check with those resource record sets,
     * health check results will be unpredictable.
     * </p>
     * </important>
     * 
     * @return If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a
     *         health check is passing, include the <code>HealthCheckId</code> element and specify the ID of the
     *         applicable health check.</p>
     *         <p>
     *         Amazon Route 53 determines whether a resource record set is healthy by periodically sending a request to
     *         the endpoint that is specified in the health check. If that endpoint returns an HTTP status code of 2xx
     *         or 3xx, the endpoint is healthy. If the endpoint returns an HTTP status code of 400 or greater, or if the
     *         endpoint doesn't respond for a certain amount of time, Amazon Route 53 considers the endpoint unhealthy
     *         and also considers the resource record set unhealthy.
     *         </p>
     *         <p>
     *         The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or
     *         more resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in
     *         part on the status of a health check. Configuring health checks only makes sense in the following
     *         configurations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You're checking the health of the resource record sets in a weighted, latency, geolocation, or failover
     *         resource record set, and you specify health check IDs for all of the resource record sets. If the health
     *         check for one resource record set specifies an endpoint that is not healthy, Amazon Route 53 stops
     *         responding to queries using the value for that resource record set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You set <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record sets in an alias,
     *         weighted alias, latency alias, geolocation alias, or failover alias resource record set, and you specify
     *         health check IDs for all of the resource record sets that are referenced by the alias resource record
     *         sets. For more information about this configuration, see <code>EvaluateTargetHealth</code>.
     *         </p>
     *         <p>
     *         Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for
     *         example, the endpoint specified by the IP address in the <code>Value</code> element. When you add a
     *         <code>HealthCheckId</code> element to a resource record set, Amazon Route 53 checks the health of the
     *         endpoint that you specified in the health check.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource
     *         record set for the larger, associated geographic region. For example, suppose you have resource record
     *         sets for a state in the United States, for the United States, for North America, and for all locations.
     *         If the endpoint for the state resource record set is unhealthy, Amazon Route 53 checks the resource
     *         record sets for the United States, for North America, and for all locations (a resource record set for
     *         which the value of CountryCode is <code>*</code>), in that order, until it finds a resource record set
     *         for which the endpoint is healthy.
     *         </p>
     *         <p>
     *         If your health checks specify the endpoint only by domain name, we recommend that you create a separate
     *         health check for each endpoint. For example, create a health check for each HTTP server that is serving
     *         content for www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain
     *         name of the server (such as <code>us-east-1-www.example.com</code>), not the name of the resource record
     *         sets (example.com).
     *         </p>
     *         <important>
     *         <p>
     *         In this configuration, if you create a health check for which the value of
     *         <code>FullyQualifiedDomainName</code> matches the name of the resource record sets and then associate the
     *         health check with those resource record sets, health check results will be unpredictable.
     *         </p>
     */

    public String getHealthCheckId() {
        return this.healthCheckId;
    }

    /**
     * <p>
     * If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a health
     * check is passing, include the <code>HealthCheckId</code> element and specify the ID of the applicable health
     * check.
     * </p>
     * <p>
     * Amazon Route 53 determines whether a resource record set is healthy by periodically sending a request to the
     * endpoint that is specified in the health check. If that endpoint returns an HTTP status code of 2xx or 3xx, the
     * endpoint is healthy. If the endpoint returns an HTTP status code of 400 or greater, or if the endpoint doesn't
     * respond for a certain amount of time, Amazon Route 53 considers the endpoint unhealthy and also considers the
     * resource record set unhealthy.
     * </p>
     * <p>
     * The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or more
     * resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in part on the
     * status of a health check. Configuring health checks only makes sense in the following configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're checking the health of the resource record sets in a weighted, latency, geolocation, or failover resource
     * record set, and you specify health check IDs for all of the resource record sets. If the health check for one
     * resource record set specifies an endpoint that is not healthy, Amazon Route 53 stops responding to queries using
     * the value for that resource record set.
     * </p>
     * </li>
     * <li>
     * <p>
     * You set <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record sets in an alias, weighted
     * alias, latency alias, geolocation alias, or failover alias resource record set, and you specify health check IDs
     * for all of the resource record sets that are referenced by the alias resource record sets. For more information
     * about this configuration, see <code>EvaluateTargetHealth</code>.
     * </p>
     * <p>
     * Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for example, the
     * endpoint specified by the IP address in the <code>Value</code> element. When you add a <code>HealthCheckId</code>
     * element to a resource record set, Amazon Route 53 checks the health of the endpoint that you specified in the
     * health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource record
     * set for the larger, associated geographic region. For example, suppose you have resource record sets for a state
     * in the United States, for the United States, for North America, and for all locations. If the endpoint for the
     * state resource record set is unhealthy, Amazon Route 53 checks the resource record sets for the United States,
     * for North America, and for all locations (a resource record set for which the value of CountryCode is
     * <code>*</code>), in that order, until it finds a resource record set for which the endpoint is healthy.
     * </p>
     * <p>
     * If your health checks specify the endpoint only by domain name, we recommend that you create a separate health
     * check for each endpoint. For example, create a health check for each HTTP server that is serving content for
     * www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain name of the server
     * (such as <code>us-east-1-www.example.com</code>), not the name of the resource record sets (example.com).
     * </p>
     * <important>
     * <p>
     * In this configuration, if you create a health check for which the value of <code>FullyQualifiedDomainName</code>
     * matches the name of the resource record sets and then associate the health check with those resource record sets,
     * health check results will be unpredictable.
     * </p>
     * </important>
     * 
     * @param healthCheckId
     *        If you want Amazon Route 53 to return this resource record set in response to a DNS query only when a
     *        health check is passing, include the <code>HealthCheckId</code> element and specify the ID of the
     *        applicable health check.</p>
     *        <p>
     *        Amazon Route 53 determines whether a resource record set is healthy by periodically sending a request to
     *        the endpoint that is specified in the health check. If that endpoint returns an HTTP status code of 2xx or
     *        3xx, the endpoint is healthy. If the endpoint returns an HTTP status code of 400 or greater, or if the
     *        endpoint doesn't respond for a certain amount of time, Amazon Route 53 considers the endpoint unhealthy
     *        and also considers the resource record set unhealthy.
     *        </p>
     *        <p>
     *        The <code>HealthCheckId</code> element is only useful when Amazon Route 53 is choosing between two or more
     *        resource record sets to respond to a DNS query, and you want Amazon Route 53 to base the choice in part on
     *        the status of a health check. Configuring health checks only makes sense in the following configurations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You're checking the health of the resource record sets in a weighted, latency, geolocation, or failover
     *        resource record set, and you specify health check IDs for all of the resource record sets. If the health
     *        check for one resource record set specifies an endpoint that is not healthy, Amazon Route 53 stops
     *        responding to queries using the value for that resource record set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You set <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record sets in an alias,
     *        weighted alias, latency alias, geolocation alias, or failover alias resource record set, and you specify
     *        health check IDs for all of the resource record sets that are referenced by the alias resource record
     *        sets. For more information about this configuration, see <code>EvaluateTargetHealth</code>.
     *        </p>
     *        <p>
     *        Amazon Route 53 doesn't check the health of the endpoint specified in the resource record set, for
     *        example, the endpoint specified by the IP address in the <code>Value</code> element. When you add a
     *        <code>HealthCheckId</code> element to a resource record set, Amazon Route 53 checks the health of the
     *        endpoint that you specified in the health check.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For geolocation resource record sets, if an endpoint is unhealthy, Amazon Route 53 looks for a resource
     *        record set for the larger, associated geographic region. For example, suppose you have resource record
     *        sets for a state in the United States, for the United States, for North America, and for all locations. If
     *        the endpoint for the state resource record set is unhealthy, Amazon Route 53 checks the resource record
     *        sets for the United States, for North America, and for all locations (a resource record set for which the
     *        value of CountryCode is <code>*</code>), in that order, until it finds a resource record set for which the
     *        endpoint is healthy.
     *        </p>
     *        <p>
     *        If your health checks specify the endpoint only by domain name, we recommend that you create a separate
     *        health check for each endpoint. For example, create a health check for each HTTP server that is serving
     *        content for www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain
     *        name of the server (such as <code>us-east-1-www.example.com</code>), not the name of the resource record
     *        sets (example.com).
     *        </p>
     *        <important>
     *        <p>
     *        In this configuration, if you create a health check for which the value of
     *        <code>FullyQualifiedDomainName</code> matches the name of the resource record sets and then associate the
     *        health check with those resource record sets, health check results will be unpredictable.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthCheckStatusRequest withHealthCheckId(String healthCheckId) {
        setHealthCheckId(healthCheckId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHealthCheckId() != null)
            sb.append("HealthCheckId: " + getHealthCheckId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHealthCheckStatusRequest == false)
            return false;
        GetHealthCheckStatusRequest other = (GetHealthCheckStatusRequest) obj;
        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null)
            return false;
        if (other.getHealthCheckId() != null && other.getHealthCheckId().equals(this.getHealthCheckId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthCheckId() == null) ? 0 : getHealthCheckId().hashCode());
        return hashCode;
    }

    @Override
    public GetHealthCheckStatusRequest clone() {
        return (GetHealthCheckStatusRequest) super.clone();
    }
}
