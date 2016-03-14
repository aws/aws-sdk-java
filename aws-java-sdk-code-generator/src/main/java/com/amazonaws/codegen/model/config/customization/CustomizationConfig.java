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
import java.util.Map;

import com.amazonaws.codegen.model.config.ConstructorFormsWrapper;
import com.amazonaws.codegen.model.config.templates.CodeGenTemplatesConfig;

public class CustomizationConfig {

    /**
     * The fully-qualified class name of the custom metric types to be collected by the client.
     *
     * Example: "com.amazonaws.services.dynamodbv2.metrics.DynamoDBRequestMetric"
     */
    private String requestMetrics;

    /**
     * True if auto-construct list is in use; false otherwise.
     */
    private boolean useAutoConstructList;

    /**
     * True if auto-construct map is in use; false otherwise.
     */
    private boolean useAutoConstructMap;

    /**
     * True if we want to apply the ServiceClientHolderInputStream wrapper to
     * all the stream response returned by the client; the purpose is to prevent the
     * client being GCed before the response data is fully consumed.
     */
    private boolean serviceClientHoldInputStream;

    /**
     * The name of the operations where the LengthCheckInputStream wrapper
     * should be applied to the response stream.
     */
    private List<String> operationsWithResponseStreamContentLengthValidation;

    /**
     * If specified the name of the custom exception unmarshaller (e.g. 'LegacyErrorUnmarshaller'
     * for SimpleDB). If not set then the default unmarshaller of the protocol will be used (e.g.
     * StandardErrorUnmarshaller for aws-query and rest-xml). Currently the exception unmarshaller
     * for JSON protocols is not customizable.
     */
    private String customExceptionUnmarshallerImpl;

    /**
     * Fully qualified class name of the client configuration factory to use when producing
     * client configurations for this client.  This factory is called when an explicit
     * ClientConfiguration is not provided in the service client's constructor.
     * <p>
     * Example: "com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientConfigurationFactory"
     * </p>
     */
    private String customClientConfigFactory;

    /**
     * The name of the custom class returned by the client method getCacheResponseMetadata.
     * Currently it's only set for SimpleDB ("SimpleDBResponseMetadata")
     */
    private String customResponseMetadataClassName;

    /**
     * True if the generated interface should NOT include shutdown() and getCachedResponseData methods.
     * Currently it's only set true for SimpleDB.
     */
    private boolean skipInterfaceAdditions;

    /**
     * Overrides the request-level service name that will be used for request
     * metrics and service exceptions. If not specified, the client will use the
     * service interface name by default.
     *
     * Example: for backwards compatibility, this is set to "AmazonDynamoDBv2"
     * for DynamoDB client.
     *
     * @see {@link Request#getServiceName()}
     */
    private String customServiceNameForRequest;

    /**
     * True if the generated code should enable client-side validation on
     * required input parameters.
     */
    private boolean requiredParamValidationEnabled;

    /**
     * Specify additional constructor forms for a given model class.
     */
    private Map<String,ConstructorFormsWrapper> additionalShapeConstructors;

    /**
     * Specify simplified method forms for a given operation API.
     */
    private Map<String, SimpleMethodFormsWrapper> simpleMethods;

    /**
     * Specify shapes to be renamed.
     */
    private Map<String, String> renameShapes;

    /**
     * Specify List member shapes to send empty String when the List is auto-constructed in query protocol.
     * This customization will only affect marshaling when autoConstructList is true.
     * Currently, it's only set in ElasticLoadBalancing service.
     */
    private Map<String, List<String>> sendEmptyAutoConstructedListAsEmptyList;

    /**
     * Configuration for generating policy action enums.
     */
    private AuthPolicyActions authPolicyActions;

    private CodeGenTemplatesConfig customCodeTemplates;

    /**
     * Codegen customization mechanism shared by the .NET SDK
     */
    private Map<String, OperationModifier> operationModifiers;
    private Map<String, ShapeSubstitution> shapeSubstitutions;
    private Map<String, ShapeModifier> shapeModifiers;

    public String getRequestMetrics() {
        return requestMetrics;
    }

    public void setRequestMetrics(String requestMetrics) {
        this.requestMetrics = requestMetrics;
    }

    public boolean isServiceClientHoldInputStream() {
        return serviceClientHoldInputStream;
    }

    public void setServiceClientHoldInputStream(boolean serviceClientHoldInputStream) {
        this.serviceClientHoldInputStream = serviceClientHoldInputStream;
    }

    public List<String> getOperationsWithResponseStreamContentLengthValidation() {
        return operationsWithResponseStreamContentLengthValidation;
    }

