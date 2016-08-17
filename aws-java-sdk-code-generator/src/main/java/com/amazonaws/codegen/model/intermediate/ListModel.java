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

public class ListModel {

    private final String implType;

    private final String memberType;

    private final String interfaceType;

    private final MemberModel listMemberModel;

    private final String memberLocationName;

    private String memberAdditionalMarshallingPath;

    private String memberAdditionalUnmarshallingPath;

    /**
     * Whether force to send empty Query String to wire.
     */
    private boolean sendEmptyQueryString;

    private boolean marshallNonAutoConstructedEmptyLists;

    public ListModel(
            @JsonProperty("memberType") String memberType,
            @JsonProperty("memberLocationName") String memberLocationName,
            @JsonProperty("implType") String implType,
            @JsonProperty("interfaceType") String interfaceType,
            @JsonProperty("listMemberModel")  MemberModel listMemberModel) {

        this.memberType = memberType;
        this.memberLocationName = memberLocationName;
        this.implType = implType;
        this.interfaceType = interfaceType;
        this.listMemberModel = listMemberModel;
        this.sendEmptyQueryString = false;
    }

    public String getImplType() {
        return implType;
    }

    public String getMemberType() {
        return memberType;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public MemberModel getListMemberModel() {
        return listMemberModel;
    }

    public String getMemberLocationName() {
        return memberLocationName;
    }

    public String getMemberAdditionalMarshallingPath() {
        return memberAdditionalMarshallingPath;
    }

    public void setMemberAdditionalMarshallingPath(
            String memberAdditionalMarshallingPath) {
        this.memberAdditionalMarshallingPath = memberAdditionalMarshallingPath;
    }

    public String getMemberAdditionalUnmarshallingPath() {
        return memberAdditionalUnmarshallingPath;
    }

    public void setMemberAdditionalUnmarshallingPath(
            String memberAdditionalUnmarshallingPath) {
        this.memberAdditionalUnmarshallingPath = memberAdditionalUnmarshallingPath;
    }

    public boolean isSendEmptyQueryString() {
        return sendEmptyQueryString;
    }

    public void setSendEmptyQueryString(boolean sendEmptyQueryString) {
        this.sendEmptyQueryString = sendEmptyQueryString;
    }

    public boolean isMarshallNonAutoConstructedEmptyLists() {
        return marshallNonAutoConstructedEmptyLists;
    }

    public void setMarshallNonAutoConstructedEmptyLists(
            boolean marshallNonAutoConstructedEmptyLists) {
        this.marshallNonAutoConstructedEmptyLists = marshallNonAutoConstructedEmptyLists;
    }

    public boolean isSimple() {
        return TypeUtils.isSimple(memberType);
    }

    public boolean isMap() {
        return memberType.startsWith(TypeUtils
                .getDataTypeMapping(TypeUtils.MAP_INTERFACE));
    }

    public String getTemplateType() {
        return interfaceType + "<" + memberType + ">";
    }

    public String getTemplateImplType() {
        return implType + "<" + memberType + ">";
    }

    public String getSimpleType() {
        int startIndex = memberType.lastIndexOf(".");
        return memberType.substring(startIndex + 1, memberType.length());
    }
}
