/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen.model.config.customization;

import java.util.List;

/**
 * Use shapeSubstitutions customization to override all appearances of the given
 * shape with a new shape, and optionally use a specific member of the original
 * shape as the data source.
 *
 * When emitFromMember is supplied, an additional marshalling and unmarshalling
 * path is added to reflect the wire representation of the member.
 */
public class ShapeSubstitution {

    private String emitAsShape;
    private String emitFromMember;

    /**
     * This contains a list of shapes for which the additional marshalling
     * path will not be added. This customization is specifically added for
     * EC2 where we replace all occurrences of AttributeValue with Value in
     * the model classes. However the wire representation is not changed.
     *
     * TODO This customization has been added to preserve backwards
     * compatiblity of EC2 APIs. This should be removed as part of next major
     * version bump.
     */
    private List<String> skipMarshallPathForShapes;

    public String getEmitAsShape() {
        return emitAsShape;
    }

    public void setEmitAsShape(String emitAsShape) {
        this.emitAsShape = emitAsShape;
    }

    public String getEmitFromMember() {
        return emitFromMember;
    }

    public void setEmitFromMember(String emitFromMember) {
        this.emitFromMember = emitFromMember;
    }

    public List<String> getSkipMarshallPathForShapes() {
        return skipMarshallPathForShapes;
    }

    public void setSkipMarshallPathForShapes(List<String> skipMarshallPathForShapes) {
        this.skipMarshallPathForShapes = skipMarshallPathForShapes;
    }
}
