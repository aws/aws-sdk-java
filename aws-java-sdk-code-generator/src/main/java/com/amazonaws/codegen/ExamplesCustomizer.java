/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.codegen;

import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.config.customization.ShapeModifier;
import com.amazonaws.codegen.model.config.customization.ShapeModifier_ModifyModel;
import com.amazonaws.codegen.model.config.customization.ShapeSubstitution;
import com.amazonaws.codegen.model.intermediate.Example;
import com.amazonaws.codegen.model.intermediate.ServiceExamples;
import com.amazonaws.codegen.model.service.Input;
import com.amazonaws.codegen.model.service.Member;
import com.amazonaws.codegen.model.service.Operation;
import com.amazonaws.codegen.model.service.Output;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.codegen.model.service.Shape;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Transforms the examples so that they are in line with any shape related
 * customizations for the given service.
 */
public class ExamplesCustomizer {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private final ServiceModel serviceModel;
    private final CustomizationConfig customizationConfig;

    public ExamplesCustomizer(ServiceModel serviceModel, CustomizationConfig customizationConfig) {
        this.serviceModel = serviceModel;
        this.customizationConfig = customizationConfig;
    }

    /**
     * Apply the configured {@link CustomizationConfig} to the given service
     * examples.
     *
     * @param serviceExamples The service examples.
     *
     * @return The customized service examples.
     */
    public ServiceExamples applyCustomizationsToExamples(ServiceExamples serviceExamples) {
        if (customizationConfig == null) return serviceExamples;

        serviceExamples.getOperationExamples().entrySet()
                .forEach(e -> {
                    String operationName = e.getKey();
                    Operation operation = serviceModel.getOperation(operationName);
                    e.getValue().forEach(example -> applyCustomizationsToExample(example, operation));
                });
        return serviceExamples;
    }

    private Example applyCustomizationsToExample(Example example, Operation operation) {
        if (example == null) return null;

        System.out.println(String.format("Customizing operation example : %s", example.getId()));

        Input input = operation.getInput();
        if (input != null) {
            String inputShapeName = input.getShape();
            Shape inputShape = serviceModel.getShape(inputShapeName);
            JsonNode inputValue = example.getInput();

            example.setInput(applyCustomizationsToShapeJson(inputShapeName, inputShape, inputValue));
        }

        Output output = operation.getOutput();
        if (output != null) {
            String outputShapeName = output.getShape();
            Shape outputShape = serviceModel.getShape(outputShapeName);
            JsonNode outputValue = example.getOutput();

            example.setOutput(applyCustomizationsToShapeJson(outputShapeName, outputShape, outputValue));
        }

        return example;
    }

