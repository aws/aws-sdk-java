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
 * SetObjectTaggingRequest}.
 */
public class SetObjectTaggingResult {
    private String versionId;

    /**
     * @return The version ID of the object whose tags were set.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Set the version ID of the object whose tags were set.
     *
     * @param versionId
     *            The version ID.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Set the version ID of the object whose tags were set.
     *
     * @param versionId
     *            The version ID.
     * @return This object for chaining.
     */
    public SetObjectTaggingResult withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }
}
