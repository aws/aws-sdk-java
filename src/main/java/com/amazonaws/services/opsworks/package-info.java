
/**
 * Synchronous and asynchronous client classes for accessing AWSOpsWorks.
 *
 * AWS OpsWorks <p>
 * Welcome to the <i>AWS OpsWorks API Reference</i> . This guide provides descriptions, syntax, and usage examples about AWS OpsWorks actions and data
 * types, including common parameters and error codes.
 * </p>
 * <p>
 * AWS OpsWorks is an application management service that provides an integrated experience for overseeing the complete application lifecycle. For
 * information about this product, go to the <a href="http://aws.amazon.com/opsworks/"> AWS OpsWorks </a> details page.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks supports only one endpoint, opsworks.us-east-1.amazonaws.com (HTTPS), so you must connect to that endpoint. You can then use the API to
 * direct AWS OpsWorks to create stacks in any AWS Region.
 * </p>
 * <p>
 * <b>Chef Version</b>
 * </p>
 * <p>
 * When you call CreateStack, CloneStack, or UpdateStack we recommend you use the <code>ConfigurationManager</code> parameter to specify the Chef
 * version, 0.9 or 11.4. The default value is currently 0.9. However, we expect to change the default value to 11.4 in September 2013.
 * </p>
 */
 package com.amazonaws.services.opsworks;
        