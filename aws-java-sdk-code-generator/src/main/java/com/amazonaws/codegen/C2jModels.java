/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.codegen.model.config.BasicCodeGenConfig;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.ServiceExamples;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.codegen.model.service.Waiters;

import java.io.File;

/**
 * Container for service models and config files.
 */
public class C2jModels {

    private final ServiceModel serviceModel;
    private final Waiters waitersModel;
    private final ServiceExamples examplesModel;
    private final BasicCodeGenConfig codeGenConfig;
    private final CustomizationConfig customizationConfig;
    private final File service2JsonFilePath;

    private C2jModels(ServiceModel serviceModel, Waiters waitersModel, ServiceExamples examplesModel,
                      BasicCodeGenConfig codeGenConfig, CustomizationConfig customizationConfig,
                      File service2JsonFilePath) {
        this.serviceModel = serviceModel;
        this.waitersModel = waitersModel;
        this.examplesModel = examplesModel;
        this.codeGenConfig = codeGenConfig;
        this.customizationConfig = customizationConfig;
        this.service2JsonFilePath = service2JsonFilePath;
    }

    public ServiceModel serviceModel() {
        return serviceModel;
    }

    public Waiters waitersModel() {
        return waitersModel;
    }

    public ServiceExamples examplesModel() {
        return examplesModel;
    }

    public BasicCodeGenConfig codeGenConfig() {
        return codeGenConfig;
    }

    public CustomizationConfig customizationConfig() {
        return customizationConfig;
    }

    public File service2JsonFilePath() {
        return service2JsonFilePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private ServiceModel serviceModel;
        private Waiters waitersModel;
        private ServiceExamples examplesModel;
        private BasicCodeGenConfig codeGenConfig;
        private CustomizationConfig customizationConfig;
        private File service2JsonFilePath;

        private Builder() {
        }

        public Builder serviceModel(ServiceModel serviceModel) {
            this.serviceModel = serviceModel;
            return this;
        }

        public Builder waitersModel(Waiters waitersModel) {
            this.waitersModel = waitersModel;
            return this;
        }

        public Builder examplesModel(ServiceExamples examplesModel) {
            this.examplesModel = examplesModel;
            return this;
        }

        public Builder codeGenConfig(BasicCodeGenConfig codeGenConfig) {
            this.codeGenConfig = codeGenConfig;
            return this;
        }

        public Builder customizationConfig(CustomizationConfig customizationConfig) {
            this.customizationConfig = customizationConfig;
            return this;
        }

        public Builder service2JsonFilePath(File service2JsonFilePath) {
            this.service2JsonFilePath = service2JsonFilePath;
            return this;
        }

        public C2jModels build() {
            final Waiters waiters = waitersModel != null ? waitersModel : Waiters.NONE;
            final ServiceExamples examples = examplesModel != null ? examplesModel : ServiceExamples.NONE;
            return new C2jModels(serviceModel, waiters, examples, codeGenConfig, customizationConfig,
                    service2JsonFilePath);
        }
    }
}
