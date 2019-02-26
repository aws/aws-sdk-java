/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.fasterxml.jackson.core.JsonToken;

import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;

/**
 * This unmarshaller assumes that the start array token as already been consumed before getting
 * control of the context.
 */
public class ListUnmarshaller<T> implements
        Unmarshaller<List<T>, JsonUnmarshallerContext> {

    private final Unmarshaller<T, JsonUnmarshallerContext> itemUnmarshaller;

    public ListUnmarshaller(
            Unmarshaller<T, JsonUnmarshallerContext> itemUnmarshaller) {
        this.itemUnmarshaller = itemUnmarshaller;
    }

    /**
     * Unmarshalls the response headers or the json doc in the payload to the
     * list
     */
    public List<T> unmarshall(JsonUnmarshallerContext context) throws Exception {
        if (context.isInsideResponseHeader()) {
            return unmarshallResponseHeaderToList(context);
        }
        return unmarshallJsonToList(context);
    }

    /**
     * Un marshalls the response header into the list.
     */
    private List<T> unmarshallResponseHeaderToList(
            JsonUnmarshallerContext context) throws Exception {

        String headerValue = context.readText();

        List<T> list = new ArrayList<T>();

        String[] headerValues = headerValue.split("[,]");

        for (final String headerVal : headerValues) {
            list.add(itemUnmarshaller.unmarshall(new JsonUnmarshallerContext() {
                @Override
                public String readText() {
                    return headerVal;
                }
            }));
        }
        return list;
    }

    /**
     * Unmarshalls the current token in the Json document to list.
     */
    private List<T> unmarshallJsonToList(JsonUnmarshallerContext context)
            throws Exception {
        List<T> list = new ArrayList<T>();

        if (context.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }

        while (true) {
            JsonToken token = context.nextToken();
            if (token == null) {
                return list;
            }

            if (token == END_ARRAY) {
                return list;
            } else {
                list.add(itemUnmarshaller.unmarshall(context));
            }
        }
    }
}
