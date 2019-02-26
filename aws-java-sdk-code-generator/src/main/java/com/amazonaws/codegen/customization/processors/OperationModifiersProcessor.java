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
import com.amazonaws.codegen.internal.Constants;
import com.amazonaws.codegen.model.config.customization.OperationModifier;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.intermediate.MemberModel;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.intermediate.customization.ArtificialResultWrapper;
import com.amazonaws.codegen.model.service.Member;
import com.amazonaws.codegen.model.service.Operation;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.codegen.model.service.Shape;
import com.amazonaws.codegen.model.service.ShapeTypes;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * This processor internally keeps track of all the result wrapper shapes it
 * created during pre-processing, therefore the caller needs to make sure this
 * processor is only invoked once.
 */
final class OperationModifiersProcessor implements CodegenCustomizationProcessor {

    private final Map<String, OperationModifier> operationModifiers;

    private final Set<String> createdWrapperShapes = new HashSet<String>();

    OperationModifiersProcessor(Map<String, OperationModifier> operationModifiers) {
        this.operationModifiers = operationModifiers;
    }

    @Override
    public void preprocess(ServiceModel serviceModel) {

        if (operationModifiers == null) return;

        for (Entry<String, OperationModifier> entry : operationModifiers.entrySet()) {
            String operationName = entry.getKey();
            OperationModifier modifier = entry.getValue();

            if (modifier.isExclude()) {
                preprocess_Exclude(serviceModel, operationName);
                continue;
            }

            if (modifier.isUseWrappingResult()) {
                String createdWrapperShape = preprocess_CreateResultWrapperShape(
                        serviceModel, operationName, modifier);
                // Keep track of all the wrappers we created
                createdWrapperShapes.add(createdWrapperShape);
                continue;
            }
        }

    }

    @Override
    public void postprocess(IntermediateModel intermediateModel) {

        if (operationModifiers == null) return;

        // Find all the wrapper shapes in the intermediate model (by its
        // "original" c2j name), and add the customization metadata

        for (ShapeModel shape : intermediateModel.getShapes().values()) {

            if ( !createdWrapperShapes.contains(shape.getC2jName()) ) {
                continue;
            }

            if (shape.getMembers().size() != 1) {
                throw new IllegalStateException("Result wrapper "
                        + shape.getShapeName() + " has not just one member!");
            }

            MemberModel wrappedMember = shape.getMembers().get(0);

            /*
             * "RunInstancesResult" : {
             *   "customization" : {
             *     "artificialResultWrapper" : {
             *       "wrappedMemberName" : "Reservation",
             *       "wrappedMemberSimpleType" : "Reservation"
             *     }
             *   }
             * }
             */
            shape.getCustomization().setArtificialResultWrapper(
                    createArtificialResultWrapperInfo(
                            shape, wrappedMember));
        }
    }

    private void preprocess_Exclude(ServiceModel serviceModel, String operationName) {
        serviceModel.getOperations().remove(operationName);
    }

    private String preprocess_CreateResultWrapperShape(ServiceModel serviceModel,
            String operationName, OperationModifier modifier) {

        String wrappedShapeName = modifier.getWrappedResultShape();
        Shape wrappedShape = serviceModel.getShapes().get(wrappedShapeName);

        String wrapperShapeName = operationName + Constants.RESPONSE_CLASS_SUFFIX;
        String wrappedAsMember = modifier.getWrappedResultMember();

        if (serviceModel.getShapes().containsKey(wrapperShapeName)) {
            throw new IllegalStateException(wrapperShapeName
                    + " shape already exists in the service model.");
        }

        Shape wrapperShape = createWrapperShape(wrapperShapeName,
                wrappedShapeName, wrappedShape, wrappedAsMember);

        // Add the new shape to the model
        serviceModel.getShapes().put(wrapperShapeName, wrapperShape);

        // Update the operation model to point to this new shape
        Operation operation = serviceModel.getOperations().get(operationName);
        operation.getOutput().setShape(wrapperShapeName);

        return wrapperShapeName;
    }

    private Shape createWrapperShape(String wrapperShapeName, String wrappedShapeName, Shape wrapped, String wrappedAsMember) {

        Shape wrapper = new Shape();
        wrapper.setType(ShapeTypes.Structure.getName());
        wrapper.setDocumentation("A simple result wrapper around the "
                + wrappedShapeName + " object that was sent over the wire.");

        Member member = new Member();
        member.setShape(wrappedShapeName);
        member.setDocumentation(wrapped.getDocumentation());
        wrapper.setMembers(Collections.singletonMap(wrappedAsMember, member));

        return wrapper;
    }

    private ArtificialResultWrapper createArtificialResultWrapperInfo(ShapeModel shape, MemberModel wrappedMember) {
        ArtificialResultWrapper wrapper = new ArtificialResultWrapper();
        wrapper.setWrappedMemberName(wrappedMember.getName());
        wrapper.setWrappedMemberSimpleType(wrappedMember.getVariable().getSimpleType());
        return wrapper;
    }
}
