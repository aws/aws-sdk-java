/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the target API entity to which the documentation applies.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentationPartLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * [Required] The type of API entity to which the documentation content applies. Valid values are <code>API</code>,
     * <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. Content inheritance does
     * not apply to any entity of the <code>API</code>, <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or <code>RESOURCE</code> type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The URL path of the target. It is a valid field for the API entity types of <code>RESOURCE</code>,
     * <code>METHOD</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     * <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>.
     * The default value is <code>/</code> for the root resource. When an applicable child entity inherits the content
     * of another entity of the same type with more general specifications of the other <code>location</code>
     * attributes, the child entity's <code>path</code> attribute must match that of the parent entity as a prefix.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The HTTP verb of a method. It is a valid field for the API entity types of <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is
     * <code>*</code> for any method. When an applicable child entity inherits the content of an entity of the same type
     * with more general specifications of the other <code>location</code> attributes, the child entity's
     * <code>method</code> attribute must match that of the parent entity exactly.
     * </p>
     */
    private String method;
    /**
     * <p>
     * The HTTP status code of a response. It is a valid field for the API entity types of <code>RESPONSE</code>,
     * <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any status
     * code. When an applicable child entity inherits the content of an entity of the same type with more general
     * specifications of the other <code>location</code> attributes, the child entity's <code>statusCode</code>
     * attribute must match that of the parent entity exactly.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The name of the targeted API entity. It is a valid and required field for the API entity types of
     * <code>AUTHORIZER</code>, <code>MODEL</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and <code>RESPONSE_HEADER</code>. It is an invalid field
     * for any other entity type.
     * </p>
     */
    private String name;

    /**
     * <p>
     * [Required] The type of API entity to which the documentation content applies. Valid values are <code>API</code>,
     * <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. Content inheritance does
     * not apply to any entity of the <code>API</code>, <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or <code>RESOURCE</code> type.
     * </p>
     * 
     * @param type
     *        [Required] The type of API entity to which the documentation content applies. Valid values are
     *        <code>API</code>, <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     *        <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     *        <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *        <code>RESPONSE_BODY</code>. Content inheritance does not apply to any entity of the <code>API</code>,
     *        <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or
     *        <code>RESOURCE</code> type.
     * @see DocumentationPartType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * [Required] The type of API entity to which the documentation content applies. Valid values are <code>API</code>,
     * <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. Content inheritance does
     * not apply to any entity of the <code>API</code>, <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or <code>RESOURCE</code> type.
     * </p>
     * 
     * @return [Required] The type of API entity to which the documentation content applies. Valid values are
     *         <code>API</code>, <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>
     *         , <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     *         <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *         <code>RESPONSE_BODY</code>. Content inheritance does not apply to any entity of the <code>API</code>,
     *         <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or
     *         <code>RESOURCE</code> type.
     * @see DocumentationPartType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * [Required] The type of API entity to which the documentation content applies. Valid values are <code>API</code>,
     * <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. Content inheritance does
     * not apply to any entity of the <code>API</code>, <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or <code>RESOURCE</code> type.
     * </p>
     * 
     * @param type
     *        [Required] The type of API entity to which the documentation content applies. Valid values are
     *        <code>API</code>, <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     *        <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     *        <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *        <code>RESPONSE_BODY</code>. Content inheritance does not apply to any entity of the <code>API</code>,
     *        <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or
     *        <code>RESOURCE</code> type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentationPartType
     */

    public DocumentationPartLocation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * [Required] The type of API entity to which the documentation content applies. Valid values are <code>API</code>,
     * <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. Content inheritance does
     * not apply to any entity of the <code>API</code>, <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or <code>RESOURCE</code> type.
     * </p>
     * 
     * @param type
     *        [Required] The type of API entity to which the documentation content applies. Valid values are
     *        <code>API</code>, <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     *        <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     *        <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *        <code>RESPONSE_BODY</code>. Content inheritance does not apply to any entity of the <code>API</code>,
     *        <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or
     *        <code>RESOURCE</code> type.
     * @see DocumentationPartType
     */

    public void setType(DocumentationPartType type) {
        withType(type);
    }

    /**
     * <p>
     * [Required] The type of API entity to which the documentation content applies. Valid values are <code>API</code>,
     * <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. Content inheritance does
     * not apply to any entity of the <code>API</code>, <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or <code>RESOURCE</code> type.
     * </p>
     * 
     * @param type
     *        [Required] The type of API entity to which the documentation content applies. Valid values are
     *        <code>API</code>, <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
     *        <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     *        <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *        <code>RESPONSE_BODY</code>. Content inheritance does not apply to any entity of the <code>API</code>,
     *        <code>AUTHORIZER</code>, <code>METHOD</code>, <code>MODEL</code>, <code>REQUEST_BODY</code>, or
     *        <code>RESOURCE</code> type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentationPartType
     */

    public DocumentationPartLocation withType(DocumentationPartType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The URL path of the target. It is a valid field for the API entity types of <code>RESOURCE</code>,
     * <code>METHOD</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     * <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>.
     * The default value is <code>/</code> for the root resource. When an applicable child entity inherits the content
     * of another entity of the same type with more general specifications of the other <code>location</code>
     * attributes, the child entity's <code>path</code> attribute must match that of the parent entity as a prefix.
     * </p>
     * 
     * @param path
     *        The URL path of the target. It is a valid field for the API entity types of <code>RESOURCE</code>,
     *        <code>METHOD</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *        <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>,
     *        <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is <code>/</code> for the
     *        root resource. When an applicable child entity inherits the content of another entity of the same type
     *        with more general specifications of the other <code>location</code> attributes, the child entity's
     *        <code>path</code> attribute must match that of the parent entity as a prefix.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The URL path of the target. It is a valid field for the API entity types of <code>RESOURCE</code>,
     * <code>METHOD</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     * <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>.
     * The default value is <code>/</code> for the root resource. When an applicable child entity inherits the content
     * of another entity of the same type with more general specifications of the other <code>location</code>
     * attributes, the child entity's <code>path</code> attribute must match that of the parent entity as a prefix.
     * </p>
     * 
     * @return The URL path of the target. It is a valid field for the API entity types of <code>RESOURCE</code>,
     *         <code>METHOD</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *         <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>,
     *         <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is <code>/</code> for the
     *         root resource. When an applicable child entity inherits the content of another entity of the same type
     *         with more general specifications of the other <code>location</code> attributes, the child entity's
     *         <code>path</code> attribute must match that of the parent entity as a prefix.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The URL path of the target. It is a valid field for the API entity types of <code>RESOURCE</code>,
     * <code>METHOD</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     * <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>.
     * The default value is <code>/</code> for the root resource. When an applicable child entity inherits the content
     * of another entity of the same type with more general specifications of the other <code>location</code>
     * attributes, the child entity's <code>path</code> attribute must match that of the parent entity as a prefix.
     * </p>
     * 
     * @param path
     *        The URL path of the target. It is a valid field for the API entity types of <code>RESOURCE</code>,
     *        <code>METHOD</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *        <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>,
     *        <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is <code>/</code> for the
     *        root resource. When an applicable child entity inherits the content of another entity of the same type
     *        with more general specifications of the other <code>location</code> attributes, the child entity's
     *        <code>path</code> attribute must match that of the parent entity as a prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentationPartLocation withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The HTTP verb of a method. It is a valid field for the API entity types of <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is
     * <code>*</code> for any method. When an applicable child entity inherits the content of an entity of the same type
     * with more general specifications of the other <code>location</code> attributes, the child entity's
     * <code>method</code> attribute must match that of the parent entity exactly.
     * </p>
     * 
     * @param method
     *        The HTTP verb of a method. It is a valid field for the API entity types of <code>METHOD</code>,
     *        <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     *        <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *        <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any method. When an applicable child
     *        entity inherits the content of an entity of the same type with more general specifications of the other
     *        <code>location</code> attributes, the child entity's <code>method</code> attribute must match that of the
     *        parent entity exactly.
     */

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * <p>
     * The HTTP verb of a method. It is a valid field for the API entity types of <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is
     * <code>*</code> for any method. When an applicable child entity inherits the content of an entity of the same type
     * with more general specifications of the other <code>location</code> attributes, the child entity's
     * <code>method</code> attribute must match that of the parent entity exactly.
     * </p>
     * 
     * @return The HTTP verb of a method. It is a valid field for the API entity types of <code>METHOD</code>,
     *         <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     *         <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *         <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any method. When an applicable child
     *         entity inherits the content of an entity of the same type with more general specifications of the other
     *         <code>location</code> attributes, the child entity's <code>method</code> attribute must match that of the
     *         parent entity exactly.
     */

    public String getMethod() {
        return this.method;
    }

    /**
     * <p>
     * The HTTP verb of a method. It is a valid field for the API entity types of <code>METHOD</code>,
     * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is
     * <code>*</code> for any method. When an applicable child entity inherits the content of an entity of the same type
     * with more general specifications of the other <code>location</code> attributes, the child entity's
     * <code>method</code> attribute must match that of the parent entity exactly.
     * </p>
     * 
     * @param method
     *        The HTTP verb of a method. It is a valid field for the API entity types of <code>METHOD</code>,
     *        <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>,
     *        <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and
     *        <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any method. When an applicable child
     *        entity inherits the content of an entity of the same type with more general specifications of the other
     *        <code>location</code> attributes, the child entity's <code>method</code> attribute must match that of the
     *        parent entity exactly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentationPartLocation withMethod(String method) {
        setMethod(method);
        return this;
    }

    /**
     * <p>
     * The HTTP status code of a response. It is a valid field for the API entity types of <code>RESPONSE</code>,
     * <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any status
     * code. When an applicable child entity inherits the content of an entity of the same type with more general
     * specifications of the other <code>location</code> attributes, the child entity's <code>statusCode</code>
     * attribute must match that of the parent entity exactly.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status code of a response. It is a valid field for the API entity types of <code>RESPONSE</code>,
     *        <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any
     *        status code. When an applicable child entity inherits the content of an entity of the same type with more
     *        general specifications of the other <code>location</code> attributes, the child entity's
     *        <code>statusCode</code> attribute must match that of the parent entity exactly.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status code of a response. It is a valid field for the API entity types of <code>RESPONSE</code>,
     * <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any status
     * code. When an applicable child entity inherits the content of an entity of the same type with more general
     * specifications of the other <code>location</code> attributes, the child entity's <code>statusCode</code>
     * attribute must match that of the parent entity exactly.
     * </p>
     * 
     * @return The HTTP status code of a response. It is a valid field for the API entity types of <code>RESPONSE</code>
     *         , <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is <code>*</code> for
     *         any status code. When an applicable child entity inherits the content of an entity of the same type with
     *         more general specifications of the other <code>location</code> attributes, the child entity's
     *         <code>statusCode</code> attribute must match that of the parent entity exactly.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTTP status code of a response. It is a valid field for the API entity types of <code>RESPONSE</code>,
     * <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any status
     * code. When an applicable child entity inherits the content of an entity of the same type with more general
     * specifications of the other <code>location</code> attributes, the child entity's <code>statusCode</code>
     * attribute must match that of the parent entity exactly.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status code of a response. It is a valid field for the API entity types of <code>RESPONSE</code>,
     *        <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. The default value is <code>*</code> for any
     *        status code. When an applicable child entity inherits the content of an entity of the same type with more
     *        general specifications of the other <code>location</code> attributes, the child entity's
     *        <code>statusCode</code> attribute must match that of the parent entity exactly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentationPartLocation withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The name of the targeted API entity. It is a valid and required field for the API entity types of
     * <code>AUTHORIZER</code>, <code>MODEL</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and <code>RESPONSE_HEADER</code>. It is an invalid field
     * for any other entity type.
     * </p>
     * 
     * @param name
     *        The name of the targeted API entity. It is a valid and required field for the API entity types of
     *        <code>AUTHORIZER</code>, <code>MODEL</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *        <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and <code>RESPONSE_HEADER</code>. It is an invalid
     *        field for any other entity type.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the targeted API entity. It is a valid and required field for the API entity types of
     * <code>AUTHORIZER</code>, <code>MODEL</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and <code>RESPONSE_HEADER</code>. It is an invalid field
     * for any other entity type.
     * </p>
     * 
     * @return The name of the targeted API entity. It is a valid and required field for the API entity types of
     *         <code>AUTHORIZER</code>, <code>MODEL</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *         <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and <code>RESPONSE_HEADER</code>. It is an invalid
     *         field for any other entity type.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the targeted API entity. It is a valid and required field for the API entity types of
     * <code>AUTHORIZER</code>, <code>MODEL</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     * <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and <code>RESPONSE_HEADER</code>. It is an invalid field
     * for any other entity type.
     * </p>
     * 
     * @param name
     *        The name of the targeted API entity. It is a valid and required field for the API entity types of
     *        <code>AUTHORIZER</code>, <code>MODEL</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>,
     *        <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code> and <code>RESPONSE_HEADER</code>. It is an invalid
     *        field for any other entity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentationPartLocation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getMethod() != null)
            sb.append("Method: ").append(getMethod()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentationPartLocation == false)
            return false;
        DocumentationPartLocation other = (DocumentationPartLocation) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getMethod() == null ^ this.getMethod() == null)
            return false;
        if (other.getMethod() != null && other.getMethod().equals(this.getMethod()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getMethod() == null) ? 0 : getMethod().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public DocumentationPartLocation clone() {
        try {
            return (DocumentationPartLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.DocumentationPartLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
