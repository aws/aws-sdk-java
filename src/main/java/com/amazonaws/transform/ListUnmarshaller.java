/*
 * Copyright 2011-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonToken;

public class ListUnmarshaller<T>
        implements Unmarshaller<List<T>, JsonUnmarshallerContext> {

    private final Unmarshaller<T, JsonUnmarshallerContext> itemUnmarshaller;

    public ListUnmarshaller(
        Unmarshaller<T, JsonUnmarshallerContext> itemUnmarshaller
    ) {
        this.itemUnmarshaller = itemUnmarshaller;
    }

    public List<T> unmarshall(JsonUnmarshallerContext context)
            throws Exception {

        List<T> list = new ArrayList<T>();
        int originalDepth = context.getCurrentDepth();

        while (true) {
            JsonToken token = context.nextToken();
            if (token == null) return list;

            if (token == JsonToken.START_ARRAY) {
                continue;
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() < originalDepth) return list;
            } else {
                list.add(itemUnmarshaller.unmarshall(context));
            }
        }
    }
}
