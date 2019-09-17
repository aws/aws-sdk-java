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
import com.amazonaws.codegen.customization.CodegenCustomizationProcessorChain;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;

public final class DefaultCustomizationProcessor {

    public static CodegenCustomizationProcessor getProcessorFor(
            CustomizationConfig config) {

        return new CodegenCustomizationProcessorChain(
                new MetadataModifiersProcessor(config.getCustomServiceMetadata()),
                new ShapeModifiersProcessor(config.getShapeModifiers()),
                new ShapeSubstitutionsProcessor(config.getShapeSubstitutions()),
                new OperationModifiersProcessor(config.getOperationModifiers()),
                new CustomConstructorsProcessor(config),
                new SimpleMethodsProcessor(config.getSimpleMethods()),
                new RemoveExceptionMessagePropertyProcessor(),
                new RenameShapesProcessor(config.getRenameShapes()),
                new SendEmptyAutoConstructedListAsEmptyListProcessor(config.getSendEmptyAutoConstructedListAsEmptyList()),
                new SendEmptyNonAutoConstructedListAsEmptyListProcessor(config),
                new EmitLegacyEnumSetterProcessor(config)
        );
    }
}
