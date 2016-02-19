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

import static com.amazonaws.codegen.internal.Constants.PROTOCOL_CONFIG_LOCATION;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import com.amazonaws.codegen.internal.ClassLoaderHelper;
import com.amazonaws.codegen.internal.Jackson;
import com.amazonaws.codegen.model.intermediate.Protocol;

public class CodeGenTemplatesConfig {

    private TopLevelTemplate syncClient;
    private TopLevelTemplate asyncClient;
    private TopLevelTemplate syncAbstractClass;
    private TopLevelTemplate asyncAbstractClass;
    private TopLevelTemplate syncInterface;
    private TopLevelTemplate asyncInterface;
    private TopLevelTemplate requestClass;
    private TopLevelTemplate responseClass;
    private TopLevelTemplate modelClass;
    private TopLevelTemplate modelEnum;
    private TopLevelTemplate modelUnmarshaller;
    private TopLevelTemplate modelMarshaller;
    private TopLevelTemplate exceptionClass;
    private TopLevelTemplate exceptionUnmarshaller;
    private TopLevelTemplate policyActionClass;
    private List<ChildTemplate> commonChildTemplates;

    public static CodeGenTemplatesConfig load(Protocol protocol) {

        final String protocolConfigFilePath = String.format(
                PROTOCOL_CONFIG_LOCATION, protocol.getValue());

        InputStream input = ClassLoaderHelper.getResourceAsStream(
                protocolConfigFilePath, CodeGenTemplatesConfig.class);
        if (input == null) {
            input = ClassLoaderHelper.getResourceAsStream("/"
                    + protocolConfigFilePath, CodeGenTemplatesConfig.class);
        }

        try {
            return Jackson.load(CodeGenTemplatesConfig.class,
                    input);
        } catch (Exception e) {
            throw new RuntimeException(
                    "Unable to load the protocol specific config file from the location "
                            + protocolConfigFilePath, e);
        }
    }

    public static CodeGenTemplatesConfig merge(CodeGenTemplatesConfig config,
                                               CodeGenTemplatesConfig override) {

        CodeGenTemplatesConfig merged = new CodeGenTemplatesConfig();

        merged.setSyncClient(TopLevelTemplate.merge(
                config.getSyncClient(), override.getSyncClient()));
        merged.setAsyncClient(TopLevelTemplate.merge(
                config.getAsyncClient(), override.getAsyncClient()));

        merged.setSyncAbstractClass(TopLevelTemplate.merge(
                config.getSyncAbstractClass(),
                override.getSyncAbstractClass()));
        merged.setAsyncAbstractClass(TopLevelTemplate.merge(
                config.getAsyncAbstractClass(),
                override.getAsyncAbstractClass()));

        merged.setSyncInterface(TopLevelTemplate.merge(
                config.getSyncInterface(), override.getSyncInterface()));
        merged.setAsyncInterface(TopLevelTemplate.merge(
                config.getAsyncInterface(), override.getAsyncInterface()));

        merged.setRequestClass(TopLevelTemplate.merge(
                config.getRequestClass(), override.getRequestClass()));
        merged.setResponseClass(TopLevelTemplate.merge(
                config.getResponseClass(), override.getResponseClass()));

        merged.setModelClass(TopLevelTemplate.merge(
                config.getModelClass(), override.getModelClass()));
        merged.setModelEnum(TopLevelTemplate.merge(config.getModelEnum(),
                override.getModelEnum()));

        merged.setModelUnmarshaller(TopLevelTemplate.merge(
                config.getModelUnmarshaller(), override.getModelUnmarshaller()));
        merged.setModelMarshaller(TopLevelTemplate.merge(
                config.getModelMarshaller(), override.getModelMarshaller()));

        merged.setExceptionClass(TopLevelTemplate.merge(
                config.getExceptionClass(), override.getExceptionClass()));
        merged.setExceptionUnmarshaller(TopLevelTemplate.merge(
                config.getExceptionUnmarshaller(),
                override.getExceptionUnmarshaller()));

        merged.setPolicyActionClass(TopLevelTemplate.merge(
                config.getPolicyActionClass(),
                override.getPolicyActionClass()));

        List<ChildTemplate> commonChildTemplates = new LinkedList<ChildTemplate>();
        if (config.getCommonChildTemplates() != null) {
            commonChildTemplates.addAll(config.getCommonChildTemplates());
        }
        if (override.getCommonChildTemplates() != null) {
            commonChildTemplates.addAll(override.getCommonChildTemplates());
        }
        merged.setCommonChildTemplates(commonChildTemplates);

        return merged;
    }

