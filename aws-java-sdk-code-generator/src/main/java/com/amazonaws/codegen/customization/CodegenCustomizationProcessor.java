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

public interface CodegenCustomizationProcessor {

    /**
     * Apply the customization by directly modifying the service model, before
     * the intermediate model is built.
     */
    void preprocess(ServiceModel serviceModel);

    /**
     * Apply the customization after the intermediate model is built
     */
    void postprocess(IntermediateModel intermediateModel);
}
