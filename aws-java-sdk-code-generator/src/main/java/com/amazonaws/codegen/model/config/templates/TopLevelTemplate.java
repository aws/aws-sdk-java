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

package com.amazonaws.codegen.model.config.templates;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedList;
import java.util.List;

public class TopLevelTemplate {

    private final String mainTemplate;
    private final List<ChildTemplate> childTemplates;

    @JsonCreator
    public TopLevelTemplate(
            @JsonProperty("mainTemplate") String mainTemplate,
            @JsonProperty("childTemplates") List<ChildTemplate> childTemplates) {
        this.mainTemplate = mainTemplate;
        this.childTemplates = childTemplates;
    }

    public static TopLevelTemplate merge(TopLevelTemplate config,
                                         TopLevelTemplate override) {

        if (override == null) {
            return config;
        }
        if (config == null) {
            return override;
        }

        String mainTemplate = override.getMainTemplate() == null ? config
                .getMainTemplate() : override.getMainTemplate();

        List<ChildTemplate> childTemplates = new LinkedList<ChildTemplate>();
        if (config.getChildTemplates() != null) {
            childTemplates.addAll(config.getChildTemplates());
        }
        if (override.getChildTemplates() != null) {
            childTemplates.addAll(override.getChildTemplates());
        }

        return new TopLevelTemplate(mainTemplate, childTemplates);
    }

    public String getMainTemplate() {
        return mainTemplate;
    }

    public List<ChildTemplate> getChildTemplates() {
        return childTemplates;
    }

}
