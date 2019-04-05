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

import com.amazonaws.codegen.internal.Constants;
import com.amazonaws.codegen.model.config.ConstructorFormsWrapper;
import com.amazonaws.codegen.model.config.templates.CodeGenTemplatesConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomizationConfig {

    public static final CustomizationConfig DEFAULT = new CustomizationConfig();

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
     * True if we want to apply the ServiceClientHolderInputStream wrapper to all the stream
     * response returned by the client; the purpose is to prevent the client being GCed before the
     * response data is fully consumed.
     */
    private boolean serviceClientHoldInputStream;

    /**
     * The name of the operations where the LengthCheckInputStream wrapper should be applied to the
     * response stream.
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
     * Fully qualified class name of the client configuration factory to use when producing client
     * configurations for this client.  This factory is called when an explicit ClientConfiguration
     * is not provided in the service client's constructor. <p> Example:
     * "com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientConfigurationFactory" </p>
     */
    private String customClientConfigFactory;

    /**
     * The name of the custom class returned by the client method getCacheResponseMetadata.
     * Currently it's only set for SimpleDB ("SimpleDBResponseMetadata")
     */
    private String customResponseMetadataClassName;

    /**
     * Fully qualified class name of response handler implementation to use. Services with custom response metadata
     * tends to use this like SimpleDB. This customization currently is only supported for XML based protocols.
     */
    private String customResponseHandlerFqcn;

    /**
     * True if the generated interface should NOT include shutdown() and getCachedResponseData
     * methods. Currently it's only set true for SimpleDB.
     */
    private boolean skipInterfaceAdditions;

    /**
     * Overrides the request-level service name that will be used for request metrics and service
     * exceptions. If not specified, the client will use the service interface name by default.
     *
     * Example: for backwards compatibility, this is set to "AmazonDynamoDBv2" for DynamoDB client.
     *
     * @see {@link com.amazonaws.Request#getServiceName()}
     */
    private String customServiceNameForRequest;

    /**
     * True if the generated code should enable client-side validation on required input
     * parameters.
     */
    private boolean requiredParamValidationEnabled;

    /**
     * Specify additional constructor forms for a given model class.
     */
    private Map<String, ConstructorFormsWrapper> additionalShapeConstructors;

    /**
     * Specify simplified method forms for a given operation API.
     */
    private Map<String, SimpleMethodFormsWrapper> simpleMethods;

    /**
     * Specify shapes to be renamed.
     */
    private Map<String, String> renameShapes;

    /**
     * Specify List member shapes to send empty String when the List is auto-constructed in query
     * protocol. This customization will only affect marshaling when autoConstructList is true.
     * Currently, it's only set in ElasticLoadBalancing service.
     */
    private Map<String, List<String>> sendEmptyAutoConstructedListAsEmptyList;

    /**
     * Marshalls empty lists on the wire. This customization does not send empty lists created by
     * the autoconstruct customization and is only applicable to AWS Query services.
     */
    private boolean sendExplicitlyEmptyListsForQuery;

    /**
     * Configuration for generating policy action enums.
     */
    private AuthPolicyActions authPolicyActions;

    /**
     * Custom service and intermediate model metadata properties.
     */
    private MetadataConfig customServiceMetadata;

    private CodeGenTemplatesConfig customCodeTemplates;

    /**
     * Codegen customization mechanism shared by the .NET SDK
     */
    private Map<String, OperationModifier> operationModifiers;
    private Map<String, ShapeSubstitution> shapeSubstitutions;
    private Map<String, ShapeModifier> shapeModifiers;

    /**
     * Sets the custom field name that identifies the type of modeled exception for JSON protocols.
     * Normally this is '__type' but Glacier has a custom error code field named simply 'code'.
     */
    private String customErrorCodeFieldName;

    /**
     * Customization to use the actual shape name of output shapes (as defined in the service model)
     * to name the corresponding Java class. Normally we derive a new name using the operation name
     * (i.e. PutFooResult). This is currently only exercised by SWF and mainly to preserve backwards
     * compatibility due to a bug in the previous code generator. This is similar to the 'wrapper'
     * trait in the normalized model but unlike for Query services, this customization has no affect
     * on how the shape is represented on the wire.
     */
    private boolean useModeledOutputShapeNames;

    /**
     * Service specific base class for all modeled exceptions. By default this is syncInterface +
     * Exception (i.e. AmazonSQSException). Currently only DynamoDB Streams utilizes this
     * customization since it shares exception types with the DynamoDB client.
     *
     * <p>This customization should only provide the simple class name. The typical model package
     * will be used when fully qualifying references to this exception</p>
     *
     * <p><b>Note:</b> that if a custom base class is provided the generator will not generate one.
     * We assume it already exists.</p>
     */
    private String sdkModeledExceptionBaseClassName;

    /**
     * Uses the specified SignerProvider implementation for this client.
     */
    private String customSignerProvider;

    /**
     * Service calculates CRC32 checksum from compressed file when Accept-Encoding: gzip header is provided.
     */
    private boolean calculateCRC32FromCompressedData;

    /**
     * Custom file header for all generated Java classes. If not specified uses default Amazon
     * license header.
     */
    private String customFileHeader;

    /**
     * List of 'convenience' overloads to generate for model classes. Convenience overloads expose a
     * different type that is adapted to the real type
     */
    private final List<ConvenienceTypeOverload> convenienceTypeOverloads = new ArrayList<ConvenienceTypeOverload>();

    /**
     * Skips generating smoketests if set to true.
     */
    private boolean skipSmokeTests;

    /**
     * Fully qualified class name of presigner extension class if it exists.
     */
    private String presignersFqcn;

    /**
     * A set of deprecated code that generation can be suppressed for
     */
    private Set<DeprecatedSuppression> deprecatedSuppressions;

    /**
     * Relative path to customize transform directory. Will be generated relative
     * to the models directory. Default is {@value Constants#PACKAGE_NAME_TRANSFORM_SUFFIX}.
     */
    private String transformDirectory = Constants.PACKAGE_NAME_TRANSFORM_SUFFIX;

    /**
     * Customization to emit a setter overload that takes an enum. This breaks the POJO contract so we only do it
     * for enums previously shipped to maintain backwards compatibility.
     */
    private Map<String, List<String>> emitLegacyEnumSetterFor;

    /**
     * Customization to omit an operation from the client interface (and abstract class and client implementation) but still
     * generate the input/output Java POJOs and marshaller/unmarshaller.
     */
    private List<String> skipClientMethodForOperations = Collections.emptyList();

    /**
     * Overrides the Content-Type header for the protocol. For Rest-JSON we send empty content type
     * which causes some problems with API Gateway fronted services in certain scenarios.
     */
    private String contentTypeOverride;

    /**
     * True if uid is used as file name prefix, false otherwise
     */
    private boolean useUidAsFilePrefix;

    private CustomizationConfig(){
    }

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

    public String getCustomClientConfigFactory() {
        return customClientConfigFactory;
    }

    public void setCustomClientConfigFactory(String customClientConfigFactory) {
        this.customClientConfigFactory = customClientConfigFactory;
    }

    public String getCustomResponseMetadataClassName() {
        return customResponseMetadataClassName;
    }

    public void setCustomResponseMetadataClassName(String customResponseMetadataClassName) {
        this.customResponseMetadataClassName = customResponseMetadataClassName;
    }

    public String getCustomResponseHandlerFqcn() {
        return customResponseHandlerFqcn;
    }

    public void setCustomResponseHandlerFqcn(String customResponseHandlerFqcn) {
        this.customResponseHandlerFqcn = customResponseHandlerFqcn;
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

    public void setCustomServiceNameForRequest(String customServiceNameForRequest) {
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

    public void setOperationModifiers(Map<String, OperationModifier> operationModifiers) {
        this.operationModifiers = operationModifiers;
    }

    public Map<String, ShapeSubstitution> getShapeSubstitutions() {
        return shapeSubstitutions;
    }

    public void setShapeSubstitutions(Map<String, ShapeSubstitution> shapeSubstitutions) {
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

    public void setRequiredParamValidationEnabled(boolean requiredParamValidationEnabled) {
        this.requiredParamValidationEnabled = requiredParamValidationEnabled;
    }

    /**
     * Customization to generate a method overload for a member setter that takes a string rather
     * than an InputStream. Currently only used by Lambda
     */
    public void setStringOverloadForInputStreamMember(
            StringOverloadForInputStreamMember stringOverloadForInputStreamMember) {
        this.convenienceTypeOverloads
                .add(stringOverloadForInputStreamMember.getConvenienceTypeOverload());
    }

    /**
     * Customization to generate a method overload for a member setter that takes a string rather
     * than an ByteBuffer. Currently only used by Lambda
     */
    public void setStringOverloadForByteBufferMember(
            StringOverloadForByteBufferMember stringOverloadForByteBufferMember) {
        this.convenienceTypeOverloads
                .add(stringOverloadForByteBufferMember.getConvenienceTypeOverload());
    }

    public List<ConvenienceTypeOverload> getConvenienceTypeOverloads() {
        return this.convenienceTypeOverloads;
    }

    public void setConvenienceTypeOverloads(List<ConvenienceTypeOverload> convenienceTypeOverloads) {
        this.convenienceTypeOverloads.addAll(convenienceTypeOverloads);
    }

    public MetadataConfig getCustomServiceMetadata() {
        return customServiceMetadata;
    }

    public void setCustomServiceMetadata(MetadataConfig metadataConfig) {
        this.customServiceMetadata = metadataConfig;
    }

    public String getCustomErrorCodeFieldName() {
        return customErrorCodeFieldName;
    }

    public void setCustomErrorCodeFieldName(String customErrorCodeFieldName) {
        this.customErrorCodeFieldName = customErrorCodeFieldName;
    }

    public boolean useModeledOutputShapeNames() {
        return useModeledOutputShapeNames;
    }

    public void setUseModeledOutputShapeNames(boolean useModeledOutputShapeNames) {
        this.useModeledOutputShapeNames = useModeledOutputShapeNames;
    }

    public String getSdkModeledExceptionBaseClassName() {
        return sdkModeledExceptionBaseClassName;
    }

    public void setSdkModeledExceptionBaseClassName(String sdkModeledExceptionBaseClassName) {
        this.sdkModeledExceptionBaseClassName = sdkModeledExceptionBaseClassName;
    }

    public String getCustomSignerProvider() {
        return customSignerProvider;
    }

    public void setCustomSignerProvider(String customSignerProvider) {
        this.customSignerProvider = customSignerProvider;
    }

    public boolean isCalculateCRC32FromCompressedData() {
        return calculateCRC32FromCompressedData;
    }

    public void setCalculateCRC32FromCompressedData(
            boolean calculateCRC32FromCompressedData) {
        this.calculateCRC32FromCompressedData = calculateCRC32FromCompressedData;
    }

    public String getCustomFileHeader() {
        return customFileHeader;
    }

    public void setCustomFileHeader(String customFileHeader) {
        this.customFileHeader = customFileHeader;
    }

    public boolean isSkipSmokeTests() {
        return skipSmokeTests;
    }

    public void setSkipSmokeTests(boolean skipSmokeTests) {
        this.skipSmokeTests = skipSmokeTests;
    }

    public boolean isSendExplicitlyEmptyListsForQuery() {
        return sendExplicitlyEmptyListsForQuery;
    }

    public void setSendExplicitlyEmptyListsForQuery(boolean sendExplicitlyEmptyListsForQuery) {
        this.sendExplicitlyEmptyListsForQuery = sendExplicitlyEmptyListsForQuery;
    }

    public String getPresignersFqcn() {
        return presignersFqcn;
    }

    public void setPresignersFqcn(String presignersFqcn) {
        this.presignersFqcn = presignersFqcn;
    }

    public String getTransformDirectory() {
        return transformDirectory;
    }

    public CustomizationConfig setTransformDirectory(String transformDirectory) {
        this.transformDirectory = transformDirectory;
        return this;
    }

    public Set<DeprecatedSuppression> getDeprecatedSuppressions() {
        return deprecatedSuppressions;
    }

    public void setDeprecatedSuppressions(Set<DeprecatedSuppression> deprecatedSuppressions) {
        this.deprecatedSuppressions = deprecatedSuppressions;
    }

    public boolean emitClientMutationMethods() {
        return !shouldSuppress(DeprecatedSuppression.ClientMutationMethods);
    }

    public boolean emitClientConstructors() {
        return !shouldSuppress(DeprecatedSuppression.ClientConstructors);
    }

    public boolean emitEnumSetterOverload() {
        return !shouldSuppress(DeprecatedSuppression.EnumSetterOverload);
    }

    private boolean shouldSuppress(DeprecatedSuppression suppression) {
        return deprecatedSuppressions != null && deprecatedSuppressions.contains(suppression);
    }

    public Map<String, List<String>> getEmitLegacyEnumSetterFor() {
        return emitLegacyEnumSetterFor;
    }

    public CustomizationConfig setEmitLegacyEnumSetterFor(
            Map<String, List<String>> emitLegacyEnumSetterFor) {
        this.emitLegacyEnumSetterFor = emitLegacyEnumSetterFor;
        return this;
    }

    public List<String> getSkipClientMethodForOperations() {
        return skipClientMethodForOperations;
    }

    public void setSkipClientMethodForOperations(List<String> skipClientMethodForOperations) {
        this.skipClientMethodForOperations = skipClientMethodForOperations;
    }

    public String getContentTypeOverride() {
        return contentTypeOverride;
    }

    public void setContentTypeOverride(String contentTypeOverride) {
        this.contentTypeOverride = contentTypeOverride;
    }

    public boolean isUseUidAsFilePrefix() {
        return useUidAsFilePrefix;
    }

    public void setUseUidAsFilePrefix(boolean useUidAsFilePrefix) {
        this.useUidAsFilePrefix = useUidAsFilePrefix;
    }


}
