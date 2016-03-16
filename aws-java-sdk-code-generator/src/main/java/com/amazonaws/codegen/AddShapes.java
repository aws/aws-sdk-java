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

package com.amazonaws.codegen;

import com.amazonaws.codegen.internal.NameUtils;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.*;
import com.amazonaws.codegen.model.intermediate.ParameterHttpMapping.Location;
import com.amazonaws.codegen.model.service.Member;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.codegen.model.service.Shape;
import com.amazonaws.util.StringUtils;

import java.util.List;
import java.util.Map;

import static com.amazonaws.codegen.internal.DocumentationUtils.generateGetterDocumentation;
import static com.amazonaws.codegen.internal.DocumentationUtils.generateSetterDocumentation;
import static com.amazonaws.codegen.internal.NameUtils.getEnumName;
import static com.amazonaws.codegen.internal.NameUtils.getVariableName;
import static com.amazonaws.codegen.internal.TypeUtils.*;
import static com.amazonaws.codegen.internal.Utils.*;

abstract class AddShapes {
    private final ServiceModel serviceModel;
    private final CustomizationConfig customConfig;

    AddShapes(ServiceModel serviceModel, CustomizationConfig customizationConfig) {
        this.serviceModel = serviceModel;
        this.customConfig = customizationConfig;
    }

    protected final ServiceModel getServiceModel() {
        return serviceModel;
    }

    protected final CustomizationConfig getCustomizationConfig() {
        return customConfig;
    }

    protected final ShapeModel generateShapeModel(String javaClassName, String shapeName) {
        final ShapeModel shapeModel = new ShapeModel(shapeName);
        shapeModel.setShapeName(javaClassName);
        final Shape shape = serviceModel.getShapes().get(shapeName);

        shapeModel.setDocumentation(shape.getDocumentation());
        shapeModel.setVariable(new VariableModel(
                getVariableName(javaClassName),
                javaClassName));
        // contains the list of c2j member names that are required for this shape.
        shapeModel.setRequired(shape.getRequired());
        shapeModel.setDeprecated(shape.isDeprecated());

        boolean hasHeaderMember = false;
        boolean hasStatusCodeMember = false;
        boolean hasPayloadMember = false;
        boolean hasStreamingMember = false;

        final Map<String, Member> members = shape.getMembers();

        if (members != null) {
            for (Map.Entry<String, Member> memberEntry : members.entrySet()) {

                String c2jMemberName = memberEntry.getKey();
                Member c2jMemberDefinition = memberEntry.getValue();
                Shape parentShape = shape;

                MemberModel memberModel = generateMemberModel(
                        c2jMemberName,
                        c2jMemberDefinition,
                        getProtocol(),
                        parentShape,
                        serviceModel.getShapes());

                if (memberModel.getHttp().getLocation() == Location.HEADER) {
                    hasHeaderMember = true;

                } else if (memberModel.getHttp().getLocation() == Location.STATUS_CODE) {
                    hasStatusCodeMember = true;

                } else if (memberModel.getHttp().getIsPayload()) {
                    hasPayloadMember = true;
                    if(memberModel.getHttp().getIsStreaming()) {
                        hasStreamingMember = true;
                    }
                }

                shapeModel.addMember(memberModel);
            }

            shapeModel.withHasHeaderMember(hasHeaderMember)
                    .withHasStatusCodeMember(hasStatusCodeMember)
                    .withHasPayloadMember(hasPayloadMember)
                    .withHasStreamingMember(hasStreamingMember);
        }

        final List<String> enumValues = shape.getEnumValues();
        if (enumValues != null && !enumValues.isEmpty()) {
            for (String enumValue : enumValues) {
                // TODO handle useRealName from Coral if explicitly mentioned in
                // the customization.
                shapeModel.addEnum(new EnumModel(getEnumName(enumValue),
                        enumValue));
            }
        }

        return shapeModel;
    }

