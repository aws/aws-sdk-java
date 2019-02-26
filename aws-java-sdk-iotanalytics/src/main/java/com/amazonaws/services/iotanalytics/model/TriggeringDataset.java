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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the data set whose content generation triggers the new data set content generation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/TriggeringDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TriggeringDataset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data set whose content generation triggers the new data set content generation.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The name of the data set whose content generation triggers the new data set content generation.
     * </p>
     * 
     * @param name
     *        The name of the data set whose content generation triggers the new data set content generation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data set whose content generation triggers the new data set content generation.
     * </p>
     * 
     * @return The name of the data set whose content generation triggers the new data set content generation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data set whose content generation triggers the new data set content generation.
     * </p>
     * 
     * @param name
     *        The name of the data set whose content generation triggers the new data set content generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TriggeringDataset withName(String name) {
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

        if (obj instanceof TriggeringDataset == false)
            return false;
        TriggeringDataset other = (TriggeringDataset) obj;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public TriggeringDataset clone() {
        try {
            return (TriggeringDataset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.TriggeringDatasetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
