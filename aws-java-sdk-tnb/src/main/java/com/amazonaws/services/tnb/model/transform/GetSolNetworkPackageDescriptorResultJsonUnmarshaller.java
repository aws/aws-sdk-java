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
package com.amazonaws.services.tnb.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.tnb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSolNetworkPackageDescriptorResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolNetworkPackageDescriptorResultJsonUnmarshaller implements Unmarshaller<GetSolNetworkPackageDescriptorResult, JsonUnmarshallerContext> {

    public GetSolNetworkPackageDescriptorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSolNetworkPackageDescriptorResult getSolNetworkPackageDescriptorResult = new GetSolNetworkPackageDescriptorResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                getSolNetworkPackageDescriptorResult.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            try {
                getSolNetworkPackageDescriptorResult.setNsd(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
            } finally {
                com.amazonaws.util.IOUtils.closeQuietly(is, null);
            }
        }

        return getSolNetworkPackageDescriptorResult;
    }

    private static GetSolNetworkPackageDescriptorResultJsonUnmarshaller instance;

    public static GetSolNetworkPackageDescriptorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSolNetworkPackageDescriptorResultJsonUnmarshaller();
        return instance;
    }
}