    public TopLevelTemplate getSyncClient() {
        return syncClient;
    }

    public void setSyncClient(TopLevelTemplate syncClient) {
        this.syncClient = syncClient;
    }

    public TopLevelTemplate getAsyncClient() {
        return asyncClient;
    }

    public void setAsyncClient(TopLevelTemplate asyncClient) {
        this.asyncClient = asyncClient;
    }

    public TopLevelTemplate getSyncAbstractClass() {
        return syncAbstractClass;
    }

    public void setSyncAbstractClass(TopLevelTemplate syncAbstractClass) {
        this.syncAbstractClass = syncAbstractClass;
    }

    public TopLevelTemplate getAsyncAbstractClass() {
        return asyncAbstractClass;
    }

    public void setAsyncAbstractClass(TopLevelTemplate asyncAbstractClass) {
        this.asyncAbstractClass = asyncAbstractClass;
    }

    public TopLevelTemplate getSyncInterface() {
        return syncInterface;
    }

    public void setSyncInterface(TopLevelTemplate syncInterface) {
        this.syncInterface = syncInterface;
    }

    public TopLevelTemplate getAsyncInterface() {
        return asyncInterface;
    }

    public void setAsyncInterface(TopLevelTemplate asyncInterface) {
        this.asyncInterface = asyncInterface;
    }

    public TopLevelTemplate getRequestClass() {
        return requestClass;
    }

    public void setRequestClass(TopLevelTemplate requestClass) {
        this.requestClass = requestClass;
    }

    public TopLevelTemplate getResponseClass() {
        return responseClass;
    }

    public void setResponseClass(TopLevelTemplate responseClass) {
        this.responseClass = responseClass;
    }

    public TopLevelTemplate getModelClass() {
        return modelClass;
    }

    public void setModelClass(TopLevelTemplate modelClass) {
        this.modelClass = modelClass;
    }

    public TopLevelTemplate getModelEnum() {
        return modelEnum;
    }

    public void setModelEnum(TopLevelTemplate modelEnum) {
        this.modelEnum = modelEnum;
    }

    public TopLevelTemplate getModelUnmarshaller() {
        return modelUnmarshaller;
    }

    public void setModelUnmarshaller(TopLevelTemplate modelUnmarshaller) {
        this.modelUnmarshaller = modelUnmarshaller;
    }

    public TopLevelTemplate getModelMarshaller() {
        return modelMarshaller;
    }

    public void setModelMarshaller(TopLevelTemplate modelMarshaller) {
        this.modelMarshaller = modelMarshaller;
    }

    public TopLevelTemplate getExceptionClass() {
        return exceptionClass;
    }

    public void setExceptionClass(TopLevelTemplate exceptionClass) {
        this.exceptionClass = exceptionClass;
    }

    public TopLevelTemplate getExceptionUnmarshaller() {
        return exceptionUnmarshaller;
    }

    public void setExceptionUnmarshaller(
                                         TopLevelTemplate exceptionUnmarshaller) {
        this.exceptionUnmarshaller = exceptionUnmarshaller;
    }

    public List<ChildTemplate> getCommonChildTemplates() {
        return commonChildTemplates;
    }

    public void setCommonChildTemplates(
                                        List<ChildTemplate> commonChildTemplates) {
        this.commonChildTemplates = commonChildTemplates;
    }

    public TopLevelTemplate getPolicyActionClass() {
        return policyActionClass;
    }

    public void setPolicyActionClass(TopLevelTemplate policyActionClass) {
        this.policyActionClass = policyActionClass;
    }
}