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

package com.amazonaws.codegen.model.intermediate;

import com.amazonaws.codegen.internal.TypeUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MapModel {

    private final String implType;

    private final String interfaceType;

    private final String keyType;

    private final String keyLocationName;

    private final MemberModel keyModel;

    private final String valueType;

    private final String valueLocationName;

    private final MemberModel valueModel;

    public MapModel(
            @JsonProperty("implType") String implType,
            @JsonProperty("interfaceType") String interfaceType,
            @JsonProperty("keyType") String mapKeyType,
            @JsonProperty("keyLocationName") String keyLocationName,
            @JsonProperty("keyModel") MemberModel keyModel,
            @JsonProperty("valueType") String mapValueType,
            @JsonProperty("valueLocationName") String valueLocationName,
            @JsonProperty("valueModel") MemberModel valueModel) {

        this.implType = implType;
        this.interfaceType = interfaceType;
        this.keyType = mapKeyType;
        this.keyLocationName = keyLocationName;
        this.keyModel = keyModel;
        this.valueType = mapValueType;
        this.valueLocationName = valueLocationName;
        this.valueModel = valueModel;
    }

    public String getImplType() {
        return implType;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public String getKeyType() {
        return keyType;
    }

    public String getKeyLocationName() {
        return keyLocationName;
    }

    public MemberModel getKeyModel() {
        return keyModel;
    }

    public String getValueType() {
        return valueType;
    }

    public String getValueLocationName() {
        return valueLocationName;
    }

    public MemberModel getValueModel() {
        return valueModel;
    }

    public boolean isKeySimple() {
        return TypeUtils.isSimple(keyType);
    }

    public boolean isValueSimple() {
        return TypeUtils.isSimple(valueType);
    }

    public boolean isValueList() {
        return valueType.startsWith(TypeUtils
                .getDataTypeMapping(TypeUtils.LIST_INTERFACE));
    }

    public String getTemplateType() {
        return interfaceType + "<" + keyType + "," + valueType + ">";
    }

    public String getTemplateImplType() {
        return implType + "<" + keyType + "," + valueType + ">";
    }

    public String getEntryType() {
        return String.format("Map.Entry<%s, %s>", keyType, valueType);
    }
}
