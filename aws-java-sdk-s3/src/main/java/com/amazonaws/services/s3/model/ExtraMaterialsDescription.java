/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Used to provide additional/supplemental material description (typically on a
 * per-request basis and for more advanced use-case) to supplement the one
 * stored in S3 for crypto material retrieval.
 */
public class ExtraMaterialsDescription implements Serializable {
    @SuppressWarnings("unchecked")
    public static final ExtraMaterialsDescription NONE =
        new ExtraMaterialsDescription(Collections.EMPTY_MAP);

    /**
     * Used to resolve conflicts when merging the additional material
     * description to the core material description.
     */
    public static enum ConflictResolution {
        /** Fail fast upon conflicting keys. */
        FAIL_FAST,
        /** Take precedence upon conflicting keys. */
        OVERRIDE,
        /** To be overridden upon conflicting keys. */
        OVERRIDDEN,
        ;
    }
    /**
     * Supplemental material descriptions which are unmodifiable.
     */
    private final Map<String,String> extra;
    /**
     * Resolution behavior when there are overlapping entries. Defaults to
     * {@link ConflictResolution#FAIL_FAST}.
     */
    private final ConflictResolution resolve;

    public ExtraMaterialsDescription(Map<String,String> matdesc) {
        this(matdesc, ConflictResolution.FAIL_FAST);
    }

    public ExtraMaterialsDescription(Map<String, String> matdesc,
            ConflictResolution resolve) {
        if (matdesc == null || resolve == null)
            throw new IllegalArgumentException();
        this.extra = Collections.unmodifiableMap(
            new HashMap<String, String>(matdesc));
        this.resolve = resolve;
    }

    /**
     * Returns the extra material description; never null.
     */
    public Map<String, String> getMaterialDescription() {
        return extra;
    }

    /**
     * Returns the conflict resolution strategy; neve null.
     */
    public ConflictResolution getConflictResolution() {
        return resolve;
    }

    /**
     * Combine this supplemental material descriptions with those specified in
     * the "core" parameter. This method has no side effect.
     * 
     * @param core
     *            the core material descriptions to be supplemented;
     *            assumed to be unmodifiable.
     * @return the merged material descriptions; never null.
     * The returned map is always unmodifiable, assuming the passed in core
     * material descriptions are unmodifiable.
     * 
     * @throws IllegalArgumentException
     *             if this supplemental material descriptions contains
     *             conflicting entries
     * @throws UnsupportedOperationException
     *             if the conflict resolution strategy is not supported
     */
    public Map<String, String> mergeInto(Map<String, String> core) {
        if (extra.size() == 0)
            return core;    // no supplemental descriptions
        if (core == null || core.size() == 0)
            return extra;   // only core descriptions
        switch(resolve) {
            case FAIL_FAST: {
                final int total = core.size() + extra.size();
                Map<String, String> merged = new HashMap<String,String>(core);
                merged.putAll(extra);
                if (total != merged.size()) {
                    throw new IllegalArgumentException(
                        "The supplemental material descriptions contains conflicting entries");
                }
                return Collections.unmodifiableMap(merged);
            }
            case OVERRIDDEN: {
                Map<String,String> merged = new HashMap<String,String>(extra);
                merged.putAll(core);
                return Collections.unmodifiableMap(merged);
            }
            case OVERRIDE: {
                Map<String,String> merged = new HashMap<String,String>(core);
                merged.putAll(extra);
                return Collections.unmodifiableMap(merged);
            }
            default:
                throw new UnsupportedOperationException();
        }
    }
}
