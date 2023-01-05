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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DeleteCustomPlugin" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomPluginRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom plugin that you want to delete.
     * </p>
     */
    private String customPluginArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom plugin that you want to delete.
     * </p>
     * 
     * @param customPluginArn
     *        The Amazon Resource Name (ARN) of the custom plugin that you want to delete.
     */

    public void setCustomPluginArn(String customPluginArn) {
        this.customPluginArn = customPluginArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom plugin that you want to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom plugin that you want to delete.
     */

    public String getCustomPluginArn() {
        return this.customPluginArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom plugin that you want to delete.
     * </p>
     * 
     * @param customPluginArn
     *        The Amazon Resource Name (ARN) of the custom plugin that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomPluginRequest withCustomPluginArn(String customPluginArn) {
        setCustomPluginArn(customPluginArn);
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
            sb.append("CustomPluginArn: ").append(getCustomPluginArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCustomPluginRequest == false)
            return false;
        DeleteCustomPluginRequest other = (DeleteCustomPluginRequest) obj;
        if (other.getCustomPluginArn() == null ^ this.getCustomPluginArn() == null)
            return false;
        if (other.getCustomPluginArn() != null && other.getCustomPluginArn().equals(this.getCustomPluginArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomPluginArn() == null) ? 0 : getCustomPluginArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCustomPluginRequest clone() {
        return (DeleteCustomPluginRequest) super.clone();
    }

}
