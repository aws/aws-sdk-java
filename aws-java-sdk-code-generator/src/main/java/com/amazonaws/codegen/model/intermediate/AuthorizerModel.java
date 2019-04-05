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

package com.amazonaws.codegen.model.intermediate;

import com.amazonaws.codegen.model.service.Location;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class AuthorizerModel extends DocumentationModel {
    private final String name;
    private final String interfaceName;
    private final Location authTokenLocation;
    private final String tokenName;

    public AuthorizerModel(String name, String interfaceName, Location authTokenLocation, String tokenName) {
        this.name = name;
        this.interfaceName = interfaceName;
        this.authTokenLocation = authTokenLocation;
        this.tokenName = tokenName;
    }

    public String getName() {
        return name;
    }

    public boolean hasTokenPlacement() { return tokenName != null && authTokenLocation != null; }

    public String getTokenName() {
        return tokenName;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public Location getAuthTokenLocation() { return authTokenLocation; }

    @JsonIgnore
    public String getAddAuthTokenMethod() {
        switch (authTokenLocation) {
            case HEADER:
                return "addHeader";
            case QUERY_STRING:
                return "addParameter";
            default:
                throw new IllegalArgumentException(String.format("Unhandled Location type for Auth Token Location '%s'", authTokenLocation));
        }
    }
}
