/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *   http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */

package com.amazonaws.codegen;

import com.amazonaws.codegen.model.intermediate.AuthorizerModel;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.codegen.naming.NamingStrategy;

import java.util.Map;
import java.util.stream.Collectors;

public class AddCustomAuthorizers {
    private final ServiceModel service;
    private final NamingStrategy namingStrategy;

    public AddCustomAuthorizers(ServiceModel service, NamingStrategy namingStrategy) {
        this.service = service;
        this.namingStrategy = namingStrategy;
    }

    public Map<String, AuthorizerModel> constructAuthorizers() {
        return service.getAuthorizers().values().stream()
                .map(a -> new AuthorizerModel(a.getName(), namingStrategy.getAuthorizerClassName(a.getName()), a.getTokenLocation(), a.getTokenName()))
                .collect(Collectors.toMap(AuthorizerModel::getName, a -> a));
    }
}
