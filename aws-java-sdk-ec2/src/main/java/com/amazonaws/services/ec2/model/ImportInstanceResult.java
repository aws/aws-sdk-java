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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output for ImportInstance.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the conversion task.
     * </p>
     */
    private ConversionTask conversionTask;

    /**
     * <p>
     * Information about the conversion task.
     * </p>
     * 
     * @param conversionTask
     *        Information about the conversion task.
     */

    public void setConversionTask(ConversionTask conversionTask) {
        this.conversionTask = conversionTask;
    }

    /**
     * <p>
     * Information about the conversion task.
     * </p>
     * 
     * @return Information about the conversion task.
     */

    public ConversionTask getConversionTask() {
        return this.conversionTask;
    }

    /**
     * <p>
     * Information about the conversion task.
     * </p>
     * 
     * @param conversionTask
     *        Information about the conversion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceResult withConversionTask(ConversionTask conversionTask) {
        setConversionTask(conversionTask);
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
        if (getConversionTask() != null)
            sb.append("ConversionTask: ").append(getConversionTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportInstanceResult == false)
            return false;
        ImportInstanceResult other = (ImportInstanceResult) obj;
        if (other.getConversionTask() == null ^ this.getConversionTask() == null)
            return false;
        if (other.getConversionTask() != null && other.getConversionTask().equals(this.getConversionTask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConversionTask() == null) ? 0 : getConversionTask().hashCode());
        return hashCode;
    }

    @Override
    public ImportInstanceResult clone() {
        try {
            return (ImportInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
