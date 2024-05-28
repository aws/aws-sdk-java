/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateListener" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateListenerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The action for the default rule. Each listener has a default rule. The default rule is used if no other rules
     * match.
     * </p>
     */
    private RuleAction defaultAction;
    /**
     * <p>
     * The name of the listener. A listener name must be unique within a service. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The listener port. You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the default
     * is 443.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The listener protocol.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String serviceIdentifier;
    /**
     * <p>
     * The tags for the listener.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        retry a request that completed successfully using the same client token and parameters, the retry succeeds
     *        without performing any actions. If the parameters aren't identical, the retry fails.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *         retry a request that completed successfully using the same client token and parameters, the retry
     *         succeeds without performing any actions. If the parameters aren't identical, the retry fails.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        retry a request that completed successfully using the same client token and parameters, the retry succeeds
     *        without performing any actions. If the parameters aren't identical, the retry fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The action for the default rule. Each listener has a default rule. The default rule is used if no other rules
     * match.
     * </p>
     * 
     * @param defaultAction
     *        The action for the default rule. Each listener has a default rule. The default rule is used if no other
     *        rules match.
     */

    public void setDefaultAction(RuleAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action for the default rule. Each listener has a default rule. The default rule is used if no other rules
     * match.
     * </p>
     * 
     * @return The action for the default rule. Each listener has a default rule. The default rule is used if no other
     *         rules match.
     */

    public RuleAction getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * The action for the default rule. Each listener has a default rule. The default rule is used if no other rules
     * match.
     * </p>
     * 
     * @param defaultAction
     *        The action for the default rule. Each listener has a default rule. The default rule is used if no other
     *        rules match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withDefaultAction(RuleAction defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

    /**
     * <p>
     * The name of the listener. A listener name must be unique within a service. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @param name
     *        The name of the listener. A listener name must be unique within a service. The valid characters are a-z,
     *        0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     *        hyphen.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the listener. A listener name must be unique within a service. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @return The name of the listener. A listener name must be unique within a service. The valid characters are a-z,
     *         0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     *         hyphen.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the listener. A listener name must be unique within a service. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @param name
     *        The name of the listener. A listener name must be unique within a service. The valid characters are a-z,
     *        0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     *        hyphen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The listener port. You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the default
     * is 443.
     * </p>
     * 
     * @param port
     *        The listener port. You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the
     *        default is 443.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The listener port. You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the default
     * is 443.
     * </p>
     * 
     * @return The listener port. You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the
     *         default is 443.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The listener port. You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the default
     * is 443.
     * </p>
     * 
     * @param port
     *        The listener port. You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the
     *        default is 443.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The listener protocol.
     * </p>
     * 
     * @param protocol
     *        The listener protocol.
     * @see ListenerProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The listener protocol.
     * </p>
     * 
     * @return The listener protocol.
     * @see ListenerProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The listener protocol.
     * </p>
     * 
     * @param protocol
     *        The listener protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListenerProtocol
     */

    public CreateListenerRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The listener protocol.
     * </p>
     * 
     * @param protocol
     *        The listener protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListenerProtocol
     */

    public CreateListenerRequest withProtocol(ListenerProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service.
     */

    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the service.
     */

    public String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withServiceIdentifier(String serviceIdentifier) {
        setServiceIdentifier(serviceIdentifier);
        return this;
    }

    /**
     * <p>
     * The tags for the listener.
     * </p>
     * 
     * @return The tags for the listener.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the listener.
     * </p>
     * 
     * @param tags
     *        The tags for the listener.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the listener.
     * </p>
     * 
     * @param tags
     *        The tags for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateListenerRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getServiceIdentifier() != null)
            sb.append("ServiceIdentifier: ").append(getServiceIdentifier()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateListenerRequest == false)
            return false;
        CreateListenerRequest other = (CreateListenerRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getServiceIdentifier() == null ^ this.getServiceIdentifier() == null)
            return false;
        if (other.getServiceIdentifier() != null && other.getServiceIdentifier().equals(this.getServiceIdentifier()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getServiceIdentifier() == null) ? 0 : getServiceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateListenerRequest clone() {
        return (CreateListenerRequest) super.clone();
    }

}
