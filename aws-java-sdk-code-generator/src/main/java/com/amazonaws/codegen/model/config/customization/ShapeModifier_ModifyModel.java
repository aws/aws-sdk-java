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

package com.amazonaws.codegen.model.config.customization;

public class ShapeModifier_ModifyModel {

    private String emitPropertyName;

    /**
     * The name for the enum to be used in the java class. This overrides the
     * name computed by the code generator for the enum.
     */
    private String emitEnumName;

    /**
     * Emit as a different primitive type. Used by AWS Budget Service to change string
     * to BigDecimal (see API-433).
     */
    private String emitAsType;

    private String marshallLocationName;

    private String unmarshallLocationName;

    public String getEmitPropertyName() {
        return emitPropertyName;
    }

    public void setEmitPropertyName(String emitPropertyName) {
        this.emitPropertyName = emitPropertyName;
    }

    public String getEmitEnumName() {
        return emitEnumName;
    }

    public void setEmitEnumName(String emitEnumName) {
        this.emitEnumName = emitEnumName;
    }

    public String getMarshallLocationName() {
        return marshallLocationName;
    }

    public void setMarshallLocationName(String marshallLocationName) {
        this.marshallLocationName = marshallLocationName;
    }

    public String getUnmarshallLocationName() {
        return unmarshallLocationName;
    }

    public void setUnmarshallLocationName(String unmarshallLocationName) {
        this.unmarshallLocationName = unmarshallLocationName;
    }

    public String getEmitAsType() {
        return emitAsType;
    }

    public void setEmitAsType(String emitAsType) {
        this.emitAsType = emitAsType;
    }
}
