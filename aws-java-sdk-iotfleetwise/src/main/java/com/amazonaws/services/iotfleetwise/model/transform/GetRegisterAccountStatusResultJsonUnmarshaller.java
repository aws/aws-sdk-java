/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotfleetwise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotfleetwise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRegisterAccountStatusResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRegisterAccountStatusResultJsonUnmarshaller implements Unmarshaller<GetRegisterAccountStatusResult, JsonUnmarshallerContext> {

    public GetRegisterAccountStatusResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRegisterAccountStatusResult getRegisterAccountStatusResult = new GetRegisterAccountStatusResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRegisterAccountStatusResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("customerAccountId", targetDepth)) {
                    context.nextToken();
                    getRegisterAccountStatusResult.setCustomerAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accountStatus", targetDepth)) {
                    context.nextToken();
                    getRegisterAccountStatusResult.setAccountStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timestreamRegistrationResponse", targetDepth)) {
                    context.nextToken();
                    getRegisterAccountStatusResult.setTimestreamRegistrationResponse(TimestreamRegistrationResponseJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("iamRegistrationResponse", targetDepth)) {
                    context.nextToken();
                    getRegisterAccountStatusResult.setIamRegistrationResponse(IamRegistrationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getRegisterAccountStatusResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModificationTime", targetDepth)) {
                    context.nextToken();
                    getRegisterAccountStatusResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getRegisterAccountStatusResult;
    }

    private static GetRegisterAccountStatusResultJsonUnmarshaller instance;

    public static GetRegisterAccountStatusResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRegisterAccountStatusResultJsonUnmarshaller();
        return instance;
    }
}
