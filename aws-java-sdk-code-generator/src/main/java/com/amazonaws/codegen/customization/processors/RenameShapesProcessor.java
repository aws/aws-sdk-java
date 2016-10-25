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

package com.amazonaws.codegen.customization.processors;

import com.amazonaws.codegen.customization.CodegenCustomizationProcessor;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.service.ErrorMap;
import com.amazonaws.codegen.model.service.Input;
import com.amazonaws.codegen.model.service.Member;
import com.amazonaws.codegen.model.service.Operation;
import com.amazonaws.codegen.model.service.Output;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.codegen.model.service.Shape;

import java.util.Map;
import java.util.Map.Entry;

public class RenameShapesProcessor implements CodegenCustomizationProcessor {

    private final Map<String, String> renameShapes;

    public RenameShapesProcessor(Map<String, String> renameShapes) {
        this.renameShapes = renameShapes;
    }

    /**
     * Rename shapes for Member, Input, Output, ErrorMap, as well as the key for two maps:
     * serviceModel.shape() and shapeModifiers
     */
    @Override
    public void preprocess(ServiceModel serviceModel) {

        if (renameShapes == null || renameShapes.isEmpty()) return;
        // sanity check
        for (Entry<String, String> entry : renameShapes.entrySet()) {

            String originalName = entry.getKey();
            String newName = entry.getValue();
            Shape originalShape = serviceModel.getShapes().get(originalName);

            if (originalShape == null) {
                throw new IllegalStateException(
                        String.format("Cannot find shape [%s] in the model when processing "
                                + "customization config renameShapes.%s", originalName, originalName));
            }
            if (serviceModel.getShapes().containsKey(newName)) {
                throw new IllegalStateException(
                        String.format("The shape [%s] for the new name is already in the model when processing "
                                + "customization config renameShapes.%s", newName, originalName));
            }
        }

        for (Entry<String, Shape> entry : serviceModel.getShapes().entrySet()) {
            String shapeName = entry.getKey();
            Shape shape = entry.getValue();

            preprocess_RenameMemberShapes(shapeName, shape);
        }
        for (Operation operation : serviceModel.getOperations().values()) {

            if (operation.getInput() != null) {
                preprocess_RenameInputShape(operation.getInput());
            }
            if (operation.getOutput() != null) {
                preprocess_RenameOutputShape(operation.getOutput());
            }
            if (operation.getErrors() != null) {
                for (ErrorMap error : operation.getErrors()) {
                    preprocess_RenameErrorShape(error);
                }
            }
        }
        for (Entry<String, String> entry : renameShapes.entrySet()) {
            String originalName = entry.getKey();
            String newName = entry.getValue();

            Shape shape = serviceModel.getShapes().remove(originalName);
            serviceModel.getShapes().put(newName, shape);
        }
    }

    @Override
    public void postprocess(IntermediateModel intermediateModel) {
        // do nothing
    }

    /**
     * Rename all the member shapes within this shape
     */
    private void preprocess_RenameMemberShapes(String shapeName, Shape shape) {
        if (shape.getListMember() != null) {
            preprocess_RenameMemberShape(shape.getListMember());
        }
        if (shape.getMapKeyType() != null) {
            preprocess_RenameMemberShape(shape.getMapKeyType());
        }
        if (shape.getMapValueType() != null) {
            preprocess_RenameMemberShape(shape.getMapValueType());
        }
        if (shape.getMembers() != null) {
            for (Entry<String, Member> entry : shape.getMembers().entrySet()) {
                preprocess_RenameMemberShape(entry.getValue());
            }
        }
    }

    private void preprocess_RenameMemberShape(Member member) {
        if (renameShapes.containsKey(member.getShape())) {
            member.setShape(renameShapes.get(member.getShape()));
        }
    }

    private void preprocess_RenameErrorShape(ErrorMap error) {
        if (renameShapes.containsKey(error.getShape())) {
            error.setShape(renameShapes.get(error.getShape()));
        }
    }

    private void preprocess_RenameOutputShape(Output output) {
        if (renameShapes.containsKey(output.getShape())) {
            output.setShape(renameShapes.get(output.getShape()));
        }
    }

    private void preprocess_RenameInputShape(Input input) {
        if (renameShapes.containsKey(input.getShape())) {
            input.setShape(renameShapes.get(input.getShape()));
        }
    }

}