    /**
     * Recursively apply any declared customizations to this JSON value
     * according to the given shape and the customizations declared for the
     * shape.
     *
     * @param shapeName The name of the shape.
     * @param shape The shape of the JSON value.
     * @param valueNode The JSON value to customize.
     *
     * @return The customized JSON value.
     */
    private JsonNode applyCustomizationsToShapeJson(String shapeName, Shape shape, JsonNode valueNode) {
        // Don't bother going any further if we're not dealing with an array or
        // object JSON node; there's not much we can do to "massage" this value
        if (valueNode == null || !valueNode.isContainerNode()) {
            return valueNode;
        }

        // Apply modifications first
        valueNode = applyModificationsToShapeJson(shapeName, valueNode);

        ShapeSubstitution shapeSub = null;
        if (customizationConfig.getShapeSubstitutions() != null) {
            shapeSub = customizationConfig.getShapeSubstitutions().get(shapeName);
        }

        if (shapeSub != null) {
            String substituteShapeName = shapeSub.getEmitAsShape();
            Shape substituteShape = serviceModel.getShape(substituteShapeName);
            JsonNode substituteValue = valueNode;
            if (shapeSub.getEmitFromMember() != null) {
                substituteValue = valueNode.get(shapeSub.getEmitFromMember());
                if (substituteValue == null) {
                    System.err.println(String.format("Warning: Substituting shape '%s' for its"
                                    + " member '%s' as shape '%s' produced null value. Original"
                                    + " value: %s", shapeName, shapeSub.getEmitFromMember(),
                            substituteShapeName, valueNode.toString()));
                }
            }
            System.out.println(String.format("Substituting shape %s with %s. %s -> %s", shapeName,
                    substituteShapeName, valueNode.toString(), Objects.toString(substituteValue)));

            return applyCustomizationsToShapeJson(substituteShapeName, substituteShape, substituteValue);
        } else {
            switch (shape.getType()) {
                // Apply customizations to each member
                case "map":
                case "structure": {
                    if (shape.getMembers() == null) {
                        return valueNode;
                    }

                    ObjectNode obj = MAPPER.createObjectNode();

                    for (Map.Entry<String, Member> e : shape.getMembers().entrySet()) {
                        Member member = e.getValue();
                        String memberName = e.getKey();
                        String memberShapeName = member.getShape();
                        Shape memberShape = serviceModel.getShape(memberShapeName);
                        JsonNode memberValue = valueNode.get(memberName);

                        // Only set if it's not null, otherwise the generated
                        // sample code could potentially have lots of
                        // unnecessary 'withProperty(null)' calls.
                        if (memberValue != null) {
                            obj.set(memberName, applyCustomizationsToShapeJson(memberShapeName,
                                                    memberShape, memberValue));
                        }
                    }

                    return obj;
                }

                // Apply customizations to each element
                case "list": {
                    ArrayNode list = MAPPER.createArrayNode();

                    String memberShapeName = shape.getListMember().getShape();
                    Shape memberShape = serviceModel.getShape(memberShapeName);

                    for (JsonNode e : valueNode) {
                        // apply any customizations to the list elements
                        list.add(applyCustomizationsToShapeJson(memberShapeName, memberShape, e));
                    }

                    return list;
                }
                default:
                    throw new RuntimeException("Unknown shape type: " + shape.getType());
            }
        }
    }

    private JsonNode applyModificationsToShapeJson(String shapeName, JsonNode valueNode) {
        if (customizationConfig.getShapeModifiers() == null) return valueNode;

        ShapeModifier allShapeMode = customizationConfig.getShapeModifiers().get("*");
        ShapeModifier shapeMod = customizationConfig.getShapeModifiers().get(shapeName);

        valueNode = applyShapeModifier(valueNode, allShapeMode);
        valueNode = applyShapeModifier(valueNode, shapeMod);

        return valueNode;
    }

    /**
     * Apply any shape modifiers to the JSON value. This only takes care of
     * 'exclude' and 'emitPropertyName'.
     *
     * @param node The JSON node.
     * @param modifier The shape modifier.
     * @return The modified node.
     */
    private JsonNode applyShapeModifier(JsonNode node, ShapeModifier modifier) {
        if (node == null || modifier == null) {
            return node;
        }

        if (modifier.getExclude() == null && modifier.getModify() == null) {
            return node;
        }

        if (!node.isObject()) return node;

        final ObjectNode obj = (ObjectNode) node;

        ObjectNode modified = MAPPER.createObjectNode();
        // Filter any excluded members
        final List<String> excludes = modifier.getExclude() != null ? modifier.getExclude() : Collections.emptyList();
        obj.fieldNames().forEachRemaining(m -> {
            if (!excludes.contains(m)) {
                modified.set(m, obj.get(m));
            }
        });
        // Apply property renames
        final List<Map<String, ShapeModifier_ModifyModel>> modify = modifier.getModify() != null ? modifier.getModify() : Collections.emptyList();
        modify.forEach(memberMods ->
            memberMods.entrySet().forEach(memberMod -> {
                String memberName = memberMod.getKey();
                ShapeModifier_ModifyModel modelModify = memberMod.getValue();
                if (modelModify.getEmitPropertyName() != null) {
                    String newName = modelModify.getEmitPropertyName();
                    modified.set(newName, modified.get(memberName));
                    modified.remove(memberName);
                    memberName = newName;
                }
            })
        );

        return modified;
    }
}
