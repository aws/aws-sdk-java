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

package com.amazonaws.codegen.model.intermediate;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Metadata {

    private String apiVersion;

    private String exceptionUnmarshallerImpl;

    private Protocol protocol;

    // TODO Not sure if this is needed.Remove if not needed.
    private String checksumFormat;

    private String documentation;

    private String defaultEndpoint;

    private String defaultEndpointWithoutHttpProtocol;

    private String syncInterface;

    private String syncClient;

    private String asyncInterface;

    private String asyncClient;

    private String packageName;

    private String packagePath;

    private String serviceAbbreviation;

    private String serviceFullName;

    private boolean hasApiWithStreamInput;

    private String jsonContentVersion;

    private String jsonVersion;

    private String endpointPrefix;

    private String signingName;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Metadata withApiVersion(String apiVersion) {
        setApiVersion(apiVersion);
        return this;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public Metadata withProtocol(Protocol protocol) {
        setProtocol(protocol);
        return this;
    }

    public String getExceptionUnmarshallerImpl() {
        return exceptionUnmarshallerImpl;
    }

    public void setExceptionUnmarshallerImpl(String protocolDefaultExceptionUnmarshallerImpl) {
        this.exceptionUnmarshallerImpl = protocolDefaultExceptionUnmarshallerImpl;
    }

    public Metadata withExceptionUnmarshallerImpl(String protocolDefaultExceptionUnmarshallerImpl) {
        setExceptionUnmarshallerImpl(protocolDefaultExceptionUnmarshallerImpl);
        return this;
    }

    public String getChecksumFormat() {
        return checksumFormat;
    }

    public void setChecksumFormat(String checksumFormat) {
        this.checksumFormat = checksumFormat;
    }

    public Metadata withChecksumFormat(String checksumFormat) {
        setChecksumFormat(checksumFormat);
        return this;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public Metadata withDocumentation(String documentation) {
        setDocumentation(documentation);
        return this;
    }

    public String getDefaultEndpoint() {
        return defaultEndpoint;
    }

    public void setDefaultEndpoint(String defaultEndpoint) {
        this.defaultEndpoint = defaultEndpoint;
    }

    public Metadata withDefaultEndpoint(String defaultEndpoint) {
        setDefaultEndpoint(defaultEndpoint);
        return this;
    }

    public String getDefaultEndpointWithoutHttpProtocol() {
        return defaultEndpointWithoutHttpProtocol;
    }

    public void setDefaultEndpointWithoutHttpProtocol(
                                                      String defaultEndpointWithoutHttpProtocol) {
        this.defaultEndpointWithoutHttpProtocol = defaultEndpointWithoutHttpProtocol;
    }

    public Metadata withDefaultEndpointWithoutHttpProtocol(
                                                           String defaultEndpointWithoutHttpProtocol) {
        setDefaultEndpointWithoutHttpProtocol(defaultEndpointWithoutHttpProtocol);
        return this;
    }

    public String getSyncInterface() {
        return syncInterface;
    }

    public void setSyncInterface(String syncInterface) {
        this.syncInterface = syncInterface;
    }

    public Metadata withSyncInterface(String syncInterface) {
        setSyncInterface(syncInterface);
        return this;
    }

    @JsonIgnore
    public String getSyncAbstractClass() {
        return syncInterface == null ? null : "Abstract" + syncInterface;
    }

    public String getSyncClient() {
        return syncClient;
    }

    public void setSyncClient(String syncClient) {
        this.syncClient = syncClient;
    }

    public Metadata withSyncClient(String syncClient) {
        setSyncClient(syncClient);
        return this;
    }

    public String getAsyncInterface() {
        return asyncInterface;
    }

    public void setAsyncInterface(String asyncInterface) {
        this.asyncInterface = asyncInterface;
    }

    public Metadata withAsyncInterface(String asyncInterface) {
        setAsyncInterface(asyncInterface);
        return this;
    }

    @JsonIgnore
    public String getAsyncAbstractClass() {
        return asyncInterface == null ? null : "Abstract" + asyncInterface;
    }

    public String getAsyncClient() {
        return asyncClient;
    }

    public void setAsyncClient(String asyncClient) {
        this.asyncClient = asyncClient;
    }

    public Metadata withAsyncClient(String asyncClient) {
        setAsyncClient(asyncClient);
        return this;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Metadata withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    public String getPackagePath() {
        return packagePath;
    }

    public void setPackagePath(String packagePath) {
        this.packagePath = packagePath;
    }

    public Metadata withPackagePath(String packagePath) {
        setPackagePath(packagePath);
        return this;
    }

    /**
     * Returns an abbreviated name for the service if one is defined in the
     * service model; for example "Amazon EC2". Returns null if no abbreviation
     * is defined.
     */
    public String getServiceAbbreviation() {
        return serviceAbbreviation;
    }

    public void setServiceAbbreviation(String serviceAbbreviation) {
        this.serviceAbbreviation = serviceAbbreviation;
    }

    public Metadata withServiceAbbreviation(String serviceAbbreviation) {
        setServiceAbbreviation(serviceAbbreviation);
        return this;
    }

    /**
     * Returns the full name of the service as defined in the service model;
     * for example "Amazon Elastic Compute Cloud".
     */
    public String getServiceFullName() {
        return serviceFullName;
    }

    public void setServiceFullName(String serviceFullName) {
        this.serviceFullName = serviceFullName;
    }

    public Metadata withServiceFullName(String serviceFullName) {
        setServiceFullName(serviceFullName);
        return this;
    }

    /**
     * Returns a convenient name for the service. If an abbreviated form
     * of the service name is available it will return that, otherwise it
     * will return the full service name.
     * <p>
     * Use me when casually referring to a service in documentation. Use
     * {@code getServiceFullName} if you want to make sure you have the
     * full-on official name of the service.
     */
    public String getServiceName() {
        if (serviceAbbreviation != null) {
            return serviceAbbreviation;
        }
        return serviceFullName;
    }

    public boolean isHasApiWithStreamInput() {
        return hasApiWithStreamInput;
    }

    public void setHasApiWithStreamInput(boolean hasApiWithStreamInput) {
        this.hasApiWithStreamInput = hasApiWithStreamInput;
    }

    public Metadata withHasApiWithStreamInput(boolean hasApiWithStreamInput) {
        setHasApiWithStreamInput(hasApiWithStreamInput);
        return this;
    }

    public String getJsonContentVersion() {
        return jsonContentVersion;
    }

    public void setJsonContentVersion(String jsonContentVersion) {
        this.jsonContentVersion = jsonContentVersion;
    }

    public Metadata withJsonContentVersion(String jsonContentVersion) {
        setJsonContentVersion(jsonContentVersion);
        return this;
    }

    public String getJsonVersion() {
        return jsonVersion;
    }

    public void setJsonVersion(String jsonVersion) {
        this.jsonVersion = jsonVersion;
    }

    public Metadata withJsonVersion(String jsonVersion) {
        setJsonVersion(jsonVersion);
        return this;
    }

    public boolean isCborProtocol() {
        return protocol == Protocol.CBOR || protocol == Protocol.REST_CBOR;
    }

    public boolean isJsonProtocol() {
        return protocol == Protocol.REST_JSON ||
                protocol == Protocol.JSON ||
                protocol == Protocol.CBOR ||
                protocol == Protocol.REST_CBOR;
    }

    public String getEndpointPrefix() {
        return endpointPrefix;
    }

    public void setEndpointPrefix(String endpointPrefix) {
        this.endpointPrefix = endpointPrefix;
    }

    public Metadata withEndpointPrefix(String endpointPrefix) {
        setEndpointPrefix(endpointPrefix);
        return this;
    }

    public String getSigningName() {
        return signingName;
    }

    public void setSigningName(String signingName) {
        this.signingName = signingName;
    }

    public Metadata withSigningName(String signingName) {
        setSigningName(signingName);
        return this;
    }

    public String getUnmarshallerContextClassName() {
        switch (protocol) {
        case EC2:
        case QUERY:
        case REST_XML:
            return "StaxUnmarshallerContext";
        case JSON:
        case REST_JSON:
        case CBOR:
        case REST_CBOR:
            return "JsonUnmarshallerContext";
        default:
            throw new RuntimeException(
                    "Unable to identify the unmarshaller context class name for "
                            + protocol.getValue());
        }
    }

    public String getUnmarshallerClassSuffix() {
        switch (protocol) {
        case EC2:
        case QUERY:
        case REST_XML:
            return "StaxUnmarshaller";
        case JSON:
        case REST_JSON:
        case CBOR:
        case REST_CBOR:
            return "JsonUnmarshaller";
        default:
            throw new RuntimeException(
                    "Unable to identify the unmarshaller class name suffix for "
                            + protocol.getValue());
        }
    }

    public String getProtocolDefaultExceptionUnmarshallerType() {
        switch (protocol) {
        case EC2:
        case QUERY:
        case REST_XML:
            return "StandardErrorUnmarshaller";
        case JSON:
        case REST_JSON:
        case CBOR:
        case REST_CBOR:
            return "JsonErrorUnmarshaller";
        default:
            throw new RuntimeException(
                    "Unable to identify the protocol specific default exception unsmarshaller class name for "
                            + protocol.getValue());
        }
    }
}
