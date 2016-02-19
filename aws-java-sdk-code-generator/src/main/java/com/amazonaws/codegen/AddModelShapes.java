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

import static com.amazonaws.codegen.internal.Utils.isStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.amazonaws.codegen.internal.NameUtils;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.intermediate.ShapeType;
import com.amazonaws.codegen.model.intermediate.ShapeUnmarshaller;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.codegen.model.service.Shape;

/**
 * Constructs the shapes (other than request, response and exception) from the service model.
 */
final class AddModelShapes extends AddShapes {

    AddModelShapes(ServiceModel serviceModel, CustomizationConfig customizationConfig) {
        super(serviceModel, customizationConfig);
    }

    public final Map<String, ShapeModel> constructModelShapes(Set<String> shapesToSkip) {
        // Java output shape models, to be constructed
        final Map<String, ShapeModel> javaShapes = new HashMap<String, ShapeModel>();

        for (Map.Entry<String, Shape> entry : getServiceModel().getShapes().entrySet()) {
            final String shapeName = entry.getKey();
            final Shape shape = entry.getValue();

            if (shapesToSkip.contains(shapeName)) {
                continue;
            }

            ShapeType shapeType = getModelShapeType(shape);

            if (shapeType != null) {
                // For model classes the Java Class name should be following Java name
                // convention. Use getJavaClassName to customize shapeName.
                final String javaClassName = NameUtils.getJavaClassName(shapeName);

                ShapeModel modelShape = generateShapeModel(javaClassName, shapeName);
                modelShape.setType(shapeType);

                // We need unmarshaller metadata for all shapes
                ShapeUnmarshaller unmarshaller = new ShapeUnmarshaller();
                unmarshaller.setFlattened(shape.isFlattened());
                modelShape.setUnmarshaller(unmarshaller);

                javaShapes.put(javaClassName, modelShape);
            }
        }

        return javaShapes;
    }

    /**
     * @return null if the given shape is neither a structure nor enum model.
     */
    private ShapeType getModelShapeType(final Shape shape) {
        if (isStructure(shape)) {
            return ShapeType.Model;

        } else if (shape.getEnumValues() != null) {
            return ShapeType.Enum;
        }
        return null;
    }
}
