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

package com.amazonaws.codegen.emitters;

import static com.amazonaws.codegen.internal.Constants.AUTH_POLICY_ENUM_CLASS_DIR;
import static com.amazonaws.codegen.internal.Constants.PACKAGE_NAME_MODEL_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.PACKAGE_NAME_TRANSFORM_SUFFIX;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.codegen.internal.Freemarker;
import com.amazonaws.codegen.internal.ImmutableMapParameter;
import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.config.customization.AuthPolicyActions;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.config.templates.CodeGenTemplatesConfig;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.intermediate.Metadata;
import com.amazonaws.codegen.model.intermediate.Protocol;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.intermediate.ShapeType;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import freemarker.template.Template;

/**
 * Consumes the intermediate model and submits tasks for generating the code. Waits until all tasks
 * are completed.
 */
public class CodeEmitter implements AutoCloseable {
    private static final boolean DEBUG = false;

    protected final IntermediateModel model;

    private final ExecutorService executors = Executors.newFixedThreadPool(10);

    private final List<Future<Void>> futures = new ArrayList<Future<Void>>();

    private final String baseDirectory;

    private final String modelClassDir;

    private final String transformClassDir;

    private final String policyEnumClassDir;

    protected final Freemarker freemarker;

    public CodeEmitter(IntermediateModel model, String outputDirectory) {
        if (model == null) {
            throw new IllegalArgumentException("Intermediate Model cannot be null");
        }
        if (outputDirectory == null || outputDirectory.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid output directory path");
        }
        this.model = model;
        this.baseDirectory = outputDirectory + "/" + model.getMetadata().getPackagePath();
        this.modelClassDir = baseDirectory + "/" + PACKAGE_NAME_MODEL_SUFFIX;

        this.transformClassDir = modelClassDir + "/" + PACKAGE_NAME_TRANSFORM_SUFFIX;

        this.policyEnumClassDir = outputDirectory + "/" + AUTH_POLICY_ENUM_CLASS_DIR;
        this.freemarker = new Freemarker(loadProtocolTemplatesConfig(model.getMetadata().getProtocol()));
    }

    public void emit() throws JsonGenerationException, JsonMappingException, IOException, InterruptedException,
            ExecutionException {

        // This will also create the directory for model class.
        Utils.createDirectory(transformClassDir);

        emitClientInterfaces();
        emitClientClasses();
        emitModelClasses();
        emitMarshallerClasses();
        emitUnmarshallerClasses();
        emitPolicyActionEnumClass();

        waitForCompletion();
    }

    @Override
    public void close() {
        executors.shutdown();
    }

    /**
     * Submits a task for client class generation
     */
    protected void emitClientClasses() throws IOException {
        submitTask(new ClassGeneratorTask(
                baseDirectory,
                model.getMetadata().getSyncAbstractClass(),
                freemarker.getSyncAbstractClassTemplate(),
                model));

        submitTask(new ClassGeneratorTask(
                baseDirectory,
                model.getMetadata().getSyncClient(),
                freemarker.getSyncClientTemplate(),
                model));

        submitTask(new ClassGeneratorTask(
                baseDirectory,
                model.getMetadata().getAsyncAbstractClass(),
                freemarker.getAsyncAbstractClassTemplate(),
                model));

        submitTask(new ClassGeneratorTask(
                baseDirectory,
                model.getMetadata().getAsyncClient(),
                freemarker.getAsyncClientTemplate(),
                model));
    }

