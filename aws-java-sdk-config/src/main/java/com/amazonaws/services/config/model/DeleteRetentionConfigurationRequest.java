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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRetentionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRetentionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the retention configuration to delete.
     * </p>
     */
    private String retentionConfigurationName;

    /**
     * <p>
     * The name of the retention configuration to delete.
     * </p>
     * 
     * @param retentionConfigurationName
     *        The name of the retention configuration to delete.
     */

    public void setRetentionConfigurationName(String retentionConfigurationName) {
        this.retentionConfigurationName = retentionConfigurationName;
    }

    /**
     * <p>
     * The name of the retention configuration to delete.
     * </p>
     * 
     * @return The name of the retention configuration to delete.
     */

    public String getRetentionConfigurationName() {
        return this.retentionConfigurationName;
    }

    /**
     * <p>
     * The name of the retention configuration to delete.
     * </p>
     * 
     * @param retentionConfigurationName
     *        The name of the retention configuration to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRetentionConfigurationRequest withRetentionConfigurationName(String retentionConfigurationName) {
        setRetentionConfigurationName(retentionConfigurationName);
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
        if (getRetentionConfigurationName() != null)
            sb.append("RetentionConfigurationName: ").append(getRetentionConfigurationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRetentionConfigurationRequest == false)
            return false;
        DeleteRetentionConfigurationRequest other = (DeleteRetentionConfigurationRequest) obj;
        if (other.getRetentionConfigurationName() == null ^ this.getRetentionConfigurationName() == null)
            return false;
        if (other.getRetentionConfigurationName() != null && other.getRetentionConfigurationName().equals(this.getRetentionConfigurationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetentionConfigurationName() == null) ? 0 : getRetentionConfigurationName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRetentionConfigurationRequest clone() {
        return (DeleteRetentionConfigurationRequest) super.clone();
    }

}
