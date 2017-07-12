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

package com.amazonaws.codegen.model.config.customization;

import java.util.List;

/**
 * Customization configuration for policy actions enums file.
 */
public class AuthPolicyActions {

    /**
     * If true, the enum file generation is skipped. By default the policy
     * action file is generated.
     */
    private boolean skip;

    /**
     * The prefix to be used for an enum value.
     */
    private String actionPrefix;

    /**
     * File name prefix for the actions file.
     */
    private String fileNamePrefix;

    /**
     * Additional operations to generate in addition to the ones defined in their models. This is useful for actions that are not
     * defined as operations, like IAM's PassRole action.
     */
    private List<String> additionalOperations;

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public String getActionPrefix() {
        return actionPrefix;
    }

    public void setActionPrefix(String actionPrefix) {
        this.actionPrefix = actionPrefix;
    }

    public String getFileNamePrefix() {
        return fileNamePrefix;
    }

    public void setFileNamePrefix(String fileNamePrefix) {
        this.fileNamePrefix = fileNamePrefix;
    }

    public List<String> getAdditionalOperations() {
        return this.additionalOperations;
    }

    public void setAdditionalOperations(List<String> additionalOperations) {
        this.additionalOperations = additionalOperations;
    }
}
