/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.chatbot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chatbot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeleteSlackUserIdentityException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSlackUserIdentityExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private DeleteSlackUserIdentityExceptionUnmarshaller() {
        super(com.amazonaws.services.chatbot.model.DeleteSlackUserIdentityException.class, "DeleteSlackUserIdentityException");
    }

    @Override
    public com.amazonaws.services.chatbot.model.DeleteSlackUserIdentityException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.chatbot.model.DeleteSlackUserIdentityException deleteSlackUserIdentityException = new com.amazonaws.services.chatbot.model.DeleteSlackUserIdentityException(
                null);

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return deleteSlackUserIdentityException;
    }

    private static DeleteSlackUserIdentityExceptionUnmarshaller instance;

    public static DeleteSlackUserIdentityExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteSlackUserIdentityExceptionUnmarshaller();
        return instance;
    }
}