    private void submitTask(ClassGeneratorTask task) {
        if (DEBUG) {
            try {
                task.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            futures.add(executors.submit(task));
        }
    }

    /**
     * Submits a task for client interface generation
     */
    protected void emitClientInterfaces() throws IOException {
        submitTask(new ClassGeneratorTask(
                baseDirectory,
                model.getMetadata().getSyncInterface(),
                freemarker.getSyncInterfaceTemplate(),
                model));

        submitTask(new ClassGeneratorTask(
                baseDirectory,
                model.getMetadata().getAsyncInterface(),
                freemarker.getAsyncInterfaceTemplate(),
                model));
    }

    /**
     * Constructs the data model and submits tasks for every generating classes for every shape in
     * the intermediate model.
     */
    protected void emitModelClasses() throws IOException {
        Metadata metadata = model.getMetadata();
        final Map<String, ShapeModel> shapes = model.getShapes();
        for (Map.Entry<String, ShapeModel> entry : shapes.entrySet()) {

            final String javaShapeName = entry.getKey();
            final ShapeModel shapeModel = entry.getValue();

            if (shapeModel.getCustomization().isSkipGeneratingModelClass()) {
                System.out.println("Skip generating class " + shapeModel.getShapeName());
                continue;
            }

            Map<String, Object> dataModel = ImmutableMapParameter.of(
                    "shape", shapeModel,
                    "metadata", metadata,
                    "customConfig", model.getCustomizationConfig());

            // Submit task for generating the
            // model/request/response/enum/exception class.
            submitTask(new ClassGeneratorTask(modelClassDir, javaShapeName,
                    freemarker.getShapeTemplate(shapeModel),
                    dataModel));

        }
    }

    /**
     * Constructs the data model and submits tasks for every generating marshallers for shapes in
     * the intermediate model.
     */
    protected void emitMarshallerClasses() throws IOException {
        Metadata metadata = model.getMetadata();

        final Map<String, ShapeModel> shapes = model.getShapes();
        final Template template = freemarker.getModelMarshallerTemplate();

        for (Map.Entry<String, ShapeModel> entry : shapes.entrySet()) {

            final String javaShapeName = entry.getKey();
            final ShapeModel shapeModel = entry.getValue();
            final ShapeType shapeType = ShapeType.fromValue(shapeModel.getType());

            if (shapeModel.getCustomization().isSkipGeneratingMarshaller()) {
                System.out.println("Skip generating marshaller class for "
                        + shapeModel.getShapeName());
                continue;
            }

            Map<String, Object> marshallerDataModel = ImmutableMapParameter.of(
                    "shapeName", javaShapeName,
                    "shapes", shapes,
                    "metadata", metadata,
                    "customConfig", model.getCustomizationConfig()
            );

            if (ShapeType.Request == shapeType) {

                String className = getMarshallerClassName(shapeType, javaShapeName, metadata);

                // Submit a task for generating the request marshaller.
                submitTask(new ClassGeneratorTask(transformClassDir, className, template, marshallerDataModel));

            } else if (ShapeType.Model == shapeType) {
                // Submit a task for generating model marshallers for json protocol.

                if (metadata.isJsonProtocol()) {
                    String className = getMarshallerClassName(shapeType, javaShapeName, metadata);
                    submitTask(new ClassGeneratorTask(transformClassDir, className, template, marshallerDataModel));
                }
            }
        }
    }

    protected String getMarshallerClassName(ShapeType shapeType, String shapeName, Metadata metadata) {
        if (ShapeType.Request == shapeType) {
            return shapeName + "Marshaller";
        } else if ((ShapeType.Model == shapeType) && (metadata.isJsonProtocol())) {
            return shapeName + "JsonMarshaller";
        }
        throw new IllegalArgumentException("Not able generate marshaller class name for " + shapeName + " type "
                + shapeType.getValue());
    }

    /**
     * Constructs the data model and submits tasks for every generating unmarshallers for shapes in
     * the intermediate model.
     */
    protected void emitUnmarshallerClasses() throws IOException {
        Metadata metadata = model.getMetadata();

        final Template template = freemarker.getModelUnmarshallerTemplate();
        final Map<String, ShapeModel> shapes = model.getShapes();
        for (Map.Entry<String, ShapeModel> entry : shapes.entrySet()) {

            final String javaShapeName = entry.getKey();
            final ShapeModel shapeModel = entry.getValue();
            final ShapeType shapeType = ShapeType.fromValue(shapeModel.getType());

            if (shapeModel.getCustomization().isSkipGeneratingUnmarshaller()) {
                System.out.println("Skip generating unmarshaller class for "
                        + shapeModel.getShapeName());
                continue;
            }

            Map<String, Object> dataModel = ImmutableMapParameter.of(
                    "shape", shapeModel,
                    "metadata", metadata);

            switch (shapeType) {
            case Response:
            case Model: {
                String unmarshallerNameSuffix = metadata.isJsonProtocol() ? "JsonUnmarshaller" : "StaxUnmarshaller";
                submitTask(new ClassGeneratorTask(transformClassDir, javaShapeName + unmarshallerNameSuffix, template,
                        dataModel));
                break;
            }
            case Exception: {
                // Generating Exception Unmarshallers is not required for the JSON protocol
                if (!metadata.isJsonProtocol()) {
                    submitTask(new ClassGeneratorTask(transformClassDir, javaShapeName + "Unmarshaller",
                            freemarker.getExceptionUnmarshallerTemplate(), dataModel));
                }
                break;
            }
            default:
                continue;

            }
        }
    }

    private void waitForCompletion() throws InterruptedException, ExecutionException {
        Exception firstEx = null;
        for (Future<Void> future : futures) {
            try {
                future.get();
            } catch (Exception e) {
                if (firstEx == null)
                    firstEx = e;
            }
        }
        if (firstEx instanceof ExecutionException)
            throw (ExecutionException) firstEx;
        else if (firstEx instanceof InterruptedException)
            throw (InterruptedException) firstEx;
        else if (firstEx instanceof RuntimeException)
            throw (RuntimeException) firstEx;
    }

    private CodeGenTemplatesConfig loadProtocolTemplatesConfig(Protocol protocol) {

        // CBOR is a type of JSON Protocol.  Use JSON Protocol for templates
        Protocol templateProtocol = protocol;
        if (Protocol.CBOR.equals(protocol)) {
            templateProtocol = Protocol.JSON;
        }
        if (Protocol.REST_CBOR.equals(protocol)) {
            templateProtocol = Protocol.REST_JSON;
        }
        CodeGenTemplatesConfig protocolDefaultConfig = CodeGenTemplatesConfig.load(templateProtocol);

        CustomizationConfig customConfig = model.getCustomizationConfig();

        if (customConfig == null || customConfig.getCustomCodeTemplates() == null)
            return protocolDefaultConfig;

        // merge any custom config and return the result.
        return CodeGenTemplatesConfig.merge(protocolDefaultConfig, customConfig.getCustomCodeTemplates());
    }

    /**
     * Submits a task to generate the policy action enum class file.
     */
    private void emitPolicyActionEnumClass() throws IOException {
        AuthPolicyActions policyActions = model.getCustomizationConfig().getAuthPolicyActions();

        // Return if the policy action enum file generation needs to be skipped.
        if (policyActions != null && policyActions.isSkip())
            return;

        // Creates the directory for the enum class file
        Utils.createDirectory(policyEnumClassDir);

        String serviceName = getPolicyActionServiceName(model.getMetadata(), policyActions);
        String actionPrefix = getEnumActionPrefix(model.getMetadata(), policyActions);

        Map<String, Object> dataModel = ImmutableMapParameter.of(
                "operations", model.getOperations().keySet(),
                "metadata", model.getMetadata(),
                "serviceName", serviceName,
                "actionPrefix", actionPrefix);

        submitTask(new ClassGeneratorTask(new CodeWriter(policyEnumClassDir, serviceName + "Actions"),
                freemarker.getPolicyActionClassTemplate(), dataModel));

    }

    private String getPolicyActionServiceName(Metadata metadata, AuthPolicyActions policyActions) {

        // This is to support the file naming for exiting/legacy clients.
        // The files don't follow the standard naming conventions.
        // To avoid breaking changes, the fileNamePrefix contains the name of
        // the file to be used.
        if (policyActions != null && policyActions.getFileNamePrefix() != null) {
            return Utils.capitialize(policyActions.getFileNamePrefix());
        }

        return Utils.capitialize(metadata.getEndpointPrefix());
    }

    private String getEnumActionPrefix(Metadata metadata, AuthPolicyActions policyActions) {

        if (policyActions != null && policyActions.getActionPrefix() != null) {
            return policyActions.getActionPrefix();
        }
        return metadata.getEndpointPrefix();
    }
}