    private MemberModel generateMemberModel(
            String c2jMemberName,
            Member c2jMemberDefinition,
            String protocol,
            Shape parentShape,
            Map<String, Shape> allC2jShapes) {
        final String c2jShapeName = c2jMemberDefinition.getShape();
        final String variableName = getVariableName(c2jMemberName);
        final String variableType = getJavaDataType(allC2jShapes, c2jShapeName);
        final String variableDeclarationType = getJavaDataType(allC2jShapes, c2jShapeName, customConfig);

        //If member is idempotent, then it should be of string type
        //Else throw IllegalArgumentException.
        if(c2jMemberDefinition.isIdempotencyToken() && !variableType.equals(String.class.getSimpleName())) {
            throw new IllegalArgumentException(
                    c2jMemberName + " is idempotent. It's shape should be string type but it is of "
                            + variableType + " type.");
        }


        final MemberModel memberModel = new MemberModel();

        memberModel.withC2jName(c2jMemberName)
                   .withC2jShape(c2jShapeName)
                   .withName(capitialize(c2jMemberName))
                   .withVariable(new VariableModel(variableName, variableType, variableDeclarationType)
                                       .withDocumentation(c2jMemberDefinition.getDocumentation()))
                   .withSetterModel(new VariableModel(variableName, variableType, variableDeclarationType)
                                        .withDocumentation(generateSetterDocumentation()))
                   .withGetterModel(new ReturnTypeModel(variableType)
                                           .withDocumentation(generateGetterDocumentation()));
        memberModel.setDocumentation(c2jMemberDefinition.getDocumentation());
        memberModel.setDeprecated(c2jMemberDefinition.isDeprecated());

        memberModel.setIdempotencyToken(c2jMemberDefinition.isIdempotencyToken());

        // Pass the xmlNameSpace from the member reference
        if (c2jMemberDefinition.getXmlNamespace() != null) {
            memberModel.setXmlNameSpaceUri(c2jMemberDefinition.getXmlNamespace().getUri());
        }

        // Additional member model metadata for list/map/enum types
        fillContainerTypeMemberMetadata(
                allC2jShapes,
                c2jMemberDefinition.getShape(),
                memberModel,
                protocol);

        final ParameterHttpMapping httpMapping = generateParameterHttpMapping(
                c2jMemberName, c2jMemberDefinition, protocol, allC2jShapes);

        final String payload = parentShape.getPayload();
        httpMapping
                .withPayload(payload != null && payload.equals(c2jMemberName))
                .withStreaming(allC2jShapes.get(c2jMemberDefinition.getShape()).isStreaming());

        memberModel.setHttp(httpMapping);

        return memberModel;
    }

    private ParameterHttpMapping generateParameterHttpMapping(
                                                                     String memberName,
                                                                     Member member,
                                                                     String protocol,
                                                                     Map<String, Shape> allC2jShapes) {

        ParameterHttpMapping mapping = new ParameterHttpMapping();

        Shape memberShape = allC2jShapes.get(member.getShape());

        mapping.withLocation(Location.forValue(member.getLocation()))
                .withPayload(member.isPayload())
                .withStreaming(member.isStreaming())
                .withFlattened(member.isFlattened() || memberShape.isFlattened())
                .withUnmarshallLocationName(deriveUnmarshallerLocationName(
                        memberName, member))
                .withMarshallLocationName(deriveMarshallerLocationName(
                        memberName, member, protocol));

        return mapping;
    }

    private String deriveUnmarshallerLocationName(String memberName,
                                                         Member member) {

        final String locationName = member.getLocationName();

        if (locationName != null && !locationName.trim().isEmpty()) {
            return locationName;
        }

        return memberName;
    }

    private String deriveMarshallerLocationName(String memberName,
                                                       Member member, String protocol) {
        final String queryName = member.getQueryName();
        if (queryName != null && !queryName.trim().isEmpty()) {
            return queryName;
        } else {
            final String locationName = member.getLocationName();
            if (locationName != null && !locationName.trim().isEmpty()) {
                if (protocol.equals(Protocol.EC2.getValue())) {
                    return StringUtils.upperCase(locationName.substring(0, 1))
                            + locationName.substring(1);
                }
                return locationName;
            } else {
                return memberName;
            }
        }
    }

