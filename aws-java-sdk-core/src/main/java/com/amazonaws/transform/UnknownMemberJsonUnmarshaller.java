/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.annotation.SdkInternalApi;
import com.fasterxml.jackson.core.JsonToken;

import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

@SdkInternalApi
public class UnknownMemberJsonUnmarshaller implements Unmarshaller<Void, JsonUnmarshallerContext> {
    private static final UnknownMemberJsonUnmarshaller INSTANCE = new UnknownMemberJsonUnmarshaller();

    @Override
    public Void unmarshall(JsonUnmarshallerContext ctx) throws Exception {
        consumeValue(ctx, true);
        return null;
    }

    public static UnknownMemberJsonUnmarshaller getInstance() {
        return INSTANCE;
    }

    private static void consumeValue(JsonUnmarshallerContext ctx, boolean isRoot) throws Exception {
        JsonToken token = ctx.getCurrentToken();

        if (token == null) {
            token = ctx.nextToken();
        }
        if (token == VALUE_NULL) {
            return;
        }

        switch (token) {
            case START_ARRAY:
                ctx.nextToken();
                consumeArray(ctx);
                break;
            case START_OBJECT:
                ctx.nextToken();
                consumeObject(ctx);
                break;
            default: // scalar value, we can just ignore this token
                break;
        }

        // For the root of the unknown value tree, we need to leave the token because the generated unmarshallers
        // consume the current token at the end of the unmarshalling loop; otherwise if we're still descending the tree
        // we need to consume it ourselves.
        if (!isRoot) {
            ctx.nextToken();
        }
    }

    private static void consumeArray(JsonUnmarshallerContext ctx) throws Exception {
        while (true) {
            JsonToken token = ctx.getCurrentToken();

            if (token == null) {
                return;
            }

            if (token == JsonToken.END_ARRAY) {
                return;
            } else {
                consumeValue(ctx, false);
            }
        }
    }

    private static void consumeObject(JsonUnmarshallerContext ctx) throws Exception {
        while (true) {
            JsonToken token = ctx.getCurrentToken();

            if (token == null) {
                return;
            }

            switch (token) {
                case END_OBJECT:
                    return;
                case FIELD_NAME:
                    ctx.nextToken();
                    consumeValue(ctx, false);
                    break;
                default:
                    throw new RuntimeException("Expected either a field name or end of the object, but got " + token);
            }
        }
    }
}
