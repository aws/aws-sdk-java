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

package com.amazonaws.codegen.model.intermediate;

public class ShapeUnmarshaller {

    private String resultWrapper;
    private boolean flattened;

    public String getResultWrapper() {
        return resultWrapper;
    }

    public void setResultWrapper(String resultWrapper) {
        this.resultWrapper = resultWrapper;
    }

    public ShapeUnmarshaller withResultWrapper(String resultWrapper) {
        setResultWrapper(resultWrapper);
        return this;
    }

    public boolean isFlattened() {
        return flattened;
    }

    public void setFlattened(boolean flattened) {
        this.flattened = flattened;
    }

    public ShapeUnmarshaller withFlattened(boolean flattened) {
        setFlattened(flattened);
        return this;
    }
}
