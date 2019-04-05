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
package com.amazonaws.services.simpledb;

import java.util.Map;

import com.amazonaws.ResponseMetadata;

/**
 * Extension of {@link ResponseMetadata} with Amazon SimpleDB specific data. In addition to the
 * standard AWS request ID contained in all services' response metadata, Amazon SimpleDB also
 * includes information on how much compute capacity, or box usage, was used to process your
 * request.
 * <p>
 * SimpleDB box usage is useful when looking at how different queries perform on your data. You can
 * use that information to tune your queries, and reduce your monthly SimpleDB usage charges.
 */
public class SimpleDBResponseMetadata extends ResponseMetadata {
    public static final String BOX_USAGE = "BOX_USAGE";

    /**
     * Creates a new SimpleDBResponseMetadata object from a specified map of metadata information.
     *
     * @param metadata
     *            The raw metadata for the new SimpleDBResponseMetadata object.
     */
    public SimpleDBResponseMetadata(Map<String, String> metadata) {
        super(metadata);
    }

    /**
     * Creates a new SimpleDBResponseMetadata object from an existing ResponseMetadata object.
     *
     * @param originalResponseMetadata
     *            The ResponseMetadata object from which to create the new object.
     */
    public SimpleDBResponseMetadata(ResponseMetadata originalResponseMetadata) {
        super(originalResponseMetadata);
    }

    /**
     * Returns the SimpleDB box usage reported in a response's metadata. SimpleDB box usage
     * indicates how much compute capacity was used to process your request.
     * <p>
     * Box usage is useful when looking at how different queries perform on your data. You can use
     * that information to tune your queries, and reduce your monthly SimpleDB usage charges.
     *
     * @return The SimpleDB box usage reported for the associated request.
     */
    public float getBoxUsage() {
        String boxUsage = metadata.get(BOX_USAGE);
        if (boxUsage == null || boxUsage.trim().length() == 0)
            return 0;
        return Float.parseFloat(boxUsage);
    }
}
