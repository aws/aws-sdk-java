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

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

public class SelectObjectContentResult implements Closeable {
    private SelectObjectContentEventStream payload;

    public SelectObjectContentEventStream getPayload() {
        return payload;
    }

    public void setPayload(SelectObjectContentEventStream payload) {
        this.payload = payload;
    }

    public SelectObjectContentResult withPayload(SelectObjectContentEventStream payload) {
        setPayload(payload);
        return this;
    }

    @Override
    public void close() throws IOException {
        if (payload != null) {
            payload.close();
        }
    }
}
