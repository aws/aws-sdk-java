/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.protocol;

import com.amazonaws.Request;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.http.HttpMethodName;


/**
 * Static information about an API operation used to marshall it correctly.
 */
@SdkProtectedApi
public class OperationInfo {

    private final Protocol protocol;
    private final String requestUri;
    private final HttpMethodName httpMethodName;
    private final String operationIdentifier;
    private final String serviceName;
    private final boolean hasExplicitPayloadMember;
    private final boolean hasPayloadMembers;
    private final String serviceId;

    private OperationInfo(Builder builder) {
        this.protocol = builder.protocol;
        this.requestUri = builder.requestUri;
        this.httpMethodName = builder.httpMethodName;
        this.operationIdentifier = builder.operationIdentifier;
        this.serviceName = builder.serviceName;
        this.hasExplicitPayloadMember = builder.hasExplicitPayloadMember;
        this.hasPayloadMembers = builder.hasPayloadMembers;
        this.serviceId = builder.serviceId;
    }

    /**
     * @return The protocol of the client. Gives hints to the marshaller on how things should be transformed.
     */
    public Protocol protocol() {
        return protocol;
    }

    /**
     * @return Request URI for operation (may contain placeholders for members bound to the uri).
     */
    public String requestUri() {
        return requestUri;
    }

    /**
     * @return HTTP Method that should be used when sending the request.
     */
    public HttpMethodName httpMethodName() {
        return httpMethodName;
    }

    /**
     * @return Identifer for the operation/API being invoked. This is used for RPC based protocols that
     * need to identify which action is being taken. For Query/EC2 protocol this is sent as the 'Action' query
     * parameter, for JSON RPC this is sent as the 'X-Amz-Target' header.
     */
    public String operationIdentifier() {
        return operationIdentifier;
    }

    /**
     * @return Display name for the service. Mainly used for the metrics system but is also available on the {@link Request}
     * object (to do something in a {@link com.amazonaws.handlers.RequestHandler2} for example). This is usually the service
     * interface name but may be customized at generation time ('AmazonDynamoDBv2' for example).
     */
    public String serviceName() {
        return serviceName;
    }

    /**
     * @return True if the operation has a member that's explicitly marked as the payload. False otherwise. (Applicable only to
     * RESTUL protocols).
     */
    public boolean hasExplicitPayloadMember() {
        return hasExplicitPayloadMember;
    }

    /**
     * @return True if the operation has members bound to the payload. Some requests (especially GET and DELETE) may not
     * have any members bound to the payload. (Applicable only to RESTFUL protocols).
     */
    public boolean hasPayloadMembers() {
        return hasPayloadMembers;
    }

    public String serviceId() {
        return serviceId;
    }

    /**
     * @return Builder instance to construct a {@link OperationInfo}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link OperationInfo}.
     */
    public static final class Builder {

        private Protocol protocol;
        private String requestUri;
        private HttpMethodName httpMethodName;
        private String operationIdentifier;
        private String serviceName;
        private boolean hasExplicitPayloadMember;
        private boolean hasPayloadMembers;
        private String serviceId;

        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder requestUri(String requestUri) {
            this.requestUri = requestUri;
            return this;
        }

        public Builder httpMethodName(HttpMethodName httpMethodName) {
            this.httpMethodName = httpMethodName;
            return this;
        }

        public Builder operationIdentifier(String operationIdentifier) {
            this.operationIdentifier = operationIdentifier;
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder hasExplicitPayloadMember(boolean hasExplicitPayloadMember) {
            this.hasExplicitPayloadMember = hasExplicitPayloadMember;
            return this;
        }

        public Builder hasPayloadMembers(boolean hasPayloadMembers) {
            this.hasPayloadMembers = hasPayloadMembers;
            return this;
        }

        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        private Builder() {
        }

        /**
         * @return An immutable {@link OperationInfo} object.
         */
        public OperationInfo build() {
            return new OperationInfo(this);
        }
    }
}
