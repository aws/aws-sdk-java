/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.codegen.model.config.customization;

import com.amazonaws.codegen.model.intermediate.MemberModel;
import com.amazonaws.codegen.model.intermediate.ShapeModel;

/**
 * Customization to allow generation of additional setter overloads for a 'convenience' type (i.e. a
 * different type then what the member actually is but a more convenient representation to work
 * with, I.E. String rather than ByteBuffer). Customization is configured with an adapter that knows
 * how to convert the 'convenience' type to the actual member type
 * <p>
 * Note - This customization is not directly exposed through {@link CustomizationConfig} at the
 * moment. Instead several pre-canned customizations use this under the hood but expose limited
 * functionality for overloading setters. This decision was made to discourage use of overloaded
 * types and instead model the member in a more natural way to begin with. In the future we may
 * either decide to fully expose this customization or just add more pre-canned settings as the need
 * arises
 * </p>
 * <p>
 * Currently this does not support overloads for List or Map types but it could be easily
 * implemented in the Generator.
 * </p>
 */
public class ConvenienceTypeOverload {

    /**
     * Name of the shape this customization applies to
     */
    private String shapeName;

    /**
     * Name of the member this customization applies to
     */
    private String memberName;

    /**
     * Convenience type to generate an overload for
     */
    private String convenienceType;

    /**
     * Fully qualified adapter class that can convert from the convenience type to the actual type
     */
    private String typeAdapterFqcn;

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public ConvenienceTypeOverload withShapeName(String shapeName) {
        this.shapeName = shapeName;
        return this;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public ConvenienceTypeOverload withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    public String getConvenienceType() {
        return convenienceType;
    }

    public void setConvenienceType(String convenienceType) {
        this.convenienceType = convenienceType;
    }

    public ConvenienceTypeOverload withConvenienceType(String convenienceType) {
        this.convenienceType = convenienceType;
        return this;
    }

    public String getTypeAdapterFqcn() {
        return typeAdapterFqcn;
    }

    public void setTypeAdapterFqcn(String typeAdapterFqcn) {
        this.typeAdapterFqcn = typeAdapterFqcn;
    }

    public ConvenienceTypeOverload withTypeAdapterFqcn(String typeAdapterFqcn) {
        this.typeAdapterFqcn = typeAdapterFqcn;
        return this;
    }

    /**
     * @param shape
     *            Current shape
     * @param member
     *            Current member
     * @return True if the {@link ConvenienceTypeOverload} applies. False otherwise
     */
    public boolean accepts(ShapeModel shape, MemberModel member) {
        return shape.getC2jName().equals(shapeName) && member.getC2jName().equals(memberName);
    }
}
