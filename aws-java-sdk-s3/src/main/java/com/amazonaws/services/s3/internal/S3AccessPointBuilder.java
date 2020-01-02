/*
 * Copyright 2019-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.amazonaws.annotation.SdkInternalApi;

/**
 * This class is used to construct an endpoint host for an S3 access point.
 */
@SdkInternalApi
public class S3AccessPointBuilder {

    private static final Pattern HOSTNAME_COMPLIANT_PATTERN = Pattern.compile("[A-Za-z0-9\\-]+");
    private static final int HOSTNAME_MAX_LENGTH = 63;

    private Boolean dualstackEnabled;
    private String accessPointName;
    private String region;
    private String accountId;
    private String protocol;
    private String domain;

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
        validateHostnameCompliant(accountId, "accountId");
        validateHostnameCompliant(accessPointName, "accessPointName");

        String dualStackSegment = Boolean.TRUE.equals(dualstackEnabled) ? ".dualstack" : "";
        String uriString = String.format("%s://%s-%s.s3-accesspoint%s.%s.%s", protocol, accessPointName, accountId,
                                         dualStackSegment, region, domain);
        return URI.create(uriString);
    }

    private static void validateHostnameCompliant(String hostnameComponent, String paramName) {
        if (hostnameComponent.isEmpty()) {
            throw new IllegalArgumentException(
                String.format("An S3 Access Point ARN has been passed that is not valid: the required '%s' "
                              + "component is missing.", paramName));
        }

        if (hostnameComponent.length() > HOSTNAME_MAX_LENGTH) {
            throw new IllegalArgumentException(
                String.format("An S3 Access Point ARN has been passed that is not valid: the '%s' "
                              + "component exceeds the maximum length of %d characters.", paramName, HOSTNAME_MAX_LENGTH));
        }

        Matcher m = HOSTNAME_COMPLIANT_PATTERN.matcher(hostnameComponent);
        if (!m.matches()) {
            throw new IllegalArgumentException(
                String.format("An S3 Access Point ARN has been passed that is not valid: the '%s' "
                              + "component must only contain alphanumeric characters and dashes.", paramName));
        }
    }
}
