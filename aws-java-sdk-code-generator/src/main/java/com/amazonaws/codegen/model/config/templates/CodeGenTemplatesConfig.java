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
import static java.util.Collections.singletonList;

import com.amazonaws.codegen.internal.ClassLoaderHelper;
import com.amazonaws.codegen.internal.Jackson;
import com.amazonaws.codegen.model.intermediate.Protocol;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

public class CodeGenTemplatesConfig {

    private TopLevelTemplate syncClientBuilder = new TopLevelTemplate("/templates/common/SyncClientBuilder.ftl", null);
    private TopLevelTemplate asyncClientBuilder = new TopLevelTemplate("/templates/common/AsyncClientBuilder.ftl", null);
    private TopLevelTemplate sdkFunctionClass = new TopLevelTemplate("/templates/waiter/SdkFunction.ftl", null);
    private TopLevelTemplate acceptorClass = new TopLevelTemplate("/templates/waiter/Acceptor.ftl", null);
    private TopLevelTemplate waiterClass = new TopLevelTemplate("/templates/waiter/Waiter.ftl", null);
    private TopLevelTemplate endpointDiscoveryCache = new TopLevelTemplate("/templates/endpoint-discovery/Cache.ftl", null);
    private TopLevelTemplate endpointDiscoveryCacheLoader = new TopLevelTemplate("/templates/endpoint-discovery/CacheLoader.ftl", null);
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
    private TopLevelTemplate requestMarshaller;
    private TopLevelTemplate baseExceptionClass;
    private TopLevelTemplate exceptionClass;
    private TopLevelTemplate exceptionUnmarshaller;
    private TopLevelTemplate policyActionClass;
    private TopLevelTemplate packageInfo;
    private TopLevelTemplate customRequestSignerClass;
    private TopLevelTemplate cucumberModuleInjector = new TopLevelTemplate("/templates/cucumber/ModuleInjector.ftl", null);
    private TopLevelTemplate cucumberTest = new TopLevelTemplate("/templates/cucumber/RunCucumberTest.ftl", null);
    private TopLevelTemplate cucumberPropertiesFile = new TopLevelTemplate("/templates/cucumber/cucumberProperties.ftl", null);
    private TopLevelTemplate apiGatewayPomTemplate = new TopLevelTemplate("/templates/api-gateway/maven/pom.xml.ftl", null);
    private TopLevelTemplate apiGatewayGradleBuildTemplate = new TopLevelTemplate("/templates/api-gateway/gradle/build.gradle.ftl", null);
    private TopLevelTemplate apiGatewayGradleSettingsTemplate = new TopLevelTemplate("/templates/api-gateway/gradle/settings.gradle.ftl", null);
    private TopLevelTemplate apiGatewayReadmeTemplate =
            new TopLevelTemplate("/templates/api-gateway/README.md.ftl", singletonList(
                    new ChildTemplate("/templates/api-gateway/README_Dependencies.ftl", "README_Dependencies")));

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

        merged.setSyncClientBuilder(TopLevelTemplate.merge(
            config.getSyncClientBuilder(), override.getSyncClientBuilder()));
        merged.setAsyncClientBuilder(TopLevelTemplate.merge(
            config.getAsyncClientBuilder(), override.getAsyncClientBuilder()));

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
        merged.setRequestMarshaller(TopLevelTemplate.merge(
                config.getRequestMarshaller(), override.getRequestMarshaller()));

        merged.setBaseExceptionClass(TopLevelTemplate.merge(
                config.getBaseExceptionClass(), override.getBaseExceptionClass()));
        merged.setExceptionClass(TopLevelTemplate.merge(
                config.getExceptionClass(), override.getExceptionClass()));
        merged.setExceptionUnmarshaller(TopLevelTemplate.merge(
                config.getExceptionUnmarshaller(),
                override.getExceptionUnmarshaller()));

        merged.setPolicyActionClass(TopLevelTemplate.merge(
                config.getPolicyActionClass(),
                override.getPolicyActionClass()));

        merged.setPackageInfo(TopLevelTemplate.merge(
                config.getPackageInfo(), override.getPackageInfo()));

        merged.setCustomRequestSignerClass(TopLevelTemplate.merge(
                config.getCustomRequestSignerClass(), override.getCustomRequestSignerClass()));

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

    public TopLevelTemplate getSyncClientBuilder() {
        return syncClientBuilder;
    }

    public void setSyncClientBuilder(TopLevelTemplate syncClientBuilder) {
        this.syncClientBuilder = syncClientBuilder;
    }

    public TopLevelTemplate getAsyncClientBuilder() {
        return asyncClientBuilder;
    }

    public void setAsyncClientBuilder(TopLevelTemplate syncClientBuilder) {
        this.asyncClientBuilder = syncClientBuilder;
    }

    public TopLevelTemplate getWaiterClass() {
        return waiterClass;
    }

    public void setWaiterClass(TopLevelTemplate waiterClass) {
        this.waiterClass = waiterClass;
    }

    public TopLevelTemplate getAcceptorClass() {
        return acceptorClass;
    }

    public void setAcceptorClass(TopLevelTemplate acceptorClass) {
        this.acceptorClass = acceptorClass;
    }

    public TopLevelTemplate getSdkFunctionClass() {
        return sdkFunctionClass;
    }

    public void setSdkFunctionClass(TopLevelTemplate sdkFunctionClass) {
        this.sdkFunctionClass = sdkFunctionClass;
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

    public TopLevelTemplate getRequestMarshaller() {
        return requestMarshaller;
    }

    public void setModelMarshaller(TopLevelTemplate modelMarshaller) {
        this.modelMarshaller = modelMarshaller;
    }

    public void setRequestMarshaller(TopLevelTemplate requestMarshaller) {
        this.requestMarshaller = requestMarshaller;
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

    public TopLevelTemplate getPackageInfo() {
        return packageInfo;
    }

    public void setPackageInfo(TopLevelTemplate packageInfo) {
        this.packageInfo = packageInfo;
    }

    public TopLevelTemplate getBaseExceptionClass() {
        return baseExceptionClass;
    }

    public void setBaseExceptionClass(TopLevelTemplate baseExceptionClass) {
        this.baseExceptionClass = baseExceptionClass;
    }

    public TopLevelTemplate getCucumberModuleInjector() {
        return cucumberModuleInjector;
    }

    public TopLevelTemplate getCucumberTest() {
        return cucumberTest;
    }

    public TopLevelTemplate getCucumberPropertiesFile() {
        return cucumberPropertiesFile;
    }

    public TopLevelTemplate getCustomRequestSignerClass() {
        return customRequestSignerClass;
    }

    public void setCustomRequestSignerClass(TopLevelTemplate customRequestSignerClass) {
        this.customRequestSignerClass = customRequestSignerClass;
    }

    public TopLevelTemplate getApiGatewayPomTemplate() {
        return apiGatewayPomTemplate;
    }

    public TopLevelTemplate getApiGatewayGradleBuildTemplate() {
        return apiGatewayGradleBuildTemplate;
    }

    public TopLevelTemplate getApiGatewayGradleSettingsTemplate() {
        return apiGatewayGradleSettingsTemplate;
    }

    public TopLevelTemplate getApiGatewayReadmeTemplate() {
        return apiGatewayReadmeTemplate;
    }

    public TopLevelTemplate getEndpointDiscoveryCache() {
        return endpointDiscoveryCache;
    }

    public TopLevelTemplate getEndpointDiscoveryCacheLoader() {
        return endpointDiscoveryCacheLoader;
    }
}
