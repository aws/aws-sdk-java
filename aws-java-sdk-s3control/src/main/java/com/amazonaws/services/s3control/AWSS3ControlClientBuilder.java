/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control;

import javax.annotation.Generated;

import com.amazonaws.ClientConfigurationFactory;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.builder.AwsSyncClientBuilder;
import com.amazonaws.client.AwsSyncClientParams;

/**
 * Fluent builder for {@link com.amazonaws.services.s3control.AWSS3Control}. Use of the builder is preferred over using
 * constructors of the client class.
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class AWSS3ControlClientBuilder extends AwsSyncClientBuilder<AWSS3ControlClientBuilder, AWSS3Control> {

    private static final ClientConfigurationFactory CLIENT_CONFIG_FACTORY = new ClientConfigurationFactory();

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static AWSS3ControlClientBuilder standard() {
        return new AWSS3ControlClientBuilder();
    }

    /**
     * @return Default client using the {@link com.amazonaws.auth.DefaultAWSCredentialsProviderChain} and
     *         {@link com.amazonaws.regions.DefaultAwsRegionProviderChain} chain
     */
    public static AWSS3Control defaultClient() {
        return standard().build();
    }

    private AWSS3ControlClientBuilder() {
        super(CLIENT_CONFIG_FACTORY);
    }

    /**
     * @returns The current setting for Dual-Stack endpoints (supports both IPv4 and IPv6) configured in the builder.
     * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/dual-stack-endpoints.html">Using Amazon S3
     *      Dual-Stack Endpoints</a>
     */
    public Boolean isDualstackEnabled() {
        return super.getAdvancedConfig(S3ControlClientOptions.DUALSTACK_ENABLED);
    }

    /**
     * Enables use of Dual-Stack endpoints (supports both IPv4 and IPv6) on clients built with this builder.
     * 
     * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/dual-stack-endpoints.html">Using Amazon S3
     *      Dual-Stack Endpoints</a>
     */
    public AWSS3ControlClientBuilder enableDualstack() {
        return withDualstackEnabled(true);
    }

    /**
     * Sets the status of Dual-Stack endpoints (supports both IPv4 and IPv6) for clients built with this builder. The
     * default is to not use Dual-Stack endpoints.
     *
     * @param dualstackEnabled
     *        True if Dual-Stack endpoints should be used, false if Dual-Stack endpoints should not be used.
     * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/dual-stack-endpoints.html">Using Amazon S3
     *      Dual-Stack Endpoints</a>
     */
    public void setDualstackEnabled(Boolean dualstackEnabled) {
        super.putAdvancedConfig(S3ControlClientOptions.DUALSTACK_ENABLED, dualstackEnabled);
    }

    /**
     * Sets the status of Dual-Stack endpoints (supports both IPv4 and IPv6) for clients built with this builder. The
     * default is to not use Dual-Stack endpoints.
     *
     * @param dualstackEnabled
     *        True if Dual-Stack endpoints should be used, false if Dual-Stack endpoints should not be used.
     * @returns This builder for method chaining.
     * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/dual-stack-endpoints.html">Using Amazon S3
     *      Dual-Stack Endpoints</a>
     */
    public AWSS3ControlClientBuilder withDualstackEnabled(Boolean dualstackEnabled) {
        setDualstackEnabled(dualstackEnabled);
        return this;
    }

    /**
     * @returns The current setting for FIPS enabled endpoints configured in the builder.
     * @see <a href="https://www.nist.gov/itl/fips-general-information">FIPS General Information</a>
     */
    public Boolean isFipsEnabled() {
        return super.getAdvancedConfig(S3ControlClientOptions.FIPS_ENABLED);
    }

    /**
     * Enables use of FIPS endpoints on clients built with this builder.
     * 
     * @see <a href="https://www.nist.gov/itl/fips-general-information">FIPS General Information</a>
     */
    public AWSS3ControlClientBuilder enableFips() {
        return withFipsEnabled(true);
    }

    /**
     * Sets the status of FIPS enabled endpoints for clients built with this builder. The default is to not use FIPS
     * endpoints.
     *
     * @param fipsEnabled
     *        True if FIPS endpoints should be used, false if FIPS endpoints should not be used.
     * @see <a href="https://www.nist.gov/itl/fips-general-information">FIPS General Information</a>
     */
    public void setFipsEnabled(Boolean fipsEnabled) {
        super.putAdvancedConfig(S3ControlClientOptions.FIPS_ENABLED, fipsEnabled);
    }

    /**
     * Sets the status of FIPS enabled endpoints for clients built with this builder. The default is to not use FIPS
     * endpoints.
     *
     * @param fipsEnabled
     *        True if FIPS endpoints should be used, false if FIPS endpoints should not be used.
     * @returns This builder for method chaining.
     * @see <a href="https://www.nist.gov/itl/fips-general-information">FIPS General Information</a>
     */
    public AWSS3ControlClientBuilder withFipsEnabled(Boolean fipsEnabled) {
        setFipsEnabled(fipsEnabled);
        return this;
    }

    /**
     * Construct a synchronous implementation of AWSS3Control using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of AWSS3Control.
     */
    @Override
    protected AWSS3Control build(AwsSyncClientParams params) {
        return new AWSS3ControlClient(params);
    }

}
