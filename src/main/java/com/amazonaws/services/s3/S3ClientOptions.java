/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3;

/**
 * S3 client configuration options such as the request access style.
 */
public class S3ClientOptions {

    /** The default setting for use of path-style access */
    public static final boolean DEFAULT_PATH_STYLE_ACCESS = false;

    /** Flag for use of path-style access */
    private boolean pathStyleAccess = DEFAULT_PATH_STYLE_ACCESS;

    public S3ClientOptions() {}

    public S3ClientOptions( S3ClientOptions other ) {
        this.pathStyleAccess = other.pathStyleAccess;
    }

    /**
     * <p>
     * Returns whether the client uses path-style access for all requests.
     * </p>
     * <p>
     * Amazon S3 supports virtual-hosted-style and path-style access in all
     * Regions. The path-style syntax, however, requires that you use the
     * region-specific endpoint when attempting to access a bucket.
     * </p>
     * <p>
     * The default behaviour is to detect which access style to use based on
     * the configured endpoint (an IP will result in path-style access) and
     * the bucket being accessed (some buckets are not valid DNS names).
     * Setting this flag will result in path-style access being used for all
     * requests.
     * </p>
     * @return True is the client should always use path-style access
     */
    public boolean isPathStyleAccess() {
        return pathStyleAccess;
    }

    /**
     * <p>
     * Configures the client to use path-style access for all requests.
     * </p>
     * <p>
     * Amazon S3 supports virtual-hosted-style and path-style access in all
     * Regions. The path-style syntax, however, requires that you use the
     * region-specific endpoint when attempting to access a bucket.
     * </p>
     * <p>
     * The default behaviour is to detect which access style to use based on
     * the configured endpoint (an IP will result in path-style access) and
     * the bucket being accessed (some buckets are not valid DNS names).
     * Setting this flag will result in path-style access being used for all
     * requests.
     * </p>
     * @param pathStyleAccess
     *            True to always use path-style access.
     */
    public void setPathStyleAccess(boolean pathStyleAccess) {
      this.pathStyleAccess = pathStyleAccess;
    }

    /**
     * <p>
     * Configures the client to use path-style access for all requests.
     * </p>
     * <p>
     * Amazon S3 supports virtual-hosted-style and path-style access in all
     * Regions. The path-style syntax, however, requires that you use the
     * region-specific endpoint when attempting to access a bucket.
     * </p>
     * <p>
     * The default behaviour is to detect which access style to use based on
     * the configured endpoint (an IP will result in path-style access) and
     * the bucket being accessed (some buckets are not valid DNS names).
     * Setting this flag will result in path-style access being used for all
     * requests.
     * </p>
     * @param pathStyleAccess
     *            True to always use path-style access.
     *
     * @return The updated S3ClientOptions object with the new path-style
     *         access setting.
     */
    public S3ClientOptions withPathStyleAccess(boolean pathStyleAccess) {
      setPathStyleAccess(pathStyleAccess);
      return this;
    }

}