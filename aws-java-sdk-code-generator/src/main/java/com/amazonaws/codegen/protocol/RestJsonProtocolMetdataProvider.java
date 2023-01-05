/*
 * Copyright 2011-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.codegen.protocol;

public class RestJsonProtocolMetdataProvider extends BaseJsonProtocolMetadataProvider {

    /**
     * Using the standard content-type for REST-JSON as a default. For historical context and troubleshooting
     * related to content-type see https://w.amazon.com/bin/view/AWSSDKsAndTools/JavaSDK/FAQ/TroubleshootingRestJsonIssues/
     */
    @Override
    public String getContentType() {
        return "application/json";
    }
}
