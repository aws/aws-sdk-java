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

package com.amazonaws.codegen.internal;

import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.config.templates.ChildTemplate;
import com.amazonaws.codegen.model.config.templates.CodeGenTemplatesConfig;
import com.amazonaws.codegen.model.config.templates.TopLevelTemplate;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.intermediate.Protocol;
import com.amazonaws.codegen.model.intermediate.ShapeModel;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.IOException;
import java.util.List;

/**
 * Util class that sets up the freemarker configuration and loads the templates.
 */
public class Freemarker {

    private final CodeGenTemplatesConfig templateConfig;

    public static Freemarker create(IntermediateModel model) {
        return new Freemarker(loadProtocolTemplatesConfig(model));
    }

    private static CodeGenTemplatesConfig loadProtocolTemplatesConfig(IntermediateModel model) {
        // CBOR is a type of JSON Protocol.  Use JSON Protocol for templates
        Protocol templateProtocol = model.getMetadata().getProtocol();
        if (Protocol.CBOR.equals(model.getMetadata().getProtocol()) ||
            Protocol.ION.equals(model.getMetadata().getProtocol())) {
            templateProtocol = Protocol.AWS_JSON;
        }
        CodeGenTemplatesConfig protocolDefaultConfig = CodeGenTemplatesConfig.load(templateProtocol);

        CustomizationConfig customConfig = model.getCustomizationConfig();

        if (customConfig == null || customConfig.getCustomCodeTemplates() == null) {
            return protocolDefaultConfig;
        }

        // merge any custom config and return the result.
        return CodeGenTemplatesConfig.merge(protocolDefaultConfig, customConfig.getCustomCodeTemplates());
    }

    private Freemarker(CodeGenTemplatesConfig templateConfig) {
        this.templateConfig = templateConfig;
    }

    private Configuration newFreeMarkerConfig() {
        Configuration freeMarkerConfig = new Configuration(Configuration.VERSION_2_3_24);
        freeMarkerConfig.setDefaultEncoding("UTF-8");
        freeMarkerConfig.setClassForTemplateLoading(this.getClass(), "/");
        freeMarkerConfig
                .setTemplateExceptionHandler(TemplateExceptionHandler.DEBUG_HANDLER);

        return freeMarkerConfig;
    }

    private Template getTemplate(TopLevelTemplate template) throws IOException {

        // Create a new FreeMarker config for each top-level template, so that
        // they don't share the same macro namespace
        Configuration fmConfig = newFreeMarkerConfig();

        // Common child templates
        importChildTemplates(fmConfig, templateConfig.getCommonChildTemplates());
        // Child templates declared for the top-level template
        importChildTemplates(fmConfig, template.getChildTemplates());

        return fmConfig.getTemplate(template.getMainTemplate());
    }

    private static void importChildTemplates(
            Configuration freeMarkerConfig,
            List<ChildTemplate> childTemplates) {

        if (childTemplates == null)
            return;

        for (ChildTemplate template : childTemplates) {
            freeMarkerConfig.addAutoImport(template.getImportAsNamespace(),
                    template.getLocation());
        }
    }

    public Template getSyncClientTemplate() throws IOException {
        return getTemplate(templateConfig.getSyncClient());
    }

    public Template getSyncAbstractClassTemplate() throws IOException {
        return getTemplate(templateConfig.getSyncAbstractClass());
    }

    public Template getSyncInterfaceTemplate() throws IOException {
        return getTemplate(templateConfig.getSyncInterface());
    }

    public Template getAsyncClientTemplate() throws IOException {
        return getTemplate(templateConfig.getAsyncClient());
    }

    public Template getAsyncAbstractClassTemplate() throws IOException {
        return getTemplate(templateConfig.getAsyncAbstractClass());
    }

    public Template getAsyncInterfaceTemplate() throws IOException {
        return getTemplate(templateConfig.getAsyncInterface());
    }

    public Template getSyncClientBuilderTemplate() throws IOException {
        return getTemplate(templateConfig.getSyncClientBuilder());
    }

