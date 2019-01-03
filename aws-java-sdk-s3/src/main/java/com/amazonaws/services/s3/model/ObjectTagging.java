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

import java.io.Serializable;
import java.util.List;

/**
 * The tagging for an object.
 */
public class ObjectTagging implements Serializable {
    private List<Tag> tagSet;

    /**
     * Constructs an instance of this object.
     *
     * @param tagSet The tag set.
     */
    public ObjectTagging(List<Tag> tagSet) {
        this.tagSet = tagSet;
    }


    /**
     * @return The tag set.
     */
    public List<Tag> getTagSet() {
        return tagSet;
    }

    /**
     * Set the tag set for the object.
     *
     * @param tagSet
     *            The tag set.
     */
    public void setTagSet(List<Tag> tagSet) {
        this.tagSet = tagSet;
    }

    /**
     * Set the tag set for the object.
     *
     * @param tagSet
     *            The tag set.
     * @return
     *            This object for chaining.
     */
    private ObjectTagging withTagSet(List<Tag> tagSet) {
        this.tagSet = tagSet;
        return this;
    }
}
