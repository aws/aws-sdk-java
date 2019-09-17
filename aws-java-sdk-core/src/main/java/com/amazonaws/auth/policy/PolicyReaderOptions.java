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

package com.amazonaws.auth.policy;

/**
 * Options that affect the way in which {@link Policy#fromJson(String, PolicyReaderOptions)} will generate a Policy.
 */
public class PolicyReaderOptions {
    private boolean stripAwsPrincipalIdHyphensEnabled = true;

    /**
     * Whether AWS account IDs should have hyphens removed in their name.
     */
    public boolean isStripAwsPrincipalIdHyphensEnabled() {
        return stripAwsPrincipalIdHyphensEnabled;
    }

    /**
     * Configure whether hyphens should be stripped from the AWS principal IDs that are read from the JSON-formatted
     * policy document. This is useful because AWS account IDs must be specified without hyphens, but the user may not be
     * aware that hyphens should not be used when configuring their policy.
     *
     * This behavior may be undesirable when using IAM AWS principal IDs, which may contain hyphens. In that case, this
     * option may be explicitly disabled. If this is set to false, you must remove hyphens from your AWS principal IDs
     * manually.
     *
     * By default, this is enabled (true).
     */
    public void setStripAwsPrincipalIdHyphensEnabled(boolean stripAwsPrincipalIdHyphensEnabled) {
        this.stripAwsPrincipalIdHyphensEnabled = stripAwsPrincipalIdHyphensEnabled;
    }

    /**
     * Fluent-style setter for {@link #setStripAwsPrincipalIdHyphensEnabled(boolean)} that returns "this" for chaining.
     */
    public PolicyReaderOptions withStripAwsPrincipalIdHyphensEnabled(boolean stripAwsPrincipalIdHyphensEnabled) {
        setStripAwsPrincipalIdHyphensEnabled(stripAwsPrincipalIdHyphensEnabled);
        return this;
    }
}
