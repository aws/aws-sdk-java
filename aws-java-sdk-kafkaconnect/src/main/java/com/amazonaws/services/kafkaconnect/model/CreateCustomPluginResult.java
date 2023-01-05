/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateCustomPlugin" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomPluginResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that Amazon assigned to the custom plugin.
     * </p>
     */
    private String customPluginArn;
    /**
     * <p>
     * The state of the custom plugin.
     * </p>
     */
    private String customPluginState;
    /**
     * <p>
     * The name of the custom plugin.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The revision of the custom plugin.
     * </p>
     */
    private Long revision;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that Amazon assigned to the custom plugin.
     * </p>
     * 
     * @param customPluginArn
     *        The Amazon Resource Name (ARN) that Amazon assigned to the custom plugin.
     */

    public void setCustomPluginArn(String customPluginArn) {
        this.customPluginArn = customPluginArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that Amazon assigned to the custom plugin.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that Amazon assigned to the custom plugin.
     */

    public String getCustomPluginArn() {
        return this.customPluginArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that Amazon assigned to the custom plugin.
     * </p>
     * 
     * @param customPluginArn
     *        The Amazon Resource Name (ARN) that Amazon assigned to the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomPluginResult withCustomPluginArn(String customPluginArn) {
        setCustomPluginArn(customPluginArn);
        return this;
    }

    /**
     * <p>
     * The state of the custom plugin.
     * </p>
     * 
     * @param customPluginState
     *        The state of the custom plugin.
     * @see CustomPluginState
     */

    public void setCustomPluginState(String customPluginState) {
        this.customPluginState = customPluginState;
    }

    /**
     * <p>
     * The state of the custom plugin.
     * </p>
     * 
     * @return The state of the custom plugin.
     * @see CustomPluginState
     */

    public String getCustomPluginState() {
        return this.customPluginState;
    }

    /**
     * <p>
     * The state of the custom plugin.
     * </p>
     * 
     * @param customPluginState
     *        The state of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomPluginState
     */

    public CreateCustomPluginResult withCustomPluginState(String customPluginState) {
        setCustomPluginState(customPluginState);
        return this;
    }

    /**
     * <p>
     * The state of the custom plugin.
     * </p>
     * 
     * @param customPluginState
     *        The state of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomPluginState
     */

    public CreateCustomPluginResult withCustomPluginState(CustomPluginState customPluginState) {
        this.customPluginState = customPluginState.toString();
        return this;
    }

    /**
     * <p>
     * The name of the custom plugin.
     * </p>
     * 
     * @param name
     *        The name of the custom plugin.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom plugin.
     * </p>
     * 
     * @return The name of the custom plugin.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the custom plugin.
     * </p>
     * 
     * @param name
     *        The name of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomPluginResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The revision of the custom plugin.
     * </p>
     * 
     * @param revision
     *        The revision of the custom plugin.
     */

    public void setRevision(Long revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the custom plugin.
     * </p>
     * 
     * @return The revision of the custom plugin.
     */

    public Long getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the custom plugin.
     * </p>
     * 
     * @param revision
     *        The revision of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomPluginResult withRevision(Long revision) {
        setRevision(revision);
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
        if (getCustomPluginArn() != null)
            sb.append("CustomPluginArn: ").append(getCustomPluginArn()).append(",");
        if (getCustomPluginState() != null)
            sb.append("CustomPluginState: ").append(getCustomPluginState()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomPluginResult == false)
            return false;
        CreateCustomPluginResult other = (CreateCustomPluginResult) obj;
        if (other.getCustomPluginArn() == null ^ this.getCustomPluginArn() == null)
            return false;
        if (other.getCustomPluginArn() != null && other.getCustomPluginArn().equals(this.getCustomPluginArn()) == false)
            return false;
        if (other.getCustomPluginState() == null ^ this.getCustomPluginState() == null)
            return false;
        if (other.getCustomPluginState() != null && other.getCustomPluginState().equals(this.getCustomPluginState()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomPluginArn() == null) ? 0 : getCustomPluginArn().hashCode());
        hashCode = prime * hashCode + ((getCustomPluginState() == null) ? 0 : getCustomPluginState().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomPluginResult clone() {
        try {
            return (CreateCustomPluginResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