    private void fillContainerTypeMemberMetadata(
                                                        Map<String, Shape> c2jShapes,
                                                        String memberC2jShapeName,
                                                        MemberModel memberModel,
                                                        String protocol) {

        final Shape memberC2jShape = c2jShapes.get(memberC2jShapeName);

        if (isListShape(memberC2jShape)) {

            MemberModel listMemberModel = null;

            Member listMemberDefinition = memberC2jShape.getListMember();
            String listMemberC2jShapeName = listMemberDefinition.getShape();
            Shape listMemberC2jShape = c2jShapes.get(listMemberC2jShapeName);

            // Only construct the nested member model if the member of the list
            // itself is not scalar or is Enum shape.

            if (!isScalar(listMemberC2jShape) || isEnumShape(listMemberC2jShape)) {
                listMemberModel = generateMemberModel(
                        "member",
                        listMemberDefinition,
                        protocol,
                        memberC2jShape,
                        c2jShapes);
            }
            final String listImpl = customConfig.isUseAutoConstructList()
                    ? getDataTypeMapping(LIST_AUTO_CONSTRUCT_IMPL)
                    : getDataTypeMapping(LIST_DEFAULT_IMPL)
                    ;
            memberModel.setListModel(new ListModel(
                    getJavaDataType(
                            c2jShapes,
                            listMemberC2jShapeName),
                    memberC2jShape.getListMember().getLocationName(),
                    listImpl,
                    getDataTypeMapping(LIST_INTERFACE),
                    listMemberModel));

            if (listMemberC2jShape.getEnumValues() != null) {
                memberModel.setEnumType(NameUtils.getJavaClassName(listMemberC2jShapeName));
            }
        } else if (isMapShape(memberC2jShape)) {

            MemberModel mapKeyModel = null;
            MemberModel mapValueModel = null;

            Member mapKeyMemberDefinition = memberC2jShape.getMapKeyType();
            String mapKeyShapeName = mapKeyMemberDefinition.getShape();
            Shape mapKeyShape = c2jShapes.get(mapKeyShapeName);

            Member mapValueMemberDefinition = memberC2jShape.getMapValueType();
            String mapValueShapeName = mapValueMemberDefinition.getShape();
            Shape mapValueShape = c2jShapes.get(mapValueShapeName);

            // Only construct the nested key model if the key of the map
            // itself is Enum shape. Throw exception if the nested key type is complex
            // because we don't support complex map keys.
            if (isEnumShape(mapKeyShape)) {
                mapKeyModel = generateMemberModel(
                        "key",
                        mapKeyMemberDefinition,
                        protocol,
                        memberC2jShape,
                        c2jShapes);
            } else if (!isScalar(mapKeyShape)) {
                throw new IllegalStateException("The key type of "+ mapKeyShapeName +" must be a scalar!");
            }
            // Only construct the nested value model if the value of the map
            // itself is not scalar or is Enum shape.
            if (!isScalar(mapValueShape) || isEnumShape(mapValueShape)) {
                mapValueModel = generateMemberModel(
                        "value",
                        mapValueMemberDefinition,
                        protocol,
                        memberC2jShape,
                        c2jShapes);
            }
            final String mapImpl = customConfig.isUseAutoConstructMap()
                    ? getDataTypeMapping(MAP_AUTO_CONSTRUCT_IMPL)
                    : getDataTypeMapping(MAP_DEFAULT_IMPL)
                    ;

            String keyLocation = memberC2jShape.getMapKeyType().getLocationName() != null
                    ? memberC2jShape.getMapKeyType().getLocationName()
                    : "key";

            String valueLocation = memberC2jShape.getMapValueType().getLocationName() != null
                    ? memberC2jShape.getMapValueType().getLocationName()
                    : "value";

            memberModel.setMapModel(new MapModel(
                    mapImpl,
                    getDataTypeMapping(MAP_INTERFACE),
                    getJavaDataType(
                            c2jShapes,
                            memberC2jShape.getMapKeyType().getShape()),
                    keyLocation,
                    mapKeyModel,
                    getJavaDataType(
                            c2jShapes,
                            memberC2jShape.getMapValueType().getShape()),
                    valueLocation,
                    mapValueModel));

        } else if (memberC2jShape.getEnumValues() != null) { // enum values
            memberModel.withEnumType(NameUtils.getJavaClassName(memberC2jShapeName));
        }
    }

    protected String getProtocol() {
        return getServiceModel().getMetadata().getProtocol();
    }
}
