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

package com.amazonaws.codegen.customization;

import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.service.ServiceModel;

public final class CodegenCustomizationProcessorChain implements CodegenCustomizationProcessor {

    private final CodegenCustomizationProcessor[] processorChain;

    public CodegenCustomizationProcessorChain(CodegenCustomizationProcessor... processors) {
        this.processorChain = processors == null
                ? new CodegenCustomizationProcessor[0]
                : processors.clone()
                ;
    }

    @Override
    public void preprocess(ServiceModel serviceModel) {
        for (CodegenCustomizationProcessor processor : processorChain) {
            processor.preprocess(serviceModel);
        }
    }

    @Override
    public void postprocess(IntermediateModel intermediateModel) {
        for (CodegenCustomizationProcessor processor : processorChain) {
            processor.postprocess(intermediateModel);
        }
    }

}
