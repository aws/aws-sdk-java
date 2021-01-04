/*
 * Copyright 2019-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;


import static com.amazonaws.util.HostnameValidator.validateHostnameCompliant;

import com.amazonaws.annotation.SdkInternalApi;
import java.net.URI;

/**
 * This class is used to construct an endpoint host for an S3 access point.
 */
@SdkInternalApi
public class S3AccessPointBuilder {

    private Boolean dualstackEnabled;
    private Boolean fipsEnabled;
    private String accessPointName;
    private String region;
    private String accountId;
    private String protocol;
    private String domain;

    private S3AccessPointBuilder() {
    }

    /**
     * Create a new instance of this builder class.
     */
    public static S3AccessPointBuilder create() {
        return new S3AccessPointBuilder();
    }

    /**
     * Enable DualStack endpoint.
     */
    public void setDualstackEnabled(Boolean dualstackEnabled) {
        this.dualstackEnabled = dualstackEnabled;
    }

    public S3AccessPointBuilder withDualstackEnabled(Boolean dualstackEnabled) {
        setDualstackEnabled(dualstackEnabled);
        return this;
    }

    /**
     * Enable fips in endpoint.
     */
    public void setFipsEnabled(Boolean fipsEnabled) {
        this.fipsEnabled = fipsEnabled;
    }

    public S3AccessPointBuilder withFipsEnabled(Boolean fipsEnabled) {
        this.fipsEnabled = fipsEnabled;
        return this;
    }

    /**
     * The S3 Access Point name.
     */
    public void setAccessPointName(String accessPointName) {
        this.accessPointName = accessPointName;
    }

    public S3AccessPointBuilder withAccessPointName(String accessPointName) {
        setAccessPointName(accessPointName);
        return this;
    }

    /**
     * The AWS region hosting the Access Point.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    public S3AccessPointBuilder withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * The ID of the AWS Account the Access Point is associated with.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public S3AccessPointBuilder withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * The protocol to be used with the endpoint URI.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public S3AccessPointBuilder withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * The TLD for the access point.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public S3AccessPointBuilder withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * Generate an endpoint URI with no path that maps to the Access Point information stored in this builder.
     */
    public URI toURI() {
        validateHostnameCompliant(accountId, "accountId", "access point ARN");
        validateHostnameCompliant(accessPointName, "accessPointName", "access point ARN");

        String dualStackSegment = Boolean.TRUE.equals(dualstackEnabled) ? ".dualstack" : "";

        String fipsSegment = Boolean.TRUE.equals(fipsEnabled) ? "fips-" : "";
        String uriString = String.format("%s://%s-%s.s3-accesspoint%s.%s%s.%s", protocol, accessPointName, accountId,
                                         dualStackSegment, fipsSegment, region, domain);
        return URI.create(uriString);
    }
}
