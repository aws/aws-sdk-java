package com.amazonaws.metrics.internal.cloudwatch.spi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Service specific metric transformer factory.
 */
public enum AWSMetricTransformerFactory {
//    S3,
    DynamoDB,
    ;
    private static final String REQUEST_TRANSFORMER_CLASSNAME_SUFFIX = "RequestMetricTransformer";
    private static final String METRIC_TRANSFORM_PROVIDER_PACKAGE = 
        "com.amazonaws.metrics.internal.cloudwatch.provider.transform";
    /**
     * The transformer class for each AWS specific service is assumed to
     * reside in the Java package {@link #METRIC_TRANSFORM_PROVIDER_PACKAGE}
     * and follow the naming convention of &lt;AwsPrefix>MetricTransformer.
     * The "AwsPrefix" is the same as the enum literal name. Since each
     * service specific request metric transformer internally contains
     * static reference to service specific classes, this dynamic class
     * loading mechansim allows service specific transformers to be skipped
     * in case some service specific class files are absent in the
     * classpath.
     */
    private final RequestMetricTransformer reqTransformer;
    private AWSMetricTransformerFactory() {
        this.reqTransformer =
            loadRequestMetricTransformer(AWSMetricTransformerFactory.buildRequestMetricTransformerFQCN(name()));
    }

    /**
     * Returns the fully qualified class name of the request metric
     * transformer, given the specific AWS prefix.
     */
    public static String buildRequestMetricTransformerFQCN(String awsPrefix) {
        return METRIC_TRANSFORM_PROVIDER_PACKAGE + "." 
             + awsPrefix + REQUEST_TRANSFORMER_CLASSNAME_SUFFIX
             ;
    }

    private RequestMetricTransformer loadRequestMetricTransformer(String className) {
       Log log = LogFactory.getLog(AWSMetricTransformerFactory.class);
       if (log.isDebugEnabled()) {
           log.debug("Loading " + className);
       }
        try {
            Class<?> c = Class.forName(className);
            return (RequestMetricTransformer)c.newInstance();
        } catch (Throwable e) {
            if (log.isDebugEnabled()) {
                log.debug("Failed to load " + className
                        + "; therefore ignoring " + this.name()
                        + " specific predefined metrics", e);
            }
        }
        return RequestMetricTransformer.NONE;
   }

   public RequestMetricTransformer getRequestMetricTransformer() {  return reqTransformer; }
}