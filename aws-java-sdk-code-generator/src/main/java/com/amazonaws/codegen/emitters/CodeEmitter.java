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
import com.amazonaws.codegen.model.intermediate.WaiterDefinitionModel;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import freemarker.template.Template;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static com.amazonaws.codegen.internal.Constants.AUTH_POLICY_ENUM_CLASS_DIR;
import static com.amazonaws.codegen.internal.Constants.PACKAGE_NAME_MODEL_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.PACKAGE_NAME_TRANSFORM_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.PACKAGE_NAME_WAITERS_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.PROPERTIES_FILE_NAME_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.SMOKE_TESTS_DIR_NAME;


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

    private final String smokeTestsPackageDir;

    private final String waiterClassDir;

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

        this.waiterClassDir = baseDirectory + "/" + PACKAGE_NAME_WAITERS_SUFFIX ;
        this.freemarker = new Freemarker(loadProtocolTemplatesConfig(model.getMetadata().getProtocol()));

        this.smokeTestsPackageDir = outputDirectory + "/../" + SMOKE_TESTS_DIR_NAME + "/" + model.getMetadata().getPackagePath() + "/" + SMOKE_TESTS_DIR_NAME;

    }

    public void emit() throws JsonGenerationException, JsonMappingException, IOException, InterruptedException,
            ExecutionException {

        // Create client directories
        Utils.createDirectory(transformClassDir);
        Utils.createDirectory(waiterClassDir);
        Utils.createDirectory(smokeTestsPackageDir);

        emitWaiterOpFunctionClasses();
        emitWaiterAcceptorClasses();
        emitWaiterClasses();

        emitClientInterfaces();
        emitClientClasses();
        emitClientBuilders();
        emitModelClasses();
        // If a custom base class is provided we assume it already exists and does not need
        // to be generated
        if (model.getCustomizationConfig().getSdkModeledExceptionBaseClassName() == null) {
            emitExceptionBaseClass();
        }
        emitMarshallerClasses();
        emitUnmarshallerClasses();
        emitPolicyActionEnumClass();
        emitPackageInfoFile();
        // Skips generating smoketest files if skipSmokeTests is set in custom config
        if (!model.getCustomizationConfig().isSkipSmokeTests()) {
             emitSmokeTestFiles();
        }

        waitForCompletion();
    }


    @Override
    public void close() {
        executors.shutdown();
    }

    private void emitPackageInfoFile() throws IOException {
        submitTask(new ClassGeneratorTask(baseDirectory, "package-info.java", freemarker
                .getPackageInfoTemplate(), model));
    }

    /**
     * Submits a task to generate files needed for smoke tests.
     */
    private void emitSmokeTestFiles() throws IOException {
        submitTask(new ClassGeneratorTask(
                smokeTestsPackageDir,
                model.getMetadata().getCucumberModuleInjectorClassName(),
                freemarker.getCucumberModuleInjectorTemplate(),
                model));

        submitTask(new ClassGeneratorTask(
                smokeTestsPackageDir,
                "RunCucumberTest",
                freemarker.getCucumberTestTemplate(),
                model));

        submitTask(new ClassGeneratorTask(
                new CodeWriter(smokeTestsPackageDir, "cucumber", PROPERTIES_FILE_NAME_SUFFIX),
                freemarker.getCucumberPropertiesTemplate(),
                model));
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

        if (model.getMetadata().hasAsyncClient()) {
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
    }

    /**
     * Submits a task to generate the fluent builders for Sync and Async clients
     */
    protected void emitClientBuilders() throws IOException {
        submitTask(new ClassGeneratorTask(
                baseDirectory,
                model.getMetadata().getSyncClientBuilderClassName(),
                freemarker.getSyncClientBuilderTemplate(),
                model));

        if (model.getMetadata().hasAsyncClient()) {
            submitTask(new ClassGeneratorTask(
                    baseDirectory,
                    model.getMetadata().getAsyncClientBuilderClassName(),
                    freemarker.getAsyncClientBuilderTemplate(),
                    model));
        }
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

        if (model.getMetadata().hasAsyncClient()) {
            submitTask(new ClassGeneratorTask(
                    baseDirectory,
                    model.getMetadata().getAsyncInterface(),
                    freemarker.getAsyncInterfaceTemplate(),
                    model));
        }
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

            Map<String, Object> dataModel = ImmutableMapParameter.<String, Object>builder()
                    .put("fileHeader", model.getFileHeader())
                    .put("shape", shapeModel)
                    .put("metadata", metadata)
                    .put("baseClassFqcn", getModelBaseClassFqcn(shapeModel.getType()))
                    .put("customConfig", model.getCustomizationConfig())
                    .build();

            // Submit task for generating the
            // model/request/response/enum/exception class.
            submitTask(new ClassGeneratorTask(modelClassDir, javaShapeName,
                    freemarker.getShapeTemplate(shapeModel),
                    dataModel));

        }
    }

    /**
     * @param shapeType Shape type to get base class for.
     * @return Correct base type for the type of model. May depend on protocol and customizations.
     * Null if model has no base type.
     */
    private String getModelBaseClassFqcn(String shapeType) {
        switch (ShapeType.fromValue(shapeType)) {
            case Exception:
                return model.getSdkModeledExceptionBaseFqcn();
            case Response:
                return model.getSdkBaseResponseFqcn();
            case Request:
                return "com.amazonaws.AmazonWebServiceRequest";
            default:
                return null;
        }
    }

    private void emitExceptionBaseClass() throws IOException {
        final String baseClassName = model.getSdkModeledExceptionBaseClassName();
        submitTask(new ClassGeneratorTask(modelClassDir,
                                          baseClassName,
                                          freemarker.getBaseExceptionClassTemplate(),
                                          ImmutableMapParameter.of(
                                                  "fileHeader", model.getFileHeader(),
                                                  "className", baseClassName,
                                                  "metadata", model.getMetadata(),
                                                  "baseExceptionFqcn",
                                                  model.getServiceBaseExceptionFqcn())));
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
                    "fileHeader", model.getFileHeader(),
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
                    "fileHeader", model.getFileHeader(),
                    "shape", shapeModel,
                    "metadata", metadata,
                    "exceptionUnmarshallerImpl", model.getExceptionUnmarshallerImpl());

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
        if (Protocol.CBOR.equals(protocol) || Protocol.ION.equals(protocol)) {
            templateProtocol = Protocol.JSON;
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
                "fileHeader", model.getFileHeader(),
                "operations", model.getOperations().keySet(),
                "metadata", model.getMetadata(),
                "serviceName", serviceName,
                "actionPrefix", actionPrefix);

        submitTask(new ClassGeneratorTask(new CodeWriter(policyEnumClassDir, serviceName + "Actions"),
                freemarker.getPolicyActionClassTemplate(), dataModel));

    }

    /**
     * Constructs the data model and submits tasks for every generating SDKFunction for every unique
     * operation in the waiter intermediate model
     * @throws IOException
     */
    private void emitWaiterOpFunctionClasses() throws IOException {
        List<String> generatedOperations = new ArrayList<>();
        for (Map.Entry<String, WaiterDefinitionModel> entry : model.getWaiters().entrySet()) {

            final WaiterDefinitionModel waiterModel = entry.getValue();

            if(!generatedOperations.contains(waiterModel.getOperationName())) {
                generatedOperations.add(waiterModel.getOperationName());
                Map<String, Object> dataModel = ImmutableMapParameter.of(
                        "fileHeader", model.getFileHeader(),
                        "waiter", waiterModel,
                        "operation", model.getOperation(waiterModel.getOperationName()),
                        "metadata", model.getMetadata());

                final String className = waiterModel.getOperationModel().getOperationName() + "Function";

                submitTask(new ClassGeneratorTask(waiterClassDir, className,
                        freemarker.getWaiterSDKFunctionTemplate(),
                        dataModel));
            }
        }

    }

    /**
     * Constructs the data model and submits tasks for every generating Acceptor for each waiter definition
     * in the intermediate model
     * @throws IOException
     */
    private void emitWaiterAcceptorClasses() throws IOException {
        for (Map.Entry<String, WaiterDefinitionModel> entry : model.getWaiters().entrySet()) {
            if(containsAllStatusMatchers(entry)){
                continue;
            }

            final String waiterName = entry.getKey();
            final WaiterDefinitionModel waiterModel = entry.getValue();

            Map<String, Object> dataModel = ImmutableMapParameter.of(
                    "fileHeader", model.getFileHeader(),
                    "waiter", waiterModel,
                    "operation", model.getOperation(waiterModel.getOperationName()),
                    "metadata", model.getMetadata());

            submitTask(new ClassGeneratorTask(waiterClassDir, waiterName,
                    freemarker.getWaiterAcceptorTemplate(),
                    dataModel));

        }
    }

    private static boolean containsAllStatusMatchers(Map.Entry<String, WaiterDefinitionModel> entry){
        return entry.getValue().getAcceptors().stream()
                .allMatch(a -> a.getMatcher().equals("status"));
    }

    /**
     * Constructs the data model and submits tasks for every generating synchronous waiter and
     * asynchronous waiter for each waiter in the intermediate model. Skips if the waiter file
     * is empty.
     * @throws IOException
     */
    private void emitWaiterClasses() throws IOException {
        if(model.getWaiters().size() > 0) {
            Metadata metadata = model.getMetadata();
            final String className = metadata.getSyncInterface() + "Waiters";
            Map<String, Object> dataModel = ImmutableMapParameter.of(
                    "fileHeader", model.getFileHeader(),
                    "className", className,
                    "waiters", model.getWaiters(),
                    "operation", model.getOperations(),
                    "metadata", metadata);

            submitTask(new ClassGeneratorTask(waiterClassDir, className,
                    freemarker.getWaiterTemplate(),
                    dataModel));
        }
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
