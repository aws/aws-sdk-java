package com.amazonaws.metrics.internal.cloudwatch.spi;

/**
 * Common CloudWatch dimensions defined and used by the request metric
 * transformer providers.
 * Beware that changing the names of these enum literals will affect the
 * metric dimensional names displayed in CloudWatch.
 */
public enum Dimensions {
    /**
     * Type of metric such as HttpRequestTime, ClientExecuteTime, etc.
     */
    MetricType,
    /**
     * Type of request such as PutItemRequest, GetMetricStatisticsRequest,
     * etc.
     */
    RequestType,
}