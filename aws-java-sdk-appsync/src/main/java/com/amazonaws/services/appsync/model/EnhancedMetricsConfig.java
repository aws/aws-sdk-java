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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Enables and controls the enhanced metrics feature. Enhanced metrics emit granular data on API usage and performance
 * such as AppSync request and error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
 * CloudWatch account, and you can configure the types of data that will be sent.
 * </p>
 * <p>
 * Enhanced metrics can be configured at the resolver, data source, and operation levels.
 * <code>EnhancedMetricsConfig</code> contains three required parameters, each controlling one of these categories:
 * </p>
 * <ol>
 * <li>
 * <p>
 * <code>resolverLevelMetricsBehavior</code>: Controls how resolver metrics will be emitted to CloudWatch. Resolver
 * metrics include:
 * </p>
 * <ul>
 * <li>
 * <p>
 * GraphQL errors: The number of GraphQL errors that occurred.
 * </p>
 * </li>
 * <li>
 * <p>
 * Requests: The number of invocations that occurred during a request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Latency: The time to complete a resolver invocation.
 * </p>
 * </li>
 * <li>
 * <p>
 * Cache hits: The number of cache hits during a request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Cache misses: The number of cache misses during a request.
 * </p>
 * </li>
 * </ul>
 * <p>
 * These metrics can be emitted to CloudWatch per resolver or for all resolvers in the request. Metrics will be recorded
 * by API ID and resolver name. <code>resolverLevelMetricsBehavior</code> accepts one of these values at a time:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>FULL_REQUEST_RESOLVER_METRICS</code>: Records and emits metric data for all resolvers in the request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PER_RESOLVER_METRICS</code>: Records and emits metric data for resolvers that have the
 * <code>metricsConfig</code> value set to <code>ENABLED</code>.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <code>dataSourceLevelMetricsBehavior</code>: Controls how data source metrics will be emitted to CloudWatch. Data
 * source metrics include:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Requests: The number of invocations that occured during a request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Latency: The time to complete a data source invocation.
 * </p>
 * </li>
 * <li>
 * <p>
 * Errors: The number of errors that occurred during a data source invocation.
 * </p>
 * </li>
 * </ul>
 * <p>
 * These metrics can be emitted to CloudWatch per data source or for all data sources in the request. Metrics will be
 * recorded by API ID and data source name. <code>dataSourceLevelMetricsBehavior</code> accepts one of these values at a
 * time:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>FULL_REQUEST_DATA_SOURCE_METRICS</code>: Records and emits metric data for all data sources in the request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PER_DATA_SOURCE_METRICS</code>: Records and emits metric data for data sources that have the
 * <code>metricsConfig</code> value set to <code>ENABLED</code>.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <code>operationLevelMetricsConfig</code>: Controls how operation metrics will be emitted to CloudWatch. Operation
 * metrics include:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Requests: The number of times a specified GraphQL operation was called.
 * </p>
 * </li>
 * <li>
 * <p>
 * GraphQL errors: The number of GraphQL errors that occurred during a specified GraphQL operation.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Metrics will be recorded by API ID and operation name. You can set the value to <code>ENABLED</code> or
 * <code>DISABLED</code>.
 * </p>
 * </li>
 * </ol>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/EnhancedMetricsConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnhancedMetricsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Controls how resolver metrics will be emitted to CloudWatch. Resolver metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GraphQL errors: The number of GraphQL errors that occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * Requests: The number of invocations that occurred during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency: The time to complete a resolver invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache hits: The number of cache hits during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache misses: The number of cache misses during a request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These metrics can be emitted to CloudWatch per resolver or for all resolvers in the request. Metrics will be
     * recorded by API ID and resolver name. <code>resolverLevelMetricsBehavior</code> accepts one of these values at a
     * time:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REQUEST_RESOLVER_METRICS</code>: Records and emits metric data for all resolvers in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PER_RESOLVER_METRICS</code>: Records and emits metric data for resolvers that have the
     * <code>metricsConfig</code> value set to <code>ENABLED</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String resolverLevelMetricsBehavior;
    /**
     * <p>
     * Controls how data source metrics will be emitted to CloudWatch. Data source metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Requests: The number of invocations that occured during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency: The time to complete a data source invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Errors: The number of errors that occurred during a data source invocation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These metrics can be emitted to CloudWatch per data source or for all data sources in the request. Metrics will
     * be recorded by API ID and data source name. <code>dataSourceLevelMetricsBehavior</code> accepts one of these
     * values at a time:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REQUEST_DATA_SOURCE_METRICS</code>: Records and emits metric data for all data sources in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PER_DATA_SOURCE_METRICS</code>: Records and emits metric data for data sources that have the
     * <code>metricsConfig</code> value set to <code>ENABLED</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String dataSourceLevelMetricsBehavior;
    /**
     * <p>
     * Controls how operation metrics will be emitted to CloudWatch. Operation metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Requests: The number of times a specified GraphQL operation was called.
     * </p>
     * </li>
     * <li>
     * <p>
     * GraphQL errors: The number of GraphQL errors that occurred during a specified GraphQL operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Metrics will be recorded by API ID and operation name. You can set the value to <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     */
    private String operationLevelMetricsConfig;

    /**
     * <p>
     * Controls how resolver metrics will be emitted to CloudWatch. Resolver metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GraphQL errors: The number of GraphQL errors that occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * Requests: The number of invocations that occurred during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency: The time to complete a resolver invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache hits: The number of cache hits during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache misses: The number of cache misses during a request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These metrics can be emitted to CloudWatch per resolver or for all resolvers in the request. Metrics will be
     * recorded by API ID and resolver name. <code>resolverLevelMetricsBehavior</code> accepts one of these values at a
     * time:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REQUEST_RESOLVER_METRICS</code>: Records and emits metric data for all resolvers in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PER_RESOLVER_METRICS</code>: Records and emits metric data for resolvers that have the
     * <code>metricsConfig</code> value set to <code>ENABLED</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resolverLevelMetricsBehavior
     *        Controls how resolver metrics will be emitted to CloudWatch. Resolver metrics include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        GraphQL errors: The number of GraphQL errors that occurred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Requests: The number of invocations that occurred during a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Latency: The time to complete a resolver invocation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cache hits: The number of cache hits during a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cache misses: The number of cache misses during a request.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        These metrics can be emitted to CloudWatch per resolver or for all resolvers in the request. Metrics will
     *        be recorded by API ID and resolver name. <code>resolverLevelMetricsBehavior</code> accepts one of these
     *        values at a time:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULL_REQUEST_RESOLVER_METRICS</code>: Records and emits metric data for all resolvers in the
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PER_RESOLVER_METRICS</code>: Records and emits metric data for resolvers that have the
     *        <code>metricsConfig</code> value set to <code>ENABLED</code>.
     *        </p>
     *        </li>
     * @see ResolverLevelMetricsBehavior
     */

    public void setResolverLevelMetricsBehavior(String resolverLevelMetricsBehavior) {
        this.resolverLevelMetricsBehavior = resolverLevelMetricsBehavior;
    }

    /**
     * <p>
     * Controls how resolver metrics will be emitted to CloudWatch. Resolver metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GraphQL errors: The number of GraphQL errors that occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * Requests: The number of invocations that occurred during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency: The time to complete a resolver invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache hits: The number of cache hits during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache misses: The number of cache misses during a request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These metrics can be emitted to CloudWatch per resolver or for all resolvers in the request. Metrics will be
     * recorded by API ID and resolver name. <code>resolverLevelMetricsBehavior</code> accepts one of these values at a
     * time:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REQUEST_RESOLVER_METRICS</code>: Records and emits metric data for all resolvers in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PER_RESOLVER_METRICS</code>: Records and emits metric data for resolvers that have the
     * <code>metricsConfig</code> value set to <code>ENABLED</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Controls how resolver metrics will be emitted to CloudWatch. Resolver metrics include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         GraphQL errors: The number of GraphQL errors that occurred.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests: The number of invocations that occurred during a request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Latency: The time to complete a resolver invocation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cache hits: The number of cache hits during a request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cache misses: The number of cache misses during a request.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         These metrics can be emitted to CloudWatch per resolver or for all resolvers in the request. Metrics will
     *         be recorded by API ID and resolver name. <code>resolverLevelMetricsBehavior</code> accepts one of these
     *         values at a time:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FULL_REQUEST_RESOLVER_METRICS</code>: Records and emits metric data for all resolvers in the
     *         request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PER_RESOLVER_METRICS</code>: Records and emits metric data for resolvers that have the
     *         <code>metricsConfig</code> value set to <code>ENABLED</code>.
     *         </p>
     *         </li>
     * @see ResolverLevelMetricsBehavior
     */

    public String getResolverLevelMetricsBehavior() {
        return this.resolverLevelMetricsBehavior;
    }

    /**
     * <p>
     * Controls how resolver metrics will be emitted to CloudWatch. Resolver metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GraphQL errors: The number of GraphQL errors that occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * Requests: The number of invocations that occurred during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency: The time to complete a resolver invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache hits: The number of cache hits during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache misses: The number of cache misses during a request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These metrics can be emitted to CloudWatch per resolver or for all resolvers in the request. Metrics will be
     * recorded by API ID and resolver name. <code>resolverLevelMetricsBehavior</code> accepts one of these values at a
     * time:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REQUEST_RESOLVER_METRICS</code>: Records and emits metric data for all resolvers in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PER_RESOLVER_METRICS</code>: Records and emits metric data for resolvers that have the
     * <code>metricsConfig</code> value set to <code>ENABLED</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resolverLevelMetricsBehavior
     *        Controls how resolver metrics will be emitted to CloudWatch. Resolver metrics include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        GraphQL errors: The number of GraphQL errors that occurred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Requests: The number of invocations that occurred during a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Latency: The time to complete a resolver invocation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cache hits: The number of cache hits during a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cache misses: The number of cache misses during a request.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        These metrics can be emitted to CloudWatch per resolver or for all resolvers in the request. Metrics will
     *        be recorded by API ID and resolver name. <code>resolverLevelMetricsBehavior</code> accepts one of these
     *        values at a time:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULL_REQUEST_RESOLVER_METRICS</code>: Records and emits metric data for all resolvers in the
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PER_RESOLVER_METRICS</code>: Records and emits metric data for resolvers that have the
     *        <code>metricsConfig</code> value set to <code>ENABLED</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverLevelMetricsBehavior
     */

    public EnhancedMetricsConfig withResolverLevelMetricsBehavior(String resolverLevelMetricsBehavior) {
        setResolverLevelMetricsBehavior(resolverLevelMetricsBehavior);
        return this;
    }

    /**
     * <p>
     * Controls how resolver metrics will be emitted to CloudWatch. Resolver metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GraphQL errors: The number of GraphQL errors that occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * Requests: The number of invocations that occurred during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency: The time to complete a resolver invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache hits: The number of cache hits during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cache misses: The number of cache misses during a request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These metrics can be emitted to CloudWatch per resolver or for all resolvers in the request. Metrics will be
     * recorded by API ID and resolver name. <code>resolverLevelMetricsBehavior</code> accepts one of these values at a
     * time:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REQUEST_RESOLVER_METRICS</code>: Records and emits metric data for all resolvers in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PER_RESOLVER_METRICS</code>: Records and emits metric data for resolvers that have the
     * <code>metricsConfig</code> value set to <code>ENABLED</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resolverLevelMetricsBehavior
     *        Controls how resolver metrics will be emitted to CloudWatch. Resolver metrics include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        GraphQL errors: The number of GraphQL errors that occurred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Requests: The number of invocations that occurred during a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Latency: The time to complete a resolver invocation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cache hits: The number of cache hits during a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cache misses: The number of cache misses during a request.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        These metrics can be emitted to CloudWatch per resolver or for all resolvers in the request. Metrics will
     *        be recorded by API ID and resolver name. <code>resolverLevelMetricsBehavior</code> accepts one of these
     *        values at a time:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULL_REQUEST_RESOLVER_METRICS</code>: Records and emits metric data for all resolvers in the
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PER_RESOLVER_METRICS</code>: Records and emits metric data for resolvers that have the
     *        <code>metricsConfig</code> value set to <code>ENABLED</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverLevelMetricsBehavior
     */

    public EnhancedMetricsConfig withResolverLevelMetricsBehavior(ResolverLevelMetricsBehavior resolverLevelMetricsBehavior) {
        this.resolverLevelMetricsBehavior = resolverLevelMetricsBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Controls how data source metrics will be emitted to CloudWatch. Data source metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Requests: The number of invocations that occured during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency: The time to complete a data source invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Errors: The number of errors that occurred during a data source invocation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These metrics can be emitted to CloudWatch per data source or for all data sources in the request. Metrics will
     * be recorded by API ID and data source name. <code>dataSourceLevelMetricsBehavior</code> accepts one of these
     * values at a time:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REQUEST_DATA_SOURCE_METRICS</code>: Records and emits metric data for all data sources in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PER_DATA_SOURCE_METRICS</code>: Records and emits metric data for data sources that have the
     * <code>metricsConfig</code> value set to <code>ENABLED</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataSourceLevelMetricsBehavior
     *        Controls how data source metrics will be emitted to CloudWatch. Data source metrics include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Requests: The number of invocations that occured during a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Latency: The time to complete a data source invocation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Errors: The number of errors that occurred during a data source invocation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        These metrics can be emitted to CloudWatch per data source or for all data sources in the request. Metrics
     *        will be recorded by API ID and data source name. <code>dataSourceLevelMetricsBehavior</code> accepts one
     *        of these values at a time:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULL_REQUEST_DATA_SOURCE_METRICS</code>: Records and emits metric data for all data sources in the
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PER_DATA_SOURCE_METRICS</code>: Records and emits metric data for data sources that have the
     *        <code>metricsConfig</code> value set to <code>ENABLED</code>.
     *        </p>
     *        </li>
     * @see DataSourceLevelMetricsBehavior
     */

    public void setDataSourceLevelMetricsBehavior(String dataSourceLevelMetricsBehavior) {
        this.dataSourceLevelMetricsBehavior = dataSourceLevelMetricsBehavior;
    }

    /**
     * <p>
     * Controls how data source metrics will be emitted to CloudWatch. Data source metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Requests: The number of invocations that occured during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency: The time to complete a data source invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Errors: The number of errors that occurred during a data source invocation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These metrics can be emitted to CloudWatch per data source or for all data sources in the request. Metrics will
     * be recorded by API ID and data source name. <code>dataSourceLevelMetricsBehavior</code> accepts one of these
     * values at a time:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REQUEST_DATA_SOURCE_METRICS</code>: Records and emits metric data for all data sources in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PER_DATA_SOURCE_METRICS</code>: Records and emits metric data for data sources that have the
     * <code>metricsConfig</code> value set to <code>ENABLED</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Controls how data source metrics will be emitted to CloudWatch. Data source metrics include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Requests: The number of invocations that occured during a request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Latency: The time to complete a data source invocation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Errors: The number of errors that occurred during a data source invocation.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         These metrics can be emitted to CloudWatch per data source or for all data sources in the request.
     *         Metrics will be recorded by API ID and data source name. <code>dataSourceLevelMetricsBehavior</code>
     *         accepts one of these values at a time:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FULL_REQUEST_DATA_SOURCE_METRICS</code>: Records and emits metric data for all data sources in the
     *         request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PER_DATA_SOURCE_METRICS</code>: Records and emits metric data for data sources that have the
     *         <code>metricsConfig</code> value set to <code>ENABLED</code>.
     *         </p>
     *         </li>
     * @see DataSourceLevelMetricsBehavior
     */

    public String getDataSourceLevelMetricsBehavior() {
        return this.dataSourceLevelMetricsBehavior;
    }

    /**
     * <p>
     * Controls how data source metrics will be emitted to CloudWatch. Data source metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Requests: The number of invocations that occured during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency: The time to complete a data source invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Errors: The number of errors that occurred during a data source invocation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These metrics can be emitted to CloudWatch per data source or for all data sources in the request. Metrics will
     * be recorded by API ID and data source name. <code>dataSourceLevelMetricsBehavior</code> accepts one of these
     * values at a time:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REQUEST_DATA_SOURCE_METRICS</code>: Records and emits metric data for all data sources in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PER_DATA_SOURCE_METRICS</code>: Records and emits metric data for data sources that have the
     * <code>metricsConfig</code> value set to <code>ENABLED</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataSourceLevelMetricsBehavior
     *        Controls how data source metrics will be emitted to CloudWatch. Data source metrics include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Requests: The number of invocations that occured during a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Latency: The time to complete a data source invocation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Errors: The number of errors that occurred during a data source invocation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        These metrics can be emitted to CloudWatch per data source or for all data sources in the request. Metrics
     *        will be recorded by API ID and data source name. <code>dataSourceLevelMetricsBehavior</code> accepts one
     *        of these values at a time:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULL_REQUEST_DATA_SOURCE_METRICS</code>: Records and emits metric data for all data sources in the
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PER_DATA_SOURCE_METRICS</code>: Records and emits metric data for data sources that have the
     *        <code>metricsConfig</code> value set to <code>ENABLED</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceLevelMetricsBehavior
     */

    public EnhancedMetricsConfig withDataSourceLevelMetricsBehavior(String dataSourceLevelMetricsBehavior) {
        setDataSourceLevelMetricsBehavior(dataSourceLevelMetricsBehavior);
        return this;
    }

    /**
     * <p>
     * Controls how data source metrics will be emitted to CloudWatch. Data source metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Requests: The number of invocations that occured during a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency: The time to complete a data source invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Errors: The number of errors that occurred during a data source invocation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * These metrics can be emitted to CloudWatch per data source or for all data sources in the request. Metrics will
     * be recorded by API ID and data source name. <code>dataSourceLevelMetricsBehavior</code> accepts one of these
     * values at a time:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REQUEST_DATA_SOURCE_METRICS</code>: Records and emits metric data for all data sources in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PER_DATA_SOURCE_METRICS</code>: Records and emits metric data for data sources that have the
     * <code>metricsConfig</code> value set to <code>ENABLED</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataSourceLevelMetricsBehavior
     *        Controls how data source metrics will be emitted to CloudWatch. Data source metrics include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Requests: The number of invocations that occured during a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Latency: The time to complete a data source invocation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Errors: The number of errors that occurred during a data source invocation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        These metrics can be emitted to CloudWatch per data source or for all data sources in the request. Metrics
     *        will be recorded by API ID and data source name. <code>dataSourceLevelMetricsBehavior</code> accepts one
     *        of these values at a time:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULL_REQUEST_DATA_SOURCE_METRICS</code>: Records and emits metric data for all data sources in the
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PER_DATA_SOURCE_METRICS</code>: Records and emits metric data for data sources that have the
     *        <code>metricsConfig</code> value set to <code>ENABLED</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceLevelMetricsBehavior
     */

    public EnhancedMetricsConfig withDataSourceLevelMetricsBehavior(DataSourceLevelMetricsBehavior dataSourceLevelMetricsBehavior) {
        this.dataSourceLevelMetricsBehavior = dataSourceLevelMetricsBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Controls how operation metrics will be emitted to CloudWatch. Operation metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Requests: The number of times a specified GraphQL operation was called.
     * </p>
     * </li>
     * <li>
     * <p>
     * GraphQL errors: The number of GraphQL errors that occurred during a specified GraphQL operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Metrics will be recorded by API ID and operation name. You can set the value to <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param operationLevelMetricsConfig
     *        Controls how operation metrics will be emitted to CloudWatch. Operation metrics include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Requests: The number of times a specified GraphQL operation was called.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GraphQL errors: The number of GraphQL errors that occurred during a specified GraphQL operation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Metrics will be recorded by API ID and operation name. You can set the value to <code>ENABLED</code> or
     *        <code>DISABLED</code>.
     * @see OperationLevelMetricsConfig
     */

    public void setOperationLevelMetricsConfig(String operationLevelMetricsConfig) {
        this.operationLevelMetricsConfig = operationLevelMetricsConfig;
    }

    /**
     * <p>
     * Controls how operation metrics will be emitted to CloudWatch. Operation metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Requests: The number of times a specified GraphQL operation was called.
     * </p>
     * </li>
     * <li>
     * <p>
     * GraphQL errors: The number of GraphQL errors that occurred during a specified GraphQL operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Metrics will be recorded by API ID and operation name. You can set the value to <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     * 
     * @return Controls how operation metrics will be emitted to CloudWatch. Operation metrics include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Requests: The number of times a specified GraphQL operation was called.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GraphQL errors: The number of GraphQL errors that occurred during a specified GraphQL operation.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Metrics will be recorded by API ID and operation name. You can set the value to <code>ENABLED</code> or
     *         <code>DISABLED</code>.
     * @see OperationLevelMetricsConfig
     */

    public String getOperationLevelMetricsConfig() {
        return this.operationLevelMetricsConfig;
    }

    /**
     * <p>
     * Controls how operation metrics will be emitted to CloudWatch. Operation metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Requests: The number of times a specified GraphQL operation was called.
     * </p>
     * </li>
     * <li>
     * <p>
     * GraphQL errors: The number of GraphQL errors that occurred during a specified GraphQL operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Metrics will be recorded by API ID and operation name. You can set the value to <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param operationLevelMetricsConfig
     *        Controls how operation metrics will be emitted to CloudWatch. Operation metrics include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Requests: The number of times a specified GraphQL operation was called.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GraphQL errors: The number of GraphQL errors that occurred during a specified GraphQL operation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Metrics will be recorded by API ID and operation name. You can set the value to <code>ENABLED</code> or
     *        <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationLevelMetricsConfig
     */

    public EnhancedMetricsConfig withOperationLevelMetricsConfig(String operationLevelMetricsConfig) {
        setOperationLevelMetricsConfig(operationLevelMetricsConfig);
        return this;
    }

    /**
     * <p>
     * Controls how operation metrics will be emitted to CloudWatch. Operation metrics include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Requests: The number of times a specified GraphQL operation was called.
     * </p>
     * </li>
     * <li>
     * <p>
     * GraphQL errors: The number of GraphQL errors that occurred during a specified GraphQL operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Metrics will be recorded by API ID and operation name. You can set the value to <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param operationLevelMetricsConfig
     *        Controls how operation metrics will be emitted to CloudWatch. Operation metrics include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Requests: The number of times a specified GraphQL operation was called.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GraphQL errors: The number of GraphQL errors that occurred during a specified GraphQL operation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Metrics will be recorded by API ID and operation name. You can set the value to <code>ENABLED</code> or
     *        <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationLevelMetricsConfig
     */

    public EnhancedMetricsConfig withOperationLevelMetricsConfig(OperationLevelMetricsConfig operationLevelMetricsConfig) {
        this.operationLevelMetricsConfig = operationLevelMetricsConfig.toString();
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
        if (getResolverLevelMetricsBehavior() != null)
            sb.append("ResolverLevelMetricsBehavior: ").append(getResolverLevelMetricsBehavior()).append(",");
        if (getDataSourceLevelMetricsBehavior() != null)
            sb.append("DataSourceLevelMetricsBehavior: ").append(getDataSourceLevelMetricsBehavior()).append(",");
        if (getOperationLevelMetricsConfig() != null)
            sb.append("OperationLevelMetricsConfig: ").append(getOperationLevelMetricsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnhancedMetricsConfig == false)
            return false;
        EnhancedMetricsConfig other = (EnhancedMetricsConfig) obj;
        if (other.getResolverLevelMetricsBehavior() == null ^ this.getResolverLevelMetricsBehavior() == null)
            return false;
        if (other.getResolverLevelMetricsBehavior() != null && other.getResolverLevelMetricsBehavior().equals(this.getResolverLevelMetricsBehavior()) == false)
            return false;
        if (other.getDataSourceLevelMetricsBehavior() == null ^ this.getDataSourceLevelMetricsBehavior() == null)
            return false;
        if (other.getDataSourceLevelMetricsBehavior() != null
                && other.getDataSourceLevelMetricsBehavior().equals(this.getDataSourceLevelMetricsBehavior()) == false)
            return false;
        if (other.getOperationLevelMetricsConfig() == null ^ this.getOperationLevelMetricsConfig() == null)
            return false;
        if (other.getOperationLevelMetricsConfig() != null && other.getOperationLevelMetricsConfig().equals(this.getOperationLevelMetricsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverLevelMetricsBehavior() == null) ? 0 : getResolverLevelMetricsBehavior().hashCode());
        hashCode = prime * hashCode + ((getDataSourceLevelMetricsBehavior() == null) ? 0 : getDataSourceLevelMetricsBehavior().hashCode());
        hashCode = prime * hashCode + ((getOperationLevelMetricsConfig() == null) ? 0 : getOperationLevelMetricsConfig().hashCode());
        return hashCode;
    }

    @Override
    public EnhancedMetricsConfig clone() {
        try {
            return (EnhancedMetricsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.EnhancedMetricsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
