/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth;

import com.amazonaws.annotation.Immutable;

/**
 * A PEM object in a PEM file.
 *<p>
 * A PEM file can contain one or multiple PEM objects, each with a beginning
 * and ending marker.
 */
@Immutable
public class PEMObject {
    private final String beginMarker;
    private final byte[] derBytes;

    public PEMObject(String beginMarker, byte[] derBytes) {
        this.beginMarker = beginMarker;
        this.derBytes = derBytes.clone();
    }

    public String getBeginMarker() {
        return beginMarker;
    }

    public byte[] getDerBytes() {
        return derBytes.clone();
    }

    public PEMObjectType getPEMObjectType() {
        return PEMObjectType.fromBeginMarker(beginMarker);
    }
}
