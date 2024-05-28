/*
 * Copyright (c) 2021. Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.codegen.internal.Utils.isListShape;
import static com.amazonaws.codegen.internal.Utils.isMapShape;

import com.amazonaws.codegen.customization.CodegenCustomizationProcessor;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.service.ErrorMap;
import com.amazonaws.codegen.model.service.Member;
import com.amazonaws.codegen.model.service.Operation;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.codegen.model.service.Shape;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

/**
 * Prunes shapes that are explicitly not supported by Java SDK v1.
 */
public class PruneUnsupportedShapesProcessor implements CodegenCustomizationProcessor {

    private static final List<Predicate<Shape>> PRUNE_CONDITIONS = Collections.singletonList(
        Shape::isDocument
    );
    private final CustomizationConfig config;

    public PruneUnsupportedShapesProcessor(CustomizationConfig config) {
        this.config = config;
    }

    @Override
    public void preprocess(ServiceModel serviceModel) {
        pruneShapesThatMatchConditions(serviceModel);
        doWhileShapesRemoved(serviceModel, () -> {
            pruneCollectionShapes(serviceModel);
            pruneShapeMembers(serviceModel);
        });
        pruneOperationsAndErrors(serviceModel);
    }

    @Override
    public void postprocess(IntermediateModel intermediateModel) {
        // do nothing
    }

    /**
     * Prune top-level shapes that match any of the provided {@link #PRUNE_CONDITIONS}.
     */
    private void pruneShapesThatMatchConditions(ServiceModel serviceModel) {
        Map<String, Shape> shapes = copy(serviceModel.getShapes());
        serviceModel.getShapes().forEach((shapeName, shape) -> {
            if (PRUNE_CONDITIONS.stream().anyMatch(p -> p.test(shape) && !config.getShapesToSkipPruning().contains(shapeName))) {
                shapes.remove(shapeName);
                log("Pruned shape [%s] that matched prune condition", shapeName);
            }
        });
        serviceModel.setShapes(shapes);
    }

    /**
     * Repeatedly invoke the provided {@link Runnable} as long as the {@link ServiceModel}
     * continues to have {@link Shape}s removed. Running repeatedly allows for a recursive
     * removal of shapes that point to just-pruned shapes.
     */
    private static void doWhileShapesRemoved(ServiceModel serviceModel, Runnable runnable) {
        int numShapes;
        do {
            numShapes = serviceModel.getShapes().size();
            runnable.run();
        } while (serviceModel.getShapes().size() < numShapes);
    }

    /**
     * Prune collection shapes (lists and maps) that target pruned shapes as their member type.
     */
    private static void pruneCollectionShapes(ServiceModel serviceModel) {
        Map<String, Shape> shapes = copy(serviceModel.getShapes());
        serviceModel.getShapes().forEach((shapeName, shape) -> {
            if (isCollectionOfPrunedShape(shape, shapes)) {
                shapes.remove(shapeName);
                log("Pruned collection-shape [%s]", shapeName);
            }
        });
        serviceModel.setShapes(shapes);
    }

    /**
     * Is the shape a collection-type that targets a pruned shape as one of its member types?
     */
    private static boolean isCollectionOfPrunedShape(Shape shape, Map<String, Shape> shapes) {
        if (isListShape(shape) &&
            !shapes.containsKey(shape.getListMember().getShape())) {
            return true;
        }
        if (isMapShape(shape) &&
            (!shapes.containsKey(shape.getMapKeyType().getShape()) ||
             !shapes.containsKey(shape.getMapValueType().getShape()))) {
            return true;
        }
        return false;
    }

    /**
     * Prune members that reference pruned shapes.
     * <p>
     * If a member is required, we also prune the containing struct, because this implicitly
     * means that member was added as part of a new struct, which we do not wish to support.
     * <p>
     * If a member is optional, this may mean it was added to an existing struct,
     * so we bias towards removing the member only.
     */
    private static void pruneShapeMembers(ServiceModel serviceModel) {
        Map<String, Shape> shapes = copy(serviceModel.getShapes());
        serviceModel.getShapes().forEach((shapeName, shape) -> {

            Map<String, Member> members = copy(shape.getMembers());
            for (Entry<String, Member> entry : shape.getMembers().entrySet()) {
                String memberName = entry.getKey();
                Member member = entry.getValue();
                if (!shapes.containsKey(member.getShape())) {
                    if (shape.getRequired().contains(memberName)) {
                        // If member is required, remove the entire containing shape
                        shapes.remove(shapeName);
                        log("Pruned shape [%s] with required member [%s]", shapeName, memberName);
                        // Skip these rest of these members & continue to the next shape
                        break;
                    } else {
                        // If member is optional, just remove the member
                        members.remove(memberName);
                        log("Pruned optional member [%s] from shape [%s]", memberName, shapeName);
                        // If the containing shape had a payload referencing this member, remove the payload trait
                        if (memberName.equals(shape.getPayload())) {
                            shape.setPayload(null);
                            log("Pruned payload trait for member [%s] from shape [%s]", memberName, shapeName);
                        }
                    }
                }
            }
            shape.setMembers(members);

        });
        serviceModel.setShapes(shapes);
    }

    /**
     * Prune operations that have had either their entire input or output shape pruned.
     * <p>
     * Also prune any operation-level errors that have had their corresponding shape pruned.
     */
    private static void pruneOperationsAndErrors(ServiceModel serviceModel) {
        Map<String, Shape> shapes = serviceModel.getShapes();
        Map<String, Operation> operations = copy(serviceModel.getOperations());
        serviceModel.getOperations().forEach((operationName, operation) -> {
            // Remove operation if Input shape has been pruned
            if (operation.getInput() != null) {
                String inputShape = operation.getInput().getShape();
                if (!shapes.containsKey(inputShape)) {
                    operations.remove(operationName);

                    if (operation.getOutput() != null) {
                        shapes.remove(operation.getOutput().getShape());
                    }

                    log("Pruned operation [%s] with input shape [%s]", operationName, inputShape);
                    return;
                }
            }
            // Remove operation if Output shape has been pruned
            if (operation.getOutput() != null) {
                String outputShape = operation.getOutput().getShape();
                if (!shapes.containsKey(outputShape)) {
                    operations.remove(operationName);

                    if (operation.getInput() != null) {
                        shapes.remove(operation.getInput().getShape());
                    }

                    log("Pruned operation [%s] with output shape [%s]", operationName, outputShape);
                    return;
                }
            }
            // Remove any errors that have had their shape pruned
            List<ErrorMap> errors = copy(operation.getErrors());
            operation.getErrors().forEach(error -> {
                String errorShape = error.getShape();
                if (!shapes.containsKey(errorShape)) {
                    errors.remove(error);
                    log("Pruned error [%s] from operation [%s]", errorShape, operationName);
                }
            });
            operation.setErrors(errors);
        });
        serviceModel.setOperations(operations);
    }

    private static <K, V> Map<K, V> copy(Map<K, V> map) {
        return new LinkedHashMap<>(map);
    }

    private static <V> List<V> copy(List<V> list) {
        return new ArrayList<>(list);
    }

    private static void log(String format, Object... args) {
        System.out.println(String.format(format, args));
    }
}
