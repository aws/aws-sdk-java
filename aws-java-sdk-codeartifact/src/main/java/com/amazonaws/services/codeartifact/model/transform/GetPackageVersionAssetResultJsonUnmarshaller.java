/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeartifact.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetPackageVersionAssetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPackageVersionAssetResultJsonUnmarshaller implements Unmarshaller<GetPackageVersionAssetResult, JsonUnmarshallerContext> {

    public GetPackageVersionAssetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetPackageVersionAssetResult getPackageVersionAssetResult = new GetPackageVersionAssetResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("X-AssetName") != null) {
                context.setCurrentHeader("X-AssetName");
                getPackageVersionAssetResult.setAssetName(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("X-PackageVersion") != null) {
                context.setCurrentHeader("X-PackageVersion");
                getPackageVersionAssetResult.setPackageVersion(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("X-PackageVersionRevision") != null) {
                context.setCurrentHeader("X-PackageVersionRevision");
                getPackageVersionAssetResult.setPackageVersionRevision(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        getPackageVersionAssetResult.setAsset(context.getHttpResponse().getContent());

        return getPackageVersionAssetResult;
    }

    private static GetPackageVersionAssetResultJsonUnmarshaller instance;

    public static GetPackageVersionAssetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPackageVersionAssetResultJsonUnmarshaller();
        return instance;
    }
}
