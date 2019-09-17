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
package com.amazonaws.codegen.emitters.tasks;

import com.amazonaws.codegen.emitters.CodeWriter;
import com.amazonaws.codegen.emitters.FreemarkerGeneratorTask;
import com.amazonaws.codegen.emitters.GeneratorTask;
import com.amazonaws.codegen.emitters.GeneratorTaskParams;
import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.config.customization.AuthPolicyActions;
import com.amazonaws.codegen.model.intermediate.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolicyActionEnumGeneratorTasks extends BaseGeneratorTasks {

    private final String policyEnumClassDir;
    private final AuthPolicyActions policyActions;
    private final Metadata metadata;

    public PolicyActionEnumGeneratorTasks(GeneratorTaskParams dependencies) {
        super(dependencies);
        this.policyEnumClassDir = dependencies.getPathProvider().getPolicyEnumDirectory();
        this.policyActions = model.getCustomizationConfig().getAuthPolicyActions();
        this.metadata = model.getMetadata();
    }

    @Override
    protected boolean hasTasks() {
        final AuthPolicyActions policyActions = model.getCustomizationConfig().getAuthPolicyActions();
        return policyActions == null || !policyActions.isSkip();
    }

    @Override
    protected List<GeneratorTask> createTasks() throws Exception {
        info("Emitting policy action enum class");

        String serviceName = getPolicyActionServiceName();
        String actionPrefix = getEnumActionPrefix();
        List<String> additionalOperations = getAdditionalOperations();

        Map<String, Object> dataModel = new HashMap<String, Object>();
        dataModel.put("fileHeader", model.getFileHeader());
        dataModel.put("operations", model.getOperations().keySet());
        dataModel.put("additionalOperations", additionalOperations);
        dataModel.put("metadata", model.getMetadata());
        dataModel.put("serviceName", serviceName);
        dataModel.put("actionPrefix", actionPrefix);

        return Collections.singletonList(
                new FreemarkerGeneratorTask(new CodeWriter(policyEnumClassDir, serviceName + "Actions"),
                                            freemarker.getPolicyActionClassTemplate(),
                                            dataModel));
    }

    private String getPolicyActionServiceName() {

        // This is to support the file naming for exiting/legacy clients.
        // The files don't follow the standard naming conventions.
        // To avoid breaking changes, the fileNamePrefix contains the name of
        // the file to be used.
        if (policyActions != null && policyActions.getFileNamePrefix() != null) {
            return Utils.capitialize(policyActions.getFileNamePrefix());
        }

        return Utils.capitialize(metadata.getEndpointPrefix());
    }

    private String getEnumActionPrefix() {

        if (policyActions != null && policyActions.getActionPrefix() != null) {
            return policyActions.getActionPrefix();
        }
        return metadata.getEndpointPrefix();
    }

    private List<String> getAdditionalOperations() {
        return policyActions != null && policyActions.getAdditionalOperations() != null
               ? policyActions.getAdditionalOperations() : new ArrayList<String>();
    }

}