    public void setOperationsWithResponseStreamContentLengthValidation(
            List<String> operationsWithResponseStreamContentLengthValidation) {
        this.operationsWithResponseStreamContentLengthValidation = operationsWithResponseStreamContentLengthValidation;
    }

    public String getCustomExceptionUnmarshallerImpl() {
        return customExceptionUnmarshallerImpl;
    }

    public void setCustomExceptionUnmarshallerImpl(String customExceptionUnmarshallerImpl) {
        this.customExceptionUnmarshallerImpl = customExceptionUnmarshallerImpl;
    }

    public String getCustomClientConfigFactory() { return customClientConfigFactory; }

    public void setCustomClientConfigFactory(String customClientConfigFactory) {
        this.customClientConfigFactory = customClientConfigFactory;
    }

    public String getCustomResponseMetadataClassName() {
        return customResponseMetadataClassName;
    }

    public void setCustomResponseMetadataClassName(
            String customResponseMetadataClassName) {
        this.customResponseMetadataClassName = customResponseMetadataClassName;
    }

    public boolean isSkipInterfaceAdditions() {
        return skipInterfaceAdditions;
    }

    public void setSkipInterfaceAdditions(boolean skipInterfaceAdditions) {
        this.skipInterfaceAdditions = skipInterfaceAdditions;
    }

    public String getCustomServiceNameForRequest() {
        return customServiceNameForRequest;
    }

    public void setCustomServiceNameForRequest(
            String customServiceNameForRequest) {
        this.customServiceNameForRequest = customServiceNameForRequest;
    }

    public CodeGenTemplatesConfig getCustomCodeTemplates() {
        return customCodeTemplates;
    }

    public void setCustomCodeTemplates(CodeGenTemplatesConfig customCodeTemplates) {
        this.customCodeTemplates = customCodeTemplates;
    }

    public Map<String, ConstructorFormsWrapper> getAdditionalShapeConstructors() {
        return additionalShapeConstructors;
    }

    public void setAdditionalShapeConstructors(
            Map<String, ConstructorFormsWrapper> additionalConstructors) {
        this.additionalShapeConstructors = additionalConstructors;
    }

    public Map<String, OperationModifier> getOperationModifiers() {
        return operationModifiers;
    }

    public Map<String, String> getRenameShapes() {
        return renameShapes;
    }

    public void setRenameShapes(Map<String, String> renameShapes) {
        this.renameShapes = renameShapes;
    }

    public Map<String, List<String>> getSendEmptyAutoConstructedListAsEmptyList() {
        return sendEmptyAutoConstructedListAsEmptyList;
    }

    public void setSendEmptyAutoConstructedListAsEmptyList(
            Map<String, List<String>> sendEmptyAutoConstructedListAsEmptyList) {
        this.sendEmptyAutoConstructedListAsEmptyList = sendEmptyAutoConstructedListAsEmptyList;
    }

    public void setOperationModifiers(
            Map<String, OperationModifier> operationModifiers) {
        this.operationModifiers = operationModifiers;
    }

    public Map<String, ShapeSubstitution> getShapeSubstitutions() {
        return shapeSubstitutions;
    }

    public void setShapeSubstitutions(
            Map<String, ShapeSubstitution> shapeSubstitutions) {
        this.shapeSubstitutions = shapeSubstitutions;
    }

    public Map<String, ShapeModifier> getShapeModifiers() {
        return shapeModifiers;
    }

    public void setShapeModifiers(Map<String, ShapeModifier> shapeModifiers) {
        this.shapeModifiers = shapeModifiers;
    }

    public Map<String, SimpleMethodFormsWrapper> getSimpleMethods() {
        return simpleMethods;
    }

    public void setSimpleMethods(Map<String, SimpleMethodFormsWrapper> simpleMethods) {
        this.simpleMethods = simpleMethods;
    }

    public boolean isUseAutoConstructList() {
        return useAutoConstructList;
    }

    public void setUseAutoConstructList(boolean useAutoConstructList) {
        this.useAutoConstructList = useAutoConstructList;
    }

    public boolean isUseAutoConstructMap() {
        return useAutoConstructMap;
    }

    public void setUseAutoConstructMap(boolean useAutoConstructMap) {
        this.useAutoConstructMap = useAutoConstructMap;
    }

    public AuthPolicyActions getAuthPolicyActions() {
        return authPolicyActions;
    }

    public void setAuthPolicyActions(AuthPolicyActions policyActions) {
        this.authPolicyActions = policyActions;
    }

    public boolean isRequiredParamValidationEnabled() {
        return requiredParamValidationEnabled;
    }

    public void setRequiredParamValidationEnabled(
            boolean requiredParamValidationEnabled) {
        this.requiredParamValidationEnabled = requiredParamValidationEnabled;
    }
}