    public Template getAsyncClientBuilderTemplate() throws IOException {
        return getTemplate(templateConfig.getAsyncClientBuilder());
    }

    public Template getRequestClassTemplate() throws IOException {
        return getTemplate(templateConfig.getRequestClass());
    }

    public Template getResponseClassTemplate() throws IOException {
        return getTemplate(templateConfig.getResponseClass());
    }

    public Template getModelClassTemplate() throws IOException {
        return getTemplate(templateConfig.getModelClass());
    }

    public Template getModelEnumTemplate() throws IOException {
        return getTemplate(templateConfig.getModelEnum());
    }

    public Template getModelMarshallerTemplate() throws IOException {
        return getTemplate(templateConfig.getModelMarshaller());
    }

    public Template getRequestMarshallerTemplate() throws IOException {
        return getTemplate(templateConfig.getRequestMarshaller());
    }

    public Template getModelUnmarshallerTemplate() throws IOException {
        return getTemplate(templateConfig.getModelUnmarshaller());
    }

    public Template getExceptionClassTemplate() throws IOException {
        return getTemplate(templateConfig.getExceptionClass());
    }

    public Template getExceptionUnmarshallerTemplate() throws IOException {
        return getTemplate(templateConfig.getExceptionUnmarshaller());
    }

    public Template getPolicyActionClassTemplate() throws IOException {
        return getTemplate(templateConfig.getPolicyActionClass());
    }

    public Template getCucumberModuleInjectorTemplate() throws IOException {
        return getTemplate(templateConfig.getCucumberModuleInjector());
    }

    public Template getCucumberTestTemplate() throws IOException {
        return getTemplate(templateConfig.getCucumberTest());
    }

    public Template getCucumberPropertiesTemplate() throws IOException {
        return getTemplate(templateConfig.getCucumberPropertiesFile());
    }

    public Template getApiGatewayPomTemplate() throws IOException {
        return getTemplate(templateConfig.getApiGatewayPomTemplate());
    }

    public Template getApiGatewayGradleBuildTemplate() throws IOException {
        return getTemplate(templateConfig.getApiGatewayGradleBuildTemplate());
    }

    public Template getApiGatewayGradleSettingsTemplate() throws IOException {
        return getTemplate(templateConfig.getApiGatewayGradleSettingsTemplate());
    }

    public Template getApiGatewayReadmeTemplate() throws IOException {
        return getTemplate(templateConfig.getApiGatewayReadmeTemplate());
    }

    public Template getShapeTemplate(ShapeModel shape) throws IOException {
        switch (shape.getShapeType()) {
        case Request:
            return getRequestClassTemplate();
        case Response:
            return getResponseClassTemplate();
        case Model:
            return getModelClassTemplate();
        case Enum:
            return getModelEnumTemplate();
        case Exception:
            return getExceptionClassTemplate();
        default:
            throw new RuntimeException(
                    "Unable to determine template for shape "
                            + shape.getShapeName());
        }
    }

    public Template getPackageInfoTemplate() throws IOException {
        return getTemplate(templateConfig.getPackageInfo());
    }

    public Template getBaseExceptionClassTemplate() throws IOException {
        return getTemplate(templateConfig.getBaseExceptionClass());
    }

    public Template getWaiterSDKFunctionTemplate() throws IOException{
        return getTemplate(templateConfig.getSdkFunctionClass());
    }

    public Template getWaiterAcceptorTemplate() throws IOException{
        return getTemplate(templateConfig.getAcceptorClass());
    }

    public Template getWaiterTemplate() throws IOException{
        return getTemplate(templateConfig.getWaiterClass());
    }

    public Template getCustomAuthorizerTemplate() throws IOException{
        return getTemplate(templateConfig.getCustomRequestSignerClass());
    }

    public Template getEndpointDiscoveryCacheTemplate() throws IOException {
        return getTemplate(templateConfig.getEndpointDiscoveryCache());
    }

    public Template getEndpointDiscoveryCacheLoaderTemplate() throws IOException {
        return getTemplate(templateConfig.getEndpointDiscoveryCacheLoader());
    }
}
