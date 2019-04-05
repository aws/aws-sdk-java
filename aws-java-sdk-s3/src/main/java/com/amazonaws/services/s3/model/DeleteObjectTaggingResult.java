/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

/**
 * Contains all the information returned from performing a {@link
 * DeleteObjectTaggingRequest}.
 */
public class DeleteObjectTaggingResult {
    private String versionId;

    /**
     * @return The version of the object whose tags were deleted.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Set the version of the object whose tags were deleted.
     *
     * @param versionId
     *            The object version.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Set the version of the object whose tags were deleted.
     *
     * @param versionId
     *            The object version.
     *
     * @return This object for chaining.
     */
    public DeleteObjectTaggingResult withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }
}
