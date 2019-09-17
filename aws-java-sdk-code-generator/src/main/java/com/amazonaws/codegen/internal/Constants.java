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

package com.amazonaws.codegen.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Constants {

    public static final String CODEGEN_CONFIG_FILE = "codegen.config";

    public static final String CUSTOMIZATION_CONFIG_FILE = "customization.config";

    public static final String ASYNC_SUFFIX = "Async";

    public static final String CLIENT_NAME_SUFFIX = "Client";

    public static final String PROTOCOL_CONFIG_LOCATION = "/protocol-config/%s.json";

    @Deprecated
    public static final String FILE_NAME_SUFFIX = ".java";

    public static final String JAVA_FILE_NAME_SUFFIX = ".java";

    public static final String PROPERTIES_FILE_NAME_SUFFIX = ".properties";

    public static final String PACKAGE_NAME_MODEL_SUFFIX = "model";

    public static final String PACKAGE_NAME_TRANSFORM_SUFFIX = "transform";

    public static final String PACKAGE_NAME_WAITERS_SUFFIX = "waiters";

    public static final String PACKAGE_NAME_ENDPOINT_DISCOVERY_SUFFIX = "endpointdiscovery";

    public static final String PACKAGE_NAME_CUSTOM_AUTH_SUFFIX = "auth";

    public static final String AUTH_POLICY_ENUM_CLASS_DIR = "com/amazonaws/auth/policy/actions";

    public static final String REQUEST_CLASS_SUFFIX = "Request";

    public static final String RESPONSE_CLASS_SUFFIX = "Result";

    public static final String EXCEPTION_CLASS_SUFFIX = "Exception";

    public static final String FAULT_CLASS_SUFFIX = "Fault";

    public static final String VARIABLE_NAME_SUFFIX = "Value";

    public static final String AUTHORIZER_NAME_PREFIX = "I";

    public static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static final Log LOGGER = LogFactory.getLog("com.amazonaws.javasdk.codegen");

    public static final String SMOKE_TESTS_DIR_NAME = "smoketests";

    public static final String AWS_DOCS_HOST = "docs.aws.amazon.com";

}
