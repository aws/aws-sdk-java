/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class JSONInput implements Serializable {
    private String type;

    /**
     * The type of JSON. Valid values: Document, Lines.
     */
    public String getType() {
        return type;
    }

    /**
     * The type of JSON. Valid values: Document, Lines.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The type of JSON. Valid values: Document, Lines.
     */
    public JSONInput withType(String type) {
        setType(type);
        return this;
    }

    /**
     * The type of JSON. Valid values: Document, Lines.
     */
    public void setType(JSONType type) {
        setType(type == null ? null : type.toString());
    }

    /**
     * The type of JSON. Valid values: Document, Lines.
     */
    public JSONInput withType(JSONType type) {
        setType(type);
        return this;
    }
}
